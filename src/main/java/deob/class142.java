package deob;

@ObfuscatedName("er")
public class class142 extends class47 {

    @ObfuscatedName("er.z")
    public class140 field2362;

    @ObfuscatedName("er.h")
    public class175 field2364 = new class175();

    @ObfuscatedName("er.c")
    public class45 field2361 = new class45();

    public class142(class140 arg0) {
        this.field2362 = arg0;
    }

    @ObfuscatedName("er.x()Laa;")
    public class47 method987() {
        class144 var1 = (class144) this.field2364.method3317();
        if (var1 == null) {
            return null;
        } else if (var1.field2383 == null) {
            return this.method962();
        } else {
            return var1.field2383;
        }
    }

    @ObfuscatedName("er.w()Laa;")
    public class47 method962() {
        class144 var1;
        do {
            var1 = (class144) this.field2364.method3310();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2383 == null);
        return var1.field2383;
    }

    @ObfuscatedName("er.j()I")
    public int method963() {
        return 0;
    }

    @ObfuscatedName("er.s([III)V")
    public void method976(int[] arg0, int arg1, int arg2) {
        this.field2361.method976(arg0, arg1, arg2);
        for (class144 var4 = (class144) this.field2364.method3317(); var4 != null; var4 = (class144) this.field2364.method3310()) {
            if (!this.field2362.method2774(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2400) {
                        this.method2837(var4, arg0, var5, var6, var5 + var6);
                        var4.field2400 -= var6;
                        break;
                    }
                    this.method2837(var4, arg0, var5, var4.field2400, var5 + var6);
                    var5 += var4.field2400;
                    var6 -= var4.field2400;
                } while (!this.field2362.method2745(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("er.au(I)V")
    public void method965(int arg0) {
        this.field2361.method965(arg0);
        for (class144 var2 = (class144) this.field2364.method3317(); var2 != null; var2 = (class144) this.field2364.method3310()) {
            if (!this.field2362.method2774(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2400) {
                        this.method2838(var2, var3);
                        var2.field2400 -= var3;
                        break;
                    }
                    this.method2838(var2, var2.field2400);
                    var3 -= var2.field2400;
                } while (!this.field2362.method2745(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("er.z(Les;[IIIIB)V")
    public void method2837(class144 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2362.field2331[arg0.field2387] & 0x4) != 0 && arg0.field2381 < 0) {
            int var6 = this.field2362.field2336[arg0.field2387] / Statics.field2409;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2402) / var6;
                if (var7 > arg3) {
                    arg0.field2402 += arg3 * var6;
                    break;
                }
                arg0.field2383.method976(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2402 += var6 * var7 - 1048576;
                int var8 = Statics.field2409 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class44 var10 = arg0.field2383;
                if (this.field2362.field2324[arg0.field2387] == 0) {
                    arg0.field2383 = class44.method944(arg0.field2399, var10.method1032(), var10.method1003(), var10.method951());
                } else {
                    arg0.field2383 = class44.method944(arg0.field2399, var10.method1032(), 0, var10.method951());
                    this.field2362.method2726(arg0, arg0.field2382.field2306[arg0.field2386] < 0);
                    arg0.field2383.method955(var8, var10.method1003());
                }
                if (arg0.field2382.field2306[arg0.field2386] < 0) {
                    arg0.field2383.method946(-1);
                }
                var10.method957(var8);
                var10.method976(arg1, arg2, arg4 - arg2);
                if (var10.method960()) {
                    this.field2361.method1094(var10);
                }
            }
        }
        arg0.field2383.method976(arg1, arg2, arg3);
    }

    @ObfuscatedName("er.h(Les;IB)V")
    public void method2838(class144 arg0, int arg1) {
        if ((this.field2362.field2331[arg0.field2387] & 0x4) != 0 && arg0.field2381 < 0) {
            int var3 = this.field2362.field2336[arg0.field2387] / Statics.field2409;
            int var4 = (var3 + 1048575 - arg0.field2402) / var3;
            arg0.field2402 = arg0.field2402 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2362.field2324[arg0.field2387] == 0) {
                    arg0.field2383 = class44.method944(arg0.field2399, arg0.field2383.method1032(), arg0.field2383.method1003(), arg0.field2383.method951());
                } else {
                    arg0.field2383 = class44.method944(arg0.field2399, arg0.field2383.method1032(), 0, arg0.field2383.method951());
                    this.field2362.method2726(arg0, arg0.field2382.field2306[arg0.field2386] < 0);
                }
                if (arg0.field2382.field2306[arg0.field2386] < 0) {
                    arg0.field2383.method946(-1);
                }
                arg1 = arg0.field2402 / var3;
            }
        }
        arg0.field2383.method965(arg1);
    }
}
