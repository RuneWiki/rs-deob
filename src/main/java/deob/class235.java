package deob;

@ObfuscatedName("ie")
public class class235 extends class118 {

    @ObfuscatedName("ie.t")
    public class231 field2760;

    @ObfuscatedName("ie.q")
    public class218 field2758 = new class218();

    @ObfuscatedName("ie.i")
    public class101 field2757 = new class101();

    public class235(class231 arg0) {
        this.field2760 = arg0;
    }

    @ObfuscatedName("ie.b()Ldo;")
    public class118 method1934() {
        class232 var1 = (class232) this.field2758.method3731();
        if (var1 == null) {
            return null;
        } else if (var1.field2724 == null) {
            return this.method1935();
        } else {
            return var1.field2724;
        }
    }

    @ObfuscatedName("ie.e()Ldo;")
    public class118 method1935() {
        class232 var1;
        do {
            var1 = (class232) this.field2758.method3733();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2724 == null);
        return var1.field2724;
    }

    @ObfuscatedName("ie.x()I")
    public int method1961() {
        return 0;
    }

    @ObfuscatedName("ie.p([III)V")
    public void method1937(int[] arg0, int arg1, int arg2) {
        this.field2757.method1937(arg0, arg1, arg2);
        for (class232 var4 = (class232) this.field2758.method3731(); var4 != null; var4 = (class232) this.field2758.method3733()) {
            if (!this.field2760.method3870(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2726) {
                        this.method4013(var4, arg0, var5, var6, var5 + var6);
                        var4.field2726 -= var6;
                        break;
                    }
                    this.method4013(var4, arg0, var5, var4.field2726, var5 + var6);
                    var5 += var4.field2726;
                    var6 -= var4.field2726;
                } while (!this.field2760.method3871(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ie.c(I)V")
    public void method1928(int arg0) {
        this.field2757.method1928(arg0);
        for (class232 var2 = (class232) this.field2758.method3731(); var2 != null; var2 = (class232) this.field2758.method3733()) {
            if (!this.field2760.method3870(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2726) {
                        this.method4014(var2, var3);
                        var2.field2726 -= var3;
                        break;
                    }
                    this.method4014(var2, var2.field2726);
                    var3 -= var2.field2726;
                } while (!this.field2760.method3871(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ie.t(Lhb;[IIIII)V")
    public void method4013(class232 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2760.field2694[arg0.field2727] & 0x4) != 0 && arg0.field2712 < 0) {
            int var6 = this.field2760.field2699[arg0.field2727] / Statics.field1558;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2732) / var6;
                if (var7 > arg3) {
                    arg0.field2732 += arg3 * var6;
                    break;
                }
                arg0.field2724.method1937(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2732 += var6 * var7 - 1048576;
                int var8 = Statics.field1558 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class116 var10 = arg0.field2724;
                if (this.field2760.field2690[arg0.field2727] == 0) {
                    arg0.field2724 = class116.method2133(arg0.field2714, var10.method2148(), var10.method2139(), var10.method2140());
                } else {
                    arg0.field2724 = class116.method2133(arg0.field2714, var10.method2148(), 0, var10.method2140());
                    this.field2760.method3918(arg0, arg0.field2728.field2749[arg0.field2717] < 0);
                    arg0.field2724.method2144(var8, var10.method2139());
                }
                if (arg0.field2728.field2749[arg0.field2717] < 0) {
                    arg0.field2724.method2186(-1);
                }
                var10.method2146(var8);
                var10.method1937(arg1, arg2, arg4 - arg2);
                if (var10.method2150()) {
                    this.field2757.method1929(var10);
                }
            }
        }
        arg0.field2724.method1937(arg1, arg2, arg3);
    }

    @ObfuscatedName("ie.q(Lhb;II)V")
    public void method4014(class232 arg0, int arg1) {
        if ((this.field2760.field2694[arg0.field2727] & 0x4) != 0 && arg0.field2712 < 0) {
            int var3 = this.field2760.field2699[arg0.field2727] / Statics.field1558;
            int var4 = (var3 + 1048575 - arg0.field2732) / var3;
            arg0.field2732 = arg0.field2732 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2760.field2690[arg0.field2727] == 0) {
                    arg0.field2724 = class116.method2133(arg0.field2714, arg0.field2724.method2148(), arg0.field2724.method2139(), arg0.field2724.method2140());
                } else {
                    arg0.field2724 = class116.method2133(arg0.field2714, arg0.field2724.method2148(), 0, arg0.field2724.method2140());
                    this.field2760.method3918(arg0, arg0.field2728.field2749[arg0.field2717] < 0);
                }
                if (arg0.field2728.field2749[arg0.field2717] < 0) {
                    arg0.field2724.method2186(-1);
                }
                arg1 = arg0.field2732 / var3;
            }
        }
        arg0.field2724.method1928(arg1);
    }
}
