package deob;

@ObfuscatedName("fz")
public class class177 extends class62 {

    @ObfuscatedName("fz.p")
    public class175 field2904;

    @ObfuscatedName("fz.k")
    public class190 field2903 = new class190();

    @ObfuscatedName("fz.e")
    public class51 field2902 = new class51();

    public class177(class175 arg0) {
        this.field2904 = arg0;
    }

    @ObfuscatedName("fz.t()Lbv;")
    public class62 method1001() {
        class178 var1 = (class178) this.field2903.method3442();
        if (var1 == null) {
            return null;
        } else if (var1.field2924 == null) {
            return this.method991();
        } else {
            return var1.field2924;
        }
    }

    @ObfuscatedName("fz.s()Lbv;")
    public class62 method991() {
        class178 var1;
        do {
            var1 = (class178) this.field2903.method3444();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2924 == null);
        return var1.field2924;
    }

    @ObfuscatedName("fz.c()I")
    public int method992() {
        return 0;
    }

    @ObfuscatedName("fz.d([III)V")
    public void method986(int[] arg0, int arg1, int arg2) {
        this.field2902.method986(arg0, arg1, arg2);
        for (class178 var4 = (class178) this.field2903.method3442(); var4 != null; var4 = (class178) this.field2903.method3444()) {
            if (!this.field2904.method3275(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2928) {
                        this.method3349(var4, arg0, var5, var6, var5 + var6);
                        var4.field2928 -= var6;
                        break;
                    }
                    this.method3349(var4, arg0, var5, var4.field2928, var5 + var6);
                    var5 += var4.field2928;
                    var6 -= var4.field2928;
                } while (!this.field2904.method3276(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fz.m(I)V")
    public void method995(int arg0) {
        this.field2902.method995(arg0);
        for (class178 var2 = (class178) this.field2903.method3442(); var2 != null; var2 = (class178) this.field2903.method3444()) {
            if (!this.field2904.method3275(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2928) {
                        this.method3348(var2, var3);
                        var2.field2928 -= var3;
                        break;
                    }
                    this.method3348(var2, var2.field2928);
                    var3 -= var2.field2928;
                } while (!this.field2904.method3276(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fz.p(Lfq;[IIIII)V")
    public void method3349(class178 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2904.field2873[arg0.field2915] & 0x4) != 0 && arg0.field2910 < 0) {
            int var6 = this.field2904.field2875[arg0.field2915] / Statics.field1494;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2929) / var6;
                if (var7 > arg3) {
                    arg0.field2929 += arg3 * var6;
                    break;
                }
                arg0.field2924.method986(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2929 += var6 * var7 - 1048576;
                int var8 = Statics.field1494 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class60 var10 = arg0.field2924;
                if (this.field2904.field2876[arg0.field2915] == 0) {
                    arg0.field2924 = class60.method1138(arg0.field2916, var10.method1195(), var10.method1144(), var10.method1145());
                } else {
                    arg0.field2924 = class60.method1138(arg0.field2916, var10.method1195(), 0, var10.method1145());
                    this.field2904.method3258(arg0, arg0.field2927.field2831[arg0.field2914] < 0);
                    arg0.field2924.method1149(var8, var10.method1144());
                }
                if (arg0.field2927.field2831[arg0.field2914] < 0) {
                    arg0.field2924.method1140(-1);
                }
                var10.method1209(var8);
                var10.method986(arg1, arg2, arg4 - arg2);
                if (var10.method1154()) {
                    this.field2902.method1006(var10);
                }
            }
        }
        arg0.field2924.method986(arg1, arg2, arg3);
    }

    @ObfuscatedName("fz.k(Lfq;II)V")
    public void method3348(class178 arg0, int arg1) {
        if ((this.field2904.field2873[arg0.field2915] & 0x4) != 0 && arg0.field2910 < 0) {
            int var3 = this.field2904.field2875[arg0.field2915] / Statics.field1494;
            int var4 = (var3 + 1048575 - arg0.field2929) / var3;
            arg0.field2929 = arg0.field2929 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2904.field2876[arg0.field2915] == 0) {
                    arg0.field2924 = class60.method1138(arg0.field2916, arg0.field2924.method1195(), arg0.field2924.method1144(), arg0.field2924.method1145());
                } else {
                    arg0.field2924 = class60.method1138(arg0.field2916, arg0.field2924.method1195(), 0, arg0.field2924.method1145());
                    this.field2904.method3258(arg0, arg0.field2927.field2831[arg0.field2914] < 0);
                }
                if (arg0.field2927.field2831[arg0.field2914] < 0) {
                    arg0.field2924.method1140(-1);
                }
                arg1 = arg0.field2929 / var3;
            }
        }
        arg0.field2924.method995(arg1);
    }
}
