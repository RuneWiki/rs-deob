package deob;

import java.util.zip.CRC32;

@ObfuscatedName("iw")
public class class238 extends class236 {

    @ObfuscatedName("iw.l")
    public class161 field3248;

    @ObfuscatedName("iw.h")
    public class161 field3257;

    @ObfuscatedName("iw.d")
    public int field3249;

    @ObfuscatedName("iw.x")
    public volatile boolean field3255 = false;

    @ObfuscatedName("iw.b")
    public boolean field3250 = false;

    @ObfuscatedName("iw.y")
    public volatile boolean[] field3252;

    @ObfuscatedName("iw.u")
    public static CRC32 field3253 = new CRC32();

    @ObfuscatedName("iw.av")
    public int field3254;

    @ObfuscatedName("iw.ax")
    public int field3247;

    @ObfuscatedName("iw.af")
    public int field3251 = -1;

    public class238(class161 arg0, class161 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3248 = arg0;
        this.field3257 = arg1;
        this.field3249 = arg2;
        this.field3250 = arg5;
        int var8 = this.field3249;
        if (Statics.field3273 == null) {
            class239.method46((class238) null, 255, 255, 0, (byte) 0, true);
            class239.field3274[var8] = this;
        } else {
            Statics.field3273.field2408 = var8 * 8 + 5;
            int var9 = Statics.field3273.method2803();
            int var10 = Statics.field3273.method2803();
            this.method3827(var9, var10);
        }
    }

    @ObfuscatedName("iw.cs(S)I")
    public int method3804() {
        if (this.field3255) {
            return 100;
        } else if (this.field3231 == null) {
            int var1 = class239.method1514(255, this.field3249);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("iw.m(II)V")
    public void method3703(int arg0) {
        int var2 = this.field3249;
        long var3 = (long) ((var2 << 16) + arg0);
        class235 var5 = (class235) class239.field3266.method3190(var3);
        if (var5 != null) {
            class239.field3260.method3141(var5);
        }
    }

    @ObfuscatedName("iw.a(II)V")
    public void method3713(int arg0) {
        if (this.field3248 == null || this.field3252 == null || !this.field3252[arg0]) {
            class239.method46(this, this.field3249, arg0, this.field3228[arg0], (byte) 2, true);
            return;
        }
        class161 var2 = this.field3248;
        byte[] var4 = null;
        class194 var5 = class237.field3246;
        synchronized (class237.field3246) {
            for (class234 var6 = (class234) class237.field3246.method3252(); var6 != null; var6 = (class234) class237.field3246.method3277()) {
                if ((long) arg0 == var6.field2483 && var6.field3213 == var2 && var6.field3212 == 0) {
                    var4 = var6.field3211;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2685(arg0);
            this.method3806(var2, arg0, var8, true);
        } else {
            this.method3806(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("iw.cm(III)V")
    public void method3827(int arg0, int arg1) {
        this.field3254 = arg0;
        this.field3247 = arg1;
        if (this.field3257 == null) {
            class239.method46(this, 255, this.field3249, this.field3254, (byte) 0, true);
            return;
        }
        int var3 = this.field3249;
        class161 var4 = this.field3257;
        byte[] var6 = null;
        class194 var7 = class237.field3246;
        synchronized (class237.field3246) {
            for (class234 var8 = (class234) class237.field3246.method3252(); var8 != null; var8 = (class234) class237.field3246.method3277()) {
                if ((long) var3 == var8.field2483 && var8.field3213 == var4 && var8.field3212 == 0) {
                    var6 = var8.field3211;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2685(var3);
            this.method3806(var4, var3, var10, true);
        } else {
            this.method3806(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("iw.cq(I[BZZI)V")
    public void method3818(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3226[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3226[arg0];
            if (this.field3248 != null) {
                class161 var12 = this.field3248;
                class234 var13 = new class234();
                var13.field3212 = 0;
                var13.field2483 = (long) arg0;
                var13.field3211 = arg1;
                var13.field3213 = var12;
                class194 var14 = class237.field3246;
                synchronized (class237.field3246) {
                    class237.field3246.method3270(var13);
                }
                Object var16 = class237.field3240;
                synchronized (class237.field3240) {
                    if (class237.field3242 == 0) {
                        Statics.field353 = new Thread(new class237());
                        Statics.field353.setDaemon(true);
                        Statics.field353.start();
                        Statics.field353.setPriority(5);
                    }
                    class237.field3242 = 600;
                }
                this.field3252[arg0] = true;
            }
            if (arg3) {
                this.field3231[arg0] = class177.method157(arg1, false);
            }
            return;
        }
        if (this.field3255) {
            throw new RuntimeException();
        }
        if (this.field3257 != null) {
            int var5 = this.field3249;
            class161 var6 = this.field3257;
            class234 var7 = new class234();
            var7.field3212 = 0;
            var7.field2483 = (long) var5;
            var7.field3211 = arg1;
            var7.field3213 = var6;
            class194 var8 = class237.field3246;
            synchronized (class237.field3246) {
                class237.field3246.method3270(var7);
            }
            Object var10 = class237.field3240;
            synchronized (class237.field3240) {
                if (class237.field3242 == 0) {
                    Statics.field353 = new Thread(new class237());
                    Statics.field353.setDaemon(true);
                    Statics.field353.start();
                    Statics.field353.setPriority(5);
                }
                class237.field3242 = 600;
            }
        }
        this.method3702(arg1);
        this.method3807();
    }

    @ObfuscatedName("iw.cc(Lfk;I[BZI)V")
    public void method3806(class161 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3257 != arg0) {
            if (!arg3 && this.field3251 == arg1) {
                this.field3255 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3252[arg1] = false;
                if (this.field3250 || arg3) {
                    class239.method46(this, this.field3249, arg1, this.field3228[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3253.reset();
            field3253.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3253.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3228[arg1] != var9 || this.field3226[arg1] != var10) {
                this.field3252[arg1] = false;
                if (this.field3250 || arg3) {
                    class239.method46(this, this.field3249, arg1, this.field3228[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3252[arg1] = true;
            if (arg3) {
                this.field3231[arg1] = class177.method157(arg2, false);
            }
            return;
        }
        if (this.field3255) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class239.method46(this, 255, this.field3249, this.field3254, (byte) 0, true);
            return;
        }
        field3253.reset();
        field3253.update(arg2, 0, arg2.length);
        int var5 = (int) field3253.getValue();
        class174 var6 = new class174(class236.method3687(arg2));
        int var7 = var6.method2810();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3249 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2803();
        }
        if (this.field3254 != var5 || this.field3247 != var8) {
            class239.method46(this, 255, this.field3249, this.field3254, (byte) 0, true);
            return;
        }
        this.method3702(arg2);
        this.method3807();
    }

    @ObfuscatedName("iw.cg(I)V")
    public void method3807() {
        this.field3252 = new boolean[this.field3231.length];
        for (int var1 = 0; var1 < this.field3252.length; var1++) {
            this.field3252[var1] = false;
        }
        if (this.field3248 == null) {
            this.field3255 = true;
            return;
        }
        this.field3251 = -1;
        for (int var2 = 0; var2 < this.field3252.length; var2++) {
            if (this.field3227[var2] > 0) {
                class237.method52(var2, this.field3248, this);
                this.field3251 = var2;
            }
        }
        if (this.field3251 == -1) {
            this.field3255 = true;
        }
    }

    @ObfuscatedName("iw.c(II)I")
    public int method3709(int arg0) {
        if (this.field3231[arg0] == null) {
            return this.field3252[arg0] ? 100 : class239.method1514(this.field3249, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("iw.cv(B)I")
    public int method3809() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3231.length; var3++) {
            if (this.field3227[var3] > 0) {
                var1 += 100;
                var2 += this.method3709(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
