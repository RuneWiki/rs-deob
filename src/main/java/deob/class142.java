package deob;

@ObfuscatedName("ec")
public class class142 extends class47 {

    @ObfuscatedName("ec.p")
    public class140 field2409;

    @ObfuscatedName("ec.j")
    public class176 field2406 = new class176();

    @ObfuscatedName("ec.h")
    public class45 field2408 = new class45();

    public class142(class140 arg0) {
        this.field2409 = arg0;
    }

    @ObfuscatedName("ec.r()Lau;")
    public class47 method934() {
        class144 var1 = (class144) this.field2406.method3285();
        if (var1 == null) {
            return null;
        } else if (var1.field2442 == null) {
            return this.method935();
        } else {
            return var1.field2442;
        }
    }

    @ObfuscatedName("ec.t()Lau;")
    public class47 method935() {
        class144 var1;
        do {
            var1 = (class144) this.field2406.method3299();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2442 == null);
        return var1.field2442;
    }

    @ObfuscatedName("ec.b()I")
    public int method936() {
        return 0;
    }

    @ObfuscatedName("ec.q([III)V")
    public void method972(int[] arg0, int arg1, int arg2) {
        this.field2408.method972(arg0, arg1, arg2);
        for (class144 var4 = (class144) this.field2406.method3285(); var4 != null; var4 = (class144) this.field2406.method3299()) {
            if (!this.field2409.method2755(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2430) {
                        this.method2771(var4, arg0, var5, var6, var5 + var6);
                        var4.field2430 -= var6;
                        break;
                    }
                    this.method2771(var4, arg0, var5, var4.field2430, var5 + var6);
                    var5 += var4.field2430;
                    var6 -= var4.field2430;
                } while (!this.field2409.method2693(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ec.ae(I)V")
    public void method1039(int arg0) {
        this.field2408.method1039(arg0);
        for (class144 var2 = (class144) this.field2406.method3285(); var2 != null; var2 = (class144) this.field2406.method3299()) {
            if (!this.field2409.method2755(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2430) {
                        this.method2773(var2, var3);
                        var2.field2430 -= var3;
                        break;
                    }
                    this.method2773(var2, var2.field2430);
                    var3 -= var2.field2430;
                } while (!this.field2409.method2693(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ec.p(Lex;[IIIIB)V")
    public void method2771(class144 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2409.field2382[arg0.field2441] & 0x4) != 0 && arg0.field2438 < 0) {
            int var6 = this.field2409.field2387[arg0.field2441] / Statics.field1265;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2444) / var6;
                if (var7 > arg3) {
                    arg0.field2444 += arg3 * var6;
                    break;
                }
                arg0.field2442.method972(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2444 += var6 * var7 - 1048576;
                int var8 = Statics.field1265 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class44 var10 = arg0.field2442;
                if (this.field2409.field2385[arg0.field2441] == 0) {
                    arg0.field2442 = class44.method916(arg0.field2426, var10.method997(), var10.method1032(), var10.method923());
                } else {
                    arg0.field2442 = class44.method916(arg0.field2426, var10.method997(), 0, var10.method923());
                    this.field2409.method2698(arg0, arg0.field2439.field2362[arg0.field2443] < 0);
                    arg0.field2442.method927(var8, var10.method1032());
                }
                if (arg0.field2439.field2362[arg0.field2443] < 0) {
                    arg0.field2442.method1009(-1);
                }
                var10.method929(var8);
                var10.method972(arg1, arg2, arg4 - arg2);
                if (var10.method930()) {
                    this.field2408.method1062(var10);
                }
            }
        }
        arg0.field2442.method972(arg1, arg2, arg3);
    }

    @ObfuscatedName("ec.j(Lex;II)V")
    public void method2773(class144 arg0, int arg1) {
        if ((this.field2409.field2382[arg0.field2441] & 0x4) != 0 && arg0.field2438 < 0) {
            int var3 = this.field2409.field2387[arg0.field2441] / Statics.field1265;
            int var4 = (var3 + 1048575 - arg0.field2444) / var3;
            arg0.field2444 = arg0.field2444 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2409.field2385[arg0.field2441] == 0) {
                    arg0.field2442 = class44.method916(arg0.field2426, arg0.field2442.method997(), arg0.field2442.method1032(), arg0.field2442.method923());
                } else {
                    arg0.field2442 = class44.method916(arg0.field2426, arg0.field2442.method997(), 0, arg0.field2442.method923());
                    this.field2409.method2698(arg0, arg0.field2439.field2362[arg0.field2443] < 0);
                }
                if (arg0.field2439.field2362[arg0.field2443] < 0) {
                    arg0.field2442.method1009(-1);
                }
                arg1 = arg0.field2444 / var3;
            }
        }
        arg0.field2442.method1039(arg1);
    }
}
