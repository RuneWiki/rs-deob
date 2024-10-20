package deob;

@ObfuscatedName("lo")
public class class320 {

    public class320() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.z(Lir;III)[Lly;")
    public static class318[] method259(class248 arg0, int arg1, int arg2) {
        return method5228(arg0, arg1, arg2) ? Statics.method871() : null;
    }

    @ObfuscatedName("hs.w(Lir;III)Lll;")
    public static class319 method4133(class248 arg0, int arg1, int arg2) {
        return method5228(arg0, arg1, arg2) ? method1670() : null;
    }

    @ObfuscatedName("bh.s(Lir;Lir;III)Lkj;")
    public static class299 method979(class248 arg0, class248 arg1, int arg2, int arg3) {
        if (!method5228(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method4247(arg2, arg3);
        class299 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class299 var6 = new class299(var4, Statics.field46, Statics.field2563, Statics.field3801, Statics.field3800, Statics.field2261, Statics.field3802);
            Statics.field46 = null;
            Statics.field2563 = null;
            Statics.field3801 = null;
            Statics.field3800 = null;
            Statics.field2261 = null;
            Statics.field3802 = (byte[][]) null;
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("f.l(Lir;Ljava/lang/String;Ljava/lang/String;I)[Lly;")
    public static class318[] method114(class248 arg0, String arg1, String arg2) {
        int var3 = arg0.method4264(arg1);
        int var4 = arg0.method4265(var3, arg2);
        return method259(arg0, var3, var4);
    }

    @ObfuscatedName("hx.u(Lir;Ljava/lang/String;Ljava/lang/String;I)Lly;")
    public static class318 method4029(class248 arg0, String arg1, String arg2) {
        int var3 = arg0.method4264(arg1);
        int var4 = arg0.method4265(var3, arg2);
        class318 var5;
        if (method5228(arg0, var3, var4)) {
            var5 = Statics.method5226();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("j.q(Lir;Ljava/lang/String;Ljava/lang/String;I)[Lll;")
    public static class319[] method260(class248 arg0, String arg1, String arg2) {
        int var3 = arg0.method4264(arg1);
        int var4 = arg0.method4265(var3, arg2);
        class319[] var5;
        if (method5228(arg0, var3, var4)) {
            class319[] var6 = new class319[Statics.field3803];
            for (int var7 = 0; var7 < Statics.field3803; var7++) {
                class319 var8 = var6[var7] = new class319();
                var8.field3797 = Statics.field3730;
                var8.field3793 = Statics.field3799;
                var8.field3794 = Statics.field46[var7];
                var8.field3791 = Statics.field2563[var7];
                var8.field3788 = Statics.field3801[var7];
                var8.field3789 = Statics.field3800[var7];
                int var9 = var8.field3789 * var8.field3788;
                byte[] var10 = Statics.field3802[var7];
                var8.field3792 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field3792[var11] = Statics.field2261[var10[var11] & 0xFF];
                }
            }
            Statics.field46 = null;
            Statics.field2563 = null;
            Statics.field3801 = null;
            Statics.field3800 = null;
            Statics.field2261 = null;
            Statics.field3802 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ey.i(Lir;Ljava/lang/String;Ljava/lang/String;I)Lll;")
    public static class319 method2897(class248 arg0, String arg1, String arg2) {
        int var3 = arg0.method4264(arg1);
        int var4 = arg0.method4265(var3, arg2);
        return method4133(arg0, var3, var4);
    }

    @ObfuscatedName("hl.x(Lir;II)Lly;")
    public static class318 method4220(class248 arg0, int arg1) {
        byte[] var2 = arg0.method4311(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method4693(var2);
            var3 = true;
        }
        return var3 ? Statics.method5226() : null;
    }

    @ObfuscatedName("bv.b(I)Lll;")
    public static class319 method1670() {
        class319 var0 = new class319();
        var0.field3797 = Statics.field3730;
        var0.field3793 = Statics.field3799;
        var0.field3794 = Statics.field46[0];
        var0.field3791 = Statics.field2563[0];
        var0.field3788 = Statics.field3801[0];
        var0.field3789 = Statics.field3800[0];
        int var1 = var0.field3789 * var0.field3788;
        byte[] var2 = Statics.field3802[0];
        var0.field3792 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3792[var3] = Statics.field2261[var2[var3] & 0xFF];
        }
        Statics.field46 = null;
        Statics.field2563 = null;
        Statics.field3801 = null;
        Statics.field3800 = null;
        Statics.field2261 = null;
        Statics.field3802 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ks.n(Lir;III)Z")
    public static boolean method5228(class248 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4247(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method4693(var3);
            return true;
        }
    }

    @ObfuscatedName("jj.f([BB)V")
    public static void method4693(byte[] arg0) {
        class183 var1 = new class183(arg0);
        var1.field2340 = arg0.length - 2;
        Statics.field3803 = var1.method3253();
        Statics.field46 = new int[Statics.field3803];
        Statics.field2563 = new int[Statics.field3803];
        Statics.field3801 = new int[Statics.field3803];
        Statics.field3800 = new int[Statics.field3803];
        Statics.field3802 = new byte[Statics.field3803][];
        var1.field2340 = arg0.length - 7 - Statics.field3803 * 8;
        Statics.field3730 = var1.method3253();
        Statics.field3799 = var1.method3253();
        int var2 = (var1.method3247() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3803; var3++) {
            Statics.field46[var3] = var1.method3253();
        }
        for (int var4 = 0; var4 < Statics.field3803; var4++) {
            Statics.field2563[var4] = var1.method3253();
        }
        for (int var5 = 0; var5 < Statics.field3803; var5++) {
            Statics.field3801[var5] = var1.method3253();
        }
        for (int var6 = 0; var6 < Statics.field3803; var6++) {
            Statics.field3800[var6] = var1.method3253();
        }
        var1.field2340 = arg0.length - 7 - Statics.field3803 * 8 - (var2 - 1) * 3;
        Statics.field2261 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2261[var7] = var1.method3255();
            if (Statics.field2261[var7] == 0) {
                Statics.field2261[var7] = 1;
            }
        }
        var1.field2340 = 0;
        for (int var8 = 0; var8 < Statics.field3803; var8++) {
            int var9 = Statics.field3801[var8];
            int var10 = Statics.field3800[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3802[var8] = var12;
            int var13 = var1.method3247();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3384();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3384();
                    }
                }
            }
        }
    }
}
