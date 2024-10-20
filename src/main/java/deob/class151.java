package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("ea")
public class class151 extends class149 {

    @ObfuscatedName("ea.a")
    public SoftReference field1949;

    public class151(Object arg0, int arg1) {
        super(arg1);
        this.field1949 = new SoftReference(arg0);
    }

    @ObfuscatedName("ea.a()Ljava/lang/Object;")
    public Object method3137() {
        return this.field1949.get();
    }

    @ObfuscatedName("ea.t()Z")
    public boolean method3140() {
        return true;
    }
}
