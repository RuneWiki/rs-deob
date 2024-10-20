package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("hl")
public class class220 extends class225 {

    @ObfuscatedName("hl.g")
    public SoftReference field2666;

    public class220(Object arg0, int arg1) {
        super(arg1);
        this.field2666 = new SoftReference(arg0);
    }

    @ObfuscatedName("hl.g()Ljava/lang/Object;")
    public Object method3669() {
        return this.field2666.get();
    }

    @ObfuscatedName("hl.e()Z")
    public boolean method3672() {
        return true;
    }
}
