package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("jh")
public class class272 extends class275 {

    @ObfuscatedName("jh.f")
    public SoftReference field3044;

    public class272(Object arg0, int arg1) {
        super(arg1);
        this.field3044 = new SoftReference(arg0);
    }

    @ObfuscatedName("jh.f()Ljava/lang/Object;")
    public Object method5024() {
        return this.field3044.get();
    }

    @ObfuscatedName("jh.w()Z")
    public boolean method5022() {
        return true;
    }
}
