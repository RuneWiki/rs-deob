package deob;

import java.util.zip.CRC32;

@ObfuscatedName("iy")
public class class245 extends class243 {

    @ObfuscatedName("iy.g")
    public class162 field3311;

    @ObfuscatedName("iy.z")
    public class162 field3304;

    @ObfuscatedName("iy.o")
    public int field3305;

    @ObfuscatedName("iy.d")
    public volatile boolean field3306 = false;

    @ObfuscatedName("iy.s")
    public boolean field3307 = false;

    @ObfuscatedName("iy.f")
    public volatile boolean[] field3309;

    @ObfuscatedName("iy.q")
    public static CRC32 field3303 = new CRC32();

    @ObfuscatedName("iy.al")
    public int field3310;

    @ObfuscatedName("iy.ao")
    public int field3308;

    @ObfuscatedName("iy.aq")
    public int field3312 = -1;

    public class245(class162 arg0, class162 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3311 = arg0;
        this.field3304 = arg1;
        this.field3305 = arg2;
        this.field3307 = arg5;
        class246.method227(this, this.field3305);
    }

    @ObfuscatedName("iy.de(B)I")
    public int method4055() {
        if (this.field3306) {
            return 100;
        } else if (this.field3277 == null) {
            int var1 = class246.method2735(255, this.field3305);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("iy.p(II)V")
    public void method3929(int arg0) {
        int var2 = this.field3305;
        long var3 = (long) ((var2 << 16) + arg0);
        class242 var5 = (class242) class246.field3322.method3444(var3);
        if (var5 != null) {
            class246.field3327.method3370(var5);
        }
    }

    @ObfuscatedName("iy.a(IB)V")
    public void method3939(int arg0) {
        if (this.field3311 == null || this.field3309 == null || !this.field3309[arg0]) {
            class246.method1108(this, this.field3305, arg0, this.field3281[arg0], (byte) 2, true);
        } else {
            class244.method3328(arg0, this.field3311, this);
        }
    }

    @ObfuscatedName("iy.dt(III)V")
    public void method4037(int arg0, int arg1) {
        this.field3310 = arg0;
        this.field3308 = arg1;
        if (this.field3304 == null) {
            class246.method1108(this, 255, this.field3305, this.field3310, (byte) 0, true);
        } else {
            class244.method3328(this.field3305, this.field3304, this);
        }
    }

    @ObfuscatedName("iy.di(I[BZZI)V")
    public void method4051(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3306) {
                throw new RuntimeException();
            }
            if (this.field3304 != null) {
                class244.method502(this.field3305, arg1, this.field3304);
            }
            this.method3928(arg1);
            this.method4040();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3282[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3282[arg0];
        if (this.field3311 != null) {
            class244.method502(arg0, arg1, this.field3311);
            this.field3309[arg0] = true;
        }
        if (arg3) {
            this.field3277[arg0] = class184.method3244(arg1, false);
        }
    }

    @ObfuscatedName("iy.dl(Lfe;I[BZI)V")
    public void method4039(class162 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3304 != arg0) {
            if (!arg3 && this.field3312 == arg1) {
                this.field3306 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3309[arg1] = false;
                if (this.field3307 || arg3) {
                    class246.method1108(this, this.field3305, arg1, this.field3281[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3303.reset();
            field3303.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3303.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3281[arg1] != var9 || this.field3282[arg1] != var10) {
                this.field3309[arg1] = false;
                if (this.field3307 || arg3) {
                    class246.method1108(this, this.field3305, arg1, this.field3281[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3309[arg1] = true;
            if (arg3) {
                this.field3277[arg1] = class184.method3244(arg2, false);
            }
            return;
        }
        if (this.field3306) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class246.method1108(this, 255, this.field3305, this.field3310, (byte) 0, true);
            return;
        }
        field3303.reset();
        field3303.update(arg2, 0, arg2.length);
        int var5 = (int) field3303.getValue();
        class181 var6 = new class181(class243.method1769(arg2));
        int var7 = var6.method3012();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3305 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3017();
        }
        if (this.field3310 != var5 || this.field3308 != var8) {
            class246.method1108(this, 255, this.field3305, this.field3310, (byte) 0, true);
            return;
        }
        this.method3928(arg2);
        this.method4040();
    }

    @ObfuscatedName("iy.dm(I)V")
    public void method4040() {
        this.field3309 = new boolean[this.field3277.length];
        for (int var1 = 0; var1 < this.field3309.length; var1++) {
            this.field3309[var1] = false;
        }
        if (this.field3311 == null) {
            this.field3306 = true;
            return;
        }
        this.field3312 = -1;
        for (int var2 = 0; var2 < this.field3309.length; var2++) {
            if (this.field3283[var2] > 0) {
                class244.method3903(var2, this.field3311, this);
                this.field3312 = var2;
            }
        }
        if (this.field3312 == -1) {
            this.field3306 = true;
        }
    }

    @ObfuscatedName("iy.l(II)I")
    public int method3935(int arg0) {
        if (this.field3277[arg0] == null) {
            return this.field3309[arg0] ? 100 : class246.method2735(this.field3305, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("iy.dn(I)I")
    public int method4041() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3277.length; var3++) {
            if (this.field3283[var3] > 0) {
                var1 += 100;
                var2 += this.method3935(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
