package deob;

@ObfuscatedName("el")
public class class145 extends class48 {

    @ObfuscatedName("el.l")
    public class143 field2417;

    @ObfuscatedName("el.b")
    public class178 field2418 = new class178();

    @ObfuscatedName("el.o")
    public class46 field2419 = new class46();

    public class145(class143 arg0) {
        this.field2417 = arg0;
    }

    @ObfuscatedName("el.h()Las;")
    public class48 method963() {
        class147 var1 = (class147) this.field2418.method3343();
        if (var1 == null) {
            return null;
        } else if (var1.field2442 == null) {
            return this.method1090();
        } else {
            return var1.field2442;
        }
    }

    @ObfuscatedName("el.f()Las;")
    public class48 method1090() {
        class147 var1;
        do {
            var1 = (class147) this.field2418.method3328();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2442 == null);
        return var1.field2442;
    }

    @ObfuscatedName("el.t()I")
    public int method965() {
        return 0;
    }

    @ObfuscatedName("el.x([III)V")
    public void method1095(int[] arg0, int arg1, int arg2) {
        this.field2419.method1095(arg0, arg1, arg2);
        for (class147 var4 = (class147) this.field2418.method3343(); var4 != null; var4 = (class147) this.field2418.method3328()) {
            if (!this.field2417.method2799(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2455) {
                        this.method2892(var4, arg0, var5, var6, var5 + var6);
                        var4.field2455 -= var6;
                        break;
                    }
                    this.method2892(var4, arg0, var5, var4.field2455, var5 + var6);
                    var5 += var4.field2455;
                    var6 -= var4.field2455;
                } while (!this.field2417.method2800(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("el.ar(I)V")
    public void method967(int arg0) {
        this.field2419.method967(arg0);
        for (class147 var2 = (class147) this.field2418.method3343(); var2 != null; var2 = (class147) this.field2418.method3328()) {
            if (!this.field2417.method2799(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2455) {
                        this.method2893(var2, var3);
                        var2.field2455 -= var3;
                        break;
                    }
                    this.method2893(var2, var2.field2455);
                    var3 -= var2.field2455;
                } while (!this.field2417.method2800(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("el.l(Lej;[IIIII)V")
    public void method2892(class147 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2417.field2388[arg0.field2454] & 0x4) != 0 && arg0.field2450 < 0) {
            int var6 = this.field2417.field2377[arg0.field2454] / Statics.field745;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2436) / var6;
                if (var7 > arg3) {
                    arg0.field2436 += arg3 * var6;
                    break;
                }
                arg0.field2442.method1095(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2436 += var6 * var7 - 1048576;
                int var8 = Statics.field745 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2442;
                if (this.field2417.field2391[arg0.field2454] == 0) {
                    arg0.field2442 = class45.method945(arg0.field2438, var10.method960(), var10.method951(), var10.method1021());
                } else {
                    arg0.field2442 = class45.method945(arg0.field2438, var10.method960(), 0, var10.method1021());
                    this.field2417.method2815(arg0, arg0.field2437.field2368[arg0.field2441] < 0);
                    arg0.field2442.method1087(var8, var10.method951());
                }
                if (arg0.field2437.field2368[arg0.field2441] < 0) {
                    arg0.field2442.method947(-1);
                }
                var10.method1052(var8);
                var10.method1095(arg1, arg2, arg4 - arg2);
                if (var10.method962()) {
                    this.field2419.method1101(var10);
                }
            }
        }
        arg0.field2442.method1095(arg1, arg2, arg3);
    }

    @ObfuscatedName("el.b(Lej;IB)V")
    public void method2893(class147 arg0, int arg1) {
        if ((this.field2417.field2388[arg0.field2454] & 0x4) != 0 && arg0.field2450 < 0) {
            int var3 = this.field2417.field2377[arg0.field2454] / Statics.field745;
            int var4 = (var3 + 1048575 - arg0.field2436) / var3;
            arg0.field2436 = arg0.field2436 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2417.field2391[arg0.field2454] == 0) {
                    arg0.field2442 = class45.method945(arg0.field2438, arg0.field2442.method960(), arg0.field2442.method951(), arg0.field2442.method1021());
                } else {
                    arg0.field2442 = class45.method945(arg0.field2438, arg0.field2442.method960(), 0, arg0.field2442.method1021());
                    this.field2417.method2815(arg0, arg0.field2437.field2368[arg0.field2441] < 0);
                }
                if (arg0.field2437.field2368[arg0.field2441] < 0) {
                    arg0.field2442.method947(-1);
                }
                arg1 = arg0.field2436 / var3;
            }
        }
        arg0.field2442.method967(arg1);
    }
}
