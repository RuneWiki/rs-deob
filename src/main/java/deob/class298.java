package deob;

@ObfuscatedName("ld")
public class class298 extends class49 {

    @ObfuscatedName("ld.aj")
    public class295 field3393;

    @ObfuscatedName("ld.al")
    public class359 field3388 = new class359();

    @ObfuscatedName("ld.ac")
    public class39 field3389 = new class39();

    public class298(class295 arg0) {
        this.field3393 = arg0;
    }

    @ObfuscatedName("ld.ao()Lbj;")
    public class49 method681() {
        class300 var1 = (class300) this.field3388.method6089();
        if (var1 == null) {
            return null;
        } else if (var1.field3415 == null) {
            return this.method688();
        } else {
            return var1.field3415;
        }
    }

    @ObfuscatedName("ld.av()Lbj;")
    public class49 method688() {
        class300 var1;
        do {
            var1 = (class300) this.field3388.method6098();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3415 == null);
        return var1.field3415;
    }

    @ObfuscatedName("ld.aq()I")
    public int method683() {
        return 0;
    }

    @ObfuscatedName("ld.ap([III)V")
    public void method705(int[] arg0, int arg1, int arg2) {
        this.field3389.method705(arg0, arg1, arg2);
        for (class300 var4 = (class300) this.field3388.method6089(); var4 != null; var4 = (class300) this.field3388.method6098()) {
            if (!this.field3393.method5038(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3416) {
                        this.method5171(var4, arg0, var5, var6, var5 + var6);
                        var4.field3416 -= var6;
                        break;
                    }
                    this.method5171(var4, arg0, var5, var4.field3416, var5 + var6);
                    var5 += var4.field3416;
                    var6 -= var4.field3416;
                } while (!this.field3393.method5039(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ld.ak(I)V")
    public void method686(int arg0) {
        this.field3389.method686(arg0);
        for (class300 var2 = (class300) this.field3388.method6089(); var2 != null; var2 = (class300) this.field3388.method6098()) {
            if (!this.field3393.method5038(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3416) {
                        this.method5168(var2, var3);
                        var2.field3416 -= var3;
                        break;
                    }
                    this.method5168(var2, var2.field3416);
                    var3 -= var2.field3416;
                } while (!this.field3393.method5039(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ld.aj(Llp;[IIIII)V")
    public void method5171(class300 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3393.field3351[arg0.field3418] & 0x4) != 0 && arg0.field3414 < 0) {
            int var6 = this.field3393.field3352[arg0.field3418] / Statics.field293;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3411) / var6;
                if (var7 > arg3) {
                    arg0.field3411 += arg3 * var6;
                    break;
                }
                arg0.field3415.method705(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3411 += var6 * var7 - 1048576;
                int var8 = Statics.field293 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class48 var10 = arg0.field3415;
                if (this.field3393.field3354[arg0.field3418] == 0) {
                    arg0.field3415 = class48.method834(arg0.field3399, var10.method849(), var10.method840(), var10.method882());
                } else {
                    arg0.field3415 = class48.method834(arg0.field3399, var10.method849(), 0, var10.method882());
                    this.field3393.method5064(arg0, arg0.field3398.field3380[arg0.field3402] < 0);
                    arg0.field3415.method845(var8, var10.method840());
                }
                if (arg0.field3398.field3380[arg0.field3402] < 0) {
                    arg0.field3415.method949(-1);
                }
                var10.method847(var8);
                var10.method705(arg1, arg2, arg4 - arg2);
                if (var10.method969()) {
                    this.field3389.method676(var10);
                }
            }
        }
        arg0.field3415.method705(arg1, arg2, arg3);
    }

    @ObfuscatedName("ld.al(Llp;II)V")
    public void method5168(class300 arg0, int arg1) {
        if ((this.field3393.field3351[arg0.field3418] & 0x4) != 0 && arg0.field3414 < 0) {
            int var3 = this.field3393.field3352[arg0.field3418] / Statics.field293;
            int var4 = (var3 + 1048575 - arg0.field3411) / var3;
            arg0.field3411 = arg0.field3411 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3393.field3354[arg0.field3418] == 0) {
                    arg0.field3415 = class48.method834(arg0.field3399, arg0.field3415.method849(), arg0.field3415.method840(), arg0.field3415.method882());
                } else {
                    arg0.field3415 = class48.method834(arg0.field3399, arg0.field3415.method849(), 0, arg0.field3415.method882());
                    this.field3393.method5064(arg0, arg0.field3398.field3380[arg0.field3402] < 0);
                }
                if (arg0.field3398.field3380[arg0.field3402] < 0) {
                    arg0.field3415.method949(-1);
                }
                arg1 = arg0.field3411 / var3;
            }
        }
        arg0.field3415.method686(arg1);
    }
}
