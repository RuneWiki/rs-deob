package deob;

import java.util.zip.CRC32;

@ObfuscatedName("id")
public class class247 extends class245 {

    @ObfuscatedName("id.a")
    public class319 field3185;

    @ObfuscatedName("id.g")
    public class319 field3180;

    @ObfuscatedName("id.h")
    public int field3182;

    @ObfuscatedName("id.i")
    public volatile boolean field3181 = false;

    @ObfuscatedName("id.ab")
    public boolean field3184 = false;

    @ObfuscatedName("id.ac")
    public volatile boolean[] field3186;

    @ObfuscatedName("id.ao")
    public static CRC32 field3183 = new CRC32();

    @ObfuscatedName("id.af")
    public int field3187;

    @ObfuscatedName("id.av")
    public int field3188;

    @ObfuscatedName("id.ar")
    public int field3189 = -1;

    public class247(class319 arg0, class319 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3185 = arg0;
        this.field3180 = arg1;
        this.field3182 = arg2;
        this.field3184 = arg5;
        class248.method3880(this, this.field3182);
    }

    @ObfuscatedName("id.dv(I)Z")
    public boolean method4021() {
        return this.field3181;
    }

    @ObfuscatedName("id.df(I)I")
    public int method4013() {
        if (this.field3181) {
            return 100;
        } else if (this.field3168 == null) {
            int var1 = this.field3182;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field3202 != null && Statics.field3202.field2140 == var2) {
                var4 = Statics.field3204.field3741 * 99 / (Statics.field3204.field3742.length - Statics.field3202.field3154) + 1;
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

    @ObfuscatedName("id.b(II)V")
    public void method3904(int arg0) {
        class248.method730(this.field3182, arg0);
    }

    @ObfuscatedName("id.n(II)V")
    public void method3915(int arg0) {
        if (this.field3185 == null || this.field3186 == null || !this.field3186[arg0]) {
            class248.method4154(this, this.field3182, arg0, this.field3162[arg0], (byte) 2, true);
            return;
        }
        class319 var2 = this.field3185;
        byte[] var4 = null;
        class273 var5 = class246.field3179;
        synchronized (class246.field3179) {
            for (class243 var6 = (class243) class246.field3179.method4638(); var6 != null; var6 = (class243) class246.field3179.method4640()) {
                if ((long) arg0 == var6.field2140 && var6.field3151 == var2 && var6.field3150 == 0) {
                    var4 = var6.field3149;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method5503(arg0);
            this.method4016(var2, arg0, var8, true);
        } else {
            this.method4016(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("id.dd(III)V")
    public void method4014(int arg0, int arg1) {
        this.field3187 = arg0;
        this.field3188 = arg1;
        if (this.field3180 == null) {
            class248.method4154(this, 255, this.field3182, this.field3187, (byte) 0, true);
            return;
        }
        int var3 = this.field3182;
        class319 var4 = this.field3180;
        byte[] var6 = null;
        class273 var7 = class246.field3179;
        synchronized (class246.field3179) {
            for (class243 var8 = (class243) class246.field3179.method4638(); var8 != null; var8 = (class243) class246.field3179.method4640()) {
                if ((long) var3 == var8.field2140 && var8.field3151 == var4 && var8.field3150 == 0) {
                    var6 = var8.field3149;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method5503(var3);
            this.method4016(var4, var3, var10, true);
        } else {
            this.method4016(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("id.dl(I[BZZI)V")
    public void method4035(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3181) {
                throw new RuntimeException();
            }
            if (this.field3180 != null) {
                class246.method3133(this.field3182, arg1, this.field3180);
            }
            this.method3960(arg1);
            this.method4017();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3163[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3163[arg0];
        if (this.field3185 != null) {
            class246.method3133(arg0, arg1, this.field3185);
            this.field3186[arg0] = true;
        }
        if (arg3) {
            this.field3168[arg0] = class215.method3699(arg1, false);
        }
    }

    @ObfuscatedName("id.dq(Llt;I[BZI)V")
    public void method4016(class319 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3180 != arg0) {
            if (!arg3 && this.field3189 == arg1) {
                this.field3181 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3186[arg1] = false;
                if (this.field3184 || arg3) {
                    class248.method4154(this, this.field3182, arg1, this.field3162[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3183.reset();
            field3183.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3183.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3162[arg1] != var9 || this.field3163[arg1] != var10) {
                this.field3186[arg1] = false;
                if (this.field3184 || arg3) {
                    class248.method4154(this, this.field3182, arg1, this.field3162[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3186[arg1] = true;
            if (arg3) {
                this.field3168[arg1] = class215.method3699(arg2, false);
            }
            return;
        }
        if (this.field3181) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class248.method4154(this, 255, this.field3182, this.field3187, (byte) 0, true);
            return;
        }
        field3183.reset();
        field3183.update(arg2, 0, arg2.length);
        int var5 = (int) field3183.getValue();
        if (this.field3187 != var5) {
            class248.method4154(this, 255, this.field3182, this.field3187, (byte) 0, true);
            return;
        }
        class311 var6 = new class311(class245.method3249(arg2));
        int var7 = var6.method5276();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3182 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method5330();
        }
        if (this.field3188 != var8) {
            class248.method4154(this, 255, this.field3182, this.field3187, (byte) 0, true);
            return;
        }
        this.method3960(arg2);
        this.method4017();
    }

    @ObfuscatedName("id.dp(I)V")
    public void method4017() {
        this.field3186 = new boolean[this.field3168.length];
        for (int var1 = 0; var1 < this.field3186.length; var1++) {
            this.field3186[var1] = false;
        }
        if (this.field3185 == null) {
            this.field3181 = true;
            return;
        }
        this.field3189 = -1;
        for (int var2 = 0; var2 < this.field3186.length; var2++) {
            if (this.field3173[var2] > 0) {
                class319 var3 = this.field3185;
                class243 var5 = new class243();
                var5.field3150 = 1;
                var5.field2140 = (long) var2;
                var5.field3151 = var3;
                var5.field3148 = this;
                class273 var6 = class246.field3179;
                synchronized (class246.field3179) {
                    class246.field3179.method4639(var5);
                }
                Object var8 = class246.field3176;
                synchronized (class246.field3176) {
                    if (class246.field3177 == 0) {
                        Statics.field1355 = new Thread(new class246());
                        Statics.field1355.setDaemon(true);
                        Statics.field1355.start();
                        Statics.field1355.setPriority(5);
                    }
                    class246.field3177 = 600;
                }
                this.field3189 = var2;
            }
        }
        if (this.field3189 == -1) {
            this.field3181 = true;
        }
    }

    @ObfuscatedName("id.u(II)I")
    public int method3911(int arg0) {
        if (this.field3168[arg0] != null) {
            return 100;
        } else if (this.field3186[arg0]) {
            return 100;
        } else {
            int var2 = this.field3182;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field3202 != null && Statics.field3202.field2140 == var3) {
                var5 = Statics.field3204.field3741 * 99 / (Statics.field3204.field3742.length - Statics.field3202.field3154) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("id.do(II)Z")
    public boolean method4015(int arg0) {
        return this.field3186[arg0];
    }

    @ObfuscatedName("id.dm(IB)Z")
    public boolean method4018(int arg0) {
        return this.method3962(arg0) != null;
    }

    @ObfuscatedName("id.dh(S)I")
    public int method4038() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3168.length; var3++) {
            if (this.field3173[var3] > 0) {
                var1 += 100;
                var2 += this.method3911(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
