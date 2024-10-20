package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fw")
public class class169 extends class168 {

    @ObfuscatedName("fw.a")
    public class135 field2687;

    @ObfuscatedName("fw.f")
    public class135 field2683;

    @ObfuscatedName("fw.q")
    public int field2688;

    @ObfuscatedName("fw.m")
    public volatile boolean field2684 = false;

    @ObfuscatedName("fw.s")
    public boolean field2686 = false;

    @ObfuscatedName("fw.i")
    public volatile boolean[] field2692;

    @ObfuscatedName("fw.e")
    public static CRC32 field2685 = new CRC32();

    @ObfuscatedName("fw.aw")
    public int field2689;

    @ObfuscatedName("fw.an")
    public int field2690;

    @ObfuscatedName("fw.ag")
    public int field2691 = -1;

    public class169(class135 arg0, class135 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2687 = arg0;
        this.field2683 = arg1;
        this.field2688 = arg2;
        this.field2686 = arg5;
        int var8 = this.field2688;
        if (Statics.field215 == null) {
            class172.method2609((class169) null, 255, 255, 0, (byte) 0, true);
            class172.field2724[var8] = this;
        } else {
            Statics.field215.field1977 = var8 * 8 + 5;
            int var9 = Statics.field215.method2349();
            int var10 = Statics.field215.method2349();
            this.method3118(var9, var10);
        }
    }

    @ObfuscatedName("fw.cc(I)I")
    public int method3117() {
        if (this.field2684) {
            return 100;
        } else if (this.field2664 == null) {
            int var1 = this.field2688;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2100 != null && Statics.field2100.field3114 == var2) {
                var4 = Statics.field1349.field1977 * 99 / (Statics.field1349.field1983.length - Statics.field2100.field2735) + 1;
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

    @ObfuscatedName("fw.g(II)V")
    public void method3036(int arg0) {
        int var2 = this.field2688;
        long var3 = (long) ((var2 << 16) + arg0);
        class173 var5 = (class173) class172.field2716.method3538(var3);
        if (var5 != null) {
            class172.field2729.method3611(var5);
        }
    }

    @ObfuscatedName("fw.p(II)V")
    public void method3054(int arg0) {
        if (this.field2687 == null || this.field2692 == null || !this.field2692[arg0]) {
            class172.method2609(this, this.field2688, arg0, this.field2668[arg0], (byte) 2, true);
            return;
        }
        class135 var2 = this.field2687;
        byte[] var4 = null;
        class200 var5 = class171.field2705;
        synchronized (class171.field2705) {
            for (class170 var6 = (class170) class171.field2705.method3575(); var6 != null; var6 = (class170) class171.field2705.method3565()) {
                if ((long) arg0 == var6.field3114 && var6.field2696 == var2 && var6.field2699 == 0) {
                    var4 = var6.field2695;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2726(arg0);
            this.method3125(var2, arg0, var8, true);
        } else {
            this.method3125(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("fw.cl(III)V")
    public void method3118(int arg0, int arg1) {
        this.field2689 = arg0;
        this.field2690 = arg1;
        if (this.field2683 == null) {
            class172.method2609(this, 255, this.field2688, this.field2689, (byte) 0, true);
            return;
        }
        int var3 = this.field2688;
        class135 var4 = this.field2683;
        byte[] var6 = null;
        class200 var7 = class171.field2705;
        synchronized (class171.field2705) {
            for (class170 var8 = (class170) class171.field2705.method3575(); var8 != null; var8 = (class170) class171.field2705.method3565()) {
                if ((long) var3 == var8.field3114 && var8.field2696 == var4 && var8.field2699 == 0) {
                    var6 = var8.field2695;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2726(var3);
            this.method3125(var4, var3, var10, true);
        } else {
            this.method3125(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("fw.cm(I[BZZI)V")
    public void method3120(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2669[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2669[arg0];
            if (this.field2687 != null) {
                class135 var12 = this.field2687;
                class170 var13 = new class170();
                var13.field2699 = 0;
                var13.field3114 = (long) arg0;
                var13.field2695 = arg1;
                var13.field2696 = var12;
                class200 var14 = class171.field2705;
                synchronized (class171.field2705) {
                    class171.field2705.method3550(var13);
                }
                Object var16 = class171.field2707;
                synchronized (class171.field2707) {
                    if (class171.field2702 == 0) {
                        Statics.field925.method2741(new class171(), 5);
                    }
                    class171.field2702 = 600;
                }
                this.field2692[arg0] = true;
            }
            if (arg3) {
                this.field2664[arg0] = class126.method2259(arg1, false);
            }
            return;
        }
        if (this.field2684) {
            throw new RuntimeException();
        }
        if (this.field2683 != null) {
            int var5 = this.field2688;
            class135 var6 = this.field2683;
            class170 var7 = new class170();
            var7.field2699 = 0;
            var7.field3114 = (long) var5;
            var7.field2695 = arg1;
            var7.field2696 = var6;
            class200 var8 = class171.field2705;
            synchronized (class171.field2705) {
                class171.field2705.method3550(var7);
            }
            Object var10 = class171.field2707;
            synchronized (class171.field2707) {
                if (class171.field2702 == 0) {
                    Statics.field925.method2741(new class171(), 5);
                }
                class171.field2702 = 600;
            }
        }
        this.method3095(arg1);
        this.method3122();
    }

    @ObfuscatedName("fw.ci(Lel;I[BZB)V")
    public void method3125(class135 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2683 != arg0) {
            if (!arg3 && this.field2691 == arg1) {
                this.field2684 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2692[arg1] = false;
                if (this.field2686 || arg3) {
                    class172.method2609(this, this.field2688, arg1, this.field2668[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2685.reset();
            field2685.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2685.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2668[arg1] != var9 || this.field2669[arg1] != var10) {
                this.field2692[arg1] = false;
                if (this.field2686 || arg3) {
                    class172.method2609(this, this.field2688, arg1, this.field2668[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2692[arg1] = true;
            if (arg3) {
                this.field2664[arg1] = class126.method2259(arg2, false);
            }
            return;
        }
        if (this.field2684) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class172.method2609(this, 255, this.field2688, this.field2689, (byte) 0, true);
            return;
        }
        field2685.reset();
        field2685.update(arg2, 0, arg2.length);
        int var5 = (int) field2685.getValue();
        class120 var6 = new class120(class168.method2290(arg2));
        int var7 = var6.method2344();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2688 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2349();
        }
        if (this.field2689 != var5 || this.field2690 != var8) {
            class172.method2609(this, 255, this.field2688, this.field2689, (byte) 0, true);
            return;
        }
        this.method3095(arg2);
        this.method3122();
    }

    @ObfuscatedName("fw.cb(I)V")
    public void method3122() {
        this.field2692 = new boolean[this.field2664.length];
        for (int var1 = 0; var1 < this.field2692.length; var1++) {
            this.field2692[var1] = false;
        }
        if (this.field2687 == null) {
            this.field2684 = true;
            return;
        }
        this.field2691 = -1;
        for (int var2 = 0; var2 < this.field2692.length; var2++) {
            if (this.field2674[var2] > 0) {
                class135 var3 = this.field2687;
                class170 var5 = new class170();
                var5.field2699 = 1;
                var5.field3114 = (long) var2;
                var5.field2696 = var3;
                var5.field2694 = this;
                class200 var6 = class171.field2705;
                synchronized (class171.field2705) {
                    class171.field2705.method3550(var5);
                }
                class171.method2957();
                this.field2691 = var2;
            }
        }
        if (this.field2691 == -1) {
            this.field2684 = true;
        }
    }

    @ObfuscatedName("fw.cu(IS)I")
    public int method3123(int arg0) {
        if (this.field2664[arg0] != null) {
            return 100;
        } else if (this.field2692[arg0]) {
            return 100;
        } else {
            int var2 = this.field2688;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2100 != null && Statics.field2100.field3114 == var3) {
                var5 = Statics.field1349.field1977 * 99 / (Statics.field1349.field1983.length - Statics.field2100.field2735) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fw.cj(I)I")
    public int method3124() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2664.length; var3++) {
            if (this.field2674[var3] > 0) {
                var1 += 100;
                var2 += this.method3123(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
