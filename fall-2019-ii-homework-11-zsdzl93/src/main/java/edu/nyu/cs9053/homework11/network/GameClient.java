package edu.nyu.cs9053.homework11.network;

import edu.nyu.cs9053.homework11.game.Difficulty;
import edu.nyu.cs9053.homework11.game.GameProvider;
import edu.nyu.cs9053.homework11.game.screen.InputMove;

import java.io.*;
import java.net.Socket;

/**
 * User: blangel
 *
 * A blocking IO implementation of a client which requests moves from a remote server implementing the
 * {@linkplain edu.nyu.cs9053.homework11.network.NetworkGameProvider}
 */
public class GameClient implements GameProvider {

    public static GameClient construct(Difficulty difficulty) {
        if (difficulty == null) {
            throw new IllegalArgumentException("difficulty cannot be null");
        }
        try {
            Socket serverConnection = new Socket(GameServer.SERVER_HOST, GameServer.SERVER_PORT);
            return new GameClient(difficulty, serverConnection.getInputStream(), serverConnection.getOutputStream());
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }
    }

    private final Difficulty difficulty;
    private final BufferedReader bufferedReader;
    private final BufferedWriter bufferedWriter;

    public GameClient(Difficulty difficulty, InputStream serverInput, OutputStream serverOutput) {
        if (difficulty == null || serverInput == null || serverOutput == null) {
            throw new IllegalArgumentException("Game Client argument cannot be null");
        }

        this.difficulty = difficulty;
        this.bufferedReader = new BufferedReader(new InputStreamReader(serverInput));
        this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(serverOutput));
    }

    @Override
    public Difficulty getDifficulty() {
        return difficulty;
    }

    @Override
    public int getRandomNumberOfNextFoes() {
        writeIntoBuffer(String.format("foes %s", getDifficulty().toString()));
        String nextFoes = readFromBuffer();
        return Integer.parseInt(nextFoes);
    }

    private void writeIntoBuffer(String textForWrite) {
        try {
            bufferedWriter.write(textForWrite);
            bufferedWriter.flush();
        } catch (IOException ioe) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(ioe);
        }
    }

    private String readFromBuffer() {
        try {
            return bufferedReader.readLine();
        } catch (IOException ioe) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(ioe);
        }
    }

    @Override
    public InputMove getRandomNextMove() {
        writeIntoBuffer("move");
        String nextMove = readFromBuffer();
        switch (nextMove) {
            case "UP":
                return InputMove.Up;
            case "DOWN":
                return InputMove.Down;
            case "LEFT":
                return InputMove.Left;
            case "RIGHT":
                return InputMove.Right;
            default:
                throw new IllegalArgumentException("Next move could not be null");
        }
    }
}

