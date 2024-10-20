package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("is")
public class class255 extends class258 {

    @ObfuscatedName("is.s")
    public SoftReference field2897;

    public class255(Object arg0, int arg1) {
        super(arg1);
        this.field2897 = new SoftReference(arg0);
    }

    @ObfuscatedName("is.s()Ljava/lang/Object;")
    public Object method4591() {
        return this.field2897.get();
    }

    @ObfuscatedName("is.h()Z")
    public boolean method4596() {
        return true;
    }
}
