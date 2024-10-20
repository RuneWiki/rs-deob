package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ee")
public class class156 extends class154 {

    @ObfuscatedName("ee.d")
    public class71 field2569;

    @ObfuscatedName("ee.i")
    public class71 field2567;

    @ObfuscatedName("ee.p")
    public int field2568;

    @ObfuscatedName("ee.h")
    public volatile boolean field2576 = false;

    @ObfuscatedName("ee.f")
    public boolean field2571 = false;

    @ObfuscatedName("ee.t")
    public volatile boolean[] field2572;

    @ObfuscatedName("ee.x")
    public static CRC32 field2573 = new CRC32();

    @ObfuscatedName("ee.ar")
    public int field2574;

    @ObfuscatedName("ee.au")
    public int field2575;

    @ObfuscatedName("ee.an")
    public int field2577 = -1;

    public class156(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2569 = arg0;
        this.field2567 = arg1;
        this.field2568 = arg2;
        this.field2571 = arg5;
        int var8 = this.field2568;
        if (Statics.field2767 == null) {
            class155.method2016((class156) null, 255, 255, 0, (byte) 0, true);
            class155.field2561[var8] = this;
        } else {
            Statics.field2767.field2022 = var8 * 8 + 5;
            int var9 = Statics.field2767.method2586();
            int var10 = Statics.field2767.method2586();
            this.method3111(var9, var10);
        }
    }

    @ObfuscatedName("ee.bf(B)I")
    public int method3109() {
        if (this.field2576) {
            return 100;
        } else if (this.field2530 == null) {
            int var1 = this.field2568;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2415 != null && Statics.field2415.field2837 == var2) {
                var4 = Statics.field2548.field2022 * 99 / (Statics.field2548.field2024.length - Statics.field2415.field2586) + 1;
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

    @ObfuscatedName("ee.b(IS)V")
    public void method3028(int arg0) {
        class155.method2963(this.field2568, arg0);
    }

    @ObfuscatedName("ee.c(II)V")
    public void method3037(int arg0) {
        if (this.field2569 == null || this.field2572 == null || !this.field2572[arg0]) {
            class155.method2016(this, this.field2568, arg0, this.field2524[arg0], (byte) 2, true);
        } else {
            class159.method2203(arg0, this.field2569, this);
        }
    }

    @ObfuscatedName("ee.bk(III)V")
    public void method3111(int arg0, int arg1) {
        this.field2574 = arg0;
        this.field2575 = arg1;
        if (this.field2567 == null) {
            class155.method2016(this, 255, this.field2568, this.field2574, (byte) 0, true);
        } else {
            class159.method2203(this.field2568, this.field2567, this);
        }
    }

    @ObfuscatedName("ee.bz(I[BZZI)V")
    public void method3112(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2525[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2525[arg0];
            if (this.field2569 != null) {
                class71 var12 = this.field2569;
                class158 var13 = new class158();
                var13.field2596 = 0;
                var13.field2837 = (long) arg0;
                var13.field2593 = arg1;
                var13.field2597 = var12;
                class178 var14 = class159.field2604;
                synchronized (class159.field2604) {
                    class159.field2604.method3321(var13);
                }
                Object var16 = class159.field2601;
                synchronized (class159.field2601) {
                    if (class159.field2603 == 0) {
                        Statics.field1172.method1517(new class159(), 5);
                    }
                    class159.field2603 = 600;
                }
                this.field2572[arg0] = true;
            }
            if (arg3) {
                this.field2530[arg0] = class119.method2204(arg1, false);
            }
            return;
        }
        if (this.field2576) {
            throw new RuntimeException();
        }
        if (this.field2567 != null) {
            int var5 = this.field2568;
            class71 var6 = this.field2567;
            class158 var7 = new class158();
            var7.field2596 = 0;
            var7.field2837 = (long) var5;
            var7.field2593 = arg1;
            var7.field2597 = var6;
            class178 var8 = class159.field2604;
            synchronized (class159.field2604) {
                class159.field2604.method3321(var7);
            }
            Object var10 = class159.field2601;
            synchronized (class159.field2601) {
                if (class159.field2603 == 0) {
                    Statics.field1172.method1517(new class159(), 5);
                }
                class159.field2603 = 600;
            }
        }
        this.method3027(arg1);
        this.method3113();
    }

    @ObfuscatedName("ee.bq(Lbg;I[BZI)V")
    public void method3116(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2567 != arg0) {
            if (!arg3 && this.field2577 == arg1) {
                this.field2576 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2572[arg1] = false;
                if (this.field2571 || arg3) {
                    class155.method2016(this, this.field2568, arg1, this.field2524[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2573.reset();
            field2573.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2573.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2524[arg1] != var9 || this.field2525[arg1] != var10) {
                this.field2572[arg1] = false;
                if (this.field2571 || arg3) {
                    class155.method2016(this, this.field2568, arg1, this.field2524[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2572[arg1] = true;
            if (arg3) {
                this.field2530[arg1] = class119.method2204(arg2, false);
            }
            return;
        }
        if (this.field2576) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class155.method2016(this, 255, this.field2568, this.field2574, (byte) 0, true);
            return;
        }
        field2573.reset();
        field2573.update(arg2, 0, arg2.length);
        int var5 = (int) field2573.getValue();
        class127 var6 = new class127(class154.method2202(arg2));
        int var7 = var6.method2440();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2586();
        }
        if (this.field2574 != var5 || this.field2575 != var8) {
            class155.method2016(this, 255, this.field2568, this.field2574, (byte) 0, true);
            return;
        }
        this.method3027(arg2);
        this.method3113();
    }

    @ObfuscatedName("ee.bw(I)V")
    public void method3113() {
        this.field2572 = new boolean[this.field2530.length];
        for (int var1 = 0; var1 < this.field2572.length; var1++) {
            this.field2572[var1] = false;
        }
        if (this.field2569 == null) {
            this.field2576 = true;
            return;
        }
        this.field2577 = -1;
        for (int var2 = 0; var2 < this.field2572.length; var2++) {
            if (this.field2535[var2] > 0) {
                class71 var3 = this.field2569;
                class158 var5 = new class158();
                var5.field2596 = 1;
                var5.field2837 = (long) var2;
                var5.field2597 = var3;
                var5.field2595 = this;
                class178 var6 = class159.field2604;
                synchronized (class159.field2604) {
                    class159.field2604.method3321(var5);
                }
                Object var8 = class159.field2601;
                synchronized (class159.field2601) {
                    if (class159.field2603 == 0) {
                        Statics.field1172.method1517(new class159(), 5);
                    }
                    class159.field2603 = 600;
                }
                this.field2577 = var2;
            }
        }
        if (this.field2577 == -1) {
            this.field2576 = true;
        }
    }

    @ObfuscatedName("ee.bs(II)I")
    public int method3115(int arg0) {
        if (this.field2530[arg0] != null) {
            return 100;
        } else if (this.field2572[arg0]) {
            return 100;
        } else {
            int var2 = this.field2568;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2415 != null && Statics.field2415.field2837 == var3) {
                var5 = Statics.field2548.field2022 * 99 / (Statics.field2548.field2024.length - Statics.field2415.field2586) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ee.cl(B)I")
    public int method3120() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2530.length; var3++) {
            if (this.field2535[var3] > 0) {
                var1 += 100;
                var2 += this.method3115(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
