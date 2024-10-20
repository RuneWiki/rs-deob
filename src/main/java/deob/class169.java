package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fg")
public class class169 extends class168 {

    @ObfuscatedName("fg.w")
    public class135 field2699;

    @ObfuscatedName("fg.g")
    public class135 field2700;

    @ObfuscatedName("fg.y")
    public int field2701;

    @ObfuscatedName("fg.f")
    public volatile boolean field2702 = false;

    @ObfuscatedName("fg.q")
    public boolean field2710 = false;

    @ObfuscatedName("fg.n")
    public volatile boolean[] field2704;

    @ObfuscatedName("fg.v")
    public static CRC32 field2705 = new CRC32();

    @ObfuscatedName("fg.ab")
    public int field2706;

    @ObfuscatedName("fg.ad")
    public int field2707;

    @ObfuscatedName("fg.an")
    public int field2708 = -1;

    public class169(class135 arg0, class135 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2699 = arg0;
        this.field2700 = arg1;
        this.field2701 = arg2;
        this.field2710 = arg5;
        int var8 = this.field2701;
        if (Statics.field2743 == null) {
            class172.method2021((class169) null, 255, 255, 0, (byte) 0, true);
            class172.field2747[var8] = this;
        } else {
            Statics.field2743.field2006 = var8 * 8 + 5;
            int var9 = Statics.field2743.method2343();
            int var10 = Statics.field2743.method2343();
            this.method3086(var9, var10);
        }
    }

    @ObfuscatedName("fg.bp(I)I")
    public int method3096() {
        if (this.field2702) {
            return 100;
        } else if (this.field2688 == null) {
            int var1 = this.field2701;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2046 != null && Statics.field2046.field3126 == var2) {
                var4 = Statics.field2736.field2006 * 99 / (Statics.field2736.field2008.length - Statics.field2046.field2751) + 1;
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

    @ObfuscatedName("fg.j(II)V")
    public void method3023(int arg0) {
        int var2 = this.field2701;
        long var3 = (long) ((var2 << 16) + arg0);
        class173 var5 = (class173) class172.field2735.method3518(var3);
        if (var5 != null) {
            class172.field2744.method3602(var5);
        }
    }

    @ObfuscatedName("fg.l(IS)V")
    public void method3031(int arg0) {
        if (this.field2699 == null || this.field2704 == null || !this.field2704[arg0]) {
            class172.method2021(this, this.field2701, arg0, this.field2685[arg0], (byte) 2, true);
        } else {
            class171.method194(arg0, this.field2699, this);
        }
    }

    @ObfuscatedName("fg.bl(IIB)V")
    public void method3086(int arg0, int arg1) {
        this.field2706 = arg0;
        this.field2707 = arg1;
        if (this.field2700 == null) {
            class172.method2021(this, 255, this.field2701, this.field2706, (byte) 0, true);
        } else {
            class171.method194(this.field2701, this.field2700, this);
        }
    }

    @ObfuscatedName("fg.bm(I[BZZI)V")
    public void method3087(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2683[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2683[arg0];
            if (this.field2699 != null) {
                class135 var12 = this.field2699;
                class170 var13 = new class170();
                var13.field2713 = 0;
                var13.field3126 = (long) arg0;
                var13.field2715 = arg1;
                var13.field2714 = var12;
                class200 var14 = class171.field2723;
                synchronized (class171.field2723) {
                    class171.field2723.method3548(var13);
                }
                Object var16 = class171.field2724;
                synchronized (class171.field2724) {
                    if (class171.field2722 == 0) {
                        Statics.field879.method2704(new class171(), 5);
                    }
                    class171.field2722 = 600;
                }
                this.field2704[arg0] = true;
            }
            if (arg3) {
                this.field2688[arg0] = class126.method2908(arg1, false);
            }
            return;
        }
        if (this.field2702) {
            throw new RuntimeException();
        }
        if (this.field2700 != null) {
            int var5 = this.field2701;
            class135 var6 = this.field2700;
            class170 var7 = new class170();
            var7.field2713 = 0;
            var7.field3126 = (long) var5;
            var7.field2715 = arg1;
            var7.field2714 = var6;
            class200 var8 = class171.field2723;
            synchronized (class171.field2723) {
                class171.field2723.method3548(var7);
            }
            Object var10 = class171.field2724;
            synchronized (class171.field2724) {
                if (class171.field2722 == 0) {
                    Statics.field879.method2704(new class171(), 5);
                }
                class171.field2722 = 600;
            }
        }
        this.method3054(arg1);
        this.method3089();
    }

    @ObfuscatedName("fg.bo(Lev;I[BZB)V")
    public void method3105(class135 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2700 != arg0) {
            if (!arg3 && this.field2708 == arg1) {
                this.field2702 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2704[arg1] = false;
                if (this.field2710 || arg3) {
                    class172.method2021(this, this.field2701, arg1, this.field2685[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2705.reset();
            field2705.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2705.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2685[arg1] != var9 || this.field2683[arg1] != var10) {
                this.field2704[arg1] = false;
                if (this.field2710 || arg3) {
                    class172.method2021(this, this.field2701, arg1, this.field2685[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2704[arg1] = true;
            if (arg3) {
                this.field2688[arg1] = class126.method2908(arg2, false);
            }
            return;
        }
        if (this.field2702) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class172.method2021(this, 255, this.field2701, this.field2706, (byte) 0, true);
            return;
        }
        field2705.reset();
        field2705.update(arg2, 0, arg2.length);
        int var5 = (int) field2705.getValue();
        class120 var6 = new class120(class168.method200(arg2));
        int var7 = var6.method2338();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2701 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2343();
        }
        if (this.field2706 != var5 || this.field2707 != var8) {
            class172.method2021(this, 255, this.field2701, this.field2706, (byte) 0, true);
            return;
        }
        this.method3054(arg2);
        this.method3089();
    }

    @ObfuscatedName("fg.cs(I)V")
    public void method3089() {
        this.field2704 = new boolean[this.field2688.length];
        for (int var1 = 0; var1 < this.field2704.length; var1++) {
            this.field2704[var1] = false;
        }
        if (this.field2699 == null) {
            this.field2702 = true;
            return;
        }
        this.field2708 = -1;
        for (int var2 = 0; var2 < this.field2704.length; var2++) {
            if (this.field2697[var2] > 0) {
                class171.method169(var2, this.field2699, this);
                this.field2708 = var2;
            }
        }
        if (this.field2708 == -1) {
            this.field2702 = true;
        }
    }

    @ObfuscatedName("fg.cm(IB)I")
    public int method3090(int arg0) {
        if (this.field2688[arg0] == null) {
            return this.field2704[arg0] ? 100 : class172.method1546(this.field2701, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fg.cj(I)I")
    public int method3106() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2688.length; var3++) {
            if (this.field2697[var3] > 0) {
                var1 += 100;
                var2 += this.method3090(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
