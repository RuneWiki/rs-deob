package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fn")
public class class169 extends class168 {

    @ObfuscatedName("fn.h")
    public class135 field2712;

    @ObfuscatedName("fn.k")
    public class135 field2718;

    @ObfuscatedName("fn.f")
    public int field2711;

    @ObfuscatedName("fn.r")
    public volatile boolean field2720 = false;

    @ObfuscatedName("fn.n")
    public boolean field2713 = false;

    @ObfuscatedName("fn.g")
    public volatile boolean[] field2714;

    @ObfuscatedName("fn.b")
    public static CRC32 field2715 = new CRC32();

    @ObfuscatedName("fn.af")
    public int field2716;

    @ObfuscatedName("fn.am")
    public int field2717;

    @ObfuscatedName("fn.ar")
    public int field2710 = -1;

    public class169(class135 arg0, class135 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2712 = arg0;
        this.field2718 = arg1;
        this.field2711 = arg2;
        this.field2713 = arg5;
        class172.method3054(this, this.field2711);
    }

    @ObfuscatedName("fn.bk(B)I")
    public int method3153() {
        if (this.field2720) {
            return 100;
        } else if (this.field2699 == null) {
            int var1 = this.field2711;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field591 != null && Statics.field591.field3124 == var2) {
                var4 = Statics.field214.field2012 * 99 / (Statics.field214.field2013.length - Statics.field591.field2757) + 1;
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

    @ObfuscatedName("fn.x(II)V")
    public void method3080(int arg0) {
        class172.method2972(this.field2711, arg0);
    }

    @ObfuscatedName("fn.z(IB)V")
    public void method3088(int arg0) {
        if (this.field2712 == null || this.field2714 == null || !this.field2714[arg0]) {
            class172.method3015(this, this.field2711, arg0, this.field2708[arg0], (byte) 2, true);
        } else {
            class171.method2057(arg0, this.field2712, this);
        }
    }

    @ObfuscatedName("fn.bq(IIB)V")
    public void method3155(int arg0, int arg1) {
        this.field2716 = arg0;
        this.field2717 = arg1;
        if (this.field2718 == null) {
            class172.method3015(this, 255, this.field2711, this.field2716, (byte) 0, true);
        } else {
            class171.method2057(this.field2711, this.field2718, this);
        }
    }

    @ObfuscatedName("fn.by(I[BZZI)V")
    public void method3156(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2720) {
                throw new RuntimeException();
            }
            if (this.field2718 != null) {
                class171.method2683(this.field2711, arg1, this.field2718);
            }
            this.method3100(arg1);
            this.method3157();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2700[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2700[arg0];
        if (this.field2712 != null) {
            class171.method2683(arg0, arg1, this.field2712);
            this.field2714[arg0] = true;
        }
        if (arg3) {
            this.field2699[arg0] = class126.method2294(arg1, false);
        }
    }

    @ObfuscatedName("fn.br(Lel;I[BZI)V")
    public void method3158(class135 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2718 != arg0) {
            if (!arg3 && this.field2710 == arg1) {
                this.field2720 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2714[arg1] = false;
                if (this.field2713 || arg3) {
                    class172.method3015(this, this.field2711, arg1, this.field2708[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2715.reset();
            field2715.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2715.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2708[arg1] != var9 || this.field2700[arg1] != var10) {
                this.field2714[arg1] = false;
                if (this.field2713 || arg3) {
                    class172.method3015(this, this.field2711, arg1, this.field2708[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2714[arg1] = true;
            if (arg3) {
                this.field2699[arg1] = class126.method2294(arg2, false);
            }
            return;
        }
        if (this.field2720) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class172.method3015(this, 255, this.field2711, this.field2716, (byte) 0, true);
            return;
        }
        field2715.reset();
        field2715.update(arg2, 0, arg2.length);
        int var5 = (int) field2715.getValue();
        class120 var6 = new class120(class168.method1956(arg2));
        int var7 = var6.method2363();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2711 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2368();
        }
        if (this.field2716 != var5 || this.field2717 != var8) {
            class172.method3015(this, 255, this.field2711, this.field2716, (byte) 0, true);
            return;
        }
        this.method3100(arg2);
        this.method3157();
    }

    @ObfuscatedName("fn.bt(I)V")
    public void method3157() {
        this.field2714 = new boolean[this.field2699.length];
        for (int var1 = 0; var1 < this.field2714.length; var1++) {
            this.field2714[var1] = false;
        }
        if (this.field2712 == null) {
            this.field2720 = true;
            return;
        }
        this.field2710 = -1;
        for (int var2 = 0; var2 < this.field2714.length; var2++) {
            if (this.field2701[var2] > 0) {
                class135 var3 = this.field2712;
                class170 var5 = new class170();
                var5.field2724 = 1;
                var5.field3124 = (long) var2;
                var5.field2723 = var3;
                var5.field2721 = this;
                class200 var6 = class171.field2730;
                synchronized (class171.field2730) {
                    class171.field2730.method3583(var5);
                }
                Object var8 = class171.field2727;
                synchronized (class171.field2727) {
                    if (class171.field2729 == 0) {
                        Statics.field2037.method2739(new class171(), 5);
                    }
                    class171.field2729 = 600;
                }
                this.field2710 = var2;
            }
        }
        if (this.field2710 == -1) {
            this.field2720 = true;
        }
    }

    @ObfuscatedName("fn.cv(II)I")
    public int method3152(int arg0) {
        if (this.field2699[arg0] != null) {
            return 100;
        } else if (this.field2714[arg0]) {
            return 100;
        } else {
            int var2 = this.field2711;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field591 != null && Statics.field591.field3124 == var3) {
                var5 = Statics.field214.field2012 * 99 / (Statics.field214.field2013.length - Statics.field591.field2757) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fn.cs(I)I")
    public int method3159() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2699.length; var3++) {
            if (this.field2701[var3] > 0) {
                var1 += 100;
                var2 += this.method3152(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
