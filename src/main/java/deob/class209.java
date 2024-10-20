package deob;

@ObfuscatedName("hd")
public class class209 extends class122 {

    @ObfuscatedName("hd.d")
    public class205 field2572;

    @ObfuscatedName("hd.q")
    public class194 field2569 = new class194();

    @ObfuscatedName("hd.x")
    public class105 field2570 = new class105();

    public class209(class205 arg0) {
        this.field2572 = arg0;
    }

    @ObfuscatedName("hd.f()Ldz;")
    public class122 method1779() {
        class206 var1 = (class206) this.field2569.method3323();
        if (var1 == null) {
            return null;
        } else if (var1.field2533 == null) {
            return this.method1780();
        } else {
            return var1.field2533;
        }
    }

    @ObfuscatedName("hd.v()Ldz;")
    public class122 method1780() {
        class206 var1;
        do {
            var1 = (class206) this.field2569.method3325();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2533 == null);
        return var1.field2533;
    }

    @ObfuscatedName("hd.t()I")
    public int method1781() {
        return 0;
    }

    @ObfuscatedName("hd.i([III)V")
    public void method1782(int[] arg0, int arg1, int arg2) {
        this.field2570.method1782(arg0, arg1, arg2);
        for (class206 var4 = (class206) this.field2569.method3323(); var4 != null; var4 = (class206) this.field2569.method3325()) {
            if (!this.field2572.method3508(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2523) {
                        this.method3573(var4, arg0, var5, var6, var5 + var6);
                        var4.field2523 -= var6;
                        break;
                    }
                    this.method3573(var4, arg0, var5, var4.field2523, var5 + var6);
                    var5 += var4.field2523;
                    var6 -= var4.field2523;
                } while (!this.field2572.method3436(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hd.g(I)V")
    public void method1778(int arg0) {
        this.field2570.method1778(arg0);
        for (class206 var2 = (class206) this.field2569.method3323(); var2 != null; var2 = (class206) this.field2569.method3325()) {
            if (!this.field2572.method3508(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2523) {
                        this.method3572(var2, var3);
                        var2.field2523 -= var3;
                        break;
                    }
                    this.method3572(var2, var2.field2523);
                    var3 -= var2.field2523;
                } while (!this.field2572.method3436(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hd.d(Lgd;[IIIII)V")
    public void method3573(class206 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2572.field2514[arg0.field2534] & 0x4) != 0 && arg0.field2529 < 0) {
            int var6 = this.field2572.field2502[arg0.field2534] / Statics.field1634;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2528) / var6;
                if (var7 > arg3) {
                    arg0.field2528 += arg3 * var6;
                    break;
                }
                arg0.field2533.method1782(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2528 += var6 * var7 - 1048576;
                int var8 = Statics.field1634 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class120 var10 = arg0.field2533;
                if (this.field2572.field2500[arg0.field2534] == 0) {
                    arg0.field2533 = class120.method2005(arg0.field2517, var10.method2019(), var10.method2002(), var10.method2054());
                } else {
                    arg0.field2533 = class120.method2005(arg0.field2517, var10.method2019(), 0, var10.method2054());
                    this.field2572.method3419(arg0, arg0.field2516.field2554[arg0.field2520] < 0);
                    arg0.field2533.method2010(var8, var10.method2002());
                }
                if (arg0.field2516.field2554[arg0.field2520] < 0) {
                    arg0.field2533.method2007(-1);
                }
                var10.method2039(var8);
                var10.method1782(arg1, arg2, arg4 - arg2);
                if (var10.method2021()) {
                    this.field2570.method1774(var10);
                }
            }
        }
        arg0.field2533.method1782(arg1, arg2, arg3);
    }

    @ObfuscatedName("hd.q(Lgd;II)V")
    public void method3572(class206 arg0, int arg1) {
        if ((this.field2572.field2514[arg0.field2534] & 0x4) != 0 && arg0.field2529 < 0) {
            int var3 = this.field2572.field2502[arg0.field2534] / Statics.field1634;
            int var4 = (var3 + 1048575 - arg0.field2528) / var3;
            arg0.field2528 = arg0.field2528 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2572.field2500[arg0.field2534] == 0) {
                    arg0.field2533 = class120.method2005(arg0.field2517, arg0.field2533.method2019(), arg0.field2533.method2002(), arg0.field2533.method2054());
                } else {
                    arg0.field2533 = class120.method2005(arg0.field2517, arg0.field2533.method2019(), 0, arg0.field2533.method2054());
                    this.field2572.method3419(arg0, arg0.field2516.field2554[arg0.field2520] < 0);
                }
                if (arg0.field2516.field2554[arg0.field2520] < 0) {
                    arg0.field2533.method2007(-1);
                }
                arg1 = arg0.field2528 / var3;
            }
        }
        arg0.field2533.method1778(arg1);
    }
}
