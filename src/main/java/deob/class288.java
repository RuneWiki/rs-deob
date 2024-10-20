package deob;

@ObfuscatedName("km")
public class class288 extends class50 {

    @ObfuscatedName("km.a")
    public class285 field3356;

    @ObfuscatedName("km.f")
    public class349 field3353 = new class349();

    @ObfuscatedName("km.c")
    public class40 field3354 = new class40();

    public class288(class285 arg0) {
        this.field3356 = arg0;
    }

    @ObfuscatedName("km.j()Lay;")
    public class50 method718() {
        class290 var1 = (class290) this.field3353.method6040();
        if (var1 == null) {
            return null;
        } else if (var1.field3378 == null) {
            return this.method719();
        } else {
            return var1.field3378;
        }
    }

    @ObfuscatedName("km.y()Lay;")
    public class50 method719() {
        class290 var1;
        do {
            var1 = (class290) this.field3353.method6034();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3378 == null);
        return var1.field3378;
    }

    @ObfuscatedName("km.d()I")
    public int method720() {
        return 0;
    }

    @ObfuscatedName("km.n([III)V")
    public void method721(int[] arg0, int arg1, int arg2) {
        this.field3354.method721(arg0, arg1, arg2);
        for (class290 var4 = (class290) this.field3353.method6040(); var4 != null; var4 = (class290) this.field3353.method6034()) {
            if (!this.field3356.method4964(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3379) {
                        this.method5108(var4, arg0, var5, var6, var5 + var6);
                        var4.field3379 -= var6;
                        break;
                    }
                    this.method5108(var4, arg0, var5, var4.field3379, var5 + var6);
                    var5 += var4.field3379;
                    var6 -= var4.field3379;
                } while (!this.field3356.method4965(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("km.l(I)V")
    public void method725(int arg0) {
        this.field3354.method725(arg0);
        for (class290 var2 = (class290) this.field3353.method6040(); var2 != null; var2 = (class290) this.field3353.method6034()) {
            if (!this.field3356.method4964(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3379) {
                        this.method5114(var2, var3);
                        var2.field3379 -= var3;
                        break;
                    }
                    this.method5114(var2, var2.field3379);
                    var3 -= var2.field3379;
                } while (!this.field3356.method4965(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("km.a(Lkj;[IIIII)V")
    public void method5108(class290 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3356.field3311[arg0.field3362] & 0x4) != 0 && arg0.field3374 < 0) {
            int var6 = this.field3356.field3316[arg0.field3362] / Statics.field338;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3363) / var6;
                if (var7 > arg3) {
                    arg0.field3363 += arg3 * var6;
                    break;
                }
                arg0.field3378.method721(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3363 += var6 * var7 - 1048576;
                int var8 = Statics.field338 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class49 var10 = arg0.field3378;
                if (this.field3356.field3326[arg0.field3362] == 0) {
                    arg0.field3378 = class49.method863(arg0.field3368, var10.method878(), var10.method902(), var10.method870());
                } else {
                    arg0.field3378 = class49.method863(arg0.field3368, var10.method878(), 0, var10.method870());
                    this.field3356.method5049(arg0, arg0.field3361.field3344[arg0.field3365] < 0);
                    arg0.field3378.method874(var8, var10.method902());
                }
                if (arg0.field3361.field3344[arg0.field3365] < 0) {
                    arg0.field3378.method865(-1);
                }
                var10.method867(var8);
                var10.method721(arg1, arg2, arg4 - arg2);
                if (var10.method869()) {
                    this.field3354.method713(var10);
                }
            }
        }
        arg0.field3378.method721(arg1, arg2, arg3);
    }

    @ObfuscatedName("km.f(Lkj;IS)V")
    public void method5114(class290 arg0, int arg1) {
        if ((this.field3356.field3311[arg0.field3362] & 0x4) != 0 && arg0.field3374 < 0) {
            int var3 = this.field3356.field3316[arg0.field3362] / Statics.field338;
            int var4 = (var3 + 1048575 - arg0.field3363) / var3;
            arg0.field3363 = arg0.field3363 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3356.field3326[arg0.field3362] == 0) {
                    arg0.field3378 = class49.method863(arg0.field3368, arg0.field3378.method878(), arg0.field3378.method902(), arg0.field3378.method870());
                } else {
                    arg0.field3378 = class49.method863(arg0.field3368, arg0.field3378.method878(), 0, arg0.field3378.method870());
                    this.field3356.method5049(arg0, arg0.field3361.field3344[arg0.field3365] < 0);
                }
                if (arg0.field3361.field3344[arg0.field3365] < 0) {
                    arg0.field3378.method865(-1);
                }
                arg1 = arg0.field3363 / var3;
            }
        }
        arg0.field3378.method725(arg1);
    }
}
