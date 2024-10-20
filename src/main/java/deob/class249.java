package deob;

import java.util.zip.CRC32;

@ObfuscatedName("io")
public class class249 extends class247 {

    @ObfuscatedName("io.u")
    public class165 field3311;

    @ObfuscatedName("io.g")
    public class165 field3312;

    @ObfuscatedName("io.z")
    public int field3313;

    @ObfuscatedName("io.b")
    public volatile boolean field3320 = false;

    @ObfuscatedName("io.c")
    public boolean field3315 = false;

    @ObfuscatedName("io.aa")
    public volatile boolean[] field3316;

    @ObfuscatedName("io.ap")
    public static CRC32 field3317 = new CRC32();

    @ObfuscatedName("io.ao")
    public int field3310;

    @ObfuscatedName("io.ar")
    public int field3314;

    @ObfuscatedName("io.ay")
    public int field3318 = -1;

    public class249(class165 arg0, class165 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3311 = arg0;
        this.field3312 = arg1;
        this.field3313 = arg2;
        this.field3315 = arg5;
        int var8 = this.field3313;
        if (Statics.field1291 == null) {
            class250.method4028((class249) null, 255, 255, 0, (byte) 0, true);
            class250.field3335[var8] = this;
        } else {
            Statics.field1291.field2488 = var8 * 8 + 5;
            int var9 = Statics.field1291.method3127();
            int var10 = Statics.field1291.method3127();
            this.method4140(var9, var10);
        }
    }

    @ObfuscatedName("io.cz(I)I")
    public int method4160() {
        if (this.field3320) {
            return 100;
        } else if (this.field3291 == null) {
            int var1 = class250.method4901(255, this.field3313);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("io.i(IS)V")
    public void method4031(int arg0) {
        int var2 = this.field3313;
        long var3 = (long) ((var2 << 16) + arg0);
        class246 var5 = (class246) class250.field3328.method3517(var3);
        if (var5 != null) {
            class250.field3324.method3456(var5);
        }
    }

    @ObfuscatedName("io.q(II)V")
    public void method4049(int arg0) {
        if (this.field3311 == null || this.field3316 == null || !this.field3316[arg0]) {
            class250.method4028(this, this.field3313, arg0, this.field3302[arg0], (byte) 2, true);
        } else {
            class248.method4009(arg0, this.field3311, this);
        }
    }

    @ObfuscatedName("io.ce(IIB)V")
    public void method4140(int arg0, int arg1) {
        this.field3310 = arg0;
        this.field3314 = arg1;
        if (this.field3312 == null) {
            class250.method4028(this, 255, this.field3313, this.field3310, (byte) 0, true);
        } else {
            class248.method4009(this.field3313, this.field3312, this);
        }
    }

    @ObfuscatedName("io.cf(I[BZZB)V")
    public void method4141(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3299[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3299[arg0];
            if (this.field3311 != null) {
                class165 var10 = this.field3311;
                class245 var11 = new class245();
                var11.field3280 = 0;
                var11.field2563 = (long) arg0;
                var11.field3277 = arg1;
                var11.field3281 = var10;
                class205 var12 = class248.field3306;
                synchronized (class248.field3306) {
                    class248.field3306.method3572(var11);
                }
                class248.method4186();
                this.field3316[arg0] = true;
            }
            if (arg3) {
                this.field3291[arg0] = class188.method3015(arg1, false);
            }
            return;
        }
        if (this.field3320) {
            throw new RuntimeException();
        }
        if (this.field3312 != null) {
            int var5 = this.field3313;
            class165 var6 = this.field3312;
            class245 var7 = new class245();
            var7.field3280 = 0;
            var7.field2563 = (long) var5;
            var7.field3277 = arg1;
            var7.field3281 = var6;
            class205 var8 = class248.field3306;
            synchronized (class248.field3306) {
                class248.field3306.method3572(var7);
            }
            class248.method4186();
        }
        this.method4039(arg1);
        this.method4143();
    }

    @ObfuscatedName("io.cr(Lfx;I[BZI)V")
    public void method4142(class165 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3312 != arg0) {
            if (!arg3 && this.field3318 == arg1) {
                this.field3320 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3316[arg1] = false;
                if (this.field3315 || arg3) {
                    class250.method4028(this, this.field3313, arg1, this.field3302[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3317.reset();
            field3317.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3317.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3302[arg1] != var9 || this.field3299[arg1] != var10) {
                this.field3316[arg1] = false;
                if (this.field3315 || arg3) {
                    class250.method4028(this, this.field3313, arg1, this.field3302[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3316[arg1] = true;
            if (arg3) {
                this.field3291[arg1] = class188.method3015(arg2, false);
            }
            return;
        }
        if (this.field3320) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class250.method4028(this, 255, this.field3313, this.field3310, (byte) 0, true);
            return;
        }
        field3317.reset();
        field3317.update(arg2, 0, arg2.length);
        int var5 = (int) field3317.getValue();
        if (this.field3310 != var5) {
            class250.method4028(this, 255, this.field3313, this.field3310, (byte) 0, true);
            return;
        }
        class185 var6 = new class185(class247.method4742(arg2));
        int var7 = var6.method3197();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3313 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3127();
        }
        if (this.field3314 != var8) {
            class250.method4028(this, 255, this.field3313, this.field3310, (byte) 0, true);
            return;
        }
        this.method4039(arg2);
        this.method4143();
    }

    @ObfuscatedName("io.cp(I)V")
    public void method4143() {
        this.field3316 = new boolean[this.field3291.length];
        for (int var1 = 0; var1 < this.field3316.length; var1++) {
            this.field3316[var1] = false;
        }
        if (this.field3311 == null) {
            this.field3320 = true;
            return;
        }
        this.field3318 = -1;
        for (int var2 = 0; var2 < this.field3316.length; var2++) {
            if (this.field3295[var2] > 0) {
                class248.method4019(var2, this.field3311, this);
                this.field3318 = var2;
            }
        }
        if (this.field3318 == -1) {
            this.field3320 = true;
        }
    }

    @ObfuscatedName("io.m(II)I")
    public int method4038(int arg0) {
        if (this.field3291[arg0] == null) {
            return this.field3316[arg0] ? 100 : class250.method4901(this.field3313, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("io.dp(IS)Z")
    public boolean method4158(int arg0) {
        return this.field3316[arg0];
    }

    @ObfuscatedName("io.du(II)Z")
    public boolean method4145(int arg0) {
        return this.method4043(arg0) != null;
    }

    @ObfuscatedName("io.do(I)I")
    public int method4146() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3291.length; var3++) {
            if (this.field3295[var3] > 0) {
                var1 += 100;
                var2 += this.method4038(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
