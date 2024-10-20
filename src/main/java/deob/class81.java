package deob;

import java.net.URL;

@ObfuscatedName("cf")
public class class81 {

    @ObfuscatedName("cf.b")
    public static int field1297 = 0;

    @ObfuscatedName("cf.k")
    public static int field1298 = 0;

    @ObfuscatedName("cf.f")
    public static int[] field1293 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cf.j")
    public static int[] field1300 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cf.h")
    public int field1301;

    @ObfuscatedName("cf.i")
    public int field1299;

    @ObfuscatedName("cf.s")
    public int field1303;

    @ObfuscatedName("cf.n")
    public String field1302;

    @ObfuscatedName("cf.c")
    public String field1306;

    @ObfuscatedName("cf.v")
    public int field1294;

    @ObfuscatedName("cf.u")
    public int field1309;

    @ObfuscatedName("f.e(B)Z")
    public static boolean method19() {
        try {
            if (Statics.field2246 == null) {
                Statics.field2246 = new class78(Statics.field712, new URL(Statics.field472));
            } else {
                byte[] var0 = Statics.field2246.method1377();
                if (var0 != null) {
                    class174 var1 = new class174(var0);
                    field1297 = var1.method2930();
                    Statics.field1296 = new class81[field1297];
                    int var2 = 0;
                    while (var2 < field1297) {
                        class81 var3 = Statics.field1296[var2] = new class81();
                        var3.field1301 = var1.method2930();
                        var3.field1299 = var1.method2896();
                        var3.field1302 = var1.method2899();
                        var3.field1306 = var1.method2899();
                        var3.field1294 = var1.method2891();
                        var3.field1303 = var1.method2894();
                        var3.field1309 = var2++;
                    }
                    Statics.method406(Statics.field1296, 0, Statics.field1296.length - 1, field1300, field1293);
                    Statics.field2246 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2246 = null;
        }
        return false;
    }

    @ObfuscatedName("be.o(III)V")
    public static void method1375(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1300[var5] != arg0) {
                var2[var4] = field1300[var5];
                var3[var4] = field1293[var5];
                var4++;
            }
        }
        field1300 = var2;
        field1293 = var3;
        Statics.method406(Statics.field1296, 0, Statics.field1296.length - 1, field1300, field1293);
    }

    @ObfuscatedName("bl.g(IIIZIZB)V")
    public static void method960(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class81 var8 = Statics.field1296[var6];
        Statics.field1296[var6] = Statics.field1296[arg1];
        Statics.field1296[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method1009(Statics.field1296[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class81 var10 = Statics.field1296[var9];
                Statics.field1296[var9] = Statics.field1296[var7];
                Statics.field1296[var7++] = var10;
            }
        }
        Statics.field1296[arg1] = Statics.field1296[var7];
        Statics.field1296[var7] = var8;
        method960(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method960(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("bx.d(Lcf;Lcf;IZIZI)I")
    public static int method1009(class81 arg0, class81 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method1051(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method1051(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("bv.b(Lcf;Lcf;IZI)I")
    public static int method1051(class81 arg0, class81 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1303;
            int var5 = arg1.field1303;
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
            return arg0.field1294 - arg1.field1294;
        } else if (arg2 == 3) {
            if (arg0.field1306.equals("-")) {
                if (arg1.field1306.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1306.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1306.compareTo(arg1.field1306);
            }
        } else if (arg2 == 4) {
            return arg0.method1416() ? (arg1.method1416() ? 0 : 1) : (arg1.method1416() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1425() ? (arg1.method1425() ? 0 : 1) : (arg1.method1425() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1405() ? (arg1.method1405() ? 0 : 1) : (arg1.method1405() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1403() ? (arg1.method1403() ? 0 : 1) : (arg1.method1403() ? -1 : 0);
        } else {
            return arg0.field1301 - arg1.field1301;
        }
    }

    @ObfuscatedName("hk.k(I)Lcf;")
    public static class81 method3570() {
        field1298 = 0;
        class81 var0;
        if (field1298 < field1297) {
            var0 = Statics.field1296[++field1298 - 1];
        } else {
            var0 = null;
        }
        return var0;
    }

    @ObfuscatedName("cf.q(I)Z")
    public boolean method1403() {
        return (0x1 & this.field1299) != 0;
    }

    @ObfuscatedName("cf.h(B)Z")
    public boolean method1425() {
        return (0x2 & this.field1299) != 0;
    }

    @ObfuscatedName("cf.i(I)Z")
    public boolean method1405() {
        return (0x4 & this.field1299) != 0;
    }

    @ObfuscatedName("cf.s(I)Z")
    public boolean method1416() {
        return (0x8 & this.field1299) != 0;
    }

    @ObfuscatedName("cf.n(I)Z")
    public boolean method1406() {
        return (0x20000000 & this.field1299) != 0;
    }

    @ObfuscatedName("cf.c(I)Z")
    public boolean method1436() {
        return (0x2000000 & this.field1299) != 0;
    }
}
