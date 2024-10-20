package deob;

import java.net.URL;

@ObfuscatedName("v")
public class class26 {

    @ObfuscatedName("v.m")
    public static int field634 = 0;

    @ObfuscatedName("v.o")
    public static int field635 = 0;

    @ObfuscatedName("v.h")
    public static int[] field646 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("v.n")
    public static int[] field637 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("v.r")
    public int field638;

    @ObfuscatedName("v.b")
    public int field639;

    @ObfuscatedName("v.q")
    public int field640;

    @ObfuscatedName("v.u")
    public String field641;

    @ObfuscatedName("v.g")
    public String field642;

    @ObfuscatedName("v.y")
    public int field636;

    @ObfuscatedName("v.s")
    public int field643;

    @ObfuscatedName("cv.j(I)Z")
    public static boolean method1936() {
        try {
            if (Statics.field3157 == null) {
                Statics.field3157 = new class19(Statics.field649, new URL(Statics.field295));
            } else {
                byte[] var0 = Statics.field3157.method194();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    field634 = var1.method2318();
                    Statics.field633 = new class26[field634];
                    int var2 = 0;
                    while (var2 < field634) {
                        class26 var3 = Statics.field633[var2] = new class26();
                        var3.field638 = var1.method2318();
                        var3.field639 = var1.method2321();
                        var3.field641 = var1.method2324();
                        var3.field642 = var1.method2324();
                        var3.field636 = var1.method2316();
                        var3.field640 = var1.method2421();
                        var3.field643 = var2++;
                    }
                    method588(Statics.field633, 0, Statics.field633.length - 1, field637, field646);
                    Statics.field3157 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field3157 = null;
        }
        return false;
    }

    @ObfuscatedName("as.l(III)V")
    public static void method735(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field637[var5] != arg0) {
                var2[var4] = field637[var5];
                var3[var4] = field646[var5];
                var4++;
            }
        }
        field637 = var2;
        field646 = var3;
        method588(Statics.field633, 0, Statics.field633.length - 1, field637, field646);
    }

    @ObfuscatedName("x.a([Lv;II[I[II)V")
    public static void method588(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field643;
                        var12 = var8.field643;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field640;
                        var12 = var8.field640;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method609() ? 1 : 0;
                        var12 = var8.method609() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field638;
                        var12 = var8.field638;
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
                        var15 = arg0[var5].field643;
                        var16 = var8.field643;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field640;
                        var16 = var8.field640;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method609() ? 1 : 0;
                        var16 = var8.method609() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field638;
                        var16 = var8.field638;
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
        method588(arg0, arg1, var6, arg3, arg4);
        method588(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("bk.i(IZIZI)V")
    public static void method1231(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field633 != null) {
            method2775(0, Statics.field633.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ey.f(IIIZIZI)V")
    public static void method2775(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field633[var6];
        Statics.field633[var6] = Statics.field633[arg1];
        Statics.field633[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class26 var10 = Statics.field633[var9];
            int var11 = method1938(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method1938(var10, var8, arg4, arg5);
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
                class26 var14 = Statics.field633[var9];
                Statics.field633[var9] = Statics.field633[var7];
                Statics.field633[var7++] = var14;
            }
        }
        Statics.field633[arg1] = Statics.field633[var7];
        Statics.field633[var7] = var8;
        method2775(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2775(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("co.m(Lv;Lv;IZI)I")
    public static int method1938(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field640;
            int var5 = arg1.field640;
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
            return arg0.field636 - arg1.field636;
        } else if (arg2 == 3) {
            if (arg0.field642.equals("-")) {
                if (arg1.field642.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field642.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field642.compareTo(arg1.field642);
            }
        } else if (arg2 == 4) {
            return arg0.method628() ? (arg1.method628() ? 0 : 1) : (arg1.method628() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method595() ? (arg1.method595() ? 0 : 1) : (arg1.method595() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method599() ? (arg1.method599() ? 0 : 1) : (arg1.method599() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method609() ? (arg1.method609() ? 0 : 1) : (arg1.method609() ? -1 : 0);
        } else {
            return arg0.field638 - arg1.field638;
        }
    }

    @ObfuscatedName("k.o(I)Lv;")
    public static class26 method121() {
        field635 = 0;
        return method1754();
    }

    @ObfuscatedName("cn.h(I)Lv;")
    public static class26 method1754() {
        return field635 < field634 ? Statics.field633[++field635 - 1] : null;
    }

    @ObfuscatedName("v.n(B)Z")
    public boolean method609() {
        return (0x1 & this.field639) != 0;
    }

    @ObfuscatedName("v.k(B)Z")
    public boolean method595() {
        return (0x2 & this.field639) != 0;
    }

    @ObfuscatedName("v.r(I)Z")
    public boolean method599() {
        return (0x4 & this.field639) != 0;
    }

    @ObfuscatedName("v.b(I)Z")
    public boolean method628() {
        return (0x8 & this.field639) != 0;
    }

    @ObfuscatedName("v.q(I)Z")
    public boolean method598() {
        return (0x20000000 & this.field639) != 0;
    }

    @ObfuscatedName("v.u(I)Z")
    public boolean method594() {
        return (0x2000000 & this.field639) != 0;
    }
}
