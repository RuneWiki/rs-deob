package deob;

@ObfuscatedName("pr")
public class class439 extends class406 {

    @ObfuscatedName("pr.h")
    public static class256 field4681 = new class256(64);

    @ObfuscatedName("pr.w")
    public Object[][] field4680;

    @ObfuscatedName("pr.v")
    public int[][] field4682;

    @ObfuscatedName("pr.c")
    public int field4678;

    @ObfuscatedName("d.s(Lls;B)V")
    public static void method84(class316 arg0) {
        Statics.field4679 = arg0;
    }

    @ObfuscatedName("ca.h(IB)Lpr;")
    public static class439 method2382(int arg0) {
        class439 var1 = (class439) field4681.method4599((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4679.method5179(38, arg0);
        class439 var3 = new class439();
        if (var2 != null) {
            var3.method6835(new class444(var2));
        }
        var3.method6842();
        field4681.method4600(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("pr.w(Lqr;B)V")
    public void method6835(class444 arg0) {
        while (true) {
            int var2 = arg0.method6929();
            if (var2 == 0) {
                return;
            }
            this.method6836(arg0, var2);
        }
    }

    @ObfuscatedName("pr.v(II)[Ljava/lang/Object;")
    public Object[] method6841(int arg0) {
        return this.field4680 == null ? null : this.field4680[arg0];
    }

    @ObfuscatedName("pr.c(Lqr;II)V")
    public void method6836(class444 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method6929();
            if (this.field4680 == null) {
                this.field4680 = new Object[var3][];
                this.field4682 = new int[var3][];
            }
            for (int var4 = arg0.method6929(); var4 != 255; var4 = arg0.method6929()) {
                int var5 = arg0.method6929();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method6944();
                }
                Object[][] var8 = this.field4680;
                int var10 = arg0.method6944();
                Object[] var11 = new Object[var6.length * var10];
                for (int var12 = 0; var12 < var10; var12++) {
                    for (int var13 = 0; var13 < var6.length; var13++) {
                        int var14 = var6.length * var12 + var13;
                        class434 var15 = class432.method280(var6[var13]);
                        var11[var14] = var15.method6796(arg0);
                    }
                }
                var8[var4] = var11;
                this.field4682[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field4678 = arg0.method6971();
        }
    }

    @ObfuscatedName("pr.q(B)V")
    public void method6842() {
    }

    @ObfuscatedName("kd.i(I)V")
    public static void method5119() {
        field4681.method4603();
    }
}
