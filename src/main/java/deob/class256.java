package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("ij")
public class class256 extends class259 {

    @ObfuscatedName("ij.o")
    public SoftReference field2934;

    public class256(Object arg0, int arg1) {
        super(arg1);
        this.field2934 = new SoftReference(arg0);
    }

    @ObfuscatedName("ij.o()Ljava/lang/Object;")
    public Object method4562() {
        return this.field2934.get();
    }

    @ObfuscatedName("ij.q()Z")
    public boolean method4560() {
        return true;
    }
}
