package deob;

import java.net.URL;

@ObfuscatedName("cg")
public class class80 {

    @ObfuscatedName("cg.f")
    public static int field1216 = 0;

    @ObfuscatedName("cg.u")
    public static int field1217 = 0;

    @ObfuscatedName("cg.t")
    public static int[] field1218 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cg.k")
    public static int[] field1212 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cg.d")
    public int field1220;

    @ObfuscatedName("cg.o")
    public int field1223;

    @ObfuscatedName("cg.a")
    public int field1222;

    @ObfuscatedName("cg.q")
    public String field1224;

    @ObfuscatedName("cg.j")
    public String field1227;

    @ObfuscatedName("cg.m")
    public int field1215;

    @ObfuscatedName("cg.h")
    public int field1219;

    @ObfuscatedName("be.b(B)Z")
    public static boolean method881() {
        try {
            if (Statics.field1572 == null) {
                Statics.field1572 = Statics.field3332.method2679(new URL(Statics.field1140));
            } else if (Statics.field1572.method2696()) {
                byte[] var0 = Statics.field1572.method2699();
                class181 var1 = new class181(var0);
                var1.method2996();
                field1216 = var1.method3081();
                Statics.field623 = new class80[field1216];
                int var2 = 0;
                while (var2 < field1216) {
                    class80 var3 = Statics.field623[var2] = new class80();
                    var3.field1220 = var1.method3081();
                    var3.field1223 = var1.method2996();
                    var3.field1224 = var1.method2953();
                    var3.field1227 = var1.method2953();
                    var3.field1215 = var1.method2945();
                    var3.field1222 = var1.method3050();
                    var3.field1219 = var2++;
                }
                method977(Statics.field623, 0, Statics.field623.length - 1, field1212, field1218);
                Statics.field1572 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1572 = null;
        }
        return false;
    }

    @ObfuscatedName("at.s(IIB)V")
    public static void method444(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1212[var5] != arg0) {
                var2[var4] = field1212[var5];
                var3[var4] = field1218[var5];
                var4++;
            }
        }
        field1212 = var2;
        field1218 = var3;
        method977(Statics.field623, 0, Statics.field623.length - 1, field1212, field1218);
    }

    @ObfuscatedName("bu.r([Lcg;II[I[II)V")
    public static void method977(class80[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1219;
                        var12 = var8.field1219;
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
                        var11 = arg0[var6].method1402() ? 1 : 0;
                        var12 = var8.method1402() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1220;
                        var12 = var8.field1220;
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
                        var15 = arg0[var5].field1219;
                        var16 = var8.field1219;
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
                        var15 = arg0[var5].method1402() ? 1 : 0;
                        var16 = var8.method1402() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1220;
                        var16 = var8.field1220;
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
        method977(arg0, arg1, var6, arg3, arg4);
        method977(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("hy.x(Lcg;Lcg;IZIZI)I")
    public static int method3678(class80 arg0, class80 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method322(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method322(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("ao.f(Lcg;Lcg;IZB)I")
    public static int method322(class80 arg0, class80 arg1, int arg2, boolean arg3) {
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
            return arg0.field1215 - arg1.field1215;
        } else if (arg2 == 3) {
            if (arg0.field1227.equals("-")) {
                if (arg1.field1227.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1227.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1227.compareTo(arg1.field1227);
            }
        } else if (arg2 == 4) {
            return arg0.method1435() ? (arg1.method1435() ? 0 : 1) : (arg1.method1435() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1403() ? (arg1.method1403() ? 0 : 1) : (arg1.method1403() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1405() ? (arg1.method1405() ? 0 : 1) : (arg1.method1405() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1402() ? (arg1.method1402() ? 0 : 1) : (arg1.method1402() ? -1 : 0);
        } else {
            return arg0.field1220 - arg1.field1220;
        }
    }

    @ObfuscatedName("e.u(I)Lcg;")
    public static class80 method161() {
        field1217 = 0;
        return method449();
    }

    @ObfuscatedName("as.t(I)Lcg;")
    public static class80 method449() {
        return field1217 < field1216 ? Statics.field623[++field1217 - 1] : null;
    }

    @ObfuscatedName("cg.k(I)Z")
    public boolean method1402() {
        return (0x1 & this.field1223) != 0;
    }

    @ObfuscatedName("cg.n(I)Z")
    public boolean method1403() {
        return (0x2 & this.field1223) != 0;
    }

    @ObfuscatedName("cg.d(B)Z")
    public boolean method1405() {
        return (0x4 & this.field1223) != 0;
    }

    @ObfuscatedName("cg.o(B)Z")
    public boolean method1435() {
        return (0x8 & this.field1223) != 0;
    }

    @ObfuscatedName("cg.a(I)Z")
    public boolean method1406() {
        return (0x20000000 & this.field1223) != 0;
    }

    @ObfuscatedName("cg.q(B)Z")
    public boolean method1407() {
        return (0x2000000 & this.field1223) != 0;
    }
}
