package deob;

@ObfuscatedName("jv")
public class class278 extends class46 {

    @ObfuscatedName("jv.o")
    public class275 field3299;

    @ObfuscatedName("jv.q")
    public class335 field3297 = new class335();

    @ObfuscatedName("jv.l")
    public class36 field3298 = new class36();

    public class278(class275 arg0) {
        this.field3299 = arg0;
    }

    @ObfuscatedName("jv.m()Lao;")
    public class46 method601() {
        class280 var1 = (class280) this.field3297.method5431();
        if (var1 == null) {
            return null;
        } else if (var1.field3321 == null) {
            return this.method602();
        } else {
            return var1.field3321;
        }
    }

    @ObfuscatedName("jv.p()Lao;")
    public class46 method602() {
        class280 var1;
        do {
            var1 = (class280) this.field3297.method5419();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3321 == null);
        return var1.field3321;
    }

    @ObfuscatedName("jv.s()I")
    public int method599() {
        return 0;
    }

    @ObfuscatedName("jv.r([III)V")
    public void method604(int[] arg0, int arg1, int arg2) {
        this.field3298.method604(arg0, arg1, arg2);
        for (class280 var4 = (class280) this.field3297.method5431(); var4 != null; var4 = (class280) this.field3297.method5419()) {
            if (!this.field3299.method4685(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3322) {
                        this.method4842(var4, arg0, var5, var6, var5 + var6);
                        var4.field3322 -= var6;
                        break;
                    }
                    this.method4842(var4, arg0, var5, var4.field3322, var5 + var6);
                    var5 += var4.field3322;
                    var6 -= var4.field3322;
                } while (!this.field3299.method4686(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("jv.y(I)V")
    public void method614(int arg0) {
        this.field3298.method614(arg0);
        for (class280 var2 = (class280) this.field3297.method5431(); var2 != null; var2 = (class280) this.field3297.method5419()) {
            if (!this.field3299.method4685(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3322) {
                        this.method4845(var2, var3);
                        var2.field3322 -= var3;
                        break;
                    }
                    this.method4845(var2, var2.field3322);
                    var3 -= var2.field3322;
                } while (!this.field3299.method4686(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("jv.o(Lji;[IIIII)V")
    public void method4842(class280 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3299.field3248[arg0.field3309] & 0x4) != 0 && arg0.field3317 < 0) {
            int var6 = this.field3299.field3260[arg0.field3309] / Statics.field301;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3323) / var6;
                if (var7 > arg3) {
                    arg0.field3323 += arg3 * var6;
                    break;
                }
                arg0.field3321.method604(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3323 += var6 * var7 - 1048576;
                int var8 = Statics.field301 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field3321;
                if (this.field3299.field3258[arg0.field3309] == 0) {
                    arg0.field3321 = class45.method798(arg0.field3306, var10.method844(), var10.method777(), var10.method778());
                } else {
                    arg0.field3321 = class45.method798(arg0.field3306, var10.method844(), 0, var10.method778());
                    this.field3299.method4668(arg0, arg0.field3304.field3288[arg0.field3308] < 0);
                    arg0.field3321.method782(var8, var10.method777());
                }
                if (arg0.field3304.field3288[arg0.field3308] < 0) {
                    arg0.field3321.method773(-1);
                }
                var10.method784(var8);
                var10.method604(arg1, arg2, arg4 - arg2);
                if (var10.method891()) {
                    this.field3298.method628(var10);
                }
            }
        }
        arg0.field3321.method604(arg1, arg2, arg3);
    }

    @ObfuscatedName("jv.q(Lji;II)V")
    public void method4845(class280 arg0, int arg1) {
        if ((this.field3299.field3248[arg0.field3309] & 0x4) != 0 && arg0.field3317 < 0) {
            int var3 = this.field3299.field3260[arg0.field3309] / Statics.field301;
            int var4 = (var3 + 1048575 - arg0.field3323) / var3;
            arg0.field3323 = arg0.field3323 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3299.field3258[arg0.field3309] == 0) {
                    arg0.field3321 = class45.method798(arg0.field3306, arg0.field3321.method844(), arg0.field3321.method777(), arg0.field3321.method778());
                } else {
                    arg0.field3321 = class45.method798(arg0.field3306, arg0.field3321.method844(), 0, arg0.field3321.method778());
                    this.field3299.method4668(arg0, arg0.field3304.field3288[arg0.field3308] < 0);
                }
                if (arg0.field3304.field3288[arg0.field3308] < 0) {
                    arg0.field3321.method773(-1);
                }
                arg1 = arg0.field3323 / var3;
            }
        }
        arg0.field3321.method614(arg1);
    }
}
