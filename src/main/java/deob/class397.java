package deob;

@ObfuscatedName("ox")
public class class397 {

    public class397() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("em.v(Ljv;III)[Lop;")
    public static class395[] method2558(class275 arg0, int arg1, int arg2) {
        return method5454(arg0, arg1, arg2) ? method182() : null;
    }

    @ObfuscatedName("im.n(Ljv;III)Lop;")
    public static class395 method4376(class275 arg0, int arg1, int arg2) {
        if (!method5454(arg0, arg1, arg2)) {
            return null;
        }
        class395 var3 = new class395();
        var3.field4242 = Statics.field4257;
        var3.field4239 = Statics.field4216;
        var3.field4240 = Statics.field2087[0];
        var3.field4241 = Statics.field3126[0];
        var3.field4243 = Statics.field4259[0];
        var3.field4237 = Statics.field3742[0];
        var3.field4236 = Statics.field1523;
        var3.field4238 = Statics.field4260[0];
        method2359();
        return var3;
    }

    @ObfuscatedName("eq.f(Ljv;III)[Loh;")
    public static class396[] method2846(class275 arg0, int arg1, int arg2) {
        return method5454(arg0, arg1, arg2) ? method2504() : null;
    }

    @ObfuscatedName("hs.y(Ljv;IIB)Loh;")
    public static class396 method3963(class275 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4468(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3399(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class396 var5 = new class396();
        var5.field4246 = Statics.field4257;
        var5.field4250 = Statics.field4216;
        var5.field4249 = Statics.field2087[0];
        var5.field4248 = Statics.field3126[0];
        var5.field4253 = Statics.field4259[0];
        var5.field4245 = Statics.field3742[0];
        int var6 = var5.field4253 * var5.field4245;
        byte[] var7 = Statics.field4260[0];
        var5.field4247 = new int[var6];
        for (int var8 = 0; var8 < var6; var8++) {
            var5.field4247[var8] = Statics.field1523[var7[var8] & 0xFF];
        }
        method2359();
        return var5;
    }

    @ObfuscatedName("jv.p(Ljv;Ljv;IIB)Lkt;")
    public static class300 method4562(class275 arg0, class275 arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method4468(arg2, arg3);
        boolean var5;
        if (var4 == null) {
            var5 = false;
        } else {
            method3399(var4);
            var5 = true;
        }
        if (!var5) {
            return null;
        }
        byte[] var6 = arg1.method4468(arg2, arg3);
        class300 var7;
        if (var6 == null) {
            var7 = null;
        } else {
            class300 var8 = new class300(var6, Statics.field2087, Statics.field3126, Statics.field4259, Statics.field3742, Statics.field1523, Statics.field4260);
            method2359();
            var7 = var8;
        }
        return var7;
    }

    @ObfuscatedName("er.j(Ljv;Ljava/lang/String;Ljava/lang/String;I)Lop;")
    public static class395 method2521(class275 arg0, String arg1, String arg2) {
        int var3 = arg0.method4484(arg1);
        int var4 = arg0.method4485(var3, arg2);
        return method4376(arg0, var3, var4);
    }

    @ObfuscatedName("nu.r(Ljv;Ljava/lang/String;Ljava/lang/String;B)[Loh;")
    public static class396[] method5866(class275 arg0, String arg1, String arg2) {
        int var3 = arg0.method4484(arg1);
        int var4 = arg0.method4485(var3, arg2);
        return method2846(arg0, var3, var4);
    }

    @ObfuscatedName("ls.b(Ljv;Ljv;Ljava/lang/String;Ljava/lang/String;B)Lkt;")
    public static class300 method5364(class275 arg0, class275 arg1, String arg2, String arg3) {
        int var4 = arg0.method4484(arg2);
        int var5 = arg0.method4485(var4, arg3);
        return method4562(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("ak.d(Ljv;IS)Lop;")
    public static class395 method548(class275 arg0, int arg1) {
        if (!method914(arg0, arg1)) {
            return null;
        }
        class395 var2 = new class395();
        var2.field4242 = Statics.field4257;
        var2.field4239 = Statics.field4216;
        var2.field4240 = Statics.field2087[0];
        var2.field4241 = Statics.field3126[0];
        var2.field4243 = Statics.field4259[0];
        var2.field4237 = Statics.field3742[0];
        var2.field4236 = Statics.field1523;
        var2.field4238 = Statics.field4260[0];
        method2359();
        return var2;
    }

    @ObfuscatedName("q.s(S)[Lop;")
    public static class395[] method182() {
        class395[] var0 = new class395[Statics.field4258];
        for (int var1 = 0; var1 < Statics.field4258; var1++) {
            class395 var2 = var0[var1] = new class395();
            var2.field4242 = Statics.field4257;
            var2.field4239 = Statics.field4216;
            var2.field4240 = Statics.field2087[var1];
            var2.field4241 = Statics.field3126[var1];
            var2.field4243 = Statics.field4259[var1];
            var2.field4237 = Statics.field3742[var1];
            var2.field4236 = Statics.field1523;
            var2.field4238 = Statics.field4260[var1];
        }
        method2359();
        return var0;
    }

    @ObfuscatedName("eb.u(B)[Loh;")
    public static class396[] method2504() {
        class396[] var0 = new class396[Statics.field4258];
        for (int var1 = 0; var1 < Statics.field4258; var1++) {
            class396 var2 = var0[var1] = new class396();
            var2.field4246 = Statics.field4257;
            var2.field4250 = Statics.field4216;
            var2.field4249 = Statics.field2087[var1];
            var2.field4248 = Statics.field3126[var1];
            var2.field4253 = Statics.field4259[var1];
            var2.field4245 = Statics.field3742[var1];
            int var3 = var2.field4253 * var2.field4245;
            byte[] var4 = Statics.field4260[var1];
            var2.field4247 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field4247[var5] = Statics.field1523[var4[var5] & 0xFF];
            }
        }
        method2359();
        return var0;
    }

    @ObfuscatedName("ms.l(Ljv;IIB)Z")
    public static boolean method5454(class275 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4468(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3399(var3);
            return true;
        }
    }

    @ObfuscatedName("be.o(Ljv;II)Z")
    public static boolean method914(class275 arg0, int arg1) {
        byte[] var2 = arg0.method4474(arg1);
        if (var2 == null) {
            return false;
        } else {
            method3399(var2);
            return true;
        }
    }

    @ObfuscatedName("gv.c([BB)V")
    public static void method3399(byte[] arg0) {
        class383 var1 = new class383(arg0);
        var1.field4158 = arg0.length - 2;
        Statics.field4258 = var1.method5967();
        Statics.field2087 = new int[Statics.field4258];
        Statics.field3126 = new int[Statics.field4258];
        Statics.field4259 = new int[Statics.field4258];
        Statics.field3742 = new int[Statics.field4258];
        Statics.field4260 = new byte[Statics.field4258][];
        var1.field4158 = arg0.length - 7 - Statics.field4258 * 8;
        Statics.field4257 = var1.method5967();
        Statics.field4216 = var1.method5967();
        int var2 = (var1.method5965() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field4258; var3++) {
            Statics.field2087[var3] = var1.method5967();
        }
        for (int var4 = 0; var4 < Statics.field4258; var4++) {
            Statics.field3126[var4] = var1.method5967();
        }
        for (int var5 = 0; var5 < Statics.field4258; var5++) {
            Statics.field4259[var5] = var1.method5967();
        }
        for (int var6 = 0; var6 < Statics.field4258; var6++) {
            Statics.field3742[var6] = var1.method5967();
        }
        var1.field4158 = arg0.length - 7 - Statics.field4258 * 8 - (var2 - 1) * 3;
        Statics.field1523 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1523[var7] = var1.method5969();
            if (Statics.field1523[var7] == 0) {
                Statics.field1523[var7] = 1;
            }
        }
        var1.field4158 = 0;
        for (int var8 = 0; var8 < Statics.field4258; var8++) {
            int var9 = Statics.field4259[var8];
            int var10 = Statics.field3742[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field4260[var8] = var12;
            int var13 = var1.method5965();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method5966();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method5966();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ek.e(I)V")
    public static void method2359() {
        Statics.field2087 = null;
        Statics.field3126 = null;
        Statics.field4259 = null;
        Statics.field3742 = null;
        Statics.field1523 = null;
        Statics.field4260 = (byte[][]) null;
    }
}
