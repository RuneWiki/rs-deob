package deob;

@ObfuscatedName("ea")
public class class142 extends class47 {

    @ObfuscatedName("ea.j")
    public class140 field2378;

    @ObfuscatedName("ea.y")
    public class175 field2377 = new class175();

    @ObfuscatedName("ea.x")
    public class45 field2376 = new class45();

    public class142(class140 arg0) {
        this.field2378 = arg0;
    }

    @ObfuscatedName("ea.l()Lak;")
    public class47 method947() {
        class144 var1 = (class144) this.field2377.method3279();
        if (var1 == null) {
            return null;
        } else if (var1.field2403 == null) {
            return this.method977();
        } else {
            return var1.field2403;
        }
    }

    @ObfuscatedName("ea.a()Lak;")
    public class47 method977() {
        class144 var1;
        do {
            var1 = (class144) this.field2377.method3249();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2403 == null);
        return var1.field2403;
    }

    @ObfuscatedName("ea.f()I")
    public int method981() {
        return 0;
    }

    @ObfuscatedName("ea.h([III)V")
    public void method1077(int[] arg0, int arg1, int arg2) {
        this.field2376.method1077(arg0, arg1, arg2);
        for (class144 var4 = (class144) this.field2377.method3279(); var4 != null; var4 = (class144) this.field2377.method3249()) {
            if (!this.field2378.method2670(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2412) {
                        this.method2783(var4, arg0, var5, var6, var5 + var6);
                        var4.field2412 -= var6;
                        break;
                    }
                    this.method2783(var4, arg0, var5, var4.field2412, var5 + var6);
                    var5 += var4.field2412;
                    var6 -= var4.field2412;
                } while (!this.field2378.method2738(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ea.az(I)V")
    public void method951(int arg0) {
        this.field2376.method951(arg0);
        for (class144 var2 = (class144) this.field2377.method3279(); var2 != null; var2 = (class144) this.field2377.method3249()) {
            if (!this.field2378.method2670(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2412) {
                        this.method2782(var2, var3);
                        var2.field2412 -= var3;
                        break;
                    }
                    this.method2782(var2, var2.field2412);
                    var3 -= var2.field2412;
                } while (!this.field2378.method2738(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ea.j(Lei;[IIIII)V")
    public void method2783(class144 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2378.field2348[arg0.field2416] & 0x4) != 0 && arg0.field2409 < 0) {
            int var6 = this.field2378.field2356[arg0.field2416] / Statics.field1091;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2407) / var6;
                if (var7 > arg3) {
                    arg0.field2407 += arg3 * var6;
                    break;
                }
                arg0.field2403.method1077(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2407 += var6 * var7 - 1048576;
                int var8 = Statics.field1091 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class44 var10 = arg0.field2403;
                if (this.field2378.field2363[arg0.field2416] == 0) {
                    arg0.field2403 = class44.method931(arg0.field2393, var10.method945(), var10.method936(), var10.method937());
                } else {
                    arg0.field2403 = class44.method931(arg0.field2393, var10.method945(), 0, var10.method937());
                    this.field2378.method2693(arg0, arg0.field2394.field2325[arg0.field2398] < 0);
                    arg0.field2403.method995(var8, var10.method936());
                }
                if (arg0.field2394.field2325[arg0.field2398] < 0) {
                    arg0.field2403.method933(-1);
                }
                var10.method943(var8);
                var10.method1077(arg1, arg2, arg4 - arg2);
                if (var10.method1049()) {
                    this.field2376.method1099(var10);
                }
            }
        }
        arg0.field2403.method1077(arg1, arg2, arg3);
    }

    @ObfuscatedName("ea.y(Lei;IB)V")
    public void method2782(class144 arg0, int arg1) {
        if ((this.field2378.field2348[arg0.field2416] & 0x4) != 0 && arg0.field2409 < 0) {
            int var3 = this.field2378.field2356[arg0.field2416] / Statics.field1091;
            int var4 = (var3 + 1048575 - arg0.field2407) / var3;
            arg0.field2407 = arg0.field2407 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2378.field2363[arg0.field2416] == 0) {
                    arg0.field2403 = class44.method931(arg0.field2393, arg0.field2403.method945(), arg0.field2403.method936(), arg0.field2403.method937());
                } else {
                    arg0.field2403 = class44.method931(arg0.field2393, arg0.field2403.method945(), 0, arg0.field2403.method937());
                    this.field2378.method2693(arg0, arg0.field2394.field2325[arg0.field2398] < 0);
                }
                if (arg0.field2394.field2325[arg0.field2398] < 0) {
                    arg0.field2403.method933(-1);
                }
                arg1 = arg0.field2407 / var3;
            }
        }
        arg0.field2403.method951(arg1);
    }
}
