package deob;

import java.net.URL;

@ObfuscatedName("f")
public class class26 {

    @ObfuscatedName("f.e")
    public static int field615 = 0;

    @ObfuscatedName("f.i")
    public static int field616 = 0;

    @ObfuscatedName("f.c")
    public static int[] field623 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("f.n")
    public static int[] field618 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("f.u")
    public int field619;

    @ObfuscatedName("f.r")
    public int field614;

    @ObfuscatedName("f.a")
    public int field626;

    @ObfuscatedName("f.d")
    public String field628;

    @ObfuscatedName("f.p")
    public String field621;

    @ObfuscatedName("f.q")
    public int field624;

    @ObfuscatedName("f.b")
    public int field625;

    @ObfuscatedName("bz.j(B)Z")
    public static boolean method1578() {
        try {
            if (Statics.field246 == null) {
                Statics.field246 = new class19(Statics.field2154, new URL(Statics.field202));
            } else {
                byte[] var0 = Statics.field246.method192();
                if (var0 != null) {
                    class120 var1 = new class120(var0);
                    field615 = var1.method2363();
                    Statics.field617 = new class26[field615];
                    int var2 = 0;
                    while (var2 < field615) {
                        class26 var3 = Statics.field617[var2] = new class26();
                        var3.field619 = var1.method2363();
                        var3.field614 = var1.method2366();
                        var3.field628 = var1.method2369();
                        var3.field621 = var1.method2369();
                        var3.field624 = var1.method2361();
                        var3.field626 = var1.method2362();
                        var3.field625 = var2++;
                    }
                    method550(Statics.field617, 0, Statics.field617.length - 1, field618, field623);
                    Statics.field246 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field246 = null;
        }
        return false;
    }

    @ObfuscatedName("db.h(III)V")
    public static void method2303(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field618[var5] != arg0) {
                var2[var4] = field618[var5];
                var3[var4] = field623[var5];
                var4++;
            }
        }
        field618 = var2;
        field623 = var3;
        method550(Statics.field617, 0, Statics.field617.length - 1, field618, field623);
    }

    @ObfuscatedName("client.m([Lf;II[I[IB)V")
    public static void method550(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field625;
                        var12 = var8.field625;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field626;
                        var12 = var8.field626;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method596() ? 1 : 0;
                        var12 = var8.method596() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field619;
                        var12 = var8.field619;
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
                        var15 = arg0[var5].field625;
                        var16 = var8.field625;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field626;
                        var16 = var8.field626;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method596() ? 1 : 0;
                        var16 = var8.method596() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field619;
                        var16 = var8.field619;
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
        method550(arg0, arg1, var6, arg3, arg4);
        method550(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("g.z(IIIZIZI)V")
    public static void method558(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field617[var6];
        Statics.field617[var6] = Statics.field617[arg1];
        Statics.field617[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class26 var10 = Statics.field617[var9];
            int var11 = method1970(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method1970(var10, var8, arg4, arg5);
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
                class26 var14 = Statics.field617[var9];
                Statics.field617[var9] = Statics.field617[var7];
                Statics.field617[var7++] = var14;
            }
        }
        Statics.field617[arg1] = Statics.field617[var7];
        Statics.field617[var7] = var8;
        method558(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method558(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("cx.x(Lf;Lf;IZI)I")
    public static int method1970(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field626;
            int var5 = arg1.field626;
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
            return arg0.field624 - arg1.field624;
        } else if (arg2 == 3) {
            if (arg0.field621.equals("-")) {
                if (arg1.field621.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field621.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field621.compareTo(arg1.field621);
            }
        } else if (arg2 == 4) {
            return arg0.method599() ? (arg1.method599() ? 0 : 1) : (arg1.method599() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method600() ? (arg1.method600() ? 0 : 1) : (arg1.method600() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method602() ? (arg1.method602() ? 0 : 1) : (arg1.method602() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method596() ? (arg1.method596() ? 0 : 1) : (arg1.method596() ? -1 : 0);
        } else {
            return arg0.field619 - arg1.field619;
        }
    }

    @ObfuscatedName("ap.e(B)Lf;")
    public static class26 method967() {
        return field616 < field615 ? Statics.field617[++field616 - 1] : null;
    }

    @ObfuscatedName("f.i(S)Z")
    public boolean method596() {
        return (0x1 & this.field614) != 0;
    }

    @ObfuscatedName("f.c(B)Z")
    public boolean method600() {
        return (0x2 & this.field614) != 0;
    }

    @ObfuscatedName("f.n(B)Z")
    public boolean method602() {
        return (0x4 & this.field614) != 0;
    }

    @ObfuscatedName("f.l(B)Z")
    public boolean method599() {
        return (0x8 & this.field614) != 0;
    }

    @ObfuscatedName("f.u(I)Z")
    public boolean method617() {
        return (0x20000000 & this.field614) != 0;
    }

    @ObfuscatedName("f.r(I)Z")
    public boolean method601() {
        return (0x2000000 & this.field614) != 0;
    }
}
