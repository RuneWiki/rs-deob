package deob;

@ObfuscatedName("gq")
public class class203 extends class116 {

    @ObfuscatedName("gq.q")
    public class199 field2486;

    @ObfuscatedName("gq.e")
    public class262 field2485 = new class262();

    @ObfuscatedName("gq.p")
    public class99 field2488 = new class99();

    public class203(class199 arg0) {
        this.field2486 = arg0;
    }

    @ObfuscatedName("gq.l()Ldx;")
    public class116 method2079() {
        class200 var1 = (class200) this.field2485.method4507();
        if (var1 == null) {
            return null;
        } else if (var1.field2455 == null) {
            return this.method2080();
        } else {
            return var1.field2455;
        }
    }

    @ObfuscatedName("gq.b()Ldx;")
    public class116 method2080() {
        class200 var1;
        do {
            var1 = (class200) this.field2485.method4509();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2455 == null);
        return var1.field2455;
    }

    @ObfuscatedName("gq.i()I")
    public int method2081() {
        return 0;
    }

    @ObfuscatedName("gq.c([III)V")
    public void method2082(int[] arg0, int arg1, int arg2) {
        this.field2488.method2082(arg0, arg1, arg2);
        for (class200 var4 = (class200) this.field2485.method4507(); var4 != null; var4 = (class200) this.field2485.method4509()) {
            if (!this.field2486.method3409(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2456) {
                        this.method3547(var4, arg0, var5, var6, var5 + var6);
                        var4.field2456 -= var6;
                        break;
                    }
                    this.method3547(var4, arg0, var5, var4.field2456, var5 + var6);
                    var5 += var4.field2456;
                    var6 -= var4.field2456;
                } while (!this.field2486.method3410(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gq.x(I)V")
    public void method2084(int arg0) {
        this.field2488.method2084(arg0);
        for (class200 var2 = (class200) this.field2485.method4507(); var2 != null; var2 = (class200) this.field2485.method4509()) {
            if (!this.field2486.method3409(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2456) {
                        this.method3548(var2, var3);
                        var2.field2456 -= var3;
                        break;
                    }
                    this.method3548(var2, var2.field2456);
                    var3 -= var2.field2456;
                } while (!this.field2486.method3410(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gq.q(Lgi;[IIIII)V")
    public void method3547(class200 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2486.field2422[arg0.field2441] & 0x4) != 0 && arg0.field2437 < 0) {
            int var6 = this.field2486.field2409[arg0.field2441] / Statics.field2079;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2445) / var6;
                if (var7 > arg3) {
                    arg0.field2445 += arg3 * var6;
                    break;
                }
                arg0.field2455.method2082(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2445 += var6 * var7 - 1048576;
                int var8 = Statics.field2079 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class114 var10 = arg0.field2455;
                if (this.field2486.field2411[arg0.field2441] == 0) {
                    arg0.field2455 = class114.method2304(arg0.field2440, var10.method2318(), var10.method2311(), var10.method2320());
                } else {
                    arg0.field2455 = class114.method2304(arg0.field2440, var10.method2318(), 0, var10.method2320());
                    this.field2486.method3426(arg0, arg0.field2438.field2483[arg0.field2451] < 0);
                    arg0.field2455.method2314(var8, var10.method2311());
                }
                if (arg0.field2438.field2483[arg0.field2451] < 0) {
                    arg0.field2455.method2393(-1);
                }
                var10.method2319(var8);
                var10.method2082(arg1, arg2, arg4 - arg2);
                if (var10.method2352()) {
                    this.field2488.method2090(var10);
                }
            }
        }
        arg0.field2455.method2082(arg1, arg2, arg3);
    }

    @ObfuscatedName("gq.w(Lgi;II)V")
    public void method3548(class200 arg0, int arg1) {
        if ((this.field2486.field2422[arg0.field2441] & 0x4) != 0 && arg0.field2437 < 0) {
            int var3 = this.field2486.field2409[arg0.field2441] / Statics.field2079;
            int var4 = (var3 + 1048575 - arg0.field2445) / var3;
            arg0.field2445 = arg0.field2445 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2486.field2411[arg0.field2441] == 0) {
                    arg0.field2455 = class114.method2304(arg0.field2440, arg0.field2455.method2318(), arg0.field2455.method2311(), arg0.field2455.method2320());
                } else {
                    arg0.field2455 = class114.method2304(arg0.field2440, arg0.field2455.method2318(), 0, arg0.field2455.method2320());
                    this.field2486.method3426(arg0, arg0.field2438.field2483[arg0.field2451] < 0);
                }
                if (arg0.field2438.field2483[arg0.field2451] < 0) {
                    arg0.field2455.method2393(-1);
                }
                arg1 = arg0.field2445 / var3;
            }
        }
        arg0.field2455.method2084(arg1);
    }
}
