package deob;

@ObfuscatedName("cl")
public class class84 {

    @ObfuscatedName("cl.e")
    public static byte[] field1201 = new byte[2048];

    @ObfuscatedName("cl.b")
    public static byte[] field1202 = new byte[2048];

    @ObfuscatedName("cl.l")
    public static class185[] field1213 = new class185[2048];

    @ObfuscatedName("cl.w")
    public static int field1204 = 0;

    @ObfuscatedName("cl.d")
    public static int[] field1209 = new int[2048];

    @ObfuscatedName("cl.n")
    public static int field1205 = 0;

    @ObfuscatedName("cl.s")
    public static int[] field1207 = new int[2048];

    @ObfuscatedName("cl.g")
    public static int[] field1215 = new int[2048];

    @ObfuscatedName("cl.a")
    public static int[] field1199 = new int[2048];

    @ObfuscatedName("cl.r")
    public static int[] field1210 = new int[2048];

    @ObfuscatedName("cl.k")
    public static int field1211 = 0;

    @ObfuscatedName("cl.m")
    public static int[] field1212 = new int[2048];

    @ObfuscatedName("cl.q")
    public static class185 field1203 = new class185(new byte[5000]);

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gw.f(Lgh;I)V")
    public static final void method3580(class192 arg0) {
        arg0.method3586();
        int var1 = client.field781;
        class62 var2 = Statics.field502 = client.field727[var1] = new class62();
        var2.field588 = var1;
        int var3 = arg0.method3590(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field958[0] = var5 - Statics.field1225;
        var2.field953 = (var2.field958[0] << 7) + (var2.method1018() << 6);
        var2.field944[0] = var6 - Statics.field64;
        var2.field919 = (var2.field944[0] << 7) + (var2.method1018() << 6);
        Statics.field517 = var2.field592 = var4;
        if (field1213[var1] != null) {
            var2.method1056(field1213[var1]);
        }
        field1204 = 0;
        field1209[++field1204 - 1] = var1;
        field1201[var1] = 0;
        field1205 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3590(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1215[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1199[var7] = 0;
                field1210[var7] = -1;
                field1207[++field1205 - 1] = var7;
                field1201[var7] = 0;
            }
        }
        arg0.method3587();
    }

    @ObfuscatedName("bp.h(Lgh;I)I")
    public static int method1703(class192 arg0) {
        int var1 = arg0.method3590(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3590(5);
        } else if (var1 == 2) {
            var2 = arg0.method3590(8);
        } else {
            var2 = arg0.method3590(11);
        }
        return var2;
    }

    @ObfuscatedName("dv.e(Lgh;II)V")
    public static void method2863(class192 arg0, int arg1) {
        boolean var2 = arg0.method3590(1) == 1;
        if (var2) {
            field1212[++field1211 - 1] = arg1;
        }
        int var3 = arg0.method3590(2);
        class62 var4 = client.field727[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field591 = false;
            } else if (client.field781 == arg1) {
                throw new RuntimeException();
            } else {
                field1215[arg1] = (Statics.field64 + var4.field944[0] >> 13) + (Statics.field1225 + var4.field958[0] >> 13 << 14) + (var4.field592 << 28);
                if (var4.field931 == -1) {
                    field1199[arg1] = var4.field954;
                } else {
                    field1199[arg1] = var4.field931;
                }
                field1210[arg1] = var4.field929;
                client.field727[arg1] = null;
                if (arg0.method3590(1) != 0) {
                    method4073(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3590(3);
            int var6 = var4.field958[0];
            int var7 = var4.field944[0];
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
            if (client.field781 == arg1 && var4.field953 < 1536 || var4.field919 < 1536 || var4.field953 >= 11776 || var4.field919 >= 11776) {
                var4.method1021(var6, var7);
                var4.field591 = false;
            } else if (var2) {
                var4.field591 = true;
                var4.field579 = var6;
                var4.field598 = var7;
            } else {
                var4.field591 = false;
                var4.method1027(var6, var7, field1202[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3590(4);
            int var9 = var4.field958[0];
            int var10 = var4.field944[0];
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
            if (client.field781 == arg1 && var4.field953 < 1536 || var4.field919 < 1536 || var4.field953 >= 11776 || var4.field919 >= 11776) {
                var4.method1021(var9, var10);
                var4.field591 = false;
            } else if (var2) {
                var4.field591 = true;
                var4.field579 = var9;
                var4.field598 = var10;
            } else {
                var4.field591 = false;
                var4.method1027(var9, var10, field1202[arg1]);
            }
        } else {
            int var11 = arg0.method3590(1);
            if (var11 == 0) {
                int var12 = arg0.method3590(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field958[0] + var14;
                int var17 = var4.field944[0] + var15;
                if (client.field781 == arg1 && var4.field953 < 1536 || var4.field919 < 1536 || var4.field953 >= 11776 || var4.field919 >= 11776) {
                    var4.method1021(var16, var17);
                    var4.field591 = false;
                } else if (var2) {
                    var4.field591 = true;
                    var4.field579 = var16;
                    var4.field598 = var17;
                } else {
                    var4.field591 = false;
                    var4.method1027(var16, var17, field1202[arg1]);
                }
                var4.field592 = (byte) (var4.field592 + var13 & 0x3);
                if (client.field781 == arg1) {
                    Statics.field517 = var4.field592;
                }
            } else {
                int var18 = arg0.method3590(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1225 + var4.field958[0] + var20 & 0x3FFF) - Statics.field1225;
                int var23 = (Statics.field64 + var4.field944[0] + var21 & 0x3FFF) - Statics.field64;
                if (client.field781 == arg1 && var4.field953 < 1536 || var4.field919 < 1536 || var4.field953 >= 11776 || var4.field919 >= 11776) {
                    var4.method1021(var22, var23);
                    var4.field591 = false;
                } else if (var2) {
                    var4.field591 = true;
                    var4.field579 = var22;
                    var4.field598 = var23;
                } else {
                    var4.field591 = false;
                    var4.method1027(var22, var23, field1202[arg1]);
                }
                var4.field592 = (byte) (var4.field592 + var19 & 0x3);
                if (client.field781 == arg1) {
                    Statics.field517 = var4.field592;
                }
            }
        }
    }

    @ObfuscatedName("ht.b(Lgh;IB)Z")
    public static boolean method4073(class192 arg0, int arg1) {
        int var2 = arg0.method3590(2);
        if (var2 == 0) {
            if (arg0.method3590(1) != 0) {
                method4073(arg0, arg1);
            }
            int var3 = arg0.method3590(13);
            int var4 = arg0.method3590(13);
            boolean var5 = arg0.method3590(1) == 1;
            if (var5) {
                field1212[++field1211 - 1] = arg1;
            }
            if (client.field727[arg1] != null) {
                throw new RuntimeException();
            }
            class62 var6 = client.field727[arg1] = new class62();
            var6.field588 = arg1;
            if (field1213[arg1] != null) {
                var6.method1056(field1213[arg1]);
            }
            var6.field954 = field1199[arg1];
            var6.field929 = field1210[arg1];
            int var7 = field1215[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field960[0] = field1202[arg1];
            var6.field592 = (byte) var8;
            var6.method1021((var9 << 13) + var3 - Statics.field1225, (var10 << 13) + var4 - Statics.field64);
            var6.field591 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3590(2);
            int var12 = field1215[arg1];
            field1215[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3590(5);
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
            int var20 = arg0.method3590(18);
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
}
