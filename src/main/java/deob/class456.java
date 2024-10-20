package deob;

import java.util.zip.Inflater;

@ObfuscatedName("qg")
public class class456 {

    @ObfuscatedName("qg.v")
    public Inflater field4743;

    public class456() {
        this(-1, 1000000, 1000000);
    }

    public class456(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("qg.v(Lpi;[BI)V")
    public void method7518(class438 arg0, byte[] arg1) {
        if (arg0.field4618[arg0.field4621] != 31 || arg0.field4618[arg0.field4621 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4743 == null) {
            this.field4743 = new Inflater(true);
        }
        try {
            this.field4743.setInput(arg0.field4618, arg0.field4621 + 10, arg0.field4618.length - (arg0.field4621 + 10 + 8));
            this.field4743.inflate(arg1);
        } catch (Exception var4) {
            this.field4743.reset();
            throw new RuntimeException("");
        }
        this.field4743.reset();
    }
}
