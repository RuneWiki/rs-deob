package deob;

import java.util.zip.CRC32;

@ObfuscatedName("kz")
public class class300 extends class302 {

    @ObfuscatedName("kz.p")
    public class360 field3819;

    @ObfuscatedName("kz.m")
    public class360 field3820;

    @ObfuscatedName("kz.t")
    public int field3821;

    @ObfuscatedName("kz.s")
    public volatile boolean field3822 = false;

    @ObfuscatedName("kz.j")
    public boolean field3823 = false;

    @ObfuscatedName("kz.w")
    public volatile boolean[] field3824;

    @ObfuscatedName("kz.n")
    public static CRC32 field3825 = new CRC32();

    @ObfuscatedName("kz.r")
    public int field3826;

    @ObfuscatedName("kz.o")
    public int field3827;

    @ObfuscatedName("kz.v")
    public int field3817 = -1;

    public class300(class360 arg0, class360 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3819 = arg0;
        this.field3820 = arg1;
        this.field3821 = arg2;
        this.field3823 = arg5;
        int var8 = this.field3821;
        if (Statics.field2734 == null) {
            class303.method4798((class300) null, 255, 255, 0, (byte) 0, true);
            class303.field3862[var8] = this;
        } else {
            Statics.field2734.field4475 = var8 * 8 + 5;
            int var9 = Statics.field2734.method6675();
            int var10 = Statics.field2734.method6675();
            this.method5005(var9, var10);
        }
    }

    @ObfuscatedName("kz.c(I)Z")
    public boolean method5001() {
        return this.field3822;
    }

    @ObfuscatedName("kz.b(I)I")
    public int method5017() {
        if (this.field3822) {
            return 100;
        } else if (this.field3842 == null) {
            int var1 = class303.method7174(255, this.field3821);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("kz.p(II)V")
    public void method5003(int arg0) {
        class303.method2123(this.field3821, arg0);
    }

    @ObfuscatedName("kz.m(II)V")
    public void method5027(int arg0) {
        if (this.field3819 == null || this.field3824 == null || !this.field3824[arg0]) {
            class303.method4798(this, this.field3821, arg0, this.field3848[arg0], (byte) 2, true);
        } else {
            class299.method114(arg0, this.field3819, this);
        }
    }

    @ObfuscatedName("kz.t(III)V")
    public void method5005(int arg0, int arg1) {
        this.field3826 = arg0;
        this.field3827 = arg1;
        if (this.field3820 == null) {
            class303.method4798(this, 255, this.field3821, this.field3826, (byte) 0, true);
        } else {
            class299.method114(this.field3821, this.field3820, this);
        }
    }

    @ObfuscatedName("kz.s(I[BZZI)V")
    public void method5006(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("kz.j(Lmy;I[BZB)V")
    public void method5007(class360 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("kz.w(I)V")
    public void method5012() {
        this.field3824 = new boolean[this.field3842.length];
        for (int var1 = 0; var1 < this.field3824.length; var1++) {
            this.field3824[var1] = false;
        }
        if (this.field3819 == null) {
            this.field3822 = true;
            return;
        }
        this.field3817 = -1;
        for (int var2 = 0; var2 < this.field3824.length; var2++) {
            if (this.field3843[var2] > 0) {
                class360 var3 = this.field3819;
                class298 var5 = new class298();
                var5.field3809 = 1;
                var5.field4257 = (long) var2;
                var5.field3811 = var3;
                var5.field3812 = this;
                class321 var6 = class299.field3815;
                synchronized (class299.field3815) {
                    class299.field3815.method5296(var5);
                }
                Statics.method3074();
                this.field3817 = var2;
            }
        }
        if (this.field3817 == -1) {
            this.field3822 = true;
        }
    }

    @ObfuscatedName("kz.n(IB)I")
    public int method5009(int arg0) {
        if (this.field3842[arg0] == null) {
            return this.field3824[arg0] ? 100 : class303.method7174(this.field3821, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("kz.r(II)Z")
    public boolean method5031(int arg0) {
        return this.field3824[arg0];
    }

    @ObfuscatedName("kz.o(II)Z")
    public boolean method5045(int arg0) {
        return this.method5063(arg0) != null;
    }

    @ObfuscatedName("kz.v(I)I")
    public int method5011() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3842.length; var3++) {
            if (this.field3843[var3] > 0) {
                var1 += 100;
                var2 += this.method5009(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
