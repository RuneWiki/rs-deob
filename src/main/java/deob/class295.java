package deob;

@ObfuscatedName("kt")
public class class295 extends class49 {

    @ObfuscatedName("kt.f")
    public class292 field3422;

    @ObfuscatedName("kt.v")
    public class356 field3421 = new class356();

    @ObfuscatedName("kt.s")
    public class39 field3423 = new class39();

    public class295(class292 arg0) {
        this.field3422 = arg0;
    }

    @ObfuscatedName("kt.j()Lan;")
    public class49 method714() {
        class297 var1 = (class297) this.field3421.method6241();
        if (var1 == null) {
            return null;
        } else if (var1.field3436 == null) {
            return this.method699();
        } else {
            return var1.field3436;
        }
    }

    @ObfuscatedName("kt.i()Lan;")
    public class49 method699() {
        class297 var1;
        do {
            var1 = (class297) this.field3421.method6248();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3436 == null);
        return var1.field3436;
    }

    @ObfuscatedName("kt.n()I")
    public int method702() {
        return 0;
    }

    @ObfuscatedName("kt.l([III)V")
    public void method710(int[] arg0, int arg1, int arg2) {
        this.field3423.method710(arg0, arg1, arg2);
        for (class297 var4 = (class297) this.field3421.method6241(); var4 != null; var4 = (class297) this.field3421.method6248()) {
            if (!this.field3422.method5150(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3446) {
                        this.method5280(var4, arg0, var5, var6, var5 + var6);
                        var4.field3446 -= var6;
                        break;
                    }
                    this.method5280(var4, arg0, var5, var4.field3446, var5 + var6);
                    var5 += var4.field3446;
                    var6 -= var4.field3446;
                } while (!this.field3422.method5131(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("kt.c(I)V")
    public void method703(int arg0) {
        this.field3423.method703(arg0);
        for (class297 var2 = (class297) this.field3421.method6241(); var2 != null; var2 = (class297) this.field3421.method6248()) {
            if (!this.field3422.method5150(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3446) {
                        this.method5281(var2, var3);
                        var2.field3446 -= var3;
                        break;
                    }
                    this.method5281(var2, var2.field3446);
                    var3 -= var2.field3446;
                } while (!this.field3422.method5131(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("kt.f(Lkv;[IIIIB)V")
    public void method5280(class297 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3422.field3376[arg0.field3437] & 0x4) != 0 && arg0.field3441 < 0) {
            int var6 = this.field3422.field3374[arg0.field3437] / Statics.field3322;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3447) / var6;
                if (var7 > arg3) {
                    arg0.field3447 += arg3 * var6;
                    break;
                }
                arg0.field3436.method710(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3447 += var6 * var7 - 1048576;
                int var8 = Statics.field3322 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class48 var10 = arg0.field3436;
                if (this.field3422.field3385[arg0.field3437] == 0) {
                    arg0.field3436 = class48.method880(arg0.field3445, var10.method937(), var10.method859(), var10.method892());
                } else {
                    arg0.field3436 = class48.method880(arg0.field3445, var10.method937(), 0, var10.method892());
                    this.field3422.method5152(arg0, arg0.field3428.field3419[arg0.field3432] < 0);
                    arg0.field3436.method863(var8, var10.method859());
                }
                if (arg0.field3428.field3419[arg0.field3432] < 0) {
                    arg0.field3436.method856(-1);
                }
                var10.method865(var8);
                var10.method710(arg1, arg2, arg4 - arg2);
                if (var10.method868()) {
                    this.field3423.method693(var10);
                }
            }
        }
        arg0.field3436.method710(arg1, arg2, arg3);
    }

    @ObfuscatedName("kt.w(Lkv;IB)V")
    public void method5281(class297 arg0, int arg1) {
        if ((this.field3422.field3376[arg0.field3437] & 0x4) != 0 && arg0.field3441 < 0) {
            int var3 = this.field3422.field3374[arg0.field3437] / Statics.field3322;
            int var4 = (var3 + 1048575 - arg0.field3447) / var3;
            arg0.field3447 = arg0.field3447 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3422.field3385[arg0.field3437] == 0) {
                    arg0.field3436 = class48.method880(arg0.field3445, arg0.field3436.method937(), arg0.field3436.method859(), arg0.field3436.method892());
                } else {
                    arg0.field3436 = class48.method880(arg0.field3445, arg0.field3436.method937(), 0, arg0.field3436.method892());
                    this.field3422.method5152(arg0, arg0.field3428.field3419[arg0.field3432] < 0);
                }
                if (arg0.field3428.field3419[arg0.field3432] < 0) {
                    arg0.field3436.method856(-1);
                }
                arg1 = arg0.field3447 / var3;
            }
        }
        arg0.field3436.method703(arg1);
    }
}
