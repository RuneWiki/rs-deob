package deob;

import java.util.zip.CRC32;

@ObfuscatedName("iv")
public class class245 extends class243 {

    @ObfuscatedName("iv.q")
    public class162 field3315;

    @ObfuscatedName("iv.h")
    public class162 field3313;

    @ObfuscatedName("iv.i")
    public int field3314;

    @ObfuscatedName("iv.o")
    public volatile boolean field3316 = false;

    @ObfuscatedName("iv.w")
    public boolean field3317 = false;

    @ObfuscatedName("iv.g")
    public volatile boolean[] field3318;

    @ObfuscatedName("iv.a")
    public static CRC32 field3321 = new CRC32();

    @ObfuscatedName("iv.ah")
    public int field3320;

    @ObfuscatedName("iv.ak")
    public int field3319;

    @ObfuscatedName("iv.aa")
    public int field3322 = -1;

    public class245(class162 arg0, class162 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3315 = arg0;
        this.field3313 = arg1;
        this.field3314 = arg2;
        this.field3317 = arg5;
        int var8 = this.field3314;
        if (Statics.field3340 == null) {
            class246.method3888((class245) null, 255, 255, 0, (byte) 0, true);
            class246.field3325[var8] = this;
        } else {
            Statics.field3340.field2498 = var8 * 8 + 5;
            int var9 = Statics.field3340.method3041();
            int var10 = Statics.field3340.method3041();
            this.method4041(var9, var10);
        }
    }

    @ObfuscatedName("iv.ch(I)I")
    public int method4045() {
        if (this.field3316) {
            return 100;
        } else if (this.field3299 == null) {
            int var1 = class246.method1685(255, this.field3314);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("iv.x(II)V")
    public void method3934(int arg0) {
        int var2 = this.field3314;
        long var3 = (long) ((var2 << 16) + arg0);
        class242 var5 = (class242) class246.field3331.method3438(var3);
        if (var5 != null) {
            class246.field3330.method3378(var5);
        }
    }

    @ObfuscatedName("iv.u(II)V")
    public void method3944(int arg0) {
        if (this.field3315 == null || this.field3318 == null || !this.field3318[arg0]) {
            class246.method3888(this, this.field3314, arg0, this.field3293[arg0], (byte) 2, true);
            return;
        }
        class162 var2 = this.field3315;
        byte[] var4 = null;
        class201 var5 = class244.field3308;
        synchronized (class244.field3308) {
            for (class241 var6 = (class241) class244.field3308.method3500(); var6 != null; var6 = (class241) class244.field3308.method3511()) {
                if ((long) arg0 == var6.field2564 && var6.field3284 == var2 && var6.field3283 == 0) {
                    var4 = var6.field3281;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2880(arg0);
            this.method4042(var2, arg0, var8, true);
        } else {
            this.method4042(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("iv.ct(IIB)V")
    public void method4041(int arg0, int arg1) {
        this.field3320 = arg0;
        this.field3319 = arg1;
        if (this.field3313 == null) {
            class246.method3888(this, 255, this.field3314, this.field3320, (byte) 0, true);
            return;
        }
        int var3 = this.field3314;
        class162 var4 = this.field3313;
        byte[] var6 = null;
        class201 var7 = class244.field3308;
        synchronized (class244.field3308) {
            for (class241 var8 = (class241) class244.field3308.method3500(); var8 != null; var8 = (class241) class244.field3308.method3511()) {
                if ((long) var3 == var8.field2564 && var8.field3284 == var4 && var8.field3283 == 0) {
                    var6 = var8.field3281;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2880(var3);
            this.method4042(var4, var3, var10, true);
        } else {
            this.method4042(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("iv.cu(I[BZZI)V")
    public void method4047(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3316) {
                throw new RuntimeException();
            }
            if (this.field3313 != null) {
                class244.method669(this.field3314, arg1, this.field3313);
            }
            this.method3933(arg1);
            this.method4043();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3290[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3290[arg0];
        if (this.field3315 != null) {
            class244.method669(arg0, arg1, this.field3315);
            this.field3318[arg0] = true;
        }
        if (arg3) {
            this.field3299[arg0] = class184.method148(arg1, false);
        }
    }

    @ObfuscatedName("iv.cf(Lff;I[BZB)V")
    public void method4042(class162 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3313 != arg0) {
            if (!arg3 && this.field3322 == arg1) {
                this.field3316 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3318[arg1] = false;
                if (this.field3317 || arg3) {
                    class246.method3888(this, this.field3314, arg1, this.field3293[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3321.reset();
            field3321.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3321.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3293[arg1] != var9 || this.field3290[arg1] != var10) {
                this.field3318[arg1] = false;
                if (this.field3317 || arg3) {
                    class246.method3888(this, this.field3314, arg1, this.field3293[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3318[arg1] = true;
            if (arg3) {
                this.field3299[arg1] = class184.method148(arg2, false);
            }
            return;
        }
        if (this.field3316) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class246.method3888(this, 255, this.field3314, this.field3320, (byte) 0, true);
            return;
        }
        field3321.reset();
        field3321.update(arg2, 0, arg2.length);
        int var5 = (int) field3321.getValue();
        class181 var6 = new class181(class243.method1(arg2));
        int var7 = var6.method3204();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3314 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3041();
        }
        if (this.field3320 != var5 || this.field3319 != var8) {
            class246.method3888(this, 255, this.field3314, this.field3320, (byte) 0, true);
            return;
        }
        this.method3933(arg2);
        this.method4043();
    }

    @ObfuscatedName("iv.cv(B)V")
    public void method4043() {
        this.field3318 = new boolean[this.field3299.length];
        for (int var1 = 0; var1 < this.field3318.length; var1++) {
            this.field3318[var1] = false;
        }
        if (this.field3315 == null) {
            this.field3316 = true;
            return;
        }
        this.field3322 = -1;
        for (int var2 = 0; var2 < this.field3318.length; var2++) {
            if (this.field3295[var2] > 0) {
                class244.method2954(var2, this.field3315, this);
                this.field3322 = var2;
            }
        }
        if (this.field3322 == -1) {
            this.field3316 = true;
        }
    }

    @ObfuscatedName("iv.t(IB)I")
    public int method3964(int arg0) {
        if (this.field3299[arg0] == null) {
            return this.field3318[arg0] ? 100 : class246.method1685(this.field3314, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("iv.df(I)I")
    public int method4044() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3299.length; var3++) {
            if (this.field3295[var3] > 0) {
                var1 += 100;
                var2 += this.method3964(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
