package deob;

@ObfuscatedName("bp")
public class class77 {

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dp.t(Lfp;III)[Lct;")
    public static class81[] method2249(class168 arg0, int arg1, int arg2) {
        if (!method542(arg0, arg1, arg2)) {
            return null;
        }
        class81[] var3 = new class81[Statics.field1388];
        for (int var4 = 0; var4 < Statics.field1388; var4++) {
            class81 var5 = var3[var4] = new class81();
            var5.field1427 = Statics.field1387;
            var5.field1423 = Statics.field1393;
            var5.field1430 = Statics.field1389[var4];
            var5.field1428 = Statics.field2690[var4];
            var5.field1425 = Statics.field1386[var4];
            var5.field1426 = Statics.field210[var4];
            var5.field1424 = Statics.field214;
            var5.field1429 = Statics.field1046[var4];
        }
        method155();
        return var3;
    }

    @ObfuscatedName("da.i(Lfp;III)Lct;")
    public static class81 method2244(class168 arg0, int arg1, int arg2) {
        return method542(arg0, arg1, arg2) ? method156() : null;
    }

    @ObfuscatedName("ag.g(Lfp;III)[Lcj;")
    public static class79[] method626(class168 arg0, int arg1, int arg2) {
        return method542(arg0, arg1, arg2) ? method1420() : null;
    }

    @ObfuscatedName("aa.h(Lfp;IIB)Lcj;")
    public static class79 method875(class168 arg0, int arg1, int arg2) {
        return method542(arg0, arg1, arg2) ? Statics.method950() : null;
    }

    @ObfuscatedName("d.z(Lfp;Lfp;III)Lhv;")
    public static class225 method86(class168 arg0, class168 arg1, int arg2, int arg3) {
        return method542(arg0, arg2, arg3) ? method607(arg1.method3002(arg2, arg3)) : null;
    }

    @ObfuscatedName("hw.r(Lfp;Ljava/lang/String;Ljava/lang/String;I)[Lct;")
    public static class81[] method3630(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3017(arg1);
        int var4 = arg0.method3018(var3, arg2);
        return method2249(arg0, var3, var4);
    }

    @ObfuscatedName("ay.f(Lfp;Ljava/lang/String;Ljava/lang/String;S)Lct;")
    public static class81 method672(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3017(arg1);
        int var4 = arg0.method3018(var3, arg2);
        return method2244(arg0, var3, var4);
    }

    @ObfuscatedName("az.s(Lfp;Ljava/lang/String;Ljava/lang/String;B)[Lcj;")
    public static class79[] method941(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3017(arg1);
        int var4 = arg0.method3018(var3, arg2);
        return method626(arg0, var3, var4);
    }

    @ObfuscatedName("bo.d(Lfp;Ljava/lang/String;Ljava/lang/String;B)Lcj;")
    public static class79 method1452(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3017(arg1);
        int var4 = arg0.method3018(var3, arg2);
        return method875(arg0, var3, var4);
    }

    @ObfuscatedName("dw.l(Lfp;II)Lct;")
    public static class81 method2099(class168 arg0, int arg1) {
        byte[] var2 = arg0.method3056(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            Statics.method2962(var2);
            var3 = true;
        }
        return var3 ? method156() : null;
    }

    @ObfuscatedName("a.y(I)Lct;")
    public static class81 method156() {
        class81 var0 = new class81();
        var0.field1427 = Statics.field1387;
        var0.field1423 = Statics.field1393;
        var0.field1430 = Statics.field1389[0];
        var0.field1428 = Statics.field2690[0];
        var0.field1425 = Statics.field1386[0];
        var0.field1426 = Statics.field210[0];
        var0.field1424 = Statics.field214;
        var0.field1429 = Statics.field1046[0];
        method155();
        return var0;
    }

    @ObfuscatedName("bs.p(I)[Lcj;")
    public static class79[] method1420() {
        class79[] var0 = new class79[Statics.field1388];
        for (int var1 = 0; var1 < Statics.field1388; var1++) {
            class79 var2 = var0[var1] = new class79();
            var2.field1409 = Statics.field1387;
            var2.field1412 = Statics.field1393;
            var2.field1407 = Statics.field1389[var1];
            var2.field1408 = Statics.field2690[var1];
            var2.field1405 = Statics.field1386[var1];
            var2.field1406 = Statics.field210[var1];
            int var3 = var2.field1406 * var2.field1405;
            byte[] var4 = Statics.field1046[var1];
            var2.field1410 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1410[var5] = Statics.field214[var4[var5] & 0xFF];
            }
        }
        method155();
        return var0;
    }

    @ObfuscatedName("ad.o([BB)Lhv;")
    public static class225 method607(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class225 var1 = new class225(arg0, Statics.field1389, Statics.field2690, Statics.field1386, Statics.field210, Statics.field214, Statics.field1046);
            method155();
            return var1;
        }
    }

    @ObfuscatedName("x.b(Lfp;IIS)Z")
    public static boolean method542(class168 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3002(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            Statics.method2962(var3);
            return true;
        }
    }

    @ObfuscatedName("a.a(S)V")
    public static void method155() {
        Statics.field1389 = null;
        Statics.field2690 = null;
        Statics.field1386 = null;
        Statics.field210 = null;
        Statics.field214 = null;
        Statics.field1046 = (byte[][]) null;
    }
}
