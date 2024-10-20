package deob;

import java.util.zip.CRC32;

@ObfuscatedName("jn")
public class class264 extends class262 {

    @ObfuscatedName("jn.f")
    public class175 field3407;

    @ObfuscatedName("jn.p")
    public class175 field3405;

    @ObfuscatedName("jn.e")
    public int field3404;

    @ObfuscatedName("jn.c")
    public volatile boolean field3408 = false;

    @ObfuscatedName("jn.ab")
    public boolean field3411 = false;

    @ObfuscatedName("jn.ap")
    public volatile boolean[] field3409;

    @ObfuscatedName("jn.ag")
    public static CRC32 field3410 = new CRC32();

    @ObfuscatedName("jn.at")
    public int field3406;

    @ObfuscatedName("jn.ac")
    public int field3412;

    @ObfuscatedName("jn.al")
    public int field3413 = -1;

    public class264(class175 arg0, class175 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3407 = arg0;
        this.field3405 = arg1;
        this.field3404 = arg2;
        this.field3411 = arg5;
        int var8 = this.field3404;
        if (Statics.field1980 == null) {
            class265.method5((class264) null, 255, 255, 0, (byte) 0, true);
            class265.field3414[var8] = this;
        } else {
            Statics.field1980.field2575 = var8 * 8 + 5;
            int var9 = Statics.field1980.method3254();
            int var10 = Statics.field1980.method3254();
            this.method4274(var9, var10);
        }
    }

    @ObfuscatedName("jn.dm(I)I")
    public int method4261() {
        if (this.field3408) {
            return 100;
        } else if (this.field3388 == null) {
            int var1 = this.field3404;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field608 != null && Statics.field608.field2652 == var2) {
                var4 = Statics.field585.field2575 * 99 / (Statics.field585.field2574.length - Statics.field608.field3373) + 1;
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

    @ObfuscatedName("jn.k(IB)V")
    public void method4156(int arg0) {
        int var2 = this.field3404;
        long var3 = (long) ((var2 << 16) + arg0);
        class261 var5 = (class261) class265.field3421.method3637(var3);
        if (var5 != null) {
            class265.field3424.method3544(var5);
        }
    }

    @ObfuscatedName("jn.v(II)V")
    public void method4161(int arg0) {
        if (this.field3407 == null || this.field3409 == null || !this.field3409[arg0]) {
            class265.method5(this, this.field3404, arg0, this.field3385[arg0], (byte) 2, true);
        } else {
            class263.method1722(arg0, this.field3407, this);
        }
    }

    @ObfuscatedName("jn.de(IIB)V")
    public void method4274(int arg0, int arg1) {
        this.field3406 = arg0;
        this.field3412 = arg1;
        if (this.field3405 == null) {
            class265.method5(this, 255, this.field3404, this.field3406, (byte) 0, true);
        } else {
            class263.method1722(this.field3404, this.field3405, this);
        }
    }

    @ObfuscatedName("jn.do(I[BZZI)V")
    public void method4270(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3390[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3390[arg0];
            if (this.field3407 != null) {
                class175 var12 = this.field3407;
                class260 var13 = new class260();
                var13.field3370 = 0;
                var13.field2652 = (long) arg0;
                var13.field3368 = arg1;
                var13.field3369 = var12;
                class218 var14 = class263.field3395;
                synchronized (class263.field3395) {
                    class263.field3395.method3690(var13);
                }
                Object var16 = class263.field3398;
                synchronized (class263.field3398) {
                    if (class263.field3402 == 0) {
                        Statics.field2694 = new Thread(new class263());
                        Statics.field2694.setDaemon(true);
                        Statics.field2694.start();
                        Statics.field2694.setPriority(5);
                    }
                    class263.field3402 = 600;
                }
                this.field3409[arg0] = true;
            }
            if (arg3) {
                this.field3388[arg0] = class199.method921(arg1, false);
            }
            return;
        }
        if (this.field3408) {
            throw new RuntimeException();
        }
        if (this.field3405 != null) {
            int var5 = this.field3404;
            class175 var6 = this.field3405;
            class260 var7 = new class260();
            var7.field3370 = 0;
            var7.field2652 = (long) var5;
            var7.field3368 = arg1;
            var7.field3369 = var6;
            class218 var8 = class263.field3395;
            synchronized (class263.field3395) {
                class263.field3395.method3690(var7);
            }
            Object var10 = class263.field3398;
            synchronized (class263.field3398) {
                if (class263.field3402 == 0) {
                    Statics.field2694 = new Thread(new class263());
                    Statics.field2694.setDaemon(true);
                    Statics.field2694.start();
                    Statics.field2694.setPriority(5);
                }
                class263.field3402 = 600;
            }
        }
        this.method4157(arg1);
        this.method4265();
    }

    @ObfuscatedName("jn.dv(Lff;I[BZB)V")
    public void method4264(class175 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3405 != arg0) {
            if (!arg3 && this.field3413 == arg1) {
                this.field3408 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3409[arg1] = false;
                if (this.field3411 || arg3) {
                    class265.method5(this, this.field3404, arg1, this.field3385[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3410.reset();
            field3410.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3410.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3385[arg1] != var9 || this.field3390[arg1] != var10) {
                this.field3409[arg1] = false;
                if (this.field3411 || arg3) {
                    class265.method5(this, this.field3404, arg1, this.field3385[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3409[arg1] = true;
            if (arg3) {
                this.field3388[arg1] = class199.method921(arg2, false);
            }
            return;
        }
        if (this.field3408) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class265.method5(this, 255, this.field3404, this.field3406, (byte) 0, true);
            return;
        }
        field3410.reset();
        field3410.update(arg2, 0, arg2.length);
        int var5 = (int) field3410.getValue();
        if (this.field3406 != var5) {
            class265.method5(this, 255, this.field3404, this.field3406, (byte) 0, true);
            return;
        }
        class195 var6 = new class195(class262.method220(arg2));
        int var7 = var6.method3205();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3404 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3254();
        }
        if (this.field3412 != var8) {
            class265.method5(this, 255, this.field3404, this.field3406, (byte) 0, true);
            return;
        }
        this.method4157(arg2);
        this.method4265();
    }

    @ObfuscatedName("jn.ds(I)V")
    public void method4265() {
        this.field3409 = new boolean[this.field3388.length];
        for (int var1 = 0; var1 < this.field3409.length; var1++) {
            this.field3409[var1] = false;
        }
        if (this.field3407 == null) {
            this.field3408 = true;
            return;
        }
        this.field3413 = -1;
        for (int var2 = 0; var2 < this.field3409.length; var2++) {
            if (this.field3384[var2] > 0) {
                class175 var3 = this.field3407;
                class260 var5 = new class260();
                var5.field3370 = 1;
                var5.field2652 = (long) var2;
                var5.field3369 = var3;
                var5.field3371 = this;
                class218 var6 = class263.field3395;
                synchronized (class263.field3395) {
                    class263.field3395.method3690(var5);
                }
                Object var8 = class263.field3398;
                synchronized (class263.field3398) {
                    if (class263.field3402 == 0) {
                        Statics.field2694 = new Thread(new class263());
                        Statics.field2694.setDaemon(true);
                        Statics.field2694.start();
                        Statics.field2694.setPriority(5);
                    }
                    class263.field3402 = 600;
                }
                this.field3413 = var2;
            }
        }
        if (this.field3413 == -1) {
            this.field3408 = true;
        }
    }

    @ObfuscatedName("jn.u(II)I")
    public int method4163(int arg0) {
        if (this.field3388[arg0] != null) {
            return 100;
        } else if (this.field3409[arg0]) {
            return 100;
        } else {
            int var2 = this.field3404;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field608 != null && Statics.field608.field2652 == var3) {
                var5 = Statics.field585.field2575 * 99 / (Statics.field585.field2574.length - Statics.field608.field3373) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("jn.dq(II)Z")
    public boolean method4262(int arg0) {
        return this.field3409[arg0];
    }

    @ObfuscatedName("jn.da(II)Z")
    public boolean method4267(int arg0) {
        return this.method4168(arg0) != null;
    }

    @ObfuscatedName("jn.dh(I)I")
    public int method4268() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3388.length; var3++) {
            if (this.field3384[var3] > 0) {
                var1 += 100;
                var2 += this.method4163(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
