package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ei")
public class class152 extends class151 {

    @ObfuscatedName("ei.a")
    public class125 field2492;

    @ObfuscatedName("ei.i")
    public class125 field2488;

    @ObfuscatedName("ei.w")
    public int field2486;

    @ObfuscatedName("ei.x")
    public volatile boolean field2490 = false;

    @ObfuscatedName("ei.h")
    public boolean field2487 = false;

    @ObfuscatedName("ei.z")
    public volatile boolean[] field2491;

    @ObfuscatedName("ei.u")
    public static CRC32 field2489 = new CRC32();

    @ObfuscatedName("ei.ad")
    public int field2493;

    @ObfuscatedName("ei.ah")
    public int field2494;

    @ObfuscatedName("ei.ao")
    public int field2495 = -1;

    public class152(class125 arg0, class125 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2492 = arg0;
        this.field2488 = arg1;
        this.field2486 = arg2;
        this.field2487 = arg5;
        int var8 = this.field2486;
        if (Statics.field1 == null) {
            class155.method2447((class152) null, 255, 255, 0, (byte) 0, true);
            class155.field2533[var8] = this;
        } else {
            Statics.field1.field1847 = var8 * 8 + 5;
            int var9 = Statics.field1.method2297();
            int var10 = Statics.field1.method2297();
            this.method2865(var9, var10);
        }
    }

    @ObfuscatedName("ei.co(B)I")
    public int method2891() {
        if (this.field2490) {
            return 100;
        } else if (this.field2476 == null) {
            int var1 = class155.method510(255, this.field2486);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ei.t(II)V")
    public void method2783(int arg0) {
        int var2 = this.field2486;
        long var3 = (long) ((var2 << 16) + arg0);
        class156 var5 = (class156) class155.field2524.method3274(var3);
        if (var5 != null) {
            class155.field2523.method3362(var5);
        }
    }

    @ObfuscatedName("ei.o(II)V")
    public void method2784(int arg0) {
        if (this.field2492 == null || this.field2491 == null || !this.field2491[arg0]) {
            class155.method2447(this, this.field2486, arg0, this.field2470[arg0], (byte) 2, true);
        } else {
            class154.method2764(arg0, this.field2492, this);
        }
    }

    @ObfuscatedName("ei.cj(III)V")
    public void method2865(int arg0, int arg1) {
        this.field2493 = arg0;
        this.field2494 = arg1;
        if (this.field2488 == null) {
            class155.method2447(this, 255, this.field2486, this.field2493, (byte) 0, true);
        } else {
            class154.method2764(this.field2486, this.field2488, this);
        }
    }

    @ObfuscatedName("ei.cd(I[BZZI)V")
    public void method2866(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2480[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2480[arg0];
            if (this.field2492 != null) {
                class125 var12 = this.field2492;
                class153 var13 = new class153();
                var13.field2499 = 0;
                var13.field2911 = (long) arg0;
                var13.field2504 = arg1;
                var13.field2506 = var12;
                class182 var14 = class154.field2513;
                synchronized (class154.field2513) {
                    class154.field2513.method3323(var13);
                }
                Object var16 = class154.field2510;
                synchronized (class154.field2510) {
                    if (class154.field2509 == 0) {
                        Statics.field1950.method2547(new class154(), 5);
                    }
                    class154.field2509 = 600;
                }
                this.field2491[arg0] = true;
            }
            if (arg3) {
                this.field2476[arg0] = class116.method689(arg1, false);
            }
            return;
        }
        if (this.field2490) {
            throw new RuntimeException();
        }
        if (this.field2488 != null) {
            int var5 = this.field2486;
            class125 var6 = this.field2488;
            class153 var7 = new class153();
            var7.field2499 = 0;
            var7.field2911 = (long) var5;
            var7.field2504 = arg1;
            var7.field2506 = var6;
            class182 var8 = class154.field2513;
            synchronized (class154.field2513) {
                class154.field2513.method3323(var7);
            }
            Object var10 = class154.field2510;
            synchronized (class154.field2510) {
                if (class154.field2509 == 0) {
                    Statics.field1950.method2547(new class154(), 5);
                }
                class154.field2509 = 600;
            }
        }
        this.method2782(arg1);
        this.method2873();
    }

    @ObfuscatedName("ei.cz(Ldz;I[BZI)V")
    public void method2867(class125 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2488 != arg0) {
            if (!arg3 && this.field2495 == arg1) {
                this.field2490 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2491[arg1] = false;
                if (this.field2487 || arg3) {
                    class155.method2447(this, this.field2486, arg1, this.field2470[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2489.reset();
            field2489.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2489.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2470[arg1] != var9 || this.field2480[arg1] != var10) {
                this.field2491[arg1] = false;
                if (this.field2487 || arg3) {
                    class155.method2447(this, this.field2486, arg1, this.field2470[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2491[arg1] = true;
            if (arg3) {
                this.field2476[arg1] = class116.method689(arg2, false);
            }
            return;
        }
        if (this.field2490) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class155.method2447(this, 255, this.field2486, this.field2493, (byte) 0, true);
            return;
        }
        field2489.reset();
        field2489.update(arg2, 0, arg2.length);
        int var5 = (int) field2489.getValue();
        class110 var6 = new class110(class151.method148(arg2));
        int var7 = var6.method2257();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2486 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2297();
        }
        if (this.field2493 != var5 || this.field2494 != var8) {
            class155.method2447(this, 255, this.field2486, this.field2493, (byte) 0, true);
            return;
        }
        this.method2782(arg2);
        this.method2873();
    }

    @ObfuscatedName("ei.cn(I)V")
    public void method2873() {
        this.field2491 = new boolean[this.field2476.length];
        for (int var1 = 0; var1 < this.field2491.length; var1++) {
            this.field2491[var1] = false;
        }
        if (this.field2492 == null) {
            this.field2490 = true;
            return;
        }
        this.field2495 = -1;
        for (int var2 = 0; var2 < this.field2491.length; var2++) {
            if (this.field2472[var2] > 0) {
                class154.method154(var2, this.field2492, this);
                this.field2495 = var2;
            }
        }
        if (this.field2495 == -1) {
            this.field2490 = true;
        }
    }

    @ObfuscatedName("ei.cr(II)I")
    public int method2868(int arg0) {
        if (this.field2476[arg0] == null) {
            return this.field2491[arg0] ? 100 : class155.method510(this.field2486, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ei.cv(I)I")
    public int method2869() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2476.length; var3++) {
            if (this.field2472[var3] > 0) {
                var1 += 100;
                var2 += this.method2868(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
