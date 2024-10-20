package deob;

import java.util.zip.CRC32;

@ObfuscatedName("io")
public class class236 extends class234 {

    @ObfuscatedName("io.m")
    public class308 field3136;

    @ObfuscatedName("io.o")
    public class308 field3130;

    @ObfuscatedName("io.a")
    public int field3131;

    @ObfuscatedName("io.b")
    public volatile boolean field3129 = false;

    @ObfuscatedName("io.ag")
    public boolean field3133 = false;

    @ObfuscatedName("io.at")
    public volatile boolean[] field3134;

    @ObfuscatedName("io.ao")
    public static CRC32 field3135 = new CRC32();

    @ObfuscatedName("io.av")
    public int field3139;

    @ObfuscatedName("io.an")
    public int field3137;

    @ObfuscatedName("io.al")
    public int field3138 = -1;

    public class236(class308 arg0, class308 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3136 = arg0;
        this.field3130 = arg1;
        this.field3131 = arg2;
        this.field3133 = arg5;
        int var8 = this.field3131;
        if (Statics.field391 == null) {
            class237.method3659((class236) null, 255, 255, 0, (byte) 0, true);
            class237.field3158[var8] = this;
        } else {
            Statics.field391.field3696 = var8 * 8 + 5;
            int var9 = Statics.field391.method5208();
            int var10 = Statics.field391.method5208();
            this.method3938(var9, var10);
        }
    }

    @ObfuscatedName("io.dh(I)Z")
    public boolean method3944() {
        return this.field3129;
    }

    @ObfuscatedName("io.do(I)I")
    public int method3949() {
        if (this.field3129) {
            return 100;
        } else if (this.field3116 == null) {
            int var1 = this.field3131;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field3160 != null && Statics.field3160.field2096 == var2) {
                var4 = Statics.field4024.field3696 * 99 / (Statics.field4024.field3694.length - Statics.field3160.field3099) + 1;
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

    @ObfuscatedName("io.x(II)V")
    public void method3824(int arg0) {
        int var2 = this.field3131;
        long var3 = (long) ((var2 << 16) + arg0);
        class233 var5 = (class233) class237.field3145.method5524(var3);
        if (var5 != null) {
            class237.field3147.method4469(var5);
        }
    }

    @ObfuscatedName("io.e(II)V")
    public void method3919(int arg0) {
        if (this.field3136 == null || this.field3134 == null || !this.field3134[arg0]) {
            class237.method3659(this, this.field3131, arg0, this.field3109[arg0], (byte) 2, true);
        } else {
            class235.method3810(arg0, this.field3136, this);
        }
    }

    @ObfuscatedName("io.dm(III)V")
    public void method3938(int arg0, int arg1) {
        this.field3139 = arg0;
        this.field3137 = arg1;
        if (this.field3130 == null) {
            class237.method3659(this, 255, this.field3131, this.field3139, (byte) 0, true);
        } else {
            class235.method3810(this.field3131, this.field3130, this);
        }
    }

    @ObfuscatedName("io.dy(I[BZZB)V")
    public void method3939(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3129) {
                throw new RuntimeException();
            }
            if (this.field3130 != null) {
                class235.method2108(this.field3131, arg1, this.field3130);
            }
            this.method3823(arg1);
            this.method3940();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3112[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3112[arg0];
        if (this.field3136 != null) {
            class235.method2108(arg0, arg1, this.field3136);
            this.field3134[arg0] = true;
        }
        if (arg3) {
            this.field3116[arg0] = class206.method3126(arg1, false);
        }
    }

    @ObfuscatedName("io.dd(Lkx;I[BZI)V")
    public void method3945(class308 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3130 != arg0) {
            if (!arg3 && this.field3138 == arg1) {
                this.field3129 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3134[arg1] = false;
                if (this.field3133 || arg3) {
                    class237.method3659(this, this.field3131, arg1, this.field3109[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3135.reset();
            field3135.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3135.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3109[arg1] != var9 || this.field3112[arg1] != var10) {
                this.field3134[arg1] = false;
                if (this.field3133 || arg3) {
                    class237.method3659(this, this.field3131, arg1, this.field3109[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3134[arg1] = true;
            if (arg3) {
                this.field3116[arg1] = class206.method3126(arg2, false);
            }
            return;
        }
        if (this.field3129) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class237.method3659(this, 255, this.field3131, this.field3139, (byte) 0, true);
            return;
        }
        field3135.reset();
        field3135.update(arg2, 0, arg2.length);
        int var5 = (int) field3135.getValue();
        if (this.field3139 != var5) {
            class237.method3659(this, 255, this.field3131, this.field3139, (byte) 0, true);
            return;
        }
        class300 var6 = new class300(class234.method3205(arg2));
        int var7 = var6.method5103();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3131 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method5208();
        }
        if (this.field3137 != var8) {
            class237.method3659(this, 255, this.field3131, this.field3139, (byte) 0, true);
            return;
        }
        this.method3823(arg2);
        this.method3940();
    }

    @ObfuscatedName("io.dp(I)V")
    public void method3940() {
        this.field3134 = new boolean[this.field3116.length];
        for (int var1 = 0; var1 < this.field3134.length; var1++) {
            this.field3134[var1] = false;
        }
        if (this.field3136 == null) {
            this.field3129 = true;
            return;
        }
        this.field3138 = -1;
        for (int var2 = 0; var2 < this.field3134.length; var2++) {
            if (this.field3111[var2] > 0) {
                class235.method4839(var2, this.field3136, this);
                this.field3138 = var2;
            }
        }
        if (this.field3138 == -1) {
            this.field3129 = true;
        }
    }

    @ObfuscatedName("io.d(II)I")
    public int method3831(int arg0) {
        if (this.field3116[arg0] != null) {
            return 100;
        } else if (this.field3134[arg0]) {
            return 100;
        } else {
            int var2 = this.field3131;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field3160 != null && Statics.field3160.field2096 == var3) {
                var5 = Statics.field4024.field3696 * 99 / (Statics.field4024.field3694.length - Statics.field3160.field3099) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("io.dn(II)Z")
    public boolean method3958(int arg0) {
        return this.field3134[arg0];
    }

    @ObfuscatedName("io.de(II)Z")
    public boolean method3942(int arg0) {
        return this.method3836(arg0) != null;
    }

    @ObfuscatedName("io.da(B)I")
    public int method3941() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3116.length; var3++) {
            if (this.field3111[var3] > 0) {
                var1 += 100;
                var2 += this.method3831(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
