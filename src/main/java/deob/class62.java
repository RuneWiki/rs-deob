package deob;

import java.util.Random;

@ObfuscatedName("cm")
public class class62 {

    @ObfuscatedName("cm.aq")
    public class44 field452;

    @ObfuscatedName("cm.aw")
    public class44 field439;

    @ObfuscatedName("cm.al")
    public class44 field442;

    @ObfuscatedName("cm.ai")
    public class44 field441;

    @ObfuscatedName("cm.ar")
    public class44 field457;

    @ObfuscatedName("cm.as")
    public class44 field443;

    @ObfuscatedName("cm.aa")
    public class44 field444;

    @ObfuscatedName("cm.az")
    public class44 field445;

    @ObfuscatedName("cm.ao")
    public int[] field446 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cm.au")
    public int[] field463 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cm.ak")
    public int[] field448 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cm.ah")
    public int field447 = 0;

    @ObfuscatedName("cm.aj")
    public int field450 = 100;

    @ObfuscatedName("cm.af")
    public class59 field451;

    @ObfuscatedName("cm.ax")
    public class44 field459;

    @ObfuscatedName("cm.an")
    public int field453 = 500;

    @ObfuscatedName("cm.ag")
    public int field454 = 0;

    @ObfuscatedName("cm.am")
    public static int[] field455;

    @ObfuscatedName("cm.ad")
    public static int[] field449 = new int[32768];

    @ObfuscatedName("cm.at")
    public static int[] field460;

    @ObfuscatedName("cm.ae")
    public static int[] field440;

    @ObfuscatedName("cm.ac")
    public static int[] field456;

    @ObfuscatedName("cm.ab")
    public static int[] field461;

    @ObfuscatedName("cm.av")
    public static int[] field462;

    @ObfuscatedName("cm.ap")
    public static int[] field438;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field449[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field460 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field460[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field455 = new int[220500];
        field440 = new int[5];
        field456 = new int[5];
        field461 = new int[5];
        field462 = new int[5];
        field438 = new int[5];
    }

    @ObfuscatedName("cm.aq(II)[I")
    public final int[] method1079(int arg0, int arg1) {
        class429.method7310(field455, 0, arg0);
        if (arg1 < 10) {
            return field455;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field452.method767();
        this.field439.method767();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field442 != null) {
            this.field442.method767();
            this.field441.method767();
            var5 = (int) ((double) (this.field442.field303 - this.field442.field307) * 32.768D / var3);
            var6 = (int) ((double) this.field442.field307 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field457 != null) {
            this.field457.method767();
            this.field443.method767();
            var8 = (int) ((double) (this.field457.field303 - this.field457.field307) * 32.768D / var3);
            var9 = (int) ((double) this.field457.field307 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field446[var11] != 0) {
                field440[var11] = 0;
                field456[var11] = (int) ((double) this.field448[var11] * var3);
                field461[var11] = (this.field446[var11] << 14) / 100;
                field462[var11] = (int) ((double) (this.field452.field303 - this.field452.field307) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field463[var11]) / var3);
                field438[var11] = (int) ((double) this.field452.field307 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field452.method768(arg0);
            int var14 = this.field439.method768(arg0);
            if (this.field442 != null) {
                int var15 = this.field442.method768(arg0);
                int var16 = this.field441.method768(arg0);
                var13 += this.method1081(var7, var16, this.field442.field301) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field457 != null) {
                int var17 = this.field457.method768(arg0);
                int var18 = this.field443.method768(arg0);
                var14 = var14 * ((this.method1081(var10, var18, this.field457.field301) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field446[var19] != 0) {
                    int var20 = field456[var19] + var12;
                    if (var20 < arg0) {
                        field455[var20] += this.method1081(field440[var19], field461[var19] * var14 >> 15, this.field452.field301);
                        field440[var19] += (field462[var19] * var13 >> 16) + field438[var19];
                    }
                }
            }
        }
        if (this.field444 != null) {
            this.field444.method767();
            this.field445.method767();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field444.method768(arg0);
                int var26 = this.field445.method768(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field444.field303 - this.field444.field307) * var25 >> 8) + this.field444.field307;
                } else {
                    var27 = ((this.field444.field303 - this.field444.field307) * var26 >> 8) + this.field444.field307;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field455[var24] = 0;
                }
            }
        }
        if (this.field447 > 0 && this.field450 > 0) {
            int var28 = (int) ((double) this.field447 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field455[var29] += field455[var29 - var28] * this.field450 / 100;
            }
        }
        if (this.field451.field418[0] > 0 || this.field451.field418[1] > 0) {
            this.field459.method767();
            int var30 = this.field459.method768(arg0 + 1);
            int var31 = this.field451.method1038(0, (float) var30 / 65536.0F);
            int var32 = this.field451.method1038(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field455[var31 + var33] * (long) Statics.field422 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field455[var31 + var33 - 1 - var36] * (long) class59.field417[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field455[var33 - 1 - var37] * (long) class59.field417[1][var37] >> 16);
                    }
                    field455[var33] = var35;
                    var30 = this.field459.method768(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field455[var31 + var33] * (long) Statics.field422 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field455[var31 + var33 - 1 - var41] * (long) class59.field417[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field455[var33 - 1 - var42] * (long) class59.field417[1][var42] >> 16);
                        }
                        field455[var33] = var40;
                        var30 = this.field459.method768(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field455[var31 + var33 - 1 - var44] * (long) class59.field417[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field455[var33 - 1 - var45] * (long) class59.field417[1][var45] >> 16);
                            }
                            field455[var33] = var43;
                            this.field459.method768(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field451.method1038(0, (float) var30 / 65536.0F);
                    var32 = this.field451.method1038(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field455[var47] < -32768) {
                field455[var47] = -32768;
            }
            if (field455[var47] > 32767) {
                field455[var47] = 32767;
            }
        }
        return field455;
    }

    @ObfuscatedName("cm.aw(III)I")
    public final int method1081(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field460[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field449[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cm.al(Luq;)V")
    public final void method1080(class534 arg0) {
        this.field452 = new class44();
        this.field452.method775(arg0);
        this.field439 = new class44();
        this.field439.method775(arg0);
        int var2 = arg0.method8591();
        if (var2 != 0) {
            arg0.field5200--;
            this.field442 = new class44();
            this.field442.method775(arg0);
            this.field441 = new class44();
            this.field441.method775(arg0);
        }
        int var3 = arg0.method8591();
        if (var3 != 0) {
            arg0.field5200--;
            this.field457 = new class44();
            this.field457.method775(arg0);
            this.field443 = new class44();
            this.field443.method775(arg0);
        }
        int var4 = arg0.method8591();
        if (var4 != 0) {
            arg0.field5200--;
            this.field444 = new class44();
            this.field444.method775(arg0);
            this.field445 = new class44();
            this.field445.method775(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method8820();
            if (var6 == 0) {
                break;
            }
            this.field446[var5] = var6;
            this.field463[var5] = arg0.method8606();
            this.field448[var5] = arg0.method8820();
        }
        this.field447 = arg0.method8820();
        this.field450 = arg0.method8820();
        this.field453 = arg0.method8593();
        this.field454 = arg0.method8593();
        this.field451 = new class59();
        this.field459 = new class44();
        this.field451.method1043(arg0, this.field459);
    }
}
