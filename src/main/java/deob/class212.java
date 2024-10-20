package deob;

@ObfuscatedName("hx")
public class class212 extends class120 {

    @ObfuscatedName("hx.o")
    public class208 field2605;

    @ObfuscatedName("hx.x")
    public class197 field2607 = new class197();

    @ObfuscatedName("hx.k")
    public class103 field2604 = new class103();

    public class212(class208 arg0) {
        this.field2605 = arg0;
    }

    @ObfuscatedName("hx.i()Ldj;")
    public class120 method1691() {
        class209 var1 = (class209) this.field2607.method3304();
        if (var1 == null) {
            return null;
        } else if (var1.field2572 == null) {
            return this.method1716();
        } else {
            return var1.field2572;
        }
    }

    @ObfuscatedName("hx.j()Ldj;")
    public class120 method1716() {
        class209 var1;
        do {
            var1 = (class209) this.field2607.method3306();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2572 == null);
        return var1.field2572;
    }

    @ObfuscatedName("hx.m()I")
    public int method1693() {
        return 0;
    }

    @ObfuscatedName("hx.u([III)V")
    public void method1726(int[] arg0, int arg1, int arg2) {
        this.field2604.method1726(arg0, arg1, arg2);
        for (class209 var4 = (class209) this.field2607.method3304(); var4 != null; var4 = (class209) this.field2607.method3306()) {
            if (!this.field2605.method3426(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2577) {
                        this.method3565(var4, arg0, var5, var6, var5 + var6);
                        var4.field2577 -= var6;
                        break;
                    }
                    this.method3565(var4, arg0, var5, var4.field2577, var5 + var6);
                    var5 += var4.field2577;
                    var6 -= var4.field2577;
                } while (!this.field2605.method3447(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hx.a(I)V")
    public void method1696(int arg0) {
        this.field2604.method1696(arg0);
        for (class209 var2 = (class209) this.field2607.method3304(); var2 != null; var2 = (class209) this.field2607.method3306()) {
            if (!this.field2605.method3426(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2577) {
                        this.method3566(var2, var3);
                        var2.field2577 -= var3;
                        break;
                    }
                    this.method3566(var2, var2.field2577);
                    var3 -= var2.field2577;
                } while (!this.field2605.method3447(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hx.w(Lhj;[IIIII)V")
    public void method3565(class209 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2605.field2539[arg0.field2564] & 0x4) != 0 && arg0.field2568 < 0) {
            int var6 = this.field2605.field2544[arg0.field2564] / Statics.field3411;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2574) / var6;
                if (var7 > arg3) {
                    arg0.field2574 += arg3 * var6;
                    break;
                }
                arg0.field2572.method1726(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2574 += var6 * var7 - 1048576;
                int var8 = Statics.field3411 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class118 var10 = arg0.field2572;
                if (this.field2605.field2532[arg0.field2564] == 0) {
                    arg0.field2572 = class118.method2009(arg0.field2565, var10.method1931(), var10.method1922(), var10.method1923());
                } else {
                    arg0.field2572 = class118.method2009(arg0.field2565, var10.method1931(), 0, var10.method1923());
                    this.field2605.method3435(arg0, arg0.field2555.field2595[arg0.field2571] < 0);
                    arg0.field2572.method1927(var8, var10.method1922());
                }
                if (arg0.field2555.field2595[arg0.field2571] < 0) {
                    arg0.field2572.method1918(-1);
                }
                var10.method2027(var8);
                var10.method1726(arg1, arg2, arg4 - arg2);
                if (var10.method1917()) {
                    this.field2604.method1686(var10);
                }
            }
        }
        arg0.field2572.method1726(arg1, arg2, arg3);
    }

    @ObfuscatedName("hx.o(Lhj;II)V")
    public void method3566(class209 arg0, int arg1) {
        if ((this.field2605.field2539[arg0.field2564] & 0x4) != 0 && arg0.field2568 < 0) {
            int var3 = this.field2605.field2544[arg0.field2564] / Statics.field3411;
            int var4 = (var3 + 1048575 - arg0.field2574) / var3;
            arg0.field2574 = arg0.field2574 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2605.field2532[arg0.field2564] == 0) {
                    arg0.field2572 = class118.method2009(arg0.field2565, arg0.field2572.method1931(), arg0.field2572.method1922(), arg0.field2572.method1923());
                } else {
                    arg0.field2572 = class118.method2009(arg0.field2565, arg0.field2572.method1931(), 0, arg0.field2572.method1923());
                    this.field2605.method3435(arg0, arg0.field2555.field2595[arg0.field2571] < 0);
                }
                if (arg0.field2555.field2595[arg0.field2571] < 0) {
                    arg0.field2572.method1918(-1);
                }
                arg1 = arg0.field2574 / var3;
            }
        }
        arg0.field2572.method1696(arg1);
    }
}
