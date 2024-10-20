package deob;

@ObfuscatedName("he")
public class class209 extends class120 {

    @ObfuscatedName("he.i")
    public class205 field2594;

    @ObfuscatedName("he.a")
    public class194 field2595 = new class194();

    @ObfuscatedName("he.t")
    public class103 field2596 = new class103();

    public class209(class205 arg0) {
        this.field2594 = arg0;
    }

    @ObfuscatedName("he.r()Ldq;")
    public class120 method1734() {
        class206 var1 = (class206) this.field2595.method3303();
        if (var1 == null) {
            return null;
        } else if (var1.field2565 == null) {
            return this.method1742();
        } else {
            return var1.field2565;
        }
    }

    @ObfuscatedName("he.v()Ldq;")
    public class120 method1742() {
        class206 var1;
        do {
            var1 = (class206) this.field2595.method3297();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2565 == null);
        return var1.field2565;
    }

    @ObfuscatedName("he.y()I")
    public int method1748() {
        return 0;
    }

    @ObfuscatedName("he.j([III)V")
    public void method1737(int[] arg0, int arg1, int arg2) {
        this.field2596.method1737(arg0, arg1, arg2);
        for (class206 var4 = (class206) this.field2595.method3303(); var4 != null; var4 = (class206) this.field2595.method3297()) {
            if (!this.field2594.method3414(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2564) {
                        this.method3563(var4, arg0, var5, var6, var5 + var6);
                        var4.field2564 -= var6;
                        break;
                    }
                    this.method3563(var4, arg0, var5, var4.field2564, var5 + var6);
                    var5 += var4.field2564;
                    var6 -= var4.field2564;
                } while (!this.field2594.method3415(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("he.e(I)V")
    public void method1739(int arg0) {
        this.field2596.method1739(arg0);
        for (class206 var2 = (class206) this.field2595.method3303(); var2 != null; var2 = (class206) this.field2595.method3297()) {
            if (!this.field2594.method3414(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2564) {
                        this.method3564(var2, var3);
                        var2.field2564 -= var3;
                        break;
                    }
                    this.method3564(var2, var2.field2564);
                    var3 -= var2.field2564;
                } while (!this.field2594.method3415(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("he.i(Lgl;[IIIIS)V")
    public void method3563(class206 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2594.field2532[arg0.field2560] & 0x4) != 0 && arg0.field2561 < 0) {
            int var6 = this.field2594.field2536[arg0.field2560] / Statics.field3212;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2557) / var6;
                if (var7 > arg3) {
                    arg0.field2557 += arg3 * var6;
                    break;
                }
                arg0.field2565.method1737(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2557 += var6 * var7 - 1048576;
                int var8 = Statics.field3212 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class118 var10 = arg0.field2565;
                if (this.field2594.field2534[arg0.field2560] == 0) {
                    arg0.field2565 = class118.method1947(arg0.field2549, var10.method2010(), var10.method1952(), var10.method1953());
                } else {
                    arg0.field2565 = class118.method1947(arg0.field2549, var10.method2010(), 0, var10.method1953());
                    this.field2594.method3424(arg0, arg0.field2548.field2591[arg0.field2552] < 0);
                    arg0.field2565.method1957(var8, var10.method1952());
                }
                if (arg0.field2548.field2591[arg0.field2552] < 0) {
                    arg0.field2565.method1946(-1);
                }
                var10.method1959(var8);
                var10.method1737(arg1, arg2, arg4 - arg2);
                if (var10.method2054()) {
                    this.field2596.method1733(var10);
                }
            }
        }
        arg0.field2565.method1737(arg1, arg2, arg3);
    }

    @ObfuscatedName("he.w(Lgl;II)V")
    public void method3564(class206 arg0, int arg1) {
        if ((this.field2594.field2532[arg0.field2560] & 0x4) != 0 && arg0.field2561 < 0) {
            int var3 = this.field2594.field2536[arg0.field2560] / Statics.field3212;
            int var4 = (var3 + 1048575 - arg0.field2557) / var3;
            arg0.field2557 = arg0.field2557 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2594.field2534[arg0.field2560] == 0) {
                    arg0.field2565 = class118.method1947(arg0.field2549, arg0.field2565.method2010(), arg0.field2565.method1952(), arg0.field2565.method1953());
                } else {
                    arg0.field2565 = class118.method1947(arg0.field2549, arg0.field2565.method2010(), 0, arg0.field2565.method1953());
                    this.field2594.method3424(arg0, arg0.field2548.field2591[arg0.field2552] < 0);
                }
                if (arg0.field2548.field2591[arg0.field2552] < 0) {
                    arg0.field2565.method1946(-1);
                }
                arg1 = arg0.field2557 / var3;
            }
        }
        arg0.field2565.method1739(arg1);
    }
}
