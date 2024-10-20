package deob;

import java.net.URL;

@ObfuscatedName("bu")
public class class76 {

    @ObfuscatedName("bu.e")
    public static int field892 = 0;

    @ObfuscatedName("bu.k")
    public static int field891 = 0;

    @ObfuscatedName("bu.g")
    public static int[] field895 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bu.h")
    public static int[] field901 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bu.l")
    public int field900;

    @ObfuscatedName("bu.m")
    public int field889;

    @ObfuscatedName("bu.d")
    public int field896;

    @ObfuscatedName("bu.c")
    public String field897;

    @ObfuscatedName("bu.j")
    public String field898;

    @ObfuscatedName("bu.r")
    public int field899;

    @ObfuscatedName("bu.q")
    public int field890;

    @ObfuscatedName("fr.f(B)Z")
    public static boolean method2785() {
        try {
            if (Statics.field893 == null) {
                Statics.field893 = Statics.field222.method2103(new URL(Statics.field2910));
            } else if (Statics.field893.method2116()) {
                byte[] var0 = Statics.field893.method2117();
                class382 var1 = new class382(var0);
                var1.method5861();
                field892 = var1.method5858();
                Statics.field69 = new class76[field892];
                int var2 = 0;
                while (var2 < field892) {
                    class76 var3 = Statics.field69[var2] = new class76();
                    var3.field900 = var1.method5858();
                    var3.field889 = var1.method5861();
                    var3.field897 = var1.method5865();
                    var3.field898 = var1.method5865();
                    var3.field899 = var1.method5856();
                    var3.field896 = var1.method5859();
                    var3.field890 = var2++;
                }
                method3436(Statics.field69, 0, Statics.field69.length - 1, field901, field895);
                Statics.field893 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field893 = null;
        }
        return false;
    }

    @ObfuscatedName("dz.o(III)V")
    public static void method2123(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field901[var5] != arg0) {
                var2[var4] = field901[var5];
                var3[var4] = field895[var5];
                var4++;
            }
        }
        field901 = var2;
        field895 = var3;
        method3436(Statics.field69, 0, Statics.field69.length - 1, field901, field895);
    }

    @ObfuscatedName("hr.u([Lbu;II[I[II)V")
    public static void method3436(class76[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class76 var8 = arg0[var7];
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
                        var11 = arg0[var6].field890;
                        var12 = var8.field890;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field896;
                        var12 = var8.field896;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1458() ? 1 : 0;
                        var12 = var8.method1458() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field900;
                        var12 = var8.field900;
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
                        var15 = arg0[var5].field890;
                        var16 = var8.field890;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field896;
                        var16 = var8.field896;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1458() ? 1 : 0;
                        var16 = var8.method1458() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field900;
                        var16 = var8.field900;
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
                class76 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method3436(arg0, arg1, var6, arg3, arg4);
        method3436(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ed.p(IZIZI)V")
    public static void method2688(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field69 != null) {
            method5743(0, Statics.field69.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("nh.b(IIIZIZI)V")
    public static void method5743(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class76 var8 = Statics.field69[var6];
        Statics.field69[var6] = Statics.field69[arg1];
        Statics.field69[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class76 var10 = Statics.field69[var9];
            int var11 = method2724(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method2724(var10, var8, arg4, arg5);
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
                class76 var14 = Statics.field69[var9];
                Statics.field69[var9] = Statics.field69[var7];
                Statics.field69[var7++] = var14;
            }
        }
        Statics.field69[arg1] = Statics.field69[var7];
        Statics.field69[var7] = var8;
        method5743(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method5743(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("eo.e(Lbu;Lbu;IZI)I")
    public static int method2724(class76 arg0, class76 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field896;
            int var5 = arg1.field896;
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
            return arg0.field899 - arg1.field899;
        } else if (arg2 == 3) {
            if (arg0.field898.equals("-")) {
                if (arg1.field898.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field898.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field898.compareTo(arg1.field898);
            }
        } else if (arg2 == 4) {
            return arg0.method1436() ? (arg1.method1436() ? 0 : 1) : (arg1.method1436() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1413() ? (arg1.method1413() ? 0 : 1) : (arg1.method1413() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1423() ? (arg1.method1423() ? 0 : 1) : (arg1.method1423() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1458() ? (arg1.method1458() ? 0 : 1) : (arg1.method1458() ? -1 : 0);
        } else {
            return arg0.field900 - arg1.field900;
        }
    }

    @ObfuscatedName("kc.k(I)Lbu;")
    public static class76 method4441() {
        field891 = 0;
        return method937();
    }

    @ObfuscatedName("bg.g(B)Lbu;")
    public static class76 method937() {
        return field891 < field892 ? Statics.field69[++field891 - 1] : null;
    }

    @ObfuscatedName("bu.h(I)Z")
    public boolean method1458() {
        return (0x1 & this.field889) != 0;
    }

    @ObfuscatedName("bu.n(I)Z")
    public boolean method1413() {
        return (0x2 & this.field889) != 0;
    }

    @ObfuscatedName("bu.l(B)Z")
    public boolean method1423() {
        return (0x4 & this.field889) != 0;
    }

    @ObfuscatedName("bu.m(S)Z")
    public boolean method1436() {
        return (0x8 & this.field889) != 0;
    }

    @ObfuscatedName("bu.d(B)Z")
    public boolean method1416() {
        return (0x20000000 & this.field889) != 0;
    }

    @ObfuscatedName("bu.c(B)Z")
    public boolean method1417() {
        return (0x2000000 & this.field889) != 0;
    }

    @ObfuscatedName("bu.j(B)Z")
    public boolean method1418() {
        return (0x40000000 & this.field889) != 0;
    }
}
