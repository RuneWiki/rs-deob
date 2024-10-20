package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("ir")
public class class248 extends class251 {

    @ObfuscatedName("ir.c")
    public SoftReference field2815;

    public class248(Object arg0, int arg1) {
        super(arg1);
        this.field2815 = new SoftReference(arg0);
    }

    @ObfuscatedName("ir.c()Ljava/lang/Object;")
    public Object method4465() {
        return this.field2815.get();
    }

    @ObfuscatedName("ir.l()Z")
    public boolean method4470() {
        return true;
    }
}
