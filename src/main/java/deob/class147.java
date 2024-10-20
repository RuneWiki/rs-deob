package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ei")
public class class147 extends class146 {

    @ObfuscatedName("ei.m")
    public class121 field2477;

    @ObfuscatedName("ei.v")
    public class121 field2479;

    @ObfuscatedName("ei.u")
    public int field2478;

    @ObfuscatedName("ei.p")
    public volatile boolean field2485 = false;

    @ObfuscatedName("ei.l")
    public boolean field2480 = false;

    @ObfuscatedName("ei.w")
    public volatile boolean[] field2481;

    @ObfuscatedName("ei.x")
    public static CRC32 field2476 = new CRC32();

    @ObfuscatedName("ei.aj")
    public int field2483;

    @ObfuscatedName("ei.al")
    public int field2484;

    @ObfuscatedName("ei.af")
    public int field2482 = -1;

    public class147(class121 arg0, class121 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2477 = arg0;
        this.field2479 = arg1;
        this.field2478 = arg2;
        this.field2480 = arg5;
        class150.method2435(this, this.field2478);
    }

    @ObfuscatedName("ei.cx(I)I")
    public int method2842() {
        if (this.field2485) {
            return 100;
        } else if (this.field2468 == null) {
            int var1 = class150.method2432(255, this.field2478);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ei.z(II)V")
    public void method2758(int arg0) {
        int var2 = this.field2478;
        long var3 = (long) ((var2 << 16) + arg0);
        class151 var5 = (class151) class150.field2509.method3214(var3);
        if (var5 != null) {
            class150.field2518.method3279(var5);
        }
    }

    @ObfuscatedName("ei.q(IB)V")
    public void method2747(int arg0) {
        if (this.field2477 == null || this.field2481 == null || !this.field2481[arg0]) {
            class150.method486(this, this.field2478, arg0, this.field2462[arg0], (byte) 2, true);
        } else {
            class149.method2700(arg0, this.field2477, this);
        }
    }

    @ObfuscatedName("ei.ca(III)V")
    public void method2831(int arg0, int arg1) {
        this.field2483 = arg0;
        this.field2484 = arg1;
        if (this.field2479 == null) {
            class150.method486(this, 255, this.field2478, this.field2483, (byte) 0, true);
        } else {
            class149.method2700(this.field2478, this.field2479, this);
        }
    }

    @ObfuscatedName("ei.ci(I[BZZB)V")
    public void method2838(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2463[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2463[arg0];
            if (this.field2477 != null) {
                class121 var10 = this.field2477;
                class148 var11 = new class148();
                var11.field2491 = 0;
                var11.field2861 = (long) arg0;
                var11.field2486 = arg1;
                var11.field2488 = var10;
                class177 var12 = class149.field2499;
                synchronized (class149.field2499) {
                    class149.field2499.method3253(var11);
                }
                class149.method2511();
                this.field2481[arg0] = true;
            }
            if (arg3) {
                this.field2468[arg0] = class112.method2514(arg1, false);
            }
            return;
        }
        if (this.field2485) {
            throw new RuntimeException();
        }
        if (this.field2479 != null) {
            int var5 = this.field2478;
            class121 var6 = this.field2479;
            class148 var7 = new class148();
            var7.field2491 = 0;
            var7.field2861 = (long) var5;
            var7.field2486 = arg1;
            var7.field2488 = var6;
            class177 var8 = class149.field2499;
            synchronized (class149.field2499) {
                class149.field2499.method3253(var7);
            }
            class149.method2511();
        }
        this.method2737(arg1);
        this.method2848();
    }

    @ObfuscatedName("ei.ck(Ldv;I[BZI)V")
    public void method2830(class121 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2479 != arg0) {
            if (!arg3 && this.field2482 == arg1) {
                this.field2485 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2481[arg1] = false;
                if (this.field2480 || arg3) {
                    class150.method486(this, this.field2478, arg1, this.field2462[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2476.reset();
            field2476.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2476.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2462[arg1] != var9 || this.field2463[arg1] != var10) {
                this.field2481[arg1] = false;
                if (this.field2480 || arg3) {
                    class150.method486(this, this.field2478, arg1, this.field2462[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2481[arg1] = true;
            if (arg3) {
                this.field2468[arg1] = class112.method2514(arg2, false);
            }
            return;
        }
        if (this.field2485) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class150.method486(this, 255, this.field2478, this.field2483, (byte) 0, true);
            return;
        }
        field2476.reset();
        field2476.update(arg2, 0, arg2.length);
        int var5 = (int) field2476.getValue();
        class107 var6 = new class107(class146.method2407(arg2));
        int var7 = var6.method2130();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2135();
        }
        if (this.field2483 != var5 || this.field2484 != var8) {
            class150.method486(this, 255, this.field2478, this.field2483, (byte) 0, true);
            return;
        }
        this.method2737(arg2);
        this.method2848();
    }

    @ObfuscatedName("ei.cw(I)V")
    public void method2848() {
        this.field2481 = new boolean[this.field2468.length];
        for (int var1 = 0; var1 < this.field2481.length; var1++) {
            this.field2481[var1] = false;
        }
        if (this.field2477 == null) {
            this.field2485 = true;
            return;
        }
        this.field2482 = -1;
        for (int var2 = 0; var2 < this.field2481.length; var2++) {
            if (this.field2464[var2] > 0) {
                class121 var3 = this.field2477;
                class148 var5 = new class148();
                var5.field2491 = 1;
                var5.field2861 = (long) var2;
                var5.field2488 = var3;
                var5.field2489 = this;
                class177 var6 = class149.field2499;
                synchronized (class149.field2499) {
                    class149.field2499.method3253(var5);
                }
                class149.method2511();
                this.field2482 = var2;
            }
        }
        if (this.field2482 == -1) {
            this.field2485 = true;
        }
    }

    @ObfuscatedName("ei.cl(II)I")
    public int method2835(int arg0) {
        if (this.field2468[arg0] == null) {
            return this.field2481[arg0] ? 100 : class150.method2432(this.field2478, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ei.ce(I)I")
    public int method2836() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2468.length; var3++) {
            if (this.field2464[var3] > 0) {
                var1 += 100;
                var2 += this.method2835(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
