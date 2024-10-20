package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ia")
public class class258 extends class256 {

    @ObfuscatedName("ia.z")
    public class174 field3354;

    @ObfuscatedName("ia.e")
    public class174 field3349;

    @ObfuscatedName("ia.k")
    public int field3350;

    @ObfuscatedName("ia.n")
    public volatile boolean field3348 = false;

    @ObfuscatedName("ia.i")
    public boolean field3353 = false;

    @ObfuscatedName("ia.av")
    public volatile boolean[] field3351;

    @ObfuscatedName("ia.ao")
    public static CRC32 field3352 = new CRC32();

    @ObfuscatedName("ia.am")
    public int field3346;

    @ObfuscatedName("ia.aj")
    public int field3347;

    @ObfuscatedName("ia.ah")
    public int field3355 = -1;

    public class258(class174 arg0, class174 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3354 = arg0;
        this.field3349 = arg1;
        this.field3350 = arg2;
        this.field3353 = arg5;
        class259.method2999(this, this.field3350);
    }

    @ObfuscatedName("ia.cz(I)I")
    public int method4269() {
        if (this.field3348) {
            return 100;
        } else if (this.field3332 == null) {
            int var1 = class259.method3998(255, this.field3350);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ia.q(IB)V")
    public void method4207(int arg0) {
        int var2 = this.field3350;
        long var3 = (long) ((var2 << 16) + arg0);
        class255 var5 = (class255) class259.field3365.method3674(var3);
        if (var5 != null) {
            class259.field3357.method3619(var5);
        }
    }

    @ObfuscatedName("ia.f(II)V")
    public void method4170(int arg0) {
        if (this.field3354 == null || this.field3351 == null || !this.field3351[arg0]) {
            class259.method1870(this, this.field3350, arg0, this.field3327[arg0], (byte) 2, true);
            return;
        }
        class174 var2 = this.field3354;
        byte[] var4 = null;
        class214 var5 = class257.field3342;
        synchronized (class257.field3342) {
            for (class254 var6 = (class254) class257.field3342.method3739(); var6 != null; var6 = (class254) class257.field3342.method3745()) {
                if ((long) arg0 == var6.field2613 && var6.field3314 == var2 && var6.field3315 == 0) {
                    var4 = var6.field3317;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method3054(arg0);
            this.method4267(var2, arg0, var8, true);
        } else {
            this.method4267(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ia.ck(IIB)V")
    public void method4286(int arg0, int arg1) {
        this.field3346 = arg0;
        this.field3347 = arg1;
        if (this.field3349 == null) {
            class259.method1870(this, 255, this.field3350, this.field3346, (byte) 0, true);
            return;
        }
        int var3 = this.field3350;
        class174 var4 = this.field3349;
        byte[] var6 = null;
        class214 var7 = class257.field3342;
        synchronized (class257.field3342) {
            for (class254 var8 = (class254) class257.field3342.method3739(); var8 != null; var8 = (class254) class257.field3342.method3745()) {
                if ((long) var3 == var8.field2613 && var8.field3314 == var4 && var8.field3315 == 0) {
                    var6 = var8.field3317;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method3054(var3);
            this.method4267(var4, var3, var10, true);
        } else {
            this.method4267(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ia.ci(I[BZZI)V")
    public void method4270(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3348) {
                throw new RuntimeException();
            }
            if (this.field3349 != null) {
                class257.method4516(this.field3350, arg1, this.field3349);
            }
            this.method4219(arg1);
            this.method4287();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3331[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3331[arg0];
        if (this.field3354 != null) {
            class257.method4516(arg0, arg1, this.field3354);
            this.field3351[arg0] = true;
        }
        if (arg3) {
            this.field3332[arg0] = class197.method3226(arg1, false);
        }
    }

    @ObfuscatedName("ia.ch(Lfn;I[BZI)V")
    public void method4267(class174 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3349 != arg0) {
            if (!arg3 && this.field3355 == arg1) {
                this.field3348 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3351[arg1] = false;
                if (this.field3353 || arg3) {
                    class259.method1870(this, this.field3350, arg1, this.field3327[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3352.reset();
            field3352.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3352.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3327[arg1] != var9 || this.field3331[arg1] != var10) {
                this.field3351[arg1] = false;
                if (this.field3353 || arg3) {
                    class259.method1870(this, this.field3350, arg1, this.field3327[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3351[arg1] = true;
            if (arg3) {
                this.field3332[arg1] = class197.method3226(arg2, false);
            }
            return;
        }
        if (this.field3348) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class259.method1870(this, 255, this.field3350, this.field3346, (byte) 0, true);
            return;
        }
        field3352.reset();
        field3352.update(arg2, 0, arg2.length);
        int var5 = (int) field3352.getValue();
        if (this.field3346 != var5) {
            class259.method1870(this, 255, this.field3350, this.field3346, (byte) 0, true);
            return;
        }
        class194 var6 = new class194(class256.method2333(arg2));
        int var7 = var6.method3247();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3350 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3261();
        }
        if (this.field3347 != var8) {
            class259.method1870(this, 255, this.field3350, this.field3346, (byte) 0, true);
            return;
        }
        this.method4219(arg2);
        this.method4287();
    }

    @ObfuscatedName("ia.cb(B)V")
    public void method4287() {
        this.field3351 = new boolean[this.field3332.length];
        for (int var1 = 0; var1 < this.field3351.length; var1++) {
            this.field3351[var1] = false;
        }
        if (this.field3354 == null) {
            this.field3348 = true;
            return;
        }
        this.field3355 = -1;
        for (int var2 = 0; var2 < this.field3351.length; var2++) {
            if (this.field3322[var2] > 0) {
                class257.method4119(var2, this.field3354, this);
                this.field3355 = var2;
            }
        }
        if (this.field3355 == -1) {
            this.field3348 = true;
        }
    }

    @ObfuscatedName("ia.g(IB)I")
    public int method4166(int arg0) {
        if (this.field3332[arg0] == null) {
            return this.field3351[arg0] ? 100 : class259.method3998(this.field3350, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ia.db(II)Z")
    public boolean method4296(int arg0) {
        return this.field3351[arg0];
    }

    @ObfuscatedName("ia.dh(II)Z")
    public boolean method4275(int arg0) {
        return this.method4222(arg0) != null;
    }

    @ObfuscatedName("ia.dw(I)I")
    public int method4276() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3332.length; var3++) {
            if (this.field3322[var3] > 0) {
                var1 += 100;
                var2 += this.method4166(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
