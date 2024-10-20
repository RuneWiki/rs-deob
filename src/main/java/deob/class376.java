package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ov")
public class class376 extends class379 {

    @ObfuscatedName("ov.ao")
    public class463 field4371;

    @ObfuscatedName("ov.ab")
    public class463 field4384;

    @ObfuscatedName("ov.aw")
    public int field4374;

    @ObfuscatedName("ov.ad")
    public volatile int field4367 = 0;

    @ObfuscatedName("ov.al")
    public boolean field4375 = false;

    @ObfuscatedName("ov.as")
    public volatile boolean[] field4376;

    @ObfuscatedName("ov.ag")
    public static CRC32 field4377 = new CRC32();

    @ObfuscatedName("ov.ai")
    public int field4378;

    @ObfuscatedName("ov.ax")
    public int field4379;

    @ObfuscatedName("ov.ar")
    public int field4368 = -1;

    @ObfuscatedName("ov.aj")
    public boolean field4381 = false;

    @ObfuscatedName("ov.au")
    public boolean field4382 = false;

    @ObfuscatedName("ov.ay")
    public class380 field4383;

    public class376(class463 arg0, class463 arg1, class380 arg2, int arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8) {
        super(arg4, arg5);
        this.field4371 = arg0;
        this.field4384 = arg1;
        this.field4374 = arg3;
        this.field4375 = arg6;
        this.field4381 = arg7;
        this.field4382 = arg8;
        this.field4383 = arg2;
        this.field4383.method6418(this, this.field4374);
    }

    @ObfuscatedName("ov.az(I)Z")
    public boolean method6282() {
        return this.field4367 == 1;
    }

    @ObfuscatedName("ov.ah(I)I")
    public int method6283() {
        if (this.field4367 == 1 || this.field4381 && this.field4367 == 2) {
            return 100;
        } else if (this.field4424 == null) {
            int var1 = this.field4383.method6425(class377.field4390.field4408, this.field4374);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ov.af(II)V")
    public void method6284(int arg0) {
        this.field4383.method6424(this.field4374, arg0);
    }

    @ObfuscatedName("ov.at(II)V")
    public void method6285(int arg0) {
        if (this.field4371 == null || this.field4376 == null || !this.field4376[arg0]) {
            this.field4383.method6423(this, this.field4374, arg0, this.field4417[arg0], (byte) 2, true);
            return;
        }
        class463 var2 = this.field4371;
        byte[] var4 = null;
        class398 var5 = class375.field4360;
        synchronized (class375.field4360) {
            for (class374 var6 = (class374) class375.field4360.method6591(); var6 != null; var6 = (class374) class375.field4360.method6605()) {
                if ((long) arg0 == var6.field4951 && var6.field4357 == var2 && var6.field4355 == 0) {
                    var4 = var6.field4356;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method7603(arg0);
            this.method6289(var2, arg0, var8, true);
        } else {
            this.method6289(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ov.an(B)V")
    public void method6316() {
        this.field4367 = 2;
        this.field4425 = new int[0];
        this.field4417 = new int[0];
        this.field4413 = new int[0];
        this.field4414 = new int[0];
        this.field4420 = new int[0][];
        this.field4424 = new Object[0];
        this.field4421 = new Object[0][];
    }

    @ObfuscatedName("ov.ao(III)V")
    public void method6281(int arg0, int arg1) {
        this.field4378 = arg0;
        this.field4379 = arg1;
        if (this.field4384 == null) {
            this.field4383.method6423(this, class377.field4390.field4408, this.field4374, this.field4378, (byte) 0, true);
            return;
        }
        int var3 = this.field4374;
        class463 var4 = this.field4384;
        byte[] var6 = null;
        class398 var7 = class375.field4360;
        synchronized (class375.field4360) {
            for (class374 var8 = (class374) class375.field4360.method6591(); var8 != null; var8 = (class374) class375.field4360.method6605()) {
                if ((long) var3 == var8.field4951 && var8.field4357 == var4 && var8.field4355 == 0) {
                    var6 = var8.field4356;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method7603(var3);
            this.method6289(var4, var3, var10, true);
        } else {
            this.method6289(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ov.ab(I[BZZB)V")
    public void method6288(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ov.aw(Lra;I[BZI)V")
    public void method6289(class463 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ov.ad(I)V")
    public void method6286() {
        this.field4376 = new boolean[this.field4424.length];
        for (int var1 = 0; var1 < this.field4376.length; var1++) {
            this.field4376[var1] = false;
        }
        if (this.field4371 == null) {
            this.field4367 = 1;
            return;
        }
        this.field4368 = -1;
        for (int var2 = 0; var2 < this.field4376.length; var2++) {
            if (this.field4414[var2] > 0) {
                class375.method2813(var2, this.field4371, this);
                this.field4368 = var2;
            }
        }
        if (this.field4368 == -1) {
            this.field4367 = 1;
        }
    }

    @ObfuscatedName("ov.al(II)I")
    public int method6295(int arg0) {
        if (this.field4424[arg0] == null) {
            return this.field4376[arg0] ? 100 : this.field4383.method6425(this.field4374, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ov.as(II)Z")
    public boolean method6287(int arg0) {
        return this.field4376[arg0];
    }

    @ObfuscatedName("ov.ag(II)Z")
    public boolean method6313(int arg0) {
        return this.method6350(arg0) != null;
    }

    @ObfuscatedName("ov.ai(I)I")
    public int method6294() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4424.length; var3++) {
            if (this.field4414[var3] > 0) {
                var1 += 100;
                var2 += this.method6295(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
