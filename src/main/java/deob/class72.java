package deob;

import java.net.URL;

@ObfuscatedName("bw")
public class class72 {

    @ObfuscatedName("bw.l")
    public static int field1023 = 0;

    @ObfuscatedName("bw.b")
    public static int field1025 = 0;

    @ObfuscatedName("bw.i")
    public static int[] field1019 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bw.c")
    public static int[] field1027 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bw.m")
    public int field1026;

    @ObfuscatedName("bw.u")
    public int field1024;

    @ObfuscatedName("bw.x")
    public int field1031;

    @ObfuscatedName("bw.r")
    public String field1030;

    @ObfuscatedName("bw.v")
    public String field1029;

    @ObfuscatedName("bw.y")
    public int field1033;

    @ObfuscatedName("bw.g")
    public int field1035;

    @ObfuscatedName("fk.q(I)Z")
    public static boolean method3139() {
        try {
            if (Statics.field1028 == null) {
                Statics.field1028 = Statics.field3535.method3015(new URL(Statics.field214));
            } else if (Statics.field1028.method3026()) {
                byte[] var0 = Statics.field1028.method3027();
                class301 var1 = new class301(var0);
                var1.method5072();
                field1023 = var1.method5069();
                Statics.field1032 = new class72[field1023];
                int var2 = 0;
                while (var2 < field1023) {
                    class72 var3 = Statics.field1032[var2] = new class72();
                    var3.field1026 = var1.method5069();
                    var3.field1024 = var1.method5072();
                    var3.field1030 = var1.method5076();
                    var3.field1029 = var1.method5076();
                    var3.field1033 = var1.method5077();
                    var3.field1031 = var1.method5179();
                    var3.field1035 = var2++;
                }
                method1490(Statics.field1032, 0, Statics.field1032.length - 1, field1027, field1019);
                Statics.field1028 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1028 = null;
        }
        return false;
    }

    @ObfuscatedName("gd.w(III)V")
    public static void method3351(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1027[var5] != arg0) {
                var2[var4] = field1027[var5];
                var3[var4] = field1019[var5];
                var4++;
            }
        }
        field1027 = var2;
        field1019 = var3;
        method1490(Statics.field1032, 0, Statics.field1032.length - 1, field1027, field1019);
    }

    @ObfuscatedName("client.e([Lbw;II[I[IB)V")
    public static void method1490(class72[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class72 var8 = arg0[var7];
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
                        var11 = arg0[var6].field1035;
                        var12 = var8.field1035;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1031;
                        var12 = var8.field1031;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1515() ? 1 : 0;
                        var12 = var8.method1515() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1026;
                        var12 = var8.field1026;
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
                        var15 = arg0[var5].field1035;
                        var16 = var8.field1035;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1031;
                        var16 = var8.field1031;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1515() ? 1 : 0;
                        var16 = var8.method1515() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1026;
                        var16 = var8.field1026;
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
                class72 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method1490(arg0, arg1, var6, arg3, arg4);
        method1490(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("a.p(IZIZI)V")
    public static void method173(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1032 != null) {
            method98(0, Statics.field1032.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("f.k(IIIZIZB)V")
    public static void method98(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class72 var8 = Statics.field1032[var6];
        Statics.field1032[var6] = Statics.field1032[arg1];
        Statics.field1032[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class72 var10 = Statics.field1032[var9];
            int var11 = method2004(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method2004(var10, var8, arg4, arg5);
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
                class72 var14 = Statics.field1032[var9];
                Statics.field1032[var9] = Statics.field1032[var7];
                Statics.field1032[var7++] = var14;
            }
        }
        Statics.field1032[arg1] = Statics.field1032[var7];
        Statics.field1032[var7] = var8;
        method98(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method98(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("cu.l(Lbw;Lbw;IZB)I")
    public static int method2004(class72 arg0, class72 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1031;
            int var5 = arg1.field1031;
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
            return arg0.field1033 - arg1.field1033;
        } else if (arg2 == 3) {
            if (arg0.field1029.equals("-")) {
                if (arg1.field1029.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1029.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1029.compareTo(arg1.field1029);
            }
        } else if (arg2 == 4) {
            return arg0.method1533() ? (arg1.method1533() ? 0 : 1) : (arg1.method1533() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1517() ? (arg1.method1517() ? 0 : 1) : (arg1.method1517() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1553() ? (arg1.method1553() ? 0 : 1) : (arg1.method1553() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1515() ? (arg1.method1515() ? 0 : 1) : (arg1.method1515() ? -1 : 0);
        } else {
            return arg0.field1026 - arg1.field1026;
        }
    }

    @ObfuscatedName("cu.b(I)Lbw;")
    public static class72 method2003() {
        field1025 = 0;
        return method674();
    }

    @ObfuscatedName("am.i(I)Lbw;")
    public static class72 method674() {
        return field1025 < field1023 ? Statics.field1032[++field1025 - 1] : null;
    }

    @ObfuscatedName("bw.c(B)Z")
    public boolean method1515() {
        return (0x1 & this.field1024) != 0;
    }

    @ObfuscatedName("bw.u(I)Z")
    public boolean method1517() {
        return (0x2 & this.field1024) != 0;
    }

    @ObfuscatedName("bw.x(I)Z")
    public boolean method1553() {
        return (0x4 & this.field1024) != 0;
    }

    @ObfuscatedName("bw.r(I)Z")
    public boolean method1533() {
        return (0x8 & this.field1024) != 0;
    }

    @ObfuscatedName("bw.v(I)Z")
    public boolean method1519() {
        return (0x20000000 & this.field1024) != 0;
    }

    @ObfuscatedName("bw.y(I)Z")
    public boolean method1523() {
        return (0x2000000 & this.field1024) != 0;
    }
}
