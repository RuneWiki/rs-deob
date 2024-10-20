package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ix")
public class class238 extends class236 {

    @ObfuscatedName("ix.u")
    public class161 field3258;

    @ObfuscatedName("ix.p")
    public class161 field3250;

    @ObfuscatedName("ix.q")
    public int field3251;

    @ObfuscatedName("ix.d")
    public volatile boolean field3252 = false;

    @ObfuscatedName("ix.h")
    public boolean field3253 = false;

    @ObfuscatedName("ix.g")
    public volatile boolean[] field3254;

    @ObfuscatedName("ix.x")
    public static CRC32 field3260 = new CRC32();

    @ObfuscatedName("ix.ah")
    public int field3256;

    @ObfuscatedName("ix.ab")
    public int field3257;

    @ObfuscatedName("ix.aw")
    public int field3249 = -1;

    public class238(class161 arg0, class161 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3258 = arg0;
        this.field3250 = arg1;
        this.field3251 = arg2;
        this.field3253 = arg5;
        int var8 = this.field3251;
        if (Statics.field2151 == null) {
            class239.method3132((class238) null, 255, 255, 0, (byte) 0, true);
            class239.field3263[var8] = this;
        } else {
            Statics.field2151.field2399 = var8 * 8 + 5;
            int var9 = Statics.field2151.method2885();
            int var10 = Statics.field2151.method2885();
            this.method3871(var9, var10);
        }
    }

    @ObfuscatedName("ix.cb(I)I")
    public int method3870() {
        if (this.field3252) {
            return 100;
        } else if (this.field3236 == null) {
            int var1 = class239.method3753(255, this.field3251);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ix.w(II)V")
    public void method3767(int arg0) {
        class239.method228(this.field3251, arg0);
    }

    @ObfuscatedName("ix.o(IB)V")
    public void method3850(int arg0) {
        if (this.field3258 == null || this.field3254 == null || !this.field3254[arg0]) {
            class239.method3132(this, this.field3251, arg0, this.field3226[arg0], (byte) 2, true);
        } else {
            class237.method20(arg0, this.field3258, this);
        }
    }

    @ObfuscatedName("ix.cs(III)V")
    public void method3871(int arg0, int arg1) {
        this.field3256 = arg0;
        this.field3257 = arg1;
        if (this.field3250 == null) {
            class239.method3132(this, 255, this.field3251, this.field3256, (byte) 0, true);
        } else {
            class237.method20(this.field3251, this.field3250, this);
        }
    }

    @ObfuscatedName("ix.ct(I[BZZI)V")
    public void method3872(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3227[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3227[arg0];
            if (this.field3258 != null) {
                class161 var10 = this.field3258;
                class234 var11 = new class234();
                var11.field3214 = 0;
                var11.field2473 = (long) arg0;
                var11.field3216 = arg1;
                var11.field3210 = var10;
                class194 var12 = class237.field3248;
                synchronized (class237.field3248) {
                    class237.field3248.method3322(var11);
                }
                class237.method559();
                this.field3254[arg0] = true;
            }
            if (arg3) {
                this.field3236[arg0] = class177.method2441(arg1, false);
            }
            return;
        }
        if (this.field3252) {
            throw new RuntimeException();
        }
        if (this.field3250 != null) {
            int var5 = this.field3251;
            class161 var6 = this.field3250;
            class234 var7 = new class234();
            var7.field3214 = 0;
            var7.field2473 = (long) var5;
            var7.field3216 = arg1;
            var7.field3210 = var6;
            class194 var8 = class237.field3248;
            synchronized (class237.field3248) {
                class237.field3248.method3322(var7);
            }
            class237.method559();
        }
        this.method3766(arg1);
        this.method3885();
    }

    @ObfuscatedName("ix.dn(Lfv;I[BZB)V")
    public void method3873(class161 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3250 != arg0) {
            if (!arg3 && this.field3249 == arg1) {
                this.field3252 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3254[arg1] = false;
                if (this.field3253 || arg3) {
                    class239.method3132(this, this.field3251, arg1, this.field3226[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3260.reset();
            field3260.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3260.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3226[arg1] != var9 || this.field3227[arg1] != var10) {
                this.field3254[arg1] = false;
                if (this.field3253 || arg3) {
                    class239.method3132(this, this.field3251, arg1, this.field3226[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3254[arg1] = true;
            if (arg3) {
                this.field3236[arg1] = class177.method2441(arg2, false);
            }
            return;
        }
        if (this.field3252) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class239.method3132(this, 255, this.field3251, this.field3256, (byte) 0, true);
            return;
        }
        field3260.reset();
        field3260.update(arg2, 0, arg2.length);
        int var5 = (int) field3260.getValue();
        class174 var6 = new class174(class236.method2784(arg2));
        int var7 = var6.method3061();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3251 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2885();
        }
        if (this.field3256 != var5 || this.field3257 != var8) {
            class239.method3132(this, 255, this.field3251, this.field3256, (byte) 0, true);
            return;
        }
        this.method3766(arg2);
        this.method3885();
    }

    @ObfuscatedName("ix.dm(I)V")
    public void method3885() {
        this.field3254 = new boolean[this.field3236.length];
        for (int var1 = 0; var1 < this.field3254.length; var1++) {
            this.field3254[var1] = false;
        }
        if (this.field3258 == null) {
            this.field3252 = true;
            return;
        }
        this.field3249 = -1;
        for (int var2 = 0; var2 < this.field3254.length; var2++) {
            if (this.field3228[var2] > 0) {
                class237.method4489(var2, this.field3258, this);
                this.field3249 = var2;
            }
        }
        if (this.field3249 == -1) {
            this.field3252 = true;
        }
    }

    @ObfuscatedName("ix.y(II)I")
    public int method3860(int arg0) {
        if (this.field3236[arg0] == null) {
            return this.field3254[arg0] ? 100 : class239.method3753(this.field3251, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ix.dr(I)I")
    public int method3882() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3236.length; var3++) {
            if (this.field3228[var3] > 0) {
                var1 += 100;
                var2 += this.method3860(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
