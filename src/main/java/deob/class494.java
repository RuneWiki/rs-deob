package deob;

import java.util.zip.Inflater;

@ObfuscatedName("rp")
public class class494 {

    @ObfuscatedName("rp.f")
    public Inflater field5076;

    public class494() {
        this(-1, 1000000, 1000000);
    }

    public class494(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("rp.f(Lrd;[BI)V")
    public void method8549(class474 arg0, byte[] arg1) {
        if (arg0.field4936[arg0.field4939] != 31 || arg0.field4936[arg0.field4939 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field5076 == null) {
            this.field5076 = new Inflater(true);
        }
        try {
            this.field5076.setInput(arg0.field4936, arg0.field4939 + 10, arg0.field4936.length - (arg0.field4939 + 10 + 8));
            this.field5076.inflate(arg1);
        } catch (Exception var4) {
            this.field5076.reset();
            throw new RuntimeException("");
        }
        this.field5076.reset();
    }
}
