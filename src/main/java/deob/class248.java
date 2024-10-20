package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("iz")
public class class248 extends class251 {

    @ObfuscatedName("iz.c")
    public SoftReference field2795;

    public class248(Object arg0, int arg1) {
        super(arg1);
        this.field2795 = new SoftReference(arg0);
    }

    @ObfuscatedName("iz.c()Ljava/lang/Object;")
    public Object method4506() {
        return this.field2795.get();
    }

    @ObfuscatedName("iz.b()Z")
    public boolean method4507() {
        return true;
    }
}
