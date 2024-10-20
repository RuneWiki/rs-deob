package deob;

import java.net.URL;

@ObfuscatedName("au")
public class class30 {

    @ObfuscatedName("au.n")
    public static int field704 = 0;

    @ObfuscatedName("au.r")
    public static int field712 = 0;

    @ObfuscatedName("au.c")
    public static int[] field698 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("au.i")
    public static int[] field699 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("au.m")
    public int field700;

    @ObfuscatedName("au.s")
    public int field703;

    @ObfuscatedName("au.u")
    public int field702;

    @ObfuscatedName("au.b")
    public String field696;

    @ObfuscatedName("au.v")
    public String field692;

    @ObfuscatedName("au.f")
    public int field705;

    @ObfuscatedName("au.z")
    public int field706;

    @ObfuscatedName("gz.q(B)Z")
    public static boolean method3269() {
        try {
            if (Statics.field221 == null) {
                Statics.field221 = new class27(Statics.field776, new URL(Statics.field35));
            } else {
                byte[] var0 = Statics.field221.method611();
                if (var0 != null) {
                    class154 var1 = new class154(var0);
                    field704 = var1.method2668();
                    Statics.field695 = new class30[field704];
                    int var2 = 0;
                    while (var2 < field704) {
                        class30 var3 = Statics.field695[var2] = new class30();
                        var3.field700 = var1.method2668();
                        var3.field703 = var1.method2798();
                        var3.field696 = var1.method2701();
                        var3.field692 = var1.method2701();
                        var3.field705 = var1.method2666();
                        var3.field702 = var1.method2669();
                        var3.field706 = var2++;
                    }
                    method67(Statics.field695, 0, Statics.field695.length - 1, field699, field698);
                    Statics.field221 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field221 = null;
        }
        return false;
    }

    @ObfuscatedName("c.d(III)V")
    public static void method94(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field699[var5] != arg0) {
                var2[var4] = field699[var5];
                var3[var4] = field698[var5];
                var4++;
            }
        }
        field699 = var2;
        field698 = var3;
        method67(Statics.field695, 0, Statics.field695.length - 1, field699, field698);
    }

    @ObfuscatedName("n.h([Lau;II[I[IB)V")
    public static void method67(class30[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field706;
                        var12 = var8.field706;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field702;
                        var12 = var8.field702;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method665() ? 1 : 0;
                        var12 = var8.method665() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field700;
                        var12 = var8.field700;
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
                        var15 = arg0[var5].field706;
                        var16 = var8.field706;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field702;
                        var16 = var8.field702;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method665() ? 1 : 0;
                        var16 = var8.method665() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field700;
                        var16 = var8.field700;
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
        method67(arg0, arg1, var6, arg3, arg4);
        method67(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("client.p(IIIZIZI)V")
    public static void method601(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class30 var8 = Statics.field695[var6];
        Statics.field695[var6] = Statics.field695[arg1];
        Statics.field695[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class30 var10 = Statics.field695[var9];
            int var11 = method638(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method638(var10, var8, arg4, arg5);
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
                class30 var14 = Statics.field695[var9];
                Statics.field695[var9] = Statics.field695[var7];
                Statics.field695[var7++] = var14;
            }
        }
        Statics.field695[arg1] = Statics.field695[var7];
        Statics.field695[var7] = var8;
        method601(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method601(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("at.j(Lau;Lau;IZB)I")
    public static int method638(class30 arg0, class30 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field702;
            int var5 = arg1.field702;
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
            return arg0.field705 - arg1.field705;
        } else if (arg2 == 3) {
            if (arg0.field692.equals("-")) {
                if (arg1.field692.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field692.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field692.compareTo(arg1.field692);
            }
        } else if (arg2 == 4) {
            return arg0.method643() ? (arg1.method643() ? 0 : 1) : (arg1.method643() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method675() ? (arg1.method675() ? 0 : 1) : (arg1.method675() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method642() ? (arg1.method642() ? 0 : 1) : (arg1.method642() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method665() ? (arg1.method665() ? 0 : 1) : (arg1.method665() ? -1 : 0);
        } else {
            return arg0.field700 - arg1.field700;
        }
    }

    @ObfuscatedName("s.n(I)Lau;")
    public static class30 method149() {
        return field712 < field704 ? Statics.field695[++field712 - 1] : null;
    }

    @ObfuscatedName("au.c(B)Z")
    public boolean method665() {
        return (0x1 & this.field703) != 0;
    }

    @ObfuscatedName("au.o(I)Z")
    public boolean method675() {
        return (0x2 & this.field703) != 0;
    }

    @ObfuscatedName("au.s(B)Z")
    public boolean method642() {
        return (0x4 & this.field703) != 0;
    }

    @ObfuscatedName("au.u(B)Z")
    public boolean method643() {
        return (0x8 & this.field703) != 0;
    }

    @ObfuscatedName("au.b(B)Z")
    public boolean method644() {
        return (0x20000000 & this.field703) != 0;
    }

    @ObfuscatedName("au.v(I)Z")
    public boolean method645() {
        return (0x2000000 & this.field703) != 0;
    }
}
