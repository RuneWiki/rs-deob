package deob;

@ObfuscatedName("ik")
public class class235 extends class118 {

    @ObfuscatedName("ik.c")
    public class231 field2760;

    @ObfuscatedName("ik.i")
    public class218 field2758 = new class218();

    @ObfuscatedName("ik.o")
    public class101 field2761 = new class101();

    public class235(class231 arg0) {
        this.field2760 = arg0;
    }

    @ObfuscatedName("ik.x()Ldd;")
    public class118 method1915() {
        class232 var1 = (class232) this.field2758.method3723();
        if (var1 == null) {
            return null;
        } else if (var1.field2733 == null) {
            return this.method1913();
        } else {
            return var1.field2733;
        }
    }

    @ObfuscatedName("ik.z()Ldd;")
    public class118 method1913() {
        class232 var1;
        do {
            var1 = (class232) this.field2758.method3722();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2733 == null);
        return var1.field2733;
    }

    @ObfuscatedName("ik.p()I")
    public int method1914() {
        return 0;
    }

    @ObfuscatedName("ik.w([III)V")
    public void method1920(int[] arg0, int arg1, int arg2) {
        this.field2761.method1920(arg0, arg1, arg2);
        for (class232 var4 = (class232) this.field2758.method3723(); var4 != null; var4 = (class232) this.field2758.method3722()) {
            if (!this.field2760.method3858(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2715) {
                        this.method4005(var4, arg0, var5, var6, var5 + var6);
                        var4.field2715 -= var6;
                        break;
                    }
                    this.method4005(var4, arg0, var5, var4.field2715, var5 + var6);
                    var5 += var4.field2715;
                    var6 -= var4.field2715;
                } while (!this.field2760.method3871(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ik.d(I)V")
    public void method1940(int arg0) {
        this.field2761.method1940(arg0);
        for (class232 var2 = (class232) this.field2758.method3723(); var2 != null; var2 = (class232) this.field2758.method3722()) {
            if (!this.field2760.method3858(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2715) {
                        this.method4006(var2, var3);
                        var2.field2715 -= var3;
                        break;
                    }
                    this.method4006(var2, var2.field2715);
                    var3 -= var2.field2715;
                } while (!this.field2760.method3871(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ik.c(Lhu;[IIIIB)V")
    public void method4005(class232 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2760.field2699[arg0.field2726] & 0x4) != 0 && arg0.field2729 < 0) {
            int var6 = this.field2760.field2704[arg0.field2726] / Statics.field3928;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2735) / var6;
                if (var7 > arg3) {
                    arg0.field2735 += arg3 * var6;
                    break;
                }
                arg0.field2733.method1920(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2735 += var6 * var7 - 1048576;
                int var8 = Statics.field3928 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class116 var10 = arg0.field2733;
                if (this.field2760.field2702[arg0.field2726] == 0) {
                    arg0.field2733 = class116.method2254(arg0.field2717, var10.method2120(), var10.method2131(), var10.method2245());
                } else {
                    arg0.field2733 = class116.method2254(arg0.field2717, var10.method2120(), 0, var10.method2245());
                    this.field2760.method3890(arg0, arg0.field2716.field2753[arg0.field2720] < 0);
                    arg0.field2733.method2136(var8, var10.method2131());
                }
                if (arg0.field2716.field2753[arg0.field2720] < 0) {
                    arg0.field2733.method2127(-1);
                }
                var10.method2138(var8);
                var10.method1920(arg1, arg2, arg4 - arg2);
                if (var10.method2142()) {
                    this.field2761.method1933(var10);
                }
            }
        }
        arg0.field2733.method1920(arg1, arg2, arg3);
    }

    @ObfuscatedName("ik.i(Lhu;II)V")
    public void method4006(class232 arg0, int arg1) {
        if ((this.field2760.field2699[arg0.field2726] & 0x4) != 0 && arg0.field2729 < 0) {
            int var3 = this.field2760.field2704[arg0.field2726] / Statics.field3928;
            int var4 = (var3 + 1048575 - arg0.field2735) / var3;
            arg0.field2735 = arg0.field2735 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2760.field2702[arg0.field2726] == 0) {
                    arg0.field2733 = class116.method2254(arg0.field2717, arg0.field2733.method2120(), arg0.field2733.method2131(), arg0.field2733.method2245());
                } else {
                    arg0.field2733 = class116.method2254(arg0.field2717, arg0.field2733.method2120(), 0, arg0.field2733.method2245());
                    this.field2760.method3890(arg0, arg0.field2716.field2753[arg0.field2720] < 0);
                }
                if (arg0.field2716.field2753[arg0.field2720] < 0) {
                    arg0.field2733.method2127(-1);
                }
                arg1 = arg0.field2735 / var3;
            }
        }
        arg0.field2733.method1940(arg1);
    }
}
