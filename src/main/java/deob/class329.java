package deob;

import java.util.Arrays;

@ObfuscatedName("mt")
public class class329 {

    @ObfuscatedName("mt.au")
    public int[] field3585;

    @ObfuscatedName("mt.ae")
    public int[] field3570;

    @ObfuscatedName("mt.ao")
    public int[] field3571;

    @ObfuscatedName("mt.at")
    public int field3575 = -1;

    @ObfuscatedName("mt.ac")
    public int field3573 = 0;

    @ObfuscatedName("mt.ai")
    public int field3569;

    @ObfuscatedName("mt.az")
    public long field3574;

    @ObfuscatedName("mt.ap")
    public long field3576;

    @ObfuscatedName("mt.aa")
    public class184[] field3580;

    @ObfuscatedName("mt.af")
    public boolean field3578 = false;

    @ObfuscatedName("mt.ar")
    public static final int[] field3581 = new int[] { class210.field2336.field2335, class210.field2340.field2335, class210.field2333.field2335, class210.field2329.field2335, class210.field2343.field2335, class210.field2331.field2335, class210.field2339.field2335 };

    @ObfuscatedName("mt.am")
    public static class288 field3582 = new class288(260);

    @ObfuscatedName("mt.ax")
    public static class424 field3583 = new class424(16, class422.field4607);

    @ObfuscatedName("mt.ah")
    public static int field3584 = 0;

    public class329() {
    }

    public class329(class329 arg0) {
        int[] var2 = Arrays.copyOf(arg0.field3570, arg0.field3570.length);
        int[] var3 = Arrays.copyOf(arg0.field3585, arg0.field3585.length);
        class184[] var4 = (class184[]) (arg0.field3580 == null ? null : (class184[]) Arrays.copyOf(arg0.field3580, arg0.field3580.length));
        int[] var5 = Arrays.copyOf(arg0.field3571, arg0.field3571.length);
        this.method5517(var3, var2, var4, false, var5, arg0.field3573, arg0.field3569, arg0.field3575);
    }

    @ObfuscatedName("mt.au([I[I[Lho;Z[IIIII)V")
    public void method5517(int[] arg0, int[] arg1, class184[] arg2, boolean arg3, int[] arg4, int arg5, int arg6, int arg7) {
        this.field3580 = arg2;
        this.field3578 = arg3;
        this.field3575 = arg7;
        this.method5536(arg0, arg1, arg4, arg5, arg6);
    }

    @ObfuscatedName("mt.ae([I[I[IIII)V")
    public void method5536(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 == null) {
            arg0 = this.method5519(arg3);
        }
        if (arg1 == null) {
            arg1 = this.method5519(arg3);
        }
        this.field3585 = arg0;
        this.field3570 = arg1;
        this.field3571 = arg2;
        this.field3573 = arg3;
        this.field3569 = arg4;
        this.method5524();
    }

    @ObfuscatedName("mt.ao(IB)[I")
    public int[] method5519(int arg0) {
        int[] var2 = new int[12];
        for (int var3 = 0; var3 < 7; var3++) {
            for (int var4 = 0; var4 < Statics.field1981; var4++) {
                class190 var5 = class190.method3095(var4);
                if (var5 != null && !var5.field1989 && var3 + (arg0 == 1 ? 7 : 0) == var5.field1982) {
                    var2[field3581[var3]] = var4 + 256;
                    break;
                }
            }
        }
        return var2;
    }

    @ObfuscatedName("mt.at(IZI)V")
    public void method5520(int arg0, boolean arg1) {
        int var3 = this.field3570[field3581[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class190 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1981) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1981 - 1;
                }
            }
            var4 = class190.method3095(var3);
        } while (var4 == null || var4.field1989 || (this.field3573 == 1 ? 7 : 0) + arg0 != var4.field1982);
        this.field3570[field3581[arg0]] = var3 + 256;
        this.method5524();
    }

    @ObfuscatedName("mt.ac(IZB)V")
    public void method5521(int arg0, boolean arg1) {
        int var3 = this.field3571[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1660[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var5 = false;
                } else {
                    var5 = true;
                }
            } while (!var5);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1660[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field3571[arg0] = var3;
        this.method5524();
    }

    @ObfuscatedName("mt.ai(II)V")
    public void method5540(int arg0) {
        if (this.field3573 != arg0) {
            this.method5536((int[]) null, (int[]) null, this.field3571, arg0, -1);
        }
    }

    @ObfuscatedName("mt.az(Ltm;I)V")
    public void method5523(class515 arg0) {
        arg0.method8283(this.field3573);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3570[field3581[var2]];
            if (var3 == 0) {
                arg0.method8283(-1);
            } else {
                arg0.method8283(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method8283(this.field3571[var4]);
        }
    }

    @ObfuscatedName("mt.ap(B)V")
    public void method5524() {
        long var1 = this.field3574;
        int var3 = this.field3570[5];
        int var4 = this.field3570[9];
        this.field3570[5] = var4;
        this.field3570[9] = var3;
        this.field3574 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3574 <<= 0x4;
            if (this.field3570[var5] >= 256) {
                this.field3574 += (long) (this.field3570[var5] - 256);
            }
        }
        if (this.field3570[0] >= 256) {
            this.field3574 += (long) (this.field3570[0] - 256 >> 4);
        }
        if (this.field3570[1] >= 256) {
            this.field3574 += (long) (this.field3570[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3574 <<= 0x3;
            this.field3574 += (long) this.field3571[var6];
        }
        this.field3574 <<= 0x1;
        this.field3574 += (long) (this.field3573 * 72026165) * -1305081315L;
        this.field3570[5] = var3;
        this.field3570[9] = var4;
        if (var1 != 0L && this.field3574 != var1 || this.field3578) {
            field3582.method5176(var1);
        }
    }

    @ObfuscatedName("mt.aa(Lib;ILib;II)Ljr;")
    public class240 method5543(class209 arg0, int arg1, class209 arg2, int arg3) {
        if (this.field3569 != -1) {
            return class196.method2202(this.field3569).method3407(arg0, arg1, arg2, arg3, (class195) null);
        }
        long var5 = this.field3574;
        int[] var7 = this.field3570;
        if (arg0 != null && (arg0.field2318 >= 0 || arg0.field2323 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3570[var8];
            }
            if (arg0.field2318 >= 0) {
                var5 += (long) (arg0.field2318 - this.field3570[5] << 40);
                var7[5] = arg0.field2318;
            }
            if (arg0.field2323 >= 0) {
                var5 += (long) (arg0.field2323 - this.field3570[3] << 48);
                var7[3] = arg0.field2323;
            }
        }
        class240 var9 = (class240) field3582.method5182(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class190.method3095(var12 - 256).method3331()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class207.method3280(var12 - 512).method3660(this.field3573)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3576 != -1L) {
                    var9 = (class240) field3582.method5182(this.field3576);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class222[] var13 = new class222[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class222 var17 = class190.method3095(var16 - 256).method3332();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class207 var18 = class207.method3280(var16 - 512);
                        class222 var19 = var18.method3661(this.field3573);
                        if (var19 != null) {
                            if (this.field3580 != null) {
                                class184 var20 = this.field3580[var15];
                                if (var20 != null) {
                                    if (var20.field1919 != null && var18.field2270 != null && var18.field2237.length == var20.field1919.length) {
                                        for (int var21 = 0; var21 < var18.field2270.length; var21++) {
                                            var19.method3996(var18.field2237[var21], var20.field1919[var21]);
                                        }
                                    }
                                    if (var20.field1920 != null && var18.field2264 != null && var18.field2239.length == var20.field1920.length) {
                                        for (int var22 = 0; var22 < var18.field2264.length; var22++) {
                                            var19.method3958(var18.field2239[var22], var20.field1920[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class222 var23 = new class222(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3571[var24] < Statics.field1660[var24].length) {
                        var23.method3996(Statics.field1459[var24], Statics.field1660[var24][this.field3571[var24]]);
                    }
                    if (this.field3571[var24] < Statics.field3587[var24].length) {
                        var23.method3996(Statics.field3579[var24], Statics.field3587[var24][this.field3571[var24]]);
                    }
                }
                var9 = var23.method3965(64, 850, -30, -50, -30);
                field3582.method5177(var9, var5);
                this.field3576 = var5;
            }
        }
        class240 var25;
        if (arg0 == null && arg2 == null) {
            var25 = var9.method4446(true);
        } else if (arg0 != null && arg2 != null) {
            var25 = arg0.method3743(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3740(var9, arg3);
        } else {
            var25 = arg0.method3740(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("mt.af(I)Lic;")
    public class222 method5526() {
        if (this.field3569 != -1) {
            return class196.method2202(this.field3569).method3408((class195) null);
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3570[var2];
            if (var3 >= 256 && var3 < 512 && !class190.method3095(var3 - 256).method3356()) {
                var1 = true;
            }
            if (var3 >= 512 && !class207.method3280(var3 - 512).method3662(this.field3573)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class222[] var4 = new class222[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3570[var6];
            if (var7 >= 256 && var7 < 512) {
                class222 var8 = class190.method3095(var7 - 256).method3337();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class222 var9 = class207.method3280(var7 - 512).method3665(this.field3573);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class222 var10 = new class222(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3571[var11] < Statics.field1660[var11].length) {
                var10.method3996(Statics.field1459[var11], Statics.field1660[var11][this.field3571[var11]]);
            }
            if (this.field3571[var11] < Statics.field3587[var11].length) {
                var10.method3996(Statics.field3579[var11], Statics.field3587[var11][this.field3571[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("mt.ad(B)I")
    public int method5527() {
        long var1 = this.field3574;
        if (this.field3569 != -1) {
            var1 = 0xFFFFFFFFFFFF0000L | (long) this.field3569;
        }
        Integer var3 = (Integer) field3583.method7160(var1);
        if (var3 == null) {
            var3 = ++field3584 - 1;
            field3583.method7161(var1, var3);
            field3584 %= 65535;
        }
        return var3;
    }

    @ObfuscatedName("mt.aq(I)V")
    public void method5528() {
        this.method5536(this.field3585, this.field3570, this.field3571, this.field3573, this.field3569);
    }
}
