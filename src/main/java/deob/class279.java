package deob;

@ObfuscatedName("jh")
public class class279 extends class46 {

    @ObfuscatedName("jh.c")
    public class276 field3290;

    @ObfuscatedName("jh.p")
    public class336 field3288 = new class336();

    @ObfuscatedName("jh.f")
    public class36 field3286 = new class36();

    public class279(class276 arg0) {
        this.field3290 = arg0;
    }

    @ObfuscatedName("jh.w()Lay;")
    public class46 method650() {
        class281 var1 = (class281) this.field3288.method5647();
        if (var1 == null) {
            return null;
        } else if (var1.field3299 == null) {
            return this.method661();
        } else {
            return var1.field3299;
        }
    }

    @ObfuscatedName("jh.s()Lay;")
    public class46 method661() {
        class281 var1;
        do {
            var1 = (class281) this.field3288.method5649();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3299 == null);
        return var1.field3299;
    }

    @ObfuscatedName("jh.q()I")
    public int method652() {
        return 0;
    }

    @ObfuscatedName("jh.m([III)V")
    public void method665(int[] arg0, int arg1, int arg2) {
        this.field3286.method665(arg0, arg1, arg2);
        for (class281 var4 = (class281) this.field3288.method5647(); var4 != null; var4 = (class281) this.field3288.method5649()) {
            if (!this.field3290.method4901(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3313) {
                        this.method5053(var4, arg0, var5, var6, var5 + var6);
                        var4.field3313 -= var6;
                        break;
                    }
                    this.method5053(var4, arg0, var5, var4.field3313, var5 + var6);
                    var5 += var4.field3313;
                    var6 -= var4.field3313;
                } while (!this.field3290.method4900(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("jh.j(I)V")
    public void method655(int arg0) {
        this.field3286.method655(arg0);
        for (class281 var2 = (class281) this.field3288.method5647(); var2 != null; var2 = (class281) this.field3288.method5649()) {
            if (!this.field3290.method4901(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3313) {
                        this.method5055(var2, var3);
                        var2.field3313 -= var3;
                        break;
                    }
                    this.method5055(var2, var2.field3313);
                    var3 -= var2.field3313;
                } while (!this.field3290.method4900(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("jh.c(Ljb;[IIIII)V")
    public void method5053(class281 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3290.field3247[arg0.field3304] & 0x4) != 0 && arg0.field3301 < 0) {
            int var6 = this.field3290.field3256[arg0.field3304] / Statics.field308;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3314) / var6;
                if (var7 > arg3) {
                    arg0.field3314 += arg3 * var6;
                    break;
                }
                arg0.field3299.method665(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3314 += var6 * var7 - 1048576;
                int var8 = Statics.field308 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field3299;
                if (this.field3290.field3250[arg0.field3304] == 0) {
                    arg0.field3299 = class45.method824(arg0.field3311, var10.method839(), var10.method857(), var10.method870());
                } else {
                    arg0.field3299 = class45.method824(arg0.field3311, var10.method839(), 0, var10.method870());
                    this.field3290.method4882(arg0, arg0.field3295.field3278[arg0.field3312] < 0);
                    arg0.field3299.method884(var8, var10.method857());
                }
                if (arg0.field3295.field3278[arg0.field3312] < 0) {
                    arg0.field3299.method826(-1);
                }
                var10.method837(var8);
                var10.method665(arg1, arg2, arg4 - arg2);
                if (var10.method862()) {
                    this.field3286.method645(var10);
                }
            }
        }
        arg0.field3299.method665(arg1, arg2, arg3);
    }

    @ObfuscatedName("jh.p(Ljb;II)V")
    public void method5055(class281 arg0, int arg1) {
        if ((this.field3290.field3247[arg0.field3304] & 0x4) != 0 && arg0.field3301 < 0) {
            int var3 = this.field3290.field3256[arg0.field3304] / Statics.field308;
            int var4 = (var3 + 1048575 - arg0.field3314) / var3;
            arg0.field3314 = arg0.field3314 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3290.field3250[arg0.field3304] == 0) {
                    arg0.field3299 = class45.method824(arg0.field3311, arg0.field3299.method839(), arg0.field3299.method857(), arg0.field3299.method870());
                } else {
                    arg0.field3299 = class45.method824(arg0.field3311, arg0.field3299.method839(), 0, arg0.field3299.method870());
                    this.field3290.method4882(arg0, arg0.field3295.field3278[arg0.field3312] < 0);
                }
                if (arg0.field3295.field3278[arg0.field3312] < 0) {
                    arg0.field3299.method826(-1);
                }
                arg1 = arg0.field3314 / var3;
            }
        }
        arg0.field3299.method655(arg1);
    }
}
