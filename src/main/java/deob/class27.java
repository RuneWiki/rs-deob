package deob;

import java.util.zip.Inflater;

@ObfuscatedName("du")
public class class27 {

    @ObfuscatedName("du.v")
    public Inflater field295;

    public class27(int arg0, int arg1, int arg2) {
    }

    public class27() {
        this(-1, 1000000, 1000000);
    }

    @ObfuscatedName("du.v(Ldv;[BI)V")
    public void method293(class28 arg0, byte[] arg1) {
        if (arg0.field306[arg0.field303] != 31 || arg0.field306[arg0.field303 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field295 == null) {
            this.field295 = new Inflater(true);
        }
        try {
            this.field295.setInput(arg0.field306, arg0.field303 + 10, arg0.field306.length - (arg0.field303 + 10 + 8));
            this.field295.inflate(arg1);
        } catch (Exception var4) {
            this.field295.reset();
            throw new RuntimeException("");
        }
        this.field295.reset();
    }
}
