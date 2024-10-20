package deob;

@ObfuscatedName("iw")
public class class235 extends class118 {

    @ObfuscatedName("iw.o")
    public class231 field2765;

    @ObfuscatedName("iw.k")
    public class218 field2766 = new class218();

    @ObfuscatedName("iw.t")
    public class101 field2767 = new class101();

    public class235(class231 arg0) {
        this.field2765 = arg0;
    }

    @ObfuscatedName("iw.m()Ldd;")
    public class118 method1894() {
        class232 var1 = (class232) this.field2766.method3707();
        if (var1 == null) {
            return null;
        } else if (var1.field2740 == null) {
            return this.method1913();
        } else {
            return var1.field2740;
        }
    }

    @ObfuscatedName("iw.z()Ldd;")
    public class118 method1913() {
        class232 var1;
        do {
            var1 = (class232) this.field2766.method3697();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2740 == null);
        return var1.field2740;
    }

    @ObfuscatedName("iw.i()I")
    public int method1927() {
        return 0;
    }

    @ObfuscatedName("iw.u([III)V")
    public void method1897(int[] arg0, int arg1, int arg2) {
        this.field2767.method1897(arg0, arg1, arg2);
        for (class232 var4 = (class232) this.field2766.method3707(); var4 != null; var4 = (class232) this.field2766.method3697()) {
            if (!this.field2765.method3829(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2724) {
                        this.method3970(var4, arg0, var5, var6, var5 + var6);
                        var4.field2724 -= var6;
                        break;
                    }
                    this.method3970(var4, arg0, var5, var4.field2724, var5 + var6);
                    var5 += var4.field2724;
                    var6 -= var4.field2724;
                } while (!this.field2765.method3812(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("iw.y(I)V")
    public void method1899(int arg0) {
        this.field2767.method1899(arg0);
        for (class232 var2 = (class232) this.field2766.method3707(); var2 != null; var2 = (class232) this.field2766.method3697()) {
            if (!this.field2765.method3829(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2724) {
                        this.method3967(var2, var3);
                        var2.field2724 -= var3;
                        break;
                    }
                    this.method3967(var2, var2.field2724);
                    var3 -= var2.field2724;
                } while (!this.field2765.method3812(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("iw.o(Lhn;[IIIII)V")
    public void method3970(class232 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2765.field2717[arg0.field2735] & 0x4) != 0 && arg0.field2741 < 0) {
            int var6 = this.field2765.field2712[arg0.field2735] / Statics.field1582;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2742) / var6;
                if (var7 > arg3) {
                    arg0.field2742 += arg3 * var6;
                    break;
                }
                arg0.field2740.method1897(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2742 += var6 * var7 - 1048576;
                int var8 = Statics.field1582 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class116 var10 = arg0.field2740;
                if (this.field2765.field2710[arg0.field2735] == 0) {
                    arg0.field2740 = class116.method2123(arg0.field2730, var10.method2172(), var10.method2187(), var10.method2141());
                } else {
                    arg0.field2740 = class116.method2123(arg0.field2730, var10.method2172(), 0, var10.method2141());
                    this.field2765.method3811(arg0, arg0.field2723.field2760[arg0.field2727] < 0);
                    arg0.field2740.method2156(var8, var10.method2187());
                }
                if (arg0.field2723.field2760[arg0.field2727] < 0) {
                    arg0.field2740.method2125(-1);
                }
                var10.method2165(var8);
                var10.method1897(arg1, arg2, arg4 - arg2);
                if (var10.method2140()) {
                    this.field2767.method1889(var10);
                }
            }
        }
        arg0.field2740.method1897(arg1, arg2, arg3);
    }

    @ObfuscatedName("iw.k(Lhn;II)V")
    public void method3967(class232 arg0, int arg1) {
        if ((this.field2765.field2717[arg0.field2735] & 0x4) != 0 && arg0.field2741 < 0) {
            int var3 = this.field2765.field2712[arg0.field2735] / Statics.field1582;
            int var4 = (var3 + 1048575 - arg0.field2742) / var3;
            arg0.field2742 = arg0.field2742 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2765.field2710[arg0.field2735] == 0) {
                    arg0.field2740 = class116.method2123(arg0.field2730, arg0.field2740.method2172(), arg0.field2740.method2187(), arg0.field2740.method2141());
                } else {
                    arg0.field2740 = class116.method2123(arg0.field2730, arg0.field2740.method2172(), 0, arg0.field2740.method2141());
                    this.field2765.method3811(arg0, arg0.field2723.field2760[arg0.field2727] < 0);
                }
                if (arg0.field2723.field2760[arg0.field2727] < 0) {
                    arg0.field2740.method2125(-1);
                }
                arg1 = arg0.field2742 / var3;
            }
        }
        arg0.field2740.method1899(arg1);
    }
}
