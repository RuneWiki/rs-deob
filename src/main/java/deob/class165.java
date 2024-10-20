package deob;

@ObfuscatedName("fn")
public class class165 extends class60 {

    @ObfuscatedName("fn.k")
    public class163 field2766;

    @ObfuscatedName("fn.y")
    public class178 field2768 = new class178();

    @ObfuscatedName("fn.s")
    public class49 field2767 = new class49();

    public class165(class163 arg0) {
        this.field2766 = arg0;
    }

    @ObfuscatedName("fn.l()Lbl;")
    public class60 method951() {
        class166 var1 = (class166) this.field2768.method3301();
        if (var1 == null) {
            return null;
        } else if (var1.field2790 == null) {
            return this.method950();
        } else {
            return var1.field2790;
        }
    }

    @ObfuscatedName("fn.e()Lbl;")
    public class60 method950() {
        class166 var1;
        do {
            var1 = (class166) this.field2768.method3278();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2790 == null);
        return var1.field2790;
    }

    @ObfuscatedName("fn.u()I")
    public int method984() {
        return 0;
    }

    @ObfuscatedName("fn.j([III)V")
    public void method954(int[] arg0, int arg1, int arg2) {
        this.field2767.method954(arg0, arg1, arg2);
        for (class166 var4 = (class166) this.field2768.method3301(); var4 != null; var4 = (class166) this.field2768.method3278()) {
            if (!this.field2766.method3139(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2779) {
                        this.method3179(var4, arg0, var5, var6, var5 + var6);
                        var4.field2779 -= var6;
                        break;
                    }
                    this.method3179(var4, arg0, var5, var4.field2779, var5 + var6);
                    var5 += var4.field2779;
                    var6 -= var4.field2779;
                } while (!this.field2766.method3146(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fn.d(I)V")
    public void method956(int arg0) {
        this.field2767.method956(arg0);
        for (class166 var2 = (class166) this.field2768.method3301(); var2 != null; var2 = (class166) this.field2768.method3278()) {
            if (!this.field2766.method3139(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2779) {
                        this.method3180(var2, var3);
                        var2.field2779 -= var3;
                        break;
                    }
                    this.method3180(var2, var2.field2779);
                    var3 -= var2.field2779;
                } while (!this.field2766.method3146(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fn.k(Lfr;[IIIII)V")
    public void method3179(class166 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2766.field2741[arg0.field2784] & 0x4) != 0 && arg0.field2786 < 0) {
            int var6 = this.field2766.field2746[arg0.field2784] / Statics.field1074;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2792) / var6;
                if (var7 > arg3) {
                    arg0.field2792 += arg3 * var6;
                    break;
                }
                arg0.field2790.method954(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2792 += var6 * var7 - 1048576;
                int var8 = Statics.field1074 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2790;
                if (this.field2766.field2744[arg0.field2784] == 0) {
                    arg0.field2790 = class58.method1110(arg0.field2774, var10.method1125(), var10.method1116(), var10.method1117());
                } else {
                    arg0.field2790 = class58.method1110(arg0.field2774, var10.method1125(), 0, var10.method1117());
                    this.field2766.method3089(arg0, arg0.field2773.field2696[arg0.field2772] < 0);
                    arg0.field2790.method1121(var8, var10.method1116());
                }
                if (arg0.field2773.field2696[arg0.field2772] < 0) {
                    arg0.field2790.method1112(-1);
                }
                var10.method1123(var8);
                var10.method954(arg1, arg2, arg4 - arg2);
                if (var10.method1150()) {
                    this.field2767.method946(var10);
                }
            }
        }
        arg0.field2790.method954(arg1, arg2, arg3);
    }

    @ObfuscatedName("fn.y(Lfr;II)V")
    public void method3180(class166 arg0, int arg1) {
        if ((this.field2766.field2741[arg0.field2784] & 0x4) != 0 && arg0.field2786 < 0) {
            int var3 = this.field2766.field2746[arg0.field2784] / Statics.field1074;
            int var4 = (var3 + 1048575 - arg0.field2792) / var3;
            arg0.field2792 = arg0.field2792 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2766.field2744[arg0.field2784] == 0) {
                    arg0.field2790 = class58.method1110(arg0.field2774, arg0.field2790.method1125(), arg0.field2790.method1116(), arg0.field2790.method1117());
                } else {
                    arg0.field2790 = class58.method1110(arg0.field2774, arg0.field2790.method1125(), 0, arg0.field2790.method1117());
                    this.field2766.method3089(arg0, arg0.field2773.field2696[arg0.field2772] < 0);
                }
                if (arg0.field2773.field2696[arg0.field2772] < 0) {
                    arg0.field2790.method1112(-1);
                }
                arg1 = arg0.field2792 / var3;
            }
        }
        arg0.field2790.method956(arg1);
    }
}
