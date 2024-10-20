package deob;

@ObfuscatedName("hz")
public class class223 extends class106 {

    @ObfuscatedName("hz.z")
    public class219 field2546;

    @ObfuscatedName("hz.s")
    public class206 field2544 = new class206();

    @ObfuscatedName("hz.l")
    public class89 field2545 = new class89();

    public class223(class219 arg0) {
        this.field2546 = arg0;
    }

    @ObfuscatedName("hz.q()Ldo;")
    public class106 method1880() {
        class220 var1 = (class220) this.field2544.method3790();
        if (var1 == null) {
            return null;
        } else if (var1.field2513 == null) {
            return this.method1881();
        } else {
            return var1.field2513;
        }
    }

    @ObfuscatedName("hz.i()Ldo;")
    public class106 method1881() {
        class220 var1;
        do {
            var1 = (class220) this.field2544.method3771();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2513 == null);
        return var1.field2513;
    }

    @ObfuscatedName("hz.x()I")
    public int method1903() {
        return 0;
    }

    @ObfuscatedName("hz.e([III)V")
    public void method1883(int[] arg0, int arg1, int arg2) {
        this.field2545.method1883(arg0, arg1, arg2);
        for (class220 var4 = (class220) this.field2544.method3790(); var4 != null; var4 = (class220) this.field2544.method3771()) {
            if (!this.field2546.method3898(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2514) {
                        this.method4037(var4, arg0, var5, var6, var5 + var6);
                        var4.field2514 -= var6;
                        break;
                    }
                    this.method4037(var4, arg0, var5, var4.field2514, var5 + var6);
                    var5 += var4.field2514;
                    var6 -= var4.field2514;
                } while (!this.field2546.method3899(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hz.b(I)V")
    public void method1885(int arg0) {
        this.field2545.method1885(arg0);
        for (class220 var2 = (class220) this.field2544.method3790(); var2 != null; var2 = (class220) this.field2544.method3771()) {
            if (!this.field2546.method3898(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2514) {
                        this.method4038(var2, var3);
                        var2.field2514 -= var3;
                        break;
                    }
                    this.method4038(var2, var2.field2514);
                    var3 -= var2.field2514;
                } while (!this.field2546.method3899(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hz.z(Lhn;[IIIIB)V")
    public void method4037(class220 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2546.field2479[arg0.field2501] & 0x4) != 0 && arg0.field2509 < 0) {
            int var6 = this.field2546.field2484[arg0.field2501] / Statics.field1301;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2515) / var6;
                if (var7 > arg3) {
                    arg0.field2515 += arg3 * var6;
                    break;
                }
                arg0.field2513.method1883(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2515 += var6 * var7 - 1048576;
                int var8 = Statics.field1301 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class104 var10 = arg0.field2513;
                if (this.field2546.field2472[arg0.field2501] == 0) {
                    arg0.field2513 = class104.method2097(arg0.field2497, var10.method2177(), var10.method2103(), var10.method2104());
                } else {
                    arg0.field2513 = class104.method2097(arg0.field2497, var10.method2177(), 0, var10.method2104());
                    this.field2546.method3883(arg0, arg0.field2518.field2535[arg0.field2503] < 0);
                    arg0.field2513.method2232(var8, var10.method2103());
                }
                if (arg0.field2518.field2535[arg0.field2503] < 0) {
                    arg0.field2513.method2099(-1);
                }
                var10.method2110(var8);
                var10.method1883(arg1, arg2, arg4 - arg2);
                if (var10.method2114()) {
                    this.field2545.method1899(var10);
                }
            }
        }
        arg0.field2513.method1883(arg1, arg2, arg3);
    }

    @ObfuscatedName("hz.w(Lhn;II)V")
    public void method4038(class220 arg0, int arg1) {
        if ((this.field2546.field2479[arg0.field2501] & 0x4) != 0 && arg0.field2509 < 0) {
            int var3 = this.field2546.field2484[arg0.field2501] / Statics.field1301;
            int var4 = (var3 + 1048575 - arg0.field2515) / var3;
            arg0.field2515 = arg0.field2515 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2546.field2472[arg0.field2501] == 0) {
                    arg0.field2513 = class104.method2097(arg0.field2497, arg0.field2513.method2177(), arg0.field2513.method2103(), arg0.field2513.method2104());
                } else {
                    arg0.field2513 = class104.method2097(arg0.field2497, arg0.field2513.method2177(), 0, arg0.field2513.method2104());
                    this.field2546.method3883(arg0, arg0.field2518.field2535[arg0.field2503] < 0);
                }
                if (arg0.field2518.field2535[arg0.field2503] < 0) {
                    arg0.field2513.method2099(-1);
                }
                arg1 = arg0.field2515 / var3;
            }
        }
        arg0.field2513.method1885(arg1);
    }
}
