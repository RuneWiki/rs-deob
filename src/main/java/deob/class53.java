package deob;

@ObfuscatedName("bj")
public class class53 extends class205 {

    @ObfuscatedName("bj.f")
    public static class194 field1136 = new class194(64);

    @ObfuscatedName("bj.s")
    public int field1141 = 0;

    @ObfuscatedName("k.e(Lft;B)V")
    public static void method121(class168 arg0) {
        Statics.field1135 = arg0;
        Statics.field3211 = Statics.field1135.method3075(16);
    }

    @ObfuscatedName("ay.w(IB)Lbj;")
    public static class53 method710(int arg0) {
        class53 var1 = (class53) field1136.method3473((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1135.method3048(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1039(new class120(var2));
        }
        field1136.method3475(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bj.f(Ldq;I)V")
    public void method1039(class120 arg0) {
        while (true) {
            int var2 = arg0.method2355();
            if (var2 == 0) {
                return;
            }
            this.method1041(arg0, var2);
        }
    }

    @ObfuscatedName("bj.s(Ldq;II)V")
    public void method1041(class120 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1141 = arg0.method2532();
        }
    }

    @ObfuscatedName("ak.p(I)V")
    public static void method989() {
        field1136.method3479();
    }
}
