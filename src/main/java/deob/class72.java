package deob;

import java.net.URL;

@ObfuscatedName("bl")
public class class72 {

    @ObfuscatedName("bl.n")
    public static int field993 = 0;

    @ObfuscatedName("bl.t")
    public static int field994 = 0;

    @ObfuscatedName("bl.q")
    public static int[] field1007 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bl.x")
    public static int[] field1003 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bl.f")
    public int field997;

    @ObfuscatedName("bl.c")
    public int field998;

    @ObfuscatedName("bl.r")
    public int field999;

    @ObfuscatedName("bl.y")
    public String field1000;

    @ObfuscatedName("bl.p")
    public String field1001;

    @ObfuscatedName("bl.b")
    public int field1002;

    @ObfuscatedName("bl.g")
    public int field995;

    @ObfuscatedName("fx.s(I)Z")
    public static boolean method3291() {
        try {
            if (Statics.field3577 == null) {
                Statics.field3577 = Statics.field558.method3047(new URL(Statics.field7));
            } else if (Statics.field3577.method3054()) {
                byte[] var0 = Statics.field3577.method3055();
                class300 var1 = new class300(var0);
                var1.method5056();
                field993 = var1.method5054();
                Statics.field1284 = new class72[field993];
                int var2 = 0;
                while (var2 < field993) {
                    class72 var3 = Statics.field1284[var2] = new class72();
                    var3.field997 = var1.method5054();
                    var3.field998 = var1.method5056();
                    var3.field1000 = var1.method5150();
                    var3.field1001 = var1.method5150();
                    var3.field1002 = var1.method5179();
                    var3.field999 = var1.method5055();
                    var3.field995 = var2++;
                }
                method2619(Statics.field1284, 0, Statics.field1284.length - 1, field1003, field1007);
                Statics.field3577 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field3577 = null;
        }
        return false;
    }

    @ObfuscatedName("bf.j(III)V")
    public static void method1058(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1003[var5] != arg0) {
                var2[var4] = field1003[var5];
                var3[var4] = field1007[var5];
                var4++;
            }
        }
        field1003 = var2;
        field1007 = var3;
        method2619(Statics.field1284, 0, Statics.field1284.length - 1, field1003, field1007);
    }

    @ObfuscatedName("de.i([Lbl;II[I[IB)V")
    public static void method2619(class72[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class72 var8 = arg0[var7];
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
                        var11 = arg0[var6].field995;
                        var12 = var8.field995;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field999;
                        var12 = var8.field999;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1620() ? 1 : 0;
                        var12 = var8.method1620() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field997;
                        var12 = var8.field997;
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
                        var15 = arg0[var5].field995;
                        var16 = var8.field995;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field999;
                        var16 = var8.field999;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1620() ? 1 : 0;
                        var16 = var8.method1620() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field997;
                        var16 = var8.field997;
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
                class72 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2619(arg0, arg1, var6, arg3, arg4);
        method2619(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("bo.k(IZIZB)V")
    public static void method919(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1284 != null) {
            method3365(0, Statics.field1284.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("gk.u(IIIZIZI)V")
    public static void method3365(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class72 var8 = Statics.field1284[var6];
        Statics.field1284[var6] = Statics.field1284[arg1];
        Statics.field1284[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class72 var10 = Statics.field1284[var9];
            int var11 = method2268(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method2268(var10, var8, arg4, arg5);
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
                class72 var14 = Statics.field1284[var9];
                Statics.field1284[var9] = Statics.field1284[var7];
                Statics.field1284[var7++] = var14;
            }
        }
        Statics.field1284[arg1] = Statics.field1284[var7];
        Statics.field1284[var7] = var8;
        method3365(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method3365(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("da.n(Lbl;Lbl;IZI)I")
    public static int method2268(class72 arg0, class72 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field999;
            int var5 = arg1.field999;
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
            return arg0.field1002 - arg1.field1002;
        } else if (arg2 == 3) {
            if (arg0.field1001.equals("-")) {
                if (arg1.field1001.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1001.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1001.compareTo(arg1.field1001);
            }
        } else if (arg2 == 4) {
            return arg0.method1584() ? (arg1.method1584() ? 0 : 1) : (arg1.method1584() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1582() ? (arg1.method1582() ? 0 : 1) : (arg1.method1582() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1583() ? (arg1.method1583() ? 0 : 1) : (arg1.method1583() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1620() ? (arg1.method1620() ? 0 : 1) : (arg1.method1620() ? -1 : 0);
        } else {
            return arg0.field997 - arg1.field997;
        }
    }

    @ObfuscatedName("ad.t(I)Lbl;")
    public static class72 method669() {
        field994 = 0;
        return method134();
    }

    @ObfuscatedName("r.q(I)Lbl;")
    public static class72 method134() {
        return field994 < field993 ? Statics.field1284[++field994 - 1] : null;
    }

    @ObfuscatedName("bl.x(I)Z")
    public boolean method1620() {
        return (0x1 & this.field998) != 0;
    }

    @ObfuscatedName("bl.d(I)Z")
    public boolean method1582() {
        return (0x2 & this.field998) != 0;
    }

    @ObfuscatedName("bl.f(I)Z")
    public boolean method1583() {
        return (0x4 & this.field998) != 0;
    }

    @ObfuscatedName("bl.c(S)Z")
    public boolean method1584() {
        return (0x8 & this.field998) != 0;
    }

    @ObfuscatedName("bl.r(I)Z")
    public boolean method1618() {
        return (0x20000000 & this.field998) != 0;
    }

    @ObfuscatedName("bl.y(I)Z")
    public boolean method1586() {
        return (0x2000000 & this.field998) != 0;
    }
}
