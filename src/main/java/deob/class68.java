package deob;

import java.util.Random;

@ObfuscatedName("bm")
public class class68 {

    @ObfuscatedName("bm.f")
    public class54 field549;

    @ObfuscatedName("bm.e")
    public class54 field552;

    @ObfuscatedName("bm.v")
    public class54 field553;

    @ObfuscatedName("bm.y")
    public class54 field543;

    @ObfuscatedName("bm.j")
    public class54 field544;

    @ObfuscatedName("bm.o")
    public class54 field545;

    @ObfuscatedName("bm.m")
    public class54 field542;

    @ObfuscatedName("bm.r")
    public class54 field540;

    @ObfuscatedName("bm.h")
    public int[] field548 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bm.d")
    public int[] field547 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bm.z")
    public int[] field550 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bm.b")
    public int field551 = 0;

    @ObfuscatedName("bm.i")
    public int field563 = 100;

    @ObfuscatedName("bm.k")
    public class67 field541;

    @ObfuscatedName("bm.g")
    public class54 field554;

    @ObfuscatedName("bm.t")
    public int field546 = 500;

    @ObfuscatedName("bm.x")
    public int field556 = 0;

    @ObfuscatedName("bm.u")
    public static int[] field557;

    @ObfuscatedName("bm.q")
    public static int[] field558 = new int[32768];

    @ObfuscatedName("bm.s")
    public static int[] field565;

    @ObfuscatedName("bm.c")
    public static int[] field561;

    @ObfuscatedName("bm.n")
    public static int[] field562;

    @ObfuscatedName("bm.l")
    public static int[] field559;

    @ObfuscatedName("bm.w")
    public static int[] field564;

    @ObfuscatedName("bm.a")
    public static int[] field555;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field558[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field565 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field565[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field557 = new int[220500];
        field561 = new int[5];
        field562 = new int[5];
        field559 = new int[5];
        field564 = new int[5];
        field555 = new int[5];
    }

    @ObfuscatedName("bm.f(II)[I")
    public final int[] method964(int arg0, int arg1) {
        class308.method5044(field557, 0, arg0);
        if (arg1 < 10) {
            return field557;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field549.method726();
        this.field552.method726();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field553 != null) {
            this.field553.method726();
            this.field543.method726();
            var5 = (int) ((double) (this.field553.field424 - this.field553.field426) * 32.768D / var3);
            var6 = (int) ((double) this.field553.field426 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field544 != null) {
            this.field544.method726();
            this.field545.method726();
            var8 = (int) ((double) (this.field544.field424 - this.field544.field426) * 32.768D / var3);
            var9 = (int) ((double) this.field544.field426 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field548[var11] != 0) {
                field561[var11] = 0;
                field562[var11] = (int) ((double) this.field550[var11] * var3);
                field559[var11] = (this.field548[var11] << 14) / 100;
                field564[var11] = (int) ((double) (this.field549.field424 - this.field549.field426) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field547[var11]) / var3);
                field555[var11] = (int) ((double) this.field549.field426 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field549.method719(arg0);
            int var14 = this.field552.method719(arg0);
            if (this.field553 != null) {
                int var15 = this.field553.method719(arg0);
                int var16 = this.field543.method719(arg0);
                var13 += this.method966(var7, var16, this.field553.field425) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field544 != null) {
                int var17 = this.field544.method719(arg0);
                int var18 = this.field545.method719(arg0);
                var14 = var14 * ((this.method966(var10, var18, this.field544.field425) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field548[var19] != 0) {
                    int var20 = field562[var19] + var12;
                    if (var20 < arg0) {
                        field557[var20] += this.method966(field561[var19], field559[var19] * var14 >> 15, this.field549.field425);
                        field561[var19] += (field564[var19] * var13 >> 16) + field555[var19];
                    }
                }
            }
        }
        if (this.field542 != null) {
            this.field542.method726();
            this.field540.method726();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field542.method719(arg0);
                int var26 = this.field540.method719(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field542.field424 - this.field542.field426) * var25 >> 8) + this.field542.field426;
                } else {
                    var27 = ((this.field542.field424 - this.field542.field426) * var26 >> 8) + this.field542.field426;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field557[var24] = 0;
                }
            }
        }
        if (this.field551 > 0 && this.field563 > 0) {
            int var28 = (int) ((double) this.field551 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field557[var29] += field557[var29 - var28] * this.field563 / 100;
            }
        }
        if (this.field541.field528[0] > 0 || this.field541.field528[1] > 0) {
            this.field554.method726();
            int var30 = this.field554.method719(arg0 + 1);
            int var31 = this.field541.method946(0, (float) var30 / 65536.0F);
            int var32 = this.field541.method946(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field557[var31 + var33] * (long) Statics.field537 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field557[var31 + var33 - 1 - var36] * (long) class67.field538[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field557[var33 - 1 - var37] * (long) class67.field538[1][var37] >> 16);
                    }
                    field557[var33] = var35;
                    var30 = this.field554.method719(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field557[var31 + var33] * (long) Statics.field537 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field557[var31 + var33 - 1 - var40] * (long) class67.field538[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field557[var33 - 1 - var41] * (long) class67.field538[1][var41] >> 16);
                        }
                        field557[var33] = var39;
                        var30 = this.field554.method719(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field557[var31 + var33 - 1 - var43] * (long) class67.field538[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field557[var33 - 1 - var44] * (long) class67.field538[1][var44] >> 16);
                            }
                            field557[var33] = var42;
                            this.field554.method719(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field541.method946(0, (float) var30 / 65536.0F);
                    var32 = this.field541.method946(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field557[var46] < -32768) {
                field557[var46] = -32768;
            }
            if (field557[var46] > 32767) {
                field557[var46] = 32767;
            }
        }
        return field557;
    }

    @ObfuscatedName("bm.e(III)I")
    public final int method966(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field565[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field558[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bm.v(Lnt;)V")
    public final void method967(class384 arg0) {
        this.field549 = new class54();
        this.field549.method716(arg0);
        this.field552 = new class54();
        this.field552.method716(arg0);
        int var2 = arg0.method5902();
        if (var2 != 0) {
            arg0.field4161--;
            this.field553 = new class54();
            this.field553.method716(arg0);
            this.field543 = new class54();
            this.field543.method716(arg0);
        }
        int var3 = arg0.method5902();
        if (var3 != 0) {
            arg0.field4161--;
            this.field544 = new class54();
            this.field544.method716(arg0);
            this.field545 = new class54();
            this.field545.method716(arg0);
        }
        int var4 = arg0.method5902();
        if (var4 != 0) {
            arg0.field4161--;
            this.field542 = new class54();
            this.field542.method716(arg0);
            this.field540 = new class54();
            this.field540.method716(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method5911();
            if (var6 == 0) {
                break;
            }
            this.field548[var5] = var6;
            this.field547[var5] = arg0.method5910();
            this.field550[var5] = arg0.method5911();
        }
        this.field551 = arg0.method5911();
        this.field563 = arg0.method5911();
        this.field546 = arg0.method5899();
        this.field556 = arg0.method5899();
        this.field541 = new class67();
        this.field554 = new class54();
        this.field541.method947(arg0, this.field554);
    }
}
