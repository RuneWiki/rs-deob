package deob;

import java.util.zip.CRC32;

@ObfuscatedName("in")
public class class238 extends class236 {

    @ObfuscatedName("in.s")
    public class161 field3239;

    @ObfuscatedName("in.n")
    public class161 field3240;

    @ObfuscatedName("in.y")
    public int field3231;

    @ObfuscatedName("in.w")
    public volatile boolean field3232 = false;

    @ObfuscatedName("in.f")
    public boolean field3233 = false;

    @ObfuscatedName("in.c")
    public volatile boolean[] field3234;

    @ObfuscatedName("in.z")
    public static CRC32 field3235 = new CRC32();

    @ObfuscatedName("in.ay")
    public int field3236;

    @ObfuscatedName("in.ah")
    public int field3237;

    @ObfuscatedName("in.az")
    public int field3238 = -1;

    public class238(class161 arg0, class161 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3239 = arg0;
        this.field3240 = arg1;
        this.field3231 = arg2;
        this.field3233 = arg5;
        int var8 = this.field3231;
        if (Statics.field3275 == null) {
            class239.method3729((class238) null, 255, 255, 0, (byte) 0, true);
            class239.field3254[var8] = this;
        } else {
            Statics.field3275.field2384 = var8 * 8 + 5;
            int var9 = Statics.field3275.method2927();
            int var10 = Statics.field3275.method2927();
            this.method3956(var9, var10);
        }
    }

    @ObfuscatedName("in.cv(I)I")
    public int method3968() {
        if (this.field3232) {
            return 100;
        } else if (this.field3210 == null) {
            int var1 = this.field3231;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field675 != null && Statics.field675.field2467 == var2) {
                var4 = Statics.field363.field2384 * 99 / (Statics.field363.field2387.length - Statics.field675.field3199) + 1;
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

    @ObfuscatedName("in.h(IB)V")
    public void method3835(int arg0) {
        class239.method2(this.field3231, arg0);
    }

    @ObfuscatedName("in.b(II)V")
    public void method3844(int arg0) {
        if (this.field3239 == null || this.field3234 == null || !this.field3234[arg0]) {
            class239.method3729(this, this.field3231, arg0, this.field3208[arg0], (byte) 2, true);
        } else {
            class237.method566(arg0, this.field3239, this);
        }
    }

    @ObfuscatedName("in.cq(III)V")
    public void method3956(int arg0, int arg1) {
        this.field3236 = arg0;
        this.field3237 = arg1;
        if (this.field3240 == null) {
            class239.method3729(this, 255, this.field3231, this.field3236, (byte) 0, true);
        } else {
            class237.method566(this.field3231, this.field3240, this);
        }
    }

    @ObfuscatedName("in.dg(I[BZZI)V")
    public void method3950(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3209[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3209[arg0];
            if (this.field3239 != null) {
                class161 var10 = this.field3239;
                class234 var11 = new class234();
                var11.field3191 = 0;
                var11.field2467 = (long) arg0;
                var11.field3192 = arg1;
                var11.field3193 = var10;
                class194 var12 = class237.field3227;
                synchronized (class237.field3227) {
                    class237.field3227.method3371(var11);
                }
                class237.method2914();
                this.field3234[arg0] = true;
            }
            if (arg3) {
                this.field3210[arg0] = class177.method488(arg1, false);
            }
            return;
        }
        if (this.field3232) {
            throw new RuntimeException();
        }
        if (this.field3240 != null) {
            int var5 = this.field3231;
            class161 var6 = this.field3240;
            class234 var7 = new class234();
            var7.field3191 = 0;
            var7.field2467 = (long) var5;
            var7.field3192 = arg1;
            var7.field3193 = var6;
            class194 var8 = class237.field3227;
            synchronized (class237.field3227) {
                class237.field3227.method3371(var7);
            }
            class237.method2914();
        }
        this.method3834(arg1);
        this.method3952();
    }

    @ObfuscatedName("in.dr(Lfr;I[BZI)V")
    public void method3954(class161 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3240 != arg0) {
            if (!arg3 && this.field3238 == arg1) {
                this.field3232 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3234[arg1] = false;
                if (this.field3233 || arg3) {
                    class239.method3729(this, this.field3231, arg1, this.field3208[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3235.reset();
            field3235.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3235.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3208[arg1] != var9 || this.field3209[arg1] != var10) {
                this.field3234[arg1] = false;
                if (this.field3233 || arg3) {
                    class239.method3729(this, this.field3231, arg1, this.field3208[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3234[arg1] = true;
            if (arg3) {
                this.field3210[arg1] = class177.method488(arg2, false);
            }
            return;
        }
        if (this.field3232) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class239.method3729(this, 255, this.field3231, this.field3236, (byte) 0, true);
            return;
        }
        field3235.reset();
        field3235.update(arg2, 0, arg2.length);
        int var5 = (int) field3235.getValue();
        class174 var6 = new class174(class236.method151(arg2));
        int var7 = var6.method2930();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3231 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2927();
        }
        if (this.field3236 != var5 || this.field3237 != var8) {
            class239.method3729(this, 255, this.field3231, this.field3236, (byte) 0, true);
            return;
        }
        this.method3834(arg2);
        this.method3952();
    }

    @ObfuscatedName("in.dm(I)V")
    public void method3952() {
        this.field3234 = new boolean[this.field3210.length];
        for (int var1 = 0; var1 < this.field3234.length; var1++) {
            this.field3234[var1] = false;
        }
        if (this.field3239 == null) {
            this.field3232 = true;
            return;
        }
        this.field3238 = -1;
        for (int var2 = 0; var2 < this.field3234.length; var2++) {
            if (this.field3220[var2] > 0) {
                class237.method2839(var2, this.field3239, this);
                this.field3238 = var2;
            }
        }
        if (this.field3238 == -1) {
            this.field3232 = true;
        }
    }

    @ObfuscatedName("in.p(II)I")
    public int method3862(int arg0) {
        if (this.field3210[arg0] != null) {
            return 100;
        } else if (this.field3234[arg0]) {
            return 100;
        } else {
            int var2 = this.field3231;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field675 != null && Statics.field675.field2467 == var3) {
                var5 = Statics.field363.field2384 * 99 / (Statics.field363.field2387.length - Statics.field675.field3199) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("in.dx(I)I")
    public int method3953() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3210.length; var3++) {
            if (this.field3220[var3] > 0) {
                var1 += 100;
                var2 += this.method3862(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
