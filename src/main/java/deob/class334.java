package deob;

import java.util.zip.Inflater;

@ObfuscatedName("lc")
public class class334 {

    @ObfuscatedName("lc.s")
    public Inflater field4009;

    public class334() {
        this(-1, 1000000, 1000000);
    }

    public class334(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("lc.s(Lky;[BI)V")
    public void method5974(class300 arg0, byte[] arg1) {
        if (arg0.field3701[arg0.field3704] != 31 || arg0.field3701[arg0.field3704 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4009 == null) {
            this.field4009 = new Inflater(true);
        }
        try {
            this.field4009.setInput(arg0.field3701, arg0.field3704 + 10, arg0.field3701.length - (arg0.field3704 + 10 + 8));
            this.field4009.inflate(arg1);
        } catch (Exception var4) {
            this.field4009.reset();
            throw new RuntimeException("");
        }
        this.field4009.reset();
    }
}
