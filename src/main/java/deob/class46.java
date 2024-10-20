package deob;

@ObfuscatedName("aw")
public class class46 {

    @ObfuscatedName("aw.g")
    public static byte[] field910 = new byte[2048];

    @ObfuscatedName("aw.v")
    public static byte[] field929 = new byte[2048];

    @ObfuscatedName("aw.y")
    public static class154[] field912 = new class154[2048];

    @ObfuscatedName("aw.p")
    public static int field917 = 0;

    @ObfuscatedName("aw.j")
    public static int[] field914 = new int[2048];

    @ObfuscatedName("aw.m")
    public static int field915 = 0;

    @ObfuscatedName("aw.a")
    public static int[] field916 = new int[2048];

    @ObfuscatedName("aw.i")
    public static int[] field913 = new int[2048];

    @ObfuscatedName("aw.s")
    public static int[] field918 = new int[2048];

    @ObfuscatedName("aw.k")
    public static int[] field911 = new int[2048];

    @ObfuscatedName("aw.f")
    public static int field920 = 0;

    @ObfuscatedName("aw.o")
    public static int[] field921 = new int[2048];

    @ObfuscatedName("aw.q")
    public static class154 field919 = new class154(new byte[5000]);

    public class46() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("af.x(Lff;I)V")
    public static final void method772(class160 arg0) {
        arg0.method2969();
        int var1 = client.field411;
        class24 var2 = Statics.field186 = client.field365[var1] = new class24();
        var2.field251 = var1;
        int var3 = arg0.method2951(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field659[0] = var5 - Statics.field267;
        var2.field636 = (var2.field659[0] << 7) + (var2.method233() << 6);
        var2.field660[0] = var6 - Statics.field3221;
        var2.field605 = (var2.field660[0] << 7) + (var2.method233() << 6);
        Statics.field1834 = var2.field262 = var4;
        if (field912[var1] != null) {
            var2.method229(field912[var1]);
        }
        field917 = 0;
        field914[++field917 - 1] = var1;
        field910[var1] = 0;
        field915 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2951(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field913[var7] = (var9 << 28) + (var10 << 14) + var11;
                field918[var7] = 0;
                field911[var7] = -1;
                field916[++field915 - 1] = var7;
                field910[var7] = 0;
            }
        }
        arg0.method2952();
    }

    @ObfuscatedName("l.n(Lff;II)V")
    public static final void method201(class160 arg0, int arg1) {
        int var2 = arg0.field2087;
        field920 = 0;
        method809(arg0);
        for (int var3 = 0; var3 < field920; var3++) {
            int var4 = field921[var3];
            class24 var5 = client.field365[var4];
            int var6 = arg0.method2878();
            if ((var6 & 0x80) != 0) {
                var6 += arg0.method2878() << 8;
            }
            method1911(arg0, var4, var5, var6);
        }
        if (arg0.field2087 - var2 != arg1) {
            throw new RuntimeException(arg0.field2087 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ag.g(Lff;I)V")
    public static final void method809(class160 arg0) {
        int var1 = 0;
        arg0.method2969();
        for (int var2 = 0; var2 < field917; var2++) {
            int var3 = field914[var2];
            if ((field910[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field910[var3] = (byte) (field910[var3] | 0x2);
                } else {
                    int var4 = arg0.method2951(1);
                    if (var4 == 0) {
                        var1 = method209(arg0);
                        field910[var3] = (byte) (field910[var3] | 0x2);
                    } else {
                        method222(arg0, var3);
                    }
                }
            }
        }
        arg0.method2952();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2969();
        for (int var5 = 0; var5 < field917; var5++) {
            int var6 = field914[var5];
            if ((field910[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field910[var6] = (byte) (field910[var6] | 0x2);
                } else {
                    int var7 = arg0.method2951(1);
                    if (var7 == 0) {
                        var1 = method209(arg0);
                        field910[var6] = (byte) (field910[var6] | 0x2);
                    } else {
                        method222(arg0, var6);
                    }
                }
            }
        }
        arg0.method2952();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2969();
        for (int var8 = 0; var8 < field915; var8++) {
            int var9 = field916[var8];
            if ((field910[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field910[var9] = (byte) (field910[var9] | 0x2);
                } else {
                    int var10 = arg0.method2951(1);
                    if (var10 == 0) {
                        var1 = method209(arg0);
                        field910[var9] = (byte) (field910[var9] | 0x2);
                    } else if (method106(arg0, var9)) {
                        field910[var9] = (byte) (field910[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2952();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2969();
        for (int var11 = 0; var11 < field915; var11++) {
            int var12 = field916[var11];
            if ((field910[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field910[var12] = (byte) (field910[var12] | 0x2);
                } else {
                    int var13 = arg0.method2951(1);
                    if (var13 == 0) {
                        var1 = method209(arg0);
                        field910[var12] = (byte) (field910[var12] | 0x2);
                    } else if (method106(arg0, var12)) {
                        field910[var12] = (byte) (field910[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2952();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field917 = 0;
        field915 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field910[var14] = (byte) (field910[var14] >> 1);
            class24 var15 = client.field365[var14];
            if (var15 == null) {
                field916[++field915 - 1] = var14;
            } else {
                field914[++field917 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("u.v(Lff;I)I")
    public static int method209(class160 arg0) {
        int var1 = arg0.method2951(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2951(5);
        } else if (var1 == 2) {
            var2 = arg0.method2951(8);
        } else {
            var2 = arg0.method2951(11);
        }
        return var2;
    }

    @ObfuscatedName("e.y(Lff;II)V")
    public static void method222(class160 arg0, int arg1) {
        boolean var2 = arg0.method2951(1) == 1;
        if (var2) {
            field921[++field920 - 1] = arg1;
        }
        int var3 = arg0.method2951(2);
        class24 var4 = client.field365[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field243 = false;
            } else if (client.field411 == arg1) {
                throw new RuntimeException();
            } else {
                field913[arg1] = (Statics.field3221 + var4.field660[0] >> 13) + (Statics.field267 + var4.field659[0] >> 13 << 14) + (var4.field262 << 28);
                if (var4.field632 == -1) {
                    field918[arg1] = var4.field655;
                } else {
                    field918[arg1] = var4.field632;
                }
                field911[arg1] = var4.field620;
                client.field365[arg1] = null;
                if (arg0.method2951(1) != 0) {
                    method106(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2951(3);
            int var6 = var4.field659[0];
            int var7 = var4.field660[0];
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
            if (client.field411 == arg1 && var4.field636 < 1536 || var4.field605 < 1536 || var4.field636 >= 11776 || var4.field605 >= 11776) {
                var4.method234(var6, var7);
                var4.field243 = false;
            } else if (var2) {
                var4.field243 = true;
                var4.field266 = var6;
                var4.field245 = var7;
            } else {
                var4.field243 = false;
                var4.method232(var6, var7, field929[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2951(4);
            int var9 = var4.field659[0];
            int var10 = var4.field660[0];
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
            if (client.field411 == arg1 && var4.field636 < 1536 || var4.field605 < 1536 || var4.field636 >= 11776 || var4.field605 >= 11776) {
                var4.method234(var9, var10);
                var4.field243 = false;
            } else if (var2) {
                var4.field243 = true;
                var4.field266 = var9;
                var4.field245 = var10;
            } else {
                var4.field243 = false;
                var4.method232(var9, var10, field929[arg1]);
            }
        } else {
            int var11 = arg0.method2951(1);
            if (var11 == 0) {
                int var12 = arg0.method2951(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field659[0] + var14;
                int var17 = var4.field660[0] + var15;
                if (client.field411 == arg1 && var4.field636 < 1536 || var4.field605 < 1536 || var4.field636 >= 11776 || var4.field605 >= 11776) {
                    var4.method234(var16, var17);
                    var4.field243 = false;
                } else if (var2) {
                    var4.field243 = true;
                    var4.field266 = var16;
                    var4.field245 = var17;
                } else {
                    var4.field243 = false;
                    var4.method232(var16, var17, field929[arg1]);
                }
                var4.field262 = (byte) (var4.field262 + var13 & 0x3);
                if (client.field411 == arg1) {
                    Statics.field1834 = var4.field262;
                }
            } else {
                int var18 = arg0.method2951(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field267 + var4.field659[0] + var20 & 0x3FFF) - Statics.field267;
                int var23 = (Statics.field3221 + var4.field660[0] + var21 & 0x3FFF) - Statics.field3221;
                if (client.field411 == arg1 && var4.field636 < 1536 || var4.field605 < 1536 || var4.field636 >= 11776 || var4.field605 >= 11776) {
                    var4.method234(var22, var23);
                    var4.field243 = false;
                } else if (var2) {
                    var4.field243 = true;
                    var4.field266 = var22;
                    var4.field245 = var23;
                } else {
                    var4.field243 = false;
                    var4.method232(var22, var23, field929[arg1]);
                }
                var4.field262 = (byte) (var4.field262 + var19 & 0x3);
                if (client.field411 == arg1) {
                    Statics.field1834 = var4.field262;
                }
            }
        }
    }

    @ObfuscatedName("a.p(Lff;IB)Z")
    public static boolean method106(class160 arg0, int arg1) {
        int var2 = arg0.method2951(2);
        if (var2 == 0) {
            if (arg0.method2951(1) != 0) {
                method106(arg0, arg1);
            }
            int var3 = arg0.method2951(13);
            int var4 = arg0.method2951(13);
            boolean var5 = arg0.method2951(1) == 1;
            if (var5) {
                field921[++field920 - 1] = arg1;
            }
            if (client.field365[arg1] != null) {
                throw new RuntimeException();
            }
            class24 var6 = client.field365[arg1] = new class24();
            var6.field251 = arg1;
            if (field912[arg1] != null) {
                var6.method229(field912[arg1]);
            }
            var6.field655 = field918[arg1];
            var6.field620 = field911[arg1];
            int var7 = field913[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field610[0] = field929[arg1];
            var6.field262 = (byte) var8;
            var6.method234((var9 << 13) + var3 - Statics.field267, (var10 << 13) + var4 - Statics.field3221);
            var6.field243 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2951(2);
            int var12 = field913[arg1];
            field913[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2951(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field913[arg1];
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
            field913[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2951(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field913[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field913[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ct.j(Lff;ILd;II)V")
    public static final void method1911(class160 arg0, int arg1, class24 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x10) != 0) {
            int var5 = arg0.method2878();
            byte[] var6 = new byte[var5];
            class154 var7 = new class154(var6);
            arg0.method2712(var6, 0, var5);
            field912[arg1] = var7;
            arg2.method229(var7);
        }
        if ((arg3 & 0x8) != 0) {
            int var8 = arg0.method2833();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2878();
            client.method803(arg2, var8, var9);
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field620 = arg0.method2833();
            if (arg2.field620 == 65535) {
                arg2.field620 = -1;
            }
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field652 = arg0.method2709();
            if (arg2.field652.charAt(0) == '~') {
                arg2.field652 = arg2.field652.substring(1);
                class48.method1892(2, arg2.field244, arg2.field652);
            } else if (Statics.field186 == arg2) {
                class48.method1892(2, arg2.field244, arg2.field652);
            }
            arg2.field614 = false;
            arg2.field621 = 0;
            arg2.field642 = 0;
            arg2.field638 = 150;
        }
        if ((arg3 & 0x40) != 0) {
            int var10 = arg0.method2878();
            if (var10 > 0) {
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = arg0.method2854();
                    if (var15 == 32767) {
                        var15 = arg0.method2854();
                        var13 = arg0.method2854();
                        var12 = arg0.method2854();
                        var14 = arg0.method2854();
                    } else if (var15 == 32766) {
                        var15 = -1;
                    } else {
                        var13 = arg0.method2854();
                    }
                    int var16 = arg0.method2854();
                    arg2.method623(var15, var13, var12, var14, client.field432, var16);
                }
            }
            int var17 = arg0.method2878();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = arg0.method2854();
                    int var20 = arg0.method2854();
                    if (var20 == 32767) {
                        arg2.method625(var19);
                    } else {
                        int var21 = arg0.method2854();
                        int var22 = arg0.method2878();
                        int var23 = var20 > 0 ? arg0.method2878() : var22;
                        arg2.method622(var19, client.field432, var20, var21, var22, var23);
                    }
                }
            }
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field632 = arg0.method2833();
            if (arg2.field658 == 0) {
                arg2.field655 = arg2.field632;
                arg2.field632 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var24 = arg0.method2833();
            class178 var25 = (class178) class149.method208(class178.method13(), arg0.method2878());
            boolean var26 = arg0.method2878() == 1;
            int var27 = arg0.method2878();
            int var28 = arg0.field2087;
            if (arg2.field244 != null && arg2.field242 != null) {
                boolean var29 = false;
                if (var25.field2671 && Statics.method190(arg2.field244)) {
                    var29 = true;
                }
                if (!var29 && client.field409 == 0 && !arg2.field261) {
                    field919.field2087 = 0;
                    arg0.method2712(field919.field2086, 0, var27);
                    field919.field2087 = 0;
                    String var30 = class210.method3735(class208.method3406(class211.method936(field919)));
                    arg2.field652 = var30.trim();
                    arg2.field621 = var24 >> 8;
                    arg2.field642 = var24 & 0xFF;
                    arg2.field638 = 150;
                    arg2.field614 = var26;
                    arg2.field619 = Statics.field186 != arg2 && var25.field2671 && client.field510 != "" && var30.toLowerCase().indexOf(client.field510) == -1;
                    int var31;
                    if (var25.field2670) {
                        var31 = var26 ? 91 : 1;
                    } else {
                        var31 = var26 ? 90 : 2;
                    }
                    if (var25.field2666 == -1) {
                        class48.method1892(var31, arg2.field244, var30);
                    } else {
                        int var33 = var25.field2666;
                        String var34 = "<img=" + var33 + ">";
                        class48.method1892(var31, var34 + arg2.field244, var30);
                    }
                }
            }
            arg0.field2087 = var27 + var28;
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field653 = arg0.method2833();
            int var35 = arg0.method2803();
            arg2.field617 = var35 >> 16;
            arg2.field644 = (var35 & 0xFFFF) + client.field432;
            arg2.field649 = 0;
            arg2.field643 = 0;
            if (arg2.field644 > client.field432) {
                arg2.field649 = -1;
            }
            if (arg2.field653 == 65535) {
                arg2.field653 = -1;
            }
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field646 = arg0.method2788();
            arg2.field648 = arg0.method2788();
            arg2.field647 = arg0.method2788();
            arg2.field607 = arg0.method2788();
            arg2.field645 = arg0.method2833() + client.field432;
            arg2.field651 = arg0.method2833() + client.field432;
            arg2.field627 = arg0.method2833();
            if (arg2.field243) {
                arg2.field646 += arg2.field266;
                arg2.field648 += arg2.field245;
                arg2.field647 += arg2.field266;
                arg2.field607 += arg2.field245;
                arg2.field658 = 0;
            } else {
                arg2.field646 += arg2.field659[0];
                arg2.field648 += arg2.field660[0];
                arg2.field647 += arg2.field659[0];
                arg2.field607 += arg2.field660[0];
                arg2.field658 = 1;
            }
            arg2.field663 = 0;
        }
        if ((arg3 & 0x100) != 0) {
            field929[arg1] = arg0.method2788();
        }
        if ((arg3 & 0x400) != 0) {
            var4 = arg0.method2788();
        }
        if ((arg3 & 0x1000) != 0) {
            for (int var36 = 0; var36 < 3; var36++) {
                arg2.field265[var36] = arg0.method2709();
            }
        }
        if (!arg2.field243) {
            return;
        }
        if (var4 == 127) {
            arg2.method234(arg2.field266, arg2.field245);
            return;
        }
        byte var37;
        if (var4 == -1) {
            var37 = field929[arg1];
        } else {
            var37 = var4;
        }
        arg2.method232(arg2.field266, arg2.field245, var37);
    }

    @ObfuscatedName("client.s(I)V")
    public static void method611() {
        field917 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field912[var0] = null;
            field929[var0] = 1;
        }
    }
}
