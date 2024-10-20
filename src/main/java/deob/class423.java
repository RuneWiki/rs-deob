package deob;

@ObfuscatedName("ph")
public final class class423 {

    @ObfuscatedName("ph.w")
    public static class422 field4554 = new class422();

    public class423() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ph.c([BI[BII)I")
    public static int method6892(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        class422 var5 = field4554;
        synchronized (field4554) {
            field4554.field4522 = arg2;
            field4554.field4523 = arg4;
            field4554.field4525 = arg0;
            field4554.field4526 = 0;
            field4554.field4546 = arg1;
            field4554.field4527 = 0;
            field4554.field4531 = 0;
            field4554.field4524 = 0;
            field4554.field4529 = 0;
            method6917(field4554);
            int var6 = arg1 - field4554.field4546;
            field4554.field4522 = null;
            field4554.field4525 = null;
            return var6;
        }
    }

    @ObfuscatedName("ph.l(Lpl;)V")
    public static void method6894(class422 arg0) {
        byte var1 = arg0.field4516;
        int var2 = arg0.field4533;
        int var3 = arg0.field4538;
        int var4 = arg0.field4537;
        int[] var5 = Statics.field1465;
        int var6 = arg0.field4535;
        byte[] var7 = arg0.field4525;
        int var8 = arg0.field4526;
        int var9 = arg0.field4546;
        int var10 = var9;
        int var11 = arg0.field4553 + 1;
        label62: while (true) {
            if (var2 > 0) {
                while (true) {
                    if (var9 == 0) {
                        break label62;
                    }
                    if (var2 == 1) {
                        if (var9 == 0) {
                            var2 = 1;
                            break label62;
                        }
                        var7[var8] = var1;
                        var8++;
                        var9--;
                        break;
                    }
                    var7[var8] = var1;
                    var2--;
                    var8++;
                    var9--;
                }
            }
            while (var3 != var11) {
                var1 = (byte) var4;
                int var12 = var5[var6];
                byte var13 = (byte) var12;
                var6 = var12 >> 8;
                var3++;
                if (var4 == var13) {
                    if (var3 != var11) {
                        var2 = 2;
                        int var15 = var5[var6];
                        byte var16 = (byte) var15;
                        var6 = var15 >> 8;
                        var3++;
                        if (var3 != var11) {
                            if (var4 == var16) {
                                var2 = 3;
                                int var17 = var5[var6];
                                byte var18 = (byte) var17;
                                var6 = var17 >> 8;
                                var3++;
                                if (var3 != var11) {
                                    if (var4 == var18) {
                                        int var19 = var5[var6];
                                        byte var20 = (byte) var19;
                                        int var21 = var19 >> 8;
                                        var3++;
                                        var2 = (var20 & 0xFF) + 4;
                                        int var22 = var5[var21];
                                        var4 = (byte) var22;
                                        var6 = var22 >> 8;
                                        var3++;
                                    } else {
                                        var4 = var18;
                                    }
                                }
                            } else {
                                var4 = var16;
                            }
                        }
                        continue label62;
                    }
                    if (var9 == 0) {
                        var2 = 1;
                        break label62;
                    }
                    var7[var8] = var1;
                    var8++;
                    var9--;
                } else {
                    var4 = var13;
                    if (var9 == 0) {
                        var2 = 1;
                        break label62;
                    }
                    var7[var8] = var1;
                    var8++;
                    var9--;
                }
            }
            var2 = 0;
            break;
        }
        int var14 = arg0.field4529;
        arg0.field4529 += var10 - var9;
        if (arg0.field4529 < var14) {
        }
        arg0.field4516 = var1;
        arg0.field4533 = var2;
        arg0.field4538 = var3;
        arg0.field4537 = var4;
        Statics.field1465 = var5;
        arg0.field4535 = var6;
        arg0.field4525 = var7;
        arg0.field4526 = var8;
        arg0.field4546 = var9;
    }

    @ObfuscatedName("ph.s(Lpl;)V")
    public static void method6917(class422 arg0) {
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        boolean var13 = false;
        boolean var14 = false;
        boolean var15 = false;
        boolean var16 = false;
        boolean var17 = false;
        boolean var18 = false;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        arg0.field4520 = 1;
        if (Statics.field1465 == null) {
            Statics.field1465 = new int[arg0.field4520 * 100000];
        }
        boolean var23 = true;
        while (true) {
            while (var23) {
                byte var24 = method6896(arg0);
                if (var24 == 23) {
                    return;
                }
                byte var25 = method6896(arg0);
                byte var26 = method6896(arg0);
                byte var27 = method6896(arg0);
                byte var28 = method6896(arg0);
                byte var29 = method6896(arg0);
                byte var30 = method6896(arg0);
                byte var31 = method6896(arg0);
                byte var32 = method6896(arg0);
                byte var33 = method6896(arg0);
                byte var34 = method6897(arg0);
                if (var34 != 0) {
                }
                arg0.field4536 = 0;
                byte var35 = method6896(arg0);
                arg0.field4536 = arg0.field4536 << 8 | var35 & 0xFF;
                byte var36 = method6896(arg0);
                arg0.field4536 = arg0.field4536 << 8 | var36 & 0xFF;
                byte var37 = method6896(arg0);
                arg0.field4536 = arg0.field4536 << 8 | var37 & 0xFF;
                for (int var38 = 0; var38 < 16; var38++) {
                    byte var39 = method6897(arg0);
                    if (var39 == 1) {
                        arg0.field4542[var38] = true;
                    } else {
                        arg0.field4542[var38] = false;
                    }
                }
                for (int var40 = 0; var40 < 256; var40++) {
                    arg0.field4541[var40] = false;
                }
                for (int var41 = 0; var41 < 16; var41++) {
                    if (arg0.field4542[var41]) {
                        for (int var42 = 0; var42 < 16; var42++) {
                            byte var43 = method6897(arg0);
                            if (var43 == 1) {
                                arg0.field4541[var41 * 16 + var42] = true;
                            }
                        }
                    }
                }
                method6899(arg0);
                int var44 = arg0.field4540 + 2;
                int var45 = method6916(3, arg0);
                int var46 = method6916(15, arg0);
                for (int var47 = 0; var47 < var46; var47++) {
                    int var48 = 0;
                    while (true) {
                        byte var49 = method6897(arg0);
                        if (var49 == 0) {
                            arg0.field4547[var47] = (byte) var48;
                            break;
                        }
                        var48++;
                    }
                }
                byte[] var50 = new byte[6];
                byte var51 = 0;
                while (var51 < var45) {
                    var50[var51] = var51++;
                }
                for (int var52 = 0; var52 < var46; var52++) {
                    byte var53 = arg0.field4547[var52];
                    byte var54 = var50[var53];
                    while (var53 > 0) {
                        var50[var53] = var50[var53 - 1];
                        var53--;
                    }
                    var50[0] = var54;
                    arg0.field4543[var52] = var54;
                }
                for (int var55 = 0; var55 < var45; var55++) {
                    int var56 = method6916(5, arg0);
                    for (int var57 = 0; var57 < var44; var57++) {
                        while (true) {
                            byte var58 = method6897(arg0);
                            if (var58 == 0) {
                                arg0.field4548[var55][var57] = (byte) var56;
                                break;
                            }
                            byte var59 = method6897(arg0);
                            if (var59 == 0) {
                                var56++;
                            } else {
                                var56--;
                            }
                        }
                    }
                }
                for (int var60 = 0; var60 < var45; var60++) {
                    byte var61 = 32;
                    byte var62 = 0;
                    for (int var63 = 0; var63 < var44; var63++) {
                        if (arg0.field4548[var60][var63] > var62) {
                            var62 = arg0.field4548[var60][var63];
                        }
                        if (arg0.field4548[var60][var63] < var61) {
                            var61 = arg0.field4548[var60][var63];
                        }
                    }
                    method6893(arg0.field4549[var60], arg0.field4550[var60], arg0.field4517[var60], arg0.field4548[var60], var61, var62, var44);
                    arg0.field4552[var60] = var61;
                }
                int var64 = arg0.field4540 + 1;
                int var65 = -1;
                byte var66 = 0;
                for (int var67 = 0; var67 <= 255; var67++) {
                    arg0.field4545[var67] = 0;
                }
                int var68 = 4095;
                for (int var69 = 15; var69 >= 0; var69--) {
                    for (int var70 = 15; var70 >= 0; var70--) {
                        arg0.field4544[var68] = (byte) (var69 * 16 + var70);
                        var68--;
                    }
                    arg0.field4551[var69] = var68 + 1;
                }
                int var71 = 0;
                if (var66 == 0) {
                    var65++;
                    var66 = 50;
                    byte var72 = arg0.field4543[var65];
                    var19 = arg0.field4552[var72];
                    var20 = arg0.field4549[var72];
                    var22 = arg0.field4517[var72];
                    var21 = arg0.field4550[var72];
                }
                int var103 = var66 - 1;
                int var73 = var19;
                int var74;
                byte var102;
                for (var74 = method6916(var19, arg0); var74 > var20[var73]; var74 = var74 << 1 | var102) {
                    var73++;
                    var102 = method6897(arg0);
                }
                int var75 = var22[var74 - var21[var73]];
                while (true) {
                    while (var64 != var75) {
                        if (var75 == 0 || var75 == 1) {
                            int var95 = -1;
                            int var96 = 1;
                            do {
                                if (var75 == 0) {
                                    var95 += var96;
                                } else if (var75 == 1) {
                                    var95 += var96 * 2;
                                }
                                var96 *= 2;
                                if (var103 == 0) {
                                    var65++;
                                    var103 = 50;
                                    byte var97 = arg0.field4543[var65];
                                    var19 = arg0.field4552[var97];
                                    var20 = arg0.field4549[var97];
                                    var22 = arg0.field4517[var97];
                                    var21 = arg0.field4550[var97];
                                }
                                var103--;
                                int var98 = var19;
                                int var99;
                                byte var101;
                                for (var99 = method6916(var19, arg0); var99 > var20[var98]; var99 = var99 << 1 | var101) {
                                    var98++;
                                    var101 = method6897(arg0);
                                }
                                var75 = var22[var99 - var21[var98]];
                            } while (var75 == 0 || var75 == 1);
                            var95++;
                            byte var100 = arg0.field4534[arg0.field4544[arg0.field4551[0]] & 0xFF];
                            arg0.field4545[var100 & 0xFF] += var95;
                            while (var95 > 0) {
                                Statics.field1465[var71] = var100 & 0xFF;
                                var71++;
                                var95--;
                            }
                        } else {
                            int var81 = var75 - 1;
                            byte var83;
                            if (var81 < 16) {
                                int var82 = arg0.field4551[0];
                                var83 = arg0.field4544[var81 + var82];
                                while (var81 > 3) {
                                    int var84 = var81 + var82;
                                    arg0.field4544[var84] = arg0.field4544[var84 - 1];
                                    arg0.field4544[var84 - 1] = arg0.field4544[var84 - 2];
                                    arg0.field4544[var84 - 2] = arg0.field4544[var84 - 3];
                                    arg0.field4544[var84 - 3] = arg0.field4544[var84 - 4];
                                    var81 -= 4;
                                }
                                while (var81 > 0) {
                                    arg0.field4544[var81 + var82] = arg0.field4544[var81 + var82 - 1];
                                    var81--;
                                }
                                arg0.field4544[var82] = var83;
                            } else {
                                int var85 = var81 / 16;
                                int var86 = var81 % 16;
                                int var87 = arg0.field4551[var85] + var86;
                                var83 = arg0.field4544[var87];
                                while (var87 > arg0.field4551[var85]) {
                                    arg0.field4544[var87] = arg0.field4544[var87 - 1];
                                    var87--;
                                }
                                int var10002 = arg0.field4551[var85]++;
                                while (var85 > 0) {
                                    var10002 = arg0.field4551[var85]--;
                                    arg0.field4544[arg0.field4551[var85]] = arg0.field4544[arg0.field4551[var85 - 1] + 16 - 1];
                                    var85--;
                                }
                                var10002 = arg0.field4551[0]--;
                                arg0.field4544[arg0.field4551[0]] = var83;
                                if (arg0.field4551[0] == 0) {
                                    int var88 = 4095;
                                    for (int var89 = 15; var89 >= 0; var89--) {
                                        for (int var90 = 15; var90 >= 0; var90--) {
                                            arg0.field4544[var88] = arg0.field4544[arg0.field4551[var89] + var90];
                                            var88--;
                                        }
                                        arg0.field4551[var89] = var88 + 1;
                                    }
                                }
                            }
                            arg0.field4545[arg0.field4534[var83 & 0xFF] & 0xFF]++;
                            Statics.field1465[var71] = arg0.field4534[var83 & 0xFF] & 0xFF;
                            var71++;
                            if (var103 == 0) {
                                var65++;
                                var103 = 50;
                                byte var91 = arg0.field4543[var65];
                                var19 = arg0.field4552[var91];
                                var20 = arg0.field4549[var91];
                                var22 = arg0.field4517[var91];
                                var21 = arg0.field4550[var91];
                            }
                            var103--;
                            int var92 = var19;
                            int var93;
                            byte var94;
                            for (var93 = method6916(var19, arg0); var93 > var20[var92]; var93 = var93 << 1 | var94) {
                                var92++;
                                var94 = method6897(arg0);
                            }
                            var75 = var22[var93 - var21[var92]];
                        }
                    }
                    arg0.field4533 = 0;
                    arg0.field4516 = 0;
                    arg0.field4530[0] = 0;
                    for (int var76 = 1; var76 <= 256; var76++) {
                        arg0.field4530[var76] = arg0.field4545[var76 - 1];
                    }
                    for (int var77 = 1; var77 <= 256; var77++) {
                        arg0.field4530[var77] += arg0.field4530[var77 - 1];
                    }
                    for (int var78 = 0; var78 < var71; var78++) {
                        byte var79 = (byte) (Statics.field1465[var78] & 0xFF);
                        Statics.field1465[arg0.field4530[var79 & 0xFF]] |= var78 << 8;
                        arg0.field4530[var79 & 0xFF]++;
                    }
                    arg0.field4535 = Statics.field1465[arg0.field4536] >> 8;
                    arg0.field4538 = 0;
                    arg0.field4535 = Statics.field1465[arg0.field4535];
                    arg0.field4537 = (byte) (arg0.field4535 & 0xFF);
                    arg0.field4535 >>= 0x8;
                    arg0.field4538++;
                    arg0.field4553 = var71;
                    method6894(arg0);
                    if (arg0.field4538 == arg0.field4553 + 1 && arg0.field4533 == 0) {
                        var23 = true;
                        break;
                    }
                    var23 = false;
                    break;
                }
            }
            return;
        }
    }

    @ObfuscatedName("ph.e(Lpl;)B")
    public static byte method6896(class422 arg0) {
        return (byte) method6916(8, arg0);
    }

    @ObfuscatedName("ph.r(Lpl;)B")
    public static byte method6897(class422 arg0) {
        return (byte) method6916(1, arg0);
    }

    @ObfuscatedName("ph.o(ILpl;)I")
    public static int method6916(int arg0, class422 arg1) {
        while (arg1.field4527 < arg0) {
            arg1.field4531 = arg1.field4531 << 8 | arg1.field4522[arg1.field4523] & 0xFF;
            arg1.field4527 += 8;
            arg1.field4523++;
            arg1.field4524++;
            if (arg1.field4524 == 0) {
            }
        }
        int var2 = arg1.field4531 >> arg1.field4527 - arg0 & (0x1 << arg0) - 1;
        arg1.field4527 -= arg0;
        return var2;
    }

    @ObfuscatedName("ph.i(Lpl;)V")
    public static void method6899(class422 arg0) {
        arg0.field4540 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            if (arg0.field4541[var1]) {
                arg0.field4534[arg0.field4540] = (byte) var1;
                arg0.field4540++;
            }
        }
    }

    @ObfuscatedName("ph.w([I[I[I[BIII)V")
    public static void method6893(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        for (int var8 = arg4; var8 <= arg5; var8++) {
            for (int var9 = 0; var9 < arg6; var9++) {
                if (arg3[var9] == var8) {
                    arg2[var7] = var9;
                    var7++;
                }
            }
        }
        for (int var10 = 0; var10 < 23; var10++) {
            arg1[var10] = 0;
        }
        for (int var11 = 0; var11 < arg6; var11++) {
            arg1[arg3[var11] + 1]++;
        }
        for (int var12 = 1; var12 < 23; var12++) {
            arg1[var12] += arg1[var12 - 1];
        }
        for (int var13 = 0; var13 < 23; var13++) {
            arg0[var13] = 0;
        }
        int var14 = 0;
        for (int var15 = arg4; var15 <= arg5; var15++) {
            int var16 = arg1[var15 + 1] - arg1[var15] + var14;
            arg0[var15] = var16 - 1;
            var14 = var16 << 1;
        }
        for (int var17 = arg4 + 1; var17 <= arg5; var17++) {
            arg1[var17] = (arg0[var17 - 1] + 1 << 1) - arg1[var17];
        }
    }
}
