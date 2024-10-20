package deob;

@ObfuscatedName("hm")
public class class209 extends class120 {

    @ObfuscatedName("hm.a")
    public class205 field2595;

    @ObfuscatedName("hm.j")
    public class194 field2591 = new class194();

    @ObfuscatedName("hm.n")
    public class103 field2592 = new class103();

    public class209(class205 arg0) {
        this.field2595 = arg0;
    }

    @ObfuscatedName("hm.e()Ldf;")
    public class120 method1698() {
        class206 var1 = (class206) this.field2591.method3318();
        if (var1 == null) {
            return null;
        } else if (var1.field2558 == null) {
            return this.method1719();
        } else {
            return var1.field2558;
        }
    }

    @ObfuscatedName("hm.l()Ldf;")
    public class120 method1719() {
        class206 var1;
        do {
            var1 = (class206) this.field2591.method3338();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2558 == null);
        return var1.field2558;
    }

    @ObfuscatedName("hm.s()I")
    public int method1700() {
        return 0;
    }

    @ObfuscatedName("hm.w([III)V")
    public void method1721(int[] arg0, int arg1, int arg2) {
        this.field2592.method1721(arg0, arg1, arg2);
        for (class206 var4 = (class206) this.field2591.method3318(); var4 != null; var4 = (class206) this.field2591.method3338()) {
            if (!this.field2595.method3448(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2561) {
                        this.method3577(var4, arg0, var5, var6, var5 + var6);
                        var4.field2561 -= var6;
                        break;
                    }
                    this.method3577(var4, arg0, var5, var4.field2561, var5 + var6);
                    var5 += var4.field2561;
                    var6 -= var4.field2561;
                } while (!this.field2595.method3488(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hm.m(I)V")
    public void method1703(int arg0) {
        this.field2592.method1703(arg0);
        for (class206 var2 = (class206) this.field2591.method3318(); var2 != null; var2 = (class206) this.field2591.method3338()) {
            if (!this.field2595.method3448(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2561) {
                        this.method3580(var2, var3);
                        var2.field2561 -= var3;
                        break;
                    }
                    this.method3580(var2, var2.field2561);
                    var3 -= var2.field2561;
                } while (!this.field2595.method3488(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hm.a(Lgq;[IIIIB)V")
    public void method3577(class206 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2595.field2527[arg0.field2546] & 0x4) != 0 && arg0.field2552 < 0) {
            int var6 = this.field2595.field2532[arg0.field2546] / Statics.field1552;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2562) / var6;
                if (var7 > arg3) {
                    arg0.field2562 += arg3 * var6;
                    break;
                }
                arg0.field2558.method1721(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2562 += var6 * var7 - 1048576;
                int var8 = Statics.field1552 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class118 var10 = arg0.field2558;
                if (this.field2595.field2517[arg0.field2546] == 0) {
                    arg0.field2558 = class118.method1980(arg0.field2544, var10.method1942(), var10.method1930(), var10.method1947());
                } else {
                    arg0.field2558 = class118.method1980(arg0.field2544, var10.method1942(), 0, var10.method1947());
                    this.field2595.method3431(arg0, arg0.field2543.field2581[arg0.field2547] < 0);
                    arg0.field2558.method1924(var8, var10.method1930());
                }
                if (arg0.field2543.field2581[arg0.field2547] < 0) {
                    arg0.field2558.method2011(-1);
                }
                var10.method1937(var8);
                var10.method1721(arg1, arg2, arg4 - arg2);
                if (var10.method1941()) {
                    this.field2592.method1720(var10);
                }
            }
        }
        arg0.field2558.method1721(arg1, arg2, arg3);
    }

    @ObfuscatedName("hm.j(Lgq;II)V")
    public void method3580(class206 arg0, int arg1) {
        if ((this.field2595.field2527[arg0.field2546] & 0x4) != 0 && arg0.field2552 < 0) {
            int var3 = this.field2595.field2532[arg0.field2546] / Statics.field1552;
            int var4 = (var3 + 1048575 - arg0.field2562) / var3;
            arg0.field2562 = arg0.field2562 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2595.field2517[arg0.field2546] == 0) {
                    arg0.field2558 = class118.method1980(arg0.field2544, arg0.field2558.method1942(), arg0.field2558.method1930(), arg0.field2558.method1947());
                } else {
                    arg0.field2558 = class118.method1980(arg0.field2544, arg0.field2558.method1942(), 0, arg0.field2558.method1947());
                    this.field2595.method3431(arg0, arg0.field2543.field2581[arg0.field2547] < 0);
                }
                if (arg0.field2543.field2581[arg0.field2547] < 0) {
                    arg0.field2558.method2011(-1);
                }
                arg1 = arg0.field2562 / var3;
            }
        }
        arg0.field2558.method1703(arg1);
    }
}
