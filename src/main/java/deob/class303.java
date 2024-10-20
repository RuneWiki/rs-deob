package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("lx")
public class class303 extends class306 {

    @ObfuscatedName("lx.az")
    public SoftReference field3186;

    public class303(Object arg0, int arg1) {
        super(arg1);
        this.field3186 = new SoftReference(arg0);
    }

    @ObfuscatedName("lx.az()Ljava/lang/Object;")
    public Object method5327() {
        return this.field3186.get();
    }

    @ObfuscatedName("lx.ah()Z")
    public boolean method5328() {
        return true;
    }
}
