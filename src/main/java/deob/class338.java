package deob;

@ObfuscatedName("ml")
public class class338 extends class50 {

    @ObfuscatedName("ml.ak")
    public class331 field3659;

    @ObfuscatedName("ml.al")
    public class406 field3658 = new class406();

    @ObfuscatedName("ml.aj")
    public class39 field3657 = new class39();

    public class338(class331 arg0) {
        this.field3659 = arg0;
    }

    @ObfuscatedName("ml.aa()Lba;")
    public class50 method704() {
        class340 var1 = (class340) this.field3658.method6834();
        if (var1 == null) {
            return null;
        } else if (var1.field3672 == null) {
            return this.method705();
        } else {
            return var1.field3672;
        }
    }

    @ObfuscatedName("ml.at()Lba;")
    public class50 method705() {
        class340 var1;
        do {
            var1 = (class340) this.field3658.method6842();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3672 == null);
        return var1.field3672;
    }

    @ObfuscatedName("ml.ab()I")
    public int method706() {
        return 0;
    }

    @ObfuscatedName("ml.ac([III)V")
    public void method707(int[] arg0, int arg1, int arg2) {
        this.field3657.method707(arg0, arg1, arg2);
        for (class340 var4 = (class340) this.field3658.method6834(); var4 != null; var4 = (class340) this.field3658.method6842()) {
            if (!this.field3659.method5694(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3663) {
                        this.method5840(var4, arg0, var5, var6, var5 + var6);
                        var4.field3663 -= var6;
                        break;
                    }
                    this.method5840(var4, arg0, var5, var4.field3663, var5 + var6);
                    var5 += var4.field3663;
                    var6 -= var4.field3663;
                } while (!this.field3659.method5725(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ml.ah(I)V")
    public void method713(int arg0) {
        this.field3657.method713(arg0);
        for (class340 var2 = (class340) this.field3658.method6834(); var2 != null; var2 = (class340) this.field3658.method6842()) {
            if (!this.field3659.method5694(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3663) {
                        this.method5841(var2, var3);
                        var2.field3663 -= var3;
                        break;
                    }
                    this.method5841(var2, var2.field3663);
                    var3 -= var2.field3663;
                } while (!this.field3659.method5725(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ml.ak(Lne;[IIIIB)V")
    public void method5840(class340 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3659.field3602[arg0.field3667] & 0x4) != 0 && arg0.field3677 < 0) {
            int var6 = this.field3659.field3588[arg0.field3667] / Statics.field1509;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3683) / var6;
                if (var7 > arg3) {
                    arg0.field3683 += arg3 * var6;
                    break;
                }
                arg0.field3672.method707(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3683 += var6 * var7 - 1048576;
                int var8 = Statics.field1509 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class49 var10 = arg0.field3672;
                if (this.field3659.field3605[arg0.field3667] == 0) {
                    arg0.field3672 = class49.method864(arg0.field3674, var10.method879(), var10.method926(), var10.method861());
                } else {
                    arg0.field3672 = class49.method864(arg0.field3674, var10.method879(), 0, var10.method861());
                    this.field3659.method5698(arg0, arg0.field3664.field3648[arg0.field3669] < 0);
                    arg0.field3672.method875(var8, var10.method926());
                }
                if (arg0.field3664.field3648[arg0.field3669] < 0) {
                    arg0.field3672.method866(-1);
                }
                var10.method877(var8);
                var10.method707(arg1, arg2, arg4 - arg2);
                if (var10.method881()) {
                    this.field3657.method699(var10);
                }
            }
        }
        arg0.field3672.method707(arg1, arg2, arg3);
    }

    @ObfuscatedName("ml.al(Lne;II)V")
    public void method5841(class340 arg0, int arg1) {
        if ((this.field3659.field3602[arg0.field3667] & 0x4) != 0 && arg0.field3677 < 0) {
            int var3 = this.field3659.field3588[arg0.field3667] / Statics.field1509;
            int var4 = (var3 + 1048575 - arg0.field3683) / var3;
            arg0.field3683 = arg0.field3683 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3659.field3605[arg0.field3667] == 0) {
                    arg0.field3672 = class49.method864(arg0.field3674, arg0.field3672.method879(), arg0.field3672.method926(), arg0.field3672.method861());
                } else {
                    arg0.field3672 = class49.method864(arg0.field3674, arg0.field3672.method879(), 0, arg0.field3672.method861());
                    this.field3659.method5698(arg0, arg0.field3664.field3648[arg0.field3669] < 0);
                }
                if (arg0.field3664.field3648[arg0.field3669] < 0) {
                    arg0.field3672.method866(-1);
                }
                arg1 = arg0.field3683 / var3;
            }
        }
        arg0.field3672.method713(arg1);
    }
}
