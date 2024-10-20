package deob;

import java.util.Random;

@ObfuscatedName("bp")
public class class65 {

    @ObfuscatedName("bp.k")
    public class51 field1224;

    @ObfuscatedName("bp.y")
    public class51 field1201;

    @ObfuscatedName("bp.s")
    public class51 field1207;

    @ObfuscatedName("bp.g")
    public class51 field1206;

    @ObfuscatedName("bp.h")
    public class51 field1202;

    @ObfuscatedName("bp.l")
    public class51 field1205;

    @ObfuscatedName("bp.e")
    public class51 field1213;

    @ObfuscatedName("bp.u")
    public class51 field1204;

    @ObfuscatedName("bp.j")
    public int[] field1208 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bp.c")
    public int[] field1209 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bp.d")
    public int[] field1210 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bp.v")
    public int field1211 = 0;

    @ObfuscatedName("bp.n")
    public int field1212 = 100;

    @ObfuscatedName("bp.z")
    public class57 field1200;

    @ObfuscatedName("bp.a")
    public class51 field1214;

    @ObfuscatedName("bp.t")
    public int field1215 = 500;

    @ObfuscatedName("bp.p")
    public int field1216 = 0;

    @ObfuscatedName("bp.i")
    public static int[] field1217;

    @ObfuscatedName("bp.r")
    public static int[] field1218 = new int[32768];

    @ObfuscatedName("bp.w")
    public static int[] field1219;

    @ObfuscatedName("bp.x")
    public static int[] field1203;

    @ObfuscatedName("bp.q")
    public static int[] field1221;

    @ObfuscatedName("bp.o")
    public static int[] field1223;

    @ObfuscatedName("bp.m")
    public static int[] field1222;

    @ObfuscatedName("bp.f")
    public static int[] field1225;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1218[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1219 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1219[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1217 = new int[220500];
        field1203 = new int[5];
        field1221 = new int[5];
        field1223 = new int[5];
        field1222 = new int[5];
        field1225 = new int[5];
    }

    @ObfuscatedName("bp.k(II)[I")
    public final int[] method1301(int arg0, int arg1) {
        class108.method2338(field1217, 0, arg0);
        if (arg1 < 10) {
            return field1217;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1224.method1035();
        this.field1201.method1035();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1207 != null) {
            this.field1207.method1035();
            this.field1206.method1035();
            var5 = (int) ((double) (this.field1207.field1080 - this.field1207.field1079) * 32.768D / var3);
            var6 = (int) ((double) this.field1207.field1079 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1202 != null) {
            this.field1202.method1035();
            this.field1205.method1035();
            var8 = (int) ((double) (this.field1202.field1080 - this.field1202.field1079) * 32.768D / var3);
            var9 = (int) ((double) this.field1202.field1079 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1208[var11] != 0) {
                field1203[var11] = 0;
                field1221[var11] = (int) ((double) this.field1210[var11] * var3);
                field1223[var11] = (this.field1208[var11] << 14) / 100;
                field1222[var11] = (int) ((double) (this.field1224.field1080 - this.field1224.field1079) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1209[var11]) / var3);
                field1225[var11] = (int) ((double) this.field1224.field1079 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1224.method1030(arg0);
            int var14 = this.field1201.method1030(arg0);
            if (this.field1207 != null) {
                int var15 = this.field1207.method1030(arg0);
                int var16 = this.field1206.method1030(arg0);
                var13 += this.method1302(var7, var16, this.field1207.field1081) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1202 != null) {
                int var17 = this.field1202.method1030(arg0);
                int var18 = this.field1205.method1030(arg0);
                var14 = var14 * ((this.method1302(var10, var18, this.field1202.field1081) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1208[var19] != 0) {
                    int var20 = field1221[var19] + var12;
                    if (var20 < arg0) {
                        field1217[var20] += this.method1302(field1203[var19], field1223[var19] * var14 >> 15, this.field1224.field1081);
                        field1203[var19] += (field1222[var19] * var13 >> 16) + field1225[var19];
                    }
                }
            }
        }
        if (this.field1213 != null) {
            this.field1213.method1035();
            this.field1204.method1035();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1213.method1030(arg0);
                int var26 = this.field1204.method1030(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1213.field1080 - this.field1213.field1079) * var25 >> 8) + this.field1213.field1079;
                } else {
                    var27 = ((this.field1213.field1080 - this.field1213.field1079) * var26 >> 8) + this.field1213.field1079;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1217[var24] = 0;
                }
            }
        }
        if (this.field1211 > 0 && this.field1212 > 0) {
            int var28 = (int) ((double) this.field1211 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1217[var29] += field1217[var29 - var28] * this.field1212 / 100;
            }
        }
        if (this.field1200.field1123[0] > 0 || this.field1200.field1123[1] > 0) {
            this.field1214.method1035();
            int var30 = this.field1214.method1030(arg0 + 1);
            int var31 = this.field1200.method1090(0, (float) var30 / 65536.0F);
            int var32 = this.field1200.method1090(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1217[var31 + var33] * (long) Statics.field1122 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1217[var31 + var33 - 1 - var36] * (long) class57.field1114[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1217[var33 - 1 - var37] * (long) class57.field1114[1][var37] >> 16);
                    }
                    field1217[var33] = var35;
                    var30 = this.field1214.method1030(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1217[var31 + var33] * (long) Statics.field1122 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1217[var31 + var33 - 1 - var40] * (long) class57.field1114[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1217[var33 - 1 - var41] * (long) class57.field1114[1][var41] >> 16);
                        }
                        field1217[var33] = var39;
                        var30 = this.field1214.method1030(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1217[var31 + var33 - 1 - var43] * (long) class57.field1114[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1217[var33 - 1 - var44] * (long) class57.field1114[1][var44] >> 16);
                            }
                            field1217[var33] = var42;
                            this.field1214.method1030(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1200.method1090(0, (float) var30 / 65536.0F);
                    var32 = this.field1200.method1090(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1217[var46] < -32768) {
                field1217[var46] = -32768;
            }
            if (field1217[var46] > 32767) {
                field1217[var46] = 32767;
            }
        }
        return field1217;
    }

    @ObfuscatedName("bp.y(III)I")
    public final int method1302(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1219[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1218[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bp.s(Ldy;)V")
    public final void method1303(class107 arg0) {
        this.field1224 = new class51();
        this.field1224.method1027(arg0);
        this.field1201 = new class51();
        this.field1201.method1027(arg0);
        int var2 = arg0.method2138();
        if (var2 != 0) {
            arg0.field1838--;
            this.field1207 = new class51();
            this.field1207.method1027(arg0);
            this.field1206 = new class51();
            this.field1206.method1027(arg0);
        }
        int var3 = arg0.method2138();
        if (var3 != 0) {
            arg0.field1838--;
            this.field1202 = new class51();
            this.field1202.method1027(arg0);
            this.field1205 = new class51();
            this.field1205.method1027(arg0);
        }
        int var4 = arg0.method2138();
        if (var4 != 0) {
            arg0.field1838--;
            this.field1213 = new class51();
            this.field1213.method1027(arg0);
            this.field1204 = new class51();
            this.field1204.method1027(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2151();
            if (var6 == 0) {
                break;
            }
            this.field1208[var5] = var6;
            this.field1209[var5] = arg0.method2307();
            this.field1210[var5] = arg0.method2151();
        }
        this.field1211 = arg0.method2151();
        this.field1212 = arg0.method2151();
        this.field1215 = arg0.method2239();
        this.field1216 = arg0.method2239();
        this.field1200 = new class57();
        this.field1214 = new class51();
        this.field1200.method1091(arg0, this.field1214);
    }
}
