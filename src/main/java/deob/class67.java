package deob;

import java.net.URL;

@ObfuscatedName("bl")
public class class67 {

    @ObfuscatedName("bl.i")
    public static int field1003 = 0;

    @ObfuscatedName("bl.h")
    public static int field1014 = 0;

    @ObfuscatedName("bl.l")
    public static int[] field1006 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bl.d")
    public static int[] field1013 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bl.s")
    public int field1008;

    @ObfuscatedName("bl.k")
    public int field1009;

    @ObfuscatedName("bl.v")
    public int field1010;

    @ObfuscatedName("bl.p")
    public String field998;

    @ObfuscatedName("bl.n")
    public String field1012;

    @ObfuscatedName("bl.t")
    public int field999;

    @ObfuscatedName("bl.r")
    public int field1004;

    @ObfuscatedName("fu.c(B)Z")
    public static boolean method3041() {
        try {
            if (Statics.field1007 == null) {
                Statics.field1007 = Statics.field348.method2842(new URL(Statics.field589));
            } else if (Statics.field1007.method2847()) {
                byte[] var0 = Statics.field1007.method2848();
                class185 var1 = new class185(var0);
                var1.method3323();
                field1003 = var1.method3245();
                Statics.field1002 = new class67[field1003];
                int var2 = 0;
                while (var2 < field1003) {
                    class67 var3 = Statics.field1002[var2] = new class67();
                    var3.field1008 = var1.method3245();
                    var3.field1009 = var1.method3323();
                    var3.field998 = var1.method3251();
                    var3.field1012 = var1.method3251();
                    var3.field999 = var1.method3243();
                    var3.field1010 = var1.method3369();
                    var3.field1004 = var2++;
                }
                Statics.method2827(Statics.field1002, 0, Statics.field1002.length - 1, field1013, field1006);
                Statics.field1007 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1007 = null;
        }
        return false;
    }

    @ObfuscatedName("jp.q(IIB)V")
    public static void method4586(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1013[var5] != arg0) {
                var2[var4] = field1013[var5];
                var3[var4] = field1006[var5];
                var4++;
            }
        }
        field1013 = var2;
        field1006 = var3;
        Statics.method2827(Statics.field1002, 0, Statics.field1002.length - 1, field1013, field1006);
    }

    @ObfuscatedName("ba.g(IIIZIZB)V")
    public static void method977(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class67 var8 = Statics.field1002[var6];
        Statics.field1002[var6] = Statics.field1002[arg1];
        Statics.field1002[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class67 var10 = Statics.field1002[var9];
            int var11 = method675(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method675(var10, var8, arg4, arg5);
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
                class67 var14 = Statics.field1002[var9];
                Statics.field1002[var9] = Statics.field1002[var7];
                Statics.field1002[var7++] = var14;
            }
        }
        Statics.field1002[arg1] = Statics.field1002[var7];
        Statics.field1002[var7] = var8;
        method977(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method977(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("al.i(Lbl;Lbl;IZI)I")
    public static int method675(class67 arg0, class67 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1010;
            int var5 = arg1.field1010;
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
            return arg0.field999 - arg1.field999;
        } else if (arg2 == 3) {
            if (arg0.field1012.equals("-")) {
                if (arg1.field1012.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1012.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1012.compareTo(arg1.field1012);
            }
        } else if (arg2 == 4) {
            return arg0.method1480() ? (arg1.method1480() ? 0 : 1) : (arg1.method1480() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1478() ? (arg1.method1478() ? 0 : 1) : (arg1.method1478() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1479() ? (arg1.method1479() ? 0 : 1) : (arg1.method1479() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1487() ? (arg1.method1487() ? 0 : 1) : (arg1.method1487() ? -1 : 0);
        } else {
            return arg0.field1008 - arg1.field1008;
        }
    }

    @ObfuscatedName("aq.h(I)Lbl;")
    public static class67 method625() {
        return field1014 < field1003 ? Statics.field1002[++field1014 - 1] : null;
    }

    @ObfuscatedName("bl.l(B)Z")
    public boolean method1487() {
        return (0x1 & this.field1009) != 0;
    }

    @ObfuscatedName("bl.o(I)Z")
    public boolean method1478() {
        return (0x2 & this.field1009) != 0;
    }

    @ObfuscatedName("bl.k(B)Z")
    public boolean method1479() {
        return (0x4 & this.field1009) != 0;
    }

    @ObfuscatedName("bl.v(B)Z")
    public boolean method1480() {
        return (0x8 & this.field1009) != 0;
    }

    @ObfuscatedName("bl.p(B)Z")
    public boolean method1482() {
        return (0x20000000 & this.field1009) != 0;
    }

    @ObfuscatedName("bl.n(I)Z")
    public boolean method1504() {
        return (0x2000000 & this.field1009) != 0;
    }
}
