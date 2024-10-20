package deob;

import java.util.zip.CRC32;

@ObfuscatedName("le")
public class class314 extends class316 {

    @ObfuscatedName("le.l")
    public class382 field4006;

    @ObfuscatedName("le.k")
    public class382 field4008;

    @ObfuscatedName("le.a")
    public int field4009;

    @ObfuscatedName("le.m")
    public volatile boolean field4010 = false;

    @ObfuscatedName("le.p")
    public boolean field4011 = false;

    @ObfuscatedName("le.s")
    public volatile boolean[] field4012;

    @ObfuscatedName("le.r")
    public static CRC32 field4016 = new CRC32();

    @ObfuscatedName("le.v")
    public int field4013;

    @ObfuscatedName("le.y")
    public int field4007;

    @ObfuscatedName("le.c")
    public int field4014 = -1;

    public class314(class382 arg0, class382 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field4006 = arg0;
        this.field4008 = arg1;
        this.field4009 = arg2;
        this.field4011 = arg5;
        Statics.method2642(this, this.field4009);
    }

    @ObfuscatedName("le.o(I)Z")
    public boolean method5150() {
        return this.field4010;
    }

    @ObfuscatedName("le.q(I)I")
    public int method5175() {
        if (this.field4010) {
            return 100;
        } else if (this.field4032 == null) {
            int var1 = class317.method41(255, this.field4009);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("le.l(II)V")
    public void method5152(int arg0) {
        class317.method329(this.field4009, arg0);
    }

    @ObfuscatedName("le.k(II)V")
    public void method5153(int arg0) {
        if (this.field4006 == null || this.field4012 == null || !this.field4012[arg0]) {
            class317.method4526(this, this.field4009, arg0, this.field4026[arg0], (byte) 2, true);
        } else {
            class313.method3719(arg0, this.field4006, this);
        }
    }

    @ObfuscatedName("le.a(III)V")
    public void method5183(int arg0, int arg1) {
        this.field4013 = arg0;
        this.field4007 = arg1;
        if (this.field4008 == null) {
            class317.method4526(this, 255, this.field4009, this.field4013, (byte) 0, true);
        } else {
            class313.method3719(this.field4009, this.field4008, this);
        }
    }

    @ObfuscatedName("le.m(I[BZZB)V")
    public void method5155(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field4010) {
                throw new RuntimeException();
            }
            if (this.field4008 != null) {
                class313.method4067(this.field4009, arg1, this.field4008);
            }
            this.method5214(arg1);
            this.method5167();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field4034[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field4034[arg0];
        if (this.field4006 != null) {
            class313.method4067(arg0, arg1, this.field4006);
            this.field4012[arg0] = true;
        }
        if (arg3) {
            this.field4032[arg0] = class284.method4521(arg1, false);
        }
    }

    @ObfuscatedName("le.p(Lnc;I[BZB)V")
    public void method5165(class382 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field4008 != arg0) {
            if (!arg3 && this.field4014 == arg1) {
                this.field4010 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field4012[arg1] = false;
                if (this.field4011 || arg3) {
                    class317.method4526(this, this.field4009, arg1, this.field4026[arg1], (byte) 2, arg3);
                }
                return;
            }
            field4016.reset();
            field4016.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field4016.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field4026[arg1] != var9 || this.field4034[arg1] != var10) {
                this.field4012[arg1] = false;
                if (this.field4011 || arg3) {
                    class317.method4526(this, this.field4009, arg1, this.field4026[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field4012[arg1] = true;
            if (arg3) {
                this.field4032[arg1] = class284.method4521(arg2, false);
            }
            return;
        }
        if (this.field4010) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class317.method4526(this, 255, this.field4009, this.field4013, (byte) 0, true);
            return;
        }
        field4016.reset();
        field4016.update(arg2, 0, arg2.length);
        int var5 = (int) field4016.getValue();
        if (this.field4013 != var5) {
            class317.method4526(this, 255, this.field4009, this.field4013, (byte) 0, true);
            return;
        }
        class440 var6 = new class440(class316.method5112(arg2));
        int var7 = var6.method7071();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field4009 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method6898();
        }
        if (this.field4007 != var8) {
            class317.method4526(this, 255, this.field4009, this.field4013, (byte) 0, true);
            return;
        }
        this.method5214(arg2);
        this.method5167();
    }

    @ObfuscatedName("le.s(B)V")
    public void method5167() {
        this.field4012 = new boolean[this.field4032.length];
        for (int var1 = 0; var1 < this.field4012.length; var1++) {
            this.field4012[var1] = false;
        }
        if (this.field4006 == null) {
            this.field4010 = true;
            return;
        }
        this.field4014 = -1;
        for (int var2 = 0; var2 < this.field4012.length; var2++) {
            if (this.field4024[var2] > 0) {
                class382 var3 = this.field4006;
                class312 var5 = new class312();
                var5.field3996 = 1;
                var5.field4468 = (long) var2;
                var5.field3993 = var3;
                var5.field3997 = this;
                class335 var6 = class313.field4001;
                synchronized (class313.field4001) {
                    class313.field4001.method5413(var5);
                }
                class313.method5127();
                this.field4014 = var2;
            }
        }
        if (this.field4014 == -1) {
            this.field4010 = true;
        }
    }

    @ObfuscatedName("le.r(IB)I")
    public int method5161(int arg0) {
        if (this.field4032[arg0] == null) {
            return this.field4012[arg0] ? 100 : class317.method41(this.field4009, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("le.v(IS)Z")
    public boolean method5159(int arg0) {
        return this.field4012[arg0];
    }

    @ObfuscatedName("le.y(II)Z")
    public boolean method5160(int arg0) {
        return this.method5252(arg0) != null;
    }

    @ObfuscatedName("le.c(B)I")
    public int method5151() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4032.length; var3++) {
            if (this.field4024[var3] > 0) {
                var1 += 100;
                var2 += this.method5161(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
