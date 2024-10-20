package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ix")
public class class238 extends class236 {

    @ObfuscatedName("ix.q")
    public class161 field3214;

    @ObfuscatedName("ix.f")
    public class161 field3220;

    @ObfuscatedName("ix.j")
    public int field3213;

    @ObfuscatedName("ix.n")
    public volatile boolean field3212 = false;

    @ObfuscatedName("ix.z")
    public boolean field3215 = false;

    @ObfuscatedName("ix.b")
    public volatile boolean[] field3216;

    @ObfuscatedName("ix.d")
    public static CRC32 field3217 = new CRC32();

    @ObfuscatedName("ix.ap")
    public int field3218;

    @ObfuscatedName("ix.aj")
    public int field3219;

    @ObfuscatedName("ix.am")
    public int field3221 = -1;

    public class238(class161 arg0, class161 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3214 = arg0;
        this.field3220 = arg1;
        this.field3213 = arg2;
        this.field3215 = arg5;
        int var8 = this.field3213;
        if (Statics.field621 == null) {
            class239.method3698((class238) null, 255, 255, 0, (byte) 0, true);
            class239.field3243[var8] = this;
        } else {
            Statics.field621.field2357 = var8 * 8 + 5;
            int var9 = Statics.field621.method2987();
            int var10 = Statics.field621.method2987();
            this.method3826(var9, var10);
        }
    }

    @ObfuscatedName("ix.cx(I)I")
    public int method3838() {
        if (this.field3212) {
            return 100;
        } else if (this.field3193 == null) {
            int var1 = class239.method941(255, this.field3213);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ix.o(IB)V")
    public void method3784(int arg0) {
        class239.method597(this.field3213, arg0);
    }

    @ObfuscatedName("ix.w(IB)V")
    public void method3723(int arg0) {
        if (this.field3214 == null || this.field3216 == null || !this.field3216[arg0]) {
            class239.method3698(this, this.field3213, arg0, this.field3187[arg0], (byte) 2, true);
        } else {
            Statics.method609(arg0, this.field3214, this);
        }
    }

    @ObfuscatedName("ix.du(III)V")
    public void method3826(int arg0, int arg1) {
        this.field3218 = arg0;
        this.field3219 = arg1;
        if (this.field3220 == null) {
            class239.method3698(this, 255, this.field3213, this.field3218, (byte) 0, true);
        } else {
            Statics.method609(this.field3213, this.field3220, this);
        }
    }

    @ObfuscatedName("ix.dc(I[BZZI)V")
    public void method3827(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3212) {
                throw new RuntimeException();
            }
            if (this.field3220 != null) {
                class237.method523(this.field3213, arg1, this.field3220);
            }
            this.method3810(arg1);
            this.method3824();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3188[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3188[arg0];
        if (this.field3214 != null) {
            class237.method523(arg0, arg1, this.field3214);
            this.field3216[arg0] = true;
        }
        if (arg3) {
            this.field3193[arg0] = class177.method2607(arg1, false);
        }
    }

    @ObfuscatedName("ix.dp(Lfz;I[BZI)V")
    public void method3828(class161 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3220 != arg0) {
            if (!arg3 && this.field3221 == arg1) {
                this.field3212 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3216[arg1] = false;
                if (this.field3215 || arg3) {
                    class239.method3698(this, this.field3213, arg1, this.field3187[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3217.reset();
            field3217.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3217.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3187[arg1] != var9 || this.field3188[arg1] != var10) {
                this.field3216[arg1] = false;
                if (this.field3215 || arg3) {
                    class239.method3698(this, this.field3213, arg1, this.field3187[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3216[arg1] = true;
            if (arg3) {
                this.field3193[arg1] = class177.method2607(arg2, false);
            }
            return;
        }
        if (this.field3212) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class239.method3698(this, 255, this.field3213, this.field3218, (byte) 0, true);
            return;
        }
        field3217.reset();
        field3217.update(arg2, 0, arg2.length);
        int var5 = (int) field3217.getValue();
        class174 var6 = new class174(class236.method2110(arg2));
        int var7 = var6.method2843();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3213 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2987();
        }
        if (this.field3218 != var5 || this.field3219 != var8) {
            class239.method3698(this, 255, this.field3213, this.field3218, (byte) 0, true);
            return;
        }
        this.method3810(arg2);
        this.method3824();
    }

    @ObfuscatedName("ix.dm(I)V")
    public void method3824() {
        this.field3216 = new boolean[this.field3193.length];
        for (int var1 = 0; var1 < this.field3216.length; var1++) {
            this.field3216[var1] = false;
        }
        if (this.field3214 == null) {
            this.field3212 = true;
            return;
        }
        this.field3221 = -1;
        for (int var2 = 0; var2 < this.field3216.length; var2++) {
            if (this.field3189[var2] > 0) {
                class237.method952(var2, this.field3214, this);
                this.field3221 = var2;
            }
        }
        if (this.field3221 == -1) {
            this.field3212 = true;
        }
    }

    @ObfuscatedName("ix.x(IB)I")
    public int method3765(int arg0) {
        if (this.field3193[arg0] == null) {
            return this.field3216[arg0] ? 100 : class239.method941(this.field3213, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ix.dn(B)I")
    public int method3829() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3193.length; var3++) {
            if (this.field3189[var3] > 0) {
                var1 += 100;
                var2 += this.method3765(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
