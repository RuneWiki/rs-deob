package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("lr")
public class class288 extends class291 {

    @ObfuscatedName("lr.aw")
    public SoftReference field3073;

    public class288(Object arg0, int arg1) {
        super(arg1);
        this.field3073 = new SoftReference(arg0);
    }

    @ObfuscatedName("lr.aw()Ljava/lang/Object;")
    public Object method5138() {
        return this.field3073.get();
    }

    @ObfuscatedName("lr.ay()Z")
    public boolean method5141() {
        return true;
    }
}
