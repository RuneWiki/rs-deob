package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("hj")
public class class222 extends class225 {

    @ObfuscatedName("hj.s")
    public SoftReference field2555;

    public class222(Object arg0, int arg1) {
        super(arg1);
        this.field2555 = new SoftReference(arg0);
    }

    @ObfuscatedName("hj.s()Ljava/lang/Object;")
    public Object method3924() {
        return this.field2555.get();
    }

    @ObfuscatedName("hj.t()Z")
    public boolean method3920() {
        return true;
    }
}
