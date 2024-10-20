package deob;

@ObfuscatedName("nt")
public class class342 extends class50 {

    @ObfuscatedName("nt.ap")
    public class335 field3716;

    @ObfuscatedName("nt.aw")
    public class411 field3713 = new class411();

    @ObfuscatedName("nt.ak")
    public class39 field3714 = new class39();

    public class342(class335 arg0) {
        this.field3716 = arg0;
    }

    @ObfuscatedName("nt.ay()Lbg;")
    public class50 method703() {
        class344 var1 = (class344) this.field3713.method7247();
        if (var1 == null) {
            return null;
        } else if (var1.field3739 == null) {
            return this.method722();
        } else {
            return var1.field3739;
        }
    }

    @ObfuscatedName("nt.as()Lbg;")
    public class50 method722() {
        class344 var1;
        do {
            var1 = (class344) this.field3713.method7249();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3739 == null);
        return var1.field3739;
    }

    @ObfuscatedName("nt.ae()I")
    public int method705() {
        return 0;
    }

    @ObfuscatedName("nt.am([III)V")
    public void method706(int[] arg0, int arg1, int arg2) {
        this.field3714.method706(arg0, arg1, arg2);
        for (class344 var4 = (class344) this.field3713.method7247(); var4 != null; var4 = (class344) this.field3713.method7249()) {
            if (!this.field3716.method6062(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3735) {
                        this.method6210(var4, arg0, var5, var6, var5 + var6);
                        var4.field3735 -= var6;
                        break;
                    }
                    this.method6210(var4, arg0, var5, var4.field3735, var5 + var6);
                    var5 += var4.field3735;
                    var6 -= var4.field3735;
                } while (!this.field3716.method6070(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("nt.au(I)V")
    public void method708(int arg0) {
        this.field3714.method708(arg0);
        for (class344 var2 = (class344) this.field3713.method7247(); var2 != null; var2 = (class344) this.field3713.method7249()) {
            if (!this.field3716.method6062(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3735) {
                        this.method6211(var2, var3);
                        var2.field3735 -= var3;
                        break;
                    }
                    this.method6211(var2, var2.field3735);
                    var3 -= var2.field3735;
                } while (!this.field3716.method6070(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("nt.ap(Lnx;[IIIII)V")
    public void method6210(class344 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3716.field3653[arg0.field3736] & 0x4) != 0 && arg0.field3732 < 0) {
            int var6 = this.field3716.field3651[arg0.field3736] / Statics.field1060;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3741) / var6;
                if (var7 > arg3) {
                    arg0.field3741 += arg3 * var6;
                    break;
                }
                arg0.field3739.method706(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3741 += var6 * var7 - 1048576;
                int var8 = Statics.field1060 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class49 var10 = arg0.field3739;
                if (this.field3716.field3656[arg0.field3736] == 0) {
                    arg0.field3739 = class49.method877(arg0.field3723, var10.method963(), var10.method990(), var10.method884());
                } else {
                    arg0.field3739 = class49.method877(arg0.field3723, var10.method963(), 0, var10.method884());
                    this.field3716.method6116(arg0, arg0.field3722.field3699[arg0.field3726] < 0);
                    arg0.field3739.method888(var8, var10.method990());
                }
                if (arg0.field3722.field3699[arg0.field3726] < 0) {
                    arg0.field3739.method879(-1);
                }
                var10.method1002(var8);
                var10.method706(arg1, arg2, arg4 - arg2);
                if (var10.method894()) {
                    this.field3714.method697(var10);
                }
            }
        }
        arg0.field3739.method706(arg1, arg2, arg3);
    }

    @ObfuscatedName("nt.aw(Lnx;II)V")
    public void method6211(class344 arg0, int arg1) {
        if ((this.field3716.field3653[arg0.field3736] & 0x4) != 0 && arg0.field3732 < 0) {
            int var3 = this.field3716.field3651[arg0.field3736] / Statics.field1060;
            int var4 = (var3 + 1048575 - arg0.field3741) / var3;
            arg0.field3741 = arg0.field3741 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3716.field3656[arg0.field3736] == 0) {
                    arg0.field3739 = class49.method877(arg0.field3723, arg0.field3739.method963(), arg0.field3739.method990(), arg0.field3739.method884());
                } else {
                    arg0.field3739 = class49.method877(arg0.field3723, arg0.field3739.method963(), 0, arg0.field3739.method884());
                    this.field3716.method6116(arg0, arg0.field3722.field3699[arg0.field3726] < 0);
                }
                if (arg0.field3722.field3699[arg0.field3726] < 0) {
                    arg0.field3739.method879(-1);
                }
                arg1 = arg0.field3741 / var3;
            }
        }
        arg0.field3739.method708(arg1);
    }
}
