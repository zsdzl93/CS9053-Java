package edu.nyu.cs9053.homework2;

/**
 * User: blangel
 */
public class VehicleDataParser {
    
    /**
     * Given a 4 byte response, {@code mode01Pid00Response}, parse according to the {@literal SAE J1979} documentation.
     * For example, if {@code mode01Pid00Response} was {@literal 0xBE1FA813} the return value would be equal to:
     * {@literal new int[] { 0x01, 0x03, 0x04, 0x05, 0x06, 0x07, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x13, 0x15, 0x1C, 0x1F, 0x20}}
     * @param mode01Pid00Response four byte response
     * @return an array of supported PID values given the input, {@code mode01Pid00Response}
     * @see {@literal https://en.wikipedia.org/wiki/OBD-II_PIDs#Service_01_PID_00}
     */
    public static int[] supportedPids(int mode01Pid00Response) {
        int[] supported = dec2BinFunc(mode01Pid00Response);
        int[] response = new int[Integer.bitCount(mode01Pid00Response)];
        int resIndex = 0;
        
        for (int i = 0; i < 32; ++i) {
            if (supported[i] == 1) {
                response[resIndex] = i+1;
                resIndex++;
            }
        }
        
        return response;
    }

    /**
     * Given a {@code pid} between [0x1,0x20] return true iff {@code mode01Pid00Response} supports it.
     * @param pid value between [0x1,0x20] to check for support within {@code mode01Pid00Response}
     * @param mode01Pid00Response four byte response
     * @return true iff {@code mode01Pid00Response} supports {@code pid}.
     * @throws IllegalArgumentException if {@code pid} is less than 0x1 or greater than 0x20
     */
    public static boolean isSupported(int pid, int mode01Pid00Response) {
        
        if (pid < 1 || pid > 32) {
            throw new IllegalArgumentException();
        }
        
        int[] supportedArray = supportedPids(mode01Pid00Response);
        
        for (Integer n : supportedArray) {
            if (n == pid) return true;
        }
        
        return false;
    }
    
    private static int[] dec2BinFunc(int mode01Pid00Response) {
        int[] supported = new int[32];
        int[] dec2Bin = new int[32];
        int i = 0;
        int sign = 1;
        
        if (mode01Pid00Response < 0) {
            sign = -1;
            mode01Pid00Response = -mode01Pid00Response;
        }
        while (mode01Pid00Response > 0) {
            dec2Bin[i] = mode01Pid00Response % 2;
            mode01Pid00Response /= 2;
            i++;
        }
        
        for (int j = 0; j < i; ++j) {
            supported[32-j-1] = dec2Bin[j];
        }
        
        if (sign < 0) {
            for (int m = 0; m < 32; ++m)
                supported[m] = supported[m] == 1 ? 0 : 1;
            int carry = 1;
            
            for (int m = 31; m >= 0; --m) {
                supported[m] += carry;
                if (supported[m] > 1) {
                    supported[m] = 0;
                    carry = 1;
                }
                else carry = 0;
            }
        }
        
        return supported;
    }
    
}
