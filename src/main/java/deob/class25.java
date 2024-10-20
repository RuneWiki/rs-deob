package deob;

import java.net.URL;

@ObfuscatedName("b")
public class class25 {

    @ObfuscatedName("b.d")
    public static int field643 = 0;

    @ObfuscatedName("b.f")
    public static int field644 = 0;

    @ObfuscatedName("b.i")
    public static int[] field654 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("b.a")
    public static int[] field646 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("b.u")
    public int field650;

    @ObfuscatedName("b.m")
    public int field641;

    @ObfuscatedName("b.e")
    public int field649;

    @ObfuscatedName("b.v")
    public String field638;

    @ObfuscatedName("b.r")
    public String field651;

    @ObfuscatedName("b.t")
    public int field652;

    @ObfuscatedName("b.g")
    public int field653;

    @ObfuscatedName("fj.j(I)Z")
    public static boolean method3301() {
        try {
            if (Statics.field1072 == null) {
                Statics.field1072 = new class18(Statics.field109, new URL(Statics.field217));
            } else {
                byte[] var0 = Statics.field1072.method179();
                if (var0 != null) {
                    class114 var1 = new class114(var0);
                    field643 = var1.method2324();
                    Statics.field642 = new class25[field643];
                    int var2 = 0;
                    while (var2 < field643) {
                        class25 var3 = Statics.field642[var2] = new class25();
                        var3.field650 = var1.method2324();
                        var3.field641 = var1.method2327();
                        var3.field638 = var1.method2440();
                        var3.field651 = var1.method2440();
                        var3.field652 = var1.method2322();
                        var3.field649 = var1.method2308();
                        var3.field653 = var2++;
                    }
                    method1976(Statics.field642, 0, Statics.field642.length - 1, field646, field654);
                    Statics.field1072 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1072 = null;
        }
        return false;
    }

    @ObfuscatedName("fk.y(IIB)V")
    public static void method2928(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field646[var5] != arg0) {
                var2[var4] = field646[var5];
                var3[var4] = field654[var5];
                var4++;
            }
        }
        field646 = var2;
        field654 = var3;
        method1976(Statics.field642, 0, Statics.field642.length - 1, field646, field654);
    }

    @ObfuscatedName("cq.z([Lb;II[I[II)V")
    public static void method1976(class25[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class25 var8 = arg0[var7];
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
                        var11 = arg0[var6].field653;
                        var12 = var8.field653;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field649;
                        var12 = var8.field649;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method598() ? 1 : 0;
                        var12 = var8.method598() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field650;
                        var12 = var8.field650;
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
                        var15 = arg0[var5].field653;
                        var16 = var8.field653;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field649;
                        var16 = var8.field649;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method598() ? 1 : 0;
                        var16 = var8.method598() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field650;
                        var16 = var8.field650;
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
                class25 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method1976(arg0, arg1, var6, arg3, arg4);
        method1976(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("f.l(IZIZI)V")
    public static void method94(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field642 != null) {
            method30(0, Statics.field642.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("l.w(IIIZIZI)V")
    public static void method30(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class25 var8 = Statics.field642[var6];
        Statics.field642[var6] = Statics.field642[arg1];
        Statics.field642[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class25 var10 = Statics.field642[var9];
            int var11 = method2051(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method2051(var10, var8, arg4, arg5);
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
                class25 var14 = Statics.field642[var9];
                Statics.field642[var9] = Statics.field642[var7];
                Statics.field642[var7++] = var14;
            }
        }
        Statics.field642[arg1] = Statics.field642[var7];
        Statics.field642[var7] = var8;
        method30(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method30(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("cn.d(Lb;Lb;IZB)I")
    public static int method2051(class25 arg0, class25 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field649;
            int var5 = arg1.field649;
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
            return arg0.field652 - arg1.field652;
        } else if (arg2 == 3) {
            if (arg0.field651.equals("-")) {
                if (arg1.field651.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field651.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field651.compareTo(arg1.field651);
            }
        } else if (arg2 == 4) {
            return arg0.method604() ? (arg1.method604() ? 0 : 1) : (arg1.method604() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method599() ? (arg1.method599() ? 0 : 1) : (arg1.method599() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method600() ? (arg1.method600() ? 0 : 1) : (arg1.method600() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method598() ? (arg1.method598() ? 0 : 1) : (arg1.method598() ? -1 : 0);
        } else {
            return arg0.field650 - arg1.field650;
        }
    }

    @ObfuscatedName("dn.f(I)Lb;")
    public static class25 method2262() {
        return field644 < field643 ? Statics.field642[++field644 - 1] : null;
    }

    @ObfuscatedName("b.i(B)Z")
    public boolean method598() {
        return (0x1 & this.field641) != 0;
    }

    @ObfuscatedName("b.a(I)Z")
    public boolean method599() {
        return (0x2 & this.field641) != 0;
    }

    @ObfuscatedName("b.o(B)Z")
    public boolean method600() {
        return (0x4 & this.field641) != 0;
    }

    @ObfuscatedName("b.u(I)Z")
    public boolean method604() {
        return (0x8 & this.field641) != 0;
    }
}
