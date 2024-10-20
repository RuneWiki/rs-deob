package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ky")
public class class288 extends class290 {

    @ObfuscatedName("ky.f")
    public class348 field3678;

    @ObfuscatedName("ky.j")
    public class348 field3679;

    @ObfuscatedName("ky.m")
    public int field3686;

    @ObfuscatedName("ky.k")
    public volatile boolean field3687 = false;

    @ObfuscatedName("ky.t")
    public boolean field3684 = false;

    @ObfuscatedName("ky.a")
    public volatile boolean[] field3683;

    @ObfuscatedName("ky.e")
    public static CRC32 field3682 = new CRC32();

    @ObfuscatedName("ky.i")
    public int field3685;

    @ObfuscatedName("ky.y")
    public int field3681;

    @ObfuscatedName("ky.w")
    public int field3677 = -1;

    public class288(class348 arg0, class348 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3678 = arg0;
        this.field3679 = arg1;
        this.field3686 = arg2;
        this.field3684 = arg5;
        class291.method2359(this, this.field3686);
    }

    @ObfuscatedName("ky.l(B)Z")
    public boolean method4738() {
        return this.field3687;
    }

    @ObfuscatedName("ky.q(B)I")
    public int method4708() {
        if (this.field3687) {
            return 100;
        } else if (this.field3704 == null) {
            int var1 = class291.method4705(255, this.field3686);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ky.f(IB)V")
    public void method4730(int arg0) {
        class291.method2627(this.field3686, arg0);
    }

    @ObfuscatedName("ky.j(IB)V")
    public void method4733(int arg0) {
        if (this.field3678 == null || this.field3683 == null || !this.field3683[arg0]) {
            class291.method2483(this, this.field3686, arg0, this.field3706[arg0], (byte) 2, true);
            return;
        }
        class348 var2 = this.field3678;
        byte[] var4 = null;
        class309 var5 = class287.field3674;
        synchronized (class287.field3674) {
            for (class286 var6 = (class286) class287.field3674.method5035(); var6 != null; var6 = (class286) class287.field3674.method5022()) {
                if ((long) arg0 == var6.field4075 && var6.field3668 == var2 && var6.field3671 == 0) {
                    var4 = var6.field3667;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method5663(arg0);
            this.method4713(var2, arg0, var8, true);
        } else {
            this.method4713(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ky.m(III)V")
    public void method4751(int arg0, int arg1) {
        this.field3685 = arg0;
        this.field3681 = arg1;
        if (this.field3679 == null) {
            class291.method2483(this, 255, this.field3686, this.field3685, (byte) 0, true);
            return;
        }
        int var3 = this.field3686;
        class348 var4 = this.field3679;
        byte[] var6 = null;
        class309 var7 = class287.field3674;
        synchronized (class287.field3674) {
            for (class286 var8 = (class286) class287.field3674.method5035(); var8 != null; var8 = (class286) class287.field3674.method5022()) {
                if ((long) var3 == var8.field4075 && var8.field3668 == var4 && var8.field3671 == 0) {
                    var6 = var8.field3667;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method5663(var3);
            this.method4713(var4, var3, var10, true);
        } else {
            this.method4713(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ky.k(I[BZZI)V")
    public void method4712(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3687) {
                throw new RuntimeException();
            }
            if (this.field3679 != null) {
                class287.method2626(this.field3686, arg1, this.field3679);
            }
            this.method4755(arg1);
            this.method4706();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3699[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3699[arg0];
        if (this.field3678 != null) {
            class287.method2626(arg0, arg1, this.field3678);
            this.field3683[arg0] = true;
        }
        if (arg3) {
            this.field3704[arg0] = class266.method365(arg1, false);
        }
    }

    @ObfuscatedName("ky.t(Lmm;I[BZB)V")
    public void method4713(class348 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ky.a(I)V")
    public void method4706() {
        this.field3683 = new boolean[this.field3704.length];
        for (int var1 = 0; var1 < this.field3683.length; var1++) {
            this.field3683[var1] = false;
        }
        if (this.field3678 == null) {
            this.field3687 = true;
            return;
        }
        this.field3677 = -1;
        for (int var2 = 0; var2 < this.field3683.length; var2++) {
            if (this.field3702[var2] > 0) {
                class287.method2506(var2, this.field3678, this);
                this.field3677 = var2;
            }
        }
        if (this.field3677 == -1) {
            this.field3687 = true;
        }
    }

    @ObfuscatedName("ky.e(IB)I")
    public int method4714(int arg0) {
        if (this.field3704[arg0] == null) {
            return this.field3683[arg0] ? 100 : class291.method4705(this.field3686, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ky.i(II)Z")
    public boolean method4716(int arg0) {
        return this.field3683[arg0];
    }

    @ObfuscatedName("ky.y(IB)Z")
    public boolean method4717(int arg0) {
        return this.method4765(arg0) != null;
    }

    @ObfuscatedName("ky.w(I)I")
    public int method4715() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3704.length; var3++) {
            if (this.field3702[var3] > 0) {
                var1 += 100;
                var2 += this.method4714(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
