package deob;

import java.net.URL;

@ObfuscatedName("an")
public class class30 {

    @ObfuscatedName("an.n")
    public static int field673 = 0;

    @ObfuscatedName("an.a")
    public static int field674 = 0;

    @ObfuscatedName("an.q")
    public static int[] field675 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("an.w")
    public static int[] field679 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("an.h")
    public int field687;

    @ObfuscatedName("an.p")
    public int field678;

    @ObfuscatedName("an.l")
    public int field677;

    @ObfuscatedName("an.c")
    public String field680;

    @ObfuscatedName("an.m")
    public String field681;

    @ObfuscatedName("an.r")
    public int field676;

    @ObfuscatedName("an.u")
    public int field669;

    @ObfuscatedName("bo.i(I)Z")
    public static boolean method1358() {
        try {
            if (Statics.field65 == null) {
                Statics.field65 = new class27(Statics.field856, new URL(Statics.field34));
            } else {
                byte[] var0 = Statics.field65.method558();
                if (var0 != null) {
                    class154 var1 = new class154(var0);
                    field673 = var1.method2575();
                    Statics.field1713 = new class30[field673];
                    int var2 = 0;
                    while (var2 < field673) {
                        class30 var3 = Statics.field1713[var2] = new class30();
                        var3.field687 = var1.method2575();
                        var3.field678 = var1.method2658();
                        var3.field680 = var1.method2581();
                        var3.field681 = var1.method2581();
                        var3.field676 = var1.method2573();
                        var3.field677 = var1.method2576();
                        var3.field669 = var2++;
                    }
                    method2478(Statics.field1713, 0, Statics.field1713.length - 1, field679, field675);
                    Statics.field65 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field65 = null;
        }
        return false;
    }

    @ObfuscatedName("dt.e(III)V")
    public static void method2015(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field679[var5] != arg0) {
                var2[var4] = field679[var5];
                var3[var4] = field675[var5];
                var4++;
            }
        }
        field679 = var2;
        field675 = var3;
        method2478(Statics.field1713, 0, Statics.field1713.length - 1, field679, field675);
    }

    @ObfuscatedName("ep.f([Lan;II[I[II)V")
    public static void method2478(class30[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class30 var8 = arg0[var7];
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
                        var11 = arg0[var6].field669;
                        var12 = var8.field669;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field677;
                        var12 = var8.field677;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method588() ? 1 : 0;
                        var12 = var8.method588() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field687;
                        var12 = var8.field687;
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
                        var15 = arg0[var5].field669;
                        var16 = var8.field669;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field677;
                        var16 = var8.field677;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method588() ? 1 : 0;
                        var16 = var8.method588() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field687;
                        var16 = var8.field687;
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
                class30 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2478(arg0, arg1, var6, arg3, arg4);
        method2478(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("dc.k(IZIZI)V")
    public static void method2009(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1713 != null) {
            method680(0, Statics.field1713.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("av.a(IIIZIZB)V")
    public static void method680(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class30 var8 = Statics.field1713[var6];
        Statics.field1713[var6] = Statics.field1713[arg1];
        Statics.field1713[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class30 var10 = Statics.field1713[var9];
            int var11 = method1789(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method1789(var10, var8, arg4, arg5);
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
                class30 var14 = Statics.field1713[var9];
                Statics.field1713[var9] = Statics.field1713[var7];
                Statics.field1713[var7++] = var14;
            }
        }
        Statics.field1713[arg1] = Statics.field1713[var7];
        Statics.field1713[var7] = var8;
        method680(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method680(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("cf.q(Lan;Lan;IZI)I")
    public static int method1789(class30 arg0, class30 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field677;
            int var5 = arg1.field677;
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
            return arg0.field676 - arg1.field676;
        } else if (arg2 == 3) {
            if (arg0.field681.equals("-")) {
                if (arg1.field681.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field681.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field681.compareTo(arg1.field681);
            }
        } else if (arg2 == 4) {
            return arg0.method617() ? (arg1.method617() ? 0 : 1) : (arg1.method617() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method589() ? (arg1.method589() ? 0 : 1) : (arg1.method589() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method590() ? (arg1.method590() ? 0 : 1) : (arg1.method590() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method588() ? (arg1.method588() ? 0 : 1) : (arg1.method588() ? -1 : 0);
        } else {
            return arg0.field687 - arg1.field687;
        }
    }

    @ObfuscatedName("an.w(B)Z")
    public boolean method588() {
        return (0x1 & this.field678) != 0;
    }

    @ObfuscatedName("an.v(B)Z")
    public boolean method589() {
        return (0x2 & this.field678) != 0;
    }

    @ObfuscatedName("an.h(I)Z")
    public boolean method590() {
        return (0x4 & this.field678) != 0;
    }

    @ObfuscatedName("an.p(I)Z")
    public boolean method617() {
        return (0x8 & this.field678) != 0;
    }

    @ObfuscatedName("an.l(I)Z")
    public boolean method592() {
        return (0x20000000 & this.field678) != 0;
    }

    @ObfuscatedName("an.c(I)Z")
    public boolean method593() {
        return (0x2000000 & this.field678) != 0;
    }
}
