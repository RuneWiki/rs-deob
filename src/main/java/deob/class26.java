package deob;

import java.net.URL;

@ObfuscatedName("v")
public class class26 {

    @ObfuscatedName("v.h")
    public static int field617 = 0;

    @ObfuscatedName("v.g")
    public static int field614 = 0;

    @ObfuscatedName("v.a")
    public static int[] field619 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("v.r")
    public static int[] field620 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("v.m")
    public int field621;

    @ObfuscatedName("v.n")
    public int field622;

    @ObfuscatedName("v.y")
    public int field623;

    @ObfuscatedName("v.i")
    public String field624;

    @ObfuscatedName("v.j")
    public String field625;

    @ObfuscatedName("v.l")
    public int field626;

    @ObfuscatedName("v.o")
    public int field628;

    @ObfuscatedName("fa.e(I)Z")
    public static boolean method3111() {
        try {
            if (Statics.field653 == null) {
                Statics.field653 = new class19(Statics.field2029, new URL(Statics.field2166));
            } else {
                byte[] var0 = Statics.field653.method178();
                if (var0 != null) {
                    class120 var1 = new class120(var0);
                    field617 = var1.method2532();
                    Statics.field616 = new class26[field617];
                    int var2 = 0;
                    while (var2 < field617) {
                        class26 var3 = Statics.field616[var2] = new class26();
                        var3.field621 = var1.method2532();
                        var3.field622 = var1.method2360();
                        var3.field624 = var1.method2363();
                        var3.field625 = var1.method2363();
                        var3.field626 = var1.method2355();
                        var3.field623 = var1.method2358();
                        var3.field628 = var2++;
                    }
                    method640(Statics.field616, 0, Statics.field616.length - 1, field620, field619);
                    Statics.field653 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field653 = null;
        }
        return false;
    }

    @ObfuscatedName("af.w(IIB)V")
    public static void method730(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field620[var5] != arg0) {
                var2[var4] = field620[var5];
                var3[var4] = field619[var5];
                var4++;
            }
        }
        field620 = var2;
        field619 = var3;
        method640(Statics.field616, 0, Statics.field616.length - 1, field620, field619);
    }

    @ObfuscatedName("ap.f([Lv;II[I[II)V")
    public static void method640(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field628;
                        var12 = var8.field628;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field623;
                        var12 = var8.field623;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method621() ? 1 : 0;
                        var12 = var8.method621() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field621;
                        var12 = var8.field621;
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
                        var15 = arg0[var5].field628;
                        var16 = var8.field628;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field623;
                        var16 = var8.field623;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method621() ? 1 : 0;
                        var16 = var8.method621() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field621;
                        var16 = var8.field621;
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
        method640(arg0, arg1, var6, arg3, arg4);
        method640(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("fs.s(IZIZI)V")
    public static void method3114(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field616 != null) {
            method719(0, Statics.field616.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ag.p(IIIZIZB)V")
    public static void method719(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field616[var6];
        Statics.field616[var6] = Statics.field616[arg1];
        Statics.field616[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method560(Statics.field616[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class26 var10 = Statics.field616[var9];
                Statics.field616[var9] = Statics.field616[var7];
                Statics.field616[var7++] = var10;
            }
        }
        Statics.field616[arg1] = Statics.field616[var7];
        Statics.field616[var7] = var8;
        method719(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method719(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("q.h(Lv;Lv;IZIZI)I")
    public static int method560(class26 arg0, class26 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method2607(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method2607(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("dm.g(Lv;Lv;IZI)I")
    public static int method2607(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field623;
            int var5 = arg1.field623;
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
            return arg0.field626 - arg1.field626;
        } else if (arg2 == 3) {
            if (arg0.field625.equals("-")) {
                if (arg1.field625.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field625.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field625.compareTo(arg1.field625);
            }
        } else if (arg2 == 4) {
            return arg0.method592() ? (arg1.method592() ? 0 : 1) : (arg1.method592() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method606() ? (arg1.method606() ? 0 : 1) : (arg1.method606() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method591() ? (arg1.method591() ? 0 : 1) : (arg1.method591() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method621() ? (arg1.method621() ? 0 : 1) : (arg1.method621() ? -1 : 0);
        } else {
            return arg0.field621 - arg1.field621;
        }
    }

    @ObfuscatedName("ae.a(I)Lv;")
    public static class26 method648() {
        return field614 < field617 ? Statics.field616[++field614 - 1] : null;
    }

    @ObfuscatedName("v.r(I)Z")
    public boolean method621() {
        return (0x1 & this.field622) != 0;
    }

    @ObfuscatedName("v.k(B)Z")
    public boolean method606() {
        return (0x2 & this.field622) != 0;
    }

    @ObfuscatedName("v.m(S)Z")
    public boolean method591() {
        return (0x4 & this.field622) != 0;
    }

    @ObfuscatedName("v.n(I)Z")
    public boolean method592() {
        return (0x8 & this.field622) != 0;
    }

    @ObfuscatedName("v.y(I)Z")
    public boolean method593() {
        return (0x20000000 & this.field622) != 0;
    }

    @ObfuscatedName("v.i(B)Z")
    public boolean method597() {
        return (0x2000000 & this.field622) != 0;
    }
}
