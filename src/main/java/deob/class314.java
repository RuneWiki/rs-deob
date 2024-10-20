package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("mm")
public class class314 extends class317 {

    @ObfuscatedName("mm.ab")
    public SoftReference field3242;

    public class314(Object arg0, int arg1) {
        super(arg1);
        this.field3242 = new SoftReference(arg0);
    }

    @ObfuscatedName("mm.ab()Ljava/lang/Object;")
    public Object method5581() {
        return this.field3242.get();
    }

    @ObfuscatedName("mm.ay()Z")
    public boolean method5583() {
        return true;
    }
}
