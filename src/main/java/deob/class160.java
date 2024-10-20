package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("fy")
public class class160 extends class158 {

    @ObfuscatedName("fy.x")
    public SoftReference field1982;

    public class160(Object arg0, int arg1) {
        super(arg1);
        this.field1982 = new SoftReference(arg0);
    }

    @ObfuscatedName("fy.x()Ljava/lang/Object;")
    public Object method3160() {
        return this.field1982.get();
    }

    @ObfuscatedName("fy.m()Z")
    public boolean method3159() {
        return true;
    }
}
