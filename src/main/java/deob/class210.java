package deob;

@ObfuscatedName("ht")
public class class210 extends class121 {

    @ObfuscatedName("ht.j")
    public class206 field2591;

    @ObfuscatedName("ht.h")
    public class195 field2592 = new class195();

    @ObfuscatedName("ht.f")
    public class104 field2590 = new class104();

    public class210(class206 arg0) {
        this.field2591 = arg0;
    }

    @ObfuscatedName("ht.g()Lda;")
    public class121 method1742() {
        class207 var1 = (class207) this.field2592.method3326();
        if (var1 == null) {
            return null;
        } else if (var1.field2558 == null) {
            return this.method1743();
        } else {
            return var1.field2558;
        }
    }

    @ObfuscatedName("ht.c()Lda;")
    public class121 method1743() {
        class207 var1;
        do {
            var1 = (class207) this.field2592.method3323();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2558 == null);
        return var1.field2558;
    }

    @ObfuscatedName("ht.l()I")
    public int method1744() {
        return 0;
    }

    @ObfuscatedName("ht.w([III)V")
    public void method1745(int[] arg0, int arg1, int arg2) {
        this.field2590.method1745(arg0, arg1, arg2);
        for (class207 var4 = (class207) this.field2592.method3326(); var4 != null; var4 = (class207) this.field2592.method3323()) {
            if (!this.field2591.method3411(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2559) {
                        this.method3588(var4, arg0, var5, var6, var5 + var6);
                        var4.field2559 -= var6;
                        break;
                    }
                    this.method3588(var4, arg0, var5, var4.field2559, var5 + var6);
                    var5 += var4.field2559;
                    var6 -= var4.field2559;
                } while (!this.field2591.method3506(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ht.o(I)V")
    public void method1747(int arg0) {
        this.field2590.method1747(arg0);
        for (class207 var2 = (class207) this.field2592.method3326(); var2 != null; var2 = (class207) this.field2592.method3323()) {
            if (!this.field2591.method3411(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2559) {
                        this.method3586(var2, var3);
                        var2.field2559 -= var3;
                        break;
                    }
                    this.method3586(var2, var2.field2559);
                    var3 -= var2.field2559;
                } while (!this.field2591.method3506(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ht.j(Lgm;[IIIII)V")
    public void method3588(class207 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2591.field2524[arg0.field2545] & 0x4) != 0 && arg0.field2554 < 0) {
            int var6 = this.field2591.field2517[arg0.field2545] / Statics.field1652;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2561) / var6;
                if (var7 > arg3) {
                    arg0.field2561 += arg3 * var6;
                    break;
                }
                arg0.field2558.method1745(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2561 += var6 * var7 - 1048576;
                int var8 = Statics.field1652 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class119 var10 = arg0.field2558;
                if (this.field2591.field2527[arg0.field2545] == 0) {
                    arg0.field2558 = class119.method2063(arg0.field2543, var10.method1977(), var10.method1968(), var10.method1997());
                } else {
                    arg0.field2558 = class119.method2063(arg0.field2543, var10.method1977(), 0, var10.method1997());
                    this.field2591.method3426(arg0, arg0.field2541.field2580[arg0.field2560] < 0);
                    arg0.field2558.method1973(var8, var10.method1968());
                }
                if (arg0.field2541.field2580[arg0.field2560] < 0) {
                    arg0.field2558.method1998(-1);
                }
                var10.method2003(var8);
                var10.method1745(arg1, arg2, arg4 - arg2);
                if (var10.method2007()) {
                    this.field2590.method1737(var10);
                }
            }
        }
        arg0.field2558.method1745(arg1, arg2, arg3);
    }

    @ObfuscatedName("ht.h(Lgm;II)V")
    public void method3586(class207 arg0, int arg1) {
        if ((this.field2591.field2524[arg0.field2545] & 0x4) != 0 && arg0.field2554 < 0) {
            int var3 = this.field2591.field2517[arg0.field2545] / Statics.field1652;
            int var4 = (var3 + 1048575 - arg0.field2561) / var3;
            arg0.field2561 = arg0.field2561 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2591.field2527[arg0.field2545] == 0) {
                    arg0.field2558 = class119.method2063(arg0.field2543, arg0.field2558.method1977(), arg0.field2558.method1968(), arg0.field2558.method1997());
                } else {
                    arg0.field2558 = class119.method2063(arg0.field2543, arg0.field2558.method1977(), 0, arg0.field2558.method1997());
                    this.field2591.method3426(arg0, arg0.field2541.field2580[arg0.field2560] < 0);
                }
                if (arg0.field2541.field2580[arg0.field2560] < 0) {
                    arg0.field2558.method1998(-1);
                }
                arg1 = arg0.field2561 / var3;
            }
        }
        arg0.field2558.method1747(arg1);
    }
}
