package deob;

@ObfuscatedName("gz")
public class class186 extends class67 {

    @ObfuscatedName("gz.j")
    public class184 field3001;

    @ObfuscatedName("gz.l")
    public class199 field3000 = new class199();

    @ObfuscatedName("gz.a")
    public class56 field3002 = new class56();

    public class186(class184 arg0) {
        this.field3001 = arg0;
    }

    @ObfuscatedName("gz.m()Lbf;")
    public class67 method1126() {
        class187 var1 = (class187) this.field3000.method3528();
        if (var1 == null) {
            return null;
        } else if (var1.field3019 == null) {
            return this.method1138();
        } else {
            return var1.field3019;
        }
    }

    @ObfuscatedName("gz.o()Lbf;")
    public class67 method1138() {
        class187 var1;
        do {
            var1 = (class187) this.field3000.method3527();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3019 == null);
        return var1.field3019;
    }

    @ObfuscatedName("gz.h()I")
    public int method1121() {
        return 0;
    }

    @ObfuscatedName("gz.n([III)V")
    public void method1129(int[] arg0, int arg1, int arg2) {
        this.field3002.method1129(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field3000.method3528(); var4 != null; var4 = (class187) this.field3000.method3527()) {
            if (!this.field3001.method3421(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3023) {
                        this.method3445(var4, arg0, var5, var6, var5 + var6);
                        var4.field3023 -= var6;
                        break;
                    }
                    this.method3445(var4, arg0, var5, var4.field3023, var5 + var6);
                    var5 += var4.field3023;
                    var6 -= var4.field3023;
                } while (!this.field3001.method3361(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gz.r(I)V")
    public void method1131(int arg0) {
        this.field3002.method1131(arg0);
        for (class187 var2 = (class187) this.field3000.method3528(); var2 != null; var2 = (class187) this.field3000.method3527()) {
            if (!this.field3001.method3421(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3023) {
                        this.method3446(var2, var3);
                        var2.field3023 -= var3;
                        break;
                    }
                    this.method3446(var2, var2.field3023);
                    var3 -= var2.field3023;
                } while (!this.field3001.method3361(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gz.j(Lgf;[IIIII)V")
    public void method3445(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3001.field2972[arg0.field3013] & 0x4) != 0 && arg0.field3018 < 0) {
            int var6 = this.field3001.field2977[arg0.field3013] / Statics.field1781;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3011) / var6;
                if (var7 > arg3) {
                    arg0.field3011 += arg3 * var6;
                    break;
                }
                arg0.field3019.method1129(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3011 += var6 * var7 - 1048576;
                int var8 = Statics.field1781 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3019;
                if (this.field3001.field2975[arg0.field3013] == 0) {
                    arg0.field3019 = class65.method1308(arg0.field3016, var10.method1260(), var10.method1271(), var10.method1272());
                } else {
                    arg0.field3019 = class65.method1308(arg0.field3016, var10.method1260(), 0, var10.method1272());
                    this.field3001.method3410(arg0, arg0.field3005.field2928[arg0.field3009] < 0);
                    arg0.field3019.method1276(var8, var10.method1271());
                }
                if (arg0.field3005.field2928[arg0.field3009] < 0) {
                    arg0.field3019.method1267(-1);
                }
                var10.method1277(var8);
                var10.method1129(arg1, arg2, arg4 - arg2);
                if (var10.method1265()) {
                    this.field3002.method1137(var10);
                }
            }
        }
        arg0.field3019.method1129(arg1, arg2, arg3);
    }

    @ObfuscatedName("gz.l(Lgf;II)V")
    public void method3446(class187 arg0, int arg1) {
        if ((this.field3001.field2972[arg0.field3013] & 0x4) != 0 && arg0.field3018 < 0) {
            int var3 = this.field3001.field2977[arg0.field3013] / Statics.field1781;
            int var4 = (var3 + 1048575 - arg0.field3011) / var3;
            arg0.field3011 = arg0.field3011 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3001.field2975[arg0.field3013] == 0) {
                    arg0.field3019 = class65.method1308(arg0.field3016, arg0.field3019.method1260(), arg0.field3019.method1271(), arg0.field3019.method1272());
                } else {
                    arg0.field3019 = class65.method1308(arg0.field3016, arg0.field3019.method1260(), 0, arg0.field3019.method1272());
                    this.field3001.method3410(arg0, arg0.field3005.field2928[arg0.field3009] < 0);
                }
                if (arg0.field3005.field2928[arg0.field3009] < 0) {
                    arg0.field3019.method1267(-1);
                }
                arg1 = arg0.field3011 / var3;
            }
        }
        arg0.field3019.method1131(arg1);
    }
}
