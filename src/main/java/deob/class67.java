package deob;

import java.net.URL;

@ObfuscatedName("bu")
public class class67 {

    @ObfuscatedName("bu.a")
    public static int field994 = 0;

    @ObfuscatedName("bu.c")
    public static int field1013 = 0;

    @ObfuscatedName("bu.p")
    public static int[] field1000 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bu.r")
    public static int[] field1001 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bu.d")
    public int field1008;

    @ObfuscatedName("bu.z")
    public int field1003;

    @ObfuscatedName("bu.x")
    public int field1002;

    @ObfuscatedName("bu.v")
    public String field1005;

    @ObfuscatedName("bu.g")
    public String field1006;

    @ObfuscatedName("bu.j")
    public int field1007;

    @ObfuscatedName("bu.b")
    public int field1011;

    @ObfuscatedName("al.f(I)Z")
    public static boolean method607() {
        try {
            if (Statics.field1254 == null) {
                Statics.field1254 = Statics.field507.method2937(new URL(Statics.field3156));
            } else if (Statics.field1254.method2943()) {
                byte[] var0 = Statics.field1254.method2942();
                class185 var1 = new class185(var0);
                var1.method3432();
                field994 = var1.method3346();
                Statics.field997 = new class67[field994];
                int var2 = 0;
                while (var2 < field994) {
                    class67 var3 = Statics.field997[var2] = new class67();
                    var3.field1008 = var1.method3346();
                    var3.field1003 = var1.method3432();
                    var3.field1005 = var1.method3353();
                    var3.field1006 = var1.method3353();
                    var3.field1007 = var1.method3344();
                    var3.field1002 = var1.method3544();
                    var3.field1011 = var2++;
                }
                method4273(Statics.field997, 0, Statics.field997.length - 1, field1001, field1000);
                Statics.field1254 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1254 = null;
        }
        return false;
    }

    @ObfuscatedName("fy.l(III)V")
    public static void method3158(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1001[var5] != arg0) {
                var2[var4] = field1001[var5];
                var3[var4] = field1000[var5];
                var4++;
            }
        }
        field1001 = var2;
        field1000 = var3;
        method4273(Statics.field997, 0, Statics.field997.length - 1, field1001, field1000);
    }

    @ObfuscatedName("in.w([Lbu;II[I[II)V")
    public static void method4273(class67[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class67 var8 = arg0[var7];
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
                        var11 = arg0[var6].field1011;
                        var12 = var8.field1011;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1002;
                        var12 = var8.field1002;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1511() ? 1 : 0;
                        var12 = var8.method1511() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1008;
                        var12 = var8.field1008;
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
                        var15 = arg0[var5].field1011;
                        var16 = var8.field1011;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1002;
                        var16 = var8.field1002;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1511() ? 1 : 0;
                        var16 = var8.method1511() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1008;
                        var16 = var8.field1008;
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
                class67 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method4273(arg0, arg1, var6, arg3, arg4);
        method4273(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("cc.s(IZIZI)V")
    public static void method1924(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field997 != null) {
            method4249(0, Statics.field997.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("hw.e(IIIZIZI)V")
    public static void method4249(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class67 var8 = Statics.field997[var6];
        Statics.field997[var6] = Statics.field997[arg1];
        Statics.field997[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class67 var10 = Statics.field997[var9];
            int var11 = method3039(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method3039(var10, var8, arg4, arg5);
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
                class67 var14 = Statics.field997[var9];
                Statics.field997[var9] = Statics.field997[var7];
                Statics.field997[var7++] = var14;
            }
        }
        Statics.field997[arg1] = Statics.field997[var7];
        Statics.field997[var7] = var8;
        method4249(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method4249(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("eh.c(Lbu;Lbu;IZI)I")
    public static int method3039(class67 arg0, class67 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1002;
            int var5 = arg1.field1002;
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
            return arg0.field1007 - arg1.field1007;
        } else if (arg2 == 3) {
            if (arg0.field1006.equals("-")) {
                if (arg1.field1006.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1006.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1006.compareTo(arg1.field1006);
            }
        } else if (arg2 == 4) {
            return arg0.method1514() ? (arg1.method1514() ? 0 : 1) : (arg1.method1514() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1512() ? (arg1.method1512() ? 0 : 1) : (arg1.method1512() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1528() ? (arg1.method1528() ? 0 : 1) : (arg1.method1528() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1511() ? (arg1.method1511() ? 0 : 1) : (arg1.method1511() ? -1 : 0);
        } else {
            return arg0.field1008 - arg1.field1008;
        }
    }

    @ObfuscatedName("bl.p(B)Lbu;")
    public static class67 method975() {
        field1013 = 0;
        return method4936();
    }

    @ObfuscatedName("jw.r(B)Lbu;")
    public static class67 method4936() {
        return field1013 < field994 ? Statics.field997[++field1013 - 1] : null;
    }

    @ObfuscatedName("bu.m(I)Z")
    public boolean method1511() {
        return (0x1 & this.field1003) != 0;
    }

    @ObfuscatedName("bu.d(I)Z")
    public boolean method1512() {
        return (0x2 & this.field1003) != 0;
    }

    @ObfuscatedName("bu.z(I)Z")
    public boolean method1528() {
        return (0x4 & this.field1003) != 0;
    }

    @ObfuscatedName("bu.x(I)Z")
    public boolean method1514() {
        return (0x8 & this.field1003) != 0;
    }

    @ObfuscatedName("bu.v(S)Z")
    public boolean method1515() {
        return (0x20000000 & this.field1003) != 0;
    }

    @ObfuscatedName("bu.g(I)Z")
    public boolean method1516() {
        return (0x2000000 & this.field1003) != 0;
    }
}
