package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ot")
public class class384 extends class387 {

    @ObfuscatedName("ot.aa")
    public class482 field4465;

    @ObfuscatedName("ot.at")
    public class482 field4459;

    @ObfuscatedName("ot.ab")
    public int field4468;

    @ObfuscatedName("ot.ac")
    public volatile int field4461 = 0;

    @ObfuscatedName("ot.ao")
    public boolean field4462 = false;

    @ObfuscatedName("ot.ah")
    public volatile boolean[] field4454;

    @ObfuscatedName("ot.av")
    public static CRC32 field4467 = new CRC32();

    @ObfuscatedName("ot.aq")
    public int field4460;

    @ObfuscatedName("ot.ap")
    public int field4466;

    @ObfuscatedName("ot.ae")
    public int field4458 = -1;

    @ObfuscatedName("ot.ax")
    public boolean field4463 = false;

    @ObfuscatedName("ot.ay")
    public boolean field4469 = false;

    @ObfuscatedName("ot.au")
    public class388 field4470;

    public class384(class482 arg0, class482 arg1, class388 arg2, int arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8) {
        super(arg4, arg5);
        this.field4465 = arg0;
        this.field4459 = arg1;
        this.field4468 = arg3;
        this.field4462 = arg6;
        this.field4463 = arg7;
        this.field4469 = arg8;
        this.field4470 = arg2;
        this.field4470.method6659(this, this.field4468);
    }

    @ObfuscatedName("ot.ak(B)Z")
    public boolean method6523() {
        return this.field4461 == 1;
    }

    @ObfuscatedName("ot.al(I)I")
    public int method6524() {
        if (this.field4461 == 1 || this.field4463 && this.field4461 == 2) {
            return 100;
        } else if (this.field4510 == null) {
            int var1 = this.field4470.method6663(class385.field4474.field4494, this.field4468);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ot.aj(IB)V")
    public void method6525(int arg0) {
        this.field4470.method6669(this.field4468, arg0);
    }

    @ObfuscatedName("ot.az(II)V")
    public void method6529(int arg0) {
        if (this.field4465 == null || this.field4454 == null || !this.field4454[arg0]) {
            this.field4470.method6661(this, this.field4468, arg0, this.field4514[arg0], (byte) 2, true);
        } else {
            class383.method6471(arg0, this.field4465, this);
        }
    }

    @ObfuscatedName("ot.af(I)V")
    public void method6527() {
        this.field4461 = 2;
        this.field4515 = new int[0];
        this.field4514 = new int[0];
        this.field4505 = new int[0];
        this.field4506 = new int[0];
        this.field4503 = new int[0][];
        this.field4510 = new Object[0];
        this.field4511 = new Object[0][];
    }

    @ObfuscatedName("ot.aa(IIB)V")
    public void method6550(int arg0, int arg1) {
        this.field4460 = arg0;
        this.field4466 = arg1;
        if (this.field4459 == null) {
            this.field4470.method6661(this, class385.field4474.field4494, this.field4468, this.field4460, (byte) 0, true);
        } else {
            class383.method6471(this.field4468, this.field4459, this);
        }
    }

    @ObfuscatedName("ot.at(I[BZZI)V")
    public void method6567(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ot.ab(Lsf;I[BZB)V")
    public void method6541(class482 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ot.ac(I)V")
    public void method6530() {
        this.field4454 = new boolean[this.field4510.length];
        for (int var1 = 0; var1 < this.field4454.length; var1++) {
            this.field4454[var1] = false;
        }
        if (this.field4465 == null) {
            this.field4461 = 1;
            return;
        }
        this.field4458 = -1;
        for (int var2 = 0; var2 < this.field4454.length; var2++) {
            if (this.field4506[var2] > 0) {
                class482 var3 = this.field4465;
                class382 var5 = new class382();
                var5.field4443 = 1;
                var5.field5049 = (long) var2;
                var5.field4439 = var3;
                var5.field4440 = this;
                class406 var6 = class383.field4450;
                synchronized (class383.field4450) {
                    class383.field4450.method6829(var5);
                }
                Object var8 = class383.field4448;
                synchronized (class383.field4448) {
                    if (class383.field4446 == 0) {
                        Statics.field4451 = new Thread(new class383());
                        Statics.field4451.setDaemon(true);
                        Statics.field4451.start();
                        Statics.field4451.setPriority(5);
                    }
                    class383.field4446 = 600;
                    class383.field4449 = false;
                }
                this.field4458 = var2;
            }
        }
        if (this.field4458 == -1) {
            this.field4461 = 1;
        }
    }

    @ObfuscatedName("ot.ao(IB)I")
    public int method6532(int arg0) {
        if (this.field4510[arg0] == null) {
            return this.field4454[arg0] ? 100 : this.field4470.method6663(this.field4468, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ot.ah(II)Z")
    public boolean method6533(int arg0) {
        return this.field4454[arg0];
    }

    @ObfuscatedName("ot.av(II)Z")
    public boolean method6522(int arg0) {
        return this.method6581(arg0) != null;
    }

    @ObfuscatedName("ot.aq(I)I")
    public int method6535() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4510.length; var3++) {
            if (this.field4506[var3] > 0) {
                var1 += 100;
                var2 += this.method6532(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
