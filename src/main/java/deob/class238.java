package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ik")
public class class238 extends class236 {

    @ObfuscatedName("ik.y")
    public class161 field3223;

    @ObfuscatedName("ik.p")
    public class161 field3213;

    @ObfuscatedName("ik.l")
    public int field3217;

    @ObfuscatedName("ik.x")
    public volatile boolean field3216 = false;

    @ObfuscatedName("ik.r")
    public boolean field3214 = false;

    @ObfuscatedName("ik.t")
    public volatile boolean[] field3218;

    @ObfuscatedName("ik.a")
    public static CRC32 field3219 = new CRC32();

    @ObfuscatedName("ik.ad")
    public int field3220;

    @ObfuscatedName("ik.ay")
    public int field3221;

    @ObfuscatedName("ik.am")
    public int field3222 = -1;

    public class238(class161 arg0, class161 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3223 = arg0;
        this.field3213 = arg1;
        this.field3217 = arg2;
        this.field3214 = arg5;
        class239.method2648(this, this.field3217);
    }

    @ObfuscatedName("ik.ce(B)I")
    public int method3865() {
        if (this.field3216) {
            return 100;
        } else if (this.field3188 == null) {
            int var1 = this.field3217;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field3229 != null && Statics.field3229.field2454 == var2) {
                var4 = Statics.field877.field2370 * 99 / (Statics.field877.field2373.length - Statics.field3229.field3183) + 1;
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

    @ObfuscatedName("ik.o(II)V")
    public void method3759(int arg0) {
        class239.method3738(this.field3217, arg0);
    }

    @ObfuscatedName("ik.n(IB)V")
    public void method3823(int arg0) {
        if (this.field3223 == null || this.field3218 == null || !this.field3218[arg0]) {
            class239.method557(this, this.field3217, arg0, this.field3193[arg0], (byte) 2, true);
        } else {
            class237.method3727(arg0, this.field3223, this);
        }
    }

    @ObfuscatedName("ik.cn(III)V")
    public void method3855(int arg0, int arg1) {
        this.field3220 = arg0;
        this.field3221 = arg1;
        if (this.field3213 == null) {
            class239.method557(this, 255, this.field3217, this.field3220, (byte) 0, true);
        } else {
            class237.method3727(this.field3217, this.field3213, this);
        }
    }

    @ObfuscatedName("ik.cm(I[BZZI)V")
    public void method3856(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3195[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3195[arg0];
            if (this.field3223 != null) {
                class161 var10 = this.field3223;
                class234 var11 = new class234();
                var11.field3177 = 0;
                var11.field2454 = (long) arg0;
                var11.field3178 = arg1;
                var11.field3179 = var10;
                class194 var12 = class237.field3205;
                synchronized (class237.field3205) {
                    class237.field3205.method3318(var11);
                }
                class237.method1601();
                this.field3218[arg0] = true;
            }
            if (arg3) {
                this.field3188[arg0] = class177.method1906(arg1, false);
            }
            return;
        }
        if (this.field3216) {
            throw new RuntimeException();
        }
        if (this.field3213 != null) {
            int var5 = this.field3217;
            class161 var6 = this.field3213;
            class234 var7 = new class234();
            var7.field3177 = 0;
            var7.field2454 = (long) var5;
            var7.field3178 = arg1;
            var7.field3179 = var6;
            class194 var8 = class237.field3205;
            synchronized (class237.field3205) {
                class237.field3205.method3318(var7);
            }
            class237.method1601();
        }
        this.method3827(arg1);
        this.method3873();
    }

    @ObfuscatedName("ik.cl(Lfg;I[BZI)V")
    public void method3857(class161 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3213 != arg0) {
            if (!arg3 && this.field3222 == arg1) {
                this.field3216 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3218[arg1] = false;
                if (this.field3214 || arg3) {
                    class239.method557(this, this.field3217, arg1, this.field3193[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3219.reset();
            field3219.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3219.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3193[arg1] != var9 || this.field3195[arg1] != var10) {
                this.field3218[arg1] = false;
                if (this.field3214 || arg3) {
                    class239.method557(this, this.field3217, arg1, this.field3193[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3218[arg1] = true;
            if (arg3) {
                this.field3188[arg1] = class177.method1906(arg2, false);
            }
            return;
        }
        if (this.field3216) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class239.method557(this, 255, this.field3217, this.field3220, (byte) 0, true);
            return;
        }
        field3219.reset();
        field3219.update(arg2, 0, arg2.length);
        int var5 = (int) field3219.getValue();
        class174 var6 = new class174(class236.method307(arg2));
        int var7 = var6.method2891();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3217 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2896();
        }
        if (this.field3220 != var5 || this.field3221 != var8) {
            class239.method557(this, 255, this.field3217, this.field3220, (byte) 0, true);
            return;
        }
        this.method3827(arg2);
        this.method3873();
    }

    @ObfuscatedName("ik.ca(S)V")
    public void method3873() {
        this.field3218 = new boolean[this.field3188.length];
        for (int var1 = 0; var1 < this.field3218.length; var1++) {
            this.field3218[var1] = false;
        }
        if (this.field3223 == null) {
            this.field3216 = true;
            return;
        }
        this.field3222 = -1;
        for (int var2 = 0; var2 < this.field3218.length; var2++) {
            if (this.field3187[var2] > 0) {
                class161 var3 = this.field3223;
                class234 var5 = new class234();
                var5.field3177 = 1;
                var5.field2454 = (long) var2;
                var5.field3179 = var3;
                var5.field3180 = this;
                class194 var6 = class237.field3205;
                synchronized (class237.field3205) {
                    class237.field3205.method3318(var5);
                }
                class237.method1601();
                this.field3222 = var2;
            }
        }
        if (this.field3222 == -1) {
            this.field3216 = true;
        }
    }

    @ObfuscatedName("ik.q(II)I")
    public int method3765(int arg0) {
        if (this.field3188[arg0] == null) {
            return this.field3218[arg0] ? 100 : class239.method1701(this.field3217, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ik.cz(I)I")
    public int method3859() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3188.length; var3++) {
            if (this.field3187[var3] > 0) {
                var1 += 100;
                var2 += this.method3765(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
