package deob;

@ObfuscatedName("ou")
public class class415 {

    public class415() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dq.i(Lko;IIB)[Loe;")
    public static class413[] method2343(class290 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4743(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method1890(var3);
            var4 = true;
        }
        return var4 ? method3565() : null;
    }

    @ObfuscatedName("m.w(Lko;III)[Low;")
    public static class414[] method304(class290 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4743(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method1890(var3);
            var4 = true;
        }
        return var4 ? method4669() : null;
    }

    @ObfuscatedName("gn.s(Lko;III)Low;")
    public static class414 method3531(class290 arg0, int arg1, int arg2) {
        return method2367(arg0, arg1, arg2) ? method3655() : null;
    }

    @ObfuscatedName("on.a(Lko;Ljava/lang/String;Ljava/lang/String;I)[Loe;")
    public static class413[] method6158(class290 arg0, String arg1, String arg2) {
        int var3 = arg0.method4759(arg1);
        int var4 = arg0.method4760(var3, arg2);
        return method2343(arg0, var3, var4);
    }

    @ObfuscatedName("bp.o(Lko;Ljava/lang/String;Ljava/lang/String;I)Loe;")
    public static class413 method1882(class290 arg0, String arg1, String arg2) {
        int var3 = arg0.method4759(arg1);
        int var4 = arg0.method4760(var3, arg2);
        byte[] var5 = arg0.method4743(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            method1890(var5);
            var6 = true;
        }
        class413 var7;
        if (var6) {
            class413 var8 = new class413();
            var8.field4391 = Statics.field4408;
            var8.field4392 = Statics.field4406;
            var8.field4389 = Statics.field4409[0];
            var8.field4390 = Statics.field4405[0];
            var8.field4387 = Statics.field1287[0];
            var8.field4388 = Statics.field4410[0];
            var8.field4385 = Statics.field1807;
            var8.field4386 = Statics.field3743[0];
            method6187();
            var7 = var8;
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("ox.g(Lko;Lko;Ljava/lang/String;Ljava/lang/String;I)Lle;")
    public static class315 method6504(class290 arg0, class290 arg1, String arg2, String arg3) {
        int var4 = arg0.method4759(arg2);
        int var5 = arg0.method4760(var4, arg3);
        class315 var6;
        if (method2367(arg0, var4, var5)) {
            byte[] var7 = arg1.method4743(var4, var5);
            class315 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class315 var9 = new class315(var7, Statics.field4409, Statics.field4405, Statics.field1287, Statics.field4410, Statics.field1807, Statics.field3743);
                method6187();
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("ew.e(Lko;II)Loe;")
    public static class413 method2588(class290 arg0, int arg1) {
        byte[] var2 = arg0.method4749(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method1890(var2);
            var3 = true;
        }
        return var3 ? method3334() : null;
    }

    @ObfuscatedName("gl.p(B)[Loe;")
    public static class413[] method3565() {
        class413[] var0 = new class413[Statics.field4407];
        for (int var1 = 0; var1 < Statics.field4407; var1++) {
            class413 var2 = var0[var1] = new class413();
            var2.field4391 = Statics.field4408;
            var2.field4392 = Statics.field4406;
            var2.field4389 = Statics.field4409[var1];
            var2.field4390 = Statics.field4405[var1];
            var2.field4387 = Statics.field1287[var1];
            var2.field4388 = Statics.field4410[var1];
            var2.field4385 = Statics.field1807;
            var2.field4386 = Statics.field3743[var1];
        }
        method6187();
        return var0;
    }

    @ObfuscatedName("fb.j(S)Loe;")
    public static class413 method3334() {
        class413 var0 = new class413();
        var0.field4391 = Statics.field4408;
        var0.field4392 = Statics.field4406;
        var0.field4389 = Statics.field4409[0];
        var0.field4390 = Statics.field4405[0];
        var0.field4387 = Statics.field1287[0];
        var0.field4388 = Statics.field4410[0];
        var0.field4385 = Statics.field1807;
        var0.field4386 = Statics.field3743[0];
        method6187();
        return var0;
    }

    @ObfuscatedName("ju.b(I)[Low;")
    public static class414[] method4669() {
        class414[] var0 = new class414[Statics.field4407];
        for (int var1 = 0; var1 < Statics.field4407; var1++) {
            class414 var2 = var0[var1] = new class414();
            var2.field4397 = Statics.field4408;
            var2.field4399 = Statics.field4406;
            var2.field4400 = Statics.field4409[var1];
            var2.field4402 = Statics.field4405[var1];
            var2.field4394 = Statics.field1287[var1];
            var2.field4395 = Statics.field4410[var1];
            int var3 = var2.field4395 * var2.field4394;
            byte[] var4 = Statics.field3743[var1];
            var2.field4396 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field4396[var5] = Statics.field1807[var4[var5] & 0xFF];
            }
        }
        method6187();
        return var0;
    }

    @ObfuscatedName("gy.x(B)Low;")
    public static class414 method3655() {
        class414 var0 = new class414();
        var0.field4397 = Statics.field4408;
        var0.field4399 = Statics.field4406;
        var0.field4400 = Statics.field4409[0];
        var0.field4402 = Statics.field4405[0];
        var0.field4394 = Statics.field1287[0];
        var0.field4395 = Statics.field4410[0];
        int var1 = var0.field4395 * var0.field4394;
        byte[] var2 = Statics.field3743[0];
        var0.field4396 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field4396[var3] = Statics.field1807[var2[var3] & 0xFF];
        }
        method6187();
        return var0;
    }

    @ObfuscatedName("dn.y(Lko;III)Z")
    public static boolean method2367(class290 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4743(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method1890(var3);
            return true;
        }
    }

    @ObfuscatedName("bp.k([BI)V")
    public static void method1890(byte[] arg0) {
        class401 var1 = new class401(arg0);
        var1.field4300 = arg0.length - 2;
        Statics.field4407 = var1.method6242();
        Statics.field4409 = new int[Statics.field4407];
        Statics.field4405 = new int[Statics.field4407];
        Statics.field1287 = new int[Statics.field4407];
        Statics.field4410 = new int[Statics.field4407];
        Statics.field3743 = new byte[Statics.field4407][];
        var1.field4300 = arg0.length - 7 - Statics.field4407 * 8;
        Statics.field4408 = var1.method6242();
        Statics.field4406 = var1.method6242();
        int var2 = (var1.method6240() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field4407; var3++) {
            Statics.field4409[var3] = var1.method6242();
        }
        for (int var4 = 0; var4 < Statics.field4407; var4++) {
            Statics.field4405[var4] = var1.method6242();
        }
        for (int var5 = 0; var5 < Statics.field4407; var5++) {
            Statics.field1287[var5] = var1.method6242();
        }
        for (int var6 = 0; var6 < Statics.field4407; var6++) {
            Statics.field4410[var6] = var1.method6242();
        }
        var1.field4300 = arg0.length - 7 - Statics.field4407 * 8 - (var2 - 1) * 3;
        Statics.field1807 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1807[var7] = var1.method6432();
            if (Statics.field1807[var7] == 0) {
                Statics.field1807[var7] = 1;
            }
        }
        var1.field4300 = 0;
        for (int var8 = 0; var8 < Statics.field4407; var8++) {
            int var9 = Statics.field1287[var8];
            int var10 = Statics.field4410[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3743[var8] = var12;
            int var13 = var1.method6240();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method6241();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method6241();
                    }
                }
            }
        }
    }

    @ObfuscatedName("oj.t(I)V")
    public static void method6187() {
        Statics.field4409 = null;
        Statics.field4405 = null;
        Statics.field1287 = null;
        Statics.field4410 = null;
        Statics.field1807 = null;
        Statics.field3743 = (byte[][]) null;
    }
}
