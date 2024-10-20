package deob;

import java.util.zip.CRC32;

@ObfuscatedName("en")
public class class152 extends class151 {

    @ObfuscatedName("en.m")
    public class125 field2497;

    @ObfuscatedName("en.c")
    public class125 field2495;

    @ObfuscatedName("en.j")
    public int field2496;

    @ObfuscatedName("en.d")
    public volatile boolean field2502 = false;

    @ObfuscatedName("en.l")
    public boolean field2498 = false;

    @ObfuscatedName("en.u")
    public volatile boolean[] field2505;

    @ObfuscatedName("en.r")
    public static CRC32 field2499 = new CRC32();

    @ObfuscatedName("en.an")
    public int field2494;

    @ObfuscatedName("en.ao")
    public int field2501;

    @ObfuscatedName("en.ah")
    public int field2503 = -1;

    public class152(class125 arg0, class125 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2497 = arg0;
        this.field2495 = arg1;
        this.field2496 = arg2;
        this.field2498 = arg5;
        class155.method1595(this, this.field2496);
    }

    @ObfuscatedName("en.ce(B)I")
    public int method2846() {
        if (this.field2502) {
            return 100;
        } else if (this.field2486 == null) {
            int var1 = this.field2496;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1531 != null && Statics.field1531.field2905 == var2) {
                var4 = Statics.field2537.field1855 * 99 / (Statics.field2537.field1862.length - Statics.field1531.field2546) + 1;
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

    @ObfuscatedName("en.e(IB)V")
    public void method2837(int arg0) {
        class155.method2402(this.field2496, arg0);
    }

    @ObfuscatedName("en.t(II)V")
    public void method2770(int arg0) {
        if (this.field2497 == null || this.field2505 == null || !this.field2505[arg0]) {
            class155.method2712(this, this.field2496, arg0, this.field2487[arg0], (byte) 2, true);
        } else {
            class154.method2736(arg0, this.field2497, this);
        }
    }

    @ObfuscatedName("en.cd(III)V")
    public void method2847(int arg0, int arg1) {
        this.field2494 = arg0;
        this.field2501 = arg1;
        if (this.field2495 == null) {
            class155.method2712(this, 255, this.field2496, this.field2494, (byte) 0, true);
        } else {
            class154.method2736(this.field2496, this.field2495, this);
        }
    }

    @ObfuscatedName("en.cl(I[BZZB)V")
    public void method2848(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2481[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2481[arg0];
            if (this.field2497 != null) {
                class125 var12 = this.field2497;
                class153 var13 = new class153();
                var13.field2508 = 0;
                var13.field2905 = (long) arg0;
                var13.field2512 = arg1;
                var13.field2509 = var12;
                class182 var14 = class154.field2520;
                synchronized (class154.field2520) {
                    class154.field2520.method3302(var13);
                }
                Object var16 = class154.field2515;
                synchronized (class154.field2515) {
                    if (class154.field2513 == 0) {
                        Statics.field1532.method2496(new class154(), 5);
                    }
                    class154.field2513 = 600;
                }
                this.field2505[arg0] = true;
            }
            if (arg3) {
                this.field2486[arg0] = class116.method888(arg1, false);
            }
            return;
        }
        if (this.field2502) {
            throw new RuntimeException();
        }
        if (this.field2495 != null) {
            int var5 = this.field2496;
            class125 var6 = this.field2495;
            class153 var7 = new class153();
            var7.field2508 = 0;
            var7.field2905 = (long) var5;
            var7.field2512 = arg1;
            var7.field2509 = var6;
            class182 var8 = class154.field2520;
            synchronized (class154.field2520) {
                class154.field2520.method3302(var7);
            }
            Object var10 = class154.field2515;
            synchronized (class154.field2515) {
                if (class154.field2513 == 0) {
                    Statics.field1532.method2496(new class154(), 5);
                }
                class154.field2513 = 600;
            }
        }
        this.method2760(arg1);
        this.method2845();
    }

    @ObfuscatedName("en.cz(Ldm;I[BZI)V")
    public void method2849(class125 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2495 != arg0) {
            if (!arg3 && this.field2503 == arg1) {
                this.field2502 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2505[arg1] = false;
                if (this.field2498 || arg3) {
                    class155.method2712(this, this.field2496, arg1, this.field2487[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2499.reset();
            field2499.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2499.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2487[arg1] != var9 || this.field2481[arg1] != var10) {
                this.field2505[arg1] = false;
                if (this.field2498 || arg3) {
                    class155.method2712(this, this.field2496, arg1, this.field2487[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2505[arg1] = true;
            if (arg3) {
                this.field2486[arg1] = class116.method888(arg2, false);
            }
            return;
        }
        if (this.field2502) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class155.method2712(this, 255, this.field2496, this.field2494, (byte) 0, true);
            return;
        }
        field2499.reset();
        field2499.update(arg2, 0, arg2.length);
        int var5 = (int) field2499.getValue();
        class110 var6 = new class110(class151.method822(arg2));
        int var7 = var6.method2142();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2496 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2195();
        }
        if (this.field2494 != var5 || this.field2501 != var8) {
            class155.method2712(this, 255, this.field2496, this.field2494, (byte) 0, true);
            return;
        }
        this.method2760(arg2);
        this.method2845();
    }

    @ObfuscatedName("en.cv(I)V")
    public void method2845() {
        this.field2505 = new boolean[this.field2486.length];
        for (int var1 = 0; var1 < this.field2505.length; var1++) {
            this.field2505[var1] = false;
        }
        if (this.field2497 == null) {
            this.field2502 = true;
            return;
        }
        this.field2503 = -1;
        for (int var2 = 0; var2 < this.field2505.length; var2++) {
            if (this.field2479[var2] > 0) {
                class125 var3 = this.field2497;
                class153 var5 = new class153();
                var5.field2508 = 1;
                var5.field2905 = (long) var2;
                var5.field2509 = var3;
                var5.field2510 = this;
                class182 var6 = class154.field2520;
                synchronized (class154.field2520) {
                    class154.field2520.method3302(var5);
                }
                Object var8 = class154.field2515;
                synchronized (class154.field2515) {
                    if (class154.field2513 == 0) {
                        Statics.field1532.method2496(new class154(), 5);
                    }
                    class154.field2513 = 600;
                }
                this.field2503 = var2;
            }
        }
        if (this.field2503 == -1) {
            this.field2502 = true;
        }
    }

    @ObfuscatedName("en.cb(II)I")
    public int method2850(int arg0) {
        if (this.field2486[arg0] != null) {
            return 100;
        } else if (this.field2505[arg0]) {
            return 100;
        } else {
            int var2 = this.field2496;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1531 != null && Statics.field1531.field2905 == var3) {
                var5 = Statics.field2537.field1855 * 99 / (Statics.field2537.field1862.length - Statics.field1531.field2546) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("en.cs(B)I")
    public int method2851() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2486.length; var3++) {
            if (this.field2479[var3] > 0) {
                var1 += 100;
                var2 += this.method2850(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
