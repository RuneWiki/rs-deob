package deob;

@ObfuscatedName("ge")
public class class186 extends class67 {

    @ObfuscatedName("ge.h")
    public class184 field2971;

    @ObfuscatedName("ge.q")
    public class199 field2972 = new class199();

    @ObfuscatedName("ge.v")
    public class56 field2977 = new class56();

    public class186(class184 arg0) {
        this.field2971 = arg0;
    }

    @ObfuscatedName("ge.g()Lbo;")
    public class67 method1124() {
        class187 var1 = (class187) this.field2972.method3611();
        if (var1 == null) {
            return null;
        } else if (var1.field2985 == null) {
            return this.method1157();
        } else {
            return var1.field2985;
        }
    }

    @ObfuscatedName("ge.o()Lbo;")
    public class67 method1157() {
        class187 var1;
        do {
            var1 = (class187) this.field2972.method3616();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2985 == null);
        return var1.field2985;
    }

    @ObfuscatedName("ge.s()I")
    public int method1127() {
        return 0;
    }

    @ObfuscatedName("ge.k([III)V")
    public void method1143(int[] arg0, int arg1, int arg2) {
        this.field2977.method1143(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field2972.method3611(); var4 != null; var4 = (class187) this.field2972.method3616()) {
            if (!this.field2971.method3450(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2998) {
                        this.method3520(var4, arg0, var5, var6, var5 + var6);
                        var4.field2998 -= var6;
                        break;
                    }
                    this.method3520(var4, arg0, var5, var4.field2998, var5 + var6);
                    var5 += var4.field2998;
                    var6 -= var4.field2998;
                } while (!this.field2971.method3451(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ge.c(I)V")
    public void method1129(int arg0) {
        this.field2977.method1129(arg0);
        for (class187 var2 = (class187) this.field2972.method3611(); var2 != null; var2 = (class187) this.field2972.method3616()) {
            if (!this.field2971.method3450(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2998) {
                        this.method3521(var2, var3);
                        var2.field2998 -= var3;
                        break;
                    }
                    this.method3521(var2, var2.field2998);
                    var3 -= var2.field2998;
                } while (!this.field2971.method3451(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ge.h(Lgi;[IIIII)V")
    public void method3520(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2971.field2938[arg0.field3002] & 0x4) != 0 && arg0.field2990 < 0) {
            int var6 = this.field2971.field2950[arg0.field3002] / Statics.field1189;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2999) / var6;
                if (var7 > arg3) {
                    arg0.field2999 += arg3 * var6;
                    break;
                }
                arg0.field2985.method1143(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2999 += var6 * var7 - 1048576;
                int var8 = Statics.field1189 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field2985;
                if (this.field2971.field2948[arg0.field3002] == 0) {
                    arg0.field2985 = class65.method1309(arg0.field2981, var10.method1298(), var10.method1291(), var10.method1405());
                } else {
                    arg0.field2985 = class65.method1309(arg0.field2981, var10.method1298(), 0, var10.method1405());
                    this.field2971.method3500(arg0, arg0.field2980.field2902[arg0.field2984] < 0);
                    arg0.field2985.method1294(var8, var10.method1291());
                }
                if (arg0.field2980.field2902[arg0.field2984] < 0) {
                    arg0.field2985.method1287(-1);
                }
                var10.method1362(var8);
                var10.method1143(arg1, arg2, arg4 - arg2);
                if (var10.method1299()) {
                    this.field2977.method1119(var10);
                }
            }
        }
        arg0.field2985.method1143(arg1, arg2, arg3);
    }

    @ObfuscatedName("ge.q(Lgi;IB)V")
    public void method3521(class187 arg0, int arg1) {
        if ((this.field2971.field2938[arg0.field3002] & 0x4) != 0 && arg0.field2990 < 0) {
            int var3 = this.field2971.field2950[arg0.field3002] / Statics.field1189;
            int var4 = (var3 + 1048575 - arg0.field2999) / var3;
            arg0.field2999 = arg0.field2999 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2971.field2948[arg0.field3002] == 0) {
                    arg0.field2985 = class65.method1309(arg0.field2981, arg0.field2985.method1298(), arg0.field2985.method1291(), arg0.field2985.method1405());
                } else {
                    arg0.field2985 = class65.method1309(arg0.field2981, arg0.field2985.method1298(), 0, arg0.field2985.method1405());
                    this.field2971.method3500(arg0, arg0.field2980.field2902[arg0.field2984] < 0);
                }
                if (arg0.field2980.field2902[arg0.field2984] < 0) {
                    arg0.field2985.method1287(-1);
                }
                arg1 = arg0.field2999 / var3;
            }
        }
        arg0.field2985.method1129(arg1);
    }
}
