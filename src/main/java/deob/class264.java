package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ju")
public class class264 extends class262 {

    @ObfuscatedName("ju.r")
    public class175 field3403;

    @ObfuscatedName("ju.y")
    public class175 field3407;

    @ObfuscatedName("ju.h")
    public int field3405;

    @ObfuscatedName("ju.m")
    public volatile boolean field3406 = false;

    @ObfuscatedName("ju.ay")
    public boolean field3404 = false;

    @ObfuscatedName("ju.ao")
    public volatile boolean[] field3408;

    @ObfuscatedName("ju.av")
    public static CRC32 field3409 = new CRC32();

    @ObfuscatedName("ju.aj")
    public int field3410;

    @ObfuscatedName("ju.ae")
    public int field3411;

    @ObfuscatedName("ju.am")
    public int field3412 = -1;

    public class264(class175 arg0, class175 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3403 = arg0;
        this.field3407 = arg1;
        this.field3405 = arg2;
        this.field3404 = arg5;
        int var8 = this.field3405;
        if (Statics.field2104 == null) {
            class265.method2996((class264) null, 255, 255, 0, (byte) 0, true);
            class265.field3427[var8] = this;
        } else {
            Statics.field2104.field2545 = var8 * 8 + 5;
            int var9 = Statics.field2104.method3241();
            int var10 = Statics.field2104.method3241();
            this.method4309(var9, var10);
        }
    }

    @ObfuscatedName("ju.dc(I)I")
    public int method4305() {
        if (this.field3406) {
            return 100;
        } else if (this.field3379 == null) {
            int var1 = this.field3405;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2173 != null && Statics.field2173.field2636 == var2) {
                var4 = Statics.field1661.field2545 * 99 / (Statics.field1661.field2544.length - Statics.field2173.field3374) + 1;
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

    @ObfuscatedName("ju.q(II)V")
    public void method4191(int arg0) {
        class265.method2831(this.field3405, arg0);
    }

    @ObfuscatedName("ju.k(II)V")
    public void method4232(int arg0) {
        if (this.field3403 == null || this.field3408 == null || !this.field3408[arg0]) {
            class265.method2996(this, this.field3405, arg0, this.field3383[arg0], (byte) 2, true);
        } else {
            class263.method2643(arg0, this.field3403, this);
        }
    }

    @ObfuscatedName("ju.dl(III)V")
    public void method4309(int arg0, int arg1) {
        this.field3410 = arg0;
        this.field3411 = arg1;
        if (this.field3407 == null) {
            class265.method2996(this, 255, this.field3405, this.field3410, (byte) 0, true);
        } else {
            class263.method2643(this.field3405, this.field3407, this);
        }
    }

    @ObfuscatedName("ju.df(I[BZZI)V")
    public void method4316(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3384[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3384[arg0];
            if (this.field3403 != null) {
                class175 var12 = this.field3403;
                class260 var13 = new class260();
                var13.field3371 = 0;
                var13.field2636 = (long) arg0;
                var13.field3368 = arg1;
                var13.field3369 = var12;
                class218 var14 = class263.field3397;
                synchronized (class263.field3397) {
                    class263.field3397.method3759(var13);
                }
                Object var16 = class263.field3400;
                synchronized (class263.field3400) {
                    if (class263.field3399 == 0) {
                        Statics.field3401 = new Thread(new class263());
                        Statics.field3401.setDaemon(true);
                        Statics.field3401.start();
                        Statics.field3401.setPriority(5);
                    }
                    class263.field3399 = 600;
                }
                this.field3408[arg0] = true;
            }
            if (arg3) {
                this.field3379[arg0] = class199.method3839(arg1, false);
            }
            return;
        }
        if (this.field3406) {
            throw new RuntimeException();
        }
        if (this.field3407 != null) {
            int var5 = this.field3405;
            class175 var6 = this.field3407;
            class260 var7 = new class260();
            var7.field3371 = 0;
            var7.field2636 = (long) var5;
            var7.field3368 = arg1;
            var7.field3369 = var6;
            class218 var8 = class263.field3397;
            synchronized (class263.field3397) {
                class263.field3397.method3759(var7);
            }
            Object var10 = class263.field3400;
            synchronized (class263.field3400) {
                if (class263.field3399 == 0) {
                    Statics.field3401 = new Thread(new class263());
                    Statics.field3401.setDaemon(true);
                    Statics.field3401.start();
                    Statics.field3401.setPriority(5);
                }
                class263.field3399 = 600;
            }
        }
        this.method4190(arg1);
        this.method4327();
    }

    @ObfuscatedName("ju.dq(Lfn;I[BZI)V")
    public void method4311(class175 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3407 != arg0) {
            if (!arg3 && this.field3412 == arg1) {
                this.field3406 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3408[arg1] = false;
                if (this.field3404 || arg3) {
                    class265.method2996(this, this.field3405, arg1, this.field3383[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3409.reset();
            field3409.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3409.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3383[arg1] != var9 || this.field3384[arg1] != var10) {
                this.field3408[arg1] = false;
                if (this.field3404 || arg3) {
                    class265.method2996(this, this.field3405, arg1, this.field3383[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3408[arg1] = true;
            if (arg3) {
                this.field3379[arg1] = class199.method3839(arg2, false);
            }
            return;
        }
        if (this.field3406) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class265.method2996(this, 255, this.field3405, this.field3410, (byte) 0, true);
            return;
        }
        field3409.reset();
        field3409.update(arg2, 0, arg2.length);
        int var5 = (int) field3409.getValue();
        if (this.field3410 != var5) {
            class265.method2996(this, 255, this.field3405, this.field3410, (byte) 0, true);
            return;
        }
        class195 var6 = new class195(class262.method3217(arg2));
        int var7 = var6.method3236();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3405 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3241();
        }
        if (this.field3411 != var8) {
            class265.method2996(this, 255, this.field3405, this.field3410, (byte) 0, true);
            return;
        }
        this.method4190(arg2);
        this.method4327();
    }

    @ObfuscatedName("ju.dt(I)V")
    public void method4327() {
        this.field3408 = new boolean[this.field3379.length];
        for (int var1 = 0; var1 < this.field3408.length; var1++) {
            this.field3408[var1] = false;
        }
        if (this.field3403 == null) {
            this.field3406 = true;
            return;
        }
        this.field3412 = -1;
        for (int var2 = 0; var2 < this.field3408.length; var2++) {
            if (this.field3385[var2] > 0) {
                class175 var3 = this.field3403;
                class260 var5 = new class260();
                var5.field3371 = 1;
                var5.field2636 = (long) var2;
                var5.field3369 = var3;
                var5.field3370 = this;
                class218 var6 = class263.field3397;
                synchronized (class263.field3397) {
                    class263.field3397.method3759(var5);
                }
                Object var8 = class263.field3400;
                synchronized (class263.field3400) {
                    if (class263.field3399 == 0) {
                        Statics.field3401 = new Thread(new class263());
                        Statics.field3401.setDaemon(true);
                        Statics.field3401.start();
                        Statics.field3401.setPriority(5);
                    }
                    class263.field3399 = 600;
                }
                this.field3412 = var2;
            }
        }
        if (this.field3412 == -1) {
            this.field3406 = true;
        }
    }

    @ObfuscatedName("ju.p(IB)I")
    public int method4198(int arg0) {
        if (this.field3379[arg0] != null) {
            return 100;
        } else if (this.field3408[arg0]) {
            return 100;
        } else {
            int var2 = this.field3405;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2173 != null && Statics.field2173.field2636 == var3) {
                var5 = Statics.field1661.field2545 * 99 / (Statics.field1661.field2544.length - Statics.field2173.field3374) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ju.dy(II)Z")
    public boolean method4310(int arg0) {
        return this.field3408[arg0];
    }

    @ObfuscatedName("ju.dn(II)Z")
    public boolean method4330(int arg0) {
        return this.method4203(arg0) != null;
    }

    @ObfuscatedName("ju.do(I)I")
    public int method4313() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3379.length; var3++) {
            if (this.field3385[var3] > 0) {
                var1 += 100;
                var2 += this.method4198(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
