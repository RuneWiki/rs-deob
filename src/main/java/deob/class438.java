package deob;

@ObfuscatedName("px")
public class class438 extends class405 {

    @ObfuscatedName("px.v")
    public static class256 field4680 = new class256(64);

    @ObfuscatedName("px.q")
    public Object[][] field4677;

    @ObfuscatedName("px.f")
    public int[][] field4678;

    @ObfuscatedName("px.j")
    public int field4679;

    @ObfuscatedName("dn.c(Llh;S)V")
    public static void method2572(class315 arg0) {
        Statics.field4676 = arg0;
    }

    @ObfuscatedName("nh.v(II)Lpx;")
    public static class438 method6043(int arg0) {
        class438 var1 = (class438) field4680.method4691((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4676.method5305(38, arg0);
        class438 var3 = new class438();
        if (var2 != null) {
            var3.method6949(new class443(var2));
        }
        var3.method6950();
        field4680.method4693(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("px.q(Lqt;B)V")
    public void method6949(class443 arg0) {
        while (true) {
            int var2 = arg0.method7047();
            if (var2 == 0) {
                return;
            }
            this.method6941(arg0, var2);
        }
    }

    @ObfuscatedName("px.f(IB)[Ljava/lang/Object;")
    public Object[] method6939(int arg0) {
        return this.field4677 == null ? null : this.field4677[arg0];
    }

    @ObfuscatedName("px.j(Lqt;II)V")
    public void method6941(class443 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method7047();
            if (this.field4677 == null) {
                this.field4677 = new Object[var3][];
                this.field4678 = new int[var3][];
            }
            for (int var4 = arg0.method7047(); var4 != 255; var4 = arg0.method7047()) {
                int var5 = arg0.method7047();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method7062();
                }
                Object[][] var8 = this.field4677;
                int var10 = arg0.method7062();
                Object[] var11 = new Object[var6.length * var10];
                for (int var12 = 0; var12 < var10; var12++) {
                    for (int var13 = 0; var13 < var6.length; var13++) {
                        int var14 = var6.length * var12 + var13;
                        class433 var15 = class431.method4951(var6[var13]);
                        var11[var14] = var15.method6887(arg0);
                    }
                }
                var8[var4] = var11;
                this.field4678[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field4679 = arg0.method7068();
        }
    }

    @ObfuscatedName("px.e(I)V")
    public void method6950() {
    }

    @ObfuscatedName("bb.g(I)V")
    public static void method1798() {
        field4680.method4695();
    }
}
