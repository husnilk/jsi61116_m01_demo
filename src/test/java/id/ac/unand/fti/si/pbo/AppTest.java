package id.ac.unand.fti.si.pbo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldOutputText() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        App.main(new String[0]);
        System.setOut(stdout);
        String outputText = byteArrayOutputStream.toString().trim();
        assertEquals(outputText, "Semangat...! Kamu pasti bisa...!");
    }

}
