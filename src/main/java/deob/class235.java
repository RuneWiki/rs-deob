package deob;

@ObfuscatedName("ie")
public class class235 extends class118 {

    @ObfuscatedName("ie.g")
    public class231 field2776;

    @ObfuscatedName("ie.e")
    public class218 field2775 = new class218();

    @ObfuscatedName("ie.b")
    public class101 field2777 = new class101();

    public class235(class231 arg0) {
        this.field2776 = arg0;
    }

    @ObfuscatedName("ie.l()Ldh;")
    public class118 method2035() {
        class232 var1 = (class232) this.field2775.method3809();
        if (var1 == null) {
            return null;
        } else if (var1.field2748 == null) {
            return this.method2032();
        } else {
            return var1.field2748;
        }
    }

    @ObfuscatedName("ie.s()Ldh;")
    public class118 method2032() {
        class232 var1;
        do {
            var1 = (class232) this.field2775.method3832();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2748 == null);
        return var1.field2748;
    }

    @ObfuscatedName("ie.y()I")
    public int method2061() {
        return 0;
    }

    @ObfuscatedName("ie.c([III)V")
    public void method2038(int[] arg0, int arg1, int arg2) {
        this.field2777.method2038(arg0, arg1, arg2);
        for (class232 var4 = (class232) this.field2775.method3809(); var4 != null; var4 = (class232) this.field2775.method3832()) {
            if (!this.field2776.method3948(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2749) {
                        this.method4089(var4, arg0, var5, var6, var5 + var6);
                        var4.field2749 -= var6;
                        break;
                    }
                    this.method4089(var4, arg0, var5, var4.field2749, var5 + var6);
                    var5 += var4.field2749;
                    var6 -= var4.field2749;
                } while (!this.field2776.method3997(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ie.d(I)V")
    public void method2040(int arg0) {
        this.field2777.method2040(arg0);
        for (class232 var2 = (class232) this.field2775.method3809(); var2 != null; var2 = (class232) this.field2775.method3832()) {
            if (!this.field2776.method3948(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2749) {
                        this.method4090(var2, var3);
                        var2.field2749 -= var3;
                        break;
                    }
                    this.method4090(var2, var2.field2749);
                    var3 -= var2.field2749;
                } while (!this.field2776.method3997(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ie.g(Lha;[IIIII)V")
    public void method4089(class232 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2776.field2712[arg0.field2736] & 0x4) != 0 && arg0.field2742 < 0) {
            int var6 = this.field2776.field2709[arg0.field2736] / Statics.field1550;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2744) / var6;
                if (var7 > arg3) {
                    arg0.field2744 += arg3 * var6;
                    break;
                }
                arg0.field2748.method2038(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2744 += var6 * var7 - 1048576;
                int var8 = Statics.field1550 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class116 var10 = arg0.field2748;
                if (this.field2776.field2717[arg0.field2736] == 0) {
                    arg0.field2748 = class116.method2300(arg0.field2732, var10.method2254(), var10.method2245(), var10.method2246());
                } else {
                    arg0.field2748 = class116.method2300(arg0.field2732, var10.method2254(), 0, var10.method2246());
                    this.field2776.method3959(arg0, arg0.field2731.field2772[arg0.field2735] < 0);
                    arg0.field2748.method2250(var8, var10.method2245());
                }
                if (arg0.field2731.field2772[arg0.field2735] < 0) {
                    arg0.field2748.method2241(-1);
                }
                var10.method2252(var8);
                var10.method2038(arg1, arg2, arg4 - arg2);
                if (var10.method2261()) {
                    this.field2777.method2030(var10);
                }
            }
        }
        arg0.field2748.method2038(arg1, arg2, arg3);
    }

    @ObfuscatedName("ie.e(Lha;IS)V")
    public void method4090(class232 arg0, int arg1) {
        if ((this.field2776.field2712[arg0.field2736] & 0x4) != 0 && arg0.field2742 < 0) {
            int var3 = this.field2776.field2709[arg0.field2736] / Statics.field1550;
            int var4 = (var3 + 1048575 - arg0.field2744) / var3;
            arg0.field2744 = arg0.field2744 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2776.field2717[arg0.field2736] == 0) {
                    arg0.field2748 = class116.method2300(arg0.field2732, arg0.field2748.method2254(), arg0.field2748.method2245(), arg0.field2748.method2246());
                } else {
                    arg0.field2748 = class116.method2300(arg0.field2732, arg0.field2748.method2254(), 0, arg0.field2748.method2246());
                    this.field2776.method3959(arg0, arg0.field2731.field2772[arg0.field2735] < 0);
                }
                if (arg0.field2731.field2772[arg0.field2735] < 0) {
                    arg0.field2748.method2241(-1);
                }
                arg1 = arg0.field2744 / var3;
            }
        }
        arg0.field2748.method2040(arg1);
    }
}
