package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fi")
public class class172 extends class171 {

    @ObfuscatedName("fi.t")
    public class138 field2743;

    @ObfuscatedName("fi.c")
    public class138 field2752;

    @ObfuscatedName("fi.z")
    public int field2744;

    @ObfuscatedName("fi.n")
    public volatile boolean field2750 = false;

    @ObfuscatedName("fi.q")
    public boolean field2746 = false;

    @ObfuscatedName("fi.a")
    public volatile boolean[] field2747;

    @ObfuscatedName("fi.b")
    public static CRC32 field2748 = new CRC32();

    @ObfuscatedName("fi.aj")
    public int field2749;

    @ObfuscatedName("fi.an")
    public int field2742;

    @ObfuscatedName("fi.ap")
    public int field2751 = -1;

    public class172(class138 arg0, class138 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2743 = arg0;
        this.field2752 = arg1;
        this.field2744 = arg2;
        this.field2746 = arg5;
        int var8 = this.field2744;
        if (Statics.field2717 == null) {
            class175.method3000((class172) null, 255, 255, 0, (byte) 0, true);
            class175.field2770[var8] = this;
        } else {
            Statics.field2717.field2046 = var8 * 8 + 5;
            int var9 = Statics.field2717.method2419();
            int var10 = Statics.field2717.method2419();
            this.method3173(var9, var10);
        }
    }

    @ObfuscatedName("fi.ct(B)I")
    public int method3165() {
        if (this.field2750) {
            return 100;
        } else if (this.field2734 == null) {
            int var1 = this.field2744;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2772 != null && Statics.field2772.field3168 == var2) {
                var4 = Statics.field2021.field2046 * 99 / (Statics.field2021.field2048.length - Statics.field2772.field2782) + 1;
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

    @ObfuscatedName("fi.w(IB)V")
    public void method3085(int arg0) {
        class175.method3108(this.field2744, arg0);
    }

    @ObfuscatedName("fi.v(IB)V")
    public void method3094(int arg0) {
        if (this.field2743 == null || this.field2747 == null || !this.field2747[arg0]) {
            class175.method3000(this, this.field2744, arg0, this.field2739[arg0], (byte) 2, true);
            return;
        }
        class138 var2 = this.field2743;
        byte[] var4 = null;
        class203 var5 = class174.field2760;
        synchronized (class174.field2760) {
            for (class173 var6 = (class173) class174.field2760.method3621(); var6 != null; var6 = (class173) class174.field2760.method3630()) {
                if ((long) arg0 == var6.field3168 && var6.field2755 == var2 && var6.field2754 == 0) {
                    var4 = var6.field2756;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2749(arg0);
            this.method3175(var2, arg0, var8, true);
        } else {
            this.method3175(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("fi.cz(III)V")
    public void method3173(int arg0, int arg1) {
        this.field2749 = arg0;
        this.field2742 = arg1;
        if (this.field2752 == null) {
            class175.method3000(this, 255, this.field2744, this.field2749, (byte) 0, true);
            return;
        }
        int var3 = this.field2744;
        class138 var4 = this.field2752;
        byte[] var6 = null;
        class203 var7 = class174.field2760;
        synchronized (class174.field2760) {
            for (class173 var8 = (class173) class174.field2760.method3621(); var8 != null; var8 = (class173) class174.field2760.method3630()) {
                if ((long) var3 == var8.field3168 && var8.field2755 == var4 && var8.field2754 == 0) {
                    var6 = var8.field2756;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2749(var3);
            this.method3175(var4, var3, var10, true);
        } else {
            this.method3175(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("fi.cg(I[BZZI)V")
    public void method3168(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2750) {
                throw new RuntimeException();
            }
            if (this.field2752 != null) {
                class174.method2834(this.field2744, arg1, this.field2752);
            }
            this.method3148(arg1);
            this.method3188();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2740[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2740[arg0];
        if (this.field2743 != null) {
            class174.method2834(arg0, arg1, this.field2743);
            this.field2747[arg0] = true;
        }
        if (arg3) {
            this.field2734[arg0] = class129.method2714(arg1, false);
        }
    }

    @ObfuscatedName("fi.cf(Lei;I[BZB)V")
    public void method3175(class138 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2752 != arg0) {
            if (!arg3 && this.field2751 == arg1) {
                this.field2750 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2747[arg1] = false;
                if (this.field2746 || arg3) {
                    class175.method3000(this, this.field2744, arg1, this.field2739[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2748.reset();
            field2748.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2748.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2739[arg1] != var9 || this.field2740[arg1] != var10) {
                this.field2747[arg1] = false;
                if (this.field2746 || arg3) {
                    class175.method3000(this, this.field2744, arg1, this.field2739[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2747[arg1] = true;
            if (arg3) {
                this.field2734[arg1] = class129.method2714(arg2, false);
            }
            return;
        }
        if (this.field2750) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class175.method3000(this, 255, this.field2744, this.field2749, (byte) 0, true);
            return;
        }
        field2748.reset();
        field2748.update(arg2, 0, arg2.length);
        int var5 = (int) field2748.getValue();
        class123 var6 = new class123(class171.method2990(arg2));
        int var7 = var6.method2398();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2744 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2419();
        }
        if (this.field2749 != var5 || this.field2742 != var8) {
            class175.method3000(this, 255, this.field2744, this.field2749, (byte) 0, true);
            return;
        }
        this.method3148(arg2);
        this.method3188();
    }

    @ObfuscatedName("fi.cr(I)V")
    public void method3188() {
        this.field2747 = new boolean[this.field2734.length];
        for (int var1 = 0; var1 < this.field2747.length; var1++) {
            this.field2747[var1] = false;
        }
        if (this.field2743 == null) {
            this.field2750 = true;
            return;
        }
        this.field2751 = -1;
        for (int var2 = 0; var2 < this.field2747.length; var2++) {
            if (this.field2727[var2] > 0) {
                class174.method1097(var2, this.field2743, this);
                this.field2751 = var2;
            }
        }
        if (this.field2751 == -1) {
            this.field2750 = true;
        }
    }

    @ObfuscatedName("fi.cb(IB)I")
    public int method3170(int arg0) {
        if (this.field2734[arg0] != null) {
            return 100;
        } else if (this.field2747[arg0]) {
            return 100;
        } else {
            int var2 = this.field2744;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2772 != null && Statics.field2772.field3168 == var3) {
                var5 = Statics.field2021.field2046 * 99 / (Statics.field2021.field2048.length - Statics.field2772.field2782) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fi.ch(I)I")
    public int method3171() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2734.length; var3++) {
            if (this.field2727[var3] > 0) {
                var1 += 100;
                var2 += this.method3170(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
