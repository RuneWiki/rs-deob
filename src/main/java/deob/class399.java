package deob;

@ObfuscatedName("os")
public class class399 {

    public class399() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bx.t(Ljy;IIB)[Lom;")
    public static class398[] method1785(class277 arg0, int arg1, int arg2) {
        return method4656(arg0, arg1, arg2) ? method2908() : null;
    }

    @ObfuscatedName("gd.v(Ljy;III)Lom;")
    public static class398 method3879(class277 arg0, int arg1, int arg2) {
        if (!method4656(arg0, arg1, arg2)) {
            return null;
        }
        class398 var3 = new class398();
        var3.field4274 = Statics.field4281;
        var3.field4275 = Statics.field4286;
        var3.field4272 = Statics.field4284[0];
        var3.field4277 = Statics.field4285[0];
        var3.field4270 = Statics.field1308[0];
        var3.field4271 = Statics.field4156[0];
        int var4 = var3.field4271 * var3.field4270;
        byte[] var5 = Statics.field4283[0];
        var3.field4280 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field4280[var6] = Statics.field1407[var5[var6] & 0xFF];
        }
        Statics.field4284 = null;
        Statics.field4285 = null;
        Statics.field1308 = null;
        Statics.field4156 = null;
        Statics.field1407 = null;
        Statics.field4283 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("ia.j(Ljy;Ljy;III)Lkt;")
    public static class302 method4338(class277 arg0, class277 arg1, int arg2, int arg3) {
        return method4656(arg0, arg2, arg3) ? method5111(arg1.method4459(arg2, arg3)) : null;
    }

    @ObfuscatedName("dv.l(Ljy;Ljava/lang/String;Ljava/lang/String;I)Lof;")
    public static class397 method2219(class277 arg0, String arg1, String arg2) {
        int var3 = arg0.method4474(arg1);
        int var4 = arg0.method4476(var3, arg2);
        class397 var5;
        if (method4656(arg0, var3, var4)) {
            class397 var6 = new class397();
            var6.field4267 = Statics.field4281;
            var6.field4268 = Statics.field4286;
            var6.field4265 = Statics.field4284[0];
            var6.field4266 = Statics.field4285[0];
            var6.field4263 = Statics.field1308[0];
            var6.field4264 = Statics.field4156[0];
            var6.field4261 = Statics.field1407;
            var6.field4262 = Statics.field4283[0];
            Statics.field4284 = null;
            Statics.field4285 = null;
            Statics.field1308 = null;
            Statics.field4156 = null;
            Statics.field1407 = null;
            Statics.field4283 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bw.n(Ljy;Ljava/lang/String;Ljava/lang/String;B)[Lom;")
    public static class398[] method1642(class277 arg0, String arg1, String arg2) {
        int var3 = arg0.method4474(arg1);
        int var4 = arg0.method4476(var3, arg2);
        return method1785(arg0, var3, var4);
    }

    @ObfuscatedName("hi.w(Ljy;Ljy;Ljava/lang/String;Ljava/lang/String;I)Lkt;")
    public static class302 method3957(class277 arg0, class277 arg1, String arg2, String arg3) {
        int var4 = arg0.method4474(arg2);
        int var5 = arg0.method4476(var4, arg3);
        return method4338(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("em.f(Ljy;IS)Lof;")
    public static class397 method2727(class277 arg0, int arg1) {
        byte[] var2 = arg0.method4466(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method3737(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class397 var4 = new class397();
        var4.field4267 = Statics.field4281;
        var4.field4268 = Statics.field4286;
        var4.field4265 = Statics.field4284[0];
        var4.field4266 = Statics.field4285[0];
        var4.field4263 = Statics.field1308[0];
        var4.field4264 = Statics.field4156[0];
        var4.field4261 = Statics.field1407;
        var4.field4262 = Statics.field4283[0];
        Statics.field4284 = null;
        Statics.field4285 = null;
        Statics.field1308 = null;
        Statics.field4156 = null;
        Statics.field1407 = null;
        Statics.field4283 = (byte[][]) null;
        return var4;
    }

    @ObfuscatedName("fc.o(I)[Lom;")
    public static class398[] method2908() {
        class398[] var0 = new class398[Statics.field4282];
        for (int var1 = 0; var1 < Statics.field4282; var1++) {
            class398 var2 = var0[var1] = new class398();
            var2.field4274 = Statics.field4281;
            var2.field4275 = Statics.field4286;
            var2.field4272 = Statics.field4284[var1];
            var2.field4277 = Statics.field4285[var1];
            var2.field4270 = Statics.field1308[var1];
            var2.field4271 = Statics.field4156[var1];
            int var3 = var2.field4271 * var2.field4270;
            byte[] var4 = Statics.field4283[var1];
            var2.field4280 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field4280[var5] = Statics.field1407[var4[var5] & 0xFF];
            }
        }
        Statics.field4284 = null;
        Statics.field4285 = null;
        Statics.field1308 = null;
        Statics.field4156 = null;
        Statics.field1407 = null;
        Statics.field4283 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ll.x([BB)Lkt;")
    public static class302 method5111(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class302 var1 = new class302(arg0, Statics.field4284, Statics.field4285, Statics.field1308, Statics.field4156, Statics.field1407, Statics.field4283);
        Statics.field4284 = null;
        Statics.field4285 = null;
        Statics.field1308 = null;
        Statics.field4156 = null;
        Statics.field1407 = null;
        Statics.field4283 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("kl.r(Ljy;III)Z")
    public static boolean method4656(class277 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4459(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3737(var3);
            return true;
        }
    }

    @ObfuscatedName("gv.p([BB)V")
    public static void method3737(byte[] arg0) {
        class385 var1 = new class385(arg0);
        var1.field4182 = arg0.length - 2;
        Statics.field4282 = var1.method6053();
        Statics.field4284 = new int[Statics.field4282];
        Statics.field4285 = new int[Statics.field4282];
        Statics.field1308 = new int[Statics.field4282];
        Statics.field4156 = new int[Statics.field4282];
        Statics.field4283 = new byte[Statics.field4282][];
        var1.field4182 = arg0.length - 7 - Statics.field4282 * 8;
        Statics.field4281 = var1.method6053();
        Statics.field4286 = var1.method6053();
        int var2 = (var1.method5958() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field4282; var3++) {
            Statics.field4284[var3] = var1.method6053();
        }
        for (int var4 = 0; var4 < Statics.field4282; var4++) {
            Statics.field4285[var4] = var1.method6053();
        }
        for (int var5 = 0; var5 < Statics.field4282; var5++) {
            Statics.field1308[var5] = var1.method6053();
        }
        for (int var6 = 0; var6 < Statics.field4282; var6++) {
            Statics.field4156[var6] = var1.method6053();
        }
        var1.field4182 = arg0.length - 7 - Statics.field4282 * 8 - (var2 - 1) * 3;
        Statics.field1407 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1407[var7] = var1.method5962();
            if (Statics.field1407[var7] == 0) {
                Statics.field1407[var7] = 1;
            }
        }
        var1.field4182 = 0;
        for (int var8 = 0; var8 < Statics.field4282; var8++) {
            int var9 = Statics.field1308[var8];
            int var10 = Statics.field4156[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field4283[var8] = var12;
            int var13 = var1.method5958();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method5959();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method5959();
                    }
                }
            }
        }
    }
}
