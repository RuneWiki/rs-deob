package deob;

@ObfuscatedName("ek")
public class class143 extends class48 {

    @ObfuscatedName("ek.i")
    public class141 field2397;

    @ObfuscatedName("ek.v")
    public class177 field2400 = new class177();

    @ObfuscatedName("ek.m")
    public class46 field2396 = new class46();

    public class143(class141 arg0) {
        this.field2397 = arg0;
    }

    @ObfuscatedName("ek.u()Lan;")
    public class48 method998() {
        class145 var1 = (class145) this.field2400.method3369();
        if (var1 == null) {
            return null;
        } else if (var1.field2437 == null) {
            return this.method1003();
        } else {
            return var1.field2437;
        }
    }

    @ObfuscatedName("ek.p()Lan;")
    public class48 method1003() {
        class145 var1;
        do {
            var1 = (class145) this.field2400.method3371();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2437 == null);
        return var1.field2437;
    }

    @ObfuscatedName("ek.t()I")
    public int method1000() {
        return 0;
    }

    @ObfuscatedName("ek.s([III)V")
    public void method990(int[] arg0, int arg1, int arg2) {
        this.field2396.method990(arg0, arg1, arg2);
        for (class145 var4 = (class145) this.field2400.method3369(); var4 != null; var4 = (class145) this.field2400.method3371()) {
            if (!this.field2397.method2804(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2435) {
                        this.method2902(var4, arg0, var5, var6, var5 + var6);
                        var4.field2435 -= var6;
                        break;
                    }
                    this.method2902(var4, arg0, var5, var4.field2435, var5 + var6);
                    var5 += var4.field2435;
                    var6 -= var4.field2435;
                } while (!this.field2397.method2818(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ek.ah(I)V")
    public void method1002(int arg0) {
        this.field2396.method1002(arg0);
        for (class145 var2 = (class145) this.field2400.method3369(); var2 != null; var2 = (class145) this.field2400.method3371()) {
            if (!this.field2397.method2804(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2435) {
                        this.method2901(var2, var3);
                        var2.field2435 -= var3;
                        break;
                    }
                    this.method2901(var2, var2.field2435);
                    var3 -= var2.field2435;
                } while (!this.field2397.method2818(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ek.i(Lec;[IIIII)V")
    public void method2902(class145 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2397.field2368[arg0.field2432] & 0x4) != 0 && arg0.field2417 < 0) {
            int var6 = this.field2397.field2357[arg0.field2432] / Statics.field87;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2424) / var6;
                if (var7 > arg3) {
                    arg0.field2424 += arg3 * var6;
                    break;
                }
                arg0.field2437.method990(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2424 += var6 * var7 - 1048576;
                int var8 = Statics.field87 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2437;
                if (this.field2397.field2371[arg0.field2432] == 0) {
                    arg0.field2437 = class45.method980(arg0.field2419, var10.method1050(), var10.method986(), var10.method987());
                } else {
                    arg0.field2437 = class45.method980(arg0.field2419, var10.method1050(), 0, var10.method987());
                    this.field2397.method2801(arg0, arg0.field2418.field2345[arg0.field2433] < 0);
                    arg0.field2437.method1054(var8, var10.method986());
                }
                if (arg0.field2418.field2345[arg0.field2433] < 0) {
                    arg0.field2437.method982(-1);
                }
                var10.method993(var8);
                var10.method990(arg1, arg2, arg4 - arg2);
                if (var10.method1016()) {
                    this.field2396.method1132(var10);
                }
            }
        }
        arg0.field2437.method990(arg1, arg2, arg3);
    }

    @ObfuscatedName("ek.v(Lec;IB)V")
    public void method2901(class145 arg0, int arg1) {
        if ((this.field2397.field2368[arg0.field2432] & 0x4) != 0 && arg0.field2417 < 0) {
            int var3 = this.field2397.field2357[arg0.field2432] / Statics.field87;
            int var4 = (var3 + 1048575 - arg0.field2424) / var3;
            arg0.field2424 = arg0.field2424 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2397.field2371[arg0.field2432] == 0) {
                    arg0.field2437 = class45.method980(arg0.field2419, arg0.field2437.method1050(), arg0.field2437.method986(), arg0.field2437.method987());
                } else {
                    arg0.field2437 = class45.method980(arg0.field2419, arg0.field2437.method1050(), 0, arg0.field2437.method987());
                    this.field2397.method2801(arg0, arg0.field2418.field2345[arg0.field2433] < 0);
                }
                if (arg0.field2418.field2345[arg0.field2433] < 0) {
                    arg0.field2437.method982(-1);
                }
                arg1 = arg0.field2424 / var3;
            }
        }
        arg0.field2437.method1002(arg1);
    }
}
