package deob;

import java.net.URL;

@ObfuscatedName("p")
public class class26 {

    @ObfuscatedName("p.o")
    public static int field631 = 0;

    @ObfuscatedName("p.i")
    public static int field632 = 0;

    @ObfuscatedName("p.w")
    public static int[] field635 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("p.m")
    public static int[] field634 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("p.y")
    public int field628;

    @ObfuscatedName("p.q")
    public int field643;

    @ObfuscatedName("p.f")
    public int field637;

    @ObfuscatedName("p.x")
    public String field636;

    @ObfuscatedName("p.d")
    public String field639;

    @ObfuscatedName("p.e")
    public int field640;

    @ObfuscatedName("p.l")
    public int field641;

    @ObfuscatedName("z.c(I)Z")
    public static boolean method572() {
        try {
            if (Statics.field789 == null) {
                Statics.field789 = new class19(Statics.field1993, new URL(Statics.field383));
            } else {
                byte[] var0 = Statics.field789.method182();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    field631 = var1.method2293();
                    Statics.field645 = new class26[field631];
                    int var2 = 0;
                    while (var2 < field631) {
                        class26 var3 = Statics.field645[var2] = new class26();
                        var3.field628 = var1.method2293();
                        var3.field643 = var1.method2296();
                        var3.field636 = var1.method2299();
                        var3.field639 = var1.method2299();
                        var3.field640 = var1.method2291();
                        var3.field637 = var1.method2439();
                        var3.field641 = var2++;
                    }
                    method2756(Statics.field645, 0, Statics.field645.length - 1, field634, field635);
                    Statics.field789 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field789 = null;
        }
        return false;
    }

    @ObfuscatedName("cb.h(III)V")
    public static void method1981(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field634[var5] != arg0) {
                var2[var4] = field634[var5];
                var3[var4] = field635[var5];
                var4++;
            }
        }
        field634 = var2;
        field635 = var3;
        method2756(Statics.field645, 0, Statics.field645.length - 1, field634, field635);
    }

    @ObfuscatedName("er.k([Lp;II[I[IB)V")
    public static void method2756(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field641;
                        var12 = var8.field641;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field637;
                        var12 = var8.field637;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method585() ? 1 : 0;
                        var12 = var8.method585() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field628;
                        var12 = var8.field628;
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
                        var15 = arg0[var5].field641;
                        var16 = var8.field641;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field637;
                        var16 = var8.field637;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method585() ? 1 : 0;
                        var16 = var8.method585() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field628;
                        var16 = var8.field628;
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
        method2756(arg0, arg1, var6, arg3, arg4);
        method2756(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("fr.t(IZIZI)V")
    public static void method3115(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field645 != null) {
            Statics.method882(0, Statics.field645.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("z.o(Lp;Lp;IZI)I")
    public static int method579(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field637;
            int var5 = arg1.field637;
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
            return arg0.field640 - arg1.field640;
        } else if (arg2 == 3) {
            if (arg0.field639.equals("-")) {
                if (arg1.field639.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field639.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field639.compareTo(arg1.field639);
            }
        } else if (arg2 == 4) {
            return arg0.method584() ? (arg1.method584() ? 0 : 1) : (arg1.method584() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method606() ? (arg1.method606() ? 0 : 1) : (arg1.method606() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method595() ? (arg1.method595() ? 0 : 1) : (arg1.method595() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method585() ? (arg1.method585() ? 0 : 1) : (arg1.method585() ? -1 : 0);
        } else {
            return arg0.field628 - arg1.field628;
        }
    }

    @ObfuscatedName("as.i(I)Lp;")
    public static class26 method872() {
        return field632 < field631 ? Statics.field645[++field632 - 1] : null;
    }

    @ObfuscatedName("p.w(I)Z")
    public boolean method585() {
        return (0x1 & this.field643) != 0;
    }

    @ObfuscatedName("p.m(I)Z")
    public boolean method606() {
        return (0x2 & this.field643) != 0;
    }

    @ObfuscatedName("p.r(I)Z")
    public boolean method595() {
        return (0x4 & this.field643) != 0;
    }

    @ObfuscatedName("p.y(I)Z")
    public boolean method584() {
        return (0x8 & this.field643) != 0;
    }
}
