package deob;

@ObfuscatedName("cq")
public class class90 {

    @ObfuscatedName("cq.q")
    public static byte[] field1227 = new byte[2048];

    @ObfuscatedName("cq.w")
    public static byte[] field1235 = new byte[2048];

    @ObfuscatedName("cq.o")
    public static class202[] field1234 = new class202[2048];

    @ObfuscatedName("cq.u")
    public static int field1225 = 0;

    @ObfuscatedName("cq.g")
    public static int[] field1238 = new int[2048];

    @ObfuscatedName("cq.l")
    public static int field1232 = 0;

    @ObfuscatedName("cq.e")
    public static int[] field1233 = new int[2048];

    @ObfuscatedName("cq.x")
    public static int[] field1229 = new int[2048];

    @ObfuscatedName("cq.d")
    public static int[] field1230 = new int[2048];

    @ObfuscatedName("cq.k")
    public static int[] field1236 = new int[2048];

    @ObfuscatedName("cq.n")
    public static int field1237 = 0;

    @ObfuscatedName("cq.i")
    public static int[] field1239 = new int[2048];

    @ObfuscatedName("cq.a")
    public static class202 field1228 = new class202(new byte[5000]);

    public class90() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.m(Lhx;B)V")
    public static final void method130(class209 arg0) {
        arg0.method3690();
        int var1 = client.field843;
        class67 var2 = Statics.field389 = client.field738[var1] = new class67();
        var2.field609 = var1;
        int var3 = arg0.method3692(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field953[0] = var5 - Statics.field405;
        var2.field957 = (var2.field953[0] << 7) + (var2.method1112() << 6);
        var2.field935[0] = var6 - Statics.field1088;
        var2.field916 = (var2.field935[0] << 7) + (var2.method1112() << 6);
        Statics.field1394 = var2.field608 = var4;
        if (field1234[var1] != null) {
            var2.method1097(field1234[var1]);
        }
        field1225 = 0;
        field1238[++field1225 - 1] = var1;
        field1227[var1] = 0;
        field1232 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3692(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1229[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1230[var7] = 0;
                field1236[var7] = -1;
                field1233[++field1232 - 1] = var7;
                field1227[var7] = 0;
            }
        }
        arg0.method3713();
    }

    @ObfuscatedName("ek.f(Lhx;IB)V")
    public static final void method2811(class209 arg0, int arg1) {
        int var2 = arg0.field2439;
        field1237 = 0;
        int var3 = 0;
        arg0.method3690();
        for (int var4 = 0; var4 < field1225; var4++) {
            int var5 = field1238[var4];
            if ((field1227[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1227[var5] = (byte) (field1227[var5] | 0x2);
                } else {
                    int var6 = arg0.method3692(1);
                    if (var6 == 0) {
                        var3 = method88(arg0);
                        field1227[var5] = (byte) (field1227[var5] | 0x2);
                    } else {
                        method3743(arg0, var5);
                    }
                }
            }
        }
        arg0.method3713();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3690();
        for (int var7 = 0; var7 < field1225; var7++) {
            int var8 = field1238[var7];
            if ((field1227[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1227[var8] = (byte) (field1227[var8] | 0x2);
                } else {
                    int var9 = arg0.method3692(1);
                    if (var9 == 0) {
                        var3 = method88(arg0);
                        field1227[var8] = (byte) (field1227[var8] | 0x2);
                    } else {
                        method3743(arg0, var8);
                    }
                }
            }
        }
        arg0.method3713();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3690();
        for (int var10 = 0; var10 < field1232; var10++) {
            int var11 = field1233[var10];
            if ((field1227[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1227[var11] = (byte) (field1227[var11] | 0x2);
                } else {
                    int var12 = arg0.method3692(1);
                    if (var12 == 0) {
                        var3 = method88(arg0);
                        field1227[var11] = (byte) (field1227[var11] | 0x2);
                    } else if (method4141(arg0, var11)) {
                        field1227[var11] = (byte) (field1227[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method3713();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3690();
        for (int var13 = 0; var13 < field1232; var13++) {
            int var14 = field1233[var13];
            if ((field1227[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1227[var14] = (byte) (field1227[var14] | 0x2);
                } else {
                    int var15 = arg0.method3692(1);
                    if (var15 == 0) {
                        var3 = method88(arg0);
                        field1227[var14] = (byte) (field1227[var14] | 0x2);
                    } else if (method4141(arg0, var14)) {
                        field1227[var14] = (byte) (field1227[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method3713();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1225 = 0;
        field1232 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1227[var16] = (byte) (field1227[var16] >> 1);
            class67 var17 = client.field738[var16];
            if (var17 == null) {
                field1233[++field1232 - 1] = var16;
            } else {
                field1238[++field1225 - 1] = var16;
            }
        }
        method270(arg0);
        if (arg0.field2439 - var2 != arg1) {
            throw new RuntimeException(arg0.field2439 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("x.q(Lhx;I)I")
    public static int method88(class209 arg0) {
        int var1 = arg0.method3692(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3692(5);
        } else if (var1 == 2) {
            var2 = arg0.method3692(8);
        } else {
            var2 = arg0.method3692(11);
        }
        return var2;
    }

    @ObfuscatedName("hr.w(Lhx;II)V")
    public static void method3743(class209 arg0, int arg1) {
        boolean var2 = arg0.method3692(1) == 1;
        if (var2) {
            field1239[++field1237 - 1] = arg1;
        }
        int var3 = arg0.method3692(2);
        class67 var4 = client.field738[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field612 = false;
            } else if (client.field843 == arg1) {
                throw new RuntimeException();
            } else {
                field1229[arg1] = (Statics.field1088 + var4.field935[0] >> 13) + (Statics.field405 + var4.field953[0] >> 13 << 14) + (var4.field608 << 28);
                if (var4.field944 == -1) {
                    field1230[arg1] = var4.field967;
                } else {
                    field1230[arg1] = var4.field944;
                }
                field1236[arg1] = var4.field933;
                client.field738[arg1] = null;
                if (arg0.method3692(1) != 0) {
                    method4141(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3692(3);
            int var6 = var4.field953[0];
            int var7 = var4.field935[0];
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
            if (client.field843 == arg1 && var4.field957 < 1536 || var4.field916 < 1536 || var4.field957 >= 11776 || var4.field916 >= 11776) {
                var4.method1107(var6, var7);
                var4.field612 = false;
            } else if (var2) {
                var4.field612 = true;
                var4.field613 = var6;
                var4.field610 = var7;
            } else {
                var4.field612 = false;
                var4.method1134(var6, var7, field1235[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3692(4);
            int var9 = var4.field953[0];
            int var10 = var4.field935[0];
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
            if (client.field843 == arg1 && var4.field957 < 1536 || var4.field916 < 1536 || var4.field957 >= 11776 || var4.field916 >= 11776) {
                var4.method1107(var9, var10);
                var4.field612 = false;
            } else if (var2) {
                var4.field612 = true;
                var4.field613 = var9;
                var4.field610 = var10;
            } else {
                var4.field612 = false;
                var4.method1134(var9, var10, field1235[arg1]);
            }
        } else {
            int var11 = arg0.method3692(1);
            if (var11 == 0) {
                int var12 = arg0.method3692(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field953[0] + var14;
                int var17 = var4.field935[0] + var15;
                if (client.field843 == arg1 && var4.field957 < 1536 || var4.field916 < 1536 || var4.field957 >= 11776 || var4.field916 >= 11776) {
                    var4.method1107(var16, var17);
                    var4.field612 = false;
                } else if (var2) {
                    var4.field612 = true;
                    var4.field613 = var16;
                    var4.field610 = var17;
                } else {
                    var4.field612 = false;
                    var4.method1134(var16, var17, field1235[arg1]);
                }
                var4.field608 = (byte) (var4.field608 + var13 & 0x3);
                if (client.field843 == arg1) {
                    Statics.field1394 = var4.field608;
                }
            } else {
                int var18 = arg0.method3692(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field405 + var4.field953[0] + var20 & 0x3FFF) - Statics.field405;
                int var23 = (Statics.field1088 + var4.field935[0] + var21 & 0x3FFF) - Statics.field1088;
                if (client.field843 == arg1 && var4.field957 < 1536 || var4.field916 < 1536 || var4.field957 >= 11776 || var4.field916 >= 11776) {
                    var4.method1107(var22, var23);
                    var4.field612 = false;
                } else if (var2) {
                    var4.field612 = true;
                    var4.field613 = var22;
                    var4.field610 = var23;
                } else {
                    var4.field612 = false;
                    var4.method1134(var22, var23, field1235[arg1]);
                }
                var4.field608 = (byte) (var4.field608 + var19 & 0x3);
                if (client.field843 == arg1) {
                    Statics.field1394 = var4.field608;
                }
            }
        }
    }

    @ObfuscatedName("ie.o(Lhx;II)Z")
    public static boolean method4141(class209 arg0, int arg1) {
        int var2 = arg0.method3692(2);
        if (var2 == 0) {
            if (arg0.method3692(1) != 0) {
                method4141(arg0, arg1);
            }
            int var3 = arg0.method3692(13);
            int var4 = arg0.method3692(13);
            boolean var5 = arg0.method3692(1) == 1;
            if (var5) {
                field1239[++field1237 - 1] = arg1;
            }
            if (client.field738[arg1] != null) {
                throw new RuntimeException();
            }
            class67 var6 = client.field738[arg1] = new class67();
            var6.field609 = arg1;
            if (field1234[arg1] != null) {
                var6.method1097(field1234[arg1]);
            }
            var6.field967 = field1230[arg1];
            var6.field933 = field1236[arg1];
            int var7 = field1229[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field973[0] = field1235[arg1];
            var6.field608 = (byte) var8;
            var6.method1107((var9 << 13) + var3 - Statics.field405, (var10 << 13) + var4 - Statics.field1088);
            var6.field612 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3692(2);
            int var12 = field1229[arg1];
            field1229[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3692(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1229[arg1];
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
            field1229[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3692(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1229[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1229[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("b.u(Lhx;B)V")
    public static final void method270(class209 arg0) {
        for (int var1 = 0; var1 < field1237; var1++) {
            int var2 = field1239[var1];
            class67 var3 = client.field738[var2];
            int var4 = arg0.method3551();
            if ((var4 & 0x8) != 0) {
                var4 += arg0.method3551() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x40) != 0) {
                int var6 = arg0.method3446();
                if (var6 > 0) {
                    for (int var7 = 0; var7 < var6; var7++) {
                        int var8 = -1;
                        int var9 = -1;
                        int var10 = -1;
                        int var11 = arg0.method3431();
                        if (var11 == 32767) {
                            var11 = arg0.method3431();
                            var9 = arg0.method3431();
                            var8 = arg0.method3431();
                            var10 = arg0.method3431();
                        } else if (var11 == 32766) {
                            var11 = -1;
                        } else {
                            var9 = arg0.method3431();
                        }
                        int var12 = arg0.method3431();
                        var3.method1539(var11, var9, var8, var10, client.field633, var12);
                    }
                }
                int var13 = arg0.method3447();
                if (var13 > 0) {
                    for (int var14 = 0; var14 < var13; var14++) {
                        int var15 = arg0.method3431();
                        int var16 = arg0.method3431();
                        if (var16 == 32767) {
                            var3.method1544(var15);
                        } else {
                            int var17 = arg0.method3431();
                            int var18 = arg0.method3446();
                            int var19 = var16 > 0 ? arg0.method3551() : var18;
                            var3.method1540(var15, client.field633, var16, var17, var18, var19);
                        }
                    }
                }
            }
            if ((var4 & 0x200) != 0) {
                var3.field934 = arg0.method3457();
                int var20 = arg0.method3465();
                var3.field949 = var20 >> 16;
                var3.field972 = (var20 & 0xFFFF) + client.field633;
                var3.field921 = 0;
                var3.field928 = 0;
                if (var3.field972 > client.field633) {
                    var3.field921 = -1;
                }
                if (var3.field934 == 65535) {
                    var3.field934 = -1;
                }
            }
            if ((var4 & 0x1000) != 0) {
                var5 = arg0.method3449();
            }
            if ((var4 & 0x400) != 0) {
                var3.field958 = arg0.method3451();
                var3.field960 = arg0.method3449();
                var3.field959 = arg0.method3449();
                var3.field961 = arg0.method3451();
                var3.field954 = arg0.method3574() + client.field633;
                var3.field963 = arg0.method3455() + client.field633;
                var3.field964 = arg0.method3530();
                if (var3.field612) {
                    var3.field958 += var3.field613;
                    var3.field960 += var3.field610;
                    var3.field959 += var3.field613;
                    var3.field961 += var3.field610;
                    var3.field970 = 0;
                } else {
                    var3.field958 += var3.field953[0];
                    var3.field960 += var3.field935[0];
                    var3.field959 += var3.field953[0];
                    var3.field961 += var3.field935[0];
                    var3.field970 = 1;
                }
                var3.field975 = 0;
            }
            if ((var4 & 0x20) != 0) {
                var3.field929 = arg0.method3426();
                if (var3.field929.charAt(0) == '~') {
                    var3.field929 = var3.field929.substring(1);
                    class92.method202(2, var3.field599.method5136(), var3.field929);
                } else if (Statics.field389 == var3) {
                    class92.method202(2, var3.field599.method5136(), var3.field929);
                }
                var3.field930 = false;
                var3.field974 = 0;
                var3.field968 = 0;
                var3.field932 = 150;
            }
            if ((var4 & 0x4) != 0) {
                var3.field944 = arg0.method3455();
                if (var3.field970 == 0) {
                    var3.field967 = var3.field944;
                    var3.field944 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var21 = arg0.method3404();
                byte[] var22 = new byte[var21];
                class202 var23 = new class202(var22);
                arg0.method3467(var22, 0, var21);
                field1234[var2] = var23;
                var3.method1097(var23);
            }
            if ((var4 & 0x2) != 0) {
                var3.field933 = arg0.method3574();
                if (var3.field933 == 65535) {
                    var3.field933 = -1;
                }
            }
            if ((var4 & 0x800) != 0) {
                field1235[var2] = arg0.method3449();
            }
            if ((var4 & 0x10) != 0) {
                int var24 = arg0.method3574();
                class240 var25 = (class240) class197.method999(class240.method727(), arg0.method3551());
                boolean var26 = arg0.method3447() == 1;
                int var27 = arg0.method3551();
                int var28 = arg0.field2439;
                if (var3.field599 != null && var3.field588 != null) {
                    boolean var29 = false;
                    if (var25.field3170 && Statics.field205.method1684(var3.field599)) {
                        var29 = true;
                    }
                    if (!var29 && client.field710 == 0 && !var3.field587) {
                        field1228.field2439 = 0;
                        arg0.method3429(field1228.field2440, 0, var27);
                        field1228.field2439 = 0;
                        String var30 = class303.method5206(class309.method4130(class304.method4452(field1228)));
                        var3.field929 = var30.trim();
                        var3.field974 = var24 >> 8;
                        var3.field968 = var24 & 0xFF;
                        var3.field932 = 150;
                        var3.field930 = var26;
                        var3.field931 = Statics.field389 != var3 && var25.field3170 && client.field840 != "" && var30.toLowerCase().indexOf(client.field840) == -1;
                        int var31;
                        if (var25.field3164) {
                            var31 = var26 ? 91 : 1;
                        } else {
                            var31 = var26 ? 90 : 2;
                        }
                        if (var25.field3171 == -1) {
                            class92.method202(var31, var3.field599.method5136(), var30);
                        } else {
                            class92.method202(var31, class82.method1032(var25.field3171) + var3.field599.method5136(), var30);
                        }
                    }
                }
                arg0.field2439 = var27 + var28;
            }
            if ((var4 & 0x100) != 0) {
                for (int var32 = 0; var32 < 3; var32++) {
                    var3.field591[var32] = arg0.method3426();
                }
            }
            if ((var4 & 0x80) != 0) {
                int var33 = arg0.method3530();
                if (var33 == 65535) {
                    var33 = -1;
                }
                int var34 = arg0.method3551();
                client.method4137(var3, var33, var34);
            }
            if (var3.field612) {
                if (var5 == 127) {
                    var3.method1107(var3.field613, var3.field610);
                } else {
                    byte var35;
                    if (var5 == -1) {
                        var35 = field1235[var2];
                    } else {
                        var35 = var5;
                    }
                    var3.method1134(var3.field613, var3.field610, var35);
                }
            }
        }
    }
}
