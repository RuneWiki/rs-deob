package deob;

@ObfuscatedName("gn")
public class class186 extends class67 {

    @ObfuscatedName("gn.h")
    public class184 field2989;

    @ObfuscatedName("gn.m")
    public class199 field2987 = new class199();

    @ObfuscatedName("gn.i")
    public class56 field2986 = new class56();

    public class186(class184 arg0) {
        this.field2989 = arg0;
    }

    @ObfuscatedName("gn.c()Lbc;")
    public class67 method1108() {
        class187 var1 = (class187) this.field2987.method3546();
        if (var1 == null) {
            return null;
        } else if (var1.field3009 == null) {
            return this.method1097();
        } else {
            return var1.field3009;
        }
    }

    @ObfuscatedName("gn.f()Lbc;")
    public class67 method1097() {
        class187 var1;
        do {
            var1 = (class187) this.field2987.method3548();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3009 == null);
        return var1.field3009;
    }

    @ObfuscatedName("gn.y()I")
    public int method1098() {
        return 0;
    }

    @ObfuscatedName("gn.w([III)V")
    public void method1109(int[] arg0, int arg1, int arg2) {
        this.field2986.method1109(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field2987.method3546(); var4 != null; var4 = (class187) this.field2987.method3548()) {
            if (!this.field2989.method3445(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3005) {
                        this.method3453(var4, arg0, var5, var6, var5 + var6);
                        var4.field3005 -= var6;
                        break;
                    }
                    this.method3453(var4, arg0, var5, var4.field3005, var5 + var6);
                    var5 += var4.field3005;
                    var6 -= var4.field3005;
                } while (!this.field2989.method3371(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gn.v(I)V")
    public void method1101(int arg0) {
        this.field2986.method1101(arg0);
        for (class187 var2 = (class187) this.field2987.method3546(); var2 != null; var2 = (class187) this.field2987.method3548()) {
            if (!this.field2989.method3445(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3005) {
                        this.method3454(var2, var3);
                        var2.field3005 -= var3;
                        break;
                    }
                    this.method3454(var2, var2.field3005);
                    var3 -= var2.field3005;
                } while (!this.field2989.method3371(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gn.h(Lgi;[IIIII)V")
    public void method3453(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2989.field2960[arg0.field3006] & 0x4) != 0 && arg0.field3004 < 0) {
            int var6 = this.field2989.field2965[arg0.field3006] / Statics.field1199;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3010) / var6;
                if (var7 > arg3) {
                    arg0.field3010 += arg3 * var6;
                    break;
                }
                arg0.field3009.method1109(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3010 += var6 * var7 - 1048576;
                int var8 = Statics.field1199 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3009;
                if (this.field2989.field2963[arg0.field3006] == 0) {
                    arg0.field3009 = class65.method1301(arg0.field2992, var10.method1270(), var10.method1293(), var10.method1262());
                } else {
                    arg0.field3009 = class65.method1301(arg0.field2992, var10.method1270(), 0, var10.method1262());
                    this.field2989.method3425(arg0, arg0.field3003.field2918[arg0.field2998] < 0);
                    arg0.field3009.method1266(var8, var10.method1293());
                }
                if (arg0.field3003.field2918[arg0.field2998] < 0) {
                    arg0.field3009.method1294(-1);
                }
                var10.method1307(var8);
                var10.method1109(arg1, arg2, arg4 - arg2);
                if (var10.method1272()) {
                    this.field2986.method1122(var10);
                }
            }
        }
        arg0.field3009.method1109(arg1, arg2, arg3);
    }

    @ObfuscatedName("gn.m(Lgi;IS)V")
    public void method3454(class187 arg0, int arg1) {
        if ((this.field2989.field2960[arg0.field3006] & 0x4) != 0 && arg0.field3004 < 0) {
            int var3 = this.field2989.field2965[arg0.field3006] / Statics.field1199;
            int var4 = (var3 + 1048575 - arg0.field3010) / var3;
            arg0.field3010 = arg0.field3010 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2989.field2963[arg0.field3006] == 0) {
                    arg0.field3009 = class65.method1301(arg0.field2992, arg0.field3009.method1270(), arg0.field3009.method1293(), arg0.field3009.method1262());
                } else {
                    arg0.field3009 = class65.method1301(arg0.field2992, arg0.field3009.method1270(), 0, arg0.field3009.method1262());
                    this.field2989.method3425(arg0, arg0.field3003.field2918[arg0.field2998] < 0);
                }
                if (arg0.field3003.field2918[arg0.field2998] < 0) {
                    arg0.field3009.method1294(-1);
                }
                arg1 = arg0.field3010 / var3;
            }
        }
        arg0.field3009.method1101(arg1);
    }
}
