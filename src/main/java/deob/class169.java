package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fb")
public class class169 extends class168 {

    @ObfuscatedName("fb.h")
    public class135 field2694;

    @ObfuscatedName("fb.s")
    public class135 field2684;

    @ObfuscatedName("fb.f")
    public int field2686;

    @ObfuscatedName("fb.b")
    public volatile boolean field2687 = false;

    @ObfuscatedName("fb.l")
    public boolean field2688 = false;

    @ObfuscatedName("fb.o")
    public volatile boolean[] field2685;

    @ObfuscatedName("fb.v")
    public static CRC32 field2690 = new CRC32();

    @ObfuscatedName("fb.ad")
    public int field2689;

    @ObfuscatedName("fb.ar")
    public int field2692;

    @ObfuscatedName("fb.ah")
    public int field2693 = -1;

    public class169(class135 arg0, class135 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2694 = arg0;
        this.field2684 = arg1;
        this.field2686 = arg2;
        this.field2688 = arg5;
        int var8 = this.field2686;
        if (Statics.field172 == null) {
            class172.method2142((class169) null, 255, 255, 0, (byte) 0, true);
            class172.field2723[var8] = this;
        } else {
            Statics.field172.field1993 = var8 * 8 + 5;
            int var9 = Statics.field172.method2467();
            int var10 = Statics.field172.method2467();
            this.method3229(var9, var10);
        }
    }

    @ObfuscatedName("fb.cd(I)I")
    public int method3224() {
        if (this.field2687) {
            return 100;
        } else if (this.field2667 == null) {
            int var1 = this.field2686;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2033 != null && Statics.field2033.field3126 == var2) {
                var4 = Statics.field2717.field1993 * 99 / (Statics.field2717.field1994.length - Statics.field2033.field2741) + 1;
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

    @ObfuscatedName("fb.w(II)V")
    public void method3146(int arg0) {
        int var2 = this.field2686;
        long var3 = (long) ((var2 << 16) + arg0);
        class173 var5 = (class173) class172.field2722.method3607(var3);
        if (var5 != null) {
            class172.field2721.method3703(var5);
        }
    }

    @ObfuscatedName("fb.e(II)V")
    public void method3179(int arg0) {
        if (this.field2694 == null || this.field2685 == null || !this.field2685[arg0]) {
            class172.method2142(this, this.field2686, arg0, this.field2664[arg0], (byte) 2, true);
        } else {
            class171.method192(arg0, this.field2694, this);
        }
    }

    @ObfuscatedName("fb.cu(III)V")
    public void method3229(int arg0, int arg1) {
        this.field2689 = arg0;
        this.field2692 = arg1;
        if (this.field2684 == null) {
            class172.method2142(this, 255, this.field2686, this.field2689, (byte) 0, true);
        } else {
            class171.method192(this.field2686, this.field2684, this);
        }
    }

    @ObfuscatedName("fb.cg(I[BZZI)V")
    public void method3227(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2665[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2665[arg0];
            if (this.field2694 != null) {
                class135 var10 = this.field2694;
                class170 var11 = new class170();
                var11.field2699 = 0;
                var11.field3126 = (long) arg0;
                var11.field2696 = arg1;
                var11.field2700 = var10;
                class200 var12 = class171.field2708;
                synchronized (class171.field2708) {
                    class171.field2708.method3639(var11);
                }
                class171.method223();
                this.field2685[arg0] = true;
            }
            if (arg3) {
                this.field2667[arg0] = class126.method2124(arg1, false);
            }
            return;
        }
        if (this.field2687) {
            throw new RuntimeException();
        }
        if (this.field2684 != null) {
            int var5 = this.field2686;
            class135 var6 = this.field2684;
            class170 var7 = new class170();
            var7.field2699 = 0;
            var7.field3126 = (long) var5;
            var7.field2696 = arg1;
            var7.field2700 = var6;
            class200 var8 = class171.field2708;
            synchronized (class171.field2708) {
                class171.field2708.method3639(var7);
            }
            class171.method223();
        }
        this.method3145(arg1);
        this.method3223();
    }

    @ObfuscatedName("fb.cv(Lec;I[BZI)V")
    public void method3228(class135 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2684 != arg0) {
            if (!arg3 && this.field2693 == arg1) {
                this.field2687 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2685[arg1] = false;
                if (this.field2688 || arg3) {
                    class172.method2142(this, this.field2686, arg1, this.field2664[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2690.reset();
            field2690.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2690.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2664[arg1] != var9 || this.field2665[arg1] != var10) {
                this.field2685[arg1] = false;
                if (this.field2688 || arg3) {
                    class172.method2142(this, this.field2686, arg1, this.field2664[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2685[arg1] = true;
            if (arg3) {
                this.field2667[arg1] = class126.method2124(arg2, false);
            }
            return;
        }
        if (this.field2687) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class172.method2142(this, 255, this.field2686, this.field2689, (byte) 0, true);
            return;
        }
        field2690.reset();
        field2690.update(arg2, 0, arg2.length);
        int var5 = (int) field2690.getValue();
        class120 var6 = new class120(class168.method2383(arg2));
        int var7 = var6.method2462();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2686 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2467();
        }
        if (this.field2689 != var5 || this.field2692 != var8) {
            class172.method2142(this, 255, this.field2686, this.field2689, (byte) 0, true);
            return;
        }
        this.method3145(arg2);
        this.method3223();
    }

    @ObfuscatedName("fb.ce(I)V")
    public void method3223() {
        this.field2685 = new boolean[this.field2667.length];
        for (int var1 = 0; var1 < this.field2685.length; var1++) {
            this.field2685[var1] = false;
        }
        if (this.field2694 == null) {
            this.field2687 = true;
            return;
        }
        this.field2693 = -1;
        for (int var2 = 0; var2 < this.field2685.length; var2++) {
            if (this.field2668[var2] > 0) {
                class135 var3 = this.field2694;
                class170 var5 = new class170();
                var5.field2699 = 1;
                var5.field3126 = (long) var2;
                var5.field2700 = var3;
                var5.field2698 = this;
                class200 var6 = class171.field2708;
                synchronized (class171.field2708) {
                    class171.field2708.method3639(var5);
                }
                class171.method223();
                this.field2693 = var2;
            }
        }
        if (this.field2693 == -1) {
            this.field2687 = true;
        }
    }

    @ObfuscatedName("fb.cr(II)I")
    public int method3230(int arg0) {
        if (this.field2667[arg0] != null) {
            return 100;
        } else if (this.field2685[arg0]) {
            return 100;
        } else {
            int var2 = this.field2686;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2033 != null && Statics.field2033.field3126 == var3) {
                var5 = Statics.field2717.field1993 * 99 / (Statics.field2717.field1994.length - Statics.field2033.field2741) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fb.ct(I)I")
    public int method3231() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2667.length; var3++) {
            if (this.field2668[var3] > 0) {
                var1 += 100;
                var2 += this.method3230(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
