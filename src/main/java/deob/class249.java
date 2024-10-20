package deob;

import java.util.zip.CRC32;

@ObfuscatedName("iu")
public class class249 extends class247 {

    @ObfuscatedName("iu.m")
    public class165 field3335;

    @ObfuscatedName("iu.q")
    public class165 field3337;

    @ObfuscatedName("iu.b")
    public int field3334;

    @ObfuscatedName("iu.h")
    public volatile boolean field3333 = false;

    @ObfuscatedName("iu.d")
    public boolean field3332 = false;

    @ObfuscatedName("iu.v")
    public volatile boolean[] field3336;

    @ObfuscatedName("iu.p")
    public static CRC32 field3338 = new CRC32();

    @ObfuscatedName("iu.ab")
    public int field3339;

    @ObfuscatedName("iu.ad")
    public int field3340;

    @ObfuscatedName("iu.ag")
    public int field3341 = -1;

    public class249(class165 arg0, class165 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3335 = arg0;
        this.field3337 = arg1;
        this.field3334 = arg2;
        this.field3332 = arg5;
        class250.method1503(this, this.field3334);
    }

    @ObfuscatedName("iu.ck(I)I")
    public int method3996() {
        if (this.field3333) {
            return 100;
        } else if (this.field3313 == null) {
            int var1 = class250.method949(255, this.field3334);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("iu.w(II)V")
    public void method3896(int arg0) {
        int var2 = this.field3334;
        long var3 = (long) ((var2 << 16) + arg0);
        class246 var5 = (class246) class250.field3351.method3387(var3);
        if (var5 != null) {
            class250.field3349.method3327(var5);
        }
    }

    @ObfuscatedName("iu.n(II)V")
    public void method3905(int arg0) {
        if (this.field3335 == null || this.field3336 == null || !this.field3336[arg0]) {
            class250.method1016(this, this.field3334, arg0, this.field3325[arg0], (byte) 2, true);
        } else {
            class248.method461(arg0, this.field3335, this);
        }
    }

    @ObfuscatedName("iu.cn(III)V")
    public void method3999(int arg0, int arg1) {
        this.field3339 = arg0;
        this.field3340 = arg1;
        if (this.field3337 == null) {
            class250.method1016(this, 255, this.field3334, this.field3339, (byte) 0, true);
        } else {
            class248.method461(this.field3334, this.field3337, this);
        }
    }

    @ObfuscatedName("iu.ct(I[BZZI)V")
    public void method4000(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3314[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3314[arg0];
            if (this.field3335 != null) {
                class165 var12 = this.field3335;
                class245 var13 = new class245();
                var13.field3302 = 0;
                var13.field2589 = (long) arg0;
                var13.field3300 = arg1;
                var13.field3301 = var12;
                class205 var14 = class248.field3328;
                synchronized (class248.field3328) {
                    class248.field3328.method3446(var13);
                }
                Object var16 = class248.field3330;
                synchronized (class248.field3330) {
                    if (class248.field3329 == 0) {
                        Statics.field3327 = new Thread(new class248());
                        Statics.field3327.setDaemon(true);
                        Statics.field3327.start();
                        Statics.field3327.setPriority(5);
                    }
                    class248.field3329 = 600;
                }
                this.field3336[arg0] = true;
            }
            if (arg3) {
                this.field3313[arg0] = class188.method205(arg1, false);
            }
            return;
        }
        if (this.field3333) {
            throw new RuntimeException();
        }
        if (this.field3337 != null) {
            int var5 = this.field3334;
            class165 var6 = this.field3337;
            class245 var7 = new class245();
            var7.field3302 = 0;
            var7.field2589 = (long) var5;
            var7.field3300 = arg1;
            var7.field3301 = var6;
            class205 var8 = class248.field3328;
            synchronized (class248.field3328) {
                class248.field3328.method3446(var7);
            }
            Object var10 = class248.field3330;
            synchronized (class248.field3330) {
                if (class248.field3329 == 0) {
                    Statics.field3327 = new Thread(new class248());
                    Statics.field3327.setDaemon(true);
                    Statics.field3327.start();
                    Statics.field3327.setPriority(5);
                }
                class248.field3329 = 600;
            }
        }
        this.method3906(arg1);
        this.method3995();
    }

    @ObfuscatedName("iu.cx(Lfv;I[BZS)V")
    public void method4003(class165 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3337 != arg0) {
            if (!arg3 && this.field3341 == arg1) {
                this.field3333 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3336[arg1] = false;
                if (this.field3332 || arg3) {
                    class250.method1016(this, this.field3334, arg1, this.field3325[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3338.reset();
            field3338.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3338.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3325[arg1] != var9 || this.field3314[arg1] != var10) {
                this.field3336[arg1] = false;
                if (this.field3332 || arg3) {
                    class250.method1016(this, this.field3334, arg1, this.field3325[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3336[arg1] = true;
            if (arg3) {
                this.field3313[arg1] = class188.method205(arg2, false);
            }
            return;
        }
        if (this.field3333) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class250.method1016(this, 255, this.field3334, this.field3339, (byte) 0, true);
            return;
        }
        field3338.reset();
        field3338.update(arg2, 0, arg2.length);
        int var5 = (int) field3338.getValue();
        class185 var6 = new class185(class247.method3715(arg2));
        int var7 = var6.method2962();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3334 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2967();
        }
        if (this.field3339 != var5 || this.field3340 != var8) {
            class250.method1016(this, 255, this.field3334, this.field3339, (byte) 0, true);
            return;
        }
        this.method3906(arg2);
        this.method3995();
    }

    @ObfuscatedName("iu.cl(I)V")
    public void method3995() {
        this.field3336 = new boolean[this.field3313.length];
        for (int var1 = 0; var1 < this.field3336.length; var1++) {
            this.field3336[var1] = false;
        }
        if (this.field3335 == null) {
            this.field3333 = true;
            return;
        }
        this.field3341 = -1;
        for (int var2 = 0; var2 < this.field3336.length; var2++) {
            if (this.field3315[var2] > 0) {
                class248.method3214(var2, this.field3335, this);
                this.field3341 = var2;
            }
        }
        if (this.field3341 == -1) {
            this.field3333 = true;
        }
    }

    @ObfuscatedName("iu.f(II)I")
    public int method3944(int arg0) {
        if (this.field3313[arg0] == null) {
            return this.field3336[arg0] ? 100 : class250.method949(this.field3334, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("iu.ca(I)I")
    public int method4002() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3313.length; var3++) {
            if (this.field3315[var3] > 0) {
                var1 += 100;
                var2 += this.method3944(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
