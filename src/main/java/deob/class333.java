package deob;

@ObfuscatedName("le")
public class class333 {

    public class333() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.t(Ljc;III)Lla;")
    public static class332 method2(class262 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4265(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method4150(var3);
            var4 = true;
        }
        return var4 ? method1818() : null;
    }

    @ObfuscatedName("dr.q(Ljc;Ljc;III)Lkm;")
    public static class312 method2058(class262 arg0, class262 arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method4265(arg2, arg3);
        boolean var5;
        if (var4 == null) {
            var5 = false;
        } else {
            method4150(var4);
            var5 = true;
        }
        if (!var5) {
            return null;
        }
        byte[] var6 = arg1.method4265(arg2, arg3);
        class312 var7;
        if (var6 == null) {
            var7 = null;
        } else {
            class312 var8 = new class312(var6, Statics.field1361, Statics.field2107, Statics.field3999, Statics.field295, Statics.field3995, Statics.field3955);
            method5171();
            var7 = var8;
        }
        return var7;
    }

    @ObfuscatedName("az.i(Ljc;Ljava/lang/String;Ljava/lang/String;I)[Llk;")
    public static class331[] method291(class262 arg0, String arg1, String arg2) {
        int var3 = arg0.method4210(arg1);
        int var4 = arg0.method4211(var3, arg2);
        byte[] var5 = arg0.method4265(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            method4150(var5);
            var6 = true;
        }
        class331[] var7;
        if (var6) {
            var7 = method4999();
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("en.a(Ljc;Ljava/lang/String;Ljava/lang/String;I)Llk;")
    public static class331 method2825(class262 arg0, String arg1, String arg2) {
        int var3 = arg0.method4210(arg1);
        int var4 = arg0.method4211(var3, arg2);
        byte[] var5 = arg0.method4265(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            method4150(var5);
            var6 = true;
        }
        class331 var7;
        if (var6) {
            var7 = method4983();
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("jb.l(Ljc;Ljava/lang/String;Ljava/lang/String;I)[Lla;")
    public static class332[] method4483(class262 arg0, String arg1, String arg2) {
        int var3 = arg0.method4210(arg1);
        int var4 = arg0.method4211(var3, arg2);
        byte[] var5 = arg0.method4265(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            method4150(var5);
            var6 = true;
        }
        class332[] var7;
        if (var6) {
            var7 = method5051();
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("fz.b(Ljc;Ljc;Ljava/lang/String;Ljava/lang/String;B)Lkm;")
    public static class312 method2939(class262 arg0, class262 arg1, String arg2, String arg3) {
        int var4 = arg0.method4210(arg2);
        int var5 = arg0.method4211(var4, arg3);
        return method2058(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("jl.e(Ljc;II)Llk;")
    public static class331 method4547(class262 arg0, int arg1) {
        if (!method1658(arg0, arg1)) {
            return null;
        }
        class331 var2 = new class331();
        var2.field3981 = Statics.field3996;
        var2.field3982 = Statics.field3997;
        var2.field3979 = Statics.field1361[0];
        var2.field3980 = Statics.field2107[0];
        var2.field3978 = Statics.field3999[0];
        var2.field3977 = Statics.field295[0];
        var2.field3976 = Statics.field3995;
        var2.field3975 = Statics.field3955[0];
        method5171();
        return var2;
    }

    @ObfuscatedName("ke.x(I)[Llk;")
    public static class331[] method4999() {
        class331[] var0 = new class331[Statics.field3998];
        for (int var1 = 0; var1 < Statics.field3998; var1++) {
            class331 var2 = var0[var1] = new class331();
            var2.field3981 = Statics.field3996;
            var2.field3982 = Statics.field3997;
            var2.field3979 = Statics.field1361[var1];
            var2.field3980 = Statics.field2107[var1];
            var2.field3978 = Statics.field3999[var1];
            var2.field3977 = Statics.field295[var1];
            var2.field3976 = Statics.field3995;
            var2.field3975 = Statics.field3955[var1];
        }
        method5171();
        return var0;
    }

    @ObfuscatedName("kt.p(B)Llk;")
    public static class331 method4983() {
        class331 var0 = new class331();
        var0.field3981 = Statics.field3996;
        var0.field3982 = Statics.field3997;
        var0.field3979 = Statics.field1361[0];
        var0.field3980 = Statics.field2107[0];
        var0.field3978 = Statics.field3999[0];
        var0.field3977 = Statics.field295[0];
        var0.field3976 = Statics.field3995;
        var0.field3975 = Statics.field3955[0];
        method5171();
        return var0;
    }

    @ObfuscatedName("kq.o(I)[Lla;")
    public static class332[] method5051() {
        class332[] var0 = new class332[Statics.field3998];
        for (int var1 = 0; var1 < Statics.field3998; var1++) {
            class332 var2 = var0[var1] = new class332();
            var2.field3988 = Statics.field3996;
            var2.field3983 = Statics.field3997;
            var2.field3991 = Statics.field1361[var1];
            var2.field3987 = Statics.field2107[var1];
            var2.field3984 = Statics.field3999[var1];
            var2.field3985 = Statics.field295[var1];
            int var3 = var2.field3985 * var2.field3984;
            byte[] var4 = Statics.field3955[var1];
            var2.field3986 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3986[var5] = Statics.field3995[var4[var5] & 0xFF];
            }
        }
        method5171();
        return var0;
    }

    @ObfuscatedName("ce.c(B)Lla;")
    public static class332 method1818() {
        class332 var0 = new class332();
        var0.field3988 = Statics.field3996;
        var0.field3983 = Statics.field3997;
        var0.field3991 = Statics.field1361[0];
        var0.field3987 = Statics.field2107[0];
        var0.field3984 = Statics.field3999[0];
        var0.field3985 = Statics.field295[0];
        int var1 = var0.field3985 * var0.field3984;
        byte[] var2 = Statics.field3955[0];
        var0.field3986 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3986[var3] = Statics.field3995[var2[var3] & 0xFF];
        }
        method5171();
        return var0;
    }

    @ObfuscatedName("cu.u(Ljc;II)Z")
    public static boolean method1658(class262 arg0, int arg1) {
        byte[] var2 = arg0.method4199(arg1);
        if (var2 == null) {
            return false;
        } else {
            method4150(var2);
            return true;
        }
    }

    @ObfuscatedName("ig.k([BI)V")
    public static void method4150(byte[] arg0) {
        class195 var1 = new class195(arg0);
        var1.field2545 = arg0.length - 2;
        Statics.field3998 = var1.method3238();
        Statics.field1361 = new int[Statics.field3998];
        Statics.field2107 = new int[Statics.field3998];
        Statics.field3999 = new int[Statics.field3998];
        Statics.field295 = new int[Statics.field3998];
        Statics.field3955 = new byte[Statics.field3998][];
        var1.field2545 = arg0.length - 7 - Statics.field3998 * 8;
        Statics.field3996 = var1.method3238();
        Statics.field3997 = var1.method3238();
        int var2 = (var1.method3236() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3998; var3++) {
            Statics.field1361[var3] = var1.method3238();
        }
        for (int var4 = 0; var4 < Statics.field3998; var4++) {
            Statics.field2107[var4] = var1.method3238();
        }
        for (int var5 = 0; var5 < Statics.field3998; var5++) {
            Statics.field3999[var5] = var1.method3238();
        }
        for (int var6 = 0; var6 < Statics.field3998; var6++) {
            Statics.field295[var6] = var1.method3238();
        }
        var1.field2545 = arg0.length - 7 - Statics.field3998 * 8 - (var2 - 1) * 3;
        Statics.field3995 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3995[var7] = var1.method3399();
            if (Statics.field3995[var7] == 0) {
                Statics.field3995[var7] = 1;
            }
        }
        var1.field2545 = 0;
        for (int var8 = 0; var8 < Statics.field3998; var8++) {
            int var9 = Statics.field3999[var8];
            int var10 = Statics.field295[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3955[var8] = var12;
            int var13 = var1.method3236();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3237();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3237();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ly.z(S)V")
    public static void method5171() {
        Statics.field1361 = null;
        Statics.field2107 = null;
        Statics.field3999 = null;
        Statics.field295 = null;
        Statics.field3995 = null;
        Statics.field3955 = (byte[][]) null;
    }
}
