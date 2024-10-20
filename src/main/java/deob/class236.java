package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ij")
public class class236 extends class234 {

    @ObfuscatedName("ij.g")
    public class308 field3144;

    @ObfuscatedName("ij.w")
    public class308 field3141;

    @ObfuscatedName("ij.u")
    public int field3148;

    @ObfuscatedName("ij.y")
    public volatile boolean field3146 = false;

    @ObfuscatedName("ij.aa")
    public boolean field3140 = false;

    @ObfuscatedName("ij.aw")
    public volatile boolean[] field3145;

    @ObfuscatedName("ij.ar")
    public static CRC32 field3142 = new CRC32();

    @ObfuscatedName("ij.aq")
    public int field3147;

    @ObfuscatedName("ij.ad")
    public int field3143;

    @ObfuscatedName("ij.ag")
    public int field3149 = -1;

    public class236(class308 arg0, class308 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3144 = arg0;
        this.field3141 = arg1;
        this.field3148 = arg2;
        this.field3140 = arg5;
        int var8 = this.field3148;
        if (Statics.field2479 == null) {
            class237.method3238((class236) null, 255, 255, 0, (byte) 0, true);
            class237.field3165[var8] = this;
        } else {
            Statics.field2479.field3694 = var8 * 8 + 5;
            int var9 = Statics.field2479.method5155();
            int var10 = Statics.field2479.method5155();
            this.method3983(var9, var10);
        }
    }

    @ObfuscatedName("ij.dm(I)Z")
    public boolean method3980() {
        return this.field3146;
    }

    @ObfuscatedName("ij.di(I)I")
    public int method3981() {
        if (this.field3146) {
            return 100;
        } else if (this.field3123 == null) {
            int var1 = class237.method2382(255, this.field3148);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ij.t(IB)V")
    public void method3949(int arg0) {
        class237.method2724(this.field3148, arg0);
    }

    @ObfuscatedName("ij.h(II)V")
    public void method3883(int arg0) {
        if (this.field3144 == null || this.field3145 == null || !this.field3145[arg0]) {
            class237.method3238(this, this.field3148, arg0, this.field3113[arg0], (byte) 2, true);
            return;
        }
        class308 var2 = this.field3144;
        byte[] var4 = null;
        class262 var5 = class235.field3136;
        synchronized (class235.field3136) {
            for (class232 var6 = (class232) class235.field3136.method4581(); var6 != null; var6 = (class232) class235.field3136.method4589()) {
                if ((long) arg0 == var6.field2091 && var6.field3104 == var2 && var6.field3102 == 0) {
                    var4 = var6.field3103;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method5441(arg0);
            this.method3985(var2, arg0, var8, true);
        } else {
            this.method3985(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ij.dn(III)V")
    public void method3983(int arg0, int arg1) {
        this.field3147 = arg0;
        this.field3143 = arg1;
        if (this.field3141 == null) {
            class237.method3238(this, 255, this.field3148, this.field3147, (byte) 0, true);
            return;
        }
        int var3 = this.field3148;
        class308 var4 = this.field3141;
        byte[] var6 = null;
        class262 var7 = class235.field3136;
        synchronized (class235.field3136) {
            for (class232 var8 = (class232) class235.field3136.method4581(); var8 != null; var8 = (class232) class235.field3136.method4589()) {
                if ((long) var3 == var8.field2091 && var8.field3104 == var4 && var8.field3102 == 0) {
                    var6 = var8.field3103;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method5441(var3);
            this.method3985(var4, var3, var10, true);
        } else {
            this.method3985(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ij.dr(I[BZZB)V")
    public void method3984(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3118[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3118[arg0];
            if (this.field3144 != null) {
                class308 var10 = this.field3144;
                class232 var11 = new class232();
                var11.field3102 = 0;
                var11.field2091 = (long) arg0;
                var11.field3103 = arg1;
                var11.field3104 = var10;
                class262 var12 = class235.field3136;
                synchronized (class235.field3136) {
                    class235.field3136.method4576(var11);
                }
                class235.method1076();
                this.field3145[arg0] = true;
            }
            if (arg3) {
                this.field3123[arg0] = class206.method3654(arg1, false);
            }
            return;
        }
        if (this.field3146) {
            throw new RuntimeException();
        }
        if (this.field3141 != null) {
            int var5 = this.field3148;
            class308 var6 = this.field3141;
            class232 var7 = new class232();
            var7.field3102 = 0;
            var7.field2091 = (long) var5;
            var7.field3103 = arg1;
            var7.field3104 = var6;
            class262 var8 = class235.field3136;
            synchronized (class235.field3136) {
                class235.field3136.method4576(var7);
            }
            class235.method1076();
        }
        this.method3871(arg1);
        this.method3986();
    }

    @ObfuscatedName("ij.do(Lke;I[BZI)V")
    public void method3985(class308 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3141 != arg0) {
            if (!arg3 && this.field3149 == arg1) {
                this.field3146 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3145[arg1] = false;
                if (this.field3140 || arg3) {
                    class237.method3238(this, this.field3148, arg1, this.field3113[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3142.reset();
            field3142.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3142.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3113[arg1] != var9 || this.field3118[arg1] != var10) {
                this.field3145[arg1] = false;
                if (this.field3140 || arg3) {
                    class237.method3238(this, this.field3148, arg1, this.field3113[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3145[arg1] = true;
            if (arg3) {
                this.field3123[arg1] = class206.method3654(arg2, false);
            }
            return;
        }
        if (this.field3146) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class237.method3238(this, 255, this.field3148, this.field3147, (byte) 0, true);
            return;
        }
        field3142.reset();
        field3142.update(arg2, 0, arg2.length);
        int var5 = (int) field3142.getValue();
        if (this.field3147 != var5) {
            class237.method3238(this, 255, this.field3148, this.field3147, (byte) 0, true);
            return;
        }
        class300 var6 = new class300(class234.method1069(arg2));
        int var7 = var6.method5123();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3148 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method5155();
        }
        if (this.field3143 != var8) {
            class237.method3238(this, 255, this.field3148, this.field3147, (byte) 0, true);
            return;
        }
        this.method3871(arg2);
        this.method3986();
    }

    @ObfuscatedName("ij.ds(B)V")
    public void method3986() {
        this.field3145 = new boolean[this.field3123.length];
        for (int var1 = 0; var1 < this.field3145.length; var1++) {
            this.field3145[var1] = false;
        }
        if (this.field3144 == null) {
            this.field3146 = true;
            return;
        }
        this.field3149 = -1;
        for (int var2 = 0; var2 < this.field3145.length; var2++) {
            if (this.field3119[var2] > 0) {
                class308 var3 = this.field3144;
                class232 var5 = new class232();
                var5.field3102 = 1;
                var5.field2091 = (long) var2;
                var5.field3104 = var3;
                var5.field3105 = this;
                class262 var6 = class235.field3136;
                synchronized (class235.field3136) {
                    class235.field3136.method4576(var5);
                }
                class235.method1076();
                this.field3149 = var2;
            }
        }
        if (this.field3149 == -1) {
            this.field3146 = true;
        }
    }

    @ObfuscatedName("ij.i(II)I")
    public int method3879(int arg0) {
        if (this.field3123[arg0] == null) {
            return this.field3145[arg0] ? 100 : class237.method2382(this.field3148, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ij.dz(II)Z")
    public boolean method3987(int arg0) {
        return this.field3145[arg0];
    }

    @ObfuscatedName("ij.dj(II)Z")
    public boolean method3998(int arg0) {
        return this.method3887(arg0) != null;
    }

    @ObfuscatedName("ij.df(B)I")
    public int method4000() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3123.length; var3++) {
            if (this.field3119[var3] > 0) {
                var1 += 100;
                var2 += this.method3879(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
