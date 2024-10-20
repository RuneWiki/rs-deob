package deob;

@ObfuscatedName("hl")
public class class220 extends class117 {

    @ObfuscatedName("hl.p")
    public class216 field2678;

    @ObfuscatedName("hl.i")
    public class205 field2677 = new class205();

    @ObfuscatedName("hl.s")
    public class100 field2680 = new class100();

    public class220(class216 arg0) {
        this.field2678 = arg0;
    }

    @ObfuscatedName("hl.a()Ldj;")
    public class117 method1915() {
        class217 var1 = (class217) this.field2677.method3581();
        if (var1 == null) {
            return null;
        } else if (var1.field2650 == null) {
            return this.method1909();
        } else {
            return var1.field2650;
        }
    }

    @ObfuscatedName("hl.t()Ldj;")
    public class117 method1909() {
        class217 var1;
        do {
            var1 = (class217) this.field2677.method3597();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2650 == null);
        return var1.field2650;
    }

    @ObfuscatedName("hl.r()I")
    public int method1910() {
        return 0;
    }

    @ObfuscatedName("hl.m([III)V")
    public void method1923(int[] arg0, int arg1, int arg2) {
        this.field2680.method1923(arg0, arg1, arg2);
        for (class217 var4 = (class217) this.field2677.method3581(); var4 != null; var4 = (class217) this.field2677.method3597()) {
            if (!this.field2678.method3695(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2651) {
                        this.method3836(var4, arg0, var5, var6, var5 + var6);
                        var4.field2651 -= var6;
                        break;
                    }
                    this.method3836(var4, arg0, var5, var4.field2651, var5 + var6);
                    var5 += var4.field2651;
                    var6 -= var4.field2651;
                } while (!this.field2678.method3746(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hl.o(I)V")
    public void method1913(int arg0) {
        this.field2680.method1913(arg0);
        for (class217 var2 = (class217) this.field2677.method3581(); var2 != null; var2 = (class217) this.field2677.method3597()) {
            if (!this.field2678.method3695(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2651) {
                        this.method3837(var2, var3);
                        var2.field2651 -= var3;
                        break;
                    }
                    this.method3837(var2, var2.field2651);
                    var3 -= var2.field2651;
                } while (!this.field2678.method3746(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hl.p(Lhz;[IIIIB)V")
    public void method3836(class217 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2678.field2602[arg0.field2649] & 0x4) != 0 && arg0.field2632 < 0) {
            int var6 = this.field2678.field2621[arg0.field2649] / Statics.field311;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2647) / var6;
                if (var7 > arg3) {
                    arg0.field2647 += arg3 * var6;
                    break;
                }
                arg0.field2650.method1923(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2647 += var6 * var7 - 1048576;
                int var8 = Statics.field311 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class115 var10 = arg0.field2650;
                if (this.field2678.field2619[arg0.field2649] == 0) {
                    arg0.field2650 = class115.method2244(arg0.field2634, var10.method2138(), var10.method2238(), var10.method2131());
                } else {
                    arg0.field2650 = class115.method2244(arg0.field2634, var10.method2138(), 0, var10.method2131());
                    this.field2678.method3697(arg0, arg0.field2652.field2675[arg0.field2637] < 0);
                    arg0.field2650.method2135(var8, var10.method2238());
                }
                if (arg0.field2652.field2675[arg0.field2637] < 0) {
                    arg0.field2650.method2126(-1);
                }
                var10.method2136(var8);
                var10.method1923(arg1, arg2, arg4 - arg2);
                if (var10.method2140()) {
                    this.field2680.method1938(var10);
                }
            }
        }
        arg0.field2650.method1923(arg1, arg2, arg3);
    }

    @ObfuscatedName("hl.i(Lhz;II)V")
    public void method3837(class217 arg0, int arg1) {
        if ((this.field2678.field2602[arg0.field2649] & 0x4) != 0 && arg0.field2632 < 0) {
            int var3 = this.field2678.field2621[arg0.field2649] / Statics.field311;
            int var4 = (var3 + 1048575 - arg0.field2647) / var3;
            arg0.field2647 = arg0.field2647 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2678.field2619[arg0.field2649] == 0) {
                    arg0.field2650 = class115.method2244(arg0.field2634, arg0.field2650.method2138(), arg0.field2650.method2238(), arg0.field2650.method2131());
                } else {
                    arg0.field2650 = class115.method2244(arg0.field2634, arg0.field2650.method2138(), 0, arg0.field2650.method2131());
                    this.field2678.method3697(arg0, arg0.field2652.field2675[arg0.field2637] < 0);
                }
                if (arg0.field2652.field2675[arg0.field2637] < 0) {
                    arg0.field2650.method2126(-1);
                }
                arg1 = arg0.field2647 / var3;
            }
        }
        arg0.field2650.method1913(arg1);
    }
}
