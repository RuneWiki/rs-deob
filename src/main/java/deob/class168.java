package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fx")
public class class168 extends class167 {

    @ObfuscatedName("fx.m")
    public class134 field2695;

    @ObfuscatedName("fx.e")
    public class134 field2694;

    @ObfuscatedName("fx.k")
    public int field2700;

    @ObfuscatedName("fx.r")
    public volatile boolean field2696 = false;

    @ObfuscatedName("fx.b")
    public boolean field2697 = false;

    @ObfuscatedName("fx.t")
    public volatile boolean[] field2698;

    @ObfuscatedName("fx.g")
    public static CRC32 field2701 = new CRC32();

    @ObfuscatedName("fx.af")
    public int field2699;

    @ObfuscatedName("fx.ad")
    public int field2693;

    @ObfuscatedName("fx.ak")
    public int field2702 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2695 = arg0;
        this.field2694 = arg1;
        this.field2700 = arg2;
        this.field2697 = arg5;
        int var8 = this.field2700;
        if (Statics.field1064 == null) {
            class171.method24((class168) null, 255, 255, 0, (byte) 0, true);
            class171.field2735[var8] = this;
        } else {
            Statics.field1064.field1984 = var8 * 8 + 5;
            int var9 = Statics.field1064.method2354();
            int var10 = Statics.field1064.method2354();
            this.method3117(var9, var10);
        }
    }

    @ObfuscatedName("fx.ck(I)I")
    public int method3108() {
        if (this.field2696) {
            return 100;
        } else if (this.field2684 == null) {
            int var1 = this.field2700;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2723 != null && Statics.field2723.field3115 == var2) {
                var4 = Statics.field2936.field1984 * 99 / (Statics.field2936.field1988.length - Statics.field2723.field2743) + 1;
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

    @ObfuscatedName("fx.f(II)V")
    public void method3024(int arg0) {
        class171.method2132(this.field2700, arg0);
    }

    @ObfuscatedName("fx.h(IB)V")
    public void method3033(int arg0) {
        if (this.field2695 == null || this.field2698 == null || !this.field2698[arg0]) {
            class171.method24(this, this.field2700, arg0, this.field2678[arg0], (byte) 2, true);
            return;
        }
        class134 var2 = this.field2695;
        byte[] var4 = null;
        class199 var5 = class170.field2713;
        synchronized (class170.field2713) {
            for (class169 var6 = (class169) class170.field2713.method3563(); var6 != null; var6 = (class169) class170.field2713.method3565()) {
                if ((long) arg0 == var6.field3115 && var6.field2705 == var2 && var6.field2706 == 0) {
                    var4 = var6.field2707;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2697(arg0);
            this.method3111(var2, arg0, var8, true);
        } else {
            this.method3111(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("fx.cm(III)V")
    public void method3117(int arg0, int arg1) {
        this.field2699 = arg0;
        this.field2693 = arg1;
        if (this.field2694 == null) {
            class171.method24(this, 255, this.field2700, this.field2699, (byte) 0, true);
            return;
        }
        int var3 = this.field2700;
        class134 var4 = this.field2694;
        byte[] var6 = null;
        class199 var7 = class170.field2713;
        synchronized (class170.field2713) {
            for (class169 var8 = (class169) class170.field2713.method3563(); var8 != null; var8 = (class169) class170.field2713.method3565()) {
                if ((long) var3 == var8.field3115 && var8.field2705 == var4 && var8.field2706 == 0) {
                    var6 = var8.field2707;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2697(var3);
            this.method3111(var4, var3, var10, true);
        } else {
            this.method3111(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("fx.cg(I[BZZI)V")
    public void method3110(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2689[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2689[arg0];
            if (this.field2695 != null) {
                class134 var10 = this.field2695;
                class169 var11 = new class169();
                var11.field2706 = 0;
                var11.field3115 = (long) arg0;
                var11.field2707 = arg1;
                var11.field2705 = var10;
                class199 var12 = class170.field2713;
                synchronized (class170.field2713) {
                    class170.field2713.method3558(var11);
                }
                class170.method576();
                this.field2698[arg0] = true;
            }
            if (arg3) {
                this.field2684[arg0] = class125.method724(arg1, false);
            }
            return;
        }
        if (this.field2696) {
            throw new RuntimeException();
        }
        if (this.field2694 != null) {
            int var5 = this.field2700;
            class134 var6 = this.field2694;
            class169 var7 = new class169();
            var7.field2706 = 0;
            var7.field3115 = (long) var5;
            var7.field2707 = arg1;
            var7.field2705 = var6;
            class199 var8 = class170.field2713;
            synchronized (class170.field2713) {
                class170.field2713.method3558(var7);
            }
            class170.method576();
        }
        this.method3027(arg1);
        this.method3112();
    }

    @ObfuscatedName("fx.cr(Leh;I[BZI)V")
    public void method3111(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2694 != arg0) {
            if (!arg3 && this.field2702 == arg1) {
                this.field2696 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2698[arg1] = false;
                if (this.field2697 || arg3) {
                    class171.method24(this, this.field2700, arg1, this.field2678[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2701.reset();
            field2701.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2701.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2678[arg1] != var9 || this.field2689[arg1] != var10) {
                this.field2698[arg1] = false;
                if (this.field2697 || arg3) {
                    class171.method24(this, this.field2700, arg1, this.field2678[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2698[arg1] = true;
            if (arg3) {
                this.field2684[arg1] = class125.method724(arg2, false);
            }
            return;
        }
        if (this.field2696) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class171.method24(this, 255, this.field2700, this.field2699, (byte) 0, true);
            return;
        }
        field2701.reset();
        field2701.update(arg2, 0, arg2.length);
        int var5 = (int) field2701.getValue();
        class119 var6 = new class119(class167.method556(arg2));
        int var7 = var6.method2400();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2700 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2354();
        }
        if (this.field2699 != var5 || this.field2693 != var8) {
            class171.method24(this, 255, this.field2700, this.field2699, (byte) 0, true);
            return;
        }
        this.method3027(arg2);
        this.method3112();
    }

    @ObfuscatedName("fx.cu(I)V")
    public void method3112() {
        this.field2698 = new boolean[this.field2684.length];
        for (int var1 = 0; var1 < this.field2698.length; var1++) {
            this.field2698[var1] = false;
        }
        if (this.field2695 == null) {
            this.field2696 = true;
            return;
        }
        this.field2702 = -1;
        for (int var2 = 0; var2 < this.field2698.length; var2++) {
            if (this.field2688[var2] > 0) {
                class170.method3143(var2, this.field2695, this);
                this.field2702 = var2;
            }
        }
        if (this.field2702 == -1) {
            this.field2696 = true;
        }
    }

    @ObfuscatedName("fx.cd(II)I")
    public int method3113(int arg0) {
        if (this.field2684[arg0] != null) {
            return 100;
        } else if (this.field2698[arg0]) {
            return 100;
        } else {
            int var2 = this.field2700;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2723 != null && Statics.field2723.field3115 == var3) {
                var5 = Statics.field2936.field1984 * 99 / (Statics.field2936.field1988.length - Statics.field2723.field2743) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fx.co(I)I")
    public int method3114() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2684.length; var3++) {
            if (this.field2688[var3] > 0) {
                var1 += 100;
                var2 += this.method3113(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
