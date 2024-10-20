package deob;

@ObfuscatedName("co")
public class class82 {

    @ObfuscatedName("co.s")
    public static byte[] field1157 = new byte[2048];

    @ObfuscatedName("co.l")
    public static byte[] field1154 = new byte[2048];

    @ObfuscatedName("co.u")
    public static class183[] field1158 = new class183[2048];

    @ObfuscatedName("co.q")
    public static int field1168 = 0;

    @ObfuscatedName("co.k")
    public static int[] field1160 = new int[2048];

    @ObfuscatedName("co.i")
    public static int field1161 = 0;

    @ObfuscatedName("co.x")
    public static int[] field1162 = new int[2048];

    @ObfuscatedName("co.e")
    public static int[] field1163 = new int[2048];

    @ObfuscatedName("co.p")
    public static int[] field1164 = new int[2048];

    @ObfuscatedName("co.b")
    public static int[] field1165 = new int[2048];

    @ObfuscatedName("co.n")
    public static int field1166 = 0;

    @ObfuscatedName("co.f")
    public static int[] field1167 = new int[2048];

    @ObfuscatedName("co.g")
    public static class183 field1155 = new class183(new byte[5000]);

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ho.w(Lgi;IB)V")
    public static final void method3855(class190 arg0, int arg1) {
        int var2 = arg0.field2340;
        field1166 = 0;
        method3215(arg0);
        for (int var3 = 0; var3 < field1166; var3++) {
            int var4 = field1167[var3];
            class61 var5 = client.field611[var4];
            int var6 = arg0.method3247();
            if ((var6 & 0x80) != 0) {
                var6 += arg0.method3247() << 8;
            }
            byte var7 = -1;
            if ((var6 & 0x200) != 0) {
                var7 = arg0.method3313();
            }
            if ((var6 & 0x8) != 0) {
                var5.field885 = arg0.method3441();
                if (var5.field885.charAt(0) == '~') {
                    var5.field885 = var5.field885.substring(1);
                    class84.method2942(2, var5.field553.method5033(), var5.field885);
                } else if (Statics.field1877 == var5) {
                    class84.method2942(2, var5.field553.method5033(), var5.field885);
                }
                var5.field886 = false;
                var5.field889 = 0;
                var5.field928 = 0;
                var5.field888 = 150;
            }
            if ((var6 & 0x800) != 0) {
                var5.field892 = arg0.method3349();
                int var8 = arg0.method3298();
                var5.field872 = var8 >> 16;
                var5.field912 = (var8 & 0xFFFF) + client.field592;
                var5.field877 = 0;
                var5.field911 = 0;
                if (var5.field912 > client.field592) {
                    var5.field877 = -1;
                }
                if (var5.field892 == 65535) {
                    var5.field892 = -1;
                }
            }
            if ((var6 & 0x400) != 0) {
                for (int var9 = 0; var9 < 3; var9++) {
                    var5.field551[var9] = arg0.method3441();
                }
            }
            if ((var6 & 0x20) != 0) {
                int var10 = arg0.method3349();
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = arg0.method3280();
                Statics.method2872(var5, var10, var11);
            }
            if ((var6 & 0x40) != 0) {
                int var12 = arg0.method3288();
                class243 var13 = (class243) class178.method1685(class243.method197(), arg0.method3280());
                boolean var14 = arg0.method3310() == 1;
                int var15 = arg0.method3247();
                int var16 = arg0.field2340;
                if (var5.field553 != null && var5.field547 != null) {
                    boolean var17 = false;
                    if (var13.field3128 && Statics.field2333.method1523(var5.field553)) {
                        var17 = true;
                    }
                    if (!var17 && client.field695 == 0 && !var5.field567) {
                        field1155.field2340 = 0;
                        arg0.method3242(field1155.field2339, 0, var15);
                        field1155.field2340 = 0;
                        class183 var18 = field1155;
                        String var22;
                        try {
                            int var19 = var18.method3265();
                            if (var19 > 32767) {
                                var19 = 32767;
                            }
                            byte[] var20 = new byte[var19];
                            var18.field2340 += Statics.field3713.method3183(var18.field2339, var18.field2340, var20, 0, var19);
                            String var21 = class302.method1710(var20, 0, var19);
                            var22 = var21;
                        } catch (Exception var48) {
                            var22 = "Cabbage";
                        }
                        String var25 = class300.method5096(class306.method919(var22));
                        var5.field885 = var25.trim();
                        var5.field889 = var12 >> 8;
                        var5.field928 = var12 & 0xFF;
                        var5.field888 = 150;
                        var5.field886 = var14;
                        var5.field887 = Statics.field1877 != var5 && var13.field3128 && client.field797 != "" && var25.toLowerCase().indexOf(client.field797) == -1;
                        int var26;
                        if (var13.field3127) {
                            var26 = var14 ? 91 : 1;
                        } else {
                            var26 = var14 ? 90 : 2;
                        }
                        if (var13.field3129 == -1) {
                            class84.method2942(var26, var5.field553.method5033(), var25);
                        } else {
                            int var28 = var13.field3129;
                            String var29 = "<img=" + var28 + ">";
                            class84.method2942(var26, var29 + var5.field553.method5033(), var25);
                        }
                    }
                }
                arg0.field2340 = var15 + var16;
            }
            if ((var6 & 0x1000) != 0) {
                field1154[var4] = arg0.method3313();
            }
            if ((var6 & 0x1) != 0) {
                int var30 = arg0.method3280();
                if (var30 > 0) {
                    for (int var31 = 0; var31 < var30; var31++) {
                        int var32 = -1;
                        int var33 = -1;
                        int var34 = -1;
                        int var35 = arg0.method3265();
                        if (var35 == 32767) {
                            var35 = arg0.method3265();
                            var33 = arg0.method3265();
                            var32 = arg0.method3265();
                            var34 = arg0.method3265();
                        } else if (var35 == 32766) {
                            var35 = -1;
                        } else {
                            var33 = arg0.method3265();
                        }
                        int var36 = arg0.method3265();
                        var5.method1437(var35, var33, var32, var34, client.field592, var36);
                    }
                }
                int var37 = arg0.method3247();
                if (var37 > 0) {
                    for (int var38 = 0; var38 < var37; var38++) {
                        int var39 = arg0.method3265();
                        int var40 = arg0.method3265();
                        if (var40 == 32767) {
                            var5.method1450(var39);
                        } else {
                            int var41 = arg0.method3265();
                            int var42 = arg0.method3280();
                            int var43 = var40 > 0 ? arg0.method3310() : var42;
                            var5.method1438(var39, client.field592, var40, var41, var42, var43);
                        }
                    }
                }
            }
            if ((var6 & 0x100) != 0) {
                var5.field914 = arg0.method3363();
                var5.field916 = arg0.method3313();
                var5.field917 = arg0.method3363();
                var5.field930 = arg0.method3313();
                var5.field918 = arg0.method3253() + client.field592;
                var5.field919 = arg0.method3349() + client.field592;
                var5.field920 = arg0.method3349();
                if (var5.field572) {
                    var5.field914 += var5.field573;
                    var5.field916 += var5.field574;
                    var5.field917 += var5.field573;
                    var5.field930 += var5.field574;
                    var5.field910 = 0;
                } else {
                    var5.field914 += var5.field923[0];
                    var5.field916 += var5.field873[0];
                    var5.field917 += var5.field923[0];
                    var5.field930 += var5.field873[0];
                    var5.field910 = 1;
                }
                var5.field931 = 0;
            }
            if ((var6 & 0x10) != 0) {
                var5.field898 = arg0.method3288();
                if (var5.field898 == 65535) {
                    var5.field898 = -1;
                }
            }
            if ((var6 & 0x4) != 0) {
                int var44 = arg0.method3280();
                byte[] var45 = new byte[var44];
                class183 var46 = new class183(var45);
                arg0.method3242(var45, 0, var44);
                field1158[var4] = var46;
                var5.method1003(var46);
            }
            if ((var6 & 0x2) != 0) {
                var5.field921 = arg0.method3253();
                if (var5.field910 == 0) {
                    var5.field927 = var5.field921;
                    var5.field921 = -1;
                }
            }
            if (var5.field572) {
                if (var7 == 127) {
                    var5.method1024(var5.field573, var5.field574);
                } else {
                    byte var47;
                    if (var7 == -1) {
                        var47 = field1154[var4];
                    } else {
                        var47 = var7;
                    }
                    var5.method1027(var5.field573, var5.field574, var47);
                }
            }
        }
        if (arg0.field2340 - var2 != arg1) {
            throw new RuntimeException(arg0.field2340 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("fm.s(Lgi;I)V")
    public static final void method3215(class190 arg0) {
        int var1 = 0;
        arg0.method3515();
        for (int var2 = 0; var2 < field1168; var2++) {
            int var3 = field1160[var2];
            if ((field1157[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1157[var3] = (byte) (field1157[var3] | 0x2);
                } else {
                    int var4 = arg0.method3509(1);
                    if (var4 == 0) {
                        var1 = method3148(arg0);
                        field1157[var3] = (byte) (field1157[var3] | 0x2);
                    } else {
                        method74(arg0, var3);
                    }
                }
            }
        }
        arg0.method3508();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3515();
        for (int var5 = 0; var5 < field1168; var5++) {
            int var6 = field1160[var5];
            if ((field1157[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1157[var6] = (byte) (field1157[var6] | 0x2);
                } else {
                    int var7 = arg0.method3509(1);
                    if (var7 == 0) {
                        var1 = method3148(arg0);
                        field1157[var6] = (byte) (field1157[var6] | 0x2);
                    } else {
                        method74(arg0, var6);
                    }
                }
            }
        }
        arg0.method3508();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3515();
        for (int var8 = 0; var8 < field1161; var8++) {
            int var9 = field1162[var8];
            if ((field1157[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1157[var9] = (byte) (field1157[var9] | 0x2);
                } else {
                    int var10 = arg0.method3509(1);
                    if (var10 == 0) {
                        var1 = method3148(arg0);
                        field1157[var9] = (byte) (field1157[var9] | 0x2);
                    } else if (method4229(arg0, var9)) {
                        field1157[var9] = (byte) (field1157[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method3508();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3515();
        for (int var11 = 0; var11 < field1161; var11++) {
            int var12 = field1162[var11];
            if ((field1157[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1157[var12] = (byte) (field1157[var12] | 0x2);
                } else {
                    int var13 = arg0.method3509(1);
                    if (var13 == 0) {
                        var1 = method3148(arg0);
                        field1157[var12] = (byte) (field1157[var12] | 0x2);
                    } else if (method4229(arg0, var12)) {
                        field1157[var12] = (byte) (field1157[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method3508();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1168 = 0;
        field1161 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1157[var14] = (byte) (field1157[var14] >> 1);
            class61 var15 = client.field611[var14];
            if (var15 == null) {
                field1162[++field1161 - 1] = var14;
            } else {
                field1160[++field1168 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("fj.l(Lgi;B)I")
    public static int method3148(class190 arg0) {
        int var1 = arg0.method3509(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3509(5);
        } else if (var1 == 2) {
            var2 = arg0.method3509(8);
        } else {
            var2 = arg0.method3509(11);
        }
        return var2;
    }

    @ObfuscatedName("k.u(Lgi;II)V")
    public static void method74(class190 arg0, int arg1) {
        boolean var2 = arg0.method3509(1) == 1;
        if (var2) {
            field1167[++field1166 - 1] = arg1;
        }
        int var3 = arg0.method3509(2);
        class61 var4 = client.field611[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field572 = false;
            } else if (client.field629 == arg1) {
                throw new RuntimeException();
            } else {
                field1163[arg1] = (Statics.field755 + var4.field873[0] >> 13) + (Statics.field869 + var4.field923[0] >> 13 << 14) + (var4.field568 << 28);
                if (var4.field921 == -1) {
                    field1164[arg1] = var4.field927;
                } else {
                    field1164[arg1] = var4.field921;
                }
                field1165[arg1] = var4.field898;
                client.field611[arg1] = null;
                if (arg0.method3509(1) != 0) {
                    method4229(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3509(3);
            int var6 = var4.field923[0];
            int var7 = var4.field873[0];
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
            if (client.field629 == arg1 && var4.field932 < 1536 || var4.field882 < 1536 || var4.field932 >= 11776 || var4.field882 >= 11776) {
                var4.method1024(var6, var7);
                var4.field572 = false;
            } else if (var2) {
                var4.field572 = true;
                var4.field573 = var6;
                var4.field574 = var7;
            } else {
                var4.field572 = false;
                var4.method1027(var6, var7, field1154[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3509(4);
            int var9 = var4.field923[0];
            int var10 = var4.field873[0];
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
            if (client.field629 == arg1 && var4.field932 < 1536 || var4.field882 < 1536 || var4.field932 >= 11776 || var4.field882 >= 11776) {
                var4.method1024(var9, var10);
                var4.field572 = false;
            } else if (var2) {
                var4.field572 = true;
                var4.field573 = var9;
                var4.field574 = var10;
            } else {
                var4.field572 = false;
                var4.method1027(var9, var10, field1154[arg1]);
            }
        } else {
            int var11 = arg0.method3509(1);
            if (var11 == 0) {
                int var12 = arg0.method3509(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field923[0] + var14;
                int var17 = var4.field873[0] + var15;
                if (client.field629 == arg1 && var4.field932 < 1536 || var4.field882 < 1536 || var4.field932 >= 11776 || var4.field882 >= 11776) {
                    var4.method1024(var16, var17);
                    var4.field572 = false;
                } else if (var2) {
                    var4.field572 = true;
                    var4.field573 = var16;
                    var4.field574 = var17;
                } else {
                    var4.field572 = false;
                    var4.method1027(var16, var17, field1154[arg1]);
                }
                var4.field568 = (byte) (var4.field568 + var13 & 0x3);
                if (client.field629 == arg1) {
                    Statics.field83 = var4.field568;
                }
            } else {
                int var18 = arg0.method3509(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field869 + var4.field923[0] + var20 & 0x3FFF) - Statics.field869;
                int var23 = (Statics.field755 + var4.field873[0] + var21 & 0x3FFF) - Statics.field755;
                if (client.field629 == arg1 && var4.field932 < 1536 || var4.field882 < 1536 || var4.field932 >= 11776 || var4.field882 >= 11776) {
                    var4.method1024(var22, var23);
                    var4.field572 = false;
                } else if (var2) {
                    var4.field572 = true;
                    var4.field573 = var22;
                    var4.field574 = var23;
                } else {
                    var4.field572 = false;
                    var4.method1027(var22, var23, field1154[arg1]);
                }
                var4.field568 = (byte) (var4.field568 + var19 & 0x3);
                if (client.field629 == arg1) {
                    Statics.field83 = var4.field568;
                }
            }
        }
    }

    @ObfuscatedName("if.q(Lgi;II)Z")
    public static boolean method4229(class190 arg0, int arg1) {
        int var2 = arg0.method3509(2);
        if (var2 == 0) {
            if (arg0.method3509(1) != 0) {
                method4229(arg0, arg1);
            }
            int var3 = arg0.method3509(13);
            int var4 = arg0.method3509(13);
            boolean var5 = arg0.method3509(1) == 1;
            if (var5) {
                field1167[++field1166 - 1] = arg1;
            }
            if (client.field611[arg1] != null) {
                throw new RuntimeException();
            }
            class61 var6 = client.field611[arg1] = new class61();
            var6.field575 = arg1;
            if (field1158[arg1] != null) {
                var6.method1003(field1158[arg1]);
            }
            var6.field927 = field1164[arg1];
            var6.field898 = field1165[arg1];
            int var7 = field1163[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field929[0] = field1154[arg1];
            var6.field568 = (byte) var8;
            var6.method1024((var9 << 13) + var3 - Statics.field869, (var10 << 13) + var4 - Statics.field755);
            var6.field572 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3509(2);
            int var12 = field1163[arg1];
            field1163[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3509(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1163[arg1];
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
            field1163[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3509(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1163[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1163[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("de.i(B)V")
    public static void method2358() {
        field1168 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1158[var0] = null;
            field1154[var0] = 1;
        }
    }
}
