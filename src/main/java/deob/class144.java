package deob;

@ObfuscatedName("ez")
public class class144 extends class48 {

    @ObfuscatedName("ez.f")
    public class142 field2409;

    @ObfuscatedName("ez.t")
    public class177 field2411 = new class177();

    @ObfuscatedName("ez.n")
    public class46 field2410 = new class46();

    public class144(class142 arg0) {
        this.field2409 = arg0;
    }

    @ObfuscatedName("ez.y()Laj;")
    public class48 method1069() {
        class146 var1 = (class146) this.field2411.method3362();
        if (var1 == null) {
            return null;
        } else if (var1.field2431 == null) {
            return this.method964();
        } else {
            return var1.field2431;
        }
    }

    @ObfuscatedName("ez.x()Laj;")
    public class48 method964() {
        class146 var1;
        do {
            var1 = (class146) this.field2411.method3350();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2431 == null);
        return var1.field2431;
    }

    @ObfuscatedName("ez.p()I")
    public int method1000() {
        return 0;
    }

    @ObfuscatedName("ez.i([III)V")
    public void method954(int[] arg0, int arg1, int arg2) {
        this.field2410.method954(arg0, arg1, arg2);
        for (class146 var4 = (class146) this.field2411.method3362(); var4 != null; var4 = (class146) this.field2411.method3350()) {
            if (!this.field2409.method2817(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2445) {
                        this.method2895(var4, arg0, var5, var6, var5 + var6);
                        var4.field2445 -= var6;
                        break;
                    }
                    this.method2895(var4, arg0, var5, var4.field2445, var5 + var6);
                    var5 += var4.field2445;
                    var6 -= var4.field2445;
                } while (!this.field2409.method2820(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ez.aa(I)V")
    public void method1085(int arg0) {
        this.field2410.method1085(arg0);
        for (class146 var2 = (class146) this.field2411.method3362(); var2 != null; var2 = (class146) this.field2411.method3350()) {
            if (!this.field2409.method2817(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2445) {
                        this.method2896(var2, var3);
                        var2.field2445 -= var3;
                        break;
                    }
                    this.method2896(var2, var2.field2445);
                    var3 -= var2.field2445;
                } while (!this.field2409.method2820(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ez.f(Lek;[IIIII)V")
    public void method2895(class146 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2409.field2386[arg0.field2446] & 0x4) != 0 && arg0.field2426 < 0) {
            int var6 = this.field2409.field2380[arg0.field2446] / Statics.field1089;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2435) / var6;
                if (var7 > arg3) {
                    arg0.field2435 += arg3 * var6;
                    break;
                }
                arg0.field2431.method954(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2435 += var6 * var7 - 1048576;
                int var8 = Statics.field1089 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2431;
                if (this.field2409.field2384[arg0.field2446] == 0) {
                    arg0.field2431 = class45.method966(arg0.field2428, var10.method960(), var10.method951(), var10.method952());
                } else {
                    arg0.field2431 = class45.method966(arg0.field2428, var10.method960(), 0, var10.method952());
                    this.field2409.method2804(arg0, arg0.field2427.field2364[arg0.field2433] < 0);
                    arg0.field2431.method956(var8, var10.method951());
                }
                if (arg0.field2427.field2364[arg0.field2433] < 0) {
                    arg0.field2431.method947(-1);
                }
                var10.method1026(var8);
                var10.method954(arg1, arg2, arg4 - arg2);
                if (var10.method1067()) {
                    this.field2410.method1096(var10);
                }
            }
        }
        arg0.field2431.method954(arg1, arg2, arg3);
    }

    @ObfuscatedName("ez.t(Lek;IB)V")
    public void method2896(class146 arg0, int arg1) {
        if ((this.field2409.field2386[arg0.field2446] & 0x4) != 0 && arg0.field2426 < 0) {
            int var3 = this.field2409.field2380[arg0.field2446] / Statics.field1089;
            int var4 = (var3 + 1048575 - arg0.field2435) / var3;
            arg0.field2435 = arg0.field2435 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2409.field2384[arg0.field2446] == 0) {
                    arg0.field2431 = class45.method966(arg0.field2428, arg0.field2431.method960(), arg0.field2431.method951(), arg0.field2431.method952());
                } else {
                    arg0.field2431 = class45.method966(arg0.field2428, arg0.field2431.method960(), 0, arg0.field2431.method952());
                    this.field2409.method2804(arg0, arg0.field2427.field2364[arg0.field2433] < 0);
                }
                if (arg0.field2427.field2364[arg0.field2433] < 0) {
                    arg0.field2431.method947(-1);
                }
                arg1 = arg0.field2435 / var3;
            }
        }
        arg0.field2431.method1085(arg1);
    }
}
