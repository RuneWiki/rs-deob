package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ny")
public class class355 extends class357 {

    @ObfuscatedName("ny.ap")
    public class431 field4233;

    @ObfuscatedName("ny.ab")
    public class431 field4234;

    @ObfuscatedName("ny.ak")
    public int field4235;

    @ObfuscatedName("ny.ae")
    public volatile int field4236 = 0;

    @ObfuscatedName("ny.af")
    public boolean field4229 = false;

    @ObfuscatedName("ny.ao")
    public volatile boolean[] field4238;

    @ObfuscatedName("ny.aa")
    public static CRC32 field4239 = new CRC32();

    @ObfuscatedName("ny.aj")
    public int field4245;

    @ObfuscatedName("ny.ad")
    public int field4241;

    @ObfuscatedName("ny.ac")
    public int field4242 = -1;

    @ObfuscatedName("ny.ag")
    public boolean field4243 = false;

    public class355(class431 arg0, class431 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        super(arg3, arg4);
        this.field4233 = arg0;
        this.field4234 = arg1;
        this.field4235 = arg2;
        this.field4229 = arg5;
        this.field4243 = arg6;
        class358.method3234(this, this.field4235);
    }

    @ObfuscatedName("ny.at(I)Z")
    public boolean method6032() {
        return this.field4236 == 1;
    }

    @ObfuscatedName("ny.an(I)I")
    public int method6056() {
        if (this.field4236 == 1 || this.field4243 && this.field4236 == 2) {
            return 100;
        } else if (this.field4260 == null) {
            int var1 = class358.method5143(255, this.field4235);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ny.av(II)V")
    public void method6062(int arg0) {
        class358.method4391(this.field4235, arg0);
    }

    @ObfuscatedName("ny.as(IB)V")
    public void method6034(int arg0) {
        if (this.field4233 == null || this.field4238 == null || !this.field4238[arg0]) {
            class358.method5994(this, this.field4235, arg0, this.field4254[arg0], (byte) 2, true);
        } else {
            class354.method5382(arg0, this.field4233, this);
        }
    }

    @ObfuscatedName("ny.ax(I)V")
    public void method6033() {
        this.field4236 = 2;
        this.field4261 = new int[0];
        this.field4254 = new int[0];
        this.field4255 = new int[0];
        this.field4256 = new int[0];
        this.field4257 = new int[0][];
        this.field4260 = new Object[0];
        this.field4250 = new Object[0][];
    }

    @ObfuscatedName("ny.ap(III)V")
    public void method6036(int arg0, int arg1) {
        this.field4245 = arg0;
        this.field4241 = arg1;
        if (this.field4234 == null) {
            class358.method5994(this, 255, this.field4235, this.field4245, (byte) 0, true);
        } else {
            class354.method5382(this.field4235, this.field4234, this);
        }
    }

    @ObfuscatedName("ny.ab(I[BZZI)V")
    public void method6049(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field4255[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field4255[arg0];
            if (this.field4233 != null) {
                class431 var10 = this.field4233;
                class353 var11 = new class353();
                var11.field4219 = 0;
                var11.field4757 = (long) arg0;
                var11.field4222 = arg1;
                var11.field4221 = var10;
                class376 var12 = class354.field4227;
                synchronized (class354.field4227) {
                    class354.field4227.method6303(var11);
                }
                class354.method5156();
                this.field4238[arg0] = true;
            }
            if (arg3) {
                this.field4260[arg0] = class334.method2528(arg1, false);
            }
            return;
        }
        if (this.field4236 == 1) {
            throw new RuntimeException();
        }
        if (this.field4234 != null) {
            int var5 = this.field4235;
            class431 var6 = this.field4234;
            class353 var7 = new class353();
            var7.field4219 = 0;
            var7.field4757 = (long) var5;
            var7.field4222 = arg1;
            var7.field4221 = var6;
            class376 var8 = class354.field4227;
            synchronized (class354.field4227) {
                class354.field4227.method6303(var7);
            }
            class354.method5156();
        }
        this.method6096(arg1);
        this.method6039();
    }

    @ObfuscatedName("ny.ak(Lqc;I[BZI)V")
    public void method6038(class431 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field4234 != arg0) {
            if (!arg3 && this.field4242 == arg1) {
                this.field4236 = 1;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field4238[arg1] = false;
                if (this.field4229 || arg3) {
                    class358.method5994(this, this.field4235, arg1, this.field4254[arg1], (byte) 2, arg3);
                }
                return;
            }
            field4239.reset();
            field4239.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field4239.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field4254[arg1] != var9 || this.field4255[arg1] != var10) {
                this.field4238[arg1] = false;
                if (this.field4229 || arg3) {
                    class358.method5994(this, this.field4235, arg1, this.field4254[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field4238[arg1] = true;
            if (arg3) {
                this.field4260[arg1] = class334.method2528(arg2, false);
            }
            return;
        }
        if (this.field4236 == 1) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class358.method5994(this, 255, this.field4235, this.field4245, (byte) 0, true);
            return;
        }
        field4239.reset();
        field4239.update(arg2, 0, arg2.length);
        int var5 = (int) field4239.getValue();
        if (this.field4245 != var5) {
            class358.method5994(this, 255, this.field4235, this.field4245, (byte) 0, true);
            return;
        }
        class501 var6 = new class501(class357.method2453(arg2));
        int var7 = var6.method8129();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field4235 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method8134();
        }
        if (this.field4241 != var8) {
            class358.method5994(this, 255, this.field4235, this.field4245, (byte) 0, true);
            return;
        }
        this.method6096(arg2);
        this.method6039();
    }

    @ObfuscatedName("ny.ae(I)V")
    public void method6039() {
        this.field4238 = new boolean[this.field4260.length];
        for (int var1 = 0; var1 < this.field4238.length; var1++) {
            this.field4238[var1] = false;
        }
        if (this.field4233 == null) {
            this.field4236 = 1;
            return;
        }
        this.field4242 = -1;
        for (int var2 = 0; var2 < this.field4238.length; var2++) {
            if (this.field4256[var2] > 0) {
                class354.method4758(var2, this.field4233, this);
                this.field4242 = var2;
            }
        }
        if (this.field4242 == -1) {
            this.field4236 = 1;
        }
    }

    @ObfuscatedName("ny.af(II)I")
    public int method6040(int arg0) {
        if (this.field4260[arg0] == null) {
            return this.field4238[arg0] ? 100 : class358.method5143(this.field4235, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ny.ao(IB)Z")
    public boolean method6070(int arg0) {
        return this.field4238[arg0];
    }

    @ObfuscatedName("ny.aa(II)Z")
    public boolean method6042(int arg0) {
        return this.method6090(arg0) != null;
    }

    @ObfuscatedName("ny.aj(I)I")
    public int method6043() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4260.length; var3++) {
            if (this.field4256[var3] > 0) {
                var1 += 100;
                var2 += this.method6040(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
