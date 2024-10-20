package deob;

import java.util.zip.Inflater;

@ObfuscatedName("vz")
public class class570 {

    @ObfuscatedName("vz.ab")
    public Inflater field5542;

    public class570() {
        this(-1, 1000000, 1000000);
    }

    public class570(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("vz.ab(Lvg;[BB)V")
    public void method9463(class549 arg0, byte[] arg1) {
        if (arg0.field5381[arg0.field5378] != 31 || arg0.field5381[arg0.field5378 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field5542 == null) {
            this.field5542 = new Inflater(true);
        }
        try {
            this.field5542.setInput(arg0.field5381, arg0.field5378 + 10, arg0.field5381.length - (arg0.field5378 + 10 + 8));
            this.field5542.inflate(arg1);
        } catch (Exception var4) {
            this.field5542.reset();
            throw new RuntimeException("");
        }
        this.field5542.reset();
    }
}
