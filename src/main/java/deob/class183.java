package deob;

import java.util.zip.Inflater;

@ObfuscatedName("gn")
public class class183 {

    @ObfuscatedName("gn.a")
    public Inflater field2363;

    public class183() {
        this(-1, 1000000, 1000000);
    }

    public class183(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gn.a(Lgx;[BI)V")
    public void method3392(class190 arg0, byte[] arg1) {
        if (arg0.field2420[arg0.field2419] != 31 || arg0.field2420[arg0.field2419 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2363 == null) {
            this.field2363 = new Inflater(true);
        }
        try {
            this.field2363.setInput(arg0.field2420, arg0.field2419 + 10, arg0.field2420.length - (arg0.field2419 + 10 + 8));
            this.field2363.inflate(arg1);
        } catch (Exception var4) {
            this.field2363.reset();
            throw new RuntimeException("");
        }
        this.field2363.reset();
    }
}
