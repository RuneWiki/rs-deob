package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("io")
public class class235 extends class238 {

    @ObfuscatedName("io.n")
    public SoftReference field2633;

    public class235(Object arg0, int arg1) {
        super(arg1);
        this.field2633 = new SoftReference(arg0);
    }

    @ObfuscatedName("io.n()Ljava/lang/Object;")
    public Object method4161() {
        return this.field2633.get();
    }

    @ObfuscatedName("io.c()Z")
    public boolean method4163() {
        return true;
    }
}
