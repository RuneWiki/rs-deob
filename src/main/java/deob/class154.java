package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eq")
public class class154 extends class152 {

    @ObfuscatedName("eq.m")
    public class71 field2538;

    @ObfuscatedName("eq.o")
    public class71 field2535;

    @ObfuscatedName("eq.e")
    public int field2536;

    @ObfuscatedName("eq.f")
    public volatile boolean field2534 = false;

    @ObfuscatedName("eq.i")
    public boolean field2540 = false;

    @ObfuscatedName("eq.d")
    public volatile boolean[] field2539;

    @ObfuscatedName("eq.z")
    public static CRC32 field2543 = new CRC32();

    @ObfuscatedName("eq.ai")
    public int field2541;

    @ObfuscatedName("eq.ag")
    public int field2542;

    @ObfuscatedName("eq.as")
    public int field2537 = -1;

    public class154(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2538 = arg0;
        this.field2535 = arg1;
        this.field2536 = arg2;
        this.field2540 = arg5;
        class153.method2899(this, this.field2536);
    }

    @ObfuscatedName("eq.by(I)I")
    public int method3005() {
        if (this.field2534) {
            return 100;
        } else if (this.field2504 == null) {
            int var1 = this.field2536;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field366 != null && Statics.field366.field2816 == var2) {
                var4 = Statics.field2518.field2008 * 99 / (Statics.field2518.field2015.length - Statics.field366.field2547) + 1;
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

    @ObfuscatedName("eq.p(II)V")
    public void method2919(int arg0) {
        class153.method2891(this.field2536, arg0);
    }

    @ObfuscatedName("eq.n(II)V")
    public void method2935(int arg0) {
        if (this.field2538 == null || this.field2539 == null || !this.field2539[arg0]) {
            class153.method106(this, this.field2536, arg0, this.field2501[arg0], (byte) 2, true);
        } else {
            class157.method131(arg0, this.field2538, this);
        }
    }

    @ObfuscatedName("eq.bf(IIB)V")
    public void method3006(int arg0, int arg1) {
        this.field2541 = arg0;
        this.field2542 = arg1;
        if (this.field2535 == null) {
            class153.method106(this, 255, this.field2536, this.field2541, (byte) 0, true);
        } else {
            class157.method131(this.field2536, this.field2535, this);
        }
    }

    @ObfuscatedName("eq.bq(I[BZZB)V")
    public void method3016(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2534) {
                throw new RuntimeException();
            }
            if (this.field2535 != null) {
                class157.method1324(this.field2536, arg1, this.field2535);
            }
            this.method2960(arg1);
            this.method3008();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2499[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2499[arg0];
        if (this.field2538 != null) {
            class157.method1324(arg0, arg1, this.field2538);
            this.field2539[arg0] = true;
        }
        if (arg3) {
            this.field2504[arg0] = class119.method662(arg1, false);
        }
    }

    @ObfuscatedName("eq.cr(Lbt;I[BZI)V")
    public void method3007(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2535 != arg0) {
            if (!arg3 && this.field2537 == arg1) {
                this.field2534 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2539[arg1] = false;
                if (this.field2540 || arg3) {
                    class153.method106(this, this.field2536, arg1, this.field2501[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2543.reset();
            field2543.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2543.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2501[arg1] != var9 || this.field2499[arg1] != var10) {
                this.field2539[arg1] = false;
                if (this.field2540 || arg3) {
                    class153.method106(this, this.field2536, arg1, this.field2501[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2539[arg1] = true;
            if (arg3) {
                this.field2504[arg1] = class119.method662(arg2, false);
            }
            return;
        }
        if (this.field2534) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class153.method106(this, 255, this.field2536, this.field2541, (byte) 0, true);
            return;
        }
        field2543.reset();
        field2543.update(arg2, 0, arg2.length);
        int var5 = (int) field2543.getValue();
        class127 var6 = new class127(class152.method1385(arg2));
        int var7 = var6.method2484();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2415();
        }
        if (this.field2541 != var5 || this.field2542 != var8) {
            class153.method106(this, 255, this.field2536, this.field2541, (byte) 0, true);
            return;
        }
        this.method2960(arg2);
        this.method3008();
    }

    @ObfuscatedName("eq.cq(I)V")
    public void method3008() {
        this.field2539 = new boolean[this.field2504.length];
        for (int var1 = 0; var1 < this.field2539.length; var1++) {
            this.field2539[var1] = false;
        }
        if (this.field2538 == null) {
            this.field2534 = true;
            return;
        }
        this.field2537 = -1;
        for (int var2 = 0; var2 < this.field2539.length; var2++) {
            if (this.field2496[var2] > 0) {
                class71 var3 = this.field2538;
                class156 var5 = new class156();
                var5.field2553 = 1;
                var5.field2816 = (long) var2;
                var5.field2551 = var3;
                var5.field2558 = this;
                class177 var6 = class157.field2560;
                synchronized (class157.field2560) {
                    class157.field2560.method3264(var5);
                }
                Object var8 = class157.field2566;
                synchronized (class157.field2566) {
                    if (class157.field2561 == 0) {
                        Statics.field1301.method1458(new class157(), 5);
                    }
                    class157.field2561 = 600;
                }
                this.field2537 = var2;
            }
        }
        if (this.field2537 == -1) {
            this.field2534 = true;
        }
    }

    @ObfuscatedName("eq.cn(IB)I")
    public int method3009(int arg0) {
        if (this.field2504[arg0] != null) {
            return 100;
        } else if (this.field2539[arg0]) {
            return 100;
        } else {
            int var2 = this.field2536;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field366 != null && Statics.field366.field2816 == var3) {
                var5 = Statics.field2518.field2008 * 99 / (Statics.field2518.field2015.length - Statics.field366.field2547) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("eq.ck(I)I")
    public int method3023() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2504.length; var3++) {
            if (this.field2496[var3] > 0) {
                var1 += 100;
                var2 += this.method3009(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
