package deob;

@ObfuscatedName("ho")
public class class209 extends class118 {

    @ObfuscatedName("ho.s")
    public class205 field2585;

    @ObfuscatedName("ho.q")
    public class194 field2583 = new class194();

    @ObfuscatedName("ho.o")
    public class101 field2584 = new class101();

    public class209(class205 arg0) {
        this.field2585 = arg0;
    }

    @ObfuscatedName("ho.v()Ldm;")
    public class118 method1817() {
        class206 var1 = (class206) this.field2583.method3427();
        if (var1 == null) {
            return null;
        } else if (var1.field2553 == null) {
            return this.method1784();
        } else {
            return var1.field2553;
        }
    }

    @ObfuscatedName("ho.p()Ldm;")
    public class118 method1784() {
        class206 var1;
        do {
            var1 = (class206) this.field2583.method3435();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2553 == null);
        return var1.field2553;
    }

    @ObfuscatedName("ho.e()I")
    public int method1785() {
        return 0;
    }

    @ObfuscatedName("ho.d([III)V")
    public void method1786(int[] arg0, int arg1, int arg2) {
        this.field2584.method1786(arg0, arg1, arg2);
        for (class206 var4 = (class206) this.field2583.method3427(); var4 != null; var4 = (class206) this.field2583.method3435()) {
            if (!this.field2585.method3528(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2536) {
                        this.method3689(var4, arg0, var5, var6, var5 + var6);
                        var4.field2536 -= var6;
                        break;
                    }
                    this.method3689(var4, arg0, var5, var4.field2536, var5 + var6);
                    var5 += var4.field2536;
                    var6 -= var4.field2536;
                } while (!this.field2585.method3546(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ho.u(I)V")
    public void method1815(int arg0) {
        this.field2584.method1815(arg0);
        for (class206 var2 = (class206) this.field2583.method3427(); var2 != null; var2 = (class206) this.field2583.method3435()) {
            if (!this.field2585.method3528(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2536) {
                        this.method3690(var2, var3);
                        var2.field2536 -= var3;
                        break;
                    }
                    this.method3690(var2, var2.field2536);
                    var3 -= var2.field2536;
                } while (!this.field2585.method3546(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ho.w(Lgu;[IIIIB)V")
    public void method3689(class206 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2585.field2519[arg0.field2550] & 0x4) != 0 && arg0.field2545 < 0) {
            int var6 = this.field2585.field2515[arg0.field2550] / Statics.field1621;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2555) / var6;
                if (var7 > arg3) {
                    arg0.field2555 += arg3 * var6;
                    break;
                }
                arg0.field2553.method1786(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2555 += var6 * var7 - 1048576;
                int var8 = Statics.field1621 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class116 var10 = arg0.field2553;
                if (this.field2585.field2522[arg0.field2550] == 0) {
                    arg0.field2553 = class116.method2010(arg0.field2537, var10.method2025(), var10.method2121(), var10.method2069());
                } else {
                    arg0.field2553 = class116.method2010(arg0.field2537, var10.method2025(), 0, var10.method2069());
                    this.field2585.method3533(arg0, arg0.field2552.field2576[arg0.field2540] < 0);
                    arg0.field2553.method2021(var8, var10.method2121());
                }
                if (arg0.field2552.field2576[arg0.field2540] < 0) {
                    arg0.field2553.method2012(-1);
                }
                var10.method2023(var8);
                var10.method1786(arg1, arg2, arg4 - arg2);
                if (var10.method2083()) {
                    this.field2584.method1779(var10);
                }
            }
        }
        arg0.field2553.method1786(arg1, arg2, arg3);
    }

    @ObfuscatedName("ho.s(Lgu;II)V")
    public void method3690(class206 arg0, int arg1) {
        if ((this.field2585.field2519[arg0.field2550] & 0x4) != 0 && arg0.field2545 < 0) {
            int var3 = this.field2585.field2515[arg0.field2550] / Statics.field1621;
            int var4 = (var3 + 1048575 - arg0.field2555) / var3;
            arg0.field2555 = arg0.field2555 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2585.field2522[arg0.field2550] == 0) {
                    arg0.field2553 = class116.method2010(arg0.field2537, arg0.field2553.method2025(), arg0.field2553.method2121(), arg0.field2553.method2069());
                } else {
                    arg0.field2553 = class116.method2010(arg0.field2537, arg0.field2553.method2025(), 0, arg0.field2553.method2069());
                    this.field2585.method3533(arg0, arg0.field2552.field2576[arg0.field2540] < 0);
                }
                if (arg0.field2552.field2576[arg0.field2540] < 0) {
                    arg0.field2553.method2012(-1);
                }
                arg1 = arg0.field2555 / var3;
            }
        }
        arg0.field2553.method1815(arg1);
    }
}
