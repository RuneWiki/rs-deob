package deob;

@ObfuscatedName("cr")
public class class90 {

    @ObfuscatedName("cr.v")
    public static byte[] field1245 = new byte[2048];

    @ObfuscatedName("cr.u")
    public static byte[] field1236 = new byte[2048];

    @ObfuscatedName("cr.r")
    public static class300[] field1237 = new class300[2048];

    @ObfuscatedName("cr.p")
    public static int field1235 = 0;

    @ObfuscatedName("cr.q")
    public static int[] field1239 = new int[2048];

    @ObfuscatedName("cr.m")
    public static int field1238 = 0;

    @ObfuscatedName("cr.y")
    public static int[] field1241 = new int[2048];

    @ObfuscatedName("cr.i")
    public static int[] field1242 = new int[2048];

    @ObfuscatedName("cr.c")
    public static int[] field1243 = new int[2048];

    @ObfuscatedName("cr.b")
    public static int[] field1244 = new int[2048];

    @ObfuscatedName("cr.o")
    public static int field1233 = 0;

    @ObfuscatedName("cr.a")
    public static int[] field1246 = new int[2048];

    @ObfuscatedName("cr.e")
    public static class300 field1247 = new class300(new byte[5000]);

    public class90() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cn.z(Lkf;I)V")
    public static final void method1882(class299 arg0) {
        arg0.method4959();
        int var1 = client.field797;
        class67 var2 = Statics.field2737 = client.field753[var1] = new class67();
        var2.field619 = var1;
        int var3 = arg0.method4947(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field985[0] = var5 - Statics.field2734;
        var2.field986 = (var2.field985[0] << 7) + (var2.method1096() << 6);
        var2.field960[0] = var6 - Statics.field3631;
        var2.field930 = (var2.field960[0] << 7) + (var2.method1096() << 6);
        Statics.field174 = var2.field624 = var4;
        if (field1237[var1] != null) {
            var2.method1095(field1237[var1]);
        }
        field1235 = 0;
        field1239[++field1235 - 1] = var1;
        field1245[var1] = 0;
        field1238 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method4947(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1242[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1243[var7] = 0;
                field1244[var7] = -1;
                field1241[++field1238 - 1] = var7;
                field1245[var7] = 0;
            }
        }
        arg0.method4945();
    }

    @ObfuscatedName("al.n(Lkf;IB)V")
    public static final void method578(class299 arg0, int arg1) {
        int var2 = arg0.field3702;
        field1233 = 0;
        int var3 = 0;
        arg0.method4959();
        for (int var4 = 0; var4 < field1235; var4++) {
            int var5 = field1239[var4];
            if ((field1245[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1245[var5] = (byte) (field1245[var5] | 0x2);
                } else {
                    int var6 = arg0.method4947(1);
                    if (var6 == 0) {
                        int var7 = arg0.method4947(2);
                        int var8;
                        if (var7 == 0) {
                            var8 = 0;
                        } else if (var7 == 1) {
                            var8 = arg0.method4947(5);
                        } else if (var7 == 2) {
                            var8 = arg0.method4947(8);
                        } else {
                            var8 = arg0.method4947(11);
                        }
                        var3 = var8;
                        field1245[var5] = (byte) (field1245[var5] | 0x2);
                    } else {
                        method2989(arg0, var5);
                    }
                }
            }
        }
        arg0.method4945();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method4959();
        for (int var10 = 0; var10 < field1235; var10++) {
            int var11 = field1239[var10];
            if ((field1245[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1245[var11] = (byte) (field1245[var11] | 0x2);
                } else {
                    int var12 = arg0.method4947(1);
                    if (var12 == 0) {
                        int var13 = arg0.method4947(2);
                        int var14;
                        if (var13 == 0) {
                            var14 = 0;
                        } else if (var13 == 1) {
                            var14 = arg0.method4947(5);
                        } else if (var13 == 2) {
                            var14 = arg0.method4947(8);
                        } else {
                            var14 = arg0.method4947(11);
                        }
                        var3 = var14;
                        field1245[var11] = (byte) (field1245[var11] | 0x2);
                    } else {
                        method2989(arg0, var11);
                    }
                }
            }
        }
        arg0.method4945();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method4959();
        for (int var16 = 0; var16 < field1238; var16++) {
            int var17 = field1241[var16];
            if ((field1245[var17] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1245[var17] = (byte) (field1245[var17] | 0x2);
                } else {
                    int var18 = arg0.method4947(1);
                    if (var18 == 0) {
                        int var19 = arg0.method4947(2);
                        int var20;
                        if (var19 == 0) {
                            var20 = 0;
                        } else if (var19 == 1) {
                            var20 = arg0.method4947(5);
                        } else if (var19 == 2) {
                            var20 = arg0.method4947(8);
                        } else {
                            var20 = arg0.method4947(11);
                        }
                        var3 = var20;
                        field1245[var17] = (byte) (field1245[var17] | 0x2);
                    } else if (method4821(arg0, var17)) {
                        field1245[var17] = (byte) (field1245[var17] | 0x2);
                    }
                }
            }
        }
        arg0.method4945();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method4959();
        for (int var22 = 0; var22 < field1238; var22++) {
            int var23 = field1241[var22];
            if ((field1245[var23] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1245[var23] = (byte) (field1245[var23] | 0x2);
                } else {
                    int var24 = arg0.method4947(1);
                    if (var24 == 0) {
                        int var25 = arg0.method4947(2);
                        int var26;
                        if (var25 == 0) {
                            var26 = 0;
                        } else if (var25 == 1) {
                            var26 = arg0.method4947(5);
                        } else if (var25 == 2) {
                            var26 = arg0.method4947(8);
                        } else {
                            var26 = arg0.method4947(11);
                        }
                        var3 = var26;
                        field1245[var23] = (byte) (field1245[var23] | 0x2);
                    } else if (method4821(arg0, var23)) {
                        field1245[var23] = (byte) (field1245[var23] | 0x2);
                    }
                }
            }
        }
        arg0.method4945();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1235 = 0;
        field1238 = 0;
        for (int var28 = 1; var28 < 2048; var28++) {
            field1245[var28] = (byte) (field1245[var28] >> 1);
            class67 var29 = client.field753[var28];
            if (var29 == null) {
                field1241[++field1238 - 1] = var28;
            } else {
                field1239[++field1235 - 1] = var28;
            }
        }
        for (int var30 = 0; var30 < field1233; var30++) {
            int var31 = field1246[var30];
            class67 var32 = client.field753[var31];
            int var33 = arg0.method4990();
            if ((var33 & 0x1) != 0) {
                var33 += arg0.method4990() << 8;
            }
            byte var34 = -1;
            if ((var33 & 0x100) != 0) {
                for (int var35 = 0; var35 < 3; var35++) {
                    var32.field601[var35] = arg0.method4999();
                }
            }
            if ((var33 & 0x800) != 0) {
                var32.field967 = arg0.method4992();
                int var36 = arg0.method5085();
                var32.field971 = var36 >> 16;
                var32.field970 = (var36 & 0xFFFF) + client.field645;
                var32.field968 = 0;
                var32.field969 = 0;
                if (var32.field970 > client.field645) {
                    var32.field968 = -1;
                }
                if (var32.field967 == 65535) {
                    var32.field967 = -1;
                }
            }
            if ((var33 & 0x2) != 0) {
                var32.field929 = arg0.method4999();
                if (var32.field929.charAt(0) == '~') {
                    var32.field929 = var32.field929.substring(1);
                    class92.method3567(2, var32.field599.method4712(), var32.field929);
                } else if (Statics.field2737 == var32) {
                    class92.method3567(2, var32.field599.method4712(), var32.field929);
                }
                var32.field944 = false;
                var32.field947 = 0;
                var32.field948 = 0;
                var32.field988 = 150;
            }
            if ((var33 & 0x8) != 0) {
                int var37 = arg0.method5019();
                byte[] var38 = new byte[var37];
                class300 var39 = new class300(var38);
                arg0.method5042(var38, 0, var37);
                field1237[var31] = var39;
                var32.method1095(var39);
            }
            if ((var33 & 0x80) != 0) {
                int var40 = arg0.method4992();
                class229 var41 = (class229) class196.method3185(class229.method3712(), arg0.method4990());
                boolean var42 = arg0.method5019() == 1;
                int var43 = arg0.method5019();
                int var44 = arg0.field3702;
                if (var32.field599 != null && var32.field597 != null) {
                    boolean var45 = false;
                    if (var41.field3066 && Statics.field500.method1684(var32.field599)) {
                        var45 = true;
                    }
                    if (!var45 && client.field635 == 0 && !var32.field615) {
                        field1247.field3702 = 0;
                        arg0.method5041(field1247.field3699, 0, var43);
                        field1247.field3702 = 0;
                        String var46 = class296.method4851(class291.method3152(class211.method1094(field1247)));
                        var32.field929 = var46.trim();
                        var32.field947 = var40 >> 8;
                        var32.field948 = var40 & 0xFF;
                        var32.field988 = 150;
                        var32.field944 = var42;
                        var32.field945 = Statics.field2737 != var32 && var41.field3066 && client.field908 != "" && var46.toLowerCase().indexOf(client.field908) == -1;
                        int var47;
                        if (var41.field3071) {
                            var47 = var42 ? 91 : 1;
                        } else {
                            var47 = var42 ? 90 : 2;
                        }
                        if (var41.field3068 == -1) {
                            class92.method3567(var47, var32.field599.method4712(), var46);
                        } else {
                            class92.method3567(var47, class82.method4051(var41.field3068) + var32.field599.method4712(), var46);
                        }
                    }
                }
                arg0.field3702 = var43 + var44;
            }
            if ((var33 & 0x1000) != 0) {
                field1236[var31] = arg0.method5002();
            }
            if ((var33 & 0x10) != 0) {
                int var48 = arg0.method5195();
                if (var48 == 65535) {
                    var48 = -1;
                }
                int var49 = arg0.method4990();
                client.method3262(var32, var48, var49);
            }
            if ((var33 & 0x200) != 0) {
                var34 = arg0.method5002();
            }
            if ((var33 & 0x400) != 0) {
                var32.field972 = arg0.method5021();
                var32.field974 = arg0.method5023();
                var32.field973 = arg0.method5021();
                var32.field975 = arg0.method5021();
                var32.field949 = arg0.method4992() + client.field645;
                var32.field977 = arg0.method5195() + client.field645;
                var32.field978 = arg0.method5028();
                if (var32.field622) {
                    var32.field972 += var32.field603;
                    var32.field974 += var32.field618;
                    var32.field973 += var32.field603;
                    var32.field975 += var32.field618;
                    var32.field984 = 0;
                } else {
                    var32.field972 += var32.field985[0];
                    var32.field974 += var32.field960[0];
                    var32.field973 += var32.field985[0];
                    var32.field975 += var32.field960[0];
                    var32.field984 = 1;
                }
                var32.field989 = 0;
            }
            if ((var33 & 0x4) != 0) {
                int var50 = arg0.method5018();
                if (var50 > 0) {
                    for (int var51 = 0; var51 < var50; var51++) {
                        int var52 = -1;
                        int var53 = -1;
                        int var54 = -1;
                        int var55 = arg0.method5004();
                        if (var55 == 32767) {
                            var55 = arg0.method5004();
                            var53 = arg0.method5004();
                            var52 = arg0.method5004();
                            var54 = arg0.method5004();
                        } else if (var55 == 32766) {
                            var55 = -1;
                        } else {
                            var53 = arg0.method5004();
                        }
                        int var56 = arg0.method5004();
                        var32.method1573(var55, var53, var52, var54, client.field645, var56);
                    }
                }
                int var57 = arg0.method5059();
                if (var57 > 0) {
                    for (int var58 = 0; var58 < var57; var58++) {
                        int var59 = arg0.method5004();
                        int var60 = arg0.method5004();
                        if (var60 == 32767) {
                            var32.method1572(var59);
                        } else {
                            int var61 = arg0.method5004();
                            int var62 = arg0.method5018();
                            int var63 = var60 > 0 ? arg0.method5018() : var62;
                            var32.method1571(var59, client.field645, var60, var61, var62, var63);
                        }
                    }
                }
            }
            if ((var33 & 0x40) != 0) {
                var32.field956 = arg0.method5195();
                if (var32.field956 == 65535) {
                    var32.field956 = -1;
                }
            }
            if ((var33 & 0x20) != 0) {
                var32.field958 = arg0.method4992();
                if (var32.field984 == 0) {
                    var32.field981 = var32.field958;
                    var32.field958 = -1;
                }
            }
            if (var32.field622) {
                if (var34 == 127) {
                    var32.method1106(var32.field603, var32.field618);
                } else {
                    byte var64;
                    if (var34 == -1) {
                        var64 = field1236[var31];
                    } else {
                        var64 = var34;
                    }
                    var32.method1118(var32.field603, var32.field618, var64);
                }
            }
        }
        if (arg0.field3702 - var2 != arg1) {
            throw new RuntimeException(arg0.field3702 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("eh.v(Lkf;II)V")
    public static void method2989(class299 arg0, int arg1) {
        boolean var2 = arg0.method4947(1) == 1;
        if (var2) {
            field1246[++field1233 - 1] = arg1;
        }
        int var3 = arg0.method4947(2);
        class67 var4 = client.field753[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field622 = false;
            } else if (client.field797 == arg1) {
                throw new RuntimeException();
            } else {
                field1242[arg1] = (Statics.field3631 + var4.field960[0] >> 13) + (Statics.field2734 + var4.field985[0] >> 13 << 14) + (var4.field624 << 28);
                if (var4.field958 == -1) {
                    field1243[arg1] = var4.field981;
                } else {
                    field1243[arg1] = var4.field958;
                }
                field1244[arg1] = var4.field956;
                client.field753[arg1] = null;
                if (arg0.method4947(1) != 0) {
                    method4821(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method4947(3);
            int var6 = var4.field985[0];
            int var7 = var4.field960[0];
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
            if (client.field797 == arg1 && var4.field986 < 1536 || var4.field930 < 1536 || var4.field986 >= 11776 || var4.field930 >= 11776) {
                var4.method1106(var6, var7);
                var4.field622 = false;
            } else if (var2) {
                var4.field622 = true;
                var4.field603 = var6;
                var4.field618 = var7;
            } else {
                var4.field622 = false;
                var4.method1118(var6, var7, field1236[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method4947(4);
            int var9 = var4.field985[0];
            int var10 = var4.field960[0];
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
            if (client.field797 == arg1 && var4.field986 < 1536 || var4.field930 < 1536 || var4.field986 >= 11776 || var4.field930 >= 11776) {
                var4.method1106(var9, var10);
                var4.field622 = false;
            } else if (var2) {
                var4.field622 = true;
                var4.field603 = var9;
                var4.field618 = var10;
            } else {
                var4.field622 = false;
                var4.method1118(var9, var10, field1236[arg1]);
            }
        } else {
            int var11 = arg0.method4947(1);
            if (var11 == 0) {
                int var12 = arg0.method4947(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field985[0] + var14;
                int var17 = var4.field960[0] + var15;
                if (client.field797 == arg1 && var4.field986 < 1536 || var4.field930 < 1536 || var4.field986 >= 11776 || var4.field930 >= 11776) {
                    var4.method1106(var16, var17);
                    var4.field622 = false;
                } else if (var2) {
                    var4.field622 = true;
                    var4.field603 = var16;
                    var4.field618 = var17;
                } else {
                    var4.field622 = false;
                    var4.method1118(var16, var17, field1236[arg1]);
                }
                var4.field624 = (byte) (var4.field624 + var13 & 0x3);
                if (client.field797 == arg1) {
                    Statics.field174 = var4.field624;
                }
            } else {
                int var18 = arg0.method4947(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2734 + var4.field985[0] + var20 & 0x3FFF) - Statics.field2734;
                int var23 = (Statics.field3631 + var4.field960[0] + var21 & 0x3FFF) - Statics.field3631;
                if (client.field797 == arg1 && var4.field986 < 1536 || var4.field930 < 1536 || var4.field986 >= 11776 || var4.field930 >= 11776) {
                    var4.method1106(var22, var23);
                    var4.field622 = false;
                } else if (var2) {
                    var4.field622 = true;
                    var4.field603 = var22;
                    var4.field618 = var23;
                } else {
                    var4.field622 = false;
                    var4.method1118(var22, var23, field1236[arg1]);
                }
                var4.field624 = (byte) (var4.field624 + var19 & 0x3);
                if (client.field797 == arg1) {
                    Statics.field174 = var4.field624;
                }
            }
        }
    }

    @ObfuscatedName("ki.u(Lkf;IB)Z")
    public static boolean method4821(class299 arg0, int arg1) {
        int var2 = arg0.method4947(2);
        if (var2 == 0) {
            if (arg0.method4947(1) != 0) {
                method4821(arg0, arg1);
            }
            int var3 = arg0.method4947(13);
            int var4 = arg0.method4947(13);
            boolean var5 = arg0.method4947(1) == 1;
            if (var5) {
                field1246[++field1233 - 1] = arg1;
            }
            if (client.field753[arg1] != null) {
                throw new RuntimeException();
            }
            class67 var6 = client.field753[arg1] = new class67();
            var6.field619 = arg1;
            if (field1237[arg1] != null) {
                var6.method1095(field1237[arg1]);
            }
            var6.field981 = field1243[arg1];
            var6.field956 = field1244[arg1];
            int var7 = field1242[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field987[0] = field1236[arg1];
            var6.field624 = (byte) var8;
            var6.method1106((var9 << 13) + var3 - Statics.field2734, (var10 << 13) + var4 - Statics.field3631);
            var6.field622 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method4947(2);
            int var12 = field1242[arg1];
            field1242[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method4947(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1242[arg1];
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
            field1242[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method4947(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1242[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1242[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("bl.r(B)V")
    public static void method1676() {
        field1235 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1237[var0] = null;
            field1236[var0] = 1;
        }
    }
}
