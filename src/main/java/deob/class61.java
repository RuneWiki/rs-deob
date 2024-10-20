package deob;

import java.net.URL;

@ObfuscatedName("bx")
public class class61 {

    @ObfuscatedName("bx.m")
    public static int field783 = 0;

    @ObfuscatedName("bx.p")
    public static int field784 = 0;

    @ObfuscatedName("bx.s")
    public static int[] field781 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bx.r")
    public static int[] field786 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bx.y")
    public int field787;

    @ObfuscatedName("bx.c")
    public int field788;

    @ObfuscatedName("bx.w")
    public int field779;

    @ObfuscatedName("bx.b")
    public String field789;

    @ObfuscatedName("bx.t")
    public String field782;

    @ObfuscatedName("bx.g")
    public int field792;

    @ObfuscatedName("bx.x")
    public int field790;

    @ObfuscatedName("cy.o(B)Z")
    public static boolean method2200() {
        try {
            if (Statics.field1258 == null) {
                Statics.field1258 = Statics.field1385.method2399(new URL(Statics.field1281));
            } else if (Statics.field1258.method2415()) {
                byte[] var0 = Statics.field1258.method2414();
                class440 var1 = new class440(var0);
                var1.method6898();
                field783 = var1.method7082();
                Statics.field785 = new class61[field783];
                int var2 = 0;
                while (var2 < field783) {
                    class61 var3 = Statics.field785[var2] = new class61();
                    var3.field787 = var1.method7082();
                    var3.field788 = var1.method6898();
                    var3.field789 = var1.method7044();
                    var3.field782 = var1.method7044();
                    var3.field792 = var1.method7071();
                    var3.field779 = var1.method6896();
                    var3.field790 = var2++;
                }
                method2440(Statics.field785, 0, Statics.field785.length - 1, field786, field781);
                Statics.field1258 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1258 = null;
        }
        return false;
    }

    @ObfuscatedName("ku.q(III)V")
    public static void method5126(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field786[var5] != arg0) {
                var2[var4] = field786[var5];
                var3[var4] = field781[var5];
                var4++;
            }
        }
        field786 = var2;
        field781 = var3;
        method2440(Statics.field785, 0, Statics.field785.length - 1, field786, field781);
    }

    @ObfuscatedName("dc.l([Lbx;II[I[IB)V")
    public static void method2440(class61[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class61 var8 = arg0[var7];
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
                        var11 = arg0[var6].field790;
                        var12 = var8.field790;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field779;
                        var12 = var8.field779;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1551() ? 1 : 0;
                        var12 = var8.method1551() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field787;
                        var12 = var8.field787;
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
                        var15 = arg0[var5].field790;
                        var16 = var8.field790;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field779;
                        var16 = var8.field779;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1551() ? 1 : 0;
                        var16 = var8.method1551() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field787;
                        var16 = var8.field787;
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
                class61 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2440(arg0, arg1, var6, arg3, arg4);
        method2440(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("nu.k(IZIZB)V")
    public static void method6165(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field785 != null) {
            method3029(0, Statics.field785.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("fe.a(IIIZIZI)V")
    public static void method3029(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class61 var8 = Statics.field785[var6];
        Statics.field785[var6] = Statics.field785[arg1];
        Statics.field785[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class61 var10 = Statics.field785[var9];
            int var11 = method326(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method326(var10, var8, arg4, arg5);
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
                class61 var14 = Statics.field785[var9];
                Statics.field785[var9] = Statics.field785[var7];
                Statics.field785[var7++] = var14;
            }
        }
        Statics.field785[arg1] = Statics.field785[var7];
        Statics.field785[var7] = var8;
        method3029(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method3029(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("z.m(Lbx;Lbx;IZI)I")
    public static int method326(class61 arg0, class61 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field779;
            int var5 = arg1.field779;
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
            return arg0.field792 - arg1.field792;
        } else if (arg2 == 3) {
            if (arg0.field782.equals("-")) {
                if (arg1.field782.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field782.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field782.compareTo(arg1.field782);
            }
        } else if (arg2 == 4) {
            return arg0.method1549() ? (arg1.method1549() ? 0 : 1) : (arg1.method1549() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1520() ? (arg1.method1520() ? 0 : 1) : (arg1.method1520() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1521() ? (arg1.method1521() ? 0 : 1) : (arg1.method1521() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1551() ? (arg1.method1551() ? 0 : 1) : (arg1.method1551() ? -1 : 0);
        } else {
            return arg0.field787 - arg1.field787;
        }
    }

    @ObfuscatedName("cy.p(I)Lbx;")
    public static class61 method2171() {
        field784 = 0;
        return method2761();
    }

    @ObfuscatedName("es.s(I)Lbx;")
    public static class61 method2761() {
        return field784 < field783 ? Statics.field785[++field784 - 1] : null;
    }

    @ObfuscatedName("bx.r(I)Z")
    public boolean method1551() {
        return (0x1 & this.field788) != 0;
    }

    @ObfuscatedName("bx.v(I)Z")
    public boolean method1520() {
        return (0x2 & this.field788) != 0;
    }

    @ObfuscatedName("bx.y(S)Z")
    public boolean method1521() {
        return (0x4 & this.field788) != 0;
    }

    @ObfuscatedName("bx.c(B)Z")
    public boolean method1549() {
        return (0x8 & this.field788) != 0;
    }

    @ObfuscatedName("bx.w(I)Z")
    public boolean method1522() {
        return (0x20000000 & this.field788) != 0;
    }

    @ObfuscatedName("bx.b(I)Z")
    public boolean method1523() {
        return (0x2000000 & this.field788) != 0;
    }

    @ObfuscatedName("bx.t(B)Z")
    public boolean method1524() {
        return (0x40000000 & this.field788) != 0;
    }
}
