package deob;

import java.util.zip.Inflater;

@ObfuscatedName("gx")
public class class183 {

    @ObfuscatedName("gx.n")
    public Inflater field2358;

    public class183() {
        this(-1, 1000000, 1000000);
    }

    public class183(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gx.n(Lgc;[BB)V")
    public void method3445(class190 arg0, byte[] arg1) {
        if (arg0.field2424[arg0.field2423] != 31 || arg0.field2424[arg0.field2423 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2358 == null) {
            this.field2358 = new Inflater(true);
        }
        try {
            this.field2358.setInput(arg0.field2424, arg0.field2423 + 10, arg0.field2424.length - (arg0.field2423 + 10 + 8));
            this.field2358.inflate(arg1);
        } catch (Exception var4) {
            this.field2358.reset();
            throw new RuntimeException("");
        }
        this.field2358.reset();
    }
}
