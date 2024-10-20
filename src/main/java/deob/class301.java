package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("la")
public class class301 extends class304 {

    @ObfuscatedName("la.am")
    public SoftReference field3147;

    public class301(Object arg0, int arg1) {
        super(arg1);
        this.field3147 = new SoftReference(arg0);
    }

    @ObfuscatedName("la.am()Ljava/lang/Object;")
    public Object method5390() {
        return this.field3147.get();
    }

    @ObfuscatedName("la.ap()Z")
    public boolean method5391() {
        return true;
    }
}
