package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fn")
public class class168 extends class167 {

    @ObfuscatedName("fn.d")
    public class134 field2683;

    @ObfuscatedName("fn.a")
    public class134 field2692;

    @ObfuscatedName("fn.t")
    public int field2684;

    @ObfuscatedName("fn.k")
    public volatile boolean field2685 = false;

    @ObfuscatedName("fn.f")
    public boolean field2689 = false;

    @ObfuscatedName("fn.g")
    public volatile boolean[] field2690;

    @ObfuscatedName("fn.i")
    public static CRC32 field2688 = new CRC32();

    @ObfuscatedName("fn.ah")
    public int field2687;

    @ObfuscatedName("fn.ag")
    public int field2682;

    @ObfuscatedName("fn.ac")
    public int field2691 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2683 = arg0;
        this.field2692 = arg1;
        this.field2684 = arg2;
        this.field2689 = arg5;
        int var8 = this.field2684;
        if (Statics.field694 == null) {
            class171.method2653((class168) null, 255, 255, 0, (byte) 0, true);
            class171.field2713[var8] = this;
        } else {
            Statics.field694.field1982 = var8 * 8 + 5;
            int var9 = Statics.field694.method2365();
            int var10 = Statics.field694.method2365();
            this.method3105(var9, var10);
        }
    }

    @ObfuscatedName("fn.ct(I)I")
    public int method3123() {
        if (this.field2685) {
            return 100;
        } else if (this.field2676 == null) {
            int var1 = class171.method1785(255, this.field2684);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("fn.q(IB)V")
    public void method3019(int arg0) {
        int var2 = this.field2684;
        long var3 = (long) ((var2 << 16) + arg0);
        class172 var5 = (class172) class171.field2715.method3518(var3);
        if (var5 != null) {
            class171.field2714.method3604(var5);
        }
    }

    @ObfuscatedName("fn.h(IB)V")
    public void method3100(int arg0) {
        if (this.field2683 == null || this.field2690 == null || !this.field2690[arg0]) {
            class171.method2653(this, this.field2684, arg0, this.field2667[arg0], (byte) 2, true);
        } else {
            class170.method3689(arg0, this.field2683, this);
        }
    }

    @ObfuscatedName("fn.ch(III)V")
    public void method3105(int arg0, int arg1) {
        this.field2687 = arg0;
        this.field2682 = arg1;
        if (this.field2692 == null) {
            class171.method2653(this, 255, this.field2684, this.field2687, (byte) 0, true);
        } else {
            class170.method3689(this.field2684, this.field2692, this);
        }
    }

    @ObfuscatedName("fn.ce(I[BZZI)V")
    public void method3111(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2668[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2668[arg0];
            if (this.field2683 != null) {
                class134 var12 = this.field2683;
                class169 var13 = new class169();
                var13.field2698 = 0;
                var13.field3112 = (long) arg0;
                var13.field2694 = arg1;
                var13.field2695 = var12;
                class199 var14 = class170.field2700;
                synchronized (class170.field2700) {
                    class170.field2700.method3544(var13);
                }
                Object var16 = class170.field2701;
                synchronized (class170.field2701) {
                    if (class170.field2702 == 0) {
                        Statics.field162.method2713(new class170(), 5);
                    }
                    class170.field2702 = 600;
                }
                this.field2690[arg0] = true;
            }
            if (arg3) {
                this.field2676[arg0] = class125.method2781(arg1, false);
            }
            return;
        }
        if (this.field2685) {
            throw new RuntimeException();
        }
        if (this.field2692 != null) {
            int var5 = this.field2684;
            class134 var6 = this.field2692;
            class169 var7 = new class169();
            var7.field2698 = 0;
            var7.field3112 = (long) var5;
            var7.field2694 = arg1;
            var7.field2695 = var6;
            class199 var8 = class170.field2700;
            synchronized (class170.field2700) {
                class170.field2700.method3544(var7);
            }
            Object var10 = class170.field2701;
            synchronized (class170.field2701) {
                if (class170.field2702 == 0) {
                    Statics.field162.method2713(new class170(), 5);
                }
                class170.field2702 = 600;
            }
        }
        this.method3018(arg1);
        this.method3118();
    }

    @ObfuscatedName("fn.cm(Lei;I[BZS)V")
    public void method3106(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2692 != arg0) {
            if (!arg3 && this.field2691 == arg1) {
                this.field2685 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2690[arg1] = false;
                if (this.field2689 || arg3) {
                    class171.method2653(this, this.field2684, arg1, this.field2667[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2688.reset();
            field2688.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2688.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2667[arg1] != var9 || this.field2668[arg1] != var10) {
                this.field2690[arg1] = false;
                if (this.field2689 || arg3) {
                    class171.method2653(this, this.field2684, arg1, this.field2667[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2690[arg1] = true;
            if (arg3) {
                this.field2676[arg1] = class125.method2781(arg2, false);
            }
            return;
        }
        if (this.field2685) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class171.method2653(this, 255, this.field2684, this.field2687, (byte) 0, true);
            return;
        }
        field2688.reset();
        field2688.update(arg2, 0, arg2.length);
        int var5 = (int) field2688.getValue();
        class119 var6 = new class119(class167.method3655(arg2));
        int var7 = var6.method2360();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2684 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2365();
        }
        if (this.field2687 != var5 || this.field2682 != var8) {
            class171.method2653(this, 255, this.field2684, this.field2687, (byte) 0, true);
            return;
        }
        this.method3018(arg2);
        this.method3118();
    }

    @ObfuscatedName("fn.cp(B)V")
    public void method3118() {
        this.field2690 = new boolean[this.field2676.length];
        for (int var1 = 0; var1 < this.field2690.length; var1++) {
            this.field2690[var1] = false;
        }
        if (this.field2683 == null) {
            this.field2685 = true;
            return;
        }
        this.field2691 = -1;
        for (int var2 = 0; var2 < this.field2690.length; var2++) {
            if (this.field2669[var2] > 0) {
                class170.method2045(var2, this.field2683, this);
                this.field2691 = var2;
            }
        }
        if (this.field2691 == -1) {
            this.field2685 = true;
        }
    }

    @ObfuscatedName("fn.cf(IB)I")
    public int method3107(int arg0) {
        if (this.field2676[arg0] == null) {
            return this.field2690[arg0] ? 100 : class171.method1785(this.field2684, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fn.cq(I)I")
    public int method3108() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2676.length; var3++) {
            if (this.field2669[var3] > 0) {
                var1 += 100;
                var2 += this.method3107(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
