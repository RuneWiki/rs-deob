package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("ez")
public class class151 extends class149 {

    @ObfuscatedName("ez.s")
    public SoftReference field1947;

    public class151(Object arg0, int arg1) {
        super(arg1);
        this.field1947 = new SoftReference(arg0);
    }

    @ObfuscatedName("ez.s()Ljava/lang/Object;")
    public Object method3082() {
        return this.field1947.get();
    }

    @ObfuscatedName("ez.j()Z")
    public boolean method3083() {
        return true;
    }
}
