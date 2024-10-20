package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eh")
public class class152 extends class150 {

    @ObfuscatedName("eh.b")
    public class70 field2491;

    @ObfuscatedName("eh.h")
    public class70 field2483;

    @ObfuscatedName("eh.f")
    public int field2485;

    @ObfuscatedName("eh.v")
    public volatile boolean field2486 = false;

    @ObfuscatedName("eh.u")
    public boolean field2487 = false;

    @ObfuscatedName("eh.k")
    public volatile boolean[] field2488;

    @ObfuscatedName("eh.c")
    public static CRC32 field2489 = new CRC32();

    @ObfuscatedName("eh.al")
    public int field2490;

    @ObfuscatedName("eh.ai")
    public int field2492;

    @ObfuscatedName("eh.ad")
    public int field2484 = -1;

    public class152(class70 arg0, class70 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2491 = arg0;
        this.field2483 = arg1;
        this.field2485 = arg2;
        this.field2487 = arg5;
        class151.method2889(this, this.field2485);
    }

    @ObfuscatedName("eh.bd(I)I")
    public int method3102() {
        if (this.field2486) {
            return 100;
        } else if (this.field2451 == null) {
            int var1 = this.field2485;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1764 != null && Statics.field1764.field2760 == var2) {
                var4 = Statics.field2021.field2016 * 99 / (Statics.field2021.field2013.length - Statics.field1764.field2495) + 1;
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

    @ObfuscatedName("eh.e(II)V")
    public void method3013(int arg0) {
        class151.method113(this.field2485, arg0);
    }

    @ObfuscatedName("eh.r(II)V")
    public void method3020(int arg0) {
        if (this.field2491 == null || this.field2488 == null || !this.field2488[arg0]) {
            class151.method3192(this, this.field2485, arg0, this.field2443[arg0], (byte) 2, true);
            return;
        }
        class70 var2 = this.field2491;
        byte[] var4 = null;
        class175 var5 = class155.field2518;
        synchronized (class155.field2518) {
            for (class154 var6 = (class154) class155.field2518.method3382(); var6 != null; var6 = (class154) class155.field2518.method3388()) {
                if ((long) arg0 == var6.field2760 && var6.field2506 == var2 && var6.field2508 == 0) {
                    var4 = var6.field2505;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method1389(arg0);
            this.method3107(var2, arg0, var8, true);
        } else {
            this.method3107(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("eh.cj(III)V")
    public void method3109(int arg0, int arg1) {
        this.field2490 = arg0;
        this.field2492 = arg1;
        if (this.field2483 == null) {
            class151.method3192(this, 255, this.field2485, this.field2490, (byte) 0, true);
            return;
        }
        int var3 = this.field2485;
        class70 var4 = this.field2483;
        byte[] var6 = null;
        class175 var7 = class155.field2518;
        synchronized (class155.field2518) {
            for (class154 var8 = (class154) class155.field2518.method3382(); var8 != null; var8 = (class154) class155.field2518.method3388()) {
                if ((long) var3 == var8.field2760 && var8.field2506 == var4 && var8.field2508 == 0) {
                    var6 = var8.field2505;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method1389(var3);
            this.method3107(var4, var3, var10, true);
        } else {
            this.method3107(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("eh.cb(I[BZZI)V")
    public void method3105(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2486) {
                throw new RuntimeException();
            }
            if (this.field2483 != null) {
                class155.method899(this.field2485, arg1, this.field2483);
            }
            this.method3037(arg1);
            this.method3106();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2441[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2441[arg0];
        if (this.field2491 != null) {
            class155.method899(arg0, arg1, this.field2491);
            this.field2488[arg0] = true;
        }
        if (arg3) {
            this.field2451[arg0] = class118.method1562(arg1, false);
        }
    }

    @ObfuscatedName("eh.cx(Lby;I[BZI)V")
    public void method3107(class70 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2483 != arg0) {
            if (!arg3 && this.field2484 == arg1) {
                this.field2486 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2488[arg1] = false;
                if (this.field2487 || arg3) {
                    class151.method3192(this, this.field2485, arg1, this.field2443[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2489.reset();
            field2489.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2489.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2443[arg1] != var9 || this.field2441[arg1] != var10) {
                this.field2488[arg1] = false;
                if (this.field2487 || arg3) {
                    class151.method3192(this, this.field2485, arg1, this.field2443[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2488[arg1] = true;
            if (arg3) {
                this.field2451[arg1] = class118.method1562(arg2, false);
            }
            return;
        }
        if (this.field2486) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class151.method3192(this, 255, this.field2485, this.field2490, (byte) 0, true);
            return;
        }
        field2489.reset();
        field2489.update(arg2, 0, arg2.length);
        int var5 = (int) field2489.getValue();
        class126 var6 = new class126(class150.method3005(arg2));
        int var7 = var6.method2485();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2593();
        }
        if (this.field2490 != var5 || this.field2492 != var8) {
            class151.method3192(this, 255, this.field2485, this.field2490, (byte) 0, true);
            return;
        }
        this.method3037(arg2);
        this.method3106();
    }

    @ObfuscatedName("eh.ck(I)V")
    public void method3106() {
        this.field2488 = new boolean[this.field2451.length];
        for (int var1 = 0; var1 < this.field2488.length; var1++) {
            this.field2488[var1] = false;
        }
        if (this.field2491 == null) {
            this.field2486 = true;
            return;
        }
        this.field2484 = -1;
        for (int var2 = 0; var2 < this.field2488.length; var2++) {
            if (this.field2442[var2] > 0) {
                class70 var3 = this.field2491;
                class154 var5 = new class154();
                var5.field2508 = 1;
                var5.field2760 = (long) var2;
                var5.field2506 = var3;
                var5.field2507 = this;
                class175 var6 = class155.field2518;
                synchronized (class155.field2518) {
                    class155.field2518.method3379(var5);
                }
                Object var8 = class155.field2513;
                synchronized (class155.field2513) {
                    if (class155.field2516 == 0) {
                        Statics.field1791.method1485(new class155(), 5);
                    }
                    class155.field2516 = 600;
                }
                this.field2484 = var2;
            }
        }
        if (this.field2484 == -1) {
            this.field2486 = true;
        }
    }

    @ObfuscatedName("eh.ci(IB)I")
    public int method3123(int arg0) {
        if (this.field2451[arg0] != null) {
            return 100;
        } else if (this.field2488[arg0]) {
            return 100;
        } else {
            int var2 = this.field2485;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1764 != null && Statics.field1764.field2760 == var3) {
                var5 = Statics.field2021.field2016 * 99 / (Statics.field2021.field2013.length - Statics.field1764.field2495) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("eh.cw(I)I")
    public int method3119() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2451.length; var3++) {
            if (this.field2442[var3] > 0) {
                var1 += 100;
                var2 += this.method3123(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
