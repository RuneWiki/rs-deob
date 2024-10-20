package deob;

@ObfuscatedName("jn")
public class class270 extends class46 {

    @ObfuscatedName("jn.c")
    public class267 field3165;

    @ObfuscatedName("jn.l")
    public class326 field3164 = new class326();

    @ObfuscatedName("jn.s")
    public class36 field3163 = new class36();

    public class270(class267 arg0) {
        this.field3165 = arg0;
    }

    @ObfuscatedName("jn.o()Lan;")
    public class46 method634() {
        class272 var1 = (class272) this.field3164.method5269();
        if (var1 == null) {
            return null;
        } else if (var1.field3186 == null) {
            return this.method647();
        } else {
            return var1.field3186;
        }
    }

    @ObfuscatedName("jn.i()Lan;")
    public class46 method647() {
        class272 var1;
        do {
            var1 = (class272) this.field3164.method5270();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3186 == null);
        return var1.field3186;
    }

    @ObfuscatedName("jn.w()I")
    public int method636() {
        return 0;
    }

    @ObfuscatedName("jn.v([III)V")
    public void method637(int[] arg0, int arg1, int arg2) {
        this.field3163.method637(arg0, arg1, arg2);
        for (class272 var4 = (class272) this.field3164.method5269(); var4 != null; var4 = (class272) this.field3164.method5270()) {
            if (!this.field3165.method4575(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3191) {
                        this.method4732(var4, arg0, var5, var6, var5 + var6);
                        var4.field3191 -= var6;
                        break;
                    }
                    this.method4732(var4, arg0, var5, var4.field3191, var5 + var6);
                    var5 += var4.field3191;
                    var6 -= var4.field3191;
                } while (!this.field3165.method4576(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("jn.y(I)V")
    public void method639(int arg0) {
        this.field3163.method639(arg0);
        for (class272 var2 = (class272) this.field3164.method5269(); var2 != null; var2 = (class272) this.field3164.method5270()) {
            if (!this.field3165.method4575(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3191) {
                        this.method4733(var2, var3);
                        var2.field3191 -= var3;
                        break;
                    }
                    this.method4733(var2, var2.field3191);
                    var3 -= var2.field3191;
                } while (!this.field3165.method4576(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("jn.c(Ljm;[IIIII)V")
    public void method4732(class272 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3165.field3125[arg0.field3182] & 0x4) != 0 && arg0.field3187 < 0) {
            int var6 = this.field3165.field3130[arg0.field3182] / Statics.field306;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3192) / var6;
                if (var7 > arg3) {
                    arg0.field3192 += arg3 * var6;
                    break;
                }
                arg0.field3186.method637(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3192 += var6 * var7 - 1048576;
                int var8 = Statics.field306 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field3186;
                if (this.field3165.field3127[arg0.field3182] == 0) {
                    arg0.field3186 = class45.method833(arg0.field3174, var10.method797(), var10.method910(), var10.method790());
                } else {
                    arg0.field3186 = class45.method833(arg0.field3174, var10.method797(), 0, var10.method790());
                    this.field3165.method4658(arg0, arg0.field3173.field3158[arg0.field3190] < 0);
                    arg0.field3186.method794(var8, var10.method910());
                }
                if (arg0.field3173.field3158[arg0.field3190] < 0) {
                    arg0.field3186.method847(-1);
                }
                var10.method795(var8);
                var10.method637(arg1, arg2, arg4 - arg2);
                if (var10.method799()) {
                    this.field3163.method629(var10);
                }
            }
        }
        arg0.field3186.method637(arg1, arg2, arg3);
    }

    @ObfuscatedName("jn.l(Ljm;II)V")
    public void method4733(class272 arg0, int arg1) {
        if ((this.field3165.field3125[arg0.field3182] & 0x4) != 0 && arg0.field3187 < 0) {
            int var3 = this.field3165.field3130[arg0.field3182] / Statics.field306;
            int var4 = (var3 + 1048575 - arg0.field3192) / var3;
            arg0.field3192 = arg0.field3192 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3165.field3127[arg0.field3182] == 0) {
                    arg0.field3186 = class45.method833(arg0.field3174, arg0.field3186.method797(), arg0.field3186.method910(), arg0.field3186.method790());
                } else {
                    arg0.field3186 = class45.method833(arg0.field3174, arg0.field3186.method797(), 0, arg0.field3186.method790());
                    this.field3165.method4658(arg0, arg0.field3173.field3158[arg0.field3190] < 0);
                }
                if (arg0.field3173.field3158[arg0.field3190] < 0) {
                    arg0.field3186.method847(-1);
                }
                arg1 = arg0.field3192 / var3;
            }
        }
        arg0.field3186.method639(arg1);
    }
}
