package deob;

@ObfuscatedName("ar")
public class class42 extends class174 {

    @ObfuscatedName("ar.n")
    public static class170 field1023 = new class170(64);

    @ObfuscatedName("ar.e")
    public int field1021 = 0;

    @ObfuscatedName("ah.f(Leo;B)V")
    public static void method790(class153 arg0) {
        Statics.field1025 = arg0;
        Statics.field1267 = Statics.field1025.method3056(16);
    }

    @ObfuscatedName("o.t(II)Lar;")
    public static class42 method111(int arg0) {
        class42 var1 = (class42) field1023.method3276((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1025.method3035(16, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method894(new class127(var2));
        }
        field1023.method3275(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.n(Ldq;B)V")
    public void method894(class127 arg0) {
        while (true) {
            int var2 = arg0.method2458();
            if (var2 == 0) {
                return;
            }
            this.method889(arg0, var2);
        }
    }

    @ObfuscatedName("ar.e(Ldq;II)V")
    public void method889(class127 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1021 = arg0.method2460();
        }
    }

    @ObfuscatedName("m.l(I)V")
    public static void method178() {
        field1023.method3271();
    }
}
