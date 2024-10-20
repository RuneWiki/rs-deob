package deob;

import java.net.URL;

@ObfuscatedName("be")
public class class67 {

    @ObfuscatedName("be.l")
    public static int field1014 = 0;

    @ObfuscatedName("be.b")
    public static int field1015 = 0;

    @ObfuscatedName("be.w")
    public static int[] field1019 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("be.n")
    public static int[] field1017 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("be.p")
    public int field1016;

    @ObfuscatedName("be.m")
    public int field1009;

    @ObfuscatedName("be.d")
    public int field1021;

    @ObfuscatedName("be.j")
    public String field1020;

    @ObfuscatedName("be.x")
    public String field1023;

    @ObfuscatedName("be.v")
    public int field1022;

    @ObfuscatedName("be.h")
    public int field1025;

    @ObfuscatedName("m.g(I)Z")
    public static boolean method122() {
        try {
            if (Statics.field1011 == null) {
                Statics.field1011 = Statics.field353.method3054(new URL(Statics.field1497));
            } else if (Statics.field1011.method3062()) {
                byte[] var0 = Statics.field1011.method3057();
                class185 var1 = new class185(var0);
                var1.method3588();
                field1014 = var1.method3467();
                Statics.field1018 = new class67[field1014];
                int var2 = 0;
                while (var2 < field1014) {
                    class67 var3 = Statics.field1018[var2] = new class67();
                    var3.field1016 = var1.method3467();
                    var3.field1009 = var1.method3588();
                    var3.field1020 = var1.method3474();
                    var3.field1023 = var1.method3474();
                    var3.field1022 = var1.method3679();
                    var3.field1021 = var1.method3510();
                    var3.field1025 = var2++;
                }
                method5461(Statics.field1018, 0, Statics.field1018.length - 1, field1017, field1019);
                Statics.field1011 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1011 = null;
        }
        return false;
    }

    @ObfuscatedName("am.r(III)V")
    public static void method739(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1017[var5] != arg0) {
                var2[var4] = field1017[var5];
                var3[var4] = field1019[var5];
                var4++;
            }
        }
        field1017 = var2;
        field1019 = var3;
        method5461(Statics.field1018, 0, Statics.field1018.length - 1, field1017, field1019);
    }

    @ObfuscatedName("kk.e([Lbe;II[I[II)V")
    public static void method5461(class67[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class67 var8 = arg0[var7];
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
                        var11 = arg0[var6].method1577() ? 1 : 0;
                        var12 = var8.method1577() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1016;
                        var12 = var8.field1016;
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
                        var15 = arg0[var5].method1577() ? 1 : 0;
                        var16 = var8.method1577() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1016;
                        var16 = var8.field1016;
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
                class67 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method5461(arg0, arg1, var6, arg3, arg4);
        method5461(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("bv.q(IZIZI)V")
    public static void method1038(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1018 != null) {
            method5081(0, Statics.field1018.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("jn.c(IIIZIZI)V")
    public static void method5081(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class67 var8 = Statics.field1018[var6];
        Statics.field1018[var6] = Statics.field1018[arg1];
        Statics.field1018[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class67 var10 = Statics.field1018[var9];
            int var11 = method3041(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method3041(var10, var8, arg4, arg5);
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
                class67 var14 = Statics.field1018[var9];
                Statics.field1018[var9] = Statics.field1018[var7];
                Statics.field1018[var7++] = var14;
            }
        }
        Statics.field1018[arg1] = Statics.field1018[var7];
        Statics.field1018[var7] = var8;
        method5081(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method5081(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("eu.i(Lbe;Lbe;IZI)I")
    public static int method3041(class67 arg0, class67 arg1, int arg2, boolean arg3) {
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
            return arg0.field1022 - arg1.field1022;
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
            return arg0.method1624() ? (arg1.method1624() ? 0 : 1) : (arg1.method1624() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1627() ? (arg1.method1627() ? 0 : 1) : (arg1.method1627() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1580() ? (arg1.method1580() ? 0 : 1) : (arg1.method1580() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1577() ? (arg1.method1577() ? 0 : 1) : (arg1.method1577() ? -1 : 0);
        } else {
            return arg0.field1016 - arg1.field1016;
        }
    }

    @ObfuscatedName("g.p(I)Lbe;")
    public static class67 method3() {
        field1015 = 0;
        return method209();
    }

    @ObfuscatedName("f.m(B)Lbe;")
    public static class67 method209() {
        return field1015 < field1014 ? Statics.field1018[++field1015 - 1] : null;
    }

    @ObfuscatedName("be.d(I)Z")
    public boolean method1577() {
        return (0x1 & this.field1009) != 0;
    }

    @ObfuscatedName("be.j(S)Z")
    public boolean method1627() {
        return (0x2 & this.field1009) != 0;
    }

    @ObfuscatedName("be.x(B)Z")
    public boolean method1580() {
        return (0x4 & this.field1009) != 0;
    }

    @ObfuscatedName("be.v(I)Z")
    public boolean method1624() {
        return (0x8 & this.field1009) != 0;
    }

    @ObfuscatedName("be.h(I)Z")
    public boolean method1582() {
        return (0x20000000 & this.field1009) != 0;
    }

    @ObfuscatedName("be.f(I)Z")
    public boolean method1579() {
        return (0x2000000 & this.field1009) != 0;
    }
}
