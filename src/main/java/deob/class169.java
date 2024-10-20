package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fm")
public class class169 extends class168 {

    @ObfuscatedName("fm.w")
    public class135 field2688;

    @ObfuscatedName("fm.g")
    public class135 field2685;

    @ObfuscatedName("fm.s")
    public int field2686;

    @ObfuscatedName("fm.k")
    public volatile boolean field2690 = false;

    @ObfuscatedName("fm.o")
    public boolean field2687 = false;

    @ObfuscatedName("fm.v")
    public volatile boolean[] field2683;

    @ObfuscatedName("fm.f")
    public static CRC32 field2689 = new CRC32();

    @ObfuscatedName("fm.au")
    public int field2684;

    @ObfuscatedName("fm.aq")
    public int field2691;

    @ObfuscatedName("fm.ab")
    public int field2692 = -1;

    public class169(class135 arg0, class135 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2688 = arg0;
        this.field2685 = arg1;
        this.field2686 = arg2;
        this.field2687 = arg5;
        class172.method260(this, this.field2686);
    }

    @ObfuscatedName("fm.cr(I)I")
    public int method3100() {
        if (this.field2690) {
            return 100;
        } else if (this.field2672 == null) {
            int var1 = this.field2686;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2640 != null && Statics.field2640.field3123 == var2) {
                var4 = Statics.field1575.field1972 * 99 / (Statics.field1575.field1974.length - Statics.field2640.field2733) + 1;
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

    @ObfuscatedName("fm.h(II)V")
    public void method3038(int arg0) {
        class172.method2803(this.field2686, arg0);
    }

    @ObfuscatedName("fm.u(IB)V")
    public void method3019(int arg0) {
        if (this.field2688 == null || this.field2683 == null || !this.field2683[arg0]) {
            class172.method583(this, this.field2686, arg0, this.field2674[arg0], (byte) 2, true);
        } else {
            class171.method887(arg0, this.field2688, this);
        }
    }

    @ObfuscatedName("fm.ca(III)V")
    public void method3092(int arg0, int arg1) {
        this.field2684 = arg0;
        this.field2691 = arg1;
        if (this.field2685 == null) {
            class172.method583(this, 255, this.field2686, this.field2684, (byte) 0, true);
        } else {
            class171.method887(this.field2686, this.field2685, this);
        }
    }

    @ObfuscatedName("fm.cu(I[BZZB)V")
    public void method3093(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2690) {
                throw new RuntimeException();
            }
            if (this.field2685 != null) {
                class171.method1787(this.field2686, arg1, this.field2685);
            }
            this.method3050(arg1);
            this.method3095();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2682[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2682[arg0];
        if (this.field2688 != null) {
            class171.method1787(arg0, arg1, this.field2688);
            this.field2683[arg0] = true;
        }
        if (arg3) {
            this.field2672[arg0] = class126.method182(arg1, false);
        }
    }

    @ObfuscatedName("fm.cf(Let;I[BZI)V")
    public void method3094(class135 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2685 != arg0) {
            if (!arg3 && this.field2692 == arg1) {
                this.field2690 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2683[arg1] = false;
                if (this.field2687 || arg3) {
                    class172.method583(this, this.field2686, arg1, this.field2674[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2689.reset();
            field2689.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2689.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2674[arg1] != var9 || this.field2682[arg1] != var10) {
                this.field2683[arg1] = false;
                if (this.field2687 || arg3) {
                    class172.method583(this, this.field2686, arg1, this.field2674[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2683[arg1] = true;
            if (arg3) {
                this.field2672[arg1] = class126.method182(arg2, false);
            }
            return;
        }
        if (this.field2690) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class172.method583(this, 255, this.field2686, this.field2684, (byte) 0, true);
            return;
        }
        field2689.reset();
        field2689.update(arg2, 0, arg2.length);
        int var5 = (int) field2689.getValue();
        class120 var6 = new class120(class168.method132(arg2));
        int var7 = var6.method2361();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2686 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2366();
        }
        if (this.field2684 != var5 || this.field2691 != var8) {
            class172.method583(this, 255, this.field2686, this.field2684, (byte) 0, true);
            return;
        }
        this.method3050(arg2);
        this.method3095();
    }

    @ObfuscatedName("fm.ck(I)V")
    public void method3095() {
        this.field2683 = new boolean[this.field2672.length];
        for (int var1 = 0; var1 < this.field2683.length; var1++) {
            this.field2683[var1] = false;
        }
        if (this.field2688 == null) {
            this.field2690 = true;
            return;
        }
        this.field2692 = -1;
        for (int var2 = 0; var2 < this.field2683.length; var2++) {
            if (this.field2668[var2] > 0) {
                class135 var3 = this.field2688;
                class170 var5 = new class170();
                var5.field2695 = 1;
                var5.field3123 = (long) var2;
                var5.field2700 = var3;
                var5.field2697 = this;
                class200 var6 = class171.field2703;
                synchronized (class171.field2703) {
                    class171.field2703.method3535(var5);
                }
                class171.method2957();
                this.field2692 = var2;
            }
        }
        if (this.field2692 == -1) {
            this.field2690 = true;
        }
    }

    @ObfuscatedName("fm.cs(II)I")
    public int method3096(int arg0) {
        if (this.field2672[arg0] != null) {
            return 100;
        } else if (this.field2683[arg0]) {
            return 100;
        } else {
            int var2 = this.field2686;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2640 != null && Statics.field2640.field3123 == var3) {
                var5 = Statics.field1575.field1972 * 99 / (Statics.field1575.field1974.length - Statics.field2640.field2733) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fm.cj(I)I")
    public int method3097() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2672.length; var3++) {
            if (this.field2668[var3] > 0) {
                var1 += 100;
                var2 += this.method3096(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
