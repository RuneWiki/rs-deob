package deob;

@ObfuscatedName("hi")
public class class212 extends class125 {

    @ObfuscatedName("hi.h")
    public class208 field2504;

    @ObfuscatedName("hi.v")
    public class273 field2503 = new class273();

    @ObfuscatedName("hi.x")
    public class108 field2505 = new class108();

    public class212(class208 arg0) {
        this.field2504 = arg0;
    }

    @ObfuscatedName("hi.j()Ldi;")
    public class125 method2189() {
        class209 var1 = (class209) this.field2503.method4540();
        if (var1 == null) {
            return null;
        } else if (var1.field2475 == null) {
            return this.method2188();
        } else {
            return var1.field2475;
        }
    }

    @ObfuscatedName("hi.n()Ldi;")
    public class125 method2188() {
        class209 var1;
        do {
            var1 = (class209) this.field2503.method4545();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2475 == null);
        return var1.field2475;
    }

    @ObfuscatedName("hi.p()I")
    public int method2215() {
        return 0;
    }

    @ObfuscatedName("hi.l([III)V")
    public void method2192(int[] arg0, int arg1, int arg2) {
        this.field2505.method2192(arg0, arg1, arg2);
        for (class209 var4 = (class209) this.field2503.method4540(); var4 != null; var4 = (class209) this.field2503.method4545()) {
            if (!this.field2504.method3526(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2476) {
                        this.method3602(var4, arg0, var5, var6, var5 + var6);
                        var4.field2476 -= var6;
                        break;
                    }
                    this.method3602(var4, arg0, var5, var4.field2476, var5 + var6);
                    var5 += var4.field2476;
                    var6 -= var4.field2476;
                } while (!this.field2504.method3473(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hi.u(I)V")
    public void method2197(int arg0) {
        this.field2505.method2197(arg0);
        for (class209 var2 = (class209) this.field2503.method4540(); var2 != null; var2 = (class209) this.field2503.method4545()) {
            if (!this.field2504.method3526(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2476) {
                        this.method3603(var2, var3);
                        var2.field2476 -= var3;
                        break;
                    }
                    this.method3603(var2, var2.field2476);
                    var3 -= var2.field2476;
                } while (!this.field2504.method3473(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hi.h(Lhn;[IIIII)V")
    public void method3602(class209 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2504.field2455[arg0.field2478] & 0x4) != 0 && arg0.field2471 < 0) {
            int var6 = this.field2504.field2443[arg0.field2478] / Statics.field1444;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2457) / var6;
                if (var7 > arg3) {
                    arg0.field2457 += arg3 * var6;
                    break;
                }
                arg0.field2475.method2192(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2457 += var6 * var7 - 1048576;
                int var8 = Statics.field1444 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class123 var10 = arg0.field2475;
                if (this.field2504.field2431[arg0.field2478] == 0) {
                    arg0.field2475 = class123.method2435(arg0.field2459, var10.method2430(), var10.method2421(), var10.method2422());
                } else {
                    arg0.field2475 = class123.method2435(arg0.field2459, var10.method2430(), 0, var10.method2422());
                    this.field2504.method3456(arg0, arg0.field2458.field2495[arg0.field2462] < 0);
                    arg0.field2475.method2498(var8, var10.method2421());
                }
                if (arg0.field2458.field2495[arg0.field2462] < 0) {
                    arg0.field2475.method2417(-1);
                }
                var10.method2428(var8);
                var10.method2192(arg1, arg2, arg4 - arg2);
                if (var10.method2432()) {
                    this.field2505.method2184(var10);
                }
            }
        }
        arg0.field2475.method2192(arg1, arg2, arg3);
    }

    @ObfuscatedName("hi.v(Lhn;II)V")
    public void method3603(class209 arg0, int arg1) {
        if ((this.field2504.field2455[arg0.field2478] & 0x4) != 0 && arg0.field2471 < 0) {
            int var3 = this.field2504.field2443[arg0.field2478] / Statics.field1444;
            int var4 = (var3 + 1048575 - arg0.field2457) / var3;
            arg0.field2457 = arg0.field2457 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2504.field2431[arg0.field2478] == 0) {
                    arg0.field2475 = class123.method2435(arg0.field2459, arg0.field2475.method2430(), arg0.field2475.method2421(), arg0.field2475.method2422());
                } else {
                    arg0.field2475 = class123.method2435(arg0.field2459, arg0.field2475.method2430(), 0, arg0.field2475.method2422());
                    this.field2504.method3456(arg0, arg0.field2458.field2495[arg0.field2462] < 0);
                }
                if (arg0.field2458.field2495[arg0.field2462] < 0) {
                    arg0.field2475.method2417(-1);
                }
                arg1 = arg0.field2457 / var3;
            }
        }
        arg0.field2475.method2197(arg1);
    }
}
