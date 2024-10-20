package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fx")
public class class159 extends class158 {

    @ObfuscatedName("fx.c")
    public class126 field2593;

    @ObfuscatedName("fx.p")
    public class126 field2585;

    @ObfuscatedName("fx.o")
    public int field2586;

    @ObfuscatedName("fx.b")
    public volatile boolean field2587 = false;

    @ObfuscatedName("fx.t")
    public boolean field2588 = false;

    @ObfuscatedName("fx.w")
    public volatile boolean[] field2589;

    @ObfuscatedName("fx.i")
    public static CRC32 field2592 = new CRC32();

    @ObfuscatedName("fx.ad")
    public int field2591;

    @ObfuscatedName("fx.ak")
    public int field2584;

    @ObfuscatedName("fx.ae")
    public int field2590 = -1;

    public class159(class126 arg0, class126 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2593 = arg0;
        this.field2585 = arg1;
        this.field2586 = arg2;
        this.field2588 = arg5;
        int var8 = this.field2586;
        if (Statics.field2623 == null) {
            class162.method2053((class159) null, 255, 255, 0, (byte) 0, true);
            class162.field2609[var8] = this;
        } else {
            Statics.field2623.field1889 = var8 * 8 + 5;
            int var9 = Statics.field2623.method2233();
            int var10 = Statics.field2623.method2233();
            this.method3043(var9, var10);
        }
    }

    @ObfuscatedName("fx.ch(B)I")
    public int method3038() {
        if (this.field2587) {
            return 100;
        } else if (this.field2572 == null) {
            int var1 = class162.method2173(255, this.field2586);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("fx.d(IB)V")
    public void method2947(int arg0) {
        int var2 = this.field2586;
        long var3 = (long) ((var2 << 16) + arg0);
        class163 var5 = (class163) class162.field2611.method3445(var3);
        if (var5 != null) {
            class162.field2610.method3527(var5);
        }
    }

    @ObfuscatedName("fx.l(II)V")
    public void method3000(int arg0) {
        if (this.field2593 == null || this.field2589 == null || !this.field2589[arg0]) {
            class162.method2053(this, this.field2586, arg0, this.field2582[arg0], (byte) 2, true);
        } else {
            class161.method1963(arg0, this.field2593, this);
        }
    }

    @ObfuscatedName("fx.cx(III)V")
    public void method3043(int arg0, int arg1) {
        this.field2591 = arg0;
        this.field2584 = arg1;
        if (this.field2585 == null) {
            class162.method2053(this, 255, this.field2586, this.field2591, (byte) 0, true);
        } else {
            class161.method1963(this.field2586, this.field2585, this);
        }
    }

    @ObfuscatedName("fx.cy(I[BZZI)V")
    public void method3040(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2587) {
                throw new RuntimeException();
            }
            if (this.field2585 != null) {
                class161.method147(this.field2586, arg1, this.field2585);
            }
            this.method2946(arg1);
            this.method3052();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2567[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2567[arg0];
        if (this.field2593 != null) {
            class161.method147(arg0, arg1, this.field2593);
            this.field2589[arg0] = true;
        }
        if (arg3) {
            this.field2572[arg0] = class117.method104(arg1, false);
        }
    }

    @ObfuscatedName("fx.cm(Ldu;I[BZI)V")
    public void method3041(class126 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2585 != arg0) {
            if (!arg3 && this.field2590 == arg1) {
                this.field2587 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2589[arg1] = false;
                if (this.field2588 || arg3) {
                    class162.method2053(this, this.field2586, arg1, this.field2582[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2592.reset();
            field2592.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2592.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2582[arg1] != var9 || this.field2567[arg1] != var10) {
                this.field2589[arg1] = false;
                if (this.field2588 || arg3) {
                    class162.method2053(this, this.field2586, arg1, this.field2582[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2589[arg1] = true;
            if (arg3) {
                this.field2572[arg1] = class117.method104(arg2, false);
            }
            return;
        }
        if (this.field2587) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class162.method2053(this, 255, this.field2586, this.field2591, (byte) 0, true);
            return;
        }
        field2592.reset();
        field2592.update(arg2, 0, arg2.length);
        int var5 = (int) field2592.getValue();
        class111 var6 = new class111(class158.method112(arg2));
        int var7 = var6.method2228();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2586 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2233();
        }
        if (this.field2591 != var5 || this.field2584 != var8) {
            class162.method2053(this, 255, this.field2586, this.field2591, (byte) 0, true);
            return;
        }
        this.method2946(arg2);
        this.method3052();
    }

    @ObfuscatedName("fx.cd(I)V")
    public void method3052() {
        this.field2589 = new boolean[this.field2572.length];
        for (int var1 = 0; var1 < this.field2589.length; var1++) {
            this.field2589[var1] = false;
        }
        if (this.field2593 == null) {
            this.field2587 = true;
            return;
        }
        this.field2590 = -1;
        for (int var2 = 0; var2 < this.field2589.length; var2++) {
            if (this.field2568[var2] > 0) {
                class126 var3 = this.field2593;
                class160 var5 = new class160();
                var5.field2596 = 1;
                var5.field3007 = (long) var2;
                var5.field2594 = var3;
                var5.field2597 = this;
                class190 var6 = class161.field2599;
                synchronized (class161.field2599) {
                    class161.field2599.method3477(var5);
                }
                class161.method1965();
                this.field2590 = var2;
            }
        }
        if (this.field2590 == -1) {
            this.field2587 = true;
        }
    }

    @ObfuscatedName("fx.ci(II)I")
    public int method3042(int arg0) {
        if (this.field2572[arg0] == null) {
            return this.field2589[arg0] ? 100 : class162.method2173(this.field2586, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fx.cp(I)I")
    public int method3056() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2572.length; var3++) {
            if (this.field2568[var3] > 0) {
                var1 += 100;
                var2 += this.method3042(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
