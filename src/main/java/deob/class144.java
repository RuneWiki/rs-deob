package deob;

@ObfuscatedName("ez")
public class class144 extends class48 {

    @ObfuscatedName("ez.g")
    public class142 field2423;

    @ObfuscatedName("ez.h")
    public class177 field2421 = new class177();

    @ObfuscatedName("ez.s")
    public class46 field2422 = new class46();

    public class144(class142 arg0) {
        this.field2423 = arg0;
    }

    @ObfuscatedName("ez.w()Lao;")
    public class48 method983() {
        class146 var1 = (class146) this.field2421.method3373();
        if (var1 == null) {
            return null;
        } else if (var1.field2458 == null) {
            return this.method982();
        } else {
            return var1.field2458;
        }
    }

    @ObfuscatedName("ez.d()Lao;")
    public class48 method982() {
        class146 var1;
        do {
            var1 = (class146) this.field2421.method3375();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2458 == null);
        return var1.field2458;
    }

    @ObfuscatedName("ez.i()I")
    public int method985() {
        return 0;
    }

    @ObfuscatedName("ez.c([III)V")
    public void method986(int[] arg0, int arg1, int arg2) {
        this.field2422.method986(arg0, arg1, arg2);
        for (class146 var4 = (class146) this.field2421.method3373(); var4 != null; var4 = (class146) this.field2421.method3375()) {
            if (!this.field2423.method2882(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2459) {
                        this.method2917(var4, arg0, var5, var6, var5 + var6);
                        var4.field2459 -= var6;
                        break;
                    }
                    this.method2917(var4, arg0, var5, var4.field2459, var5 + var6);
                    var5 += var4.field2459;
                    var6 -= var4.field2459;
                } while (!this.field2423.method2844(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ez.af(I)V")
    public void method991(int arg0) {
        this.field2422.method991(arg0);
        for (class146 var2 = (class146) this.field2421.method3373(); var2 != null; var2 = (class146) this.field2421.method3375()) {
            if (!this.field2423.method2882(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2459) {
                        this.method2919(var2, var3);
                        var2.field2459 -= var3;
                        break;
                    }
                    this.method2919(var2, var2.field2459);
                    var3 -= var2.field2459;
                } while (!this.field2423.method2844(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ez.g(Lev;[IIIII)V")
    public void method2917(class146 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2423.field2377[arg0.field2451] & 0x4) != 0 && arg0.field2454 < 0) {
            int var6 = this.field2423.field2397[arg0.field2451] / Statics.field1105;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2460) / var6;
                if (var7 > arg3) {
                    arg0.field2460 += arg3 * var6;
                    break;
                }
                arg0.field2458.method986(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2460 += var6 * var7 - 1048576;
                int var8 = Statics.field1105 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2458;
                if (this.field2423.field2392[arg0.field2451] == 0) {
                    arg0.field2458 = class45.method965(arg0.field2442, var10.method980(), var10.method1082(), var10.method972());
                } else {
                    arg0.field2458 = class45.method965(arg0.field2442, var10.method980(), 0, var10.method972());
                    this.field2423.method2909(arg0, arg0.field2441.field2367[arg0.field2445] < 0);
                    arg0.field2458.method976(var8, var10.method1082());
                }
                if (arg0.field2441.field2367[arg0.field2445] < 0) {
                    arg0.field2458.method967(-1);
                }
                var10.method1031(var8);
                var10.method986(arg1, arg2, arg4 - arg2);
                if (var10.method1120()) {
                    this.field2422.method1137(var10);
                }
            }
        }
        arg0.field2458.method986(arg1, arg2, arg3);
    }

    @ObfuscatedName("ez.h(Lev;II)V")
    public void method2919(class146 arg0, int arg1) {
        if ((this.field2423.field2377[arg0.field2451] & 0x4) != 0 && arg0.field2454 < 0) {
            int var3 = this.field2423.field2397[arg0.field2451] / Statics.field1105;
            int var4 = (var3 + 1048575 - arg0.field2460) / var3;
            arg0.field2460 = arg0.field2460 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2423.field2392[arg0.field2451] == 0) {
                    arg0.field2458 = class45.method965(arg0.field2442, arg0.field2458.method980(), arg0.field2458.method1082(), arg0.field2458.method972());
                } else {
                    arg0.field2458 = class45.method965(arg0.field2442, arg0.field2458.method980(), 0, arg0.field2458.method972());
                    this.field2423.method2909(arg0, arg0.field2441.field2367[arg0.field2445] < 0);
                }
                if (arg0.field2441.field2367[arg0.field2445] < 0) {
                    arg0.field2458.method967(-1);
                }
                arg1 = arg0.field2460 / var3;
            }
        }
        arg0.field2458.method991(arg1);
    }
}
