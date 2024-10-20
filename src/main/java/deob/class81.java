package deob;

import java.net.URL;

@ObfuscatedName("ch")
public class class81 {

    @ObfuscatedName("ch.v")
    public static int field1045 = 0;

    @ObfuscatedName("ch.q")
    public static int field1046 = 0;

    @ObfuscatedName("ch.z")
    public static int[] field1049 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ch.t")
    public static int[] field1048 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ch.s")
    public int field1041;

    @ObfuscatedName("ch.p")
    public int field1050;

    @ObfuscatedName("ch.n")
    public int field1051;

    @ObfuscatedName("ch.u")
    public String field1052;

    @ObfuscatedName("ch.h")
    public String field1053;

    @ObfuscatedName("ch.g")
    public int field1054;

    @ObfuscatedName("ch.i")
    public int field1055;

    @ObfuscatedName("gl.x(I)Z")
    public static boolean method3426() {
        try {
            if (Statics.field2319 == null) {
                Statics.field2319 = Statics.field277.method3125(new URL(Statics.field2391));
            } else if (Statics.field2319.method3131()) {
                byte[] var0 = Statics.field2319.method3134();
                class310 var1 = new class310(var0);
                var1.method5142();
                field1045 = var1.method5139();
                Statics.field3838 = new class81[field1045];
                int var2 = 0;
                while (var2 < field1045) {
                    class81 var3 = Statics.field3838[var2] = new class81();
                    var3.field1041 = var1.method5139();
                    var3.field1050 = var1.method5142();
                    var3.field1052 = var1.method5257();
                    var3.field1053 = var1.method5257();
                    var3.field1054 = var1.method5137();
                    var3.field1051 = var1.method5140();
                    var3.field1055 = var2++;
                }
                method3199(Statics.field3838, 0, Statics.field3838.length - 1, field1048, field1049);
                Statics.field2319 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2319 = null;
        }
        return false;
    }

    @ObfuscatedName("fd.k([Lch;II[I[II)V")
    public static void method3199(class81[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1055;
                        var12 = var8.field1055;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1051;
                        var12 = var8.field1051;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1718() ? 1 : 0;
                        var12 = var8.method1718() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1041;
                        var12 = var8.field1041;
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
                        var15 = arg0[var5].field1055;
                        var16 = var8.field1055;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1051;
                        var16 = var8.field1051;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1718() ? 1 : 0;
                        var16 = var8.method1718() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1041;
                        var16 = var8.field1041;
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
        method3199(arg0, arg1, var6, arg3, arg4);
        method3199(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("bi.d(IZIZI)V")
    public static void method1228(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field3838 != null) {
            method3099(0, Statics.field3838.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ed.w(IIIZIZB)V")
    public static void method3099(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class81 var8 = Statics.field3838[var6];
        Statics.field3838[var6] = Statics.field3838[arg1];
        Statics.field3838[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class81 var10 = Statics.field3838[var9];
            int var11 = method789(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method789(var10, var8, arg4, arg5);
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
                class81 var14 = Statics.field3838[var9];
                Statics.field3838[var9] = Statics.field3838[var7];
                Statics.field3838[var7++] = var14;
            }
        }
        Statics.field3838[arg1] = Statics.field3838[var7];
        Statics.field3838[var7] = var8;
        method3099(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method3099(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("bd.v(Lch;Lch;IZB)I")
    public static int method789(class81 arg0, class81 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1051;
            int var5 = arg1.field1051;
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
            return arg0.field1054 - arg1.field1054;
        } else if (arg2 == 3) {
            if (arg0.field1053.equals("-")) {
                if (arg1.field1053.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1053.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1053.compareTo(arg1.field1053);
            }
        } else if (arg2 == 4) {
            return arg0.method1689() ? (arg1.method1689() ? 0 : 1) : (arg1.method1689() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1687() ? (arg1.method1687() ? 0 : 1) : (arg1.method1687() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1688() ? (arg1.method1688() ? 0 : 1) : (arg1.method1688() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1718() ? (arg1.method1718() ? 0 : 1) : (arg1.method1718() ? -1 : 0);
        } else {
            return arg0.field1041 - arg1.field1041;
        }
    }

    @ObfuscatedName("al.q(I)Lch;")
    public static class81 method365() {
        field1046 = 0;
        return method1028();
    }

    @ObfuscatedName("bq.z(I)Lch;")
    public static class81 method1028() {
        return field1046 < field1045 ? Statics.field3838[++field1046 - 1] : null;
    }

    @ObfuscatedName("ch.t(B)Z")
    public boolean method1718() {
        return (0x1 & this.field1050) != 0;
    }

    @ObfuscatedName("ch.e(I)Z")
    public boolean method1687() {
        return (0x2 & this.field1050) != 0;
    }

    @ObfuscatedName("ch.s(I)Z")
    public boolean method1688() {
        return (0x4 & this.field1050) != 0;
    }

    @ObfuscatedName("ch.p(B)Z")
    public boolean method1689() {
        return (0x8 & this.field1050) != 0;
    }

    @ObfuscatedName("ch.n(I)Z")
    public boolean method1690() {
        return (0x20000000 & this.field1050) != 0;
    }

    @ObfuscatedName("ch.u(I)Z")
    public boolean method1691() {
        return (0x2000000 & this.field1050) != 0;
    }

    @ObfuscatedName("ch.h(B)Z")
    public boolean method1697() {
        return (0x40000000 & this.field1050) != 0;
    }
}
