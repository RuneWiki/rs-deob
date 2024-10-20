package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("if")
public class class235 extends class238 {

    @ObfuscatedName("if.l")
    public SoftReference field2652;

    public class235(Object arg0, int arg1) {
        super(arg1);
        this.field2652 = new SoftReference(arg0);
    }

    @ObfuscatedName("if.l()Ljava/lang/Object;")
    public Object method4215() {
        return this.field2652.get();
    }

    @ObfuscatedName("if.q()Z")
    public boolean method4217() {
        return true;
    }
}
