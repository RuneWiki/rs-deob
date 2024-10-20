package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("hw")
public class class220 extends class225 {

    @ObfuscatedName("hw.t")
    public SoftReference field2644;

    public class220(Object arg0, int arg1) {
        super(arg1);
        this.field2644 = new SoftReference(arg0);
    }

    @ObfuscatedName("hw.t()Ljava/lang/Object;")
    public Object method3588() {
        return this.field2644.get();
    }

    @ObfuscatedName("hw.q()Z")
    public boolean method3589() {
        return true;
    }
}
