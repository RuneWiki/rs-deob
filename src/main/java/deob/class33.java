package deob;

@ObfuscatedName("aa")
public class class33 {

    @ObfuscatedName("aa.q")
    public static byte[] field753 = new byte[2048];

    @ObfuscatedName("aa.g")
    public static byte[] field766 = new byte[2048];

    @ObfuscatedName("aa.m")
    public static class119[] field755 = new class119[2048];

    @ObfuscatedName("aa.t")
    public static int field751 = 0;

    @ObfuscatedName("aa.j")
    public static int[] field752 = new int[2048];

    @ObfuscatedName("aa.n")
    public static int field758 = 0;

    @ObfuscatedName("aa.l")
    public static int[] field770 = new int[2048];

    @ObfuscatedName("aa.i")
    public static int[] field754 = new int[2048];

    @ObfuscatedName("aa.w")
    public static int[] field761 = new int[2048];

    @ObfuscatedName("aa.v")
    public static int[] field762 = new int[2048];

    @ObfuscatedName("aa.o")
    public static int field763 = 0;

    @ObfuscatedName("aa.p")
    public static int[] field764 = new int[2048];

    @ObfuscatedName("aa.b")
    public static class119 field765 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fs.f(Lda;B)V")
    public static final void method3166(class122 arg0) {
        arg0.method2601();
        int var1 = client.field375;
        class3 var2 = Statics.field2054 = client.field296[var1] = new class3();
        var2.field51 = var1;
        int var3 = arg0.method2602(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field827[0] = var5 - Statics.field2576;
        var2.field828 = (var2.field827[0] << 7) + (var2.method17() << 6);
        var2.field872[0] = var6 - Statics.field2133;
        var2.field818 = (var2.field872[0] << 7) + (var2.method17() << 6);
        Statics.field1961 = var2.field28 = var4;
        if (field755[var1] != null) {
            var2.method20(field755[var1]);
        }
        field751 = 0;
        field752[++field751 - 1] = var1;
        field753[var1] = 0;
        field758 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2602(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field754[var7] = (var9 << 28) + (var10 << 14) + var11;
                field761[var7] = 0;
                field762[var7] = -1;
                field770[++field758 - 1] = var7;
                field753[var7] = 0;
            }
        }
        arg0.method2603();
    }

    @ObfuscatedName("ed.s(Lda;B)I")
    public static int method2924(class122 arg0) {
        int var1 = arg0.method2602(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2602(5);
        } else if (var1 == 2) {
            var2 = arg0.method2602(8);
        } else {
            var2 = arg0.method2602(11);
        }
        return var2;
    }

    @ObfuscatedName("b.q(Lda;II)V")
    public static void method159(class122 arg0, int arg1) {
        boolean var2 = arg0.method2602(1) == 1;
        if (var2) {
            field764[++field763 - 1] = arg1;
        }
        int var3 = arg0.method2602(2);
        class3 var4 = client.field296[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field40 = false;
            } else if (client.field375 == arg1) {
                throw new RuntimeException();
            } else {
                field754[arg1] = (Statics.field2133 + var4.field872[0] >> 6) + (Statics.field2576 + var4.field827[0] >> 6 << 14) + (var4.field28 << 28);
                if (var4.field833 == -1) {
                    field761[arg1] = var4.field867;
                } else {
                    field761[arg1] = var4.field833;
                }
                field762[arg1] = var4.field841;
                client.field296[arg1] = null;
                if (arg0.method2602(1) != 0) {
                    method253(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2602(3);
            int var6 = var4.field827[0];
            int var7 = var4.field872[0];
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
            if (client.field375 == arg1 && var4.field828 < 1536 || var4.field818 < 1536 || var4.field828 >= 11776 || var4.field818 >= 11776) {
                var4.method18(var6, var7);
                var4.field40 = false;
            } else if (var2) {
                var4.field40 = true;
                var4.field41 = var6;
                var4.field54 = var7;
            } else {
                var4.field40 = false;
                var4.method36(var6, var7, field766[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2602(4);
            int var9 = var4.field827[0];
            int var10 = var4.field872[0];
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
            if (client.field375 == arg1 && var4.field828 < 1536 || var4.field818 < 1536 || var4.field828 >= 11776 || var4.field818 >= 11776) {
                var4.method18(var9, var10);
                var4.field40 = false;
            } else if (var2) {
                var4.field40 = true;
                var4.field41 = var9;
                var4.field54 = var10;
            } else {
                var4.field40 = false;
                var4.method36(var9, var10, field766[arg1]);
            }
        } else {
            int var11 = arg0.method2602(1);
            if (var11 == 0) {
                int var12 = arg0.method2602(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field827[0] + var14;
                int var17 = var4.field872[0] + var15;
                if (client.field375 == arg1 && var4.field828 < 1536 || var4.field818 < 1536 || var4.field828 >= 11776 || var4.field818 >= 11776) {
                    var4.method18(var16, var17);
                    var4.field40 = false;
                } else if (var2) {
                    var4.field40 = true;
                    var4.field41 = var16;
                    var4.field54 = var17;
                } else {
                    var4.field40 = false;
                    var4.method36(var16, var17, field766[arg1]);
                }
                var4.field28 = (byte) (var4.field28 + var13 & 0x3);
                if (client.field375 == arg1) {
                    Statics.field1961 = var4.field28;
                }
            } else {
                int var18 = arg0.method2602(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2576 + var4.field827[0] + var20 & 0x3FFF) - Statics.field2576;
                int var23 = (Statics.field2133 + var4.field872[0] + var21 & 0x3FFF) - Statics.field2133;
                if (client.field375 == arg1 && var4.field828 < 1536 || var4.field818 < 1536 || var4.field828 >= 11776 || var4.field818 >= 11776) {
                    var4.method18(var22, var23);
                    var4.field40 = false;
                } else if (var2) {
                    var4.field40 = true;
                    var4.field41 = var22;
                    var4.field54 = var23;
                } else {
                    var4.field40 = false;
                    var4.method36(var22, var23, field766[arg1]);
                }
                var4.field28 = (byte) (var4.field28 + var19 & 0x3);
                if (client.field375 == arg1) {
                    Statics.field1961 = var4.field28;
                }
            }
        }
    }

    @ObfuscatedName("client.g(Lda;IB)Z")
    public static boolean method253(class122 arg0, int arg1) {
        int var2 = arg0.method2602(2);
        if (var2 == 0) {
            if (arg0.method2602(1) != 0) {
                method253(arg0, arg1);
            }
            int var3 = arg0.method2602(6);
            int var4 = arg0.method2602(6);
            boolean var5 = arg0.method2602(1) == 1;
            if (var5) {
                field764[++field763 - 1] = arg1;
            }
            if (client.field296[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field296[arg1] = new class3();
            var6.field51 = arg1;
            if (field755[arg1] != null) {
                var6.method20(field755[arg1]);
            }
            var6.field867 = field761[arg1];
            var6.field841 = field762[arg1];
            int var7 = field754[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field873[0] = field766[arg1];
            var6.field28 = (byte) var8;
            var6.method18((var9 << 6) + var3 - Statics.field2576, (var10 << 6) + var4 - Statics.field2133);
            var6.field40 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2602(2);
            int var12 = field754[arg1];
            field754[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2602(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field754[arg1];
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
            field754[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2602(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field754[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field754[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }
}
