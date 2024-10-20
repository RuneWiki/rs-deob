package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("hf")
public class class220 extends class225 {

    @ObfuscatedName("hf.d")
    public SoftReference field2661;

    public class220(Object arg0, int arg1) {
        super(arg1);
        this.field2661 = new SoftReference(arg0);
    }

    @ObfuscatedName("hf.d()Ljava/lang/Object;")
    public Object method3654() {
        return this.field2661.get();
    }

    @ObfuscatedName("hf.z()Z")
    public boolean method3658() {
        return true;
    }
}
