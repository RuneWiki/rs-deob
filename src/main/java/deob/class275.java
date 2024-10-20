package deob;

import java.util.zip.CRC32;

@ObfuscatedName("js")
public class class275 extends class277 {

    @ObfuscatedName("js.v")
    public class334 field3564;

    @ObfuscatedName("js.j")
    public class334 field3566;

    @ObfuscatedName("js.l")
    public int field3563;

    @ObfuscatedName("js.n")
    public volatile boolean field3571 = false;

    @ObfuscatedName("js.w")
    public boolean field3567 = false;

    @ObfuscatedName("js.f")
    public volatile boolean[] field3568;

    @ObfuscatedName("js.o")
    public static CRC32 field3569 = new CRC32();

    @ObfuscatedName("js.x")
    public int field3570;

    @ObfuscatedName("js.r")
    public int field3561;

    @ObfuscatedName("js.p")
    public int field3572 = -1;

    public class275(class334 arg0, class334 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3564 = arg0;
        this.field3566 = arg1;
        this.field3563 = arg2;
        this.field3567 = arg5;
        int var8 = this.field3563;
        if (Statics.field3603 == null) {
            class278.method2366((class275) null, 255, 255, 0, (byte) 0, true);
            class278.field3612[var8] = this;
        } else {
            Statics.field3603.field4182 = var8 * 8 + 5;
            int var9 = Statics.field3603.method6182();
            int var10 = Statics.field3603.method6182();
            this.method4421(var9, var10);
        }
    }

    @ObfuscatedName("js.s(I)Z")
    public boolean method4417() {
        return this.field3571;
    }

    @ObfuscatedName("js.t(I)I")
    public int method4454() {
        if (this.field3571) {
            return 100;
        } else if (this.field3588 == null) {
            int var1 = this.field3563;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field3595 != null && Statics.field3595.field3966 == var2) {
                var4 = Statics.field1248.field4182 * 99 / (Statics.field1248.field4184.length - Statics.field3595.field3573) + 1;
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

    @ObfuscatedName("js.v(II)V")
    public void method4419(int arg0) {
        class278.method2371(this.field3563, arg0);
    }

    @ObfuscatedName("js.j(IB)V")
    public void method4420(int arg0) {
        if (this.field3564 == null || this.field3568 == null || !this.field3568[arg0]) {
            class278.method2366(this, this.field3563, arg0, this.field3584[arg0], (byte) 2, true);
            return;
        }
        class334 var2 = this.field3564;
        byte[] var4 = null;
        class296 var5 = class274.field3558;
        synchronized (class274.field3558) {
            for (class273 var6 = (class273) class274.field3558.method4721(); var6 != null; var6 = (class273) class274.field3558.method4712()) {
                if ((long) arg0 == var6.field3966 && var6.field3552 == var2 && var6.field3555 == 0) {
                    var4 = var6.field3551;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method5354(arg0);
            this.method4423(var2, arg0, var8, true);
        } else {
            this.method4423(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("js.l(III)V")
    public void method4421(int arg0, int arg1) {
        this.field3570 = arg0;
        this.field3561 = arg1;
        if (this.field3566 == null) {
            class278.method2366(this, 255, this.field3563, this.field3570, (byte) 0, true);
            return;
        }
        int var3 = this.field3563;
        class334 var4 = this.field3566;
        byte[] var6 = null;
        class296 var7 = class274.field3558;
        synchronized (class274.field3558) {
            for (class273 var8 = (class273) class274.field3558.method4721(); var8 != null; var8 = (class273) class274.field3558.method4712()) {
                if ((long) var3 == var8.field3966 && var8.field3552 == var4 && var8.field3555 == 0) {
                    var6 = var8.field3551;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method5354(var3);
            this.method4423(var4, var3, var10, true);
        } else {
            this.method4423(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("js.n(I[BZZI)V")
    public void method4445(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("js.w(Lln;I[BZI)V")
    public void method4423(class334 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("js.f(I)V")
    public void method4439() {
        this.field3568 = new boolean[this.field3588.length];
        for (int var1 = 0; var1 < this.field3568.length; var1++) {
            this.field3568[var1] = false;
        }
        if (this.field3564 == null) {
            this.field3571 = true;
            return;
        }
        this.field3572 = -1;
        for (int var2 = 0; var2 < this.field3568.length; var2++) {
            if (this.field3583[var2] > 0) {
                class334 var3 = this.field3564;
                class273 var5 = new class273();
                var5.field3555 = 1;
                var5.field3966 = (long) var2;
                var5.field3552 = var3;
                var5.field3550 = this;
                class296 var6 = class274.field3558;
                synchronized (class274.field3558) {
                    class274.field3558.method4706(var5);
                }
                Object var8 = class274.field3559;
                synchronized (class274.field3559) {
                    if (class274.field3557 == 0) {
                        Statics.field3560 = new Thread(new class274());
                        Statics.field3560.setDaemon(true);
                        Statics.field3560.start();
                        Statics.field3560.setPriority(5);
                    }
                    class274.field3557 = 600;
                }
                this.field3572 = var2;
            }
        }
        if (this.field3572 == -1) {
            this.field3571 = true;
        }
    }

    @ObfuscatedName("js.o(IB)I")
    public int method4427(int arg0) {
        if (this.field3588[arg0] != null) {
            return 100;
        } else if (this.field3568[arg0]) {
            return 100;
        } else {
            int var2 = this.field3563;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field3595 != null && Statics.field3595.field3966 == var3) {
                var5 = Statics.field1248.field4182 * 99 / (Statics.field1248.field4184.length - Statics.field3595.field3573) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("js.x(II)Z")
    public boolean method4426(int arg0) {
        return this.field3568[arg0];
    }

    @ObfuscatedName("js.r(II)Z")
    public boolean method4418(int arg0) {
        return this.method4521(arg0) != null;
    }

    @ObfuscatedName("js.p(I)I")
    public int method4428() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3588.length; var3++) {
            if (this.field3583[var3] > 0) {
                var1 += 100;
                var2 += this.method4427(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
