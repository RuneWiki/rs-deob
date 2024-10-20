package deob;

import java.net.URL;

@ObfuscatedName("cp")
public class class80 {

    @ObfuscatedName("cp.z")
    public static int field1192 = 0;

    @ObfuscatedName("cp.t")
    public static int field1197 = 0;

    @ObfuscatedName("cp.f")
    public static int[] field1198 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cp.g")
    public static int[] field1204 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cp.x")
    public int field1206;

    @ObfuscatedName("cp.c")
    public int field1201;

    @ObfuscatedName("cp.s")
    public int field1202;

    @ObfuscatedName("cp.n")
    public String field1203;

    @ObfuscatedName("cp.y")
    public String field1199;

    @ObfuscatedName("cp.o")
    public int field1205;

    @ObfuscatedName("cp.r")
    public int field1195;

    @ObfuscatedName("bl.a(B)Z")
    public static boolean method964() {
        try {
            if (Statics.field2560 == null) {
                Statics.field2560 = Statics.field2507.method2676(new URL(Statics.field1108));
            } else if (Statics.field2560.method2684()) {
                byte[] var0 = Statics.field2560.method2685();
                class185 var1 = new class185(var0);
                var1.method2967();
                field1192 = var1.method3194();
                Statics.field727 = new class80[field1192];
                int var2 = 0;
                while (var2 < field1192) {
                    class80 var3 = Statics.field727[var2] = new class80();
                    var3.field1206 = var1.method3194();
                    var3.field1201 = var1.method2967();
                    var3.field1203 = var1.method3168();
                    var3.field1199 = var1.method3168();
                    var3.field1205 = var1.method2962();
                    var3.field1202 = var1.method2965();
                    var3.field1195 = var2++;
                }
                method4497(Statics.field727, 0, Statics.field727.length - 1, field1204, field1198);
                Statics.field2560 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2560 = null;
        }
        return false;
    }

    @ObfuscatedName("al.w(III)V")
    public static void method476(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1204[var5] != arg0) {
                var2[var4] = field1204[var5];
                var3[var4] = field1198[var5];
                var4++;
            }
        }
        field1204 = var2;
        field1198 = var3;
        method4497(Statics.field727, 0, Statics.field727.length - 1, field1204, field1198);
    }

    @ObfuscatedName("jl.e([Lcp;II[I[IB)V")
    public static void method4497(class80[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class80 var8 = arg0[var7];
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
                        var11 = arg0[var6].field1195;
                        var12 = var8.field1195;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1202;
                        var12 = var8.field1202;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1391() ? 1 : 0;
                        var12 = var8.method1391() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1206;
                        var12 = var8.field1206;
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
                        var15 = arg0[var5].field1195;
                        var16 = var8.field1195;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1202;
                        var16 = var8.field1202;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1391() ? 1 : 0;
                        var16 = var8.method1391() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1206;
                        var16 = var8.field1206;
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
                class80 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method4497(arg0, arg1, var6, arg3, arg4);
        method4497(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("bo.u(Lcp;Lcp;IZIZI)I")
    public static int method1338(class80 arg0, class80 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method232(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method232(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("aq.z(Lcp;Lcp;IZS)I")
    public static int method232(class80 arg0, class80 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1202;
            int var5 = arg1.field1202;
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
            return arg0.field1205 - arg1.field1205;
        } else if (arg2 == 3) {
            if (arg0.field1199.equals("-")) {
                if (arg1.field1199.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1199.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1199.compareTo(arg1.field1199);
            }
        } else if (arg2 == 4) {
            return arg0.method1369() ? (arg1.method1369() ? 0 : 1) : (arg1.method1369() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1367() ? (arg1.method1367() ? 0 : 1) : (arg1.method1367() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1368() ? (arg1.method1368() ? 0 : 1) : (arg1.method1368() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1391() ? (arg1.method1391() ? 0 : 1) : (arg1.method1391() ? -1 : 0);
        } else {
            return arg0.field1206 - arg1.field1206;
        }
    }

    @ObfuscatedName("cp.t(I)Z")
    public boolean method1391() {
        return (0x1 & this.field1201) != 0;
    }

    @ObfuscatedName("cp.f(I)Z")
    public boolean method1367() {
        return (0x2 & this.field1201) != 0;
    }

    @ObfuscatedName("cp.g(B)Z")
    public boolean method1368() {
        return (0x4 & this.field1201) != 0;
    }

    @ObfuscatedName("cp.x(I)Z")
    public boolean method1369() {
        return (0x8 & this.field1201) != 0;
    }

    @ObfuscatedName("cp.c(I)Z")
    public boolean method1370() {
        return (0x20000000 & this.field1201) != 0;
    }

    @ObfuscatedName("cp.n(I)Z")
    public boolean method1371() {
        return (0x2000000 & this.field1201) != 0;
    }
}
