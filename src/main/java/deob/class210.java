package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("hd")
public class class210 extends class215 {

    @ObfuscatedName("hd.y")
    public SoftReference field2478;

    public class210(Object arg0, int arg1) {
        super(arg1);
        this.field2478 = new SoftReference(arg0);
    }

    @ObfuscatedName("hd.y()Ljava/lang/Object;")
    public Object method3642() {
        return this.field2478.get();
    }

    @ObfuscatedName("hd.c()Z")
    public boolean method3641() {
        return true;
    }
}
