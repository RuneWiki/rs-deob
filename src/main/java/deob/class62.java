package deob;

import java.util.Random;

@ObfuscatedName("bq")
public class class62 {

    @ObfuscatedName("bq.m")
    public class48 field1196;

    @ObfuscatedName("bq.k")
    public class48 field1192;

    @ObfuscatedName("bq.y")
    public class48 field1194;

    @ObfuscatedName("bq.g")
    public class48 field1195;

    @ObfuscatedName("bq.r")
    public class48 field1213;

    @ObfuscatedName("bq.i")
    public class48 field1197;

    @ObfuscatedName("bq.f")
    public class48 field1198;

    @ObfuscatedName("bq.a")
    public class48 field1199;

    @ObfuscatedName("bq.w")
    public int[] field1200 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bq.u")
    public int[] field1201 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bq.d")
    public int[] field1202 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bq.t")
    public int field1203 = 0;

    @ObfuscatedName("bq.j")
    public int field1217 = 100;

    @ObfuscatedName("bq.q")
    public class54 field1205;

    @ObfuscatedName("bq.p")
    public class48 field1206;

    @ObfuscatedName("bq.v")
    public int field1207 = 500;

    @ObfuscatedName("bq.n")
    public int field1210 = 0;

    @ObfuscatedName("bq.l")
    public static int[] field1209;

    @ObfuscatedName("bq.c")
    public static int[] field1193 = new int[32768];

    @ObfuscatedName("bq.b")
    public static int[] field1211;

    @ObfuscatedName("bq.o")
    public static int[] field1208;

    @ObfuscatedName("bq.h")
    public static int[] field1214;

    @ObfuscatedName("bq.x")
    public static int[] field1215;

    @ObfuscatedName("bq.e")
    public static int[] field1216;

    @ObfuscatedName("bq.z")
    public static int[] field1204;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1193[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1211 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1211[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1209 = new int[220500];
        field1208 = new int[5];
        field1214 = new int[5];
        field1215 = new int[5];
        field1216 = new int[5];
        field1204 = new int[5];
    }

    @ObfuscatedName("bq.m(II)[I")
    public final int[] method1286(int arg0, int arg1) {
        class105.method2341(field1209, 0, arg0);
        if (arg1 < 10) {
            return field1209;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1196.method1008();
        this.field1192.method1008();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1194 != null) {
            this.field1194.method1008();
            this.field1195.method1008();
            var5 = (int) ((double) (this.field1194.field1072 - this.field1194.field1069) * 32.768D / var3);
            var6 = (int) ((double) this.field1194.field1069 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1213 != null) {
            this.field1213.method1008();
            this.field1197.method1008();
            var8 = (int) ((double) (this.field1213.field1072 - this.field1213.field1069) * 32.768D / var3);
            var9 = (int) ((double) this.field1213.field1069 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1200[var11] != 0) {
                field1208[var11] = 0;
                field1214[var11] = (int) ((double) this.field1202[var11] * var3);
                field1215[var11] = (this.field1200[var11] << 14) / 100;
                field1216[var11] = (int) ((double) (this.field1196.field1072 - this.field1196.field1069) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1201[var11]) / var3);
                field1204[var11] = (int) ((double) this.field1196.field1069 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1196.method1019(arg0);
            int var14 = this.field1192.method1019(arg0);
            if (this.field1194 != null) {
                int var15 = this.field1194.method1019(arg0);
                int var16 = this.field1195.method1019(arg0);
                var13 += this.method1279(var7, var16, this.field1194.field1076) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1213 != null) {
                int var17 = this.field1213.method1019(arg0);
                int var18 = this.field1197.method1019(arg0);
                var14 = var14 * ((this.method1279(var10, var18, this.field1213.field1076) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1200[var19] != 0) {
                    int var20 = field1214[var19] + var12;
                    if (var20 < arg0) {
                        field1209[var20] += this.method1279(field1208[var19], field1215[var19] * var14 >> 15, this.field1196.field1076);
                        field1208[var19] += (field1216[var19] * var13 >> 16) + field1204[var19];
                    }
                }
            }
        }
        if (this.field1198 != null) {
            this.field1198.method1008();
            this.field1199.method1008();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1198.method1019(arg0);
                int var26 = this.field1199.method1019(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1198.field1072 - this.field1198.field1069) * var25 >> 8) + this.field1198.field1069;
                } else {
                    var27 = ((this.field1198.field1072 - this.field1198.field1069) * var26 >> 8) + this.field1198.field1069;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1209[var24] = 0;
                }
            }
        }
        if (this.field1203 > 0 && this.field1217 > 0) {
            int var28 = (int) ((double) this.field1203 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1209[var29] += field1209[var29 - var28] * this.field1217 / 100;
            }
        }
        if (this.field1205.field1106[0] > 0 || this.field1205.field1106[1] > 0) {
            this.field1206.method1008();
            int var30 = this.field1206.method1019(arg0 + 1);
            int var31 = this.field1205.method1070(0, (float) var30 / 65536.0F);
            int var32 = this.field1205.method1070(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1209[var31 + var33] * (long) Statics.field1114 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1209[var31 + var33 - 1 - var36] * (long) class54.field1108[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1209[var33 - 1 - var37] * (long) class54.field1108[1][var37] >> 16);
                    }
                    field1209[var33] = var35;
                    var30 = this.field1206.method1019(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1209[var31 + var33] * (long) Statics.field1114 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1209[var31 + var33 - 1 - var40] * (long) class54.field1108[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1209[var33 - 1 - var41] * (long) class54.field1108[1][var41] >> 16);
                        }
                        field1209[var33] = var39;
                        var30 = this.field1206.method1019(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1209[var31 + var33 - 1 - var43] * (long) class54.field1108[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1209[var33 - 1 - var44] * (long) class54.field1108[1][var44] >> 16);
                            }
                            field1209[var33] = var42;
                            this.field1206.method1019(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1205.method1070(0, (float) var30 / 65536.0F);
                    var32 = this.field1205.method1070(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1209[var46] < -32768) {
                field1209[var46] = -32768;
            }
            if (field1209[var46] > 32767) {
                field1209[var46] = 32767;
            }
        }
        return field1209;
    }

    @ObfuscatedName("bq.k(III)I")
    public final int method1279(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1211[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1193[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bq.y(Lcb;)V")
    public final void method1280(class104 arg0) {
        this.field1196 = new class48();
        this.field1196.method1006(arg0);
        this.field1192 = new class48();
        this.field1192.method1006(arg0);
        int var2 = arg0.method2190();
        if (var2 != 0) {
            arg0.field1806--;
            this.field1194 = new class48();
            this.field1194.method1006(arg0);
            this.field1195 = new class48();
            this.field1195.method1006(arg0);
        }
        int var3 = arg0.method2190();
        if (var3 != 0) {
            arg0.field1806--;
            this.field1213 = new class48();
            this.field1213.method1006(arg0);
            this.field1197 = new class48();
            this.field1197.method1006(arg0);
        }
        int var4 = arg0.method2190();
        if (var4 != 0) {
            arg0.field1806--;
            this.field1198 = new class48();
            this.field1198.method1006(arg0);
            this.field1199 = new class48();
            this.field1199.method1006(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2143();
            if (var6 == 0) {
                break;
            }
            this.field1200[var5] = var6;
            this.field1201[var5] = arg0.method2142();
            this.field1202[var5] = arg0.method2143();
        }
        this.field1203 = arg0.method2143();
        this.field1217 = arg0.method2143();
        this.field1207 = arg0.method2132();
        this.field1210 = arg0.method2132();
        this.field1205 = new class54();
        this.field1206 = new class48();
        this.field1205.method1076(arg0, this.field1206);
    }
}
