package deob;

@ObfuscatedName("ek")
public class class144 extends class48 {

    @ObfuscatedName("ek.p")
    public class142 field2422;

    @ObfuscatedName("ek.l")
    public class177 field2421 = new class177();

    @ObfuscatedName("ek.d")
    public class46 field2424 = new class46();

    public class144(class142 arg0) {
        this.field2422 = arg0;
    }

    @ObfuscatedName("ek.h()Lax;")
    public class48 method1009() {
        class146 var1 = (class146) this.field2421.method3446();
        if (var1 == null) {
            return null;
        } else if (var1.field2458 == null) {
            return this.method987();
        } else {
            return var1.field2458;
        }
    }

    @ObfuscatedName("ek.j()Lax;")
    public class48 method987() {
        class146 var1;
        do {
            var1 = (class146) this.field2421.method3428();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2458 == null);
        return var1.field2458;
    }

    @ObfuscatedName("ek.q()I")
    public int method1123() {
        return 0;
    }

    @ObfuscatedName("ek.z([III)V")
    public void method978(int[] arg0, int arg1, int arg2) {
        this.field2424.method978(arg0, arg1, arg2);
        for (class146 var4 = (class146) this.field2421.method3446(); var4 != null; var4 = (class146) this.field2421.method3428()) {
            if (!this.field2422.method2839(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2459) {
                        this.method2930(var4, arg0, var5, var6, var5 + var6);
                        var4.field2459 -= var6;
                        break;
                    }
                    this.method2930(var4, arg0, var5, var4.field2459, var5 + var6);
                    var5 += var4.field2459;
                    var6 -= var4.field2459;
                } while (!this.field2422.method2909(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ek.af(I)V")
    public void method990(int arg0) {
        this.field2424.method990(arg0);
        for (class146 var2 = (class146) this.field2421.method3446(); var2 != null; var2 = (class146) this.field2421.method3428()) {
            if (!this.field2422.method2839(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2459) {
                        this.method2929(var2, var3);
                        var2.field2459 -= var3;
                        break;
                    }
                    this.method2929(var2, var2.field2459);
                    var3 -= var2.field2459;
                } while (!this.field2422.method2909(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ek.p(Let;[IIIIB)V")
    public void method2930(class146 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2422.field2400[arg0.field2448] & 0x4) != 0 && arg0.field2451 < 0) {
            int var6 = this.field2422.field2381[arg0.field2448] / Statics.field1099;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2460) / var6;
                if (var7 > arg3) {
                    arg0.field2460 += arg3 * var6;
                    break;
                }
                arg0.field2458.method978(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2460 += var6 * var7 - 1048576;
                int var8 = Statics.field1099 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2458;
                if (this.field2422.field2395[arg0.field2448] == 0) {
                    arg0.field2458 = class45.method968(arg0.field2442, var10.method983(), var10.method974(), var10.method1077());
                } else {
                    arg0.field2458 = class45.method968(arg0.field2442, var10.method983(), 0, var10.method1077());
                    this.field2422.method2819(arg0, arg0.field2441.field2365[arg0.field2445] < 0);
                    arg0.field2458.method1119(var8, var10.method974());
                }
                if (arg0.field2441.field2365[arg0.field2445] < 0) {
                    arg0.field2458.method970(-1);
                }
                var10.method1115(var8);
                var10.method978(arg1, arg2, arg4 - arg2);
                if (var10.method985()) {
                    this.field2424.method1143(var10);
                }
            }
        }
        arg0.field2458.method978(arg1, arg2, arg3);
    }

    @ObfuscatedName("ek.l(Let;IB)V")
    public void method2929(class146 arg0, int arg1) {
        if ((this.field2422.field2400[arg0.field2448] & 0x4) != 0 && arg0.field2451 < 0) {
            int var3 = this.field2422.field2381[arg0.field2448] / Statics.field1099;
            int var4 = (var3 + 1048575 - arg0.field2460) / var3;
            arg0.field2460 = arg0.field2460 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2422.field2395[arg0.field2448] == 0) {
                    arg0.field2458 = class45.method968(arg0.field2442, arg0.field2458.method983(), arg0.field2458.method974(), arg0.field2458.method1077());
                } else {
                    arg0.field2458 = class45.method968(arg0.field2442, arg0.field2458.method983(), 0, arg0.field2458.method1077());
                    this.field2422.method2819(arg0, arg0.field2441.field2365[arg0.field2445] < 0);
                }
                if (arg0.field2441.field2365[arg0.field2445] < 0) {
                    arg0.field2458.method970(-1);
                }
                arg1 = arg0.field2460 / var3;
            }
        }
        arg0.field2458.method990(arg1);
    }
}
