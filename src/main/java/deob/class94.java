package deob;

@ObfuscatedName("cx")
public class class94 {

    @ObfuscatedName("cx.i")
    public static byte[] field1395 = new byte[2048];

    @ObfuscatedName("cx.a")
    public static byte[] field1394 = new byte[2048];

    @ObfuscatedName("cx.l")
    public static class195[] field1406 = new class195[2048];

    @ObfuscatedName("cx.b")
    public static int field1397 = 0;

    @ObfuscatedName("cx.e")
    public static int[] field1398 = new int[2048];

    @ObfuscatedName("cx.x")
    public static int field1399 = 0;

    @ObfuscatedName("cx.p")
    public static int[] field1400 = new int[2048];

    @ObfuscatedName("cx.g")
    public static int[] field1401 = new int[2048];

    @ObfuscatedName("cx.n")
    public static int[] field1402 = new int[2048];

    @ObfuscatedName("cx.o")
    public static int[] field1403 = new int[2048];

    @ObfuscatedName("cx.c")
    public static int field1396 = 0;

    @ObfuscatedName("cx.v")
    public static int[] field1405 = new int[2048];

    @ObfuscatedName("cx.u")
    public static class195 field1393 = new class195(new byte[5000]);

    public class94() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ag.q(Lgz;I)I")
    public static int method582(class202 arg0) {
        int var1 = arg0.method3497(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3497(5);
        } else if (var1 == 2) {
            var2 = arg0.method3497(8);
        } else {
            var2 = arg0.method3497(11);
        }
        return var2;
    }

    @ObfuscatedName("if.i(Lgz;IB)V")
    public static void method4088(class202 arg0, int arg1) {
        boolean var2 = arg0.method3497(1) == 1;
        if (var2) {
            field1405[++field1396 - 1] = arg1;
        }
        int var3 = arg0.method3497(2);
        class73 var4 = client.field965[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field821 = false;
            } else if (client.field1056 == arg1) {
                throw new RuntimeException();
            } else {
                field1401[arg1] = (Statics.field2794 + var4.field1194[0] >> 13) + (Statics.field494 + var4.field1193[0] >> 13 << 14) + (var4.field837 << 28);
                if (var4.field1143 == -1) {
                    field1402[arg1] = var4.field1155;
                } else {
                    field1402[arg1] = var4.field1143;
                }
                field1403[arg1] = var4.field1164;
                client.field965[arg1] = null;
                if (arg0.method3497(1) != 0) {
                    method2961(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3497(3);
            int var6 = var4.field1193[0];
            int var7 = var4.field1194[0];
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
            if (client.field1056 == arg1 && var4.field1175 < 1536 || var4.field1138 < 1536 || var4.field1175 >= 11776 || var4.field1138 >= 11776) {
                var4.method1103(var6, var7);
                var4.field821 = false;
            } else if (var2) {
                var4.field821 = true;
                var4.field822 = var6;
                var4.field832 = var7;
            } else {
                var4.field821 = false;
                var4.method1099(var6, var7, field1394[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3497(4);
            int var9 = var4.field1193[0];
            int var10 = var4.field1194[0];
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
            if (client.field1056 == arg1 && var4.field1175 < 1536 || var4.field1138 < 1536 || var4.field1175 >= 11776 || var4.field1138 >= 11776) {
                var4.method1103(var9, var10);
                var4.field821 = false;
            } else if (var2) {
                var4.field821 = true;
                var4.field822 = var9;
                var4.field832 = var10;
            } else {
                var4.field821 = false;
                var4.method1099(var9, var10, field1394[arg1]);
            }
        } else {
            int var11 = arg0.method3497(1);
            if (var11 == 0) {
                int var12 = arg0.method3497(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1193[0] + var14;
                int var17 = var4.field1194[0] + var15;
                if (client.field1056 == arg1 && var4.field1175 < 1536 || var4.field1138 < 1536 || var4.field1175 >= 11776 || var4.field1138 >= 11776) {
                    var4.method1103(var16, var17);
                    var4.field821 = false;
                } else if (var2) {
                    var4.field821 = true;
                    var4.field822 = var16;
                    var4.field832 = var17;
                } else {
                    var4.field821 = false;
                    var4.method1099(var16, var17, field1394[arg1]);
                }
                var4.field837 = (byte) (var4.field837 + var13 & 0x3);
                if (client.field1056 == arg1) {
                    Statics.field3841 = var4.field837;
                }
            } else {
                int var18 = arg0.method3497(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field494 + var4.field1193[0] + var20 & 0x3FFF) - Statics.field494;
                int var23 = (Statics.field2794 + var4.field1194[0] + var21 & 0x3FFF) - Statics.field2794;
                if (client.field1056 == arg1 && var4.field1175 < 1536 || var4.field1138 < 1536 || var4.field1175 >= 11776 || var4.field1138 >= 11776) {
                    var4.method1103(var22, var23);
                    var4.field821 = false;
                } else if (var2) {
                    var4.field821 = true;
                    var4.field822 = var22;
                    var4.field832 = var23;
                } else {
                    var4.field821 = false;
                    var4.method1099(var22, var23, field1394[arg1]);
                }
                var4.field837 = (byte) (var4.field837 + var19 & 0x3);
                if (client.field1056 == arg1) {
                    Statics.field3841 = var4.field837;
                }
            }
        }
    }

    @ObfuscatedName("fl.a(Lgz;IB)Z")
    public static boolean method2961(class202 arg0, int arg1) {
        int var2 = arg0.method3497(2);
        if (var2 == 0) {
            if (arg0.method3497(1) != 0) {
                method2961(arg0, arg1);
            }
            int var3 = arg0.method3497(13);
            int var4 = arg0.method3497(13);
            boolean var5 = arg0.method3497(1) == 1;
            if (var5) {
                field1405[++field1396 - 1] = arg1;
            }
            if (client.field965[arg1] != null) {
                throw new RuntimeException();
            }
            class73 var6 = client.field965[arg1] = new class73();
            var6.field838 = arg1;
            if (field1406[arg1] != null) {
                var6.method1115(field1406[arg1]);
            }
            var6.field1155 = field1402[arg1];
            var6.field1164 = field1403[arg1];
            int var7 = field1401[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1180[0] = field1394[arg1];
            var6.field837 = (byte) var8;
            var6.method1103((var9 << 13) + var3 - Statics.field494, (var10 << 13) + var4 - Statics.field2794);
            var6.field821 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3497(2);
            int var12 = field1401[arg1];
            field1401[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3497(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1401[arg1];
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
            field1401[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3497(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1401[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1401[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("hi.l(I)V")
    public static void method3840() {
        field1397 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1406[var0] = null;
            field1394[var0] = 1;
        }
    }
}
