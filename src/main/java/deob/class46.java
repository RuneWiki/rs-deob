package deob;

@ObfuscatedName("ad")
public class class46 {

    @ObfuscatedName("ad.n")
    public static byte[] field889 = new byte[2048];

    @ObfuscatedName("ad.q")
    public static byte[] field890 = new byte[2048];

    @ObfuscatedName("ad.t")
    public static class130[] field891 = new class130[2048];

    @ObfuscatedName("ad.p")
    public static int field892 = 0;

    @ObfuscatedName("ad.u")
    public static int[] field895 = new int[2048];

    @ObfuscatedName("ad.z")
    public static int field894 = 0;

    @ObfuscatedName("ad.l")
    public static int[] field887 = new int[2048];

    @ObfuscatedName("ad.v")
    public static int[] field896 = new int[2048];

    @ObfuscatedName("ad.g")
    public static int[] field901 = new int[2048];

    @ObfuscatedName("ad.w")
    public static int[] field898 = new int[2048];

    @ObfuscatedName("ad.r")
    public static int field903 = 0;

    @ObfuscatedName("ad.s")
    public static int[] field900 = new int[2048];

    @ObfuscatedName("ad.k")
    public static class130 field905 = new class130(new byte[5000]);

    public class46() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.d(Lee;B)V")
    public static final void method77(class136 arg0) {
        arg0.method2482();
        int var1 = client.field414;
        class24 var2 = Statics.field233 = client.field404[var1] = new class24();
        var2.field258 = var1;
        int var3 = arg0.method2483(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field662[0] = var5 - Statics.field1726;
        var2.field629 = (var2.field662[0] << 7) + (var2.method227() << 6);
        var2.field656[0] = var6 - Statics.field1776;
        var2.field601 = (var2.field656[0] << 7) + (var2.method227() << 6);
        Statics.field533 = var2.field257 = var4;
        if (field891[var1] != null) {
            var2.method228(field891[var1]);
        }
        field892 = 0;
        field895[++field892 - 1] = var1;
        field889[var1] = 0;
        field894 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2483(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field896[var7] = (var9 << 28) + (var10 << 14) + var11;
                field901[var7] = 0;
                field898[var7] = -1;
                field887[++field894 - 1] = var7;
                field889[var7] = 0;
            }
        }
        arg0.method2485();
    }

    @ObfuscatedName("aw.c(Lee;II)V")
    public static final void method753(class136 arg0, int arg1) {
        int var2 = arg0.field1956;
        field903 = 0;
        method2205(arg0);
        for (int var3 = 0; var3 < field903; var3++) {
            int var4 = field900[var3];
            class24 var5 = client.field404[var4];
            int var6 = arg0.method2379();
            if ((var6 & 0x10) != 0) {
                var6 += arg0.method2379() << 8;
            }
            byte var7 = -1;
            if ((var6 & 0x20) != 0) {
                int var8 = arg0.method2379();
                byte[] var9 = new byte[var8];
                class130 var10 = new class130(var9);
                arg0.method2240(var9, 0, var8);
                field891[var4] = var10;
                var5.method228(var10);
            }
            if ((var6 & 0x8) != 0) {
                int var11 = arg0.method2232();
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg0.method2379();
                client.method251(var5, var11, var12);
            }
            if ((var6 & 0x4) != 0) {
                var5.field626 = arg0.method2232();
                if (var5.field626 == 65535) {
                    var5.field626 = -1;
                }
            }
            if ((var6 & 0x1) != 0) {
                var5.field613 = arg0.method2314();
                if (var5.field613.charAt(0) == '~') {
                    var5.field613 = var5.field613.substring(1);
                    class48.method196(2, var5.field266, var5.field613);
                } else if (Statics.field233 == var5) {
                    class48.method196(2, var5.field266, var5.field613);
                }
                var5.field614 = false;
                var5.field617 = 0;
                var5.field618 = 0;
                var5.field616 = 150;
            }
            if ((var6 & 0x2) != 0) {
                int var13 = arg0.method2379();
                if (var13 > 0) {
                    for (int var14 = 0; var14 < var13; var14++) {
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = -1;
                        int var18 = arg0.method2242();
                        if (var18 == 32767) {
                            var18 = arg0.method2242();
                            var16 = arg0.method2242();
                            var15 = arg0.method2242();
                            var17 = arg0.method2242();
                        } else if (var18 == 32766) {
                            var18 = -1;
                        } else {
                            var16 = arg0.method2242();
                        }
                        int var19 = arg0.method2242();
                        var5.method583(var18, var16, var15, var17, client.field291, var19);
                    }
                }
                int var20 = arg0.method2379();
                if (var20 > 0) {
                    for (int var21 = 0; var21 < var20; var21++) {
                        int var22 = arg0.method2242();
                        int var23 = arg0.method2242();
                        if (var23 == 32767) {
                            var5.method586(var22);
                        } else {
                            int var24 = arg0.method2242();
                            int var25 = arg0.method2379();
                            int var26 = var23 > 0 ? arg0.method2379() : var25;
                            var5.method581(var22, client.field291, var23, var24, var25, var26);
                        }
                    }
                }
            }
            if ((var6 & 0x40) != 0) {
                var5.field628 = arg0.method2232();
                if (var5.field654 == 0) {
                    var5.field651 = var5.field628;
                    var5.field628 = -1;
                }
            }
            if ((var6 & 0x80) != 0) {
                int var27 = arg0.method2232();
                class180 var28 = (class180) class125.method707(class180.method1390(), arg0.method2379());
                boolean var29 = arg0.method2379() == 1;
                int var30 = arg0.method2379();
                int var31 = arg0.field1956;
                if (var5.field266 != null && var5.field237 != null) {
                    boolean var32 = false;
                    if (var28.field2671 && client.method28(var5.field266)) {
                        var32 = true;
                    }
                    if (!var32 && client.field403 == 0 && !var5.field264) {
                        field905.field1956 = 0;
                        arg0.method2240(field905.field1955, 0, var30);
                        field905.field1956 = 0;
                        class130 var33 = field905;
                        String var37;
                        try {
                            int var34 = var33.method2242();
                            if (var34 > 32767) {
                                var34 = 32767;
                            }
                            byte[] var35 = new byte[var34];
                            var33.field1956 += Statics.field3128.method2157(var33.field1955, var33.field1956, var35, 0, var34);
                            String var36 = Statics.method1946(var35, 0, var34);
                            var37 = var36;
                        } catch (Exception var45) {
                            var37 = "Cabbage";
                        }
                        String var40 = class209.method3700(class215.method751(var37));
                        var5.field613 = var40.trim();
                        var5.field617 = var27 >> 8;
                        var5.field618 = var27 & 0xFF;
                        var5.field616 = 150;
                        var5.field614 = var29;
                        var5.field655 = Statics.field233 != var5 && var28.field2671 && client.field461 != "" && var40.toLowerCase().indexOf(client.field461) == -1;
                        int var41;
                        if (var28.field2670) {
                            var41 = var29 ? 91 : 1;
                        } else {
                            var41 = var29 ? 90 : 2;
                        }
                        if (var28.field2662 == -1) {
                            class48.method196(var41, var5.field266, var40);
                        } else {
                            class48.method196(var41, class38.method1387(var28.field2662) + var5.field266, var40);
                        }
                    }
                }
                arg0.field1956 = var30 + var31;
            }
            if ((var6 & 0x200) != 0) {
                var5.field637 = arg0.method2232();
                int var42 = arg0.method2246();
                var5.field623 = var42 >> 16;
                var5.field640 = (var42 & 0xFFFF) + client.field291;
                var5.field638 = 0;
                var5.field632 = 0;
                if (var5.field640 > client.field291) {
                    var5.field638 = -1;
                }
                if (var5.field637 == 65535) {
                    var5.field637 = -1;
                }
            }
            if ((var6 & 0x1000) != 0) {
                var5.field661 = arg0.method2230();
                var5.field644 = arg0.method2230();
                var5.field643 = arg0.method2230();
                var5.field645 = arg0.method2230();
                var5.field639 = arg0.method2232() + client.field291;
                var5.field647 = arg0.method2232() + client.field291;
                var5.field648 = arg0.method2232();
                if (var5.field256) {
                    var5.field661 += var5.field247;
                    var5.field644 += var5.field261;
                    var5.field643 += var5.field247;
                    var5.field645 += var5.field261;
                    var5.field654 = 0;
                } else {
                    var5.field661 += var5.field662[0];
                    var5.field644 += var5.field656[0];
                    var5.field643 += var5.field662[0];
                    var5.field645 += var5.field656[0];
                    var5.field654 = 1;
                }
                var5.field659 = 0;
            }
            if ((var6 & 0x100) != 0) {
                field890[var4] = arg0.method2230();
            }
            if ((var6 & 0x800) != 0) {
                var7 = arg0.method2230();
            }
            if ((var6 & 0x400) != 0) {
                for (int var43 = 0; var43 < 3; var43++) {
                    var5.field244[var43] = arg0.method2314();
                }
            }
            if (var5.field256) {
                if (var7 == 127) {
                    var5.method237(var5.field247, var5.field261);
                } else {
                    byte var44;
                    if (var7 == -1) {
                        var44 = field890[var4];
                    } else {
                        var44 = var7;
                    }
                    var5.method253(var5.field247, var5.field261, var44);
                }
            }
        }
        if (arg0.field1956 - var2 != arg1) {
            throw new RuntimeException(arg0.field1956 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("dz.n(Lee;I)V")
    public static final void method2205(class136 arg0) {
        int var1 = 0;
        arg0.method2482();
        for (int var2 = 0; var2 < field892; var2++) {
            int var3 = field895[var2];
            if ((field889[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field889[var3] = (byte) (field889[var3] | 0x2);
                } else {
                    int var4 = arg0.method2483(1);
                    if (var4 == 0) {
                        var1 = method1562(arg0);
                        field889[var3] = (byte) (field889[var3] | 0x2);
                    } else {
                        method749(arg0, var3);
                    }
                }
            }
        }
        arg0.method2485();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2482();
        for (int var5 = 0; var5 < field892; var5++) {
            int var6 = field895[var5];
            if ((field889[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field889[var6] = (byte) (field889[var6] | 0x2);
                } else {
                    int var7 = arg0.method2483(1);
                    if (var7 == 0) {
                        var1 = method1562(arg0);
                        field889[var6] = (byte) (field889[var6] | 0x2);
                    } else {
                        method749(arg0, var6);
                    }
                }
            }
        }
        arg0.method2485();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2482();
        for (int var8 = 0; var8 < field894; var8++) {
            int var9 = field887[var8];
            if ((field889[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field889[var9] = (byte) (field889[var9] | 0x2);
                } else {
                    int var10 = arg0.method2483(1);
                    if (var10 == 0) {
                        var1 = method1562(arg0);
                        field889[var9] = (byte) (field889[var9] | 0x2);
                    } else if (method2095(arg0, var9)) {
                        field889[var9] = (byte) (field889[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2485();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2482();
        for (int var11 = 0; var11 < field894; var11++) {
            int var12 = field887[var11];
            if ((field889[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field889[var12] = (byte) (field889[var12] | 0x2);
                } else {
                    int var13 = arg0.method2483(1);
                    if (var13 == 0) {
                        var1 = method1562(arg0);
                        field889[var12] = (byte) (field889[var12] | 0x2);
                    } else if (method2095(arg0, var12)) {
                        field889[var12] = (byte) (field889[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2485();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field892 = 0;
        field894 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field889[var14] = (byte) (field889[var14] >> 1);
            class24 var15 = client.field404[var14];
            if (var15 == null) {
                field887[++field894 - 1] = var14;
            } else {
                field895[++field892 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("cj.q(Lee;B)I")
    public static int method1562(class136 arg0) {
        int var1 = arg0.method2483(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2483(5);
        } else if (var1 == 2) {
            var2 = arg0.method2483(8);
        } else {
            var2 = arg0.method2483(11);
        }
        return var2;
    }

    @ObfuscatedName("av.t(Lee;II)V")
    public static void method749(class136 arg0, int arg1) {
        boolean var2 = arg0.method2483(1) == 1;
        if (var2) {
            field900[++field903 - 1] = arg1;
        }
        int var3 = arg0.method2483(2);
        class24 var4 = client.field404[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field256 = false;
            } else if (client.field414 == arg1) {
                throw new RuntimeException();
            } else {
                field896[arg1] = (Statics.field1776 + var4.field656[0] >> 13) + (Statics.field1726 + var4.field662[0] >> 13 << 14) + (var4.field257 << 28);
                if (var4.field628 == -1) {
                    field901[arg1] = var4.field651;
                } else {
                    field901[arg1] = var4.field628;
                }
                field898[arg1] = var4.field626;
                client.field404[arg1] = null;
                if (arg0.method2483(1) != 0) {
                    method2095(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2483(3);
            int var6 = var4.field662[0];
            int var7 = var4.field656[0];
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
            if (client.field414 == arg1 && var4.field629 < 1536 || var4.field601 < 1536 || var4.field629 >= 11776 || var4.field601 >= 11776) {
                var4.method237(var6, var7);
                var4.field256 = false;
            } else if (var2) {
                var4.field256 = true;
                var4.field247 = var6;
                var4.field261 = var7;
            } else {
                var4.field256 = false;
                var4.method253(var6, var7, field890[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2483(4);
            int var9 = var4.field662[0];
            int var10 = var4.field656[0];
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
            if (client.field414 == arg1 && var4.field629 < 1536 || var4.field601 < 1536 || var4.field629 >= 11776 || var4.field601 >= 11776) {
                var4.method237(var9, var10);
                var4.field256 = false;
            } else if (var2) {
                var4.field256 = true;
                var4.field247 = var9;
                var4.field261 = var10;
            } else {
                var4.field256 = false;
                var4.method253(var9, var10, field890[arg1]);
            }
        } else {
            int var11 = arg0.method2483(1);
            if (var11 == 0) {
                int var12 = arg0.method2483(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field662[0] + var14;
                int var17 = var4.field656[0] + var15;
                if (client.field414 == arg1 && var4.field629 < 1536 || var4.field601 < 1536 || var4.field629 >= 11776 || var4.field601 >= 11776) {
                    var4.method237(var16, var17);
                    var4.field256 = false;
                } else if (var2) {
                    var4.field256 = true;
                    var4.field247 = var16;
                    var4.field261 = var17;
                } else {
                    var4.field256 = false;
                    var4.method253(var16, var17, field890[arg1]);
                }
                var4.field257 = (byte) (var4.field257 + var13 & 0x3);
                if (client.field414 == arg1) {
                    Statics.field533 = var4.field257;
                }
            } else {
                int var18 = arg0.method2483(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1726 + var4.field662[0] + var20 & 0x3FFF) - Statics.field1726;
                int var23 = (Statics.field1776 + var4.field656[0] + var21 & 0x3FFF) - Statics.field1776;
                if (client.field414 == arg1 && var4.field629 < 1536 || var4.field601 < 1536 || var4.field629 >= 11776 || var4.field601 >= 11776) {
                    var4.method237(var22, var23);
                    var4.field256 = false;
                } else if (var2) {
                    var4.field256 = true;
                    var4.field247 = var22;
                    var4.field261 = var23;
                } else {
                    var4.field256 = false;
                    var4.method253(var22, var23, field890[arg1]);
                }
                var4.field257 = (byte) (var4.field257 + var19 & 0x3);
                if (client.field414 == arg1) {
                    Statics.field533 = var4.field257;
                }
            }
        }
    }

    @ObfuscatedName("ds.p(Lee;II)Z")
    public static boolean method2095(class136 arg0, int arg1) {
        int var2 = arg0.method2483(2);
        if (var2 == 0) {
            if (arg0.method2483(1) != 0) {
                method2095(arg0, arg1);
            }
            int var3 = arg0.method2483(13);
            int var4 = arg0.method2483(13);
            boolean var5 = arg0.method2483(1) == 1;
            if (var5) {
                field900[++field903 - 1] = arg1;
            }
            if (client.field404[arg1] != null) {
                throw new RuntimeException();
            }
            class24 var6 = client.field404[arg1] = new class24();
            var6.field258 = arg1;
            if (field891[arg1] != null) {
                var6.method228(field891[arg1]);
            }
            var6.field651 = field901[arg1];
            var6.field626 = field898[arg1];
            int var7 = field896[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field619[0] = field890[arg1];
            var6.field257 = (byte) var8;
            var6.method237((var9 << 13) + var3 - Statics.field1726, (var10 << 13) + var4 - Statics.field1776);
            var6.field256 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2483(2);
            int var12 = field896[arg1];
            field896[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2483(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field896[arg1];
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
            field896[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2483(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field896[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field896[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }
}
