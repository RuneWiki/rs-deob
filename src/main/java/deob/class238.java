package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ij")
public class class238 extends class236 {

    @ObfuscatedName("ij.h")
    public class161 field3245;

    @ObfuscatedName("ij.a")
    public class161 field3241;

    @ObfuscatedName("ij.z")
    public int field3240;

    @ObfuscatedName("ij.l")
    public volatile boolean field3243 = false;

    @ObfuscatedName("ij.w")
    public boolean field3244 = false;

    @ObfuscatedName("ij.n")
    public volatile boolean[] field3242;

    @ObfuscatedName("ij.m")
    public static CRC32 field3248 = new CRC32();

    @ObfuscatedName("ij.ae")
    public int field3246;

    @ObfuscatedName("ij.ai")
    public int field3249;

    @ObfuscatedName("ij.ah")
    public int field3247 = -1;

    public class238(class161 arg0, class161 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3245 = arg0;
        this.field3241 = arg1;
        this.field3240 = arg2;
        this.field3244 = arg5;
        int var8 = this.field3240;
        if (Statics.field2034 == null) {
            class239.method3856((class238) null, 255, 255, 0, (byte) 0, true);
            class239.field3261[var8] = this;
        } else {
            Statics.field2034.field2405 = var8 * 8 + 5;
            int var9 = Statics.field2034.method2960();
            int var10 = Statics.field2034.method2960();
            this.method3973(var9, var10);
        }
    }

    @ObfuscatedName("ij.cm(I)I")
    public int method3971() {
        if (this.field3243) {
            return 100;
        } else if (this.field3222 == null) {
            int var1 = class239.method3860(255, this.field3240);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ij.k(IB)V")
    public void method3874(int arg0) {
        class239.method688(this.field3240, arg0);
    }

    @ObfuscatedName("ij.o(II)V")
    public void method3878(int arg0) {
        if (this.field3245 == null || this.field3242 == null || !this.field3242[arg0]) {
            class239.method3856(this, this.field3240, arg0, this.field3218[arg0], (byte) 2, true);
            return;
        }
        class161 var2 = this.field3245;
        byte[] var4 = null;
        class194 var5 = class237.field3238;
        synchronized (class237.field3238) {
            for (class234 var6 = (class234) class237.field3238.method3409(); var6 != null; var6 = (class234) class237.field3238.method3429()) {
                if ((long) arg0 == var6.field2486 && var6.field3205 == var2 && var6.field3207 == 0) {
                    var4 = var6.field3204;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2825(arg0);
            this.method3975(var2, arg0, var8, true);
        } else {
            this.method3975(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ij.cv(III)V")
    public void method3973(int arg0, int arg1) {
        this.field3246 = arg0;
        this.field3249 = arg1;
        if (this.field3241 == null) {
            class239.method3856(this, 255, this.field3240, this.field3246, (byte) 0, true);
            return;
        }
        int var3 = this.field3240;
        class161 var4 = this.field3241;
        byte[] var6 = null;
        class194 var7 = class237.field3238;
        synchronized (class237.field3238) {
            for (class234 var8 = (class234) class237.field3238.method3409(); var8 != null; var8 = (class234) class237.field3238.method3429()) {
                if ((long) var3 == var8.field2486 && var8.field3205 == var4 && var8.field3207 == 0) {
                    var6 = var8.field3204;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2825(var3);
            this.method3975(var4, var3, var10, true);
        } else {
            this.method3975(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ij.cc(I[BZZB)V")
    public void method3974(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3219[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3219[arg0];
            if (this.field3245 != null) {
                class161 var12 = this.field3245;
                class234 var13 = new class234();
                var13.field3207 = 0;
                var13.field2486 = (long) arg0;
                var13.field3204 = arg1;
                var13.field3205 = var12;
                class194 var14 = class237.field3238;
                synchronized (class237.field3238) {
                    class237.field3238.method3411(var13);
                }
                Object var16 = class237.field3237;
                synchronized (class237.field3237) {
                    if (class237.field3235 == 0) {
                        Statics.field3236 = new Thread(new class237());
                        Statics.field3236.setDaemon(true);
                        Statics.field3236.start();
                        Statics.field3236.setPriority(5);
                    }
                    class237.field3235 = 600;
                }
                this.field3242[arg0] = true;
            }
            if (arg3) {
                this.field3222[arg0] = class177.method26(arg1, false);
            }
            return;
        }
        if (this.field3243) {
            throw new RuntimeException();
        }
        if (this.field3241 != null) {
            int var5 = this.field3240;
            class161 var6 = this.field3241;
            class234 var7 = new class234();
            var7.field3207 = 0;
            var7.field2486 = (long) var5;
            var7.field3204 = arg1;
            var7.field3205 = var6;
            class194 var8 = class237.field3238;
            synchronized (class237.field3238) {
                class237.field3238.method3411(var7);
            }
            Object var10 = class237.field3237;
            synchronized (class237.field3237) {
                if (class237.field3235 == 0) {
                    Statics.field3236 = new Thread(new class237());
                    Statics.field3236.setDaemon(true);
                    Statics.field3236.start();
                    Statics.field3236.setPriority(5);
                }
                class237.field3235 = 600;
            }
        }
        this.method3873(arg1);
        this.method3976();
    }

    @ObfuscatedName("ij.cw(Lfr;I[BZB)V")
    public void method3975(class161 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3241 != arg0) {
            if (!arg3 && this.field3247 == arg1) {
                this.field3243 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3242[arg1] = false;
                if (this.field3244 || arg3) {
                    class239.method3856(this, this.field3240, arg1, this.field3218[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3248.reset();
            field3248.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3248.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3218[arg1] != var9 || this.field3219[arg1] != var10) {
                this.field3242[arg1] = false;
                if (this.field3244 || arg3) {
                    class239.method3856(this, this.field3240, arg1, this.field3218[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3242[arg1] = true;
            if (arg3) {
                this.field3222[arg1] = class177.method26(arg2, false);
            }
            return;
        }
        if (this.field3243) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class239.method3856(this, 255, this.field3240, this.field3246, (byte) 0, true);
            return;
        }
        field3248.reset();
        field3248.update(arg2, 0, arg2.length);
        int var5 = (int) field3248.getValue();
        class174 var6 = new class174(class236.method2929(arg2));
        int var7 = var6.method2955();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3240 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2960();
        }
        if (this.field3246 != var5 || this.field3249 != var8) {
            class239.method3856(this, 255, this.field3240, this.field3246, (byte) 0, true);
            return;
        }
        this.method3873(arg2);
        this.method3976();
    }

    @ObfuscatedName("ij.cr(B)V")
    public void method3976() {
        this.field3242 = new boolean[this.field3222.length];
        for (int var1 = 0; var1 < this.field3242.length; var1++) {
            this.field3242[var1] = false;
        }
        if (this.field3245 == null) {
            this.field3243 = true;
            return;
        }
        this.field3247 = -1;
        for (int var2 = 0; var2 < this.field3242.length; var2++) {
            if (this.field3227[var2] > 0) {
                class237.method2700(var2, this.field3245, this);
                this.field3247 = var2;
            }
        }
        if (this.field3247 == -1) {
            this.field3243 = true;
        }
    }

    @ObfuscatedName("ij.g(IB)I")
    public int method3880(int arg0) {
        if (this.field3222[arg0] == null) {
            return this.field3242[arg0] ? 100 : class239.method3860(this.field3240, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ij.cz(S)I")
    public int method3977() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3222.length; var3++) {
            if (this.field3227[var3] > 0) {
                var1 += 100;
                var2 += this.method3880(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
