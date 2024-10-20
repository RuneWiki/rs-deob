package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("mo")
public class class315 extends class318 {

    @ObfuscatedName("mo.ap")
    public SoftReference field3294;

    public class315(Object arg0, int arg1) {
        super(arg1);
        this.field3294 = new SoftReference(arg0);
    }

    @ObfuscatedName("mo.ap()Ljava/lang/Object;")
    public Object method5921() {
        return this.field3294.get();
    }

    @ObfuscatedName("mo.aw()Z")
    public boolean method5922() {
        return true;
    }
}
