package deob;

@ObfuscatedName("gb")
public class class186 extends class67 {

    @ObfuscatedName("gb.y")
    public class184 field2975;

    @ObfuscatedName("gb.d")
    public class199 field2978 = new class199();

    @ObfuscatedName("gb.g")
    public class56 field2976 = new class56();

    public class186(class184 arg0) {
        this.field2975 = arg0;
    }

    @ObfuscatedName("gb.c()Lbs;")
    public class67 method1123() {
        class187 var1 = (class187) this.field2978.method3493();
        if (var1 == null) {
            return null;
        } else if (var1.field2986 == null) {
            return this.method1118();
        } else {
            return var1.field2986;
        }
    }

    @ObfuscatedName("gb.a()Lbs;")
    public class67 method1118() {
        class187 var1;
        do {
            var1 = (class187) this.field2978.method3495();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2986 == null);
        return var1.field2986;
    }

    @ObfuscatedName("gb.q()I")
    public int method1145() {
        return 0;
    }

    @ObfuscatedName("gb.m([III)V")
    public void method1119(int[] arg0, int arg1, int arg2) {
        this.field2976.method1119(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field2978.method3493(); var4 != null; var4 = (class187) this.field2978.method3495()) {
            if (!this.field2975.method3337(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2998) {
                        this.method3405(var4, arg0, var5, var6, var5 + var6);
                        var4.field2998 -= var6;
                        break;
                    }
                    this.method3405(var4, arg0, var5, var4.field2998, var5 + var6);
                    var5 += var4.field2998;
                    var6 -= var4.field2998;
                } while (!this.field2975.method3338(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gb.k(I)V")
    public void method1134(int arg0) {
        this.field2976.method1134(arg0);
        for (class187 var2 = (class187) this.field2978.method3493(); var2 != null; var2 = (class187) this.field2978.method3495()) {
            if (!this.field2975.method3337(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2998) {
                        this.method3408(var2, var3);
                        var2.field2998 -= var3;
                        break;
                    }
                    this.method3408(var2, var2.field2998);
                    var3 -= var2.field2998;
                } while (!this.field2975.method3338(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gb.y(Lgl;[IIIIB)V")
    public void method3405(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2975.field2946[arg0.field2980] & 0x4) != 0 && arg0.field3001 < 0) {
            int var6 = this.field2975.field2944[arg0.field2980] / Statics.field2644;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3000) / var6;
                if (var7 > arg3) {
                    arg0.field3000 += arg3 * var6;
                    break;
                }
                arg0.field2986.method1119(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3000 += var6 * var7 - 1048576;
                int var8 = Statics.field2644 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field2986;
                if (this.field2975.field2947[arg0.field2980] == 0) {
                    arg0.field2986 = class65.method1271(arg0.field2997, var10.method1285(), var10.method1288(), var10.method1270());
                } else {
                    arg0.field2986 = class65.method1271(arg0.field2997, var10.method1285(), 0, var10.method1270());
                    this.field2975.method3318(arg0, arg0.field2979.field2901[arg0.field2984] < 0);
                    arg0.field2986.method1307(var8, var10.method1288());
                }
                if (arg0.field2979.field2901[arg0.field2984] < 0) {
                    arg0.field2986.method1277(-1);
                }
                var10.method1308(var8);
                var10.method1119(arg1, arg2, arg4 - arg2);
                if (var10.method1287()) {
                    this.field2976.method1112(var10);
                }
            }
        }
        arg0.field2986.method1119(arg1, arg2, arg3);
    }

    @ObfuscatedName("gb.d(Lgl;II)V")
    public void method3408(class187 arg0, int arg1) {
        if ((this.field2975.field2946[arg0.field2980] & 0x4) != 0 && arg0.field3001 < 0) {
            int var3 = this.field2975.field2944[arg0.field2980] / Statics.field2644;
            int var4 = (var3 + 1048575 - arg0.field3000) / var3;
            arg0.field3000 = arg0.field3000 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2975.field2947[arg0.field2980] == 0) {
                    arg0.field2986 = class65.method1271(arg0.field2997, arg0.field2986.method1285(), arg0.field2986.method1288(), arg0.field2986.method1270());
                } else {
                    arg0.field2986 = class65.method1271(arg0.field2997, arg0.field2986.method1285(), 0, arg0.field2986.method1270());
                    this.field2975.method3318(arg0, arg0.field2979.field2901[arg0.field2984] < 0);
                }
                if (arg0.field2979.field2901[arg0.field2984] < 0) {
                    arg0.field2986.method1277(-1);
                }
                arg1 = arg0.field3000 / var3;
            }
        }
        arg0.field2986.method1134(arg1);
    }
}
