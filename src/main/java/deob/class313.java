package deob;

import java.util.zip.CRC32;

@ObfuscatedName("lc")
public class class313 extends class315 {

    @ObfuscatedName("lc.e")
    public class381 field3981;

    @ObfuscatedName("lc.g")
    public class381 field3988;

    @ObfuscatedName("lc.w")
    public int field3983;

    @ObfuscatedName("lc.y")
    public volatile int field3982 = 0;

    @ObfuscatedName("lc.i")
    public boolean field3980 = false;

    @ObfuscatedName("lc.s")
    public volatile boolean[] field3986;

    @ObfuscatedName("lc.t")
    public static CRC32 field3987 = new CRC32();

    @ObfuscatedName("lc.z")
    public int field3977;

    @ObfuscatedName("lc.r")
    public int field3989;

    @ObfuscatedName("lc.u")
    public int field3990 = -1;

    @ObfuscatedName("lc.k")
    public boolean field3991 = false;

    public class313(class381 arg0, class381 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        super(arg3, arg4);
        this.field3981 = arg0;
        this.field3988 = arg1;
        this.field3983 = arg2;
        this.field3980 = arg5;
        this.field3991 = arg6;
        class316.method2288(this, this.field3983);
    }

    @ObfuscatedName("lc.c(I)Z")
    public boolean method5250() {
        return this.field3982 == 1;
    }

    @ObfuscatedName("lc.v(I)I")
    public int method5251() {
        if (this.field3982 == 1 || this.field3991 && this.field3982 == 2) {
            return 100;
        } else if (this.field4011 == null) {
            int var1 = this.field3983;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field4327 != null && Statics.field4327.field4462 == var2) {
                var4 = Statics.field827.field4700 * 99 / (Statics.field827.field4701.length - Statics.field4327.field3994) + 1;
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

    @ObfuscatedName("lc.q(IB)V")
    public void method5252(int arg0) {
        Statics.method3483(this.field3983, arg0);
    }

    @ObfuscatedName("lc.f(IB)V")
    public void method5249(int arg0) {
        if (this.field3981 == null || this.field3986 == null || !this.field3986[arg0]) {
            class316.method2838(this, this.field3983, arg0, this.field4001[arg0], (byte) 2, true);
        } else {
            class312.method4706(arg0, this.field3981, this);
        }
    }

    @ObfuscatedName("lc.j(I)V")
    public void method5277() {
        this.field3982 = 2;
        this.field3998 = new int[0];
        this.field4001 = new int[0];
        this.field4002 = new int[0];
        this.field3997 = new int[0];
        this.field4004 = new int[0][];
        this.field4011 = new Object[0];
        this.field4003 = new Object[0][];
    }

    @ObfuscatedName("lc.e(IIB)V")
    public void method5255(int arg0, int arg1) {
        this.field3977 = arg0;
        this.field3989 = arg1;
        if (this.field3988 == null) {
            class316.method2838(this, 255, this.field3983, this.field3977, (byte) 0, true);
        } else {
            class312.method4706(this.field3983, this.field3988, this);
        }
    }

    @ObfuscatedName("lc.g(I[BZZI)V")
    public void method5256(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3982 == 1) {
                throw new RuntimeException();
            }
            if (this.field3988 != null) {
                class312.method6898(this.field3983, arg1, this.field3988);
            }
            this.method5300(arg1);
            this.method5258();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field4002[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field4002[arg0];
        if (this.field3981 != null) {
            class312.method6898(arg0, arg1, this.field3981);
            this.field3986[arg0] = true;
        }
        if (arg3) {
            this.field4011[arg0] = class283.method4271(arg1, false);
        }
    }

    @ObfuscatedName("lc.w(Lnd;I[BZI)V")
    public void method5257(class381 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3988 != arg0) {
            if (!arg3 && this.field3990 == arg1) {
                this.field3982 = 1;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3986[arg1] = false;
                if (this.field3980 || arg3) {
                    class316.method2838(this, this.field3983, arg1, this.field4001[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3987.reset();
            field3987.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3987.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field4001[arg1] != var9 || this.field4002[arg1] != var10) {
                this.field3986[arg1] = false;
                if (this.field3980 || arg3) {
                    class316.method2838(this, this.field3983, arg1, this.field4001[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3986[arg1] = true;
            if (arg3) {
                this.field4011[arg1] = class283.method4271(arg2, false);
            }
            return;
        }
        if (this.field3982 == 1) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class316.method2838(this, 255, this.field3983, this.field3977, (byte) 0, true);
            return;
        }
        field3987.reset();
        field3987.update(arg2, 0, arg2.length);
        int var5 = (int) field3987.getValue();
        if (this.field3977 != var5) {
            class316.method2838(this, 255, this.field3983, this.field3977, (byte) 0, true);
            return;
        }
        class443 var6 = new class443(class315.method710(arg2));
        int var7 = var6.method7047();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3983 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method7052();
        }
        if (this.field3989 != var8) {
            class316.method2838(this, 255, this.field3983, this.field3977, (byte) 0, true);
            return;
        }
        this.method5300(arg2);
        this.method5258();
    }

    @ObfuscatedName("lc.y(I)V")
    public void method5258() {
        this.field3986 = new boolean[this.field4011.length];
        for (int var1 = 0; var1 < this.field3986.length; var1++) {
            this.field3986[var1] = false;
        }
        if (this.field3981 == null) {
            this.field3982 = 1;
            return;
        }
        this.field3990 = -1;
        for (int var2 = 0; var2 < this.field3986.length; var2++) {
            if (this.field3997[var2] > 0) {
                class312.method5225(var2, this.field3981, this);
                this.field3990 = var2;
            }
        }
        if (this.field3990 == -1) {
            this.field3982 = 1;
        }
    }

    @ObfuscatedName("lc.i(II)I")
    public int method5264(int arg0) {
        if (this.field4011[arg0] != null) {
            return 100;
        } else if (this.field3986[arg0]) {
            return 100;
        } else {
            int var2 = this.field3983;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field4327 != null && Statics.field4327.field4462 == var3) {
                var5 = Statics.field827.field4700 * 99 / (Statics.field827.field4701.length - Statics.field4327.field3994) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("lc.s(II)Z")
    public boolean method5260(int arg0) {
        return this.field3986[arg0];
    }

    @ObfuscatedName("lc.t(II)Z")
    public boolean method5261(int arg0) {
        return this.method5309(arg0) != null;
    }

    @ObfuscatedName("lc.z(I)I")
    public int method5262() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4011.length; var3++) {
            if (this.field3997[var3] > 0) {
                var1 += 100;
                var2 += this.method5264(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
