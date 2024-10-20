package deob;

import java.net.URL;

@ObfuscatedName("bw")
public class class61 {

    @ObfuscatedName("bw.s")
    public static int field763 = 0;

    @ObfuscatedName("bw.j")
    public static int field764 = 0;

    @ObfuscatedName("bw.w")
    public static int[] field765 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bw.n")
    public static int[] field766 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bw.o")
    public int field767;

    @ObfuscatedName("bw.v")
    public int field775;

    @ObfuscatedName("bw.d")
    public int field762;

    @ObfuscatedName("bw.h")
    public String field770;

    @ObfuscatedName("bw.g")
    public String field771;

    @ObfuscatedName("bw.e")
    public int field772;

    @ObfuscatedName("bw.a")
    public int field773;

    @ObfuscatedName("jo.c(B)Z")
    public static boolean method4858() {
        try {
            if (Statics.field1828 == null) {
                Statics.field1828 = Statics.field2655.method2355(new URL(Statics.field2762));
            } else if (Statics.field1828.method2365()) {
                byte[] var0 = Statics.field1828.method2370();
                class419 var1 = new class419(var0);
                var1.method6675();
                field763 = var1.method6672();
                Statics.field4019 = new class61[field763];
                int var2 = 0;
                while (var2 < field763) {
                    class61 var3 = Statics.field4019[var2] = new class61();
                    var3.field767 = var1.method6672();
                    var3.field775 = var1.method6675();
                    var3.field770 = var1.method6707();
                    var3.field771 = var1.method6707();
                    var3.field772 = var1.method6781();
                    var3.field762 = var1.method6673();
                    var3.field773 = var2++;
                }
                method2384(Statics.field4019, 0, Statics.field4019.length - 1, field766, field765);
                Statics.field1828 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1828 = null;
        }
        return false;
    }

    @ObfuscatedName("dr.b(III)V")
    public static void method2404(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field766[var5] != arg0) {
                var2[var4] = field766[var5];
                var3[var4] = field765[var5];
                var4++;
            }
        }
        field766 = var2;
        field765 = var3;
        method2384(Statics.field4019, 0, Statics.field4019.length - 1, field766, field765);
    }

    @ObfuscatedName("cu.p([Lbw;II[I[II)V")
    public static void method2384(class61[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field773;
                        var12 = var8.field773;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field762;
                        var12 = var8.field762;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1586() ? 1 : 0;
                        var12 = var8.method1586() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field767;
                        var12 = var8.field767;
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
                        var15 = arg0[var5].field773;
                        var16 = var8.field773;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field762;
                        var16 = var8.field762;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1586() ? 1 : 0;
                        var16 = var8.method1586() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field767;
                        var16 = var8.field767;
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
        method2384(arg0, arg1, var6, arg3, arg4);
        method2384(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("dc.m(IZIZI)V")
    public static void method2549(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field4019 != null) {
            Statics.method4966(0, Statics.field4019.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cu.s(Lbw;Lbw;IZIZB)I")
    public static int method2383(class61 arg0, class61 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method653(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method653(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("av.j(Lbw;Lbw;IZB)I")
    public static int method653(class61 arg0, class61 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field762;
            int var5 = arg1.field762;
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
            return arg0.field772 - arg1.field772;
        } else if (arg2 == 3) {
            if (arg0.field771.equals("-")) {
                if (arg1.field771.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field771.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field771.compareTo(arg1.field771);
            }
        } else if (arg2 == 4) {
            return arg0.method1589() ? (arg1.method1589() ? 0 : 1) : (arg1.method1589() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1609() ? (arg1.method1609() ? 0 : 1) : (arg1.method1609() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1588() ? (arg1.method1588() ? 0 : 1) : (arg1.method1588() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1586() ? (arg1.method1586() ? 0 : 1) : (arg1.method1586() ? -1 : 0);
        } else {
            return arg0.field767 - arg1.field767;
        }
    }

    @ObfuscatedName("ja.w(B)Lbw;")
    public static class61 method4960() {
        field764 = 0;
        return method395();
    }

    @ObfuscatedName("y.n(B)Lbw;")
    public static class61 method395() {
        return field764 < field763 ? Statics.field4019[++field764 - 1] : null;
    }

    @ObfuscatedName("bw.r(B)Z")
    public boolean method1586() {
        return (0x1 & this.field775) != 0;
    }

    @ObfuscatedName("bw.o(I)Z")
    public boolean method1609() {
        return (0x2 & this.field775) != 0;
    }

    @ObfuscatedName("bw.v(I)Z")
    public boolean method1588() {
        return (0x4 & this.field775) != 0;
    }

    @ObfuscatedName("bw.d(I)Z")
    public boolean method1589() {
        return (0x8 & this.field775) != 0;
    }

    @ObfuscatedName("bw.h(B)Z")
    public boolean method1590() {
        return (0x20000000 & this.field775) != 0;
    }

    @ObfuscatedName("bw.g(I)Z")
    public boolean method1591() {
        return (0x2000000 & this.field775) != 0;
    }

    @ObfuscatedName("bw.e(B)Z")
    public boolean method1592() {
        return (0x40000000 & this.field775) != 0;
    }
}
