package deob;

import java.util.zip.CRC32;

@ObfuscatedName("jf")
public class class274 extends class276 {

    @ObfuscatedName("jf.v")
    public class334 field3564;

    @ObfuscatedName("jf.y")
    public class334 field3565;

    @ObfuscatedName("jf.j")
    public int field3566;

    @ObfuscatedName("jf.o")
    public volatile boolean field3563 = false;

    @ObfuscatedName("jf.m")
    public boolean field3567 = false;

    @ObfuscatedName("jf.r")
    public volatile boolean[] field3569;

    @ObfuscatedName("jf.h")
    public static CRC32 field3570 = new CRC32();

    @ObfuscatedName("jf.d")
    public int field3571;

    @ObfuscatedName("jf.z")
    public int field3572;

    @ObfuscatedName("jf.b")
    public int field3573 = -1;

    public class274(class334 arg0, class334 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3564 = arg0;
        this.field3565 = arg1;
        this.field3566 = arg2;
        this.field3567 = arg5;
        int var8 = this.field3566;
        if (Statics.field1466 == null) {
            class277.method1772((class274) null, 255, 255, 0, (byte) 0, true);
            class277.field3618[var8] = this;
        } else {
            Statics.field1466.field4161 = var8 * 8 + 5;
            int var9 = Statics.field1466.method5965();
            int var10 = Statics.field1466.method5965();
            this.method4462(var9, var10);
        }
    }

    @ObfuscatedName("jf.f(I)Z")
    public boolean method4481() {
        return this.field3563;
    }

    @ObfuscatedName("jf.e(I)I")
    public int method4460() {
        if (this.field3563) {
            return 100;
        } else if (this.field3584 == null) {
            int var1 = this.field3566;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field236 != null && Statics.field236.field3937 == var2) {
                var4 = Statics.field3136.field4161 * 99 / (Statics.field3136.field4160.length - Statics.field236.field3576) + 1;
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

    @ObfuscatedName("jf.v(II)V")
    public void method4499(int arg0) {
        int var2 = this.field3566;
        long var3 = (long) ((var2 << 16) + arg0);
        class275 var5 = (class275) class277.field3611.method5691(var3);
        if (var5 != null) {
            class277.field3610.method4705(var5);
        }
    }

    @ObfuscatedName("jf.y(II)V")
    public void method4461(int arg0) {
        if (this.field3564 == null || this.field3569 == null || !this.field3569[arg0]) {
            class277.method1772(this, this.field3566, arg0, this.field3588[arg0], (byte) 2, true);
        } else {
            class273.method1998(arg0, this.field3564, this);
        }
    }

    @ObfuscatedName("jf.j(III)V")
    public void method4462(int arg0, int arg1) {
        this.field3571 = arg0;
        this.field3572 = arg1;
        if (this.field3565 == null) {
            class277.method1772(this, 255, this.field3566, this.field3571, (byte) 0, true);
        } else {
            class273.method1998(this.field3566, this.field3565, this);
        }
    }

    @ObfuscatedName("jf.o(I[BZZI)V")
    public void method4486(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("jf.m(Lla;I[BZI)V")
    public void method4464(class334 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("jf.r(B)V")
    public void method4465() {
        this.field3569 = new boolean[this.field3584.length];
        for (int var1 = 0; var1 < this.field3569.length; var1++) {
            this.field3569[var1] = false;
        }
        if (this.field3564 == null) {
            this.field3563 = true;
            return;
        }
        this.field3573 = -1;
        for (int var2 = 0; var2 < this.field3569.length; var2++) {
            if (this.field3601[var2] > 0) {
                class273.method564(var2, this.field3564, this);
                this.field3573 = var2;
            }
        }
        if (this.field3573 == -1) {
            this.field3563 = true;
        }
    }

    @ObfuscatedName("jf.h(II)I")
    public int method4483(int arg0) {
        if (this.field3584[arg0] == null) {
            return this.field3569[arg0] ? 100 : class277.method4384(this.field3566, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("jf.d(II)Z")
    public boolean method4467(int arg0) {
        return this.field3569[arg0];
    }

    @ObfuscatedName("jf.z(IB)Z")
    public boolean method4468(int arg0) {
        return this.method4513(arg0) != null;
    }

    @ObfuscatedName("jf.b(B)I")
    public int method4469() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3584.length; var3++) {
            if (this.field3601[var3] > 0) {
                var1 += 100;
                var2 += this.method4483(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
