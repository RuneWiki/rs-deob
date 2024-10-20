package deob;

@ObfuscatedName("fg")
public class class177 extends class62 {

    @ObfuscatedName("fg.n")
    public class175 field2912;

    @ObfuscatedName("fg.o")
    public class190 field2910 = new class190();

    @ObfuscatedName("fg.a")
    public class51 field2911 = new class51();

    public class177(class175 arg0) {
        this.field2912 = arg0;
    }

    @ObfuscatedName("fg.h()Lby;")
    public class62 method1045() {
        class178 var1 = (class178) this.field2910.method3451();
        if (var1 == null) {
            return null;
        } else if (var1.field2938 == null) {
            return this.method1037();
        } else {
            return var1.field2938;
        }
    }

    @ObfuscatedName("fg.i()Lby;")
    public class62 method1037() {
        class178 var1;
        do {
            var1 = (class178) this.field2910.method3448();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2938 == null);
        return var1.field2938;
    }

    @ObfuscatedName("fg.r()I")
    public int method1048() {
        return 0;
    }

    @ObfuscatedName("fg.l([III)V")
    public void method1030(int[] arg0, int arg1, int arg2) {
        this.field2911.method1030(arg0, arg1, arg2);
        for (class178 var4 = (class178) this.field2910.method3451(); var4 != null; var4 = (class178) this.field2910.method3448()) {
            if (!this.field2912.method3281(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2917) {
                        this.method3353(var4, arg0, var5, var6, var5 + var6);
                        var4.field2917 -= var6;
                        break;
                    }
                    this.method3353(var4, arg0, var5, var4.field2917, var5 + var6);
                    var5 += var4.field2917;
                    var6 -= var4.field2917;
                } while (!this.field2912.method3295(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fg.e(I)V")
    public void method1041(int arg0) {
        this.field2911.method1041(arg0);
        for (class178 var2 = (class178) this.field2910.method3451(); var2 != null; var2 = (class178) this.field2910.method3448()) {
            if (!this.field2912.method3281(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2917) {
                        this.method3352(var2, var3);
                        var2.field2917 -= var3;
                        break;
                    }
                    this.method3352(var2, var2.field2917);
                    var3 -= var2.field2917;
                } while (!this.field2912.method3295(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fg.n(Lfj;[IIIII)V")
    public void method3353(class178 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2912.field2887[arg0.field2934] & 0x4) != 0 && arg0.field2930 < 0) {
            int var6 = this.field2912.field2898[arg0.field2934] / Statics.field1141;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2937) / var6;
                if (var7 > arg3) {
                    arg0.field2937 += arg3 * var6;
                    break;
                }
                arg0.field2938.method1030(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2937 += var6 * var7 - 1048576;
                int var8 = Statics.field1141 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class60 var10 = arg0.field2938;
                if (this.field2912.field2893[arg0.field2934] == 0) {
                    arg0.field2938 = class60.method1189(arg0.field2918, var10.method1204(), var10.method1198(), var10.method1220());
                } else {
                    arg0.field2938 = class60.method1189(arg0.field2918, var10.method1204(), 0, var10.method1220());
                    this.field2912.method3253(arg0, arg0.field2921.field2836[arg0.field2927] < 0);
                    arg0.field2938.method1187(var8, var10.method1198());
                }
                if (arg0.field2921.field2836[arg0.field2927] < 0) {
                    arg0.field2938.method1191(-1);
                }
                var10.method1261(var8);
                var10.method1030(arg1, arg2, arg4 - arg2);
                if (var10.method1206()) {
                    this.field2911.method1031(var10);
                }
            }
        }
        arg0.field2938.method1030(arg1, arg2, arg3);
    }

    @ObfuscatedName("fg.o(Lfj;II)V")
    public void method3352(class178 arg0, int arg1) {
        if ((this.field2912.field2887[arg0.field2934] & 0x4) != 0 && arg0.field2930 < 0) {
            int var3 = this.field2912.field2898[arg0.field2934] / Statics.field1141;
            int var4 = (var3 + 1048575 - arg0.field2937) / var3;
            arg0.field2937 = arg0.field2937 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2912.field2893[arg0.field2934] == 0) {
                    arg0.field2938 = class60.method1189(arg0.field2918, arg0.field2938.method1204(), arg0.field2938.method1198(), arg0.field2938.method1220());
                } else {
                    arg0.field2938 = class60.method1189(arg0.field2918, arg0.field2938.method1204(), 0, arg0.field2938.method1220());
                    this.field2912.method3253(arg0, arg0.field2921.field2836[arg0.field2927] < 0);
                }
                if (arg0.field2921.field2836[arg0.field2927] < 0) {
                    arg0.field2938.method1191(-1);
                }
                arg1 = arg0.field2937 / var3;
            }
        }
        arg0.field2938.method1041(arg1);
    }
}
