package deob;

@ObfuscatedName("hg")
public class class223 extends class106 {

    @ObfuscatedName("hg.m")
    public class219 field2567;

    @ObfuscatedName("hg.q")
    public class206 field2566 = new class206();

    @ObfuscatedName("hg.b")
    public class89 field2565 = new class89();

    public class223(class219 arg0) {
        this.field2567 = arg0;
    }

    @ObfuscatedName("hg.a()Ldu;")
    public class106 method1908() {
        class220 var1 = (class220) this.field2566.method3797();
        if (var1 == null) {
            return null;
        } else if (var1.field2537 == null) {
            return this.method1909();
        } else {
            return var1.field2537;
        }
    }

    @ObfuscatedName("hg.l()Ldu;")
    public class106 method1909() {
        class220 var1;
        do {
            var1 = (class220) this.field2566.method3788();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2537 == null);
        return var1.field2537;
    }

    @ObfuscatedName("hg.d()I")
    public int method1910() {
        return 0;
    }

    @ObfuscatedName("hg.s([III)V")
    public void method1945(int[] arg0, int arg1, int arg2) {
        this.field2565.method1945(arg0, arg1, arg2);
        for (class220 var4 = (class220) this.field2566.method3797(); var4 != null; var4 = (class220) this.field2566.method3788()) {
            if (!this.field2567.method3923(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2538) {
                        this.method4070(var4, arg0, var5, var6, var5 + var6);
                        var4.field2538 -= var6;
                        break;
                    }
                    this.method4070(var4, arg0, var5, var4.field2538, var5 + var6);
                    var5 += var4.field2538;
                    var6 -= var4.field2538;
                } while (!this.field2567.method3901(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hg.g(I)V")
    public void method1917(int arg0) {
        this.field2565.method1917(arg0);
        for (class220 var2 = (class220) this.field2566.method3797(); var2 != null; var2 = (class220) this.field2566.method3788()) {
            if (!this.field2567.method3923(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2538) {
                        this.method4071(var2, var3);
                        var2.field2538 -= var3;
                        break;
                    }
                    this.method4071(var2, var2.field2538);
                    var3 -= var2.field2538;
                } while (!this.field2567.method3901(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hg.w(Lhy;[IIIII)V")
    public void method4070(class220 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2567.field2504[arg0.field2519] & 0x4) != 0 && arg0.field2533 < 0) {
            int var6 = this.field2567.field2517[arg0.field2519] / Statics.field1331;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2539) / var6;
                if (var7 > arg3) {
                    arg0.field2539 += arg3 * var6;
                    break;
                }
                arg0.field2537.method1945(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2539 += var6 * var7 - 1048576;
                int var8 = Statics.field1331 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class104 var10 = arg0.field2537;
                if (this.field2567.field2507[arg0.field2519] == 0) {
                    arg0.field2537 = class104.method2142(arg0.field2525, var10.method2157(), var10.method2148(), var10.method2149());
                } else {
                    arg0.field2537 = class104.method2142(arg0.field2525, var10.method2157(), 0, var10.method2149());
                    this.field2567.method3906(arg0, arg0.field2520.field2556[arg0.field2524] < 0);
                    arg0.field2537.method2153(var8, var10.method2148());
                }
                if (arg0.field2520.field2556[arg0.field2524] < 0) {
                    arg0.field2537.method2144(-1);
                }
                var10.method2155(var8);
                var10.method1945(arg1, arg2, arg4 - arg2);
                if (var10.method2159()) {
                    this.field2565.method1903(var10);
                }
            }
        }
        arg0.field2537.method1945(arg1, arg2, arg3);
    }

    @ObfuscatedName("hg.m(Lhy;II)V")
    public void method4071(class220 arg0, int arg1) {
        if ((this.field2567.field2504[arg0.field2519] & 0x4) != 0 && arg0.field2533 < 0) {
            int var3 = this.field2567.field2517[arg0.field2519] / Statics.field1331;
            int var4 = (var3 + 1048575 - arg0.field2539) / var3;
            arg0.field2539 = arg0.field2539 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2567.field2507[arg0.field2519] == 0) {
                    arg0.field2537 = class104.method2142(arg0.field2525, arg0.field2537.method2157(), arg0.field2537.method2148(), arg0.field2537.method2149());
                } else {
                    arg0.field2537 = class104.method2142(arg0.field2525, arg0.field2537.method2157(), 0, arg0.field2537.method2149());
                    this.field2567.method3906(arg0, arg0.field2520.field2556[arg0.field2524] < 0);
                }
                if (arg0.field2520.field2556[arg0.field2524] < 0) {
                    arg0.field2537.method2144(-1);
                }
                arg1 = arg0.field2539 / var3;
            }
        }
        arg0.field2537.method1917(arg1);
    }
}
