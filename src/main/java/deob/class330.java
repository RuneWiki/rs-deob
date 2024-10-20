package deob;

@ObfuscatedName("ms")
public class class330 extends class50 {

    @ObfuscatedName("ms.az")
    public class323 field3573;

    @ObfuscatedName("ms.ah")
    public class398 field3571 = new class398();

    @ObfuscatedName("ms.af")
    public class39 field3572 = new class39();

    public class330(class323 arg0) {
        this.field3573 = arg0;
    }

    @ObfuscatedName("ms.ao()Lba;")
    public class50 method692() {
        class332 var1 = (class332) this.field3571.method6591();
        if (var1 == null) {
            return null;
        } else if (var1.field3595 == null) {
            return this.method696();
        } else {
            return var1.field3595;
        }
    }

    @ObfuscatedName("ms.ab()Lba;")
    public class50 method696() {
        class332 var1;
        do {
            var1 = (class332) this.field3571.method6605();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3595 == null);
        return var1.field3595;
    }

    @ObfuscatedName("ms.aw()I")
    public int method709() {
        return 0;
    }

    @ObfuscatedName("ms.ad([III)V")
    public void method667(int[] arg0, int arg1, int arg2) {
        this.field3572.method667(arg0, arg1, arg2);
        for (class332 var4 = (class332) this.field3571.method6591(); var4 != null; var4 = (class332) this.field3571.method6605()) {
            if (!this.field3573.method5444(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3578) {
                        this.method5616(var4, arg0, var5, var6, var5 + var6);
                        var4.field3578 -= var6;
                        break;
                    }
                    this.method5616(var4, arg0, var5, var4.field3578, var5 + var6);
                    var5 += var4.field3578;
                    var6 -= var4.field3578;
                } while (!this.field3573.method5476(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ms.as(I)V")
    public void method678(int arg0) {
        this.field3572.method678(arg0);
        for (class332 var2 = (class332) this.field3571.method6591(); var2 != null; var2 = (class332) this.field3571.method6605()) {
            if (!this.field3573.method5444(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3578) {
                        this.method5617(var2, var3);
                        var2.field3578 -= var3;
                        break;
                    }
                    this.method5617(var2, var2.field3578);
                    var3 -= var2.field3578;
                } while (!this.field3573.method5476(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ms.az(Lme;[IIIIB)V")
    public void method5616(class332 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3573.field3517[arg0.field3591] & 0x4) != 0 && arg0.field3583 < 0) {
            int var6 = this.field3573.field3522[arg0.field3591] / Statics.field4893;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3598) / var6;
                if (var7 > arg3) {
                    arg0.field3598 += arg3 * var6;
                    break;
                }
                arg0.field3595.method667(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3598 += var6 * var7 - 1048576;
                int var8 = Statics.field4893 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class49 var10 = arg0.field3595;
                if (this.field3573.field3508[arg0.field3591] == 0) {
                    arg0.field3595 = class49.method830(arg0.field3579, var10.method844(), var10.method895(), var10.method837());
                } else {
                    arg0.field3595 = class49.method830(arg0.field3579, var10.method844(), 0, var10.method837());
                    this.field3573.method5454(arg0, arg0.field3586.field3558[arg0.field3582] < 0);
                    arg0.field3595.method840(var8, var10.method895());
                }
                if (arg0.field3586.field3558[arg0.field3582] < 0) {
                    arg0.field3595.method832(-1);
                }
                var10.method836(var8);
                var10.method667(arg1, arg2, arg4 - arg2);
                if (var10.method846()) {
                    this.field3572.method670(var10);
                }
            }
        }
        arg0.field3595.method667(arg1, arg2, arg3);
    }

    @ObfuscatedName("ms.ah(Lme;II)V")
    public void method5617(class332 arg0, int arg1) {
        if ((this.field3573.field3517[arg0.field3591] & 0x4) != 0 && arg0.field3583 < 0) {
            int var3 = this.field3573.field3522[arg0.field3591] / Statics.field4893;
            int var4 = (var3 + 1048575 - arg0.field3598) / var3;
            arg0.field3598 = arg0.field3598 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3573.field3508[arg0.field3591] == 0) {
                    arg0.field3595 = class49.method830(arg0.field3579, arg0.field3595.method844(), arg0.field3595.method895(), arg0.field3595.method837());
                } else {
                    arg0.field3595 = class49.method830(arg0.field3579, arg0.field3595.method844(), 0, arg0.field3595.method837());
                    this.field3573.method5454(arg0, arg0.field3586.field3558[arg0.field3582] < 0);
                }
                if (arg0.field3586.field3558[arg0.field3582] < 0) {
                    arg0.field3595.method832(-1);
                }
                arg1 = arg0.field3598 / var3;
            }
        }
        arg0.field3595.method678(arg1);
    }
}
