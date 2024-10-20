package deob;

import java.util.zip.CRC32;

@ObfuscatedName("il")
public class class239 extends class237 {

    @ObfuscatedName("il.y")
    public class162 field3232;

    @ObfuscatedName("il.z")
    public class162 field3227;

    @ObfuscatedName("il.u")
    public int field3228;

    @ObfuscatedName("il.k")
    public volatile boolean field3229 = false;

    @ObfuscatedName("il.q")
    public boolean field3226 = false;

    @ObfuscatedName("il.n")
    public volatile boolean[] field3236;

    @ObfuscatedName("il.d")
    public static CRC32 field3231 = new CRC32();

    @ObfuscatedName("il.ax")
    public int field3233;

    @ObfuscatedName("il.ao")
    public int field3234;

    @ObfuscatedName("il.an")
    public int field3235 = -1;

    public class239(class162 arg0, class162 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3232 = arg0;
        this.field3227 = arg1;
        this.field3228 = arg2;
        this.field3226 = arg5;
        int var8 = this.field3228;
        if (Statics.field1680 == null) {
            class240.method3118((class239) null, 255, 255, 0, (byte) 0, true);
            class240.field3237[var8] = this;
        } else {
            Statics.field1680.field2394 = var8 * 8 + 5;
            int var9 = Statics.field1680.method2908();
            int var10 = Statics.field1680.method2908();
            this.method3885(var9, var10);
        }
    }

    @ObfuscatedName("il.dc(B)I")
    public int method3898() {
        if (this.field3229) {
            return 100;
        } else if (this.field3212 == null) {
            int var1 = this.field3228;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field3245 != null && Statics.field3245.field2469 == var2) {
                var4 = Statics.field556.field2394 * 99 / (Statics.field556.field2390.length - Statics.field3245.field3201) + 1;
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

    @ObfuscatedName("il.h(II)V")
    public void method3772(int arg0) {
        int var2 = this.field3228;
        long var3 = (long) ((var2 << 16) + arg0);
        class236 var5 = (class236) class240.field3240.method3281(var3);
        if (var5 != null) {
            class240.field3244.method3225(var5);
        }
    }

    @ObfuscatedName("il.m(II)V")
    public void method3814(int arg0) {
        if (this.field3232 == null || this.field3236 == null || !this.field3236[arg0]) {
            class240.method3118(this, this.field3228, arg0, this.field3214[arg0], (byte) 2, true);
        } else {
            Statics.method696(arg0, this.field3232, this);
        }
    }

    @ObfuscatedName("il.dp(III)V")
    public void method3885(int arg0, int arg1) {
        this.field3233 = arg0;
        this.field3234 = arg1;
        if (this.field3227 == null) {
            class240.method3118(this, 255, this.field3228, this.field3233, (byte) 0, true);
        } else {
            Statics.method696(this.field3228, this.field3227, this);
        }
    }

    @ObfuscatedName("il.dx(I[BZZB)V")
    public void method3887(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3207[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3207[arg0];
            if (this.field3232 != null) {
                class162 var10 = this.field3232;
                class235 var11 = new class235();
                var11.field3197 = 0;
                var11.field2469 = (long) arg0;
                var11.field3195 = arg1;
                var11.field3194 = var10;
                class195 var12 = class238.field3225;
                synchronized (class238.field3225) {
                    class238.field3225.method3317(var11);
                }
                class238.method3761();
                this.field3236[arg0] = true;
            }
            if (arg3) {
                this.field3212[arg0] = class178.method1483(arg1, false);
            }
            return;
        }
        if (this.field3229) {
            throw new RuntimeException();
        }
        if (this.field3227 != null) {
            int var5 = this.field3228;
            class162 var6 = this.field3227;
            class235 var7 = new class235();
            var7.field3197 = 0;
            var7.field2469 = (long) var5;
            var7.field3195 = arg1;
            var7.field3194 = var6;
            class195 var8 = class238.field3225;
            synchronized (class238.field3225) {
                class238.field3225.method3317(var7);
            }
            class238.method3761();
        }
        this.method3829(arg1);
        this.method3892();
    }

    @ObfuscatedName("il.dy(Lfx;I[BZI)V")
    public void method3886(class162 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3227 != arg0) {
            if (!arg3 && this.field3235 == arg1) {
                this.field3229 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3236[arg1] = false;
                if (this.field3226 || arg3) {
                    class240.method3118(this, this.field3228, arg1, this.field3214[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3231.reset();
            field3231.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3231.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3214[arg1] != var9 || this.field3207[arg1] != var10) {
                this.field3236[arg1] = false;
                if (this.field3226 || arg3) {
                    class240.method3118(this, this.field3228, arg1, this.field3214[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3236[arg1] = true;
            if (arg3) {
                this.field3212[arg1] = class178.method1483(arg2, false);
            }
            return;
        }
        if (this.field3229) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class240.method3118(this, 255, this.field3228, this.field3233, (byte) 0, true);
            return;
        }
        field3231.reset();
        field3231.update(arg2, 0, arg2.length);
        int var5 = (int) field3231.getValue();
        class175 var6 = new class175(class237.method2836(arg2));
        int var7 = var6.method2903();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3228 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2908();
        }
        if (this.field3233 != var5 || this.field3234 != var8) {
            class240.method3118(this, 255, this.field3228, this.field3233, (byte) 0, true);
            return;
        }
        this.method3829(arg2);
        this.method3892();
    }

    @ObfuscatedName("il.dv(I)V")
    public void method3892() {
        this.field3236 = new boolean[this.field3212.length];
        for (int var1 = 0; var1 < this.field3236.length; var1++) {
            this.field3236[var1] = false;
        }
        if (this.field3232 == null) {
            this.field3229 = true;
            return;
        }
        this.field3235 = -1;
        for (int var2 = 0; var2 < this.field3236.length; var2++) {
            if (this.field3205[var2] > 0) {
                Statics.method2681(var2, this.field3232, this);
                this.field3235 = var2;
            }
        }
        if (this.field3235 == -1) {
            this.field3229 = true;
        }
    }

    @ObfuscatedName("il.l(IS)I")
    public int method3778(int arg0) {
        if (this.field3212[arg0] != null) {
            return 100;
        } else if (this.field3236[arg0]) {
            return 100;
        } else {
            int var2 = this.field3228;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field3245 != null && Statics.field3245.field2469 == var3) {
                var5 = Statics.field556.field2394 * 99 / (Statics.field556.field2390.length - Statics.field3245.field3201) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("il.dn(I)I")
    public int method3884() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3212.length; var3++) {
            if (this.field3205[var3] > 0) {
                var1 += 100;
                var2 += this.method3778(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
