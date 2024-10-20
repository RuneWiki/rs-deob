package deob;

@ObfuscatedName("lc")
public class class302 extends class49 {

    @ObfuscatedName("lc.af")
    public class299 field3444;

    @ObfuscatedName("lc.an")
    public class363 field3445 = new class363();

    @ObfuscatedName("lc.aw")
    public class39 field3446 = new class39();

    public class302(class299 arg0) {
        this.field3444 = arg0;
    }

    @ObfuscatedName("lc.ab()Lbp;")
    public class49 method726() {
        class304 var1 = (class304) this.field3445.method6329();
        if (var1 == null) {
            return null;
        } else if (var1.field3464 == null) {
            return this.method727();
        } else {
            return var1.field3464;
        }
    }

    @ObfuscatedName("lc.aq()Lbp;")
    public class49 method727() {
        class304 var1;
        do {
            var1 = (class304) this.field3445.method6338();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3464 == null);
        return var1.field3464;
    }

    @ObfuscatedName("lc.al()I")
    public int method728() {
        return 0;
    }

    @ObfuscatedName("lc.at([III)V")
    public void method729(int[] arg0, int arg1, int arg2) {
        this.field3446.method729(arg0, arg1, arg2);
        for (class304 var4 = (class304) this.field3445.method6329(); var4 != null; var4 = (class304) this.field3445.method6338()) {
            if (!this.field3444.method5309(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3463) {
                        this.method5375(var4, arg0, var5, var6, var5 + var6);
                        var4.field3463 -= var6;
                        break;
                    }
                    this.method5375(var4, arg0, var5, var4.field3463, var5 + var6);
                    var5 += var4.field3463;
                    var6 -= var4.field3463;
                } while (!this.field3444.method5240(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("lc.ay(I)V")
    public void method755(int arg0) {
        this.field3446.method755(arg0);
        for (class304 var2 = (class304) this.field3445.method6329(); var2 != null; var2 = (class304) this.field3445.method6338()) {
            if (!this.field3444.method5309(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3463) {
                        this.method5374(var2, var3);
                        var2.field3463 -= var3;
                        break;
                    }
                    this.method5374(var2, var2.field3463);
                    var3 -= var2.field3463;
                } while (!this.field3444.method5240(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("lc.af(Llq;[IIIII)V")
    public void method5375(class304 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3444.field3406[arg0.field3468] & 0x4) != 0 && arg0.field3465 < 0) {
            int var6 = this.field3444.field3411[arg0.field3468] / Statics.field307;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3470) / var6;
                if (var7 > arg3) {
                    arg0.field3470 += arg3 * var6;
                    break;
                }
                arg0.field3464.method729(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3470 += var6 * var7 - 1048576;
                int var8 = Statics.field307 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class48 var10 = arg0.field3464;
                if (this.field3444.field3409[arg0.field3468] == 0) {
                    arg0.field3464 = class48.method937(arg0.field3452, var10.method891(), var10.method883(), var10.method910());
                } else {
                    arg0.field3464 = class48.method937(arg0.field3452, var10.method891(), 0, var10.method910());
                    this.field3444.method5244(arg0, arg0.field3467.field3437[arg0.field3455] < 0);
                    arg0.field3464.method971(var8, var10.method883());
                }
                if (arg0.field3467.field3437[arg0.field3455] < 0) {
                    arg0.field3464.method879(-1);
                }
                var10.method889(var8);
                var10.method729(arg1, arg2, arg4 - arg2);
                if (var10.method977()) {
                    this.field3446.method739(var10);
                }
            }
        }
        arg0.field3464.method729(arg1, arg2, arg3);
    }

    @ObfuscatedName("lc.an(Llq;IB)V")
    public void method5374(class304 arg0, int arg1) {
        if ((this.field3444.field3406[arg0.field3468] & 0x4) != 0 && arg0.field3465 < 0) {
            int var3 = this.field3444.field3411[arg0.field3468] / Statics.field307;
            int var4 = (var3 + 1048575 - arg0.field3470) / var3;
            arg0.field3470 = arg0.field3470 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3444.field3409[arg0.field3468] == 0) {
                    arg0.field3464 = class48.method937(arg0.field3452, arg0.field3464.method891(), arg0.field3464.method883(), arg0.field3464.method910());
                } else {
                    arg0.field3464 = class48.method937(arg0.field3452, arg0.field3464.method891(), 0, arg0.field3464.method910());
                    this.field3444.method5244(arg0, arg0.field3467.field3437[arg0.field3455] < 0);
                }
                if (arg0.field3467.field3437[arg0.field3455] < 0) {
                    arg0.field3464.method879(-1);
                }
                arg1 = arg0.field3470 / var3;
            }
        }
        arg0.field3464.method755(arg1);
    }
}
