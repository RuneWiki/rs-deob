package deob;

@ObfuscatedName("qk")
public class class454 {

    public class454() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bw.o(Llp;IIB)[Lqd;")
    public static class452[] method1957(class316 arg0, int arg1, int arg2) {
        if (!method6002(arg0, arg1, arg2)) {
            return null;
        }
        class452[] var3 = new class452[Statics.field4783];
        for (int var4 = 0; var4 < Statics.field4783; var4++) {
            class452 var5 = var3[var4] = new class452();
            var5.field4765 = Statics.field4780;
            var5.field4761 = Statics.field4782;
            var5.field4766 = Statics.field4781[var4];
            var5.field4764 = Statics.field4779[var4];
            var5.field4759 = Statics.field460[var4];
            var5.field4762 = Statics.field4784[var4];
            var5.field4760 = Statics.field405;
            var5.field4763 = Statics.field1570[var4];
        }
        method3036();
        return var3;
    }

    @ObfuscatedName("hi.q(Llp;III)Lqd;")
    public static class452 method4061(class316 arg0, int arg1, int arg2) {
        if (!method6002(arg0, arg1, arg2)) {
            return null;
        }
        class452 var3 = new class452();
        var3.field4765 = Statics.field4780;
        var3.field4761 = Statics.field4782;
        var3.field4766 = Statics.field4781[0];
        var3.field4764 = Statics.field4779[0];
        var3.field4759 = Statics.field460[0];
        var3.field4762 = Statics.field4784[0];
        var3.field4760 = Statics.field405;
        var3.field4763 = Statics.field1570[0];
        method3036();
        return var3;
    }

    @ObfuscatedName("gp.l(Llp;IIB)Lqr;")
    public static class453 method3230(class316 arg0, int arg1, int arg2) {
        return method6002(arg0, arg1, arg2) ? method5869() : null;
    }

    @ObfuscatedName("nh.k(Llp;Llp;III)Lmx;")
    public static class350 method6208(class316 arg0, class316 arg1, int arg2, int arg3) {
        if (!method6002(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method5249(arg2, arg3);
        class350 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class350 var6 = new class350(var4, Statics.field4781, Statics.field4779, Statics.field460, Statics.field4784, Statics.field405, Statics.field1570);
            method3036();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("fp.a(Llp;Ljava/lang/String;Ljava/lang/String;B)Lqd;")
    public static class452 method2897(class316 arg0, String arg1, String arg2) {
        int var3 = arg0.method5206(arg1);
        int var4 = arg0.method5207(var3, arg2);
        return method4061(arg0, var3, var4);
    }

    @ObfuscatedName("gt.m(Llp;Ljava/lang/String;Ljava/lang/String;B)[Lqr;")
    public static class453[] method3910(class316 arg0, String arg1, String arg2) {
        int var3 = arg0.method5206(arg1);
        int var4 = arg0.method5207(var3, arg2);
        class453[] var5;
        if (method6002(arg0, var3, var4)) {
            class453[] var6 = new class453[Statics.field4783];
            for (int var7 = 0; var7 < Statics.field4783; var7++) {
                class453 var8 = var6[var7] = new class453();
                var8.field4772 = Statics.field4780;
                var8.field4776 = Statics.field4782;
                var8.field4773 = Statics.field4781[var7];
                var8.field4771 = Statics.field4779[var7];
                var8.field4768 = Statics.field460[var7];
                var8.field4770 = Statics.field4784[var7];
                int var9 = var8.field4770 * var8.field4768;
                byte[] var10 = Statics.field1570[var7];
                var8.field4767 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field4767[var11] = Statics.field405[var10[var11] & 0xFF];
                }
            }
            method3036();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("lj.p(Llp;Llp;Ljava/lang/String;Ljava/lang/String;I)Lmx;")
    public static class350 method5326(class316 arg0, class316 arg1, String arg2, String arg3) {
        int var4 = arg0.method5206(arg2);
        int var5 = arg0.method5207(var4, arg3);
        return method6208(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("bt.s(Llp;IB)Lqd;")
    public static class452 method1788(class316 arg0, int arg1) {
        if (!method367(arg0, arg1)) {
            return null;
        }
        class452 var2 = new class452();
        var2.field4765 = Statics.field4780;
        var2.field4761 = Statics.field4782;
        var2.field4766 = Statics.field4781[0];
        var2.field4764 = Statics.field4779[0];
        var2.field4759 = Statics.field460[0];
        var2.field4762 = Statics.field4784[0];
        var2.field4760 = Statics.field405;
        var2.field4763 = Statics.field1570[0];
        method3036();
        return var2;
    }

    @ObfuscatedName("mk.r(I)Lqr;")
    public static class453 method5869() {
        class453 var0 = new class453();
        var0.field4772 = Statics.field4780;
        var0.field4776 = Statics.field4782;
        var0.field4773 = Statics.field4781[0];
        var0.field4771 = Statics.field4779[0];
        var0.field4768 = Statics.field460[0];
        var0.field4770 = Statics.field4784[0];
        int var1 = var0.field4770 * var0.field4768;
        byte[] var2 = Statics.field1570[0];
        var0.field4767 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field4767[var3] = Statics.field405[var2[var3] & 0xFF];
        }
        method3036();
        return var0;
    }

    @ObfuscatedName("nb.v(Llp;IIB)Z")
    public static boolean method6002(class316 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5249(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3496(var3);
            return true;
        }
    }

    @ObfuscatedName("am.y(Llp;IS)Z")
    public static boolean method367(class316 arg0, int arg1) {
        byte[] var2 = arg0.method5195(arg1);
        if (var2 == null) {
            return false;
        } else {
            method3496(var2);
            return true;
        }
    }

    @ObfuscatedName("gw.c([BB)V")
    public static void method3496(byte[] arg0) {
        class440 var1 = new class440(arg0);
        var1.field4678 = arg0.length - 2;
        Statics.field4783 = var1.method7082();
        Statics.field4781 = new int[Statics.field4783];
        Statics.field4779 = new int[Statics.field4783];
        Statics.field460 = new int[Statics.field4783];
        Statics.field4784 = new int[Statics.field4783];
        Statics.field1570 = new byte[Statics.field4783][];
        var1.field4678 = arg0.length - 7 - Statics.field4783 * 8;
        Statics.field4780 = var1.method7082();
        Statics.field4782 = var1.method7082();
        int var2 = (var1.method7071() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field4783; var3++) {
            Statics.field4781[var3] = var1.method7082();
        }
        for (int var4 = 0; var4 < Statics.field4783; var4++) {
            Statics.field4779[var4] = var1.method7082();
        }
        for (int var5 = 0; var5 < Statics.field4783; var5++) {
            Statics.field460[var5] = var1.method7082();
        }
        for (int var6 = 0; var6 < Statics.field4783; var6++) {
            Statics.field4784[var6] = var1.method7082();
        }
        var1.field4678 = arg0.length - 7 - Statics.field4783 * 8 - (var2 - 1) * 3;
        Statics.field405 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field405[var7] = var1.method6897();
            if (Statics.field405[var7] == 0) {
                Statics.field405[var7] = 1;
            }
        }
        var1.field4678 = 0;
        for (int var8 = 0; var8 < Statics.field4783; var8++) {
            int var9 = Statics.field460[var8];
            int var10 = Statics.field4784[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1570[var8] = var12;
            int var13 = var1.method7071();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method7034();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method7034();
                    }
                }
            }
        }
    }

    @ObfuscatedName("fe.w(I)V")
    public static void method3036() {
        Statics.field4781 = null;
        Statics.field4779 = null;
        Statics.field460 = null;
        Statics.field4784 = null;
        Statics.field405 = null;
        Statics.field1570 = (byte[][]) null;
    }
}
