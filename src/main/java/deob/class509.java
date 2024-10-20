package deob;

import java.util.zip.Inflater;

@ObfuscatedName("tv")
public class class509 {

    @ObfuscatedName("tv.af")
    public Inflater field5134;

    public class509() {
        this(-1, 1000000, 1000000);
    }

    public class509(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("tv.af(Lsg;[BI)V")
    public void method8832(class489 arg0, byte[] arg1) {
        if (arg0.field4991[arg0.field4989] != 31 || arg0.field4991[arg0.field4989 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field5134 == null) {
            this.field5134 = new Inflater(true);
        }
        try {
            this.field5134.setInput(arg0.field4991, arg0.field4989 + 10, arg0.field4991.length - (arg0.field4989 + 10 + 8));
            this.field5134.inflate(arg1);
        } catch (Exception var4) {
            this.field5134.reset();
            throw new RuntimeException("");
        }
        this.field5134.reset();
    }
}
