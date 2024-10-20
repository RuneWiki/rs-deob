package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ef")
public class class147 extends class146 {

    @ObfuscatedName("ef.m")
    public class121 field2470;

    @ObfuscatedName("ef.f")
    public class121 field2464;

    @ObfuscatedName("ef.k")
    public int field2465;

    @ObfuscatedName("ef.p")
    public volatile boolean field2466 = false;

    @ObfuscatedName("ef.n")
    public boolean field2467 = false;

    @ObfuscatedName("ef.j")
    public volatile boolean[] field2468;

    @ObfuscatedName("ef.x")
    public static CRC32 field2469 = new CRC32();

    @ObfuscatedName("ef.al")
    public int field2472;

    @ObfuscatedName("ef.au")
    public int field2463;

    @ObfuscatedName("ef.az")
    public int field2475 = -1;

    public class147(class121 arg0, class121 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2470 = arg0;
        this.field2464 = arg1;
        this.field2465 = arg2;
        this.field2467 = arg5;
        class150.method2728(this, this.field2465);
    }

    @ObfuscatedName("ef.cu(I)I")
    public int method2831() {
        if (this.field2466) {
            return 100;
        } else if (this.field2455 == null) {
            int var1 = class150.method238(255, this.field2465);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ef.c(II)V")
    public void method2739(int arg0) {
        class150.method2545(this.field2465, arg0);
    }

    @ObfuscatedName("ef.e(II)V")
    public void method2748(int arg0) {
        if (this.field2470 == null || this.field2468 == null || !this.field2468[arg0]) {
            class150.method1067(this, this.field2465, arg0, this.field2451[arg0], (byte) 2, true);
        } else {
            class149.method87(arg0, this.field2470, this);
        }
    }

    @ObfuscatedName("ef.cf(III)V")
    public void method2825(int arg0, int arg1) {
        this.field2472 = arg0;
        this.field2463 = arg1;
        if (this.field2464 == null) {
            class150.method1067(this, 255, this.field2465, this.field2472, (byte) 0, true);
        } else {
            class149.method87(this.field2465, this.field2464, this);
        }
    }

    @ObfuscatedName("ef.cj(I[BZZI)V")
    public void method2826(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2450[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2450[arg0];
            if (this.field2470 != null) {
                class121 var12 = this.field2470;
                class148 var13 = new class148();
                var13.field2481 = 0;
                var13.field2871 = (long) arg0;
                var13.field2477 = arg1;
                var13.field2478 = var12;
                class177 var14 = class149.field2489;
                synchronized (class149.field2489) {
                    class149.field2489.method3251(var13);
                }
                Object var16 = class149.field2486;
                synchronized (class149.field2486) {
                    if (class149.field2485 == 0) {
                        Statics.field649.method2498(new class149(), 5);
                    }
                    class149.field2485 = 600;
                }
                this.field2468[arg0] = true;
            }
            if (arg3) {
                this.field2455[arg0] = class112.method1001(arg1, false);
            }
            return;
        }
        if (this.field2466) {
            throw new RuntimeException();
        }
        if (this.field2464 != null) {
            int var5 = this.field2465;
            class121 var6 = this.field2464;
            class148 var7 = new class148();
            var7.field2481 = 0;
            var7.field2871 = (long) var5;
            var7.field2477 = arg1;
            var7.field2478 = var6;
            class177 var8 = class149.field2489;
            synchronized (class149.field2489) {
                class149.field2489.method3251(var7);
            }
            Object var10 = class149.field2486;
            synchronized (class149.field2486) {
                if (class149.field2485 == 0) {
                    Statics.field649.method2498(new class149(), 5);
                }
                class149.field2485 = 600;
            }
        }
        this.method2798(arg1);
        this.method2842();
    }

    @ObfuscatedName("ef.cx(Ldh;I[BZI)V")
    public void method2827(class121 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2464 != arg0) {
            if (!arg3 && this.field2475 == arg1) {
                this.field2466 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2468[arg1] = false;
                if (this.field2467 || arg3) {
                    class150.method1067(this, this.field2465, arg1, this.field2451[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2469.reset();
            field2469.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2469.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2451[arg1] != var9 || this.field2450[arg1] != var10) {
                this.field2468[arg1] = false;
                if (this.field2467 || arg3) {
                    class150.method1067(this, this.field2465, arg1, this.field2451[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2468[arg1] = true;
            if (arg3) {
                this.field2455[arg1] = class112.method1001(arg2, false);
            }
            return;
        }
        if (this.field2466) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class150.method1067(this, 255, this.field2465, this.field2472, (byte) 0, true);
            return;
        }
        field2469.reset();
        field2469.update(arg2, 0, arg2.length);
        int var5 = (int) field2469.getValue();
        class107 var6 = new class107(class146.method5(arg2));
        int var7 = var6.method2151();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2156();
        }
        if (this.field2472 != var5 || this.field2463 != var8) {
            class150.method1067(this, 255, this.field2465, this.field2472, (byte) 0, true);
            return;
        }
        this.method2798(arg2);
        this.method2842();
    }

    @ObfuscatedName("ef.cz(B)V")
    public void method2842() {
        this.field2468 = new boolean[this.field2455.length];
        for (int var1 = 0; var1 < this.field2468.length; var1++) {
            this.field2468[var1] = false;
        }
        if (this.field2470 == null) {
            this.field2466 = true;
            return;
        }
        this.field2475 = -1;
        for (int var2 = 0; var2 < this.field2468.length; var2++) {
            if (this.field2449[var2] > 0) {
                class149.method1796(var2, this.field2470, this);
                this.field2475 = var2;
            }
        }
        if (this.field2475 == -1) {
            this.field2466 = true;
        }
    }

    @ObfuscatedName("ef.cs(II)I")
    public int method2841(int arg0) {
        if (this.field2455[arg0] != null) {
            return 100;
        } else if (this.field2468[arg0]) {
            return 100;
        } else {
            int var2 = this.field2465;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field620 != null && Statics.field620.field2871 == var3) {
                var5 = Statics.field238.field1837 * 99 / (Statics.field238.field1841.length - Statics.field620.field2515) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ef.ci(I)I")
    public int method2829() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2455.length; var3++) {
            if (this.field2449[var3] > 0) {
                var1 += 100;
                var2 += this.method2841(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
