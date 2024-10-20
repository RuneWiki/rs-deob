package deob;

@ObfuscatedName("hu")
public class class209 extends class120 {

    @ObfuscatedName("hu.n")
    public class205 field2596;

    @ObfuscatedName("hu.p")
    public class194 field2595 = new class194();

    @ObfuscatedName("hu.i")
    public class103 field2597 = new class103();

    public class209(class205 arg0) {
        this.field2596 = arg0;
    }

    @ObfuscatedName("hu.m()Ldp;")
    public class120 method1757() {
        class206 var1 = (class206) this.field2595.method3372();
        if (var1 == null) {
            return null;
        } else if (var1.field2561 == null) {
            return this.method1737();
        } else {
            return var1.field2561;
        }
    }

    @ObfuscatedName("hu.c()Ldp;")
    public class120 method1737() {
        class206 var1;
        do {
            var1 = (class206) this.field2595.method3358();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2561 == null);
        return var1.field2561;
    }

    @ObfuscatedName("hu.z()I")
    public int method1736() {
        return 0;
    }

    @ObfuscatedName("hu.h([III)V")
    public void method1752(int[] arg0, int arg1, int arg2) {
        this.field2597.method1752(arg0, arg1, arg2);
        for (class206 var4 = (class206) this.field2595.method3372(); var4 != null; var4 = (class206) this.field2595.method3358()) {
            if (!this.field2596.method3486(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2569) {
                        this.method3643(var4, arg0, var5, var6, var5 + var6);
                        var4.field2569 -= var6;
                        break;
                    }
                    this.method3643(var4, arg0, var5, var4.field2569, var5 + var6);
                    var5 += var4.field2569;
                    var6 -= var4.field2569;
                } while (!this.field2596.method3487(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hu.e(I)V")
    public void method1741(int arg0) {
        this.field2597.method1741(arg0);
        for (class206 var2 = (class206) this.field2595.method3372(); var2 != null; var2 = (class206) this.field2595.method3358()) {
            if (!this.field2596.method3486(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2569) {
                        this.method3641(var2, var3);
                        var2.field2569 -= var3;
                        break;
                    }
                    this.method3641(var2, var2.field2569);
                    var3 -= var2.field2569;
                } while (!this.field2596.method3487(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hu.n(Lga;[IIIII)V")
    public void method3643(class206 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2596.field2533[arg0.field2552] & 0x4) != 0 && arg0.field2564 < 0) {
            int var6 = this.field2596.field2538[arg0.field2552] / Statics.field1634;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2550) / var6;
                if (var7 > arg3) {
                    arg0.field2550 += arg3 * var6;
                    break;
                }
                arg0.field2561.method1752(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2550 += var6 * var7 - 1048576;
                int var8 = Statics.field1634 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class118 var10 = arg0.field2561;
                if (this.field2596.field2521[arg0.field2552] == 0) {
                    arg0.field2561 = class118.method1964(arg0.field2557, var10.method2024(), var10.method1959(), var10.method1982());
                } else {
                    arg0.field2561 = class118.method1964(arg0.field2557, var10.method2024(), 0, var10.method1982());
                    this.field2596.method3470(arg0, arg0.field2551.field2587[arg0.field2559] < 0);
                    arg0.field2561.method1975(var8, var10.method1959());
                }
                if (arg0.field2551.field2587[arg0.field2559] < 0) {
                    arg0.field2561.method1966(-1);
                }
                var10.method1977(var8);
                var10.method1752(arg1, arg2, arg4 - arg2);
                if (var10.method1974()) {
                    this.field2597.method1731(var10);
                }
            }
        }
        arg0.field2561.method1752(arg1, arg2, arg3);
    }

    @ObfuscatedName("hu.p(Lga;II)V")
    public void method3641(class206 arg0, int arg1) {
        if ((this.field2596.field2533[arg0.field2552] & 0x4) != 0 && arg0.field2564 < 0) {
            int var3 = this.field2596.field2538[arg0.field2552] / Statics.field1634;
            int var4 = (var3 + 1048575 - arg0.field2550) / var3;
            arg0.field2550 = arg0.field2550 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2596.field2521[arg0.field2552] == 0) {
                    arg0.field2561 = class118.method1964(arg0.field2557, arg0.field2561.method2024(), arg0.field2561.method1959(), arg0.field2561.method1982());
                } else {
                    arg0.field2561 = class118.method1964(arg0.field2557, arg0.field2561.method2024(), 0, arg0.field2561.method1982());
                    this.field2596.method3470(arg0, arg0.field2551.field2587[arg0.field2559] < 0);
                }
                if (arg0.field2551.field2587[arg0.field2559] < 0) {
                    arg0.field2561.method1966(-1);
                }
                arg1 = arg0.field2550 / var3;
            }
        }
        arg0.field2561.method1741(arg1);
    }
}
