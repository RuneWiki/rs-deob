package deob;

@ObfuscatedName("ar")
public class class46 {

    @ObfuscatedName("ar.i")
    public static byte[] field886 = new byte[2048];

    @ObfuscatedName("ar.a")
    public static byte[] field887 = new byte[2048];

    @ObfuscatedName("ar.f")
    public static class154[] field888 = new class154[2048];

    @ObfuscatedName("ar.c")
    public static int field889 = 0;

    @ObfuscatedName("ar.d")
    public static int[] field893 = new int[2048];

    @ObfuscatedName("ar.l")
    public static int field891 = 0;

    @ObfuscatedName("ar.g")
    public static int[] field900 = new int[2048];

    @ObfuscatedName("ar.z")
    public static int[] field890 = new int[2048];

    @ObfuscatedName("ar.t")
    public static int[] field884 = new int[2048];

    @ObfuscatedName("ar.m")
    public static int[] field895 = new int[2048];

    @ObfuscatedName("ar.q")
    public static int field896 = 0;

    @ObfuscatedName("ar.e")
    public static int[] field905 = new int[2048];

    @ObfuscatedName("ar.v")
    public static class154 field898 = new class154(new byte[5000]);

    public class46() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ah.u(Lfg;B)V")
    public static final void method708(class160 arg0) {
        arg0.method2834();
        int var1 = client.field405;
        class24 var2 = Statics.field2019 = client.field434[var1] = new class24();
        var2.field245 = var1;
        int var3 = arg0.method2835(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field655[0] = var5 - Statics.field1465;
        var2.field612 = (var2.field655[0] << 7) + (var2.method216() << 6);
        var2.field610[0] = var6 - Statics.field129;
        var2.field601 = (var2.field610[0] << 7) + (var2.method216() << 6);
        Statics.field1075 = var2.field262 = var4;
        if (field888[var1] != null) {
            var2.method215(field888[var1]);
        }
        field889 = 0;
        field893[++field889 - 1] = var1;
        field886[var1] = 0;
        field891 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2835(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field890[var7] = (var9 << 28) + (var10 << 14) + var11;
                field884[var7] = 0;
                field895[var7] = -1;
                field900[++field891 - 1] = var7;
                field886[var7] = 0;
            }
        }
        arg0.method2843();
    }

    @ObfuscatedName("aw.x(Lfg;IB)V")
    public static final void method726(class160 arg0, int arg1) {
        int var2 = arg0.field2073;
        field896 = 0;
        method97(arg0);
        for (int var3 = 0; var3 < field896; var3++) {
            int var4 = field905[var3];
            class24 var5 = client.field434[var4];
            int var6 = arg0.method2708();
            if ((var6 & 0x20) != 0) {
                var6 += arg0.method2708() << 8;
            }
            method149(arg0, var4, var5, var6);
        }
        if (arg0.field2073 - var2 != arg1) {
            throw new RuntimeException(arg0.field2073 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("d.i(Lfg;B)V")
    public static final void method97(class160 arg0) {
        int var1 = 0;
        arg0.method2834();
        for (int var2 = 0; var2 < field889; var2++) {
            int var3 = field893[var2];
            if ((field886[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field886[var3] = (byte) (field886[var3] | 0x2);
                } else {
                    int var4 = arg0.method2835(1);
                    if (var4 == 0) {
                        var1 = method1313(arg0);
                        field886[var3] = (byte) (field886[var3] | 0x2);
                    } else {
                        Statics.method154(arg0, var3);
                    }
                }
            }
        }
        arg0.method2843();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2834();
        for (int var5 = 0; var5 < field889; var5++) {
            int var6 = field893[var5];
            if ((field886[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field886[var6] = (byte) (field886[var6] | 0x2);
                } else {
                    int var7 = arg0.method2835(1);
                    if (var7 == 0) {
                        var1 = method1313(arg0);
                        field886[var6] = (byte) (field886[var6] | 0x2);
                    } else {
                        Statics.method154(arg0, var6);
                    }
                }
            }
        }
        arg0.method2843();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2834();
        for (int var8 = 0; var8 < field891; var8++) {
            int var9 = field900[var8];
            if ((field886[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field886[var9] = (byte) (field886[var9] | 0x2);
                } else {
                    int var10 = arg0.method2835(1);
                    if (var10 == 0) {
                        var1 = method1313(arg0);
                        field886[var9] = (byte) (field886[var9] | 0x2);
                    } else if (method671(arg0, var9)) {
                        field886[var9] = (byte) (field886[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2843();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2834();
        for (int var11 = 0; var11 < field891; var11++) {
            int var12 = field900[var11];
            if ((field886[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field886[var12] = (byte) (field886[var12] | 0x2);
                } else {
                    int var13 = arg0.method2835(1);
                    if (var13 == 0) {
                        var1 = method1313(arg0);
                        field886[var12] = (byte) (field886[var12] | 0x2);
                    } else if (method671(arg0, var12)) {
                        field886[var12] = (byte) (field886[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2843();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field889 = 0;
        field891 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field886[var14] = (byte) (field886[var14] >> 1);
            class24 var15 = client.field434[var14];
            if (var15 == null) {
                field900[++field891 - 1] = var14;
            } else {
                field893[++field889 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("bj.a(Lfg;I)I")
    public static int method1313(class160 arg0) {
        int var1 = arg0.method2835(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2835(5);
        } else if (var1 == 2) {
            var2 = arg0.method2835(8);
        } else {
            var2 = arg0.method2835(11);
        }
        return var2;
    }

    @ObfuscatedName("af.g(Lfg;IB)Z")
    public static boolean method671(class160 arg0, int arg1) {
        int var2 = arg0.method2835(2);
        if (var2 == 0) {
            if (arg0.method2835(1) != 0) {
                method671(arg0, arg1);
            }
            int var3 = arg0.method2835(6);
            int var4 = arg0.method2835(6);
            boolean var5 = arg0.method2835(1) == 1;
            if (var5) {
                field905[++field896 - 1] = arg1;
            }
            if (client.field434[arg1] != null) {
                throw new RuntimeException();
            }
            class24 var6 = client.field434[arg1] = new class24();
            var6.field245 = arg1;
            if (field888[arg1] != null) {
                var6.method215(field888[arg1]);
            }
            var6.field651 = field884[arg1];
            var6.field626 = field895[arg1];
            int var7 = field890[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field657[0] = field887[arg1];
            var6.field262 = (byte) var8;
            var6.method219((var9 << 6) + var3 - Statics.field1465, (var10 << 6) + var4 - Statics.field129);
            var6.field264 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2835(2);
            int var12 = field890[arg1];
            field890[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2835(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field890[arg1];
            int var17 = (var16 >> 28) + var14 & 0x3;
            int var18 = var16 >> 14 & 0xFF;
            int var19 = var16 & 0xFF;
            if (var15 == 0) {
                var18--;
                var19--;
            }
            if (var15 == 1) {
                var19--;
            }
            if (var15 == 2) {
                var18++;
                var19--;
            }
            if (var15 == 3) {
                var18--;
            }
            if (var15 == 4) {
                var18++;
            }
            if (var15 == 5) {
                var18--;
                var19++;
            }
            if (var15 == 6) {
                var19++;
            }
            if (var15 == 7) {
                var18++;
                var19++;
            }
            field890[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2835(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field890[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field890[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("t.z(Lfg;ILn;II)V")
    public static final void method149(class160 arg0, int arg1, class24 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x8) != 0) {
            int var5 = arg0.method2708();
            byte[] var6 = new byte[var5];
            class154 var7 = new class154(var6);
            arg0.method2787(var6, 0, var5);
            field888[arg1] = var7;
            arg2.method215(var7);
        }
        if ((arg3 & 0x4) != 0) {
            int var8 = arg0.method2581();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2708();
            Statics.method168(arg2, var8, var9);
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field626 = arg0.method2581();
            if (arg2.field626 == 65535) {
                arg2.field626 = -1;
            }
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field613 = arg0.method2778();
            if (arg2.field613.charAt(0) == '~') {
                arg2.field613 = arg2.field613.substring(1);
                class48.method100(2, arg2.field244, arg2.field613);
            } else if (Statics.field2019 == arg2) {
                class48.method100(2, arg2.field244, arg2.field613);
            }
            arg2.field646 = false;
            arg2.field600 = 0;
            arg2.field618 = 0;
            arg2.field616 = 150;
        }
        if ((arg3 & 0x40) != 0) {
            int var10 = arg0.method2708();
            if (var10 > 0) {
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = arg0.method2776();
                    if (var15 == 32767) {
                        var15 = arg0.method2776();
                        var13 = arg0.method2776();
                        var12 = arg0.method2776();
                        var14 = arg0.method2776();
                    } else if (var15 == 32766) {
                        var15 = -1;
                    } else {
                        var13 = arg0.method2776();
                    }
                    int var16 = arg0.method2776();
                    arg2.method612(var15, var13, var12, var14, client.field291, var16);
                }
            }
            int var17 = arg0.method2708();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = arg0.method2776();
                    int var20 = arg0.method2776();
                    if (var20 == 32767) {
                        arg2.method606(var19);
                    } else {
                        int var21 = arg0.method2776();
                        int var22 = arg0.method2708();
                        int var23 = var20 > 0 ? arg0.method2708() : var22;
                        arg2.method605(var19, client.field291, var20, var21, var22, var23);
                    }
                }
            }
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field628 = arg0.method2581();
            if (arg2.field654 == 0) {
                arg2.field651 = arg2.field628;
                arg2.field628 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var24 = arg0.method2581();
            class178 var25 = (class178) class149.method3057(class178.method212(), arg0.method2708());
            boolean var26 = arg0.method2708() == 1;
            int var27 = arg0.method2708();
            int var28 = arg0.field2073;
            if (arg2.field244 != null && arg2.field256 != null) {
                boolean var29 = false;
                if (var25.field2649 && client.method2918(arg2.field244)) {
                    var29 = true;
                }
                if (!var29 && client.field403 == 0 && !arg2.field261) {
                    field898.field2073 = 0;
                    arg0.method2787(field898.field2078, 0, var27);
                    field898.field2073 = 0;
                    String var30 = class210.method3657(class208.method590(class211.method729(field898)));
                    arg2.field613 = var30.trim();
                    arg2.field600 = var24 >> 8;
                    arg2.field618 = var24 & 0xFF;
                    arg2.field616 = 150;
                    arg2.field646 = var26;
                    arg2.field622 = Statics.field2019 != arg2 && var25.field2649 && client.field555 != "" && var30.toLowerCase().indexOf(client.field555) == -1;
                    int var31;
                    if (var25.field2650) {
                        var31 = var26 ? 91 : 1;
                    } else {
                        var31 = var26 ? 90 : 2;
                    }
                    if (var25.field2642 == -1) {
                        class48.method100(var31, arg2.field244, var30);
                    } else {
                        class48.method100(var31, class38.method1903(var25.field2642) + arg2.field244, var30);
                    }
                }
            }
            arg0.field2073 = var27 + var28;
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field637 = arg0.method2581();
            int var32 = arg0.method2593();
            arg2.field641 = var32 >> 16;
            arg2.field649 = (var32 & 0xFFFF) + client.field291;
            arg2.field635 = 0;
            arg2.field639 = 0;
            if (arg2.field649 > client.field291) {
                arg2.field635 = -1;
            }
            if (arg2.field637 == 65535) {
                arg2.field637 = -1;
            }
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field642 = arg0.method2754();
            arg2.field644 = arg0.method2754();
            arg2.field619 = arg0.method2754();
            arg2.field643 = arg0.method2754();
            arg2.field611 = arg0.method2581() + client.field291;
            arg2.field647 = arg0.method2581() + client.field291;
            arg2.field648 = arg0.method2581();
            if (arg2.field264) {
                arg2.field642 += arg2.field265;
                arg2.field644 += arg2.field266;
                arg2.field619 += arg2.field265;
                arg2.field643 += arg2.field266;
                arg2.field654 = 0;
            } else {
                arg2.field642 += arg2.field655[0];
                arg2.field644 += arg2.field610[0];
                arg2.field619 += arg2.field655[0];
                arg2.field643 += arg2.field610[0];
                arg2.field654 = 1;
            }
            arg2.field659 = 0;
        }
        if ((arg3 & 0x1000) != 0) {
            field887[arg1] = arg0.method2754();
        }
        if ((arg3 & 0x200) != 0) {
            var4 = arg0.method2754();
        }
        if ((arg3 & 0x800) != 0) {
            for (int var33 = 0; var33 < 3; var33++) {
                arg2.field267[var33] = arg0.method2778();
            }
        }
        if (!arg2.field264) {
            return;
        }
        if (var4 == 127) {
            arg2.method219(arg2.field265, arg2.field266);
            return;
        }
        byte var34;
        if (var4 == -1) {
            var34 = field887[arg1];
        } else {
            var34 = var4;
        }
        arg2.method218(arg2.field265, arg2.field266, var34);
    }

    @ObfuscatedName("gl.t(I)V")
    public static void method3250() {
        field889 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field888[var0] = null;
            field887[var0] = 1;
        }
    }
}
