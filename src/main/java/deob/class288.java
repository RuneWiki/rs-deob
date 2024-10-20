package deob;

import java.util.zip.CRC32;

@ObfuscatedName("kd")
public class class288 extends class290 {

    @ObfuscatedName("kd.s")
    public class348 field3671;

    @ObfuscatedName("kd.a")
    public class348 field3672;

    @ObfuscatedName("kd.o")
    public int field3676;

    @ObfuscatedName("kd.g")
    public volatile boolean field3674 = false;

    @ObfuscatedName("kd.e")
    public boolean field3675 = false;

    @ObfuscatedName("kd.p")
    public volatile boolean[] field3677;

    @ObfuscatedName("kd.j")
    public static CRC32 field3673 = new CRC32();

    @ObfuscatedName("kd.b")
    public int field3670;

    @ObfuscatedName("kd.x")
    public int field3679;

    @ObfuscatedName("kd.y")
    public int field3680 = -1;

    public class288(class348 arg0, class348 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3671 = arg0;
        this.field3672 = arg1;
        this.field3676 = arg2;
        this.field3675 = arg5;
        int var8 = this.field3676;
        if (Statics.field1530 == null) {
            class291.method4638((class288) null, 255, 255, 0, (byte) 0, true);
            class291.field3719[var8] = this;
        } else {
            Statics.field1530.field4300 = var8 * 8 + 5;
            int var9 = Statics.field1530.method6245();
            int var10 = Statics.field1530.method6245();
            this.method4704(var9, var10);
        }
    }

    @ObfuscatedName("kd.i(I)Z")
    public boolean method4700() {
        return this.field3674;
    }

    @ObfuscatedName("kd.w(I)I")
    public int method4731() {
        if (this.field3674) {
            return 100;
        } else if (this.field3698 == null) {
            int var1 = class291.method2069(255, this.field3676);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("kd.s(II)V")
    public void method4730(int arg0) {
        class291.method2171(this.field3676, arg0);
    }

    @ObfuscatedName("kd.a(IB)V")
    public void method4718(int arg0) {
        if (this.field3671 == null || this.field3677 == null || !this.field3677[arg0]) {
            class291.method4638(this, this.field3676, arg0, this.field3691[arg0], (byte) 2, true);
        } else {
            class287.method5296(arg0, this.field3671, this);
        }
    }

    @ObfuscatedName("kd.o(IIB)V")
    public void method4704(int arg0, int arg1) {
        this.field3670 = arg0;
        this.field3679 = arg1;
        if (this.field3672 == null) {
            class291.method4638(this, 255, this.field3676, this.field3670, (byte) 0, true);
        } else {
            class287.method5296(this.field3676, this.field3672, this);
        }
    }

    @ObfuscatedName("kd.g(I[BZZI)V")
    public void method4703(int param1, byte[] param2, boolean param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("kd.e(Lmr;I[BZI)V")
    public void method4715(class348 param1, int param2, byte[] param3, boolean param4) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("kd.p(I)V")
    public void method4707() {
        this.field3677 = new boolean[this.field3698.length];
        for (int var1 = 0; var1 < this.field3677.length; var1++) {
            this.field3677[var1] = false;
        }
        if (this.field3671 == null) {
            this.field3674 = true;
            return;
        }
        this.field3680 = -1;
        for (int var2 = 0; var2 < this.field3677.length; var2++) {
            if (this.field3697[var2] > 0) {
                class287.method2435(var2, this.field3671, this);
                this.field3680 = var2;
            }
        }
        if (this.field3680 == -1) {
            this.field3674 = true;
        }
    }

    @ObfuscatedName("kd.j(IB)I")
    public int method4708(int arg0) {
        if (this.field3698[arg0] == null) {
            return this.field3677[arg0] ? 100 : class291.method2069(this.field3676, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("kd.b(II)Z")
    public boolean method4709(int arg0) {
        return this.field3677[arg0];
    }

    @ObfuscatedName("kd.x(IB)Z")
    public boolean method4710(int arg0) {
        return this.method4752(arg0) != null;
    }

    @ObfuscatedName("kd.y(I)I")
    public int method4711() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3698.length; var3++) {
            if (this.field3697[var3] > 0) {
                var1 += 100;
                var2 += this.method4708(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
