package deob;

@ObfuscatedName("al")
public class class46 extends class180 {

    @ObfuscatedName("al.a")
    public static class170 field1051 = new class170(64);

    @ObfuscatedName("al.g")
    public int field1052 = 0;

    @ObfuscatedName("a.e(Lec;I)V")
    public static void method20(class145 arg0) {
        Statics.field1054 = arg0;
        Statics.field1049 = Statics.field1054.method2726(16);
    }

    @ObfuscatedName("ai.p(II)Lal;")
    public static class46 method592(int arg0) {
        class46 var1 = (class46) field1051.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1054.method2717(16, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method925(new class107(var2));
        }
        field1051.method3161(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.a(Ldp;B)V")
    public void method925(class107 arg0) {
        while (true) {
            int var2 = arg0.method2125();
            if (var2 == 0) {
                return;
            }
            this.method920(arg0, var2);
        }
    }

    @ObfuscatedName("al.g(Ldp;II)V")
    public void method920(class107 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1052 = arg0.method2182();
        }
    }

    @ObfuscatedName("at.u(I)V")
    public static void method839() {
        field1051.method3162();
    }
}
