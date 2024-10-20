package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fw")
public class class167 {

    @ObfuscatedName("fw.c")
    public Inflater field2295;

    public class167() {
        this(-1, 1000000, 1000000);
    }

    public class167(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fw.c(Lfp;[BI)V")
    public void method2786(class174 arg0, byte[] arg1) {
        if (arg0.field2355[arg0.field2357] != 31 || arg0.field2355[arg0.field2357 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2295 == null) {
            this.field2295 = new Inflater(true);
        }
        try {
            this.field2295.setInput(arg0.field2355, arg0.field2357 + 10, arg0.field2355.length - (arg0.field2357 + 10 + 8));
            this.field2295.inflate(arg1);
        } catch (Exception var4) {
            this.field2295.reset();
            throw new RuntimeException("");
        }
        this.field2295.reset();
    }
}
