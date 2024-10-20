package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ib")
public class class239 extends class237 {

    @ObfuscatedName("ib.p")
    public class162 field3251;

    @ObfuscatedName("ib.m")
    public class162 field3246;

    @ObfuscatedName("ib.x")
    public int field3249;

    @ObfuscatedName("ib.h")
    public volatile boolean field3248 = false;

    @ObfuscatedName("ib.f")
    public boolean field3253 = false;

    @ObfuscatedName("ib.g")
    public volatile boolean[] field3250;

    @ObfuscatedName("ib.w")
    public static CRC32 field3254 = new CRC32();

    @ObfuscatedName("ib.ar")
    public int field3252;

    @ObfuscatedName("ib.ax")
    public int field3247;

    @ObfuscatedName("ib.al")
    public int field3245 = -1;

    public class239(class162 arg0, class162 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3251 = arg0;
        this.field3246 = arg1;
        this.field3249 = arg2;
        this.field3253 = arg5;
        int var8 = this.field3249;
        if (Statics.field2304 == null) {
            class240.method1573((class239) null, 255, 255, 0, (byte) 0, true);
            class240.field3269[var8] = this;
        } else {
            Statics.field2304.field2395 = var8 * 8 + 5;
            int var9 = Statics.field2304.method2998();
            int var10 = Statics.field2304.method2998();
            this.method3916(var9, var10);
        }
    }

    @ObfuscatedName("ib.cg(B)I")
    public int method3915() {
        if (this.field3248) {
            return 100;
        } else if (this.field3225 == null) {
            int var1 = this.field3249;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field429 != null && Statics.field429.field2475 == var2) {
                var4 = Statics.field3191.field2395 * 99 / (Statics.field3191.field2392.length - Statics.field429.field3210) + 1;
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

    @ObfuscatedName("ib.j(II)V")
    public void method3823(int arg0) {
        class240.method2896(this.field3249, arg0);
    }

    @ObfuscatedName("ib.l(IB)V")
    public void method3842(int arg0) {
        if (this.field3251 == null || this.field3250 == null || !this.field3250[arg0]) {
            class240.method1573(this, this.field3249, arg0, this.field3219[arg0], (byte) 2, true);
            return;
        }
        class162 var2 = this.field3251;
        byte[] var4 = null;
        class195 var5 = class238.field3244;
        synchronized (class238.field3244) {
            for (class235 var6 = (class235) class238.field3244.method3410(); var6 != null; var6 = (class235) class238.field3244.method3412()) {
                if ((long) arg0 == var6.field2475 && var6.field3205 == var2 && var6.field3206 == 0) {
                    var4 = var6.field3207;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2833(arg0);
            this.method3921(var2, arg0, var8, true);
        } else {
            this.method3921(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ib.cr(III)V")
    public void method3916(int arg0, int arg1) {
        this.field3252 = arg0;
        this.field3247 = arg1;
        if (this.field3246 == null) {
            class240.method1573(this, 255, this.field3249, this.field3252, (byte) 0, true);
            return;
        }
        int var3 = this.field3249;
        class162 var4 = this.field3246;
        byte[] var6 = null;
        class195 var7 = class238.field3244;
        synchronized (class238.field3244) {
            for (class235 var8 = (class235) class238.field3244.method3410(); var8 != null; var8 = (class235) class238.field3244.method3412()) {
                if ((long) var3 == var8.field2475 && var8.field3205 == var4 && var8.field3206 == 0) {
                    var6 = var8.field3207;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2833(var3);
            this.method3921(var4, var3, var10, true);
        } else {
            this.method3921(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ib.ci(I[BZZI)V")
    public void method3917(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3248) {
                throw new RuntimeException();
            }
            if (this.field3246 != null) {
                class238.method72(this.field3249, arg1, this.field3246);
            }
            this.method3851(arg1);
            this.method3919();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3220[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3220[arg0];
        if (this.field3251 != null) {
            class238.method72(arg0, arg1, this.field3251);
            this.field3250[arg0] = true;
        }
        if (arg3) {
            this.field3225[arg0] = class178.method557(arg1, false);
        }
    }

    @ObfuscatedName("ib.cm(Lfx;I[BZI)V")
    public void method3921(class162 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3246 != arg0) {
            if (!arg3 && this.field3245 == arg1) {
                this.field3248 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3250[arg1] = false;
                if (this.field3253 || arg3) {
                    class240.method1573(this, this.field3249, arg1, this.field3219[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3254.reset();
            field3254.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3254.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3219[arg1] != var9 || this.field3220[arg1] != var10) {
                this.field3250[arg1] = false;
                if (this.field3253 || arg3) {
                    class240.method1573(this, this.field3249, arg1, this.field3219[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3250[arg1] = true;
            if (arg3) {
                this.field3225[arg1] = class178.method557(arg2, false);
            }
            return;
        }
        if (this.field3248) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class240.method1573(this, 255, this.field3249, this.field3252, (byte) 0, true);
            return;
        }
        field3254.reset();
        field3254.update(arg2, 0, arg2.length);
        int var5 = (int) field3254.getValue();
        class175 var6 = new class175(class237.method3205(arg2));
        int var7 = var6.method2999();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3249 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2998();
        }
        if (this.field3252 != var5 || this.field3247 != var8) {
            class240.method1573(this, 255, this.field3249, this.field3252, (byte) 0, true);
            return;
        }
        this.method3851(arg2);
        this.method3919();
    }

    @ObfuscatedName("ib.cy(B)V")
    public void method3919() {
        this.field3250 = new boolean[this.field3225.length];
        for (int var1 = 0; var1 < this.field3250.length; var1++) {
            this.field3250[var1] = false;
        }
        if (this.field3251 == null) {
            this.field3248 = true;
            return;
        }
        this.field3245 = -1;
        for (int var2 = 0; var2 < this.field3250.length; var2++) {
            if (this.field3217[var2] > 0) {
                class162 var3 = this.field3251;
                class235 var5 = new class235();
                var5.field3206 = 1;
                var5.field2475 = (long) var2;
                var5.field3205 = var3;
                var5.field3204 = this;
                class195 var6 = class238.field3244;
                synchronized (class238.field3244) {
                    class238.field3244.method3405(var5);
                }
                class238.method2849();
                this.field3245 = var2;
            }
        }
        if (this.field3245 == -1) {
            this.field3248 = true;
        }
    }

    @ObfuscatedName("ib.b(IB)I")
    public int method3845(int arg0) {
        if (this.field3225[arg0] != null) {
            return 100;
        } else if (this.field3250[arg0]) {
            return 100;
        } else {
            int var2 = this.field3249;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field429 != null && Statics.field429.field2475 == var3) {
                var5 = Statics.field3191.field2395 * 99 / (Statics.field3191.field2392.length - Statics.field429.field3210) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ib.co(I)I")
    public int method3920() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3225.length; var3++) {
            if (this.field3217[var3] > 0) {
                var1 += 100;
                var2 += this.method3845(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
