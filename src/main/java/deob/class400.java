package deob;

import java.util.zip.Inflater;

@ObfuscatedName("og")
public class class400 {

    @ObfuscatedName("og.v")
    public Inflater field4271;

    public class400() {
        this(-1, 1000000, 1000000);
    }

    public class400(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("og.v(Lnd;[BB)V")
    public void method6487(class383 arg0, byte[] arg1) {
        if (arg0.field4155[arg0.field4158] != 31 || arg0.field4155[arg0.field4158 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4271 == null) {
            this.field4271 = new Inflater(true);
        }
        try {
            this.field4271.setInput(arg0.field4155, arg0.field4158 + 10, arg0.field4155.length - (arg0.field4158 + 10 + 8));
            this.field4271.inflate(arg1);
        } catch (Exception var4) {
            this.field4271.reset();
            throw new RuntimeException("");
        }
        this.field4271.reset();
    }
}
