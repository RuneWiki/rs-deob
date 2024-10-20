package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("ix")
public class class235 extends class238 {

    @ObfuscatedName("ix.i")
    public SoftReference field2657;

    public class235(Object arg0, int arg1) {
        super(arg1);
        this.field2657 = new SoftReference(arg0);
    }

    @ObfuscatedName("ix.i()Ljava/lang/Object;")
    public Object method4198() {
        return this.field2657.get();
    }

    @ObfuscatedName("ix.w()Z")
    public boolean method4199() {
        return true;
    }
}
