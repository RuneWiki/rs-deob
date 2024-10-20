package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ij")
public class class236 extends class234 {

    @ObfuscatedName("ij.v")
    public class308 field3160;

    @ObfuscatedName("ij.q")
    public class308 field3162;

    @ObfuscatedName("ij.l")
    public int field3163;

    @ObfuscatedName("ij.j")
    public volatile boolean field3159 = false;

    @ObfuscatedName("ij.af")
    public boolean field3164 = false;

    @ObfuscatedName("ij.ad")
    public volatile boolean[] field3167;

    @ObfuscatedName("ij.am")
    public static CRC32 field3166 = new CRC32();

    @ObfuscatedName("ij.ai")
    public int field3165;

    @ObfuscatedName("ij.ag")
    public int field3168;

    @ObfuscatedName("ij.ao")
    public int field3169 = -1;

    public class236(class308 arg0, class308 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3160 = arg0;
        this.field3162 = arg1;
        this.field3163 = arg2;
        this.field3164 = arg5;
        class237.method204(this, this.field3163);
    }

    @ObfuscatedName("ij.dw(B)Z")
    public boolean method3954() {
        return this.field3159;
    }

    @ObfuscatedName("ij.de(B)I")
    public int method3955() {
        if (this.field3159) {
            return 100;
        } else if (this.field3138 == null) {
            int var1 = this.field3163;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field3175 != null && Statics.field3175.field2126 == var2) {
                var4 = Statics.field281.field3707 * 99 / (Statics.field281.field3708.length - Statics.field3175.field3133) + 1;
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

    @ObfuscatedName("ij.f(II)V")
    public void method3842(int arg0) {
        int var2 = this.field3163;
        long var3 = (long) ((var2 << 16) + arg0);
        class233 var5 = (class233) class237.field3170.method5549(var3);
        if (var5 != null) {
            class237.field3177.method4482(var5);
        }
    }

    @ObfuscatedName("ij.o(II)V")
    public void method3853(int arg0) {
        if (this.field3160 == null || this.field3167 == null || !this.field3167[arg0]) {
            class237.method1684(this, this.field3163, arg0, this.field3141[arg0], (byte) 2, true);
        } else {
            class235.method3824(arg0, this.field3160, this);
        }
    }

    @ObfuscatedName("ij.dx(III)V")
    public void method3965(int arg0, int arg1) {
        this.field3165 = arg0;
        this.field3168 = arg1;
        if (this.field3162 == null) {
            class237.method1684(this, 255, this.field3163, this.field3165, (byte) 0, true);
        } else {
            class235.method3824(this.field3163, this.field3162, this);
        }
    }

    @ObfuscatedName("ij.dc(I[BZZI)V")
    public void method3953(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ij.dk(Lke;I[BZB)V")
    public void method3959(class308 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ij.dj(I)V")
    public void method3971() {
        this.field3167 = new boolean[this.field3138.length];
        for (int var1 = 0; var1 < this.field3167.length; var1++) {
            this.field3167[var1] = false;
        }
        if (this.field3160 == null) {
            this.field3159 = true;
            return;
        }
        this.field3169 = -1;
        for (int var2 = 0; var2 < this.field3167.length; var2++) {
            if (this.field3143[var2] > 0) {
                class235.method653(var2, this.field3160, this);
                this.field3169 = var2;
            }
        }
        if (this.field3169 == -1) {
            this.field3159 = true;
        }
    }

    @ObfuscatedName("ij.w(II)I")
    public int method3849(int arg0) {
        if (this.field3138[arg0] != null) {
            return 100;
        } else if (this.field3167[arg0]) {
            return 100;
        } else {
            int var2 = this.field3163;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field3175 != null && Statics.field3175.field2126 == var3) {
                var5 = Statics.field281.field3707 * 99 / (Statics.field281.field3708.length - Statics.field3175.field3133) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ij.dp(II)Z")
    public boolean method3962(int arg0) {
        return this.field3167[arg0];
    }

    @ObfuscatedName("ij.di(II)Z")
    public boolean method3963(int arg0) {
        return this.method3854(arg0) != null;
    }

    @ObfuscatedName("ij.dn(I)I")
    public int method3964() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3138.length; var3++) {
            if (this.field3143[var3] > 0) {
                var1 += 100;
                var2 += this.method3849(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
