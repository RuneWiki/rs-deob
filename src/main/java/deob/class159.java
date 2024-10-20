package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fi")
public class class159 extends class158 {

    @ObfuscatedName("fi.a")
    public class126 field2597;

    @ObfuscatedName("fi.p")
    public class126 field2592;

    @ObfuscatedName("fi.t")
    public int field2591;

    @ObfuscatedName("fi.x")
    public volatile boolean field2593 = false;

    @ObfuscatedName("fi.d")
    public boolean field2595 = false;

    @ObfuscatedName("fi.j")
    public volatile boolean[] field2596;

    @ObfuscatedName("fi.r")
    public static CRC32 field2600 = new CRC32();

    @ObfuscatedName("fi.at")
    public int field2598;

    @ObfuscatedName("fi.av")
    public int field2599;

    @ObfuscatedName("fi.ar")
    public int field2602 = -1;

    public class159(class126 arg0, class126 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2597 = arg0;
        this.field2592 = arg1;
        this.field2591 = arg2;
        this.field2595 = arg5;
        class162.method853(this, this.field2591);
    }

    @ObfuscatedName("fi.bo(B)I")
    public int method2944() {
        if (this.field2593) {
            return 100;
        } else if (this.field2588 == null) {
            int var1 = class162.method776(255, this.field2591);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("fi.w(II)V")
    public void method2858(int arg0) {
        int var2 = this.field2591;
        long var3 = (long) ((var2 << 16) + arg0);
        class163 var5 = (class163) class162.field2623.method3354(var3);
        if (var5 != null) {
            class162.field2616.method3435(var5);
        }
    }

    @ObfuscatedName("fi.m(IB)V")
    public void method2910(int arg0) {
        if (this.field2597 == null || this.field2596 == null || !this.field2596[arg0]) {
            class162.method1441(this, this.field2591, arg0, this.field2577[arg0], (byte) 2, true);
        } else {
            class161.method491(arg0, this.field2597, this);
        }
    }

    @ObfuscatedName("fi.bv(III)V")
    public void method2929(int arg0, int arg1) {
        this.field2598 = arg0;
        this.field2599 = arg1;
        if (this.field2592 == null) {
            class162.method1441(this, 255, this.field2591, this.field2598, (byte) 0, true);
        } else {
            class161.method491(this.field2591, this.field2592, this);
        }
    }

    @ObfuscatedName("fi.bx(I[BZZI)V")
    public void method2930(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2593) {
                throw new RuntimeException();
            }
            if (this.field2592 != null) {
                class161.method774(this.field2591, arg1, this.field2592);
            }
            this.method2918(arg1);
            this.method2932();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2574[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2574[arg0];
        if (this.field2597 != null) {
            class126 var5 = this.field2597;
            class160 var6 = new class160();
            var6.field2606 = 0;
            var6.field3013 = (long) arg0;
            var6.field2604 = arg1;
            var6.field2605 = var5;
            class190 var7 = class161.field2611;
            synchronized (class161.field2611) {
                class161.field2611.method3377(var6);
            }
            Object var9 = class161.field2613;
            synchronized (class161.field2613) {
                if (class161.field2609 == 0) {
                    Statics.field813.method2523(new class161(), 5);
                }
                class161.field2609 = 600;
            }
            this.field2596[arg0] = true;
        }
        if (arg3) {
            this.field2588[arg0] = class117.method640(arg1, false);
        }
    }

    @ObfuscatedName("fi.bs(Ldm;I[BZI)V")
    public void method2936(class126 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2592 != arg0) {
            if (!arg3 && this.field2602 == arg1) {
                this.field2593 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2596[arg1] = false;
                if (this.field2595 || arg3) {
                    class162.method1441(this, this.field2591, arg1, this.field2577[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2600.reset();
            field2600.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2600.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2577[arg1] != var9 || this.field2574[arg1] != var10) {
                this.field2596[arg1] = false;
                if (this.field2595 || arg3) {
                    class162.method1441(this, this.field2591, arg1, this.field2577[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2596[arg1] = true;
            if (arg3) {
                this.field2588[arg1] = class117.method640(arg2, false);
            }
            return;
        }
        if (this.field2593) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class162.method1441(this, 255, this.field2591, this.field2598, (byte) 0, true);
            return;
        }
        field2600.reset();
        field2600.update(arg2, 0, arg2.length);
        int var5 = (int) field2600.getValue();
        class111 var6 = new class111(Statics.method3099(arg2));
        int var7 = var6.method2155();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2591 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2160();
        }
        if (this.field2598 != var5 || this.field2599 != var8) {
            class162.method1441(this, 255, this.field2591, this.field2598, (byte) 0, true);
            return;
        }
        this.method2918(arg2);
        this.method2932();
    }

    @ObfuscatedName("fi.bl(I)V")
    public void method2932() {
        this.field2596 = new boolean[this.field2588.length];
        for (int var1 = 0; var1 < this.field2596.length; var1++) {
            this.field2596[var1] = false;
        }
        if (this.field2597 == null) {
            this.field2593 = true;
            return;
        }
        this.field2602 = -1;
        for (int var2 = 0; var2 < this.field2596.length; var2++) {
            if (this.field2579[var2] > 0) {
                class161.method150(var2, this.field2597, this);
                this.field2602 = var2;
            }
        }
        if (this.field2602 == -1) {
            this.field2593 = true;
        }
    }

    @ObfuscatedName("fi.bz(IB)I")
    public int method2933(int arg0) {
        if (this.field2588[arg0] == null) {
            return this.field2596[arg0] ? 100 : class162.method776(this.field2591, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fi.bk(I)I")
    public int method2934() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2588.length; var3++) {
            if (this.field2579[var3] > 0) {
                var1 += 100;
                var2 += this.method2933(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
