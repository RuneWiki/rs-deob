package deob;

import java.net.URL;

@ObfuscatedName("cd")
public class class80 {

    @ObfuscatedName("cd.x")
    public static int field1216 = 0;

    @ObfuscatedName("cd.e")
    public static int field1217 = 0;

    @ObfuscatedName("cd.l")
    public static int[] field1220 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cd.b")
    public static int[] field1214 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cd.c")
    public int field1219;

    @ObfuscatedName("cd.a")
    public int field1212;

    @ObfuscatedName("cd.y")
    public int field1222;

    @ObfuscatedName("cd.w")
    public String field1223;

    @ObfuscatedName("cd.k")
    public String field1224;

    @ObfuscatedName("cd.t")
    public int field1225;

    @ObfuscatedName("cd.h")
    public int field1226;

    @ObfuscatedName("b.m(I)Z")
    public static boolean method36() {
        try {
            if (Statics.field826 == null) {
                Statics.field826 = Statics.field3254.method2758(new URL(Statics.field825));
            } else if (Statics.field826.method2767()) {
                byte[] var0 = Statics.field826.method2768();
                class181 var1 = new class181(var0);
                var1.method3017();
                field1216 = var1.method3009();
                Statics.field2694 = new class80[field1216];
                int var2 = 0;
                while (var2 < field1216) {
                    class80 var3 = Statics.field2694[var2] = new class80();
                    var3.field1219 = var1.method3009();
                    var3.field1212 = var1.method3017();
                    var3.field1223 = var1.method3021();
                    var3.field1224 = var1.method3021();
                    var3.field1225 = var1.method3012();
                    var3.field1222 = var1.method3015();
                    var3.field1226 = var2++;
                }
                method1034(Statics.field2694, 0, Statics.field2694.length - 1, field1214, field1220);
                Statics.field826 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field826 = null;
        }
        return false;
    }

    @ObfuscatedName("aa.p(III)V")
    public static void method677(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1214[var5] != arg0) {
                var2[var4] = field1214[var5];
                var3[var4] = field1220[var5];
                var4++;
            }
        }
        field1214 = var2;
        field1220 = var3;
        method1034(Statics.field2694, 0, Statics.field2694.length - 1, field1214, field1220);
    }

    @ObfuscatedName("bc.i([Lcd;II[I[IB)V")
    public static void method1034(class80[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1226;
                        var12 = var8.field1226;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1222;
                        var12 = var8.field1222;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1494() ? 1 : 0;
                        var12 = var8.method1494() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1219;
                        var12 = var8.field1219;
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
                        var15 = arg0[var5].field1226;
                        var16 = var8.field1226;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1222;
                        var16 = var8.field1222;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1494() ? 1 : 0;
                        var16 = var8.method1494() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1219;
                        var16 = var8.field1219;
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
        method1034(arg0, arg1, var6, arg3, arg4);
        method1034(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("hx.j(IIIZIZI)V")
    public static void method3907(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class80 var8 = Statics.field2694[var6];
        Statics.field2694[var6] = Statics.field2694[arg1];
        Statics.field2694[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class80 var10 = Statics.field2694[var9];
            int var11 = method82(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method82(var10, var8, arg4, arg5);
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
                class80 var14 = Statics.field2694[var9];
                Statics.field2694[var9] = Statics.field2694[var7];
                Statics.field2694[var7++] = var14;
            }
        }
        Statics.field2694[arg1] = Statics.field2694[var7];
        Statics.field2694[var7] = var8;
        method3907(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method3907(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("k.v(Lcd;Lcd;IZI)I")
    public static int method82(class80 arg0, class80 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1222;
            int var5 = arg1.field1222;
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
            return arg0.field1225 - arg1.field1225;
        } else if (arg2 == 3) {
            if (arg0.field1224.equals("-")) {
                if (arg1.field1224.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1224.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1224.compareTo(arg1.field1224);
            }
        } else if (arg2 == 4) {
            return arg0.method1492() ? (arg1.method1492() ? 0 : 1) : (arg1.method1492() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1490() ? (arg1.method1490() ? 0 : 1) : (arg1.method1490() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1491() ? (arg1.method1491() ? 0 : 1) : (arg1.method1491() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1494() ? (arg1.method1494() ? 0 : 1) : (arg1.method1494() ? -1 : 0);
        } else {
            return arg0.field1219 - arg1.field1219;
        }
    }

    @ObfuscatedName("ez.x(B)Lcd;")
    public static class80 method2742() {
        field1217 = 0;
        return method4433();
    }

    @ObfuscatedName("jx.e(I)Lcd;")
    public static class80 method4433() {
        return field1217 < field1216 ? Statics.field2694[++field1217 - 1] : null;
    }

    @ObfuscatedName("cd.l(I)Z")
    public boolean method1494() {
        return (0x1 & this.field1212) != 0;
    }

    @ObfuscatedName("cd.b(I)Z")
    public boolean method1490() {
        return (0x2 & this.field1212) != 0;
    }

    @ObfuscatedName("cd.n(I)Z")
    public boolean method1491() {
        return (0x4 & this.field1212) != 0;
    }

    @ObfuscatedName("cd.c(B)Z")
    public boolean method1492() {
        return (0x8 & this.field1212) != 0;
    }

    @ObfuscatedName("cd.a(B)Z")
    public boolean method1510() {
        return (0x20000000 & this.field1212) != 0;
    }

    @ObfuscatedName("cd.y(I)Z")
    public boolean method1493() {
        return (0x2000000 & this.field1212) != 0;
    }
}
