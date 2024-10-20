package deob;

import java.util.zip.CRC32;

@ObfuscatedName("js")
public class class264 extends class262 {

    @ObfuscatedName("js.q")
    public class175 field3399;

    @ObfuscatedName("js.g")
    public class175 field3395;

    @ObfuscatedName("js.y")
    public int field3396;

    @ObfuscatedName("js.s")
    public volatile boolean field3397 = false;

    @ObfuscatedName("js.ac")
    public boolean field3398 = false;

    @ObfuscatedName("js.ap")
    public volatile boolean[] field3400;

    @ObfuscatedName("js.al")
    public static CRC32 field3394 = new CRC32();

    @ObfuscatedName("js.ai")
    public int field3401;

    @ObfuscatedName("js.ab")
    public int field3402;

    @ObfuscatedName("js.ak")
    public int field3403 = -1;

    public class264(class175 arg0, class175 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3399 = arg0;
        this.field3395 = arg1;
        this.field3396 = arg2;
        this.field3398 = arg5;
        class265.method2066(this, this.field3396);
    }

    @ObfuscatedName("js.dz(B)I")
    public int method4300() {
        if (this.field3397) {
            return 100;
        } else if (this.field3378 == null) {
            int var1 = class265.method27(255, this.field3396);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("js.i(II)V")
    public void method4189(int arg0) {
        int var2 = this.field3396;
        long var3 = (long) ((var2 << 16) + arg0);
        class261 var5 = (class261) class265.field3422.method3677(var3);
        if (var5 != null) {
            class265.field3412.method3574(var5);
        }
    }

    @ObfuscatedName("js.b(II)V")
    public void method4200(int arg0) {
        if (this.field3399 == null || this.field3400 == null || !this.field3400[arg0]) {
            class265.method2864(this, this.field3396, arg0, this.field3372[arg0], (byte) 2, true);
        } else {
            class263.method4090(arg0, this.field3399, this);
        }
    }

    @ObfuscatedName("js.dn(III)V")
    public void method4318(int arg0, int arg1) {
        this.field3401 = arg0;
        this.field3402 = arg1;
        if (this.field3395 == null) {
            class265.method2864(this, 255, this.field3396, this.field3401, (byte) 0, true);
        } else {
            class263.method4090(this.field3396, this.field3395, this);
        }
    }

    @ObfuscatedName("js.dh(I[BZZI)V")
    public void method4302(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3397) {
                throw new RuntimeException();
            }
            if (this.field3395 != null) {
                class263.method4109(this.field3396, arg1, this.field3395);
            }
            this.method4188(arg1);
            this.method4304();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3373[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3373[arg0];
        if (this.field3399 != null) {
            class263.method4109(arg0, arg1, this.field3399);
            this.field3400[arg0] = true;
        }
        if (arg3) {
            this.field3378[arg0] = class199.method954(arg1, false);
        }
    }

    @ObfuscatedName("js.dl(Lfa;I[BZI)V")
    public void method4303(class175 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3395 != arg0) {
            if (!arg3 && this.field3403 == arg1) {
                this.field3397 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3400[arg1] = false;
                if (this.field3398 || arg3) {
                    class265.method2864(this, this.field3396, arg1, this.field3372[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3394.reset();
            field3394.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3394.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3372[arg1] != var9 || this.field3373[arg1] != var10) {
                this.field3400[arg1] = false;
                if (this.field3398 || arg3) {
                    class265.method2864(this, this.field3396, arg1, this.field3372[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3400[arg1] = true;
            if (arg3) {
                this.field3378[arg1] = class199.method954(arg2, false);
            }
            return;
        }
        if (this.field3397) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class265.method2864(this, 255, this.field3396, this.field3401, (byte) 0, true);
            return;
        }
        field3394.reset();
        field3394.update(arg2, 0, arg2.length);
        int var5 = (int) field3394.getValue();
        if (this.field3401 != var5) {
            class265.method2864(this, 255, this.field3396, this.field3401, (byte) 0, true);
            return;
        }
        class195 var6 = new class195(class262.method15(arg2));
        int var7 = var6.method3429();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3396 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3230();
        }
        if (this.field3402 != var8) {
            class265.method2864(this, 255, this.field3396, this.field3401, (byte) 0, true);
            return;
        }
        this.method4188(arg2);
        this.method4304();
    }

    @ObfuscatedName("js.dm(S)V")
    public void method4304() {
        this.field3400 = new boolean[this.field3378.length];
        for (int var1 = 0; var1 < this.field3400.length; var1++) {
            this.field3400[var1] = false;
        }
        if (this.field3399 == null) {
            this.field3397 = true;
            return;
        }
        this.field3403 = -1;
        for (int var2 = 0; var2 < this.field3400.length; var2++) {
            if (this.field3374[var2] > 0) {
                class263.method3806(var2, this.field3399, this);
                this.field3403 = var2;
            }
        }
        if (this.field3403 == -1) {
            this.field3397 = true;
        }
    }

    @ObfuscatedName("js.w(IB)I")
    public int method4217(int arg0) {
        if (this.field3378[arg0] == null) {
            return this.field3400[arg0] ? 100 : class265.method27(this.field3396, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("js.dv(II)Z")
    public boolean method4307(int arg0) {
        return this.field3400[arg0];
    }

    @ObfuscatedName("js.dr(IB)Z")
    public boolean method4320(int arg0) {
        return this.method4201(arg0) != null;
    }

    @ObfuscatedName("js.ds(I)I")
    public int method4306() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3378.length; var3++) {
            if (this.field3374[var3] > 0) {
                var1 += 100;
                var2 += this.method4217(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
