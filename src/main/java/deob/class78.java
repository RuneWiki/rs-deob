package deob;

import java.net.URL;

@ObfuscatedName("bd")
public class class78 {

    @ObfuscatedName("bd.b")
    public static int field1208 = 0;

    @ObfuscatedName("bd.e")
    public static int field1212 = 0;

    @ObfuscatedName("bd.x")
    public static int[] field1205 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bd.p")
    public static int[] field1211 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bd.n")
    public int field1213;

    @ObfuscatedName("bd.o")
    public int field1217;

    @ObfuscatedName("bd.c")
    public int field1215;

    @ObfuscatedName("bd.v")
    public String field1209;

    @ObfuscatedName("bd.u")
    public String field1218;

    @ObfuscatedName("bd.j")
    public int field1210;

    @ObfuscatedName("bd.k")
    public int field1219;

    @ObfuscatedName("ex.t(I)Z")
    public static boolean method2920() {
        try {
            if (Statics.field1214 == null) {
                Statics.field1214 = Statics.field573.method2834(new URL(Statics.field291));
            } else if (Statics.field1214.method2849()) {
                byte[] var0 = Statics.field1214.method2848();
                class195 var1 = new class195(var0);
                var1.method3241();
                field1208 = var1.method3238();
                Statics.field1207 = new class78[field1208];
                int var2 = 0;
                while (var2 < field1208) {
                    class78 var3 = Statics.field1207[var2] = new class78();
                    var3.field1213 = var1.method3238();
                    var3.field1217 = var1.method3241();
                    var3.field1209 = var1.method3257();
                    var3.field1218 = var1.method3257();
                    var3.field1210 = var1.method3236();
                    var3.field1215 = var1.method3239();
                    var3.field1219 = var2++;
                }
                method2372(Statics.field1207, 0, Statics.field1207.length - 1, field1211, field1205);
                Statics.field1214 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1214 = null;
        }
        return false;
    }

    @ObfuscatedName("bl.q(III)V")
    public static void method1510(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1211[var5] != arg0) {
                var2[var4] = field1211[var5];
                var3[var4] = field1205[var5];
                var4++;
            }
        }
        field1211 = var2;
        field1205 = var3;
        method2372(Statics.field1207, 0, Statics.field1207.length - 1, field1211, field1205);
    }

    @ObfuscatedName("dx.i([Lbd;II[I[II)V")
    public static void method2372(class78[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class78 var8 = arg0[var7];
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
                        var11 = arg0[var6].field1215;
                        var12 = var8.field1215;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1549() ? 1 : 0;
                        var12 = var8.method1549() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1213;
                        var12 = var8.field1213;
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
                        var15 = arg0[var5].field1215;
                        var16 = var8.field1215;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1549() ? 1 : 0;
                        var16 = var8.method1549() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1213;
                        var16 = var8.field1213;
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
                class78 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2372(arg0, arg1, var6, arg3, arg4);
        method2372(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("k.a(IZIZB)V")
    public static void method105(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1207 != null) {
            method247(0, Statics.field1207.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ae.l(IIIZIZI)V")
    public static void method247(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class78 var8 = Statics.field1207[var6];
        Statics.field1207[var6] = Statics.field1207[arg1];
        Statics.field1207[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class78 var10 = Statics.field1207[var9];
            int var11 = method42(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method42(var10, var8, arg4, arg5);
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
                class78 var14 = Statics.field1207[var9];
                Statics.field1207[var9] = Statics.field1207[var7];
                Statics.field1207[var7++] = var14;
            }
        }
        Statics.field1207[arg1] = Statics.field1207[var7];
        Statics.field1207[var7] = var8;
        method247(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method247(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("g.b(Lbd;Lbd;IZB)I")
    public static int method42(class78 arg0, class78 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1215;
            int var5 = arg1.field1215;
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
            return arg0.field1210 - arg1.field1210;
        } else if (arg2 == 3) {
            if (arg0.field1218.equals("-")) {
                if (arg1.field1218.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1218.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1218.compareTo(arg1.field1218);
            }
        } else if (arg2 == 4) {
            return arg0.method1534() ? (arg1.method1534() ? 0 : 1) : (arg1.method1534() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1536() ? (arg1.method1536() ? 0 : 1) : (arg1.method1536() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1532() ? (arg1.method1532() ? 0 : 1) : (arg1.method1532() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1549() ? (arg1.method1549() ? 0 : 1) : (arg1.method1549() ? -1 : 0);
        } else {
            return arg0.field1213 - arg1.field1213;
        }
    }

    @ObfuscatedName("cw.e(I)Lbd;")
    public static class78 method1736() {
        return field1212 < field1208 ? Statics.field1207[++field1212 - 1] : null;
    }

    @ObfuscatedName("bd.x(I)Z")
    public boolean method1549() {
        return (0x1 & this.field1217) != 0;
    }

    @ObfuscatedName("bd.p(B)Z")
    public boolean method1536() {
        return (0x2 & this.field1217) != 0;
    }

    @ObfuscatedName("bd.o(I)Z")
    public boolean method1532() {
        return (0x4 & this.field1217) != 0;
    }

    @ObfuscatedName("bd.c(I)Z")
    public boolean method1534() {
        return (0x8 & this.field1217) != 0;
    }

    @ObfuscatedName("bd.u(I)Z")
    public boolean method1531() {
        return (0x20000000 & this.field1217) != 0;
    }

    @ObfuscatedName("bd.k(I)Z")
    public boolean method1535() {
        return (0x2000000 & this.field1217) != 0;
    }
}
