package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("ky")
public class class279 extends class282 {

    @ObfuscatedName("ky.af")
    public SoftReference field3078;

    public class279(Object arg0, int arg1) {
        super(arg1);
        this.field3078 = new SoftReference(arg0);
    }

    @ObfuscatedName("ky.af()Ljava/lang/Object;")
    public Object method5111() {
        return this.field3078.get();
    }

    @ObfuscatedName("ky.an()Z")
    public boolean method5112() {
        return true;
    }
}
