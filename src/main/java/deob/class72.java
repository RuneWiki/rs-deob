package deob;

import java.util.Random;

@ObfuscatedName("br")
public class class72 {

    @ObfuscatedName("br.z")
    public class58 field1325;

    @ObfuscatedName("br.q")
    public class58 field1319;

    @ObfuscatedName("br.k")
    public class58 field1320;

    @ObfuscatedName("br.f")
    public class58 field1321;

    @ObfuscatedName("br.d")
    public class58 field1322;

    @ObfuscatedName("br.l")
    public class58 field1323;

    @ObfuscatedName("br.r")
    public class58 field1324;

    @ObfuscatedName("br.g")
    public class58 field1343;

    @ObfuscatedName("br.h")
    public int[] field1331 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("br.n")
    public int[] field1327 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("br.j")
    public int[] field1328 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("br.a")
    public int field1329 = 0;

    @ObfuscatedName("br.b")
    public int field1332 = 100;

    @ObfuscatedName("br.c")
    public class64 field1336;

    @ObfuscatedName("br.v")
    public class58 field1337;

    @ObfuscatedName("br.p")
    public int field1333 = 500;

    @ObfuscatedName("br.i")
    public int field1334 = 0;

    @ObfuscatedName("br.t")
    public static int[] field1335;

    @ObfuscatedName("br.u")
    public static int[] field1330 = new int[32768];

    @ObfuscatedName("br.e")
    public static int[] field1318;

    @ObfuscatedName("br.s")
    public static int[] field1339;

    @ObfuscatedName("br.x")
    public static int[] field1340;

    @ObfuscatedName("br.y")
    public static int[] field1341;

    @ObfuscatedName("br.w")
    public static int[] field1342;

    @ObfuscatedName("br.o")
    public static int[] field1326;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1330[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1318 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1318[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1335 = new int[220500];
        field1339 = new int[5];
        field1340 = new int[5];
        field1341 = new int[5];
        field1342 = new int[5];
        field1326 = new int[5];
    }

    @ObfuscatedName("br.z(II)[I")
    public final int[] method1437(int arg0, int arg1) {
        class120.method2513(field1335, 0, arg0);
        if (arg1 < 10) {
            return field1335;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1325.method1170();
        this.field1319.method1170();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1320 != null) {
            this.field1320.method1170();
            this.field1321.method1170();
            var5 = (int) ((double) (this.field1320.field1202 - this.field1320.field1201) * 32.768D / var3);
            var6 = (int) ((double) this.field1320.field1201 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1322 != null) {
            this.field1322.method1170();
            this.field1323.method1170();
            var8 = (int) ((double) (this.field1322.field1202 - this.field1322.field1201) * 32.768D / var3);
            var9 = (int) ((double) this.field1322.field1201 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1331[var11] != 0) {
                field1339[var11] = 0;
                field1340[var11] = (int) ((double) this.field1328[var11] * var3);
                field1341[var11] = (this.field1331[var11] << 14) / 100;
                field1342[var11] = (int) ((double) (this.field1325.field1202 - this.field1325.field1201) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1327[var11]) / var3);
                field1326[var11] = (int) ((double) this.field1325.field1201 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1325.method1164(arg0);
            int var14 = this.field1319.method1164(arg0);
            if (this.field1320 != null) {
                int var15 = this.field1320.method1164(arg0);
                int var16 = this.field1321.method1164(arg0);
                var13 += this.method1431(var7, var16, this.field1320.field1203) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1322 != null) {
                int var17 = this.field1322.method1164(arg0);
                int var18 = this.field1323.method1164(arg0);
                var14 = var14 * ((this.method1431(var10, var18, this.field1322.field1203) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1331[var19] != 0) {
                    int var20 = field1340[var19] + var12;
                    if (var20 < arg0) {
                        field1335[var20] += this.method1431(field1339[var19], field1341[var19] * var14 >> 15, this.field1325.field1203);
                        field1339[var19] += (field1342[var19] * var13 >> 16) + field1326[var19];
                    }
                }
            }
        }
        if (this.field1324 != null) {
            this.field1324.method1170();
            this.field1343.method1170();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1324.method1164(arg0);
                int var26 = this.field1343.method1164(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1324.field1202 - this.field1324.field1201) * var25 >> 8) + this.field1324.field1201;
                } else {
                    var27 = ((this.field1324.field1202 - this.field1324.field1201) * var26 >> 8) + this.field1324.field1201;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1335[var24] = 0;
                }
            }
        }
        if (this.field1329 > 0 && this.field1332 > 0) {
            int var28 = (int) ((double) this.field1329 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1335[var29] += field1335[var29 - var28] * this.field1332 / 100;
            }
        }
        if (this.field1336.field1238[0] > 0 || this.field1336.field1238[1] > 0) {
            this.field1337.method1170();
            int var30 = this.field1337.method1164(arg0 + 1);
            int var31 = this.field1336.method1214(0, (float) var30 / 65536.0F);
            int var32 = this.field1336.method1214(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1335[var31 + var33] * (long) Statics.field1234 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1335[var31 + var33 - 1 - var36] * (long) class64.field1232[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1335[var33 - 1 - var37] * (long) class64.field1232[1][var37] >> 16);
                    }
                    field1335[var33] = var35;
                    var30 = this.field1337.method1164(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1335[var31 + var33] * (long) Statics.field1234 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1335[var31 + var33 - 1 - var40] * (long) class64.field1232[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1335[var33 - 1 - var41] * (long) class64.field1232[1][var41] >> 16);
                        }
                        field1335[var33] = var39;
                        var30 = this.field1337.method1164(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1335[var31 + var33 - 1 - var43] * (long) class64.field1232[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1335[var33 - 1 - var44] * (long) class64.field1232[1][var44] >> 16);
                            }
                            field1335[var33] = var42;
                            this.field1337.method1164(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1336.method1214(0, (float) var30 / 65536.0F);
                    var32 = this.field1336.method1214(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1335[var46] < -32768) {
                field1335[var46] = -32768;
            }
            if (field1335[var46] > 32767) {
                field1335[var46] = 32767;
            }
        }
        return field1335;
    }

    @ObfuscatedName("br.q(III)I")
    public final int method1431(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1318[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1330[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("br.k(Lda;)V")
    public final void method1432(class119 arg0) {
        this.field1325 = new class58();
        this.field1325.method1163(arg0);
        this.field1319 = new class58();
        this.field1319.method1163(arg0);
        int var2 = arg0.method2457();
        if (var2 != 0) {
            arg0.field1986--;
            this.field1320 = new class58();
            this.field1320.method1163(arg0);
            this.field1321 = new class58();
            this.field1321.method1163(arg0);
        }
        int var3 = arg0.method2457();
        if (var3 != 0) {
            arg0.field1986--;
            this.field1322 = new class58();
            this.field1322.method1163(arg0);
            this.field1323 = new class58();
            this.field1323.method1163(arg0);
        }
        int var4 = arg0.method2457();
        if (var4 != 0) {
            arg0.field1986--;
            this.field1324 = new class58();
            this.field1324.method1163(arg0);
            this.field1343 = new class58();
            this.field1343.method1163(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2301();
            if (var6 == 0) {
                break;
            }
            this.field1331[var5] = var6;
            this.field1327[var5] = arg0.method2390();
            this.field1328[var5] = arg0.method2301();
        }
        this.field1329 = arg0.method2301();
        this.field1332 = arg0.method2301();
        this.field1333 = arg0.method2415();
        this.field1334 = arg0.method2415();
        this.field1336 = new class64();
        this.field1337 = new class58();
        this.field1336.method1215(arg0, this.field1337);
    }
}
