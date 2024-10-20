package deob;

import java.util.zip.Inflater;

@ObfuscatedName("ms")
public class class345 {

    @ObfuscatedName("ms.h")
    public Inflater field4050;

    public class345() {
        this(-1, 1000000, 1000000);
    }

    public class345(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ms.h(Lkj;[BB)V")
    public void method6075(class311 arg0, byte[] arg1) {
        if (arg0.field3753[arg0.field3752] != 31 || arg0.field3753[arg0.field3752 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4050 == null) {
            this.field4050 = new Inflater(true);
        }
        try {
            this.field4050.setInput(arg0.field3753, arg0.field3752 + 10, arg0.field3753.length - (arg0.field3752 + 10 + 8));
            this.field4050.inflate(arg1);
        } catch (Exception var4) {
            this.field4050.reset();
            throw new RuntimeException("");
        }
        this.field4050.reset();
    }
}
