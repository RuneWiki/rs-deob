package deob;

import java.util.zip.CRC32;

@ObfuscatedName("oz")
public class class373 extends class375 {

    @ObfuscatedName("oz.ar")
    public class459 field4343;

    @ObfuscatedName("oz.ag")
    public class459 field4340;

    @ObfuscatedName("oz.ao")
    public int field4352;

    @ObfuscatedName("oz.ae")
    public volatile int field4342 = 0;

    @ObfuscatedName("oz.aa")
    public boolean field4346 = false;

    @ObfuscatedName("oz.au")
    public volatile boolean[] field4344;

    @ObfuscatedName("oz.an")
    public static CRC32 field4345 = new CRC32();

    @ObfuscatedName("oz.ad")
    public int field4339;

    @ObfuscatedName("oz.ax")
    public int field4351;

    @ObfuscatedName("oz.aw")
    public int field4348 = -1;

    @ObfuscatedName("oz.az")
    public boolean field4349 = false;

    @ObfuscatedName("oz.av")
    public boolean field4350 = false;

    @ObfuscatedName("oz.ak")
    public class376 field4336;

    public class373(class459 arg0, class459 arg1, class376 arg2, int arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8) {
        super(arg4, arg5);
        this.field4343 = arg0;
        this.field4340 = arg1;
        this.field4352 = arg3;
        this.field4346 = arg6;
        this.field4349 = arg7;
        this.field4350 = arg8;
        this.field4336 = arg2;
        this.field4336.method6481(this, this.field4352);
    }

    @ObfuscatedName("oz.am(I)Z")
    public boolean method6350() {
        return this.field4342 == 1;
    }

    @ObfuscatedName("oz.ap(I)I")
    public int method6351() {
        if (this.field4342 == 1 || this.field4349 && this.field4342 == 2) {
            return 100;
        } else if (this.field4367 == null) {
            int var1 = this.field4336.method6488(255, this.field4352);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("oz.af(II)V")
    public void method6376(int arg0) {
        this.field4336.method6489(this.field4352, arg0);
    }

    @ObfuscatedName("oz.aj(II)V")
    public void method6353(int arg0) {
        if (this.field4343 == null || this.field4344 == null || !this.field4344[arg0]) {
            this.field4336.method6492(this, this.field4352, arg0, this.field4358[arg0], (byte) 2, true);
            return;
        }
        class459 var2 = this.field4343;
        byte[] var4 = null;
        class394 var5 = class372.field4331;
        synchronized (class372.field4331) {
            for (class371 var6 = (class371) class372.field4331.method6670(); var6 != null; var6 = (class371) class372.field4331.method6665()) {
                if ((long) arg0 == var6.field4889 && var6.field4325 == var2 && var6.field4324 == 0) {
                    var4 = var6.field4322;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method7720(arg0);
            this.method6357(var2, arg0, var8, true);
        } else {
            this.method6357(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("oz.aq(I)V")
    public void method6381() {
        this.field4342 = 2;
        this.field4360 = new int[0];
        this.field4358 = new int[0];
        this.field4362 = new int[0];
        this.field4363 = new int[0];
        this.field4361 = new int[0][];
        this.field4367 = new Object[0];
        this.field4368 = new Object[0][];
    }

    @ObfuscatedName("oz.ar(III)V")
    public void method6355(int arg0, int arg1) {
        this.field4339 = arg0;
        this.field4351 = arg1;
        if (this.field4340 == null) {
            this.field4336.method6492(this, 255, this.field4352, this.field4339, (byte) 0, true);
            return;
        }
        int var3 = this.field4352;
        class459 var4 = this.field4340;
        byte[] var6 = null;
        class394 var7 = class372.field4331;
        synchronized (class372.field4331) {
            for (class371 var8 = (class371) class372.field4331.method6670(); var8 != null; var8 = (class371) class372.field4331.method6665()) {
                if ((long) var3 == var8.field4889 && var8.field4325 == var4 && var8.field4324 == 0) {
                    var6 = var8.field4322;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method7720(var3);
            this.method6357(var4, var3, var10, true);
        } else {
            this.method6357(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("oz.ag(I[BZZI)V")
    public void method6356(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field4362[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field4362[arg0];
            if (this.field4343 != null) {
                class459 var10 = this.field4343;
                class371 var11 = new class371();
                var11.field4324 = 0;
                var11.field4889 = (long) arg0;
                var11.field4322 = arg1;
                var11.field4325 = var10;
                class394 var12 = class372.field4331;
                synchronized (class372.field4331) {
                    class372.field4331.method6666(var11);
                }
                class372.method3233();
                this.field4344[arg0] = true;
            }
            if (arg3) {
                this.field4367[arg0] = class349.method3191(arg1, false);
            }
            return;
        }
        if (this.field4342 == 1) {
            throw new RuntimeException();
        }
        if (this.field4340 != null) {
            int var5 = this.field4352;
            class459 var6 = this.field4340;
            class371 var7 = new class371();
            var7.field4324 = 0;
            var7.field4889 = (long) var5;
            var7.field4322 = arg1;
            var7.field4325 = var6;
            class394 var8 = class372.field4331;
            synchronized (class372.field4331) {
                class372.field4331.method6666(var7);
            }
            class372.method3233();
        }
        this.method6395(arg1);
        this.method6358();
    }

    @ObfuscatedName("oz.ao(Lrl;I[BZI)V")
    public void method6357(class459 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field4340 != arg0) {
            if (!arg3 && this.field4348 == arg1) {
                this.field4342 = 1;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field4344[arg1] = false;
                if (this.field4346 || arg3) {
                    this.field4336.method6492(this, this.field4352, arg1, this.field4358[arg1], (byte) 2, arg3);
                }
                return;
            }
            field4345.reset();
            field4345.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field4345.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field4358[arg1] != var9 || this.field4362[arg1] != var10) {
                this.field4344[arg1] = false;
                if (this.field4346 || arg3) {
                    this.field4336.method6492(this, this.field4352, arg1, this.field4358[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field4344[arg1] = true;
            if (arg3) {
                this.field4367[arg1] = class349.method3191(arg2, false);
            }
            return;
        }
        if (this.field4342 == 1) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            this.field4336.method6492(this, 255, this.field4352, this.field4339, (byte) 0, true);
            return;
        }
        field4345.reset();
        field4345.update(arg2, 0, arg2.length);
        int var5 = (int) field4345.getValue();
        if (this.field4339 != var5) {
            this.field4336.method6492(this, 255, this.field4352, this.field4339, (byte) 0, true);
            return;
        }
        class531 var6 = new class531(class375.method2882(arg2));
        int var7 = var6.method8561();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field4352 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method8566();
        }
        if (this.field4351 != var8) {
            this.field4336.method6492(this, 255, this.field4352, this.field4339, (byte) 0, true);
            return;
        }
        this.method6395(arg2);
        this.method6358();
    }

    @ObfuscatedName("oz.ae(I)V")
    public void method6358() {
        this.field4344 = new boolean[this.field4367.length];
        for (int var1 = 0; var1 < this.field4344.length; var1++) {
            this.field4344[var1] = false;
        }
        if (this.field4343 == null) {
            this.field4342 = 1;
            return;
        }
        this.field4348 = -1;
        for (int var2 = 0; var2 < this.field4344.length; var2++) {
            if (this.field4363[var2] > 0) {
                class459 var3 = this.field4343;
                class371 var5 = new class371();
                var5.field4324 = 1;
                var5.field4889 = (long) var2;
                var5.field4325 = var3;
                var5.field4323 = this;
                class394 var6 = class372.field4331;
                synchronized (class372.field4331) {
                    class372.field4331.method6666(var5);
                }
                class372.method3233();
                this.field4348 = var2;
            }
        }
        if (this.field4348 == -1) {
            this.field4342 = 1;
        }
    }

    @ObfuscatedName("oz.aa(II)I")
    public int method6359(int arg0) {
        if (this.field4367[arg0] == null) {
            return this.field4344[arg0] ? 100 : this.field4336.method6488(this.field4352, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("oz.au(II)Z")
    public boolean method6360(int arg0) {
        return this.field4344[arg0];
    }

    @ObfuscatedName("oz.an(II)Z")
    public boolean method6349(int arg0) {
        return this.method6405(arg0) != null;
    }

    @ObfuscatedName("oz.ad(I)I")
    public int method6362() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4367.length; var3++) {
            if (this.field4363[var3] > 0) {
                var1 += 100;
                var2 += this.method6359(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
