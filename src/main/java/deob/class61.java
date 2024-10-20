package deob;

import java.net.URL;

@ObfuscatedName("bb")
public class class61 {

    @ObfuscatedName("bb.n")
    public static int field791 = 0;

    @ObfuscatedName("bb.s")
    public static int field794 = 0;

    @ObfuscatedName("bb.l")
    public static int[] field793 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bb.q")
    public static int[] field788 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bb.r")
    public int field796;

    @ObfuscatedName("bb.p")
    public int field792;

    @ObfuscatedName("bb.w")
    public int field797;

    @ObfuscatedName("bb.k")
    public String field795;

    @ObfuscatedName("bb.d")
    public String field799;

    @ObfuscatedName("bb.m")
    public int field787;

    @ObfuscatedName("bb.u")
    public int field801;

    @ObfuscatedName("cu.v(I)Z")
    public static boolean method2282() {
        try {
            if (Statics.field3315 == null) {
                Statics.field3315 = Statics.field1932.method2402(new URL(Statics.field1837));
            } else if (Statics.field3315.method2444()) {
                byte[] var0 = Statics.field3315.method2431();
                class438 var1 = new class438(var0);
                var1.method6976();
                field791 = var1.method7148();
                Statics.field153 = new class61[field791];
                int var2 = 0;
                while (var2 < field791) {
                    class61 var3 = Statics.field153[var2] = new class61();
                    var3.field796 = var1.method7148();
                    var3.field792 = var1.method6976();
                    var3.field795 = var1.method6981();
                    var3.field799 = var1.method6981();
                    var3.field787 = var1.method6971();
                    var3.field797 = var1.method6974();
                    var3.field801 = var2++;
                }
                method2687(Statics.field153, 0, Statics.field153.length - 1, field788, field793);
                Statics.field3315 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field3315 = null;
        }
        return false;
    }

    @ObfuscatedName("cg.c(IIB)V")
    public static void method2301(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field788[var5] != arg0) {
                var2[var4] = field788[var5];
                var3[var4] = field793[var5];
                var4++;
            }
        }
        field788 = var2;
        field793 = var3;
        method2687(Statics.field153, 0, Statics.field153.length - 1, field788, field793);
    }

    @ObfuscatedName("dh.i([Lbb;II[I[IB)V")
    public static void method2687(class61[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field801;
                        var12 = var8.field801;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field797;
                        var12 = var8.field797;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1552() ? 1 : 0;
                        var12 = var8.method1552() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field796;
                        var12 = var8.field796;
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
                        var15 = arg0[var5].field801;
                        var16 = var8.field801;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field797;
                        var16 = var8.field797;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1552() ? 1 : 0;
                        var16 = var8.method1552() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field796;
                        var16 = var8.field796;
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
        method2687(arg0, arg1, var6, arg3, arg4);
        method2687(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("gl.f(IZIZI)V")
    public static void method3885(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field153 != null) {
            method1674(0, Statics.field153.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bx.b(IIIZIZB)V")
    public static void method1674(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class61 var8 = Statics.field153[var6];
        Statics.field153[var6] = Statics.field153[arg1];
        Statics.field153[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method3201(Statics.field153[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class61 var10 = Statics.field153[var9];
                Statics.field153[var9] = Statics.field153[var7];
                Statics.field153[var7++] = var10;
            }
        }
        Statics.field153[arg1] = Statics.field153[var7];
        Statics.field153[var7] = var8;
        method1674(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method1674(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("fg.n(Lbb;Lbb;IZIZI)I")
    public static int method3201(class61 arg0, class61 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method4972(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method4972(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("ki.s(Lbb;Lbb;IZB)I")
    public static int method4972(class61 arg0, class61 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field797;
            int var5 = arg1.field797;
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
            return arg0.field787 - arg1.field787;
        } else if (arg2 == 3) {
            if (arg0.field799.equals("-")) {
                if (arg1.field799.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field799.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field799.compareTo(arg1.field799);
            }
        } else if (arg2 == 4) {
            return arg0.method1555() ? (arg1.method1555() ? 0 : 1) : (arg1.method1555() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1553() ? (arg1.method1553() ? 0 : 1) : (arg1.method1553() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1560() ? (arg1.method1560() ? 0 : 1) : (arg1.method1560() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1552() ? (arg1.method1552() ? 0 : 1) : (arg1.method1552() ? -1 : 0);
        } else {
            return arg0.field796 - arg1.field796;
        }
    }

    @ObfuscatedName("bu.l(I)Lbb;")
    public static class61 method1959() {
        field794 = 0;
        return method5224();
    }

    @ObfuscatedName("ke.q(I)Lbb;")
    public static class61 method5224() {
        return field794 < field791 ? Statics.field153[++field794 - 1] : null;
    }

    @ObfuscatedName("bb.o(B)Z")
    public boolean method1552() {
        return (0x1 & this.field792) != 0;
    }

    @ObfuscatedName("bb.r(I)Z")
    public boolean method1553() {
        return (0x2 & this.field792) != 0;
    }

    @ObfuscatedName("bb.p(I)Z")
    public boolean method1560() {
        return (0x4 & this.field792) != 0;
    }

    @ObfuscatedName("bb.w(B)Z")
    public boolean method1555() {
        return (0x8 & this.field792) != 0;
    }

    @ObfuscatedName("bb.k(I)Z")
    public boolean method1556() {
        return (0x20000000 & this.field792) != 0;
    }

    @ObfuscatedName("bb.d(I)Z")
    public boolean method1579() {
        return (0x2000000 & this.field792) != 0;
    }

    @ObfuscatedName("bb.m(B)Z")
    public boolean method1558() {
        return (0x40000000 & this.field792) != 0;
    }
}
