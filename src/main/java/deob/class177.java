package deob;

@ObfuscatedName("fr")
public class class177 extends class62 {

    @ObfuscatedName("fr.b")
    public class175 field2893;

    @ObfuscatedName("fr.e")
    public class190 field2889 = new class190();

    @ObfuscatedName("fr.a")
    public class51 field2890 = new class51();

    public class177(class175 arg0) {
        this.field2893 = arg0;
    }

    @ObfuscatedName("fr.l()Lbk;")
    public class62 method976() {
        class178 var1 = (class178) this.field2889.method3324();
        if (var1 == null) {
            return null;
        } else if (var1.field2895 == null) {
            return this.method984();
        } else {
            return var1.field2895;
        }
    }

    @ObfuscatedName("fr.u()Lbk;")
    public class62 method984() {
        class178 var1;
        do {
            var1 = (class178) this.field2889.method3326();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2895 == null);
        return var1.field2895;
    }

    @ObfuscatedName("fr.o()I")
    public int method978() {
        return 0;
    }

    @ObfuscatedName("fr.m([III)V")
    public void method979(int[] arg0, int arg1, int arg2) {
        this.field2890.method979(arg0, arg1, arg2);
        for (class178 var4 = (class178) this.field2889.method3324(); var4 != null; var4 = (class178) this.field2889.method3326()) {
            if (!this.field2893.method3173(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2914) {
                        this.method3237(var4, arg0, var5, var6, var5 + var6);
                        var4.field2914 -= var6;
                        break;
                    }
                    this.method3237(var4, arg0, var5, var4.field2914, var5 + var6);
                    var5 += var4.field2914;
                    var6 -= var4.field2914;
                } while (!this.field2893.method3164(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fr.v(I)V")
    public void method981(int arg0) {
        this.field2890.method981(arg0);
        for (class178 var2 = (class178) this.field2889.method3324(); var2 != null; var2 = (class178) this.field2889.method3326()) {
            if (!this.field2893.method3173(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2914) {
                        this.method3236(var2, var3);
                        var2.field2914 -= var3;
                        break;
                    }
                    this.method3236(var2, var2.field2914);
                    var3 -= var2.field2914;
                } while (!this.field2893.method3164(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fr.b(Lfb;[IIIII)V")
    public void method3237(class178 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2893.field2861[arg0.field2915] & 0x4) != 0 && arg0.field2913 < 0) {
            int var6 = this.field2893.field2858[arg0.field2915] / Statics.field1124;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2906) / var6;
                if (var7 > arg3) {
                    arg0.field2906 += arg3 * var6;
                    break;
                }
                arg0.field2895.method979(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2906 += var6 * var7 - 1048576;
                int var8 = Statics.field1124 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class60 var10 = arg0.field2895;
                if (this.field2893.field2864[arg0.field2915] == 0) {
                    arg0.field2895 = class60.method1169(arg0.field2897, var10.method1134(), var10.method1135(), var10.method1137());
                } else {
                    arg0.field2895 = class60.method1169(arg0.field2897, var10.method1134(), 0, var10.method1137());
                    this.field2893.method3143(arg0, arg0.field2896.field2816[arg0.field2900] < 0);
                    arg0.field2895.method1130(var8, var10.method1135());
                }
                if (arg0.field2896.field2816[arg0.field2900] < 0) {
                    arg0.field2895.method1122(-1);
                }
                var10.method1132(var8);
                var10.method979(arg1, arg2, arg4 - arg2);
                if (var10.method1170()) {
                    this.field2890.method971(var10);
                }
            }
        }
        arg0.field2895.method979(arg1, arg2, arg3);
    }

    @ObfuscatedName("fr.e(Lfb;II)V")
    public void method3236(class178 arg0, int arg1) {
        if ((this.field2893.field2861[arg0.field2915] & 0x4) != 0 && arg0.field2913 < 0) {
            int var3 = this.field2893.field2858[arg0.field2915] / Statics.field1124;
            int var4 = (var3 + 1048575 - arg0.field2906) / var3;
            arg0.field2906 = arg0.field2906 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2893.field2864[arg0.field2915] == 0) {
                    arg0.field2895 = class60.method1169(arg0.field2897, arg0.field2895.method1134(), arg0.field2895.method1135(), arg0.field2895.method1137());
                } else {
                    arg0.field2895 = class60.method1169(arg0.field2897, arg0.field2895.method1134(), 0, arg0.field2895.method1137());
                    this.field2893.method3143(arg0, arg0.field2896.field2816[arg0.field2900] < 0);
                }
                if (arg0.field2896.field2816[arg0.field2900] < 0) {
                    arg0.field2895.method1122(-1);
                }
                arg1 = arg0.field2906 / var3;
            }
        }
        arg0.field2895.method981(arg1);
    }
}
