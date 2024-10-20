package deob;

import java.net.URL;

@ObfuscatedName("ck")
public class class81 {

    @ObfuscatedName("ck.y")
    public static int field1327 = 0;

    @ObfuscatedName("ck.h")
    public static int field1323 = 0;

    @ObfuscatedName("ck.x")
    public static int[] field1319 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ck.f")
    public static int[] field1329 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ck.a")
    public int field1328;

    @ObfuscatedName("ck.o")
    public int field1322;

    @ObfuscatedName("ck.z")
    public int field1320;

    @ObfuscatedName("ck.q")
    public String field1324;

    @ObfuscatedName("ck.j")
    public String field1325;

    @ObfuscatedName("ck.k")
    public int field1326;

    @ObfuscatedName("ck.r")
    public int field1317;

    @ObfuscatedName("ad.i(B)Z")
    public static boolean method180() {
        try {
            if (Statics.field504 == null) {
                Statics.field504 = new class78(Statics.field722, new URL(Statics.field825));
            } else {
                byte[] var0 = Statics.field504.method1379();
                if (var0 != null) {
                    class174 var1 = new class174(var0);
                    field1327 = var1.method2872();
                    Statics.field1316 = new class81[field1327];
                    int var2 = 0;
                    while (var2 < field1327) {
                        class81 var3 = Statics.field1316[var2] = new class81();
                        var3.field1328 = var1.method2872();
                        var3.field1322 = var1.method2875();
                        var3.field1324 = var1.method2878();
                        var3.field1325 = var1.method2878();
                        var3.field1326 = var1.method2870();
                        var3.field1320 = var1.method2873();
                        var3.field1317 = var2++;
                    }
                    Statics.method2808(Statics.field1316, 0, Statics.field1316.length - 1, field1329, field1319);
                    Statics.field504 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field504 = null;
        }
        return false;
    }

    @ObfuscatedName("ad.c(IIB)V")
    public static void method193(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1329[var5] != arg0) {
                var2[var4] = field1329[var5];
                var3[var4] = field1319[var5];
                var4++;
            }
        }
        field1329 = var2;
        field1319 = var3;
        Statics.method2808(Statics.field1316, 0, Statics.field1316.length - 1, field1329, field1319);
    }

    @ObfuscatedName("b.v(IIIZIZI)V")
    public static void method9(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class81 var8 = Statics.field1316[var6];
        Statics.field1316[var6] = Statics.field1316[arg1];
        Statics.field1316[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method1031(Statics.field1316[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class81 var10 = Statics.field1316[var9];
                Statics.field1316[var9] = Statics.field1316[var7];
                Statics.field1316[var7++] = var10;
            }
        }
        Statics.field1316[arg1] = Statics.field1316[var7];
        Statics.field1316[var7] = var8;
        method9(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method9(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("bn.b(Lck;Lck;IZIZI)I")
    public static int method1031(class81 arg0, class81 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method227(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method227(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("at.y(Lck;Lck;IZI)I")
    public static int method227(class81 arg0, class81 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1320;
            int var5 = arg1.field1320;
            if (!arg3) {
                if (var4 == -1) {
                    var4 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var4 - var5;
        } else if (arg2 == 2) {
            return arg0.field1326 - arg1.field1326;
        } else if (arg2 == 3) {
            if (arg0.field1325.equals("-")) {
                if (arg1.field1325.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1325.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1325.compareTo(arg1.field1325);
            }
        } else if (arg2 == 4) {
            return arg0.method1415() ? (arg1.method1415() ? 0 : 1) : (arg1.method1415() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1417() ? (arg1.method1417() ? 0 : 1) : (arg1.method1417() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1418() ? (arg1.method1418() ? 0 : 1) : (arg1.method1418() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1437() ? (arg1.method1437() ? 0 : 1) : (arg1.method1437() ? -1 : 0);
        } else {
            return arg0.field1328 - arg1.field1328;
        }
    }

    @ObfuscatedName("eb.h(B)Lck;")
    public static class81 method2690() {
        field1323 = 0;
        return method31();
    }

    @ObfuscatedName("f.x(I)Lck;")
    public static class81 method31() {
        return field1323 < field1327 ? Statics.field1316[++field1323 - 1] : null;
    }

    @ObfuscatedName("ck.f(B)Z")
    public boolean method1437() {
        return (0x1 & this.field1322) != 0;
    }

    @ObfuscatedName("ck.n(I)Z")
    public boolean method1417() {
        return (0x2 & this.field1322) != 0;
    }

    @ObfuscatedName("ck.a(B)Z")
    public boolean method1418() {
        return (0x4 & this.field1322) != 0;
    }

    @ObfuscatedName("ck.o(B)Z")
    public boolean method1415() {
        return (0x8 & this.field1322) != 0;
    }

    @ObfuscatedName("ck.z(I)Z")
    public boolean method1420() {
        return (0x20000000 & this.field1322) != 0;
    }

    @ObfuscatedName("ck.q(I)Z")
    public boolean method1421() {
        return (0x2000000 & this.field1322) != 0;
    }
}
