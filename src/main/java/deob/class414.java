package deob;

@ObfuscatedName("ob")
public class class414 {

    public class414() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ji.n(Lkk;III)Loi;")
    public static class412 method4644(class290 arg0, int arg1, int arg2) {
        return Statics.method4123(arg0, arg1, arg2) ? method3550() : null;
    }

    @ObfuscatedName("ik.c(Lkk;IIB)Loc;")
    public static class413 method4473(class290 arg0, int arg1, int arg2) {
        return Statics.method4123(arg0, arg1, arg2) ? method5578() : null;
    }

    @ObfuscatedName("mv.m(Lkk;Lkk;IIB)Llu;")
    public static class315 method5577(class290 arg0, class290 arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method4710(arg2, arg3);
        boolean var5;
        if (var4 == null) {
            var5 = false;
        } else {
            method406(var4);
            var5 = true;
        }
        return var5 ? method5784(arg1.method4710(arg2, arg3)) : null;
    }

    @ObfuscatedName("oq.k(Lkk;Ljava/lang/String;Ljava/lang/String;B)[Loi;")
    public static class412[] method6166(class290 arg0, String arg1, String arg2) {
        int var3 = arg0.method4725(arg1);
        int var4 = arg0.method4775(var3, arg2);
        class412[] var5;
        if (Statics.method4123(arg0, var3, var4)) {
            class412[] var6 = new class412[Statics.field4382];
            for (int var7 = 0; var7 < Statics.field4382; var7++) {
                class412 var8 = var6[var7] = new class412();
                var8.field4365 = Statics.field4379;
                var8.field4363 = Statics.field4381;
                var8.field4362 = Statics.field4380[var7];
                var8.field4366 = Statics.field4383[var7];
                var8.field4361 = Statics.field1613[var7];
                var8.field4364 = Statics.field4384[var7];
                var8.field4360 = Statics.field1006;
                var8.field4359 = Statics.field3657[var7];
            }
            Statics.field4380 = null;
            Statics.field4383 = null;
            Statics.field1613 = null;
            Statics.field4384 = null;
            Statics.field1006 = null;
            Statics.field3657 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("gv.o(Lkk;Ljava/lang/String;Ljava/lang/String;I)Loi;")
    public static class412 method3520(class290 arg0, String arg1, String arg2) {
        int var3 = arg0.method4725(arg1);
        int var4 = arg0.method4775(var3, arg2);
        return method4644(arg0, var3, var4);
    }

    @ObfuscatedName("cd.g(Lkk;Ljava/lang/String;Ljava/lang/String;B)[Loc;")
    public static class413[] method2207(class290 arg0, String arg1, String arg2) {
        int var3 = arg0.method4725(arg1);
        int var4 = arg0.method4775(var3, arg2);
        class413[] var5;
        if (Statics.method4123(arg0, var3, var4)) {
            var5 = method3118();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("kx.z(Lkk;Lkk;Ljava/lang/String;Ljava/lang/String;I)Llu;")
    public static class315 method4706(class290 arg0, class290 arg1, String arg2, String arg3) {
        int var4 = arg0.method4725(arg2);
        int var5 = arg0.method4775(var4, arg3);
        return method5577(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("gh.a(I)Loi;")
    public static class412 method3550() {
        class412 var0 = new class412();
        var0.field4365 = Statics.field4379;
        var0.field4363 = Statics.field4381;
        var0.field4362 = Statics.field4380[0];
        var0.field4366 = Statics.field4383[0];
        var0.field4361 = Statics.field1613[0];
        var0.field4364 = Statics.field4384[0];
        var0.field4360 = Statics.field1006;
        var0.field4359 = Statics.field3657[0];
        Statics.field4380 = null;
        Statics.field4383 = null;
        Statics.field1613 = null;
        Statics.field4384 = null;
        Statics.field1006 = null;
        Statics.field3657 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("fp.u(I)[Loc;")
    public static class413[] method3118() {
        class413[] var0 = new class413[Statics.field4382];
        for (int var1 = 0; var1 < Statics.field4382; var1++) {
            class413 var2 = var0[var1] = new class413();
            var2.field4372 = Statics.field4379;
            var2.field4373 = Statics.field4381;
            var2.field4370 = Statics.field4380[var1];
            var2.field4371 = Statics.field4383[var1];
            var2.field4375 = Statics.field1613[var1];
            var2.field4378 = Statics.field4384[var1];
            int var3 = var2.field4378 * var2.field4375;
            byte[] var4 = Statics.field3657[var1];
            var2.field4369 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field4369[var5] = Statics.field1006[var4[var5] & 0xFF];
            }
        }
        Statics.field4380 = null;
        Statics.field4383 = null;
        Statics.field1613 = null;
        Statics.field4384 = null;
        Statics.field1006 = null;
        Statics.field3657 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("mv.e(I)Loc;")
    public static class413 method5578() {
        class413 var0 = new class413();
        var0.field4372 = Statics.field4379;
        var0.field4373 = Statics.field4381;
        var0.field4370 = Statics.field4380[0];
        var0.field4371 = Statics.field4383[0];
        var0.field4375 = Statics.field1613[0];
        var0.field4378 = Statics.field4384[0];
        int var1 = var0.field4378 * var0.field4375;
        byte[] var2 = Statics.field3657[0];
        var0.field4369 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field4369[var3] = Statics.field1006[var2[var3] & 0xFF];
        }
        Statics.field4380 = null;
        Statics.field4383 = null;
        Statics.field1613 = null;
        Statics.field4384 = null;
        Statics.field1006 = null;
        Statics.field3657 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("nv.l([BB)Llu;")
    public static class315 method5784(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class315 var1 = new class315(arg0, Statics.field4380, Statics.field4383, Statics.field1613, Statics.field4384, Statics.field1006, Statics.field3657);
        Statics.field4380 = null;
        Statics.field4383 = null;
        Statics.field1613 = null;
        Statics.field4384 = null;
        Statics.field1006 = null;
        Statics.field3657 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("al.v([BB)V")
    public static void method406(byte[] arg0) {
        class400 var1 = new class400(arg0);
        var1.field4272 = arg0.length - 2;
        Statics.field4382 = var1.method6219();
        Statics.field4380 = new int[Statics.field4382];
        Statics.field4383 = new int[Statics.field4382];
        Statics.field1613 = new int[Statics.field4382];
        Statics.field4384 = new int[Statics.field4382];
        Statics.field3657 = new byte[Statics.field4382][];
        var1.field4272 = arg0.length - 7 - Statics.field4382 * 8;
        Statics.field4379 = var1.method6219();
        Statics.field4381 = var1.method6219();
        int var2 = (var1.method6217() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field4382; var3++) {
            Statics.field4380[var3] = var1.method6219();
        }
        for (int var4 = 0; var4 < Statics.field4382; var4++) {
            Statics.field4383[var4] = var1.method6219();
        }
        for (int var5 = 0; var5 < Statics.field4382; var5++) {
            Statics.field1613[var5] = var1.method6219();
        }
        for (int var6 = 0; var6 < Statics.field4382; var6++) {
            Statics.field4384[var6] = var1.method6219();
        }
        var1.field4272 = arg0.length - 7 - Statics.field4382 * 8 - (var2 - 1) * 3;
        Statics.field1006 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1006[var7] = var1.method6327();
            if (Statics.field1006[var7] == 0) {
                Statics.field1006[var7] = 1;
            }
        }
        var1.field4272 = 0;
        for (int var8 = 0; var8 < Statics.field4382; var8++) {
            int var9 = Statics.field1613[var8];
            int var10 = Statics.field4384[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3657[var8] = var12;
            int var13 = var1.method6217();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method6218();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method6218();
                    }
                }
            }
        }
    }
}
