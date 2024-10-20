package deob;

import java.util.zip.CRC32;

@ObfuscatedName("iu")
public class class236 extends class234 {

    @ObfuscatedName("iu.n")
    public class309 field3157;

    @ObfuscatedName("iu.d")
    public class309 field3154;

    @ObfuscatedName("iu.s")
    public int field3155;

    @ObfuscatedName("iu.z")
    public volatile boolean field3156 = false;

    @ObfuscatedName("iu.al")
    public boolean field3158 = false;

    @ObfuscatedName("iu.av")
    public volatile boolean[] field3161;

    @ObfuscatedName("iu.as")
    public static CRC32 field3159 = new CRC32();

    @ObfuscatedName("iu.aw")
    public int field3160;

    @ObfuscatedName("iu.ad")
    public int field3162;

    @ObfuscatedName("iu.ag")
    public int field3153 = -1;

    public class236(class309 arg0, class309 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3157 = arg0;
        this.field3154 = arg1;
        this.field3155 = arg2;
        this.field3158 = arg5;
        int var8 = this.field3155;
        if (Statics.field3883 == null) {
            class237.method2704((class236) null, 255, 255, 0, (byte) 0, true);
            class237.field3174[var8] = this;
        } else {
            Statics.field3883.field3733 = var8 * 8 + 5;
            int var9 = Statics.field3883.method5072();
            int var10 = Statics.field3883.method5072();
            this.method3891(var9, var10);
        }
    }

    @ObfuscatedName("iu.dg(B)Z")
    public boolean method3889() {
        return this.field3156;
    }

    @ObfuscatedName("iu.df(I)I")
    public int method3890() {
        if (this.field3156) {
            return 100;
        } else if (this.field3127 == null) {
            int var1 = class237.method3585(255, this.field3155);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("iu.w(II)V")
    public void method3825(int arg0) {
        class237.method1492(this.field3155, arg0);
    }

    @ObfuscatedName("iu.v(IS)V")
    public void method3783(int arg0) {
        if (this.field3157 == null || this.field3161 == null || !this.field3161[arg0]) {
            class237.method2704(this, this.field3155, arg0, this.field3132[arg0], (byte) 2, true);
        } else {
            class235.method1865(arg0, this.field3157, this);
        }
    }

    @ObfuscatedName("iu.dt(III)V")
    public void method3891(int arg0, int arg1) {
        this.field3160 = arg0;
        this.field3162 = arg1;
        if (this.field3154 == null) {
            class237.method2704(this, 255, this.field3155, this.field3160, (byte) 0, true);
        } else {
            class235.method1865(this.field3155, this.field3154, this);
        }
    }

    @ObfuscatedName("iu.dj(I[BZZB)V")
    public void method3892(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("iu.dl(Lkm;I[BZI)V")
    public void method3893(class309 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("iu.dz(I)V")
    public void method3898() {
        this.field3161 = new boolean[this.field3127.length];
        for (int var1 = 0; var1 < this.field3161.length; var1++) {
            this.field3161[var1] = false;
        }
        if (this.field3157 == null) {
            this.field3156 = true;
            return;
        }
        this.field3153 = -1;
        for (int var2 = 0; var2 < this.field3161.length; var2++) {
            if (this.field3134[var2] > 0) {
                class309 var3 = this.field3157;
                class232 var5 = new class232();
                var5.field3119 = 1;
                var5.field2114 = (long) var2;
                var5.field3117 = var3;
                var5.field3118 = this;
                class262 var6 = class235.field3147;
                synchronized (class235.field3147) {
                    class235.field3147.method4532(var5);
                }
                Object var8 = class235.field3148;
                synchronized (class235.field3148) {
                    if (class235.field3145 == 0) {
                        Statics.field3149 = new Thread(new class235());
                        Statics.field3149.setDaemon(true);
                        Statics.field3149.start();
                        Statics.field3149.setPriority(5);
                    }
                    class235.field3145 = 600;
                }
                this.field3153 = var2;
            }
        }
        if (this.field3153 == -1) {
            this.field3156 = true;
        }
    }

    @ObfuscatedName("iu.c(IB)I")
    public int method3798(int arg0) {
        if (this.field3127[arg0] == null) {
            return this.field3161[arg0] ? 100 : class237.method3585(this.field3155, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("iu.dh(II)Z")
    public boolean method3895(int arg0) {
        return this.field3161[arg0];
    }

    @ObfuscatedName("iu.dy(IB)Z")
    public boolean method3896(int arg0) {
        return this.method3784(arg0) != null;
    }

    @ObfuscatedName("iu.dx(I)I")
    public int method3888() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3127.length; var3++) {
            if (this.field3134[var3] > 0) {
                var1 += 100;
                var2 += this.method3798(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
