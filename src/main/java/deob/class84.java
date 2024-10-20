package deob;

@ObfuscatedName("cy")
public class class84 {

    @ObfuscatedName("cy.w")
    public static byte[] field1213 = new byte[2048];

    @ObfuscatedName("cy.s")
    public static byte[] field1219 = new byte[2048];

    @ObfuscatedName("cy.e")
    public static class185[] field1230 = new class185[2048];

    @ObfuscatedName("cy.a")
    public static int field1216 = 0;

    @ObfuscatedName("cy.c")
    public static int[] field1217 = new int[2048];

    @ObfuscatedName("cy.p")
    public static int field1218 = 0;

    @ObfuscatedName("cy.r")
    public static int[] field1229 = new int[2048];

    @ObfuscatedName("cy.m")
    public static int[] field1215 = new int[2048];

    @ObfuscatedName("cy.d")
    public static int[] field1221 = new int[2048];

    @ObfuscatedName("cy.z")
    public static int[] field1222 = new int[2048];

    @ObfuscatedName("cy.x")
    public static int field1223 = 0;

    @ObfuscatedName("cy.v")
    public static int[] field1220 = new int[2048];

    @ObfuscatedName("cy.g")
    public static class185 field1225 = new class185(new byte[5000]);

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.f(Lgl;I)V")
    public static final void method478(class192 arg0) {
        arg0.method3598();
        int var1 = client.field663;
        class62 var2 = Statics.field138 = client.field746[var1] = new class62();
        var2.field618 = var1;
        int var3 = arg0.method3599(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field954[0] = var5 - Statics.field321;
        var2.field943 = (var2.field954[0] << 7) + (var2.method1041() << 6);
        var2.field981[0] = var6 - Statics.field2611;
        var2.field925 = (var2.field981[0] << 7) + (var2.method1041() << 6);
        Statics.field1983 = var2.field600 = var4;
        if (field1230[var1] != null) {
            var2.method1034(field1230[var1]);
        }
        field1216 = 0;
        field1217[++field1216 - 1] = var1;
        field1213[var1] = 0;
        field1218 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3599(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1215[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1221[var7] = 0;
                field1222[var7] = -1;
                field1229[++field1218 - 1] = var7;
                field1213[var7] = 0;
            }
        }
        arg0.method3597();
    }

    @ObfuscatedName("ib.l(Lgl;IB)V")
    public static final void method4277(class192 arg0, int arg1) {
        int var2 = arg0.field2414;
        field1223 = 0;
        int var3 = 0;
        arg0.method3598();
        for (int var4 = 0; var4 < field1216; var4++) {
            int var5 = field1217[var4];
            if ((field1213[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1213[var5] = (byte) (field1213[var5] | 0x2);
                } else {
                    int var6 = arg0.method3599(1);
                    if (var6 == 0) {
                        var3 = method660(arg0);
                        field1213[var5] = (byte) (field1213[var5] | 0x2);
                    } else {
                        method2944(arg0, var5);
                    }
                }
            }
        }
        arg0.method3597();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3598();
        for (int var7 = 0; var7 < field1216; var7++) {
            int var8 = field1217[var7];
            if ((field1213[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1213[var8] = (byte) (field1213[var8] | 0x2);
                } else {
                    int var9 = arg0.method3599(1);
                    if (var9 == 0) {
                        var3 = method660(arg0);
                        field1213[var8] = (byte) (field1213[var8] | 0x2);
                    } else {
                        method2944(arg0, var8);
                    }
                }
            }
        }
        arg0.method3597();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3598();
        for (int var10 = 0; var10 < field1218; var10++) {
            int var11 = field1229[var10];
            if ((field1213[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1213[var11] = (byte) (field1213[var11] | 0x2);
                } else {
                    int var12 = arg0.method3599(1);
                    if (var12 == 0) {
                        var3 = method660(arg0);
                        field1213[var11] = (byte) (field1213[var11] | 0x2);
                    } else if (method60(arg0, var11)) {
                        field1213[var11] = (byte) (field1213[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method3597();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3598();
        for (int var13 = 0; var13 < field1218; var13++) {
            int var14 = field1229[var13];
            if ((field1213[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1213[var14] = (byte) (field1213[var14] | 0x2);
                } else {
                    int var15 = arg0.method3599(1);
                    if (var15 == 0) {
                        var3 = method660(arg0);
                        field1213[var14] = (byte) (field1213[var14] | 0x2);
                    } else if (method60(arg0, var14)) {
                        field1213[var14] = (byte) (field1213[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method3597();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1216 = 0;
        field1218 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1213[var16] = (byte) (field1213[var16] >> 1);
            class62 var17 = client.field746[var16];
            if (var17 == null) {
                field1229[++field1218 - 1] = var16;
            } else {
                field1217[++field1216 - 1] = var16;
            }
        }
        for (int var18 = 0; var18 < field1223; var18++) {
            int var19 = field1220[var18];
            class62 var20 = client.field746[var19];
            int var21 = arg0.method3344();
            if ((var21 & 0x8) != 0) {
                var21 += arg0.method3344() << 8;
            }
            method3241(arg0, var19, var20, var21);
        }
        if (arg0.field2414 - var2 != arg1) {
            throw new RuntimeException(arg0.field2414 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ae.w(Lgl;I)I")
    public static int method660(class192 arg0) {
        int var1 = arg0.method3599(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3599(5);
        } else if (var1 == 2) {
            var2 = arg0.method3599(8);
        } else {
            var2 = arg0.method3599(11);
        }
        return var2;
    }

    @ObfuscatedName("ea.s(Lgl;IB)V")
    public static void method2944(class192 arg0, int arg1) {
        boolean var2 = arg0.method3599(1) == 1;
        if (var2) {
            field1220[++field1223 - 1] = arg1;
        }
        int var3 = arg0.method3599(2);
        class62 var4 = client.field746[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field621 = false;
            } else if (client.field663 == arg1) {
                throw new RuntimeException();
            } else {
                field1215[arg1] = (Statics.field2611 + var4.field981[0] >> 13) + (Statics.field321 + var4.field954[0] >> 13 << 14) + (var4.field600 << 28);
                if (var4.field967 == -1) {
                    field1221[arg1] = var4.field976;
                } else {
                    field1221[arg1] = var4.field967;
                }
                field1222[arg1] = var4.field951;
                client.field746[arg1] = null;
                if (arg0.method3599(1) != 0) {
                    method60(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3599(3);
            int var6 = var4.field954[0];
            int var7 = var4.field981[0];
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
            if (client.field663 == arg1 && var4.field943 < 1536 || var4.field925 < 1536 || var4.field943 >= 11776 || var4.field925 >= 11776) {
                var4.method1047(var6, var7);
                var4.field621 = false;
            } else if (var2) {
                var4.field621 = true;
                var4.field622 = var6;
                var4.field601 = var7;
            } else {
                var4.field621 = false;
                var4.method1033(var6, var7, field1219[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3599(4);
            int var9 = var4.field954[0];
            int var10 = var4.field981[0];
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
            if (client.field663 == arg1 && var4.field943 < 1536 || var4.field925 < 1536 || var4.field943 >= 11776 || var4.field925 >= 11776) {
                var4.method1047(var9, var10);
                var4.field621 = false;
            } else if (var2) {
                var4.field621 = true;
                var4.field622 = var9;
                var4.field601 = var10;
            } else {
                var4.field621 = false;
                var4.method1033(var9, var10, field1219[arg1]);
            }
        } else {
            int var11 = arg0.method3599(1);
            if (var11 == 0) {
                int var12 = arg0.method3599(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field954[0] + var14;
                int var17 = var4.field981[0] + var15;
                if (client.field663 == arg1 && var4.field943 < 1536 || var4.field925 < 1536 || var4.field943 >= 11776 || var4.field925 >= 11776) {
                    var4.method1047(var16, var17);
                    var4.field621 = false;
                } else if (var2) {
                    var4.field621 = true;
                    var4.field622 = var16;
                    var4.field601 = var17;
                } else {
                    var4.field621 = false;
                    var4.method1033(var16, var17, field1219[arg1]);
                }
                var4.field600 = (byte) (var4.field600 + var13 & 0x3);
                if (client.field663 == arg1) {
                    Statics.field1983 = var4.field600;
                }
            } else {
                int var18 = arg0.method3599(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field321 + var4.field954[0] + var20 & 0x3FFF) - Statics.field321;
                int var23 = (Statics.field2611 + var4.field981[0] + var21 & 0x3FFF) - Statics.field2611;
                if (client.field663 == arg1 && var4.field943 < 1536 || var4.field925 < 1536 || var4.field943 >= 11776 || var4.field925 >= 11776) {
                    var4.method1047(var22, var23);
                    var4.field621 = false;
                } else if (var2) {
                    var4.field621 = true;
                    var4.field622 = var22;
                    var4.field601 = var23;
                } else {
                    var4.field621 = false;
                    var4.method1033(var22, var23, field1219[arg1]);
                }
                var4.field600 = (byte) (var4.field600 + var19 & 0x3);
                if (client.field663 == arg1) {
                    Statics.field1983 = var4.field600;
                }
            }
        }
    }

    @ObfuscatedName("a.e(Lgl;II)Z")
    public static boolean method60(class192 arg0, int arg1) {
        int var2 = arg0.method3599(2);
        if (var2 == 0) {
            if (arg0.method3599(1) != 0) {
                method60(arg0, arg1);
            }
            int var3 = arg0.method3599(13);
            int var4 = arg0.method3599(13);
            boolean var5 = arg0.method3599(1) == 1;
            if (var5) {
                field1220[++field1223 - 1] = arg1;
            }
            if (client.field746[arg1] != null) {
                throw new RuntimeException();
            }
            class62 var6 = client.field746[arg1] = new class62();
            var6.field618 = arg1;
            if (field1230[arg1] != null) {
                var6.method1034(field1230[arg1]);
            }
            var6.field976 = field1221[arg1];
            var6.field951 = field1222[arg1];
            int var7 = field1215[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field982[0] = field1219[arg1];
            var6.field600 = (byte) var8;
            var6.method1047((var9 << 13) + var3 - Statics.field321, (var10 << 13) + var4 - Statics.field2611);
            var6.field621 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3599(2);
            int var12 = field1215[arg1];
            field1215[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3599(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1215[arg1];
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
            field1215[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3599(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1215[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1215[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("fu.c(Lgl;ILbw;II)V")
    public static final void method3241(class192 arg0, int arg1, class62 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x40) != 0) {
            int var5 = arg0.method3373();
            if (var5 > 0) {
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = -1;
                    int var8 = -1;
                    int var9 = -1;
                    int var10 = arg0.method3358();
                    if (var10 == 32767) {
                        var10 = arg0.method3358();
                        var8 = arg0.method3358();
                        var7 = arg0.method3358();
                        var9 = arg0.method3358();
                    } else if (var10 == 32766) {
                        var10 = -1;
                    } else {
                        var8 = arg0.method3358();
                    }
                    int var11 = arg0.method3358();
                    arg2.method1491(var10, var8, var7, var9, client.field642, var11);
                }
            }
            int var12 = arg0.method3374();
            if (var12 > 0) {
                for (int var13 = 0; var13 < var12; var13++) {
                    int var14 = arg0.method3358();
                    int var15 = arg0.method3358();
                    if (var15 == 32767) {
                        arg2.method1488(var14);
                    } else {
                        int var16 = arg0.method3358();
                        int var17 = arg0.method3373();
                        int var18 = var15 > 0 ? arg0.method3344() : var17;
                        arg2.method1499(var14, client.field642, var15, var16, var17, var18);
                    }
                }
            }
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field962 = arg0.method3420();
            int var19 = arg0.method3392();
            arg2.field952 = var19 >> 16;
            arg2.field965 = (var19 & 0xFFFF) + client.field642;
            arg2.field963 = 0;
            arg2.field964 = 0;
            if (arg2.field965 > client.field642) {
                arg2.field963 = -1;
            }
            if (arg2.field962 == 65535) {
                arg2.field962 = -1;
            }
        }
        if ((arg3 & 0x1000) != 0) {
            var4 = arg0.method3522();
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field979 = arg0.method3378();
            arg2.field969 = arg0.method3522();
            arg2.field968 = arg0.method3522();
            arg2.field970 = arg0.method3378();
            arg2.field971 = arg0.method3548() + client.field642;
            arg2.field972 = arg0.method3356() + client.field642;
            arg2.field966 = arg0.method3346();
            if (arg2.field621) {
                arg2.field979 += arg2.field622;
                arg2.field969 += arg2.field601;
                arg2.field968 += arg2.field622;
                arg2.field970 += arg2.field601;
                arg2.field945 = 0;
            } else {
                arg2.field979 += arg2.field954[0];
                arg2.field969 += arg2.field981[0];
                arg2.field968 += arg2.field954[0];
                arg2.field970 += arg2.field981[0];
                arg2.field945 = 1;
            }
            arg2.field984 = 0;
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field938 = arg0.method3353();
            if (arg2.field938.charAt(0) == '~') {
                arg2.field938 = arg2.field938.substring(1);
                class86.method3230(2, arg2.field597.method5130(), arg2.field938);
            } else if (Statics.field138 == arg2) {
                class86.method3230(2, arg2.field597.method5130(), arg2.field938);
            }
            arg2.field935 = false;
            arg2.field932 = 0;
            arg2.field941 = 0;
            arg2.field934 = 150;
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field967 = arg0.method3356();
            if (arg2.field945 == 0) {
                arg2.field976 = arg2.field967;
                arg2.field967 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var20 = arg0.method3375();
            byte[] var21 = new byte[var20];
            class185 var22 = new class185(var21);
            arg0.method3394(var21, 0, var20);
            field1230[arg1] = var22;
            arg2.method1034(var22);
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field951 = arg0.method3548();
            if (arg2.field951 == 65535) {
                arg2.field951 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            field1219[arg1] = arg0.method3522();
        }
        if ((arg3 & 0x10) != 0) {
            int var23 = arg0.method3548();
            class245 var24 = (class245) Statics.method1912(class245.method4128(), arg0.method3344());
            boolean var25 = arg0.method3374() == 1;
            int var26 = arg0.method3344();
            int var27 = arg0.field2414;
            if (arg2.field597 != null && arg2.field596 != null) {
                boolean var28 = false;
                if (var24.field3193 && Statics.field1863.method1572(arg2.field597)) {
                    var28 = true;
                }
                if (!var28 && client.field806 == 0 && !arg2.field595) {
                    field1225.field2414 = 0;
                    arg0.method3383(field1225.field2415, 0, var26);
                    field1225.field2414 = 0;
                    String var29 = class302.method5208(class308.method4258(class303.method4323(field1225)));
                    arg2.field938 = var29.trim();
                    arg2.field932 = var23 >> 8;
                    arg2.field941 = var23 & 0xFF;
                    arg2.field934 = 150;
                    arg2.field935 = var25;
                    arg2.field940 = Statics.field138 != arg2 && var24.field3193 && client.field848 != "" && var29.toLowerCase().indexOf(client.field848) == -1;
                    int var30;
                    if (var24.field3192) {
                        var30 = var25 ? 91 : 1;
                    } else {
                        var30 = var25 ? 90 : 2;
                    }
                    if (var24.field3186 == -1) {
                        class86.method3230(var30, arg2.field597.method5130(), var29);
                    } else {
                        class86.method3230(var30, class76.method87(var24.field3186) + arg2.field597.method5130(), var29);
                    }
                }
            }
            arg0.field2414 = var26 + var27;
        }
        if ((arg3 & 0x100) != 0) {
            for (int var31 = 0; var31 < 3; var31++) {
                arg2.field608[var31] = arg0.method3353();
            }
        }
        if ((arg3 & 0x80) != 0) {
            int var32 = arg0.method3346();
            if (var32 == 65535) {
                var32 = -1;
            }
            int var33 = arg0.method3344();
            client.method7(arg2, var32, var33);
        }
        if (!arg2.field621) {
            return;
        }
        if (var4 == 127) {
            arg2.method1047(arg2.field622, arg2.field601);
            return;
        }
        byte var34;
        if (var4 == -1) {
            var34 = field1219[arg1];
        } else {
            var34 = var4;
        }
        arg2.method1033(arg2.field622, arg2.field601, var34);
    }

    @ObfuscatedName("m.p(I)V")
    public static void method91() {
        field1216 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1230[var0] = null;
            field1219[var0] = 1;
        }
    }
}
