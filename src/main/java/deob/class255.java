package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("ia")
public class class255 extends class258 {

    @ObfuscatedName("ia.c")
    public SoftReference field2892;

    public class255(Object arg0, int arg1) {
        super(arg1);
        this.field2892 = new SoftReference(arg0);
    }

    @ObfuscatedName("ia.c()Ljava/lang/Object;")
    public Object method4681() {
        return this.field2892.get();
    }

    @ObfuscatedName("ia.v()Z")
    public boolean method4683() {
        return true;
    }
}
