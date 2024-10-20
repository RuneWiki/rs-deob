package deob;

@ObfuscatedName("ff")
public class class167 extends class61 {

    @ObfuscatedName("ff.x")
    public class165 field2777;

    @ObfuscatedName("ff.v")
    public class180 field2775 = new class180();

    @ObfuscatedName("ff.m")
    public class50 field2776 = new class50();

    public class167(class165 arg0) {
        this.field2777 = arg0;
    }

    @ObfuscatedName("ff.p()Lbh;")
    public class61 method977() {
        class168 var1 = (class168) this.field2775.method3251();
        if (var1 == null) {
            return null;
        } else if (var1.field2796 == null) {
            return this.method975();
        } else {
            return var1.field2796;
        }
    }

    @ObfuscatedName("ff.j()Lbh;")
    public class61 method975() {
        class168 var1;
        do {
            var1 = (class168) this.field2775.method3272();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2796 == null);
        return var1.field2796;
    }

    @ObfuscatedName("ff.i()I")
    public int method979() {
        return 0;
    }

    @ObfuscatedName("ff.u([III)V")
    public void method980(int[] arg0, int arg1, int arg2) {
        this.field2776.method980(arg0, arg1, arg2);
        for (class168 var4 = (class168) this.field2775.method3251(); var4 != null; var4 = (class168) this.field2775.method3272()) {
            if (!this.field2777.method3079(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2784) {
                        this.method3157(var4, arg0, var5, var6, var5 + var6);
                        var4.field2784 -= var6;
                        break;
                    }
                    this.method3157(var4, arg0, var5, var4.field2784, var5 + var6);
                    var5 += var4.field2784;
                    var6 -= var4.field2784;
                } while (!this.field2777.method3136(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ff.k(I)V")
    public void method982(int arg0) {
        this.field2776.method982(arg0);
        for (class168 var2 = (class168) this.field2775.method3251(); var2 != null; var2 = (class168) this.field2775.method3272()) {
            if (!this.field2777.method3079(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2784) {
                        this.method3158(var2, var3);
                        var2.field2784 -= var3;
                        break;
                    }
                    this.method3158(var2, var2.field2784);
                    var3 -= var2.field2784;
                } while (!this.field2777.method3136(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ff.x(Lfl;[IIIIB)V")
    public void method3157(class168 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2777.field2745[arg0.field2788] & 0x4) != 0 && arg0.field2792 < 0) {
            int var6 = this.field2777.field2750[arg0.field2788] / Statics.field1096;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2798) / var6;
                if (var7 > arg3) {
                    arg0.field2798 += arg3 * var6;
                    break;
                }
                arg0.field2796.method980(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2798 += var6 * var7 - 1048576;
                int var8 = Statics.field1096 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class59 var10 = arg0.field2796;
                if (this.field2777.field2735[arg0.field2788] == 0) {
                    arg0.field2796 = class59.method1134(arg0.field2780, var10.method1142(), var10.method1140(), var10.method1141());
                } else {
                    arg0.field2796 = class59.method1134(arg0.field2780, var10.method1142(), 0, var10.method1141());
                    this.field2777.method3058(arg0, arg0.field2779.field2699[arg0.field2783] < 0);
                    arg0.field2796.method1145(var8, var10.method1140());
                }
                if (arg0.field2779.field2699[arg0.field2783] < 0) {
                    arg0.field2796.method1136(-1);
                }
                var10.method1147(var8);
                var10.method980(arg1, arg2, arg4 - arg2);
                if (var10.method1151()) {
                    this.field2776.method972(var10);
                }
            }
        }
        arg0.field2796.method980(arg1, arg2, arg3);
    }

    @ObfuscatedName("ff.v(Lfl;II)V")
    public void method3158(class168 arg0, int arg1) {
        if ((this.field2777.field2745[arg0.field2788] & 0x4) != 0 && arg0.field2792 < 0) {
            int var3 = this.field2777.field2750[arg0.field2788] / Statics.field1096;
            int var4 = (var3 + 1048575 - arg0.field2798) / var3;
            arg0.field2798 = arg0.field2798 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2777.field2735[arg0.field2788] == 0) {
                    arg0.field2796 = class59.method1134(arg0.field2780, arg0.field2796.method1142(), arg0.field2796.method1140(), arg0.field2796.method1141());
                } else {
                    arg0.field2796 = class59.method1134(arg0.field2780, arg0.field2796.method1142(), 0, arg0.field2796.method1141());
                    this.field2777.method3058(arg0, arg0.field2779.field2699[arg0.field2783] < 0);
                }
                if (arg0.field2779.field2699[arg0.field2783] < 0) {
                    arg0.field2796.method1136(-1);
                }
                arg1 = arg0.field2798 / var3;
            }
        }
        arg0.field2796.method982(arg1);
    }
}
