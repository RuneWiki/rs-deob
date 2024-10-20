package deob;

@ObfuscatedName("ht")
public class class209 extends class118 {

    @ObfuscatedName("ht.d")
    public class205 field2601;

    @ObfuscatedName("ht.k")
    public class194 field2602 = new class194();

    @ObfuscatedName("ht.e")
    public class101 field2607 = new class101();

    public class209(class205 arg0) {
        this.field2601 = arg0;
    }

    @ObfuscatedName("ht.s()Ldd;")
    public class118 method1795() {
        class206 var1 = (class206) this.field2602.method3409();
        if (var1 == null) {
            return null;
        } else if (var1.field2571 == null) {
            return this.method1796();
        } else {
            return var1.field2571;
        }
    }

    @ObfuscatedName("ht.r()Ldd;")
    public class118 method1796() {
        class206 var1;
        do {
            var1 = (class206) this.field2602.method3429();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2571 == null);
        return var1.field2571;
    }

    @ObfuscatedName("ht.g()I")
    public int method1815() {
        return 0;
    }

    @ObfuscatedName("ht.v([III)V")
    public void method1810(int[] arg0, int arg1, int arg2) {
        this.field2607.method1810(arg0, arg1, arg2);
        for (class206 var4 = (class206) this.field2602.method3409(); var4 != null; var4 = (class206) this.field2602.method3429()) {
            if (!this.field2601.method3535(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2576) {
                        this.method3688(var4, arg0, var5, var6, var5 + var6);
                        var4.field2576 -= var6;
                        break;
                    }
                    this.method3688(var4, arg0, var5, var4.field2576, var5 + var6);
                    var5 += var4.field2576;
                    var6 -= var4.field2576;
                } while (!this.field2601.method3536(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ht.y(I)V")
    public void method1790(int arg0) {
        this.field2607.method1790(arg0);
        for (class206 var2 = (class206) this.field2602.method3409(); var2 != null; var2 = (class206) this.field2602.method3429()) {
            if (!this.field2601.method3535(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2576) {
                        this.method3694(var2, var3);
                        var2.field2576 -= var3;
                        break;
                    }
                    this.method3694(var2, var2.field2576);
                    var3 -= var2.field2576;
                } while (!this.field2601.method3536(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ht.d(Lgi;[IIIIB)V")
    public void method3688(class206 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2601.field2540[arg0.field2564] & 0x4) != 0 && arg0.field2572 < 0) {
            int var6 = this.field2601.field2545[arg0.field2564] / Statics.field463;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2578) / var6;
                if (var7 > arg3) {
                    arg0.field2578 += arg3 * var6;
                    break;
                }
                arg0.field2571.method1810(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2578 += var6 * var7 - 1048576;
                int var8 = Statics.field463 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class116 var10 = arg0.field2571;
                if (this.field2601.field2541[arg0.field2564] == 0) {
                    arg0.field2571 = class116.method2148(arg0.field2560, var10.method2056(), var10.method2146(), var10.method2058());
                } else {
                    arg0.field2571 = class116.method2148(arg0.field2560, var10.method2056(), 0, var10.method2058());
                    this.field2601.method3517(arg0, arg0.field2559.field2595[arg0.field2575] < 0);
                    arg0.field2571.method2030(var8, var10.method2146());
                }
                if (arg0.field2559.field2595[arg0.field2575] < 0) {
                    arg0.field2571.method2142(-1);
                }
                var10.method2015(var8);
                var10.method1810(arg1, arg2, arg4 - arg2);
                if (var10.method2137()) {
                    this.field2607.method1821(var10);
                }
            }
        }
        arg0.field2571.method1810(arg1, arg2, arg3);
    }

    @ObfuscatedName("ht.k(Lgi;II)V")
    public void method3694(class206 arg0, int arg1) {
        if ((this.field2601.field2540[arg0.field2564] & 0x4) != 0 && arg0.field2572 < 0) {
            int var3 = this.field2601.field2545[arg0.field2564] / Statics.field463;
            int var4 = (var3 + 1048575 - arg0.field2578) / var3;
            arg0.field2578 = arg0.field2578 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2601.field2541[arg0.field2564] == 0) {
                    arg0.field2571 = class116.method2148(arg0.field2560, arg0.field2571.method2056(), arg0.field2571.method2146(), arg0.field2571.method2058());
                } else {
                    arg0.field2571 = class116.method2148(arg0.field2560, arg0.field2571.method2056(), 0, arg0.field2571.method2058());
                    this.field2601.method3517(arg0, arg0.field2559.field2595[arg0.field2575] < 0);
                }
                if (arg0.field2559.field2595[arg0.field2575] < 0) {
                    arg0.field2571.method2142(-1);
                }
                arg1 = arg0.field2578 / var3;
            }
        }
        arg0.field2571.method1790(arg1);
    }
}
