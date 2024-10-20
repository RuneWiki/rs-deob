package deob;

@ObfuscatedName("fp")
public class class177 extends class62 {

    @ObfuscatedName("fp.n")
    public class175 field2906;

    @ObfuscatedName("fp.i")
    public class190 field2904 = new class190();

    @ObfuscatedName("fp.e")
    public class51 field2905 = new class51();

    public class177(class175 arg0) {
        this.field2906 = arg0;
    }

    @ObfuscatedName("fp.q()Lba;")
    public class62 method1005() {
        class178 var1 = (class178) this.field2904.method3382();
        if (var1 == null) {
            return null;
        } else if (var1.field2911 == null) {
            return this.method1006();
        } else {
            return var1.field2911;
        }
    }

    @ObfuscatedName("fp.l()Lba;")
    public class62 method1006() {
        class178 var1;
        do {
            var1 = (class178) this.field2904.method3384();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2911 == null);
        return var1.field2911;
    }

    @ObfuscatedName("fp.c()I")
    public int method1007() {
        return 0;
    }

    @ObfuscatedName("fp.f([III)V")
    public void method1008(int[] arg0, int arg1, int arg2) {
        this.field2905.method1008(arg0, arg1, arg2);
        for (class178 var4 = (class178) this.field2904.method3382(); var4 != null; var4 = (class178) this.field2904.method3384()) {
            if (!this.field2906.method3282(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2915) {
                        this.method3293(var4, arg0, var5, var6, var5 + var6);
                        var4.field2915 -= var6;
                        break;
                    }
                    this.method3293(var4, arg0, var5, var4.field2915, var5 + var6);
                    var5 += var4.field2915;
                    var6 -= var4.field2915;
                } while (!this.field2906.method3217(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fp.m(I)V")
    public void method1010(int arg0) {
        this.field2905.method1010(arg0);
        for (class178 var2 = (class178) this.field2904.method3382(); var2 != null; var2 = (class178) this.field2904.method3384()) {
            if (!this.field2906.method3282(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2915) {
                        this.method3294(var2, var3);
                        var2.field2915 -= var3;
                        break;
                    }
                    this.method3294(var2, var2.field2915);
                    var3 -= var2.field2915;
                } while (!this.field2906.method3217(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fp.n(Lfo;[IIIII)V")
    public void method3293(class178 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2906.field2877[arg0.field2927] & 0x4) != 0 && arg0.field2922 < 0) {
            int var6 = this.field2906.field2883[arg0.field2927] / Statics.field1118;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2921) / var6;
                if (var7 > arg3) {
                    arg0.field2921 += arg3 * var6;
                    break;
                }
                arg0.field2911.method1008(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2921 += var6 * var7 - 1048576;
                int var8 = Statics.field1118 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class60 var10 = arg0.field2911;
                if (this.field2906.field2880[arg0.field2927] == 0) {
                    arg0.field2911 = class60.method1139(arg0.field2910, var10.method1154(), var10.method1269(), var10.method1205());
                } else {
                    arg0.field2911 = class60.method1139(arg0.field2910, var10.method1154(), 0, var10.method1205());
                    this.field2906.method3200(arg0, arg0.field2923.field2832[arg0.field2913] < 0);
                    arg0.field2911.method1150(var8, var10.method1269());
                }
                if (arg0.field2923.field2832[arg0.field2913] < 0) {
                    arg0.field2911.method1176(-1);
                }
                var10.method1152(var8);
                var10.method1008(arg1, arg2, arg4 - arg2);
                if (var10.method1156()) {
                    this.field2905.method1000(var10);
                }
            }
        }
        arg0.field2911.method1008(arg1, arg2, arg3);
    }

    @ObfuscatedName("fp.w(Lfo;II)V")
    public void method3294(class178 arg0, int arg1) {
        if ((this.field2906.field2877[arg0.field2927] & 0x4) != 0 && arg0.field2922 < 0) {
            int var3 = this.field2906.field2883[arg0.field2927] / Statics.field1118;
            int var4 = (var3 + 1048575 - arg0.field2921) / var3;
            arg0.field2921 = arg0.field2921 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2906.field2880[arg0.field2927] == 0) {
                    arg0.field2911 = class60.method1139(arg0.field2910, arg0.field2911.method1154(), arg0.field2911.method1269(), arg0.field2911.method1205());
                } else {
                    arg0.field2911 = class60.method1139(arg0.field2910, arg0.field2911.method1154(), 0, arg0.field2911.method1205());
                    this.field2906.method3200(arg0, arg0.field2923.field2832[arg0.field2913] < 0);
                }
                if (arg0.field2923.field2832[arg0.field2913] < 0) {
                    arg0.field2911.method1176(-1);
                }
                arg1 = arg0.field2921 / var3;
            }
        }
        arg0.field2911.method1010(arg1);
    }
}
