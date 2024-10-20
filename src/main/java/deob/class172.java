package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fq")
public class class172 extends class171 {

    @ObfuscatedName("fq.v")
    public class138 field2751;

    @ObfuscatedName("fq.j")
    public class138 field2745;

    @ObfuscatedName("fq.x")
    public int field2746;

    @ObfuscatedName("fq.t")
    public volatile boolean field2748 = false;

    @ObfuscatedName("fq.y")
    public boolean field2750 = false;

    @ObfuscatedName("fq.a")
    public volatile boolean[] field2749;

    @ObfuscatedName("fq.c")
    public static CRC32 field2752 = new CRC32();

    @ObfuscatedName("fq.ad")
    public int field2747;

    @ObfuscatedName("fq.as")
    public int field2744;

    @ObfuscatedName("fq.ac")
    public int field2753 = -1;

    public class172(class138 arg0, class138 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2751 = arg0;
        this.field2745 = arg1;
        this.field2746 = arg2;
        this.field2750 = arg5;
        class175.method2412(this, this.field2746);
    }

    @ObfuscatedName("fq.ci(B)I")
    public int method3290() {
        if (this.field2748) {
            return 100;
        } else if (this.field2735 == null) {
            int var1 = class175.method2404(255, this.field2746);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("fq.g(II)V")
    public void method3193(int arg0) {
        class175.method4(this.field2746, arg0);
    }

    @ObfuscatedName("fq.m(II)V")
    public void method3202(int arg0) {
        if (this.field2751 == null || this.field2749 == null || !this.field2749[arg0]) {
            class175.method2776(this, this.field2746, arg0, this.field2737[arg0], (byte) 2, true);
        } else {
            class174.method2417(arg0, this.field2751, this);
        }
    }

    @ObfuscatedName("fq.cj(III)V")
    public void method3284(int arg0, int arg1) {
        this.field2747 = arg0;
        this.field2744 = arg1;
        if (this.field2745 == null) {
            class175.method2776(this, 255, this.field2746, this.field2747, (byte) 0, true);
        } else {
            class174.method2417(this.field2746, this.field2745, this);
        }
    }

    @ObfuscatedName("fq.co(I[BZZI)V")
    public void method3285(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2730[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2730[arg0];
            if (this.field2751 != null) {
                class138 var12 = this.field2751;
                class173 var13 = new class173();
                var13.field2758 = 0;
                var13.field3176 = (long) arg0;
                var13.field2756 = arg1;
                var13.field2760 = var12;
                class203 var14 = class174.field2766;
                synchronized (class174.field2766) {
                    class174.field2766.method3711(var13);
                }
                Object var16 = class174.field2764;
                synchronized (class174.field2764) {
                    if (class174.field2768 == 0) {
                        Statics.field2071.method2880(new class174(), 5);
                    }
                    class174.field2768 = 600;
                }
                this.field2749[arg0] = true;
            }
            if (arg3) {
                this.field2735[arg0] = class129.method1106(arg1, false);
            }
            return;
        }
        if (this.field2748) {
            throw new RuntimeException();
        }
        if (this.field2745 != null) {
            int var5 = this.field2746;
            class138 var6 = this.field2745;
            class173 var7 = new class173();
            var7.field2758 = 0;
            var7.field3176 = (long) var5;
            var7.field2756 = arg1;
            var7.field2760 = var6;
            class203 var8 = class174.field2766;
            synchronized (class174.field2766) {
                class174.field2766.method3711(var7);
            }
            Object var10 = class174.field2764;
            synchronized (class174.field2764) {
                if (class174.field2768 == 0) {
                    Statics.field2071.method2880(new class174(), 5);
                }
                class174.field2768 = 600;
            }
        }
        this.method3192(arg1);
        this.method3287();
    }

    @ObfuscatedName("fq.ct(Lel;I[BZB)V")
    public void method3282(class138 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2745 != arg0) {
            if (!arg3 && this.field2753 == arg1) {
                this.field2748 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2749[arg1] = false;
                if (this.field2750 || arg3) {
                    class175.method2776(this, this.field2746, arg1, this.field2737[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2752.reset();
            field2752.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2752.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2737[arg1] != var9 || this.field2730[arg1] != var10) {
                this.field2749[arg1] = false;
                if (this.field2750 || arg3) {
                    class175.method2776(this, this.field2746, arg1, this.field2737[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2749[arg1] = true;
            if (arg3) {
                this.field2735[arg1] = class129.method1106(arg2, false);
            }
            return;
        }
        if (this.field2748) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class175.method2776(this, 255, this.field2746, this.field2747, (byte) 0, true);
            return;
        }
        field2752.reset();
        field2752.update(arg2, 0, arg2.length);
        int var5 = (int) field2752.getValue();
        class123 var6 = new class123(class171.method2750(arg2));
        int var7 = var6.method2490();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2746 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2477();
        }
        if (this.field2747 != var5 || this.field2744 != var8) {
            class175.method2776(this, 255, this.field2746, this.field2747, (byte) 0, true);
            return;
        }
        this.method3192(arg2);
        this.method3287();
    }

    @ObfuscatedName("fq.cp(B)V")
    public void method3287() {
        this.field2749 = new boolean[this.field2735.length];
        for (int var1 = 0; var1 < this.field2749.length; var1++) {
            this.field2749[var1] = false;
        }
        if (this.field2751 == null) {
            this.field2748 = true;
            return;
        }
        this.field2753 = -1;
        for (int var2 = 0; var2 < this.field2749.length; var2++) {
            if (this.field2743[var2] > 0) {
                class138 var3 = this.field2751;
                class173 var5 = new class173();
                var5.field2758 = 1;
                var5.field3176 = (long) var2;
                var5.field2760 = var3;
                var5.field2759 = this;
                class203 var6 = class174.field2766;
                synchronized (class174.field2766) {
                    class174.field2766.method3711(var5);
                }
                Object var8 = class174.field2764;
                synchronized (class174.field2764) {
                    if (class174.field2768 == 0) {
                        Statics.field2071.method2880(new class174(), 5);
                    }
                    class174.field2768 = 600;
                }
                this.field2753 = var2;
            }
        }
        if (this.field2753 == -1) {
            this.field2748 = true;
        }
    }

    @ObfuscatedName("fq.cx(II)I")
    public int method3288(int arg0) {
        if (this.field2735[arg0] != null) {
            return 100;
        } else if (this.field2749[arg0]) {
            return 100;
        } else {
            int var2 = this.field2746;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2781 != null && Statics.field2781.field3176 == var3) {
                var5 = Statics.field2369.field2051 * 99 / (Statics.field2369.field2052.length - Statics.field2781.field2794) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fq.cn(S)I")
    public int method3289() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2735.length; var3++) {
            if (this.field2743[var3] > 0) {
                var1 += 100;
                var2 += this.method3288(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
