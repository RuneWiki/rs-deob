package deob;

import java.util.zip.CRC32;

@ObfuscatedName("oz")
public class class385 extends class388 {

    @ObfuscatedName("oz.an")
    public class483 field4495;

    @ObfuscatedName("oz.aj")
    public class483 field4487;

    @ObfuscatedName("oz.av")
    public int field4483;

    @ObfuscatedName("oz.ab")
    public volatile int field4484 = 0;

    @ObfuscatedName("oz.ai")
    public boolean field4485 = false;

    @ObfuscatedName("oz.ae")
    public volatile boolean[] field4486;

    @ObfuscatedName("oz.au")
    public static CRC32 field4492 = new CRC32();

    @ObfuscatedName("oz.ah")
    public int field4488;

    @ObfuscatedName("oz.az")
    public int field4478;

    @ObfuscatedName("oz.ax")
    public int field4490 = -1;

    @ObfuscatedName("oz.ac")
    public boolean field4491 = false;

    @ObfuscatedName("oz.al")
    public boolean field4489 = false;

    @ObfuscatedName("oz.ay")
    public class389 field4493;

    public class385(class483 arg0, class483 arg1, class389 arg2, int arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8) {
        super(arg4, arg5);
        this.field4495 = arg0;
        this.field4487 = arg1;
        this.field4483 = arg3;
        this.field4485 = arg6;
        this.field4491 = arg7;
        this.field4489 = arg8;
        this.field4493 = arg2;
        this.field4493.method6624(this, this.field4483);
    }

    @ObfuscatedName("oz.aq(I)Z")
    public boolean method6487() {
        return this.field4484 == 1;
    }

    @ObfuscatedName("oz.ad(I)I")
    public int method6488() {
        if (this.field4484 == 1 || this.field4491 && this.field4484 == 2) {
            return 100;
        } else if (this.field4533 == null) {
            int var1 = this.field4493.method6636(class386.field4514.field4519, this.field4483);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("oz.ag(IB)V")
    public void method6528(int arg0) {
        this.field4493.method6630(this.field4483, arg0);
    }

    @ObfuscatedName("oz.ak(II)V")
    public void method6524(int arg0) {
        if (this.field4495 == null || this.field4486 == null || !this.field4486[arg0]) {
            this.field4493.method6626(this, this.field4483, arg0, this.field4535[arg0], (byte) 2, true);
        } else {
            class384.method5822(arg0, this.field4495, this);
        }
    }

    @ObfuscatedName("oz.ap(I)V")
    public void method6491() {
        this.field4484 = 2;
        this.field4528 = new int[0];
        this.field4535 = new int[0];
        this.field4532 = new int[0];
        this.field4541 = new int[0];
        this.field4534 = new int[0][];
        this.field4533 = new Object[0];
        this.field4538 = new Object[0][];
    }

    @ObfuscatedName("oz.an(III)V")
    public void method6492(int arg0, int arg1) {
        this.field4488 = arg0;
        this.field4478 = arg1;
        if (this.field4487 == null) {
            this.field4493.method6626(this, class386.field4514.field4519, this.field4483, this.field4488, (byte) 0, true);
        } else {
            class384.method5822(this.field4483, this.field4487, this);
        }
    }

    @ObfuscatedName("oz.aj(I[BZZI)V")
    public void method6514(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field4532[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field4532[arg0];
            if (this.field4495 != null) {
                class483 var12 = this.field4495;
                class383 var13 = new class383();
                var13.field4466 = 0;
                var13.field5082 = (long) arg0;
                var13.field4465 = arg1;
                var13.field4467 = var12;
                class407 var14 = class384.field4475;
                synchronized (class384.field4475) {
                    class384.field4475.method6794(var13);
                }
                Object var16 = class384.field4473;
                synchronized (class384.field4473) {
                    if (class384.field4469 == 0) {
                        Statics.field2712 = new Thread(new class384());
                        Statics.field2712.setDaemon(true);
                        Statics.field2712.start();
                        Statics.field2712.setPriority(5);
                    }
                    class384.field4469 = 600;
                    class384.field4471 = false;
                }
                this.field4486[arg0] = true;
            }
            if (arg3) {
                this.field4533[arg0] = class361.method5537(arg1, false);
            }
            return;
        }
        if (this.field4484 == 1) {
            throw new RuntimeException();
        }
        if (this.field4487 != null) {
            int var5 = this.field4483;
            class483 var6 = this.field4487;
            class383 var7 = new class383();
            var7.field4466 = 0;
            var7.field5082 = (long) var5;
            var7.field4465 = arg1;
            var7.field4467 = var6;
            class407 var8 = class384.field4475;
            synchronized (class384.field4475) {
                class384.field4475.method6794(var7);
            }
            Object var10 = class384.field4473;
            synchronized (class384.field4473) {
                if (class384.field4469 == 0) {
                    Statics.field2712 = new Thread(new class384());
                    Statics.field2712.setDaemon(true);
                    Statics.field2712.start();
                    Statics.field2712.setPriority(5);
                }
                class384.field4469 = 600;
                class384.field4471 = false;
            }
        }
        this.method6538(arg1);
        this.method6495();
    }

    @ObfuscatedName("oz.av(Lsq;I[BZS)V")
    public void method6525(class483 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field4487 != arg0) {
            if (!arg3 && this.field4490 == arg1) {
                this.field4484 = 1;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field4486[arg1] = false;
                if (this.field4485 || arg3) {
                    this.field4493.method6626(this, this.field4483, arg1, this.field4535[arg1], (byte) 2, arg3);
                }
                return;
            }
            field4492.reset();
            field4492.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field4492.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field4535[arg1] != var9 || this.field4532[arg1] != var10) {
                this.field4486[arg1] = false;
                if (this.field4485 || arg3) {
                    this.field4493.method6626(this, this.field4483, arg1, this.field4535[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field4486[arg1] = true;
            if (arg3) {
                this.field4533[arg1] = class361.method5537(arg2, false);
            }
            return;
        }
        if (this.field4484 == 1) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            this.field4493.method6626(this, class386.field4514.field4519, this.field4483, this.field4488, (byte) 0, true);
            return;
        }
        field4492.reset();
        field4492.update(arg2, 0, arg2.length);
        int var5 = (int) field4492.getValue();
        if (this.field4488 != var5) {
            this.field4493.method6626(this, class386.field4514.field4519, this.field4483, this.field4488, (byte) 0, true);
            return;
        }
        class547 var6 = new class547(class388.method4004(arg2));
        int var7 = var6.method8804();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field4483 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method8734();
        }
        if (this.field4478 != var8) {
            this.field4493.method6626(this, class386.field4514.field4519, this.field4483, this.field4488, (byte) 0, true);
            return;
        }
        this.method6538(arg2);
        this.method6495();
    }

    @ObfuscatedName("oz.ab(B)V")
    public void method6495() {
        this.field4486 = new boolean[this.field4533.length];
        for (int var1 = 0; var1 < this.field4486.length; var1++) {
            this.field4486[var1] = false;
        }
        if (this.field4495 == null) {
            this.field4484 = 1;
            return;
        }
        this.field4490 = -1;
        for (int var2 = 0; var2 < this.field4486.length; var2++) {
            if (this.field4541[var2] > 0) {
                class384.method4520(var2, this.field4495, this);
                this.field4490 = var2;
            }
        }
        if (this.field4490 == -1) {
            this.field4484 = 1;
        }
    }

    @ObfuscatedName("oz.ai(II)I")
    public int method6496(int arg0) {
        if (this.field4533[arg0] == null) {
            return this.field4486[arg0] ? 100 : this.field4493.method6636(this.field4483, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("oz.ae(II)Z")
    public boolean method6497(int arg0) {
        return this.field4486[arg0];
    }

    @ObfuscatedName("oz.au(II)Z")
    public boolean method6507(int arg0) {
        return this.method6548(arg0) != null;
    }

    @ObfuscatedName("oz.ah(I)I")
    public int method6498() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4533.length; var3++) {
            if (this.field4541[var3] > 0) {
                var1 += 100;
                var2 += this.method6496(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
