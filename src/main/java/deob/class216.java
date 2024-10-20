package deob;

@ObfuscatedName("hw")
public class class216 extends class119 {

    @ObfuscatedName("hw.d")
    public class212 field2679;

    @ObfuscatedName("hw.x")
    public class201 field2677 = new class201();

    @ObfuscatedName("hw.k")
    public class102 field2678 = new class102();

    public class216(class212 arg0) {
        this.field2679 = arg0;
    }

    @ObfuscatedName("hw.m()Ldn;")
    public class119 method1834() {
        class213 var1 = (class213) this.field2677.method3500();
        if (var1 == null) {
            return null;
        } else if (var1.field2632 == null) {
            return this.method1811();
        } else {
            return var1.field2632;
        }
    }

    @ObfuscatedName("hw.b()Ldn;")
    public class119 method1811() {
        class213 var1;
        do {
            var1 = (class213) this.field2677.method3511();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2632 == null);
        return var1.field2632;
    }

    @ObfuscatedName("hw.t()I")
    public int method1812() {
        return 0;
    }

    @ObfuscatedName("hw.p([III)V")
    public void method1813(int[] arg0, int arg1, int arg2) {
        this.field2678.method1813(arg0, arg1, arg2);
        for (class213 var4 = (class213) this.field2677.method3500(); var4 != null; var4 = (class213) this.field2677.method3511()) {
            if (!this.field2679.method3672(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2641) {
                        this.method3765(var4, arg0, var5, var6, var5 + var6);
                        var4.field2641 -= var6;
                        break;
                    }
                    this.method3765(var4, arg0, var5, var4.field2641, var5 + var6);
                    var5 += var4.field2641;
                    var6 -= var4.field2641;
                } while (!this.field2679.method3601(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hw.l(I)V")
    public void method1815(int arg0) {
        this.field2678.method1815(arg0);
        for (class213 var2 = (class213) this.field2677.method3500(); var2 != null; var2 = (class213) this.field2677.method3511()) {
            if (!this.field2679.method3672(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2641) {
                        this.method3764(var2, var3);
                        var2.field2641 -= var3;
                        break;
                    }
                    this.method3764(var2, var2.field2641);
                    var3 -= var2.field2641;
                } while (!this.field2679.method3601(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hw.d(Lha;[IIIIB)V")
    public void method3765(class213 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2679.field2613[arg0.field2648] & 0x4) != 0 && arg0.field2649 < 0) {
            int var6 = this.field2679.field2625[arg0.field2648] / Statics.field1546;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2650) / var6;
                if (var7 > arg3) {
                    arg0.field2650 += arg3 * var6;
                    break;
                }
                arg0.field2632.method1813(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2650 += var6 * var7 - 1048576;
                int var8 = Statics.field1546 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class117 var10 = arg0.field2632;
                if (this.field2679.field2607[arg0.field2648] == 0) {
                    arg0.field2632 = class117.method2055(arg0.field2631, var10.method2096(), var10.method2061(), var10.method2062());
                } else {
                    arg0.field2632 = class117.method2055(arg0.field2631, var10.method2096(), 0, var10.method2062());
                    this.field2679.method3596(arg0, arg0.field2645.field2668[arg0.field2635] < 0);
                    arg0.field2632.method2066(var8, var10.method2061());
                }
                if (arg0.field2645.field2668[arg0.field2635] < 0) {
                    arg0.field2632.method2057(-1);
                }
                var10.method2056(var8);
                var10.method1813(arg1, arg2, arg4 - arg2);
                if (var10.method2110()) {
                    this.field2678.method1805(var10);
                }
            }
        }
        arg0.field2632.method1813(arg1, arg2, arg3);
    }

    @ObfuscatedName("hw.x(Lha;IS)V")
    public void method3764(class213 arg0, int arg1) {
        if ((this.field2679.field2613[arg0.field2648] & 0x4) != 0 && arg0.field2649 < 0) {
            int var3 = this.field2679.field2625[arg0.field2648] / Statics.field1546;
            int var4 = (var3 + 1048575 - arg0.field2650) / var3;
            arg0.field2650 = arg0.field2650 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2679.field2607[arg0.field2648] == 0) {
                    arg0.field2632 = class117.method2055(arg0.field2631, arg0.field2632.method2096(), arg0.field2632.method2061(), arg0.field2632.method2062());
                } else {
                    arg0.field2632 = class117.method2055(arg0.field2631, arg0.field2632.method2096(), 0, arg0.field2632.method2062());
                    this.field2679.method3596(arg0, arg0.field2645.field2668[arg0.field2635] < 0);
                }
                if (arg0.field2645.field2668[arg0.field2635] < 0) {
                    arg0.field2632.method2057(-1);
                }
                arg1 = arg0.field2650 / var3;
            }
        }
        arg0.field2632.method1815(arg1);
    }
}
