package deob;

@ObfuscatedName("bd")
public class class53 extends class204 {

    @ObfuscatedName("bd.f")
    public static class193 field1165 = new class193(64);

    @ObfuscatedName("bd.s")
    public int field1160 = 0;

    @ObfuscatedName("e.a(II)Lbd;")
    public static class53 method102(int arg0) {
        class53 var1 = (class53) field1165.method3507((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1157.method3025(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1075(new class119(var2));
        }
        field1165.method3509(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bd.r(Lds;I)V")
    public void method1075(class119 arg0) {
        while (true) {
            int var2 = arg0.method2412();
            if (var2 == 0) {
                return;
            }
            this.method1079(arg0, var2);
        }
    }

    @ObfuscatedName("bd.f(Lds;II)V")
    public void method1079(class119 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1160 = arg0.method2347();
        }
    }

    @ObfuscatedName("au.s(I)V")
    public static void method997() {
        field1165.method3515();
    }
}
