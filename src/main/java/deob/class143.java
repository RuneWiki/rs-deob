package deob;

@ObfuscatedName("em")
public class class143 extends class48 {

    @ObfuscatedName("em.g")
    public class141 field2394;

    @ObfuscatedName("em.m")
    public class177 field2393 = new class177();

    @ObfuscatedName("em.v")
    public class46 field2395 = new class46();

    public class143(class141 arg0) {
        this.field2394 = arg0;
    }

    @ObfuscatedName("em.y()Lax;")
    public class48 method935() {
        class145 var1 = (class145) this.field2393.method3321();
        if (var1 == null) {
            return null;
        } else if (var1.field2430 == null) {
            return this.method1044();
        } else {
            return var1.field2430;
        }
    }

    @ObfuscatedName("em.q()Lax;")
    public class48 method1044() {
        class145 var1;
        do {
            var1 = (class145) this.field2393.method3323();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2430 == null);
        return var1.field2430;
    }

    @ObfuscatedName("em.c()I")
    public int method946() {
        return 0;
    }

    @ObfuscatedName("em.u([III)V")
    public void method957(int[] arg0, int arg1, int arg2) {
        this.field2395.method957(arg0, arg1, arg2);
        for (class145 var4 = (class145) this.field2393.method3321(); var4 != null; var4 = (class145) this.field2393.method3323()) {
            if (!this.field2394.method2729(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2431) {
                        this.method2819(var4, arg0, var5, var6, var5 + var6);
                        var4.field2431 -= var6;
                        break;
                    }
                    this.method2819(var4, arg0, var5, var4.field2431, var5 + var6);
                    var5 += var4.field2431;
                    var6 -= var4.field2431;
                } while (!this.field2394.method2730(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("em.ah(I)V")
    public void method958(int arg0) {
        this.field2395.method958(arg0);
        for (class145 var2 = (class145) this.field2393.method3321(); var2 != null; var2 = (class145) this.field2393.method3323()) {
            if (!this.field2394.method2729(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2431) {
                        this.method2816(var2, var3);
                        var2.field2431 -= var3;
                        break;
                    }
                    this.method2816(var2, var2.field2431);
                    var3 -= var2.field2431;
                } while (!this.field2394.method2730(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("em.g(Lew;[IIIII)V")
    public void method2819(class145 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2394.field2359[arg0.field2418] & 0x4) != 0 && arg0.field2423 < 0) {
            int var6 = this.field2394.field2346[arg0.field2418] / Statics.field1096;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2426) / var6;
                if (var7 > arg3) {
                    arg0.field2426 += arg3 * var6;
                    break;
                }
                arg0.field2430.method957(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2426 += var6 * var7 - 1048576;
                int var8 = Statics.field1096 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2430;
                if (this.field2394.field2370[arg0.field2418] == 0) {
                    arg0.field2430 = class45.method936(arg0.field2420, var10.method951(), var10.method942(), var10.method943());
                } else {
                    arg0.field2430 = class45.method936(arg0.field2420, var10.method951(), 0, var10.method943());
                    this.field2394.method2789(arg0, arg0.field2432.field2331[arg0.field2417] < 0);
                    arg0.field2430.method1059(var8, var10.method942());
                }
                if (arg0.field2432.field2331[arg0.field2417] < 0) {
                    arg0.field2430.method938(-1);
                }
                var10.method949(var8);
                var10.method957(arg1, arg2, arg4 - arg2);
                if (var10.method953()) {
                    this.field2395.method1103(var10);
                }
            }
        }
        arg0.field2430.method957(arg1, arg2, arg3);
    }

    @ObfuscatedName("em.m(Lew;IS)V")
    public void method2816(class145 arg0, int arg1) {
        if ((this.field2394.field2359[arg0.field2418] & 0x4) != 0 && arg0.field2423 < 0) {
            int var3 = this.field2394.field2346[arg0.field2418] / Statics.field1096;
            int var4 = (var3 + 1048575 - arg0.field2426) / var3;
            arg0.field2426 = arg0.field2426 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2394.field2370[arg0.field2418] == 0) {
                    arg0.field2430 = class45.method936(arg0.field2420, arg0.field2430.method951(), arg0.field2430.method942(), arg0.field2430.method943());
                } else {
                    arg0.field2430 = class45.method936(arg0.field2420, arg0.field2430.method951(), 0, arg0.field2430.method943());
                    this.field2394.method2789(arg0, arg0.field2432.field2331[arg0.field2417] < 0);
                }
                if (arg0.field2432.field2331[arg0.field2417] < 0) {
                    arg0.field2430.method938(-1);
                }
                arg1 = arg0.field2426 / var3;
            }
        }
        arg0.field2430.method958(arg1);
    }
}
