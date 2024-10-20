package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("hp")
public class class220 extends class225 {

    @ObfuscatedName("hp.o")
    public SoftReference field2660;

    public class220(Object arg0, int arg1) {
        super(arg1);
        this.field2660 = new SoftReference(arg0);
    }

    @ObfuscatedName("hp.o()Ljava/lang/Object;")
    public Object method3560() {
        return this.field2660.get();
    }

    @ObfuscatedName("hp.k()Z")
    public boolean method3564() {
        return true;
    }
}
