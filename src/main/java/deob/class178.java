package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fc")
public class class178 {

    @ObfuscatedName("fc.n")
    public Inflater field2469;

    public class178() {
        this(-1, 1000000, 1000000);
    }

    public class178(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fc.n(Lgv;[BI)V")
    public void method2963(class185 arg0, byte[] arg1) {
        if (arg0.field2528[arg0.field2529] != 31 || arg0.field2528[arg0.field2529 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2469 == null) {
            this.field2469 = new Inflater(true);
        }
        try {
            this.field2469.setInput(arg0.field2528, arg0.field2529 + 10, arg0.field2528.length - (arg0.field2529 + 10 + 8));
            this.field2469.inflate(arg1);
        } catch (Exception var4) {
            this.field2469.reset();
            throw new RuntimeException("");
        }
        this.field2469.reset();
    }
}
