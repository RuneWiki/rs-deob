package deob;

import java.util.zip.CRC32;

@ObfuscatedName("oh")
public class class369 extends class371 {

    @ObfuscatedName("oh.au")
    public class455 field4280;

    @ObfuscatedName("oh.aa")
    public class455 field4292;

    @ObfuscatedName("oh.ac")
    public int field4282;

    @ObfuscatedName("oh.al")
    public volatile int field4281 = 0;

    @ObfuscatedName("oh.az")
    public boolean field4290 = false;

    @ObfuscatedName("oh.ap")
    public volatile boolean[] field4285;

    @ObfuscatedName("oh.av")
    public static CRC32 field4286 = new CRC32();

    @ObfuscatedName("oh.ax")
    public int field4287;

    @ObfuscatedName("oh.as")
    public int field4288;

    @ObfuscatedName("oh.ay")
    public int field4289 = -1;

    @ObfuscatedName("oh.ak")
    public boolean field4284 = false;

    @ObfuscatedName("oh.aj")
    public boolean field4291 = false;

    @ObfuscatedName("oh.am")
    public class372 field4277;

    public class369(class455 arg0, class455 arg1, class372 arg2, int arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8) {
        super(arg4, arg5);
        this.field4280 = arg0;
        this.field4292 = arg1;
        this.field4282 = arg3;
        this.field4290 = arg6;
        this.field4284 = arg7;
        this.field4291 = arg8;
        this.field4277 = arg2;
        this.field4277.method6369(this, this.field4282);
    }

    @ObfuscatedName("oh.at(I)Z")
    public boolean method6232() {
        return this.field4281 == 1;
    }

    @ObfuscatedName("oh.ah(I)I")
    public int method6233() {
        if (this.field4281 == 1 || this.field4284 && this.field4281 == 2) {
            return 100;
        } else if (this.field4312 == null) {
            int var1 = this.field4277.method6373(255, this.field4282);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("oh.ar(II)V")
    public void method6234(int arg0) {
        this.field4277.method6372(this.field4282, arg0);
    }

    @ObfuscatedName("oh.ao(II)V")
    public void method6252(int arg0) {
        if (this.field4280 == null || this.field4285 == null || !this.field4285[arg0]) {
            this.field4277.method6376(this, this.field4282, arg0, this.field4306[arg0], (byte) 2, true);
            return;
        }
        class455 var2 = this.field4280;
        byte[] var4 = null;
        class390 var5 = class368.field4274;
        synchronized (class368.field4274) {
            for (class367 var6 = (class367) class368.field4274.method6579(); var6 != null; var6 = (class367) class368.field4274.method6549()) {
                if ((long) arg0 == var6.field4849 && var6.field4266 == var2 && var6.field4265 == 0) {
                    var4 = var6.field4268;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method7586(arg0);
            this.method6239(var2, arg0, var8, true);
        } else {
            this.method6239(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("oh.ab(I)V")
    public void method6236() {
        this.field4281 = 2;
        this.field4303 = new int[0];
        this.field4306 = new int[0];
        this.field4318 = new int[0];
        this.field4308 = new int[0];
        this.field4309 = new int[0][];
        this.field4312 = new Object[0];
        this.field4313 = new Object[0][];
    }

    @ObfuscatedName("oh.au(III)V")
    public void method6237(int arg0, int arg1) {
        this.field4287 = arg0;
        this.field4288 = arg1;
        if (this.field4292 == null) {
            this.field4277.method6376(this, 255, this.field4282, this.field4287, (byte) 0, true);
            return;
        }
        int var3 = this.field4282;
        class455 var4 = this.field4292;
        byte[] var6 = null;
        class390 var7 = class368.field4274;
        synchronized (class368.field4274) {
            for (class367 var8 = (class367) class368.field4274.method6579(); var8 != null; var8 = (class367) class368.field4274.method6549()) {
                if ((long) var3 == var8.field4849 && var8.field4266 == var4 && var8.field4265 == 0) {
                    var6 = var8.field4268;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method7586(var3);
            this.method6239(var4, var3, var10, true);
        } else {
            this.method6239(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("oh.aa(I[BZZI)V")
    public void method6240(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field4281 == 1) {
                throw new RuntimeException();
            }
            if (this.field4292 != null) {
                class368.method4009(this.field4282, arg1, this.field4292);
            }
            this.method6286(arg1);
            this.method6280();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field4318[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field4318[arg0];
        if (this.field4280 != null) {
            class368.method4009(arg0, arg1, this.field4280);
            this.field4285[arg0] = true;
        }
        if (arg3) {
            this.field4312[arg0] = class346.method3287(arg1, false);
        }
    }

    @ObfuscatedName("oh.ac(Lrg;I[BZB)V")
    public void method6239(class455 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field4292 != arg0) {
            if (!arg3 && this.field4289 == arg1) {
                this.field4281 = 1;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field4285[arg1] = false;
                if (this.field4290 || arg3) {
                    this.field4277.method6376(this, this.field4282, arg1, this.field4306[arg1], (byte) 2, arg3);
                }
                return;
            }
            field4286.reset();
            field4286.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field4286.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field4306[arg1] != var9 || this.field4318[arg1] != var10) {
                this.field4285[arg1] = false;
                if (this.field4290 || arg3) {
                    this.field4277.method6376(this, this.field4282, arg1, this.field4306[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field4285[arg1] = true;
            if (arg3) {
                this.field4312[arg1] = class346.method3287(arg2, false);
            }
            return;
        }
        if (this.field4281 == 1) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            this.field4277.method6376(this, 255, this.field4282, this.field4287, (byte) 0, true);
            return;
        }
        field4286.reset();
        field4286.update(arg2, 0, arg2.length);
        int var5 = (int) field4286.getValue();
        if (this.field4287 != var5) {
            this.field4277.method6376(this, 255, this.field4282, this.field4287, (byte) 0, true);
            return;
        }
        class527 var6 = new class527(class371.method460(arg2));
        int var7 = var6.method8410();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field4282 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method8416();
        }
        if (this.field4288 != var8) {
            this.field4277.method6376(this, 255, this.field4282, this.field4287, (byte) 0, true);
            return;
        }
        this.method6286(arg2);
        this.method6280();
    }

    @ObfuscatedName("oh.al(I)V")
    public void method6280() {
        this.field4285 = new boolean[this.field4312.length];
        for (int var1 = 0; var1 < this.field4285.length; var1++) {
            this.field4285[var1] = false;
        }
        if (this.field4280 == null) {
            this.field4281 = 1;
            return;
        }
        this.field4289 = -1;
        for (int var2 = 0; var2 < this.field4285.length; var2++) {
            if (this.field4308[var2] > 0) {
                class455 var3 = this.field4280;
                class367 var5 = new class367();
                var5.field4265 = 1;
                var5.field4849 = (long) var2;
                var5.field4266 = var3;
                var5.field4267 = this;
                class390 var6 = class368.field4274;
                synchronized (class368.field4274) {
                    class368.field4274.method6547(var5);
                }
                Object var8 = class368.field4273;
                synchronized (class368.field4273) {
                    if (class368.field4272 == 0) {
                        Statics.field4271 = new Thread(new class368());
                        Statics.field4271.setDaemon(true);
                        Statics.field4271.start();
                        Statics.field4271.setPriority(5);
                    }
                    class368.field4272 = 600;
                    class368.field4275 = false;
                }
                this.field4289 = var2;
            }
        }
        if (this.field4289 == -1) {
            this.field4281 = 1;
        }
    }

    @ObfuscatedName("oh.az(II)I")
    public int method6241(int arg0) {
        if (this.field4312[arg0] == null) {
            return this.field4285[arg0] ? 100 : this.field4277.method6373(this.field4282, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("oh.ap(II)Z")
    public boolean method6242(int arg0) {
        return this.field4285[arg0];
    }

    @ObfuscatedName("oh.av(IB)Z")
    public boolean method6243(int arg0) {
        return this.method6295(arg0) != null;
    }

    @ObfuscatedName("oh.ax(I)I")
    public int method6256() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4312.length; var3++) {
            if (this.field4308[var3] > 0) {
                var1 += 100;
                var2 += this.method6241(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
