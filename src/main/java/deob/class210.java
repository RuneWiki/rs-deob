package deob;

@ObfuscatedName("hf")
public class class210 extends class121 {

    @ObfuscatedName("hf.e")
    public class206 field2575;

    @ObfuscatedName("hf.n")
    public class195 field2573 = new class195();

    @ObfuscatedName("hf.g")
    public class104 field2574 = new class104();

    public class210(class206 arg0) {
        this.field2575 = arg0;
    }

    @ObfuscatedName("hf.k()Ldl;")
    public class121 method1774() {
        class207 var1 = (class207) this.field2573.method3348();
        if (var1 == null) {
            return null;
        } else if (var1.field2545 == null) {
            return this.method1775();
        } else {
            return var1.field2545;
        }
    }

    @ObfuscatedName("hf.v()Ldl;")
    public class121 method1775() {
        class207 var1;
        do {
            var1 = (class207) this.field2573.method3350();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2545 == null);
        return var1.field2545;
    }

    @ObfuscatedName("hf.z()I")
    public int method1776() {
        return 0;
    }

    @ObfuscatedName("hf.r([III)V")
    public void method1777(int[] arg0, int arg1, int arg2) {
        this.field2574.method1777(arg0, arg1, arg2);
        for (class207 var4 = (class207) this.field2573.method3348(); var4 != null; var4 = (class207) this.field2573.method3350()) {
            if (!this.field2575.method3487(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2546) {
                        this.method3620(var4, arg0, var5, var6, var5 + var6);
                        var4.field2546 -= var6;
                        break;
                    }
                    this.method3620(var4, arg0, var5, var4.field2546, var5 + var6);
                    var5 += var4.field2546;
                    var6 -= var4.field2546;
                } while (!this.field2575.method3478(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hf.d(I)V")
    public void method1791(int arg0) {
        this.field2574.method1791(arg0);
        for (class207 var2 = (class207) this.field2573.method3348(); var2 != null; var2 = (class207) this.field2573.method3350()) {
            if (!this.field2575.method3487(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2546) {
                        this.method3621(var2, var3);
                        var2.field2546 -= var3;
                        break;
                    }
                    this.method3621(var2, var2.field2546);
                    var3 -= var2.field2546;
                } while (!this.field2575.method3478(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hf.e(Lgn;[IIIIB)V")
    public void method3620(class207 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2575.field2526[arg0.field2529] & 0x4) != 0 && arg0.field2533 < 0) {
            int var6 = this.field2575.field2509[arg0.field2529] / Statics.field1618;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2547) / var6;
                if (var7 > arg3) {
                    arg0.field2547 += arg3 * var6;
                    break;
                }
                arg0.field2545.method1777(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2547 += var6 * var7 - 1048576;
                int var8 = Statics.field1618 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class119 var10 = arg0.field2545;
                if (this.field2575.field2511[arg0.field2529] == 0) {
                    arg0.field2545 = class119.method2046(arg0.field2536, var10.method2108(), var10.method2098(), var10.method2019());
                } else {
                    arg0.field2545 = class119.method2046(arg0.field2536, var10.method2108(), 0, var10.method2019());
                    this.field2575.method3459(arg0, arg0.field2528.field2564[arg0.field2531] < 0);
                    arg0.field2545.method1990(var8, var10.method2098());
                }
                if (arg0.field2528.field2564[arg0.field2531] < 0) {
                    arg0.field2545.method2105(-1);
                }
                var10.method1992(var8);
                var10.method1777(arg1, arg2, arg4 - arg2);
                if (var10.method1996()) {
                    this.field2574.method1769(var10);
                }
            }
        }
        arg0.field2545.method1777(arg1, arg2, arg3);
    }

    @ObfuscatedName("hf.n(Lgn;II)V")
    public void method3621(class207 arg0, int arg1) {
        if ((this.field2575.field2526[arg0.field2529] & 0x4) != 0 && arg0.field2533 < 0) {
            int var3 = this.field2575.field2509[arg0.field2529] / Statics.field1618;
            int var4 = (var3 + 1048575 - arg0.field2547) / var3;
            arg0.field2547 = arg0.field2547 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2575.field2511[arg0.field2529] == 0) {
                    arg0.field2545 = class119.method2046(arg0.field2536, arg0.field2545.method2108(), arg0.field2545.method2098(), arg0.field2545.method2019());
                } else {
                    arg0.field2545 = class119.method2046(arg0.field2536, arg0.field2545.method2108(), 0, arg0.field2545.method2019());
                    this.field2575.method3459(arg0, arg0.field2528.field2564[arg0.field2531] < 0);
                }
                if (arg0.field2528.field2564[arg0.field2531] < 0) {
                    arg0.field2545.method2105(-1);
                }
                arg1 = arg0.field2547 / var3;
            }
        }
        arg0.field2545.method1791(arg1);
    }
}
