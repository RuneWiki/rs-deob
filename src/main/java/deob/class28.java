package deob;

import java.net.URL;

@ObfuscatedName("an")
public class class28 {

    @ObfuscatedName("an.b")
    public static int field647 = 0;

    @ObfuscatedName("an.l")
    public static int field657 = 0;

    @ObfuscatedName("an.m")
    public static int[] field653 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("an.p")
    public static int[] field650 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("an.d")
    public int field655;

    @ObfuscatedName("an.v")
    public int field652;

    @ObfuscatedName("an.q")
    public int field646;

    @ObfuscatedName("an.t")
    public String field654;

    @ObfuscatedName("an.g")
    public String field648;

    @ObfuscatedName("an.s")
    public int field656;

    @ObfuscatedName("an.h")
    public int field651;

    @ObfuscatedName("db.x(I)Z")
    public static boolean method2341() {
        try {
            if (Statics.field2768 == null) {
                Statics.field2768 = new class19(Statics.field2087, new URL(Statics.field279));
            } else {
                byte[] var0 = Statics.field2768.method190();
                if (var0 != null) {
                    class123 var1 = new class123(var0);
                    field647 = var1.method2403();
                    Statics.field777 = new class28[field647];
                    int var2 = 0;
                    while (var2 < field647) {
                        class28 var3 = Statics.field777[var2] = new class28();
                        var3.field655 = var1.method2403();
                        var3.field652 = var1.method2413();
                        var3.field654 = var1.method2626();
                        var3.field648 = var1.method2626();
                        var3.field656 = var1.method2408();
                        var3.field646 = var1.method2611();
                        var3.field651 = var2++;
                    }
                    method2350(Statics.field777, 0, Statics.field777.length - 1, field650, field653);
                    Statics.field2768 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2768 = null;
        }
        return false;
    }

    @ObfuscatedName("ao.r(III)V")
    public static void method696(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field650[var5] != arg0) {
                var2[var4] = field650[var5];
                var3[var4] = field653[var5];
                var4++;
            }
        }
        field650 = var2;
        field653 = var3;
        method2350(Statics.field777, 0, Statics.field777.length - 1, field650, field653);
    }

    @ObfuscatedName("dt.j([Lan;II[I[II)V")
    public static void method2350(class28[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class28 var8 = arg0[var7];
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
                        var11 = arg0[var6].field651;
                        var12 = var8.field651;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field646;
                        var12 = var8.field646;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method586() ? 1 : 0;
                        var12 = var8.method586() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field655;
                        var12 = var8.field655;
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
                        var15 = arg0[var5].field651;
                        var16 = var8.field651;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field646;
                        var16 = var8.field646;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method586() ? 1 : 0;
                        var16 = var8.method586() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field655;
                        var16 = var8.field655;
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
                class28 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2350(arg0, arg1, var6, arg3, arg4);
        method2350(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("fr.z(IIIZIZI)V")
    public static void method3253(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class28 var8 = Statics.field777[var6];
        Statics.field777[var6] = Statics.field777[arg1];
        Statics.field777[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method960(Statics.field777[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class28 var10 = Statics.field777[var9];
                Statics.field777[var9] = Statics.field777[var7];
                Statics.field777[var7++] = var10;
            }
        }
        Statics.field777[arg1] = Statics.field777[var7];
        Statics.field777[var7] = var8;
        method3253(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method3253(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("aj.i(Lan;Lan;IZIZB)I")
    public static int method960(class28 arg0, class28 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method1806(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method1806(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("cq.b(Lan;Lan;IZS)I")
    public static int method1806(class28 arg0, class28 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field646;
            int var5 = arg1.field646;
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
            return arg0.field656 - arg1.field656;
        } else if (arg2 == 3) {
            if (arg0.field648.equals("-")) {
                if (arg1.field648.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field648.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field648.compareTo(arg1.field648);
            }
        } else if (arg2 == 4) {
            return arg0.method588() ? (arg1.method588() ? 0 : 1) : (arg1.method588() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method610() ? (arg1.method610() ? 0 : 1) : (arg1.method610() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method587() ? (arg1.method587() ? 0 : 1) : (arg1.method587() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method586() ? (arg1.method586() ? 0 : 1) : (arg1.method586() ? -1 : 0);
        } else {
            return arg0.field655 - arg1.field655;
        }
    }

    @ObfuscatedName("an.l(I)Z")
    public boolean method586() {
        return (0x1 & this.field652) != 0;
    }

    @ObfuscatedName("an.m(I)Z")
    public boolean method610() {
        return (0x2 & this.field652) != 0;
    }

    @ObfuscatedName("an.p(I)Z")
    public boolean method587() {
        return (0x4 & this.field652) != 0;
    }

    @ObfuscatedName("an.f(I)Z")
    public boolean method588() {
        return (0x8 & this.field652) != 0;
    }

    @ObfuscatedName("an.d(B)Z")
    public boolean method612() {
        return (0x20000000 & this.field652) != 0;
    }

    @ObfuscatedName("an.v(I)Z")
    public boolean method590() {
        return (0x2000000 & this.field652) != 0;
    }
}
