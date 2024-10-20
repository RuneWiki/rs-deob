package deob;

import java.net.URL;

@ObfuscatedName("cw")
public class class81 {

    @ObfuscatedName("cw.m")
    public static int field1295 = 0;

    @ObfuscatedName("cw.s")
    public static int field1284 = 0;

    @ObfuscatedName("cw.x")
    public static int[] field1286 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cw.p")
    public static int[] field1282 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cw.r")
    public int field1288;

    @ObfuscatedName("cw.w")
    public int field1289;

    @ObfuscatedName("cw.v")
    public int field1287;

    @ObfuscatedName("cw.h")
    public String field1291;

    @ObfuscatedName("cw.t")
    public String field1292;

    @ObfuscatedName("cw.a")
    public int field1280;

    @ObfuscatedName("cw.e")
    public int field1293;

    @ObfuscatedName("bw.c(I)Z")
    public static boolean method953() {
        try {
            if (Statics.field3642 == null) {
                Statics.field3642 = new class78(Statics.field699, new URL(Statics.field2784));
            } else {
                byte[] var0 = Statics.field3642.method1358();
                if (var0 != null) {
                    class174 var1 = new class174(var0);
                    field1295 = var1.method2861();
                    Statics.field797 = new class81[field1295];
                    int var2 = 0;
                    while (var2 < field1295) {
                        class81 var3 = Statics.field797[var2] = new class81();
                        var3.field1288 = var1.method2861();
                        var3.field1289 = var1.method2987();
                        var3.field1291 = var1.method2867();
                        var3.field1292 = var1.method2867();
                        var3.field1280 = var1.method2843();
                        var3.field1287 = var1.method3061();
                        var3.field1293 = var2++;
                    }
                    Statics.method2(Statics.field797, 0, Statics.field797.length - 1, field1282, field1286);
                    Statics.field3642 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field3642 = null;
        }
        return false;
    }

    @ObfuscatedName("bi.o(III)V")
    public static void method877(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1282[var5] != arg0) {
                var2[var4] = field1282[var5];
                var3[var4] = field1286[var5];
                var4++;
            }
        }
        field1282 = var2;
        field1286 = var3;
        Statics.method2(Statics.field797, 0, Statics.field797.length - 1, field1282, field1286);
    }

    @ObfuscatedName("cc.u(IZIZI)V")
    public static void method1434(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field797 != null) {
            method1352(0, Statics.field797.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("br.g(IIIZIZI)V")
    public static void method1352(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class81 var8 = Statics.field797[var6];
        Statics.field797[var6] = Statics.field797[arg1];
        Statics.field797[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class81 var10 = Statics.field797[var9];
            int var11 = method866(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method866(var10, var8, arg4, arg5);
                    if (arg5) {
                        var12 = -var13;
                    } else {
                        var12 = var13;
                    }
                }
            } else if (arg3) {
                var12 = -var11;
            } else {
                var12 = var11;
            }
            if (var12 <= 0) {
                class81 var14 = Statics.field797[var9];
                Statics.field797[var9] = Statics.field797[var7];
                Statics.field797[var7++] = var14;
            }
        }
        Statics.field797[arg1] = Statics.field797[var7];
        Statics.field797[var7] = var8;
        method1352(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method1352(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("bi.m(Lcw;Lcw;IZI)I")
    public static int method866(class81 arg0, class81 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1287;
            int var5 = arg1.field1287;
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
            return arg0.field1280 - arg1.field1280;
        } else if (arg2 == 3) {
            if (arg0.field1292.equals("-")) {
                if (arg1.field1292.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1292.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1292.compareTo(arg1.field1292);
            }
        } else if (arg2 == 4) {
            return arg0.method1393() ? (arg1.method1393() ? 0 : 1) : (arg1.method1393() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1391() ? (arg1.method1391() ? 0 : 1) : (arg1.method1391() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1395() ? (arg1.method1395() ? 0 : 1) : (arg1.method1395() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1390() ? (arg1.method1390() ? 0 : 1) : (arg1.method1390() ? -1 : 0);
        } else {
            return arg0.field1288 - arg1.field1288;
        }
    }

    @ObfuscatedName("cz.s(I)Lcw;")
    public static class81 method1532() {
        return field1284 < field1295 ? Statics.field797[++field1284 - 1] : null;
    }

    @ObfuscatedName("cw.x(I)Z")
    public boolean method1390() {
        return (0x1 & this.field1289) != 0;
    }

    @ObfuscatedName("cw.p(I)Z")
    public boolean method1391() {
        return (0x2 & this.field1289) != 0;
    }

    @ObfuscatedName("cw.k(I)Z")
    public boolean method1395() {
        return (0x4 & this.field1289) != 0;
    }

    @ObfuscatedName("cw.r(I)Z")
    public boolean method1393() {
        return (0x8 & this.field1289) != 0;
    }

    @ObfuscatedName("cw.w(S)Z")
    public boolean method1394() {
        return (0x20000000 & this.field1289) != 0;
    }

    @ObfuscatedName("cw.v(I)Z")
    public boolean method1389() {
        return (0x2000000 & this.field1289) != 0;
    }
}
