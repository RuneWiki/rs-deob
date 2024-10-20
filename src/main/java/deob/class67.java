package deob;

import java.net.URL;

@ObfuscatedName("bl")
public class class67 {

    @ObfuscatedName("bl.r")
    public static int field995 = 0;

    @ObfuscatedName("bl.j")
    public static int field994 = 0;

    @ObfuscatedName("bl.p")
    public static int[] field1004 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bl.e")
    public static int[] field996 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bl.v")
    public int field998;

    @ObfuscatedName("bl.k")
    public int field999;

    @ObfuscatedName("bl.o")
    public int field1001;

    @ObfuscatedName("bl.q")
    public String field992;

    @ObfuscatedName("bl.l")
    public String field1002;

    @ObfuscatedName("bl.f")
    public int field1003;

    @ObfuscatedName("bl.z")
    public int field1005;

    @ObfuscatedName("v.y(B)Z")
    public static boolean method105() {
        try {
            if (Statics.field997 == null) {
                Statics.field997 = Statics.field478.method2874(new URL(Statics.field2505));
            } else if (Statics.field997.method2880()) {
                byte[] var0 = Statics.field997.method2881();
                class185 var1 = new class185(var0);
                var1.method3374();
                field995 = var1.method3280();
                Statics.field990 = new class67[field995];
                int var2 = 0;
                while (var2 < field995) {
                    class67 var3 = Statics.field990[var2] = new class67();
                    var3.field998 = var1.method3280();
                    var3.field999 = var1.method3374();
                    var3.field992 = var1.method3277();
                    var3.field1002 = var1.method3277();
                    var3.field1003 = var1.method3299();
                    var3.field1001 = var1.method3337();
                    var3.field1005 = var2++;
                }
                method32(Statics.field990, 0, Statics.field990.length - 1, field996, field1004);
                Statics.field997 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field997 = null;
        }
        return false;
    }

    @ObfuscatedName("bj.c(III)V")
    public static void method1473(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field996[var5] != arg0) {
                var2[var4] = field996[var5];
                var3[var4] = field1004[var5];
                var4++;
            }
        }
        field996 = var2;
        field1004 = var3;
        method32(Statics.field990, 0, Statics.field990.length - 1, field996, field1004);
    }

    @ObfuscatedName("u.n([Lbl;II[I[II)V")
    public static void method32(class67[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1005;
                        var12 = var8.field1005;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1001;
                        var12 = var8.field1001;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1475() ? 1 : 0;
                        var12 = var8.method1475() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field998;
                        var12 = var8.field998;
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
                        var15 = arg0[var5].field1005;
                        var16 = var8.field1005;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1001;
                        var16 = var8.field1001;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1475() ? 1 : 0;
                        var16 = var8.method1475() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field998;
                        var16 = var8.field998;
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
        method32(arg0, arg1, var6, arg3, arg4);
        method32(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("en.u(IIIZIZI)V")
    public static void method2887(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class67 var8 = Statics.field990[var6];
        Statics.field990[var6] = Statics.field990[arg1];
        Statics.field990[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class67 var10 = Statics.field990[var9];
            int var11 = method975(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method975(var10, var8, arg4, arg5);
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
                class67 var14 = Statics.field990[var9];
                Statics.field990[var9] = Statics.field990[var7];
                Statics.field990[var7++] = var14;
            }
        }
        Statics.field990[arg1] = Statics.field990[var7];
        Statics.field990[var7] = var8;
        method2887(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2887(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("bd.i(Lbl;Lbl;IZI)I")
    public static int method975(class67 arg0, class67 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1001;
            int var5 = arg1.field1001;
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
            return arg0.field1003 - arg1.field1003;
        } else if (arg2 == 3) {
            if (arg0.field1002.equals("-")) {
                if (arg1.field1002.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1002.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1002.compareTo(arg1.field1002);
            }
        } else if (arg2 == 4) {
            return arg0.method1478() ? (arg1.method1478() ? 0 : 1) : (arg1.method1478() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1476() ? (arg1.method1476() ? 0 : 1) : (arg1.method1476() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1477() ? (arg1.method1477() ? 0 : 1) : (arg1.method1477() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1475() ? (arg1.method1475() ? 0 : 1) : (arg1.method1475() ? -1 : 0);
        } else {
            return arg0.field998 - arg1.field998;
        }
    }

    @ObfuscatedName("bl.p(I)Z")
    public boolean method1475() {
        return (0x1 & this.field999) != 0;
    }

    @ObfuscatedName("bl.e(B)Z")
    public boolean method1476() {
        return (0x2 & this.field999) != 0;
    }

    @ObfuscatedName("bl.s(I)Z")
    public boolean method1477() {
        return (0x4 & this.field999) != 0;
    }

    @ObfuscatedName("bl.v(I)Z")
    public boolean method1478() {
        return (0x8 & this.field999) != 0;
    }

    @ObfuscatedName("bl.k(B)Z")
    public boolean method1479() {
        return (0x20000000 & this.field999) != 0;
    }

    @ObfuscatedName("bl.o(B)Z")
    public boolean method1502() {
        return (0x2000000 & this.field999) != 0;
    }
}
