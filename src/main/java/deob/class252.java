package deob;

import java.util.zip.CRC32;

@ObfuscatedName("im")
public class class252 extends class250 {

    @ObfuscatedName("im.i")
    public class165 field3255;

    @ObfuscatedName("im.k")
    public class165 field3246;

    @ObfuscatedName("im.q")
    public int field3248;

    @ObfuscatedName("im.y")
    public volatile boolean field3249 = false;

    @ObfuscatedName("im.av")
    public boolean field3250 = false;

    @ObfuscatedName("im.ag")
    public volatile boolean[] field3254;

    @ObfuscatedName("im.af")
    public static CRC32 field3252 = new CRC32();

    @ObfuscatedName("im.az")
    public int field3253;

    @ObfuscatedName("im.at")
    public int field3247;

    @ObfuscatedName("im.ac")
    public int field3251 = -1;

    public class252(class165 arg0, class165 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3255 = arg0;
        this.field3246 = arg1;
        this.field3248 = arg2;
        this.field3250 = arg5;
        int var8 = this.field3248;
        if (Statics.field2003 == null) {
            class253.method1756((class252) null, 255, 255, 0, (byte) 0, true);
            class253.field3272[var8] = this;
        } else {
            Statics.field2003.field2414 = var8 * 8 + 5;
            int var9 = Statics.field2003.method3432();
            int var10 = Statics.field2003.method3432();
            this.method4417(var9, var10);
        }
    }

    @ObfuscatedName("im.dl(B)Z")
    public boolean method4396() {
        return this.field3249;
    }

    @ObfuscatedName("im.dd(I)I")
    public int method4405() {
        if (this.field3249) {
            return 100;
        } else if (this.field3233 == null) {
            int var1 = this.field3248;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field3268 != null && Statics.field3268.field2497 == var2) {
                var4 = Statics.field359.field2414 * 99 / (Statics.field359.field2415.length - Statics.field3268.field3220) + 1;
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

    @ObfuscatedName("im.l(II)V")
    public void method4288(int arg0) {
        int var2 = this.field3248;
        long var3 = (long) ((var2 << 16) + arg0);
        class249 var5 = (class249) class253.field3261.method3774(var3);
        if (var5 != null) {
            class253.field3262.method3684(var5);
        }
    }

    @ObfuscatedName("im.v(II)V")
    public void method4321(int arg0) {
        if (this.field3255 == null || this.field3254 == null || !this.field3254[arg0]) {
            class253.method1756(this, this.field3248, arg0, this.field3227[arg0], (byte) 2, true);
            return;
        }
        class165 var2 = this.field3255;
        byte[] var4 = null;
        class208 var5 = class251.field3245;
        synchronized (class251.field3245) {
            for (class248 var6 = (class248) class251.field3245.method3827(); var6 != null; var6 = (class248) class251.field3245.method3829()) {
                if ((long) arg0 == var6.field2497 && var6.field3213 == var2 && var6.field3215 == 0) {
                    var4 = var6.field3214;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method3161(arg0);
            this.method4399(var2, arg0, var8, true);
        } else {
            this.method4399(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("im.dm(III)V")
    public void method4417(int arg0, int arg1) {
        this.field3253 = arg0;
        this.field3247 = arg1;
        if (this.field3246 == null) {
            class253.method1756(this, 255, this.field3248, this.field3253, (byte) 0, true);
            return;
        }
        int var3 = this.field3248;
        class165 var4 = this.field3246;
        byte[] var6 = null;
        class208 var7 = class251.field3245;
        synchronized (class251.field3245) {
            for (class248 var8 = (class248) class251.field3245.method3827(); var8 != null; var8 = (class248) class251.field3245.method3829()) {
                if ((long) var3 == var8.field2497 && var8.field3213 == var4 && var8.field3215 == 0) {
                    var6 = var8.field3214;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method3161(var3);
            this.method4399(var4, var3, var10, true);
        } else {
            this.method4399(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("im.dy(I[BZZI)V")
    public void method4398(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3228[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3228[arg0];
            if (this.field3255 != null) {
                class165 var10 = this.field3255;
                class248 var11 = new class248();
                var11.field3215 = 0;
                var11.field2497 = (long) arg0;
                var11.field3214 = arg1;
                var11.field3213 = var10;
                class208 var12 = class251.field3245;
                synchronized (class251.field3245) {
                    class251.field3245.method3823(var11);
                }
                class251.method4275();
                this.field3254[arg0] = true;
            }
            if (arg3) {
                this.field3233[arg0] = class189.method3071(arg1, false);
            }
            return;
        }
        if (this.field3249) {
            throw new RuntimeException();
        }
        if (this.field3246 != null) {
            int var5 = this.field3248;
            class165 var6 = this.field3246;
            class248 var7 = new class248();
            var7.field3215 = 0;
            var7.field2497 = (long) var5;
            var7.field3214 = arg1;
            var7.field3213 = var6;
            class208 var8 = class251.field3245;
            synchronized (class251.field3245) {
                class251.field3245.method3823(var7);
            }
            class251.method4275();
        }
        this.method4287(arg1);
        this.method4411();
    }

    @ObfuscatedName("im.dv(Lfi;I[BZI)V")
    public void method4399(class165 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3246 != arg0) {
            if (!arg3 && this.field3251 == arg1) {
                this.field3249 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3254[arg1] = false;
                if (this.field3250 || arg3) {
                    class253.method1756(this, this.field3248, arg1, this.field3227[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3252.reset();
            field3252.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3252.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3227[arg1] != var9 || this.field3228[arg1] != var10) {
                this.field3254[arg1] = false;
                if (this.field3250 || arg3) {
                    class253.method1756(this, this.field3248, arg1, this.field3227[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3254[arg1] = true;
            if (arg3) {
                this.field3233[arg1] = class189.method3071(arg2, false);
            }
            return;
        }
        if (this.field3249) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class253.method1756(this, 255, this.field3248, this.field3253, (byte) 0, true);
            return;
        }
        field3252.reset();
        field3252.update(arg2, 0, arg2.length);
        int var5 = (int) field3252.getValue();
        if (this.field3253 != var5) {
            class253.method1756(this, 255, this.field3248, this.field3253, (byte) 0, true);
            return;
        }
        class185 var6 = new class185(class250.method3257(arg2));
        int var7 = var6.method3344();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3248 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3432();
        }
        if (this.field3247 != var8) {
            class253.method1756(this, 255, this.field3248, this.field3253, (byte) 0, true);
            return;
        }
        this.method4287(arg2);
        this.method4411();
    }

    @ObfuscatedName("im.dn(B)V")
    public void method4411() {
        this.field3254 = new boolean[this.field3233.length];
        for (int var1 = 0; var1 < this.field3254.length; var1++) {
            this.field3254[var1] = false;
        }
        if (this.field3255 == null) {
            this.field3249 = true;
            return;
        }
        this.field3251 = -1;
        for (int var2 = 0; var2 < this.field3254.length; var2++) {
            if (this.field3236[var2] > 0) {
                class165 var3 = this.field3255;
                class248 var5 = new class248();
                var5.field3215 = 1;
                var5.field2497 = (long) var2;
                var5.field3213 = var3;
                var5.field3216 = this;
                class208 var6 = class251.field3245;
                synchronized (class251.field3245) {
                    class251.field3245.method3823(var5);
                }
                class251.method4275();
                this.field3251 = var2;
            }
        }
        if (this.field3251 == -1) {
            this.field3249 = true;
        }
    }

    @ObfuscatedName("im.m(IB)I")
    public int method4295(int arg0) {
        if (this.field3233[arg0] != null) {
            return 100;
        } else if (this.field3254[arg0]) {
            return 100;
        } else {
            int var2 = this.field3248;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field3268 != null && Statics.field3268.field2497 == var3) {
                var5 = Statics.field359.field2414 * 99 / (Statics.field359.field2415.length - Statics.field3268.field3220) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("im.do(II)Z")
    public boolean method4401(int arg0) {
        return this.field3254[arg0];
    }

    @ObfuscatedName("im.da(II)Z")
    public boolean method4402(int arg0) {
        return this.method4366(arg0) != null;
    }

    @ObfuscatedName("im.dr(B)I")
    public int method4395() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3233.length; var3++) {
            if (this.field3236[var3] > 0) {
                var1 += 100;
                var2 += this.method4295(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
