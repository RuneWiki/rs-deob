package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("fd")
public class class160 extends class158 {

    @ObfuscatedName("fd.m")
    public SoftReference field1989;

    public class160(Object arg0, int arg1) {
        super(arg1);
        this.field1989 = new SoftReference(arg0);
    }

    @ObfuscatedName("fd.m()Ljava/lang/Object;")
    public Object method3148() {
        return this.field1989.get();
    }

    @ObfuscatedName("fd.o()Z")
    public boolean method3144() {
        return true;
    }
}
