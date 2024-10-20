package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fn")
public class class159 extends class158 {

    @ObfuscatedName("fn.w")
    public class126 field2573;

    @ObfuscatedName("fn.g")
    public class126 field2582;

    @ObfuscatedName("fn.f")
    public int field2574;

    @ObfuscatedName("fn.y")
    public volatile boolean field2581 = false;

    @ObfuscatedName("fn.j")
    public boolean field2576 = false;

    @ObfuscatedName("fn.x")
    public volatile boolean[] field2578;

    @ObfuscatedName("fn.d")
    public static CRC32 field2572 = new CRC32();

    @ObfuscatedName("fn.ax")
    public int field2579;

    @ObfuscatedName("fn.ag")
    public int field2580;

    @ObfuscatedName("fn.ai")
    public int field2575 = -1;

    public class159(class126 arg0, class126 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2573 = arg0;
        this.field2582 = arg1;
        this.field2574 = arg2;
        this.field2576 = arg5;
        class162.method1314(this, this.field2574);
    }

    @ObfuscatedName("fn.cr(I)I")
    public int method2898() {
        if (this.field2581) {
            return 100;
        } else if (this.field2565 == null) {
            int var1 = this.field2574;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field652 != null && Statics.field652.field3006 == var2) {
                var4 = Statics.field2531.field1894 * 99 / (Statics.field2531.field1897.length - Statics.field652.field2620) + 1;
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

    @ObfuscatedName("fn.e(IB)V")
    public void method2818(int arg0) {
        int var2 = this.field2574;
        long var3 = (long) ((var2 << 16) + arg0);
        class163 var5 = (class163) class162.field2616.method3297(var3);
        if (var5 != null) {
            class162.field2606.method3378(var5);
        }
    }

    @ObfuscatedName("fn.v(IB)V")
    public void method2826(int arg0) {
        if (this.field2573 == null || this.field2578 == null || !this.field2578[arg0]) {
            class162.method2410(this, this.field2574, arg0, this.field2559[arg0], (byte) 2, true);
        } else {
            class161.method30(arg0, this.field2573, this);
        }
    }

    @ObfuscatedName("fn.ca(III)V")
    public void method2899(int arg0, int arg1) {
        this.field2579 = arg0;
        this.field2580 = arg1;
        if (this.field2582 == null) {
            class162.method2410(this, 255, this.field2574, this.field2579, (byte) 0, true);
        } else {
            class161.method30(this.field2574, this.field2582, this);
        }
    }

    @ObfuscatedName("fn.cq(I[BZZI)V")
    public void method2904(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2581) {
                throw new RuntimeException();
            }
            if (this.field2582 != null) {
                class161.method870(this.field2574, arg1, this.field2582);
            }
            this.method2817(arg1);
            this.method2901();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2555[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2555[arg0];
        if (this.field2573 != null) {
            class161.method870(arg0, arg1, this.field2573);
            this.field2578[arg0] = true;
        }
        if (arg3) {
            this.field2565[arg0] = class117.method119(arg1, false);
        }
    }

    @ObfuscatedName("fn.cf(Ldf;I[BZI)V")
    public void method2906(class126 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2582 != arg0) {
            if (!arg3 && this.field2575 == arg1) {
                this.field2581 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2578[arg1] = false;
                if (this.field2576 || arg3) {
                    class162.method2410(this, this.field2574, arg1, this.field2559[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2572.reset();
            field2572.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2572.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2559[arg1] != var9 || this.field2555[arg1] != var10) {
                this.field2578[arg1] = false;
                if (this.field2576 || arg3) {
                    class162.method2410(this, this.field2574, arg1, this.field2559[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2578[arg1] = true;
            if (arg3) {
                this.field2565[arg1] = class117.method119(arg2, false);
            }
            return;
        }
        if (this.field2581) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class162.method2410(this, 255, this.field2574, this.field2579, (byte) 0, true);
            return;
        }
        field2572.reset();
        field2572.update(arg2, 0, arg2.length);
        int var5 = (int) field2572.getValue();
        class111 var6 = new class111(class158.method1078(arg2));
        int var7 = var6.method2127();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2574 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2194();
        }
        if (this.field2579 != var5 || this.field2580 != var8) {
            class162.method2410(this, 255, this.field2574, this.field2579, (byte) 0, true);
            return;
        }
        this.method2817(arg2);
        this.method2901();
    }

    @ObfuscatedName("fn.cz(I)V")
    public void method2901() {
        this.field2578 = new boolean[this.field2565.length];
        for (int var1 = 0; var1 < this.field2578.length; var1++) {
            this.field2578[var1] = false;
        }
        if (this.field2573 == null) {
            this.field2581 = true;
            return;
        }
        this.field2575 = -1;
        for (int var2 = 0; var2 < this.field2578.length; var2++) {
            if (this.field2562[var2] > 0) {
                class126 var3 = this.field2573;
                class160 var5 = new class160();
                var5.field2591 = 1;
                var5.field3006 = (long) var2;
                var5.field2584 = var3;
                var5.field2587 = this;
                class190 var6 = class161.field2596;
                synchronized (class161.field2596) {
                    class161.field2596.method3319(var5);
                }
                Object var8 = class161.field2592;
                synchronized (class161.field2592) {
                    if (class161.field2594 == 0) {
                        Statics.field808.method2507(new class161(), 5);
                    }
                    class161.field2594 = 600;
                }
                this.field2575 = var2;
            }
        }
        if (this.field2575 == -1) {
            this.field2581 = true;
        }
    }

    @ObfuscatedName("fn.ct(II)I")
    public int method2902(int arg0) {
        if (this.field2565[arg0] != null) {
            return 100;
        } else if (this.field2578[arg0]) {
            return 100;
        } else {
            int var2 = this.field2574;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field652 != null && Statics.field652.field3006 == var3) {
                var5 = Statics.field2531.field1894 * 99 / (Statics.field2531.field1897.length - Statics.field652.field2620) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fn.ck(B)I")
    public int method2903() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2565.length; var3++) {
            if (this.field2562[var3] > 0) {
                var1 += 100;
                var2 += this.method2902(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
