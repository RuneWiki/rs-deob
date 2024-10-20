package deob;

import java.net.URL;

@ObfuscatedName("ch")
public class class80 {

    @ObfuscatedName("ch.d")
    public static int field1222 = 0;

    @ObfuscatedName("ch.s")
    public static int field1218 = 0;

    @ObfuscatedName("ch.b")
    public static int[] field1224 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ch.e")
    public static int[] field1225 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ch.z")
    public int field1226;

    @ObfuscatedName("ch.u")
    public int field1220;

    @ObfuscatedName("ch.p")
    public int field1228;

    @ObfuscatedName("ch.w")
    public String field1229;

    @ObfuscatedName("ch.t")
    public String field1223;

    @ObfuscatedName("ch.o")
    public int field1227;

    @ObfuscatedName("ch.a")
    public int field1232;

    @ObfuscatedName("av.n(B)Z")
    public static boolean method454() {
        try {
            if (Statics.field490 == null) {
                Statics.field490 = Statics.field2161.method2722(new URL(Statics.field304));
            } else if (Statics.field490.method2727()) {
                byte[] var0 = Statics.field490.method2731();
                class185 var1 = new class185(var0);
                var1.method3026();
                field1222 = var1.method3015();
                Statics.field1221 = new class80[field1222];
                int var2 = 0;
                while (var2 < field1222) {
                    class80 var3 = Statics.field1221[var2] = new class80();
                    var3.field1226 = var1.method3015();
                    var3.field1220 = var1.method3026();
                    var3.field1229 = var1.method3030();
                    var3.field1223 = var1.method3030();
                    var3.field1227 = var1.method3021();
                    var3.field1228 = var1.method3024();
                    var3.field1232 = var2++;
                }
                method2332(Statics.field1221, 0, Statics.field1221.length - 1, field1225, field1224);
                Statics.field490 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field490 = null;
        }
        return false;
    }

    @ObfuscatedName("y.v(III)V")
    public static void method4(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1225[var5] != arg0) {
                var2[var4] = field1225[var5];
                var3[var4] = field1224[var5];
                var4++;
            }
        }
        field1225 = var2;
        field1224 = var3;
        method2332(Statics.field1221, 0, Statics.field1221.length - 1, field1225, field1224);
    }

    @ObfuscatedName("ds.y([Lch;II[I[IB)V")
    public static void method2332(class80[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class80 var8 = arg0[var7];
        arg0[var7] = arg0[arg1];
        arg0[arg1] = var8;
        while (var5 < var6) {
            boolean var9 = true;
            do {
                var6--;
                for (int var10 = 0; var10 < 4; var10++) {
                    int var11;
                    int var12;
                    if (arg3[var10] == 2) {
                        var11 = arg0[var6].field1232;
                        var12 = var8.field1232;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1228;
                        var12 = var8.field1228;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1464() ? 1 : 0;
                        var12 = var8.method1464() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1226;
                        var12 = var8.field1226;
                    }
                    if (var11 != var12) {
                        if ((arg4[var10] != 1 || var11 <= var12) && (arg4[var10] != 0 || var11 >= var12)) {
                            var9 = false;
                        }
                        break;
                    }
                    if (var10 == 3) {
                        var9 = false;
                    }
                }
            } while (var9);
            boolean var13 = true;
            do {
                var5++;
                for (int var14 = 0; var14 < 4; var14++) {
                    int var15;
                    int var16;
                    if (arg3[var14] == 2) {
                        var15 = arg0[var5].field1232;
                        var16 = var8.field1232;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1228;
                        var16 = var8.field1228;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1464() ? 1 : 0;
                        var16 = var8.method1464() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1226;
                        var16 = var8.field1226;
                    }
                    if (var15 != var16) {
                        if ((arg4[var14] != 1 || var15 >= var16) && (arg4[var14] != 0 || var15 <= var16)) {
                            var13 = false;
                        }
                        break;
                    }
                    if (var14 == 3) {
                        var13 = false;
                    }
                }
            } while (var13);
            if (var5 < var6) {
                class80 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2332(arg0, arg1, var6, arg3, arg4);
        method2332(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("d.r(IZIZI)V")
    public static void method15(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1221 != null) {
            method9(0, Statics.field1221.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("h.h(IIIZIZI)V")
    public static void method9(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class80 var8 = Statics.field1221[var6];
        Statics.field1221[var6] = Statics.field1221[arg1];
        Statics.field1221[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method1662(Statics.field1221[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class80 var10 = Statics.field1221[var9];
                Statics.field1221[var9] = Statics.field1221[var7];
                Statics.field1221[var7++] = var10;
            }
        }
        Statics.field1221[arg1] = Statics.field1221[var7];
        Statics.field1221[var7] = var8;
        method9(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method9(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("cp.d(Lch;Lch;IZIZI)I")
    public static int method1662(class80 arg0, class80 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method3321(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method3321(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("gz.s(Lch;Lch;IZB)I")
    public static int method3321(class80 arg0, class80 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1228;
            int var5 = arg1.field1228;
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
            return arg0.field1227 - arg1.field1227;
        } else if (arg2 == 3) {
            if (arg0.field1223.equals("-")) {
                if (arg1.field1223.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1223.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1223.compareTo(arg1.field1223);
            }
        } else if (arg2 == 4) {
            return arg0.method1453() ? (arg1.method1453() ? 0 : 1) : (arg1.method1453() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1451() ? (arg1.method1451() ? 0 : 1) : (arg1.method1451() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1452() ? (arg1.method1452() ? 0 : 1) : (arg1.method1452() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1464() ? (arg1.method1464() ? 0 : 1) : (arg1.method1464() ? -1 : 0);
        } else {
            return arg0.field1226 - arg1.field1226;
        }
    }

    @ObfuscatedName("ch.b(I)Z")
    public boolean method1464() {
        return (0x1 & this.field1220) != 0;
    }

    @ObfuscatedName("ch.e(I)Z")
    public boolean method1451() {
        return (0x2 & this.field1220) != 0;
    }

    @ObfuscatedName("ch.f(I)Z")
    public boolean method1452() {
        return (0x4 & this.field1220) != 0;
    }

    @ObfuscatedName("ch.u(I)Z")
    public boolean method1453() {
        return (0x8 & this.field1220) != 0;
    }

    @ObfuscatedName("ch.t(I)Z")
    public boolean method1461() {
        return (0x20000000 & this.field1220) != 0;
    }

    @ObfuscatedName("ch.o(I)Z")
    public boolean method1455() {
        return (0x2000000 & this.field1220) != 0;
    }
}
