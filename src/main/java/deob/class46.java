package deob;

@ObfuscatedName("an")
public class class46 {

    @ObfuscatedName("an.m")
    public static byte[] field899 = new byte[2048];

    @ObfuscatedName("an.h")
    public static byte[] field902 = new byte[2048];

    @ObfuscatedName("an.w")
    public static class161[] field901 = new class161[2048];

    @ObfuscatedName("an.r")
    public static int field898 = 0;

    @ObfuscatedName("an.c")
    public static int[] field903 = new int[2048];

    @ObfuscatedName("an.p")
    public static int field904 = 0;

    @ObfuscatedName("an.g")
    public static int[] field905 = new int[2048];

    @ObfuscatedName("an.z")
    public static int[] field906 = new int[2048];

    @ObfuscatedName("an.q")
    public static int[] field907 = new int[2048];

    @ObfuscatedName("an.l")
    public static int[] field897 = new int[2048];

    @ObfuscatedName("an.y")
    public static int field909 = 0;

    @ObfuscatedName("an.e")
    public static int[] field910 = new int[2048];

    @ObfuscatedName("an.x")
    public static class161 field900 = new class161(new byte[5000]);

    public class46() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ac.n(Lfm;B)V")
    public static final void method702(class167 arg0) {
        arg0.method3008();
        int var1 = client.field410;
        class24 var2 = Statics.field810 = client.field409[var1] = new class24();
        var2.field266 = var1;
        int var3 = arg0.method3013(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field629[0] = var5 - Statics.field171;
        var2.field648 = (var2.field629[0] << 7) + (var2.method241() << 6);
        var2.field652[0] = var6 - Statics.field464;
        var2.field597 = (var2.field652[0] << 7) + (var2.method241() << 6);
        Statics.field2326 = var2.field268 = var4;
        if (field901[var1] != null) {
            var2.method231(field901[var1]);
        }
        field898 = 0;
        field903[++field898 - 1] = var1;
        field899[var1] = 0;
        field904 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3013(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field906[var7] = (var9 << 28) + (var10 << 14) + var11;
                field907[var7] = 0;
                field897[var7] = -1;
                field905[++field904 - 1] = var7;
                field899[var7] = 0;
            }
        }
        arg0.method3014();
    }

    @ObfuscatedName("fb.d(Lfm;B)I")
    public static int method3088(class167 arg0) {
        int var1 = arg0.method3013(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3013(5);
        } else if (var1 == 2) {
            var2 = arg0.method3013(8);
        } else {
            var2 = arg0.method3013(11);
        }
        return var2;
    }

    @ObfuscatedName("d.m(Lfm;IB)V")
    public static void method15(class167 arg0, int arg1) {
        boolean var2 = arg0.method3013(1) == 1;
        if (var2) {
            field910[++field909 - 1] = arg1;
        }
        int var3 = arg0.method3013(2);
        class24 var4 = client.field409[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field265 = false;
            } else if (client.field410 == arg1) {
                throw new RuntimeException();
            } else {
                field906[arg1] = (Statics.field464 + var4.field652[0] >> 6) + (Statics.field171 + var4.field629[0] >> 6 << 14) + (var4.field268 << 28);
                if (var4.field624 == -1) {
                    field907[arg1] = var4.field647;
                } else {
                    field907[arg1] = var4.field624;
                }
                field897[arg1] = var4.field642;
                client.field409[arg1] = null;
                if (arg0.method3013(1) != 0) {
                    method797(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3013(3);
            int var6 = var4.field629[0];
            int var7 = var4.field652[0];
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
            if (client.field410 == arg1 && var4.field648 < 1536 || var4.field597 < 1536 || var4.field648 >= 11776 || var4.field597 >= 11776) {
                var4.method235(var6, var7);
                var4.field265 = false;
            } else if (var2) {
                var4.field265 = true;
                var4.field248 = var6;
                var4.field269 = var7;
            } else {
                var4.field265 = false;
                var4.method234(var6, var7, field902[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3013(4);
            int var9 = var4.field629[0];
            int var10 = var4.field652[0];
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
            if (client.field410 == arg1 && var4.field648 < 1536 || var4.field597 < 1536 || var4.field648 >= 11776 || var4.field597 >= 11776) {
                var4.method235(var9, var10);
                var4.field265 = false;
            } else if (var2) {
                var4.field265 = true;
                var4.field248 = var9;
                var4.field269 = var10;
            } else {
                var4.field265 = false;
                var4.method234(var9, var10, field902[arg1]);
            }
        } else {
            int var11 = arg0.method3013(1);
            if (var11 == 0) {
                int var12 = arg0.method3013(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field629[0] + var14;
                int var17 = var4.field652[0] + var15;
                if (client.field410 == arg1 && var4.field648 < 1536 || var4.field597 < 1536 || var4.field648 >= 11776 || var4.field597 >= 11776) {
                    var4.method235(var16, var17);
                    var4.field265 = false;
                } else if (var2) {
                    var4.field265 = true;
                    var4.field248 = var16;
                    var4.field269 = var17;
                } else {
                    var4.field265 = false;
                    var4.method234(var16, var17, field902[arg1]);
                }
                var4.field268 = (byte) (var4.field268 + var13 & 0x3);
                if (client.field410 == arg1) {
                    Statics.field2326 = var4.field268;
                }
            } else {
                int var18 = arg0.method3013(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field171 + var4.field629[0] + var20 & 0x3FFF) - Statics.field171;
                int var23 = (Statics.field464 + var4.field652[0] + var21 & 0x3FFF) - Statics.field464;
                if (client.field410 == arg1 && var4.field648 < 1536 || var4.field597 < 1536 || var4.field648 >= 11776 || var4.field597 >= 11776) {
                    var4.method235(var22, var23);
                    var4.field265 = false;
                } else if (var2) {
                    var4.field265 = true;
                    var4.field248 = var22;
                    var4.field269 = var23;
                } else {
                    var4.field265 = false;
                    var4.method234(var22, var23, field902[arg1]);
                }
                var4.field268 = (byte) (var4.field268 + var19 & 0x3);
                if (client.field410 == arg1) {
                    Statics.field2326 = var4.field268;
                }
            }
        }
    }

    @ObfuscatedName("al.h(Lfm;II)Z")
    public static boolean method797(class167 arg0, int arg1) {
        int var2 = arg0.method3013(2);
        if (var2 == 0) {
            if (arg0.method3013(1) != 0) {
                method797(arg0, arg1);
            }
            int var3 = arg0.method3013(6);
            int var4 = arg0.method3013(6);
            boolean var5 = arg0.method3013(1) == 1;
            if (var5) {
                field910[++field909 - 1] = arg1;
            }
            if (client.field409[arg1] != null) {
                throw new RuntimeException();
            }
            class24 var6 = client.field409[arg1] = new class24();
            var6.field266 = arg1;
            if (field901[arg1] != null) {
                var6.method231(field901[arg1]);
            }
            var6.field647 = field907[arg1];
            var6.field642 = field897[arg1];
            int var7 = field906[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field626[0] = field902[arg1];
            var6.field268 = (byte) var8;
            var6.method235((var9 << 6) + var3 - Statics.field171, (var10 << 6) + var4 - Statics.field464);
            var6.field265 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3013(2);
            int var12 = field906[arg1];
            field906[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3013(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field906[arg1];
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
            field906[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3013(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field906[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field906[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("cv.w(B)V")
    public static void method1836() {
        field898 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field901[var0] = null;
            field902[var0] = 1;
        }
    }
}
