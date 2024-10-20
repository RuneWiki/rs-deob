package deob;

import java.util.zip.Inflater;

@ObfuscatedName("gs")
public class class188 {

    @ObfuscatedName("gs.t")
    public Inflater field2487;

    public class188() {
        this(-1, 1000000, 1000000);
    }

    public class188(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gs.t(Lgb;[BI)V")
    public void method3166(class195 arg0, byte[] arg1) {
        if (arg0.field2544[arg0.field2545] != 31 || arg0.field2544[arg0.field2545 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2487 == null) {
            this.field2487 = new Inflater(true);
        }
        try {
            this.field2487.setInput(arg0.field2544, arg0.field2545 + 10, arg0.field2544.length - (arg0.field2545 + 10 + 8));
            this.field2487.inflate(arg1);
        } catch (Exception var4) {
            this.field2487.reset();
            throw new RuntimeException("");
        }
        this.field2487.reset();
    }
}
