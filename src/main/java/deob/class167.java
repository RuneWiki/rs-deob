package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fn")
public class class167 {

    @ObfuscatedName("fn.w")
    public Inflater field2324;

    public class167() {
        this(-1, 1000000, 1000000);
    }

    public class167(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fn.w(Lfz;[BI)V")
    public void method2905(class174 arg0, byte[] arg1) {
        if (arg0.field2389[arg0.field2390] != 31 || arg0.field2389[arg0.field2390 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2324 == null) {
            this.field2324 = new Inflater(true);
        }
        try {
            this.field2324.setInput(arg0.field2389, arg0.field2390 + 10, arg0.field2389.length - (arg0.field2390 + 10 + 8));
            this.field2324.inflate(arg1);
        } catch (Exception var4) {
            this.field2324.reset();
            throw new RuntimeException("");
        }
        this.field2324.reset();
    }
}
