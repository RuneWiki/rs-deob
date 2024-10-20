package deob;

@ObfuscatedName("et")
public class class144 extends class48 {

    @ObfuscatedName("et.b")
    public class142 field2443;

    @ObfuscatedName("et.c")
    public class177 field2442 = new class177();

    @ObfuscatedName("et.j")
    public class46 field2440 = new class46();

    public class144(class142 arg0) {
        this.field2443 = arg0;
    }

    @ObfuscatedName("et.h()Lao;")
    public class48 method959() {
        class146 var1 = (class146) this.field2442.method3246();
        if (var1 == null) {
            return null;
        } else if (var1.field2458 == null) {
            return this.method960();
        } else {
            return var1.field2458;
        }
    }

    @ObfuscatedName("et.p()Lao;")
    public class48 method960() {
        class146 var1;
        do {
            var1 = (class146) this.field2442.method3248();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2458 == null);
        return var1.field2458;
    }

    @ObfuscatedName("et.e()I")
    public int method961() {
        return 0;
    }

    @ObfuscatedName("et.r([III)V")
    public void method962(int[] arg0, int arg1, int arg2) {
        this.field2440.method962(arg0, arg1, arg2);
        for (class146 var4 = (class146) this.field2442.method3246(); var4 != null; var4 = (class146) this.field2442.method3248()) {
            if (!this.field2443.method2760(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2477) {
                        this.method2828(var4, arg0, var5, var6, var5 + var6);
                        var4.field2477 -= var6;
                        break;
                    }
                    this.method2828(var4, arg0, var5, var4.field2477, var5 + var6);
                    var5 += var4.field2477;
                    var6 -= var4.field2477;
                } while (!this.field2443.method2803(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("et.av(I)V")
    public void method963(int arg0) {
        this.field2440.method963(arg0);
        for (class146 var2 = (class146) this.field2442.method3246(); var2 != null; var2 = (class146) this.field2442.method3248()) {
            if (!this.field2443.method2760(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2477) {
                        this.method2832(var2, var3);
                        var2.field2477 -= var3;
                        break;
                    }
                    this.method2832(var2, var2.field2477);
                    var3 -= var2.field2477;
                } while (!this.field2443.method2803(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("et.b(Lep;[IIIII)V")
    public void method2828(class146 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2443.field2409[arg0.field2473] & 0x4) != 0 && arg0.field2472 < 0) {
            int var6 = this.field2443.field2414[arg0.field2473] / Statics.field1117;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2478) / var6;
                if (var7 > arg3) {
                    arg0.field2478 += arg3 * var6;
                    break;
                }
                arg0.field2458.method962(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2478 += var6 * var7 - 1048576;
                int var8 = Statics.field1117 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2458;
                if (this.field2443.field2412[arg0.field2473] == 0) {
                    arg0.field2458 = class45.method1085(arg0.field2460, var10.method956(), var10.method947(), var10.method948());
                } else {
                    arg0.field2458 = class45.method1085(arg0.field2460, var10.method956(), 0, var10.method948());
                    this.field2443.method2738(arg0, arg0.field2459.field2389[arg0.field2476] < 0);
                    arg0.field2458.method982(var8, var10.method947());
                }
                if (arg0.field2459.field2389[arg0.field2476] < 0) {
                    arg0.field2458.method965(-1);
                }
                var10.method1075(var8);
                var10.method962(arg1, arg2, arg4 - arg2);
                if (var10.method939()) {
                    this.field2440.method1087(var10);
                }
            }
        }
        arg0.field2458.method962(arg1, arg2, arg3);
    }

    @ObfuscatedName("et.c(Lep;IB)V")
    public void method2832(class146 arg0, int arg1) {
        if ((this.field2443.field2409[arg0.field2473] & 0x4) != 0 && arg0.field2472 < 0) {
            int var3 = this.field2443.field2414[arg0.field2473] / Statics.field1117;
            int var4 = (var3 + 1048575 - arg0.field2478) / var3;
            arg0.field2478 = arg0.field2478 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2443.field2412[arg0.field2473] == 0) {
                    arg0.field2458 = class45.method1085(arg0.field2460, arg0.field2458.method956(), arg0.field2458.method947(), arg0.field2458.method948());
                } else {
                    arg0.field2458 = class45.method1085(arg0.field2460, arg0.field2458.method956(), 0, arg0.field2458.method948());
                    this.field2443.method2738(arg0, arg0.field2459.field2389[arg0.field2476] < 0);
                }
                if (arg0.field2459.field2389[arg0.field2476] < 0) {
                    arg0.field2458.method965(-1);
                }
                arg1 = arg0.field2478 / var3;
            }
        }
        arg0.field2458.method963(arg1);
    }
}
