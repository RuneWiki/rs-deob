package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fx")
public class class172 extends class171 {

    @ObfuscatedName("fx.a")
    public class138 field2744;

    @ObfuscatedName("fx.n")
    public class138 field2740;

    @ObfuscatedName("fx.z")
    public int field2736;

    @ObfuscatedName("fx.x")
    public volatile boolean field2739 = false;

    @ObfuscatedName("fx.d")
    public boolean field2741 = false;

    @ObfuscatedName("fx.t")
    public volatile boolean[] field2737;

    @ObfuscatedName("fx.o")
    public static CRC32 field2742 = new CRC32();

    @ObfuscatedName("fx.aq")
    public int field2743;

    @ObfuscatedName("fx.al")
    public int field2738;

    @ObfuscatedName("fx.av")
    public int field2745 = -1;

    public class172(class138 arg0, class138 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2744 = arg0;
        this.field2740 = arg1;
        this.field2736 = arg2;
        this.field2741 = arg5;
        int var8 = this.field2736;
        if (Statics.field720 == null) {
            class175.method2222((class172) null, 255, 255, 0, (byte) 0, true);
            class175.field2782[var8] = this;
        } else {
            Statics.field720.field2060 = var8 * 8 + 5;
            int var9 = Statics.field720.method2432();
            int var10 = Statics.field720.method2432();
            this.method3157(var9, var10);
        }
    }

    @ObfuscatedName("fx.cg(I)I")
    public int method3156() {
        if (this.field2739) {
            return 100;
        } else if (this.field2727 == null) {
            int var1 = this.field2736;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field3216 != null && Statics.field3216.field3166 == var2) {
                var4 = Statics.field262.field2060 * 99 / (Statics.field262.field2054.length - Statics.field3216.field2785) + 1;
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

    @ObfuscatedName("fx.q(II)V")
    public void method3071(int arg0) {
        int var2 = this.field2736;
        long var3 = (long) ((var2 << 16) + arg0);
        class176 var5 = (class176) class175.field2769.method3580(var3);
        if (var5 != null) {
            class175.field2768.method3668(var5);
        }
    }

    @ObfuscatedName("fx.l(II)V")
    public void method3155(int arg0) {
        if (this.field2744 == null || this.field2737 == null || !this.field2737[arg0]) {
            class175.method2222(this, this.field2736, arg0, this.field2721[arg0], (byte) 2, true);
        } else {
            class174.method798(arg0, this.field2744, this);
        }
    }

    @ObfuscatedName("fx.cp(III)V")
    public void method3157(int arg0, int arg1) {
        this.field2743 = arg0;
        this.field2738 = arg1;
        if (this.field2740 == null) {
            class175.method2222(this, 255, this.field2736, this.field2743, (byte) 0, true);
        } else {
            class174.method798(this.field2736, this.field2740, this);
        }
    }

    @ObfuscatedName("fx.cd(I[BZZI)V")
    public void method3176(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2723[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2723[arg0];
            if (this.field2744 != null) {
                class138 var10 = this.field2744;
                class173 var11 = new class173();
                var11.field2750 = 0;
                var11.field3166 = (long) arg0;
                var11.field2748 = arg1;
                var11.field2749 = var10;
                class203 var12 = class174.field2760;
                synchronized (class174.field2760) {
                    class174.field2760.method3596(var11);
                }
                class174.method3528();
                this.field2737[arg0] = true;
            }
            if (arg3) {
                this.field2727[arg0] = class129.method967(arg1, false);
            }
            return;
        }
        if (this.field2739) {
            throw new RuntimeException();
        }
        if (this.field2740 != null) {
            int var5 = this.field2736;
            class138 var6 = this.field2740;
            class173 var7 = new class173();
            var7.field2750 = 0;
            var7.field3166 = (long) var5;
            var7.field2748 = arg1;
            var7.field2749 = var6;
            class203 var8 = class174.field2760;
            synchronized (class174.field2760) {
                class174.field2760.method3596(var7);
            }
            class174.method3528();
        }
        this.method3070(arg1);
        this.method3160();
    }

    @ObfuscatedName("fx.cq(Lex;I[BZI)V")
    public void method3158(class138 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2740 != arg0) {
            if (!arg3 && this.field2745 == arg1) {
                this.field2739 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2737[arg1] = false;
                if (this.field2741 || arg3) {
                    class175.method2222(this, this.field2736, arg1, this.field2721[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2742.reset();
            field2742.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2742.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2721[arg1] != var9 || this.field2723[arg1] != var10) {
                this.field2737[arg1] = false;
                if (this.field2741 || arg3) {
                    class175.method2222(this, this.field2736, arg1, this.field2721[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2737[arg1] = true;
            if (arg3) {
                this.field2727[arg1] = class129.method967(arg2, false);
            }
            return;
        }
        if (this.field2739) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class175.method2222(this, 255, this.field2736, this.field2743, (byte) 0, true);
            return;
        }
        field2742.reset();
        field2742.update(arg2, 0, arg2.length);
        int var5 = (int) field2742.getValue();
        class123 var6 = new class123(class171.method2118(arg2));
        int var7 = var6.method2427();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2736 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2432();
        }
        if (this.field2743 != var5 || this.field2738 != var8) {
            class175.method2222(this, 255, this.field2736, this.field2743, (byte) 0, true);
            return;
        }
        this.method3070(arg2);
        this.method3160();
    }

    @ObfuscatedName("fx.co(I)V")
    public void method3160() {
        this.field2737 = new boolean[this.field2727.length];
        for (int var1 = 0; var1 < this.field2737.length; var1++) {
            this.field2737[var1] = false;
        }
        if (this.field2744 == null) {
            this.field2739 = true;
            return;
        }
        this.field2745 = -1;
        for (int var2 = 0; var2 < this.field2737.length; var2++) {
            if (this.field2717[var2] > 0) {
                class138 var3 = this.field2744;
                class173 var5 = new class173();
                var5.field2750 = 1;
                var5.field3166 = (long) var2;
                var5.field2749 = var3;
                var5.field2751 = this;
                class203 var6 = class174.field2760;
                synchronized (class174.field2760) {
                    class174.field2760.method3596(var5);
                }
                class174.method3528();
                this.field2745 = var2;
            }
        }
        if (this.field2745 == -1) {
            this.field2739 = true;
        }
    }

    @ObfuscatedName("fx.cj(IB)I")
    public int method3165(int arg0) {
        if (this.field2727[arg0] != null) {
            return 100;
        } else if (this.field2737[arg0]) {
            return 100;
        } else {
            int var2 = this.field2736;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field3216 != null && Statics.field3216.field3166 == var3) {
                var5 = Statics.field262.field2060 * 99 / (Statics.field262.field2054.length - Statics.field3216.field2785) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fx.ck(I)I")
    public int method3164() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2727.length; var3++) {
            if (this.field2717[var3] > 0) {
                var1 += 100;
                var2 += this.method3165(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
