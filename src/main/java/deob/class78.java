package deob;

import java.net.URL;

@ObfuscatedName("bg")
public class class78 {

    @ObfuscatedName("bg.m")
    public static int field1228 = 0;

    @ObfuscatedName("bg.z")
    public static int field1229 = 0;

    @ObfuscatedName("bg.i")
    public static int[] field1230 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bg.u")
    public static int[] field1231 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bg.y")
    public int field1236;

    @ObfuscatedName("bg.a")
    public int field1234;

    @ObfuscatedName("bg.w")
    public int field1233;

    @ObfuscatedName("bg.n")
    public String field1235;

    @ObfuscatedName("bg.l")
    public String field1239;

    @ObfuscatedName("bg.s")
    public int field1224;

    @ObfuscatedName("bg.v")
    public int field1238;

    @ObfuscatedName("il.o(I)Z")
    public static boolean method4132() {
        try {
            if (Statics.field2069 == null) {
                Statics.field2069 = Statics.field593.method2841(new URL(Statics.field877));
            } else if (Statics.field2069.method2844()) {
                byte[] var0 = Statics.field2069.method2845();
                class195 var1 = new class195(var0);
                var1.method3254();
                field1228 = var1.method3207();
                Statics.field1227 = new class78[field1228];
                int var2 = 0;
                while (var2 < field1228) {
                    class78 var3 = Statics.field1227[var2] = new class78();
                    var3.field1236 = var1.method3207();
                    var3.field1234 = var1.method3254();
                    var3.field1235 = var1.method3284();
                    var3.field1239 = var1.method3284();
                    var3.field1224 = var1.method3205();
                    var3.field1233 = var1.method3346();
                    var3.field1238 = var2++;
                }
                method270(Statics.field1227, 0, Statics.field1227.length - 1, field1231, field1230);
                Statics.field2069 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2069 = null;
        }
        return false;
    }

    @ObfuscatedName("ct.k(III)V")
    public static void method1855(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1231[var5] != arg0) {
                var2[var4] = field1231[var5];
                var3[var4] = field1230[var5];
                var4++;
            }
        }
        field1231 = var2;
        field1230 = var3;
        method270(Statics.field1227, 0, Statics.field1227.length - 1, field1231, field1230);
    }

    @ObfuscatedName("ac.t([Lbg;II[I[II)V")
    public static void method270(class78[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1238;
                        var12 = var8.field1238;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1233;
                        var12 = var8.field1233;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1538() ? 1 : 0;
                        var12 = var8.method1538() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1236;
                        var12 = var8.field1236;
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
                        var15 = arg0[var5].field1238;
                        var16 = var8.field1238;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1233;
                        var16 = var8.field1233;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1538() ? 1 : 0;
                        var16 = var8.method1538() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1236;
                        var16 = var8.field1236;
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
        method270(arg0, arg1, var6, arg3, arg4);
        method270(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("p.d(IZIZI)V")
    public static void method176(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1227 != null) {
            method1703(0, Statics.field1227.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cl.h(IIIZIZI)V")
    public static void method1703(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class78 var8 = Statics.field1227[var6];
        Statics.field1227[var6] = Statics.field1227[arg1];
        Statics.field1227[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method1363(Statics.field1227[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class78 var10 = Statics.field1227[var9];
                Statics.field1227[var9] = Statics.field1227[var7];
                Statics.field1227[var7++] = var10;
            }
        }
        Statics.field1227[arg1] = Statics.field1227[var7];
        Statics.field1227[var7] = var8;
        method1703(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method1703(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("client.m(Lbg;Lbg;IZIZI)I")
    public static int method1363(class78 arg0, class78 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method997(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method997(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("bo.z(Lbg;Lbg;IZI)I")
    public static int method997(class78 arg0, class78 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1233;
            int var5 = arg1.field1233;
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
            return arg0.field1224 - arg1.field1224;
        } else if (arg2 == 3) {
            if (arg0.field1239.equals("-")) {
                if (arg1.field1239.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1239.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1239.compareTo(arg1.field1239);
            }
        } else if (arg2 == 4) {
            return arg0.method1541() ? (arg1.method1541() ? 0 : 1) : (arg1.method1541() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1539() ? (arg1.method1539() ? 0 : 1) : (arg1.method1539() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1540() ? (arg1.method1540() ? 0 : 1) : (arg1.method1540() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1538() ? (arg1.method1538() ? 0 : 1) : (arg1.method1538() ? -1 : 0);
        } else {
            return arg0.field1236 - arg1.field1236;
        }
    }

    @ObfuscatedName("bg.i(I)Z")
    public boolean method1538() {
        return (0x1 & this.field1234) != 0;
    }

    @ObfuscatedName("bg.u(B)Z")
    public boolean method1539() {
        return (0x2 & this.field1234) != 0;
    }

    @ObfuscatedName("bg.x(I)Z")
    public boolean method1540() {
        return (0x4 & this.field1234) != 0;
    }

    @ObfuscatedName("bg.y(I)Z")
    public boolean method1541() {
        return (0x8 & this.field1234) != 0;
    }

    @ObfuscatedName("bg.a(B)Z")
    public boolean method1542() {
        return (0x20000000 & this.field1234) != 0;
    }

    @ObfuscatedName("bg.v(B)Z")
    public boolean method1543() {
        return (0x2000000 & this.field1234) != 0;
    }
}
