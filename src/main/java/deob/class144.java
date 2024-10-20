package deob;

@ObfuscatedName("ep")
public class class144 extends class48 {

    @ObfuscatedName("ep.q")
    public class142 field2427;

    @ObfuscatedName("ep.c")
    public class177 field2426 = new class177();

    @ObfuscatedName("ep.p")
    public class46 field2425 = new class46();

    public class144(class142 arg0) {
        this.field2427 = arg0;
    }

    @ObfuscatedName("ep.w()Lav;")
    public class48 method1006() {
        class146 var1 = (class146) this.field2426.method3286();
        if (var1 == null) {
            return null;
        } else if (var1.field2463 == null) {
            return this.method1039();
        } else {
            return var1.field2463;
        }
    }

    @ObfuscatedName("ep.x()Lav;")
    public class48 method1039() {
        class146 var1;
        do {
            var1 = (class146) this.field2426.method3302();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2463 == null);
        return var1.field2463;
    }

    @ObfuscatedName("ep.j()I")
    public int method979() {
        return 0;
    }

    @ObfuscatedName("ep.i([III)V")
    public void method1059(int[] arg0, int arg1, int arg2) {
        this.field2425.method1059(arg0, arg1, arg2);
        for (class146 var4 = (class146) this.field2426.method3286(); var4 != null; var4 = (class146) this.field2426.method3302()) {
            if (!this.field2427.method2742(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2464) {
                        this.method2814(var4, arg0, var5, var6, var5 + var6);
                        var4.field2464 -= var6;
                        break;
                    }
                    this.method2814(var4, arg0, var5, var4.field2464, var5 + var6);
                    var5 += var4.field2464;
                    var6 -= var4.field2464;
                } while (!this.field2427.method2733(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ep.ap(I)V")
    public void method981(int arg0) {
        this.field2425.method981(arg0);
        for (class146 var2 = (class146) this.field2426.method3286(); var2 != null; var2 = (class146) this.field2426.method3302()) {
            if (!this.field2427.method2742(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2464) {
                        this.method2813(var2, var3);
                        var2.field2464 -= var3;
                        break;
                    }
                    this.method2813(var2, var2.field2464);
                    var3 -= var2.field2464;
                } while (!this.field2427.method2733(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ep.q(Leq;[IIIII)V")
    public void method2814(class146 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2427.field2397[arg0.field2461] & 0x4) != 0 && arg0.field2452 < 0) {
            int var6 = this.field2427.field2386[arg0.field2461] / Statics.field1097;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2454) / var6;
                if (var7 > arg3) {
                    arg0.field2454 += arg3 * var6;
                    break;
                }
                arg0.field2463.method1059(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2454 += var6 * var7 - 1048576;
                int var8 = Statics.field1097 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2463;
                if (this.field2427.field2400[arg0.field2461] == 0) {
                    arg0.field2463 = class45.method975(arg0.field2458, var10.method974(), var10.method965(), var10.method966());
                } else {
                    arg0.field2463 = class45.method975(arg0.field2458, var10.method974(), 0, var10.method966());
                    this.field2427.method2712(arg0, arg0.field2446.field2383[arg0.field2450] < 0);
                    arg0.field2463.method970(var8, var10.method965());
                }
                if (arg0.field2446.field2383[arg0.field2450] < 0) {
                    arg0.field2463.method1108(-1);
                }
                var10.method972(var8);
                var10.method1059(arg1, arg2, arg4 - arg2);
                if (var10.method976()) {
                    this.field2425.method1116(var10);
                }
            }
        }
        arg0.field2463.method1059(arg1, arg2, arg3);
    }

    @ObfuscatedName("ep.c(Leq;II)V")
    public void method2813(class146 arg0, int arg1) {
        if ((this.field2427.field2397[arg0.field2461] & 0x4) != 0 && arg0.field2452 < 0) {
            int var3 = this.field2427.field2386[arg0.field2461] / Statics.field1097;
            int var4 = (var3 + 1048575 - arg0.field2454) / var3;
            arg0.field2454 = arg0.field2454 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2427.field2400[arg0.field2461] == 0) {
                    arg0.field2463 = class45.method975(arg0.field2458, arg0.field2463.method974(), arg0.field2463.method965(), arg0.field2463.method966());
                } else {
                    arg0.field2463 = class45.method975(arg0.field2458, arg0.field2463.method974(), 0, arg0.field2463.method966());
                    this.field2427.method2712(arg0, arg0.field2446.field2383[arg0.field2450] < 0);
                }
                if (arg0.field2446.field2383[arg0.field2450] < 0) {
                    arg0.field2463.method1108(-1);
                }
                arg1 = arg0.field2454 / var3;
            }
        }
        arg0.field2463.method981(arg1);
    }
}
