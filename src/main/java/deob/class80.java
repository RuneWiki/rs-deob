package deob;

@ObfuscatedName("ce")
public class class80 {

    public class80() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.l(Lfp;III)Lcf;")
    public static class84 method619(class171 arg0, int arg1, int arg2) {
        if (!method50(arg0, arg1, arg2)) {
            return null;
        }
        class84 var3 = new class84();
        var3.field1497 = Statics.field1455;
        var3.field1503 = Statics.field1457;
        var3.field1501 = Statics.field1458[0];
        var3.field1502 = Statics.field2963[0];
        var3.field1499 = Statics.field3107[0];
        var3.field1504 = Statics.field1459[0];
        var3.field1498 = Statics.field1460;
        var3.field1500 = Statics.field2237[0];
        Statics.method1157();
        return var3;
    }

    @ObfuscatedName("bj.g(Lfp;III)[Lcl;")
    public static class82[] method1128(class171 arg0, int arg1, int arg2) {
        return method50(arg0, arg1, arg2) ? method109() : null;
    }

    @ObfuscatedName("az.r(Lfp;IIB)Lcl;")
    public static class82 method684(class171 arg0, int arg1, int arg2) {
        return method50(arg0, arg1, arg2) ? method590() : null;
    }

    @ObfuscatedName("ab.e(Lfp;Ljava/lang/String;Ljava/lang/String;I)[Lcf;")
    public static class84[] method752(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3209(arg1);
        int var4 = arg0.method3258(var3, arg2);
        class84[] var5;
        if (method50(arg0, var3, var4)) {
            class84[] var6 = new class84[Statics.field1467];
            for (int var7 = 0; var7 < Statics.field1467; var7++) {
                class84 var8 = var6[var7] = new class84();
                var8.field1497 = Statics.field1455;
                var8.field1503 = Statics.field1457;
                var8.field1501 = Statics.field1458[var7];
                var8.field1502 = Statics.field2963[var7];
                var8.field1499 = Statics.field3107[var7];
                var8.field1504 = Statics.field1459[var7];
                var8.field1498 = Statics.field1460;
                var8.field1500 = Statics.field2237[var7];
            }
            Statics.method1157();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("el.h(Lfp;Ljava/lang/String;Ljava/lang/String;B)Lcf;")
    public static class84 method2861(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3209(arg1);
        int var4 = arg0.method3258(var3, arg2);
        return method619(arg0, var3, var4);
    }

    @ObfuscatedName("bj.s(Lfp;Ljava/lang/String;Ljava/lang/String;I)[Lcl;")
    public static class82[] method1142(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3209(arg1);
        int var4 = arg0.method3258(var3, arg2);
        return method1128(arg0, var3, var4);
    }

    @ObfuscatedName("h.k(Lfp;Ljava/lang/String;Ljava/lang/String;I)Lcl;")
    public static class82 method48(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3209(arg1);
        int var4 = arg0.method3258(var3, arg2);
        return method684(arg0, var3, var4);
    }

    @ObfuscatedName("y.u(Lfp;Lfp;Ljava/lang/String;Ljava/lang/String;I)Lhc;")
    public static class228 method589(class171 arg0, class171 arg1, String arg2, String arg3) {
        int var4 = arg0.method3209(arg2);
        int var5 = arg0.method3258(var4, arg3);
        class228 var6;
        if (method50(arg0, var4, var5)) {
            byte[] var7 = arg1.method3210(var4, var5);
            class228 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class228 var9 = new class228(var7, Statics.field1458, Statics.field2963, Statics.field3107, Statics.field1459, Statics.field1460, Statics.field2237);
                Statics.method1157();
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("dd.n(Lfp;IB)Lcf;")
    public static class84 method2430(class171 arg0, int arg1) {
        if (!method607(arg0, arg1)) {
            return null;
        }
        class84 var2 = new class84();
        var2.field1497 = Statics.field1455;
        var2.field1503 = Statics.field1457;
        var2.field1501 = Statics.field1458[0];
        var2.field1502 = Statics.field2963[0];
        var2.field1499 = Statics.field3107[0];
        var2.field1504 = Statics.field1459[0];
        var2.field1498 = Statics.field1460;
        var2.field1500 = Statics.field2237[0];
        Statics.method1157();
        return var2;
    }

    @ObfuscatedName("u.b(S)[Lcl;")
    public static class82[] method109() {
        class82[] var0 = new class82[Statics.field1467];
        for (int var1 = 0; var1 < Statics.field1467; var1++) {
            class82 var2 = var0[var1] = new class82();
            var2.field1485 = Statics.field1455;
            var2.field1484 = Statics.field1457;
            var2.field1481 = Statics.field1458[var1];
            var2.field1479 = Statics.field2963[var1];
            var2.field1483 = Statics.field3107[var1];
            var2.field1480 = Statics.field1459[var1];
            int var3 = var2.field1483 * var2.field1480;
            byte[] var4 = Statics.field2237[var1];
            var2.field1488 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1488[var5] = Statics.field1460[var4[var5] & 0xFF];
            }
        }
        Statics.method1157();
        return var0;
    }

    @ObfuscatedName("y.m(I)Lcl;")
    public static class82 method590() {
        class82 var0 = new class82();
        var0.field1485 = Statics.field1455;
        var0.field1484 = Statics.field1457;
        var0.field1481 = Statics.field1458[0];
        var0.field1479 = Statics.field2963[0];
        var0.field1483 = Statics.field3107[0];
        var0.field1480 = Statics.field1459[0];
        int var1 = var0.field1483 * var0.field1480;
        byte[] var2 = Statics.field2237[0];
        var0.field1488 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1488[var3] = Statics.field1460[var2[var3] & 0xFF];
        }
        Statics.method1157();
        return var0;
    }

    @ObfuscatedName("h.q(Lfp;III)Z")
    public static boolean method50(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3210(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            Statics.method29(var3);
            return true;
        }
    }

    @ObfuscatedName("a.p(Lfp;II)Z")
    public static boolean method607(class171 arg0, int arg1) {
        byte[] var2 = arg0.method3201(arg1);
        if (var2 == null) {
            return false;
        } else {
            Statics.method29(var2);
            return true;
        }
    }
}
