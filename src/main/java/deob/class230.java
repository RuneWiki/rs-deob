package deob;

@ObfuscatedName("hb")
public class class230 extends class113 {

    @ObfuscatedName("hb.a")
    public class226 field2635;

    @ObfuscatedName("hb.s")
    public class213 field2634 = new class213();

    @ObfuscatedName("hb.g")
    public class96 field2636 = new class96();

    public class230(class226 arg0) {
        this.field2635 = arg0;
    }

    @ObfuscatedName("hb.f()Ldo;")
    public class113 method2139() {
        class227 var1 = (class227) this.field2634.method3990();
        if (var1 == null) {
            return null;
        } else if (var1.field2606 == null) {
            return this.method2125();
        } else {
            return var1.field2606;
        }
    }

    @ObfuscatedName("hb.p()Ldo;")
    public class113 method2125() {
        class227 var1;
        do {
            var1 = (class227) this.field2634.method3984();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2606 == null);
        return var1.field2606;
    }

    @ObfuscatedName("hb.m()I")
    public int method2156() {
        return 0;
    }

    @ObfuscatedName("hb.q([III)V")
    public void method2127(int[] arg0, int arg1, int arg2) {
        this.field2636.method2127(arg0, arg1, arg2);
        for (class227 var4 = (class227) this.field2634.method3990(); var4 != null; var4 = (class227) this.field2634.method3984()) {
            if (!this.field2635.method4095(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2598) {
                        this.method4240(var4, arg0, var5, var6, var5 + var6);
                        var4.field2598 -= var6;
                        break;
                    }
                    this.method4240(var4, arg0, var5, var4.field2598, var5 + var6);
                    var5 += var4.field2598;
                    var6 -= var4.field2598;
                } while (!this.field2635.method4101(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hb.n(I)V")
    public void method2129(int arg0) {
        this.field2636.method2129(arg0);
        for (class227 var2 = (class227) this.field2634.method3990(); var2 != null; var2 = (class227) this.field2634.method3984()) {
            if (!this.field2635.method4095(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2598) {
                        this.method4241(var2, var3);
                        var2.field2598 -= var3;
                        break;
                    }
                    this.method4241(var2, var2.field2598);
                    var3 -= var2.field2598;
                } while (!this.field2635.method4101(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hb.a(Lhl;[IIIII)V")
    public void method4240(class227 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2635.field2574[arg0.field2602] & 0x4) != 0 && arg0.field2589 < 0) {
            int var6 = this.field2635.field2578[arg0.field2602] / Statics.field367;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2608) / var6;
                if (var7 > arg3) {
                    arg0.field2608 += arg3 * var6;
                    break;
                }
                arg0.field2606.method2127(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2608 += var6 * var7 - 1048576;
                int var8 = Statics.field367 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class111 var10 = arg0.field2606;
                if (this.field2635.field2560[arg0.field2602] == 0) {
                    arg0.field2606 = class111.method2365(arg0.field2599, var10.method2357(), var10.method2348(), var10.method2415());
                } else {
                    arg0.field2606 = class111.method2365(arg0.field2599, var10.method2357(), 0, var10.method2415());
                    this.field2635.method4083(arg0, arg0.field2588.field2626[arg0.field2604] < 0);
                    arg0.field2606.method2353(var8, var10.method2348());
                }
                if (arg0.field2588.field2626[arg0.field2604] < 0) {
                    arg0.field2606.method2344(-1);
                }
                var10.method2355(var8);
                var10.method2127(arg1, arg2, arg4 - arg2);
                if (var10.method2359()) {
                    this.field2636.method2124(var10);
                }
            }
        }
        arg0.field2606.method2127(arg1, arg2, arg3);
    }

    @ObfuscatedName("hb.s(Lhl;II)V")
    public void method4241(class227 arg0, int arg1) {
        if ((this.field2635.field2574[arg0.field2602] & 0x4) != 0 && arg0.field2589 < 0) {
            int var3 = this.field2635.field2578[arg0.field2602] / Statics.field367;
            int var4 = (var3 + 1048575 - arg0.field2608) / var3;
            arg0.field2608 = arg0.field2608 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2635.field2560[arg0.field2602] == 0) {
                    arg0.field2606 = class111.method2365(arg0.field2599, arg0.field2606.method2357(), arg0.field2606.method2348(), arg0.field2606.method2415());
                } else {
                    arg0.field2606 = class111.method2365(arg0.field2599, arg0.field2606.method2357(), 0, arg0.field2606.method2415());
                    this.field2635.method4083(arg0, arg0.field2588.field2626[arg0.field2604] < 0);
                }
                if (arg0.field2588.field2626[arg0.field2604] < 0) {
                    arg0.field2606.method2344(-1);
                }
                arg1 = arg0.field2608 / var3;
            }
        }
        arg0.field2606.method2129(arg1);
    }
}
