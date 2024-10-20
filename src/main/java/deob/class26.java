package deob;

import java.net.URL;

@ObfuscatedName("t")
public class class26 {

    @ObfuscatedName("t.j")
    public static int field603 = 0;

    @ObfuscatedName("t.i")
    public static int field604 = 0;

    @ObfuscatedName("t.x")
    public static int[] field605 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("t.g")
    public static int[] field601 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("t.p")
    public int field607;

    @ObfuscatedName("t.a")
    public int field608;

    @ObfuscatedName("t.v")
    public int field617;

    @ObfuscatedName("t.c")
    public String field610;

    @ObfuscatedName("t.s")
    public String field614;

    @ObfuscatedName("t.r")
    public int field612;

    @ObfuscatedName("t.h")
    public int field613;

    @ObfuscatedName("v.m(B)Z")
    public static boolean method157() {
        try {
            if (Statics.field1641 == null) {
                Statics.field1641 = new class19(Statics.field2048, new URL(Statics.field154));
            } else {
                byte[] var0 = Statics.field1641.method195();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    field603 = var1.method2541();
                    Statics.field602 = new class26[field603];
                    int var2 = 0;
                    while (var2 < field603) {
                        class26 var3 = Statics.field602[var2] = new class26();
                        var3.field607 = var1.method2541();
                        var3.field608 = var1.method2386();
                        var3.field610 = var1.method2389();
                        var3.field614 = var1.method2389();
                        var3.field612 = var1.method2562();
                        var3.field617 = var1.method2384();
                        var3.field613 = var2++;
                    }
                    method2629(Statics.field602, 0, Statics.field602.length - 1, field601, field605);
                    Statics.field1641 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1641 = null;
        }
        return false;
    }

    @ObfuscatedName("c.l(III)V")
    public static void method166(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field601[var5] != arg0) {
                var2[var4] = field601[var5];
                var3[var4] = field605[var5];
                var4++;
            }
        }
        field601 = var2;
        field605 = var3;
        method2629(Statics.field602, 0, Statics.field602.length - 1, field601, field605);
    }

    @ObfuscatedName("ds.y([Lt;II[I[IB)V")
    public static void method2629(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class26 var8 = arg0[var7];
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
                        var11 = arg0[var6].field613;
                        var12 = var8.field613;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field617;
                        var12 = var8.field617;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method621() ? 1 : 0;
                        var12 = var8.method621() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field607;
                        var12 = var8.field607;
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
                        var15 = arg0[var5].field613;
                        var16 = var8.field613;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field617;
                        var16 = var8.field617;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method621() ? 1 : 0;
                        var16 = var8.method621() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field607;
                        var16 = var8.field607;
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
                class26 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2629(arg0, arg1, var6, arg3, arg4);
        method2629(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("cb.u(IZIZI)V")
    public static void method1993(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field602 != null) {
            Statics.method1191(0, Statics.field602.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dv.j(Lt;Lt;IZIZI)I")
    public static int method2691(class26 arg0, class26 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method451(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method451(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("client.i(Lt;Lt;IZI)I")
    public static int method451(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field617;
            int var5 = arg1.field617;
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
            return arg0.field612 - arg1.field612;
        } else if (arg2 == 3) {
            if (arg0.field614.equals("-")) {
                if (arg1.field614.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field614.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field614.compareTo(arg1.field614);
            }
        } else if (arg2 == 4) {
            return arg0.method646() ? (arg1.method646() ? 0 : 1) : (arg1.method646() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method622() ? (arg1.method622() ? 0 : 1) : (arg1.method622() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method632() ? (arg1.method632() ? 0 : 1) : (arg1.method632() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method621() ? (arg1.method621() ? 0 : 1) : (arg1.method621() ? -1 : 0);
        } else {
            return arg0.field607 - arg1.field607;
        }
    }

    @ObfuscatedName("n.x(B)Lt;")
    public static class26 method190() {
        field604 = 0;
        return method152();
    }

    @ObfuscatedName("a.g(B)Lt;")
    public static class26 method152() {
        return field604 < field603 ? Statics.field602[++field604 - 1] : null;
    }

    @ObfuscatedName("t.e(B)Z")
    public boolean method621() {
        return (0x1 & this.field608) != 0;
    }

    @ObfuscatedName("t.p(B)Z")
    public boolean method622() {
        return (0x2 & this.field608) != 0;
    }

    @ObfuscatedName("t.a(I)Z")
    public boolean method632() {
        return (0x4 & this.field608) != 0;
    }

    @ObfuscatedName("t.v(I)Z")
    public boolean method646() {
        return (0x8 & this.field608) != 0;
    }
}
