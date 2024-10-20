package deob;

import java.util.zip.Inflater;

@ObfuscatedName("vl")
public class class567 {

    @ObfuscatedName("vl.aq")
    public Inflater field5505;

    public class567() {
        this(-1, 1000000, 1000000);
    }

    public class567(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("vl.aq(Lvp;[BI)V")
    public void method9339(class547 arg0, byte[] arg1) {
        if (arg0.field5364[arg0.field5363] != 31 || arg0.field5364[arg0.field5363 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field5505 == null) {
            this.field5505 = new Inflater(true);
        }
        try {
            this.field5505.setInput(arg0.field5364, arg0.field5363 + 10, arg0.field5364.length - (arg0.field5363 + 10 + 8));
            this.field5505.inflate(arg1);
        } catch (Exception var4) {
            this.field5505.reset();
            throw new RuntimeException("");
        }
        this.field5505.reset();
    }
}
