package deob;

import java.util.zip.CRC32;

@ObfuscatedName("in")
public class class257 extends class255 {

    @ObfuscatedName("in.i")
    public class170 field3265;

    @ObfuscatedName("in.c")
    public class170 field3272;

    @ObfuscatedName("in.j")
    public int field3267;

    @ObfuscatedName("in.z")
    public volatile boolean field3269 = false;

    @ObfuscatedName("in.ag")
    public boolean field3273 = false;

    @ObfuscatedName("in.af")
    public volatile boolean[] field3270;

    @ObfuscatedName("in.ay")
    public static CRC32 field3271 = new CRC32();

    @ObfuscatedName("in.aa")
    public int field3268;

    @ObfuscatedName("in.ab")
    public int field3266;

    @ObfuscatedName("in.ah")
    public int field3274 = -1;

    public class257(class170 arg0, class170 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3265 = arg0;
        this.field3272 = arg1;
        this.field3267 = arg2;
        this.field3273 = arg5;
        class258.method1607(this, this.field3267);
    }

    @ObfuscatedName("in.cz(I)Z")
    public boolean method4526() {
        return this.field3269;
    }

    @ObfuscatedName("in.cl(I)I")
    public int method4543() {
        if (this.field3269) {
            return 100;
        } else if (this.field3251 == null) {
            int var1 = this.field3267;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field62 != null && Statics.field62.field2512 == var2) {
                var4 = Statics.field1943.field2419 * 99 / (Statics.field1943.field2420.length - Statics.field62.field3235) + 1;
            } else {
                var4 = 0;
            }
            int var5 = var4;
            if (var4 >= 100) {
                var5 = 99;
            }
            return var5;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("in.s(II)V")
    public void method4421(int arg0) {
        class258.method1930(this.field3267, arg0);
    }

    @ObfuscatedName("in.r(IB)V")
    public void method4432(int arg0) {
        if (this.field3265 == null || this.field3270 == null || !this.field3270[arg0]) {
            class258.method378(this, this.field3267, arg0, this.field3245[arg0], (byte) 2, true);
            return;
        }
        class170 var2 = this.field3265;
        byte[] var4 = null;
        class213 var5 = class256.field3261;
        synchronized (class256.field3261) {
            for (class253 var6 = (class253) class256.field3261.method3990(); var6 != null; var6 = (class253) class256.field3261.method3984()) {
                if ((long) arg0 == var6.field2512 && var6.field3231 == var2 && var6.field3229 == 0) {
                    var4 = var6.field3232;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method3291(arg0);
            this.method4528(var2, arg0, var8, true);
        } else {
            this.method4528(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("in.dz(III)V")
    public void method4535(int arg0, int arg1) {
        this.field3268 = arg0;
        this.field3266 = arg1;
        if (this.field3272 == null) {
            class258.method378(this, 255, this.field3267, this.field3268, (byte) 0, true);
            return;
        }
        int var3 = this.field3267;
        class170 var4 = this.field3272;
        byte[] var6 = null;
        class213 var7 = class256.field3261;
        synchronized (class256.field3261) {
            for (class253 var8 = (class253) class256.field3261.method3990(); var8 != null; var8 = (class253) class256.field3261.method3984()) {
                if ((long) var3 == var8.field2512 && var8.field3231 == var4 && var8.field3229 == 0) {
                    var6 = var8.field3232;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method3291(var3);
            this.method4528(var4, var3, var10, true);
        } else {
            this.method4528(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("in.ds(I[BZZI)V")
    public void method4527(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3269) {
                throw new RuntimeException();
            }
            if (this.field3272 != null) {
                class256.method131(this.field3267, arg1, this.field3272);
            }
            this.method4420(arg1);
            this.method4529();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3243[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3243[arg0];
        if (this.field3265 != null) {
            class256.method131(arg0, arg1, this.field3265);
            this.field3270[arg0] = true;
        }
        if (arg3) {
            this.field3251[arg0] = class194.method1658(arg1, false);
        }
    }

    @ObfuscatedName("in.dg(Lfb;I[BZB)V")
    public void method4528(class170 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3272 != arg0) {
            if (!arg3 && this.field3274 == arg1) {
                this.field3269 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3270[arg1] = false;
                if (this.field3273 || arg3) {
                    class258.method378(this, this.field3267, arg1, this.field3245[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3271.reset();
            field3271.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3271.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3245[arg1] != var9 || this.field3243[arg1] != var10) {
                this.field3270[arg1] = false;
                if (this.field3273 || arg3) {
                    class258.method378(this, this.field3267, arg1, this.field3245[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3270[arg1] = true;
            if (arg3) {
                this.field3251[arg1] = class194.method1658(arg2, false);
            }
            return;
        }
        if (this.field3269) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class258.method378(this, 255, this.field3267, this.field3268, (byte) 0, true);
            return;
        }
        field3271.reset();
        field3271.update(arg2, 0, arg2.length);
        int var5 = (int) field3271.getValue();
        if (this.field3268 != var5) {
            class258.method378(this, 255, this.field3267, this.field3268, (byte) 0, true);
            return;
        }
        class190 var6 = new class190(class255.method1760(arg2));
        int var7 = var6.method3443();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3267 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3460();
        }
        if (this.field3266 != var8) {
            class258.method378(this, 255, this.field3267, this.field3268, (byte) 0, true);
            return;
        }
        this.method4420(arg2);
        this.method4529();
    }

    @ObfuscatedName("in.dl(B)V")
    public void method4529() {
        this.field3270 = new boolean[this.field3251.length];
        for (int var1 = 0; var1 < this.field3270.length; var1++) {
            this.field3270[var1] = false;
        }
        if (this.field3265 == null) {
            this.field3269 = true;
            return;
        }
        this.field3274 = -1;
        for (int var2 = 0; var2 < this.field3270.length; var2++) {
            if (this.field3247[var2] > 0) {
                class256.method4405(var2, this.field3265, this);
                this.field3274 = var2;
            }
        }
        if (this.field3274 == -1) {
            this.field3269 = true;
        }
    }

    @ObfuscatedName("in.q(II)I")
    public int method4428(int arg0) {
        if (this.field3251[arg0] != null) {
            return 100;
        } else if (this.field3270[arg0]) {
            return 100;
        } else {
            int var2 = this.field3267;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field62 != null && Statics.field62.field2512 == var3) {
                var5 = Statics.field1943.field2419 * 99 / (Statics.field1943.field2420.length - Statics.field62.field3235) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("in.dq(II)Z")
    public boolean method4530(int arg0) {
        return this.field3270[arg0];
    }

    @ObfuscatedName("in.dn(II)Z")
    public boolean method4531(int arg0) {
        return this.method4433(arg0) != null;
    }

    @ObfuscatedName("in.dt(I)I")
    public int method4534() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3251.length; var3++) {
            if (this.field3247[var3] > 0) {
                var1 += 100;
                var2 += this.method4428(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
