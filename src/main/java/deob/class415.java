package deob;

@ObfuscatedName("ol")
public class class415 {

    public class415() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("em.l(Lkl;III)[Loz;")
    public static class413[] method2687(class290 arg0, int arg1, int arg2) {
        if (!method2847(arg0, arg1, arg2)) {
            return null;
        }
        class413[] var3 = new class413[Statics.field4393];
        for (int var4 = 0; var4 < Statics.field4393; var4++) {
            class413 var5 = var3[var4] = new class413();
            var5.field4377 = Statics.field4394;
            var5.field4379 = Statics.field4356;
            var5.field4376 = Statics.field1510[var4];
            var5.field4378 = Statics.field1490[var4];
            var5.field4373 = Statics.field4395[var4];
            var5.field4375 = Statics.field92[var4];
            var5.field4374 = Statics.field4034;
            var5.field4380 = Statics.field4397[var4];
        }
        method4677();
        return var3;
    }

    @ObfuscatedName("nj.q(Lkl;III)Lon;")
    public static class414 method6113(class290 arg0, int arg1, int arg2) {
        return method2847(arg0, arg1, arg2) ? method757() : null;
    }

    @ObfuscatedName("cd.f(Lkl;Lkl;III)Llt;")
    public static class315 method2057(class290 arg0, class290 arg1, int arg2, int arg3) {
        if (!method2847(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method4756(arg2, arg3);
        class315 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class315 var6 = new class315(var4, Statics.field1510, Statics.field1490, Statics.field4395, Statics.field92, Statics.field4034, Statics.field4397);
            method4677();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("ev.j(Lkl;Ljava/lang/String;Ljava/lang/String;B)Loz;")
    public static class413 method2496(class290 arg0, String arg1, String arg2) {
        int var3 = arg0.method4771(arg1);
        int var4 = arg0.method4848(var3, arg2);
        class413 var5;
        if (method2847(arg0, var3, var4)) {
            class413 var6 = new class413();
            var6.field4377 = Statics.field4394;
            var6.field4379 = Statics.field4356;
            var6.field4376 = Statics.field1510[0];
            var6.field4378 = Statics.field1490[0];
            var6.field4373 = Statics.field4395[0];
            var6.field4375 = Statics.field92[0];
            var6.field4374 = Statics.field4034;
            var6.field4380 = Statics.field4397[0];
            method4677();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("be.m(Lkl;Ljava/lang/String;Ljava/lang/String;I)[Lon;")
    public static class414[] method1881(class290 arg0, String arg1, String arg2) {
        int var3 = arg0.method4771(arg1);
        int var4 = arg0.method4848(var3, arg2);
        class414[] var5;
        if (method2847(arg0, var3, var4)) {
            class414[] var6 = new class414[Statics.field4393];
            for (int var7 = 0; var7 < Statics.field4393; var7++) {
                class414 var8 = var6[var7] = new class414();
                var8.field4386 = Statics.field4394;
                var8.field4391 = Statics.field4356;
                var8.field4384 = Statics.field1510[var7];
                var8.field4387 = Statics.field1490[var7];
                var8.field4390 = Statics.field4395[var7];
                var8.field4383 = Statics.field92[var7];
                int var9 = var8.field4390 * var8.field4383;
                byte[] var10 = Statics.field4397[var7];
                var8.field4385 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field4385[var11] = Statics.field4034[var10[var11] & 0xFF];
                }
            }
            method4677();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("fd.k(Lkl;II)Loz;")
    public static class413 method2898(class290 arg0, int arg1) {
        byte[] var2 = arg0.method4762(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method6216(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class413 var4 = new class413();
        var4.field4377 = Statics.field4394;
        var4.field4379 = Statics.field4356;
        var4.field4376 = Statics.field1510[0];
        var4.field4378 = Statics.field1490[0];
        var4.field4373 = Statics.field4395[0];
        var4.field4375 = Statics.field92[0];
        var4.field4374 = Statics.field4034;
        var4.field4380 = Statics.field4397[0];
        method4677();
        return var4;
    }

    @ObfuscatedName("at.t(B)Lon;")
    public static class414 method757() {
        class414 var0 = new class414();
        var0.field4386 = Statics.field4394;
        var0.field4391 = Statics.field4356;
        var0.field4384 = Statics.field1510[0];
        var0.field4387 = Statics.field1490[0];
        var0.field4390 = Statics.field4395[0];
        var0.field4383 = Statics.field92[0];
        int var1 = var0.field4390 * var0.field4383;
        byte[] var2 = Statics.field4397[0];
        var0.field4385 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field4385[var3] = Statics.field4034[var2[var3] & 0xFF];
        }
        method4677();
        return var0;
    }

    @ObfuscatedName("fm.a(Lkl;IIB)Z")
    public static boolean method2847(class290 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4756(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method6216(var3);
            return true;
        }
    }

    @ObfuscatedName("ou.e([BB)V")
    public static void method6216(byte[] arg0) {
        class401 var1 = new class401(arg0);
        var1.field4292 = arg0.length - 2;
        Statics.field4393 = var1.method6284();
        Statics.field1510 = new int[Statics.field4393];
        Statics.field1490 = new int[Statics.field4393];
        Statics.field4395 = new int[Statics.field4393];
        Statics.field92 = new int[Statics.field4393];
        Statics.field4397 = new byte[Statics.field4393][];
        var1.field4292 = arg0.length - 7 - Statics.field4393 * 8;
        Statics.field4394 = var1.method6284();
        Statics.field4356 = var1.method6284();
        int var2 = (var1.method6272() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field4393; var3++) {
            Statics.field1510[var3] = var1.method6284();
        }
        for (int var4 = 0; var4 < Statics.field4393; var4++) {
            Statics.field1490[var4] = var1.method6284();
        }
        for (int var5 = 0; var5 < Statics.field4393; var5++) {
            Statics.field4395[var5] = var1.method6284();
        }
        for (int var6 = 0; var6 < Statics.field4393; var6++) {
            Statics.field92[var6] = var1.method6284();
        }
        var1.field4292 = arg0.length - 7 - Statics.field4393 * 8 - (var2 - 1) * 3;
        Statics.field4034 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field4034[var7] = var1.method6276();
            if (Statics.field4034[var7] == 0) {
                Statics.field4034[var7] = 1;
            }
        }
        var1.field4292 = 0;
        for (int var8 = 0; var8 < Statics.field4393; var8++) {
            int var9 = Statics.field4395[var8];
            int var10 = Statics.field92[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field4397[var8] = var12;
            int var13 = var1.method6272();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method6273();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method6273();
                    }
                }
            }
        }
    }

    @ObfuscatedName("jz.i(I)V")
    public static void method4677() {
        Statics.field1510 = null;
        Statics.field1490 = null;
        Statics.field4395 = null;
        Statics.field92 = null;
        Statics.field4034 = null;
        Statics.field4397 = (byte[][]) null;
    }
}
