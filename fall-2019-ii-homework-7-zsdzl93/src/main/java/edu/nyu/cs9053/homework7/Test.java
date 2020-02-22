package edu.nyu.cs9053.homework7;

public class Test {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Barn<AsianDonkey> asianDonkey1 = new Barn<>(new AsianDonkeyArrayCreator());

        asianDonkey1.add(new AsianDonkey("Tony"));
        asianDonkey1.add(new AsianDonkey("Peter"));
        asianDonkey1.add(new AsianDonkey("Sam"));
        asianDonkey1.add(new AsianDonkey("Jessica"));

        System.out.printf("asianDonkey1 has %d donkeys : ", asianDonkey1.size());
        for (int i=0; i<asianDonkey1.size(); i++) {
            System.out.printf("%s ", asianDonkey1.get(i).getName());
        }
        System.out.println();

        System.out.printf("Does asianDonkey1 has donkey named Tony : %b \n", asianDonkey1.contains(new AsianDonkey("Tony")));
        System.out.printf("Does asianDonkey1 has donkey named Lucifer : %b \n", asianDonkey1.contains(new AsianDonkey("Lucifer")));

        asianDonkey1.remove(new AsianDonkey("Sam"));
        System.out.printf("After remove Sam, Repository has %d donkeys : ", asianDonkey1.size());
        for (int i=0; i<asianDonkey1.size(); i++) {
            System.out.printf("%s ", asianDonkey1.get(i).getName());
        }

        Barn<Donkey> donkey1 = new Barn<>(new DonkeyArrayCreator());
        BarnTransfer fromDonkeyToCow = new BarnTransfer();
        fromDonkeyToCow.transfer(asianDonkey1, donkey1);

        System.out.printf("\ndonkey1 has %d donkeys : ", donkey1.size());
        for (int i=0; i<donkey1.size(); i++) {
            System.out.printf("%s ", donkey1.get(i).getName());
        }
    }
}
