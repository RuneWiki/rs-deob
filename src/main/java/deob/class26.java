package deob;

import java.net.URL;

@ObfuscatedName("v")
public class class26 {

    @ObfuscatedName("v.k")
    public static int field651 = 0;

    @ObfuscatedName("v.r")
    public static int field643 = 0;

    @ObfuscatedName("v.p")
    public static int[] field644 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("v.q")
    public static int[] field653 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("v.e")
    public int field647;

    @ObfuscatedName("v.x")
    public int field648;

    @ObfuscatedName("v.z")
    public int field649;

    @ObfuscatedName("v.i")
    public String field656;

    @ObfuscatedName("v.t")
    public String field650;

    @ObfuscatedName("v.n")
    public int field652;

    @ObfuscatedName("v.u")
    public int field639;

    @ObfuscatedName("bw.a(B)Z")
    public static boolean method1589() {
        try {
            if (Statics.field646 == null) {
                Statics.field646 = new class19(Statics.field1875, new URL(Statics.field777));
            } else {
                byte[] var0 = Statics.field646.method218();
                if (var0 != null) {
                    class120 var1 = new class120(var0);
                    field651 = var1.method2464();
                    Statics.field2052 = new class26[field651];
                    int var2 = 0;
                    while (var2 < field651) {
                        class26 var3 = Statics.field2052[var2] = new class26();
                        var3.field647 = var1.method2464();
                        var3.field648 = var1.method2467();
                        var3.field656 = var1.method2470();
                        var3.field650 = var1.method2470();
                        var3.field652 = var1.method2462();
                        var3.field649 = var1.method2513();
                        var3.field639 = var2++;
                    }
                    method800(Statics.field2052, 0, Statics.field2052.length - 1, field653, field644);
                    Statics.field646 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field646 = null;
        }
        return false;
    }

    @ObfuscatedName("av.w(III)V")
    public static void method1090(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field653[var5] != arg0) {
                var2[var4] = field653[var5];
                var3[var4] = field644[var5];
                var4++;
            }
        }
        field653 = var2;
        field644 = var3;
        method800(Statics.field2052, 0, Statics.field2052.length - 1, field653, field644);
    }

    @ObfuscatedName("az.d([Lv;II[I[II)V")
    public static void method800(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class26 var8 = arg0[var7];
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
                        var11 = arg0[var6].field639;
                        var12 = var8.field639;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field649;
                        var12 = var8.field649;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method674() ? 1 : 0;
                        var12 = var8.method674() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field647;
                        var12 = var8.field647;
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
                        var15 = arg0[var5].field639;
                        var16 = var8.field639;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field649;
                        var16 = var8.field649;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method674() ? 1 : 0;
                        var16 = var8.method674() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field647;
                        var16 = var8.field647;
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
                class26 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method800(arg0, arg1, var6, arg3, arg4);
        method800(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ev.c(IZIZI)V")
    public static void method3046(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field2052 != null) {
            method2382(0, Statics.field2052.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dn.y(IIIZIZI)V")
    public static void method2382(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field2052[var6];
        Statics.field2052[var6] = Statics.field2052[arg1];
        Statics.field2052[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method634(Statics.field2052[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class26 var10 = Statics.field2052[var9];
                Statics.field2052[var9] = Statics.field2052[var7];
                Statics.field2052[var7++] = var10;
            }
        }
        Statics.field2052[arg1] = Statics.field2052[var7];
        Statics.field2052[var7] = var8;
        method2382(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2382(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("s.k(Lv;Lv;IZIZI)I")
    public static int method634(class26 arg0, class26 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method152(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method152(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("q.r(Lv;Lv;IZI)I")
    public static int method152(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field649;
            int var5 = arg1.field649;
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
            return arg0.field652 - arg1.field652;
        } else if (arg2 == 3) {
            if (arg0.field650.equals("-")) {
                if (arg1.field650.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field650.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field650.compareTo(arg1.field650);
            }
        } else if (arg2 == 4) {
            return arg0.method695() ? (arg1.method695() ? 0 : 1) : (arg1.method695() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method675() ? (arg1.method675() ? 0 : 1) : (arg1.method675() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method676() ? (arg1.method676() ? 0 : 1) : (arg1.method676() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method674() ? (arg1.method674() ? 0 : 1) : (arg1.method674() ? -1 : 0);
        } else {
            return arg0.field647 - arg1.field647;
        }
    }

    @ObfuscatedName("v.p(I)Z")
    public boolean method674() {
        return (0x1 & this.field648) != 0;
    }

    @ObfuscatedName("v.q(I)Z")
    public boolean method675() {
        return (0x2 & this.field648) != 0;
    }

    @ObfuscatedName("v.m(I)Z")
    public boolean method676() {
        return (0x4 & this.field648) != 0;
    }

    @ObfuscatedName("v.e(I)Z")
    public boolean method695() {
        return (0x8 & this.field648) != 0;
    }

    @ObfuscatedName("v.x(B)Z")
    public boolean method701() {
        return (0x20000000 & this.field648) != 0;
    }

    @ObfuscatedName("v.z(I)Z")
    public boolean method679() {
        return (0x2000000 & this.field648) != 0;
    }
}
