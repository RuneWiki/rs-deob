package deob;

import java.util.zip.CRC32;

@ObfuscatedName("er")
public class class154 extends class152 {

    @ObfuscatedName("er.v")
    public class71 field2545;

    @ObfuscatedName("er.b")
    public class71 field2538;

    @ObfuscatedName("er.j")
    public int field2539;

    @ObfuscatedName("er.m")
    public volatile boolean field2540 = false;

    @ObfuscatedName("er.k")
    public boolean field2541 = false;

    @ObfuscatedName("er.u")
    public volatile boolean[] field2542;

    @ObfuscatedName("er.i")
    public static CRC32 field2543 = new CRC32();

    @ObfuscatedName("er.ah")
    public int field2537;

    @ObfuscatedName("er.ag")
    public int field2544;

    @ObfuscatedName("er.ay")
    public int field2546 = -1;

    public class154(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2545 = arg0;
        this.field2538 = arg1;
        this.field2539 = arg2;
        this.field2541 = arg5;
        class153.method1594(this, this.field2539);
    }

    @ObfuscatedName("er.cw(B)I")
    public int method3027() {
        if (this.field2540) {
            return 100;
        } else if (this.field2500 == null) {
            int var1 = this.field2539;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2527 != null && Statics.field2527.field2816 == var2) {
                var4 = Statics.field199.field2035 * 99 / (Statics.field199.field2036.length - Statics.field2527.field2554) + 1;
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

    @ObfuscatedName("er.x(II)V")
    public void method2936(int arg0) {
        int var2 = this.field2539;
        long var3 = (long) ((var2 << 16) + arg0);
        class155 var5 = (class155) class153.field2524.method3242(var3);
        if (var5 != null) {
            class153.field2522.method3205(var5);
        }
    }

    @ObfuscatedName("er.c(II)V")
    public void method2945(int arg0) {
        if (this.field2545 == null || this.field2542 == null || !this.field2542[arg0]) {
            class153.method862(this, this.field2539, arg0, this.field2501[arg0], (byte) 2, true);
            return;
        }
        class71 var2 = this.field2545;
        byte[] var4 = null;
        class177 var5 = class157.field2573;
        synchronized (class157.field2573) {
            for (class156 var6 = (class156) class157.field2573.method3252(); var6 != null; var6 = (class156) class157.field2573.method3268()) {
                if ((long) arg0 == var6.field2816 && var6.field2561 == var2 && var6.field2566 == 0) {
                    var4 = var6.field2557;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method1376(arg0);
            this.method3045(var2, arg0, var8, true);
        } else {
            this.method3045(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("er.ct(IIB)V")
    public void method3029(int arg0, int arg1) {
        this.field2537 = arg0;
        this.field2544 = arg1;
        if (this.field2538 == null) {
            class153.method862(this, 255, this.field2539, this.field2537, (byte) 0, true);
            return;
        }
        int var3 = this.field2539;
        class71 var4 = this.field2538;
        byte[] var6 = null;
        class177 var7 = class157.field2573;
        synchronized (class157.field2573) {
            for (class156 var8 = (class156) class157.field2573.method3252(); var8 != null; var8 = (class156) class157.field2573.method3268()) {
                if ((long) var3 == var8.field2816 && var8.field2561 == var4 && var8.field2566 == 0) {
                    var6 = var8.field2557;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method1376(var3);
            this.method3045(var4, var3, var10, true);
        } else {
            this.method3045(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("er.ce(I[BZZI)V")
    public void method3032(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2499[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2499[arg0];
            if (this.field2545 != null) {
                class71 var12 = this.field2545;
                class156 var13 = new class156();
                var13.field2566 = 0;
                var13.field2816 = (long) arg0;
                var13.field2557 = arg1;
                var13.field2561 = var12;
                class177 var14 = class157.field2573;
                synchronized (class157.field2573) {
                    class157.field2573.method3247(var13);
                }
                Object var16 = class157.field2569;
                synchronized (class157.field2569) {
                    if (class157.field2567 == 0) {
                        Statics.field2703.method1454(new class157(), 5);
                    }
                    class157.field2567 = 600;
                }
                this.field2542[arg0] = true;
            }
            if (arg3) {
                this.field2500[arg0] = class119.method45(arg1, false);
            }
            return;
        }
        if (this.field2540) {
            throw new RuntimeException();
        }
        if (this.field2538 != null) {
            int var5 = this.field2539;
            class71 var6 = this.field2538;
            class156 var7 = new class156();
            var7.field2566 = 0;
            var7.field2816 = (long) var5;
            var7.field2557 = arg1;
            var7.field2561 = var6;
            class177 var8 = class157.field2573;
            synchronized (class157.field2573) {
                class157.field2573.method3247(var7);
            }
            Object var10 = class157.field2569;
            synchronized (class157.field2569) {
                if (class157.field2567 == 0) {
                    Statics.field2703.method1454(new class157(), 5);
                }
                class157.field2567 = 600;
            }
        }
        this.method2999(arg1);
        this.method3031();
    }

    @ObfuscatedName("er.cd(Lbq;I[BZB)V")
    public void method3045(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2538 != arg0) {
            if (!arg3 && this.field2546 == arg1) {
                this.field2540 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2542[arg1] = false;
                if (this.field2541 || arg3) {
                    class153.method862(this, this.field2539, arg1, this.field2501[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2543.reset();
            field2543.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2543.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2501[arg1] != var9 || this.field2499[arg1] != var10) {
                this.field2542[arg1] = false;
                if (this.field2541 || arg3) {
                    class153.method862(this, this.field2539, arg1, this.field2501[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2542[arg1] = true;
            if (arg3) {
                this.field2500[arg1] = class119.method45(arg2, false);
            }
            return;
        }
        if (this.field2540) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class153.method862(this, 255, this.field2539, this.field2537, (byte) 0, true);
            return;
        }
        field2543.reset();
        field2543.update(arg2, 0, arg2.length);
        int var5 = (int) field2543.getValue();
        class127 var6 = new class127(class152.method654(arg2));
        int var7 = var6.method2411();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2416();
        }
        if (this.field2537 != var5 || this.field2544 != var8) {
            class153.method862(this, 255, this.field2539, this.field2537, (byte) 0, true);
            return;
        }
        this.method2999(arg2);
        this.method3031();
    }

    @ObfuscatedName("er.cv(B)V")
    public void method3031() {
        this.field2542 = new boolean[this.field2500.length];
        for (int var1 = 0; var1 < this.field2542.length; var1++) {
            this.field2542[var1] = false;
        }
        if (this.field2545 == null) {
            this.field2540 = true;
            return;
        }
        this.field2546 = -1;
        for (int var2 = 0; var2 < this.field2542.length; var2++) {
            if (this.field2502[var2] > 0) {
                class71 var3 = this.field2545;
                class156 var5 = new class156();
                var5.field2566 = 1;
                var5.field2816 = (long) var2;
                var5.field2561 = var3;
                var5.field2559 = this;
                class177 var6 = class157.field2573;
                synchronized (class157.field2573) {
                    class157.field2573.method3247(var5);
                }
                Object var8 = class157.field2569;
                synchronized (class157.field2569) {
                    if (class157.field2567 == 0) {
                        Statics.field2703.method1454(new class157(), 5);
                    }
                    class157.field2567 = 600;
                }
                this.field2546 = var2;
            }
        }
        if (this.field2546 == -1) {
            this.field2540 = true;
        }
    }

    @ObfuscatedName("er.cm(II)I")
    public int method3033(int arg0) {
        if (this.field2500[arg0] != null) {
            return 100;
        } else if (this.field2542[arg0]) {
            return 100;
        } else {
            int var2 = this.field2539;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2527 != null && Statics.field2527.field2816 == var3) {
                var5 = Statics.field199.field2035 * 99 / (Statics.field199.field2036.length - Statics.field2527.field2554) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("er.cl(I)I")
    public int method3034() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2500.length; var3++) {
            if (this.field2502[var3] > 0) {
                var1 += 100;
                var2 += this.method3033(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
