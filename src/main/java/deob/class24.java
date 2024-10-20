package deob;

import java.net.URL;

@ObfuscatedName("y")
public class class24 {

    @ObfuscatedName("y.o")
    public static int field592 = 0;

    @ObfuscatedName("y.f")
    public static int field593 = 0;

    @ObfuscatedName("y.d")
    public static int[] field594 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("y.j")
    public static int[] field595 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("y.v")
    public int field604;

    @ObfuscatedName("y.a")
    public int field597;

    @ObfuscatedName("y.l")
    public int field598;

    @ObfuscatedName("y.h")
    public String field599;

    @ObfuscatedName("y.c")
    public String field600;

    @ObfuscatedName("y.u")
    public int field590;

    @ObfuscatedName("y.r")
    public int field602;

    @ObfuscatedName("c.t(I)Z")
    public static boolean method162() {
        try {
            if (Statics.field579 == null) {
                Statics.field579 = new class18(Statics.field957, new URL(Statics.field1834));
            } else {
                byte[] var0 = Statics.field579.method175();
                if (var0 != null) {
                    class111 var1 = new class111(var0);
                    field592 = var1.method2255();
                    Statics.field587 = new class24[field592];
                    int var2 = 0;
                    while (var2 < field592) {
                        class24 var3 = Statics.field587[var2] = new class24();
                        var3.field604 = var1.method2255();
                        var3.field597 = var1.method2177();
                        var3.field599 = var1.method2180();
                        var3.field600 = var1.method2180();
                        var3.field590 = var1.method2172();
                        var3.field598 = var1.method2304();
                        var3.field602 = var2++;
                    }
                    method2006(Statics.field587, 0, Statics.field587.length - 1, field595, field594);
                    Statics.field579 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field579 = null;
        }
        return false;
    }

    @ObfuscatedName("v.b(IIB)V")
    public static void method138(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field595[var5] != arg0) {
                var2[var4] = field595[var5];
                var3[var4] = field594[var5];
                var4++;
            }
        }
        field595 = var2;
        field594 = var3;
        method2006(Statics.field587, 0, Statics.field587.length - 1, field595, field594);
    }

    @ObfuscatedName("cn.p([Ly;II[I[IB)V")
    public static void method2006(class24[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field602;
                        var12 = var8.field602;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field598;
                        var12 = var8.field598;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method558() ? 1 : 0;
                        var12 = var8.method558() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field604;
                        var12 = var8.field604;
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
                        var15 = arg0[var5].field602;
                        var16 = var8.field602;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field598;
                        var16 = var8.field598;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method558() ? 1 : 0;
                        var16 = var8.method558() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field604;
                        var16 = var8.field604;
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
        method2006(arg0, arg1, var6, arg3, arg4);
        method2006(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("eh.e(IZIZI)V")
    public static void method2617(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field587 != null) {
            method3052(0, Statics.field587.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("fg.i(IIIZIZI)V")
    public static void method3052(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class24 var8 = Statics.field587[var6];
        Statics.field587[var6] = Statics.field587[arg1];
        Statics.field587[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class24 var10 = Statics.field587[var9];
            int var11 = method542(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method542(var10, var8, arg4, arg5);
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
                class24 var14 = Statics.field587[var9];
                Statics.field587[var9] = Statics.field587[var7];
                Statics.field587[var7++] = var14;
            }
        }
        Statics.field587[arg1] = Statics.field587[var7];
        Statics.field587[var7] = var8;
        method3052(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method3052(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("g.o(Ly;Ly;IZB)I")
    public static int method542(class24 arg0, class24 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field598;
            int var5 = arg1.field598;
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
            return arg0.field590 - arg1.field590;
        } else if (arg2 == 3) {
            if (arg0.field600.equals("-")) {
                if (arg1.field600.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field600.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field600.compareTo(arg1.field600);
            }
        } else if (arg2 == 4) {
            return arg0.method560() ? (arg1.method560() ? 0 : 1) : (arg1.method560() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method557() ? (arg1.method557() ? 0 : 1) : (arg1.method557() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method577() ? (arg1.method577() ? 0 : 1) : (arg1.method577() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method558() ? (arg1.method558() ? 0 : 1) : (arg1.method558() ? -1 : 0);
        } else {
            return arg0.field604 - arg1.field604;
        }
    }

    @ObfuscatedName("x.f(B)Ly;")
    public static class24 method118() {
        return field593 < field592 ? Statics.field587[++field593 - 1] : null;
    }

    @ObfuscatedName("y.d(I)Z")
    public boolean method558() {
        return (0x1 & this.field597) != 0;
    }

    @ObfuscatedName("y.j(I)Z")
    public boolean method557() {
        return (0x2 & this.field597) != 0;
    }

    @ObfuscatedName("y.x(I)Z")
    public boolean method577() {
        return (0x4 & this.field597) != 0;
    }

    @ObfuscatedName("y.v(I)Z")
    public boolean method560() {
        return (0x8 & this.field597) != 0;
    }
}
