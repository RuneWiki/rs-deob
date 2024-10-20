package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fs")
public class class167 {

    @ObfuscatedName("fs.p")
    public Inflater field2343;

    public class167() {
        this(-1, 1000000, 1000000);
    }

    public class167(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fs.p(Lfr;[BB)V")
    public void method2748(class174 arg0, byte[] arg1) {
        if (arg0.field2415[arg0.field2408] != 31 || arg0.field2415[arg0.field2408 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2343 == null) {
            this.field2343 = new Inflater(true);
        }
        try {
            this.field2343.setInput(arg0.field2415, arg0.field2408 + 10, arg0.field2415.length - (arg0.field2408 + 10 + 8));
            this.field2343.inflate(arg1);
        } catch (Exception var4) {
            this.field2343.reset();
            throw new RuntimeException("");
        }
        this.field2343.reset();
    }
}
