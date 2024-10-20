package deob;

import java.util.zip.Inflater;

@ObfuscatedName("ff")
public class class178 {

    @ObfuscatedName("ff.y")
    public Inflater field2315;

    public class178() {
        this(-1, 1000000, 1000000);
    }

    public class178(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ff.y(Lge;[BI)V")
    public void method3205(class185 arg0, byte[] arg1) {
        if (arg0.field2373[arg0.field2374] != 31 || arg0.field2373[arg0.field2374 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2315 == null) {
            this.field2315 = new Inflater(true);
        }
        try {
            this.field2315.setInput(arg0.field2373, arg0.field2374 + 10, arg0.field2373.length - (arg0.field2374 + 10 + 8));
            this.field2315.inflate(arg1);
        } catch (Exception var4) {
            this.field2315.reset();
            throw new RuntimeException("");
        }
        this.field2315.reset();
    }
}
