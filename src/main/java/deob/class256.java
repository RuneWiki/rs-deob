package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("io")
public class class256 extends class259 {

    @ObfuscatedName("io.c")
    public SoftReference field2921;

    public class256(Object arg0, int arg1) {
        super(arg1);
        this.field2921 = new SoftReference(arg0);
    }

    @ObfuscatedName("io.c()Ljava/lang/Object;")
    public Object method4777() {
        return this.field2921.get();
    }

    @ObfuscatedName("io.p()Z")
    public boolean method4770() {
        return true;
    }
}
