package deob;

@ObfuscatedName("hr")
public class class220 extends class119 {

    @ObfuscatedName("hr.n")
    public class216 field2715;

    @ObfuscatedName("hr.v")
    public class205 field2713 = new class205();

    @ObfuscatedName("hr.y")
    public class102 field2712 = new class102();

    public class220(class216 arg0) {
        this.field2715 = arg0;
    }

    @ObfuscatedName("hr.d()Ldk;")
    public class119 method1779() {
        class217 var1 = (class217) this.field2713.method3492();
        if (var1 == null) {
            return null;
        } else if (var1.field2674 == null) {
            return this.method1778();
        } else {
            return var1.field2674;
        }
    }

    @ObfuscatedName("hr.s()Ldk;")
    public class119 method1778() {
        class217 var1;
        do {
            var1 = (class217) this.field2713.method3481();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2674 == null);
        return var1.field2674;
    }

    @ObfuscatedName("hr.b()I")
    public int method1815() {
        return 0;
    }

    @ObfuscatedName("hr.e([III)V")
    public void method1780(int[] arg0, int arg1, int arg2) {
        this.field2712.method1780(arg0, arg1, arg2);
        for (class217 var4 = (class217) this.field2713.method3492(); var4 != null; var4 = (class217) this.field2713.method3481()) {
            if (!this.field2715.method3602(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2679) {
                        this.method3745(var4, arg0, var5, var6, var5 + var6);
                        var4.field2679 -= var6;
                        break;
                    }
                    this.method3745(var4, arg0, var5, var4.field2679, var5 + var6);
                    var5 += var4.field2679;
                    var6 -= var4.field2679;
                } while (!this.field2715.method3603(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hr.u(I)V")
    public void method1799(int arg0) {
        this.field2712.method1799(arg0);
        for (class217 var2 = (class217) this.field2713.method3492(); var2 != null; var2 = (class217) this.field2713.method3481()) {
            if (!this.field2715.method3602(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2679) {
                        this.method3746(var2, var3);
                        var2.field2679 -= var3;
                        break;
                    }
                    this.method3746(var2, var2.field2679);
                    var3 -= var2.field2679;
                } while (!this.field2715.method3603(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hr.n(Lhb;[IIIII)V")
    public void method3745(class217 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2715.field2651[arg0.field2667] & 0x4) != 0 && arg0.field2668 < 0) {
            int var6 = this.field2715.field2654[arg0.field2667] / Statics.field1542;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2686) / var6;
                if (var7 > arg3) {
                    arg0.field2686 += arg3 * var6;
                    break;
                }
                arg0.field2674.method1780(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2686 += var6 * var7 - 1048576;
                int var8 = Statics.field1542 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class117 var10 = arg0.field2674;
                if (this.field2715.field2652[arg0.field2667] == 0) {
                    arg0.field2674 = class117.method2101(arg0.field2670, var10.method2017(), var10.method2014(), var10.method2006());
                } else {
                    arg0.field2674 = class117.method2101(arg0.field2670, var10.method2017(), 0, var10.method2006());
                    this.field2715.method3664(arg0, arg0.field2680.field2704[arg0.field2671] < 0);
                    arg0.field2674.method2010(var8, var10.method2014());
                }
                if (arg0.field2680.field2704[arg0.field2671] < 0) {
                    arg0.field2674.method2001(-1);
                }
                var10.method2011(var8);
                var10.method1780(arg1, arg2, arg4 - arg2);
                if (var10.method2012()) {
                    this.field2712.method1787(var10);
                }
            }
        }
        arg0.field2674.method1780(arg1, arg2, arg3);
    }

    @ObfuscatedName("hr.v(Lhb;II)V")
    public void method3746(class217 arg0, int arg1) {
        if ((this.field2715.field2651[arg0.field2667] & 0x4) != 0 && arg0.field2668 < 0) {
            int var3 = this.field2715.field2654[arg0.field2667] / Statics.field1542;
            int var4 = (var3 + 1048575 - arg0.field2686) / var3;
            arg0.field2686 = arg0.field2686 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2715.field2652[arg0.field2667] == 0) {
                    arg0.field2674 = class117.method2101(arg0.field2670, arg0.field2674.method2017(), arg0.field2674.method2014(), arg0.field2674.method2006());
                } else {
                    arg0.field2674 = class117.method2101(arg0.field2670, arg0.field2674.method2017(), 0, arg0.field2674.method2006());
                    this.field2715.method3664(arg0, arg0.field2680.field2704[arg0.field2671] < 0);
                }
                if (arg0.field2680.field2704[arg0.field2671] < 0) {
                    arg0.field2674.method2001(-1);
                }
                arg1 = arg0.field2686 / var3;
            }
        }
        arg0.field2674.method1799(arg1);
    }
}
