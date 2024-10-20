package deob;

@ObfuscatedName("jk")
public class class278 extends class46 {

    @ObfuscatedName("jk.s")
    public class275 field3258;

    @ObfuscatedName("jk.h")
    public class335 field3260 = new class335();

    @ObfuscatedName("jk.v")
    public class36 field3259 = new class36();

    public class278(class275 arg0) {
        this.field3258 = arg0;
    }

    @ObfuscatedName("jk.q()Lah;")
    public class46 method582() {
        class280 var1 = (class280) this.field3260.method5442();
        if (var1 == null) {
            return null;
        } else if (var1.field3275 == null) {
            return this.method595();
        } else {
            return var1.field3275;
        }
    }

    @ObfuscatedName("jk.i()Lah;")
    public class46 method595() {
        class280 var1;
        do {
            var1 = (class280) this.field3260.method5426();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3275 == null);
        return var1.field3275;
    }

    @ObfuscatedName("jk.k()I")
    public int method584() {
        return 0;
    }

    @ObfuscatedName("jk.o([III)V")
    public void method577(int[] arg0, int arg1, int arg2) {
        this.field3259.method577(arg0, arg1, arg2);
        for (class280 var4 = (class280) this.field3260.method5442(); var4 != null; var4 = (class280) this.field3260.method5426()) {
            if (!this.field3258.method4705(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3283) {
                        this.method4841(var4, arg0, var5, var6, var5 + var6);
                        var4.field3283 -= var6;
                        break;
                    }
                    this.method4841(var4, arg0, var5, var4.field3283, var5 + var6);
                    var5 += var4.field3283;
                    var6 -= var4.field3283;
                } while (!this.field3258.method4706(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("jk.d(I)V")
    public void method587(int arg0) {
        this.field3259.method587(arg0);
        for (class280 var2 = (class280) this.field3260.method5442(); var2 != null; var2 = (class280) this.field3260.method5426()) {
            if (!this.field3258.method4705(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3283) {
                        this.method4842(var2, var3);
                        var2.field3283 -= var3;
                        break;
                    }
                    this.method4842(var2, var2.field3283);
                    var3 -= var2.field3283;
                } while (!this.field3258.method4706(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("jk.s(Ljl;[IIIIB)V")
    public void method4841(class280 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3258.field3224[arg0.field3281] & 0x4) != 0 && arg0.field3267 < 0) {
            int var6 = this.field3258.field3215[arg0.field3281] / Statics.field4153;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3284) / var6;
                if (var7 > arg3) {
                    arg0.field3284 += arg3 * var6;
                    break;
                }
                arg0.field3275.method577(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3284 += var6 * var7 - 1048576;
                int var8 = Statics.field4153 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field3275;
                if (this.field3258.field3222[arg0.field3281] == 0) {
                    arg0.field3275 = class45.method742(arg0.field3266, var10.method756(), var10.method748(), var10.method749());
                } else {
                    arg0.field3275 = class45.method742(arg0.field3266, var10.method756(), 0, var10.method749());
                    this.field3258.method4688(arg0, arg0.field3265.field3250[arg0.field3287] < 0);
                    arg0.field3275.method752(var8, var10.method748());
                }
                if (arg0.field3265.field3250[arg0.field3287] < 0) {
                    arg0.field3275.method758(-1);
                }
                var10.method754(var8);
                var10.method577(arg1, arg2, arg4 - arg2);
                if (var10.method779()) {
                    this.field3259.method590(var10);
                }
            }
        }
        arg0.field3275.method577(arg1, arg2, arg3);
    }

    @ObfuscatedName("jk.h(Ljl;IB)V")
    public void method4842(class280 arg0, int arg1) {
        if ((this.field3258.field3224[arg0.field3281] & 0x4) != 0 && arg0.field3267 < 0) {
            int var3 = this.field3258.field3215[arg0.field3281] / Statics.field4153;
            int var4 = (var3 + 1048575 - arg0.field3284) / var3;
            arg0.field3284 = arg0.field3284 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3258.field3222[arg0.field3281] == 0) {
                    arg0.field3275 = class45.method742(arg0.field3266, arg0.field3275.method756(), arg0.field3275.method748(), arg0.field3275.method749());
                } else {
                    arg0.field3275 = class45.method742(arg0.field3266, arg0.field3275.method756(), 0, arg0.field3275.method749());
                    this.field3258.method4688(arg0, arg0.field3265.field3250[arg0.field3287] < 0);
                }
                if (arg0.field3265.field3250[arg0.field3287] < 0) {
                    arg0.field3275.method758(-1);
                }
                arg1 = arg0.field3284 / var3;
            }
        }
        arg0.field3275.method587(arg1);
    }
}
