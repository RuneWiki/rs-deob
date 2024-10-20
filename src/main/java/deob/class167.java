package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fv")
public class class167 {

    @ObfuscatedName("fv.e")
    public Inflater field2310;

    public class167() {
        this(-1, 1000000, 1000000);
    }

    public class167(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fv.e(Lfw;[BI)V")
    public void method2831(class174 arg0, byte[] arg1) {
        if (arg0.field2373[arg0.field2370] != 31 || arg0.field2373[arg0.field2370 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2310 == null) {
            this.field2310 = new Inflater(true);
        }
        try {
            this.field2310.setInput(arg0.field2373, arg0.field2370 + 10, arg0.field2373.length - (arg0.field2370 + 10 + 8));
            this.field2310.inflate(arg1);
        } catch (Exception var4) {
            this.field2310.reset();
            throw new RuntimeException("");
        }
        this.field2310.reset();
    }
}
