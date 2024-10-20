package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("ej")
public class class151 extends class149 {

    @ObfuscatedName("ej.c")
    public SoftReference field1959;

    public class151(Object arg0, int arg1) {
        super(arg1);
        this.field1959 = new SoftReference(arg0);
    }

    @ObfuscatedName("ej.c()Ljava/lang/Object;")
    public Object method3115() {
        return this.field1959.get();
    }

    @ObfuscatedName("ej.t()Z")
    public boolean method3116() {
        return true;
    }
}
