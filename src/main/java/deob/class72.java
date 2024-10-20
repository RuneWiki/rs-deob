package deob;

import java.net.URL;

@ObfuscatedName("bt")
public class class72 {

    @ObfuscatedName("bt.u")
    public static int field991 = 0;

    @ObfuscatedName("bt.g")
    public static int field986 = 0;

    @ObfuscatedName("bt.l")
    public static int[] field993 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bt.e")
    public static int[] field989 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bt.d")
    public int field990;

    @ObfuscatedName("bt.k")
    public int field996;

    @ObfuscatedName("bt.n")
    public int field992;

    @ObfuscatedName("bt.i")
    public String field988;

    @ObfuscatedName("bt.a")
    public String field994;

    @ObfuscatedName("bt.z")
    public int field995;

    @ObfuscatedName("bt.j")
    public int field987;

    @ObfuscatedName("ji.m(I)Z")
    public static boolean method4944() {
        try {
            if (Statics.field3729 == null) {
                Statics.field3729 = Statics.field3705.method2989(new URL(Statics.field3173));
            } else if (Statics.field3729.method3000()) {
                byte[] var0 = Statics.field3729.method3002();
                class202 var1 = new class202(var0);
                var1.method3620();
                field991 = var1.method3530();
                Statics.field517 = new class72[field991];
                int var2 = 0;
                while (var2 < field991) {
                    class72 var3 = Statics.field517[var2] = new class72();
                    var3.field990 = var1.method3530();
                    var3.field996 = var1.method3620();
                    var3.field988 = var1.method3426();
                    var3.field994 = var1.method3426();
                    var3.field995 = var1.method3551();
                    var3.field992 = var1.method3420();
                    var3.field987 = var2++;
                }
                method3115(Statics.field517, 0, Statics.field517.length - 1, field989, field993);
                Statics.field3729 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field3729 = null;
        }
        return false;
    }

    @ObfuscatedName("bv.f(IIB)V")
    public static void method1810(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field989[var5] != arg0) {
                var2[var4] = field989[var5];
                var3[var4] = field993[var5];
                var4++;
            }
        }
        field989 = var2;
        field993 = var3;
        method3115(Statics.field517, 0, Statics.field517.length - 1, field989, field993);
    }

    @ObfuscatedName("fd.q([Lbt;II[I[II)V")
    public static void method3115(class72[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field987;
                        var12 = var8.field987;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field992;
                        var12 = var8.field992;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1558() ? 1 : 0;
                        var12 = var8.method1558() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field990;
                        var12 = var8.field990;
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
                        var15 = arg0[var5].field987;
                        var16 = var8.field987;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field992;
                        var16 = var8.field992;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1558() ? 1 : 0;
                        var16 = var8.method1558() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field990;
                        var16 = var8.field990;
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
        method3115(arg0, arg1, var6, arg3, arg4);
        method3115(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("h.w(IZIZI)V")
    public static void method231(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field517 != null) {
            method31(0, Statics.field517.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("w.o(IIIZIZI)V")
    public static void method31(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class72 var8 = Statics.field517[var6];
        Statics.field517[var6] = Statics.field517[arg1];
        Statics.field517[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class72 var10 = Statics.field517[var9];
            int var11 = Statics.method382(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = Statics.method382(var10, var8, arg4, arg5);
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
                class72 var14 = Statics.field517[var9];
                Statics.field517[var9] = Statics.field517[var7];
                Statics.field517[var7++] = var14;
            }
        }
        Statics.field517[arg1] = Statics.field517[var7];
        Statics.field517[var7] = var8;
        method31(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method31(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("gf.g(I)Lbt;")
    public static class72 method3321() {
        field986 = 0;
        return method5189();
    }

    @ObfuscatedName("kz.l(I)Lbt;")
    public static class72 method5189() {
        return field986 < field991 ? Statics.field517[++field986 - 1] : null;
    }

    @ObfuscatedName("bt.e(I)Z")
    public boolean method1558() {
        return (0x1 & this.field996) != 0;
    }

    @ObfuscatedName("bt.x(B)Z")
    public boolean method1559() {
        return (0x2 & this.field996) != 0;
    }

    @ObfuscatedName("bt.d(I)Z")
    public boolean method1560() {
        return (0x4 & this.field996) != 0;
    }

    @ObfuscatedName("bt.a(I)Z")
    public boolean method1561() {
        return (0x8 & this.field996) != 0;
    }

    @ObfuscatedName("bt.z(B)Z")
    public boolean method1562() {
        return (0x20000000 & this.field996) != 0;
    }

    @ObfuscatedName("bt.j(I)Z")
    public boolean method1575() {
        return (0x2000000 & this.field996) != 0;
    }
}
