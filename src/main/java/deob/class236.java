package deob;

import java.util.zip.CRC32;

@ObfuscatedName("if")
public class class236 extends class234 {

    @ObfuscatedName("if.m")
    public class308 field3130;

    @ObfuscatedName("if.g")
    public class308 field3133;

    @ObfuscatedName("if.r")
    public int field3128;

    @ObfuscatedName("if.q")
    public volatile boolean field3131 = false;

    @ObfuscatedName("if.aa")
    public boolean field3132 = false;

    @ObfuscatedName("if.av")
    public volatile boolean[] field3137;

    @ObfuscatedName("if.aw")
    public static CRC32 field3134 = new CRC32();

    @ObfuscatedName("if.as")
    public int field3135;

    @ObfuscatedName("if.ak")
    public int field3136;

    @ObfuscatedName("if.au")
    public int field3129 = -1;

    public class236(class308 arg0, class308 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3130 = arg0;
        this.field3133 = arg1;
        this.field3128 = arg2;
        this.field3132 = arg5;
        class237.method721(this, this.field3128);
    }

    @ObfuscatedName("if.de(B)Z")
    public boolean method3873() {
        return this.field3131;
    }

    @ObfuscatedName("if.df(I)I")
    public int method3874() {
        if (this.field3131) {
            return 100;
        } else if (this.field3114 == null) {
            int var1 = class237.method3189(255, this.field3128);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("if.i(II)V")
    public void method3829(int arg0) {
        int var2 = this.field3128;
        long var3 = (long) ((var2 << 16) + arg0);
        class233 var5 = (class233) class237.field3138.method5499(var3);
        if (var5 != null) {
            class237.field3144.method4431(var5);
        }
    }

    @ObfuscatedName("if.l(II)V")
    public void method3762(int arg0) {
        if (this.field3130 == null || this.field3137 == null || !this.field3137[arg0]) {
            class237.method3735(this, this.field3128, arg0, this.field3108[arg0], (byte) 2, true);
        } else {
            class235.method480(arg0, this.field3130, this);
        }
    }

    @ObfuscatedName("if.di(III)V")
    public void method3875(int arg0, int arg1) {
        this.field3135 = arg0;
        this.field3136 = arg1;
        if (this.field3133 == null) {
            class237.method3735(this, 255, this.field3128, this.field3135, (byte) 0, true);
        } else {
            class235.method480(this.field3128, this.field3133, this);
        }
    }

    @ObfuscatedName("if.dr(I[BZZI)V")
    public void method3876(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("if.dg(Lkg;I[BZI)V")
    public void method3877(class308 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("if.dh(I)V")
    public void method3890() {
        this.field3137 = new boolean[this.field3114.length];
        for (int var1 = 0; var1 < this.field3137.length; var1++) {
            this.field3137[var1] = false;
        }
        if (this.field3130 == null) {
            this.field3131 = true;
            return;
        }
        this.field3129 = -1;
        for (int var2 = 0; var2 < this.field3137.length; var2++) {
            if (this.field3110[var2] > 0) {
                class235.method166(var2, this.field3130, this);
                this.field3129 = var2;
            }
        }
        if (this.field3129 == -1) {
            this.field3131 = true;
        }
    }

    @ObfuscatedName("if.a(IS)I")
    public int method3758(int arg0) {
        if (this.field3114[arg0] == null) {
            return this.field3137[arg0] ? 100 : class237.method3189(this.field3128, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("if.dl(II)Z")
    public boolean method3886(int arg0) {
        return this.field3137[arg0];
    }

    @ObfuscatedName("if.da(II)Z")
    public boolean method3893(int arg0) {
        return this.method3808(arg0) != null;
    }

    @ObfuscatedName("if.dp(I)I")
    public int method3897() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3114.length; var3++) {
            if (this.field3110[var3] > 0) {
                var1 += 100;
                var2 += this.method3758(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
