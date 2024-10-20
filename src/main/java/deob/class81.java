package deob;

import java.net.URL;

@ObfuscatedName("ch")
public class class81 {

    @ObfuscatedName("ch.g")
    public static int field1043 = 0;

    @ObfuscatedName("ch.n")
    public static int field1044 = 0;

    @ObfuscatedName("ch.u")
    public static int[] field1045 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ch.a")
    public static int[] field1046 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ch.w")
    public int field1047;

    @ObfuscatedName("ch.y")
    public int field1048;

    @ObfuscatedName("ch.c")
    public int field1049;

    @ObfuscatedName("ch.h")
    public String field1055;

    @ObfuscatedName("ch.k")
    public String field1051;

    @ObfuscatedName("ch.r")
    public int field1052;

    @ObfuscatedName("ch.s")
    public int field1053;

    @ObfuscatedName("aj.m(B)Z")
    public static boolean method701() {
        try {
            if (Statics.field1783 == null) {
                Statics.field1783 = Statics.field136.method3108(new URL(Statics.field3490));
            } else if (Statics.field1783.method3122()) {
                byte[] var0 = Statics.field1783.method3120();
                class310 var1 = new class310(var0);
                var1.method5209();
                field1043 = var1.method5283();
                Statics.field54 = new class81[field1043];
                int var2 = 0;
                while (var2 < field1043) {
                    class81 var3 = Statics.field54[var2] = new class81();
                    var3.field1047 = var1.method5283();
                    var3.field1048 = var1.method5209();
                    var3.field1055 = var1.method5236();
                    var3.field1051 = var1.method5236();
                    var3.field1052 = var1.method5227();
                    var3.field1049 = var1.method5241();
                    var3.field1053 = var2++;
                }
                method159(Statics.field54, 0, Statics.field54.length - 1, field1046, field1045);
                Statics.field1783 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1783 = null;
        }
        return false;
    }

    @ObfuscatedName("by.o(III)V")
    public static void method1172(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1046[var5] != arg0) {
                var2[var4] = field1046[var5];
                var3[var4] = field1045[var5];
                var4++;
            }
        }
        field1046 = var2;
        field1045 = var3;
        method159(Statics.field54, 0, Statics.field54.length - 1, field1046, field1045);
    }

    @ObfuscatedName("d.q([Lch;II[I[II)V")
    public static void method159(class81[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1053;
                        var12 = var8.field1053;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1049;
                        var12 = var8.field1049;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1681() ? 1 : 0;
                        var12 = var8.method1681() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1047;
                        var12 = var8.field1047;
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
                        var15 = arg0[var5].field1053;
                        var16 = var8.field1053;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1049;
                        var16 = var8.field1049;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1681() ? 1 : 0;
                        var16 = var8.method1681() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1047;
                        var16 = var8.field1047;
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
        method159(arg0, arg1, var6, arg3, arg4);
        method159(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("av.j(IZIZI)V")
    public static void method554(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field54 != null) {
            method1029(0, Statics.field54.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bo.p(IIIZIZI)V")
    public static void method1029(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class81 var8 = Statics.field54[var6];
        Statics.field54[var6] = Statics.field54[arg1];
        Statics.field54[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method1057(Statics.field54[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class81 var10 = Statics.field54[var9];
                Statics.field54[var9] = Statics.field54[var7];
                Statics.field54[var7++] = var10;
            }
        }
        Statics.field54[arg1] = Statics.field54[var7];
        Statics.field54[var7] = var8;
        method1029(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method1029(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("bv.g(Lch;Lch;IZIZI)I")
    public static int method1057(class81 arg0, class81 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method1630(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method1630(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("cc.n(Lch;Lch;IZI)I")
    public static int method1630(class81 arg0, class81 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1049;
            int var5 = arg1.field1049;
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
            return arg0.field1052 - arg1.field1052;
        } else if (arg2 == 3) {
            if (arg0.field1051.equals("-")) {
                if (arg1.field1051.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1051.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1051.compareTo(arg1.field1051);
            }
        } else if (arg2 == 4) {
            return arg0.method1647() ? (arg1.method1647() ? 0 : 1) : (arg1.method1647() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1680() ? (arg1.method1680() ? 0 : 1) : (arg1.method1680() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1637() ? (arg1.method1637() ? 0 : 1) : (arg1.method1637() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1681() ? (arg1.method1681() ? 0 : 1) : (arg1.method1681() ? -1 : 0);
        } else {
            return arg0.field1047 - arg1.field1047;
        }
    }

    @ObfuscatedName("j.a(B)Lch;")
    public static class81 method30() {
        return field1044 < field1043 ? Statics.field54[++field1044 - 1] : null;
    }

    @ObfuscatedName("ch.z(I)Z")
    public boolean method1681() {
        return (0x1 & this.field1048) != 0;
    }

    @ObfuscatedName("ch.w(I)Z")
    public boolean method1680() {
        return (0x2 & this.field1048) != 0;
    }

    @ObfuscatedName("ch.y(I)Z")
    public boolean method1637() {
        return (0x4 & this.field1048) != 0;
    }

    @ObfuscatedName("ch.c(I)Z")
    public boolean method1647() {
        return (0x8 & this.field1048) != 0;
    }

    @ObfuscatedName("ch.h(B)Z")
    public boolean method1638() {
        return (0x20000000 & this.field1048) != 0;
    }

    @ObfuscatedName("ch.k(I)Z")
    public boolean method1640() {
        return (0x2000000 & this.field1048) != 0;
    }

    @ObfuscatedName("ch.r(I)Z")
    public boolean method1641() {
        return (0x40000000 & this.field1048) != 0;
    }
}
