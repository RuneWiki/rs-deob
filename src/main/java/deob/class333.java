package deob;

@ObfuscatedName("lr")
public class class333 {

    public class333() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bc.g(Ljr;IIB)[Llh;")
    public static class331[] method1055(class262 arg0, int arg1, int arg2) {
        return method5350(arg0, arg1, arg2) ? method5092() : null;
    }

    @ObfuscatedName("gx.e(Ljr;IIB)Llv;")
    public static class332 method3538(class262 arg0, int arg1, int arg2) {
        if (!method5350(arg0, arg1, arg2)) {
            return null;
        }
        class332 var3 = new class332();
        var3.field3992 = Statics.field3999;
        var3.field3990 = Statics.field4001;
        var3.field3989 = Statics.field4000[0];
        var3.field3997 = Statics.field279[0];
        var3.field3991 = Statics.field4002[0];
        var3.field3988 = Statics.field285[0];
        int var4 = var3.field3991 * var3.field3988;
        byte[] var5 = Statics.field3853[0];
        var3.field3986 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3986[var6] = Statics.field3998[var5[var6] & 0xFF];
        }
        Statics.field4000 = null;
        Statics.field279 = null;
        Statics.field4002 = null;
        Statics.field285 = null;
        Statics.field3998 = null;
        Statics.field3853 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("ih.b(Ljr;Ljava/lang/String;Ljava/lang/String;I)[Llh;")
    public static class331[] method4242(class262 arg0, String arg1, String arg2) {
        int var3 = arg0.method4306(arg1);
        int var4 = arg0.method4295(var3, arg2);
        return method1055(arg0, var3, var4);
    }

    @ObfuscatedName("ba.z(Ljr;Ljava/lang/String;Ljava/lang/String;B)Llh;")
    public static class331 method1033(class262 arg0, String arg1, String arg2) {
        int var3 = arg0.method4306(arg1);
        int var4 = arg0.method4295(var3, arg2);
        class331 var5;
        if (method5350(arg0, var3, var4)) {
            class331 var6 = new class331();
            var6.field3984 = Statics.field3999;
            var6.field3978 = Statics.field4001;
            var6.field3982 = Statics.field4000[0];
            var6.field3985 = Statics.field279[0];
            var6.field3981 = Statics.field4002[0];
            var6.field3983 = Statics.field285[0];
            var6.field3979 = Statics.field3998;
            var6.field3980 = Statics.field3853[0];
            Statics.field4000 = null;
            Statics.field279 = null;
            Statics.field4002 = null;
            Statics.field285 = null;
            Statics.field3998 = null;
            Statics.field3853 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ag.n(Ljr;Ljava/lang/String;Ljava/lang/String;I)[Llv;")
    public static class332[] method235(class262 arg0, String arg1, String arg2) {
        int var3 = arg0.method4306(arg1);
        int var4 = arg0.method4295(var3, arg2);
        class332[] var5;
        if (method5350(arg0, var3, var4)) {
            class332[] var6 = new class332[Statics.field4003];
            for (int var7 = 0; var7 < Statics.field4003; var7++) {
                class332 var8 = var6[var7] = new class332();
                var8.field3992 = Statics.field3999;
                var8.field3990 = Statics.field4001;
                var8.field3989 = Statics.field4000[var7];
                var8.field3997 = Statics.field279[var7];
                var8.field3991 = Statics.field4002[var7];
                var8.field3988 = Statics.field285[var7];
                int var9 = var8.field3991 * var8.field3988;
                byte[] var10 = Statics.field3853[var7];
                var8.field3986 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field3986[var11] = Statics.field3998[var10[var11] & 0xFF];
                }
            }
            method1902();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("lu.l(Ljr;II)Llh;")
    public static class331 method5340(class262 arg0, int arg1) {
        byte[] var2 = arg0.method4274(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method522(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class331 var4 = new class331();
        var4.field3984 = Statics.field3999;
        var4.field3978 = Statics.field4001;
        var4.field3982 = Statics.field4000[0];
        var4.field3985 = Statics.field279[0];
        var4.field3981 = Statics.field4002[0];
        var4.field3983 = Statics.field285[0];
        var4.field3979 = Statics.field3998;
        var4.field3980 = Statics.field3853[0];
        Statics.field4000 = null;
        Statics.field279 = null;
        Statics.field4002 = null;
        Statics.field285 = null;
        Statics.field3998 = null;
        Statics.field3853 = (byte[][]) null;
        return var4;
    }

    @ObfuscatedName("ki.s(B)[Llh;")
    public static class331[] method5092() {
        class331[] var0 = new class331[Statics.field4003];
        for (int var1 = 0; var1 < Statics.field4003; var1++) {
            class331 var2 = var0[var1] = new class331();
            var2.field3984 = Statics.field3999;
            var2.field3978 = Statics.field4001;
            var2.field3982 = Statics.field4000[var1];
            var2.field3985 = Statics.field279[var1];
            var2.field3981 = Statics.field4002[var1];
            var2.field3983 = Statics.field285[var1];
            var2.field3979 = Statics.field3998;
            var2.field3980 = Statics.field3853[var1];
        }
        Statics.field4000 = null;
        Statics.field279 = null;
        Statics.field4002 = null;
        Statics.field285 = null;
        Statics.field3998 = null;
        Statics.field3853 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("gx.y([BB)Lkh;")
    public static class312 method3539(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class312 var1 = new class312(arg0, Statics.field4000, Statics.field279, Statics.field4002, Statics.field285, Statics.field3998, Statics.field3853);
        Statics.field4000 = null;
        Statics.field279 = null;
        Statics.field4002 = null;
        Statics.field285 = null;
        Statics.field3998 = null;
        Statics.field3853 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("lt.c(Ljr;III)Z")
    public static boolean method5350(class262 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4294(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method522(var3);
            return true;
        }
    }

    @ObfuscatedName("ab.o([BI)V")
    public static void method522(byte[] arg0) {
        class195 var1 = new class195(arg0);
        var1.field2562 = arg0.length - 2;
        Statics.field4003 = var1.method3310();
        Statics.field4000 = new int[Statics.field4003];
        Statics.field279 = new int[Statics.field4003];
        Statics.field4002 = new int[Statics.field4003];
        Statics.field285 = new int[Statics.field4003];
        Statics.field3853 = new byte[Statics.field4003][];
        var1.field2562 = arg0.length - 7 - Statics.field4003 * 8;
        Statics.field3999 = var1.method3310();
        Statics.field4001 = var1.method3310();
        int var2 = (var1.method3332() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field4003; var3++) {
            Statics.field4000[var3] = var1.method3310();
        }
        for (int var4 = 0; var4 < Statics.field4003; var4++) {
            Statics.field279[var4] = var1.method3310();
        }
        for (int var5 = 0; var5 < Statics.field4003; var5++) {
            Statics.field4002[var5] = var1.method3310();
        }
        for (int var6 = 0; var6 < Statics.field4003; var6++) {
            Statics.field285[var6] = var1.method3310();
        }
        var1.field2562 = arg0.length - 7 - Statics.field4003 * 8 - (var2 - 1) * 3;
        Statics.field3998 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3998[var7] = var1.method3312();
            if (Statics.field3998[var7] == 0) {
                Statics.field3998[var7] = 1;
            }
        }
        var1.field2562 = 0;
        for (int var8 = 0; var8 < Statics.field4003; var8++) {
            int var9 = Statics.field4002[var8];
            int var10 = Statics.field285[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3853[var8] = var12;
            int var13 = var1.method3332();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3309();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3309();
                    }
                }
            }
        }
    }

    @ObfuscatedName("co.d(I)V")
    public static void method1902() {
        Statics.field4000 = null;
        Statics.field279 = null;
        Statics.field4002 = null;
        Statics.field285 = null;
        Statics.field3998 = null;
        Statics.field3853 = (byte[][]) null;
    }
}
