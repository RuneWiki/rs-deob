package deob;

import java.util.zip.CRC32;

@ObfuscatedName("it")
public class class247 extends class245 {

    @ObfuscatedName("it.c")
    public class176 field3236;

    @ObfuscatedName("it.r")
    public class176 field3232;

    @ObfuscatedName("it.p")
    public int field3237;

    @ObfuscatedName("it.v")
    public volatile boolean field3234 = false;

    @ObfuscatedName("it.ag")
    public boolean field3235 = false;

    @ObfuscatedName("it.aq")
    public volatile boolean[] field3241;

    @ObfuscatedName("it.aj")
    public static CRC32 field3231 = new CRC32();

    @ObfuscatedName("it.av")
    public int field3238;

    @ObfuscatedName("it.ar")
    public int field3239;

    @ObfuscatedName("it.ac")
    public int field3240 = -1;

    public class247(class176 arg0, class176 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3236 = arg0;
        this.field3232 = arg1;
        this.field3237 = arg2;
        this.field3235 = arg5;
        int var8 = this.field3237;
        if (Statics.field1240 == null) {
            class248.method3721((class247) null, 255, 255, 0, (byte) 0, true);
            class248.field3253[var8] = this;
        } else {
            Statics.field1240.field2439 = var8 * 8 + 5;
            int var9 = Statics.field1240.method3620();
            int var10 = Statics.field1240.method3620();
            this.method4274(var9, var10);
        }
    }

    @ObfuscatedName("it.cx(I)Z")
    public boolean method4265() {
        return this.field3234;
    }

    @ObfuscatedName("it.ca(I)I")
    public int method4275() {
        if (this.field3234) {
            return 100;
        } else if (this.field3214 == null) {
            int var1 = class248.method948(255, this.field3237);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("it.f(II)V")
    public void method4203(int arg0) {
        int var2 = this.field3237;
        long var3 = (long) ((var2 << 16) + arg0);
        class244 var5 = (class244) class248.field3250.method5416(var3);
        if (var5 != null) {
            class248.field3249.method4810(var5);
        }
    }

    @ObfuscatedName("it.z(II)V")
    public void method4166(int arg0) {
        if (this.field3236 == null || this.field3241 == null || !this.field3241[arg0]) {
            class248.method3721(this, this.field3237, arg0, this.field3208[arg0], (byte) 2, true);
            return;
        }
        class176 var2 = this.field3236;
        byte[] var4 = null;
        class273 var5 = class246.field3229;
        synchronized (class246.field3229) {
            for (class243 var6 = (class243) class246.field3229.method4856(); var6 != null; var6 = (class243) class246.field3229.method4858()) {
                if ((long) arg0 == var6.field2139 && var6.field3197 == var2 && var6.field3193 == 0) {
                    var4 = var6.field3191;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method3229(arg0);
            this.method4287(var2, arg0, var8, true);
        } else {
            this.method4287(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("it.co(III)V")
    public void method4274(int arg0, int arg1) {
        this.field3238 = arg0;
        this.field3239 = arg1;
        if (this.field3232 == null) {
            class248.method3721(this, 255, this.field3237, this.field3238, (byte) 0, true);
            return;
        }
        int var3 = this.field3237;
        class176 var4 = this.field3232;
        byte[] var6 = null;
        class273 var7 = class246.field3229;
        synchronized (class246.field3229) {
            for (class243 var8 = (class243) class246.field3229.method4856(); var8 != null; var8 = (class243) class246.field3229.method4858()) {
                if ((long) var3 == var8.field2139 && var8.field3197 == var4 && var8.field3193 == 0) {
                    var6 = var8.field3191;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method3229(var3);
            this.method4287(var4, var3, var10, true);
        } else {
            this.method4287(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("it.de(I[BZZB)V")
    public void method4267(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3234) {
                throw new RuntimeException();
            }
            if (this.field3232 != null) {
                class246.method4105(this.field3237, arg1, this.field3232);
            }
            this.method4154(arg1);
            this.method4269();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3207[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3207[arg0];
        if (this.field3236 != null) {
            class246.method4105(arg0, arg1, this.field3236);
            this.field3241[arg0] = true;
        }
        if (arg3) {
            this.field3214[arg0] = class206.method1903(arg1, false);
        }
    }

    @ObfuscatedName("it.dx(Lff;I[BZI)V")
    public void method4287(class176 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3232 != arg0) {
            if (!arg3 && this.field3240 == arg1) {
                this.field3234 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3241[arg1] = false;
                if (this.field3235 || arg3) {
                    class248.method3721(this, this.field3237, arg1, this.field3208[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3231.reset();
            field3231.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3231.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3208[arg1] != var9 || this.field3207[arg1] != var10) {
                this.field3241[arg1] = false;
                if (this.field3235 || arg3) {
                    class248.method3721(this, this.field3237, arg1, this.field3208[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3241[arg1] = true;
            if (arg3) {
                this.field3214[arg1] = class206.method1903(arg2, false);
            }
            return;
        }
        if (this.field3234) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class248.method3721(this, 255, this.field3237, this.field3238, (byte) 0, true);
            return;
        }
        field3231.reset();
        field3231.update(arg2, 0, arg2.length);
        int var5 = (int) field3231.getValue();
        if (this.field3238 != var5) {
            class248.method3721(this, 255, this.field3237, this.field3238, (byte) 0, true);
            return;
        }
        class202 var6 = new class202(class245.method4139(arg2));
        int var7 = var6.method3551();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3237 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3620();
        }
        if (this.field3239 != var8) {
            class248.method3721(this, 255, this.field3237, this.field3238, (byte) 0, true);
            return;
        }
        this.method4154(arg2);
        this.method4269();
    }

    @ObfuscatedName("it.dt(I)V")
    public void method4269() {
        this.field3241 = new boolean[this.field3214.length];
        for (int var1 = 0; var1 < this.field3241.length; var1++) {
            this.field3241[var1] = false;
        }
        if (this.field3236 == null) {
            this.field3234 = true;
            return;
        }
        this.field3240 = -1;
        for (int var2 = 0; var2 < this.field3241.length; var2++) {
            if (this.field3206[var2] > 0) {
                class246.method1834(var2, this.field3236, this);
                this.field3240 = var2;
            }
        }
        if (this.field3240 == -1) {
            this.field3234 = true;
        }
    }

    @ObfuscatedName("it.e(II)I")
    public int method4162(int arg0) {
        if (this.field3214[arg0] == null) {
            return this.field3241[arg0] ? 100 : class248.method948(this.field3237, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("it.dn(IB)Z")
    public boolean method4271(int arg0) {
        return this.field3241[arg0];
    }

    @ObfuscatedName("it.df(II)Z")
    public boolean method4272(int arg0) {
        return this.method4167(arg0) != null;
    }

    @ObfuscatedName("it.da(I)I")
    public int method4273() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3214.length; var3++) {
            if (this.field3206[var3] > 0) {
                var1 += 100;
                var2 += this.method4162(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
