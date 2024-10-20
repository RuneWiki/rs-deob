package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fp")
public class class178 {

    @ObfuscatedName("fp.p")
    public Inflater field2422;

    public class178() {
        this(-1, 1000000, 1000000);
    }

    public class178(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fp.p(Lgj;[BI)V")
    public void method3059(class185 arg0, byte[] arg1) {
        if (arg0.field2491[arg0.field2488] != 31 || arg0.field2491[arg0.field2488 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2422 == null) {
            this.field2422 = new Inflater(true);
        }
        try {
            this.field2422.setInput(arg0.field2491, arg0.field2488 + 10, arg0.field2491.length - (arg0.field2488 + 10 + 8));
            this.field2422.inflate(arg1);
        } catch (Exception var4) {
            this.field2422.reset();
            throw new RuntimeException("");
        }
        this.field2422.reset();
    }
}
