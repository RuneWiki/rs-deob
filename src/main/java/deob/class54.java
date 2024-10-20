package deob;

import java.util.Random;

@ObfuscatedName("bl")
public class class54 {

    @ObfuscatedName("bl.p")
    public class56 field1155;

    @ObfuscatedName("bl.e")
    public class56 field1144;

    @ObfuscatedName("bl.a")
    public class56 field1140;

    @ObfuscatedName("bl.h")
    public class56 field1142;

    @ObfuscatedName("bl.y")
    public class56 field1143;

    @ObfuscatedName("bl.j")
    public class56 field1154;

    @ObfuscatedName("bl.l")
    public class56 field1145;

    @ObfuscatedName("bl.f")
    public class56 field1146;

    @ObfuscatedName("bl.n")
    public int[] field1147 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.k")
    public int[] field1151 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.q")
    public int[] field1149 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.w")
    public int field1150 = 0;

    @ObfuscatedName("bl.v")
    public int field1163 = 100;

    @ObfuscatedName("bl.z")
    public class64 field1152;

    @ObfuscatedName("bl.m")
    public class56 field1139;

    @ObfuscatedName("bl.r")
    public int field1141 = 500;

    @ObfuscatedName("bl.u")
    public int field1156 = 0;

    @ObfuscatedName("bl.i")
    public static int[] field1148;

    @ObfuscatedName("bl.x")
    public static int[] field1157 = new int[32768];

    @ObfuscatedName("bl.s")
    public static int[] field1153;

    @ObfuscatedName("bl.g")
    public static int[] field1160;

    @ObfuscatedName("bl.d")
    public static int[] field1161;

    @ObfuscatedName("bl.t")
    public static int[] field1158;

    @ObfuscatedName("bl.b")
    public static int[] field1162;

    @ObfuscatedName("bl.c")
    public static int[] field1164;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1157[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1153 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1153[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1148 = new int[220500];
        field1160 = new int[5];
        field1161 = new int[5];
        field1158 = new int[5];
        field1162 = new int[5];
        field1164 = new int[5];
    }

    @ObfuscatedName("bl.p(II)[I")
    public final int[] method1245(int arg0, int arg1) {
        class128.method2685(field1148, 0, arg0);
        if (arg1 < 10) {
            return field1148;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1155.method1261();
        this.field1144.method1261();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1140 != null) {
            this.field1140.method1261();
            this.field1142.method1261();
            var5 = (int) ((double) (this.field1140.field1186 - this.field1140.field1182) * 32.768D / var3);
            var6 = (int) ((double) this.field1140.field1182 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1143 != null) {
            this.field1143.method1261();
            this.field1154.method1261();
            var8 = (int) ((double) (this.field1143.field1186 - this.field1143.field1182) * 32.768D / var3);
            var9 = (int) ((double) this.field1143.field1182 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1147[var11] != 0) {
                field1160[var11] = 0;
                field1161[var11] = (int) ((double) this.field1149[var11] * var3);
                field1158[var11] = (this.field1147[var11] << 14) / 100;
                field1162[var11] = (int) ((double) (this.field1155.field1186 - this.field1155.field1182) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1151[var11]) / var3);
                field1164[var11] = (int) ((double) this.field1155.field1182 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1155.method1263(arg0);
            int var14 = this.field1144.method1263(arg0);
            if (this.field1140 != null) {
                int var15 = this.field1140.method1263(arg0);
                int var16 = this.field1142.method1263(arg0);
                var13 += this.method1244(var7, var16, this.field1140.field1183) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1143 != null) {
                int var17 = this.field1143.method1263(arg0);
                int var18 = this.field1154.method1263(arg0);
                var14 = var14 * ((this.method1244(var10, var18, this.field1143.field1183) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1147[var19] != 0) {
                    int var20 = field1161[var19] + var12;
                    if (var20 < arg0) {
                        field1148[var20] += this.method1244(field1160[var19], field1158[var19] * var14 >> 15, this.field1155.field1183);
                        field1160[var19] += (field1162[var19] * var13 >> 16) + field1164[var19];
                    }
                }
            }
        }
        if (this.field1145 != null) {
            this.field1145.method1261();
            this.field1146.method1261();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1145.method1263(arg0);
                int var26 = this.field1146.method1263(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1145.field1186 - this.field1145.field1182) * var25 >> 8) + this.field1145.field1182;
                } else {
                    var27 = ((this.field1145.field1186 - this.field1145.field1182) * var26 >> 8) + this.field1145.field1182;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1148[var24] = 0;
                }
            }
        }
        if (this.field1150 > 0 && this.field1163 > 0) {
            int var28 = (int) ((double) this.field1150 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1148[var29] += field1148[var29 - var28] * this.field1163 / 100;
            }
        }
        if (this.field1152.field1244[0] > 0 || this.field1152.field1244[1] > 0) {
            this.field1139.method1261();
            int var30 = this.field1139.method1263(arg0 + 1);
            int var31 = this.field1152.method1363(0, (float) var30 / 65536.0F);
            int var32 = this.field1152.method1363(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1148[var31 + var33] * (long) Statics.field1248 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1148[var31 + var33 - 1 - var36] * (long) class64.field1251[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1148[var33 - 1 - var37] * (long) class64.field1251[1][var37] >> 16);
                    }
                    field1148[var33] = var35;
                    var30 = this.field1139.method1263(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1148[var31 + var33] * (long) Statics.field1248 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1148[var31 + var33 - 1 - var40] * (long) class64.field1251[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1148[var33 - 1 - var41] * (long) class64.field1251[1][var41] >> 16);
                        }
                        field1148[var33] = var39;
                        var30 = this.field1139.method1263(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1148[var31 + var33 - 1 - var43] * (long) class64.field1251[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1148[var33 - 1 - var44] * (long) class64.field1251[1][var44] >> 16);
                            }
                            field1148[var33] = var42;
                            this.field1139.method1263(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1152.method1363(0, (float) var30 / 65536.0F);
                    var32 = this.field1152.method1363(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1148[var46] < -32768) {
                field1148[var46] = -32768;
            }
            if (field1148[var46] > 32767) {
                field1148[var46] = 32767;
            }
        }
        return field1148;
    }

    @ObfuscatedName("bl.e(III)I")
    public final int method1244(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1153[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1157[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bl.a(Ldj;)V")
    public final void method1246(class127 arg0) {
        this.field1155 = new class56();
        this.field1155.method1273(arg0);
        this.field1144 = new class56();
        this.field1144.method1273(arg0);
        int var2 = arg0.method2494();
        if (var2 != 0) {
            arg0.field2029--;
            this.field1140 = new class56();
            this.field1140.method1273(arg0);
            this.field1142 = new class56();
            this.field1142.method1273(arg0);
        }
        int var3 = arg0.method2494();
        if (var3 != 0) {
            arg0.field2029--;
            this.field1143 = new class56();
            this.field1143.method1273(arg0);
            this.field1154 = new class56();
            this.field1154.method1273(arg0);
        }
        int var4 = arg0.method2494();
        if (var4 != 0) {
            arg0.field2029--;
            this.field1145 = new class56();
            this.field1145.method1273(arg0);
            this.field1146 = new class56();
            this.field1146.method1273(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2507();
            if (var6 == 0) {
                break;
            }
            this.field1147[var5] = var6;
            this.field1151[var5] = arg0.method2625();
            this.field1149[var5] = arg0.method2507();
        }
        this.field1150 = arg0.method2507();
        this.field1163 = arg0.method2507();
        this.field1141 = arg0.method2496();
        this.field1156 = arg0.method2496();
        this.field1152 = new class64();
        this.field1139 = new class56();
        this.field1152.method1354(arg0, this.field1139);
    }
}
