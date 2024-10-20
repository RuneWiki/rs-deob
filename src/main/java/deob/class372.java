package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ok")
public class class372 extends class374 {

    @ObfuscatedName("ok.ah")
    public class458 field4306;

    @ObfuscatedName("ok.ar")
    public class458 field4307;

    @ObfuscatedName("ok.ab")
    public int field4315;

    @ObfuscatedName("ok.am")
    public volatile int field4309 = 0;

    @ObfuscatedName("ok.av")
    public boolean field4303 = false;

    @ObfuscatedName("ok.ag")
    public volatile boolean[] field4311;

    @ObfuscatedName("ok.aa")
    public static CRC32 field4312 = new CRC32();

    @ObfuscatedName("ok.ap")
    public int field4313;

    @ObfuscatedName("ok.ay")
    public int field4310;

    @ObfuscatedName("ok.as")
    public int field4305 = -1;

    @ObfuscatedName("ok.aj")
    public boolean field4316 = false;

    @ObfuscatedName("ok.an")
    public boolean field4317 = false;

    @ObfuscatedName("ok.au")
    public class375 field4318;

    public class372(class458 arg0, class458 arg1, class375 arg2, int arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8) {
        super(arg4, arg5);
        this.field4306 = arg0;
        this.field4307 = arg1;
        this.field4315 = arg3;
        this.field4303 = arg6;
        this.field4316 = arg7;
        this.field4317 = arg8;
        this.field4318 = arg2;
        this.field4318.method6354(this, this.field4315);
    }

    @ObfuscatedName("ok.ac(I)Z")
    public boolean method6217() {
        return this.field4309 == 1;
    }

    @ObfuscatedName("ok.al(I)I")
    public int method6218() {
        if (this.field4309 == 1 || this.field4316 && this.field4309 == 2) {
            return 100;
        } else if (this.field4334 == null) {
            int var1 = this.field4318.method6358(255, this.field4315);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ok.ak(II)V")
    public void method6219(int arg0) {
        this.field4318.method6357(this.field4315, arg0);
    }

    @ObfuscatedName("ok.ax(IB)V")
    public void method6220(int arg0) {
        if (this.field4306 == null || this.field4311 == null || !this.field4311[arg0]) {
            this.field4318.method6356(this, this.field4315, arg0, this.field4337[arg0], (byte) 2, true);
            return;
        }
        class458 var2 = this.field4306;
        byte[] var4 = null;
        class393 var5 = class371.field4296;
        synchronized (class371.field4296) {
            for (class370 var6 = (class370) class371.field4296.method6532(); var6 != null; var6 = (class370) class371.field4296.method6543()) {
                if ((long) arg0 == var6.field4857 && var6.field4289 == var2 && var6.field4288 == 0) {
                    var4 = var6.field4291;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method7492(arg0);
            this.method6241(var2, arg0, var8, true);
        } else {
            this.method6241(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ok.ao(I)V")
    public void method6221() {
        this.field4309 = 2;
        this.field4325 = new int[0];
        this.field4337 = new int[0];
        this.field4329 = new int[0];
        this.field4331 = new int[0];
        this.field4335 = new int[0][];
        this.field4334 = new Object[0];
        this.field4328 = new Object[0][];
    }

    @ObfuscatedName("ok.ah(IIS)V")
    public void method6253(int arg0, int arg1) {
        this.field4313 = arg0;
        this.field4310 = arg1;
        if (this.field4307 == null) {
            this.field4318.method6356(this, 255, this.field4315, this.field4313, (byte) 0, true);
            return;
        }
        int var3 = this.field4315;
        class458 var4 = this.field4307;
        byte[] var6 = null;
        class393 var7 = class371.field4296;
        synchronized (class371.field4296) {
            for (class370 var8 = (class370) class371.field4296.method6532(); var8 != null; var8 = (class370) class371.field4296.method6543()) {
                if ((long) var3 == var8.field4857 && var8.field4289 == var4 && var8.field4288 == 0) {
                    var6 = var8.field4291;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method7492(var3);
            this.method6241(var4, var3, var10, true);
        } else {
            this.method6241(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ok.ar(I[BZZS)V")
    public void method6225(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ok.ab(Lrw;I[BZB)V")
    public void method6241(class458 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ok.am(I)V")
    public void method6238() {
        this.field4311 = new boolean[this.field4334.length];
        for (int var1 = 0; var1 < this.field4311.length; var1++) {
            this.field4311[var1] = false;
        }
        if (this.field4306 == null) {
            this.field4309 = 1;
            return;
        }
        this.field4305 = -1;
        for (int var2 = 0; var2 < this.field4311.length; var2++) {
            if (this.field4331[var2] > 0) {
                class371.method2102(var2, this.field4306, this);
                this.field4305 = var2;
            }
        }
        if (this.field4305 == -1) {
            this.field4309 = 1;
        }
    }

    @ObfuscatedName("ok.av(II)I")
    public int method6234(int arg0) {
        if (this.field4334[arg0] == null) {
            return this.field4311[arg0] ? 100 : this.field4318.method6358(this.field4315, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ok.ag(II)Z")
    public boolean method6227(int arg0) {
        return this.field4311[arg0];
    }

    @ObfuscatedName("ok.aa(IB)Z")
    public boolean method6228(int arg0) {
        return this.method6272(arg0) != null;
    }

    @ObfuscatedName("ok.ap(B)I")
    public int method6248() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4334.length; var3++) {
            if (this.field4331[var3] > 0) {
                var1 += 100;
                var2 += this.method6234(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
