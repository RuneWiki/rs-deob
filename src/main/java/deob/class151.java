package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("ed")
public class class151 extends class149 {

    @ObfuscatedName("ed.z")
    public SoftReference field1946;

    public class151(Object arg0, int arg1) {
        super(arg1);
        this.field1946 = new SoftReference(arg0);
    }

    @ObfuscatedName("ed.z()Ljava/lang/Object;")
    public Object method3015() {
        return this.field1946.get();
    }

    @ObfuscatedName("ed.n()Z")
    public boolean method3018() {
        return true;
    }
}
