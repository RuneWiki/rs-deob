package deob;

@ObfuscatedName("cy")
public class class99 {

    @ObfuscatedName("cy.x")
    public static byte[] field1253 = new byte[2048];

    @ObfuscatedName("cy.w")
    public static byte[] field1254 = new byte[2048];

    @ObfuscatedName("cy.t")
    public static class311[] field1255 = new class311[2048];

    @ObfuscatedName("cy.j")
    public static int field1264 = 0;

    @ObfuscatedName("cy.n")
    public static int[] field1269 = new int[2048];

    @ObfuscatedName("cy.p")
    public static int field1258 = 0;

    @ObfuscatedName("cy.l")
    public static int[] field1259 = new int[2048];

    @ObfuscatedName("cy.z")
    public static int[] field1260 = new int[2048];

    @ObfuscatedName("cy.u")
    public static int[] field1270 = new int[2048];

    @ObfuscatedName("cy.e")
    public static int[] field1262 = new int[2048];

    @ObfuscatedName("cy.m")
    public static int field1263 = 0;

    @ObfuscatedName("cy.c")
    public static int[] field1266 = new int[2048];

    @ObfuscatedName("cy.i")
    public static class311 field1265 = new class311(new byte[5000]);

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kh.h(Lky;I)V")
    public static final void method5054(class310 arg0) {
        arg0.method5067();
        int var1 = client.field766;
        class76 var2 = Statics.field2563 = client.field765[var1] = new class76();
        var2.field629 = var1;
        int var3 = arg0.method5068(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field994[0] = var5 - Statics.field3157;
        var2.field991 = (var2.field994[0] << 7) + (var2.method1190() << 6);
        var2.field969[0] = var6 - Statics.field301;
        var2.field939 = (var2.field969[0] << 7) + (var2.method1190() << 6);
        Statics.field1950 = var2.field628 = var4;
        if (field1255[var1] != null) {
            var2.method1213(field1255[var1]);
        }
        field1264 = 0;
        field1269[++field1264 - 1] = var1;
        field1253[var1] = 0;
        field1258 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method5068(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1260[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1270[var7] = 0;
                field1262[var7] = -1;
                field1259[++field1258 - 1] = var7;
                field1253[var7] = 0;
            }
        }
        arg0.method5090();
    }

    @ObfuscatedName("ff.v(Lky;IB)V")
    public static final void method3213(class310 arg0, int arg1) {
        int var2 = arg0.field3752;
        field1263 = 0;
        method3240(arg0);
        for (int var3 = 0; var3 < field1263; var3++) {
            int var4 = field1266[var3];
            class76 var5 = client.field765[var4];
            int var6 = arg0.method5274();
            if ((var6 & 0x40) != 0) {
                var6 += arg0.method5274() << 8;
            }
            method621(arg0, var4, var5, var6);
        }
        if (arg0.field3752 - var2 != arg1) {
            throw new RuntimeException(arg0.field3752 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("fv.x(Lky;B)V")
    public static final void method3240(class310 arg0) {
        int var1 = 0;
        arg0.method5067();
        for (int var2 = 0; var2 < field1264; var2++) {
            int var3 = field1269[var2];
            if ((field1253[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1253[var3] = (byte) (field1253[var3] | 0x2);
                } else {
                    int var4 = arg0.method5068(1);
                    if (var4 == 0) {
                        var1 = method3793(arg0);
                        field1253[var3] = (byte) (field1253[var3] | 0x2);
                    } else {
                        method6083(arg0, var3);
                    }
                }
            }
        }
        arg0.method5090();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5067();
        for (int var5 = 0; var5 < field1264; var5++) {
            int var6 = field1269[var5];
            if ((field1253[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1253[var6] = (byte) (field1253[var6] | 0x2);
                } else {
                    int var7 = arg0.method5068(1);
                    if (var7 == 0) {
                        var1 = method3793(arg0);
                        field1253[var6] = (byte) (field1253[var6] | 0x2);
                    } else {
                        method6083(arg0, var6);
                    }
                }
            }
        }
        arg0.method5090();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5067();
        for (int var8 = 0; var8 < field1258; var8++) {
            int var9 = field1259[var8];
            if ((field1253[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1253[var9] = (byte) (field1253[var9] | 0x2);
                } else {
                    int var10 = arg0.method5068(1);
                    if (var10 == 0) {
                        var1 = method3793(arg0);
                        field1253[var9] = (byte) (field1253[var9] | 0x2);
                    } else if (method264(arg0, var9)) {
                        field1253[var9] = (byte) (field1253[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method5090();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5067();
        for (int var11 = 0; var11 < field1258; var11++) {
            int var12 = field1259[var11];
            if ((field1253[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1253[var12] = (byte) (field1253[var12] | 0x2);
                } else {
                    int var13 = arg0.method5068(1);
                    if (var13 == 0) {
                        var1 = method3793(arg0);
                        field1253[var12] = (byte) (field1253[var12] | 0x2);
                    } else if (method264(arg0, var12)) {
                        field1253[var12] = (byte) (field1253[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method5090();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1264 = 0;
        field1258 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1253[var14] = (byte) (field1253[var14] >> 1);
            class76 var15 = client.field765[var14];
            if (var15 == null) {
                field1259[++field1258 - 1] = var14;
            } else {
                field1269[++field1264 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("hp.w(Lky;I)I")
    public static int method3793(class310 arg0) {
        int var1 = arg0.method5068(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method5068(5);
        } else if (var1 == 2) {
            var2 = arg0.method5068(8);
        } else {
            var2 = arg0.method5068(11);
        }
        return var2;
    }

    @ObfuscatedName("mw.t(Lky;II)V")
    public static void method6083(class310 arg0, int arg1) {
        boolean var2 = arg0.method5068(1) == 1;
        if (var2) {
            field1266[++field1263 - 1] = arg1;
        }
        int var3 = arg0.method5068(2);
        class76 var4 = client.field765[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field632 = false;
            } else if (client.field766 == arg1) {
                throw new RuntimeException();
            } else {
                field1260[arg1] = (Statics.field301 + var4.field969[0] >> 13) + (Statics.field3157 + var4.field994[0] >> 13 << 14) + (var4.field628 << 28);
                if (var4.field960 == -1) {
                    field1270[arg1] = var4.field990;
                } else {
                    field1270[arg1] = var4.field960;
                }
                field1262[arg1] = var4.field981;
                client.field765[arg1] = null;
                if (arg0.method5068(1) != 0) {
                    method264(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method5068(3);
            int var6 = var4.field994[0];
            int var7 = var4.field969[0];
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
            if (client.field766 == arg1 && var4.field991 < 1536 || var4.field939 < 1536 || var4.field991 >= 11776 || var4.field939 >= 11776) {
                var4.method1193(var6, var7);
                var4.field632 = false;
            } else if (var2) {
                var4.field632 = true;
                var4.field633 = var6;
                var4.field634 = var7;
            } else {
                var4.field632 = false;
                var4.method1192(var6, var7, field1254[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method5068(4);
            int var9 = var4.field994[0];
            int var10 = var4.field969[0];
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
            if (client.field766 == arg1 && var4.field991 < 1536 || var4.field939 < 1536 || var4.field991 >= 11776 || var4.field939 >= 11776) {
                var4.method1193(var9, var10);
                var4.field632 = false;
            } else if (var2) {
                var4.field632 = true;
                var4.field633 = var9;
                var4.field634 = var10;
            } else {
                var4.field632 = false;
                var4.method1192(var9, var10, field1254[arg1]);
            }
        } else {
            int var11 = arg0.method5068(1);
            if (var11 == 0) {
                int var12 = arg0.method5068(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field994[0] + var14;
                int var17 = var4.field969[0] + var15;
                if (client.field766 == arg1 && var4.field991 < 1536 || var4.field939 < 1536 || var4.field991 >= 11776 || var4.field939 >= 11776) {
                    var4.method1193(var16, var17);
                    var4.field632 = false;
                } else if (var2) {
                    var4.field632 = true;
                    var4.field633 = var16;
                    var4.field634 = var17;
                } else {
                    var4.field632 = false;
                    var4.method1192(var16, var17, field1254[arg1]);
                }
                var4.field628 = (byte) (var4.field628 + var13 & 0x3);
                if (client.field766 == arg1) {
                    Statics.field1950 = var4.field628;
                }
            } else {
                int var18 = arg0.method5068(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field3157 + var4.field994[0] + var20 & 0x3FFF) - Statics.field3157;
                int var23 = (Statics.field301 + var4.field969[0] + var21 & 0x3FFF) - Statics.field301;
                if (client.field766 == arg1 && var4.field991 < 1536 || var4.field939 < 1536 || var4.field991 >= 11776 || var4.field939 >= 11776) {
                    var4.method1193(var22, var23);
                    var4.field632 = false;
                } else if (var2) {
                    var4.field632 = true;
                    var4.field633 = var22;
                    var4.field634 = var23;
                } else {
                    var4.field632 = false;
                    var4.method1192(var22, var23, field1254[arg1]);
                }
                var4.field628 = (byte) (var4.field628 + var19 & 0x3);
                if (client.field766 == arg1) {
                    Statics.field1950 = var4.field628;
                }
            }
        }
    }

    @ObfuscatedName("ax.j(Lky;II)Z")
    public static boolean method264(class310 arg0, int arg1) {
        int var2 = arg0.method5068(2);
        if (var2 == 0) {
            if (arg0.method5068(1) != 0) {
                method264(arg0, arg1);
            }
            int var3 = arg0.method5068(13);
            int var4 = arg0.method5068(13);
            boolean var5 = arg0.method5068(1) == 1;
            if (var5) {
                field1266[++field1263 - 1] = arg1;
            }
            if (client.field765[arg1] != null) {
                throw new RuntimeException();
            }
            class76 var6 = client.field765[arg1] = new class76();
            var6.field629 = arg1;
            if (field1255[arg1] != null) {
                var6.method1213(field1255[arg1]);
            }
            var6.field990 = field1270[arg1];
            var6.field981 = field1262[arg1];
            int var7 = field1260[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field996[0] = field1254[arg1];
            var6.field628 = (byte) var8;
            var6.method1193((var9 << 13) + var3 - Statics.field3157, (var10 << 13) + var4 - Statics.field301);
            var6.field632 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method5068(2);
            int var12 = field1260[arg1];
            field1260[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method5068(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1260[arg1];
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
            field1260[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method5068(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1260[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1260[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ai.n(Lky;ILbq;II)V")
    public static final void method621(class310 arg0, int arg1, class76 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x100) != 0) {
            arg2.field982 = arg0.method5238();
            arg2.field983 = arg0.method5238();
            arg2.field959 = arg0.method5238();
            arg2.field957 = arg0.method5234();
            arg2.field985 = arg0.method5155() + client.field656;
            arg2.field974 = arg0.method5112() + client.field656;
            arg2.field987 = arg0.method5342();
            if (arg2.field632) {
                arg2.field982 += arg2.field633;
                arg2.field983 += arg2.field634;
                arg2.field959 += arg2.field633;
                arg2.field957 += arg2.field634;
                arg2.field986 = 0;
            } else {
                arg2.field982 += arg2.field994[0];
                arg2.field983 += arg2.field969[0];
                arg2.field959 += arg2.field994[0];
                arg2.field957 += arg2.field969[0];
                arg2.field986 = 1;
            }
            arg2.field997 = 0;
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field952 = arg0.method5202();
            if (arg2.field952.charAt(0) == '~') {
                arg2.field952 = arg2.field952.substring(1);
                Statics.method3809(2, arg2.field620.method4821(), arg2.field952);
            } else if (Statics.field2563 == arg2) {
                Statics.method3809(2, arg2.field620.method4821(), arg2.field952);
            }
            arg2.field953 = false;
            arg2.field956 = 0;
            arg2.field995 = 0;
            arg2.field992 = 150;
        }
        if ((arg3 & 0x80) != 0) {
            int var5 = arg0.method5155();
            class240 var6 = (class240) class205.method3134(class240.method3808(), arg0.method5144());
            boolean var7 = arg0.method5274() == 1;
            int var8 = arg0.method5145();
            int var9 = arg0.field3752;
            if (arg2.field620 != null && arg2.field622 != null) {
                boolean var10 = false;
                if (var6.field3124 && Statics.field2037.method1816(arg2.field620)) {
                    var10 = true;
                }
                if (!var10 && client.field763 == 0 && !arg2.field626) {
                    field1265.field3752 = 0;
                    arg0.method5166(field1265.field3753, 0, var8);
                    field1265.field3752 = 0;
                    String var11 = class307.method4999(class302.method3365(class220.method1976(field1265)));
                    arg2.field952 = var11.trim();
                    arg2.field956 = var5 >> 8;
                    arg2.field995 = var5 & 0xFF;
                    arg2.field992 = 150;
                    arg2.field953 = var7;
                    arg2.field954 = Statics.field2563 != arg2 && var6.field3124 && client.field872 != "" && var11.toLowerCase().indexOf(client.field872) == -1;
                    int var12;
                    if (var6.field3121) {
                        var12 = var7 ? 91 : 1;
                    } else {
                        var12 = var7 ? 90 : 2;
                    }
                    if (var6.field3127 == -1) {
                        Statics.method3809(var12, arg2.field620.method4821(), var11);
                    } else {
                        Statics.method3809(var12, class91.method226(var6.field3127) + arg2.field620.method4821(), var11);
                    }
                }
            }
            arg0.field3752 = var8 + var9;
        }
        if ((arg3 & 0x400) != 0) {
            for (int var13 = 0; var13 < 3; var13++) {
                arg2.field611[var13] = arg0.method5202();
            }
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field960 = arg0.method5155();
            if (arg2.field986 == 0) {
                arg2.field990 = arg2.field960;
                arg2.field960 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            int var14 = arg0.method5144();
            if (var14 > 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    int var16 = -1;
                    int var17 = -1;
                    int var18 = -1;
                    int var19 = arg0.method5096();
                    if (var19 == 32767) {
                        var19 = arg0.method5096();
                        var17 = arg0.method5096();
                        var16 = arg0.method5096();
                        var18 = arg0.method5096();
                    } else if (var19 == 32766) {
                        var19 = -1;
                    } else {
                        var17 = arg0.method5096();
                    }
                    int var20 = arg0.method5096();
                    arg2.method1659(var19, var17, var16, var18, client.field656, var20);
                }
            }
            int var21 = arg0.method5145();
            if (var21 > 0) {
                for (int var22 = 0; var22 < var21; var22++) {
                    int var23 = arg0.method5096();
                    int var24 = arg0.method5096();
                    if (var24 == 32767) {
                        arg2.method1660(var23);
                    } else {
                        int var25 = arg0.method5096();
                        int var26 = arg0.method5145();
                        int var27 = var24 > 0 ? arg0.method5146() : var26;
                        arg2.method1667(var23, client.field656, var24, var25, var26, var27);
                    }
                }
            }
        }
        if ((arg3 & 0x200) != 0) {
            field1254[arg1] = arg0.method5234();
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field981 = arg0.method5112();
            if (arg2.field981 == 65535) {
                arg2.field981 = -1;
            }
        }
        if ((arg3 & 0x1000) != 0) {
            arg2.field976 = arg0.method5112();
            int var28 = arg0.method5216();
            arg2.field980 = var28 >> 16;
            arg2.field979 = (var28 & 0xFFFF) + client.field656;
            arg2.field977 = 0;
            arg2.field978 = 0;
            if (arg2.field979 > client.field656) {
                arg2.field977 = -1;
            }
            if (arg2.field976 == 65535) {
                arg2.field976 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            var4 = arg0.method5238();
        }
        if ((arg3 & 0x2) != 0) {
            int var29 = arg0.method5112();
            if (var29 == 65535) {
                var29 = -1;
            }
            int var30 = arg0.method5144();
            client.method1089(arg2, var29, var30);
        }
        if ((arg3 & 0x4) != 0) {
            int var31 = arg0.method5146();
            byte[] var32 = new byte[var31];
            class311 var33 = new class311(var32);
            arg0.method5306(var32, 0, var31);
            field1255[arg1] = var33;
            arg2.method1213(var33);
        }
        if (!arg2.field632) {
            return;
        }
        if (var4 == 127) {
            arg2.method1193(arg2.field633, arg2.field634);
            return;
        }
        byte var34;
        if (var4 == -1) {
            var34 = field1254[arg1];
        } else {
            var34 = var4;
        }
        arg2.method1192(arg2.field633, arg2.field634, var34);
    }
}
