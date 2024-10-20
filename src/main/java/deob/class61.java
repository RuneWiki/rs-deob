package deob;

import java.net.URL;

@ObfuscatedName("bw")
public class class61 {

    @ObfuscatedName("bw.g")
    public static int field760 = 0;

    @ObfuscatedName("bw.e")
    public static int field753 = 0;

    @ObfuscatedName("bw.p")
    public static int[] field758 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bw.j")
    public static int[] field755 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bw.x")
    public int field752;

    @ObfuscatedName("bw.y")
    public int field754;

    @ObfuscatedName("bw.k")
    public int field756;

    @ObfuscatedName("bw.t")
    public String field759;

    @ObfuscatedName("bw.l")
    public String field757;

    @ObfuscatedName("bw.u")
    public int field761;

    @ObfuscatedName("bw.n")
    public int field762;

    @ObfuscatedName("iy.i(I)Z")
    public static boolean method4434() {
        try {
            if (Statics.field100 == null) {
                Statics.field100 = Statics.field3866.method2304(new URL(Statics.field2619));
            } else if (Statics.field100.method2307()) {
                byte[] var0 = Statics.field100.method2309();
                class401 var1 = new class401(var0);
                var1.method6245();
                field760 = var1.method6242();
                Statics.field2230 = new class61[field760];
                int var2 = 0;
                while (var2 < field760) {
                    class61 var3 = Statics.field2230[var2] = new class61();
                    var3.field752 = var1.method6242();
                    var3.field754 = var1.method6245();
                    var3.field759 = var1.method6335();
                    var3.field757 = var1.method6335();
                    var3.field761 = var1.method6240();
                    var3.field756 = var1.method6243();
                    var3.field762 = var2++;
                }
                method1667(Statics.field2230, 0, Statics.field2230.length - 1, field755, field758);
                Statics.field100 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field100 = null;
        }
        return false;
    }

    @ObfuscatedName("jb.w(IIB)V")
    public static void method4678(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field755[var5] != arg0) {
                var2[var4] = field755[var5];
                var3[var4] = field758[var5];
                var4++;
            }
        }
        field755 = var2;
        field758 = var3;
        method1667(Statics.field2230, 0, Statics.field2230.length - 1, field755, field758);
    }

    @ObfuscatedName("br.s([Lbw;II[I[II)V")
    public static void method1667(class61[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field762;
                        var12 = var8.field762;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field756;
                        var12 = var8.field756;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1550() ? 1 : 0;
                        var12 = var8.method1550() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field752;
                        var12 = var8.field752;
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
                        var15 = arg0[var5].field762;
                        var16 = var8.field762;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field756;
                        var16 = var8.field756;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1550() ? 1 : 0;
                        var16 = var8.method1550() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field752;
                        var16 = var8.field752;
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
        method1667(arg0, arg1, var6, arg3, arg4);
        method1667(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("y.a(IZIZI)V")
    public static void method102(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field2230 != null) {
            method1660(0, Statics.field2230.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bm.o(IIIZIZB)V")
    public static void method1660(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class61 var8 = Statics.field2230[var6];
        Statics.field2230[var6] = Statics.field2230[arg1];
        Statics.field2230[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class61 var10 = Statics.field2230[var9];
            int var11 = method5793(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method5793(var10, var8, arg4, arg5);
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
                class61 var14 = Statics.field2230[var9];
                Statics.field2230[var9] = Statics.field2230[var7];
                Statics.field2230[var7++] = var14;
            }
        }
        Statics.field2230[arg1] = Statics.field2230[var7];
        Statics.field2230[var7] = var8;
        method1660(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method1660(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("nc.g(Lbw;Lbw;IZB)I")
    public static int method5793(class61 arg0, class61 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field756;
            int var5 = arg1.field756;
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
            return arg0.field761 - arg1.field761;
        } else if (arg2 == 3) {
            if (arg0.field757.equals("-")) {
                if (arg1.field757.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field757.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field757.compareTo(arg1.field757);
            }
        } else if (arg2 == 4) {
            return arg0.method1585() ? (arg1.method1585() ? 0 : 1) : (arg1.method1585() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1553() ? (arg1.method1553() ? 0 : 1) : (arg1.method1553() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1584() ? (arg1.method1584() ? 0 : 1) : (arg1.method1584() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1550() ? (arg1.method1550() ? 0 : 1) : (arg1.method1550() ? -1 : 0);
        } else {
            return arg0.field752 - arg1.field752;
        }
    }

    @ObfuscatedName("r.e(I)Lbw;")
    public static class61 method293() {
        field753 = 0;
        return method2142();
    }

    @ObfuscatedName("cg.p(B)Lbw;")
    public static class61 method2142() {
        return field753 < field760 ? Statics.field2230[++field753 - 1] : null;
    }

    @ObfuscatedName("bw.j(B)Z")
    public boolean method1550() {
        return (0x1 & this.field754) != 0;
    }

    @ObfuscatedName("bw.b(I)Z")
    public boolean method1553() {
        return (0x2 & this.field754) != 0;
    }

    @ObfuscatedName("bw.x(B)Z")
    public boolean method1584() {
        return (0x4 & this.field754) != 0;
    }

    @ObfuscatedName("bw.y(I)Z")
    public boolean method1585() {
        return (0x8 & this.field754) != 0;
    }

    @ObfuscatedName("bw.k(B)Z")
    public boolean method1554() {
        return (0x20000000 & this.field754) != 0;
    }

    @ObfuscatedName("bw.t(I)Z")
    public boolean method1555() {
        return (0x2000000 & this.field754) != 0;
    }

    @ObfuscatedName("bw.l(B)Z")
    public boolean method1556() {
        return (0x40000000 & this.field754) != 0;
    }
}
