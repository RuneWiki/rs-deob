package deob;

@ObfuscatedName("ig")
public class class240 extends class176 {

    @ObfuscatedName("ig.w")
    public static class146 field3203 = new class146(64);

    @ObfuscatedName("ig.e")
    public int field3202 = 0;

    @ObfuscatedName("y.q(Lhp;I)V")
    public static void method159(class234 arg0) {
        Statics.field3201 = arg0;
    }

    @ObfuscatedName("fp.w(II)Lig;")
    public static class240 method3228(int arg0) {
        class240 var1 = (class240) field3203.method3039((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3201.method3775(5, arg0);
        class240 var3 = new class240();
        if (var2 != null) {
            var3.method3967(new class301(var2));
        }
        field3203.method3041(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ig.e(Lkf;I)V")
    public void method3967(class301 arg0) {
        while (true) {
            int var2 = arg0.method5077();
            if (var2 == 0) {
                return;
            }
            this.method3957(arg0, var2);
        }
    }

    @ObfuscatedName("ig.p(Lkf;II)V")
    public void method3957(class301 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3202 = arg0.method5069();
        }
    }
}
