package deob;

import java.net.URL;

@ObfuscatedName("cw")
public class class81 {

    @ObfuscatedName("cw.m")
    public static int field1298 = 0;

    @ObfuscatedName("cw.c")
    public static int field1312 = 0;

    @ObfuscatedName("cw.z")
    public static int[] field1300 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cw.h")
    public static int[] field1295 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cw.e")
    public int field1308;

    @ObfuscatedName("cw.o")
    public int field1309;

    @ObfuscatedName("cw.x")
    public int field1304;

    @ObfuscatedName("cw.a")
    public String field1313;

    @ObfuscatedName("cw.y")
    public String field1306;

    @ObfuscatedName("cw.r")
    public int field1307;

    @ObfuscatedName("cw.b")
    public int field1305;

    @ObfuscatedName("ac.n(S)Z")
    public static boolean method494() {
        try {
            if (Statics.field787 == null) {
                Statics.field787 = new class78(Statics.field679, new URL(Statics.field2214));
            } else {
                byte[] var0 = Statics.field787.method1379();
                if (var0 != null) {
                    class174 var1 = new class174(var0);
                    field1298 = var1.method3065();
                    Statics.field1297 = new class81[field1298];
                    int var2 = 0;
                    while (var2 < field1298) {
                        class81 var3 = Statics.field1297[var2] = new class81();
                        var3.field1308 = var1.method3065();
                        var3.field1309 = var1.method3058();
                        var3.field1313 = var1.method3098();
                        var3.field1306 = var1.method3098();
                        var3.field1307 = var1.method2925();
                        var3.field1304 = var1.method2924();
                        var3.field1305 = var2++;
                    }
                    method1935(Statics.field1297, 0, Statics.field1297.length - 1, field1295, field1300);
                    Statics.field787 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field787 = null;
        }
        return false;
    }

    @ObfuscatedName("dk.p(IIB)V")
    public static void method1932(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1295[var5] != arg0) {
                var2[var4] = field1295[var5];
                var3[var4] = field1300[var5];
                var4++;
            }
        }
        field1295 = var2;
        field1300 = var3;
        method1935(Statics.field1297, 0, Statics.field1297.length - 1, field1295, field1300);
    }

    @ObfuscatedName("dk.i([Lcw;II[I[II)V")
    public static void method1935(class81[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class81 var8 = arg0[var7];
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
                        var11 = arg0[var6].field1305;
                        var12 = var8.field1305;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1304;
                        var12 = var8.field1304;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1407() ? 1 : 0;
                        var12 = var8.method1407() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1308;
                        var12 = var8.field1308;
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
                        var15 = arg0[var5].field1305;
                        var16 = var8.field1305;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1304;
                        var16 = var8.field1304;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1407() ? 1 : 0;
                        var16 = var8.method1407() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1308;
                        var16 = var8.field1308;
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
                class81 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method1935(arg0, arg1, var6, arg3, arg4);
        method1935(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("y.j(IZIZI)V")
    public static void method90(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1297 != null) {
            method2676(0, Statics.field1297.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("el.f(IIIZIZB)V")
    public static void method2676(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class81 var8 = Statics.field1297[var6];
        Statics.field1297[var6] = Statics.field1297[arg1];
        Statics.field1297[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method1376(Statics.field1297[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class81 var10 = Statics.field1297[var9];
                Statics.field1297[var9] = Statics.field1297[var7];
                Statics.field1297[var7++] = var10;
            }
        }
        Statics.field1297[arg1] = Statics.field1297[var7];
        Statics.field1297[var7] = var8;
        method2676(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2676(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("bq.m(Lcw;Lcw;IZIZI)I")
    public static int method1376(class81 arg0, class81 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method722(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method722(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("bx.c(Lcw;Lcw;IZI)I")
    public static int method722(class81 arg0, class81 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1304;
            int var5 = arg1.field1304;
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
            return arg0.field1307 - arg1.field1307;
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
            return arg0.method1410() ? (arg1.method1410() ? 0 : 1) : (arg1.method1410() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1408() ? (arg1.method1408() ? 0 : 1) : (arg1.method1408() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1443() ? (arg1.method1443() ? 0 : 1) : (arg1.method1443() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1407() ? (arg1.method1407() ? 0 : 1) : (arg1.method1407() ? -1 : 0);
        } else {
            return arg0.field1308 - arg1.field1308;
        }
    }

    @ObfuscatedName("k.z(B)Lcw;")
    public static class81 method181() {
        field1312 = 0;
        class81 var0;
        if (field1312 < field1298) {
            var0 = Statics.field1297[++field1312 - 1];
        } else {
            var0 = null;
        }
        return var0;
    }

    @ObfuscatedName("cw.h(I)Z")
    public boolean method1407() {
        return (0x1 & this.field1309) != 0;
    }

    @ObfuscatedName("cw.g(B)Z")
    public boolean method1408() {
        return (0x2 & this.field1309) != 0;
    }

    @ObfuscatedName("cw.e(I)Z")
    public boolean method1443() {
        return (0x4 & this.field1309) != 0;
    }

    @ObfuscatedName("cw.o(B)Z")
    public boolean method1410() {
        return (0x8 & this.field1309) != 0;
    }

    @ObfuscatedName("cw.x(I)Z")
    public boolean method1411() {
        return (0x20000000 & this.field1309) != 0;
    }

    @ObfuscatedName("cw.a(I)Z")
    public boolean method1449() {
        return (0x2000000 & this.field1309) != 0;
    }
}
