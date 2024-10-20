package deob;

import java.util.Random;

@ObfuscatedName("bh")
public class class62 {

    @ObfuscatedName("bh.z")
    public class48 field1217;

    @ObfuscatedName("bh.n")
    public class48 field1202;

    @ObfuscatedName("bh.u")
    public class48 field1194;

    @ObfuscatedName("bh.t")
    public class48 field1203;

    @ObfuscatedName("bh.e")
    public class48 field1209;

    @ObfuscatedName("bh.a")
    public class48 field1197;

    @ObfuscatedName("bh.l")
    public class48 field1198;

    @ObfuscatedName("bh.v")
    public class48 field1206;

    @ObfuscatedName("bh.j")
    public int[] field1200 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bh.k")
    public int[] field1195 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bh.g")
    public int[] field1193 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bh.d")
    public int field1201 = 0;

    @ObfuscatedName("bh.b")
    public int field1204 = 100;

    @ObfuscatedName("bh.i")
    public class54 field1192;

    @ObfuscatedName("bh.o")
    public class48 field1216;

    @ObfuscatedName("bh.x")
    public int field1207 = 500;

    @ObfuscatedName("bh.m")
    public int field1208 = 0;

    @ObfuscatedName("bh.f")
    public static int[] field1199;

    @ObfuscatedName("bh.q")
    public static int[] field1210 = new int[32768];

    @ObfuscatedName("bh.c")
    public static int[] field1211;

    @ObfuscatedName("bh.y")
    public static int[] field1213;

    @ObfuscatedName("bh.r")
    public static int[] field1214;

    @ObfuscatedName("bh.w")
    public static int[] field1215;

    @ObfuscatedName("bh.p")
    public static int[] field1205;

    @ObfuscatedName("bh.s")
    public static int[] field1196;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1210[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1211 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1211[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1199 = new int[220500];
        field1213 = new int[5];
        field1214 = new int[5];
        field1215 = new int[5];
        field1205 = new int[5];
        field1196 = new int[5];
    }

    @ObfuscatedName("bh.z(II)[I")
    public final int[] method1300(int arg0, int arg1) {
        class105.method2344(field1199, 0, arg0);
        if (arg1 < 10) {
            return field1199;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1217.method1023();
        this.field1202.method1023();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1194 != null) {
            this.field1194.method1023();
            this.field1203.method1023();
            var5 = (int) ((double) (this.field1194.field1072 - this.field1194.field1071) * 32.768D / var3);
            var6 = (int) ((double) this.field1194.field1071 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1209 != null) {
            this.field1209.method1023();
            this.field1197.method1023();
            var8 = (int) ((double) (this.field1209.field1072 - this.field1209.field1071) * 32.768D / var3);
            var9 = (int) ((double) this.field1209.field1071 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1200[var11] != 0) {
                field1213[var11] = 0;
                field1214[var11] = (int) ((double) this.field1193[var11] * var3);
                field1215[var11] = (this.field1200[var11] << 14) / 100;
                field1205[var11] = (int) ((double) (this.field1217.field1072 - this.field1217.field1071) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1195[var11]) / var3);
                field1196[var11] = (int) ((double) this.field1217.field1071 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1217.method1024(arg0);
            int var14 = this.field1202.method1024(arg0);
            if (this.field1194 != null) {
                int var15 = this.field1194.method1024(arg0);
                int var16 = this.field1203.method1024(arg0);
                var13 += this.method1296(var7, var16, this.field1194.field1073) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1209 != null) {
                int var17 = this.field1209.method1024(arg0);
                int var18 = this.field1197.method1024(arg0);
                var14 = var14 * ((this.method1296(var10, var18, this.field1209.field1073) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1200[var19] != 0) {
                    int var20 = field1214[var19] + var12;
                    if (var20 < arg0) {
                        field1199[var20] += this.method1296(field1213[var19], field1215[var19] * var14 >> 15, this.field1217.field1073);
                        field1213[var19] += (field1205[var19] * var13 >> 16) + field1196[var19];
                    }
                }
            }
        }
        if (this.field1198 != null) {
            this.field1198.method1023();
            this.field1206.method1023();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1198.method1024(arg0);
                int var26 = this.field1206.method1024(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1198.field1072 - this.field1198.field1071) * var25 >> 8) + this.field1198.field1071;
                } else {
                    var27 = ((this.field1198.field1072 - this.field1198.field1071) * var26 >> 8) + this.field1198.field1071;
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
        if (this.field1201 > 0 && this.field1204 > 0) {
            int var28 = (int) ((double) this.field1201 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1199[var29] += field1199[var29 - var28] * this.field1204 / 100;
            }
        }
        if (this.field1192.field1110[0] > 0 || this.field1192.field1110[1] > 0) {
            this.field1216.method1023();
            int var30 = this.field1216.method1024(arg0 + 1);
            int var31 = this.field1192.method1078(0, (float) var30 / 65536.0F);
            int var32 = this.field1192.method1078(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1199[var31 + var33] * (long) Statics.field1114 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1199[var31 + var33 - 1 - var36] * (long) class54.field1106[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1199[var33 - 1 - var37] * (long) class54.field1106[1][var37] >> 16);
                    }
                    field1199[var33] = var35;
                    var30 = this.field1216.method1024(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1199[var31 + var33] * (long) Statics.field1114 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1199[var31 + var33 - 1 - var40] * (long) class54.field1106[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1199[var33 - 1 - var41] * (long) class54.field1106[1][var41] >> 16);
                        }
                        field1199[var33] = var39;
                        var30 = this.field1216.method1024(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1199[var31 + var33 - 1 - var43] * (long) class54.field1106[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1199[var33 - 1 - var44] * (long) class54.field1106[1][var44] >> 16);
                            }
                            field1199[var33] = var42;
                            this.field1216.method1024(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1192.method1078(0, (float) var30 / 65536.0F);
                    var32 = this.field1192.method1078(1, (float) var30 / 65536.0F);
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

    @ObfuscatedName("bh.n(III)I")
    public final int method1296(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1211[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1210[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bh.u(Lcj;)V")
    public final void method1294(class104 arg0) {
        this.field1217 = new class48();
        this.field1217.method1022(arg0);
        this.field1202 = new class48();
        this.field1202.method1022(arg0);
        int var2 = arg0.method2257();
        if (var2 != 0) {
            arg0.field1815--;
            this.field1194 = new class48();
            this.field1194.method1022(arg0);
            this.field1203 = new class48();
            this.field1203.method1022(arg0);
        }
        int var3 = arg0.method2257();
        if (var3 != 0) {
            arg0.field1815--;
            this.field1209 = new class48();
            this.field1209.method1022(arg0);
            this.field1197 = new class48();
            this.field1197.method1022(arg0);
        }
        int var4 = arg0.method2257();
        if (var4 != 0) {
            arg0.field1815--;
            this.field1198 = new class48();
            this.field1198.method1022(arg0);
            this.field1206 = new class48();
            this.field1206.method1022(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2204();
            if (var6 == 0) {
                break;
            }
            this.field1200[var5] = var6;
            this.field1195[var5] = arg0.method2139();
            this.field1193[var5] = arg0.method2204();
        }
        this.field1201 = arg0.method2204();
        this.field1204 = arg0.method2204();
        this.field1207 = arg0.method2206();
        this.field1208 = arg0.method2206();
        this.field1192 = new class54();
        this.field1216 = new class48();
        this.field1192.method1083(arg0, this.field1216);
    }
}
