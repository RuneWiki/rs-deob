package deob;

@ObfuscatedName("md")
public class class330 extends class50 {

    @ObfuscatedName("md.aq")
    public class323 field3562;

    @ObfuscatedName("md.aw")
    public class397 field3560 = new class397();

    @ObfuscatedName("md.al")
    public class39 field3561 = new class39();

    public class330(class323 arg0) {
        this.field3562 = arg0;
    }

    @ObfuscatedName("md.as()Lbj;")
    public class50 method663() {
        class332 var1 = (class332) this.field3560.method6702();
        if (var1 == null) {
            return null;
        } else if (var1.field3569 == null) {
            return this.method662();
        } else {
            return var1.field3569;
        }
    }

    @ObfuscatedName("md.aa()Lbj;")
    public class50 method662() {
        class332 var1;
        do {
            var1 = (class332) this.field3560.method6684();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3569 == null);
        return var1.field3569;
    }

    @ObfuscatedName("md.az()I")
    public int method677() {
        return 0;
    }

    @ObfuscatedName("md.ao([III)V")
    public void method666(int[] arg0, int arg1, int arg2) {
        this.field3561.method666(arg0, arg1, arg2);
        for (class332 var4 = (class332) this.field3560.method6702(); var4 != null; var4 = (class332) this.field3560.method6684()) {
            if (!this.field3562.method5570(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3584) {
                        this.method5718(var4, arg0, var5, var6, var5 + var6);
                        var4.field3584 -= var6;
                        break;
                    }
                    this.method5718(var4, arg0, var5, var4.field3584, var5 + var6);
                    var5 += var4.field3584;
                    var6 -= var4.field3584;
                } while (!this.field3562.method5598(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("md.ak(I)V")
    public void method668(int arg0) {
        this.field3561.method668(arg0);
        for (class332 var2 = (class332) this.field3560.method6702(); var2 != null; var2 = (class332) this.field3560.method6684()) {
            if (!this.field3562.method5570(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3584) {
                        this.method5719(var2, var3);
                        var2.field3584 -= var3;
                        break;
                    }
                    this.method5719(var2, var2.field3584);
                    var3 -= var2.field3584;
                } while (!this.field3562.method5598(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("md.aq(Lmw;[IIIIB)V")
    public void method5718(class332 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3562.field3500[arg0.field3577] & 0x4) != 0 && arg0.field3579 < 0) {
            int var6 = this.field3562.field3517[arg0.field3577] / Statics.field296;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3585) / var6;
                if (var7 > arg3) {
                    arg0.field3585 += arg3 * var6;
                    break;
                }
                arg0.field3569.method666(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3585 += var6 * var7 - 1048576;
                int var8 = Statics.field296 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class49 var10 = arg0.field3569;
                if (this.field3562.field3498[arg0.field3577] == 0) {
                    arg0.field3569 = class49.method819(arg0.field3567, var10.method833(), var10.method824(), var10.method963());
                } else {
                    arg0.field3569 = class49.method819(arg0.field3567, var10.method833(), 0, var10.method963());
                    this.field3562.method5557(arg0, arg0.field3576.field3549[arg0.field3570] < 0);
                    arg0.field3569.method829(var8, var10.method824());
                }
                if (arg0.field3576.field3549[arg0.field3570] < 0) {
                    arg0.field3569.method900(-1);
                }
                var10.method906(var8);
                var10.method666(arg1, arg2, arg4 - arg2);
                if (var10.method821()) {
                    this.field3561.method699(var10);
                }
            }
        }
        arg0.field3569.method666(arg1, arg2, arg3);
    }

    @ObfuscatedName("md.aw(Lmw;II)V")
    public void method5719(class332 arg0, int arg1) {
        if ((this.field3562.field3500[arg0.field3577] & 0x4) != 0 && arg0.field3579 < 0) {
            int var3 = this.field3562.field3517[arg0.field3577] / Statics.field296;
            int var4 = (var3 + 1048575 - arg0.field3585) / var3;
            arg0.field3585 = arg0.field3585 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3562.field3498[arg0.field3577] == 0) {
                    arg0.field3569 = class49.method819(arg0.field3567, arg0.field3569.method833(), arg0.field3569.method824(), arg0.field3569.method963());
                } else {
                    arg0.field3569 = class49.method819(arg0.field3567, arg0.field3569.method833(), 0, arg0.field3569.method963());
                    this.field3562.method5557(arg0, arg0.field3576.field3549[arg0.field3570] < 0);
                }
                if (arg0.field3576.field3549[arg0.field3570] < 0) {
                    arg0.field3569.method900(-1);
                }
                arg1 = arg0.field3585 / var3;
            }
        }
        arg0.field3569.method668(arg1);
    }
}
