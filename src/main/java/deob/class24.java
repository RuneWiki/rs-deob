package deob;

import java.net.URL;

@ObfuscatedName("d")
public class class24 {

    @ObfuscatedName("d.q")
    public static int field609 = 0;

    @ObfuscatedName("d.l")
    public static int field610 = 0;

    @ObfuscatedName("d.c")
    public static int[] field611 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("d.f")
    public static int[] field607 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("d.m")
    public int field608;

    @ObfuscatedName("d.y")
    public int field614;

    @ObfuscatedName("d.b")
    public int field615;

    @ObfuscatedName("d.v")
    public String field616;

    @ObfuscatedName("d.z")
    public String field617;

    @ObfuscatedName("d.u")
    public int field618;

    @ObfuscatedName("d.g")
    public int field619;

    @ObfuscatedName("fa.n(I)Z")
    public static boolean method3165() {
        try {
            if (Statics.field2833 == null) {
                Statics.field2833 = new class18(Statics.field813, new URL(Statics.field1939));
            } else {
                byte[] var0 = Statics.field2833.method164();
                if (var0 != null) {
                    class111 var1 = new class111(var0);
                    field609 = var1.method2157();
                    Statics.field544 = new class24[field609];
                    int var2 = 0;
                    while (var2 < field609) {
                        class24 var3 = Statics.field544[var2] = new class24();
                        var3.field608 = var1.method2157();
                        var3.field614 = var1.method2160();
                        var3.field616 = var1.method2163();
                        var3.field617 = var1.method2163();
                        var3.field618 = var1.method2155();
                        var3.field615 = var1.method2166();
                        var3.field619 = var2++;
                    }
                    method106(Statics.field544, 0, Statics.field544.length - 1, field607, field611);
                    Statics.field2833 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2833 = null;
        }
        return false;
    }

    @ObfuscatedName("k.w(III)V")
    public static void method166(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field607[var5] != arg0) {
                var2[var4] = field607[var5];
                var3[var4] = field611[var5];
                var4++;
            }
        }
        field607 = var2;
        field611 = var3;
        method106(Statics.field544, 0, Statics.field544.length - 1, field607, field611);
    }

    @ObfuscatedName("s.i([Ld;II[I[IB)V")
    public static void method106(class24[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class24 var8 = arg0[var7];
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
                        var11 = arg0[var6].field619;
                        var12 = var8.field619;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field615;
                        var12 = var8.field615;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method522() ? 1 : 0;
                        var12 = var8.method522() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field608;
                        var12 = var8.field608;
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
                        var15 = arg0[var5].field619;
                        var16 = var8.field619;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field615;
                        var16 = var8.field615;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method522() ? 1 : 0;
                        var16 = var8.method522() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field608;
                        var16 = var8.field608;
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
                class24 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method106(arg0, arg1, var6, arg3, arg4);
        method106(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("x.e(IIIZIZI)V")
    public static void method515(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class24 var8 = Statics.field544[var6];
        Statics.field544[var6] = Statics.field544[arg1];
        Statics.field544[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method2080(Statics.field544[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class24 var10 = Statics.field544[var9];
                Statics.field544[var9] = Statics.field544[var7];
                Statics.field544[var7++] = var10;
            }
        }
        Statics.field544[arg1] = Statics.field544[var7];
        Statics.field544[var7] = var8;
        method515(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method515(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("cm.h(Ld;Ld;IZIZI)I")
    public static int method2080(class24 arg0, class24 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = Statics.method596(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = Statics.method596(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("fg.l(I)Ld;")
    public static class24 method3304() {
        return field610 < field609 ? Statics.field544[++field610 - 1] : null;
    }

    @ObfuscatedName("d.c(B)Z")
    public boolean method522() {
        return (0x1 & this.field614) != 0;
    }

    @ObfuscatedName("d.f(I)Z")
    public boolean method549() {
        return (0x2 & this.field614) != 0;
    }

    @ObfuscatedName("d.s(B)Z")
    public boolean method540() {
        return (0x4 & this.field614) != 0;
    }

    @ObfuscatedName("d.m(I)Z")
    public boolean method525() {
        return (0x8 & this.field614) != 0;
    }
}
