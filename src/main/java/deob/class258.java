package deob;

@ObfuscatedName("ig")
public class class258 extends class202 {

    @ObfuscatedName("ig.s")
    public static class197 field3430 = new class197(64);

    @ObfuscatedName("ig.r")
    public int field3429;

    @ObfuscatedName("ig.g")
    public int field3433;

    @ObfuscatedName("ig.x")
    public int field3431;

    @ObfuscatedName("aa.s(II)Lig;")
    public static class258 method632(int arg0) {
        class258 var1 = (class258) field3430.method3330((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3432.method3887(14, arg0);
        class258 var3 = new class258();
        if (var2 != null) {
            var3.method4108(new class181(var2));
        }
        field3430.method3332(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ig.r(Lfs;I)V")
    public void method4108(class181 arg0) {
        while (true) {
            int var2 = arg0.method2945();
            if (var2 == 0) {
                return;
            }
            this.method4120(arg0, var2);
        }
    }

    @ObfuscatedName("ig.g(Lfs;IB)V")
    public void method4120(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3429 = arg0.method3081();
            this.field3433 = arg0.method2945();
            this.field3431 = arg0.method2945();
        }
    }

    @ObfuscatedName("eb.x(I)V")
    public static void method2664() {
        field3430.method3333();
    }
}
