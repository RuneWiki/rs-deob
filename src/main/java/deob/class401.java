package deob;

import java.util.zip.Inflater;

@ObfuscatedName("or")
public class class401 {

    @ObfuscatedName("or.f")
    public Inflater field4283;

    public class401() {
        this(-1, 1000000, 1000000);
    }

    public class401(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("or.f(Lnt;[BI)V")
    public void method6444(class384 arg0, byte[] arg1) {
        if (arg0.field4160[arg0.field4161] != 31 || arg0.field4160[arg0.field4161 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4283 == null) {
            this.field4283 = new Inflater(true);
        }
        try {
            this.field4283.setInput(arg0.field4160, arg0.field4161 + 10, arg0.field4160.length - (arg0.field4161 + 10 + 8));
            this.field4283.inflate(arg1);
        } catch (Exception var4) {
            this.field4283.reset();
            throw new RuntimeException("");
        }
        this.field4283.reset();
    }
}
