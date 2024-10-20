package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("ld")
public class class301 extends class304 {

    @ObfuscatedName("ld.ac")
    public SoftReference field3116;

    public class301(Object arg0, int arg1) {
        super(arg1);
        this.field3116 = new SoftReference(arg0);
    }

    @ObfuscatedName("ld.ac()Ljava/lang/Object;")
    public Object method5277() {
        return this.field3116.get();
    }

    @ObfuscatedName("ld.al()Z")
    public boolean method5281() {
        return true;
    }
}
