package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ib")
public class class238 extends class236 {

    @ObfuscatedName("ib.c")
    public class161 field3230;

    @ObfuscatedName("ib.l")
    public class161 field3223;

    @ObfuscatedName("ib.m")
    public int field3224;

    @ObfuscatedName("ib.a")
    public volatile boolean field3226 = false;

    @ObfuscatedName("ib.h")
    public boolean field3233 = false;

    @ObfuscatedName("ib.z")
    public volatile boolean[] field3227;

    @ObfuscatedName("ib.j")
    public static CRC32 field3222 = new CRC32();

    @ObfuscatedName("ib.am")
    public int field3229;

    @ObfuscatedName("ib.ac")
    public int field3225;

    @ObfuscatedName("ib.ax")
    public int field3231 = -1;

    public class238(class161 arg0, class161 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3230 = arg0;
        this.field3223 = arg1;
        this.field3224 = arg2;
        this.field3233 = arg5;
        int var8 = this.field3224;
        if (Statics.field658 == null) {
            class239.method539((class238) null, 255, 255, 0, (byte) 0, true);
            class239.field3250[var8] = this;
        } else {
            Statics.field658.field2364 = var8 * 8 + 5;
            int var9 = Statics.field658.method2935();
            int var10 = Statics.field658.method2935();
            this.method3851(var9, var10);
        }
    }

    @ObfuscatedName("ib.cg(B)I")
    public int method3838() {
        if (this.field3226) {
            return 100;
        } else if (this.field3204 == null) {
            int var1 = this.field3224;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2370 != null && Statics.field2370.field2441 == var2) {
                var4 = Statics.field834.field2364 * 99 / (Statics.field834.field2367.length - Statics.field2370.field3188) + 1;
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

    @ObfuscatedName("ib.q(II)V")
    public void method3758(int arg0) {
        int var2 = this.field3224;
        long var3 = (long) ((var2 << 16) + arg0);
        class235 var5 = (class235) class239.field3242.method3263(var3);
        if (var5 != null) {
            class239.field3241.method3217(var5);
        }
    }

    @ObfuscatedName("ib.s(II)V")
    public void method3759(int arg0) {
        if (this.field3230 == null || this.field3227 == null || !this.field3227[arg0]) {
            class239.method539(this, this.field3224, arg0, this.field3198[arg0], (byte) 2, true);
        } else {
            class237.method994(arg0, this.field3230, this);
        }
    }

    @ObfuscatedName("ib.ch(III)V")
    public void method3851(int arg0, int arg1) {
        this.field3229 = arg0;
        this.field3225 = arg1;
        if (this.field3223 == null) {
            class239.method539(this, 255, this.field3224, this.field3229, (byte) 0, true);
        } else {
            class237.method994(this.field3224, this.field3223, this);
        }
    }

    @ObfuscatedName("ib.ct(I[BZZI)V")
    public void method3841(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3195[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3195[arg0];
            if (this.field3230 != null) {
                class161 var12 = this.field3230;
                class234 var13 = new class234();
                var13.field3181 = 0;
                var13.field2441 = (long) arg0;
                var13.field3182 = arg1;
                var13.field3186 = var12;
                class194 var14 = class237.field3221;
                synchronized (class237.field3221) {
                    class237.field3221.method3318(var13);
                }
                Object var16 = class237.field3214;
                synchronized (class237.field3214) {
                    if (class237.field3217 == 0) {
                        Statics.field3218 = new Thread(new class237());
                        Statics.field3218.setDaemon(true);
                        Statics.field3218.start();
                        Statics.field3218.setPriority(5);
                    }
                    class237.field3217 = 600;
                }
                this.field3227[arg0] = true;
            }
            if (arg3) {
                this.field3204[arg0] = class177.method1056(arg1, false);
            }
            return;
        }
        if (this.field3226) {
            throw new RuntimeException();
        }
        if (this.field3223 != null) {
            int var5 = this.field3224;
            class161 var6 = this.field3223;
            class234 var7 = new class234();
            var7.field3181 = 0;
            var7.field2441 = (long) var5;
            var7.field3182 = arg1;
            var7.field3186 = var6;
            class194 var8 = class237.field3221;
            synchronized (class237.field3221) {
                class237.field3221.method3318(var7);
            }
            Object var10 = class237.field3214;
            synchronized (class237.field3214) {
                if (class237.field3217 == 0) {
                    Statics.field3218 = new Thread(new class237());
                    Statics.field3218.setDaemon(true);
                    Statics.field3218.start();
                    Statics.field3218.setPriority(5);
                }
                class237.field3217 = 600;
            }
        }
        this.method3774(arg1);
        this.method3843();
    }

    @ObfuscatedName("ib.cf(Lfv;I[BZB)V")
    public void method3864(class161 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3223 != arg0) {
            if (!arg3 && this.field3231 == arg1) {
                this.field3226 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3227[arg1] = false;
                if (this.field3233 || arg3) {
                    class239.method539(this, this.field3224, arg1, this.field3198[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3222.reset();
            field3222.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3222.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3198[arg1] != var9 || this.field3195[arg1] != var10) {
                this.field3227[arg1] = false;
                if (this.field3233 || arg3) {
                    class239.method539(this, this.field3224, arg1, this.field3198[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3227[arg1] = true;
            if (arg3) {
                this.field3204[arg1] = class177.method1056(arg2, false);
            }
            return;
        }
        if (this.field3226) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class239.method539(this, 255, this.field3224, this.field3229, (byte) 0, true);
            return;
        }
        field3222.reset();
        field3222.update(arg2, 0, arg2.length);
        int var5 = (int) field3222.getValue();
        class174 var6 = new class174(Statics.method998(arg2));
        int var7 = var6.method2921();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3224 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2935();
        }
        if (this.field3229 != var5 || this.field3225 != var8) {
            class239.method539(this, 255, this.field3224, this.field3229, (byte) 0, true);
            return;
        }
        this.method3774(arg2);
        this.method3843();
    }

    @ObfuscatedName("ib.cm(I)V")
    public void method3843() {
        this.field3227 = new boolean[this.field3204.length];
        for (int var1 = 0; var1 < this.field3227.length; var1++) {
            this.field3227[var1] = false;
        }
        if (this.field3230 == null) {
            this.field3226 = true;
            return;
        }
        this.field3231 = -1;
        for (int var2 = 0; var2 < this.field3227.length; var2++) {
            if (this.field3200[var2] > 0) {
                class237.method2880(var2, this.field3230, this);
                this.field3231 = var2;
            }
        }
        if (this.field3231 == -1) {
            this.field3226 = true;
        }
    }

    @ObfuscatedName("ib.t(II)I")
    public int method3748(int arg0) {
        if (this.field3204[arg0] != null) {
            return 100;
        } else if (this.field3227[arg0]) {
            return 100;
        } else {
            int var2 = this.field3224;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2370 != null && Statics.field2370.field2441 == var3) {
                var5 = Statics.field834.field2364 * 99 / (Statics.field834.field2367.length - Statics.field2370.field3188) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ib.cs(I)I")
    public int method3844() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3204.length; var3++) {
            if (this.field3200[var3] > 0) {
                var1 += 100;
                var2 += this.method3748(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
