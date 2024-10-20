package deob;

@ObfuscatedName("hs")
public class class212 extends class125 {

    @ObfuscatedName("hs.x")
    public class208 field2495;

    @ObfuscatedName("hs.m")
    public class272 field2493 = new class272();

    @ObfuscatedName("hs.k")
    public class108 field2494 = new class108();

    public class212(class208 arg0) {
        this.field2495 = arg0;
    }

    @ObfuscatedName("hs.v()Lds;")
    public class125 method2200() {
        class209 var1 = (class209) this.field2493.method4559();
        if (var1 == null) {
            return null;
        } else if (var1.field2464 == null) {
            return this.method2201();
        } else {
            return var1.field2464;
        }
    }

    @ObfuscatedName("hs.q()Lds;")
    public class125 method2201() {
        class209 var1;
        do {
            var1 = (class209) this.field2493.method4577();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2464 == null);
        return var1.field2464;
    }

    @ObfuscatedName("hs.z()I")
    public int method2202() {
        return 0;
    }

    @ObfuscatedName("hs.t([III)V")
    public void method2203(int[] arg0, int arg1, int arg2) {
        this.field2494.method2203(arg0, arg1, arg2);
        for (class209 var4 = (class209) this.field2493.method4559(); var4 != null; var4 = (class209) this.field2493.method4577()) {
            if (!this.field2495.method3490(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2454) {
                        this.method3638(var4, arg0, var5, var6, var5 + var6);
                        var4.field2454 -= var6;
                        break;
                    }
                    this.method3638(var4, arg0, var5, var4.field2454, var5 + var6);
                    var5 += var4.field2454;
                    var6 -= var4.field2454;
                } while (!this.field2495.method3537(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hs.s(I)V")
    public void method2205(int arg0) {
        this.field2494.method2205(arg0);
        for (class209 var2 = (class209) this.field2493.method4559(); var2 != null; var2 = (class209) this.field2493.method4577()) {
            if (!this.field2495.method3490(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2454) {
                        this.method3637(var2, var3);
                        var2.field2454 -= var3;
                        break;
                    }
                    this.method3637(var2, var2.field2454);
                    var3 -= var2.field2454;
                } while (!this.field2495.method3537(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hs.x(Lhz;[IIIIB)V")
    public void method3638(class209 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2495.field2429[arg0.field2453] & 0x4) != 0 && arg0.field2460 < 0) {
            int var6 = this.field2495.field2434[arg0.field2453] / Statics.field1422;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2463) / var6;
                if (var7 > arg3) {
                    arg0.field2463 += arg3 * var6;
                    break;
                }
                arg0.field2464.method2203(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2463 += var6 * var7 - 1048576;
                int var8 = Statics.field1422 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class123 var10 = arg0.field2464;
                if (this.field2495.field2432[arg0.field2453] == 0) {
                    arg0.field2464 = class123.method2450(arg0.field2448, var10.method2440(), var10.method2432(), var10.method2433());
                } else {
                    arg0.field2464 = class123.method2450(arg0.field2448, var10.method2440(), 0, var10.method2433());
                    this.field2495.method3505(arg0, arg0.field2447.field2486[arg0.field2465] < 0);
                    arg0.field2464.method2436(var8, var10.method2432());
                }
                if (arg0.field2447.field2486[arg0.field2465] < 0) {
                    arg0.field2464.method2454(-1);
                }
                var10.method2463(var8);
                var10.method2203(arg1, arg2, arg4 - arg2);
                if (var10.method2442()) {
                    this.field2494.method2195(var10);
                }
            }
        }
        arg0.field2464.method2203(arg1, arg2, arg3);
    }

    @ObfuscatedName("hs.m(Lhz;II)V")
    public void method3637(class209 arg0, int arg1) {
        if ((this.field2495.field2429[arg0.field2453] & 0x4) != 0 && arg0.field2460 < 0) {
            int var3 = this.field2495.field2434[arg0.field2453] / Statics.field1422;
            int var4 = (var3 + 1048575 - arg0.field2463) / var3;
            arg0.field2463 = arg0.field2463 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2495.field2432[arg0.field2453] == 0) {
                    arg0.field2464 = class123.method2450(arg0.field2448, arg0.field2464.method2440(), arg0.field2464.method2432(), arg0.field2464.method2433());
                } else {
                    arg0.field2464 = class123.method2450(arg0.field2448, arg0.field2464.method2440(), 0, arg0.field2464.method2433());
                    this.field2495.method3505(arg0, arg0.field2447.field2486[arg0.field2465] < 0);
                }
                if (arg0.field2447.field2486[arg0.field2465] < 0) {
                    arg0.field2464.method2454(-1);
                }
                arg1 = arg0.field2463 / var3;
            }
        }
        arg0.field2464.method2205(arg1);
    }
}
