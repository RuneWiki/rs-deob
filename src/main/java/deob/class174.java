package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fz")
public class class174 {

    @ObfuscatedName("fz.d")
    public Inflater field2438;

    public class174() {
        this(-1, 1000000, 1000000);
    }

    public class174(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fz.d(Lfr;[BI)V")
    public void method2975(class181 arg0, byte[] arg1) {
        if (arg0.field2496[arg0.field2498] != 31 || arg0.field2496[arg0.field2498 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2438 == null) {
            this.field2438 = new Inflater(true);
        }
        try {
            this.field2438.setInput(arg0.field2496, arg0.field2498 + 10, arg0.field2496.length - (arg0.field2498 + 10 + 8));
            this.field2438.inflate(arg1);
        } catch (Exception var4) {
            this.field2438.reset();
            throw new RuntimeException("");
        }
        this.field2438.reset();
    }
}
