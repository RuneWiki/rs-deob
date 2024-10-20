package deob;

@ObfuscatedName("al")
public class class33 {

    @ObfuscatedName("al.v")
    public static byte[] field765 = new byte[2048];

    @ObfuscatedName("al.n")
    public static byte[] field766 = new byte[2048];

    @ObfuscatedName("al.f")
    public static class119[] field767 = new class119[2048];

    @ObfuscatedName("al.g")
    public static int field774 = 0;

    @ObfuscatedName("al.o")
    public static int[] field769 = new int[2048];

    @ObfuscatedName("al.s")
    public static int field770 = 0;

    @ObfuscatedName("al.k")
    public static int[] field771 = new int[2048];

    @ObfuscatedName("al.b")
    public static int[] field772 = new int[2048];

    @ObfuscatedName("al.c")
    public static int[] field773 = new int[2048];

    @ObfuscatedName("al.l")
    public static int[] field763 = new int[2048];

    @ObfuscatedName("al.p")
    public static int field764 = 0;

    @ObfuscatedName("al.d")
    public static int[] field775 = new int[2048];

    @ObfuscatedName("al.i")
    public static class119 field777 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bk.h(Ldp;I)V")
    public static final void method1247(class122 arg0) {
        arg0.method2629();
        int var1 = client.field422;
        class3 var2 = Statics.field101 = client.field421[var1] = new class3();
        var2.field55 = var1;
        int var3 = arg0.method2630(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field870[0] = var5 - Statics.field2719;
        var2.field853 = (var2.field870[0] << 7) + (var2.method11() << 6);
        var2.field817[0] = var6 - Statics.field607;
        var2.field843 = (var2.field817[0] << 7) + (var2.method11() << 6);
        Statics.field721 = var2.field51 = var4;
        if (field767[var1] != null) {
            var2.method12(field767[var1]);
        }
        field774 = 0;
        field769[++field774 - 1] = var1;
        field765[var1] = 0;
        field770 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2630(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field772[var7] = (var9 << 28) + (var10 << 14) + var11;
                field773[var7] = 0;
                field763[var7] = -1;
                field771[++field770 - 1] = var7;
                field765[var7] = 0;
            }
        }
        arg0.method2644();
    }

    @ObfuscatedName("aa.q(Ldp;I)I")
    public static int method634(class122 arg0) {
        int var1 = arg0.method2630(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2630(5);
        } else if (var1 == 2) {
            var2 = arg0.method2630(8);
        } else {
            var2 = arg0.method2630(11);
        }
        return var2;
    }

    @ObfuscatedName("em.v(Ldp;II)V")
    public static void method2753(class122 arg0, int arg1) {
        boolean var2 = arg0.method2630(1) == 1;
        if (var2) {
            field775[++field764 - 1] = arg1;
        }
        int var3 = arg0.method2630(2);
        class3 var4 = client.field421[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field40 = false;
            } else if (client.field422 == arg1) {
                throw new RuntimeException();
            } else {
                field772[arg1] = (Statics.field607 + var4.field817[0] >> 6) + (Statics.field2719 + var4.field870[0] >> 6 << 14) + (var4.field51 << 28);
                if (var4.field868 == -1) {
                    field773[arg1] = var4.field866;
                } else {
                    field773[arg1] = var4.field868;
                }
                field763[arg1] = var4.field841;
                client.field421[arg1] = null;
                if (arg0.method2630(1) != 0) {
                    Statics.method2972(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2630(3);
            int var6 = var4.field870[0];
            int var7 = var4.field817[0];
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
            if (client.field422 == arg1 && var4.field853 < 1536 || var4.field843 < 1536 || var4.field853 >= 11776 || var4.field843 >= 11776) {
                var4.method16(var6, var7);
                var4.field40 = false;
            } else if (var2) {
                var4.field40 = true;
                var4.field52 = var6;
                var4.field37 = var7;
            } else {
                var4.field40 = false;
                var4.method15(var6, var7, field766[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2630(4);
            int var9 = var4.field870[0];
            int var10 = var4.field817[0];
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
            if (client.field422 == arg1 && var4.field853 < 1536 || var4.field843 < 1536 || var4.field853 >= 11776 || var4.field843 >= 11776) {
                var4.method16(var9, var10);
                var4.field40 = false;
            } else if (var2) {
                var4.field40 = true;
                var4.field52 = var9;
                var4.field37 = var10;
            } else {
                var4.field40 = false;
                var4.method15(var9, var10, field766[arg1]);
            }
        } else {
            int var11 = arg0.method2630(1);
            if (var11 == 0) {
                int var12 = arg0.method2630(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field870[0] + var14;
                int var17 = var4.field817[0] + var15;
                if (client.field422 == arg1 && var4.field853 < 1536 || var4.field843 < 1536 || var4.field853 >= 11776 || var4.field843 >= 11776) {
                    var4.method16(var16, var17);
                    var4.field40 = false;
                } else if (var2) {
                    var4.field40 = true;
                    var4.field52 = var16;
                    var4.field37 = var17;
                } else {
                    var4.field40 = false;
                    var4.method15(var16, var17, field766[arg1]);
                }
                var4.field51 = (byte) (var4.field51 + var13 & 0x3);
                if (client.field422 == arg1) {
                    Statics.field721 = var4.field51;
                }
            } else {
                int var18 = arg0.method2630(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2719 + var4.field870[0] + var20 & 0x3FFF) - Statics.field2719;
                int var23 = (Statics.field607 + var4.field817[0] + var21 & 0x3FFF) - Statics.field607;
                if (client.field422 == arg1 && var4.field853 < 1536 || var4.field843 < 1536 || var4.field853 >= 11776 || var4.field843 >= 11776) {
                    var4.method16(var22, var23);
                    var4.field40 = false;
                } else if (var2) {
                    var4.field40 = true;
                    var4.field52 = var22;
                    var4.field37 = var23;
                } else {
                    var4.field40 = false;
                    var4.method15(var22, var23, field766[arg1]);
                }
                var4.field51 = (byte) (var4.field51 + var19 & 0x3);
                if (client.field422 == arg1) {
                    Statics.field721 = var4.field51;
                }
            }
        }
    }

    @ObfuscatedName("cs.f(S)V")
    public static void method2073() {
        field774 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field767[var0] = null;
            field766[var0] = 1;
        }
    }
}
