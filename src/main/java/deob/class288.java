package deob;

import java.util.zip.CRC32;

@ObfuscatedName("kx")
public class class288 extends class290 {

    @ObfuscatedName("kx.m")
    public class347 field3685;

    @ObfuscatedName("kx.k")
    public class347 field3691;

    @ObfuscatedName("kx.o")
    public int field3687;

    @ObfuscatedName("kx.g")
    public volatile boolean field3688 = false;

    @ObfuscatedName("kx.z")
    public boolean field3689 = false;

    @ObfuscatedName("kx.a")
    public volatile boolean[] field3690;

    @ObfuscatedName("kx.u")
    public static CRC32 field3683 = new CRC32();

    @ObfuscatedName("kx.e")
    public int field3692;

    @ObfuscatedName("kx.l")
    public int field3693;

    @ObfuscatedName("kx.y")
    public int field3694 = -1;

    public class288(class347 arg0, class347 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3685 = arg0;
        this.field3691 = arg1;
        this.field3687 = arg2;
        this.field3689 = arg5;
        class291.method3508(this, this.field3687);
    }

    @ObfuscatedName("kx.n(I)Z")
    public boolean method4664() {
        return this.field3688;
    }

    @ObfuscatedName("kx.c(I)I")
    public int method4669() {
        if (this.field3688) {
            return 100;
        } else if (this.field3711 == null) {
            int var1 = class291.method2365(255, this.field3687);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("kx.m(II)V")
    public void method4666(int arg0) {
        class291.method4631(this.field3687, arg0);
    }

    @ObfuscatedName("kx.k(II)V")
    public void method4695(int arg0) {
        if (this.field3685 == null || this.field3690 == null || !this.field3690[arg0]) {
            class291.method5492(this, this.field3687, arg0, this.field3706[arg0], (byte) 2, true);
        } else {
            class287.method3391(arg0, this.field3685, this);
        }
    }

    @ObfuscatedName("kx.o(III)V")
    public void method4667(int arg0, int arg1) {
        this.field3692 = arg0;
        this.field3693 = arg1;
        if (this.field3691 == null) {
            class291.method5492(this, 255, this.field3687, this.field3692, (byte) 0, true);
        } else {
            class287.method3391(this.field3687, this.field3691, this);
        }
    }

    @ObfuscatedName("kx.g(I[BZZB)V")
    public void method4704(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3707[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3707[arg0];
            if (this.field3685 != null) {
                class347 var10 = this.field3685;
                class286 var11 = new class286();
                var11.field3674 = 0;
                var11.field4056 = (long) arg0;
                var11.field3671 = arg1;
                var11.field3672 = var10;
                class309 var12 = class287.field3675;
                synchronized (class287.field3675) {
                    class287.field3675.method4986(var11);
                }
                class287.method2366();
                this.field3690[arg0] = true;
            }
            if (arg3) {
                this.field3711[arg0] = class266.method4122(arg1, false);
            }
            return;
        }
        if (this.field3688) {
            throw new RuntimeException();
        }
        if (this.field3691 != null) {
            int var5 = this.field3687;
            class347 var6 = this.field3691;
            class286 var7 = new class286();
            var7.field3674 = 0;
            var7.field4056 = (long) var5;
            var7.field3671 = arg1;
            var7.field3672 = var6;
            class309 var8 = class287.field3675;
            synchronized (class287.field3675) {
                class287.field3675.method4986(var7);
            }
            class287.method2366();
        }
        this.method4708(arg1);
        this.method4671();
    }

    @ObfuscatedName("kx.z(Lms;I[BZB)V")
    public void method4670(class347 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3691 != arg0) {
            if (!arg3 && this.field3694 == arg1) {
                this.field3688 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3690[arg1] = false;
                if (this.field3689 || arg3) {
                    class291.method5492(this, this.field3687, arg1, this.field3706[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3683.reset();
            field3683.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3683.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3706[arg1] != var9 || this.field3707[arg1] != var10) {
                this.field3690[arg1] = false;
                if (this.field3689 || arg3) {
                    class291.method5492(this, this.field3687, arg1, this.field3706[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3690[arg1] = true;
            if (arg3) {
                this.field3711[arg1] = class266.method4122(arg2, false);
            }
            return;
        }
        if (this.field3688) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class291.method5492(this, 255, this.field3687, this.field3692, (byte) 0, true);
            return;
        }
        field3683.reset();
        field3683.update(arg2, 0, arg2.length);
        int var5 = (int) field3683.getValue();
        if (this.field3692 != var5) {
            class291.method5492(this, 255, this.field3687, this.field3692, (byte) 0, true);
            return;
        }
        class400 var6 = new class400(class290.method2468(arg2));
        int var7 = var6.method6217();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3687 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method6222();
        }
        if (this.field3693 != var8) {
            class291.method5492(this, 255, this.field3687, this.field3692, (byte) 0, true);
            return;
        }
        this.method4708(arg2);
        this.method4671();
    }

    @ObfuscatedName("kx.a(I)V")
    public void method4671() {
        this.field3690 = new boolean[this.field3711.length];
        for (int var1 = 0; var1 < this.field3690.length; var1++) {
            this.field3690[var1] = false;
        }
        if (this.field3685 == null) {
            this.field3688 = true;
            return;
        }
        this.field3694 = -1;
        for (int var2 = 0; var2 < this.field3690.length; var2++) {
            if (this.field3708[var2] > 0) {
                class347 var3 = this.field3685;
                class286 var5 = new class286();
                var5.field3674 = 1;
                var5.field4056 = (long) var2;
                var5.field3672 = var3;
                var5.field3673 = this;
                class309 var6 = class287.field3675;
                synchronized (class287.field3675) {
                    class287.field3675.method4986(var5);
                }
                class287.method2366();
                this.field3694 = var2;
            }
        }
        if (this.field3694 == -1) {
            this.field3688 = true;
        }
    }

    @ObfuscatedName("kx.u(II)I")
    public int method4672(int arg0) {
        if (this.field3711[arg0] == null) {
            return this.field3690[arg0] ? 100 : class291.method2365(this.field3687, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("kx.e(II)Z")
    public boolean method4673(int arg0) {
        return this.field3690[arg0];
    }

    @ObfuscatedName("kx.l(IB)Z")
    public boolean method4682(int arg0) {
        return this.method4719(arg0) != null;
    }

    @ObfuscatedName("kx.y(I)I")
    public int method4675() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3711.length; var3++) {
            if (this.field3708[var3] > 0) {
                var1 += 100;
                var2 += this.method4672(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
