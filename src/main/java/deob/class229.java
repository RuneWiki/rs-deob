package deob;

@ObfuscatedName("hx")
public class class229 extends class117 {

    @ObfuscatedName("hx.b")
    public class225 field2725;

    @ObfuscatedName("hx.q")
    public class214 field2726 = new class214();

    @ObfuscatedName("hx.o")
    public class100 field2727 = new class100();

    public class229(class225 arg0) {
        this.field2725 = arg0;
    }

    @ObfuscatedName("hx.h()Ldn;")
    public class117 method1949() {
        class226 var1 = (class226) this.field2726.method3739();
        if (var1 == null) {
            return null;
        } else if (var1.field2700 == null) {
            return this.method1922();
        } else {
            return var1.field2700;
        }
    }

    @ObfuscatedName("hx.l()Ldn;")
    public class117 method1922() {
        class226 var1;
        do {
            var1 = (class226) this.field2726.method3745();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2700 == null);
        return var1.field2700;
    }

    @ObfuscatedName("hx.y()I")
    public int method1925() {
        return 0;
    }

    @ObfuscatedName("hx.g([III)V")
    public void method1926(int[] arg0, int arg1, int arg2) {
        this.field2727.method1926(arg0, arg1, arg2);
        for (class226 var4 = (class226) this.field2726.method3739(); var4 != null; var4 = (class226) this.field2726.method3745()) {
            if (!this.field2725.method3850(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2699) {
                        this.method3995(var4, arg0, var5, var6, var5 + var6);
                        var4.field2699 -= var6;
                        break;
                    }
                    this.method3995(var4, arg0, var5, var4.field2699, var5 + var6);
                    var5 += var4.field2699;
                    var6 -= var4.field2699;
                } while (!this.field2725.method3859(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hx.u(I)V")
    public void method1928(int arg0) {
        this.field2727.method1928(arg0);
        for (class226 var2 = (class226) this.field2726.method3739(); var2 != null; var2 = (class226) this.field2726.method3745()) {
            if (!this.field2725.method3850(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2699) {
                        this.method3996(var2, var3);
                        var2.field2699 -= var3;
                        break;
                    }
                    this.method3996(var2, var2.field2699);
                    var3 -= var2.field2699;
                } while (!this.field2725.method3859(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hx.b(Lhs;[IIIII)V")
    public void method3995(class226 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2725.field2662[arg0.field2695] & 0x4) != 0 && arg0.field2696 < 0) {
            int var6 = this.field2725.field2669[arg0.field2695] / Statics.field1523;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2702) / var6;
                if (var7 > arg3) {
                    arg0.field2702 += arg3 * var6;
                    break;
                }
                arg0.field2700.method1926(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2702 += var6 * var7 - 1048576;
                int var8 = Statics.field1523 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class115 var10 = arg0.field2700;
                if (this.field2725.field2667[arg0.field2695] == 0) {
                    arg0.field2700 = class115.method2144(arg0.field2684, var10.method2159(), var10.method2150(), var10.method2151());
                } else {
                    arg0.field2700 = class115.method2144(arg0.field2684, var10.method2159(), 0, var10.method2151());
                    this.field2725.method3834(arg0, arg0.field2683.field2719[arg0.field2687] < 0);
                    arg0.field2700.method2266(var8, var10.method2150());
                }
                if (arg0.field2683.field2719[arg0.field2687] < 0) {
                    arg0.field2700.method2146(-1);
                }
                var10.method2157(var8);
                var10.method1926(arg1, arg2, arg4 - arg2);
                if (var10.method2161()) {
                    this.field2727.method1918(var10);
                }
            }
        }
        arg0.field2700.method1926(arg1, arg2, arg3);
    }

    @ObfuscatedName("hx.q(Lhs;II)V")
    public void method3996(class226 arg0, int arg1) {
        if ((this.field2725.field2662[arg0.field2695] & 0x4) != 0 && arg0.field2696 < 0) {
            int var3 = this.field2725.field2669[arg0.field2695] / Statics.field1523;
            int var4 = (var3 + 1048575 - arg0.field2702) / var3;
            arg0.field2702 = arg0.field2702 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2725.field2667[arg0.field2695] == 0) {
                    arg0.field2700 = class115.method2144(arg0.field2684, arg0.field2700.method2159(), arg0.field2700.method2150(), arg0.field2700.method2151());
                } else {
                    arg0.field2700 = class115.method2144(arg0.field2684, arg0.field2700.method2159(), 0, arg0.field2700.method2151());
                    this.field2725.method3834(arg0, arg0.field2683.field2719[arg0.field2687] < 0);
                }
                if (arg0.field2683.field2719[arg0.field2687] < 0) {
                    arg0.field2700.method2146(-1);
                }
                arg1 = arg0.field2702 / var3;
            }
        }
        arg0.field2700.method1928(arg1);
    }
}
