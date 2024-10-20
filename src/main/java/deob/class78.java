package deob;

import java.net.URL;

@ObfuscatedName("bx")
public class class78 {

    @ObfuscatedName("bx.l")
    public static int field1216 = 0;

    @ObfuscatedName("bx.s")
    public static int field1212 = 0;

    @ObfuscatedName("bx.y")
    public static int[] field1211 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bx.c")
    public static int[] field1214 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bx.i")
    public int field1215;

    @ObfuscatedName("bx.o")
    public int field1208;

    @ObfuscatedName("bx.d")
    public int field1217;

    @ObfuscatedName("bx.r")
    public String field1221;

    @ObfuscatedName("bx.p")
    public String field1219;

    @ObfuscatedName("bx.q")
    public int field1220;

    @ObfuscatedName("bx.f")
    public int field1213;

    @ObfuscatedName("bg.g(I)Z")
    public static boolean method1068() {
        try {
            if (Statics.field370 == null) {
                Statics.field370 = Statics.field13.method2942(new URL(Statics.field532));
            } else if (Statics.field370.method2949()) {
                byte[] var0 = Statics.field370.method2956();
                class195 var1 = new class195(var0);
                var1.method3472();
                field1216 = var1.method3310();
                Statics.field2216 = new class78[field1216];
                int var2 = 0;
                while (var2 < field1216) {
                    class78 var3 = Statics.field2216[var2] = new class78();
                    var3.field1215 = var1.method3310();
                    var3.field1208 = var1.method3472();
                    var3.field1221 = var1.method3429();
                    var3.field1219 = var1.method3429();
                    var3.field1220 = var1.method3332();
                    var3.field1217 = var1.method3414();
                    var3.field1213 = var2++;
                }
                method1605(Statics.field2216, 0, Statics.field2216.length - 1, field1214, field1211);
                Statics.field370 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field370 = null;
        }
        return false;
    }

    @ObfuscatedName("ai.e(IIS)V")
    public static void method207(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1214[var5] != arg0) {
                var2[var4] = field1214[var5];
                var3[var4] = field1211[var5];
                var4++;
            }
        }
        field1214 = var2;
        field1211 = var3;
        method1605(Statics.field2216, 0, Statics.field2216.length - 1, field1214, field1211);
    }

    @ObfuscatedName("bv.b([Lbx;II[I[II)V")
    public static void method1605(class78[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1213;
                        var12 = var8.field1213;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1217;
                        var12 = var8.field1217;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1608() ? 1 : 0;
                        var12 = var8.method1608() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1215;
                        var12 = var8.field1215;
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
                        var15 = arg0[var5].field1213;
                        var16 = var8.field1213;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1217;
                        var16 = var8.field1217;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1608() ? 1 : 0;
                        var16 = var8.method1608() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1215;
                        var16 = var8.field1215;
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
        method1605(arg0, arg1, var6, arg3, arg4);
        method1605(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("av.z(IIIZIZI)V")
    public static void method331(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class78 var8 = Statics.field2216[var6];
        Statics.field2216[var6] = Statics.field2216[arg1];
        Statics.field2216[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method5306(Statics.field2216[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class78 var10 = Statics.field2216[var9];
                Statics.field2216[var9] = Statics.field2216[var7];
                Statics.field2216[var7++] = var10;
            }
        }
        Statics.field2216[arg1] = Statics.field2216[var7];
        Statics.field2216[var7] = var8;
        method331(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method331(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("lp.n(Lbx;Lbx;IZIZB)I")
    public static int method5306(class78 arg0, class78 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method1069(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method1069(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("bg.l(Lbx;Lbx;IZI)I")
    public static int method1069(class78 arg0, class78 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1217;
            int var5 = arg1.field1217;
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
            return arg0.field1220 - arg1.field1220;
        } else if (arg2 == 3) {
            if (arg0.field1219.equals("-")) {
                if (arg1.field1219.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1219.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1219.compareTo(arg1.field1219);
            }
        } else if (arg2 == 4) {
            return arg0.method1642() ? (arg1.method1642() ? 0 : 1) : (arg1.method1642() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1609() ? (arg1.method1609() ? 0 : 1) : (arg1.method1609() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1610() ? (arg1.method1610() ? 0 : 1) : (arg1.method1610() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1608() ? (arg1.method1608() ? 0 : 1) : (arg1.method1608() ? -1 : 0);
        } else {
            return arg0.field1215 - arg1.field1215;
        }
    }

    @ObfuscatedName("bx.s(I)Z")
    public boolean method1608() {
        return (0x1 & this.field1208) != 0;
    }

    @ObfuscatedName("bx.y(B)Z")
    public boolean method1609() {
        return (0x2 & this.field1208) != 0;
    }

    @ObfuscatedName("bx.c(I)Z")
    public boolean method1610() {
        return (0x4 & this.field1208) != 0;
    }

    @ObfuscatedName("bx.o(I)Z")
    public boolean method1642() {
        return (0x8 & this.field1208) != 0;
    }

    @ObfuscatedName("bx.d(B)Z")
    public boolean method1627() {
        return (0x20000000 & this.field1208) != 0;
    }

    @ObfuscatedName("bx.r(I)Z")
    public boolean method1607() {
        return (0x2000000 & this.field1208) != 0;
    }
}
