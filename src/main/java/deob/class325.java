package deob;

@ObfuscatedName("mj")
public class class325 extends class50 {

    @ObfuscatedName("mj.at")
    public class318 field3492;

    @ObfuscatedName("mj.ah")
    public class390 field3493 = new class390();

    @ObfuscatedName("mj.ar")
    public class39 field3494 = new class39();

    public class325(class318 arg0) {
        this.field3492 = arg0;
    }

    @ObfuscatedName("mj.au()Lbk;")
    public class50 method714() {
        class327 var1 = (class327) this.field3493.method6579();
        if (var1 == null) {
            return null;
        } else if (var1.field3515 == null) {
            return this.method713();
        } else {
            return var1.field3515;
        }
    }

    @ObfuscatedName("mj.aa()Lbk;")
    public class50 method713() {
        class327 var1;
        do {
            var1 = (class327) this.field3493.method6549();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3515 == null);
        return var1.field3515;
    }

    @ObfuscatedName("mj.ac()I")
    public int method750() {
        return 0;
    }

    @ObfuscatedName("mj.al([III)V")
    public void method706(int[] arg0, int arg1, int arg2) {
        this.field3494.method706(arg0, arg1, arg2);
        for (class327 var4 = (class327) this.field3493.method6579(); var4 != null; var4 = (class327) this.field3493.method6549()) {
            if (!this.field3492.method5435(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3514) {
                        this.method5585(var4, arg0, var5, var6, var5 + var6);
                        var4.field3514 -= var6;
                        break;
                    }
                    this.method5585(var4, arg0, var5, var4.field3514, var5 + var6);
                    var5 += var4.field3514;
                    var6 -= var4.field3514;
                } while (!this.field3492.method5436(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("mj.ap(I)V")
    public void method729(int arg0) {
        this.field3494.method729(arg0);
        for (class327 var2 = (class327) this.field3493.method6579(); var2 != null; var2 = (class327) this.field3493.method6549()) {
            if (!this.field3492.method5435(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3514) {
                        this.method5586(var2, var3);
                        var2.field3514 -= var3;
                        break;
                    }
                    this.method5586(var2, var2.field3514);
                    var3 -= var2.field3514;
                } while (!this.field3492.method5436(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("mj.at(Lmw;[IIIII)V")
    public void method5585(class327 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3492.field3451[arg0.field3516] & 0x4) != 0 && arg0.field3499 < 0) {
            int var6 = this.field3492.field3443[arg0.field3516] / Statics.field276;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3517) / var6;
                if (var7 > arg3) {
                    arg0.field3517 += arg3 * var6;
                    break;
                }
                arg0.field3515.method706(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3517 += var6 * var7 - 1048576;
                int var8 = Statics.field276 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class49 var10 = arg0.field3515;
                if (this.field3492.field3441[arg0.field3516] == 0) {
                    arg0.field3515 = class49.method871(arg0.field3501, var10.method885(), var10.method946(), var10.method940());
                } else {
                    arg0.field3515 = class49.method871(arg0.field3501, var10.method885(), 0, var10.method940());
                    this.field3492.method5419(arg0, arg0.field3500.field3479[arg0.field3518] < 0);
                    arg0.field3515.method881(var8, var10.method946());
                }
                if (arg0.field3500.field3479[arg0.field3518] < 0) {
                    arg0.field3515.method925(-1);
                }
                var10.method883(var8);
                var10.method706(arg1, arg2, arg4 - arg2);
                if (var10.method887()) {
                    this.field3494.method707(var10);
                }
            }
        }
        arg0.field3515.method706(arg1, arg2, arg3);
    }

    @ObfuscatedName("mj.ah(Lmw;II)V")
    public void method5586(class327 arg0, int arg1) {
        if ((this.field3492.field3451[arg0.field3516] & 0x4) != 0 && arg0.field3499 < 0) {
            int var3 = this.field3492.field3443[arg0.field3516] / Statics.field276;
            int var4 = (var3 + 1048575 - arg0.field3517) / var3;
            arg0.field3517 = arg0.field3517 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3492.field3441[arg0.field3516] == 0) {
                    arg0.field3515 = class49.method871(arg0.field3501, arg0.field3515.method885(), arg0.field3515.method946(), arg0.field3515.method940());
                } else {
                    arg0.field3515 = class49.method871(arg0.field3501, arg0.field3515.method885(), 0, arg0.field3515.method940());
                    this.field3492.method5419(arg0, arg0.field3500.field3479[arg0.field3518] < 0);
                }
                if (arg0.field3500.field3479[arg0.field3518] < 0) {
                    arg0.field3515.method925(-1);
                }
                arg1 = arg0.field3517 / var3;
            }
        }
        arg0.field3515.method729(arg1);
    }
}
