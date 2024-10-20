package deob;

import java.util.zip.Inflater;

@ObfuscatedName("pk")
public class class418 {

    @ObfuscatedName("pk.n")
    public Inflater field4397;

    public class418() {
        this(-1, 1000000, 1000000);
    }

    public class418(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("pk.n(Lot;[BB)V")
    public void method6773(class400 arg0, byte[] arg1) {
        if (arg0.field4271[arg0.field4272] != 31 || arg0.field4271[arg0.field4272 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4397 == null) {
            this.field4397 = new Inflater(true);
        }
        try {
            this.field4397.setInput(arg0.field4271, arg0.field4272 + 10, arg0.field4271.length - (arg0.field4272 + 10 + 8));
            this.field4397.inflate(arg1);
        } catch (Exception var4) {
            this.field4397.reset();
            throw new RuntimeException("");
        }
        this.field4397.reset();
    }
}
