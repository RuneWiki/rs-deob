package deob;

@ObfuscatedName("nq")
public class class343 extends class50 {

    @ObfuscatedName("nq.ac")
    public class336 field3698;

    @ObfuscatedName("nq.ae")
    public class410 field3697 = new class410();

    @ObfuscatedName("nq.ag")
    public class39 field3696 = new class39();

    public class343(class336 arg0) {
        this.field3698 = arg0;
    }

    @ObfuscatedName("nq.aq()Lbk;")
    public class50 method709() {
        class345 var1 = (class345) this.field3697.method7029();
        if (var1 == null) {
            return null;
        } else if (var1.field3720 == null) {
            return this.method710();
        } else {
            return var1.field3720;
        }
    }

    @ObfuscatedName("nq.af()Lbk;")
    public class50 method710() {
        class345 var1;
        do {
            var1 = (class345) this.field3697.method7031();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3720 == null);
        return var1.field3720;
    }

    @ObfuscatedName("nq.at()I")
    public int method711() {
        return 0;
    }

    @ObfuscatedName("nq.au([III)V")
    public void method712(int[] arg0, int arg1, int arg2) {
        this.field3696.method712(arg0, arg1, arg2);
        for (class345 var4 = (class345) this.field3697.method7029(); var4 != null; var4 = (class345) this.field3697.method7031()) {
            if (!this.field3698.method5878(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3704) {
                        this.method6038(var4, arg0, var5, var6, var5 + var6);
                        var4.field3704 -= var6;
                        break;
                    }
                    this.method6038(var4, arg0, var5, var4.field3704, var5 + var6);
                    var5 += var4.field3704;
                    var6 -= var4.field3704;
                } while (!this.field3698.method5879(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("nq.al(I)V")
    public void method716(int arg0) {
        this.field3696.method716(arg0);
        for (class345 var2 = (class345) this.field3697.method7029(); var2 != null; var2 = (class345) this.field3697.method7031()) {
            if (!this.field3698.method5878(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3704) {
                        this.method6040(var2, var3);
                        var2.field3704 -= var3;
                        break;
                    }
                    this.method6040(var2, var2.field3704);
                    var3 -= var2.field3704;
                } while (!this.field3698.method5879(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("nq.ac(Lnb;[IIIII)V")
    public void method6038(class345 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3698.field3641[arg0.field3712] & 0x4) != 0 && arg0.field3705 < 0) {
            int var6 = this.field3698.field3646[arg0.field3712] / Statics.field271;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3722) / var6;
                if (var7 > arg3) {
                    arg0.field3722 += arg3 * var6;
                    break;
                }
                arg0.field3720.method712(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3722 += var6 * var7 - 1048576;
                int var8 = Statics.field271 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class49 var10 = arg0.field3720;
                if (this.field3698.field3644[arg0.field3712] == 0) {
                    arg0.field3720 = class49.method962(arg0.field3716, var10.method890(), var10.method881(), var10.method997());
                } else {
                    arg0.field3720 = class49.method962(arg0.field3716, var10.method890(), 0, var10.method997());
                    this.field3698.method5865(arg0, arg0.field3703.field3682[arg0.field3707] < 0);
                    arg0.field3720.method948(var8, var10.method881());
                }
                if (arg0.field3703.field3682[arg0.field3707] < 0) {
                    arg0.field3720.method887(-1);
                }
                var10.method998(var8);
                var10.method712(arg1, arg2, arg4 - arg2);
                if (var10.method892()) {
                    this.field3696.method705(var10);
                }
            }
        }
        arg0.field3720.method712(arg1, arg2, arg3);
    }

    @ObfuscatedName("nq.ae(Lnb;IB)V")
    public void method6040(class345 arg0, int arg1) {
        if ((this.field3698.field3641[arg0.field3712] & 0x4) != 0 && arg0.field3705 < 0) {
            int var3 = this.field3698.field3646[arg0.field3712] / Statics.field271;
            int var4 = (var3 + 1048575 - arg0.field3722) / var3;
            arg0.field3722 = arg0.field3722 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3698.field3644[arg0.field3712] == 0) {
                    arg0.field3720 = class49.method962(arg0.field3716, arg0.field3720.method890(), arg0.field3720.method881(), arg0.field3720.method997());
                } else {
                    arg0.field3720 = class49.method962(arg0.field3716, arg0.field3720.method890(), 0, arg0.field3720.method997());
                    this.field3698.method5865(arg0, arg0.field3703.field3682[arg0.field3707] < 0);
                }
                if (arg0.field3703.field3682[arg0.field3707] < 0) {
                    arg0.field3720.method887(-1);
                }
                arg1 = arg0.field3722 / var3;
            }
        }
        arg0.field3720.method716(arg1);
    }
}
