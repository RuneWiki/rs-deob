package deob;

@ObfuscatedName("ek")
public class class142 extends class47 {

    @ObfuscatedName("ek.u")
    public class140 field2388;

    @ObfuscatedName("ek.k")
    public class176 field2387 = new class176();

    @ObfuscatedName("ek.x")
    public class45 field2392 = new class45();

    public class142(class140 arg0) {
        this.field2388 = arg0;
    }

    @ObfuscatedName("ek.t()Lac;")
    public class47 method964() {
        class144 var1 = (class144) this.field2387.method3326();
        if (var1 == null) {
            return null;
        } else if (var1.field2412 == null) {
            return this.method970();
        } else {
            return var1.field2412;
        }
    }

    @ObfuscatedName("ek.r()Lac;")
    public class47 method970() {
        class144 var1;
        do {
            var1 = (class144) this.field2387.method3330();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2412 == null);
        return var1.field2412;
    }

    @ObfuscatedName("ek.p()I")
    public int method1056() {
        return 0;
    }

    @ObfuscatedName("ek.o([III)V")
    public void method1066(int[] arg0, int arg1, int arg2) {
        this.field2392.method1066(arg0, arg1, arg2);
        for (class144 var4 = (class144) this.field2387.method3326(); var4 != null; var4 = (class144) this.field2387.method3330()) {
            if (!this.field2388.method2746(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2411) {
                        this.method2816(var4, arg0, var5, var6, var5 + var6);
                        var4.field2411 -= var6;
                        break;
                    }
                    this.method2816(var4, arg0, var5, var4.field2411, var5 + var6);
                    var5 += var4.field2411;
                    var6 -= var4.field2411;
                } while (!this.field2388.method2747(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ek.ax(I)V")
    public void method968(int arg0) {
        this.field2392.method968(arg0);
        for (class144 var2 = (class144) this.field2387.method3326(); var2 != null; var2 = (class144) this.field2387.method3330()) {
            if (!this.field2388.method2746(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2411) {
                        this.method2814(var2, var3);
                        var2.field2411 -= var3;
                        break;
                    }
                    this.method2814(var2, var2.field2411);
                    var3 -= var2.field2411;
                } while (!this.field2388.method2747(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ek.u(Lex;[IIIII)V")
    public void method2816(class144 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2388.field2369[arg0.field2415] & 0x4) != 0 && arg0.field2422 < 0) {
            int var6 = this.field2388.field2370[arg0.field2415] / Statics.field1083;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2428) / var6;
                if (var7 > arg3) {
                    arg0.field2428 += arg3 * var6;
                    break;
                }
                arg0.field2412.method1066(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2428 += var6 * var7 - 1048576;
                int var8 = Statics.field1083 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class44 var10 = arg0.field2412;
                if (this.field2388.field2363[arg0.field2415] == 0) {
                    arg0.field2412 = class44.method946(arg0.field2410, var10.method961(), var10.method1000(), var10.method953());
                } else {
                    arg0.field2412 = class44.method946(arg0.field2410, var10.method961(), 0, var10.method953());
                    this.field2388.method2729(arg0, arg0.field2409.field2343[arg0.field2416] < 0);
                    arg0.field2412.method957(var8, var10.method1000());
                }
                if (arg0.field2409.field2343[arg0.field2416] < 0) {
                    arg0.field2412.method948(-1);
                }
                var10.method959(var8);
                var10.method1066(arg1, arg2, arg4 - arg2);
                if (var10.method963()) {
                    this.field2392.method1095(var10);
                }
            }
        }
        arg0.field2412.method1066(arg1, arg2, arg3);
    }

    @ObfuscatedName("ek.k(Lex;II)V")
    public void method2814(class144 arg0, int arg1) {
        if ((this.field2388.field2369[arg0.field2415] & 0x4) != 0 && arg0.field2422 < 0) {
            int var3 = this.field2388.field2370[arg0.field2415] / Statics.field1083;
            int var4 = (var3 + 1048575 - arg0.field2428) / var3;
            arg0.field2428 = arg0.field2428 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2388.field2363[arg0.field2415] == 0) {
                    arg0.field2412 = class44.method946(arg0.field2410, arg0.field2412.method961(), arg0.field2412.method1000(), arg0.field2412.method953());
                } else {
                    arg0.field2412 = class44.method946(arg0.field2410, arg0.field2412.method961(), 0, arg0.field2412.method953());
                    this.field2388.method2729(arg0, arg0.field2409.field2343[arg0.field2416] < 0);
                }
                if (arg0.field2409.field2343[arg0.field2416] < 0) {
                    arg0.field2412.method948(-1);
                }
                arg1 = arg0.field2428 / var3;
            }
        }
        arg0.field2412.method968(arg1);
    }
}
