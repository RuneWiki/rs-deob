package deob;

@ObfuscatedName("ml")
public class class328 extends class50 {

    @ObfuscatedName("ml.am")
    public class321 field3543;

    @ObfuscatedName("ml.ap")
    public class394 field3539 = new class394();

    @ObfuscatedName("ml.af")
    public class39 field3538 = new class39();

    public class328(class321 arg0) {
        this.field3543 = arg0;
    }

    @ObfuscatedName("ml.ar()Lbl;")
    public class50 method738() {
        class330 var1 = (class330) this.field3539.method6670();
        if (var1 == null) {
            return null;
        } else if (var1.field3564 == null) {
            return this.method766();
        } else {
            return var1.field3564;
        }
    }

    @ObfuscatedName("ml.ag()Lbl;")
    public class50 method766() {
        class330 var1;
        do {
            var1 = (class330) this.field3539.method6665();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3564 == null);
        return var1.field3564;
    }

    @ObfuscatedName("ml.ao()I")
    public int method740() {
        return 0;
    }

    @ObfuscatedName("ml.ae([III)V")
    public void method736(int[] arg0, int arg1, int arg2) {
        this.field3538.method736(arg0, arg1, arg2);
        for (class330 var4 = (class330) this.field3539.method6670(); var4 != null; var4 = (class330) this.field3539.method6665()) {
            if (!this.field3543.method5533(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3565) {
                        this.method5676(var4, arg0, var5, var6, var5 + var6);
                        var4.field3565 -= var6;
                        break;
                    }
                    this.method5676(var4, arg0, var5, var4.field3565, var5 + var6);
                    var5 += var4.field3565;
                    var6 -= var4.field3565;
                } while (!this.field3543.method5534(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ml.au(I)V")
    public void method743(int arg0) {
        this.field3538.method743(arg0);
        for (class330 var2 = (class330) this.field3539.method6670(); var2 != null; var2 = (class330) this.field3539.method6665()) {
            if (!this.field3543.method5533(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3565) {
                        this.method5677(var2, var3);
                        var2.field3565 -= var3;
                        break;
                    }
                    this.method5677(var2, var2.field3565);
                    var3 -= var2.field3565;
                } while (!this.field3543.method5534(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ml.am(Lmv;[IIIIB)V")
    public void method5676(class330 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3543.field3482[arg0.field3558] & 0x4) != 0 && arg0.field3560 < 0) {
            int var6 = this.field3543.field3495[arg0.field3558] / Statics.field1994;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3555) / var6;
                if (var7 > arg3) {
                    arg0.field3555 += arg3 * var6;
                    break;
                }
                arg0.field3564.method736(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3555 += var6 * var7 - 1048576;
                int var8 = Statics.field1994 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class49 var10 = arg0.field3564;
                if (this.field3543.field3485[arg0.field3558] == 0) {
                    arg0.field3564 = class49.method893(arg0.field3548, var10.method907(), var10.method898(), var10.method899());
                } else {
                    arg0.field3564 = class49.method893(arg0.field3548, var10.method907(), 0, var10.method899());
                    this.field3543.method5517(arg0, arg0.field3547.field3523[arg0.field3569] < 0);
                    arg0.field3564.method903(var8, var10.method898());
                }
                if (arg0.field3547.field3523[arg0.field3569] < 0) {
                    arg0.field3564.method931(-1);
                }
                var10.method983(var8);
                var10.method736(arg1, arg2, arg4 - arg2);
                if (var10.method909()) {
                    this.field3538.method732(var10);
                }
            }
        }
        arg0.field3564.method736(arg1, arg2, arg3);
    }

    @ObfuscatedName("ml.ap(Lmv;II)V")
    public void method5677(class330 arg0, int arg1) {
        if ((this.field3543.field3482[arg0.field3558] & 0x4) != 0 && arg0.field3560 < 0) {
            int var3 = this.field3543.field3495[arg0.field3558] / Statics.field1994;
            int var4 = (var3 + 1048575 - arg0.field3555) / var3;
            arg0.field3555 = arg0.field3555 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3543.field3485[arg0.field3558] == 0) {
                    arg0.field3564 = class49.method893(arg0.field3548, arg0.field3564.method907(), arg0.field3564.method898(), arg0.field3564.method899());
                } else {
                    arg0.field3564 = class49.method893(arg0.field3548, arg0.field3564.method907(), 0, arg0.field3564.method899());
                    this.field3543.method5517(arg0, arg0.field3547.field3523[arg0.field3569] < 0);
                }
                if (arg0.field3547.field3523[arg0.field3569] < 0) {
                    arg0.field3564.method931(-1);
                }
                arg1 = arg0.field3555 / var3;
            }
        }
        arg0.field3564.method743(arg1);
    }
}
