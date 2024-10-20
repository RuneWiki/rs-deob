package deob;

@ObfuscatedName("ig")
public class class252 extends class185 {

    @ObfuscatedName("ig.l")
    public static class155 field3238 = new class155(64);

    @ObfuscatedName("ig.m")
    public int field3235 = 0;

    @ObfuscatedName("eb.f(Liw;I)V")
    public static void method3121(class245 arg0) {
        Statics.field140 = arg0;
        Statics.field3234 = Statics.field140.method3963(16);
    }

    @ObfuscatedName("bz.b(IB)Lig;")
    public static class252 method1663(int arg0) {
        class252 var1 = (class252) field3238.method3155((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field140.method3905(16, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4093(new class311(var2));
        }
        field3238.method3157(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ig.l(Lkb;B)V")
    public void method4093(class311 arg0) {
        while (true) {
            int var2 = arg0.method5276();
            if (var2 == 0) {
                return;
            }
            this.method4094(arg0, var2);
        }
    }

    @ObfuscatedName("ig.m(Lkb;II)V")
    public void method4094(class311 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3235 = arg0.method5163();
        }
    }

    @ObfuscatedName("bh.z(I)V")
    public static void method1124() {
        field3238.method3158();
    }
}
