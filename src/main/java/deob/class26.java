package deob;

import java.net.URL;

@ObfuscatedName("e")
public class class26 {

    @ObfuscatedName("e.r")
    public static int field630 = 0;

    @ObfuscatedName("e.f")
    public static int field635 = 0;

    @ObfuscatedName("e.s")
    public static int[] field636 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("e.d")
    public static int[] field644 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("e.y")
    public int field638;

    @ObfuscatedName("e.p")
    public int field646;

    @ObfuscatedName("e.k")
    public int field640;

    @ObfuscatedName("e.o")
    public String field641;

    @ObfuscatedName("e.b")
    public String field634;

    @ObfuscatedName("e.j")
    public int field643;

    @ObfuscatedName("e.a")
    public int field639;

    @ObfuscatedName("a.t(I)Z")
    public static boolean method154() {
        try {
            if (Statics.field970 == null) {
                Statics.field970 = new class19(Statics.field1401, new URL(Statics.field2767));
            } else {
                byte[] var0 = Statics.field970.method163();
                if (var0 != null) {
                    class120 var1 = new class120(var0);
                    field630 = var1.method2310();
                    Statics.field637 = new class26[field630];
                    int var2 = 0;
                    while (var2 < field630) {
                        class26 var3 = Statics.field637[var2] = new class26();
                        var3.field638 = var1.method2310();
                        var3.field646 = var1.method2345();
                        var3.field641 = var1.method2316();
                        var3.field634 = var1.method2316();
                        var3.field643 = var1.method2334();
                        var3.field640 = var1.method2478();
                        var3.field639 = var2++;
                    }
                    Statics.method99(Statics.field637, 0, Statics.field637.length - 1, field644, field636);
                    Statics.field970 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field970 = null;
        }
        return false;
    }

    @ObfuscatedName("di.i(III)V")
    public static void method2227(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field644[var5] != arg0) {
                var2[var4] = field644[var5];
                var3[var4] = field636[var5];
                var4++;
            }
        }
        field644 = var2;
        field636 = var3;
        Statics.method99(Statics.field637, 0, Statics.field637.length - 1, field644, field636);
    }

    @ObfuscatedName("fi.h(IZIZB)V")
    public static void method2967(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field637 != null) {
            method815(0, Statics.field637.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("aj.z(IIIZIZI)V")
    public static void method815(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field637[var6];
        Statics.field637[var6] = Statics.field637[arg1];
        Statics.field637[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method1529(Statics.field637[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class26 var10 = Statics.field637[var9];
                Statics.field637[var9] = Statics.field637[var7];
                Statics.field637[var7++] = var10;
            }
        }
        Statics.field637[arg1] = Statics.field637[var7];
        Statics.field637[var7] = var8;
        method815(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method815(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("bp.r(Le;Le;IZIZI)I")
    public static int method1529(class26 arg0, class26 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method159(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method159(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("u.f(Le;Le;IZI)I")
    public static int method159(class26 arg0, class26 arg1, int arg2, boolean arg3) {
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
            return arg0.field643 - arg1.field643;
        } else if (arg2 == 3) {
            if (arg0.field634.equals("-")) {
                if (arg1.field634.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field634.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field634.compareTo(arg1.field634);
            }
        } else if (arg2 == 4) {
            return arg0.method573() ? (arg1.method573() ? 0 : 1) : (arg1.method573() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method571() ? (arg1.method571() ? 0 : 1) : (arg1.method571() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method572() ? (arg1.method572() ? 0 : 1) : (arg1.method572() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method570() ? (arg1.method570() ? 0 : 1) : (arg1.method570() ? -1 : 0);
        } else {
            return arg0.field638 - arg1.field638;
        }
    }

    @ObfuscatedName("e.s(I)Z")
    public boolean method570() {
        return (0x1 & this.field646) != 0;
    }

    @ObfuscatedName("e.d(B)Z")
    public boolean method571() {
        return (0x2 & this.field646) != 0;
    }

    @ObfuscatedName("e.l(B)Z")
    public boolean method572() {
        return (0x4 & this.field646) != 0;
    }

    @ObfuscatedName("e.y(I)Z")
    public boolean method573() {
        return (0x8 & this.field646) != 0;
    }

    @ObfuscatedName("e.p(I)Z")
    public boolean method574() {
        return (0x20000000 & this.field646) != 0;
    }

    @ObfuscatedName("e.k(I)Z")
    public boolean method592() {
        return (0x2000000 & this.field646) != 0;
    }
}
