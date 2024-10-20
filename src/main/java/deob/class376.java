package deob;

import java.util.zip.CRC32;

@ObfuscatedName("om")
public class class376 extends class378 {

    @ObfuscatedName("om.as")
    public class462 field4371;

    @ObfuscatedName("om.aa")
    public class462 field4372;

    @ObfuscatedName("om.az")
    public int field4373;

    @ObfuscatedName("om.ao")
    public volatile int field4374 = 0;

    @ObfuscatedName("om.au")
    public boolean field4381 = false;

    @ObfuscatedName("om.ak")
    public volatile boolean[] field4376;

    @ObfuscatedName("om.ah")
    public static CRC32 field4370 = new CRC32();

    @ObfuscatedName("om.aj")
    public int field4378;

    @ObfuscatedName("om.af")
    public int field4379;

    @ObfuscatedName("om.ax")
    public int field4380 = -1;

    @ObfuscatedName("om.an")
    public boolean field4383 = false;

    @ObfuscatedName("om.ag")
    public boolean field4382 = false;

    @ObfuscatedName("om.am")
    public class379 field4377;

    public class376(class462 arg0, class462 arg1, class379 arg2, int arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8) {
        super(arg4, arg5);
        this.field4371 = arg0;
        this.field4372 = arg1;
        this.field4373 = arg3;
        this.field4381 = arg6;
        this.field4383 = arg7;
        this.field4382 = arg8;
        this.field4377 = arg2;
        this.field4377.method6527(this, this.field4373);
    }

    @ObfuscatedName("om.aq(B)Z")
    public boolean method6364() {
        return this.field4374 == 1;
    }

    @ObfuscatedName("om.aw(I)I")
    public int method6365() {
        if (this.field4374 == 1 || this.field4383 && this.field4374 == 2) {
            return 100;
        } else if (this.field4404 == null) {
            int var1 = this.field4377.method6519(255, this.field4373);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("om.al(IS)V")
    public void method6398(int arg0) {
        this.field4377.method6518(this.field4373, arg0);
    }

    @ObfuscatedName("om.ai(IB)V")
    public void method6367(int arg0) {
        if (this.field4371 == null || this.field4376 == null || !this.field4376[arg0]) {
            this.field4377.method6522(this, this.field4373, arg0, this.field4394[arg0], (byte) 2, true);
        } else {
            class375.method1134(arg0, this.field4371, this);
        }
    }

    @ObfuscatedName("om.ar(I)V")
    public void method6368() {
        this.field4374 = 2;
        this.field4391 = new int[0];
        this.field4394 = new int[0];
        this.field4395 = new int[0];
        this.field4396 = new int[0];
        this.field4398 = new int[0][];
        this.field4404 = new Object[0];
        this.field4406 = new Object[0][];
    }

    @ObfuscatedName("om.as(IIB)V")
    public void method6393(int arg0, int arg1) {
        this.field4378 = arg0;
        this.field4379 = arg1;
        if (this.field4372 == null) {
            this.field4377.method6522(this, 255, this.field4373, this.field4378, (byte) 0, true);
        } else {
            class375.method1134(this.field4373, this.field4372, this);
        }
    }

    @ObfuscatedName("om.aa(I[BZZI)V")
    public void method6370(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("om.az(Lrl;I[BZS)V")
    public void method6371(class462 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("om.ao(I)V")
    public void method6372() {
        this.field4376 = new boolean[this.field4404.length];
        for (int var1 = 0; var1 < this.field4376.length; var1++) {
            this.field4376[var1] = false;
        }
        if (this.field4371 == null) {
            this.field4374 = 1;
            return;
        }
        this.field4380 = -1;
        for (int var2 = 0; var2 < this.field4376.length; var2++) {
            if (this.field4396[var2] > 0) {
                class462 var3 = this.field4371;
                class374 var5 = new class374();
                var5.field4359 = 1;
                var5.field4920 = (long) var2;
                var5.field4358 = var3;
                var5.field4360 = this;
                class397 var6 = class375.field4365;
                synchronized (class375.field4365) {
                    class375.field4365.method6678(var5);
                }
                Object var8 = class375.field4366;
                synchronized (class375.field4366) {
                    if (class375.field4363 == 0) {
                        Statics.field4362 = new Thread(new class375());
                        Statics.field4362.setDaemon(true);
                        Statics.field4362.start();
                        Statics.field4362.setPriority(5);
                    }
                    class375.field4363 = 600;
                    class375.field4364 = false;
                }
                this.field4380 = var2;
            }
        }
        if (this.field4380 == -1) {
            this.field4374 = 1;
        }
    }

    @ObfuscatedName("om.au(II)I")
    public int method6373(int arg0) {
        if (this.field4404[arg0] == null) {
            return this.field4376[arg0] ? 100 : this.field4377.method6519(this.field4373, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("om.ak(II)Z")
    public boolean method6374(int arg0) {
        return this.field4376[arg0];
    }

    @ObfuscatedName("om.ah(IB)Z")
    public boolean method6375(int arg0) {
        return this.method6510(arg0) != null;
    }

    @ObfuscatedName("om.aj(B)I")
    public int method6376() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4404.length; var3++) {
            if (this.field4396[var3] > 0) {
                var1 += 100;
                var2 += this.method6373(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
