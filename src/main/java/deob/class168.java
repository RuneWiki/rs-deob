package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fg")
public class class168 {

    @ObfuscatedName("fg.i")
    public Inflater field2329;

    public class168() {
        this(-1, 1000000, 1000000);
    }

    public class168(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fg.i(Lfp;[BB)V")
    public void method2920(class175 arg0, byte[] arg1) {
        if (arg0.field2392[arg0.field2395] != 31 || arg0.field2392[arg0.field2395 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2329 == null) {
            this.field2329 = new Inflater(true);
        }
        try {
            this.field2329.setInput(arg0.field2392, arg0.field2395 + 10, arg0.field2392.length - (arg0.field2395 + 10 + 8));
            this.field2329.inflate(arg1);
        } catch (Exception var4) {
            this.field2329.reset();
            throw new RuntimeException("");
        }
        this.field2329.reset();
    }
}
