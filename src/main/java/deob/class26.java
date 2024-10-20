package deob;

import java.net.URL;

@ObfuscatedName("o")
public class class26 {

    @ObfuscatedName("o.e")
    public static int field635 = 0;

    @ObfuscatedName("o.g")
    public static int field641 = 0;

    @ObfuscatedName("o.m")
    public static int[] field637 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("o.j")
    public static int[] field638 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("o.l")
    public int field639;

    @ObfuscatedName("o.h")
    public int field640;

    @ObfuscatedName("o.i")
    public int field636;

    @ObfuscatedName("o.v")
    public String field631;

    @ObfuscatedName("o.z")
    public String field644;

    @ObfuscatedName("o.u")
    public int field645;

    @ObfuscatedName("o.t")
    public int field642;

    @ObfuscatedName("e.a(I)Z")
    public static boolean method100() {
        try {
            if (Statics.field1880 == null) {
                Statics.field1880 = new class19(Statics.field2057, new URL(Statics.field3115));
            } else {
                byte[] var0 = Statics.field1880.method199();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    field635 = var1.method2347();
                    Statics.field634 = new class26[field635];
                    int var2 = 0;
                    while (var2 < field635) {
                        class26 var3 = Statics.field634[var2] = new class26();
                        var3.field639 = var1.method2347();
                        var3.field640 = var1.method2350();
                        var3.field631 = var1.method2353();
                        var3.field644 = var1.method2353();
                        var3.field645 = var1.method2412();
                        var3.field636 = var1.method2348();
                        var3.field642 = var2++;
                    }
                    Statics.method54(Statics.field634, 0, Statics.field634.length - 1, field638, field637);
                    Statics.field1880 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1880 = null;
        }
        return false;
    }

    @ObfuscatedName("u.r(III)V")
    public static void method183(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field638[var5] != arg0) {
                var2[var4] = field638[var5];
                var3[var4] = field637[var5];
                var4++;
            }
        }
        field638 = var2;
        field637 = var3;
        Statics.method54(Statics.field634, 0, Statics.field634.length - 1, field638, field637);
    }

    @ObfuscatedName("z.s(IIIZIZI)V")
    public static void method181(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field634[var6];
        Statics.field634[var6] = Statics.field634[arg1];
        Statics.field634[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class26 var10 = Statics.field634[var9];
            int var11 = method167(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method167(var10, var8, arg4, arg5);
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
                class26 var14 = Statics.field634[var9];
                Statics.field634[var9] = Statics.field634[var7];
                Statics.field634[var7++] = var14;
            }
        }
        Statics.field634[arg1] = Statics.field634[var7];
        Statics.field634[var7] = var8;
        method181(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method181(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("h.y(Lo;Lo;IZB)I")
    public static int method167(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field636;
            int var5 = arg1.field636;
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
            return arg0.field645 - arg1.field645;
        } else if (arg2 == 3) {
            if (arg0.field644.equals("-")) {
                if (arg1.field644.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field644.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field644.compareTo(arg1.field644);
            }
        } else if (arg2 == 4) {
            return arg0.method602() ? (arg1.method602() ? 0 : 1) : (arg1.method602() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method608() ? (arg1.method608() ? 0 : 1) : (arg1.method608() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method594() ? (arg1.method594() ? 0 : 1) : (arg1.method594() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method592() ? (arg1.method592() ? 0 : 1) : (arg1.method592() ? -1 : 0);
        } else {
            return arg0.field639 - arg1.field639;
        }
    }

    @ObfuscatedName("au.e(I)Lo;")
    public static class26 method1006() {
        return field641 < field635 ? Statics.field634[++field641 - 1] : null;
    }

    @ObfuscatedName("o.g(I)Z")
    public boolean method592() {
        return (0x1 & this.field640) != 0;
    }

    @ObfuscatedName("o.m(I)Z")
    public boolean method608() {
        return (0x2 & this.field640) != 0;
    }

    @ObfuscatedName("o.j(I)Z")
    public boolean method594() {
        return (0x4 & this.field640) != 0;
    }

    @ObfuscatedName("o.n(B)Z")
    public boolean method602() {
        return (0x8 & this.field640) != 0;
    }

    @ObfuscatedName("o.l(I)Z")
    public boolean method597() {
        return (0x20000000 & this.field640) != 0;
    }

    @ObfuscatedName("o.h(I)Z")
    public boolean method591() {
        return (0x2000000 & this.field640) != 0;
    }
}
