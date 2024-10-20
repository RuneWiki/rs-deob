package deob;

import java.util.zip.Inflater;

@ObfuscatedName("ok")
public class class399 {

    @ObfuscatedName("ok.f")
    public Inflater field4269;

    public class399() {
        this(-1, 1000000, 1000000);
    }

    public class399(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ok.f(Lnu;[BB)V")
    public void method6369(class382 arg0, byte[] arg1) {
        if (arg0.field4153[arg0.field4155] != 31 || arg0.field4153[arg0.field4155 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4269 == null) {
            this.field4269 = new Inflater(true);
        }
        try {
            this.field4269.setInput(arg0.field4153, arg0.field4155 + 10, arg0.field4153.length - (arg0.field4155 + 10 + 8));
            this.field4269.inflate(arg1);
        } catch (Exception var4) {
            this.field4269.reset();
            throw new RuntimeException("");
        }
        this.field4269.reset();
    }
}
