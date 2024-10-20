package deob;

@ObfuscatedName("fr")
public class class176 extends class62 {

    @ObfuscatedName("fr.e")
    public class174 field2845;

    @ObfuscatedName("fr.a")
    public class189 field2849 = new class189();

    @ObfuscatedName("fr.l")
    public class51 field2844 = new class51();

    public class176(class174 arg0) {
        this.field2845 = arg0;
    }

    @ObfuscatedName("fr.w()Lbu;")
    public class62 method1004() {
        class177 var1 = (class177) this.field2849.method3378();
        if (var1 == null) {
            return null;
        } else if (var1.field2868 == null) {
            return this.method1009();
        } else {
            return var1.field2868;
        }
    }

    @ObfuscatedName("fr.i()Lbu;")
    public class62 method1009() {
        class177 var1;
        do {
            var1 = (class177) this.field2849.method3394();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2868 == null);
        return var1.field2868;
    }

    @ObfuscatedName("fr.r()I")
    public int method1006() {
        return 0;
    }

    @ObfuscatedName("fr.f([III)V")
    public void method1007(int[] arg0, int arg1, int arg2) {
        this.field2844.method1007(arg0, arg1, arg2);
        for (class177 var4 = (class177) this.field2849.method3378(); var4 != null; var4 = (class177) this.field2849.method3394()) {
            if (!this.field2845.method3227(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2869) {
                        this.method3281(var4, arg0, var5, var6, var5 + var6);
                        var4.field2869 -= var6;
                        break;
                    }
                    this.method3281(var4, arg0, var5, var4.field2869, var5 + var6);
                    var5 += var4.field2869;
                    var6 -= var4.field2869;
                } while (!this.field2845.method3198(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fr.o(I)V")
    public void method1030(int arg0) {
        this.field2844.method1030(arg0);
        for (class177 var2 = (class177) this.field2849.method3378(); var2 != null; var2 = (class177) this.field2849.method3394()) {
            if (!this.field2845.method3227(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2869) {
                        this.method3282(var2, var3);
                        var2.field2869 -= var3;
                        break;
                    }
                    this.method3282(var2, var2.field2869);
                    var3 -= var2.field2869;
                } while (!this.field2845.method3198(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fr.e(Lfm;[IIIIB)V")
    public void method3281(class177 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2845.field2817[arg0.field2864] & 0x4) != 0 && arg0.field2850 < 0) {
            int var6 = this.field2845.field2822[arg0.field2864] / Statics.field1064;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2870) / var6;
                if (var7 > arg3) {
                    arg0.field2870 += arg3 * var6;
                    break;
                }
                arg0.field2868.method1007(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2870 += var6 * var7 - 1048576;
                int var8 = Statics.field1064 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class60 var10 = arg0.field2868;
                if (this.field2845.field2820[arg0.field2864] == 0) {
                    arg0.field2868 = class60.method1195(arg0.field2855, var10.method1172(), var10.method1163(), var10.method1255());
                } else {
                    arg0.field2868 = class60.method1195(arg0.field2855, var10.method1172(), 0, var10.method1255());
                    this.field2845.method3175(arg0, arg0.field2851.field2776[arg0.field2859] < 0);
                    arg0.field2868.method1168(var8, var10.method1163());
                }
                if (arg0.field2851.field2776[arg0.field2859] < 0) {
                    arg0.field2868.method1262(-1);
                }
                var10.method1279(var8);
                var10.method1007(arg1, arg2, arg4 - arg2);
                if (var10.method1174()) {
                    this.field2844.method999(var10);
                }
            }
        }
        arg0.field2868.method1007(arg1, arg2, arg3);
    }

    @ObfuscatedName("fr.a(Lfm;IB)V")
    public void method3282(class177 arg0, int arg1) {
        if ((this.field2845.field2817[arg0.field2864] & 0x4) != 0 && arg0.field2850 < 0) {
            int var3 = this.field2845.field2822[arg0.field2864] / Statics.field1064;
            int var4 = (var3 + 1048575 - arg0.field2870) / var3;
            arg0.field2870 = arg0.field2870 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2845.field2820[arg0.field2864] == 0) {
                    arg0.field2868 = class60.method1195(arg0.field2855, arg0.field2868.method1172(), arg0.field2868.method1163(), arg0.field2868.method1255());
                } else {
                    arg0.field2868 = class60.method1195(arg0.field2855, arg0.field2868.method1172(), 0, arg0.field2868.method1255());
                    this.field2845.method3175(arg0, arg0.field2851.field2776[arg0.field2859] < 0);
                }
                if (arg0.field2851.field2776[arg0.field2859] < 0) {
                    arg0.field2868.method1262(-1);
                }
                arg1 = arg0.field2870 / var3;
            }
        }
        arg0.field2868.method1030(arg1);
    }
}
