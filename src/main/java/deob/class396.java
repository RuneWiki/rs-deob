package deob;

@ObfuscatedName("os")
public class class396 {

    public class396() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kg.f(Lir;III)[Low;")
    public static class394[] method5022(class253 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3933(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3866(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class394[] var5 = new class394[Statics.field1456];
        for (int var6 = 0; var6 < Statics.field1456; var6++) {
            class394 var7 = var5[var6] = new class394();
            var7.field4240 = Statics.field4254;
            var7.field4235 = Statics.field4255;
            var7.field4237 = Statics.field2[var6];
            var7.field4234 = Statics.field946[var6];
            var7.field4236 = Statics.field4256[var6];
            var7.field4239 = Statics.field1739[var6];
            var7.field4238 = Statics.field2584;
            var7.field4241 = Statics.field2614[var6];
        }
        method3841();
        return var5;
    }

    @ObfuscatedName("lr.o(Lir;III)[Loh;")
    public static class395[] method5314(class253 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3933(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3866(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class395[] var5 = new class395[Statics.field1456];
        for (int var6 = 0; var6 < Statics.field1456; var6++) {
            class395 var7 = var5[var6] = new class395();
            var7.field4251 = Statics.field4254;
            var7.field4248 = Statics.field4255;
            var7.field4250 = Statics.field2[var6];
            var7.field4246 = Statics.field946[var6];
            var7.field4245 = Statics.field4256[var6];
            var7.field4244 = Statics.field1739[var6];
            int var8 = var7.field4245 * var7.field4244;
            byte[] var9 = Statics.field2614[var6];
            var7.field4247 = new int[var8];
            for (int var10 = 0; var10 < var8; var10++) {
                var7.field4247[var10] = Statics.field2584[var9[var10] & 0xFF];
            }
        }
        method3841();
        return var5;
    }

    @ObfuscatedName("gk.u(Lir;III)Loh;")
    public static class395 method3341(class253 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3933(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3866(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class395 var5 = new class395();
        var5.field4251 = Statics.field4254;
        var5.field4248 = Statics.field4255;
        var5.field4250 = Statics.field2[0];
        var5.field4246 = Statics.field946[0];
        var5.field4245 = Statics.field4256[0];
        var5.field4244 = Statics.field1739[0];
        int var6 = var5.field4245 * var5.field4244;
        byte[] var7 = Statics.field2614[0];
        var5.field4247 = new int[var6];
        for (int var8 = 0; var8 < var6; var8++) {
            var5.field4247[var8] = Statics.field2584[var7[var8] & 0xFF];
        }
        method3841();
        return var5;
    }

    @ObfuscatedName("ii.p(Lir;Lir;III)Lkq;")
    public static class299 method3848(class253 arg0, class253 arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method3933(arg2, arg3);
        boolean var5;
        if (var4 == null) {
            var5 = false;
        } else {
            method3866(var4);
            var5 = true;
        }
        if (!var5) {
            return null;
        }
        byte[] var6 = arg1.method3933(arg2, arg3);
        class299 var7;
        if (var6 == null) {
            var7 = null;
        } else {
            class299 var8 = new class299(var6, Statics.field2, Statics.field946, Statics.field4256, Statics.field1739, Statics.field2584, Statics.field2614);
            method3841();
            var7 = var8;
        }
        return var7;
    }

    @ObfuscatedName("dq.b(Lir;Ljava/lang/String;Ljava/lang/String;I)[Low;")
    public static class394[] method1998(class253 arg0, String arg1, String arg2) {
        int var3 = arg0.method3950(arg1);
        int var4 = arg0.method3951(var3, arg2);
        return method5022(arg0, var3, var4);
    }

    @ObfuscatedName("ff.e(Lir;Ljava/lang/String;Ljava/lang/String;I)Low;")
    public static class394 method2753(class253 arg0, String arg1, String arg2) {
        int var3 = arg0.method3950(arg1);
        int var4 = arg0.method3951(var3, arg2);
        byte[] var5 = arg0.method3933(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            method3866(var5);
            var6 = true;
        }
        class394 var7;
        if (var6) {
            var7 = method1811();
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("df.k(Lir;Ljava/lang/String;Ljava/lang/String;I)[Loh;")
    public static class395[] method2206(class253 arg0, String arg1, String arg2) {
        int var3 = arg0.method3950(arg1);
        int var4 = arg0.method3951(var3, arg2);
        return method5314(arg0, var3, var4);
    }

    @ObfuscatedName("lb.g(Lir;Lir;Ljava/lang/String;Ljava/lang/String;I)Lkq;")
    public static class299 method5055(class253 arg0, class253 arg1, String arg2, String arg3) {
        int var4 = arg0.method3950(arg2);
        int var5 = arg0.method3951(var4, arg3);
        return method3848(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("ge.h(Lir;II)Low;")
    public static class394 method3339(class253 arg0, int arg1) {
        byte[] var2 = arg0.method3939(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method3866(var2);
            var3 = true;
        }
        return var3 ? method1811() : null;
    }

    @ObfuscatedName("ck.n(I)Low;")
    public static class394 method1811() {
        class394 var0 = new class394();
        var0.field4240 = Statics.field4254;
        var0.field4235 = Statics.field4255;
        var0.field4237 = Statics.field2[0];
        var0.field4234 = Statics.field946[0];
        var0.field4236 = Statics.field4256[0];
        var0.field4239 = Statics.field1739[0];
        var0.field4238 = Statics.field2584;
        var0.field4241 = Statics.field2614[0];
        method3841();
        return var0;
    }

    @ObfuscatedName("iq.l([BB)V")
    public static void method3866(byte[] arg0) {
        class382 var1 = new class382(arg0);
        var1.field4155 = arg0.length - 2;
        Statics.field1456 = var1.method5858();
        Statics.field2 = new int[Statics.field1456];
        Statics.field946 = new int[Statics.field1456];
        Statics.field4256 = new int[Statics.field1456];
        Statics.field1739 = new int[Statics.field1456];
        Statics.field2614 = new byte[Statics.field1456][];
        var1.field4155 = arg0.length - 7 - Statics.field1456 * 8;
        Statics.field4254 = var1.method5858();
        Statics.field4255 = var1.method5858();
        int var2 = (var1.method5856() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1456; var3++) {
            Statics.field2[var3] = var1.method5858();
        }
        for (int var4 = 0; var4 < Statics.field1456; var4++) {
            Statics.field946[var4] = var1.method5858();
        }
        for (int var5 = 0; var5 < Statics.field1456; var5++) {
            Statics.field4256[var5] = var1.method5858();
        }
        for (int var6 = 0; var6 < Statics.field1456; var6++) {
            Statics.field1739[var6] = var1.method5858();
        }
        var1.field4155 = arg0.length - 7 - Statics.field1456 * 8 - (var2 - 1) * 3;
        Statics.field2584 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field2584[var7] = var1.method5875();
            if (Statics.field2584[var7] == 0) {
                Statics.field2584[var7] = 1;
            }
        }
        var1.field4155 = 0;
        for (int var8 = 0; var8 < Statics.field1456; var8++) {
            int var9 = Statics.field4256[var8];
            int var10 = Statics.field1739[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2614[var8] = var12;
            int var13 = var1.method5856();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method6045();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method6045();
                    }
                }
            }
        }
    }

    @ObfuscatedName("hl.m(B)V")
    public static void method3841() {
        Statics.field2 = null;
        Statics.field946 = null;
        Statics.field4256 = null;
        Statics.field1739 = null;
        Statics.field2584 = null;
        Statics.field2614 = (byte[][]) null;
    }
}
