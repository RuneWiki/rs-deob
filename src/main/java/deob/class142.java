package deob;

@ObfuscatedName("ey")
public class class142 extends class47 {

    @ObfuscatedName("ey.c")
    public class140 field2381;

    @ObfuscatedName("ey.j")
    public class175 field2380 = new class175();

    @ObfuscatedName("ey.f")
    public class45 field2382 = new class45();

    public class142(class140 arg0) {
        this.field2381 = arg0;
    }

    @ObfuscatedName("ey.k()Lau;")
    public class47 method926() {
        class144 var1 = (class144) this.field2380.method3145();
        if (var1 == null) {
            return null;
        } else if (var1.field2422 == null) {
            return this.method927();
        } else {
            return var1.field2422;
        }
    }

    @ObfuscatedName("ey.o()Lau;")
    public class47 method927() {
        class144 var1;
        do {
            var1 = (class144) this.field2380.method3154();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2422 == null);
        return var1.field2422;
    }

    @ObfuscatedName("ey.d()I")
    public int method928() {
        return 0;
    }

    @ObfuscatedName("ey.u([III)V")
    public void method929(int[] arg0, int arg1, int arg2) {
        this.field2382.method929(arg0, arg1, arg2);
        for (class144 var4 = (class144) this.field2380.method3145(); var4 != null; var4 = (class144) this.field2380.method3154()) {
            if (!this.field2381.method2634(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2419) {
                        this.method2704(var4, arg0, var5, var6, var5 + var6);
                        var4.field2419 -= var6;
                        break;
                    }
                    this.method2704(var4, arg0, var5, var4.field2419, var5 + var6);
                    var5 += var4.field2419;
                    var6 -= var4.field2419;
                } while (!this.field2381.method2635(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ey.ap(I)V")
    public void method1014(int arg0) {
        this.field2382.method1014(arg0);
        for (class144 var2 = (class144) this.field2380.method3145(); var2 != null; var2 = (class144) this.field2380.method3154()) {
            if (!this.field2381.method2634(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2419) {
                        this.method2703(var2, var3);
                        var2.field2419 -= var3;
                        break;
                    }
                    this.method2703(var2, var2.field2419);
                    var3 -= var2.field2419;
                } while (!this.field2381.method2635(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ey.c(Leu;[IIIII)V")
    public void method2704(class144 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2381.field2348[arg0.field2418] & 0x4) != 0 && arg0.field2414 < 0) {
            int var6 = this.field2381.field2354[arg0.field2418] / Statics.field1090;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2421) / var6;
                if (var7 > arg3) {
                    arg0.field2421 += arg3 * var6;
                    break;
                }
                arg0.field2422.method929(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2421 += var6 * var7 - 1048576;
                int var8 = Statics.field1090 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class44 var10 = arg0.field2422;
                if (this.field2381.field2352[arg0.field2418] == 0) {
                    arg0.field2422 = class44.method908(arg0.field2413, var10.method923(), var10.method990(), var10.method915());
                } else {
                    arg0.field2422 = class44.method908(arg0.field2413, var10.method923(), 0, var10.method915());
                    this.field2381.method2615(arg0, arg0.field2401.field2326[arg0.field2405] < 0);
                    arg0.field2422.method1010(var8, var10.method990());
                }
                if (arg0.field2401.field2326[arg0.field2405] < 0) {
                    arg0.field2422.method910(-1);
                }
                var10.method966(var8);
                var10.method929(arg1, arg2, arg4 - arg2);
                if (var10.method944()) {
                    this.field2382.method1054(var10);
                }
            }
        }
        arg0.field2422.method929(arg1, arg2, arg3);
    }

    @ObfuscatedName("ey.j(Leu;II)V")
    public void method2703(class144 arg0, int arg1) {
        if ((this.field2381.field2348[arg0.field2418] & 0x4) != 0 && arg0.field2414 < 0) {
            int var3 = this.field2381.field2354[arg0.field2418] / Statics.field1090;
            int var4 = (var3 + 1048575 - arg0.field2421) / var3;
            arg0.field2421 = arg0.field2421 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2381.field2352[arg0.field2418] == 0) {
                    arg0.field2422 = class44.method908(arg0.field2413, arg0.field2422.method923(), arg0.field2422.method990(), arg0.field2422.method915());
                } else {
                    arg0.field2422 = class44.method908(arg0.field2413, arg0.field2422.method923(), 0, arg0.field2422.method915());
                    this.field2381.method2615(arg0, arg0.field2401.field2326[arg0.field2405] < 0);
                }
                if (arg0.field2401.field2326[arg0.field2405] < 0) {
                    arg0.field2422.method910(-1);
                }
                arg1 = arg0.field2421 / var3;
            }
        }
        arg0.field2422.method1014(arg1);
    }
}
