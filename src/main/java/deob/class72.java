package deob;

import java.net.URL;

@ObfuscatedName("bb")
public class class72 {

    @ObfuscatedName("bb.u")
    public static int field989 = 0;

    @ObfuscatedName("bb.j")
    public static int field992 = 0;

    @ObfuscatedName("bb.v")
    public static int[] field991 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bb.d")
    public static int[] field996 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bb.n")
    public int field993;

    @ObfuscatedName("bb.h")
    public int field999;

    @ObfuscatedName("bb.f")
    public int field995;

    @ObfuscatedName("bb.s")
    public String field1000;

    @ObfuscatedName("bb.p")
    public String field990;

    @ObfuscatedName("bb.e")
    public int field998;

    @ObfuscatedName("bb.i")
    public int field985;

    @ObfuscatedName("gw.c(I)Z")
    public static boolean method3337() {
        try {
            if (Statics.field2078 == null) {
                Statics.field2078 = Statics.field2084.method3044(new URL(Statics.field465));
            } else if (Statics.field2078.method3055()) {
                byte[] var0 = Statics.field2078.method3059();
                class300 var1 = new class300(var0);
                var1.method5208();
                field989 = var1.method5304();
                Statics.field988 = new class72[field989];
                int var2 = 0;
                while (var2 < field989) {
                    class72 var3 = Statics.field988[var2] = new class72();
                    var3.field993 = var1.method5304();
                    var3.field999 = var1.method5208();
                    var3.field1000 = var1.method5112();
                    var3.field990 = var1.method5112();
                    var3.field998 = var1.method5103();
                    var3.field995 = var1.method5106();
                    var3.field985 = var2++;
                }
                method219(Statics.field988, 0, Statics.field988.length - 1, field996, field991);
                Statics.field2078 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2078 = null;
        }
        return false;
    }

    @ObfuscatedName("an.x(III)V")
    public static void method463(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field996[var5] != arg0) {
                var2[var4] = field996[var5];
                var3[var4] = field991[var5];
                var4++;
            }
        }
        field996 = var2;
        field991 = var3;
        method219(Statics.field988, 0, Statics.field988.length - 1, field996, field991);
    }

    @ObfuscatedName("w.t([Lbb;II[I[IB)V")
    public static void method219(class72[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field985;
                        var12 = var8.field985;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field995;
                        var12 = var8.field995;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1581() ? 1 : 0;
                        var12 = var8.method1581() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field993;
                        var12 = var8.field993;
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
                        var15 = arg0[var5].field985;
                        var16 = var8.field985;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field995;
                        var16 = var8.field995;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1581() ? 1 : 0;
                        var16 = var8.method1581() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field993;
                        var16 = var8.field993;
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
        method219(arg0, arg1, var6, arg3, arg4);
        method219(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("al.g(IZIZI)V")
    public static void method468(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field988 != null) {
            method2753(0, Statics.field988.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("df.l(IIIZIZI)V")
    public static void method2753(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class72 var8 = Statics.field988[var6];
        Statics.field988[var6] = Statics.field988[arg1];
        Statics.field988[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class72 var10 = Statics.field988[var9];
            int var11 = method4001(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method4001(var10, var8, arg4, arg5);
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
                class72 var14 = Statics.field988[var9];
                Statics.field988[var9] = Statics.field988[var7];
                Statics.field988[var7++] = var14;
            }
        }
        Statics.field988[arg1] = Statics.field988[var7];
        Statics.field988[var7] = var8;
        method2753(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2753(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ii.u(Lbb;Lbb;IZS)I")
    public static int method4001(class72 arg0, class72 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field995;
            int var5 = arg1.field995;
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
            return arg0.field998 - arg1.field998;
        } else if (arg2 == 3) {
            if (arg0.field990.equals("-")) {
                if (arg1.field990.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field990.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field990.compareTo(arg1.field990);
            }
        } else if (arg2 == 4) {
            return arg0.method1622() ? (arg1.method1622() ? 0 : 1) : (arg1.method1622() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1582() ? (arg1.method1582() ? 0 : 1) : (arg1.method1582() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1602() ? (arg1.method1602() ? 0 : 1) : (arg1.method1602() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1581() ? (arg1.method1581() ? 0 : 1) : (arg1.method1581() ? -1 : 0);
        } else {
            return arg0.field993 - arg1.field993;
        }
    }

    @ObfuscatedName("gn.j(B)Lbb;")
    public static class72 method3347() {
        field992 = 0;
        return method3029();
    }

    @ObfuscatedName("ev.v(I)Lbb;")
    public static class72 method3029() {
        return field992 < field989 ? Statics.field988[++field992 - 1] : null;
    }

    @ObfuscatedName("bb.d(B)Z")
    public boolean method1581() {
        return (0x1 & this.field999) != 0;
    }

    @ObfuscatedName("bb.z(I)Z")
    public boolean method1582() {
        return (0x2 & this.field999) != 0;
    }

    @ObfuscatedName("bb.s(I)Z")
    public boolean method1602() {
        return (0x4 & this.field999) != 0;
    }

    @ObfuscatedName("bb.p(I)Z")
    public boolean method1622() {
        return (0x8 & this.field999) != 0;
    }

    @ObfuscatedName("bb.e(I)Z")
    public boolean method1585() {
        return (0x20000000 & this.field999) != 0;
    }

    @ObfuscatedName("bb.i(I)Z")
    public boolean method1586() {
        return (0x2000000 & this.field999) != 0;
    }
}
