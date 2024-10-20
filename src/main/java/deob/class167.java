package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fm")
public class class167 {

    @ObfuscatedName("fm.i")
    public Inflater field2347;

    public class167() {
        this(-1, 1000000, 1000000);
    }

    public class167(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fm.i(Lfx;[BI)V")
    public void method2810(class174 arg0, byte[] arg1) {
        if (arg0.field2415[arg0.field2407] != 31 || arg0.field2415[arg0.field2407 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2347 == null) {
            this.field2347 = new Inflater(true);
        }
        try {
            this.field2347.setInput(arg0.field2415, arg0.field2407 + 10, arg0.field2415.length - (arg0.field2407 + 10 + 8));
            this.field2347.inflate(arg1);
        } catch (Exception var4) {
            this.field2347.reset();
            throw new RuntimeException("");
        }
        this.field2347.reset();
    }
}
