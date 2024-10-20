package deob;

@ObfuscatedName("gm")
public class class185 extends class406 {

    @ObfuscatedName("gm.h")
    public static class256 field2006 = new class256(64);

    @ObfuscatedName("gm.w")
    public class420 field2007;

    @ObfuscatedName("ny.s(IB)Lgm;")
    public static class185 method6318(int arg0) {
        class185 var1 = (class185) field2006.method4599((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2011.method5179(34, arg0);
        class185 var3 = new class185();
        if (var2 != null) {
            var3.method3191(new class444(var2));
        }
        var3.method3190();
        field2006.method4600(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gm.h(I)V")
    public void method3190() {
    }

    @ObfuscatedName("gm.w(Lqr;I)V")
    public void method3191(class444 arg0) {
        while (true) {
            int var2 = arg0.method6929();
            if (var2 == 0) {
                return;
            }
            this.method3192(arg0, var2);
        }
    }

    @ObfuscatedName("gm.v(Lqr;II)V")
    public void method3192(class444 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2007 = class175.method1527(arg0, this.field2007);
        }
    }

    @ObfuscatedName("gm.c(III)I")
    public int method3201(int arg0, int arg1) {
        return class175.method959(this.field2007, arg0, arg1);
    }

    @ObfuscatedName("gm.q(ILjava/lang/String;S)Ljava/lang/String;")
    public String method3198(int arg0, String arg1) {
        return class175.method2648(this.field2007, arg0, arg1);
    }

    @ObfuscatedName("bj.i(B)V")
    public static void method1916() {
        field2006.method4603();
    }
}
