package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("md")
public class class316 extends class319 {

    @ObfuscatedName("md.ac")
    public SoftReference field3288;

    public class316(Object arg0, int arg1) {
        super(arg1);
        this.field3288 = new SoftReference(arg0);
    }

    @ObfuscatedName("md.ac()Ljava/lang/Object;")
    public Object method5728() {
        return this.field3288.get();
    }

    @ObfuscatedName("md.ae()Z")
    public boolean method5726() {
        return true;
    }
}
