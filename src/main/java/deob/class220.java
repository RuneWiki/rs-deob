package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("ha")
public class class220 extends class225 {

    @ObfuscatedName("ha.c")
    public SoftReference field2651;

    public class220(Object arg0, int arg1) {
        super(arg1);
        this.field2651 = new SoftReference(arg0);
    }

    @ObfuscatedName("ha.c()Ljava/lang/Object;")
    public Object method3593() {
        return this.field2651.get();
    }

    @ObfuscatedName("ha.i()Z")
    public boolean method3594() {
        return true;
    }
}
