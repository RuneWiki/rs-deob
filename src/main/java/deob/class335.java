package deob;

import java.util.zip.CRC32;

@ObfuscatedName("lm")
public class class335 extends class337 {

    @ObfuscatedName("lm.j")
    public class411 field4215;

    @ObfuscatedName("lm.i")
    public class411 field4205;

    @ObfuscatedName("lm.n")
    public int field4203;

    @ObfuscatedName("lm.l")
    public volatile int field4208 = 0;

    @ObfuscatedName("lm.k")
    public boolean field4209 = false;

    @ObfuscatedName("lm.c")
    public volatile boolean[] field4210;

    @ObfuscatedName("lm.r")
    public static CRC32 field4211 = new CRC32();

    @ObfuscatedName("lm.b")
    public int field4212;

    @ObfuscatedName("lm.m")
    public int field4213;

    @ObfuscatedName("lm.t")
    public int field4207 = -1;

    @ObfuscatedName("lm.h")
    public boolean field4206 = false;

    public class335(class411 arg0, class411 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        super(arg3, arg4);
        this.field4215 = arg0;
        this.field4205 = arg1;
        this.field4203 = arg2;
        this.field4209 = arg5;
        this.field4206 = arg6;
        class338.method6210(this, this.field4203);
    }

    @ObfuscatedName("lm.f(I)Z")
    public boolean method5926() {
        return this.field4208 == 1;
    }

    @ObfuscatedName("lm.w(I)I")
    public int method5958() {
        if (this.field4208 == 1 || this.field4206 && this.field4208 == 2) {
            return 100;
        } else if (this.field4228 == null) {
            int var1 = this.field4203;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2975 != null && Statics.field2975.field4711 == var2) {
                var4 = Statics.field82.field4939 * 99 / (Statics.field82.field4936.length - Statics.field2975.field4216) + 1;
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

    @ObfuscatedName("lm.v(II)V")
    public void method5925(int arg0) {
        class338.method2890(this.field4203, arg0);
    }

    @ObfuscatedName("lm.s(IB)V")
    public void method5945(int arg0) {
        if (this.field4215 == null || this.field4210 == null || !this.field4210[arg0]) {
            class338.method1742(this, this.field4203, arg0, this.field4221[arg0], (byte) 2, true);
            return;
        }
        class411 var2 = this.field4215;
        byte[] var4 = null;
        class356 var5 = class334.field4198;
        synchronized (class334.field4198) {
            for (class333 var6 = (class333) class334.field4198.method6241(); var6 != null; var6 = (class333) class334.field4198.method6248()) {
                if ((long) arg0 == var6.field4711 && var6.field4193 == var2 && var6.field4195 == 0) {
                    var4 = var6.field4192;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method7199(arg0);
            this.method5960(var2, arg0, var8, true);
        } else {
            this.method5960(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("lm.z(I)V")
    public void method5933() {
        this.field4208 = 2;
        this.field4220 = new int[0];
        this.field4221 = new int[0];
        this.field4225 = new int[0];
        this.field4226 = new int[0];
        this.field4227 = new int[0][];
        this.field4228 = new Object[0];
        this.field4231 = new Object[0][];
    }

    @ObfuscatedName("lm.j(III)V")
    public void method5950(int arg0, int arg1) {
        this.field4212 = arg0;
        this.field4213 = arg1;
        if (this.field4205 == null) {
            class338.method1742(this, 255, this.field4203, this.field4212, (byte) 0, true);
            return;
        }
        int var3 = this.field4203;
        class411 var4 = this.field4205;
        byte[] var6 = null;
        class356 var7 = class334.field4198;
        synchronized (class334.field4198) {
            for (class333 var8 = (class333) class334.field4198.method6241(); var8 != null; var8 = (class333) class334.field4198.method6248()) {
                if ((long) var3 == var8.field4711 && var8.field4193 == var4 && var8.field4195 == 0) {
                    var6 = var8.field4192;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method7199(var3);
            this.method5960(var4, var3, var10, true);
        } else {
            this.method5960(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("lm.i(I[BZZB)V")
    public void method5932(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("lm.n(Loi;I[BZB)V")
    public void method5960(class411 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("lm.l(B)V")
    public void method5934() {
        this.field4210 = new boolean[this.field4228.length];
        for (int var1 = 0; var1 < this.field4210.length; var1++) {
            this.field4210[var1] = false;
        }
        if (this.field4215 == null) {
            this.field4208 = 1;
            return;
        }
        this.field4207 = -1;
        for (int var2 = 0; var2 < this.field4210.length; var2++) {
            if (this.field4226[var2] > 0) {
                class334.method2612(var2, this.field4215, this);
                this.field4207 = var2;
            }
        }
        if (this.field4207 == -1) {
            this.field4208 = 1;
        }
    }

    @ObfuscatedName("lm.k(II)I")
    public int method5935(int arg0) {
        if (this.field4228[arg0] != null) {
            return 100;
        } else if (this.field4210[arg0]) {
            return 100;
        } else {
            int var2 = this.field4203;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2975 != null && Statics.field2975.field4711 == var3) {
                var5 = Statics.field82.field4939 * 99 / (Statics.field82.field4936.length - Statics.field2975.field4216) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("lm.c(II)Z")
    public boolean method5936(int arg0) {
        return this.field4210[arg0];
    }

    @ObfuscatedName("lm.r(IB)Z")
    public boolean method5937(int arg0) {
        return this.method5981(arg0) != null;
    }

    @ObfuscatedName("lm.b(I)I")
    public int method5938() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4228.length; var3++) {
            if (this.field4226[var3] > 0) {
                var1 += 100;
                var2 += this.method5935(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
