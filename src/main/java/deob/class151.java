package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("ee")
public class class151 extends class149 {

    @ObfuscatedName("ee.q")
    public SoftReference field1971;

    public class151(Object arg0, int arg1) {
        super(arg1);
        this.field1971 = new SoftReference(arg0);
    }

    @ObfuscatedName("ee.q()Ljava/lang/Object;")
    public Object method3058() {
        return this.field1971.get();
    }

    @ObfuscatedName("ee.w()Z")
    public boolean method3059() {
        return true;
    }
}
