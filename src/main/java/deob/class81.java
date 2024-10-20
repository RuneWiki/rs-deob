package deob;

import java.net.URL;

@ObfuscatedName("cq")
public class class81 {

    @ObfuscatedName("cq.h")
    public static int field1042 = 0;

    @ObfuscatedName("cq.z")
    public static int field1029 = 0;

    @ObfuscatedName("cq.e")
    public static int[] field1036 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cq.q")
    public static int[] field1031 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cq.s")
    public int field1033;

    @ObfuscatedName("cq.b")
    public int field1028;

    @ObfuscatedName("cq.a")
    public int field1034;

    @ObfuscatedName("cq.w")
    public String field1035;

    @ObfuscatedName("cq.k")
    public String field1032;

    @ObfuscatedName("cq.i")
    public int field1027;

    @ObfuscatedName("cq.x")
    public int field1024;

    @ObfuscatedName("o.n(I)Z")
    public static boolean method220() {
        try {
            if (Statics.field1982 == null) {
                Statics.field1982 = Statics.field537.method3194(new URL(Statics.field1255));
            } else if (Statics.field1982.method3212()) {
                byte[] var0 = Statics.field1982.method3208();
                class311 var1 = new class311(var0);
                var1.method5455();
                field1042 = var1.method5247();
                Statics.field1030 = new class81[field1042];
                int var2 = 0;
                while (var2 < field1042) {
                    class81 var3 = Statics.field1030[var2] = new class81();
                    var3.field1033 = var1.method5247();
                    var3.field1028 = var1.method5455();
                    var3.field1035 = var1.method5465();
                    var3.field1032 = var1.method5465();
                    var3.field1027 = var1.method5310();
                    var3.field1034 = var1.method5226();
                    var3.field1024 = var2++;
                }
                method3561(Statics.field1030, 0, Statics.field1030.length - 1, field1031, field1036);
                Statics.field1982 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1982 = null;
        }
        return false;
    }

    @ObfuscatedName("v.v(IIB)V")
    public static void method9(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1031[var5] != arg0) {
                var2[var4] = field1031[var5];
                var3[var4] = field1036[var5];
                var4++;
            }
        }
        field1031 = var2;
        field1036 = var3;
        method3561(Statics.field1030, 0, Statics.field1030.length - 1, field1031, field1036);
    }

    @ObfuscatedName("ge.d([Lcq;II[I[IB)V")
    public static void method3561(class81[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class81 var8 = arg0[var7];
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
                        var11 = arg0[var6].field1024;
                        var12 = var8.field1024;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1034;
                        var12 = var8.field1034;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1715() ? 1 : 0;
                        var12 = var8.method1715() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1033;
                        var12 = var8.field1033;
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
                        var15 = arg0[var5].field1024;
                        var16 = var8.field1024;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1034;
                        var16 = var8.field1034;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1715() ? 1 : 0;
                        var16 = var8.method1715() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1033;
                        var16 = var8.field1033;
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
                class81 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method3561(arg0, arg1, var6, arg3, arg4);
        method3561(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("hj.c(IZIZI)V")
    public static void method3821(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1030 != null) {
            Statics.method248(0, Statics.field1030.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("m.h(Lcq;Lcq;IZIZI)I")
    public static int method203(class81 arg0, class81 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method589(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method589(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("ah.z(Lcq;Lcq;IZI)I")
    public static int method589(class81 arg0, class81 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1034;
            int var5 = arg1.field1034;
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
            return arg0.field1027 - arg1.field1027;
        } else if (arg2 == 3) {
            if (arg0.field1032.equals("-")) {
                if (arg1.field1032.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1032.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1032.compareTo(arg1.field1032);
            }
        } else if (arg2 == 4) {
            return arg0.method1718() ? (arg1.method1718() ? 0 : 1) : (arg1.method1718() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1716() ? (arg1.method1716() ? 0 : 1) : (arg1.method1716() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1717() ? (arg1.method1717() ? 0 : 1) : (arg1.method1717() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1715() ? (arg1.method1715() ? 0 : 1) : (arg1.method1715() ? -1 : 0);
        } else {
            return arg0.field1033 - arg1.field1033;
        }
    }

    @ObfuscatedName("ea.e(I)Lcq;")
    public static class81 method3186() {
        field1029 = 0;
        return method1224();
    }

    @ObfuscatedName("bk.q(B)Lcq;")
    public static class81 method1224() {
        return field1029 < field1042 ? Statics.field1030[++field1029 - 1] : null;
    }

    @ObfuscatedName("cq.l(I)Z")
    public boolean method1715() {
        return (0x1 & this.field1028) != 0;
    }

    @ObfuscatedName("cq.s(I)Z")
    public boolean method1716() {
        return (0x2 & this.field1028) != 0;
    }

    @ObfuscatedName("cq.b(I)Z")
    public boolean method1717() {
        return (0x4 & this.field1028) != 0;
    }

    @ObfuscatedName("cq.a(I)Z")
    public boolean method1718() {
        return (0x8 & this.field1028) != 0;
    }

    @ObfuscatedName("cq.w(B)Z")
    public boolean method1719() {
        return (0x20000000 & this.field1028) != 0;
    }

    @ObfuscatedName("cq.k(I)Z")
    public boolean method1750() {
        return (0x2000000 & this.field1028) != 0;
    }

    @ObfuscatedName("cq.i(B)Z")
    public boolean method1721() {
        return (0x40000000 & this.field1028) != 0;
    }
}
