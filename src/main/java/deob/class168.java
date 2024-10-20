package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fn")
public class class168 extends class167 {

    @ObfuscatedName("fn.t")
    public class134 field2680;

    @ObfuscatedName("fn.a")
    public class134 field2677;

    @ObfuscatedName("fn.s")
    public int field2683;

    @ObfuscatedName("fn.e")
    public volatile boolean field2687 = false;

    @ObfuscatedName("fn.q")
    public boolean field2682 = false;

    @ObfuscatedName("fn.i")
    public volatile boolean[] field2681;

    @ObfuscatedName("fn.h")
    public static CRC32 field2678 = new CRC32();

    @ObfuscatedName("fn.ay")
    public int field2679;

    @ObfuscatedName("fn.ak")
    public int field2684;

    @ObfuscatedName("fn.ai")
    public int field2685 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2680 = arg0;
        this.field2677 = arg1;
        this.field2683 = arg2;
        this.field2682 = arg5;
        int var8 = this.field2683;
        if (Statics.field2644 == null) {
            class171.method670((class168) null, 255, 255, 0, (byte) 0, true);
            class171.field2710[var8] = this;
        } else {
            Statics.field2644.field1977 = var8 * 8 + 5;
            int var9 = Statics.field2644.method2367();
            int var10 = Statics.field2644.method2367();
            this.method3157(var9, var10);
        }
    }

    @ObfuscatedName("fn.cy(I)I")
    public int method3159() {
        if (this.field2687) {
            return 100;
        } else if (this.field2666 == null) {
            int var1 = this.field2683;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2068 != null && Statics.field2068.field3099 == var2) {
                var4 = Statics.field1449.field1977 * 99 / (Statics.field1449.field1986.length - Statics.field2068.field2724) + 1;
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

    @ObfuscatedName("fn.b(IS)V")
    public void method3093(int arg0) {
        class171.method2683(this.field2683, arg0);
    }

    @ObfuscatedName("fn.v(II)V")
    public void method3081(int arg0) {
        if (this.field2680 == null || this.field2681 == null || !this.field2681[arg0]) {
            class171.method670(this, this.field2683, arg0, this.field2659[arg0], (byte) 2, true);
        } else {
            class170.method3(arg0, this.field2680, this);
        }
    }

    @ObfuscatedName("fn.cx(III)V")
    public void method3157(int arg0, int arg1) {
        this.field2679 = arg0;
        this.field2684 = arg1;
        if (this.field2677 == null) {
            class171.method670(this, 255, this.field2683, this.field2679, (byte) 0, true);
        } else {
            class170.method3(this.field2683, this.field2677, this);
        }
    }

    @ObfuscatedName("fn.co(I[BZZS)V")
    public void method3158(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2661[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2661[arg0];
            if (this.field2680 != null) {
                class170.method2986(arg0, arg1, this.field2680);
                this.field2681[arg0] = true;
            }
            if (arg3) {
                this.field2666[arg0] = class125.method2579(arg1, false);
            }
            return;
        }
        if (this.field2687) {
            throw new RuntimeException();
        }
        if (this.field2677 != null) {
            int var5 = this.field2683;
            class134 var6 = this.field2677;
            class169 var7 = new class169();
            var7.field2689 = 0;
            var7.field3099 = (long) var5;
            var7.field2694 = arg1;
            var7.field2690 = var6;
            class199 var8 = class170.field2697;
            synchronized (class170.field2697) {
                class170.field2697.method3598(var7);
            }
            class170.method2677();
        }
        this.method3077(arg1);
        this.method3160();
    }

    @ObfuscatedName("fn.cl(Lea;I[BZI)V")
    public void method3170(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2677 != arg0) {
            if (!arg3 && this.field2685 == arg1) {
                this.field2687 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2681[arg1] = false;
                if (this.field2682 || arg3) {
                    class171.method670(this, this.field2683, arg1, this.field2659[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2678.reset();
            field2678.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2678.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2659[arg1] != var9 || this.field2661[arg1] != var10) {
                this.field2681[arg1] = false;
                if (this.field2682 || arg3) {
                    class171.method670(this, this.field2683, arg1, this.field2659[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2681[arg1] = true;
            if (arg3) {
                this.field2666[arg1] = class125.method2579(arg2, false);
            }
            return;
        }
        if (this.field2687) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class171.method670(this, 255, this.field2683, this.field2679, (byte) 0, true);
            return;
        }
        field2678.reset();
        field2678.update(arg2, 0, arg2.length);
        int var5 = (int) field2678.getValue();
        class119 var6 = new class119(class167.method1975(arg2));
        int var7 = var6.method2362();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2683 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2367();
        }
        if (this.field2679 != var5 || this.field2684 != var8) {
            class171.method670(this, 255, this.field2683, this.field2679, (byte) 0, true);
            return;
        }
        this.method3077(arg2);
        this.method3160();
    }

    @ObfuscatedName("fn.cp(B)V")
    public void method3160() {
        this.field2681 = new boolean[this.field2666.length];
        for (int var1 = 0; var1 < this.field2681.length; var1++) {
            this.field2681[var1] = false;
        }
        if (this.field2680 == null) {
            this.field2687 = true;
            return;
        }
        this.field2685 = -1;
        for (int var2 = 0; var2 < this.field2681.length; var2++) {
            if (this.field2662[var2] > 0) {
                class134 var3 = this.field2680;
                class169 var5 = new class169();
                var5.field2689 = 1;
                var5.field3099 = (long) var2;
                var5.field2690 = var3;
                var5.field2691 = this;
                class199 var6 = class170.field2697;
                synchronized (class170.field2697) {
                    class170.field2697.method3598(var5);
                }
                class170.method2677();
                this.field2685 = var2;
            }
        }
        if (this.field2685 == -1) {
            this.field2687 = true;
        }
    }

    @ObfuscatedName("fn.cn(II)I")
    public int method3168(int arg0) {
        if (this.field2666[arg0] != null) {
            return 100;
        } else if (this.field2681[arg0]) {
            return 100;
        } else {
            int var2 = this.field2683;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2068 != null && Statics.field2068.field3099 == var3) {
                var5 = Statics.field1449.field1977 * 99 / (Statics.field1449.field1986.length - Statics.field2068.field2724) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fn.ch(B)I")
    public int method3161() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2666.length; var3++) {
            if (this.field2662[var3] > 0) {
                var1 += 100;
                var2 += this.method3168(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
