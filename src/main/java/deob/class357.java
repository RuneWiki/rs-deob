package deob;

import java.util.zip.CRC32;

@ObfuscatedName("nk")
public class class357 extends class359 {

    @ObfuscatedName("nk.ai")
    public class443 field4265;

    @ObfuscatedName("nk.az")
    public class443 field4275;

    @ObfuscatedName("nk.ap")
    public int field4267;

    @ObfuscatedName("nk.aa")
    public volatile int field4271 = 0;

    @ObfuscatedName("nk.af")
    public boolean field4269 = false;

    @ObfuscatedName("nk.ad")
    public volatile boolean[] field4270;

    @ObfuscatedName("nk.aq")
    public static CRC32 field4272 = new CRC32();

    @ObfuscatedName("nk.al")
    public int field4264;

    @ObfuscatedName("nk.an")
    public int field4273;

    @ObfuscatedName("nk.ar")
    public int field4274 = -1;

    @ObfuscatedName("nk.ab")
    public boolean field4263 = false;

    @ObfuscatedName("nk.ag")
    public class360 field4276;

    public class357(class443 arg0, class443 arg1, class360 arg2, int arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7) {
        super(arg4, arg5);
        this.field4265 = arg0;
        this.field4275 = arg1;
        this.field4267 = arg3;
        this.field4269 = arg6;
        this.field4263 = arg7;
        this.field4276 = arg2;
        this.field4276.method6217(this, this.field4267);
    }

    @ObfuscatedName("nk.au(I)Z")
    public boolean method6109() {
        return this.field4271 == 1;
    }

    @ObfuscatedName("nk.ae(B)I")
    public int method6083() {
        if (this.field4271 == 1 || this.field4263 && this.field4271 == 2) {
            return 100;
        } else if (this.field4290 == null) {
            int var1 = this.field4276.method6237(255, this.field4267);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("nk.ao(II)V")
    public void method6084(int arg0) {
        this.field4276.method6226(this.field4267, arg0);
    }

    @ObfuscatedName("nk.at(II)V")
    public void method6085(int arg0) {
        if (this.field4265 == null || this.field4270 == null || !this.field4270[arg0]) {
            this.field4276.method6219(this, this.field4267, arg0, this.field4285[arg0], (byte) 2, true);
            return;
        }
        class443 var2 = this.field4265;
        byte[] var4 = null;
        class378 var5 = class356.field4259;
        synchronized (class356.field4259) {
            for (class355 var6 = (class355) class356.field4259.method6393(); var6 != null; var6 = (class355) class356.field4259.method6395()) {
                if ((long) arg0 == var6.field4814 && var6.field4253 == var2 && var6.field4252 == 0) {
                    var4 = var6.field4251;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method7428(arg0);
            this.method6124(var2, arg0, var8, true);
        } else {
            this.method6124(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("nk.ac(B)V")
    public void method6108() {
        this.field4271 = 2;
        this.field4296 = new int[0];
        this.field4285 = new int[0];
        this.field4286 = new int[0];
        this.field4287 = new int[0];
        this.field4283 = new int[0][];
        this.field4290 = new Object[0];
        this.field4292 = new Object[0][];
    }

    @ObfuscatedName("nk.ai(IIB)V")
    public void method6087(int arg0, int arg1) {
        this.field4264 = arg0;
        this.field4273 = arg1;
        if (this.field4275 == null) {
            this.field4276.method6219(this, 255, this.field4267, this.field4264, (byte) 0, true);
            return;
        }
        int var3 = this.field4267;
        class443 var4 = this.field4275;
        byte[] var6 = null;
        class378 var7 = class356.field4259;
        synchronized (class356.field4259) {
            for (class355 var8 = (class355) class356.field4259.method6393(); var8 != null; var8 = (class355) class356.field4259.method6395()) {
                if ((long) var3 == var8.field4814 && var8.field4253 == var4 && var8.field4252 == 0) {
                    var6 = var8.field4251;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method7428(var3);
            this.method6124(var4, var3, var10, true);
        } else {
            this.method6124(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("nk.az(I[BZZI)V")
    public void method6088(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("nk.ap(Lru;I[BZI)V")
    public void method6124(class443 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("nk.aa(I)V")
    public void method6117() {
        this.field4270 = new boolean[this.field4290.length];
        for (int var1 = 0; var1 < this.field4270.length; var1++) {
            this.field4270[var1] = false;
        }
        if (this.field4265 == null) {
            this.field4271 = 1;
            return;
        }
        this.field4274 = -1;
        for (int var2 = 0; var2 < this.field4270.length; var2++) {
            if (this.field4287[var2] > 0) {
                class356.method4592(var2, this.field4265, this);
                this.field4274 = var2;
            }
        }
        if (this.field4274 == -1) {
            this.field4271 = 1;
        }
    }

    @ObfuscatedName("nk.af(II)I")
    public int method6104(int arg0) {
        if (this.field4290[arg0] == null) {
            return this.field4270[arg0] ? 100 : this.field4276.method6237(this.field4267, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("nk.ad(II)Z")
    public boolean method6092(int arg0) {
        return this.field4270[arg0];
    }

    @ObfuscatedName("nk.aq(II)Z")
    public boolean method6093(int arg0) {
        return this.method6137(arg0) != null;
    }

    @ObfuscatedName("nk.al(I)I")
    public int method6120() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4290.length; var3++) {
            if (this.field4287[var3] > 0) {
                var1 += 100;
                var2 += this.method6104(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
