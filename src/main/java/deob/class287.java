package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("lx")
public class class287 extends class290 {

    @ObfuscatedName("lx.au")
    public SoftReference field3089;

    public class287(Object arg0, int arg1) {
        super(arg1);
        this.field3089 = new SoftReference(arg0);
    }

    @ObfuscatedName("lx.au()Ljava/lang/Object;")
    public Object method5168() {
        return this.field3089.get();
    }

    @ObfuscatedName("lx.ae()Z")
    public boolean method5169() {
        return true;
    }
}
