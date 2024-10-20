package deob;

import java.util.Random;

@ObfuscatedName("bd")
public class class72 {

    @ObfuscatedName("bd.l")
    public class58 field1319;

    @ObfuscatedName("bd.e")
    public class58 field1308;

    @ObfuscatedName("bd.q")
    public class58 field1309;

    @ObfuscatedName("bd.o")
    public class58 field1310;

    @ObfuscatedName("bd.g")
    public class58 field1312;

    @ObfuscatedName("bd.m")
    public class58 field1320;

    @ObfuscatedName("bd.b")
    public class58 field1313;

    @ObfuscatedName("bd.p")
    public class58 field1314;

    @ObfuscatedName("bd.t")
    public int[] field1311 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bd.w")
    public int[] field1316 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bd.x")
    public int[] field1322 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bd.k")
    public int field1318 = 0;

    @ObfuscatedName("bd.z")
    public int field1325 = 100;

    @ObfuscatedName("bd.v")
    public class64 field1331;

    @ObfuscatedName("bd.j")
    public class58 field1321;

    @ObfuscatedName("bd.f")
    public int field1317 = 500;

    @ObfuscatedName("bd.c")
    public int field1323 = 0;

    @ObfuscatedName("bd.s")
    public static int[] field1324;

    @ObfuscatedName("bd.r")
    public static int[] field1315 = new int[32768];

    @ObfuscatedName("bd.u")
    public static int[] field1326;

    @ObfuscatedName("bd.h")
    public static int[] field1328;

    @ObfuscatedName("bd.y")
    public static int[] field1329;

    @ObfuscatedName("bd.d")
    public static int[] field1330;

    @ObfuscatedName("bd.n")
    public static int[] field1307;

    @ObfuscatedName("bd.i")
    public static int[] field1332;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1315[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1326 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1326[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1324 = new int[220500];
        field1328 = new int[5];
        field1329 = new int[5];
        field1330 = new int[5];
        field1307 = new int[5];
        field1332 = new int[5];
    }

    @ObfuscatedName("bd.l(II)[I")
    public final int[] method1502(int arg0, int arg1) {
        class120.method2594(field1324, 0, arg0);
        if (arg1 < 10) {
            return field1324;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1319.method1219();
        this.field1308.method1219();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1309 != null) {
            this.field1309.method1219();
            this.field1310.method1219();
            var5 = (int) ((double) (this.field1309.field1183 - this.field1309.field1182) * 32.768D / var3);
            var6 = (int) ((double) this.field1309.field1182 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1312 != null) {
            this.field1312.method1219();
            this.field1320.method1219();
            var8 = (int) ((double) (this.field1312.field1183 - this.field1312.field1182) * 32.768D / var3);
            var9 = (int) ((double) this.field1312.field1182 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1311[var11] != 0) {
                field1328[var11] = 0;
                field1329[var11] = (int) ((double) this.field1322[var11] * var3);
                field1330[var11] = (this.field1311[var11] << 14) / 100;
                field1307[var11] = (int) ((double) (this.field1319.field1183 - this.field1319.field1182) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1316[var11]) / var3);
                field1332[var11] = (int) ((double) this.field1319.field1182 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1319.method1223(arg0);
            int var14 = this.field1308.method1223(arg0);
            if (this.field1309 != null) {
                int var15 = this.field1309.method1223(arg0);
                int var16 = this.field1310.method1223(arg0);
                var13 += this.method1496(var7, var16, this.field1309.field1187) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1312 != null) {
                int var17 = this.field1312.method1223(arg0);
                int var18 = this.field1320.method1223(arg0);
                var14 = var14 * ((this.method1496(var10, var18, this.field1312.field1187) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1311[var19] != 0) {
                    int var20 = field1329[var19] + var12;
                    if (var20 < arg0) {
                        field1324[var20] += this.method1496(field1328[var19], field1330[var19] * var14 >> 15, this.field1319.field1187);
                        field1328[var19] += (field1307[var19] * var13 >> 16) + field1332[var19];
                    }
                }
            }
        }
        if (this.field1313 != null) {
            this.field1313.method1219();
            this.field1314.method1219();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1313.method1223(arg0);
                int var26 = this.field1314.method1223(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1313.field1183 - this.field1313.field1182) * var25 >> 8) + this.field1313.field1182;
                } else {
                    var27 = ((this.field1313.field1183 - this.field1313.field1182) * var26 >> 8) + this.field1313.field1182;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1324[var24] = 0;
                }
            }
        }
        if (this.field1318 > 0 && this.field1325 > 0) {
            int var28 = (int) ((double) this.field1318 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1324[var29] += field1324[var29 - var28] * this.field1325 / 100;
            }
        }
        if (this.field1331.field1231[0] > 0 || this.field1331.field1231[1] > 0) {
            this.field1321.method1219();
            int var30 = this.field1321.method1223(arg0 + 1);
            int var31 = this.field1331.method1276(0, (float) var30 / 65536.0F);
            int var32 = this.field1331.method1276(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1324[var31 + var33] * (long) Statics.field1223 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1324[var31 + var33 - 1 - var36] * (long) class64.field1227[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1324[var33 - 1 - var37] * (long) class64.field1227[1][var37] >> 16);
                    }
                    field1324[var33] = var35;
                    var30 = this.field1321.method1223(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1324[var31 + var33] * (long) Statics.field1223 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1324[var31 + var33 - 1 - var40] * (long) class64.field1227[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1324[var33 - 1 - var41] * (long) class64.field1227[1][var41] >> 16);
                        }
                        field1324[var33] = var39;
                        var30 = this.field1321.method1223(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1324[var31 + var33 - 1 - var43] * (long) class64.field1227[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1324[var33 - 1 - var44] * (long) class64.field1227[1][var44] >> 16);
                            }
                            field1324[var33] = var42;
                            this.field1321.method1223(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1331.method1276(0, (float) var30 / 65536.0F);
                    var32 = this.field1331.method1276(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1324[var46] < -32768) {
                field1324[var46] = -32768;
            }
            if (field1324[var46] > 32767) {
                field1324[var46] = 32767;
            }
        }
        return field1324;
    }

    @ObfuscatedName("bd.e(III)I")
    public final int method1496(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1326[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1315[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bd.q(Ldl;)V")
    public final void method1497(class119 arg0) {
        this.field1319 = new class58();
        this.field1319.method1216(arg0);
        this.field1308 = new class58();
        this.field1308.method1216(arg0);
        int var2 = arg0.method2388();
        if (var2 != 0) {
            arg0.field1988--;
            this.field1309 = new class58();
            this.field1309.method1216(arg0);
            this.field1310 = new class58();
            this.field1310.method1216(arg0);
        }
        int var3 = arg0.method2388();
        if (var3 != 0) {
            arg0.field1988--;
            this.field1312 = new class58();
            this.field1312.method1216(arg0);
            this.field1320 = new class58();
            this.field1320.method1216(arg0);
        }
        int var4 = arg0.method2388();
        if (var4 != 0) {
            arg0.field1988--;
            this.field1313 = new class58();
            this.field1313.method1216(arg0);
            this.field1314 = new class58();
            this.field1314.method1216(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2452();
            if (var6 == 0) {
                break;
            }
            this.field1311[var5] = var6;
            this.field1316[var5] = arg0.method2458();
            this.field1322[var5] = arg0.method2452();
        }
        this.field1318 = arg0.method2452();
        this.field1325 = arg0.method2452();
        this.field1317 = arg0.method2440();
        this.field1323 = arg0.method2440();
        this.field1331 = new class64();
        this.field1321 = new class58();
        this.field1331.method1277(arg0, this.field1321);
    }
}
