package deob;

import java.util.zip.CRC32;

@ObfuscatedName("in")
public class class238 extends class236 {

    @ObfuscatedName("in.s")
    public class161 field3243;

    @ObfuscatedName("in.g")
    public class161 field3242;

    @ObfuscatedName("in.w")
    public int field3244;

    @ObfuscatedName("in.p")
    public volatile boolean field3247 = false;

    @ObfuscatedName("in.l")
    public boolean field3245 = false;

    @ObfuscatedName("in.u")
    public volatile boolean[] field3241;

    @ObfuscatedName("in.t")
    public static CRC32 field3248 = new CRC32();

    @ObfuscatedName("in.ad")
    public int field3246;

    @ObfuscatedName("in.ar")
    public int field3249;

    @ObfuscatedName("in.an")
    public int field3250 = -1;

    public class238(class161 arg0, class161 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3243 = arg0;
        this.field3242 = arg1;
        this.field3244 = arg2;
        this.field3245 = arg5;
        int var8 = this.field3244;
        if (Statics.field2427 == null) {
            class239.method3738((class238) null, 255, 255, 0, (byte) 0, true);
            class239.field3266[var8] = this;
        } else {
            Statics.field2427.field2407 = var8 * 8 + 5;
            int var9 = Statics.field2427.method2875();
            int var10 = Statics.field2427.method2875();
            this.method3880(var9, var10);
        }
    }

    @ObfuscatedName("in.dn(I)I")
    public int method3878() {
        if (this.field3247) {
            return 100;
        } else if (this.field3226 == null) {
            int var1 = this.field3244;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field678 != null && Statics.field678.field2480 == var2) {
                var4 = Statics.field2850.field2407 * 99 / (Statics.field2850.field2415.length - Statics.field678.field3211) + 1;
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

    @ObfuscatedName("in.c(II)V")
    public void method3817(int arg0) {
        class239.method3729(this.field3244, arg0);
    }

    @ObfuscatedName("in.o(II)V")
    public void method3778(int arg0) {
        if (this.field3243 == null || this.field3241 == null || !this.field3241[arg0]) {
            class239.method3738(this, this.field3244, arg0, this.field3220[arg0], (byte) 2, true);
        } else {
            class237.method2713(arg0, this.field3243, this);
        }
    }

    @ObfuscatedName("in.di(IIB)V")
    public void method3880(int arg0, int arg1) {
        this.field3246 = arg0;
        this.field3249 = arg1;
        if (this.field3242 == null) {
            class239.method3738(this, 255, this.field3244, this.field3246, (byte) 0, true);
        } else {
            class237.method2713(this.field3244, this.field3242, this);
        }
    }

    @ObfuscatedName("in.du(I[BZZB)V")
    public void method3881(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3225[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3225[arg0];
            if (this.field3243 != null) {
                class161 var12 = this.field3243;
                class234 var13 = new class234();
                var13.field3208 = 0;
                var13.field2480 = (long) arg0;
                var13.field3199 = arg1;
                var13.field3200 = var12;
                class194 var14 = class237.field3239;
                synchronized (class237.field3239) {
                    class237.field3239.method3289(var13);
                }
                Object var16 = class237.field3235;
                synchronized (class237.field3235) {
                    if (class237.field3237 == 0) {
                        Statics.field1677 = new Thread(new class237());
                        Statics.field1677.setDaemon(true);
                        Statics.field1677.start();
                        Statics.field1677.setPriority(5);
                    }
                    class237.field3237 = 600;
                }
                this.field3241[arg0] = true;
            }
            if (arg3) {
                this.field3226[arg0] = class177.method455(arg1, false);
            }
            return;
        }
        if (this.field3247) {
            throw new RuntimeException();
        }
        if (this.field3242 != null) {
            int var5 = this.field3244;
            class161 var6 = this.field3242;
            class234 var7 = new class234();
            var7.field3208 = 0;
            var7.field2480 = (long) var5;
            var7.field3199 = arg1;
            var7.field3200 = var6;
            class194 var8 = class237.field3239;
            synchronized (class237.field3239) {
                class237.field3239.method3289(var7);
            }
            Object var10 = class237.field3235;
            synchronized (class237.field3235) {
                if (class237.field3237 == 0) {
                    Statics.field1677 = new Thread(new class237());
                    Statics.field1677.setDaemon(true);
                    Statics.field1677.start();
                    Statics.field1677.setPriority(5);
                }
                class237.field3237 = 600;
            }
        }
        this.method3767(arg1);
        this.method3892();
    }

    @ObfuscatedName("in.da(Lff;I[BZI)V")
    public void method3882(class161 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3242 != arg0) {
            if (!arg3 && this.field3250 == arg1) {
                this.field3247 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3241[arg1] = false;
                if (this.field3245 || arg3) {
                    class239.method3738(this, this.field3244, arg1, this.field3220[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3248.reset();
            field3248.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3248.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3220[arg1] != var9 || this.field3225[arg1] != var10) {
                this.field3241[arg1] = false;
                if (this.field3245 || arg3) {
                    class239.method3738(this, this.field3244, arg1, this.field3220[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3241[arg1] = true;
            if (arg3) {
                this.field3226[arg1] = class177.method455(arg2, false);
            }
            return;
        }
        if (this.field3247) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class239.method3738(this, 255, this.field3244, this.field3246, (byte) 0, true);
            return;
        }
        field3248.reset();
        field3248.update(arg2, 0, arg2.length);
        int var5 = (int) field3248.getValue();
        class174 var6 = new class174(class236.method156(arg2));
        int var7 = var6.method2870();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3244 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2875();
        }
        if (this.field3246 != var5 || this.field3249 != var8) {
            class239.method3738(this, 255, this.field3244, this.field3246, (byte) 0, true);
            return;
        }
        this.method3767(arg2);
        this.method3892();
    }

    @ObfuscatedName("in.dd(I)V")
    public void method3892() {
        this.field3241 = new boolean[this.field3226.length];
        for (int var1 = 0; var1 < this.field3241.length; var1++) {
            this.field3241[var1] = false;
        }
        if (this.field3243 == null) {
            this.field3247 = true;
            return;
        }
        this.field3250 = -1;
        for (int var2 = 0; var2 < this.field3241.length; var2++) {
            if (this.field3217[var2] > 0) {
                class237.method989(var2, this.field3243, this);
                this.field3250 = var2;
            }
        }
        if (this.field3250 == -1) {
            this.field3247 = true;
        }
    }

    @ObfuscatedName("in.x(II)I")
    public int method3774(int arg0) {
        if (this.field3226[arg0] != null) {
            return 100;
        } else if (this.field3241[arg0]) {
            return 100;
        } else {
            int var2 = this.field3244;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field678 != null && Statics.field678.field2480 == var3) {
                var5 = Statics.field2850.field2407 * 99 / (Statics.field2850.field2415.length - Statics.field678.field3211) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("in.de(I)I")
    public int method3884() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3226.length; var3++) {
            if (this.field3217[var3] > 0) {
                var1 += 100;
                var2 += this.method3774(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
