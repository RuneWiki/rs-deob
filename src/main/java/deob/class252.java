package deob;

@ObfuscatedName("is")
public class class252 extends class206 {

    @ObfuscatedName("is.w")
    public static class201 field3369 = new class201(64);

    @ObfuscatedName("is.e")
    public int field3370 = 0;

    @ObfuscatedName("at.a(Lib;B)V")
    public static void method309(class247 arg0) {
        Statics.field3372 = arg0;
    }

    @ObfuscatedName("cs.w(II)Lis;")
    public static class252 method1525(int arg0) {
        class252 var1 = (class252) field3369.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3372.method3897(5, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4037(new class185(var2));
        }
        field3369.method3375(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("is.e(Lgh;I)V")
    public void method4037(class185 arg0) {
        while (true) {
            int var2 = arg0.method2962();
            if (var2 == 0) {
                return;
            }
            this.method4038(arg0, var2);
        }
    }

    @ObfuscatedName("is.k(Lgh;II)V")
    public void method4038(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3370 = arg0.method3194();
        }
    }
}
