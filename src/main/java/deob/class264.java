package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ji")
public class class264 extends class262 {

    @ObfuscatedName("ji.m")
    public class175 field3402;

    @ObfuscatedName("ji.a")
    public class175 field3392;

    @ObfuscatedName("ji.x")
    public int field3395;

    @ObfuscatedName("ji.t")
    public volatile boolean field3394 = false;

    @ObfuscatedName("ji.ax")
    public boolean field3391 = false;

    @ObfuscatedName("ji.ai")
    public volatile boolean[] field3396;

    @ObfuscatedName("ji.aj")
    public static CRC32 field3397 = new CRC32();

    @ObfuscatedName("ji.ac")
    public int field3399;

    @ObfuscatedName("ji.ag")
    public int field3393;

    @ObfuscatedName("ji.ay")
    public int field3400 = -1;

    public class264(class175 arg0, class175 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3402 = arg0;
        this.field3392 = arg1;
        this.field3395 = arg2;
        this.field3391 = arg5;
        class265.method4259(this, this.field3395);
    }

    @ObfuscatedName("ji.ch(B)I")
    public int method4378() {
        if (this.field3394) {
            return 100;
        } else if (this.field3377 == null) {
            int var1 = class265.method3532(255, this.field3395);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ji.e(II)V")
    public void method4358(int arg0) {
        class265.method3224(this.field3395, arg0);
    }

    @ObfuscatedName("ji.p(IB)V")
    public void method4285(int arg0) {
        if (this.field3402 == null || this.field3396 == null || !this.field3396[arg0]) {
            class265.method1975(this, this.field3395, arg0, this.field3371[arg0], (byte) 2, true);
        } else {
            class263.method1836(arg0, this.field3402, this);
        }
    }

    @ObfuscatedName("ji.cl(IIB)V")
    public void method4379(int arg0, int arg1) {
        this.field3399 = arg0;
        this.field3393 = arg1;
        if (this.field3392 == null) {
            class265.method1975(this, 255, this.field3395, this.field3399, (byte) 0, true);
        } else {
            class263.method1836(this.field3395, this.field3392, this);
        }
    }

    @ObfuscatedName("ji.dr(I[BZZI)V")
    public void method4380(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3394) {
                throw new RuntimeException();
            }
            if (this.field3392 != null) {
                class263.method44(this.field3395, arg1, this.field3392);
            }
            this.method4265(arg1);
            this.method4382();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3383[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3383[arg0];
        if (this.field3402 != null) {
            class263.method44(arg0, arg1, this.field3402);
            this.field3396[arg0] = true;
        }
        if (arg3) {
            this.field3377[arg0] = class199.method1800(arg1, false);
        }
    }

    @ObfuscatedName("ji.dt(Lfr;I[BZI)V")
    public void method4381(class175 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3392 != arg0) {
            if (!arg3 && this.field3400 == arg1) {
                this.field3394 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3396[arg1] = false;
                if (this.field3391 || arg3) {
                    class265.method1975(this, this.field3395, arg1, this.field3371[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3397.reset();
            field3397.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3397.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3371[arg1] != var9 || this.field3383[arg1] != var10) {
                this.field3396[arg1] = false;
                if (this.field3391 || arg3) {
                    class265.method1975(this, this.field3395, arg1, this.field3371[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3396[arg1] = true;
            if (arg3) {
                this.field3377[arg1] = class199.method1800(arg2, false);
            }
            return;
        }
        if (this.field3394) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class265.method1975(this, 255, this.field3395, this.field3399, (byte) 0, true);
            return;
        }
        field3397.reset();
        field3397.update(arg2, 0, arg2.length);
        int var5 = (int) field3397.getValue();
        if (this.field3399 != var5) {
            class265.method1975(this, 255, this.field3395, this.field3399, (byte) 0, true);
            return;
        }
        class195 var6 = new class195(class262.method1814(arg2));
        int var7 = var6.method3332();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3395 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3472();
        }
        if (this.field3393 != var8) {
            class265.method1975(this, 255, this.field3395, this.field3399, (byte) 0, true);
            return;
        }
        this.method4265(arg2);
        this.method4382();
    }

    @ObfuscatedName("ji.df(B)V")
    public void method4382() {
        this.field3396 = new boolean[this.field3377.length];
        for (int var1 = 0; var1 < this.field3396.length; var1++) {
            this.field3396[var1] = false;
        }
        if (this.field3402 == null) {
            this.field3394 = true;
            return;
        }
        this.field3400 = -1;
        for (int var2 = 0; var2 < this.field3396.length; var2++) {
            if (this.field3373[var2] > 0) {
                class263.method3044(var2, this.field3402, this);
                this.field3400 = var2;
            }
        }
        if (this.field3400 == -1) {
            this.field3394 = true;
        }
    }

    @ObfuscatedName("ji.c(II)I")
    public int method4273(int arg0) {
        if (this.field3377[arg0] == null) {
            return this.field3396[arg0] ? 100 : class265.method3532(this.field3395, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ji.dk(IB)Z")
    public boolean method4390(int arg0) {
        return this.field3396[arg0];
    }

    @ObfuscatedName("ji.da(IB)Z")
    public boolean method4398(int arg0) {
        return this.method4278(arg0) != null;
    }

    @ObfuscatedName("ji.dq(I)I")
    public int method4387() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3377.length; var3++) {
            if (this.field3373[var3] > 0) {
                var1 += 100;
                var2 += this.method4273(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
