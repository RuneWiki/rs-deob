package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fb")
public class class167 {

    @ObfuscatedName("fb.d")
    public Inflater field2301;

    public class167() {
        this(-1, 1000000, 1000000);
    }

    public class167(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fb.d(Lfw;[BI)V")
    public void method2843(class174 arg0, byte[] arg1) {
        if (arg0.field2367[arg0.field2364] != 31 || arg0.field2367[arg0.field2364 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2301 == null) {
            this.field2301 = new Inflater(true);
        }
        try {
            this.field2301.setInput(arg0.field2367, arg0.field2364 + 10, arg0.field2367.length - (arg0.field2364 + 10 + 8));
            this.field2301.inflate(arg1);
        } catch (Exception var4) {
            this.field2301.reset();
            throw new RuntimeException("");
        }
        this.field2301.reset();
    }
}
