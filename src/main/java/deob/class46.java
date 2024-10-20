package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dl")
public class class46 {

    @ObfuscatedName("dl.b")
    public Inflater field504;

    public class46(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dl.b(Ldp;[BI)V")
    public void method605(class50 arg0, byte[] arg1) {
        if (arg0.field541[arg0.field540] != 31 || arg0.field541[arg0.field540 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field504 == null) {
            this.field504 = new Inflater(true);
        }
        try {
            this.field504.setInput(arg0.field541, arg0.field540 + 10, arg0.field541.length - (arg0.field540 + 10 + 8));
            this.field504.inflate(arg1);
        } catch (Exception var4) {
            this.field504.reset();
            throw new RuntimeException("");
        }
        this.field504.reset();
    }

    public class46() {
        this(-1, 1000000, 1000000);
    }
}
