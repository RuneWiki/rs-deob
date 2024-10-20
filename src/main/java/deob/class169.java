package deob;

@ObfuscatedName("fw")
public class class169 extends class61 {

    @ObfuscatedName("fw.p")
    public class167 field2784;

    @ObfuscatedName("fw.y")
    public class182 field2785 = new class182();

    @ObfuscatedName("fw.d")
    public class50 field2786 = new class50();

    public class169(class167 arg0) {
        this.field2784 = arg0;
    }

    @ObfuscatedName("fw.f()Lbw;")
    public class61 method983() {
        class170 var1 = (class170) this.field2785.method3270();
        if (var1 == null) {
            return null;
        } else if (var1.field2808 == null) {
            return this.method984();
        } else {
            return var1.field2808;
        }
    }

    @ObfuscatedName("fw.z()Lbw;")
    public class61 method984() {
        class170 var1;
        do {
            var1 = (class170) this.field2785.method3262();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2808 == null);
        return var1.field2808;
    }

    @ObfuscatedName("fw.o()I")
    public int method985() {
        return 0;
    }

    @ObfuscatedName("fw.k([III)V")
    public void method986(int[] arg0, int arg1, int arg2) {
        this.field2786.method986(arg0, arg1, arg2);
        for (class170 var4 = (class170) this.field2785.method3270(); var4 != null; var4 = (class170) this.field2785.method3262()) {
            if (!this.field2784.method3069(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2809) {
                        this.method3171(var4, arg0, var5, var6, var5 + var6);
                        var4.field2809 -= var6;
                        break;
                    }
                    this.method3171(var4, arg0, var5, var4.field2809, var5 + var6);
                    var5 += var4.field2809;
                    var6 -= var4.field2809;
                } while (!this.field2784.method3118(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fw.h(I)V")
    public void method977(int arg0) {
        this.field2786.method977(arg0);
        for (class170 var2 = (class170) this.field2785.method3270(); var2 != null; var2 = (class170) this.field2785.method3262()) {
            if (!this.field2784.method3069(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2809) {
                        this.method3175(var2, var3);
                        var2.field2809 -= var3;
                        break;
                    }
                    this.method3175(var2, var2.field2809);
                    var3 -= var2.field2809;
                } while (!this.field2784.method3118(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fw.p(Lfc;[IIIIB)V")
    public void method3171(class170 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2784.field2759[arg0.field2795] & 0x4) != 0 && arg0.field2804 < 0) {
            int var6 = this.field2784.field2748[arg0.field2795] / Statics.field1071;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2811) / var6;
                if (var7 > arg3) {
                    arg0.field2811 += arg3 * var6;
                    break;
                }
                arg0.field2808.method986(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2811 += var6 * var7 - 1048576;
                int var8 = Statics.field1071 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class59 var10 = arg0.field2808;
                if (this.field2784.field2763[arg0.field2795] == 0) {
                    arg0.field2808 = class59.method1261(arg0.field2792, var10.method1143(), var10.method1264(), var10.method1124());
                } else {
                    arg0.field2808 = class59.method1261(arg0.field2792, var10.method1143(), 0, var10.method1124());
                    this.field2784.method3092(arg0, arg0.field2791.field2711[arg0.field2801] < 0);
                    arg0.field2808.method1139(var8, var10.method1264());
                }
                if (arg0.field2791.field2711[arg0.field2801] < 0) {
                    arg0.field2808.method1248(-1);
                }
                var10.method1141(var8);
                var10.method986(arg1, arg2, arg4 - arg2);
                if (var10.method1208()) {
                    this.field2786.method978(var10);
                }
            }
        }
        arg0.field2808.method986(arg1, arg2, arg3);
    }

    @ObfuscatedName("fw.y(Lfc;II)V")
    public void method3175(class170 arg0, int arg1) {
        if ((this.field2784.field2759[arg0.field2795] & 0x4) != 0 && arg0.field2804 < 0) {
            int var3 = this.field2784.field2748[arg0.field2795] / Statics.field1071;
            int var4 = (var3 + 1048575 - arg0.field2811) / var3;
            arg0.field2811 = arg0.field2811 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2784.field2763[arg0.field2795] == 0) {
                    arg0.field2808 = class59.method1261(arg0.field2792, arg0.field2808.method1143(), arg0.field2808.method1264(), arg0.field2808.method1124());
                } else {
                    arg0.field2808 = class59.method1261(arg0.field2792, arg0.field2808.method1143(), 0, arg0.field2808.method1124());
                    this.field2784.method3092(arg0, arg0.field2791.field2711[arg0.field2801] < 0);
                }
                if (arg0.field2791.field2711[arg0.field2801] < 0) {
                    arg0.field2808.method1248(-1);
                }
                arg1 = arg0.field2811 / var3;
            }
        }
        arg0.field2808.method977(arg1);
    }
}
