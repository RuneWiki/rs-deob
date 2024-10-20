package deob;

import java.util.zip.CRC32;

@ObfuscatedName("oj")
public class class386 extends class389 {

    @ObfuscatedName("oj.ao")
    public class484 field4450;

    @ObfuscatedName("oj.am")
    public class484 field4451;

    @ObfuscatedName("oj.ac")
    public int field4453;

    @ObfuscatedName("oj.ae")
    public volatile int field4452 = 0;

    @ObfuscatedName("oj.ad")
    public boolean field4454 = false;

    @ObfuscatedName("oj.aq")
    public volatile boolean[] field4461;

    @ObfuscatedName("oj.al")
    public static CRC32 field4456 = new CRC32();

    @ObfuscatedName("oj.aj")
    public int field4457;

    @ObfuscatedName("oj.as")
    public int field4458;

    @ObfuscatedName("oj.aw")
    public int field4459 = -1;

    @ObfuscatedName("oj.af")
    public boolean field4460 = false;

    @ObfuscatedName("oj.aa")
    public boolean field4446 = false;

    @ObfuscatedName("oj.ah")
    public class390 field4462;

    public class386(class484 arg0, class484 arg1, class390 arg2, int arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8) {
        super(arg4, arg5);
        this.field4450 = arg0;
        this.field4451 = arg1;
        this.field4453 = arg3;
        this.field4454 = arg6;
        this.field4460 = arg7;
        this.field4446 = arg8;
        this.field4462 = arg2;
        this.field4462.method6753(this, this.field4453);
    }

    @ObfuscatedName("oj.ab(I)Z")
    public boolean method6587() {
        return this.field4452 == 1;
    }

    @ObfuscatedName("oj.ay(I)I")
    public int method6588() {
        if (this.field4452 == 1 || this.field4460 && this.field4452 == 2) {
            return 100;
        } else if (this.field4504 == null) {
            int var1 = this.field4462.method6737(class387.field4486.field4470, this.field4453);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("oj.an(II)V")
    public void method6589(int arg0) {
        this.field4462.method6736(this.field4453, arg0);
    }

    @ObfuscatedName("oj.au(IB)V")
    public void method6590(int arg0) {
        if (this.field4450 == null || this.field4461 == null || !this.field4461[arg0]) {
            this.field4462.method6735(this, this.field4453, arg0, this.field4498[arg0], (byte) 2, true);
            return;
        }
        class484 var2 = this.field4450;
        byte[] var4 = null;
        class408 var5 = class385.field4445;
        synchronized (class385.field4445) {
            for (class384 var6 = (class384) class385.field4445.method6907(); var6 != null; var6 = (class384) class385.field4445.method6896()) {
                if ((long) arg0 == var6.field5075 && var6.field4438 == var2 && var6.field4437 == 0) {
                    var4 = var6.field4435;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method8116(arg0);
            this.method6610(var2, arg0, var8, true);
        } else {
            this.method6610(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("oj.ax(I)V")
    public void method6591() {
        this.field4452 = 2;
        this.field4509 = new int[0];
        this.field4498 = new int[0];
        this.field4495 = new int[0];
        this.field4505 = new int[0];
        this.field4501 = new int[0][];
        this.field4504 = new Object[0];
        this.field4499 = new Object[0][];
    }

    @ObfuscatedName("oj.ao(III)V")
    public void method6621(int arg0, int arg1) {
        this.field4457 = arg0;
        this.field4458 = arg1;
        if (this.field4451 == null) {
            this.field4462.method6735(this, class387.field4486.field4470, this.field4453, this.field4457, (byte) 0, true);
            return;
        }
        int var3 = this.field4453;
        class484 var4 = this.field4451;
        byte[] var6 = null;
        class408 var7 = class385.field4445;
        synchronized (class385.field4445) {
            for (class384 var8 = (class384) class385.field4445.method6907(); var8 != null; var8 = (class384) class385.field4445.method6896()) {
                if ((long) var3 == var8.field5075 && var8.field4438 == var4 && var8.field4437 == 0) {
                    var6 = var8.field4435;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method8116(var3);
            this.method6610(var4, var3, var10, true);
        } else {
            this.method6610(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("oj.am(I[BZZB)V")
    public void method6593(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field4495[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field4495[arg0];
            if (this.field4450 != null) {
                class484 var10 = this.field4450;
                class384 var11 = new class384();
                var11.field4437 = 0;
                var11.field5075 = (long) arg0;
                var11.field4435 = arg1;
                var11.field4438 = var10;
                class408 var12 = class385.field4445;
                synchronized (class385.field4445) {
                    class385.field4445.method6892(var11);
                }
                class385.method3336();
                this.field4461[arg0] = true;
            }
            if (arg3) {
                this.field4504[arg0] = class365.method4614(arg1, false);
            }
            return;
        }
        if (this.field4452 == 1) {
            throw new RuntimeException();
        }
        if (this.field4451 != null) {
            int var5 = this.field4453;
            class484 var6 = this.field4451;
            class384 var7 = new class384();
            var7.field4437 = 0;
            var7.field5075 = (long) var5;
            var7.field4435 = arg1;
            var7.field4438 = var6;
            class408 var8 = class385.field4445;
            synchronized (class385.field4445) {
                class385.field4445.method6892(var7);
            }
            class385.method3336();
        }
        this.method6639(arg1);
        this.method6595();
    }

    @ObfuscatedName("oj.ac(Lsi;I[BZB)V")
    public void method6610(class484 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field4451 != arg0) {
            if (!arg3 && this.field4459 == arg1) {
                this.field4452 = 1;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field4461[arg1] = false;
                if (this.field4454 || arg3) {
                    this.field4462.method6735(this, this.field4453, arg1, this.field4498[arg1], (byte) 2, arg3);
                }
                return;
            }
            field4456.reset();
            field4456.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field4456.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field4498[arg1] != var9 || this.field4495[arg1] != var10) {
                this.field4461[arg1] = false;
                if (this.field4454 || arg3) {
                    this.field4462.method6735(this, this.field4453, arg1, this.field4498[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field4461[arg1] = true;
            if (arg3) {
                this.field4504[arg1] = class365.method4614(arg2, false);
            }
            return;
        }
        if (this.field4452 == 1) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            this.field4462.method6735(this, class387.field4486.field4470, this.field4453, this.field4457, (byte) 0, true);
            return;
        }
        field4456.reset();
        field4456.update(arg2, 0, arg2.length);
        int var5 = (int) field4456.getValue();
        if (this.field4457 != var5) {
            this.field4462.method6735(this, class387.field4486.field4470, this.field4453, this.field4457, (byte) 0, true);
            return;
        }
        class549 var6 = new class549(class389.method4125(arg2));
        int var7 = var6.method9025();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field4453 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method8803();
        }
        if (this.field4458 != var8) {
            this.field4462.method6735(this, class387.field4486.field4470, this.field4453, this.field4457, (byte) 0, true);
            return;
        }
        this.method6639(arg2);
        this.method6595();
    }

    @ObfuscatedName("oj.ae(I)V")
    public void method6595() {
        this.field4461 = new boolean[this.field4504.length];
        for (int var1 = 0; var1 < this.field4461.length; var1++) {
            this.field4461[var1] = false;
        }
        if (this.field4450 == null) {
            this.field4452 = 1;
            return;
        }
        this.field4459 = -1;
        for (int var2 = 0; var2 < this.field4461.length; var2++) {
            if (this.field4505[var2] > 0) {
                class385.method3840(var2, this.field4450, this);
                this.field4459 = var2;
            }
        }
        if (this.field4459 == -1) {
            this.field4452 = 1;
        }
    }

    @ObfuscatedName("oj.ad(II)I")
    public int method6603(int arg0) {
        if (this.field4504[arg0] == null) {
            return this.field4461[arg0] ? 100 : this.field4462.method6737(this.field4453, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("oj.aq(II)Z")
    public boolean method6600(int arg0) {
        return this.field4461[arg0];
    }

    @ObfuscatedName("oj.al(II)Z")
    public boolean method6594(int arg0) {
        return this.method6647(arg0) != null;
    }

    @ObfuscatedName("oj.aj(I)I")
    public int method6626() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4504.length; var3++) {
            if (this.field4505[var3] > 0) {
                var1 += 100;
                var2 += this.method6603(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
