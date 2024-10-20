package deob;

import java.util.zip.CRC32;

@ObfuscatedName("gf")
public class class187 extends class185 {

    @ObfuscatedName("gf.x")
    public class117 field2740;

    @ObfuscatedName("gf.h")
    public class117 field2737;

    @ObfuscatedName("gf.b")
    public int field2738;

    @ObfuscatedName("gf.f")
    public volatile boolean field2747 = false;

    @ObfuscatedName("gf.o")
    public boolean field2749 = false;

    @ObfuscatedName("gf.m")
    public volatile boolean[] field2741;

    @ObfuscatedName("gf.y")
    public static CRC32 field2739 = new CRC32();

    @ObfuscatedName("gf.am")
    public int field2750;

    @ObfuscatedName("gf.ax")
    public int field2744;

    @ObfuscatedName("gf.ac")
    public int field2745 = -1;

    public class187(class117 arg0, class117 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2740 = arg0;
        this.field2737 = arg1;
        this.field2738 = arg2;
        this.field2749 = arg5;
        class188.method2906(this, this.field2738);
    }

    @ObfuscatedName("gf.cz(B)I")
    public int method3194() {
        if (this.field2747) {
            return 100;
        } else if (this.field2709 == null) {
            int var1 = this.field2738;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2882 != null && Statics.field2882.field2034 == var2) {
                var4 = Statics.field2752.field1956 * 99 / (Statics.field2752.field1955.length - Statics.field2882.field2706) + 1;
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

    @ObfuscatedName("gf.c(II)V")
    public void method3115(int arg0) {
        Statics.method16(this.field2738, arg0);
    }

    @ObfuscatedName("gf.k(II)V")
    public void method3095(int arg0) {
        if (this.field2740 == null || this.field2741 == null || !this.field2741[arg0]) {
            class188.method3061(this, this.field2738, arg0, this.field2713[arg0], (byte) 2, true);
            return;
        }
        class117 var2 = this.field2740;
        byte[] var4 = null;
        class150 var5 = class186.field2728;
        synchronized (class186.field2728) {
            for (class183 var6 = (class183) class186.field2728.method2666(); var6 != null; var6 = (class183) class186.field2728.method2668()) {
                if ((long) arg0 == var6.field2034 && var6.field2698 == var2 && var6.field2703 == 0) {
                    var4 = var6.field2696;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2092(arg0);
            this.method3189(var2, arg0, var8, true);
        } else {
            this.method3189(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("gf.ct(III)V")
    public void method3175(int arg0, int arg1) {
        this.field2750 = arg0;
        this.field2744 = arg1;
        if (this.field2737 == null) {
            class188.method3061(this, 255, this.field2738, this.field2750, (byte) 0, true);
            return;
        }
        int var3 = this.field2738;
        class117 var4 = this.field2737;
        byte[] var6 = null;
        class150 var7 = class186.field2728;
        synchronized (class186.field2728) {
            for (class183 var8 = (class183) class186.field2728.method2666(); var8 != null; var8 = (class183) class186.field2728.method2668()) {
                if ((long) var3 == var8.field2034 && var8.field2698 == var4 && var8.field2703 == 0) {
                    var6 = var8.field2696;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2092(var3);
            this.method3189(var4, var3, var10, true);
        } else {
            this.method3189(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("gf.cq(I[BZZB)V")
    public void method3176(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2747) {
                throw new RuntimeException();
            }
            if (this.field2737 != null) {
                class186.method574(this.field2738, arg1, this.field2737);
            }
            this.method3109(arg1);
            this.method3174();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2715[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2715[arg0];
        if (this.field2740 != null) {
            class186.method574(arg0, arg1, this.field2740);
            this.field2741[arg0] = true;
        }
        if (arg3) {
            this.field2709[arg0] = class133.method258(arg1, false);
        }
    }

    @ObfuscatedName("gf.cs(Lds;I[BZI)V")
    public void method3189(class117 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2737 != arg0) {
            if (!arg3 && this.field2745 == arg1) {
                this.field2747 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2741[arg1] = false;
                if (this.field2749 || arg3) {
                    class188.method3061(this, this.field2738, arg1, this.field2713[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2739.reset();
            field2739.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2739.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2713[arg1] != var9 || this.field2715[arg1] != var10) {
                this.field2741[arg1] = false;
                if (this.field2749 || arg3) {
                    class188.method3061(this, this.field2738, arg1, this.field2713[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2741[arg1] = true;
            if (arg3) {
                this.field2709[arg1] = class133.method258(arg2, false);
            }
            return;
        }
        if (this.field2747) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class188.method3061(this, 255, this.field2738, this.field2750, (byte) 0, true);
            return;
        }
        field2739.reset();
        field2739.update(arg2, 0, arg2.length);
        int var5 = (int) field2739.getValue();
        class130 var6 = new class130(class185.method2984(arg2));
        int var7 = var6.method2379();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2738 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2246();
        }
        if (this.field2750 != var5 || this.field2744 != var8) {
            class188.method3061(this, 255, this.field2738, this.field2750, (byte) 0, true);
            return;
        }
        this.method3109(arg2);
        this.method3174();
    }

    @ObfuscatedName("gf.cy(I)V")
    public void method3174() {
        this.field2741 = new boolean[this.field2709.length];
        for (int var1 = 0; var1 < this.field2741.length; var1++) {
            this.field2741[var1] = false;
        }
        if (this.field2740 == null) {
            this.field2747 = true;
            return;
        }
        this.field2745 = -1;
        for (int var2 = 0; var2 < this.field2741.length; var2++) {
            if (this.field2712[var2] > 0) {
                class117 var3 = this.field2740;
                class183 var5 = new class183();
                var5.field2703 = 1;
                var5.field2034 = (long) var2;
                var5.field2698 = var3;
                var5.field2699 = this;
                class150 var6 = class186.field2728;
                synchronized (class186.field2728) {
                    class186.field2728.method2662(var5);
                }
                Object var8 = class186.field2731;
                synchronized (class186.field2731) {
                    if (class186.field2730 == 0) {
                        Statics.field2732 = new Thread(new class186());
                        Statics.field2732.setDaemon(true);
                        Statics.field2732.start();
                        Statics.field2732.setPriority(5);
                    }
                    class186.field2730 = 600;
                }
                this.field2745 = var2;
            }
        }
        if (this.field2745 == -1) {
            this.field2747 = true;
        }
    }

    @ObfuscatedName("gf.cl(II)I")
    public int method3178(int arg0) {
        if (this.field2709[arg0] != null) {
            return 100;
        } else if (this.field2741[arg0]) {
            return 100;
        } else {
            int var2 = this.field2738;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2882 != null && Statics.field2882.field2034 == var3) {
                var5 = Statics.field2752.field1956 * 99 / (Statics.field2752.field1955.length - Statics.field2882.field2706) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("gf.cg(I)I")
    public int method3187() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2709.length; var3++) {
            if (this.field2712[var3] > 0) {
                var1 += 100;
                var2 += this.method3178(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
