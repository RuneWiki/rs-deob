package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fo")
public class class169 extends class168 {

    @ObfuscatedName("fo.v")
    public class135 field2687;

    @ObfuscatedName("fo.y")
    public class135 field2686;

    @ObfuscatedName("fo.c")
    public int field2691;

    @ObfuscatedName("fo.i")
    public volatile boolean field2688 = false;

    @ObfuscatedName("fo.a")
    public boolean field2689 = false;

    @ObfuscatedName("fo.z")
    public volatile boolean[] field2685;

    @ObfuscatedName("fo.j")
    public static CRC32 field2694 = new CRC32();

    @ObfuscatedName("fo.ag")
    public int field2692;

    @ObfuscatedName("fo.ax")
    public int field2693;

    @ObfuscatedName("fo.ao")
    public int field2695 = -1;

    public class169(class135 arg0, class135 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2687 = arg0;
        this.field2686 = arg1;
        this.field2691 = arg2;
        this.field2689 = arg5;
        class172.method2315(this, this.field2691);
    }

    @ObfuscatedName("fo.cl(I)I")
    public int method3137() {
        if (this.field2688) {
            return 100;
        } else if (this.field2667 == null) {
            int var1 = class172.method93(255, this.field2691);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("fo.u(II)V")
    public void method3060(int arg0) {
        int var2 = this.field2691;
        long var3 = (long) ((var2 << 16) + arg0);
        class173 var5 = (class173) class172.field2719.method3555(var3);
        if (var5 != null) {
            class172.field2718.method3645(var5);
        }
    }

    @ObfuscatedName("fo.r(II)V")
    public void method3098(int arg0) {
        if (this.field2687 == null || this.field2685 == null || !this.field2685[arg0]) {
            class172.method1045(this, this.field2691, arg0, this.field2670[arg0], (byte) 2, true);
        } else {
            class171.method1825(arg0, this.field2687, this);
        }
    }

    @ObfuscatedName("fo.ci(III)V")
    public void method3141(int arg0, int arg1) {
        this.field2692 = arg0;
        this.field2693 = arg1;
        if (this.field2686 == null) {
            class172.method1045(this, 255, this.field2691, this.field2692, (byte) 0, true);
        } else {
            class171.method1825(this.field2691, this.field2686, this);
        }
    }

    @ObfuscatedName("fo.cz(I[BZZI)V")
    public void method3160(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2688) {
                throw new RuntimeException();
            }
            if (this.field2686 != null) {
                class171.method2629(this.field2691, arg1, this.field2686);
            }
            this.method3126(arg1);
            this.method3138();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2672[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2672[arg0];
        if (this.field2687 != null) {
            class135 var5 = this.field2687;
            class170 var6 = new class170();
            var6.field2698 = 0;
            var6.field3116 = (long) arg0;
            var6.field2697 = arg1;
            var6.field2699 = var5;
            class200 var7 = class171.field2708;
            synchronized (class171.field2708) {
                class171.field2708.method3610(var6);
            }
            Object var9 = class171.field2706;
            synchronized (class171.field2706) {
                if (class171.field2703 == 0) {
                    Statics.field137.method2729(new class171(), 5);
                }
                class171.field2703 = 600;
            }
            this.field2685[arg0] = true;
        }
        if (arg3) {
            this.field2667[arg0] = class126.method995(arg1, false);
        }
    }

    @ObfuscatedName("fo.cj(Lef;I[BZS)V")
    public void method3139(class135 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2686 != arg0) {
            if (!arg3 && this.field2695 == arg1) {
                this.field2688 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2685[arg1] = false;
                if (this.field2689 || arg3) {
                    class172.method1045(this, this.field2691, arg1, this.field2670[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2694.reset();
            field2694.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2694.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2670[arg1] != var9 || this.field2672[arg1] != var10) {
                this.field2685[arg1] = false;
                if (this.field2689 || arg3) {
                    class172.method1045(this, this.field2691, arg1, this.field2670[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2685[arg1] = true;
            if (arg3) {
                this.field2667[arg1] = class126.method995(arg2, false);
            }
            return;
        }
        if (this.field2688) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class172.method1045(this, 255, this.field2691, this.field2692, (byte) 0, true);
            return;
        }
        field2694.reset();
        field2694.update(arg2, 0, arg2.length);
        int var5 = (int) field2694.getValue();
        class120 var6 = new class120(Statics.method3502(arg2));
        int var7 = var6.method2385();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2691 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2527();
        }
        if (this.field2692 != var5 || this.field2693 != var8) {
            class172.method1045(this, 255, this.field2691, this.field2692, (byte) 0, true);
            return;
        }
        this.method3126(arg2);
        this.method3138();
    }

    @ObfuscatedName("fo.ch(B)V")
    public void method3138() {
        this.field2685 = new boolean[this.field2667.length];
        for (int var1 = 0; var1 < this.field2685.length; var1++) {
            this.field2685[var1] = false;
        }
        if (this.field2687 == null) {
            this.field2688 = true;
            return;
        }
        this.field2695 = -1;
        for (int var2 = 0; var2 < this.field2685.length; var2++) {
            if (this.field2671[var2] > 0) {
                class171.method190(var2, this.field2687, this);
                this.field2695 = var2;
            }
        }
        if (this.field2695 == -1) {
            this.field2688 = true;
        }
    }

    @ObfuscatedName("fo.cx(II)I")
    public int method3140(int arg0) {
        if (this.field2667[arg0] == null) {
            return this.field2685[arg0] ? 100 : class172.method93(this.field2691, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fo.cm(I)I")
    public int method3142() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2667.length; var3++) {
            if (this.field2671[var3] > 0) {
                var1 += 100;
                var2 += this.method3140(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
