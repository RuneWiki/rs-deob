package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("ft")
public class class160 extends class158 {

    @ObfuscatedName("ft.n")
    public SoftReference field1978;

    public class160(Object arg0, int arg1) {
        super(arg1);
        this.field1978 = new SoftReference(arg0);
    }

    @ObfuscatedName("ft.n()Ljava/lang/Object;")
    public Object method3237() {
        return this.field1978.get();
    }

    @ObfuscatedName("ft.v()Z")
    public boolean method3239() {
        return true;
    }
}
