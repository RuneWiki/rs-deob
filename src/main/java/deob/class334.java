package deob;

import java.util.zip.Inflater;

@ObfuscatedName("lu")
public class class334 {

    @ObfuscatedName("lu.c")
    public Inflater field4007;

    public class334() {
        this(-1, 1000000, 1000000);
    }

    public class334(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("lu.c(Lkz;[BB)V")
    public void method6043(class300 arg0, byte[] arg1) {
        if (arg0.field3694[arg0.field3696] != 31 || arg0.field3694[arg0.field3696 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4007 == null) {
            this.field4007 = new Inflater(true);
        }
        try {
            this.field4007.setInput(arg0.field3694, arg0.field3696 + 10, arg0.field3694.length - (arg0.field3696 + 10 + 8));
            this.field4007.inflate(arg1);
        } catch (Exception var4) {
            this.field4007.reset();
            throw new RuntimeException("");
        }
        this.field4007.reset();
    }
}
