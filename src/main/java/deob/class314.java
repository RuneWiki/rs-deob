package deob;

@ObfuscatedName("mi")
public class class314 extends class50 {

    @ObfuscatedName("mi.at")
    public class308 field3472;

    @ObfuscatedName("mi.an")
    public class376 field3471 = new class376();

    @ObfuscatedName("mi.av")
    public class39 field3473 = new class39();

    public class314(class308 arg0) {
        this.field3472 = arg0;
    }

    @ObfuscatedName("mi.ap()Lby;")
    public class50 method701() {
        class316 var1 = (class316) this.field3471.method6309();
        if (var1 == null) {
            return null;
        } else if (var1.field3479 == null) {
            return this.method702();
        } else {
            return var1.field3479;
        }
    }

    @ObfuscatedName("mi.ab()Lby;")
    public class50 method702() {
        class316 var1;
        do {
            var1 = (class316) this.field3471.method6311();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3479 == null);
        return var1.field3479;
    }

    @ObfuscatedName("mi.ak()I")
    public int method672() {
        return 0;
    }

    @ObfuscatedName("mi.ae([III)V")
    public void method677(int[] arg0, int arg1, int arg2) {
        this.field3473.method677(arg0, arg1, arg2);
        for (class316 var4 = (class316) this.field3471.method6309(); var4 != null; var4 = (class316) this.field3471.method6311()) {
            if (!this.field3472.method5234(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3495) {
                        this.method5364(var4, arg0, var5, var6, var5 + var6);
                        var4.field3495 -= var6;
                        break;
                    }
                    this.method5364(var4, arg0, var5, var4.field3495, var5 + var6);
                    var5 += var4.field3495;
                    var6 -= var4.field3495;
                } while (!this.field3472.method5235(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("mi.ao(I)V")
    public void method674(int arg0) {
        this.field3473.method674(arg0);
        for (class316 var2 = (class316) this.field3471.method6309(); var2 != null; var2 = (class316) this.field3471.method6311()) {
            if (!this.field3472.method5234(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3495) {
                        this.method5366(var2, var3);
                        var2.field3495 -= var3;
                        break;
                    }
                    this.method5366(var2, var2.field3495);
                    var3 -= var2.field3495;
                } while (!this.field3472.method5235(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("mi.at(Lma;[IIIII)V")
    public void method5364(class316 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3472.field3422[arg0.field3491] & 0x4) != 0 && arg0.field3490 < 0) {
            int var6 = this.field3472.field3431[arg0.field3491] / Statics.field292;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3484) / var6;
                if (var7 > arg3) {
                    arg0.field3484 += arg3 * var6;
                    break;
                }
                arg0.field3479.method677(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3484 += var6 * var7 - 1048576;
                int var8 = Statics.field292 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class49 var10 = arg0.field3479;
                if (this.field3472.field3425[arg0.field3491] == 0) {
                    arg0.field3479 = class49.method908(arg0.field3478, var10.method841(), var10.method832(), var10.method833());
                } else {
                    arg0.field3479 = class49.method908(arg0.field3478, var10.method841(), 0, var10.method833());
                    this.field3472.method5237(arg0, arg0.field3477.field3463[arg0.field3481] < 0);
                    arg0.field3479.method872(var8, var10.method832());
                }
                if (arg0.field3477.field3463[arg0.field3481] < 0) {
                    arg0.field3479.method868(-1);
                }
                var10.method839(var8);
                var10.method677(arg1, arg2, arg4 - arg2);
                if (var10.method903()) {
                    this.field3473.method665(var10);
                }
            }
        }
        arg0.field3479.method677(arg1, arg2, arg3);
    }

    @ObfuscatedName("mi.an(Lma;IS)V")
    public void method5366(class316 arg0, int arg1) {
        if ((this.field3472.field3422[arg0.field3491] & 0x4) != 0 && arg0.field3490 < 0) {
            int var3 = this.field3472.field3431[arg0.field3491] / Statics.field292;
            int var4 = (var3 + 1048575 - arg0.field3484) / var3;
            arg0.field3484 = arg0.field3484 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3472.field3425[arg0.field3491] == 0) {
                    arg0.field3479 = class49.method908(arg0.field3478, arg0.field3479.method841(), arg0.field3479.method832(), arg0.field3479.method833());
                } else {
                    arg0.field3479 = class49.method908(arg0.field3478, arg0.field3479.method841(), 0, arg0.field3479.method833());
                    this.field3472.method5237(arg0, arg0.field3477.field3463[arg0.field3481] < 0);
                }
                if (arg0.field3477.field3463[arg0.field3481] < 0) {
                    arg0.field3479.method868(-1);
                }
                arg1 = arg0.field3484 / var3;
            }
        }
        arg0.field3479.method674(arg1);
    }
}
