package deob;

import java.util.zip.CRC32;

@ObfuscatedName("io")
public class class241 extends class239 {

    @ObfuscatedName("io.e")
    public class163 field3244;

    @ObfuscatedName("io.g")
    public class163 field3241;

    @ObfuscatedName("io.d")
    public int field3239;

    @ObfuscatedName("io.y")
    public volatile boolean field3237 = false;

    @ObfuscatedName("io.t")
    public boolean field3238 = false;

    @ObfuscatedName("io.b")
    public volatile boolean[] field3242;

    @ObfuscatedName("io.s")
    public static CRC32 field3243 = new CRC32();

    @ObfuscatedName("io.ap")
    public int field3240;

    @ObfuscatedName("io.ac")
    public int field3245;

    @ObfuscatedName("io.af")
    public int field3246 = -1;

    public class241(class163 arg0, class163 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3244 = arg0;
        this.field3241 = arg1;
        this.field3239 = arg2;
        this.field3238 = arg5;
        class242.method636(this, this.field3239);
    }

    @ObfuscatedName("io.cx(I)I")
    public int method3835() {
        if (this.field3237) {
            return 100;
        } else if (this.field3225 == null) {
            int var1 = class242.method2823(255, this.field3239);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("io.o(II)V")
    public void method3725(int arg0) {
        int var2 = this.field3239;
        long var3 = (long) ((var2 << 16) + arg0);
        class238 var5 = (class238) class242.field3255.method3252(var3);
        if (var5 != null) {
            class242.field3259.method3191(var5);
        }
    }

    @ObfuscatedName("io.p(II)V")
    public void method3735(int arg0) {
        if (this.field3244 == null || this.field3242 == null || !this.field3242[arg0]) {
            class242.method322(this, this.field3239, arg0, this.field3219[arg0], (byte) 2, true);
        } else {
            class240.method3392(arg0, this.field3244, this);
        }
    }

    @ObfuscatedName("io.ci(IIB)V")
    public void method3838(int arg0, int arg1) {
        this.field3240 = arg0;
        this.field3245 = arg1;
        if (this.field3241 == null) {
            class242.method322(this, 255, this.field3239, this.field3240, (byte) 0, true);
        } else {
            class240.method3392(this.field3239, this.field3241, this);
        }
    }

    @ObfuscatedName("io.do(I[BZZI)V")
    public void method3832(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3220[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3220[arg0];
            if (this.field3244 != null) {
                class163 var12 = this.field3244;
                class237 var13 = new class237();
                var13.field3203 = 0;
                var13.field2490 = (long) arg0;
                var13.field3205 = arg1;
                var13.field3202 = var12;
                class197 var14 = class240.field3232;
                synchronized (class240.field3232) {
                    class240.field3232.method3299(var13);
                }
                Object var16 = class240.field3235;
                synchronized (class240.field3235) {
                    if (class240.field3234 == 0) {
                        Statics.field2440 = new Thread(new class240());
                        Statics.field2440.setDaemon(true);
                        Statics.field2440.start();
                        Statics.field2440.setPriority(5);
                    }
                    class240.field3234 = 600;
                }
                this.field3242[arg0] = true;
            }
            if (arg3) {
                this.field3225[arg0] = class180.method1554(arg1, false);
            }
            return;
        }
        if (this.field3237) {
            throw new RuntimeException();
        }
        if (this.field3241 != null) {
            int var5 = this.field3239;
            class163 var6 = this.field3241;
            class237 var7 = new class237();
            var7.field3203 = 0;
            var7.field2490 = (long) var5;
            var7.field3205 = arg1;
            var7.field3202 = var6;
            class197 var8 = class240.field3232;
            synchronized (class240.field3232) {
                class240.field3232.method3299(var7);
            }
            Object var10 = class240.field3235;
            synchronized (class240.field3235) {
                if (class240.field3234 == 0) {
                    Statics.field2440 = new Thread(new class240());
                    Statics.field2440.setDaemon(true);
                    Statics.field2440.start();
                    Statics.field2440.setPriority(5);
                }
                class240.field3234 = 600;
            }
        }
        this.method3724(arg1);
        this.method3834();
    }

    @ObfuscatedName("io.di(Lfj;I[BZB)V")
    public void method3833(class163 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3241 != arg0) {
            if (!arg3 && this.field3246 == arg1) {
                this.field3237 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3242[arg1] = false;
                if (this.field3238 || arg3) {
                    class242.method322(this, this.field3239, arg1, this.field3219[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3243.reset();
            field3243.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3243.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3219[arg1] != var9 || this.field3220[arg1] != var10) {
                this.field3242[arg1] = false;
                if (this.field3238 || arg3) {
                    class242.method322(this, this.field3239, arg1, this.field3219[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3242[arg1] = true;
            if (arg3) {
                this.field3225[arg1] = class180.method1554(arg2, false);
            }
            return;
        }
        if (this.field3237) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class242.method322(this, 255, this.field3239, this.field3240, (byte) 0, true);
            return;
        }
        field3243.reset();
        field3243.update(arg2, 0, arg2.length);
        int var5 = (int) field3243.getValue();
        class177 var6 = new class177(class239.method993(arg2));
        int var7 = var6.method2931();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3239 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2904();
        }
        if (this.field3240 != var5 || this.field3245 != var8) {
            class242.method322(this, 255, this.field3239, this.field3240, (byte) 0, true);
            return;
        }
        this.method3724(arg2);
        this.method3834();
    }

    @ObfuscatedName("io.df(I)V")
    public void method3834() {
        this.field3242 = new boolean[this.field3225.length];
        for (int var1 = 0; var1 < this.field3242.length; var1++) {
            this.field3242[var1] = false;
        }
        if (this.field3244 == null) {
            this.field3237 = true;
            return;
        }
        this.field3246 = -1;
        for (int var2 = 0; var2 < this.field3242.length; var2++) {
            if (this.field3221[var2] > 0) {
                class163 var3 = this.field3244;
                class237 var5 = new class237();
                var5.field3203 = 1;
                var5.field2490 = (long) var2;
                var5.field3202 = var3;
                var5.field3204 = this;
                class197 var6 = class240.field3232;
                synchronized (class240.field3232) {
                    class240.field3232.method3299(var5);
                }
                Object var8 = class240.field3235;
                synchronized (class240.field3235) {
                    if (class240.field3234 == 0) {
                        Statics.field2440 = new Thread(new class240());
                        Statics.field2440.setDaemon(true);
                        Statics.field2440.start();
                        Statics.field2440.setPriority(5);
                    }
                    class240.field3234 = 600;
                }
                this.field3246 = var2;
            }
        }
        if (this.field3246 == -1) {
            this.field3237 = true;
        }
    }

    @ObfuscatedName("io.m(II)I")
    public int method3731(int arg0) {
        if (this.field3225[arg0] == null) {
            return this.field3242[arg0] ? 100 : class242.method2823(this.field3239, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("io.dv(I)I")
    public int method3839() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3225.length; var3++) {
            if (this.field3221[var3] > 0) {
                var1 += 100;
                var2 += this.method3731(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
