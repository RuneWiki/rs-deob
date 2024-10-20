package deob;

@ObfuscatedName("bk")
public class class72 {

    @ObfuscatedName("bk.l")
    public static int field996 = 0;

    @ObfuscatedName("bk.c")
    public static int field1007 = 0;

    @ObfuscatedName("bk.o")
    public static int[] field995 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bk.i")
    public static int[] field998 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bk.m")
    public int field999;

    @ObfuscatedName("bk.p")
    public int field1000;

    @ObfuscatedName("bk.h")
    public int field1001;

    @ObfuscatedName("bk.k")
    public String field1002;

    @ObfuscatedName("bk.x")
    public String field1003;

    @ObfuscatedName("bk.j")
    public int field1004;

    @ObfuscatedName("bk.r")
    public int field1005;

    @ObfuscatedName("ev.t(III)V")
    public static void method3107(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field998[var5] != arg0) {
                var2[var4] = field998[var5];
                var3[var4] = field995[var5];
                var4++;
            }
        }
        field998 = var2;
        field995 = var3;
        method26(Statics.field3608, 0, Statics.field3608.length - 1, field998, field995);
    }

    @ObfuscatedName("n.n([Lbk;II[I[II)V")
    public static void method26(class72[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1005;
                        var12 = var8.field1005;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1001;
                        var12 = var8.field1001;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1674() ? 1 : 0;
                        var12 = var8.method1674() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field999;
                        var12 = var8.field999;
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
                        var15 = arg0[var5].field1005;
                        var16 = var8.field1005;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1001;
                        var16 = var8.field1001;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1674() ? 1 : 0;
                        var16 = var8.method1674() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field999;
                        var16 = var8.field999;
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
        method26(arg0, arg1, var6, arg3, arg4);
        method26(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("cs.q(IZIZI)V")
    public static void method2206(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field3608 != null) {
            Statics.method3084(0, Statics.field3608.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bx.l(Lbk;Lbk;IZI)I")
    public static int method1042(class72 arg0, class72 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1001;
            int var5 = arg1.field1001;
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
            return arg0.field1004 - arg1.field1004;
        } else if (arg2 == 3) {
            if (arg0.field1003.equals("-")) {
                if (arg1.field1003.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1003.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1003.compareTo(arg1.field1003);
            }
        } else if (arg2 == 4) {
            return arg0.method1677() ? (arg1.method1677() ? 0 : 1) : (arg1.method1677() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1709() ? (arg1.method1709() ? 0 : 1) : (arg1.method1709() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1676() ? (arg1.method1676() ? 0 : 1) : (arg1.method1676() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1674() ? (arg1.method1674() ? 0 : 1) : (arg1.method1674() ? -1 : 0);
        } else {
            return arg0.field999 - arg1.field999;
        }
    }

    @ObfuscatedName("j.c(B)Lbk;")
    public static class72 method173() {
        field1007 = 0;
        return method16();
    }

    @ObfuscatedName("t.o(I)Lbk;")
    public static class72 method16() {
        return field1007 < field996 ? Statics.field3608[++field1007 - 1] : null;
    }

    @ObfuscatedName("bk.i(I)Z")
    public boolean method1674() {
        return (0x1 & this.field1000) != 0;
    }

    @ObfuscatedName("bk.d(I)Z")
    public boolean method1709() {
        return (0x2 & this.field1000) != 0;
    }

    @ObfuscatedName("bk.m(I)Z")
    public boolean method1676() {
        return (0x4 & this.field1000) != 0;
    }

    @ObfuscatedName("bk.p(I)Z")
    public boolean method1677() {
        return (0x8 & this.field1000) != 0;
    }

    @ObfuscatedName("bk.h(I)Z")
    public boolean method1711() {
        return (0x20000000 & this.field1000) != 0;
    }

    @ObfuscatedName("bk.k(I)Z")
    public boolean method1699() {
        return (0x2000000 & this.field1000) != 0;
    }

    @ObfuscatedName("bk.x(I)Z")
    public boolean method1679() {
        return (0x40000000 & this.field1000) != 0;
    }
}
