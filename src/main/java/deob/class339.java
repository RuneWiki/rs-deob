package deob;

@ObfuscatedName("nt")
public class class339 extends class50 {

    @ObfuscatedName("nt.aq")
    public class332 field3672;

    @ObfuscatedName("nt.ad")
    public class407 field3670 = new class407();

    @ObfuscatedName("nt.ag")
    public class39 field3671 = new class39();

    public class339(class332 arg0) {
        this.field3672 = arg0;
    }

    @ObfuscatedName("nt.an()Lbk;")
    public class50 method750() {
        class341 var1 = (class341) this.field3670.method6814();
        if (var1 == null) {
            return null;
        } else if (var1.field3694 == null) {
            return this.method738();
        } else {
            return var1.field3694;
        }
    }

    @ObfuscatedName("nt.aj()Lbk;")
    public class50 method738() {
        class341 var1;
        do {
            var1 = (class341) this.field3670.method6799();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3694 == null);
        return var1.field3694;
    }

    @ObfuscatedName("nt.av()I")
    public int method724() {
        return 0;
    }

    @ObfuscatedName("nt.ab([III)V")
    public void method718(int[] arg0, int arg1, int arg2) {
        this.field3671.method718(arg0, arg1, arg2);
        for (class341 var4 = (class341) this.field3670.method6814(); var4 != null; var4 = (class341) this.field3670.method6799()) {
            if (!this.field3672.method5664(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3692) {
                        this.method5789(var4, arg0, var5, var6, var5 + var6);
                        var4.field3692 -= var6;
                        break;
                    }
                    this.method5789(var4, arg0, var5, var4.field3692, var5 + var6);
                    var5 += var4.field3692;
                    var6 -= var4.field3692;
                } while (!this.field3672.method5686(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("nt.ae(I)V")
    public void method721(int arg0) {
        this.field3671.method721(arg0);
        for (class341 var2 = (class341) this.field3670.method6814(); var2 != null; var2 = (class341) this.field3670.method6799()) {
            if (!this.field3672.method5664(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3692) {
                        this.method5788(var2, var3);
                        var2.field3692 -= var3;
                        break;
                    }
                    this.method5788(var2, var2.field3692);
                    var3 -= var2.field3692;
                } while (!this.field3672.method5686(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("nt.aq(Lna;[IIIII)V")
    public void method5789(class341 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3672.field3609[arg0.field3686] & 0x4) != 0 && arg0.field3681 < 0) {
            int var6 = this.field3672.field3614[arg0.field3686] / Statics.field264;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3696) / var6;
                if (var7 > arg3) {
                    arg0.field3696 += arg3 * var6;
                    break;
                }
                arg0.field3694.method718(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3696 += var6 * var7 - 1048576;
                int var8 = Statics.field264 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class49 var10 = arg0.field3694;
                if (this.field3672.field3612[arg0.field3686] == 0) {
                    arg0.field3694 = class49.method878(arg0.field3678, var10.method892(), var10.method883(), var10.method962());
                } else {
                    arg0.field3694 = class49.method878(arg0.field3678, var10.method892(), 0, var10.method962());
                    this.field3672.method5627(arg0, arg0.field3677.field3655[arg0.field3676] < 0);
                    arg0.field3694.method888(var8, var10.method883());
                }
                if (arg0.field3677.field3655[arg0.field3676] < 0) {
                    arg0.field3694.method963(-1);
                }
                var10.method890(var8);
                var10.method718(arg1, arg2, arg4 - arg2);
                if (var10.method885()) {
                    this.field3671.method711(var10);
                }
            }
        }
        arg0.field3694.method718(arg1, arg2, arg3);
    }

    @ObfuscatedName("nt.ad(Lna;II)V")
    public void method5788(class341 arg0, int arg1) {
        if ((this.field3672.field3609[arg0.field3686] & 0x4) != 0 && arg0.field3681 < 0) {
            int var3 = this.field3672.field3614[arg0.field3686] / Statics.field264;
            int var4 = (var3 + 1048575 - arg0.field3696) / var3;
            arg0.field3696 = arg0.field3696 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3672.field3612[arg0.field3686] == 0) {
                    arg0.field3694 = class49.method878(arg0.field3678, arg0.field3694.method892(), arg0.field3694.method883(), arg0.field3694.method962());
                } else {
                    arg0.field3694 = class49.method878(arg0.field3678, arg0.field3694.method892(), 0, arg0.field3694.method962());
                    this.field3672.method5627(arg0, arg0.field3677.field3655[arg0.field3676] < 0);
                }
                if (arg0.field3677.field3655[arg0.field3676] < 0) {
                    arg0.field3694.method963(-1);
                }
                arg1 = arg0.field3696 / var3;
            }
        }
        arg0.field3694.method721(arg1);
    }
}
