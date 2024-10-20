package deob;

import java.util.zip.Inflater;

@ObfuscatedName("oj")
public class class403 {

    @ObfuscatedName("oj.s")
    public Inflater field4302;

    public class403() {
        this(-1, 1000000, 1000000);
    }

    public class403(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("oj.s(Lnv;[BI)V")
    public void method6511(class385 arg0, byte[] arg1) {
        if (arg0.field4184[arg0.field4182] != 31 || arg0.field4184[arg0.field4182 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4302 == null) {
            this.field4302 = new Inflater(true);
        }
        try {
            this.field4302.setInput(arg0.field4184, arg0.field4182 + 10, arg0.field4184.length - (arg0.field4182 + 10 + 8));
            this.field4302.inflate(arg1);
        } catch (Exception var4) {
            this.field4302.reset();
            throw new RuntimeException("");
        }
        this.field4302.reset();
    }
}
