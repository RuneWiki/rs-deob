package deob;

@ObfuscatedName("gs")
public class class186 extends class67 {

    @ObfuscatedName("gs.l")
    public class184 field2987;

    @ObfuscatedName("gs.e")
    public class199 field2986 = new class199();

    @ObfuscatedName("gs.q")
    public class56 field2985 = new class56();

    public class186(class184 arg0) {
        this.field2987 = arg0;
    }

    @ObfuscatedName("gs.m()Lbt;")
    public class67 method1142() {
        class187 var1 = (class187) this.field2986.method3544();
        if (var1 == null) {
            return null;
        } else if (var1.field2995 == null) {
            return this.method1143();
        } else {
            return var1.field2995;
        }
    }

    @ObfuscatedName("gs.b()Lbt;")
    public class67 method1143() {
        class187 var1;
        do {
            var1 = (class187) this.field2986.method3538();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2995 == null);
        return var1.field2995;
    }

    @ObfuscatedName("gs.p()I")
    public int method1144() {
        return 0;
    }

    @ObfuscatedName("gs.t([III)V")
    public void method1165(int[] arg0, int arg1, int arg2) {
        this.field2985.method1165(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field2986.method3544(); var4 != null; var4 = (class187) this.field2986.method3538()) {
            if (!this.field2987.method3388(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2991) {
                        this.method3465(var4, arg0, var5, var6, var5 + var6);
                        var4.field2991 -= var6;
                        break;
                    }
                    this.method3465(var4, arg0, var5, var4.field2991, var5 + var6);
                    var5 += var4.field2991;
                    var6 -= var4.field2991;
                } while (!this.field2987.method3431(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gs.x(I)V")
    public void method1147(int arg0) {
        this.field2985.method1147(arg0);
        for (class187 var2 = (class187) this.field2986.method3544(); var2 != null; var2 = (class187) this.field2986.method3538()) {
            if (!this.field2987.method3388(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2991) {
                        this.method3464(var2, var3);
                        var2.field2991 -= var3;
                        break;
                    }
                    this.method3464(var2, var2.field2991);
                    var3 -= var2.field2991;
                } while (!this.field2987.method3431(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gs.l(Lgm;[IIIII)V")
    public void method3465(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2987.field2960[arg0.field2999] & 0x4) != 0 && arg0.field2992 < 0) {
            int var6 = this.field2987.field2965[arg0.field2999] / Statics.field1167;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3010) / var6;
                if (var7 > arg3) {
                    arg0.field3010 += arg3 * var6;
                    break;
                }
                arg0.field2995.method1165(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3010 += var6 * var7 - 1048576;
                int var8 = Statics.field1167 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field2995;
                if (this.field2987.field2963[arg0.field2999] == 0) {
                    arg0.field2995 = class65.method1293(arg0.field3009, var10.method1307(), var10.method1342(), var10.method1300());
                } else {
                    arg0.field2995 = class65.method1293(arg0.field3009, var10.method1307(), 0, var10.method1300());
                    this.field2987.method3372(arg0, arg0.field3004.field2913[arg0.field3008] < 0);
                    arg0.field2995.method1372(var8, var10.method1342());
                }
                if (arg0.field3004.field2913[arg0.field3008] < 0) {
                    arg0.field2995.method1295(-1);
                }
                var10.method1306(var8);
                var10.method1165(arg1, arg2, arg4 - arg2);
                if (var10.method1313()) {
                    this.field2985.method1137(var10);
                }
            }
        }
        arg0.field2995.method1165(arg1, arg2, arg3);
    }

    @ObfuscatedName("gs.e(Lgm;II)V")
    public void method3464(class187 arg0, int arg1) {
        if ((this.field2987.field2960[arg0.field2999] & 0x4) != 0 && arg0.field2992 < 0) {
            int var3 = this.field2987.field2965[arg0.field2999] / Statics.field1167;
            int var4 = (var3 + 1048575 - arg0.field3010) / var3;
            arg0.field3010 = arg0.field3010 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2987.field2963[arg0.field2999] == 0) {
                    arg0.field2995 = class65.method1293(arg0.field3009, arg0.field2995.method1307(), arg0.field2995.method1342(), arg0.field2995.method1300());
                } else {
                    arg0.field2995 = class65.method1293(arg0.field3009, arg0.field2995.method1307(), 0, arg0.field2995.method1300());
                    this.field2987.method3372(arg0, arg0.field3004.field2913[arg0.field3008] < 0);
                }
                if (arg0.field3004.field2913[arg0.field3008] < 0) {
                    arg0.field2995.method1295(-1);
                }
                arg1 = arg0.field3010 / var3;
            }
        }
        arg0.field2995.method1147(arg1);
    }
}
