package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ed")
public class class148 extends class147 {

    @ObfuscatedName("ed.z")
    public class121 field2490;

    @ObfuscatedName("ed.x")
    public class121 field2486;

    @ObfuscatedName("ed.e")
    public int field2487;

    @ObfuscatedName("ed.a")
    public volatile boolean field2488 = false;

    @ObfuscatedName("ed.y")
    public boolean field2489 = false;

    @ObfuscatedName("ed.f")
    public volatile boolean[] field2485;

    @ObfuscatedName("ed.u")
    public static CRC32 field2491 = new CRC32();

    @ObfuscatedName("ed.ab")
    public int field2496;

    @ObfuscatedName("ed.ai")
    public int field2493;

    @ObfuscatedName("ed.aj")
    public int field2492 = -1;

    public class148(class121 arg0, class121 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2490 = arg0;
        this.field2486 = arg1;
        this.field2487 = arg2;
        this.field2489 = arg5;
        int var8 = this.field2487;
        if (Statics.field2018 == null) {
            class151.method1816((class148) null, 255, 255, 0, (byte) 0, true);
            class151.field2529[var8] = this;
        } else {
            Statics.field2018.field1851 = var8 * 8 + 5;
            int var9 = Statics.field2018.method2097();
            int var10 = Statics.field2018.method2097();
            this.method2745(var9, var10);
        }
    }

    @ObfuscatedName("ed.ci(I)I")
    public int method2743() {
        if (this.field2488) {
            return 100;
        } else if (this.field2474 == null) {
            int var1 = this.field2487;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2062 != null && Statics.field2062.field2884 == var2) {
                var4 = Statics.field1899.field1851 * 99 / (Statics.field1899.field1854.length - Statics.field2062.field2538) + 1;
            } else {
                var4 = 0;
            }
            int var5 = var4;
            if (var4 >= 100) {
                var5 = 99;
            }
            return var5;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ed.s(II)V")
    public void method2658(int arg0) {
        int var2 = this.field2487;
        long var3 = (long) ((var2 << 16) + arg0);
        class152 var5 = (class152) class151.field2520.method3155(var3);
        if (var5 != null) {
            class151.field2519.method3240(var5);
        }
    }

    @ObfuscatedName("ed.r(II)V")
    public void method2667(int arg0) {
        if (this.field2490 == null || this.field2485 == null || !this.field2485[arg0]) {
            class151.method1816(this, this.field2487, arg0, this.field2468[arg0], (byte) 2, true);
            return;
        }
        class121 var2 = this.field2490;
        byte[] var4 = null;
        class178 var5 = class150.field2504;
        synchronized (class150.field2504) {
            for (class149 var6 = (class149) class150.field2504.method3189(); var6 != null; var6 = (class149) class150.field2504.method3182()) {
                if ((long) arg0 == var6.field2884 && var6.field2499 == var2 && var6.field2497 == 0) {
                    var4 = var6.field2502;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2400(arg0);
            this.method2747(var2, arg0, var8, true);
        } else {
            this.method2747(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ed.cw(III)V")
    public void method2745(int arg0, int arg1) {
        this.field2496 = arg0;
        this.field2493 = arg1;
        if (this.field2486 == null) {
            class151.method1816(this, 255, this.field2487, this.field2496, (byte) 0, true);
            return;
        }
        int var3 = this.field2487;
        class121 var4 = this.field2486;
        byte[] var6 = null;
        class178 var7 = class150.field2504;
        synchronized (class150.field2504) {
            for (class149 var8 = (class149) class150.field2504.method3189(); var8 != null; var8 = (class149) class150.field2504.method3182()) {
                if ((long) var3 == var8.field2884 && var8.field2499 == var4 && var8.field2497 == 0) {
                    var6 = var8.field2502;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2400(var3);
            this.method2747(var4, var3, var10, true);
        } else {
            this.method2747(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ed.cr(I[BZZI)V")
    public void method2752(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2469[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2469[arg0];
            if (this.field2490 != null) {
                class121 var12 = this.field2490;
                class149 var13 = new class149();
                var13.field2497 = 0;
                var13.field2884 = (long) arg0;
                var13.field2502 = arg1;
                var13.field2499 = var12;
                class178 var14 = class150.field2504;
                synchronized (class150.field2504) {
                    class150.field2504.method3184(var13);
                }
                Object var16 = class150.field2507;
                synchronized (class150.field2507) {
                    if (class150.field2506 == 0) {
                        Statics.field1953.method2418(new class150(), 5);
                    }
                    class150.field2506 = 600;
                }
                this.field2485[arg0] = true;
            }
            if (arg3) {
                this.field2474[arg0] = class112.method494(arg1, false);
            }
            return;
        }
        if (this.field2488) {
            throw new RuntimeException();
        }
        if (this.field2486 != null) {
            int var5 = this.field2487;
            class121 var6 = this.field2486;
            class149 var7 = new class149();
            var7.field2497 = 0;
            var7.field2884 = (long) var5;
            var7.field2502 = arg1;
            var7.field2499 = var6;
            class178 var8 = class150.field2504;
            synchronized (class150.field2504) {
                class150.field2504.method3184(var7);
            }
            Object var10 = class150.field2507;
            synchronized (class150.field2507) {
                if (class150.field2506 == 0) {
                    Statics.field1953.method2418(new class150(), 5);
                }
                class150.field2506 = 600;
            }
        }
        this.method2675(arg1);
        this.method2753();
    }

    @ObfuscatedName("ed.cl(Lds;I[BZI)V")
    public void method2747(class121 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2486 != arg0) {
            if (!arg3 && this.field2492 == arg1) {
                this.field2488 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2485[arg1] = false;
                if (this.field2489 || arg3) {
                    class151.method1816(this, this.field2487, arg1, this.field2468[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2491.reset();
            field2491.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2491.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2468[arg1] != var9 || this.field2469[arg1] != var10) {
                this.field2485[arg1] = false;
                if (this.field2489 || arg3) {
                    class151.method1816(this, this.field2487, arg1, this.field2468[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2485[arg1] = true;
            if (arg3) {
                this.field2474[arg1] = class112.method494(arg2, false);
            }
            return;
        }
        if (this.field2488) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class151.method1816(this, 255, this.field2487, this.field2496, (byte) 0, true);
            return;
        }
        field2491.reset();
        field2491.update(arg2, 0, arg2.length);
        int var5 = (int) field2491.getValue();
        class107 var6 = new class107(class147.method2842(arg2));
        int var7 = var6.method2116();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2097();
        }
        if (this.field2496 != var5 || this.field2493 != var8) {
            class151.method1816(this, 255, this.field2487, this.field2496, (byte) 0, true);
            return;
        }
        this.method2675(arg2);
        this.method2753();
    }

    @ObfuscatedName("ed.cy(B)V")
    public void method2753() {
        this.field2485 = new boolean[this.field2474.length];
        for (int var1 = 0; var1 < this.field2485.length; var1++) {
            this.field2485[var1] = false;
        }
        if (this.field2490 == null) {
            this.field2488 = true;
            return;
        }
        this.field2492 = -1;
        for (int var2 = 0; var2 < this.field2485.length; var2++) {
            if (this.field2470[var2] > 0) {
                class121 var3 = this.field2490;
                class149 var5 = new class149();
                var5.field2497 = 1;
                var5.field2884 = (long) var2;
                var5.field2499 = var3;
                var5.field2500 = this;
                class178 var6 = class150.field2504;
                synchronized (class150.field2504) {
                    class150.field2504.method3184(var5);
                }
                Object var8 = class150.field2507;
                synchronized (class150.field2507) {
                    if (class150.field2506 == 0) {
                        Statics.field1953.method2418(new class150(), 5);
                    }
                    class150.field2506 = 600;
                }
                this.field2492 = var2;
            }
        }
        if (this.field2492 == -1) {
            this.field2488 = true;
        }
    }

    @ObfuscatedName("ed.cn(II)I")
    public int method2748(int arg0) {
        if (this.field2474[arg0] != null) {
            return 100;
        } else if (this.field2485[arg0]) {
            return 100;
        } else {
            int var2 = this.field2487;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2062 != null && Statics.field2062.field2884 == var3) {
                var5 = Statics.field1899.field1851 * 99 / (Statics.field1899.field1854.length - Statics.field2062.field2538) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ed.cq(B)I")
    public int method2749() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2474.length; var3++) {
            if (this.field2470[var3] > 0) {
                var1 += 100;
                var2 += this.method2748(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
