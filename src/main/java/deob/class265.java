package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("jh")
public class class265 extends class268 {

    @ObfuscatedName("jh.a")
    public SoftReference field2978;

    public class265(Object arg0, int arg1) {
        super(arg1);
        this.field2978 = new SoftReference(arg0);
    }

    @ObfuscatedName("jh.a()Ljava/lang/Object;")
    public Object method4832() {
        return this.field2978.get();
    }

    @ObfuscatedName("jh.f()Z")
    public boolean method4831() {
        return true;
    }
}
