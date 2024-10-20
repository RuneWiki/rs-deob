package deob;

@ObfuscatedName("fp")
public class class182 extends class435 {

    @ObfuscatedName("fp.v")
    public static class273 field1930 = new class273(64);

    @ObfuscatedName("fp.s")
    public int field1929 = 0;

    @ObfuscatedName("ig.f(Lln;I)V")
    public static void method4861(class337 arg0) {
        Statics.field1927 = arg0;
        Statics.field1928 = Statics.field1927.method5982(16);
    }

    @ObfuscatedName("fg.w(II)Lfp;")
    public static class182 method3231(int arg0) {
        class182 var1 = (class182) field1930.method5028((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1927.method5990(16, arg0);
        class182 var3 = new class182();
        if (var2 != null) {
            var3.method3298(new class474(var2));
        }
        field1930.method5027(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fp.v(Lrd;B)V")
    public void method3298(class474 arg0) {
        while (true) {
            int var2 = arg0.method7964();
            if (var2 == 0) {
                return;
            }
            this.method3284(arg0, var2);
        }
    }

    @ObfuscatedName("fp.s(Lrd;IB)V")
    public void method3284(class474 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1929 = arg0.method8032();
        }
    }

    @ObfuscatedName("hb.z(I)V")
    public static void method4291() {
        field1930.method5033();
    }
}
