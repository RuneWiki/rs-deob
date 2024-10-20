package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fl")
public class class178 {

    @ObfuscatedName("fl.f")
    public Inflater field2332;

    public class178() {
        this(-1, 1000000, 1000000);
    }

    public class178(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fl.f(Lgx;[BI)V")
    public void method3254(class185 arg0, byte[] arg1) {
        if (arg0.field2399[arg0.field2397] != 31 || arg0.field2399[arg0.field2397 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2332 == null) {
            this.field2332 = new Inflater(true);
        }
        try {
            this.field2332.setInput(arg0.field2399, arg0.field2397 + 10, arg0.field2399.length - (arg0.field2397 + 10 + 8));
            this.field2332.inflate(arg1);
        } catch (Exception var4) {
            this.field2332.reset();
            throw new RuntimeException("");
        }
        this.field2332.reset();
    }
}
