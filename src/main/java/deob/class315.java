package deob;

@ObfuscatedName("mm")
public class class315 extends class50 {

    @ObfuscatedName("mm.aw")
    public class308 field3481;

    @ObfuscatedName("mm.ay")
    public class379 field3482 = new class379();

    @ObfuscatedName("mm.ar")
    public class39 field3483 = new class39();

    public class315(class308 arg0) {
        this.field3481 = arg0;
    }

    @ObfuscatedName("mm.aj()Lby;")
    public class50 method739() {
        class317 var1 = (class317) this.field3482.method6393();
        if (var1 == null) {
            return null;
        } else if (var1.field3497 == null) {
            return this.method694();
        } else {
            return var1.field3497;
        }
    }

    @ObfuscatedName("mm.ag()Lby;")
    public class50 method694() {
        class317 var1;
        do {
            var1 = (class317) this.field3482.method6374();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3497 == null);
        return var1.field3497;
    }

    @ObfuscatedName("mm.az()I")
    public int method700() {
        return 0;
    }

    @ObfuscatedName("mm.av([III)V")
    public void method701(int[] arg0, int arg1, int arg2) {
        this.field3483.method701(arg0, arg1, arg2);
        for (class317 var4 = (class317) this.field3482.method6393(); var4 != null; var4 = (class317) this.field3482.method6374()) {
            if (!this.field3481.method5288(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3487) {
                        this.method5446(var4, arg0, var5, var6, var5 + var6);
                        var4.field3487 -= var6;
                        break;
                    }
                    this.method5446(var4, arg0, var5, var4.field3487, var5 + var6);
                    var5 += var4.field3487;
                    var6 -= var4.field3487;
                } while (!this.field3481.method5289(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("mm.aq(I)V")
    public void method713(int arg0) {
        this.field3483.method713(arg0);
        for (class317 var2 = (class317) this.field3482.method6393(); var2 != null; var2 = (class317) this.field3482.method6374()) {
            if (!this.field3481.method5288(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3487) {
                        this.method5445(var2, var3);
                        var2.field3487 -= var3;
                        break;
                    }
                    this.method5445(var2, var2.field3487);
                    var3 -= var2.field3487;
                } while (!this.field3481.method5289(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("mm.aw(Lmw;[IIIIB)V")
    public void method5446(class317 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3481.field3434[arg0.field3495] & 0x4) != 0 && arg0.field3500 < 0) {
            int var6 = this.field3481.field3441[arg0.field3495] / Statics.field315;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3506) / var6;
                if (var7 > arg3) {
                    arg0.field3506 += arg3 * var6;
                    break;
                }
                arg0.field3497.method701(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3506 += var6 * var7 - 1048576;
                int var8 = Statics.field315 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class49 var10 = arg0.field3497;
                if (this.field3481.field3425[arg0.field3495] == 0) {
                    arg0.field3497 = class49.method858(arg0.field3488, var10.method873(), var10.method962(), var10.method886());
                } else {
                    arg0.field3497 = class49.method858(arg0.field3488, var10.method873(), 0, var10.method886());
                    this.field3481.method5270(arg0, arg0.field3490.field3466[arg0.field3491] < 0);
                    arg0.field3497.method869(var8, var10.method962());
                }
                if (arg0.field3490.field3466[arg0.field3491] < 0) {
                    arg0.field3497.method860(-1);
                }
                var10.method871(var8);
                var10.method701(arg1, arg2, arg4 - arg2);
                if (var10.method986()) {
                    this.field3483.method693(var10);
                }
            }
        }
        arg0.field3497.method701(arg1, arg2, arg3);
    }

    @ObfuscatedName("mm.ay(Lmw;IB)V")
    public void method5445(class317 arg0, int arg1) {
        if ((this.field3481.field3434[arg0.field3495] & 0x4) != 0 && arg0.field3500 < 0) {
            int var3 = this.field3481.field3441[arg0.field3495] / Statics.field315;
            int var4 = (var3 + 1048575 - arg0.field3506) / var3;
            arg0.field3506 = arg0.field3506 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3481.field3425[arg0.field3495] == 0) {
                    arg0.field3497 = class49.method858(arg0.field3488, arg0.field3497.method873(), arg0.field3497.method962(), arg0.field3497.method886());
                } else {
                    arg0.field3497 = class49.method858(arg0.field3488, arg0.field3497.method873(), 0, arg0.field3497.method886());
                    this.field3481.method5270(arg0, arg0.field3490.field3466[arg0.field3491] < 0);
                }
                if (arg0.field3490.field3466[arg0.field3491] < 0) {
                    arg0.field3497.method860(-1);
                }
                arg1 = arg0.field3506 / var3;
            }
        }
        arg0.field3497.method713(arg1);
    }
}
