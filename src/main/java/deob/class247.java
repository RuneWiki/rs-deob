package deob;

import java.util.zip.CRC32;

@ObfuscatedName("iy")
public class class247 extends class245 {

    @ObfuscatedName("iy.m")
    public class319 field3203;

    @ObfuscatedName("iy.r")
    public class319 field3194;

    @ObfuscatedName("iy.o")
    public int field3195;

    @ObfuscatedName("iy.j")
    public volatile boolean field3193 = false;

    @ObfuscatedName("iy.ay")
    public boolean field3197 = false;

    @ObfuscatedName("iy.am")
    public volatile boolean[] field3200;

    @ObfuscatedName("iy.ag")
    public static CRC32 field3199 = new CRC32();

    @ObfuscatedName("iy.ae")
    public int field3196;

    @ObfuscatedName("iy.ac")
    public int field3198;

    @ObfuscatedName("iy.aq")
    public int field3201 = -1;

    public class247(class319 arg0, class319 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3203 = arg0;
        this.field3194 = arg1;
        this.field3195 = arg2;
        this.field3197 = arg5;
        int var8 = this.field3195;
        if (Statics.field1456 == null) {
            class248.method293((class247) null, 255, 255, 0, (byte) 0, true);
            class248.field3219[var8] = this;
        } else {
            Statics.field1456.field3747 = var8 * 8 + 5;
            int var9 = Statics.field1456.method5455();
            int var10 = Statics.field1456.method5455();
            this.method4082(var9, var10);
        }
    }

    @ObfuscatedName("iy.co(I)Z")
    public boolean method4081() {
        return this.field3193;
    }

    @ObfuscatedName("iy.cx(S)I")
    public int method4085() {
        if (this.field3193) {
            return 100;
        } else if (this.field3177 == null) {
            int var1 = this.field3195;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field541 != null && Statics.field541.field2141 == var2) {
                var4 = Statics.field3205.field3747 * 99 / (Statics.field3205.field3746.length - Statics.field541.field3165) + 1;
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

    @ObfuscatedName("iy.v(IS)V")
    public void method3982(int arg0) {
        Statics.method2028(this.field3195, arg0);
    }

    @ObfuscatedName("iy.a(II)V")
    public void method3993(int arg0) {
        if (this.field3203 == null || this.field3200 == null || !this.field3200[arg0]) {
            class248.method293(this, this.field3195, arg0, this.field3185[arg0], (byte) 2, true);
            return;
        }
        class319 var2 = this.field3203;
        byte[] var4 = null;
        class273 var5 = class246.field3192;
        synchronized (class246.field3192) {
            for (class243 var6 = (class243) class246.field3192.method4721(); var6 != null; var6 = (class243) class246.field3192.method4706()) {
                if ((long) arg0 == var6.field2141 && var6.field3160 == var2 && var6.field3162 == 0) {
                    var4 = var6.field3159;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method5583(arg0);
            this.method4084(var2, arg0, var8, true);
        } else {
            this.method4084(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("iy.cg(IIB)V")
    public void method4082(int arg0, int arg1) {
        this.field3196 = arg0;
        this.field3198 = arg1;
        if (this.field3194 == null) {
            class248.method293(this, 255, this.field3195, this.field3196, (byte) 0, true);
            return;
        }
        int var3 = this.field3195;
        class319 var4 = this.field3194;
        byte[] var6 = null;
        class273 var7 = class246.field3192;
        synchronized (class246.field3192) {
            for (class243 var8 = (class243) class246.field3192.method4721(); var8 != null; var8 = (class243) class246.field3192.method4706()) {
                if ((long) var3 == var8.field2141 && var8.field3160 == var4 && var8.field3162 == 0) {
                    var6 = var8.field3159;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method5583(var3);
            this.method4084(var4, var3, var10, true);
        } else {
            this.method4084(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("iy.ch(I[BZZI)V")
    public void method4083(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3166[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3166[arg0];
            if (this.field3203 != null) {
                class319 var12 = this.field3203;
                class243 var13 = new class243();
                var13.field3162 = 0;
                var13.field2141 = (long) arg0;
                var13.field3159 = arg1;
                var13.field3160 = var12;
                class273 var14 = class246.field3192;
                synchronized (class246.field3192) {
                    class246.field3192.method4699(var13);
                }
                Object var16 = class246.field3189;
                synchronized (class246.field3189) {
                    if (class246.field3188 == 0) {
                        Statics.field3190 = new Thread(new class246());
                        Statics.field3190.setDaemon(true);
                        Statics.field3190.start();
                        Statics.field3190.setPriority(5);
                    }
                    class246.field3188 = 600;
                }
                this.field3200[arg0] = true;
            }
            if (arg3) {
                this.field3177[arg0] = class215.method2026(arg1, false);
            }
            return;
        }
        if (this.field3193) {
            throw new RuntimeException();
        }
        if (this.field3194 != null) {
            int var5 = this.field3195;
            class319 var6 = this.field3194;
            class243 var7 = new class243();
            var7.field3162 = 0;
            var7.field2141 = (long) var5;
            var7.field3159 = arg1;
            var7.field3160 = var6;
            class273 var8 = class246.field3192;
            synchronized (class246.field3192) {
                class246.field3192.method4699(var7);
            }
            Object var10 = class246.field3189;
            synchronized (class246.field3189) {
                if (class246.field3188 == 0) {
                    Statics.field3190 = new Thread(new class246());
                    Statics.field3190.setDaemon(true);
                    Statics.field3190.start();
                    Statics.field3190.setPriority(5);
                }
                class246.field3188 = 600;
            }
        }
        this.method3981(arg1);
        this.method4101();
    }

    @ObfuscatedName("iy.cl(Llu;I[BZI)V")
    public void method4084(class319 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3194 != arg0) {
            if (!arg3 && this.field3201 == arg1) {
                this.field3193 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3200[arg1] = false;
                if (this.field3197 || arg3) {
                    class248.method293(this, this.field3195, arg1, this.field3185[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3199.reset();
            field3199.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3199.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3185[arg1] != var9 || this.field3166[arg1] != var10) {
                this.field3200[arg1] = false;
                if (this.field3197 || arg3) {
                    class248.method293(this, this.field3195, arg1, this.field3185[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3200[arg1] = true;
            if (arg3) {
                this.field3177[arg1] = class215.method2026(arg2, false);
            }
            return;
        }
        if (this.field3193) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class248.method293(this, 255, this.field3195, this.field3196, (byte) 0, true);
            return;
        }
        field3199.reset();
        field3199.update(arg2, 0, arg2.length);
        int var5 = (int) field3199.getValue();
        if (this.field3196 != var5) {
            class248.method293(this, 255, this.field3195, this.field3196, (byte) 0, true);
            return;
        }
        class311 var6 = new class311(class245.method3949(arg2));
        int var7 = var6.method5310();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3195 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method5455();
        }
        if (this.field3198 != var8) {
            class248.method293(this, 255, this.field3195, this.field3196, (byte) 0, true);
            return;
        }
        this.method3981(arg2);
        this.method4101();
    }

    @ObfuscatedName("iy.cw(I)V")
    public void method4101() {
        this.field3200 = new boolean[this.field3177.length];
        for (int var1 = 0; var1 < this.field3200.length; var1++) {
            this.field3200[var1] = false;
        }
        if (this.field3203 == null) {
            this.field3193 = true;
            return;
        }
        this.field3201 = -1;
        for (int var2 = 0; var2 < this.field3200.length; var2++) {
            if (this.field3173[var2] > 0) {
                class246.method1080(var2, this.field3203, this);
                this.field3201 = var2;
            }
        }
        if (this.field3201 == -1) {
            this.field3193 = true;
        }
    }

    @ObfuscatedName("iy.q(II)I")
    public int method3989(int arg0) {
        if (this.field3177[arg0] != null) {
            return 100;
        } else if (this.field3200[arg0]) {
            return 100;
        } else {
            int var2 = this.field3195;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field541 != null && Statics.field541.field2141 == var3) {
                var5 = Statics.field3205.field3747 * 99 / (Statics.field3205.field3746.length - Statics.field541.field3165) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("iy.ct(II)Z")
    public boolean method4086(int arg0) {
        return this.field3200[arg0];
    }

    @ObfuscatedName("iy.dx(II)Z")
    public boolean method4087(int arg0) {
        return this.method3994(arg0) != null;
    }

    @ObfuscatedName("iy.do(I)I")
    public int method4094() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3177.length; var3++) {
            if (this.field3173[var3] > 0) {
                var1 += 100;
                var2 += this.method3989(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
