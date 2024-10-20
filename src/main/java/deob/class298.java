package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("ln")
public class class298 extends class301 {

    @ObfuscatedName("ln.at")
    public SoftReference field3109;

    public class298(Object arg0, int arg1) {
        super(arg1);
        this.field3109 = new SoftReference(arg0);
    }

    @ObfuscatedName("ln.at()Ljava/lang/Object;")
    public Object method5280() {
        return this.field3109.get();
    }

    @ObfuscatedName("ln.ah()Z")
    public boolean method5281() {
        return true;
    }
}
