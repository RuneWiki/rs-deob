package deob;

@ObfuscatedName("ay")
public class class46 {

    @ObfuscatedName("ay.c")
    public static byte[] field910 = new byte[2048];

    @ObfuscatedName("ay.l")
    public static byte[] field911 = new byte[2048];

    @ObfuscatedName("ay.y")
    public static class154[] field912 = new class154[2048];

    @ObfuscatedName("ay.j")
    public static int field913 = 0;

    @ObfuscatedName("ay.g")
    public static int[] field921 = new int[2048];

    @ObfuscatedName("ay.s")
    public static int field915 = 0;

    @ObfuscatedName("ay.r")
    public static int[] field916 = new int[2048];

    @ObfuscatedName("ay.t")
    public static int[] field917 = new int[2048];

    @ObfuscatedName("ay.k")
    public static int[] field914 = new int[2048];

    @ObfuscatedName("ay.f")
    public static int[] field919 = new int[2048];

    @ObfuscatedName("ay.a")
    public static int field920 = 0;

    @ObfuscatedName("ay.v")
    public static int[] field928 = new int[2048];

    @ObfuscatedName("ay.d")
    public static class154 field922 = new class154(new byte[5000]);

    public class46() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.b(Lft;B)V")
    public static final void method204(class160 arg0) {
        arg0.method2915();
        int var1 = client.field431;
        class24 var2 = Statics.field685 = client.field408[var1] = new class24();
        var2.field268 = var1;
        int var3 = arg0.method2927(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field656[0] = var5 - Statics.field19;
        var2.field610 = (var2.field656[0] << 7) + (var2.method249() << 6);
        var2.field657[0] = var6 - Statics.field341;
        var2.field609 = (var2.field657[0] << 7) + (var2.method249() << 6);
        Statics.field967 = var2.field252 = var4;
        if (field912[var1] != null) {
            var2.method239(field912[var1]);
        }
        field913 = 0;
        field921[++field913 - 1] = var1;
        field910[var1] = 0;
        field915 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2927(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field917[var7] = (var9 << 28) + (var10 << 14) + var11;
                field914[var7] = 0;
                field919[var7] = -1;
                field916[++field915 - 1] = var7;
                field910[var7] = 0;
            }
        }
        arg0.method2917();
    }

    @ObfuscatedName("w.e(Lft;II)V")
    public static final void method232(class160 arg0, int arg1) {
        int var2 = arg0.field2079;
        field920 = 0;
        method752(arg0);
        for (int var3 = 0; var3 < field920; var3++) {
            int var4 = field928[var3];
            class24 var5 = client.field408[var4];
            int var6 = arg0.method2669();
            if ((var6 & 0x2) != 0) {
                var6 += arg0.method2669() << 8;
            }
            method1848(arg0, var4, var5, var6);
        }
        if (arg0.field2079 - var2 != arg1) {
            throw new RuntimeException(arg0.field2079 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ao.c(Lft;I)V")
    public static final void method752(class160 arg0) {
        int var1 = 0;
        arg0.method2915();
        for (int var2 = 0; var2 < field913; var2++) {
            int var3 = field921[var2];
            if ((field910[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field910[var3] = (byte) (field910[var3] | 0x2);
                } else {
                    int var4 = arg0.method2927(1);
                    if (var4 == 0) {
                        var1 = method206(arg0);
                        field910[var3] = (byte) (field910[var3] | 0x2);
                    } else {
                        method114(arg0, var3);
                    }
                }
            }
        }
        arg0.method2917();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2915();
        for (int var5 = 0; var5 < field913; var5++) {
            int var6 = field921[var5];
            if ((field910[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field910[var6] = (byte) (field910[var6] | 0x2);
                } else {
                    int var7 = arg0.method2927(1);
                    if (var7 == 0) {
                        var1 = method206(arg0);
                        field910[var6] = (byte) (field910[var6] | 0x2);
                    } else {
                        method114(arg0, var6);
                    }
                }
            }
        }
        arg0.method2917();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2915();
        for (int var8 = 0; var8 < field915; var8++) {
            int var9 = field916[var8];
            if ((field910[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field910[var9] = (byte) (field910[var9] | 0x2);
                } else {
                    int var10 = arg0.method2927(1);
                    if (var10 == 0) {
                        var1 = method206(arg0);
                        field910[var9] = (byte) (field910[var9] | 0x2);
                    } else if (Statics.method598(arg0, var9)) {
                        field910[var9] = (byte) (field910[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2917();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2915();
        for (int var11 = 0; var11 < field915; var11++) {
            int var12 = field916[var11];
            if ((field910[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field910[var12] = (byte) (field910[var12] | 0x2);
                } else {
                    int var13 = arg0.method2927(1);
                    if (var13 == 0) {
                        var1 = method206(arg0);
                        field910[var12] = (byte) (field910[var12] | 0x2);
                    } else if (Statics.method598(arg0, var12)) {
                        field910[var12] = (byte) (field910[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2917();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field913 = 0;
        field915 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field910[var14] = (byte) (field910[var14] >> 1);
            class24 var15 = client.field408[var14];
            if (var15 == null) {
                field916[++field915 - 1] = var14;
            } else {
                field921[++field913 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("i.l(Lft;B)I")
    public static int method206(class160 arg0) {
        int var1 = arg0.method2927(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2927(5);
        } else if (var1 == 2) {
            var2 = arg0.method2927(8);
        } else {
            var2 = arg0.method2927(11);
        }
        return var2;
    }

    @ObfuscatedName("t.y(Lft;IB)V")
    public static void method114(class160 arg0, int arg1) {
        boolean var2 = arg0.method2927(1) == 1;
        if (var2) {
            field928[++field920 - 1] = arg1;
        }
        int var3 = arg0.method2927(2);
        class24 var4 = client.field408[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field262 = false;
            } else if (client.field431 == arg1) {
                throw new RuntimeException();
            } else {
                field917[arg1] = (Statics.field341 + var4.field657[0] >> 13) + (Statics.field19 + var4.field656[0] >> 13 << 14) + (var4.field252 << 28);
                if (var4.field629 == -1) {
                    field914[arg1] = var4.field652;
                } else {
                    field914[arg1] = var4.field629;
                }
                field919[arg1] = var4.field647;
                client.field408[arg1] = null;
                if (arg0.method2927(1) != 0) {
                    Statics.method598(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2927(3);
            int var6 = var4.field656[0];
            int var7 = var4.field657[0];
            if (var5 == 0) {
                var6--;
                var7--;
            } else if (var5 == 1) {
                var7--;
            } else if (var5 == 2) {
                var6++;
                var7--;
            } else if (var5 == 3) {
                var6--;
            } else if (var5 == 4) {
                var6++;
            } else if (var5 == 5) {
                var6--;
                var7++;
            } else if (var5 == 6) {
                var7++;
            } else if (var5 == 7) {
                var6++;
                var7++;
            }
            if (client.field431 == arg1 && var4.field610 < 1536 || var4.field609 < 1536 || var4.field610 >= 11776 || var4.field609 >= 11776) {
                var4.method243(var6, var7);
                var4.field262 = false;
            } else if (var2) {
                var4.field262 = true;
                var4.field253 = var6;
                var4.field271 = var7;
            } else {
                var4.field262 = false;
                var4.method240(var6, var7, field911[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2927(4);
            int var9 = var4.field656[0];
            int var10 = var4.field657[0];
            if (var8 == 0) {
                var9 -= 2;
                var10 -= 2;
            } else if (var8 == 1) {
                var9--;
                var10 -= 2;
            } else if (var8 == 2) {
                var10 -= 2;
            } else if (var8 == 3) {
                var9++;
                var10 -= 2;
            } else if (var8 == 4) {
                var9 += 2;
                var10 -= 2;
            } else if (var8 == 5) {
                var9 -= 2;
                var10--;
            } else if (var8 == 6) {
                var9 += 2;
                var10--;
            } else if (var8 == 7) {
                var9 -= 2;
            } else if (var8 == 8) {
                var9 += 2;
            } else if (var8 == 9) {
                var9 -= 2;
                var10++;
            } else if (var8 == 10) {
                var9 += 2;
                var10++;
            } else if (var8 == 11) {
                var9 -= 2;
                var10 += 2;
            } else if (var8 == 12) {
                var9--;
                var10 += 2;
            } else if (var8 == 13) {
                var10 += 2;
            } else if (var8 == 14) {
                var9++;
                var10 += 2;
            } else if (var8 == 15) {
                var9 += 2;
                var10 += 2;
            }
            if (client.field431 == arg1 && var4.field610 < 1536 || var4.field609 < 1536 || var4.field610 >= 11776 || var4.field609 >= 11776) {
                var4.method243(var9, var10);
                var4.field262 = false;
            } else if (var2) {
                var4.field262 = true;
                var4.field253 = var9;
                var4.field271 = var10;
            } else {
                var4.field262 = false;
                var4.method240(var9, var10, field911[arg1]);
            }
        } else {
            int var11 = arg0.method2927(1);
            if (var11 == 0) {
                int var12 = arg0.method2927(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field656[0] + var14;
                int var17 = var4.field657[0] + var15;
                if (client.field431 == arg1 && var4.field610 < 1536 || var4.field609 < 1536 || var4.field610 >= 11776 || var4.field609 >= 11776) {
                    var4.method243(var16, var17);
                    var4.field262 = false;
                } else if (var2) {
                    var4.field262 = true;
                    var4.field253 = var16;
                    var4.field271 = var17;
                } else {
                    var4.field262 = false;
                    var4.method240(var16, var17, field911[arg1]);
                }
                var4.field252 = (byte) (var4.field252 + var13 & 0x3);
                if (client.field431 == arg1) {
                    Statics.field967 = var4.field252;
                }
            } else {
                int var18 = arg0.method2927(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field19 + var4.field656[0] + var20 & 0x3FFF) - Statics.field19;
                int var23 = (Statics.field341 + var4.field657[0] + var21 & 0x3FFF) - Statics.field341;
                if (client.field431 == arg1 && var4.field610 < 1536 || var4.field609 < 1536 || var4.field610 >= 11776 || var4.field609 >= 11776) {
                    var4.method243(var22, var23);
                    var4.field262 = false;
                } else if (var2) {
                    var4.field262 = true;
                    var4.field253 = var22;
                    var4.field271 = var23;
                } else {
                    var4.field262 = false;
                    var4.method240(var22, var23, field911[arg1]);
                }
                var4.field252 = (byte) (var4.field252 + var19 & 0x3);
                if (client.field431 == arg1) {
                    Statics.field967 = var4.field252;
                }
            }
        }
    }

    @ObfuscatedName("cm.t(Lft;ILu;II)V")
    public static final void method1848(class160 arg0, int arg1, class24 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x1) != 0) {
            int var5 = arg0.method2669();
            byte[] var6 = new byte[var5];
            class154 var7 = new class154(var6);
            arg0.method2680(var6, 0, var5);
            field912[arg1] = var7;
            arg2.method239(var7);
        }
        if ((arg3 & 0x80) != 0) {
            int var8 = arg0.method2671();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2669();
            client.method69(arg2, var8, var9);
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field647 = arg0.method2671();
            if (arg2.field647 == 65535) {
                arg2.field647 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field614 = arg0.method2677();
            if (arg2.field614.charAt(0) == '~') {
                arg2.field614 = arg2.field614.substring(1);
                class48.method3031(2, arg2.field267, arg2.field614);
            } else if (Statics.field685 == arg2) {
                class48.method3031(2, arg2.field267, arg2.field614);
            }
            arg2.field646 = false;
            arg2.field618 = 0;
            arg2.field631 = 0;
            arg2.field627 = 150;
        }
        if ((arg3 & 0x4) != 0) {
            int var10 = arg0.method2669();
            if (var10 > 0) {
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = arg0.method2682();
                    if (var15 == 32767) {
                        var15 = arg0.method2682();
                        var13 = arg0.method2682();
                        var12 = arg0.method2682();
                        var14 = arg0.method2682();
                    } else if (var15 == 32766) {
                        var15 = -1;
                    } else {
                        var13 = arg0.method2682();
                    }
                    int var16 = arg0.method2682();
                    arg2.method597(var15, var13, var12, var14, client.field489, var16);
                }
            }
            int var17 = arg0.method2669();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = arg0.method2682();
                    int var20 = arg0.method2682();
                    if (var20 == 32767) {
                        arg2.method587(var19);
                    } else {
                        int var21 = arg0.method2682();
                        int var22 = arg0.method2669();
                        int var23 = var20 > 0 ? arg0.method2669() : var22;
                        arg2.method586(var19, client.field489, var20, var21, var22, var23);
                    }
                }
            }
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field629 = arg0.method2671();
            if (arg2.field655 == 0) {
                arg2.field652 = arg2.field629;
                arg2.field629 = -1;
            }
        }
        if ((arg3 & 0x40) != 0) {
            int var24 = arg0.method2671();
            class178 var25 = (class178) class149.method1841(class178.method762(), arg0.method2669());
            boolean var26 = arg0.method2669() == 1;
            int var27 = arg0.method2669();
            int var28 = arg0.field2079;
            if (arg2.field267 != null && arg2.field246 != null) {
                boolean var29 = false;
                if (var25.field2665 && client.method2208(arg2.field267)) {
                    var29 = true;
                }
                if (!var29 && client.field407 == 0 && !arg2.field266) {
                    field922.field2079 = 0;
                    arg0.method2680(field922.field2084, 0, var27);
                    field922.field2079 = 0;
                    class154 var30 = field922;
                    String var34;
                    try {
                        int var31 = var30.method2682();
                        if (var31 > 32767) {
                            var31 = 32767;
                        }
                        byte[] var32 = new byte[var31];
                        var30.field2079 += Statics.field2185.method2591(var30.field2084, var30.field2079, var32, 0, var31);
                        String var33 = class204.method3105(var32, 0, var31);
                        var34 = var33;
                    } catch (Exception var42) {
                        var34 = "Cabbage";
                    }
                    String var37 = class210.method3706(class208.method809(var34));
                    arg2.field614 = var37.trim();
                    arg2.field618 = var24 >> 8;
                    arg2.field631 = var24 & 0xFF;
                    arg2.field627 = 150;
                    arg2.field646 = var26;
                    arg2.field616 = Statics.field685 != arg2 && var25.field2665 && client.field413 != "" && var37.toLowerCase().indexOf(client.field413) == -1;
                    int var38;
                    if (var25.field2673) {
                        var38 = var26 ? 91 : 1;
                    } else {
                        var38 = var26 ? 90 : 2;
                    }
                    if (var25.field2672 == -1) {
                        class48.method3031(var38, arg2.field267, var37);
                    } else {
                        class48.method3031(var38, class38.method267(var25.field2672) + arg2.field267, var37);
                    }
                }
            }
            arg0.field2079 = var27 + var28;
        }
        if ((arg3 & 0x1000) != 0) {
            arg2.field638 = arg0.method2671();
            int var39 = arg0.method2815();
            arg2.field642 = var39 >> 16;
            arg2.field640 = (var39 & 0xFFFF) + client.field489;
            arg2.field639 = 0;
            arg2.field601 = 0;
            if (arg2.field640 > client.field489) {
                arg2.field639 = -1;
            }
            if (arg2.field638 == 65535) {
                arg2.field638 = -1;
            }
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field643 = arg0.method2670();
            arg2.field645 = arg0.method2670();
            arg2.field644 = arg0.method2670();
            arg2.field635 = arg0.method2670();
            arg2.field641 = arg0.method2671() + client.field489;
            arg2.field648 = arg0.method2671() + client.field489;
            arg2.field649 = arg0.method2671();
            if (arg2.field262) {
                arg2.field643 += arg2.field253;
                arg2.field645 += arg2.field271;
                arg2.field644 += arg2.field253;
                arg2.field635 += arg2.field271;
                arg2.field655 = 0;
            } else {
                arg2.field643 += arg2.field656[0];
                arg2.field645 += arg2.field657[0];
                arg2.field644 += arg2.field656[0];
                arg2.field635 += arg2.field657[0];
                arg2.field655 = 1;
            }
            arg2.field660 = 0;
        }
        if ((arg3 & 0x200) != 0) {
            field911[arg1] = arg0.method2670();
        }
        if ((arg3 & 0x800) != 0) {
            var4 = arg0.method2670();
        }
        if ((arg3 & 0x400) != 0) {
            for (int var40 = 0; var40 < 3; var40++) {
                arg2.field250[var40] = arg0.method2677();
            }
        }
        if (!arg2.field262) {
            return;
        }
        if (var4 == 127) {
            arg2.method243(arg2.field253, arg2.field271);
            return;
        }
        byte var41;
        if (var4 == -1) {
            var41 = field911[arg1];
        } else {
            var41 = var4;
        }
        arg2.method240(arg2.field253, arg2.field271, var41);
    }

    @ObfuscatedName("ea.k(B)V")
    public static void method2606() {
        field913 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field912[var0] = null;
            field911[var0] = 1;
        }
    }
}
