package deob;

import java.net.URL;

@ObfuscatedName("bi")
public class class77 {

    @ObfuscatedName("bi.a")
    public static int field1171 = 0;

    @ObfuscatedName("bi.t")
    public static int field1177 = 0;

    @ObfuscatedName("bi.r")
    public static int[] field1172 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bi.m")
    public static int[] field1174 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bi.o")
    public int field1175;

    @ObfuscatedName("bi.x")
    public int field1173;

    @ObfuscatedName("bi.q")
    public int field1178;

    @ObfuscatedName("bi.v")
    public String field1179;

    @ObfuscatedName("bi.n")
    public String field1176;

    @ObfuscatedName("bi.y")
    public int field1180;

    @ObfuscatedName("bi.d")
    public int field1181;

    @ObfuscatedName("co.p(B)Z")
    public static boolean method1769() {
        try {
            if (Statics.field3225 == null) {
                Statics.field3225 = Statics.field722.method2810(new URL(Statics.field829));
            } else if (Statics.field3225.method2821()) {
                byte[] var0 = Statics.field3225.method2820();
                class185 var1 = new class185(var0);
                var1.method3127();
                field1171 = var1.method3124();
                Statics.field1322 = new class77[field1171];
                int var2 = 0;
                while (var2 < field1171) {
                    class77 var3 = Statics.field1322[var2] = new class77();
                    var3.field1175 = var1.method3124();
                    var3.field1173 = var1.method3127();
                    var3.field1179 = var1.method3131();
                    var3.field1176 = var1.method3131();
                    var3.field1180 = var1.method3197();
                    var3.field1178 = var1.method3125();
                    var3.field1181 = var2++;
                }
                method990(Statics.field1322, 0, Statics.field1322.length - 1, field1174, field1172);
                Statics.field3225 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field3225 = null;
        }
        return false;
    }

    @ObfuscatedName("a.i(III)V")
    public static void method23(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1174[var5] != arg0) {
                var2[var4] = field1174[var5];
                var3[var4] = field1172[var5];
                var4++;
            }
        }
        field1174 = var2;
        field1172 = var3;
        method990(Statics.field1322, 0, Statics.field1322.length - 1, field1174, field1172);
    }

    @ObfuscatedName("bk.w([Lbi;II[I[II)V")
    public static void method990(class77[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1181;
                        var12 = var8.field1181;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1178;
                        var12 = var8.field1178;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1492() ? 1 : 0;
                        var12 = var8.method1492() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1175;
                        var12 = var8.field1175;
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
                        var15 = arg0[var5].field1181;
                        var16 = var8.field1181;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1178;
                        var16 = var8.field1178;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1492() ? 1 : 0;
                        var16 = var8.method1492() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1175;
                        var16 = var8.field1175;
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
        method990(arg0, arg1, var6, arg3, arg4);
        method990(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("eb.s(IIIZIZI)V")
    public static void method2799(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class77 var8 = Statics.field1322[var6];
        Statics.field1322[var6] = Statics.field1322[arg1];
        Statics.field1322[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class77 var10 = Statics.field1322[var9];
            int var11 = method126(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method126(var10, var8, arg4, arg5);
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
                class77 var14 = Statics.field1322[var9];
                Statics.field1322[var9] = Statics.field1322[var7];
                Statics.field1322[var7++] = var14;
            }
        }
        Statics.field1322[arg1] = Statics.field1322[var7];
        Statics.field1322[var7] = var8;
        method2799(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2799(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("l.j(Lbi;Lbi;IZI)I")
    public static int method126(class77 arg0, class77 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1178;
            int var5 = arg1.field1178;
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
            return arg0.field1180 - arg1.field1180;
        } else if (arg2 == 3) {
            if (arg0.field1176.equals("-")) {
                if (arg1.field1176.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1176.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1176.compareTo(arg1.field1176);
            }
        } else if (arg2 == 4) {
            return arg0.method1495() ? (arg1.method1495() ? 0 : 1) : (arg1.method1495() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1493() ? (arg1.method1493() ? 0 : 1) : (arg1.method1493() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1494() ? (arg1.method1494() ? 0 : 1) : (arg1.method1494() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1492() ? (arg1.method1492() ? 0 : 1) : (arg1.method1492() ? -1 : 0);
        } else {
            return arg0.field1175 - arg1.field1175;
        }
    }

    @ObfuscatedName("bn.a(I)Lbi;")
    public static class77 method891() {
        return field1177 < field1171 ? Statics.field1322[++field1177 - 1] : null;
    }

    @ObfuscatedName("bi.t(S)Z")
    public boolean method1492() {
        return (0x1 & this.field1173) != 0;
    }

    @ObfuscatedName("bi.r(I)Z")
    public boolean method1493() {
        return (0x2 & this.field1173) != 0;
    }

    @ObfuscatedName("bi.m(I)Z")
    public boolean method1494() {
        return (0x4 & this.field1173) != 0;
    }

    @ObfuscatedName("bi.h(I)Z")
    public boolean method1495() {
        return (0x8 & this.field1173) != 0;
    }

    @ObfuscatedName("bi.o(B)Z")
    public boolean method1529() {
        return (0x20000000 & this.field1173) != 0;
    }

    @ObfuscatedName("bi.x(I)Z")
    public boolean method1505() {
        return (0x2000000 & this.field1173) != 0;
    }
}
