package deob;

@ObfuscatedName("ax")
public class class46 {

    @ObfuscatedName("ax.f")
    public static byte[] field906 = new byte[2048];

    @ObfuscatedName("ax.k")
    public static byte[] field914 = new byte[2048];

    @ObfuscatedName("ax.g")
    public static class154[] field908 = new class154[2048];

    @ObfuscatedName("ax.n")
    public static int field909 = 0;

    @ObfuscatedName("ax.a")
    public static int[] field904 = new int[2048];

    @ObfuscatedName("ax.q")
    public static int field911 = 0;

    @ObfuscatedName("ax.w")
    public static int[] field912 = new int[2048];

    @ObfuscatedName("ax.v")
    public static int[] field913 = new int[2048];

    @ObfuscatedName("ax.h")
    public static int[] field916 = new int[2048];

    @ObfuscatedName("ax.p")
    public static int[] field905 = new int[2048];

    @ObfuscatedName("ax.l")
    public static int field925 = 0;

    @ObfuscatedName("ax.c")
    public static int[] field918 = new int[2048];

    @ObfuscatedName("ax.m")
    public static class154 field910 = new class154(new byte[5000]);

    public class46() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.i(Lfx;B)V")
    public static final void method440(class160 arg0) {
        arg0.method2784();
        int var1 = client.field441;
        class24 var2 = Statics.field810 = client.field409[var1] = new class24();
        var2.field263 = var1;
        int var3 = arg0.method2785(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field632[0] = var5 - Statics.field164;
        var2.field629 = (var2.field632[0] << 7) + (var2.method210() << 6);
        var2.field655[0] = var6 - Statics.field209;
        var2.field600 = (var2.field655[0] << 7) + (var2.method210() << 6);
        Statics.field2355 = var2.field262 = var4;
        if (field908[var1] != null) {
            var2.method209(field908[var1]);
        }
        field909 = 0;
        field904[++field909 - 1] = var1;
        field906[var1] = 0;
        field911 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2785(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field913[var7] = (var9 << 28) + (var10 << 14) + var11;
                field916[var7] = 0;
                field905[var7] = -1;
                field912[++field911 - 1] = var7;
                field906[var7] = 0;
            }
        }
        arg0.method2789();
    }

    @ObfuscatedName("fu.e(Lfx;I)V")
    public static final void method2982(class160 arg0) {
        int var1 = 0;
        arg0.method2784();
        for (int var2 = 0; var2 < field909; var2++) {
            int var3 = field904[var2];
            if ((field906[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field906[var3] = (byte) (field906[var3] | 0x2);
                } else {
                    int var4 = arg0.method2785(1);
                    if (var4 == 0) {
                        var1 = Statics.method706(arg0);
                        field906[var3] = (byte) (field906[var3] | 0x2);
                    } else {
                        method1100(arg0, var3);
                    }
                }
            }
        }
        arg0.method2789();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2784();
        for (int var5 = 0; var5 < field909; var5++) {
            int var6 = field904[var5];
            if ((field906[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field906[var6] = (byte) (field906[var6] | 0x2);
                } else {
                    int var7 = arg0.method2785(1);
                    if (var7 == 0) {
                        var1 = Statics.method706(arg0);
                        field906[var6] = (byte) (field906[var6] | 0x2);
                    } else {
                        method1100(arg0, var6);
                    }
                }
            }
        }
        arg0.method2789();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2784();
        for (int var8 = 0; var8 < field911; var8++) {
            int var9 = field912[var8];
            if ((field906[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field906[var9] = (byte) (field906[var9] | 0x2);
                } else {
                    int var10 = arg0.method2785(1);
                    if (var10 == 0) {
                        var1 = Statics.method706(arg0);
                        field906[var9] = (byte) (field906[var9] | 0x2);
                    } else if (method2102(arg0, var9)) {
                        field906[var9] = (byte) (field906[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2789();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2784();
        for (int var11 = 0; var11 < field911; var11++) {
            int var12 = field912[var11];
            if ((field906[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field906[var12] = (byte) (field906[var12] | 0x2);
                } else {
                    int var13 = arg0.method2785(1);
                    if (var13 == 0) {
                        var1 = Statics.method706(arg0);
                        field906[var12] = (byte) (field906[var12] | 0x2);
                    } else if (method2102(arg0, var12)) {
                        field906[var12] = (byte) (field906[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2789();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field909 = 0;
        field911 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field906[var14] = (byte) (field906[var14] >> 1);
            class24 var15 = client.field409[var14];
            if (var15 == null) {
                field912[++field911 - 1] = var14;
            } else {
                field904[++field909 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("bp.k(Lfx;IB)V")
    public static void method1100(class160 arg0, int arg1) {
        boolean var2 = arg0.method2785(1) == 1;
        if (var2) {
            field918[++field925 - 1] = arg1;
        }
        int var3 = arg0.method2785(2);
        class24 var4 = client.field409[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field264 = false;
            } else if (client.field441 == arg1) {
                throw new RuntimeException();
            } else {
                field913[arg1] = (Statics.field209 + var4.field655[0] >> 6) + (Statics.field164 + var4.field632[0] >> 6 << 14) + (var4.field262 << 28);
                if (var4.field627 == -1) {
                    field916[arg1] = var4.field650;
                } else {
                    field916[arg1] = var4.field627;
                }
                field905[arg1] = var4.field625;
                client.field409[arg1] = null;
                if (arg0.method2785(1) != 0) {
                    method2102(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2785(3);
            int var6 = var4.field632[0];
            int var7 = var4.field655[0];
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
            if (client.field441 == arg1 && var4.field629 < 1536 || var4.field600 < 1536 || var4.field629 >= 11776 || var4.field600 >= 11776) {
                var4.method236(var6, var7);
                var4.field264 = false;
            } else if (var2) {
                var4.field264 = true;
                var4.field265 = var6;
                var4.field266 = var7;
            } else {
                var4.field264 = false;
                var4.method222(var6, var7, field914[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2785(4);
            int var9 = var4.field632[0];
            int var10 = var4.field655[0];
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
            if (client.field441 == arg1 && var4.field629 < 1536 || var4.field600 < 1536 || var4.field629 >= 11776 || var4.field600 >= 11776) {
                var4.method236(var9, var10);
                var4.field264 = false;
            } else if (var2) {
                var4.field264 = true;
                var4.field265 = var9;
                var4.field266 = var10;
            } else {
                var4.field264 = false;
                var4.method222(var9, var10, field914[arg1]);
            }
        } else {
            int var11 = arg0.method2785(1);
            if (var11 == 0) {
                int var12 = arg0.method2785(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field632[0] + var14;
                int var17 = var4.field655[0] + var15;
                if (client.field441 == arg1 && var4.field629 < 1536 || var4.field600 < 1536 || var4.field629 >= 11776 || var4.field600 >= 11776) {
                    var4.method236(var16, var17);
                    var4.field264 = false;
                } else if (var2) {
                    var4.field264 = true;
                    var4.field265 = var16;
                    var4.field266 = var17;
                } else {
                    var4.field264 = false;
                    var4.method222(var16, var17, field914[arg1]);
                }
                var4.field262 = (byte) (var4.field262 + var13 & 0x3);
                if (client.field441 == arg1) {
                    Statics.field2355 = var4.field262;
                }
            } else {
                int var18 = arg0.method2785(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field164 + var4.field632[0] + var20 & 0x3FFF) - Statics.field164;
                int var23 = (Statics.field209 + var4.field655[0] + var21 & 0x3FFF) - Statics.field209;
                if (client.field441 == arg1 && var4.field629 < 1536 || var4.field600 < 1536 || var4.field629 >= 11776 || var4.field600 >= 11776) {
                    var4.method236(var22, var23);
                    var4.field264 = false;
                } else if (var2) {
                    var4.field264 = true;
                    var4.field265 = var22;
                    var4.field266 = var23;
                } else {
                    var4.field264 = false;
                    var4.method222(var22, var23, field914[arg1]);
                }
                var4.field262 = (byte) (var4.field262 + var19 & 0x3);
                if (client.field441 == arg1) {
                    Statics.field2355 = var4.field262;
                }
            }
        }
    }

    @ObfuscatedName("df.a(Lfx;II)Z")
    public static boolean method2102(class160 arg0, int arg1) {
        int var2 = arg0.method2785(2);
        if (var2 == 0) {
            if (arg0.method2785(1) != 0) {
                method2102(arg0, arg1);
            }
            int var3 = arg0.method2785(6);
            int var4 = arg0.method2785(6);
            boolean var5 = arg0.method2785(1) == 1;
            if (var5) {
                field918[++field925 - 1] = arg1;
            }
            if (client.field409[arg1] != null) {
                throw new RuntimeException();
            }
            class24 var6 = client.field409[arg1] = new class24();
            var6.field263 = arg1;
            if (field908[arg1] != null) {
                var6.method209(field908[arg1]);
            }
            var6.field650 = field916[arg1];
            var6.field625 = field905[arg1];
            int var7 = field913[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field656[0] = field914[arg1];
            var6.field262 = (byte) var8;
            var6.method236((var9 << 6) + var3 - Statics.field164, (var10 << 6) + var4 - Statics.field209);
            var6.field264 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2785(2);
            int var12 = field913[arg1];
            field913[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2785(5);
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
            int var20 = arg0.method2785(18);
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

    @ObfuscatedName("fl.q(I)V")
    public static void method2868() {
        field909 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field908[var0] = null;
            field914[var0] = 1;
        }
    }
}
