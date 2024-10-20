package deob;

@ObfuscatedName("il")
public class class252 extends class185 {

    @ObfuscatedName("il.d")
    public static class155 field3243 = new class155(64);

    @ObfuscatedName("il.c")
    public int field3244 = 0;

    @ObfuscatedName("gc.n(II)Lil;")
    public static class252 method3559(int arg0) {
        class252 var1 = (class252) field3243.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3242.method4032(16, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4158(new class311(var2));
        }
        field3243.method3217(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("il.v(Lkx;I)V")
    public void method4158(class311 arg0) {
        while (true) {
            int var2 = arg0.method5310();
            if (var2 == 0) {
                return;
            }
            this.method4168(arg0, var2);
        }
    }

    @ObfuscatedName("il.d(Lkx;IB)V")
    public void method4168(class311 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3244 = arg0.method5247();
        }
    }

    @ObfuscatedName("cq.c(I)V")
    public static void method1762() {
        field3243.method3218();
    }
}
