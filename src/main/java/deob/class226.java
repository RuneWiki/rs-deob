package deob;

@ObfuscatedName("he")
public class class226 {

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.b(Lgj;III)[Lhq;")
    public static class225[] method200(class183 arg0, int arg1, int arg2) {
        return method3262(arg0, arg1, arg2) ? method877() : null;
    }

    @ObfuscatedName("gi.l(Lgj;III)Lhq;")
    public static class225 method3607(class183 arg0, int arg1, int arg2) {
        return method3262(arg0, arg1, arg2) ? method255() : null;
    }

    @ObfuscatedName("fj.i(Lgj;Ljava/lang/String;Ljava/lang/String;I)[Lhu;")
    public static class223[] method3029(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3165(arg1);
        int var4 = arg0.method3209(var3, arg2);
        class223[] var5;
        if (method3262(arg0, var3, var4)) {
            var5 = method768();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ar.t(Lgj;Ljava/lang/String;Ljava/lang/String;I)Lhu;")
    public static class223 method837(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3165(arg1);
        int var4 = arg0.method3209(var3, arg2);
        class223 var5;
        if (method3262(arg0, var3, var4)) {
            class223 var6 = new class223();
            var6.field3204 = Statics.field3229;
            var6.field3210 = Statics.field3228;
            var6.field3207 = Statics.field3230[0];
            var6.field3208 = Statics.field2106[0];
            var6.field3205 = Statics.field2352[0];
            var6.field3203 = Statics.field3231[0];
            var6.field3206 = Statics.field3232;
            var6.field3209 = Statics.field3233[0];
            method14();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("eo.k(Lgj;Ljava/lang/String;Ljava/lang/String;I)[Lhq;")
    public static class225[] method2645(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3165(arg1);
        int var4 = arg0.method3209(var3, arg2);
        return method200(arg0, var3, var4);
    }

    @ObfuscatedName("gy.x(Lgj;II)Lhu;")
    public static class223 method3595(class183 arg0, int arg1) {
        if (!method218(arg0, arg1)) {
            return null;
        }
        class223 var2 = new class223();
        var2.field3204 = Statics.field3229;
        var2.field3210 = Statics.field3228;
        var2.field3207 = Statics.field3230[0];
        var2.field3208 = Statics.field2106[0];
        var2.field3205 = Statics.field2352[0];
        var2.field3203 = Statics.field3231[0];
        var2.field3206 = Statics.field3232;
        var2.field3209 = Statics.field3233[0];
        method14();
        return var2;
    }

    @ObfuscatedName("au.z(I)[Lhu;")
    public static class223[] method768() {
        class223[] var0 = new class223[Statics.field3227];
        for (int var1 = 0; var1 < Statics.field3227; var1++) {
            class223 var2 = var0[var1] = new class223();
            var2.field3204 = Statics.field3229;
            var2.field3210 = Statics.field3228;
            var2.field3207 = Statics.field3230[var1];
            var2.field3208 = Statics.field2106[var1];
            var2.field3205 = Statics.field2352[var1];
            var2.field3203 = Statics.field3231[var1];
            var2.field3206 = Statics.field3232;
            var2.field3209 = Statics.field3233[var1];
        }
        method14();
        return var0;
    }

    @ObfuscatedName("ah.p(I)[Lhq;")
    public static class225[] method877() {
        class225[] var0 = new class225[Statics.field3227];
        for (int var1 = 0; var1 < Statics.field3227; var1++) {
            class225 var2 = var0[var1] = new class225();
            var2.field3220 = Statics.field3229;
            var2.field3221 = Statics.field3228;
            var2.field3218 = Statics.field3230[var1];
            var2.field3225 = Statics.field2106[var1];
            var2.field3216 = Statics.field2352[var1];
            var2.field3217 = Statics.field3231[var1];
            int var3 = var2.field3217 * var2.field3216;
            byte[] var4 = Statics.field3233[var1];
            var2.field3222 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3222[var5] = Statics.field3232[var4[var5] & 0xFF];
            }
        }
        method14();
        return var0;
    }

    @ObfuscatedName("j.s(S)Lhq;")
    public static class225 method255() {
        class225 var0 = new class225();
        var0.field3220 = Statics.field3229;
        var0.field3221 = Statics.field3228;
        var0.field3218 = Statics.field3230[0];
        var0.field3225 = Statics.field2106[0];
        var0.field3216 = Statics.field2352[0];
        var0.field3217 = Statics.field3231[0];
        int var1 = var0.field3217 * var0.field3216;
        byte[] var2 = Statics.field3233[0];
        var0.field3222 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3222[var3] = Statics.field3232[var2[var3] & 0xFF];
        }
        method14();
        return var0;
    }

    @ObfuscatedName("bz.o([BI)Lhm;")
    public static class209 method1411(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class209 var1 = new class209(arg0, Statics.field3230, Statics.field2106, Statics.field2352, Statics.field3231, Statics.field3232, Statics.field3233);
            method14();
            return var1;
        }
    }

    @ObfuscatedName("gd.y(Lgj;III)Z")
    public static boolean method3262(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3226(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method96(var3);
            return true;
        }
    }

    @ObfuscatedName("v.w(Lgj;II)Z")
    public static boolean method218(class183 arg0, int arg1) {
        byte[] var2 = arg0.method3155(arg1);
        if (var2 == null) {
            return false;
        } else {
            method96(var2);
            return true;
        }
    }

    @ObfuscatedName("n.m([BS)V")
    public static void method96(byte[] arg0) {
        class154 var1 = new class154(arg0);
        var1.field2085 = arg0.length - 2;
        Statics.field3227 = var1.method2801();
        Statics.field3230 = new int[Statics.field3227];
        Statics.field2106 = new int[Statics.field3227];
        Statics.field2352 = new int[Statics.field3227];
        Statics.field3231 = new int[Statics.field3227];
        Statics.field3233 = new byte[Statics.field3227][];
        var1.field2085 = arg0.length - 7 - Statics.field3227 * 8;
        Statics.field3229 = var1.method2801();
        Statics.field3228 = var1.method2801();
        int var2 = (var1.method2678() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3227; var3++) {
            Statics.field3230[var3] = var1.method2801();
        }
        for (int var4 = 0; var4 < Statics.field3227; var4++) {
            Statics.field2106[var4] = var1.method2801();
        }
        for (int var5 = 0; var5 < Statics.field3227; var5++) {
            Statics.field2352[var5] = var1.method2801();
        }
        for (int var6 = 0; var6 < Statics.field3227; var6++) {
            Statics.field3231[var6] = var1.method2801();
        }
        var1.field2085 = arg0.length - 7 - Statics.field3227 * 8 - (var2 - 1) * 3;
        Statics.field3232 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3232[var7] = var1.method2682();
            if (Statics.field3232[var7] == 0) {
                Statics.field3232[var7] = 1;
            }
        }
        var1.field2085 = 0;
        for (int var8 = 0; var8 < Statics.field3227; var8++) {
            int var9 = Statics.field2352[var8];
            int var10 = Statics.field3231[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3233[var8] = var12;
            int var13 = var1.method2678();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2679();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2679();
                    }
                }
            }
        }
    }

    @ObfuscatedName("b.u(B)V")
    public static void method14() {
        Statics.field3230 = null;
        Statics.field2106 = null;
        Statics.field2352 = null;
        Statics.field3231 = null;
        Statics.field3232 = null;
        Statics.field3233 = (byte[][]) null;
    }
}
