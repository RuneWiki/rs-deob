package deob;

@ObfuscatedName("hz")
public class class209 extends class120 {

    @ObfuscatedName("hz.i")
    public class205 field2598;

    @ObfuscatedName("hz.c")
    public class194 field2595 = new class194();

    @ObfuscatedName("hz.e")
    public class103 field2597 = new class103();

    public class209(class205 arg0) {
        this.field2598 = arg0;
    }

    @ObfuscatedName("hz.y()Ldy;")
    public class120 method1731() {
        class206 var1 = (class206) this.field2595.method3294();
        if (var1 == null) {
            return null;
        } else if (var1.field2564 == null) {
            return this.method1733();
        } else {
            return var1.field2564;
        }
    }

    @ObfuscatedName("hz.h()Ldy;")
    public class120 method1733() {
        class206 var1;
        do {
            var1 = (class206) this.field2595.method3296();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2564 == null);
        return var1.field2564;
    }

    @ObfuscatedName("hz.x()I")
    public int method1730() {
        return 0;
    }

    @ObfuscatedName("hz.f([III)V")
    public void method1734(int[] arg0, int arg1, int arg2) {
        this.field2597.method1734(arg0, arg1, arg2);
        for (class206 var4 = (class206) this.field2595.method3294(); var4 != null; var4 = (class206) this.field2595.method3296()) {
            if (!this.field2598.method3414(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2565) {
                        this.method3553(var4, arg0, var5, var6, var5 + var6);
                        var4.field2565 -= var6;
                        break;
                    }
                    this.method3553(var4, arg0, var5, var4.field2565, var5 + var6);
                    var5 += var4.field2565;
                    var6 -= var4.field2565;
                } while (!this.field2598.method3415(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hz.a(I)V")
    public void method1725(int arg0) {
        this.field2597.method1725(arg0);
        for (class206 var2 = (class206) this.field2595.method3294(); var2 != null; var2 = (class206) this.field2595.method3296()) {
            if (!this.field2598.method3414(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2565) {
                        this.method3554(var2, var3);
                        var2.field2565 -= var3;
                        break;
                    }
                    this.method3554(var2, var2.field2565);
                    var3 -= var2.field2565;
                } while (!this.field2598.method3415(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hz.i(Lgp;[IIIII)V")
    public void method3553(class206 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2598.field2530[arg0.field2561] & 0x4) != 0 && arg0.field2560 < 0) {
            int var6 = this.field2598.field2543[arg0.field2561] / Statics.field1641;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2566) / var6;
                if (var7 > arg3) {
                    arg0.field2566 += arg3 * var6;
                    break;
                }
                arg0.field2564.method1734(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2566 += var6 * var7 - 1048576;
                int var8 = Statics.field1641 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class118 var10 = arg0.field2564;
                if (this.field2598.field2533[arg0.field2561] == 0) {
                    arg0.field2564 = class118.method1939(arg0.field2548, var10.method2064(), var10.method2040(), var10.method1946());
                } else {
                    arg0.field2564 = class118.method1939(arg0.field2548, var10.method2064(), 0, var10.method1946());
                    this.field2598.method3397(arg0, arg0.field2563.field2584[arg0.field2562] < 0);
                    arg0.field2564.method1985(var8, var10.method2040());
                }
                if (arg0.field2563.field2584[arg0.field2562] < 0) {
                    arg0.field2564.method2034(-1);
                }
                var10.method2046(var8);
                var10.method1734(arg1, arg2, arg4 - arg2);
                if (var10.method1990()) {
                    this.field2597.method1740(var10);
                }
            }
        }
        arg0.field2564.method1734(arg1, arg2, arg3);
    }

    @ObfuscatedName("hz.c(Lgp;IB)V")
    public void method3554(class206 arg0, int arg1) {
        if ((this.field2598.field2530[arg0.field2561] & 0x4) != 0 && arg0.field2560 < 0) {
            int var3 = this.field2598.field2543[arg0.field2561] / Statics.field1641;
            int var4 = (var3 + 1048575 - arg0.field2566) / var3;
            arg0.field2566 = arg0.field2566 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2598.field2533[arg0.field2561] == 0) {
                    arg0.field2564 = class118.method1939(arg0.field2548, arg0.field2564.method2064(), arg0.field2564.method2040(), arg0.field2564.method1946());
                } else {
                    arg0.field2564 = class118.method1939(arg0.field2548, arg0.field2564.method2064(), 0, arg0.field2564.method1946());
                    this.field2598.method3397(arg0, arg0.field2563.field2584[arg0.field2562] < 0);
                }
                if (arg0.field2563.field2584[arg0.field2562] < 0) {
                    arg0.field2564.method2034(-1);
                }
                arg1 = arg0.field2566 / var3;
            }
        }
        arg0.field2564.method1725(arg1);
    }
}
