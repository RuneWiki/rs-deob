package deob;

@ObfuscatedName("bj")
public class class55 extends class208 {

    @ObfuscatedName("bj.g")
    public static class197 field1172 = new class197(64);

    @ObfuscatedName("bj.r")
    public int field1171 = 0;

    @ObfuscatedName("ai.l(Lfp;B)V")
    public static void method785(class171 arg0) {
        Statics.field1170 = arg0;
    }

    @ObfuscatedName("ex.g(II)Lbj;")
    public static class55 method3097(int arg0) {
        class55 var1 = (class55) field1172.method3653((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1170.method3210(5, arg0);
        class55 var3 = new class55();
        if (var2 != null) {
            var3.method1127(new class123(var2));
        }
        field1172.method3655(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bj.r(Ldc;I)V")
    public void method1127(class123 arg0) {
        while (true) {
            int var2 = arg0.method2490();
            if (var2 == 0) {
                return;
            }
            this.method1137(arg0, var2);
        }
    }

    @ObfuscatedName("bj.e(Ldc;II)V")
    public void method1137(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1171 = arg0.method2492();
        }
    }
}
