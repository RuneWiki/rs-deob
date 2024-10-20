package deob;

import java.net.URL;

@ObfuscatedName("y")
public class class24 {

    @ObfuscatedName("y.h")
    public static int field621 = 0;

    @ObfuscatedName("y.i")
    public static int field610 = 0;

    @ObfuscatedName("y.r")
    public static int[] field615 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("y.l")
    public static int[] field612 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("y.e")
    public int field613;

    @ObfuscatedName("y.z")
    public int field614;

    @ObfuscatedName("y.v")
    public int field611;

    @ObfuscatedName("y.x")
    public String field609;

    @ObfuscatedName("y.q")
    public String field617;

    @ObfuscatedName("y.b")
    public int field620;

    @ObfuscatedName("y.u")
    public int field619;

    @ObfuscatedName("dk.n(B)Z")
    public static boolean method2602() {
        try {
            if (Statics.field190 == null) {
                Statics.field190 = new class18(Statics.field202, new URL(Statics.field1495));
            } else {
                byte[] var0 = Statics.field190.method160();
                if (var0 != null) {
                    class111 var1 = new class111(var0);
                    field621 = var1.method2236();
                    Statics.field736 = new class24[field621];
                    int var2 = 0;
                    while (var2 < field621) {
                        class24 var3 = Statics.field736[var2] = new class24();
                        var3.field613 = var1.method2236();
                        var3.field614 = var1.method2239();
                        var3.field609 = var1.method2242();
                        var3.field617 = var1.method2242();
                        var3.field620 = var1.method2234();
                        var3.field611 = var1.method2237();
                        var3.field619 = var2++;
                    }
                    Statics.method2570(Statics.field736, 0, Statics.field736.length - 1, field612, field615);
                    Statics.field190 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field190 = null;
        }
        return false;
    }

    @ObfuscatedName("cy.o(III)V")
    public static void method1697(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field612[var5] != arg0) {
                var2[var4] = field612[var5];
                var3[var4] = field615[var5];
                var4++;
            }
        }
        field612 = var2;
        field615 = var3;
        Statics.method2570(Statics.field736, 0, Statics.field736.length - 1, field612, field615);
    }

    @ObfuscatedName("z.w(IZIZI)V")
    public static void method132(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field736 != null) {
            method2903(0, Statics.field736.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ex.m(IIIZIZB)V")
    public static void method2903(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class24 var8 = Statics.field736[var6];
        Statics.field736[var6] = Statics.field736[arg1];
        Statics.field736[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class24 var10 = Statics.field736[var9];
            int var11 = method1103(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method1103(var10, var8, arg4, arg5);
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
                class24 var14 = Statics.field736[var9];
                Statics.field736[var9] = Statics.field736[var7];
                Statics.field736[var7++] = var14;
            }
        }
        Statics.field736[arg1] = Statics.field736[var7];
        Statics.field736[var7] = var8;
        method2903(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2903(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("am.h(Ly;Ly;IZI)I")
    public static int method1103(class24 arg0, class24 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field611;
            int var5 = arg1.field611;
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
            return arg0.field620 - arg1.field620;
        } else if (arg2 == 3) {
            if (arg0.field617.equals("-")) {
                if (arg1.field617.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field617.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field617.compareTo(arg1.field617);
            }
        } else if (arg2 == 4) {
            return arg0.method542() ? (arg1.method542() ? 0 : 1) : (arg1.method542() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method528() ? (arg1.method528() ? 0 : 1) : (arg1.method528() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method529() ? (arg1.method529() ? 0 : 1) : (arg1.method529() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method527() ? (arg1.method527() ? 0 : 1) : (arg1.method527() ? -1 : 0);
        } else {
            return arg0.field613 - arg1.field613;
        }
    }

    @ObfuscatedName("y.i(B)Z")
    public boolean method527() {
        return (0x1 & this.field614) != 0;
    }

    @ObfuscatedName("y.r(I)Z")
    public boolean method528() {
        return (0x2 & this.field614) != 0;
    }

    @ObfuscatedName("y.l(I)Z")
    public boolean method529() {
        return (0x4 & this.field614) != 0;
    }

    @ObfuscatedName("y.f(I)Z")
    public boolean method542() {
        return (0x8 & this.field614) != 0;
    }
}
