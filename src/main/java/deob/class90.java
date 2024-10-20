package deob;

@ObfuscatedName("cb")
public class class90 {

    @ObfuscatedName("cb.i")
    public static byte[] field1222 = new byte[2048];

    @ObfuscatedName("cb.k")
    public static byte[] field1231 = new byte[2048];

    @ObfuscatedName("cb.u")
    public static class300[] field1220 = new class300[2048];

    @ObfuscatedName("cb.n")
    public static int field1230 = 0;

    @ObfuscatedName("cb.t")
    public static int[] field1225 = new int[2048];

    @ObfuscatedName("cb.q")
    public static int field1227 = 0;

    @ObfuscatedName("cb.x")
    public static int[] field1228 = new int[2048];

    @ObfuscatedName("cb.d")
    public static int[] field1223 = new int[2048];

    @ObfuscatedName("cb.f")
    public static int[] field1226 = new int[2048];

    @ObfuscatedName("cb.c")
    public static int[] field1224 = new int[2048];

    @ObfuscatedName("cb.r")
    public static int field1232 = 0;

    @ObfuscatedName("cb.y")
    public static int[] field1233 = new int[2048];

    @ObfuscatedName("cb.p")
    public static class300 field1234 = new class300(new byte[5000]);

    public class90() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bp.s(Lkx;I)V")
    public static final void method970(class299 arg0) {
        arg0.method5000();
        int var1 = client.field741;
        class67 var2 = Statics.field177 = client.field740[var1] = new class67();
        var2.field612 = var1;
        int var3 = arg0.method5001(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field975[0] = var5 - Statics.field1299;
        var2.field957 = (var2.field975[0] << 7) + (var2.method1068() << 6);
        var2.field945[0] = var6 - Statics.field2085;
        var2.field918 = (var2.field945[0] << 7) + (var2.method1068() << 6);
        Statics.field519 = var2.field611 = var4;
        if (field1220[var1] != null) {
            var2.method1061(field1220[var1]);
        }
        field1230 = 0;
        field1225[++field1230 - 1] = var1;
        field1222[var1] = 0;
        field1227 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method5001(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1223[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1226[var7] = 0;
                field1224[var7] = -1;
                field1228[++field1227 - 1] = var7;
                field1222[var7] = 0;
            }
        }
        arg0.method5002();
    }

    @ObfuscatedName("az.j(Lkx;II)V")
    public static final void method474(class299 arg0, int arg1) {
        int var2 = arg0.field3704;
        field1232 = 0;
        method3355(arg0);
        for (int var3 = 0; var3 < field1232; var3++) {
            int var4 = field1233[var3];
            class67 var5 = client.field740[var4];
            int var6 = arg0.method5179();
            if ((var6 & 0x8) != 0) {
                var6 += arg0.method5179() << 8;
            }
            byte var7 = -1;
            if ((var6 & 0x40) != 0) {
                int var8 = arg0.method5080();
                if (var8 > 0) {
                    for (int var9 = 0; var9 < var8; var9++) {
                        int var10 = -1;
                        int var11 = -1;
                        int var12 = -1;
                        int var13 = arg0.method5113();
                        if (var13 == 32767) {
                            var13 = arg0.method5113();
                            var11 = arg0.method5113();
                            var10 = arg0.method5113();
                            var12 = arg0.method5113();
                        } else if (var13 == 32766) {
                            var13 = -1;
                        } else {
                            var11 = arg0.method5113();
                        }
                        int var14 = arg0.method5113();
                        var5.method1565(var13, var11, var10, var12, client.field635, var14);
                    }
                }
                int var15 = arg0.method5081();
                if (var15 > 0) {
                    for (int var16 = 0; var16 < var15; var16++) {
                        int var17 = arg0.method5113();
                        int var18 = arg0.method5113();
                        if (var18 == 32767) {
                            var5.method1564(var17);
                        } else {
                            int var19 = arg0.method5113();
                            int var20 = arg0.method5080();
                            int var21 = var18 > 0 ? arg0.method5179() : var20;
                            var5.method1563(var17, client.field635, var18, var19, var20, var21);
                        }
                    }
                }
            }
            if ((var6 & 0x200) != 0) {
                var5.field956 = arg0.method5091();
                int var22 = arg0.method5099();
                var5.field960 = var22 >> 16;
                var5.field959 = (var22 & 0xFFFF) + client.field635;
                var5.field923 = 0;
                var5.field958 = 0;
                if (var5.field959 > client.field635) {
                    var5.field923 = -1;
                }
                if (var5.field956 == 65535) {
                    var5.field956 = -1;
                }
            }
            if ((var6 & 0x1000) != 0) {
                var7 = arg0.method5260();
            }
            if ((var6 & 0x400) != 0) {
                var5.field961 = arg0.method5085();
                var5.field955 = arg0.method5260();
                var5.field962 = arg0.method5260();
                var5.field964 = arg0.method5085();
                var5.field942 = arg0.method5090() + client.field635;
                var5.field966 = arg0.method5089() + client.field635;
                var5.field967 = arg0.method5054();
                if (var5.field615) {
                    var5.field961 += var5.field616;
                    var5.field955 += var5.field597;
                    var5.field962 += var5.field616;
                    var5.field964 += var5.field597;
                    var5.field973 = 0;
                } else {
                    var5.field961 += var5.field975[0];
                    var5.field955 += var5.field945[0];
                    var5.field962 += var5.field975[0];
                    var5.field964 += var5.field945[0];
                    var5.field973 = 1;
                }
                var5.field948 = 0;
            }
            if ((var6 & 0x20) != 0) {
                var5.field931 = arg0.method5150();
                if (var5.field931.charAt(0) == '~') {
                    var5.field931 = var5.field931.substring(1);
                    class92.method3602(2, var5.field591.method4767(), var5.field931);
                } else if (Statics.field177 == var5) {
                    class92.method3602(2, var5.field591.method4767(), var5.field931);
                }
                var5.field934 = false;
                var5.field935 = 0;
                var5.field936 = 0;
                var5.field938 = 150;
            }
            if ((var6 & 0x4) != 0) {
                var5.field947 = arg0.method5089();
                if (var5.field973 == 0) {
                    var5.field932 = var5.field947;
                    var5.field947 = -1;
                }
            }
            if ((var6 & 0x1) != 0) {
                int var23 = arg0.method5082();
                byte[] var24 = new byte[var23];
                class300 var25 = new class300(var24);
                arg0.method5101(var24, 0, var23);
                field1220[var4] = var25;
                var5.method1061(var25);
            }
            if ((var6 & 0x2) != 0) {
                var5.field925 = arg0.method5090();
                if (var5.field925 == 65535) {
                    var5.field925 = -1;
                }
            }
            if ((var6 & 0x800) != 0) {
                field1231[var4] = arg0.method5260();
            }
            if ((var6 & 0x10) != 0) {
                int var26 = arg0.method5090();
                class229 var27 = (class229) class196.method1723(class229.method3368(), arg0.method5179());
                boolean var28 = arg0.method5081() == 1;
                int var29 = arg0.method5179();
                int var30 = arg0.field3704;
                if (var5.field591 != null && var5.field590 != null) {
                    boolean var31 = false;
                    if (var27.field3075 && Statics.field265.method1724(var5.field591)) {
                        var31 = true;
                    }
                    if (!var31 && client.field738 == 0 && !var5.field589) {
                        field1234.field3704 = 0;
                        arg0.method5063(field1234.field3701, 0, var29);
                        field1234.field3704 = 0;
                        String var32 = class296.method4987(class291.method3357(class211.method722(field1234)));
                        var5.field931 = var32.trim();
                        var5.field935 = var26 >> 8;
                        var5.field936 = var26 & 0xFF;
                        var5.field938 = 150;
                        var5.field934 = var28;
                        var5.field927 = Statics.field177 != var5 && var27.field3075 && client.field669 != "" && var32.toLowerCase().indexOf(client.field669) == -1;
                        int var33;
                        if (var27.field3072) {
                            var33 = var28 ? 91 : 1;
                        } else {
                            var33 = var28 ? 90 : 2;
                        }
                        if (var27.field3070 == -1) {
                            class92.method3602(var33, var5.field591.method4767(), var32);
                        } else {
                            class92.method3602(var33, class82.method248(var27.field3070) + var5.field591.method4767(), var32);
                        }
                    }
                }
                arg0.field3704 = var29 + var30;
            }
            if ((var6 & 0x100) != 0) {
                for (int var34 = 0; var34 < 3; var34++) {
                    var5.field601[var34] = arg0.method5150();
                }
            }
            if ((var6 & 0x80) != 0) {
                int var35 = arg0.method5054();
                if (var35 == 65535) {
                    var35 = -1;
                }
                int var36 = arg0.method5179();
                client.method4758(var5, var35, var36);
            }
            if (var5.field615) {
                if (var7 == 127) {
                    var5.method1071(var5.field616, var5.field597);
                } else {
                    byte var37;
                    if (var7 == -1) {
                        var37 = field1231[var4];
                    } else {
                        var37 = var7;
                    }
                    var5.method1067(var5.field616, var5.field597, var37);
                }
            }
        }
        if (arg0.field3704 - var2 != arg1) {
            throw new RuntimeException(arg0.field3704 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("gw.i(Lkx;I)V")
    public static final void method3355(class299 arg0) {
        int var1 = 0;
        arg0.method5000();
        for (int var2 = 0; var2 < field1230; var2++) {
            int var3 = field1225[var2];
            if ((field1222[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1222[var3] = (byte) (field1222[var3] | 0x2);
                } else {
                    int var4 = arg0.method5001(1);
                    if (var4 == 0) {
                        var1 = method3121(arg0);
                        field1222[var3] = (byte) (field1222[var3] | 0x2);
                    } else {
                        method3761(arg0, var3);
                    }
                }
            }
        }
        arg0.method5002();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5000();
        for (int var5 = 0; var5 < field1230; var5++) {
            int var6 = field1225[var5];
            if ((field1222[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1222[var6] = (byte) (field1222[var6] | 0x2);
                } else {
                    int var7 = arg0.method5001(1);
                    if (var7 == 0) {
                        var1 = method3121(arg0);
                        field1222[var6] = (byte) (field1222[var6] | 0x2);
                    } else {
                        method3761(arg0, var6);
                    }
                }
            }
        }
        arg0.method5002();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5000();
        for (int var8 = 0; var8 < field1227; var8++) {
            int var9 = field1228[var8];
            if ((field1222[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1222[var9] = (byte) (field1222[var9] | 0x2);
                } else {
                    int var10 = arg0.method5001(1);
                    if (var10 == 0) {
                        var1 = method3121(arg0);
                        field1222[var9] = (byte) (field1222[var9] | 0x2);
                    } else if (method166(arg0, var9)) {
                        field1222[var9] = (byte) (field1222[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method5002();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5000();
        for (int var11 = 0; var11 < field1227; var11++) {
            int var12 = field1228[var11];
            if ((field1222[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1222[var12] = (byte) (field1222[var12] | 0x2);
                } else {
                    int var13 = arg0.method5001(1);
                    if (var13 == 0) {
                        var1 = method3121(arg0);
                        field1222[var12] = (byte) (field1222[var12] | 0x2);
                    } else if (method166(arg0, var12)) {
                        field1222[var12] = (byte) (field1222[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method5002();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1230 = 0;
        field1227 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1222[var14] = (byte) (field1222[var14] >> 1);
            class67 var15 = client.field740[var14];
            if (var15 == null) {
                field1228[++field1227 - 1] = var14;
            } else {
                field1225[++field1230 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("eu.k(Lkx;I)I")
    public static int method3121(class299 arg0) {
        int var1 = arg0.method5001(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method5001(5);
        } else if (var1 == 2) {
            var2 = arg0.method5001(8);
        } else {
            var2 = arg0.method5001(11);
        }
        return var2;
    }

    @ObfuscatedName("hv.u(Lkx;II)V")
    public static void method3761(class299 arg0, int arg1) {
        boolean var2 = arg0.method5001(1) == 1;
        if (var2) {
            field1233[++field1232 - 1] = arg1;
        }
        int var3 = arg0.method5001(2);
        class67 var4 = client.field740[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field615 = false;
            } else if (client.field741 == arg1) {
                throw new RuntimeException();
            } else {
                field1223[arg1] = (Statics.field2085 + var4.field945[0] >> 13) + (Statics.field1299 + var4.field975[0] >> 13 << 14) + (var4.field611 << 28);
                if (var4.field947 == -1) {
                    field1226[arg1] = var4.field932;
                } else {
                    field1226[arg1] = var4.field947;
                }
                field1224[arg1] = var4.field925;
                client.field740[arg1] = null;
                if (arg0.method5001(1) != 0) {
                    method166(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method5001(3);
            int var6 = var4.field975[0];
            int var7 = var4.field945[0];
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
            if (client.field741 == arg1 && var4.field957 < 1536 || var4.field918 < 1536 || var4.field957 >= 11776 || var4.field918 >= 11776) {
                var4.method1071(var6, var7);
                var4.field615 = false;
            } else if (var2) {
                var4.field615 = true;
                var4.field616 = var6;
                var4.field597 = var7;
            } else {
                var4.field615 = false;
                var4.method1067(var6, var7, field1231[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method5001(4);
            int var9 = var4.field975[0];
            int var10 = var4.field945[0];
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
            if (client.field741 == arg1 && var4.field957 < 1536 || var4.field918 < 1536 || var4.field957 >= 11776 || var4.field918 >= 11776) {
                var4.method1071(var9, var10);
                var4.field615 = false;
            } else if (var2) {
                var4.field615 = true;
                var4.field616 = var9;
                var4.field597 = var10;
            } else {
                var4.field615 = false;
                var4.method1067(var9, var10, field1231[arg1]);
            }
        } else {
            int var11 = arg0.method5001(1);
            if (var11 == 0) {
                int var12 = arg0.method5001(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field975[0] + var14;
                int var17 = var4.field945[0] + var15;
                if (client.field741 == arg1 && var4.field957 < 1536 || var4.field918 < 1536 || var4.field957 >= 11776 || var4.field918 >= 11776) {
                    var4.method1071(var16, var17);
                    var4.field615 = false;
                } else if (var2) {
                    var4.field615 = true;
                    var4.field616 = var16;
                    var4.field597 = var17;
                } else {
                    var4.field615 = false;
                    var4.method1067(var16, var17, field1231[arg1]);
                }
                var4.field611 = (byte) (var4.field611 + var13 & 0x3);
                if (client.field741 == arg1) {
                    Statics.field519 = var4.field611;
                }
            } else {
                int var18 = arg0.method5001(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1299 + var4.field975[0] + var20 & 0x3FFF) - Statics.field1299;
                int var23 = (Statics.field2085 + var4.field945[0] + var21 & 0x3FFF) - Statics.field2085;
                if (client.field741 == arg1 && var4.field957 < 1536 || var4.field918 < 1536 || var4.field957 >= 11776 || var4.field918 >= 11776) {
                    var4.method1071(var22, var23);
                    var4.field615 = false;
                } else if (var2) {
                    var4.field615 = true;
                    var4.field616 = var22;
                    var4.field597 = var23;
                } else {
                    var4.field615 = false;
                    var4.method1067(var22, var23, field1231[arg1]);
                }
                var4.field611 = (byte) (var4.field611 + var19 & 0x3);
                if (client.field741 == arg1) {
                    Statics.field519 = var4.field611;
                }
            }
        }
    }

    @ObfuscatedName("e.n(Lkx;II)Z")
    public static boolean method166(class299 arg0, int arg1) {
        int var2 = arg0.method5001(2);
        if (var2 == 0) {
            if (arg0.method5001(1) != 0) {
                method166(arg0, arg1);
            }
            int var3 = arg0.method5001(13);
            int var4 = arg0.method5001(13);
            boolean var5 = arg0.method5001(1) == 1;
            if (var5) {
                field1233[++field1232 - 1] = arg1;
            }
            if (client.field740[arg1] != null) {
                throw new RuntimeException();
            }
            class67 var6 = client.field740[arg1] = new class67();
            var6.field612 = arg1;
            if (field1220[arg1] != null) {
                var6.method1061(field1220[arg1]);
            }
            var6.field932 = field1226[arg1];
            var6.field925 = field1224[arg1];
            int var7 = field1223[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field976[0] = field1231[arg1];
            var6.field611 = (byte) var8;
            var6.method1071((var9 << 13) + var3 - Statics.field1299, (var10 << 13) + var4 - Statics.field2085);
            var6.field615 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method5001(2);
            int var12 = field1223[arg1];
            field1223[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method5001(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1223[arg1];
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
            field1223[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method5001(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1223[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1223[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("cd.t(I)V")
    public static void method1878() {
        field1230 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1220[var0] = null;
            field1231[var0] = 1;
        }
    }
}
