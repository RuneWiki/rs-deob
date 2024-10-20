package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ig")
public class class251 extends class253 {

    @ObfuscatedName("ig.u")
    public class332 field3248;

    @ObfuscatedName("ig.p")
    public class332 field3249;

    @ObfuscatedName("ig.b")
    public int field3250;

    @ObfuscatedName("ig.e")
    public volatile boolean field3251 = false;

    @ObfuscatedName("ig.k")
    public boolean field3252 = false;

    @ObfuscatedName("ig.g")
    public volatile boolean[] field3255;

    @ObfuscatedName("ig.h")
    public static CRC32 field3254 = new CRC32();

    @ObfuscatedName("ig.n")
    public int field3258;

    @ObfuscatedName("ig.l")
    public int field3256;

    @ObfuscatedName("ig.m")
    public int field3257 = -1;

    public class251(class332 arg0, class332 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3248 = arg0;
        this.field3249 = arg1;
        this.field3250 = arg2;
        this.field3252 = arg5;
        class254.method2311(this, this.field3250);
    }

    @ObfuscatedName("ig.f(I)Z")
    public boolean method3888() {
        return this.field3251;
    }

    @ObfuscatedName("ig.o(I)I")
    public int method3889() {
        if (this.field3251) {
            return 100;
        } else if (this.field3275 == null) {
            int var1 = class254.method189(255, this.field3250);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ig.u(II)V")
    public void method3907(int arg0) {
        int var2 = this.field3250;
        long var3 = (long) ((var2 << 16) + arg0);
        class252 var5 = (class252) class254.field3294.method5638(var3);
        if (var5 != null) {
            class254.field3290.method4144(var5);
        }
    }

    @ObfuscatedName("ig.p(II)V")
    public void method3891(int arg0) {
        if (this.field3248 == null || this.field3255 == null || !this.field3255[arg0]) {
            class254.method306(this, this.field3250, arg0, this.field3281[arg0], (byte) 2, true);
            return;
        }
        class332 var2 = this.field3248;
        byte[] var4 = null;
        class272 var5 = class250.field3239;
        synchronized (class250.field3239) {
            for (class249 var6 = (class249) class250.field3239.method4160(); var6 != null; var6 = (class249) class250.field3239.method4182()) {
                if ((long) arg0 == var6.field3941 && var6.field3235 == var2 && var6.field3236 == 0) {
                    var4 = var6.field3234;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method5272(arg0);
            this.method3894(var2, arg0, var8, true);
        } else {
            this.method3894(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ig.b(III)V")
    public void method3892(int arg0, int arg1) {
        this.field3258 = arg0;
        this.field3256 = arg1;
        if (this.field3249 == null) {
            class254.method306(this, 255, this.field3250, this.field3258, (byte) 0, true);
            return;
        }
        int var3 = this.field3250;
        class332 var4 = this.field3249;
        byte[] var6 = null;
        class272 var7 = class250.field3239;
        synchronized (class250.field3239) {
            for (class249 var8 = (class249) class250.field3239.method4160(); var8 != null; var8 = (class249) class250.field3239.method4182()) {
                if ((long) var3 == var8.field3941 && var8.field3235 == var4 && var8.field3236 == 0) {
                    var6 = var8.field3234;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method5272(var3);
            this.method3894(var4, var3, var10, true);
        } else {
            this.method3894(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ig.e(I[BZZI)V")
    public void method3893(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ig.k(Llp;I[BZI)V")
    public void method3894(class332 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ig.g(I)V")
    public void method3895() {
        this.field3255 = new boolean[this.field3275.length];
        for (int var1 = 0; var1 < this.field3255.length; var1++) {
            this.field3255[var1] = false;
        }
        if (this.field3248 == null) {
            this.field3251 = true;
            return;
        }
        this.field3257 = -1;
        for (int var2 = 0; var2 < this.field3255.length; var2++) {
            if (this.field3271[var2] > 0) {
                class250.method66(var2, this.field3248, this);
                this.field3257 = var2;
            }
        }
        if (this.field3257 == -1) {
            this.field3251 = true;
        }
    }

    @ObfuscatedName("ig.h(IB)I")
    public int method3896(int arg0) {
        if (this.field3275[arg0] != null) {
            return 100;
        } else if (this.field3255[arg0]) {
            return 100;
        } else {
            int var2 = this.field3250;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2464 != null && Statics.field2464.field3941 == var3) {
                var5 = Statics.field1144.field4155 * 99 / (Statics.field1144.field4153.length - Statics.field2464.field3259) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ig.n(IB)Z")
    public boolean method3916(int arg0) {
        return this.field3255[arg0];
    }

    @ObfuscatedName("ig.l(II)Z")
    public boolean method3898(int arg0) {
        return this.method3943(arg0) != null;
    }

    @ObfuscatedName("ig.m(B)I")
    public int method3899() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3275.length; var3++) {
            if (this.field3271[var3] > 0) {
                var1 += 100;
                var2 += this.method3896(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
