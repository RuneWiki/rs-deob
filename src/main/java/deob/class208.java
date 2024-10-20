package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("gr")
public class class208 extends class213 {

    @ObfuscatedName("gr.w")
    public SoftReference field2456;

    public class208(Object arg0, int arg1) {
        super(arg1);
        this.field2456 = new SoftReference(arg0);
    }

    @ObfuscatedName("gr.w()Ljava/lang/Object;")
    public Object method3669() {
        return this.field2456.get();
    }

    @ObfuscatedName("gr.m()Z")
    public boolean method3668() {
        return true;
    }
}
