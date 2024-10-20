package deob;

import java.net.URL;

@ObfuscatedName("bs")
public class class77 {

    @ObfuscatedName("bs.h")
    public static int field1180 = 0;

    @ObfuscatedName("bs.l")
    public static int field1168 = 0;

    @ObfuscatedName("bs.y")
    public static int[] field1169 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bs.g")
    public static int[] field1167 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bs.u")
    public int field1163;

    @ObfuscatedName("bs.r")
    public int field1173;

    @ObfuscatedName("bs.d")
    public int field1174;

    @ObfuscatedName("bs.v")
    public String field1175;

    @ObfuscatedName("bs.s")
    public String field1176;

    @ObfuscatedName("bs.t")
    public int field1177;

    @ObfuscatedName("bs.f")
    public int field1178;

    @ObfuscatedName("bv.b(I)Z")
    public static boolean method1569() {
        try {
            if (Statics.field1171 == null) {
                Statics.field1171 = Statics.field548.method2846(new URL(Statics.field408));
            } else if (Statics.field1171.method2863()) {
                byte[] var0 = Statics.field1171.method2859();
                class194 var1 = new class194(var0);
                var1.method3261();
                field1180 = var1.method3249();
                Statics.field1179 = new class77[field1180];
                int var2 = 0;
                while (var2 < field1180) {
                    class77 var3 = Statics.field1179[var2] = new class77();
                    var3.field1163 = var1.method3249();
                    var3.field1173 = var1.method3261();
                    var3.field1175 = var1.method3256();
                    var3.field1176 = var1.method3256();
                    var3.field1177 = var1.method3247();
                    var3.field1174 = var1.method3230();
                    var3.field1178 = var2++;
                }
                method41(Statics.field1179, 0, Statics.field1179.length - 1, field1167, field1169);
                Statics.field1171 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1171 = null;
        }
        return false;
    }

    @ObfuscatedName("ad.q(III)V")
    public static void method502(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1167[var5] != arg0) {
                var2[var4] = field1167[var5];
                var3[var4] = field1169[var5];
                var4++;
            }
        }
        field1167 = var2;
        field1169 = var3;
        method41(Statics.field1179, 0, Statics.field1179.length - 1, field1167, field1169);
    }

    @ObfuscatedName("r.o([Lbs;II[I[II)V")
    public static void method41(class77[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class77 var8 = arg0[var7];
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
                        var11 = arg0[var6].field1178;
                        var12 = var8.field1178;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1174;
                        var12 = var8.field1174;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1522() ? 1 : 0;
                        var12 = var8.method1522() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1163;
                        var12 = var8.field1163;
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
                        var15 = arg0[var5].field1178;
                        var16 = var8.field1178;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1174;
                        var16 = var8.field1174;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1522() ? 1 : 0;
                        var16 = var8.method1522() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1163;
                        var16 = var8.field1163;
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
                class77 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method41(arg0, arg1, var6, arg3, arg4);
        method41(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("gi.p(IIIZIZI)V")
    public static void method3209(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class77 var8 = Statics.field1179[var6];
        Statics.field1179[var6] = Statics.field1179[arg1];
        Statics.field1179[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method4397(Statics.field1179[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class77 var10 = Statics.field1179[var9];
                Statics.field1179[var9] = Statics.field1179[var7];
                Statics.field1179[var7++] = var10;
            }
        }
        Statics.field1179[arg1] = Statics.field1179[var7];
        Statics.field1179[var7] = var8;
        method3209(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method3209(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("jk.a(Lbs;Lbs;IZIZI)I")
    public static int method4397(class77 arg0, class77 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method1783(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method1783(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("ct.h(Lbs;Lbs;IZB)I")
    public static int method1783(class77 arg0, class77 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1174;
            int var5 = arg1.field1174;
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
            return arg0.field1177 - arg1.field1177;
        } else if (arg2 == 3) {
            if (arg0.field1176.equals("-")) {
                if (arg1.field1176.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1176.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1176.compareTo(arg1.field1176);
            }
        } else if (arg2 == 4) {
            return arg0.method1542() ? (arg1.method1542() ? 0 : 1) : (arg1.method1542() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1554() ? (arg1.method1554() ? 0 : 1) : (arg1.method1554() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1524() ? (arg1.method1524() ? 0 : 1) : (arg1.method1524() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1522() ? (arg1.method1522() ? 0 : 1) : (arg1.method1522() ? -1 : 0);
        } else {
            return arg0.field1163 - arg1.field1163;
        }
    }

    @ObfuscatedName("bs.l(S)Z")
    public boolean method1522() {
        return (0x1 & this.field1173) != 0;
    }

    @ObfuscatedName("bs.y(B)Z")
    public boolean method1554() {
        return (0x2 & this.field1173) != 0;
    }

    @ObfuscatedName("bs.g(I)Z")
    public boolean method1524() {
        return (0x4 & this.field1173) != 0;
    }

    @ObfuscatedName("bs.c(I)Z")
    public boolean method1542() {
        return (0x8 & this.field1173) != 0;
    }

    @ObfuscatedName("bs.u(B)Z")
    public boolean method1533() {
        return (0x20000000 & this.field1173) != 0;
    }

    @ObfuscatedName("bs.t(B)Z")
    public boolean method1543() {
        return (0x2000000 & this.field1173) != 0;
    }
}
