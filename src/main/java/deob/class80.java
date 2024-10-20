package deob;

import java.net.URL;

@ObfuscatedName("cw")
public class class80 {

    @ObfuscatedName("cw.m")
    public static int field1219 = 0;

    @ObfuscatedName("cw.b")
    public static int field1218 = 0;

    @ObfuscatedName("cw.t")
    public static int[] field1220 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cw.p")
    public static int[] field1221 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cw.l")
    public int field1222;

    @ObfuscatedName("cw.u")
    public int field1213;

    @ObfuscatedName("cw.n")
    public int field1224;

    @ObfuscatedName("cw.c")
    public String field1228;

    @ObfuscatedName("cw.y")
    public String field1226;

    @ObfuscatedName("cw.j")
    public int field1217;

    @ObfuscatedName("cw.f")
    public int field1223;

    @ObfuscatedName("af.d(I)Z")
    public static boolean method610() {
        try {
            if (Statics.field747 == null) {
                Statics.field747 = Statics.field2712.method2784(new URL(Statics.field3357));
            } else if (Statics.field747.method2794()) {
                byte[] var0 = Statics.field747.method2795();
                class181 var1 = new class181(var0);
                var1.method3041();
                field1219 = var1.method3179();
                Statics.field1230 = new class80[field1219];
                int var2 = 0;
                while (var2 < field1219) {
                    class80 var3 = Statics.field1230[var2] = new class80();
                    var3.field1222 = var1.method3179();
                    var3.field1213 = var1.method3041();
                    var3.field1228 = var1.method3045();
                    var3.field1226 = var1.method3045();
                    var3.field1217 = var1.method3204();
                    var3.field1224 = var1.method3147();
                    var3.field1223 = var2++;
                }
                method1034(Statics.field1230, 0, Statics.field1230.length - 1, field1221, field1220);
                Statics.field747 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field747 = null;
        }
        return false;
    }

    @ObfuscatedName("bp.x(III)V")
    public static void method1093(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1221[var5] != arg0) {
                var2[var4] = field1221[var5];
                var3[var4] = field1220[var5];
                var4++;
            }
        }
        field1221 = var2;
        field1220 = var3;
        method1034(Statics.field1230, 0, Statics.field1230.length - 1, field1221, field1220);
    }

    @ObfuscatedName("bt.k([Lcw;II[I[II)V")
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
                        var11 = arg0[var6].field1223;
                        var12 = var8.field1223;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1224;
                        var12 = var8.field1224;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1499() ? 1 : 0;
                        var12 = var8.method1499() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1222;
                        var12 = var8.field1222;
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
                        var15 = arg0[var5].field1223;
                        var16 = var8.field1223;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1224;
                        var16 = var8.field1224;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1499() ? 1 : 0;
                        var16 = var8.method1499() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1222;
                        var16 = var8.field1222;
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

    @ObfuscatedName("ad.z(IIIZIZS)V")
    public static void method502(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class80 var8 = Statics.field1230[var6];
        Statics.field1230[var6] = Statics.field1230[arg1];
        Statics.field1230[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class80 var10 = Statics.field1230[var9];
            int var11 = method1626(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method1626(var10, var8, arg4, arg5);
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
                class80 var14 = Statics.field1230[var9];
                Statics.field1230[var9] = Statics.field1230[var7];
                Statics.field1230[var7++] = var14;
            }
        }
        Statics.field1230[arg1] = Statics.field1230[var7];
        Statics.field1230[var7] = var8;
        method502(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method502(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("cg.v(Lcw;Lcw;IZI)I")
    public static int method1626(class80 arg0, class80 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1224;
            int var5 = arg1.field1224;
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
            return arg0.field1217 - arg1.field1217;
        } else if (arg2 == 3) {
            if (arg0.field1226.equals("-")) {
                if (arg1.field1226.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1226.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1226.compareTo(arg1.field1226);
            }
        } else if (arg2 == 4) {
            return arg0.method1472() ? (arg1.method1472() ? 0 : 1) : (arg1.method1472() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1470() ? (arg1.method1470() ? 0 : 1) : (arg1.method1470() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1502() ? (arg1.method1502() ? 0 : 1) : (arg1.method1502() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1499() ? (arg1.method1499() ? 0 : 1) : (arg1.method1499() ? -1 : 0);
        } else {
            return arg0.field1222 - arg1.field1222;
        }
    }

    @ObfuscatedName("cw.m(B)Z")
    public boolean method1499() {
        return (0x1 & this.field1213) != 0;
    }

    @ObfuscatedName("cw.b(I)Z")
    public boolean method1470() {
        return (0x2 & this.field1213) != 0;
    }

    @ObfuscatedName("cw.t(I)Z")
    public boolean method1502() {
        return (0x4 & this.field1213) != 0;
    }

    @ObfuscatedName("cw.p(B)Z")
    public boolean method1472() {
        return (0x8 & this.field1213) != 0;
    }

    @ObfuscatedName("cw.r(B)Z")
    public boolean method1473() {
        return (0x20000000 & this.field1213) != 0;
    }

    @ObfuscatedName("cw.l(I)Z")
    public boolean method1474() {
        return (0x2000000 & this.field1213) != 0;
    }
}
