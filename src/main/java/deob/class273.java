package deob;

import java.util.zip.CRC32;

@ObfuscatedName("jp")
public class class273 extends class275 {

    @ObfuscatedName("jp.f")
    public class333 field3569;

    @ObfuscatedName("jp.y")
    public class333 field3570;

    @ObfuscatedName("jp.p")
    public int field3571;

    @ObfuscatedName("jp.j")
    public volatile boolean field3572 = false;

    @ObfuscatedName("jp.r")
    public boolean field3573 = false;

    @ObfuscatedName("jp.b")
    public volatile boolean[] field3574;

    @ObfuscatedName("jp.d")
    public static CRC32 field3575 = new CRC32();

    @ObfuscatedName("jp.s")
    public int field3578;

    @ObfuscatedName("jp.u")
    public int field3577;

    @ObfuscatedName("jp.l")
    public int field3567 = -1;

    public class273(class333 arg0, class333 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3569 = arg0;
        this.field3570 = arg1;
        this.field3571 = arg2;
        this.field3573 = arg5;
        class276.method3330(this, this.field3571);
    }

    @ObfuscatedName("jp.v(I)Z")
    public boolean method4421() {
        return this.field3572;
    }

    @ObfuscatedName("jp.n(B)I")
    public int method4422() {
        if (this.field3572) {
            return 100;
        } else if (this.field3588 == null) {
            int var1 = class276.method2281(255, this.field3571);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("jp.f(IB)V")
    public void method4423(int arg0) {
        class276.method4615(this.field3571, arg0);
    }

    @ObfuscatedName("jp.y(IB)V")
    public void method4424(int arg0) {
        if (this.field3569 == null || this.field3574 == null || !this.field3574[arg0]) {
            class276.method4384(this, this.field3571, arg0, this.field3587[arg0], (byte) 2, true);
            return;
        }
        class333 var2 = this.field3569;
        byte[] var4 = null;
        class294 var5 = class272.field3566;
        synchronized (class272.field3566) {
            for (class271 var6 = (class271) class272.field3566.method4714(); var6 != null; var6 = (class271) class272.field3566.method4741()) {
                if ((long) arg0 == var6.field3938 && var6.field3555 == var2 && var6.field3559 == 0) {
                    var4 = var6.field3556;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method5405(arg0);
            this.method4445(var2, arg0, var8, true);
        } else {
            this.method4445(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("jp.p(III)V")
    public void method4425(int arg0, int arg1) {
        this.field3578 = arg0;
        this.field3577 = arg1;
        if (this.field3570 == null) {
            class276.method4384(this, 255, this.field3571, this.field3578, (byte) 0, true);
            return;
        }
        int var3 = this.field3571;
        class333 var4 = this.field3570;
        byte[] var6 = null;
        class294 var7 = class272.field3566;
        synchronized (class272.field3566) {
            for (class271 var8 = (class271) class272.field3566.method4714(); var8 != null; var8 = (class271) class272.field3566.method4741()) {
                if ((long) var3 == var8.field3938 && var8.field3555 == var4 && var8.field3559 == 0) {
                    var6 = var8.field3556;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method5405(var3);
            this.method4445(var4, var3, var10, true);
        } else {
            this.method4445(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("jp.j(I[BZZI)V")
    public void method4426(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3586[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3586[arg0];
            if (this.field3569 != null) {
                class333 var12 = this.field3569;
                class271 var13 = new class271();
                var13.field3559 = 0;
                var13.field3938 = (long) arg0;
                var13.field3556 = arg1;
                var13.field3555 = var12;
                class294 var14 = class272.field3566;
                synchronized (class272.field3566) {
                    class272.field3566.method4709(var13);
                }
                Object var16 = class272.field3562;
                synchronized (class272.field3562) {
                    if (class272.field3563 == 0) {
                        Statics.field3565 = new Thread(new class272());
                        Statics.field3565.setDaemon(true);
                        Statics.field3565.start();
                        Statics.field3565.setPriority(5);
                    }
                    class272.field3563 = 600;
                }
                this.field3574[arg0] = true;
            }
            if (arg3) {
                this.field3588[arg0] = class251.method4623(arg1, false);
            }
            return;
        }
        if (this.field3572) {
            throw new RuntimeException();
        }
        if (this.field3570 != null) {
            int var5 = this.field3571;
            class333 var6 = this.field3570;
            class271 var7 = new class271();
            var7.field3559 = 0;
            var7.field3938 = (long) var5;
            var7.field3556 = arg1;
            var7.field3555 = var6;
            class294 var8 = class272.field3566;
            synchronized (class272.field3566) {
                class272.field3566.method4709(var7);
            }
            Object var10 = class272.field3562;
            synchronized (class272.field3562) {
                if (class272.field3563 == 0) {
                    Statics.field3565 = new Thread(new class272());
                    Statics.field3565.setDaemon(true);
                    Statics.field3565.start();
                    Statics.field3565.setPriority(5);
                }
                class272.field3563 = 600;
            }
        }
        this.method4466(arg1);
        this.method4431();
    }

    @ObfuscatedName("jp.r(Llh;I[BZB)V")
    public void method4445(class333 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3570 != arg0) {
            if (!arg3 && this.field3567 == arg1) {
                this.field3572 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3574[arg1] = false;
                if (this.field3573 || arg3) {
                    class276.method4384(this, this.field3571, arg1, this.field3587[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3575.reset();
            field3575.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3575.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3587[arg1] != var9 || this.field3586[arg1] != var10) {
                this.field3574[arg1] = false;
                if (this.field3573 || arg3) {
                    class276.method4384(this, this.field3571, arg1, this.field3587[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3574[arg1] = true;
            if (arg3) {
                this.field3588[arg1] = class251.method4623(arg2, false);
            }
            return;
        }
        if (this.field3572) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class276.method4384(this, 255, this.field3571, this.field3578, (byte) 0, true);
            return;
        }
        field3575.reset();
        field3575.update(arg2, 0, arg2.length);
        int var5 = (int) field3575.getValue();
        if (this.field3578 != var5) {
            class276.method4384(this, 255, this.field3571, this.field3578, (byte) 0, true);
            return;
        }
        class383 var6 = new class383(class275.method2277(arg2));
        int var7 = var6.method5965();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3571 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method5970();
        }
        if (this.field3577 != var8) {
            class276.method4384(this, 255, this.field3571, this.field3578, (byte) 0, true);
            return;
        }
        this.method4466(arg2);
        this.method4431();
    }

    @ObfuscatedName("jp.b(I)V")
    public void method4431() {
        this.field3574 = new boolean[this.field3588.length];
        for (int var1 = 0; var1 < this.field3574.length; var1++) {
            this.field3574[var1] = false;
        }
        if (this.field3569 == null) {
            this.field3572 = true;
            return;
        }
        this.field3567 = -1;
        for (int var2 = 0; var2 < this.field3574.length; var2++) {
            if (this.field3589[var2] > 0) {
                class333 var3 = this.field3569;
                class271 var5 = new class271();
                var5.field3559 = 1;
                var5.field3938 = (long) var2;
                var5.field3555 = var3;
                var5.field3558 = this;
                class294 var6 = class272.field3566;
                synchronized (class272.field3566) {
                    class272.field3566.method4709(var5);
                }
                Object var8 = class272.field3562;
                synchronized (class272.field3562) {
                    if (class272.field3563 == 0) {
                        Statics.field3565 = new Thread(new class272());
                        Statics.field3565.setDaemon(true);
                        Statics.field3565.start();
                        Statics.field3565.setPriority(5);
                    }
                    class272.field3563 = 600;
                }
                this.field3567 = var2;
            }
        }
        if (this.field3567 == -1) {
            this.field3572 = true;
        }
    }

    @ObfuscatedName("jp.d(II)I")
    public int method4450(int arg0) {
        if (this.field3588[arg0] == null) {
            return this.field3574[arg0] ? 100 : class276.method2281(this.field3571, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("jp.s(II)Z")
    public boolean method4436(int arg0) {
        return this.field3574[arg0];
    }

    @ObfuscatedName("jp.u(II)Z")
    public boolean method4439(int arg0) {
        return this.method4477(arg0) != null;
    }

    @ObfuscatedName("jp.l(I)I")
    public int method4430() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3588.length; var3++) {
            if (this.field3589[var3] > 0) {
                var1 += 100;
                var2 += this.method4450(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
