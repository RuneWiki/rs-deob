package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eh")
public class class154 extends class152 {

    @ObfuscatedName("eh.n")
    public class71 field2548;

    @ObfuscatedName("eh.q")
    public class71 field2541;

    @ObfuscatedName("eh.r")
    public int field2542;

    @ObfuscatedName("eh.u")
    public volatile boolean field2540 = false;

    @ObfuscatedName("eh.p")
    public boolean field2544 = false;

    @ObfuscatedName("eh.t")
    public volatile boolean[] field2550;

    @ObfuscatedName("eh.s")
    public static CRC32 field2546 = new CRC32();

    @ObfuscatedName("eh.ah")
    public int field2547;

    @ObfuscatedName("eh.ar")
    public int field2545;

    @ObfuscatedName("eh.ac")
    public int field2549 = -1;

    public class154(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2548 = arg0;
        this.field2541 = arg1;
        this.field2542 = arg2;
        this.field2544 = arg5;
        int var8 = this.field2542;
        if (Statics.field1522 == null) {
            class153.method1((class154) null, 255, 255, 0, (byte) 0, true);
            class153.field2523[var8] = this;
        } else {
            Statics.field1522.field2039 = var8 * 8 + 5;
            int var9 = Statics.field1522.method2668();
            int var10 = Statics.field1522.method2668();
            this.method3145(var9, var10);
        }
    }

    @ObfuscatedName("eh.cs(I)I")
    public int method3125() {
        if (this.field2540) {
            return 100;
        } else if (this.field2507 == null) {
            int var1 = this.field2542;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2528 != null && Statics.field2528.field2818 == var2) {
                var4 = Statics.field2326.field2039 * 99 / (Statics.field2326.field2041.length - Statics.field2528.field2553) + 1;
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

    @ObfuscatedName("eh.v(II)V")
    public void method3031(int arg0) {
        int var2 = this.field2542;
        long var3 = (long) ((var2 << 16) + arg0);
        class155 var5 = (class155) class153.field2530.method3348(var3);
        if (var5 != null) {
            class153.field2522.method3325(var5);
        }
    }

    @ObfuscatedName("eh.f(IB)V")
    public void method3040(int arg0) {
        if (this.field2548 == null || this.field2550 == null || !this.field2550[arg0]) {
            class153.method1(this, this.field2542, arg0, this.field2502[arg0], (byte) 2, true);
            return;
        }
        class71 var2 = this.field2548;
        byte[] var4 = null;
        class177 var5 = class157.field2567;
        synchronized (class157.field2567) {
            for (class156 var6 = (class156) class157.field2567.method3369(); var6 != null; var6 = (class156) class157.field2567.method3371()) {
                if ((long) arg0 == var6.field2818 && var6.field2563 == var2 && var6.field2561 == 0) {
                    var4 = var6.field2562;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method1430(arg0);
            this.method3128(var2, arg0, var8, true);
        } else {
            this.method3128(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("eh.cf(III)V")
    public void method3145(int arg0, int arg1) {
        this.field2547 = arg0;
        this.field2545 = arg1;
        if (this.field2541 == null) {
            class153.method1(this, 255, this.field2542, this.field2547, (byte) 0, true);
            return;
        }
        int var3 = this.field2542;
        class71 var4 = this.field2541;
        byte[] var6 = null;
        class177 var7 = class157.field2567;
        synchronized (class157.field2567) {
            for (class156 var8 = (class156) class157.field2567.method3369(); var8 != null; var8 = (class156) class157.field2567.method3371()) {
                if ((long) var3 == var8.field2818 && var8.field2563 == var4 && var8.field2561 == 0) {
                    var6 = var8.field2562;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method1430(var3);
            this.method3128(var4, var3, var10, true);
        } else {
            this.method3128(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("eh.cx(I[BZZI)V")
    public void method3144(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2497[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2497[arg0];
            if (this.field2548 != null) {
                class71 var10 = this.field2548;
                class156 var11 = new class156();
                var11.field2561 = 0;
                var11.field2818 = (long) arg0;
                var11.field2562 = arg1;
                var11.field2563 = var10;
                class177 var12 = class157.field2567;
                synchronized (class157.field2567) {
                    class157.field2567.method3364(var11);
                }
                class157.method28();
                this.field2550[arg0] = true;
            }
            if (arg3) {
                this.field2507[arg0] = class119.method841(arg1, false);
            }
            return;
        }
        if (this.field2540) {
            throw new RuntimeException();
        }
        if (this.field2541 != null) {
            int var5 = this.field2542;
            class71 var6 = this.field2541;
            class156 var7 = new class156();
            var7.field2561 = 0;
            var7.field2818 = (long) var5;
            var7.field2562 = arg1;
            var7.field2563 = var6;
            class177 var8 = class157.field2567;
            synchronized (class157.field2567) {
                class157.field2567.method3364(var7);
            }
            class157.method28();
        }
        this.method3039(arg1);
        this.method3137();
    }

    @ObfuscatedName("eh.cl(Lbt;I[BZB)V")
    public void method3128(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2541 != arg0) {
            if (!arg3 && this.field2549 == arg1) {
                this.field2540 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2550[arg1] = false;
                if (this.field2544 || arg3) {
                    class153.method1(this, this.field2542, arg1, this.field2502[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2546.reset();
            field2546.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2546.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2502[arg1] != var9 || this.field2497[arg1] != var10) {
                this.field2550[arg1] = false;
                if (this.field2544 || arg3) {
                    class153.method1(this, this.field2542, arg1, this.field2502[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2550[arg1] = true;
            if (arg3) {
                this.field2507[arg1] = class119.method841(arg2, false);
            }
            return;
        }
        if (this.field2540) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class153.method1(this, 255, this.field2542, this.field2547, (byte) 0, true);
            return;
        }
        field2546.reset();
        field2546.update(arg2, 0, arg2.length);
        int var5 = (int) field2546.getValue();
        class127 var6 = new class127(class152.method1380(arg2));
        int var7 = var6.method2491();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2668();
        }
        if (this.field2547 != var5 || this.field2545 != var8) {
            class153.method1(this, 255, this.field2542, this.field2547, (byte) 0, true);
            return;
        }
        this.method3039(arg2);
        this.method3137();
    }

    @ObfuscatedName("eh.co(I)V")
    public void method3137() {
        this.field2550 = new boolean[this.field2507.length];
        for (int var1 = 0; var1 < this.field2550.length; var1++) {
            this.field2550[var1] = false;
        }
        if (this.field2548 == null) {
            this.field2540 = true;
            return;
        }
        this.field2549 = -1;
        for (int var2 = 0; var2 < this.field2550.length; var2++) {
            if (this.field2498[var2] > 0) {
                class157.method1883(var2, this.field2548, this);
                this.field2549 = var2;
            }
        }
        if (this.field2549 == -1) {
            this.field2540 = true;
        }
    }

    @ObfuscatedName("eh.cj(II)I")
    public int method3129(int arg0) {
        if (this.field2507[arg0] != null) {
            return 100;
        } else if (this.field2550[arg0]) {
            return 100;
        } else {
            int var2 = this.field2542;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2528 != null && Statics.field2528.field2818 == var3) {
                var5 = Statics.field2326.field2039 * 99 / (Statics.field2326.field2041.length - Statics.field2528.field2553) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("eh.cz(I)I")
    public int method3130() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2507.length; var3++) {
            if (this.field2498[var3] > 0) {
                var1 += 100;
                var2 += this.method3129(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
