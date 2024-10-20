package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("lj")
public class class311 extends class314 {

    @ObfuscatedName("lj.ak")
    public SoftReference field3260;

    public class311(Object arg0, int arg1) {
        super(arg1);
        this.field3260 = new SoftReference(arg0);
    }

    @ObfuscatedName("lj.ak()Ljava/lang/Object;")
    public Object method5548() {
        return this.field3260.get();
    }

    @ObfuscatedName("lj.al()Z")
    public boolean method5549() {
        return true;
    }
}
