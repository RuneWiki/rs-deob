package deob;

import java.util.zip.Inflater;

@ObfuscatedName("lg")
public class class335 {

    @ObfuscatedName("lg.c")
    public Inflater field4006;

    public class335() {
        this(-1, 1000000, 1000000);
    }

    public class335(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("lg.c(Lkp;[BI)V")
    public void method6078(class301 arg0, byte[] arg1) {
        if (arg0.field3708[arg0.field3707] != 31 || arg0.field3708[arg0.field3707 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4006 == null) {
            this.field4006 = new Inflater(true);
        }
        try {
            this.field4006.setInput(arg0.field3708, arg0.field3707 + 10, arg0.field3708.length - (arg0.field3707 + 10 + 8));
            this.field4006.inflate(arg1);
        } catch (Exception var4) {
            this.field4006.reset();
            throw new RuntimeException("");
        }
        this.field4006.reset();
    }
}
