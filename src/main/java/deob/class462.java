package deob;

import java.util.zip.Inflater;

@ObfuscatedName("qh")
public class class462 {

    @ObfuscatedName("qh.s")
    public Inflater field4828;

    public class462() {
        this(-1, 1000000, 1000000);
    }

    public class462(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("qh.s(Lqr;[BB)V")
    public void method7484(class444 arg0, byte[] arg1) {
        if (arg0.field4707[arg0.field4708] != 31 || arg0.field4707[arg0.field4708 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4828 == null) {
            this.field4828 = new Inflater(true);
        }
        try {
            this.field4828.setInput(arg0.field4707, arg0.field4708 + 10, arg0.field4707.length - (arg0.field4708 + 10 + 8));
            this.field4828.inflate(arg1);
        } catch (Exception var4) {
            this.field4828.reset();
            throw new RuntimeException("");
        }
        this.field4828.reset();
    }
}
