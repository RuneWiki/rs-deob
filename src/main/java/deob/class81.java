package deob;

import java.net.URL;

@ObfuscatedName("ch")
public class class81 {

    @ObfuscatedName("ch.z")
    public static int field1282 = 0;

    @ObfuscatedName("ch.j")
    public static int field1294 = 0;

    @ObfuscatedName("ch.i")
    public static int[] field1284 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ch.f")
    public static int[] field1285 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ch.o")
    public int field1278;

    @ObfuscatedName("ch.q")
    public int field1288;

    @ObfuscatedName("ch.n")
    public int field1287;

    @ObfuscatedName("ch.a")
    public String field1286;

    @ObfuscatedName("ch.g")
    public String field1291;

    @ObfuscatedName("ch.v")
    public int field1292;

    @ObfuscatedName("ch.s")
    public int field1293;

    @ObfuscatedName("k.p(B)Z")
    public static boolean method129() {
        try {
            if (Statics.field1283 == null) {
                Statics.field1283 = new class78(Statics.field692, new URL(Statics.field2220));
            } else {
                byte[] var0 = Statics.field1283.method1345();
                if (var0 != null) {
                    class174 var1 = new class174(var0);
                    field1282 = var1.method2824();
                    Statics.field1281 = new class81[field1282];
                    int var2 = 0;
                    while (var2 < field1282) {
                        class81 var3 = Statics.field1281[var2] = new class81();
                        var3.field1278 = var1.method2824();
                        var3.field1288 = var1.method2803();
                        var3.field1286 = var1.method2818();
                        var3.field1291 = var1.method2818();
                        var3.field1292 = var1.method2810();
                        var3.field1287 = var1.method3001();
                        var3.field1293 = var2++;
                    }
                    Statics.method1023(Statics.field1281, 0, Statics.field1281.length - 1, field1285, field1284);
                    Statics.field1283 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1283 = null;
        }
        return false;
    }

    @ObfuscatedName("gl.m(IIB)V")
    public static void method3328(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1285[var5] != arg0) {
                var2[var4] = field1285[var5];
                var3[var4] = field1284[var5];
                var4++;
            }
        }
        field1285 = var2;
        field1284 = var3;
        Statics.method1023(Statics.field1281, 0, Statics.field1281.length - 1, field1285, field1284);
    }

    @ObfuscatedName("hp.t(IIIZIZI)V")
    public static void method3686(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class81 var8 = Statics.field1281[var6];
        Statics.field1281[var6] = Statics.field1281[arg1];
        Statics.field1281[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class81 var10 = Statics.field1281[var9];
            int var11 = method47(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method47(var10, var8, arg4, arg5);
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
                class81 var14 = Statics.field1281[var9];
                Statics.field1281[var9] = Statics.field1281[var7];
                Statics.field1281[var7++] = var14;
            }
        }
        Statics.field1281[arg1] = Statics.field1281[var7];
        Statics.field1281[var7] = var8;
        method3686(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method3686(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("c.w(Lch;Lch;IZI)I")
    public static int method47(class81 arg0, class81 arg1, int arg2, boolean arg3) {
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
            return arg0.field1292 - arg1.field1292;
        } else if (arg2 == 3) {
            if (arg0.field1291.equals("-")) {
                if (arg1.field1291.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1291.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1291.compareTo(arg1.field1291);
            }
        } else if (arg2 == 4) {
            return arg0.method1394() ? (arg1.method1394() ? 0 : 1) : (arg1.method1394() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1368() ? (arg1.method1368() ? 0 : 1) : (arg1.method1368() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1375() ? (arg1.method1375() ? 0 : 1) : (arg1.method1375() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1367() ? (arg1.method1367() ? 0 : 1) : (arg1.method1367() ? -1 : 0);
        } else {
            return arg0.field1278 - arg1.field1278;
        }
    }

    @ObfuscatedName("ch.z(B)Z")
    public boolean method1367() {
        return (0x1 & this.field1288) != 0;
    }

    @ObfuscatedName("ch.j(I)Z")
    public boolean method1368() {
        return (0x2 & this.field1288) != 0;
    }

    @ObfuscatedName("ch.c(I)Z")
    public boolean method1375() {
        return (0x4 & this.field1288) != 0;
    }

    @ObfuscatedName("ch.o(B)Z")
    public boolean method1394() {
        return (0x8 & this.field1288) != 0;
    }

    @ObfuscatedName("ch.q(I)Z")
    public boolean method1371() {
        return (0x20000000 & this.field1288) != 0;
    }

    @ObfuscatedName("ch.n(I)Z")
    public boolean method1372() {
        return (0x2000000 & this.field1288) != 0;
    }
}
