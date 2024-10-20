package deob;

@ObfuscatedName("bc")
public class class61 {

    @ObfuscatedName("bc.e")
    public static int field785 = 0;

    @ObfuscatedName("bc.g")
    public static int field789 = 0;

    @ObfuscatedName("bc.w")
    public static int[] field787 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bc.y")
    public static int[] field788 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bc.s")
    public int field786;

    @ObfuscatedName("bc.t")
    public int field790;

    @ObfuscatedName("bc.z")
    public int field796;

    @ObfuscatedName("bc.r")
    public String field792;

    @ObfuscatedName("bc.u")
    public String field793;

    @ObfuscatedName("bc.k")
    public int field794;

    @ObfuscatedName("bc.h")
    public int field795;

    @ObfuscatedName("aj.v(III)V")
    public static void method572(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field788[var5] != arg0) {
                var2[var4] = field788[var5];
                var3[var4] = field787[var5];
                var4++;
            }
        }
        field788 = var2;
        field787 = var3;
        method2015(Statics.field4280, 0, Statics.field4280.length - 1, field788, field787);
    }

    @ObfuscatedName("cx.q([Lbc;II[I[IB)V")
    public static void method2015(class61[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field795;
                        var12 = var8.field795;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field796;
                        var12 = var8.field796;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1529() ? 1 : 0;
                        var12 = var8.method1529() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field786;
                        var12 = var8.field786;
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
                        var15 = arg0[var5].field795;
                        var16 = var8.field795;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field796;
                        var16 = var8.field796;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1529() ? 1 : 0;
                        var16 = var8.method1529() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field786;
                        var16 = var8.field786;
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
        method2015(arg0, arg1, var6, arg3, arg4);
        method2015(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("eq.f(IZIZI)V")
    public static void method2736(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field4280 != null) {
            method2704(0, Statics.field4280.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ej.j(IIIZIZI)V")
    public static void method2704(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class61 var8 = Statics.field4280[var6];
        Statics.field4280[var6] = Statics.field4280[arg1];
        Statics.field4280[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method4935(Statics.field4280[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class61 var10 = Statics.field4280[var9];
                Statics.field4280[var9] = Statics.field4280[var7];
                Statics.field4280[var7++] = var10;
            }
        }
        Statics.field4280[arg1] = Statics.field4280[var7];
        Statics.field4280[var7] = var8;
        method2704(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2704(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("jy.e(Lbc;Lbc;IZIZB)I")
    public static int method4935(class61 arg0, class61 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method2714(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method2714(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("ez.g(Lbc;Lbc;IZI)I")
    public static int method2714(class61 arg0, class61 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field796;
            int var5 = arg1.field796;
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
            return arg0.field794 - arg1.field794;
        } else if (arg2 == 3) {
            if (arg0.field793.equals("-")) {
                if (arg1.field793.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field793.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field793.compareTo(arg1.field793);
            }
        } else if (arg2 == 4) {
            return arg0.method1505() ? (arg1.method1505() ? 0 : 1) : (arg1.method1505() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1539() ? (arg1.method1539() ? 0 : 1) : (arg1.method1539() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1501() ? (arg1.method1501() ? 0 : 1) : (arg1.method1501() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1529() ? (arg1.method1529() ? 0 : 1) : (arg1.method1529() ? -1 : 0);
        } else {
            return arg0.field786 - arg1.field786;
        }
    }

    @ObfuscatedName("ee.w(I)Lbc;")
    public static class61 method2867() {
        field789 = 0;
        return method1778();
    }

    @ObfuscatedName("bt.y(B)Lbc;")
    public static class61 method1778() {
        return field789 < field785 ? Statics.field4280[++field789 - 1] : null;
    }

    @ObfuscatedName("bc.i(B)Z")
    public boolean method1529() {
        return (0x1 & this.field790) != 0;
    }

    @ObfuscatedName("bc.s(I)Z")
    public boolean method1539() {
        return (0x2 & this.field790) != 0;
    }

    @ObfuscatedName("bc.t(I)Z")
    public boolean method1501() {
        return (0x4 & this.field790) != 0;
    }

    @ObfuscatedName("bc.z(I)Z")
    public boolean method1505() {
        return (0x8 & this.field790) != 0;
    }

    @ObfuscatedName("bc.r(I)Z")
    public boolean method1506() {
        return (0x20000000 & this.field790) != 0;
    }

    @ObfuscatedName("bc.u(I)Z")
    public boolean method1507() {
        return (0x2000000 & this.field790) != 0;
    }

    @ObfuscatedName("bc.k(B)Z")
    public boolean method1508() {
        return (0x40000000 & this.field790) != 0;
    }
}
