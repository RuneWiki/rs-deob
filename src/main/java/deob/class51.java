package deob;

@ObfuscatedName("an")
public class class51 extends class208 {

    @ObfuscatedName("an.g")
    public static class197 field1118 = new class197(64);

    @ObfuscatedName("an.r")
    public int field1120;

    @ObfuscatedName("an.e")
    public int field1121;

    @ObfuscatedName("an.h")
    public int field1125;

    @ObfuscatedName("ae.l(Lfp;I)V")
    public static void method851(class171 arg0) {
        Statics.field1126 = arg0;
    }

    @ObfuscatedName("a.g(IB)Lan;")
    public static class51 method595(int arg0) {
        class51 var1 = (class51) field1118.method3653((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1126.method3210(14, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method1050(new class123(var2));
        }
        field1118.method3655(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.r(Ldc;B)V")
    public void method1050(class123 arg0) {
        while (true) {
            int var2 = arg0.method2490();
            if (var2 == 0) {
                return;
            }
            this.method1035(arg0, var2);
        }
    }

    @ObfuscatedName("an.e(Ldc;II)V")
    public void method1035(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1120 = arg0.method2492();
            this.field1121 = arg0.method2490();
            this.field1125 = arg0.method2490();
        }
    }

    @ObfuscatedName("ej.h(I)V")
    public static void method2938() {
        field1118.method3658();
    }
}
