package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ny")
public class class358 extends class360 {

    @ObfuscatedName("ny.aj")
    public class444 field4258;

    @ObfuscatedName("ny.ag")
    public class444 field4259;

    @ObfuscatedName("ny.az")
    public int field4270;

    @ObfuscatedName("ny.av")
    public volatile int field4261 = 0;

    @ObfuscatedName("ny.ap")
    public boolean field4262 = false;

    @ObfuscatedName("ny.aq")
    public volatile boolean[] field4263;

    @ObfuscatedName("ny.at")
    public static CRC32 field4260 = new CRC32();

    @ObfuscatedName("ny.ah")
    public int field4265;

    @ObfuscatedName("ny.ax")
    public int field4266;

    @ObfuscatedName("ny.aa")
    public int field4257 = -1;

    @ObfuscatedName("ny.au")
    public boolean field4268 = false;

    @ObfuscatedName("ny.ae")
    public class361 field4269;

    public class358(class444 arg0, class444 arg1, class361 arg2, int arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7) {
        super(arg4, arg5);
        this.field4258 = arg0;
        this.field4259 = arg1;
        this.field4270 = arg3;
        this.field4262 = arg6;
        this.field4268 = arg7;
        this.field4269 = arg2;
        this.field4269.method6229(this, this.field4270);
    }

    @ObfuscatedName("ny.aw(I)Z")
    public boolean method6088() {
        return this.field4261 == 1;
    }

    @ObfuscatedName("ny.ay(I)I")
    public int method6065() {
        if (this.field4261 == 1 || this.field4268 && this.field4261 == 2) {
            return 100;
        } else if (this.field4288 == null) {
            int var1 = this.field4269.method6206(255, this.field4270);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ny.ar(II)V")
    public void method6066(int arg0) {
        this.field4269.method6205(this.field4270, arg0);
    }

    @ObfuscatedName("ny.am(II)V")
    public void method6067(int arg0) {
        if (this.field4258 == null || this.field4263 == null || !this.field4263[arg0]) {
            this.field4269.method6204(this, this.field4270, arg0, this.field4282[arg0], (byte) 2, true);
            return;
        }
        class444 var2 = this.field4258;
        byte[] var4 = null;
        class379 var5 = class357.field4245;
        synchronized (class357.field4245) {
            for (class356 var6 = (class356) class357.field4245.method6393(); var6 != null; var6 = (class356) class357.field4245.method6374()) {
                if ((long) arg0 == var6.field4819 && var6.field4238 == var2 && var6.field4242 == 0) {
                    var4 = var6.field4237;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method7405(arg0);
            this.method6071(var2, arg0, var8, true);
        } else {
            this.method6071(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ny.as(I)V")
    public void method6068() {
        this.field4261 = 2;
        this.field4292 = new int[0];
        this.field4282 = new int[0];
        this.field4283 = new int[0];
        this.field4284 = new int[0];
        this.field4285 = new int[0][];
        this.field4288 = new Object[0];
        this.field4278 = new Object[0][];
    }

    @ObfuscatedName("ny.aj(III)V")
    public void method6069(int arg0, int arg1) {
        this.field4265 = arg0;
        this.field4266 = arg1;
        if (this.field4259 == null) {
            this.field4269.method6204(this, 255, this.field4270, this.field4265, (byte) 0, true);
            return;
        }
        int var3 = this.field4270;
        class444 var4 = this.field4259;
        byte[] var6 = null;
        class379 var7 = class357.field4245;
        synchronized (class357.field4245) {
            for (class356 var8 = (class356) class357.field4245.method6393(); var8 != null; var8 = (class356) class357.field4245.method6374()) {
                if ((long) var3 == var8.field4819 && var8.field4238 == var4 && var8.field4242 == 0) {
                    var6 = var8.field4237;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method7405(var3);
            this.method6071(var4, var3, var10, true);
        } else {
            this.method6071(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ny.ag(I[BZZI)V")
    public void method6082(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ny.az(Lrg;I[BZB)V")
    public void method6071(class444 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ny.av(I)V")
    public void method6091() {
        this.field4263 = new boolean[this.field4288.length];
        for (int var1 = 0; var1 < this.field4263.length; var1++) {
            this.field4263[var1] = false;
        }
        if (this.field4258 == null) {
            this.field4261 = 1;
            return;
        }
        this.field4257 = -1;
        for (int var2 = 0; var2 < this.field4263.length; var2++) {
            if (this.field4284[var2] > 0) {
                class357.method2980(var2, this.field4258, this);
                this.field4257 = var2;
            }
        }
        if (this.field4257 == -1) {
            this.field4261 = 1;
        }
    }

    @ObfuscatedName("ny.ap(II)I")
    public int method6098(int arg0) {
        if (this.field4288[arg0] == null) {
            return this.field4263[arg0] ? 100 : this.field4269.method6206(this.field4270, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ny.aq(IB)Z")
    public boolean method6080(int arg0) {
        return this.field4263[arg0];
    }

    @ObfuscatedName("ny.at(IB)Z")
    public boolean method6104(int arg0) {
        return this.method6126(arg0) != null;
    }

    @ObfuscatedName("ny.ah(I)I")
    public int method6076() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4288.length; var3++) {
            if (this.field4284[var3] > 0) {
                var1 += 100;
                var2 += this.method6098(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
