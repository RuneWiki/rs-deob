package deob;

import java.util.zip.CRC32;

@ObfuscatedName("lb")
public class class315 extends class317 {

    @ObfuscatedName("lb.w")
    public class383 field4024;

    @ObfuscatedName("lb.s")
    public class383 field4025;

    @ObfuscatedName("lb.q")
    public int field4026;

    @ObfuscatedName("lb.m")
    public volatile int field4030 = 0;

    @ObfuscatedName("lb.x")
    public boolean field4020 = false;

    @ObfuscatedName("lb.j")
    public volatile boolean[] field4028;

    @ObfuscatedName("lb.v")
    public static CRC32 field4027 = new CRC32();

    @ObfuscatedName("lb.h")
    public int field4031;

    @ObfuscatedName("lb.t")
    public int field4032;

    @ObfuscatedName("lb.u")
    public int field4033 = -1;

    @ObfuscatedName("lb.d")
    public boolean field4029 = false;

    public class315(class383 arg0, class383 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        super(arg3, arg4);
        this.field4024 = arg0;
        this.field4025 = arg1;
        this.field4026 = arg2;
        this.field4020 = arg5;
        this.field4029 = arg6;
        class318.method5081(this, this.field4026);
    }

    @ObfuscatedName("lb.c(B)Z")
    public boolean method5369() {
        return this.field4030 == 1;
    }

    @ObfuscatedName("lb.p(I)I")
    public int method5382() {
        if (this.field4030 == 1 || this.field4029 && this.field4030 == 2) {
            return 100;
        } else if (this.field4042 == null) {
            int var1 = class318.method211(255, this.field4026);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("lb.f(II)V")
    public void method5400(int arg0) {
        int var2 = this.field4026;
        long var3 = (long) ((var2 << 16) + arg0);
        class316 var5 = (class316) class318.field4068.method6941(var3);
        if (var5 != null) {
            class318.field4064.method5633(var5);
        }
    }

    @ObfuscatedName("lb.n(II)V")
    public void method5371(int arg0) {
        if (this.field4024 == null || this.field4028 == null || !this.field4028[arg0]) {
            class318.method4814(this, this.field4026, arg0, this.field4052[arg0], (byte) 2, true);
        } else {
            class314.method4659(arg0, this.field4024, this);
        }
    }

    @ObfuscatedName("lb.k(I)V")
    public void method5389() {
        this.field4030 = 2;
        this.field4040 = new int[0];
        this.field4052 = new int[0];
        this.field4044 = new int[0];
        this.field4045 = new int[0];
        this.field4046 = new int[0][];
        this.field4042 = new Object[0];
        this.field4050 = new Object[0][];
    }

    @ObfuscatedName("lb.w(III)V")
    public void method5373(int arg0, int arg1) {
        this.field4031 = arg0;
        this.field4032 = arg1;
        if (this.field4025 == null) {
            class318.method4814(this, 255, this.field4026, this.field4031, (byte) 0, true);
        } else {
            class314.method4659(this.field4026, this.field4025, this);
        }
    }

    @ObfuscatedName("lb.s(I[BZZI)V")
    public void method5384(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("lb.q(Lnj;I[BZI)V")
    public void method5383(class383 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("lb.m(I)V")
    public void method5376() {
        this.field4028 = new boolean[this.field4042.length];
        for (int var1 = 0; var1 < this.field4028.length; var1++) {
            this.field4028[var1] = false;
        }
        if (this.field4024 == null) {
            this.field4030 = 1;
            return;
        }
        this.field4033 = -1;
        for (int var2 = 0; var2 < this.field4028.length; var2++) {
            if (this.field4045[var2] > 0) {
                class314.method2626(var2, this.field4024, this);
                this.field4033 = var2;
            }
        }
        if (this.field4033 == -1) {
            this.field4030 = 1;
        }
    }

    @ObfuscatedName("lb.x(IB)I")
    public int method5377(int arg0) {
        if (this.field4042[arg0] == null) {
            return this.field4028[arg0] ? 100 : class318.method211(this.field4026, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("lb.j(II)Z")
    public boolean method5378(int arg0) {
        return this.field4028[arg0];
    }

    @ObfuscatedName("lb.v(II)Z")
    public boolean method5379(int arg0) {
        return this.method5424(arg0) != null;
    }

    @ObfuscatedName("lb.h(I)I")
    public int method5380() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4042.length; var3++) {
            if (this.field4045[var3] > 0) {
                var1 += 100;
                var2 += this.method5377(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
