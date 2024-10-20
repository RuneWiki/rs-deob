package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ff")
public class class172 extends class171 {

    @ObfuscatedName("ff.c")
    public class138 field2745;

    @ObfuscatedName("ff.i")
    public class138 field2742;

    @ObfuscatedName("ff.x")
    public int field2739;

    @ObfuscatedName("ff.v")
    public volatile boolean field2740 = false;

    @ObfuscatedName("ff.l")
    public boolean field2741 = false;

    @ObfuscatedName("ff.e")
    public volatile boolean[] field2737;

    @ObfuscatedName("ff.j")
    public static CRC32 field2743 = new CRC32();

    @ObfuscatedName("ff.ae")
    public int field2744;

    @ObfuscatedName("ff.ah")
    public int field2738;

    @ObfuscatedName("ff.am")
    public int field2746 = -1;

    public class172(class138 arg0, class138 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2745 = arg0;
        this.field2742 = arg1;
        this.field2739 = arg2;
        this.field2741 = arg5;
        int var8 = this.field2739;
        if (Statics.field782 == null) {
            class175.method587((class172) null, 255, 255, 0, (byte) 0, true);
            class175.field2779[var8] = this;
        } else {
            Statics.field782.field2028 = var8 * 8 + 5;
            int var9 = Statics.field782.method2408();
            int var10 = Statics.field782.method2408();
            this.method3159(var9, var10);
        }
    }

    @ObfuscatedName("ff.co(I)I")
    public int method3153() {
        if (this.field2740) {
            return 100;
        } else if (this.field2734 == null) {
            int var1 = class175.method796(255, this.field2739);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ff.z(II)V")
    public void method3069(int arg0) {
        int var2 = this.field2739;
        long var3 = (long) ((var2 << 16) + arg0);
        class176 var5 = (class176) class175.field2771.method3555(var3);
        if (var5 != null) {
            class175.field2770.method3653(var5);
        }
    }

    @ObfuscatedName("ff.r(IS)V")
    public void method3077(int arg0) {
        if (this.field2745 == null || this.field2737 == null || !this.field2737[arg0]) {
            class175.method587(this, this.field2739, arg0, this.field2726[arg0], (byte) 2, true);
        } else {
            class174.method2070(arg0, this.field2745, this);
        }
    }

    @ObfuscatedName("ff.cw(III)V")
    public void method3159(int arg0, int arg1) {
        this.field2744 = arg0;
        this.field2738 = arg1;
        if (this.field2742 == null) {
            class175.method587(this, 255, this.field2739, this.field2744, (byte) 0, true);
        } else {
            class174.method2070(this.field2739, this.field2742, this);
        }
    }

    @ObfuscatedName("ff.cl(I[BZZI)V")
    public void method3154(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2740) {
                throw new RuntimeException();
            }
            if (this.field2742 != null) {
                class174.method754(this.field2739, arg1, this.field2742);
            }
            this.method3068(arg1);
            this.method3177();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2721[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2721[arg0];
        if (this.field2745 != null) {
            class138 var5 = this.field2745;
            class173 var6 = new class173();
            var6.field2759 = 0;
            var6.field3167 = (long) arg0;
            var6.field2758 = arg1;
            var6.field2751 = var5;
            class203 var7 = class174.field2761;
            synchronized (class174.field2761) {
                class174.field2761.method3581(var6);
            }
            class174.method1577();
            this.field2737[arg0] = true;
        }
        if (arg3) {
            this.field2734[arg0] = class129.method2718(arg1, false);
        }
    }

    @ObfuscatedName("ff.ce(Les;I[BZI)V")
    public void method3155(class138 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2742 != arg0) {
            if (!arg3 && this.field2746 == arg1) {
                this.field2740 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2737[arg1] = false;
                if (this.field2741 || arg3) {
                    class175.method587(this, this.field2739, arg1, this.field2726[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2743.reset();
            field2743.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2743.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2726[arg1] != var9 || this.field2721[arg1] != var10) {
                this.field2737[arg1] = false;
                if (this.field2741 || arg3) {
                    class175.method587(this, this.field2739, arg1, this.field2726[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2737[arg1] = true;
            if (arg3) {
                this.field2734[arg1] = class129.method2718(arg2, false);
            }
            return;
        }
        if (this.field2740) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class175.method587(this, 255, this.field2739, this.field2744, (byte) 0, true);
            return;
        }
        field2743.reset();
        field2743.update(arg2, 0, arg2.length);
        int var5 = (int) field2743.getValue();
        class123 var6 = new class123(class171.method2976(arg2));
        int var7 = var6.method2363();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2739 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2408();
        }
        if (this.field2744 != var5 || this.field2738 != var8) {
            class175.method587(this, 255, this.field2739, this.field2744, (byte) 0, true);
            return;
        }
        this.method3068(arg2);
        this.method3177();
    }

    @ObfuscatedName("ff.cy(I)V")
    public void method3177() {
        this.field2737 = new boolean[this.field2734.length];
        for (int var1 = 0; var1 < this.field2737.length; var1++) {
            this.field2737[var1] = false;
        }
        if (this.field2745 == null) {
            this.field2740 = true;
            return;
        }
        this.field2746 = -1;
        for (int var2 = 0; var2 < this.field2737.length; var2++) {
            if (this.field2725[var2] > 0) {
                class138 var3 = this.field2745;
                class173 var5 = new class173();
                var5.field2759 = 1;
                var5.field3167 = (long) var2;
                var5.field2751 = var3;
                var5.field2752 = this;
                class203 var6 = class174.field2761;
                synchronized (class174.field2761) {
                    class174.field2761.method3581(var5);
                }
                class174.method1577();
                this.field2746 = var2;
            }
        }
        if (this.field2746 == -1) {
            this.field2740 = true;
        }
    }

    @ObfuscatedName("ff.cc(II)I")
    public int method3156(int arg0) {
        if (this.field2734[arg0] == null) {
            return this.field2737[arg0] ? 100 : class175.method796(this.field2739, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ff.cr(B)I")
    public int method3157() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2734.length; var3++) {
            if (this.field2725[var3] > 0) {
                var1 += 100;
                var2 += this.method3156(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
