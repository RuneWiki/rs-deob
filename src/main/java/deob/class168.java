package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fd")
public class class168 extends class167 {

    @ObfuscatedName("fd.y")
    public class134 field2686;

    @ObfuscatedName("fd.x")
    public class134 field2688;

    @ObfuscatedName("fd.n")
    public int field2676;

    @ObfuscatedName("fd.v")
    public volatile boolean field2687 = false;

    @ObfuscatedName("fd.s")
    public boolean field2680 = false;

    @ObfuscatedName("fd.w")
    public volatile boolean[] field2681;

    @ObfuscatedName("fd.p")
    public static CRC32 field2682 = new CRC32();

    @ObfuscatedName("fd.ao")
    public int field2683;

    @ObfuscatedName("fd.ae")
    public int field2684;

    @ObfuscatedName("fd.ay")
    public int field2685 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2686 = arg0;
        this.field2688 = arg1;
        this.field2676 = arg2;
        this.field2680 = arg5;
        int var8 = this.field2676;
        if (Statics.field1988 == null) {
            class171.method531((class168) null, 255, 255, 0, (byte) 0, true);
            class171.field2706[var8] = this;
        } else {
            Statics.field1988.field1949 = var8 * 8 + 5;
            int var9 = Statics.field1988.method2415();
            int var10 = Statics.field1988.method2415();
            this.method3128(var9, var10);
        }
    }

    @ObfuscatedName("fd.cz(B)I")
    public int method3129() {
        if (this.field2687) {
            return 100;
        } else if (this.field2657 == null) {
            int var1 = class171.method2617(255, this.field2676);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("fd.h(II)V")
    public void method3121(int arg0) {
        class171.method2766(this.field2676, arg0);
    }

    @ObfuscatedName("fd.i(IB)V")
    public void method3123(int arg0) {
        if (this.field2686 == null || this.field2681 == null || !this.field2681[arg0]) {
            class171.method531(this, this.field2676, arg0, this.field2661[arg0], (byte) 2, true);
        } else {
            class170.method2212(arg0, this.field2686, this);
        }
    }

    @ObfuscatedName("fd.cw(IIB)V")
    public void method3128(int arg0, int arg1) {
        this.field2683 = arg0;
        this.field2684 = arg1;
        if (this.field2688 == null) {
            class171.method531(this, 255, this.field2676, this.field2683, (byte) 0, true);
        } else {
            class170.method2212(this.field2676, this.field2688, this);
        }
    }

    @ObfuscatedName("fd.cy(I[BZZB)V")
    public void method3131(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2687) {
                throw new RuntimeException();
            }
            if (this.field2688 != null) {
                class170.method690(this.field2676, arg1, this.field2688);
            }
            this.method3047(arg1);
            this.method3139();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2662[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2662[arg0];
        if (this.field2686 != null) {
            class170.method690(arg0, arg1, this.field2686);
            this.field2681[arg0] = true;
        }
        if (arg3) {
            this.field2657[arg0] = class125.method1526(arg1, false);
        }
    }

    @ObfuscatedName("fd.cb(Lel;I[BZI)V")
    public void method3132(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2688 != arg0) {
            if (!arg3 && this.field2685 == arg1) {
                this.field2687 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2681[arg1] = false;
                if (this.field2680 || arg3) {
                    class171.method531(this, this.field2676, arg1, this.field2661[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2682.reset();
            field2682.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2682.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2661[arg1] != var9 || this.field2662[arg1] != var10) {
                this.field2681[arg1] = false;
                if (this.field2680 || arg3) {
                    class171.method531(this, this.field2676, arg1, this.field2661[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2681[arg1] = true;
            if (arg3) {
                this.field2657[arg1] = class125.method1526(arg2, false);
            }
            return;
        }
        if (this.field2687) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class171.method531(this, 255, this.field2676, this.field2683, (byte) 0, true);
            return;
        }
        field2682.reset();
        field2682.update(arg2, 0, arg2.length);
        int var5 = (int) field2682.getValue();
        class119 var6 = new class119(class167.method808(arg2));
        int var7 = var6.method2330();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2676 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2415();
        }
        if (this.field2683 != var5 || this.field2684 != var8) {
            class171.method531(this, 255, this.field2676, this.field2683, (byte) 0, true);
            return;
        }
        this.method3047(arg2);
        this.method3139();
    }

    @ObfuscatedName("fd.cs(B)V")
    public void method3139() {
        this.field2681 = new boolean[this.field2657.length];
        for (int var1 = 0; var1 < this.field2681.length; var1++) {
            this.field2681[var1] = false;
        }
        if (this.field2686 == null) {
            this.field2687 = true;
            return;
        }
        this.field2685 = -1;
        for (int var2 = 0; var2 < this.field2681.length; var2++) {
            if (this.field2667[var2] > 0) {
                class134 var3 = this.field2686;
                class169 var5 = new class169();
                var5.field2694 = 1;
                var5.field3111 = (long) var2;
                var5.field2691 = var3;
                var5.field2693 = this;
                class199 var6 = class170.field2700;
                synchronized (class170.field2700) {
                    class170.field2700.method3588(var5);
                }
                class170.method3166();
                this.field2685 = var2;
            }
        }
        if (this.field2685 == -1) {
            this.field2687 = true;
        }
    }

    @ObfuscatedName("fd.cv(II)I")
    public int method3134(int arg0) {
        if (this.field2657[arg0] == null) {
            return this.field2681[arg0] ? 100 : class171.method2617(this.field2676, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fd.cr(I)I")
    public int method3135() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2657.length; var3++) {
            if (this.field2667[var3] > 0) {
                var1 += 100;
                var2 += this.method3134(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
