package deob;

@ObfuscatedName("es")
public class class146 extends class49 {

    @ObfuscatedName("es.i")
    public class144 field2434;

    @ObfuscatedName("es.b")
    public class179 field2435 = new class179();

    @ObfuscatedName("es.r")
    public class47 field2436 = new class47();

    public class146(class144 arg0) {
        this.field2434 = arg0;
    }

    @ObfuscatedName("es.y()Laz;")
    public class49 method969() {
        class148 var1 = (class148) this.field2435.method3339();
        if (var1 == null) {
            return null;
        } else if (var1.field2458 == null) {
            return this.method1008();
        } else {
            return var1.field2458;
        }
    }

    @ObfuscatedName("es.g()Laz;")
    public class49 method1008() {
        class148 var1;
        do {
            var1 = (class148) this.field2435.method3353();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2458 == null);
        return var1.field2458;
    }

    @ObfuscatedName("es.f()I")
    public int method1068() {
        return 0;
    }

    @ObfuscatedName("es.j([III)V")
    public void method978(int[] arg0, int arg1, int arg2) {
        this.field2436.method978(arg0, arg1, arg2);
        for (class148 var4 = (class148) this.field2435.method3339(); var4 != null; var4 = (class148) this.field2435.method3353()) {
            if (!this.field2434.method2812(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2472) {
                        this.method2906(var4, arg0, var5, var6, var5 + var6);
                        var4.field2472 -= var6;
                        break;
                    }
                    this.method2906(var4, arg0, var5, var4.field2472, var5 + var6);
                    var5 += var4.field2472;
                    var6 -= var4.field2472;
                } while (!this.field2434.method2813(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("es.af(I)V")
    public void method974(int arg0) {
        this.field2436.method974(arg0);
        for (class148 var2 = (class148) this.field2435.method3339(); var2 != null; var2 = (class148) this.field2435.method3353()) {
            if (!this.field2434.method2812(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2472) {
                        this.method2907(var2, var3);
                        var2.field2472 -= var3;
                        break;
                    }
                    this.method2907(var2, var2.field2472);
                    var3 -= var2.field2472;
                } while (!this.field2434.method2813(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("es.i(Lez;[IIIII)V")
    public void method2906(class148 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2434.field2409[arg0.field2465] & 0x4) != 0 && arg0.field2453 < 0) {
            int var6 = this.field2434.field2413[arg0.field2465] / Statics.field2014;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2461) / var6;
                if (var7 > arg3) {
                    arg0.field2461 += arg3 * var6;
                    break;
                }
                arg0.field2458.method978(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2461 += var6 * var7 - 1048576;
                int var8 = Statics.field2014 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class46 var10 = arg0.field2458;
                if (this.field2434.field2411[arg0.field2465] == 0) {
                    arg0.field2458 = class46.method958(arg0.field2460, var10.method972(), var10.method1000(), var10.method1024());
                } else {
                    arg0.field2458 = class46.method958(arg0.field2460, var10.method972(), 0, var10.method1024());
                    this.field2434.method2797(arg0, arg0.field2455.field2388[arg0.field2467] < 0);
                    arg0.field2458.method968(var8, var10.method1000());
                }
                if (arg0.field2455.field2388[arg0.field2467] < 0) {
                    arg0.field2458.method1033(-1);
                }
                var10.method970(var8);
                var10.method978(arg1, arg2, arg4 - arg2);
                if (var10.method986()) {
                    this.field2436.method1120(var10);
                }
            }
        }
        arg0.field2458.method978(arg1, arg2, arg3);
    }

    @ObfuscatedName("es.b(Lez;II)V")
    public void method2907(class148 arg0, int arg1) {
        if ((this.field2434.field2409[arg0.field2465] & 0x4) != 0 && arg0.field2453 < 0) {
            int var3 = this.field2434.field2413[arg0.field2465] / Statics.field2014;
            int var4 = (var3 + 1048575 - arg0.field2461) / var3;
            arg0.field2461 = arg0.field2461 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2434.field2411[arg0.field2465] == 0) {
                    arg0.field2458 = class46.method958(arg0.field2460, arg0.field2458.method972(), arg0.field2458.method1000(), arg0.field2458.method1024());
                } else {
                    arg0.field2458 = class46.method958(arg0.field2460, arg0.field2458.method972(), 0, arg0.field2458.method1024());
                    this.field2434.method2797(arg0, arg0.field2455.field2388[arg0.field2467] < 0);
                }
                if (arg0.field2455.field2388[arg0.field2467] < 0) {
                    arg0.field2458.method1033(-1);
                }
                arg1 = arg0.field2461 / var3;
            }
        }
        arg0.field2458.method974(arg1);
    }
}
