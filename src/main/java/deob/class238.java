package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ih")
public class class238 extends class236 {

    @ObfuscatedName("ih.y")
    public class161 field3236;

    @ObfuscatedName("ih.k")
    public class161 field3234;

    @ObfuscatedName("ih.c")
    public int field3242;

    @ObfuscatedName("ih.r")
    public volatile boolean field3233 = false;

    @ObfuscatedName("ih.m")
    public boolean field3237 = false;

    @ObfuscatedName("ih.l")
    public volatile boolean[] field3238;

    @ObfuscatedName("ih.f")
    public static CRC32 field3239 = new CRC32();

    @ObfuscatedName("ih.ap")
    public int field3240;

    @ObfuscatedName("ih.af")
    public int field3241;

    @ObfuscatedName("ih.aa")
    public int field3235 = -1;

    public class238(class161 arg0, class161 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3236 = arg0;
        this.field3234 = arg1;
        this.field3242 = arg2;
        this.field3237 = arg5;
        class239.method729(this, this.field3242);
    }

    @ObfuscatedName("ih.ct(B)I")
    public int method3978() {
        if (this.field3233) {
            return 100;
        } else if (this.field3220 == null) {
            int var1 = class239.method2005(255, this.field3242);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ih.s(II)V")
    public void method3953(int arg0) {
        int var2 = this.field3242;
        long var3 = (long) ((var2 << 16) + arg0);
        class235 var5 = (class235) class239.field3253.method3387(var3);
        if (var5 != null) {
            class239.field3262.method3308(var5);
        }
    }

    @ObfuscatedName("ih.i(IB)V")
    public void method3952(int arg0) {
        if (this.field3236 == null || this.field3238 == null || !this.field3238[arg0]) {
            class239.method76(this, this.field3242, arg0, this.field3212[arg0], (byte) 2, true);
        } else {
            class237.method163(arg0, this.field3236, this);
        }
    }

    @ObfuscatedName("ih.ci(IIB)V")
    public void method3983(int arg0, int arg1) {
        this.field3240 = arg0;
        this.field3241 = arg1;
        if (this.field3234 == null) {
            class239.method76(this, 255, this.field3242, this.field3240, (byte) 0, true);
            return;
        }
        int var3 = this.field3242;
        class161 var4 = this.field3234;
        byte[] var6 = null;
        class194 var7 = class237.field3230;
        synchronized (class237.field3230) {
            for (class234 var8 = (class234) class237.field3230.method3427(); var8 != null; var8 = (class234) class237.field3230.method3435()) {
                if ((long) var3 == var8.field2464 && var8.field3199 == var4 && var8.field3201 == 0) {
                    var6 = var8.field3198;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2814(var3);
            this.method3981(var4, var3, var10, true);
        } else {
            this.method3981(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ih.cv(I[BZZI)V")
    public void method3995(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3233) {
                throw new RuntimeException();
            }
            if (this.field3234 != null) {
                class237.method3853(this.field3242, arg1, this.field3234);
            }
            this.method3925(arg1);
            this.method3988();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3213[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3213[arg0];
        if (this.field3236 != null) {
            class237.method3853(arg0, arg1, this.field3236);
            this.field3238[arg0] = true;
        }
        if (arg3) {
            this.field3220[arg0] = class177.method847(arg1, false);
        }
    }

    @ObfuscatedName("ih.cy(Lfr;I[BZS)V")
    public void method3981(class161 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3234 != arg0) {
            if (!arg3 && this.field3235 == arg1) {
                this.field3233 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3238[arg1] = false;
                if (this.field3237 || arg3) {
                    class239.method76(this, this.field3242, arg1, this.field3212[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3239.reset();
            field3239.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3239.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3212[arg1] != var9 || this.field3213[arg1] != var10) {
                this.field3238[arg1] = false;
                if (this.field3237 || arg3) {
                    class239.method76(this, this.field3242, arg1, this.field3212[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3238[arg1] = true;
            if (arg3) {
                this.field3220[arg1] = class177.method847(arg2, false);
            }
            return;
        }
        if (this.field3233) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class239.method76(this, 255, this.field3242, this.field3240, (byte) 0, true);
            return;
        }
        field3239.reset();
        field3239.update(arg2, 0, arg2.length);
        int var5 = (int) field3239.getValue();
        class174 var6 = new class174(class236.method3197(arg2));
        int var7 = var6.method2971();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3242 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3131();
        }
        if (this.field3240 != var5 || this.field3241 != var8) {
            class239.method76(this, 255, this.field3242, this.field3240, (byte) 0, true);
            return;
        }
        this.method3925(arg2);
        this.method3988();
    }

    @ObfuscatedName("ih.cs(I)V")
    public void method3988() {
        this.field3238 = new boolean[this.field3220.length];
        for (int var1 = 0; var1 < this.field3238.length; var1++) {
            this.field3238[var1] = false;
        }
        if (this.field3236 == null) {
            this.field3233 = true;
            return;
        }
        this.field3235 = -1;
        for (int var2 = 0; var2 < this.field3238.length; var2++) {
            if (this.field3214[var2] > 0) {
                class237.method128(var2, this.field3236, this);
                this.field3235 = var2;
            }
        }
        if (this.field3235 == -1) {
            this.field3233 = true;
        }
    }

    @ObfuscatedName("ih.e(IS)I")
    public int method3881(int arg0) {
        if (this.field3220[arg0] == null) {
            return this.field3238[arg0] ? 100 : class239.method2005(this.field3242, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ih.cf(I)I")
    public int method3982() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3220.length; var3++) {
            if (this.field3214[var3] > 0) {
                var1 += 100;
                var2 += this.method3881(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
