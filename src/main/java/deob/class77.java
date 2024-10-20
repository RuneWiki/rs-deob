package deob;

import java.net.URL;

@ObfuscatedName("bs")
public class class77 {

    @ObfuscatedName("bs.w")
    public static int field1185 = 0;

    @ObfuscatedName("bs.t")
    public static int field1186 = 0;

    @ObfuscatedName("bs.d")
    public static int[] field1187 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bs.z")
    public static int[] field1188 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bs.c")
    public int field1189;

    @ObfuscatedName("bs.o")
    public int field1190;

    @ObfuscatedName("bs.l")
    public int field1191;

    @ObfuscatedName("bs.f")
    public String field1192;

    @ObfuscatedName("bs.q")
    public String field1182;

    @ObfuscatedName("bs.r")
    public int field1194;

    @ObfuscatedName("bs.x")
    public int field1195;

    @ObfuscatedName("ac.s(B)Z")
    public static boolean method644() {
        try {
            if (Statics.field2165 == null) {
                Statics.field2165 = Statics.field1270.method2936(new URL(Statics.field847));
            } else if (Statics.field2165.method2943()) {
                byte[] var0 = Statics.field2165.method2950();
                class185 var1 = new class185(var0);
                var1.method3292();
                field1185 = var1.method3241();
                Statics.field423 = new class77[field1185];
                int var2 = 0;
                while (var2 < field1185) {
                    class77 var3 = Statics.field423[var2] = new class77();
                    var3.field1189 = var1.method3241();
                    var3.field1190 = var1.method3292();
                    var3.field1192 = var1.method3248();
                    var3.field1182 = var1.method3248();
                    var3.field1194 = var1.method3239();
                    var3.field1191 = var1.method3221();
                    var3.field1195 = var2++;
                }
                method3150(Statics.field423, 0, Statics.field423.length - 1, field1188, field1187);
                Statics.field2165 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2165 = null;
        }
        return false;
    }

    @ObfuscatedName("ba.g(III)V")
    public static void method957(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1188[var5] != arg0) {
                var2[var4] = field1188[var5];
                var3[var4] = field1187[var5];
                var4++;
            }
        }
        field1188 = var2;
        field1187 = var3;
        method3150(Statics.field423, 0, Statics.field423.length - 1, field1188, field1187);
    }

    @ObfuscatedName("fe.m([Lbs;II[I[II)V")
    public static void method3150(class77[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class77 var8 = arg0[var7];
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
                        var11 = arg0[var6].field1195;
                        var12 = var8.field1195;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1191;
                        var12 = var8.field1191;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1505() ? 1 : 0;
                        var12 = var8.method1505() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1189;
                        var12 = var8.field1189;
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
                        var15 = arg0[var5].field1195;
                        var16 = var8.field1195;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1191;
                        var16 = var8.field1191;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1505() ? 1 : 0;
                        var16 = var8.method1505() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1189;
                        var16 = var8.field1189;
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
                class77 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method3150(arg0, arg1, var6, arg3, arg4);
        method3150(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("gl.h(IIIZIZS)V")
    public static void method3495(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class77 var8 = Statics.field423[var6];
        Statics.field423[var6] = Statics.field423[arg1];
        Statics.field423[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class77 var10 = Statics.field423[var9];
            int var11 = method938(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method938(var10, var8, arg4, arg5);
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
                class77 var14 = Statics.field423[var9];
                Statics.field423[var9] = Statics.field423[var7];
                Statics.field423[var7++] = var14;
            }
        }
        Statics.field423[arg1] = Statics.field423[var7];
        Statics.field423[var7] = var8;
        method3495(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method3495(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("bv.i(Lbs;Lbs;IZI)I")
    public static int method938(class77 arg0, class77 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1191;
            int var5 = arg1.field1191;
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
            return arg0.field1194 - arg1.field1194;
        } else if (arg2 == 3) {
            if (arg0.field1182.equals("-")) {
                if (arg1.field1182.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1182.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1182.compareTo(arg1.field1182);
            }
        } else if (arg2 == 4) {
            return arg0.method1508() ? (arg1.method1508() ? 0 : 1) : (arg1.method1508() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1540() ? (arg1.method1540() ? 0 : 1) : (arg1.method1540() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1519() ? (arg1.method1519() ? 0 : 1) : (arg1.method1519() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1505() ? (arg1.method1505() ? 0 : 1) : (arg1.method1505() ? -1 : 0);
        } else {
            return arg0.field1189 - arg1.field1189;
        }
    }

    @ObfuscatedName("f.w(I)Lbs;")
    public static class77 method71() {
        field1186 = 0;
        return method4179();
    }

    @ObfuscatedName("ih.t(I)Lbs;")
    public static class77 method4179() {
        return field1186 < field1185 ? Statics.field423[++field1186 - 1] : null;
    }

    @ObfuscatedName("bs.d(I)Z")
    public boolean method1505() {
        return (0x1 & this.field1190) != 0;
    }

    @ObfuscatedName("bs.z(B)Z")
    public boolean method1540() {
        return (0x2 & this.field1190) != 0;
    }

    @ObfuscatedName("bs.k(I)Z")
    public boolean method1519() {
        return (0x4 & this.field1190) != 0;
    }

    @ObfuscatedName("bs.c(I)Z")
    public boolean method1508() {
        return (0x8 & this.field1190) != 0;
    }

    @ObfuscatedName("bs.o(S)Z")
    public boolean method1538() {
        return (0x20000000 & this.field1190) != 0;
    }

    @ObfuscatedName("bs.l(I)Z")
    public boolean method1511() {
        return (0x2000000 & this.field1190) != 0;
    }
}
