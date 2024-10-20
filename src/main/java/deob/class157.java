package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fh")
public class class157 extends class155 {

    @ObfuscatedName("fh.s")
    public class72 field2597;

    @ObfuscatedName("fh.y")
    public class72 field2588;

    @ObfuscatedName("fh.r")
    public int field2589;

    @ObfuscatedName("fh.l")
    public volatile boolean field2590 = false;

    @ObfuscatedName("fh.n")
    public boolean field2591 = false;

    @ObfuscatedName("fh.h")
    public volatile boolean[] field2592;

    @ObfuscatedName("fh.v")
    public static CRC32 field2593 = new CRC32();

    @ObfuscatedName("fh.ax")
    public int field2594;

    @ObfuscatedName("fh.ao")
    public int field2595;

    @ObfuscatedName("fh.al")
    public int field2587 = -1;

    public class157(class72 arg0, class72 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2597 = arg0;
        this.field2588 = arg1;
        this.field2589 = arg2;
        this.field2591 = arg5;
        int var8 = this.field2589;
        if (Statics.field979 == null) {
            class156.method3000((class157) null, 255, 255, 0, (byte) 0, true);
            class156.field2581[var8] = this;
        } else {
            Statics.field979.field2045 = var8 * 8 + 5;
            int var9 = Statics.field979.method2592();
            int var10 = Statics.field979.method2592();
            this.method3100(var9, var10);
        }
    }

    @ObfuscatedName("fh.ba(B)I")
    public int method3125() {
        if (this.field2590) {
            return 100;
        } else if (this.field2556 == null) {
            int var1 = class156.method259(255, this.field2589);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("fh.i(IB)V")
    public void method3052(int arg0) {
        int var2 = this.field2589;
        long var3 = (long) ((var2 << 16) + arg0);
        class158 var5 = (class158) class156.field2568.method3314(var3);
        if (var5 != null) {
            class156.field2571.method3276(var5);
        }
    }

    @ObfuscatedName("fh.u(IB)V")
    public void method3024(int arg0) {
        if (this.field2597 == null || this.field2592 == null || !this.field2592[arg0]) {
            class156.method3000(this, this.field2589, arg0, this.field2550[arg0], (byte) 2, true);
        } else {
            class160.method3126(arg0, this.field2597, this);
        }
    }

    @ObfuscatedName("fh.bi(IIB)V")
    public void method3100(int arg0, int arg1) {
        this.field2594 = arg0;
        this.field2595 = arg1;
        if (this.field2588 == null) {
            class156.method3000(this, 255, this.field2589, this.field2594, (byte) 0, true);
        } else {
            class160.method3126(this.field2589, this.field2588, this);
        }
    }

    @ObfuscatedName("fh.bo(I[BZZI)V")
    public void method3101(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2590) {
                throw new RuntimeException();
            }
            if (this.field2588 != null) {
                class160.method2728(this.field2589, arg1, this.field2588);
            }
            this.method3085(arg1);
            this.method3103();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2548[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2548[arg0];
        if (this.field2597 != null) {
            class160.method2728(arg0, arg1, this.field2597);
            this.field2592[arg0] = true;
        }
        if (arg3) {
            this.field2556[arg0] = class120.method2131(arg1, false);
        }
    }

    @ObfuscatedName("fh.cg(Lbu;I[BZB)V")
    public void method3105(class72 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2588 != arg0) {
            if (!arg3 && this.field2587 == arg1) {
                this.field2590 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2592[arg1] = false;
                if (this.field2591 || arg3) {
                    class156.method3000(this, this.field2589, arg1, this.field2550[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2593.reset();
            field2593.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2593.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2550[arg1] != var9 || this.field2548[arg1] != var10) {
                this.field2592[arg1] = false;
                if (this.field2591 || arg3) {
                    class156.method3000(this, this.field2589, arg1, this.field2550[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2592[arg1] = true;
            if (arg3) {
                this.field2556[arg1] = class120.method2131(arg2, false);
            }
            return;
        }
        if (this.field2590) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class156.method3000(this, 255, this.field2589, this.field2594, (byte) 0, true);
            return;
        }
        field2593.reset();
        field2593.update(arg2, 0, arg2.length);
        int var5 = (int) field2593.getValue();
        class128 var6 = new class128(class155.method12(arg2));
        int var7 = var6.method2548();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2592();
        }
        if (this.field2594 != var5 || this.field2595 != var8) {
            class156.method3000(this, 255, this.field2589, this.field2594, (byte) 0, true);
            return;
        }
        this.method3085(arg2);
        this.method3103();
    }

    @ObfuscatedName("fh.cm(B)V")
    public void method3103() {
        this.field2592 = new boolean[this.field2556.length];
        for (int var1 = 0; var1 < this.field2592.length; var1++) {
            this.field2592[var1] = false;
        }
        if (this.field2597 == null) {
            this.field2590 = true;
            return;
        }
        this.field2587 = -1;
        for (int var2 = 0; var2 < this.field2592.length; var2++) {
            if (this.field2552[var2] > 0) {
                class72 var3 = this.field2597;
                class159 var5 = new class159();
                var5.field2605 = 1;
                var5.field2839 = (long) var2;
                var5.field2604 = var3;
                var5.field2602 = this;
                class179 var6 = class160.field2608;
                synchronized (class160.field2608) {
                    class160.field2608.method3328(var5);
                }
                Object var8 = class160.field2610;
                synchronized (class160.field2610) {
                    if (class160.field2607 == 0) {
                        Statics.field200.method1546(new class160(), 5);
                    }
                    class160.field2607 = 600;
                }
                this.field2587 = var2;
            }
        }
        if (this.field2587 == -1) {
            this.field2590 = true;
        }
    }

    @ObfuscatedName("fh.cd(II)I")
    public int method3111(int arg0) {
        if (this.field2556[arg0] == null) {
            return this.field2592[arg0] ? 100 : class156.method259(this.field2589, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fh.cl(B)I")
    public int method3104() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2556.length; var3++) {
            if (this.field2552[var3] > 0) {
                var1 += 100;
                var2 += this.method3111(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
