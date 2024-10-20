package deob;

import java.util.Random;

@ObfuscatedName("bw")
public class class66 {

    @ObfuscatedName("bw.f")
    public class52 field1252;

    @ObfuscatedName("bw.k")
    public class52 field1240;

    @ObfuscatedName("bw.y")
    public class52 field1239;

    @ObfuscatedName("bw.e")
    public class52 field1238;

    @ObfuscatedName("bw.r")
    public class52 field1259;

    @ObfuscatedName("bw.a")
    public class52 field1242;

    @ObfuscatedName("bw.n")
    public class52 field1241;

    @ObfuscatedName("bw.x")
    public class52 field1244;

    @ObfuscatedName("bw.g")
    public int[] field1245 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bw.o")
    public int[] field1246 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bw.p")
    public int[] field1247 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bw.v")
    public int field1249 = 0;

    @ObfuscatedName("bw.w")
    public int field1253 = 100;

    @ObfuscatedName("bw.t")
    public class58 field1250;

    @ObfuscatedName("bw.s")
    public class52 field1251;

    @ObfuscatedName("bw.b")
    public int field1255 = 500;

    @ObfuscatedName("bw.u")
    public int field1260 = 0;

    @ObfuscatedName("bw.j")
    public static int[] field1254;

    @ObfuscatedName("bw.d")
    public static int[] field1243 = new int[32768];

    @ObfuscatedName("bw.l")
    public static int[] field1256;

    @ObfuscatedName("bw.q")
    public static int[] field1258;

    @ObfuscatedName("bw.h")
    public static int[] field1261;

    @ObfuscatedName("bw.c")
    public static int[] field1248;

    @ObfuscatedName("bw.z")
    public static int[] field1237;

    @ObfuscatedName("bw.i")
    public static int[] field1262;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1243[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1256 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1256[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1254 = new int[220500];
        field1258 = new int[5];
        field1261 = new int[5];
        field1248 = new int[5];
        field1237 = new int[5];
        field1262 = new int[5];
    }

    @ObfuscatedName("bw.f(II)[I")
    public final int[] method1342(int arg0, int arg1) {
        class109.method2361(field1254, 0, arg0);
        if (arg1 < 10) {
            return field1254;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1252.method1067();
        this.field1240.method1067();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1239 != null) {
            this.field1239.method1067();
            this.field1238.method1067();
            var5 = (int) ((double) (this.field1239.field1116 - this.field1239.field1112) * 32.768D / var3);
            var6 = (int) ((double) this.field1239.field1112 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1259 != null) {
            this.field1259.method1067();
            this.field1242.method1067();
            var8 = (int) ((double) (this.field1259.field1116 - this.field1259.field1112) * 32.768D / var3);
            var9 = (int) ((double) this.field1259.field1112 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1245[var11] != 0) {
                field1258[var11] = 0;
                field1261[var11] = (int) ((double) this.field1247[var11] * var3);
                field1248[var11] = (this.field1245[var11] << 14) / 100;
                field1237[var11] = (int) ((double) (this.field1252.field1116 - this.field1252.field1112) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1246[var11]) / var3);
                field1262[var11] = (int) ((double) this.field1252.field1112 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1252.method1068(arg0);
            int var14 = this.field1240.method1068(arg0);
            if (this.field1239 != null) {
                int var15 = this.field1239.method1068(arg0);
                int var16 = this.field1238.method1068(arg0);
                var13 += this.method1343(var7, var16, this.field1239.field1117) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1259 != null) {
                int var17 = this.field1259.method1068(arg0);
                int var18 = this.field1242.method1068(arg0);
                var14 = var14 * ((this.method1343(var10, var18, this.field1259.field1117) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1245[var19] != 0) {
                    int var20 = field1261[var19] + var12;
                    if (var20 < arg0) {
                        field1254[var20] += this.method1343(field1258[var19], field1248[var19] * var14 >> 15, this.field1252.field1117);
                        field1258[var19] += (field1237[var19] * var13 >> 16) + field1262[var19];
                    }
                }
            }
        }
        if (this.field1241 != null) {
            this.field1241.method1067();
            this.field1244.method1067();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1241.method1068(arg0);
                int var26 = this.field1244.method1068(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1241.field1116 - this.field1241.field1112) * var25 >> 8) + this.field1241.field1112;
                } else {
                    var27 = ((this.field1241.field1116 - this.field1241.field1112) * var26 >> 8) + this.field1241.field1112;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1254[var24] = 0;
                }
            }
        }
        if (this.field1249 > 0 && this.field1253 > 0) {
            int var28 = (int) ((double) this.field1249 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1254[var29] += field1254[var29 - var28] * this.field1253 / 100;
            }
        }
        if (this.field1250.field1157[0] > 0 || this.field1250.field1157[1] > 0) {
            this.field1251.method1067();
            int var30 = this.field1251.method1068(arg0 + 1);
            int var31 = this.field1250.method1116(0, (float) var30 / 65536.0F);
            int var32 = this.field1250.method1116(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1254[var31 + var33] * (long) Statics.field1160 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1254[var31 + var33 - 1 - var36] * (long) class58.field1159[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1254[var33 - 1 - var37] * (long) class58.field1159[1][var37] >> 16);
                    }
                    field1254[var33] = var35;
                    var30 = this.field1251.method1068(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1254[var31 + var33] * (long) Statics.field1160 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1254[var31 + var33 - 1 - var40] * (long) class58.field1159[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1254[var33 - 1 - var41] * (long) class58.field1159[1][var41] >> 16);
                        }
                        field1254[var33] = var39;
                        var30 = this.field1251.method1068(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1254[var31 + var33 - 1 - var43] * (long) class58.field1159[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1254[var33 - 1 - var44] * (long) class58.field1159[1][var44] >> 16);
                            }
                            field1254[var33] = var42;
                            this.field1251.method1068(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1250.method1116(0, (float) var30 / 65536.0F);
                    var32 = this.field1250.method1116(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1254[var46] < -32768) {
                field1254[var46] = -32768;
            }
            if (field1254[var46] > 32767) {
                field1254[var46] = 32767;
            }
        }
        return field1254;
    }

    @ObfuscatedName("bw.k(III)I")
    public final int method1343(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1256[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1243[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bw.y(Ldu;)V")
    public final void method1345(class108 arg0) {
        this.field1252 = new class52();
        this.field1252.method1066(arg0);
        this.field1240 = new class52();
        this.field1240.method1066(arg0);
        int var2 = arg0.method2158();
        if (var2 != 0) {
            arg0.field1859--;
            this.field1239 = new class52();
            this.field1239.method1066(arg0);
            this.field1238 = new class52();
            this.field1238.method1066(arg0);
        }
        int var3 = arg0.method2158();
        if (var3 != 0) {
            arg0.field1859--;
            this.field1259 = new class52();
            this.field1259.method1066(arg0);
            this.field1242 = new class52();
            this.field1242.method1066(arg0);
        }
        int var4 = arg0.method2158();
        if (var4 != 0) {
            arg0.field1859--;
            this.field1241 = new class52();
            this.field1241.method1066(arg0);
            this.field1244 = new class52();
            this.field1244.method1066(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2171();
            if (var6 == 0) {
                break;
            }
            this.field1245[var5] = var6;
            this.field1246[var5] = arg0.method2285();
            this.field1247[var5] = arg0.method2171();
        }
        this.field1249 = arg0.method2171();
        this.field1253 = arg0.method2171();
        this.field1255 = arg0.method2160();
        this.field1260 = arg0.method2160();
        this.field1250 = new class58();
        this.field1251 = new class52();
        this.field1250.method1117(arg0, this.field1251);
    }
}
