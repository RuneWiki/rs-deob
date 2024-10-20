package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ey")
public class class155 extends class153 {

    @ObfuscatedName("ey.w")
    public class71 field2560;

    @ObfuscatedName("ey.z")
    public class71 field2564;

    @ObfuscatedName("ey.p")
    public int field2557;

    @ObfuscatedName("ey.v")
    public volatile boolean field2566 = false;

    @ObfuscatedName("ey.d")
    public boolean field2559 = false;

    @ObfuscatedName("ey.e")
    public volatile boolean[] field2561;

    @ObfuscatedName("ey.y")
    public static CRC32 field2558 = new CRC32();

    @ObfuscatedName("ey.aw")
    public int field2562;

    @ObfuscatedName("ey.ai")
    public int field2563;

    @ObfuscatedName("ey.ah")
    public int field2565 = -1;

    public class155(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2560 = arg0;
        this.field2564 = arg1;
        this.field2557 = arg2;
        this.field2559 = arg5;
        class154.method207(this, this.field2557);
    }

    @ObfuscatedName("ey.cl(B)I")
    public int method3137() {
        if (this.field2566) {
            return 100;
        } else if (this.field2508 == null) {
            int var1 = class154.method2198(255, this.field2557);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ey.f(IB)V")
    public void method3026(int arg0) {
        int var2 = this.field2557;
        long var3 = (long) ((var2 << 16) + arg0);
        class156 var5 = (class156) class154.field2545.method3296(var3);
        if (var5 != null) {
            class154.field2537.method3273(var5);
        }
    }

    @ObfuscatedName("ey.c(II)V")
    public void method3068(int arg0) {
        if (this.field2560 == null || this.field2561 == null || !this.field2561[arg0]) {
            class154.method2324(this, this.field2557, arg0, this.field2511[arg0], (byte) 2, true);
            return;
        }
        class71 var2 = this.field2560;
        byte[] var4 = null;
        class177 var5 = class158.field2584;
        synchronized (class158.field2584) {
            for (class157 var6 = (class157) class158.field2584.method3338(); var6 != null; var6 = (class157) class158.field2584.method3323()) {
                if ((long) arg0 == var6.field2813 && var6.field2575 == var2 && var6.field2576 == 0) {
                    var4 = var6.field2580;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method1413(arg0);
            this.method3120(var2, arg0, var8, true);
        } else {
            this.method3120(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ey.ce(III)V")
    public void method3129(int arg0, int arg1) {
        this.field2562 = arg0;
        this.field2563 = arg1;
        if (this.field2564 == null) {
            class154.method2324(this, 255, this.field2557, this.field2562, (byte) 0, true);
            return;
        }
        int var3 = this.field2557;
        class71 var4 = this.field2564;
        byte[] var6 = null;
        class177 var7 = class158.field2584;
        synchronized (class158.field2584) {
            for (class157 var8 = (class157) class158.field2584.method3338(); var8 != null; var8 = (class157) class158.field2584.method3323()) {
                if ((long) var3 == var8.field2813 && var8.field2575 == var4 && var8.field2576 == 0) {
                    var6 = var8.field2580;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method1413(var3);
            this.method3120(var4, var3, var10, true);
        } else {
            this.method3120(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ey.cd(I[BZZI)V")
    public void method3126(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2566) {
                throw new RuntimeException();
            }
            if (this.field2564 != null) {
                class158.method562(this.field2557, arg1, this.field2564);
            }
            this.method3025(arg1);
            this.method3121();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2526[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2526[arg0];
        if (this.field2560 != null) {
            class158.method562(arg0, arg1, this.field2560);
            this.field2561[arg0] = true;
        }
        if (arg3) {
            this.field2508[arg0] = class119.method1665(arg1, false);
        }
    }

    @ObfuscatedName("ey.cc(Lbk;I[BZI)V")
    public void method3120(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2564 != arg0) {
            if (!arg3 && this.field2565 == arg1) {
                this.field2566 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2561[arg1] = false;
                if (this.field2559 || arg3) {
                    class154.method2324(this, this.field2557, arg1, this.field2511[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2558.reset();
            field2558.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2558.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2511[arg1] != var9 || this.field2526[arg1] != var10) {
                this.field2561[arg1] = false;
                if (this.field2559 || arg3) {
                    class154.method2324(this, this.field2557, arg1, this.field2511[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2561[arg1] = true;
            if (arg3) {
                this.field2508[arg1] = class119.method1665(arg2, false);
            }
            return;
        }
        if (this.field2566) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class154.method2324(this, 255, this.field2557, this.field2562, (byte) 0, true);
            return;
        }
        field2558.reset();
        field2558.update(arg2, 0, arg2.length);
        int var5 = (int) field2558.getValue();
        class127 var6 = new class127(class153.method1421(arg2));
        int var7 = var6.method2464();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2508();
        }
        if (this.field2562 != var5 || this.field2563 != var8) {
            class154.method2324(this, 255, this.field2557, this.field2562, (byte) 0, true);
            return;
        }
        this.method3025(arg2);
        this.method3121();
    }

    @ObfuscatedName("ey.cr(I)V")
    public void method3121() {
        this.field2561 = new boolean[this.field2508.length];
        for (int var1 = 0; var1 < this.field2561.length; var1++) {
            this.field2561[var1] = false;
        }
        if (this.field2560 == null) {
            this.field2566 = true;
            return;
        }
        this.field2565 = -1;
        for (int var2 = 0; var2 < this.field2561.length; var2++) {
            if (this.field2514[var2] > 0) {
                class158.method568(var2, this.field2560, this);
                this.field2565 = var2;
            }
        }
        if (this.field2565 == -1) {
            this.field2566 = true;
        }
    }

    @ObfuscatedName("ey.ci(II)I")
    public int method3122(int arg0) {
        if (this.field2508[arg0] != null) {
            return 100;
        } else if (this.field2561[arg0]) {
            return 100;
        } else {
            int var2 = this.field2557;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field868 != null && Statics.field868.field2813 == var3) {
                var5 = Statics.field2546.field2035 * 99 / (Statics.field2546.field2037.length - Statics.field868.field2570) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ey.cu(I)I")
    public int method3123() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2508.length; var3++) {
            if (this.field2514[var3] > 0) {
                var1 += 100;
                var2 += this.method3122(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
