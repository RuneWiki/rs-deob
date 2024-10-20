package deob;

import java.util.zip.CRC32;

@ObfuscatedName("il")
public class class247 extends class245 {

    @ObfuscatedName("il.s")
    public class319 field3189;

    @ObfuscatedName("il.o")
    public class319 field3183;

    @ObfuscatedName("il.k")
    public int field3184;

    @ObfuscatedName("il.d")
    public volatile boolean field3186 = false;

    @ObfuscatedName("il.an")
    public boolean field3193 = false;

    @ObfuscatedName("il.aj")
    public volatile boolean[] field3188;

    @ObfuscatedName("il.ax")
    public static CRC32 field3187 = new CRC32();

    @ObfuscatedName("il.ag")
    public int field3190;

    @ObfuscatedName("il.au")
    public int field3191;

    @ObfuscatedName("il.as")
    public int field3192 = -1;

    public class247(class319 arg0, class319 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3189 = arg0;
        this.field3183 = arg1;
        this.field3184 = arg2;
        this.field3193 = arg5;
        int var8 = this.field3184;
        if (Statics.field260 == null) {
            class248.method3768((class247) null, 255, 255, 0, (byte) 0, true);
            class248.field3210[var8] = this;
        } else {
            Statics.field260.field3752 = var8 * 8 + 5;
            int var9 = Statics.field260.method5120();
            int var10 = Statics.field260.method5120();
            this.method3939(var9, var10);
        }
    }

    @ObfuscatedName("il.cv(B)Z")
    public boolean method3943() {
        return this.field3186;
    }

    @ObfuscatedName("il.cs(I)I")
    public int method3947() {
        if (this.field3186) {
            return 100;
        } else if (this.field3170 == null) {
            int var1 = this.field3184;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field3203 != null && Statics.field3203.field2138 == var2) {
                var4 = Statics.field2428.field3752 * 99 / (Statics.field2428.field3753.length - Statics.field3203.field3154) + 1;
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

    @ObfuscatedName("il.v(II)V")
    public void method3833(int arg0) {
        int var2 = this.field3184;
        long var3 = (long) ((var2 << 16) + arg0);
        class244 var5 = (class244) class248.field3202.method5543(var3);
        if (var5 != null) {
            class248.field3201.method4454(var5);
        }
    }

    @ObfuscatedName("il.m(II)V")
    public void method3844(int arg0) {
        if (this.field3189 == null || this.field3188 == null || !this.field3188[arg0]) {
            class248.method3768(this, this.field3184, arg0, this.field3164[arg0], (byte) 2, true);
            return;
        }
        class319 var2 = this.field3189;
        byte[] var4 = null;
        class273 var5 = class246.field3178;
        synchronized (class246.field3178) {
            for (class243 var6 = (class243) class246.field3178.method4540(); var6 != null; var6 = (class243) class246.field3178.method4545()) {
                if ((long) arg0 == var6.field2138 && var6.field3147 == var2 && var6.field3150 == 0) {
                    var4 = var6.field3146;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method5442(arg0);
            this.method3946(var2, arg0, var8, true);
        } else {
            this.method3946(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("il.cn(III)V")
    public void method3939(int arg0, int arg1) {
        this.field3190 = arg0;
        this.field3191 = arg1;
        if (this.field3183 == null) {
            class248.method3768(this, 255, this.field3184, this.field3190, (byte) 0, true);
            return;
        }
        int var3 = this.field3184;
        class319 var4 = this.field3183;
        byte[] var6 = null;
        class273 var7 = class246.field3178;
        synchronized (class246.field3178) {
            for (class243 var8 = (class243) class246.field3178.method4540(); var8 != null; var8 = (class243) class246.field3178.method4545()) {
                if ((long) var3 == var8.field2138 && var8.field3147 == var4 && var8.field3150 == 0) {
                    var6 = var8.field3146;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method5442(var3);
            this.method3946(var4, var3, var10, true);
        } else {
            this.method3946(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("il.co(I[BZZI)V")
    public void method3952(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("il.dh(Llx;I[BZI)V")
    public void method3946(class319 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("il.dl(I)V")
    public void method3942() {
        this.field3188 = new boolean[this.field3170.length];
        for (int var1 = 0; var1 < this.field3188.length; var1++) {
            this.field3188[var1] = false;
        }
        if (this.field3189 == null) {
            this.field3186 = true;
            return;
        }
        this.field3192 = -1;
        for (int var2 = 0; var2 < this.field3188.length; var2++) {
            if (this.field3166[var2] > 0) {
                class246.method3794(var2, this.field3189, this);
                this.field3192 = var2;
            }
        }
        if (this.field3192 == -1) {
            this.field3186 = true;
        }
    }

    @ObfuscatedName("il.l(II)I")
    public int method3868(int arg0) {
        if (this.field3170[arg0] != null) {
            return 100;
        } else if (this.field3188[arg0]) {
            return 100;
        } else {
            int var2 = this.field3184;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field3203 != null && Statics.field3203.field2138 == var3) {
                var5 = Statics.field2428.field3752 * 99 / (Statics.field2428.field3753.length - Statics.field3203.field3154) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("il.du(II)Z")
    public boolean method3954(int arg0) {
        return this.field3188[arg0];
    }

    @ObfuscatedName("il.de(IB)Z")
    public boolean method3944(int arg0) {
        return this.method3845(arg0) != null;
    }

    @ObfuscatedName("il.dw(I)I")
    public int method3945() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3170.length; var3++) {
            if (this.field3166[var3] > 0) {
                var1 += 100;
                var2 += this.method3868(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
