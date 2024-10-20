package deob;

import java.util.zip.CRC32;

@ObfuscatedName("id")
public class class236 extends class234 {

    @ObfuscatedName("id.h")
    public class308 field3130;

    @ObfuscatedName("id.v")
    public class308 field3140;

    @ObfuscatedName("id.m")
    public int field3139;

    @ObfuscatedName("id.o")
    public volatile boolean field3133 = false;

    @ObfuscatedName("id.av")
    public boolean field3134 = false;

    @ObfuscatedName("id.am")
    public volatile boolean[] field3138;

    @ObfuscatedName("id.ai")
    public static CRC32 field3136 = new CRC32();

    @ObfuscatedName("id.af")
    public int field3137;

    @ObfuscatedName("id.az")
    public int field3129;

    @ObfuscatedName("id.aj")
    public int field3132 = -1;

    public class236(class308 arg0, class308 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3130 = arg0;
        this.field3140 = arg1;
        this.field3139 = arg2;
        this.field3134 = arg5;
        int var8 = this.field3139;
        if (Statics.field1447 == null) {
            class237.method3157((class236) null, 255, 255, 0, (byte) 0, true);
            class237.field3159[var8] = this;
        } else {
            Statics.field1447.field3704 = var8 * 8 + 5;
            int var9 = Statics.field1447.method5056();
            int var10 = Statics.field1447.method5056();
            this.method3887(var9, var10);
        }
    }

    @ObfuscatedName("id.cs(I)Z")
    public boolean method3879() {
        return this.field3133;
    }

    @ObfuscatedName("id.co(B)I")
    public int method3880() {
        if (this.field3133) {
            return 100;
        } else if (this.field3115 == null) {
            int var1 = class237.method3167(255, this.field3139);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("id.j(II)V")
    public void method3764(int arg0) {
        int var2 = this.field3139;
        long var3 = (long) ((var2 << 16) + arg0);
        class233 var5 = (class233) class237.field3144.method5434(var3);
        if (var5 != null) {
            class237.field3152.method4395(var5);
        }
    }

    @ObfuscatedName("id.r(II)V")
    public void method3774(int arg0) {
        if (this.field3130 == null || this.field3138 == null || !this.field3138[arg0]) {
            class237.method3157(this, this.field3139, arg0, this.field3109[arg0], (byte) 2, true);
        } else {
            class235.method168(arg0, this.field3130, this);
        }
    }

    @ObfuscatedName("id.dr(IIB)V")
    public void method3887(int arg0, int arg1) {
        this.field3137 = arg0;
        this.field3129 = arg1;
        if (this.field3140 == null) {
            class237.method3157(this, 255, this.field3139, this.field3137, (byte) 0, true);
        } else {
            class235.method168(this.field3139, this.field3140, this);
        }
    }

    @ObfuscatedName("id.dd(I[BZZB)V")
    public void method3906(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3133) {
                throw new RuntimeException();
            }
            if (this.field3140 != null) {
                class235.method882(this.field3139, arg1, this.field3140);
            }
            this.method3763(arg1);
            this.method3882();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3110[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3110[arg0];
        if (this.field3130 != null) {
            class235.method882(arg0, arg1, this.field3130);
            this.field3138[arg0] = true;
        }
        if (arg3) {
            this.field3115[arg0] = class206.method3022(arg1, false);
        }
    }

    @ObfuscatedName("id.dv(Lkv;I[BZI)V")
    public void method3881(class308 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3140 != arg0) {
            if (!arg3 && this.field3132 == arg1) {
                this.field3133 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3138[arg1] = false;
                if (this.field3134 || arg3) {
                    class237.method3157(this, this.field3139, arg1, this.field3109[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3136.reset();
            field3136.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3136.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3109[arg1] != var9 || this.field3110[arg1] != var10) {
                this.field3138[arg1] = false;
                if (this.field3134 || arg3) {
                    class237.method3157(this, this.field3139, arg1, this.field3109[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3138[arg1] = true;
            if (arg3) {
                this.field3115[arg1] = class206.method3022(arg2, false);
            }
            return;
        }
        if (this.field3133) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class237.method3157(this, 255, this.field3139, this.field3137, (byte) 0, true);
            return;
        }
        field3136.reset();
        field3136.update(arg2, 0, arg2.length);
        int var5 = (int) field3136.getValue();
        if (this.field3137 != var5) {
            class237.method3157(this, 255, this.field3139, this.field3137, (byte) 0, true);
            return;
        }
        class300 var6 = new class300(class234.method1103(arg2));
        int var7 = var6.method5179();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3139 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method5056();
        }
        if (this.field3129 != var8) {
            class237.method3157(this, 255, this.field3139, this.field3137, (byte) 0, true);
            return;
        }
        this.method3763(arg2);
        this.method3882();
    }

    @ObfuscatedName("id.da(I)V")
    public void method3882() {
        this.field3138 = new boolean[this.field3115.length];
        for (int var1 = 0; var1 < this.field3138.length; var1++) {
            this.field3138[var1] = false;
        }
        if (this.field3130 == null) {
            this.field3133 = true;
            return;
        }
        this.field3132 = -1;
        for (int var2 = 0; var2 < this.field3138.length; var2++) {
            if (this.field3106[var2] > 0) {
                class235.method3160(var2, this.field3130, this);
                this.field3132 = var2;
            }
        }
        if (this.field3132 == -1) {
            this.field3133 = true;
        }
    }

    @ObfuscatedName("id.x(II)I")
    public int method3771(int arg0) {
        if (this.field3115[arg0] != null) {
            return 100;
        } else if (this.field3138[arg0]) {
            return 100;
        } else {
            int var2 = this.field3139;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field3154 != null && Statics.field3154.field2096 == var3) {
                var5 = Statics.field3156.field3704 * 99 / (Statics.field3156.field3701.length - Statics.field3154.field3098) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("id.dh(II)Z")
    public boolean method3883(int arg0) {
        return this.field3138[arg0];
    }

    @ObfuscatedName("id.dm(IB)Z")
    public boolean method3891(int arg0) {
        return this.method3770(arg0) != null;
    }

    @ObfuscatedName("id.dj(B)I")
    public int method3885() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3115.length; var3++) {
            if (this.field3106[var3] > 0) {
                var1 += 100;
                var2 += this.method3771(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
