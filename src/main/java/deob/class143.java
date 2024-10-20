package deob;

@ObfuscatedName("ek")
public class class143 extends class48 {

    @ObfuscatedName("ek.x")
    public class141 field2380;

    @ObfuscatedName("ek.p")
    public class177 field2389 = new class177();

    @ObfuscatedName("ek.k")
    public class46 field2382 = new class46();

    public class143(class141 arg0) {
        this.field2380 = arg0;
    }

    @ObfuscatedName("ek.f()Lau;")
    public class48 method946() {
        class145 var1 = (class145) this.field2389.method3280();
        if (var1 == null) {
            return null;
        } else if (var1.field2424 == null) {
            return this.method947();
        } else {
            return var1.field2424;
        }
    }

    @ObfuscatedName("ek.i()Lau;")
    public class48 method947() {
        class145 var1;
        do {
            var1 = (class145) this.field2389.method3269();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2424 == null);
        return var1.field2424;
    }

    @ObfuscatedName("ek.d()I")
    public int method976() {
        return 0;
    }

    @ObfuscatedName("ek.z([III)V")
    public void method1006(int[] arg0, int arg1, int arg2) {
        this.field2382.method1006(arg0, arg1, arg2);
        for (class145 var4 = (class145) this.field2389.method3280(); var4 != null; var4 = (class145) this.field2389.method3269()) {
            if (!this.field2380.method2736(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2423) {
                        this.method2793(var4, arg0, var5, var6, var5 + var6);
                        var4.field2423 -= var6;
                        break;
                    }
                    this.method2793(var4, arg0, var5, var4.field2423, var5 + var6);
                    var5 += var4.field2423;
                    var6 -= var4.field2423;
                } while (!this.field2380.method2716(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ek.ai(I)V")
    public void method950(int arg0) {
        this.field2382.method950(arg0);
        for (class145 var2 = (class145) this.field2389.method3280(); var2 != null; var2 = (class145) this.field2389.method3269()) {
            if (!this.field2380.method2736(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2423) {
                        this.method2790(var2, var3);
                        var2.field2423 -= var3;
                        break;
                    }
                    this.method2790(var2, var2.field2423);
                    var3 -= var2.field2423;
                } while (!this.field2380.method2716(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ek.x(Lef;[IIIII)V")
    public void method2793(class145 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2380.field2347[arg0.field2415] & 0x4) != 0 && arg0.field2407 < 0) {
            int var6 = this.field2380.field2352[arg0.field2415] / Statics.field1082;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2425) / var6;
                if (var7 > arg3) {
                    arg0.field2425 += arg3 * var6;
                    break;
                }
                arg0.field2424.method1006(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2425 += var6 * var7 - 1048576;
                int var8 = Statics.field1082 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2424;
                if (this.field2380.field2337[arg0.field2415] == 0) {
                    arg0.field2424 = class45.method928(arg0.field2410, var10.method1029(), var10.method934(), var10.method935());
                } else {
                    arg0.field2424 = class45.method928(arg0.field2410, var10.method1029(), 0, var10.method935());
                    this.field2380.method2699(arg0, arg0.field2406.field2324[arg0.field2408] < 0);
                    arg0.field2424.method939(var8, var10.method934());
                }
                if (arg0.field2406.field2324[arg0.field2408] < 0) {
                    arg0.field2424.method1028(-1);
                }
                var10.method1069(var8);
                var10.method1006(arg1, arg2, arg4 - arg2);
                if (var10.method945()) {
                    this.field2382.method1074(var10);
                }
            }
        }
        arg0.field2424.method1006(arg1, arg2, arg3);
    }

    @ObfuscatedName("ek.p(Lef;IB)V")
    public void method2790(class145 arg0, int arg1) {
        if ((this.field2380.field2347[arg0.field2415] & 0x4) != 0 && arg0.field2407 < 0) {
            int var3 = this.field2380.field2352[arg0.field2415] / Statics.field1082;
            int var4 = (var3 + 1048575 - arg0.field2425) / var3;
            arg0.field2425 = arg0.field2425 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2380.field2337[arg0.field2415] == 0) {
                    arg0.field2424 = class45.method928(arg0.field2410, arg0.field2424.method1029(), arg0.field2424.method934(), arg0.field2424.method935());
                } else {
                    arg0.field2424 = class45.method928(arg0.field2410, arg0.field2424.method1029(), 0, arg0.field2424.method935());
                    this.field2380.method2699(arg0, arg0.field2406.field2324[arg0.field2408] < 0);
                }
                if (arg0.field2406.field2324[arg0.field2408] < 0) {
                    arg0.field2424.method1028(-1);
                }
                arg1 = arg0.field2425 / var3;
            }
        }
        arg0.field2424.method950(arg1);
    }
}
