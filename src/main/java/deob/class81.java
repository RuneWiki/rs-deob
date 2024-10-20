package deob;

import java.net.URL;

@ObfuscatedName("cj")
public class class81 {

    @ObfuscatedName("cj.j")
    public static int field1018 = 0;

    @ObfuscatedName("cj.n")
    public static int field1015 = 0;

    @ObfuscatedName("cj.p")
    public static int[] field1016 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cj.l")
    public static int[] field1017 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cj.u")
    public int field1019;

    @ObfuscatedName("cj.e")
    public int field1020;

    @ObfuscatedName("cj.m")
    public int field1021;

    @ObfuscatedName("cj.c")
    public String field1022;

    @ObfuscatedName("cj.i")
    public String field1023;

    @ObfuscatedName("cj.f")
    public int field1024;

    @ObfuscatedName("cj.a")
    public int field1025;

    @ObfuscatedName("a.h(I)Z")
    public static boolean method135() {
        try {
            if (Statics.field1027 == null) {
                Statics.field1027 = Statics.field101.method3125(new URL(Statics.field76));
            } else if (Statics.field1027.method3139()) {
                byte[] var0 = Statics.field1027.method3140();
                class311 var1 = new class311(var0);
                var1.method5120();
                field1018 = var1.method5342();
                Statics.field1013 = new class81[field1018];
                int var2 = 0;
                while (var2 < field1018) {
                    class81 var3 = Statics.field1013[var2] = new class81();
                    var3.field1019 = var1.method5342();
                    var3.field1020 = var1.method5120();
                    var3.field1022 = var1.method5202();
                    var3.field1023 = var1.method5202();
                    var3.field1024 = var1.method5274();
                    var3.field1021 = var1.method5118();
                    var3.field1025 = var2++;
                }
                method2147(Statics.field1013, 0, Statics.field1013.length - 1, field1017, field1016);
                Statics.field1027 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1027 = null;
        }
        return false;
    }

    @ObfuscatedName("ie.v(III)V")
    public static void method4141(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1017[var5] != arg0) {
                var2[var4] = field1017[var5];
                var3[var4] = field1016[var5];
                var4++;
            }
        }
        field1017 = var2;
        field1016 = var3;
        method2147(Statics.field1013, 0, Statics.field1013.length - 1, field1017, field1016);
    }

    @ObfuscatedName("co.x([Lcj;II[I[II)V")
    public static void method2147(class81[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1025;
                        var12 = var8.field1025;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1021;
                        var12 = var8.field1021;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1680() ? 1 : 0;
                        var12 = var8.method1680() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1019;
                        var12 = var8.field1019;
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
                        var15 = arg0[var5].field1025;
                        var16 = var8.field1025;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1021;
                        var16 = var8.field1021;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1680() ? 1 : 0;
                        var16 = var8.method1680() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1019;
                        var16 = var8.field1019;
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
        method2147(arg0, arg1, var6, arg3, arg4);
        method2147(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("fa.w(IZIZI)V")
    public static void method3273(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1013 != null) {
            method230(0, Statics.field1013.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("d.t(IIIZIZI)V")
    public static void method230(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class81 var8 = Statics.field1013[var6];
        Statics.field1013[var6] = Statics.field1013[arg1];
        Statics.field1013[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class81 var10 = Statics.field1013[var9];
            int var11 = method1145(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method1145(var10, var8, arg4, arg5);
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
                class81 var14 = Statics.field1013[var9];
                Statics.field1013[var9] = Statics.field1013[var7];
                Statics.field1013[var7++] = var14;
            }
        }
        Statics.field1013[arg1] = Statics.field1013[var7];
        Statics.field1013[var7] = var8;
        method230(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method230(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("bv.j(Lcj;Lcj;IZI)I")
    public static int method1145(class81 arg0, class81 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1021;
            int var5 = arg1.field1021;
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
            return arg0.field1024 - arg1.field1024;
        } else if (arg2 == 3) {
            if (arg0.field1023.equals("-")) {
                if (arg1.field1023.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1023.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1023.compareTo(arg1.field1023);
            }
        } else if (arg2 == 4) {
            return arg0.method1683() ? (arg1.method1683() ? 0 : 1) : (arg1.method1683() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1681() ? (arg1.method1681() ? 0 : 1) : (arg1.method1681() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1682() ? (arg1.method1682() ? 0 : 1) : (arg1.method1682() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1680() ? (arg1.method1680() ? 0 : 1) : (arg1.method1680() ? -1 : 0);
        } else {
            return arg0.field1019 - arg1.field1019;
        }
    }

    @ObfuscatedName("ii.n(I)Lcj;")
    public static class81 method3811() {
        field1015 = 0;
        return method123();
    }

    @ObfuscatedName("f.p(I)Lcj;")
    public static class81 method123() {
        return field1015 < field1018 ? Statics.field1013[++field1015 - 1] : null;
    }

    @ObfuscatedName("cj.l(B)Z")
    public boolean method1680() {
        return (0x1 & this.field1020) != 0;
    }

    @ObfuscatedName("cj.z(I)Z")
    public boolean method1681() {
        return (0x2 & this.field1020) != 0;
    }

    @ObfuscatedName("cj.u(I)Z")
    public boolean method1682() {
        return (0x4 & this.field1020) != 0;
    }

    @ObfuscatedName("cj.e(I)Z")
    public boolean method1683() {
        return (0x8 & this.field1020) != 0;
    }

    @ObfuscatedName("cj.m(B)Z")
    public boolean method1684() {
        return (0x20000000 & this.field1020) != 0;
    }

    @ObfuscatedName("cj.c(I)Z")
    public boolean method1685() {
        return (0x2000000 & this.field1020) != 0;
    }

    @ObfuscatedName("cj.i(B)Z")
    public boolean method1697() {
        return (0x40000000 & this.field1020) != 0;
    }
}
