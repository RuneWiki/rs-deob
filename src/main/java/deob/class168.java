package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fp")
public class class168 {

    @ObfuscatedName("fp.e")
    public Inflater field2311;

    public class168() {
        this(-1, 1000000, 1000000);
    }

    public class168(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fp.e(Lfh;[BI)V")
    public void method2874(class175 arg0, byte[] arg1) {
        if (arg0.field2376[arg0.field2381] != 31 || arg0.field2376[arg0.field2381 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2311 == null) {
            this.field2311 = new Inflater(true);
        }
        try {
            this.field2311.setInput(arg0.field2376, arg0.field2381 + 10, arg0.field2376.length - (arg0.field2381 + 10 + 8));
            this.field2311.inflate(arg1);
        } catch (Exception var4) {
            this.field2311.reset();
            throw new RuntimeException("");
        }
        this.field2311.reset();
    }
}
