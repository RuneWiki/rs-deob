package deob;

@ObfuscatedName("li")
public class class333 {

    public class333() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ah.d(Ljk;IIS)Lly;")
    public static class332 method560(class262 arg0, int arg1, int arg2) {
        return method3515(arg0, arg1, arg2) ? method586() : null;
    }

    @ObfuscatedName("ey.z(Ljk;Ljk;III)Lkw;")
    public static class312 method2893(class262 arg0, class262 arg1, int arg2, int arg3) {
        return method3515(arg0, arg2, arg3) ? method5118(arg1.method4273(arg2, arg3)) : null;
    }

    @ObfuscatedName("io.n(Ljk;Ljava/lang/String;Ljava/lang/String;I)[Llv;")
    public static class331[] method4253(class262 arg0, String arg1, String arg2) {
        int var3 = arg0.method4290(arg1);
        int var4 = arg0.method4292(var3, arg2);
        class331[] var5;
        if (method3515(arg0, var3, var4)) {
            var5 = method4091();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("co.r(Ljk;Ljava/lang/String;Ljava/lang/String;I)Llv;")
    public static class331 method1704(class262 arg0, String arg1, String arg2) {
        int var3 = arg0.method4290(arg1);
        int var4 = arg0.method4292(var3, arg2);
        class331 var5;
        if (method3515(arg0, var3, var4)) {
            var5 = method131();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("as.e(Ljk;Ljava/lang/String;Ljava/lang/String;I)[Lly;")
    public static class332[] method250(class262 arg0, String arg1, String arg2) {
        int var3 = arg0.method4290(arg1);
        int var4 = arg0.method4292(var3, arg2);
        class332[] var5;
        if (method3515(arg0, var3, var4)) {
            var5 = method4490();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ju.y(Ljk;IB)Llv;")
    public static class331 method4519(class262 arg0, int arg1) {
        return Statics.method1712(arg0, arg1) ? method131() : null;
    }

    @ObfuscatedName("id.k(I)[Llv;")
    public static class331[] method4091() {
        class331[] var0 = new class331[Statics.field326];
        for (int var1 = 0; var1 < Statics.field326; var1++) {
            class331 var2 = var0[var1] = new class331();
            var2.field3977 = Statics.field3996;
            var2.field3978 = Statics.field3992;
            var2.field3975 = Statics.field3991[var1];
            var2.field3973 = Statics.field3994[var1];
            var2.field3976 = Statics.field3540[var1];
            var2.field3974 = Statics.field243[var1];
            var2.field3972 = Statics.field3995;
            var2.field3971 = Statics.field3993[var1];
        }
        method2949();
        return var0;
    }

    @ObfuscatedName("c.s(I)Llv;")
    public static class331 method131() {
        class331 var0 = new class331();
        var0.field3977 = Statics.field3996;
        var0.field3978 = Statics.field3992;
        var0.field3975 = Statics.field3991[0];
        var0.field3973 = Statics.field3994[0];
        var0.field3976 = Statics.field3540[0];
        var0.field3974 = Statics.field243[0];
        var0.field3972 = Statics.field3995;
        var0.field3971 = Statics.field3993[0];
        method2949();
        return var0;
    }

    @ObfuscatedName("jw.x(B)[Lly;")
    public static class332[] method4490() {
        class332[] var0 = new class332[Statics.field326];
        for (int var1 = 0; var1 < Statics.field326; var1++) {
            class332 var2 = var0[var1] = new class332();
            var2.field3979 = Statics.field3996;
            var2.field3985 = Statics.field3992;
            var2.field3982 = Statics.field3991[var1];
            var2.field3984 = Statics.field3994[var1];
            var2.field3981 = Statics.field3540[var1];
            var2.field3988 = Statics.field243[var1];
            int var3 = var2.field3988 * var2.field3981;
            byte[] var4 = Statics.field3993[var1];
            var2.field3983 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3983[var5] = Statics.field3995[var4[var5] & 0xFF];
            }
        }
        method2949();
        return var0;
    }

    @ObfuscatedName("ab.h(I)Lly;")
    public static class332 method586() {
        class332 var0 = new class332();
        var0.field3979 = Statics.field3996;
        var0.field3985 = Statics.field3992;
        var0.field3982 = Statics.field3991[0];
        var0.field3984 = Statics.field3994[0];
        var0.field3981 = Statics.field3540[0];
        var0.field3988 = Statics.field243[0];
        int var1 = var0.field3988 * var0.field3981;
        byte[] var2 = Statics.field3993[0];
        var0.field3983 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3983[var3] = Statics.field3995[var2[var3] & 0xFF];
        }
        method2949();
        return var0;
    }

    @ObfuscatedName("ke.t([BI)Lkw;")
    public static class312 method5118(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class312 var1 = new class312(arg0, Statics.field3991, Statics.field3994, Statics.field3540, Statics.field243, Statics.field3995, Statics.field3993);
            method2949();
            return var1;
        }
    }

    @ObfuscatedName("gg.i(Ljk;III)Z")
    public static boolean method3515(class262 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4273(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method5143(var3);
            return true;
        }
    }

    @ObfuscatedName("kr.q([BI)V")
    public static void method5143(byte[] arg0) {
        class195 var1 = new class195(arg0);
        var1.field2568 = arg0.length - 2;
        Statics.field326 = var1.method3269();
        Statics.field3991 = new int[Statics.field326];
        Statics.field3994 = new int[Statics.field326];
        Statics.field3540 = new int[Statics.field326];
        Statics.field243 = new int[Statics.field326];
        Statics.field3993 = new byte[Statics.field326][];
        var1.field2568 = arg0.length - 7 - Statics.field326 * 8;
        Statics.field3996 = var1.method3269();
        Statics.field3992 = var1.method3269();
        int var2 = (var1.method3330() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field326; var3++) {
            Statics.field3991[var3] = var1.method3269();
        }
        for (int var4 = 0; var4 < Statics.field326; var4++) {
            Statics.field3994[var4] = var1.method3269();
        }
        for (int var5 = 0; var5 < Statics.field326; var5++) {
            Statics.field3540[var5] = var1.method3269();
        }
        for (int var6 = 0; var6 < Statics.field326; var6++) {
            Statics.field243[var6] = var1.method3269();
        }
        var1.field2568 = arg0.length - 7 - Statics.field326 * 8 - (var2 - 1) * 3;
        Statics.field3995 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3995[var7] = var1.method3263();
            if (Statics.field3995[var7] == 0) {
                Statics.field3995[var7] = 1;
            }
        }
        var1.field2568 = 0;
        for (int var8 = 0; var8 < Statics.field326; var8++) {
            int var9 = Statics.field3540[var8];
            int var10 = Statics.field243[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3993[var8] = var12;
            int var13 = var1.method3330();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3421();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3421();
                    }
                }
            }
        }
    }

    @ObfuscatedName("er.v(I)V")
    public static void method2949() {
        Statics.field3991 = null;
        Statics.field3994 = null;
        Statics.field3540 = null;
        Statics.field243 = null;
        Statics.field3995 = null;
        Statics.field3993 = (byte[][]) null;
    }
}
