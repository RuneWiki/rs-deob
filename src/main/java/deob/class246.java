package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ig")
public class class246 extends class244 {

    @ObfuscatedName("ig.x")
    public class318 field3188;

    @ObfuscatedName("ig.b")
    public class318 field3191;

    @ObfuscatedName("ig.i")
    public int field3194;

    @ObfuscatedName("ig.f")
    public volatile boolean field3190 = false;

    @ObfuscatedName("ig.ah")
    public boolean field3192 = false;

    @ObfuscatedName("ig.ai")
    public volatile boolean[] field3193;

    @ObfuscatedName("ig.ao")
    public static CRC32 field3189 = new CRC32();

    @ObfuscatedName("ig.ae")
    public int field3195;

    @ObfuscatedName("ig.ax")
    public int field3196;

    @ObfuscatedName("ig.ag")
    public int field3197 = -1;

    public class246(class318 arg0, class318 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3188 = arg0;
        this.field3191 = arg1;
        this.field3194 = arg2;
        this.field3192 = arg5;
        class247.method3590(this, this.field3194);
    }

    @ObfuscatedName("ig.dr(I)Z")
    public boolean method4031() {
        return this.field3190;
    }

    @ObfuscatedName("ig.di(I)I")
    public int method4014() {
        if (this.field3190) {
            return 100;
        } else if (this.field3163 == null) {
            int var1 = this.field3194;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field3126 != null && Statics.field3126.field2152 == var2) {
                var4 = Statics.field2126.field3734 * 99 / (Statics.field2126.field3736.length - Statics.field3126.field3157) + 1;
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

    @ObfuscatedName("ig.o(II)V")
    public void method3890(int arg0) {
        int var2 = this.field3194;
        long var3 = (long) ((var2 << 16) + arg0);
        class243 var5 = (class243) class247.field3205.method5641(var3);
        if (var5 != null) {
            class247.field3204.method4555(var5);
        }
    }

    @ObfuscatedName("ig.c(II)V")
    public void method3900(int arg0) {
        if (this.field3188 == null || this.field3193 == null || !this.field3193[arg0]) {
            class247.method694(this, this.field3194, arg0, this.field3166[arg0], (byte) 2, true);
        } else {
            class245.method571(arg0, this.field3188, this);
        }
    }

    @ObfuscatedName("ig.dp(III)V")
    public void method4017(int arg0, int arg1) {
        this.field3195 = arg0;
        this.field3196 = arg1;
        if (this.field3191 == null) {
            class247.method694(this, 255, this.field3194, this.field3195, (byte) 0, true);
        } else {
            class245.method571(this.field3194, this.field3191, this);
        }
    }

    @ObfuscatedName("ig.dc(I[BZZI)V")
    public void method4037(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3190) {
                throw new RuntimeException();
            }
            if (this.field3191 != null) {
                class245.method2048(this.field3194, arg1, this.field3191);
            }
            this.method3889(arg1);
            this.method4019();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3174[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3174[arg0];
        if (this.field3188 != null) {
            class245.method2048(arg0, arg1, this.field3188);
            this.field3193[arg0] = true;
        }
        if (arg3) {
            this.field3163[arg0] = Statics.method1962(arg1, false);
        }
    }

    @ObfuscatedName("ig.dt(Llp;I[BZI)V")
    public void method4040(class318 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ig.ds(I)V")
    public void method4019() {
        this.field3193 = new boolean[this.field3163.length];
        for (int var1 = 0; var1 < this.field3193.length; var1++) {
            this.field3193[var1] = false;
        }
        if (this.field3188 == null) {
            this.field3190 = true;
            return;
        }
        this.field3197 = -1;
        for (int var2 = 0; var2 < this.field3193.length; var2++) {
            if (this.field3168[var2] > 0) {
                class245.method3859(var2, this.field3188, this);
                this.field3197 = var2;
            }
        }
        if (this.field3197 == -1) {
            this.field3190 = true;
        }
    }

    @ObfuscatedName("ig.a(II)I")
    public int method3897(int arg0) {
        if (this.field3163[arg0] != null) {
            return 100;
        } else if (this.field3193[arg0]) {
            return 100;
        } else {
            int var2 = this.field3194;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field3126 != null && Statics.field3126.field2152 == var3) {
                var5 = Statics.field2126.field3734 * 99 / (Statics.field2126.field3736.length - Statics.field3126.field3157) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ig.dg(II)Z")
    public boolean method4035(int arg0) {
        return this.field3193[arg0];
    }

    @ObfuscatedName("ig.do(II)Z")
    public boolean method4029(int arg0) {
        return this.method3902(arg0) != null;
    }

    @ObfuscatedName("ig.dn(I)I")
    public int method4022() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3163.length; var3++) {
            if (this.field3168[var3] > 0) {
                var1 += 100;
                var2 += this.method3897(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
