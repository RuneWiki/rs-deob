package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fv")
public class class157 extends class155 {

    @ObfuscatedName("fv.k")
    public class72 field2590;

    @ObfuscatedName("fv.n")
    public class72 field2587;

    @ObfuscatedName("fv.t")
    public int field2584;

    @ObfuscatedName("fv.y")
    public volatile boolean field2585 = false;

    @ObfuscatedName("fv.g")
    public boolean field2586 = false;

    @ObfuscatedName("fv.f")
    public volatile boolean[] field2589;

    @ObfuscatedName("fv.j")
    public static CRC32 field2582 = new CRC32();

    @ObfuscatedName("fv.af")
    public int field2588;

    @ObfuscatedName("fv.ar")
    public int field2583;

    @ObfuscatedName("fv.ax")
    public int field2591 = -1;

    public class157(class72 arg0, class72 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2590 = arg0;
        this.field2587 = arg1;
        this.field2584 = arg2;
        this.field2586 = arg5;
        class156.method2902(this, this.field2584);
    }

    @ObfuscatedName("fv.ck(I)I")
    public int method3140() {
        if (this.field2585) {
            return 100;
        } else if (this.field2549 == null) {
            int var1 = this.field2584;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2571 != null && Statics.field2571.field2839 == var2) {
                var4 = Statics.field2076.field2048 * 99 / (Statics.field2076.field2050.length - Statics.field2571.field2592) + 1;
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

    @ObfuscatedName("fv.b(II)V")
    public void method3042(int arg0) {
        int var2 = this.field2584;
        long var3 = (long) ((var2 << 16) + arg0);
        class158 var5 = (class158) class156.field2567.method3315(var3);
        if (var5 != null) {
            class156.field2566.method3289(var5);
        }
    }

    @ObfuscatedName("fv.v(II)V")
    public void method3051(int arg0) {
        if (this.field2590 == null || this.field2589 == null || !this.field2589[arg0]) {
            class156.method1543(this, this.field2584, arg0, this.field2550[arg0], (byte) 2, true);
        } else {
            class160.method2256(arg0, this.field2590, this);
        }
    }

    @ObfuscatedName("fv.cs(III)V")
    public void method3141(int arg0, int arg1) {
        this.field2588 = arg0;
        this.field2583 = arg1;
        if (this.field2587 == null) {
            class156.method1543(this, 255, this.field2584, this.field2588, (byte) 0, true);
        } else {
            class160.method2256(this.field2584, this.field2587, this);
        }
    }

    @ObfuscatedName("fv.cr(I[BZZI)V")
    public void method3139(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2555[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2555[arg0];
            if (this.field2590 != null) {
                class160.method3126(arg0, arg1, this.field2590);
                this.field2589[arg0] = true;
            }
            if (arg3) {
                this.field2549[arg0] = class120.method39(arg1, false);
            }
            return;
        }
        if (this.field2585) {
            throw new RuntimeException();
        }
        if (this.field2587 != null) {
            int var5 = this.field2584;
            class72 var6 = this.field2587;
            class159 var7 = new class159();
            var7.field2603 = 0;
            var7.field2839 = (long) var5;
            var7.field2599 = arg1;
            var7.field2600 = var6;
            class179 var8 = class160.field2604;
            synchronized (class160.field2604) {
                class160.field2604.method3334(var7);
            }
            Object var10 = class160.field2607;
            synchronized (class160.field2607) {
                if (class160.field2606 == 0) {
                    Statics.field1483.method1495(new class160(), 5);
                }
                class160.field2606 = 600;
            }
        }
        this.method3041(arg1);
        this.method3138();
    }

    @ObfuscatedName("fv.cu(Lbh;I[BZI)V")
    public void method3142(class72 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2587 != arg0) {
            if (!arg3 && this.field2591 == arg1) {
                this.field2585 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2589[arg1] = false;
                if (this.field2586 || arg3) {
                    class156.method1543(this, this.field2584, arg1, this.field2550[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2582.reset();
            field2582.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2582.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2550[arg1] != var9 || this.field2555[arg1] != var10) {
                this.field2589[arg1] = false;
                if (this.field2586 || arg3) {
                    class156.method1543(this, this.field2584, arg1, this.field2550[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2589[arg1] = true;
            if (arg3) {
                this.field2549[arg1] = class120.method39(arg2, false);
            }
            return;
        }
        if (this.field2585) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class156.method1543(this, 255, this.field2584, this.field2588, (byte) 0, true);
            return;
        }
        field2582.reset();
        field2582.update(arg2, 0, arg2.length);
        int var5 = (int) field2582.getValue();
        class128 var6 = new class128(class155.method250(arg2));
        int var7 = var6.method2531();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2468();
        }
        if (this.field2588 != var5 || this.field2583 != var8) {
            class156.method1543(this, 255, this.field2584, this.field2588, (byte) 0, true);
            return;
        }
        this.method3041(arg2);
        this.method3138();
    }

    @ObfuscatedName("fv.ce(I)V")
    public void method3138() {
        this.field2589 = new boolean[this.field2549.length];
        for (int var1 = 0; var1 < this.field2589.length; var1++) {
            this.field2589[var1] = false;
        }
        if (this.field2590 == null) {
            this.field2585 = true;
            return;
        }
        this.field2591 = -1;
        for (int var2 = 0; var2 < this.field2589.length; var2++) {
            if (this.field2544[var2] > 0) {
                class160.method166(var2, this.field2590, this);
                this.field2591 = var2;
            }
        }
        if (this.field2591 == -1) {
            this.field2585 = true;
        }
    }

    @ObfuscatedName("fv.ci(II)I")
    public int method3143(int arg0) {
        if (this.field2549[arg0] != null) {
            return 100;
        } else if (this.field2589[arg0]) {
            return 100;
        } else {
            int var2 = this.field2584;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2571 != null && Statics.field2571.field2839 == var3) {
                var5 = Statics.field2076.field2048 * 99 / (Statics.field2076.field2050.length - Statics.field2571.field2592) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fv.cf(I)I")
    public int method3144() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2549.length; var3++) {
            if (this.field2544[var3] > 0) {
                var1 += 100;
                var2 += this.method3143(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
