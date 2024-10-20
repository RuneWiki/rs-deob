package deob;

import java.net.URL;

@ObfuscatedName("bz")
public class class78 {

    @ObfuscatedName("bz.x")
    public static int field1223 = 0;

    @ObfuscatedName("bz.z")
    public static int field1224 = 0;

    @ObfuscatedName("bz.p")
    public static int[] field1225 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bz.w")
    public static int[] field1221 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bz.d")
    public int field1231;

    @ObfuscatedName("bz.a")
    public int field1219;

    @ObfuscatedName("bz.e")
    public int field1229;

    @ObfuscatedName("bz.f")
    public String field1228;

    @ObfuscatedName("bz.l")
    public String field1226;

    @ObfuscatedName("bz.m")
    public int field1232;

    @ObfuscatedName("bz.b")
    public int field1233;

    @ObfuscatedName("jp.c(I)Z")
    public static boolean method4354() {
        try {
            if (Statics.field325 == null) {
                Statics.field325 = Statics.field578.method2871(new URL(Statics.field628));
            } else if (Statics.field325.method2879()) {
                byte[] var0 = Statics.field325.method2880();
                class195 var1 = new class195(var0);
                var1.method3230();
                field1223 = var1.method3218();
                Statics.field2059 = new class78[field1223];
                int var2 = 0;
                while (var2 < field1223) {
                    class78 var3 = Statics.field2059[var2] = new class78();
                    var3.field1231 = var1.method3218();
                    var3.field1219 = var1.method3230();
                    var3.field1228 = var1.method3427();
                    var3.field1226 = var1.method3427();
                    var3.field1232 = var1.method3429();
                    var3.field1229 = var1.method3303();
                    var3.field1233 = var2++;
                }
                method515(Statics.field2059, 0, Statics.field2059.length - 1, field1221, field1225);
                Statics.field325 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field325 = null;
        }
        return false;
    }

    @ObfuscatedName("gx.i(IIB)V")
    public static void method3456(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1221[var5] != arg0) {
                var2[var4] = field1221[var5];
                var3[var4] = field1225[var5];
                var4++;
            }
        }
        field1221 = var2;
        field1225 = var3;
        method515(Statics.field2059, 0, Statics.field2059.length - 1, field1221, field1225);
    }

    @ObfuscatedName("aw.o([Lbz;II[I[IB)V")
    public static void method515(class78[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class78 var8 = arg0[var7];
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
                        var11 = arg0[var6].field1233;
                        var12 = var8.field1233;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1229;
                        var12 = var8.field1229;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1478() ? 1 : 0;
                        var12 = var8.method1478() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1231;
                        var12 = var8.field1231;
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
                        var15 = arg0[var5].field1233;
                        var16 = var8.field1233;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1229;
                        var16 = var8.field1229;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1478() ? 1 : 0;
                        var16 = var8.method1478() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1231;
                        var16 = var8.field1231;
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
                class78 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method515(arg0, arg1, var6, arg3, arg4);
        method515(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("s.j(IZIZI)V")
    public static void method191(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field2059 != null) {
            method509(0, Statics.field2059.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("aw.k(IIIZIZI)V")
    public static void method509(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class78 var8 = Statics.field2059[var6];
        Statics.field2059[var6] = Statics.field2059[arg1];
        Statics.field2059[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class78 var10 = Statics.field2059[var9];
            int var11 = method261(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method261(var10, var8, arg4, arg5);
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
                class78 var14 = Statics.field2059[var9];
                Statics.field2059[var9] = Statics.field2059[var7];
                Statics.field2059[var7++] = var14;
            }
        }
        Statics.field2059[arg1] = Statics.field2059[var7];
        Statics.field2059[var7] = var8;
        method509(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method509(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ab.x(Lbz;Lbz;IZI)I")
    public static int method261(class78 arg0, class78 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1229;
            int var5 = arg1.field1229;
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
            return arg0.field1232 - arg1.field1232;
        } else if (arg2 == 3) {
            if (arg0.field1226.equals("-")) {
                if (arg1.field1226.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1226.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1226.compareTo(arg1.field1226);
            }
        } else if (arg2 == 4) {
            return arg0.method1488() ? (arg1.method1488() ? 0 : 1) : (arg1.method1488() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1473() ? (arg1.method1473() ? 0 : 1) : (arg1.method1473() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1474() ? (arg1.method1474() ? 0 : 1) : (arg1.method1474() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1478() ? (arg1.method1478() ? 0 : 1) : (arg1.method1478() ? -1 : 0);
        } else {
            return arg0.field1231 - arg1.field1231;
        }
    }

    @ObfuscatedName("bz.z(I)Z")
    public boolean method1478() {
        return (0x1 & this.field1219) != 0;
    }

    @ObfuscatedName("bz.p(B)Z")
    public boolean method1473() {
        return (0x2 & this.field1219) != 0;
    }

    @ObfuscatedName("bz.w(I)Z")
    public boolean method1474() {
        return (0x4 & this.field1219) != 0;
    }

    @ObfuscatedName("bz.r(B)Z")
    public boolean method1488() {
        return (0x8 & this.field1219) != 0;
    }

    @ObfuscatedName("bz.d(I)Z")
    public boolean method1476() {
        return (0x20000000 & this.field1219) != 0;
    }

    @ObfuscatedName("bz.a(I)Z")
    public boolean method1477() {
        return (0x2000000 & this.field1219) != 0;
    }
}
