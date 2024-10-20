package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fn")
public class class168 extends class167 {

    @ObfuscatedName("fn.x")
    public class134 field2680;

    @ObfuscatedName("fn.d")
    public class134 field2679;

    @ObfuscatedName("fn.p")
    public int field2677;

    @ObfuscatedName("fn.q")
    public volatile boolean field2678 = false;

    @ObfuscatedName("fn.w")
    public boolean field2675 = false;

    @ObfuscatedName("fn.k")
    public volatile boolean[] field2682;

    @ObfuscatedName("fn.o")
    public static CRC32 field2676 = new CRC32();

    @ObfuscatedName("fn.ad")
    public int field2681;

    @ObfuscatedName("fn.at")
    public int field2683;

    @ObfuscatedName("fn.aw")
    public int field2684 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2680 = arg0;
        this.field2679 = arg1;
        this.field2677 = arg2;
        this.field2675 = arg5;
        class171.method944(this, this.field2677);
    }

    @ObfuscatedName("fn.cy(I)I")
    public int method3130() {
        if (this.field2678) {
            return 100;
        } else if (this.field2667 == null) {
            int var1 = this.field2677;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1869 != null && Statics.field1869.field3112 == var2) {
                var4 = Statics.field1389.field1980 * 99 / (Statics.field1389.field1981.length - Statics.field1869.field2729) + 1;
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

    @ObfuscatedName("fn.r(II)V")
    public void method3024(int arg0) {
        int var2 = this.field2677;
        long var3 = (long) ((var2 << 16) + arg0);
        class172 var5 = (class172) class171.field2719.method3539(var3);
        if (var5 != null) {
            class171.field2710.method3624(var5);
        }
    }

    @ObfuscatedName("fn.l(IS)V")
    public void method3033(int arg0) {
        if (this.field2680 == null || this.field2682 == null || !this.field2682[arg0]) {
            class171.method125(this, this.field2677, arg0, this.field2657[arg0], (byte) 2, true);
        } else {
            class170.method2736(arg0, this.field2680, this);
        }
    }

    @ObfuscatedName("fn.cf(III)V")
    public void method3119(int arg0, int arg1) {
        this.field2681 = arg0;
        this.field2683 = arg1;
        if (this.field2679 == null) {
            class171.method125(this, 255, this.field2677, this.field2681, (byte) 0, true);
        } else {
            class170.method2736(this.field2677, this.field2679, this);
        }
    }

    @ObfuscatedName("fn.co(I[BZZB)V")
    public void method3129(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2662[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2662[arg0];
            if (this.field2680 != null) {
                class134 var10 = this.field2680;
                class169 var11 = new class169();
                var11.field2689 = 0;
                var11.field3112 = (long) arg0;
                var11.field2688 = arg1;
                var11.field2690 = var10;
                class199 var12 = class170.field2697;
                synchronized (class170.field2697) {
                    class170.field2697.method3570(var11);
                }
                class170.method2282();
                this.field2682[arg0] = true;
            }
            if (arg3) {
                this.field2667[arg0] = class125.method52(arg1, false);
            }
            return;
        }
        if (this.field2678) {
            throw new RuntimeException();
        }
        if (this.field2679 != null) {
            int var5 = this.field2677;
            class134 var6 = this.field2679;
            class169 var7 = new class169();
            var7.field2689 = 0;
            var7.field3112 = (long) var5;
            var7.field2688 = arg1;
            var7.field2690 = var6;
            class199 var8 = class170.field2697;
            synchronized (class170.field2697) {
                class170.field2697.method3570(var7);
            }
            class170.method2282();
        }
        this.method3105(arg1);
        this.method3122();
    }

    @ObfuscatedName("fn.cn(Lei;I[BZI)V")
    public void method3121(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2679 != arg0) {
            if (!arg3 && this.field2684 == arg1) {
                this.field2678 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2682[arg1] = false;
                if (this.field2675 || arg3) {
                    class171.method125(this, this.field2677, arg1, this.field2657[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2676.reset();
            field2676.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2676.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2657[arg1] != var9 || this.field2662[arg1] != var10) {
                this.field2682[arg1] = false;
                if (this.field2675 || arg3) {
                    class171.method125(this, this.field2677, arg1, this.field2657[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2682[arg1] = true;
            if (arg3) {
                this.field2667[arg1] = class125.method52(arg2, false);
            }
            return;
        }
        if (this.field2678) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class171.method125(this, 255, this.field2677, this.field2681, (byte) 0, true);
            return;
        }
        field2676.reset();
        field2676.update(arg2, 0, arg2.length);
        int var5 = (int) field2676.getValue();
        class119 var6 = new class119(class167.method2909(arg2));
        int var7 = var6.method2412();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2677 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2350();
        }
        if (this.field2681 != var5 || this.field2683 != var8) {
            class171.method125(this, 255, this.field2677, this.field2681, (byte) 0, true);
            return;
        }
        this.method3105(arg2);
        this.method3122();
    }

    @ObfuscatedName("fn.ch(I)V")
    public void method3122() {
        this.field2682 = new boolean[this.field2667.length];
        for (int var1 = 0; var1 < this.field2682.length; var1++) {
            this.field2682[var1] = false;
        }
        if (this.field2680 == null) {
            this.field2678 = true;
            return;
        }
        this.field2684 = -1;
        for (int var2 = 0; var2 < this.field2682.length; var2++) {
            if (this.field2663[var2] > 0) {
                class134 var3 = this.field2680;
                class169 var5 = new class169();
                var5.field2689 = 1;
                var5.field3112 = (long) var2;
                var5.field2690 = var3;
                var5.field2691 = this;
                class199 var6 = class170.field2697;
                synchronized (class170.field2697) {
                    class170.field2697.method3570(var5);
                }
                class170.method2282();
                this.field2684 = var2;
            }
        }
        if (this.field2684 == -1) {
            this.field2678 = true;
        }
    }

    @ObfuscatedName("fn.cd(II)I")
    public int method3123(int arg0) {
        if (this.field2667[arg0] == null) {
            return this.field2682[arg0] ? 100 : class171.method2233(this.field2677, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fn.cg(B)I")
    public int method3137() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2667.length; var3++) {
            if (this.field2663[var3] > 0) {
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
