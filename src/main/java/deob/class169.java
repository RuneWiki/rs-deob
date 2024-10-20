package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fe")
public class class169 extends class168 {

    @ObfuscatedName("fe.n")
    public class135 field2730;

    @ObfuscatedName("fe.q")
    public class135 field2720;

    @ObfuscatedName("fe.x")
    public int field2722;

    @ObfuscatedName("fe.v")
    public volatile boolean field2723 = false;

    @ObfuscatedName("fe.m")
    public boolean field2721 = false;

    @ObfuscatedName("fe.w")
    public volatile boolean[] field2725;

    @ObfuscatedName("fe.e")
    public static CRC32 field2726 = new CRC32();

    @ObfuscatedName("fe.ad")
    public int field2724;

    @ObfuscatedName("fe.as")
    public int field2728;

    @ObfuscatedName("fe.ag")
    public int field2729 = -1;

    public class169(class135 arg0, class135 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2730 = arg0;
        this.field2720 = arg1;
        this.field2722 = arg2;
        this.field2721 = arg5;
        class172.method100(this, this.field2722);
    }

    @ObfuscatedName("fe.cc(I)I")
    public int method3099() {
        if (this.field2723) {
            return 100;
        } else if (this.field2705 == null) {
            int var1 = this.field2722;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2760 != null && Statics.field2760.field3126 == var2) {
                var4 = Statics.field2202.field2001 * 99 / (Statics.field2202.field2002.length - Statics.field2760.field2764) + 1;
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

    @ObfuscatedName("fe.i(IB)V")
    public void method2999(int arg0) {
        int var2 = this.field2722;
        long var3 = (long) ((var2 << 16) + arg0);
        class173 var5 = (class173) class172.field2749.method3485(var3);
        if (var5 != null) {
            class172.field2748.method3568(var5);
        }
    }

    @ObfuscatedName("fe.y(II)V")
    public void method3009(int arg0) {
        if (this.field2730 == null || this.field2725 == null || !this.field2725[arg0]) {
            class172.method2589(this, this.field2722, arg0, this.field2708[arg0], (byte) 2, true);
            return;
        }
        class135 var2 = this.field2730;
        byte[] var4 = null;
        class200 var5 = class171.field2739;
        synchronized (class171.field2739) {
            for (class170 var6 = (class170) class171.field2739.method3534(); var6 != null; var6 = (class170) class171.field2739.method3516()) {
                if ((long) arg0 == var6.field3126 && var6.field2733 == var2 && var6.field2734 == 0) {
                    var4 = var6.field2732;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2666(arg0);
            this.method3089(var2, arg0, var8, true);
        } else {
            this.method3089(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("fe.cm(III)V")
    public void method3087(int arg0, int arg1) {
        this.field2724 = arg0;
        this.field2728 = arg1;
        if (this.field2720 == null) {
            class172.method2589(this, 255, this.field2722, this.field2724, (byte) 0, true);
            return;
        }
        int var3 = this.field2722;
        class135 var4 = this.field2720;
        byte[] var6 = null;
        class200 var7 = class171.field2739;
        synchronized (class171.field2739) {
            for (class170 var8 = (class170) class171.field2739.method3534(); var8 != null; var8 = (class170) class171.field2739.method3516()) {
                if ((long) var3 == var8.field3126 && var8.field2733 == var4 && var8.field2734 == 0) {
                    var6 = var8.field2732;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2666(var3);
            this.method3089(var4, var3, var10, true);
        } else {
            this.method3089(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("fe.cy(I[BZZB)V")
    public void method3088(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2723) {
                throw new RuntimeException();
            }
            if (this.field2720 != null) {
                class171.method3104(this.field2722, arg1, this.field2720);
            }
            this.method3078(arg1);
            this.method3090();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2717[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2717[arg0];
        if (this.field2730 != null) {
            class171.method3104(arg0, arg1, this.field2730);
            this.field2725[arg0] = true;
        }
        if (arg3) {
            this.field2705[arg0] = class126.method2231(arg1, false);
        }
    }

    @ObfuscatedName("fe.cr(Lef;I[BZB)V")
    public void method3089(class135 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2720 != arg0) {
            if (!arg3 && this.field2729 == arg1) {
                this.field2723 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2725[arg1] = false;
                if (this.field2721 || arg3) {
                    class172.method2589(this, this.field2722, arg1, this.field2708[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2726.reset();
            field2726.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2726.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2708[arg1] != var9 || this.field2717[arg1] != var10) {
                this.field2725[arg1] = false;
                if (this.field2721 || arg3) {
                    class172.method2589(this, this.field2722, arg1, this.field2708[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2725[arg1] = true;
            if (arg3) {
                this.field2705[arg1] = class126.method2231(arg2, false);
            }
            return;
        }
        if (this.field2723) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class172.method2589(this, 255, this.field2722, this.field2724, (byte) 0, true);
            return;
        }
        field2726.reset();
        field2726.update(arg2, 0, arg2.length);
        int var5 = (int) field2726.getValue();
        class120 var6 = new class120(class168.method2737(arg2));
        int var7 = var6.method2334();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2722 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2345();
        }
        if (this.field2724 != var5 || this.field2728 != var8) {
            class172.method2589(this, 255, this.field2722, this.field2724, (byte) 0, true);
            return;
        }
        this.method3078(arg2);
        this.method3090();
    }

    @ObfuscatedName("fe.cx(I)V")
    public void method3090() {
        this.field2725 = new boolean[this.field2705.length];
        for (int var1 = 0; var1 < this.field2725.length; var1++) {
            this.field2725[var1] = false;
        }
        if (this.field2730 == null) {
            this.field2723 = true;
            return;
        }
        this.field2729 = -1;
        for (int var2 = 0; var2 < this.field2725.length; var2++) {
            if (this.field2703[var2] > 0) {
                class135 var3 = this.field2730;
                class170 var5 = new class170();
                var5.field2734 = 1;
                var5.field3126 = (long) var2;
                var5.field2733 = var3;
                var5.field2735 = this;
                class200 var6 = class171.field2739;
                synchronized (class171.field2739) {
                    class171.field2739.method3508(var5);
                }
                class171.method1906();
                this.field2729 = var2;
            }
        }
        if (this.field2729 == -1) {
            this.field2723 = true;
        }
    }

    @ObfuscatedName("fe.cu(II)I")
    public int method3091(int arg0) {
        if (this.field2705[arg0] != null) {
            return 100;
        } else if (this.field2725[arg0]) {
            return 100;
        } else {
            int var2 = this.field2722;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2760 != null && Statics.field2760.field3126 == var3) {
                var5 = Statics.field2202.field2001 * 99 / (Statics.field2202.field2002.length - Statics.field2760.field2764) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fe.cw(I)I")
    public int method3092() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2705.length; var3++) {
            if (this.field2703[var3] > 0) {
                var1 += 100;
                var2 += this.method3091(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
