package deob;

@ObfuscatedName("iu")
public class class235 extends class118 {

    @ObfuscatedName("iu.d")
    public class231 field2771;

    @ObfuscatedName("iu.z")
    public class218 field2772 = new class218();

    @ObfuscatedName("iu.n")
    public class101 field2773 = new class101();

    public class235(class231 arg0) {
        this.field2771 = arg0;
    }

    @ObfuscatedName("iu.y()Ldt;")
    public class118 method1947() {
        class232 var1 = (class232) this.field2772.method3798();
        if (var1 == null) {
            return null;
        } else if (var1.field2743 == null) {
            return this.method1960();
        } else {
            return var1.field2743;
        }
    }

    @ObfuscatedName("iu.k()Ldt;")
    public class118 method1960() {
        class232 var1;
        do {
            var1 = (class232) this.field2772.method3800();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2743 == null);
        return var1.field2743;
    }

    @ObfuscatedName("iu.s()I")
    public int method1973() {
        return 0;
    }

    @ObfuscatedName("iu.x([III)V")
    public void method1949(int[] arg0, int arg1, int arg2) {
        this.field2773.method1949(arg0, arg1, arg2);
        for (class232 var4 = (class232) this.field2772.method3798(); var4 != null; var4 = (class232) this.field2772.method3800()) {
            if (!this.field2771.method3975(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2744) {
                        this.method4074(var4, arg0, var5, var6, var5 + var6);
                        var4.field2744 -= var6;
                        break;
                    }
                    this.method4074(var4, arg0, var5, var4.field2744, var5 + var6);
                    var5 += var4.field2744;
                    var6 -= var4.field2744;
                } while (!this.field2771.method3967(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("iu.t(I)V")
    public void method1952(int arg0) {
        this.field2773.method1952(arg0);
        for (class232 var2 = (class232) this.field2772.method3798(); var2 != null; var2 = (class232) this.field2772.method3800()) {
            if (!this.field2771.method3975(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2744) {
                        this.method4070(var2, var3);
                        var2.field2744 -= var3;
                        break;
                    }
                    this.method4070(var2, var2.field2744);
                    var3 -= var2.field2744;
                } while (!this.field2771.method3967(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("iu.d(Lhk;[IIIII)V")
    public void method4074(class232 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2771.field2710[arg0.field2735] & 0x4) != 0 && arg0.field2739 < 0) {
            int var6 = this.field2771.field2715[arg0.field2735] / Statics.field646;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2745) / var6;
                if (var7 > arg3) {
                    arg0.field2745 += arg3 * var6;
                    break;
                }
                arg0.field2743.method1949(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2745 += var6 * var7 - 1048576;
                int var8 = Statics.field646 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class116 var10 = arg0.field2743;
                if (this.field2771.field2705[arg0.field2735] == 0) {
                    arg0.field2743 = class116.method2256(arg0.field2726, var10.method2281(), var10.method2180(), var10.method2237());
                } else {
                    arg0.field2743 = class116.method2256(arg0.field2726, var10.method2281(), 0, var10.method2237());
                    this.field2771.method3933(arg0, arg0.field2734.field2762[arg0.field2730] < 0);
                    arg0.field2743.method2184(var8, var10.method2180());
                }
                if (arg0.field2734.field2762[arg0.field2730] < 0) {
                    arg0.field2743.method2176(-1);
                }
                var10.method2214(var8);
                var10.method1949(arg1, arg2, arg4 - arg2);
                if (var10.method2190()) {
                    this.field2773.method1942(var10);
                }
            }
        }
        arg0.field2743.method1949(arg1, arg2, arg3);
    }

    @ObfuscatedName("iu.z(Lhk;II)V")
    public void method4070(class232 arg0, int arg1) {
        if ((this.field2771.field2710[arg0.field2735] & 0x4) != 0 && arg0.field2739 < 0) {
            int var3 = this.field2771.field2715[arg0.field2735] / Statics.field646;
            int var4 = (var3 + 1048575 - arg0.field2745) / var3;
            arg0.field2745 = arg0.field2745 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2771.field2705[arg0.field2735] == 0) {
                    arg0.field2743 = class116.method2256(arg0.field2726, arg0.field2743.method2281(), arg0.field2743.method2180(), arg0.field2743.method2237());
                } else {
                    arg0.field2743 = class116.method2256(arg0.field2726, arg0.field2743.method2281(), 0, arg0.field2743.method2237());
                    this.field2771.method3933(arg0, arg0.field2734.field2762[arg0.field2730] < 0);
                }
                if (arg0.field2734.field2762[arg0.field2730] < 0) {
                    arg0.field2743.method2176(-1);
                }
                arg1 = arg0.field2745 / var3;
            }
        }
        arg0.field2743.method1952(arg1);
    }
}
