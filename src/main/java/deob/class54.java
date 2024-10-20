package deob;

import java.util.Random;

@ObfuscatedName("bt")
public class class54 {

    @ObfuscatedName("bt.t")
    public class56 field1204;

    @ObfuscatedName("bt.l")
    public class56 field1183;

    @ObfuscatedName("bt.c")
    public class56 field1202;

    @ObfuscatedName("bt.d")
    public class56 field1192;

    @ObfuscatedName("bt.b")
    public class56 field1184;

    @ObfuscatedName("bt.i")
    public class56 field1187;

    @ObfuscatedName("bt.p")
    public class56 field1186;

    @ObfuscatedName("bt.y")
    public class56 field1189;

    @ObfuscatedName("bt.u")
    public int[] field1190 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bt.z")
    public int[] field1191 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bt.j")
    public int[] field1182 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bt.h")
    public int field1193 = 0;

    @ObfuscatedName("bt.x")
    public int field1194 = 100;

    @ObfuscatedName("bt.q")
    public class64 field1195;

    @ObfuscatedName("bt.w")
    public class56 field1196;

    @ObfuscatedName("bt.k")
    public int field1185 = 500;

    @ObfuscatedName("bt.o")
    public int field1198 = 0;

    @ObfuscatedName("bt.f")
    public static int[] field1199;

    @ObfuscatedName("bt.r")
    public static int[] field1200 = new int[32768];

    @ObfuscatedName("bt.s")
    public static int[] field1201;

    @ObfuscatedName("bt.m")
    public static int[] field1203;

    @ObfuscatedName("bt.a")
    public static int[] field1188;

    @ObfuscatedName("bt.n")
    public static int[] field1205;

    @ObfuscatedName("bt.v")
    public static int[] field1206;

    @ObfuscatedName("bt.e")
    public static int[] field1207;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1200[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1201 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1201[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1199 = new int[220500];
        field1203 = new int[5];
        field1188 = new int[5];
        field1205 = new int[5];
        field1206 = new int[5];
        field1207 = new int[5];
    }

    @ObfuscatedName("bt.t(II)[I")
    public final int[] method1239(int arg0, int arg1) {
        class128.method2651(field1199, 0, arg0);
        if (arg1 < 10) {
            return field1199;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1204.method1259();
        this.field1183.method1259();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1202 != null) {
            this.field1202.method1259();
            this.field1192.method1259();
            var5 = (int) ((double) (this.field1202.field1223 - this.field1202.field1222) * 32.768D / var3);
            var6 = (int) ((double) this.field1202.field1222 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1184 != null) {
            this.field1184.method1259();
            this.field1187.method1259();
            var8 = (int) ((double) (this.field1184.field1223 - this.field1184.field1222) * 32.768D / var3);
            var9 = (int) ((double) this.field1184.field1222 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1190[var11] != 0) {
                field1203[var11] = 0;
                field1188[var11] = (int) ((double) this.field1182[var11] * var3);
                field1205[var11] = (this.field1190[var11] << 14) / 100;
                field1206[var11] = (int) ((double) (this.field1204.field1223 - this.field1204.field1222) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1191[var11]) / var3);
                field1207[var11] = (int) ((double) this.field1204.field1222 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1204.method1256(arg0);
            int var14 = this.field1183.method1256(arg0);
            if (this.field1202 != null) {
                int var15 = this.field1202.method1256(arg0);
                int var16 = this.field1192.method1256(arg0);
                var13 += this.method1240(var7, var16, this.field1202.field1224) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1184 != null) {
                int var17 = this.field1184.method1256(arg0);
                int var18 = this.field1187.method1256(arg0);
                var14 = var14 * ((this.method1240(var10, var18, this.field1184.field1224) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1190[var19] != 0) {
                    int var20 = field1188[var19] + var12;
                    if (var20 < arg0) {
                        field1199[var20] += this.method1240(field1203[var19], field1205[var19] * var14 >> 15, this.field1204.field1224);
                        field1203[var19] += (field1206[var19] * var13 >> 16) + field1207[var19];
                    }
                }
            }
        }
        if (this.field1186 != null) {
            this.field1186.method1259();
            this.field1189.method1259();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1186.method1256(arg0);
                int var26 = this.field1189.method1256(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1186.field1223 - this.field1186.field1222) * var25 >> 8) + this.field1186.field1222;
                } else {
                    var27 = ((this.field1186.field1223 - this.field1186.field1222) * var26 >> 8) + this.field1186.field1222;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1199[var24] = 0;
                }
            }
        }
        if (this.field1193 > 0 && this.field1194 > 0) {
            int var28 = (int) ((double) this.field1193 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1199[var29] += field1199[var29 - var28] * this.field1194 / 100;
            }
        }
        if (this.field1195.field1278[0] > 0 || this.field1195.field1278[1] > 0) {
            this.field1196.method1259();
            int var30 = this.field1196.method1256(arg0 + 1);
            int var31 = this.field1195.method1343(0, (float) var30 / 65536.0F);
            int var32 = this.field1195.method1343(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1199[var31 + var33] * (long) Statics.field1283 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1199[var31 + var33 - 1 - var36] * (long) class64.field1276[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1199[var33 - 1 - var37] * (long) class64.field1276[1][var37] >> 16);
                    }
                    field1199[var33] = var35;
                    var30 = this.field1196.method1256(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1199[var31 + var33] * (long) Statics.field1283 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1199[var31 + var33 - 1 - var40] * (long) class64.field1276[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1199[var33 - 1 - var41] * (long) class64.field1276[1][var41] >> 16);
                        }
                        field1199[var33] = var39;
                        var30 = this.field1196.method1256(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1199[var31 + var33 - 1 - var43] * (long) class64.field1276[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1199[var33 - 1 - var44] * (long) class64.field1276[1][var44] >> 16);
                            }
                            field1199[var33] = var42;
                            this.field1196.method1256(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1195.method1343(0, (float) var30 / 65536.0F);
                    var32 = this.field1195.method1343(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1199[var46] < -32768) {
                field1199[var46] = -32768;
            }
            if (field1199[var46] > 32767) {
                field1199[var46] = 32767;
            }
        }
        return field1199;
    }

    @ObfuscatedName("bt.l(III)I")
    public final int method1240(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1201[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1200[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bt.c(Ldo;)V")
    public final void method1238(class127 arg0) {
        this.field1204 = new class56();
        this.field1204.method1257(arg0);
        this.field1183 = new class56();
        this.field1183.method1257(arg0);
        int var2 = arg0.method2438();
        if (var2 != 0) {
            arg0.field2059--;
            this.field1202 = new class56();
            this.field1202.method1257(arg0);
            this.field1192 = new class56();
            this.field1192.method1257(arg0);
        }
        int var3 = arg0.method2438();
        if (var3 != 0) {
            arg0.field2059--;
            this.field1184 = new class56();
            this.field1184.method1257(arg0);
            this.field1187 = new class56();
            this.field1187.method1257(arg0);
        }
        int var4 = arg0.method2438();
        if (var4 != 0) {
            arg0.field2059--;
            this.field1186 = new class56();
            this.field1186.method1257(arg0);
            this.field1189 = new class56();
            this.field1189.method1257(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2423();
            if (var6 == 0) {
                break;
            }
            this.field1190[var5] = var6;
            this.field1191[var5] = arg0.method2628();
            this.field1182[var5] = arg0.method2423();
        }
        this.field1193 = arg0.method2423();
        this.field1194 = arg0.method2423();
        this.field1185 = arg0.method2440();
        this.field1198 = arg0.method2440();
        this.field1195 = new class64();
        this.field1196 = new class56();
        this.field1195.method1344(arg0, this.field1196);
    }
}
