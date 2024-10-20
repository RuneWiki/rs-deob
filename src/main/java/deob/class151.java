package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("ee")
public class class151 extends class149 {

    @ObfuscatedName("ee.c")
    public SoftReference field1936;

    public class151(Object arg0, int arg1) {
        super(arg1);
        this.field1936 = new SoftReference(arg0);
    }

    @ObfuscatedName("ee.c()Ljava/lang/Object;")
    public Object method3083() {
        return this.field1936.get();
    }

    @ObfuscatedName("ee.x()Z")
    public boolean method3082() {
        return true;
    }
}
