package deob;

import java.util.zip.CRC32;

@ObfuscatedName("js")
public class class264 extends class262 {

    @ObfuscatedName("js.g")
    public class175 field3405;

    @ObfuscatedName("js.w")
    public class175 field3401;

    @ObfuscatedName("js.o")
    public int field3398;

    @ObfuscatedName("js.a")
    public volatile boolean field3399 = false;

    @ObfuscatedName("js.ak")
    public boolean field3397 = false;

    @ObfuscatedName("js.ap")
    public volatile boolean[] field3396;

    @ObfuscatedName("js.ac")
    public static CRC32 field3402 = new CRC32();

    @ObfuscatedName("js.aw")
    public int field3403;

    @ObfuscatedName("js.as")
    public int field3404;

    @ObfuscatedName("js.au")
    public int field3400 = -1;

    public class264(class175 arg0, class175 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3405 = arg0;
        this.field3401 = arg1;
        this.field3398 = arg2;
        this.field3397 = arg5;
        class265.method2907(this, this.field3398);
    }

    @ObfuscatedName("js.cq(I)I")
    public int method4378() {
        if (this.field3399) {
            return 100;
        } else if (this.field3381 == null) {
            int var1 = this.field3398;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field304 != null && Statics.field304.field2655 == var2) {
                var4 = Statics.field3419.field2568 * 99 / (Statics.field3419.field2569.length - Statics.field304.field3367) + 1;
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

    @ObfuscatedName("js.z(IS)V")
    public void method4304(int arg0) {
        int var2 = this.field3398;
        long var3 = (long) ((var2 << 16) + arg0);
        class261 var5 = (class261) class265.field3414.method3736(var3);
        if (var5 != null) {
            class265.field3412.method3638(var5);
        }
    }

    @ObfuscatedName("js.u(II)V")
    public void method4283(int arg0) {
        if (this.field3405 == null || this.field3396 == null || !this.field3396[arg0]) {
            class265.method3888(this, this.field3398, arg0, this.field3375[arg0], (byte) 2, true);
            return;
        }
        class175 var2 = this.field3405;
        byte[] var4 = null;
        class218 var5 = class263.field3393;
        synchronized (class263.field3393) {
            for (class260 var6 = (class260) class263.field3393.method3798(); var6 != null; var6 = (class260) class263.field3393.method3800()) {
                if ((long) arg0 == var6.field2655 && var6.field3361 == var2 && var6.field3363 == 0) {
                    var4 = var6.field3360;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method3099(arg0);
            this.method4381(var2, arg0, var8, true);
        } else {
            this.method4381(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("js.cm(III)V")
    public void method4380(int arg0, int arg1) {
        this.field3403 = arg0;
        this.field3404 = arg1;
        if (this.field3401 == null) {
            class265.method3888(this, 255, this.field3398, this.field3403, (byte) 0, true);
            return;
        }
        int var3 = this.field3398;
        class175 var4 = this.field3401;
        byte[] var6 = null;
        class218 var7 = class263.field3393;
        synchronized (class263.field3393) {
            for (class260 var8 = (class260) class263.field3393.method3798(); var8 != null; var8 = (class260) class263.field3393.method3800()) {
                if ((long) var3 == var8.field2655 && var8.field3361 == var4 && var8.field3363 == 0) {
                    var6 = var8.field3360;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method3099(var3);
            this.method4381(var4, var3, var10, true);
        } else {
            this.method4381(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("js.cv(I[BZZB)V")
    public void method4401(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3376[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3376[arg0];
            if (this.field3405 != null) {
                class175 var10 = this.field3405;
                class260 var11 = new class260();
                var11.field3363 = 0;
                var11.field2655 = (long) arg0;
                var11.field3360 = arg1;
                var11.field3361 = var10;
                class218 var12 = class263.field3393;
                synchronized (class263.field3393) {
                    class263.field3393.method3793(var11);
                }
                class263.method1033();
                this.field3396[arg0] = true;
            }
            if (arg3) {
                this.field3381[arg0] = class199.method3158(arg1, false);
            }
            return;
        }
        if (this.field3399) {
            throw new RuntimeException();
        }
        if (this.field3401 != null) {
            int var5 = this.field3398;
            class175 var6 = this.field3401;
            class260 var7 = new class260();
            var7.field3363 = 0;
            var7.field2655 = (long) var5;
            var7.field3360 = arg1;
            var7.field3361 = var6;
            class218 var8 = class263.field3393;
            synchronized (class263.field3393) {
                class263.field3393.method3793(var7);
            }
            class263.method1033();
        }
        this.method4271(arg1);
        this.method4382();
    }

    @ObfuscatedName("js.dh(Lfp;I[BZI)V")
    public void method4381(class175 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3401 != arg0) {
            if (!arg3 && this.field3400 == arg1) {
                this.field3399 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3396[arg1] = false;
                if (this.field3397 || arg3) {
                    class265.method3888(this, this.field3398, arg1, this.field3375[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3402.reset();
            field3402.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3402.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3375[arg1] != var9 || this.field3376[arg1] != var10) {
                this.field3396[arg1] = false;
                if (this.field3397 || arg3) {
                    class265.method3888(this, this.field3398, arg1, this.field3375[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3396[arg1] = true;
            if (arg3) {
                this.field3381[arg1] = class199.method3158(arg2, false);
            }
            return;
        }
        if (this.field3399) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class265.method3888(this, 255, this.field3398, this.field3403, (byte) 0, true);
            return;
        }
        field3402.reset();
        field3402.update(arg2, 0, arg2.length);
        int var5 = (int) field3402.getValue();
        if (this.field3403 != var5) {
            class265.method3888(this, 255, this.field3398, this.field3403, (byte) 0, true);
            return;
        }
        class195 var6 = new class195(class262.method984(arg2));
        int var7 = var6.method3330();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3398 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3264();
        }
        if (this.field3404 != var8) {
            class265.method3888(this, 255, this.field3398, this.field3403, (byte) 0, true);
            return;
        }
        this.method4271(arg2);
        this.method4382();
    }

    @ObfuscatedName("js.dd(B)V")
    public void method4382() {
        this.field3396 = new boolean[this.field3381.length];
        for (int var1 = 0; var1 < this.field3396.length; var1++) {
            this.field3396[var1] = false;
        }
        if (this.field3405 == null) {
            this.field3399 = true;
            return;
        }
        this.field3400 = -1;
        for (int var2 = 0; var2 < this.field3396.length; var2++) {
            if (this.field3377[var2] > 0) {
                class175 var3 = this.field3405;
                class260 var5 = new class260();
                var5.field3363 = 1;
                var5.field2655 = (long) var2;
                var5.field3361 = var3;
                var5.field3362 = this;
                class218 var6 = class263.field3393;
                synchronized (class263.field3393) {
                    class263.field3393.method3793(var5);
                }
                class263.method1033();
                this.field3400 = var2;
            }
        }
        if (this.field3400 == -1) {
            this.field3399 = true;
        }
    }

    @ObfuscatedName("js.x(IB)I")
    public int method4279(int arg0) {
        if (this.field3381[arg0] != null) {
            return 100;
        } else if (this.field3396[arg0]) {
            return 100;
        } else {
            int var2 = this.field3398;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field304 != null && Statics.field304.field2655 == var3) {
                var5 = Statics.field3419.field2568 * 99 / (Statics.field3419.field2569.length - Statics.field304.field3367) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("js.do(II)Z")
    public boolean method4383(int arg0) {
        return this.field3396[arg0];
    }

    @ObfuscatedName("js.dg(II)Z")
    public boolean method4384(int arg0) {
        return this.method4364(arg0) != null;
    }

    @ObfuscatedName("js.dx(I)I")
    public int method4385() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3381.length; var3++) {
            if (this.field3377[var3] > 0) {
                var1 += 100;
                var2 += this.method4279(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
