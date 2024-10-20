package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fp")
public class class172 extends class171 {

    @ObfuscatedName("fp.z")
    public class138 field2740;

    @ObfuscatedName("fp.q")
    public class138 field2745;

    @ObfuscatedName("fp.o")
    public int field2737;

    @ObfuscatedName("fp.f")
    public volatile boolean field2738 = false;

    @ObfuscatedName("fp.b")
    public boolean field2739 = false;

    @ObfuscatedName("fp.t")
    public volatile boolean[] field2746;

    @ObfuscatedName("fp.a")
    public static CRC32 field2741 = new CRC32();

    @ObfuscatedName("fp.am")
    public int field2742;

    @ObfuscatedName("fp.as")
    public int field2743;

    @ObfuscatedName("fp.ad")
    public int field2736 = -1;

    public class172(class138 arg0, class138 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2740 = arg0;
        this.field2745 = arg1;
        this.field2737 = arg2;
        this.field2739 = arg5;
        int var8 = this.field2737;
        if (Statics.field707 == null) {
            class175.method735((class172) null, 255, 255, 0, (byte) 0, true);
            class175.field2776[var8] = this;
        } else {
            Statics.field707.field2046 = var8 * 8 + 5;
            int var9 = Statics.field707.method2409();
            int var10 = Statics.field707.method2409();
            this.method3164(var9, var10);
        }
    }

    @ObfuscatedName("fp.cc(I)I")
    public int method3162() {
        if (this.field2738) {
            return 100;
        } else if (this.field2725 == null) {
            int var1 = class175.method569(255, this.field2737);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("fp.h(IS)V")
    public void method3122(int arg0) {
        int var2 = this.field2737;
        long var3 = (long) ((var2 << 16) + arg0);
        class176 var5 = (class176) class175.field2768.method3564(var3);
        if (var5 != null) {
            class175.field2766.method3656(var5);
        }
    }

    @ObfuscatedName("fp.y(IB)V")
    public void method3091(int arg0) {
        if (this.field2740 == null || this.field2746 == null || !this.field2746[arg0]) {
            class175.method735(this, this.field2737, arg0, this.field2731[arg0], (byte) 2, true);
            return;
        }
        class138 var2 = this.field2740;
        byte[] var4 = null;
        class203 var5 = class174.field2757;
        synchronized (class174.field2757) {
            for (class173 var6 = (class173) class174.field2757.method3597(); var6 != null; var6 = (class173) class174.field2757.method3599()) {
                if ((long) arg0 == var6.field3176 && var6.field2751 == var2 && var6.field2748 == 0) {
                    var4 = var6.field2749;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2752(arg0);
            this.method3166(var2, arg0, var8, true);
        } else {
            this.method3166(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("fp.cs(III)V")
    public void method3164(int arg0, int arg1) {
        this.field2742 = arg0;
        this.field2743 = arg1;
        if (this.field2745 == null) {
            class175.method735(this, 255, this.field2737, this.field2742, (byte) 0, true);
            return;
        }
        int var3 = this.field2737;
        class138 var4 = this.field2745;
        byte[] var6 = null;
        class203 var7 = class174.field2757;
        synchronized (class174.field2757) {
            for (class173 var8 = (class173) class174.field2757.method3597(); var8 != null; var8 = (class173) class174.field2757.method3599()) {
                if ((long) var3 == var8.field3176 && var8.field2751 == var4 && var8.field2748 == 0) {
                    var6 = var8.field2749;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2752(var3);
            this.method3166(var4, var3, var10, true);
        } else {
            this.method3166(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("fp.ch(I[BZZB)V")
    public void method3165(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2726[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2726[arg0];
            if (this.field2740 != null) {
                class138 var10 = this.field2740;
                class173 var11 = new class173();
                var11.field2748 = 0;
                var11.field3176 = (long) arg0;
                var11.field2749 = arg1;
                var11.field2751 = var10;
                class203 var12 = class174.field2757;
                synchronized (class174.field2757) {
                    class174.field2757.method3617(var11);
                }
                class174.method2990();
                this.field2746[arg0] = true;
            }
            if (arg3) {
                this.field2725[arg0] = class129.method99(arg1, false);
            }
            return;
        }
        if (this.field2738) {
            throw new RuntimeException();
        }
        if (this.field2745 != null) {
            int var5 = this.field2737;
            class138 var6 = this.field2745;
            class173 var7 = new class173();
            var7.field2748 = 0;
            var7.field3176 = (long) var5;
            var7.field2749 = arg1;
            var7.field2751 = var6;
            class203 var8 = class174.field2757;
            synchronized (class174.field2757) {
                class174.field2757.method3617(var7);
            }
            class174.method2990();
        }
        this.method3140(arg1);
        this.method3174();
    }

    @ObfuscatedName("fp.cu(Lep;I[BZB)V")
    public void method3166(class138 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2745 != arg0) {
            if (!arg3 && this.field2736 == arg1) {
                this.field2738 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2746[arg1] = false;
                if (this.field2739 || arg3) {
                    class175.method735(this, this.field2737, arg1, this.field2731[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2741.reset();
            field2741.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2741.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2731[arg1] != var9 || this.field2726[arg1] != var10) {
                this.field2746[arg1] = false;
                if (this.field2739 || arg3) {
                    class175.method735(this, this.field2737, arg1, this.field2731[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2746[arg1] = true;
            if (arg3) {
                this.field2725[arg1] = class129.method99(arg2, false);
            }
            return;
        }
        if (this.field2738) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class175.method735(this, 255, this.field2737, this.field2742, (byte) 0, true);
            return;
        }
        field2741.reset();
        field2741.update(arg2, 0, arg2.length);
        int var5 = (int) field2741.getValue();
        class123 var6 = new class123(class171.method2736(arg2));
        int var7 = var6.method2404();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2737 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2409();
        }
        if (this.field2742 != var5 || this.field2743 != var8) {
            class175.method735(this, 255, this.field2737, this.field2742, (byte) 0, true);
            return;
        }
        this.method3140(arg2);
        this.method3174();
    }

    @ObfuscatedName("fp.cl(I)V")
    public void method3174() {
        this.field2746 = new boolean[this.field2725.length];
        for (int var1 = 0; var1 < this.field2746.length; var1++) {
            this.field2746[var1] = false;
        }
        if (this.field2740 == null) {
            this.field2738 = true;
            return;
        }
        this.field2736 = -1;
        for (int var2 = 0; var2 < this.field2746.length; var2++) {
            if (this.field2721[var2] > 0) {
                class138 var3 = this.field2740;
                class173 var5 = new class173();
                var5.field2748 = 1;
                var5.field3176 = (long) var2;
                var5.field2751 = var3;
                var5.field2750 = this;
                class203 var6 = class174.field2757;
                synchronized (class174.field2757) {
                    class174.field2757.method3617(var5);
                }
                class174.method2990();
                this.field2736 = var2;
            }
        }
        if (this.field2736 == -1) {
            this.field2738 = true;
        }
    }

    @ObfuscatedName("fp.cw(II)I")
    public int method3161(int arg0) {
        if (this.field2725[arg0] == null) {
            return this.field2746[arg0] ? 100 : class175.method569(this.field2737, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fp.cp(I)I")
    public int method3168() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2725.length; var3++) {
            if (this.field2721[var3] > 0) {
                var1 += 100;
                var2 += this.method3161(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
