package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("jt")
public class class268 extends class271 {

    @ObfuscatedName("jt.h")
    public SoftReference field3031;

    public class268(Object arg0, int arg1) {
        super(arg1);
        this.field3031 = new SoftReference(arg0);
    }

    @ObfuscatedName("jt.h()Ljava/lang/Object;")
    public Object method4908() {
        return this.field3031.get();
    }

    @ObfuscatedName("jt.e()Z")
    public boolean method4910() {
        return true;
    }
}
