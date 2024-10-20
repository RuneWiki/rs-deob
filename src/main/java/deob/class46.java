package deob;

@ObfuscatedName("aa")
public class class46 {

    @ObfuscatedName("aa.u")
    public static byte[] field927 = new byte[2048];

    @ObfuscatedName("aa.h")
    public static byte[] field922 = new byte[2048];

    @ObfuscatedName("aa.r")
    public static class154[] field920 = new class154[2048];

    @ObfuscatedName("aa.o")
    public static int field924 = 0;

    @ObfuscatedName("aa.l")
    public static int[] field919 = new int[2048];

    @ObfuscatedName("aa.n")
    public static int field926 = 0;

    @ObfuscatedName("aa.m")
    public static int[] field935 = new int[2048];

    @ObfuscatedName("aa.w")
    public static int[] field928 = new int[2048];

    @ObfuscatedName("aa.j")
    public static int[] field929 = new int[2048];

    @ObfuscatedName("aa.s")
    public static int[] field930 = new int[2048];

    @ObfuscatedName("aa.q")
    public static int field931 = 0;

    @ObfuscatedName("aa.d")
    public static int[] field932 = new int[2048];

    @ObfuscatedName("aa.p")
    public static class154 field933 = new class154(new byte[5000]);

    public class46() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dr.f(Lfm;B)V")
    public static final void method1973(class160 arg0) {
        arg0.method2891();
        int var1 = client.field386;
        class24 var2 = Statics.field899 = client.field423[var1] = new class24();
        var2.field267 = var1;
        int var3 = arg0.method2900(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field674[0] = var5 - Statics.field1880;
        var2.field625 = (var2.field674[0] << 7) + (var2.method208() << 6);
        var2.field675[0] = var6 - Statics.field2792;
        var2.field620 = (var2.field675[0] << 7) + (var2.method208() << 6);
        Statics.field3063 = var2.field277 = var4;
        if (field920[var1] != null) {
            var2.method207(field920[var1]);
        }
        field924 = 0;
        field919[++field924 - 1] = var1;
        field927[var1] = 0;
        field926 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2900(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field928[var7] = (var9 << 28) + (var10 << 14) + var11;
                field929[var7] = 0;
                field930[var7] = -1;
                field935[++field926 - 1] = var7;
                field927[var7] = 0;
            }
        }
        arg0.method2892();
    }

    @ObfuscatedName("an.i(Lfm;IB)V")
    public static final void method572(class160 arg0, int arg1) {
        int var2 = arg0.field2111;
        field931 = 0;
        method23(arg0);
        method659(arg0);
        if (arg0.field2111 - var2 != arg1) {
            throw new RuntimeException(arg0.field2111 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("h.u(Lfm;I)V")
    public static final void method23(class160 arg0) {
        int var1 = 0;
        arg0.method2891();
        for (int var2 = 0; var2 < field924; var2++) {
            int var3 = field919[var2];
            if ((field927[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field927[var3] = (byte) (field927[var3] | 0x2);
                } else {
                    int var4 = arg0.method2900(1);
                    if (var4 == 0) {
                        var1 = method916(arg0);
                        field927[var3] = (byte) (field927[var3] | 0x2);
                    } else {
                        method91(arg0, var3);
                    }
                }
            }
        }
        arg0.method2892();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2891();
        for (int var5 = 0; var5 < field924; var5++) {
            int var6 = field919[var5];
            if ((field927[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field927[var6] = (byte) (field927[var6] | 0x2);
                } else {
                    int var7 = arg0.method2900(1);
                    if (var7 == 0) {
                        var1 = method916(arg0);
                        field927[var6] = (byte) (field927[var6] | 0x2);
                    } else {
                        method91(arg0, var6);
                    }
                }
            }
        }
        arg0.method2892();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2891();
        for (int var8 = 0; var8 < field926; var8++) {
            int var9 = field935[var8];
            if ((field927[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field927[var9] = (byte) (field927[var9] | 0x2);
                } else {
                    int var10 = arg0.method2900(1);
                    if (var10 == 0) {
                        var1 = method916(arg0);
                        field927[var9] = (byte) (field927[var9] | 0x2);
                    } else if (method1136(arg0, var9)) {
                        field927[var9] = (byte) (field927[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2892();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2891();
        for (int var11 = 0; var11 < field926; var11++) {
            int var12 = field935[var11];
            if ((field927[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field927[var12] = (byte) (field927[var12] | 0x2);
                } else {
                    int var13 = arg0.method2900(1);
                    if (var13 == 0) {
                        var1 = method916(arg0);
                        field927[var12] = (byte) (field927[var12] | 0x2);
                    } else if (method1136(arg0, var12)) {
                        field927[var12] = (byte) (field927[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2892();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field924 = 0;
        field926 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field927[var14] = (byte) (field927[var14] >> 1);
            class24 var15 = client.field423[var14];
            if (var15 == null) {
                field935[++field926 - 1] = var14;
            } else {
                field919[++field924 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("ac.r(Lfm;S)I")
    public static int method916(class160 arg0) {
        int var1 = arg0.method2900(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2900(5);
        } else if (var1 == 2) {
            var2 = arg0.method2900(8);
        } else {
            var2 = arg0.method2900(11);
        }
        return var2;
    }

    @ObfuscatedName("m.o(Lfm;IB)V")
    public static void method91(class160 arg0, int arg1) {
        boolean var2 = arg0.method2900(1) == 1;
        if (var2) {
            field932[++field931 - 1] = arg1;
        }
        int var3 = arg0.method2900(2);
        class24 var4 = client.field423[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field260 = false;
            } else if (client.field386 == arg1) {
                throw new RuntimeException();
            } else {
                field928[arg1] = (Statics.field2792 + var4.field675[0] >> 13) + (Statics.field1880 + var4.field674[0] >> 13 << 14) + (var4.field277 << 28);
                if (var4.field647 == -1) {
                    field929[arg1] = var4.field670;
                } else {
                    field929[arg1] = var4.field647;
                }
                field930[arg1] = var4.field629;
                client.field423[arg1] = null;
                if (arg0.method2900(1) != 0) {
                    method1136(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2900(3);
            int var6 = var4.field674[0];
            int var7 = var4.field675[0];
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
            if (client.field386 == arg1 && var4.field625 < 1536 || var4.field620 < 1536 || var4.field625 >= 11776 || var4.field620 >= 11776) {
                var4.method217(var6, var7);
                var4.field260 = false;
            } else if (var2) {
                var4.field260 = true;
                var4.field264 = var6;
                var4.field256 = var7;
            } else {
                var4.field260 = false;
                var4.method210(var6, var7, field922[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2900(4);
            int var9 = var4.field674[0];
            int var10 = var4.field675[0];
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
            if (client.field386 == arg1 && var4.field625 < 1536 || var4.field620 < 1536 || var4.field625 >= 11776 || var4.field620 >= 11776) {
                var4.method217(var9, var10);
                var4.field260 = false;
            } else if (var2) {
                var4.field260 = true;
                var4.field264 = var9;
                var4.field256 = var10;
            } else {
                var4.field260 = false;
                var4.method210(var9, var10, field922[arg1]);
            }
        } else {
            int var11 = arg0.method2900(1);
            if (var11 == 0) {
                int var12 = arg0.method2900(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field674[0] + var14;
                int var17 = var4.field675[0] + var15;
                if (client.field386 == arg1 && var4.field625 < 1536 || var4.field620 < 1536 || var4.field625 >= 11776 || var4.field620 >= 11776) {
                    var4.method217(var16, var17);
                    var4.field260 = false;
                } else if (var2) {
                    var4.field260 = true;
                    var4.field264 = var16;
                    var4.field256 = var17;
                } else {
                    var4.field260 = false;
                    var4.method210(var16, var17, field922[arg1]);
                }
                var4.field277 = (byte) (var4.field277 + var13 & 0x3);
                if (client.field386 == arg1) {
                    Statics.field3063 = var4.field277;
                }
            } else {
                int var18 = arg0.method2900(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1880 + var4.field674[0] + var20 & 0x3FFF) - Statics.field1880;
                int var23 = (Statics.field2792 + var4.field675[0] + var21 & 0x3FFF) - Statics.field2792;
                if (client.field386 == arg1 && var4.field625 < 1536 || var4.field620 < 1536 || var4.field625 >= 11776 || var4.field620 >= 11776) {
                    var4.method217(var22, var23);
                    var4.field260 = false;
                } else if (var2) {
                    var4.field260 = true;
                    var4.field264 = var22;
                    var4.field256 = var23;
                } else {
                    var4.field260 = false;
                    var4.method210(var22, var23, field922[arg1]);
                }
                var4.field277 = (byte) (var4.field277 + var19 & 0x3);
                if (client.field386 == arg1) {
                    Statics.field3063 = var4.field277;
                }
            }
        }
    }

    @ObfuscatedName("bv.l(Lfm;IS)Z")
    public static boolean method1136(class160 arg0, int arg1) {
        int var2 = arg0.method2900(2);
        if (var2 == 0) {
            if (arg0.method2900(1) != 0) {
                method1136(arg0, arg1);
            }
            int var3 = arg0.method2900(13);
            int var4 = arg0.method2900(13);
            boolean var5 = arg0.method2900(1) == 1;
            if (var5) {
                field932[++field931 - 1] = arg1;
            }
            if (client.field423[arg1] != null) {
                throw new RuntimeException();
            }
            class24 var6 = client.field423[arg1] = new class24();
            var6.field267 = arg1;
            if (field920[arg1] != null) {
                var6.method207(field920[arg1]);
            }
            var6.field670 = field929[arg1];
            var6.field629 = field930[arg1];
            int var7 = field928[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field676[0] = field922[arg1];
            var6.field277 = (byte) var8;
            var6.method217((var9 << 13) + var3 - Statics.field1880, (var10 << 13) + var4 - Statics.field2792);
            var6.field260 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2900(2);
            int var12 = field928[arg1];
            field928[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2900(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field928[arg1];
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
            field928[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2900(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field928[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field928[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ab.n(Lfm;B)V")
    public static final void method659(class160 arg0) {
        for (int var1 = 0; var1 < field931; var1++) {
            int var2 = field932[var1];
            class24 var3 = client.field423[var2];
            int var4 = arg0.method2666();
            if ((var4 & 0x4) != 0) {
                var4 += arg0.method2666() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x40) != 0) {
                int var6 = arg0.method2666();
                byte[] var7 = new byte[var6];
                class154 var8 = new class154(var7);
                arg0.method2677(var7, 0, var6);
                field920[var2] = var8;
                var3.method207(var8);
            }
            if ((var4 & 0x2) != 0) {
                int var9 = arg0.method2668();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method2666();
                client.method166(var3, var9, var10);
            }
            if ((var4 & 0x20) != 0) {
                var3.field629 = arg0.method2668();
                if (var3.field629 == 65535) {
                    var3.field629 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field632 = arg0.method2674();
                if (var3.field632.charAt(0) == '~') {
                    var3.field632 = var3.field632.substring(1);
                    class48.method225(2, var3.field279, var3.field632);
                } else if (Statics.field899 == var3) {
                    class48.method225(2, var3.field279, var3.field632);
                }
                var3.field633 = false;
                var3.field636 = 0;
                var3.field619 = 0;
                var3.field657 = 150;
            }
            if ((var4 & 0x10) != 0) {
                int var11 = arg0.method2666();
                if (var11 > 0) {
                    for (int var12 = 0; var12 < var11; var12++) {
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = arg0.method2679();
                        if (var16 == 32767) {
                            var16 = arg0.method2679();
                            var14 = arg0.method2679();
                            var13 = arg0.method2679();
                            var15 = arg0.method2679();
                        } else if (var16 == 32766) {
                            var16 = -1;
                        } else {
                            var14 = arg0.method2679();
                        }
                        int var17 = arg0.method2679();
                        var3.method583(var16, var14, var13, var15, client.field312, var17);
                    }
                }
                int var18 = arg0.method2666();
                if (var18 > 0) {
                    for (int var19 = 0; var19 < var18; var19++) {
                        int var20 = arg0.method2679();
                        int var21 = arg0.method2679();
                        if (var21 == 32767) {
                            var3.method569(var20);
                        } else {
                            int var22 = arg0.method2679();
                            int var23 = arg0.method2666();
                            int var24 = var21 > 0 ? arg0.method2666() : var23;
                            var3.method570(var20, client.field312, var21, var22, var23, var24);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field647 = arg0.method2668();
                if (var3.field673 == 0) {
                    var3.field670 = var3.field647;
                    var3.field647 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                int var25 = arg0.method2668();
                class178 var26 = (class178) class149.method557(class178.method24(), arg0.method2666());
                boolean var27 = arg0.method2666() == 1;
                int var28 = arg0.method2666();
                int var29 = arg0.field2111;
                if (var3.field279 != null && var3.field257 != null) {
                    boolean var30 = false;
                    if (var26.field2689 && client.method1844(var3.field279)) {
                        var30 = true;
                    }
                    if (!var30 && client.field422 == 0 && !var3.field266) {
                        field933.field2111 = 0;
                        arg0.method2677(field933.field2114, 0, var28);
                        field933.field2111 = 0;
                        class154 var31 = field933;
                        String var32 = class211.method2146(var31, 32767);
                        String var33 = class210.method3675(class208.method1847(var32));
                        var3.field632 = var33.trim();
                        var3.field636 = var25 >> 8;
                        var3.field619 = var25 & 0xFF;
                        var3.field657 = 150;
                        var3.field633 = var27;
                        var3.field649 = Statics.field899 != var3 && var26.field2689 && client.field473 != "" && var33.toLowerCase().indexOf(client.field473) == -1;
                        int var34;
                        if (var26.field2691) {
                            var34 = var27 ? 91 : 1;
                        } else {
                            var34 = var27 ? 90 : 2;
                        }
                        if (var26.field2696 == -1) {
                            class48.method225(var34, var3.field279, var33);
                        } else {
                            class48.method225(var34, class38.method645(var26.field2696) + var3.field279, var33);
                        }
                    }
                }
                arg0.field2111 = var28 + var29;
            }
            if ((var4 & 0x1000) != 0) {
                var3.field669 = arg0.method2668();
                int var35 = arg0.method2695();
                var3.field660 = var35 >> 16;
                var3.field659 = (var35 & 0xFFFF) + client.field312;
                var3.field679 = 0;
                var3.field639 = 0;
                if (var3.field659 > client.field312) {
                    var3.field679 = -1;
                }
                if (var3.field669 == 65535) {
                    var3.field669 = -1;
                }
            }
            if ((var4 & 0x200) != 0) {
                var3.field661 = arg0.method2667();
                var3.field663 = arg0.method2667();
                var3.field662 = arg0.method2667();
                var3.field644 = arg0.method2667();
                var3.field665 = arg0.method2668() + client.field312;
                var3.field666 = arg0.method2668() + client.field312;
                var3.field641 = arg0.method2668();
                if (var3.field260) {
                    var3.field661 += var3.field264;
                    var3.field663 += var3.field256;
                    var3.field662 += var3.field264;
                    var3.field644 += var3.field256;
                    var3.field673 = 0;
                } else {
                    var3.field661 += var3.field674[0];
                    var3.field663 += var3.field675[0];
                    var3.field662 += var3.field674[0];
                    var3.field644 += var3.field675[0];
                    var3.field673 = 1;
                }
                var3.field656 = 0;
            }
            if ((var4 & 0x100) != 0) {
                field922[var2] = arg0.method2667();
            }
            if ((var4 & 0x400) != 0) {
                var5 = arg0.method2667();
            }
            if ((var4 & 0x800) != 0) {
                for (int var36 = 0; var36 < 3; var36++) {
                    var3.field276[var36] = arg0.method2674();
                }
            }
            if (var3.field260) {
                if (var5 == 127) {
                    var3.method217(var3.field264, var3.field256);
                } else {
                    byte var37;
                    if (var5 == -1) {
                        var37 = field922[var2];
                    } else {
                        var37 = var5;
                    }
                    var3.method210(var3.field264, var3.field256, var37);
                }
            }
        }
    }

    @ObfuscatedName("ar.m(S)V")
    public static void method727() {
        field924 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field920[var0] = null;
            field922[var0] = 1;
        }
    }
}
