package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ln")
public class class331 extends class333 {

    @ObfuscatedName("ln.q")
    public class404 field4185;

    @ObfuscatedName("ln.f")
    public class404 field4183;

    @ObfuscatedName("ln.r")
    public int field4184;

    @ObfuscatedName("ln.u")
    public volatile int field4190 = 0;

    @ObfuscatedName("ln.b")
    public boolean field4177 = false;

    @ObfuscatedName("ln.j")
    public volatile boolean[] field4187;

    @ObfuscatedName("ln.g")
    public static CRC32 field4188 = new CRC32();

    @ObfuscatedName("ln.i")
    public int field4189;

    @ObfuscatedName("ln.o")
    public int field4179;

    @ObfuscatedName("ln.n")
    public int field4191 = -1;

    @ObfuscatedName("ln.k")
    public boolean field4192 = false;

    public class331(class404 arg0, class404 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        super(arg3, arg4);
        this.field4185 = arg0;
        this.field4183 = arg1;
        this.field4184 = arg2;
        this.field4177 = arg5;
        this.field4192 = arg6;
        class334.method5259(this, this.field4184);
    }

    @ObfuscatedName("ln.h(I)Z")
    public boolean method5801() {
        return this.field4190 == 1;
    }

    @ObfuscatedName("ln.e(I)I")
    public int method5802() {
        if (this.field4190 == 1 || this.field4192 && this.field4190 == 2) {
            return 100;
        } else if (this.field4208 == null) {
            int var1 = this.field4184;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2020 != null && Statics.field2020.field4686 == var2) {
                var4 = Statics.field4313.field4915 * 99 / (Statics.field4313.field4917.length - Statics.field2020.field4197) + 1;
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

    @ObfuscatedName("ln.v(IB)V")
    public void method5803(int arg0) {
        int var2 = this.field4184;
        long var3 = (long) ((var2 << 16) + arg0);
        class332 var5 = (class332) class334.field4225.method7535(var3);
        if (var5 != null) {
            class334.field4220.method6069(var5);
        }
    }

    @ObfuscatedName("ln.x(IB)V")
    public void method5804(int arg0) {
        if (this.field4185 == null || this.field4187 == null || !this.field4187[arg0]) {
            class334.method3196(this, this.field4184, arg0, this.field4206[arg0], (byte) 2, true);
            return;
        }
        class404 var2 = this.field4185;
        byte[] var4 = null;
        class352 var5 = class330.field4176;
        synchronized (class330.field4176) {
            for (class329 var6 = (class329) class330.field4176.method6086(); var6 != null; var6 = (class329) class330.field4176.method6088()) {
                if ((long) arg0 == var6.field4686 && var6.field4169 == var2 && var6.field4170 == 0) {
                    var4 = var6.field4168;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method6999(arg0);
            this.method5808(var2, arg0, var8, true);
        } else {
            this.method5808(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ln.m(I)V")
    public void method5805() {
        this.field4190 = 2;
        this.field4198 = new int[0];
        this.field4206 = new int[0];
        this.field4199 = new int[0];
        this.field4210 = new int[0];
        this.field4205 = new int[0][];
        this.field4208 = new Object[0];
        this.field4209 = new Object[0][];
    }

    @ObfuscatedName("ln.q(III)V")
    public void method5842(int arg0, int arg1) {
        this.field4189 = arg0;
        this.field4179 = arg1;
        if (this.field4183 == null) {
            class334.method3196(this, 255, this.field4184, this.field4189, (byte) 0, true);
            return;
        }
        int var3 = this.field4184;
        class404 var4 = this.field4183;
        byte[] var6 = null;
        class352 var7 = class330.field4176;
        synchronized (class330.field4176) {
            for (class329 var8 = (class329) class330.field4176.method6086(); var8 != null; var8 = (class329) class330.field4176.method6088()) {
                if ((long) var3 == var8.field4686 && var8.field4169 == var4 && var8.field4170 == 0) {
                    var6 = var8.field4168;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method6999(var3);
            this.method5808(var4, var3, var10, true);
        } else {
            this.method5808(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ln.f(I[BZZI)V")
    public void method5835(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ln.r(Loi;I[BZI)V")
    public void method5808(class404 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ln.u(I)V")
    public void method5837() {
        this.field4187 = new boolean[this.field4208.length];
        for (int var1 = 0; var1 < this.field4187.length; var1++) {
            this.field4187[var1] = false;
        }
        if (this.field4185 == null) {
            this.field4190 = 1;
            return;
        }
        this.field4191 = -1;
        for (int var2 = 0; var2 < this.field4187.length; var2++) {
            if (this.field4210[var2] > 0) {
                class330.method4930(var2, this.field4185, this);
                this.field4191 = var2;
            }
        }
        if (this.field4191 == -1) {
            this.field4190 = 1;
        }
    }

    @ObfuscatedName("ln.b(II)I")
    public int method5806(int arg0) {
        if (this.field4208[arg0] != null) {
            return 100;
        } else if (this.field4187[arg0]) {
            return 100;
        } else {
            int var2 = this.field4184;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2020 != null && Statics.field2020.field4686 == var3) {
                var5 = Statics.field4313.field4915 * 99 / (Statics.field4313.field4917.length - Statics.field2020.field4197) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ln.j(II)Z")
    public boolean method5810(int arg0) {
        return this.field4187[arg0];
    }

    @ObfuscatedName("ln.g(II)Z")
    public boolean method5834(int arg0) {
        return this.method5854(arg0) != null;
    }

    @ObfuscatedName("ln.i(B)I")
    public int method5828() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4208.length; var3++) {
            if (this.field4210[var3] > 0) {
                var1 += 100;
                var2 += this.method5806(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
