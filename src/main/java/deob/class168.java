package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fp")
public class class168 {

    @ObfuscatedName("fp.j")
    public Inflater field2330;

    public class168() {
        this(-1, 1000000, 1000000);
    }

    public class168(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fp.j(Lfb;[BB)V")
    public void method2833(class175 arg0, byte[] arg1) {
        if (arg0.field2390[arg0.field2394] != 31 || arg0.field2390[arg0.field2394 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2330 == null) {
            this.field2330 = new Inflater(true);
        }
        try {
            this.field2330.setInput(arg0.field2390, arg0.field2394 + 10, arg0.field2390.length - (arg0.field2394 + 10 + 8));
            this.field2330.inflate(arg1);
        } catch (Exception var4) {
            this.field2330.reset();
            throw new RuntimeException("");
        }
        this.field2330.reset();
    }
}
