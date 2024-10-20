package deob;

@ObfuscatedName("qm")
public class class462 extends class428 {

    @ObfuscatedName("qm.e")
    public static class269 field4891 = new class269(64);

    @ObfuscatedName("qm.v")
    public Object[][] field4894;

    @ObfuscatedName("qm.x")
    public int[][] field4893;

    @ObfuscatedName("qm.m")
    public int field4892 = -1;

    @ObfuscatedName("qo.h(Lly;I)V")
    public static void method7667(class333 arg0) {
        Statics.field4890 = arg0;
    }

    @ObfuscatedName("cu.e(IB)Lqm;")
    public static class462 method2238(int arg0) {
        class462 var1 = (class462) field4891.method4917((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4890.method5909(38, arg0);
        class462 var3 = new class462();
        if (var2 != null) {
            var3.method7698(new class467(var2));
        }
        var3.method7701();
        field4891.method4925(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("qm.v(Lqy;I)V")
    public void method7698(class467 arg0) {
        while (true) {
            int var2 = arg0.method7792();
            if (var2 == 0) {
                return;
            }
            this.method7702(arg0, var2);
        }
    }

    @ObfuscatedName("qm.x(II)[Ljava/lang/Object;")
    public Object[] method7703(int arg0) {
        return this.field4894 == null ? null : this.field4894[arg0];
    }

    @ObfuscatedName("qm.m(Lqy;IB)V")
    public void method7702(class467 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method7792();
            if (this.field4894 == null) {
                this.field4894 = new Object[var3][];
                this.field4893 = new int[var3][];
            }
            for (int var4 = arg0.method7792(); var4 != 255; var4 = arg0.method7792()) {
                int var5 = arg0.method7792();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method7806();
                }
                Object[][] var8 = this.field4894;
                int var10 = arg0.method7806();
                Object[] var11 = new Object[var6.length * var10];
                for (int var12 = 0; var12 < var10; var12++) {
                    for (int var13 = 0; var13 < var6.length; var13++) {
                        int var14 = var6.length * var12 + var13;
                        class457 var15 = class455.method73(var6[var13]);
                        var11[var14] = var15.method7650(arg0);
                    }
                }
                var8[var4] = var11;
                this.field4893[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field4892 = arg0.method7812();
        }
    }

    @ObfuscatedName("qm.q(I)V")
    public void method7701() {
    }

    @ObfuscatedName("ph.f(I)V")
    public static void method7195() {
        field4891.method4918();
    }
}
