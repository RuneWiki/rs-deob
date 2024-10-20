package deob;

import java.util.zip.CRC32;

@ObfuscatedName("it")
public class class238 extends class236 {

    @ObfuscatedName("it.t")
    public class161 field3241;

    @ObfuscatedName("it.w")
    public class161 field3240;

    @ObfuscatedName("it.l")
    public int field3244;

    @ObfuscatedName("it.q")
    public volatile boolean field3239 = false;

    @ObfuscatedName("it.k")
    public boolean field3243 = false;

    @ObfuscatedName("it.d")
    public volatile boolean[] field3242;

    @ObfuscatedName("it.u")
    public static CRC32 field3245 = new CRC32();

    @ObfuscatedName("it.ae")
    public int field3246;

    @ObfuscatedName("it.ao")
    public int field3247;

    @ObfuscatedName("it.ad")
    public int field3248 = -1;

    public class238(class161 arg0, class161 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3241 = arg0;
        this.field3240 = arg1;
        this.field3244 = arg2;
        this.field3243 = arg5;
        int var8 = this.field3244;
        if (Statics.field11 == null) {
            class239.method2834((class238) null, 255, 255, 0, (byte) 0, true);
            class239.field3266[var8] = this;
        } else {
            Statics.field11.field2400 = var8 * 8 + 5;
            int var9 = Statics.field11.method3058();
            int var10 = Statics.field11.method3058();
            this.method3939(var9, var10);
        }
    }

    @ObfuscatedName("it.dh(I)I")
    public int method3945() {
        if (this.field3239) {
            return 100;
        } else if (this.field3226 == null) {
            int var1 = this.field3244;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field328 != null && Statics.field328.field2483 == var2) {
                var4 = Statics.field2844.field2400 * 99 / (Statics.field2844.field2401.length - Statics.field328.field3211) + 1;
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

    @ObfuscatedName("it.p(II)V")
    public void method3829(int arg0) {
        class239.method1473(this.field3244, arg0);
    }

    @ObfuscatedName("it.o(II)V")
    public void method3839(int arg0) {
        if (this.field3241 == null || this.field3242 == null || !this.field3242[arg0]) {
            class239.method2834(this, this.field3244, arg0, this.field3220[arg0], (byte) 2, true);
        } else {
            class237.method3814(arg0, this.field3241, this);
        }
    }

    @ObfuscatedName("it.dq(III)V")
    public void method3939(int arg0, int arg1) {
        this.field3246 = arg0;
        this.field3247 = arg1;
        if (this.field3240 == null) {
            class239.method2834(this, 255, this.field3244, this.field3246, (byte) 0, true);
        } else {
            class237.method3814(this.field3244, this.field3240, this);
        }
    }

    @ObfuscatedName("it.dn(I[BZZI)V")
    public void method3940(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3221[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3221[arg0];
            if (this.field3241 != null) {
                class161 var10 = this.field3241;
                class234 var11 = new class234();
                var11.field3205 = 0;
                var11.field2483 = (long) arg0;
                var11.field3201 = arg1;
                var11.field3202 = var10;
                class194 var12 = class237.field3234;
                synchronized (class237.field3234) {
                    class237.field3234.method3384(var11);
                }
                class237.method157();
                this.field3242[arg0] = true;
            }
            if (arg3) {
                this.field3226[arg0] = class177.method685(arg1, false);
            }
            return;
        }
        if (this.field3239) {
            throw new RuntimeException();
        }
        if (this.field3240 != null) {
            int var5 = this.field3244;
            class161 var6 = this.field3240;
            class234 var7 = new class234();
            var7.field3205 = 0;
            var7.field2483 = (long) var5;
            var7.field3201 = arg1;
            var7.field3202 = var6;
            class194 var8 = class237.field3234;
            synchronized (class237.field3234) {
                class237.field3234.method3384(var7);
            }
            class237.method157();
        }
        this.method3893(arg1);
        this.method3942();
    }

    @ObfuscatedName("it.dd(Lfu;I[BZI)V")
    public void method3941(class161 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3240 != arg0) {
            if (!arg3 && this.field3248 == arg1) {
                this.field3239 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3242[arg1] = false;
                if (this.field3243 || arg3) {
                    class239.method2834(this, this.field3244, arg1, this.field3220[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3245.reset();
            field3245.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3245.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3220[arg1] != var9 || this.field3221[arg1] != var10) {
                this.field3242[arg1] = false;
                if (this.field3243 || arg3) {
                    class239.method2834(this, this.field3244, arg1, this.field3220[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3242[arg1] = true;
            if (arg3) {
                this.field3226[arg1] = class177.method685(arg2, false);
            }
            return;
        }
        if (this.field3239) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class239.method2834(this, 255, this.field3244, this.field3246, (byte) 0, true);
            return;
        }
        field3245.reset();
        field3245.update(arg2, 0, arg2.length);
        int var5 = (int) field3245.getValue();
        class174 var6 = new class174(class236.method1375(arg2));
        int var7 = var6.method2925();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3244 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3058();
        }
        if (this.field3246 != var5 || this.field3247 != var8) {
            class239.method2834(this, 255, this.field3244, this.field3246, (byte) 0, true);
            return;
        }
        this.method3893(arg2);
        this.method3942();
    }

    @ObfuscatedName("it.dc(I)V")
    public void method3942() {
        this.field3242 = new boolean[this.field3226.length];
        for (int var1 = 0; var1 < this.field3242.length; var1++) {
            this.field3242[var1] = false;
        }
        if (this.field3241 == null) {
            this.field3239 = true;
            return;
        }
        this.field3248 = -1;
        for (int var2 = 0; var2 < this.field3242.length; var2++) {
            if (this.field3222[var2] > 0) {
                class161 var3 = this.field3241;
                class234 var5 = new class234();
                var5.field3205 = 1;
                var5.field2483 = (long) var2;
                var5.field3202 = var3;
                var5.field3203 = this;
                class194 var6 = class237.field3234;
                synchronized (class237.field3234) {
                    class237.field3234.method3384(var5);
                }
                class237.method157();
                this.field3248 = var2;
            }
        }
        if (this.field3248 == -1) {
            this.field3239 = true;
        }
    }

    @ObfuscatedName("it.z(IB)I")
    public int method3835(int arg0) {
        if (this.field3226[arg0] != null) {
            return 100;
        } else if (this.field3242[arg0]) {
            return 100;
        } else {
            int var2 = this.field3244;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field328 != null && Statics.field328.field2483 == var3) {
                var5 = Statics.field2844.field2400 * 99 / (Statics.field2844.field2401.length - Statics.field328.field3211) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("it.dk(I)I")
    public int method3946() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3226.length; var3++) {
            if (this.field3222[var3] > 0) {
                var1 += 100;
                var2 += this.method3835(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
