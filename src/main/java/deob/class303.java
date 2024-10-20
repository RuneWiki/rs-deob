package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("lh")
public class class303 extends class306 {

    @ObfuscatedName("lh.aq")
    public SoftReference field3157;

    public class303(Object arg0, int arg1) {
        super(arg1);
        this.field3157 = new SoftReference(arg0);
    }

    @ObfuscatedName("lh.aq()Ljava/lang/Object;")
    public Object method5407() {
        return this.field3157.get();
    }

    @ObfuscatedName("lh.aw()Z")
    public boolean method5406() {
        return true;
    }
}
