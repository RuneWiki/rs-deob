package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ia")
public class class237 extends class235 {

    @ObfuscatedName("ia.r")
    public class309 field3163;

    @ObfuscatedName("ia.s")
    public class309 field3168;

    @ObfuscatedName("ia.a")
    public int field3157;

    @ObfuscatedName("ia.u")
    public volatile boolean field3160 = false;

    @ObfuscatedName("ia.ae")
    public boolean field3166 = false;

    @ObfuscatedName("ia.af")
    public volatile boolean[] field3162;

    @ObfuscatedName("ia.az")
    public static CRC32 field3159 = new CRC32();

    @ObfuscatedName("ia.ax")
    public int field3164;

    @ObfuscatedName("ia.aj")
    public int field3165;

    @ObfuscatedName("ia.au")
    public int field3158 = -1;

    public class237(class309 arg0, class309 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3163 = arg0;
        this.field3168 = arg1;
        this.field3157 = arg2;
        this.field3166 = arg5;
        class238.method1929(this, this.field3157);
    }

    @ObfuscatedName("ia.dc(I)Z")
    public boolean method3979() {
        return this.field3160;
    }

    @ObfuscatedName("ia.dj(I)I")
    public int method3954() {
        if (this.field3160) {
            return 100;
        } else if (this.field3148 == null) {
            int var1 = this.field3157;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field47 != null && Statics.field47.field2115 == var2) {
                var4 = Statics.field1751.field3707 * 99 / (Statics.field1751.field3708.length - Statics.field47.field3127) + 1;
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

    @ObfuscatedName("ia.t(II)V")
    public void method3835(int arg0) {
        class238.method3656(this.field3157, arg0);
    }

    @ObfuscatedName("ia.v(II)V")
    public void method3846(int arg0) {
        if (this.field3163 == null || this.field3162 == null || !this.field3162[arg0]) {
            class238.method3212(this, this.field3157, arg0, this.field3145[arg0], (byte) 2, true);
        } else {
            class236.method3298(arg0, this.field3163, this);
        }
    }

    @ObfuscatedName("ia.de(IIB)V")
    public void method3956(int arg0, int arg1) {
        this.field3164 = arg0;
        this.field3165 = arg1;
        if (this.field3168 == null) {
            class238.method3212(this, 255, this.field3157, this.field3164, (byte) 0, true);
        } else {
            class236.method3298(this.field3157, this.field3168, this);
        }
    }

    @ObfuscatedName("ia.df(I[BZZI)V")
    public void method3957(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ia.dn(Lky;I[BZB)V")
    public void method3966(class309 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ia.dy(I)V")
    public void method3959() {
        this.field3162 = new boolean[this.field3148.length];
        for (int var1 = 0; var1 < this.field3162.length; var1++) {
            this.field3162[var1] = false;
        }
        if (this.field3163 == null) {
            this.field3160 = true;
            return;
        }
        this.field3158 = -1;
        for (int var2 = 0; var2 < this.field3162.length; var2++) {
            if (this.field3139[var2] > 0) {
                class309 var3 = this.field3163;
                class233 var5 = new class233();
                var5.field3123 = 1;
                var5.field2115 = (long) var2;
                var5.field3124 = var3;
                var5.field3125 = this;
                class263 var6 = class236.field3153;
                synchronized (class236.field3153) {
                    class236.field3153.method4545(var5);
                }
                class236.method3280();
                this.field3158 = var2;
            }
        }
        if (this.field3158 == -1) {
            this.field3160 = true;
        }
    }

    @ObfuscatedName("ia.j(IB)I")
    public int method3913(int arg0) {
        if (this.field3148[arg0] != null) {
            return 100;
        } else if (this.field3162[arg0]) {
            return 100;
        } else {
            int var2 = this.field3157;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field47 != null && Statics.field47.field2115 == var3) {
                var5 = Statics.field1751.field3707 * 99 / (Statics.field1751.field3708.length - Statics.field47.field3127) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ia.dq(II)Z")
    public boolean method3961(int arg0) {
        return this.field3162[arg0];
    }

    @ObfuscatedName("ia.dd(II)Z")
    public boolean method3962(int arg0) {
        return this.method3847(arg0) != null;
    }

    @ObfuscatedName("ia.dr(I)I")
    public int method3963() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3148.length; var3++) {
            if (this.field3139[var3] > 0) {
                var1 += 100;
                var2 += this.method3913(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
