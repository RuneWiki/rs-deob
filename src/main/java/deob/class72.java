package deob;

import java.util.Random;

@ObfuscatedName("bl")
public class class72 {

    @ObfuscatedName("bl.j")
    public class58 field1328;

    @ObfuscatedName("bl.h")
    public class58 field1306;

    @ObfuscatedName("bl.m")
    public class58 field1307;

    @ObfuscatedName("bl.z")
    public class58 field1325;

    @ObfuscatedName("bl.x")
    public class58 field1309;

    @ObfuscatedName("bl.e")
    public class58 field1326;

    @ObfuscatedName("bl.i")
    public class58 field1311;

    @ObfuscatedName("bl.c")
    public class58 field1310;

    @ObfuscatedName("bl.n")
    public int[] field1305 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.l")
    public int[] field1314 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.u")
    public int[] field1315 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.r")
    public int field1316 = 0;

    @ObfuscatedName("bl.a")
    public int field1317 = 100;

    @ObfuscatedName("bl.d")
    public class64 field1318;

    @ObfuscatedName("bl.p")
    public class58 field1312;

    @ObfuscatedName("bl.q")
    public int field1324 = 500;

    @ObfuscatedName("bl.b")
    public int field1321 = 0;

    @ObfuscatedName("bl.t")
    public static int[] field1313;

    @ObfuscatedName("bl.y")
    public static int[] field1308 = new int[32768];

    @ObfuscatedName("bl.w")
    public static int[] field1322;

    @ObfuscatedName("bl.s")
    public static int[] field1320;

    @ObfuscatedName("bl.k")
    public static int[] field1327;

    @ObfuscatedName("bl.o")
    public static int[] field1323;

    @ObfuscatedName("bl.v")
    public static int[] field1329;

    @ObfuscatedName("bl.f")
    public static int[] field1330;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1308[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1322 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1322[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1313 = new int[220500];
        field1320 = new int[5];
        field1327 = new int[5];
        field1323 = new int[5];
        field1329 = new int[5];
        field1330 = new int[5];
    }

    @ObfuscatedName("bl.j(II)[I")
    public final int[] method1464(int arg0, int arg1) {
        class121.method2583(field1313, 0, arg0);
        if (arg1 < 10) {
            return field1313;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1328.method1192();
        this.field1306.method1192();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1307 != null) {
            this.field1307.method1192();
            this.field1325.method1192();
            var5 = (int) ((double) (this.field1307.field1187 - this.field1307.field1185) * 32.768D / var3);
            var6 = (int) ((double) this.field1307.field1185 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1309 != null) {
            this.field1309.method1192();
            this.field1326.method1192();
            var8 = (int) ((double) (this.field1309.field1187 - this.field1309.field1185) * 32.768D / var3);
            var9 = (int) ((double) this.field1309.field1185 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1305[var11] != 0) {
                field1320[var11] = 0;
                field1327[var11] = (int) ((double) this.field1315[var11] * var3);
                field1323[var11] = (this.field1305[var11] << 14) / 100;
                field1329[var11] = (int) ((double) (this.field1328.field1187 - this.field1328.field1185) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1314[var11]) / var3);
                field1330[var11] = (int) ((double) this.field1328.field1185 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1328.method1190(arg0);
            int var14 = this.field1306.method1190(arg0);
            if (this.field1307 != null) {
                int var15 = this.field1307.method1190(arg0);
                int var16 = this.field1325.method1190(arg0);
                var13 += this.method1465(var7, var16, this.field1307.field1188) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1309 != null) {
                int var17 = this.field1309.method1190(arg0);
                int var18 = this.field1326.method1190(arg0);
                var14 = var14 * ((this.method1465(var10, var18, this.field1309.field1188) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1305[var19] != 0) {
                    int var20 = field1327[var19] + var12;
                    if (var20 < arg0) {
                        field1313[var20] += this.method1465(field1320[var19], field1323[var19] * var14 >> 15, this.field1328.field1188);
                        field1320[var19] += (field1329[var19] * var13 >> 16) + field1330[var19];
                    }
                }
            }
        }
        if (this.field1311 != null) {
            this.field1311.method1192();
            this.field1310.method1192();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1311.method1190(arg0);
                int var26 = this.field1310.method1190(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1311.field1187 - this.field1311.field1185) * var25 >> 8) + this.field1311.field1185;
                } else {
                    var27 = ((this.field1311.field1187 - this.field1311.field1185) * var26 >> 8) + this.field1311.field1185;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1313[var24] = 0;
                }
            }
        }
        if (this.field1316 > 0 && this.field1317 > 0) {
            int var28 = (int) ((double) this.field1316 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1313[var29] += field1313[var29 - var28] * this.field1317 / 100;
            }
        }
        if (this.field1318.field1221[0] > 0 || this.field1318.field1221[1] > 0) {
            this.field1312.method1192();
            int var30 = this.field1312.method1190(arg0 + 1);
            int var31 = this.field1318.method1247(0, (float) var30 / 65536.0F);
            int var32 = this.field1318.method1247(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1313[var31 + var33] * (long) Statics.field1230 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1313[var31 + var33 - 1 - var36] * (long) class64.field1225[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1313[var33 - 1 - var37] * (long) class64.field1225[1][var37] >> 16);
                    }
                    field1313[var33] = var35;
                    var30 = this.field1312.method1190(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1313[var31 + var33] * (long) Statics.field1230 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1313[var31 + var33 - 1 - var40] * (long) class64.field1225[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1313[var33 - 1 - var41] * (long) class64.field1225[1][var41] >> 16);
                        }
                        field1313[var33] = var39;
                        var30 = this.field1312.method1190(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1313[var31 + var33 - 1 - var43] * (long) class64.field1225[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1313[var33 - 1 - var44] * (long) class64.field1225[1][var44] >> 16);
                            }
                            field1313[var33] = var42;
                            this.field1312.method1190(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1318.method1247(0, (float) var30 / 65536.0F);
                    var32 = this.field1318.method1247(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1313[var46] < -32768) {
                field1313[var46] = -32768;
            }
            if (field1313[var46] > 32767) {
                field1313[var46] = 32767;
            }
        }
        return field1313;
    }

    @ObfuscatedName("bl.h(III)I")
    public final int method1465(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1322[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1308[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bl.m(Ldx;)V")
    public final void method1466(class120 arg0) {
        this.field1328 = new class58();
        this.field1328.method1188(arg0);
        this.field1306 = new class58();
        this.field1306.method1188(arg0);
        int var2 = arg0.method2361();
        if (var2 != 0) {
            arg0.field1972--;
            this.field1307 = new class58();
            this.field1307.method1188(arg0);
            this.field1325 = new class58();
            this.field1325.method1188(arg0);
        }
        int var3 = arg0.method2361();
        if (var3 != 0) {
            arg0.field1972--;
            this.field1309 = new class58();
            this.field1309.method1188(arg0);
            this.field1326 = new class58();
            this.field1326.method1188(arg0);
        }
        int var4 = arg0.method2361();
        if (var4 != 0) {
            arg0.field1972--;
            this.field1311 = new class58();
            this.field1311.method1188(arg0);
            this.field1310 = new class58();
            this.field1310.method1188(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2373();
            if (var6 == 0) {
                break;
            }
            this.field1305[var5] = var6;
            this.field1314[var5] = arg0.method2471();
            this.field1315[var5] = arg0.method2373();
        }
        this.field1316 = arg0.method2373();
        this.field1317 = arg0.method2373();
        this.field1324 = arg0.method2363();
        this.field1321 = arg0.method2363();
        this.field1318 = new class64();
        this.field1312 = new class58();
        this.field1318.method1248(arg0, this.field1312);
    }
}
