package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fv")
public class class178 {

    @ObfuscatedName("fv.f")
    public Inflater field2359;

    public class178() {
        this(-1, 1000000, 1000000);
    }

    public class178(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fv.f(Lgm;[BI)V")
    public void method3274(class185 arg0, byte[] arg1) {
        if (arg0.field2415[arg0.field2414] != 31 || arg0.field2415[arg0.field2414 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2359 == null) {
            this.field2359 = new Inflater(true);
        }
        try {
            this.field2359.setInput(arg0.field2415, arg0.field2414 + 10, arg0.field2415.length - (arg0.field2414 + 10 + 8));
            this.field2359.inflate(arg1);
        } catch (Exception var4) {
            this.field2359.reset();
            throw new RuntimeException("");
        }
        this.field2359.reset();
    }
}
