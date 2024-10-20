package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("if")
public class class256 extends class259 {

    @ObfuscatedName("if.v")
    public SoftReference field2879;

    public class256(Object arg0, int arg1) {
        super(arg1);
        this.field2879 = new SoftReference(arg0);
    }

    @ObfuscatedName("if.v()Ljava/lang/Object;")
    public Object method4639() {
        return this.field2879.get();
    }

    @ObfuscatedName("if.c()Z")
    public boolean method4642() {
        return true;
    }
}
