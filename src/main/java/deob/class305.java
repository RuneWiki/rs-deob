package deob;

import java.util.zip.CRC32;

@ObfuscatedName("kz")
public class class305 extends class307 {

    @ObfuscatedName("kz.s")
    public class365 field3879;

    @ObfuscatedName("kz.e")
    public class365 field3877;

    @ObfuscatedName("kz.r")
    public int field3878;

    @ObfuscatedName("kz.o")
    public volatile boolean field3874 = false;

    @ObfuscatedName("kz.i")
    public boolean field3880 = false;

    @ObfuscatedName("kz.w")
    public volatile boolean[] field3881;

    @ObfuscatedName("kz.v")
    public static CRC32 field3882 = new CRC32();

    @ObfuscatedName("kz.a")
    public int field3876;

    @ObfuscatedName("kz.y")
    public int field3884;

    @ObfuscatedName("kz.u")
    public int field3885 = -1;

    public class305(class365 arg0, class365 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3879 = arg0;
        this.field3877 = arg1;
        this.field3878 = arg2;
        this.field3880 = arg5;
        int var8 = this.field3878;
        if (Statics.field4123 == null) {
            class308.method4360((class305) null, 255, 255, 0, (byte) 0, true);
            class308.field3929[var8] = this;
        } else {
            Statics.field4123.field4512 = var8 * 8 + 5;
            int var9 = Statics.field4123.method6669();
            int var10 = Statics.field4123.method6669();
            this.method4979(var9, var10);
        }
    }

    @ObfuscatedName("kz.c(I)Z")
    public boolean method4975() {
        return this.field3874;
    }

    @ObfuscatedName("kz.l(I)I")
    public int method4976() {
        if (this.field3874) {
            return 100;
        } else if (this.field3896 == null) {
            int var1 = this.field3878;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field110 != null && Statics.field110.field4301 == var2) {
                var4 = Statics.field3926.field4512 * 99 / (Statics.field3926.field4511.length - Statics.field110.field3892) + 1;
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

    @ObfuscatedName("kz.s(II)V")
    public void method4977(int arg0) {
        int var2 = this.field3878;
        long var3 = (long) ((var2 << 16) + arg0);
        class306 var5 = (class306) class308.field3914.method6456(var3);
        if (var5 != null) {
            class308.field3919.method5259(var5);
        }
    }

    @ObfuscatedName("kz.e(IB)V")
    public void method4978(int arg0) {
        if (this.field3879 == null || this.field3881 == null || !this.field3881[arg0]) {
            class308.method4360(this, this.field3878, arg0, this.field3899[arg0], (byte) 2, true);
        } else {
            class304.method2573(arg0, this.field3879, this);
        }
    }

    @ObfuscatedName("kz.r(III)V")
    public void method4979(int arg0, int arg1) {
        this.field3876 = arg0;
        this.field3884 = arg1;
        if (this.field3877 == null) {
            class308.method4360(this, 255, this.field3878, this.field3876, (byte) 0, true);
        } else {
            class304.method2573(this.field3878, this.field3877, this);
        }
    }

    @ObfuscatedName("kz.o(I[BZZI)V")
    public void method4980(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("kz.i(Lnb;I[BZI)V")
    public void method4981(class365 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("kz.w(I)V")
    public void method5023() {
        this.field3881 = new boolean[this.field3896.length];
        for (int var1 = 0; var1 < this.field3881.length; var1++) {
            this.field3881[var1] = false;
        }
        if (this.field3879 == null) {
            this.field3874 = true;
            return;
        }
        this.field3885 = -1;
        for (int var2 = 0; var2 < this.field3881.length; var2++) {
            if (this.field3901[var2] > 0) {
                class304.method2298(var2, this.field3879, this);
                this.field3885 = var2;
            }
        }
        if (this.field3885 == -1) {
            this.field3874 = true;
        }
    }

    @ObfuscatedName("kz.v(IB)I")
    public int method4983(int arg0) {
        if (this.field3896[arg0] != null) {
            return 100;
        } else if (this.field3881[arg0]) {
            return 100;
        } else {
            int var2 = this.field3878;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field110 != null && Statics.field110.field4301 == var3) {
                var5 = Statics.field3926.field4512 * 99 / (Statics.field3926.field4511.length - Statics.field110.field3892) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("kz.a(II)Z")
    public boolean method5011(int arg0) {
        return this.field3881[arg0];
    }

    @ObfuscatedName("kz.y(II)Z")
    public boolean method4984(int arg0) {
        return this.method5084(arg0) != null;
    }

    @ObfuscatedName("kz.u(B)I")
    public int method4986() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3896.length; var3++) {
            if (this.field3901[var3] > 0) {
                var1 += 100;
                var2 += this.method4983(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
