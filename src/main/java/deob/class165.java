package deob;

@ObfuscatedName("fx")
public class class165 extends class60 {

    @ObfuscatedName("fx.p")
    public class163 field2768;

    @ObfuscatedName("fx.g")
    public class178 field2767 = new class178();

    @ObfuscatedName("fx.x")
    public class49 field2766 = new class49();

    public class165(class163 arg0) {
        this.field2768 = arg0;
    }

    @ObfuscatedName("fx.s()Lbn;")
    public class60 method1005() {
        class166 var1 = (class166) this.field2767.method3303();
        if (var1 == null) {
            return null;
        } else if (var1.field2787 == null) {
            return this.method1029();
        } else {
            return var1.field2787;
        }
    }

    @ObfuscatedName("fx.r()Lbn;")
    public class60 method1029() {
        class166 var1;
        do {
            var1 = (class166) this.field2767.method3300();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2787 == null);
        return var1.field2787;
    }

    @ObfuscatedName("fx.w()I")
    public int method1030() {
        return 0;
    }

    @ObfuscatedName("fx.u([III)V")
    public void method1008(int[] arg0, int arg1, int arg2) {
        this.field2766.method1008(arg0, arg1, arg2);
        for (class166 var4 = (class166) this.field2767.method3303(); var4 != null; var4 = (class166) this.field2767.method3300()) {
            if (!this.field2768.method3167(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2788) {
                        this.method3207(var4, arg0, var5, var6, var5 + var6);
                        var4.field2788 -= var6;
                        break;
                    }
                    this.method3207(var4, arg0, var5, var4.field2788, var5 + var6);
                    var5 += var4.field2788;
                    var6 -= var4.field2788;
                } while (!this.field2768.method3132(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fx.h(I)V")
    public void method1010(int arg0) {
        this.field2766.method1010(arg0);
        for (class166 var2 = (class166) this.field2767.method3303(); var2 != null; var2 = (class166) this.field2767.method3300()) {
            if (!this.field2768.method3167(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2788) {
                        this.method3208(var2, var3);
                        var2.field2788 -= var3;
                        break;
                    }
                    this.method3208(var2, var2.field2788);
                    var3 -= var2.field2788;
                } while (!this.field2768.method3132(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fx.p(Lfr;[IIIII)V")
    public void method3207(class166 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2768.field2737[arg0.field2785] & 0x4) != 0 && arg0.field2769 < 0) {
            int var6 = this.field2768.field2742[arg0.field2785] / Statics.field2674;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2778) / var6;
                if (var7 > arg3) {
                    arg0.field2778 += arg3 * var6;
                    break;
                }
                arg0.field2787.method1008(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2778 += var6 * var7 - 1048576;
                int var8 = Statics.field2674 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2787;
                if (this.field2768.field2740[arg0.field2785] == 0) {
                    arg0.field2787 = class58.method1267(arg0.field2771, var10.method1170(), var10.method1234(), var10.method1159());
                } else {
                    arg0.field2787 = class58.method1267(arg0.field2771, var10.method1170(), 0, var10.method1159());
                    this.field2768.method3115(arg0, arg0.field2770.field2702[arg0.field2774] < 0);
                    arg0.field2787.method1163(var8, var10.method1234());
                }
                if (arg0.field2770.field2702[arg0.field2774] < 0) {
                    arg0.field2787.method1265(-1);
                }
                var10.method1226(var8);
                var10.method1008(arg1, arg2, arg4 - arg2);
                if (var10.method1169()) {
                    this.field2766.method1001(var10);
                }
            }
        }
        arg0.field2787.method1008(arg1, arg2, arg3);
    }

    @ObfuscatedName("fx.g(Lfr;II)V")
    public void method3208(class166 arg0, int arg1) {
        if ((this.field2768.field2737[arg0.field2785] & 0x4) != 0 && arg0.field2769 < 0) {
            int var3 = this.field2768.field2742[arg0.field2785] / Statics.field2674;
            int var4 = (var3 + 1048575 - arg0.field2778) / var3;
            arg0.field2778 = arg0.field2778 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2768.field2740[arg0.field2785] == 0) {
                    arg0.field2787 = class58.method1267(arg0.field2771, arg0.field2787.method1170(), arg0.field2787.method1234(), arg0.field2787.method1159());
                } else {
                    arg0.field2787 = class58.method1267(arg0.field2771, arg0.field2787.method1170(), 0, arg0.field2787.method1159());
                    this.field2768.method3115(arg0, arg0.field2770.field2702[arg0.field2774] < 0);
                }
                if (arg0.field2770.field2702[arg0.field2774] < 0) {
                    arg0.field2787.method1265(-1);
                }
                arg1 = arg0.field2778 / var3;
            }
        }
        arg0.field2787.method1010(arg1);
    }
}
