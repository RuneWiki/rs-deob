package deob;

import java.util.zip.CRC32;

@ObfuscatedName("lx")
public class class314 extends class316 {

    @ObfuscatedName("lx.i")
    public class381 field3959;

    @ObfuscatedName("lx.f")
    public class381 field3951;

    @ObfuscatedName("lx.b")
    public int field3950;

    @ObfuscatedName("lx.n")
    public volatile boolean field3953 = false;

    @ObfuscatedName("lx.s")
    public boolean field3954 = false;

    @ObfuscatedName("lx.l")
    public volatile boolean[] field3955;

    @ObfuscatedName("lx.q")
    public static CRC32 field3956 = new CRC32();

    @ObfuscatedName("lx.o")
    public int field3957;

    @ObfuscatedName("lx.r")
    public int field3958;

    @ObfuscatedName("lx.p")
    public int field3948 = -1;

    public class314(class381 arg0, class381 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3959 = arg0;
        this.field3951 = arg1;
        this.field3950 = arg2;
        this.field3954 = arg5;
        int var8 = this.field3950;
        if (Statics.field3258 == null) {
            class317.method5502((class314) null, 255, 255, 0, (byte) 0, true);
            class317.field3995[var8] = this;
        } else {
            Statics.field3258.field4621 = var8 * 8 + 5;
            int var9 = Statics.field3258.method6976();
            int var10 = Statics.field3258.method6976();
            this.method5279(var9, var10);
        }
    }

    @ObfuscatedName("lx.v(I)Z")
    public boolean method5250() {
        return this.field3953;
    }

    @ObfuscatedName("lx.c(B)I")
    public int method5251() {
        if (this.field3953) {
            return 100;
        } else if (this.field3971 == null) {
            int var1 = this.field3950;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field3157 != null && Statics.field3157.field4410 == var2) {
                var4 = Statics.field2198.field4621 * 99 / (Statics.field2198.field4618.length - Statics.field3157.field3962) + 1;
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

    @ObfuscatedName("lx.i(II)V")
    public void method5252(int arg0) {
        class317.method1887(this.field3950, arg0);
    }

    @ObfuscatedName("lx.f(IB)V")
    public void method5253(int arg0) {
        if (this.field3959 == null || this.field3955 == null || !this.field3955[arg0]) {
            class317.method5502(this, this.field3950, arg0, this.field3970[arg0], (byte) 2, true);
        } else {
            class313.method251(arg0, this.field3959, this);
        }
    }

    @ObfuscatedName("lx.b(III)V")
    public void method5279(int arg0, int arg1) {
        this.field3957 = arg0;
        this.field3958 = arg1;
        if (this.field3951 == null) {
            class317.method5502(this, 255, this.field3950, this.field3957, (byte) 0, true);
        } else {
            class313.method251(this.field3950, this.field3951, this);
        }
    }

    @ObfuscatedName("lx.n(I[BZZI)V")
    public void method5274(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3969[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3969[arg0];
            if (this.field3959 != null) {
                class381 var10 = this.field3959;
                class312 var11 = new class312();
                var11.field3933 = 0;
                var11.field4410 = (long) arg0;
                var11.field3937 = arg1;
                var11.field3934 = var10;
                class335 var12 = class313.field3941;
                synchronized (class313.field3941) {
                    class313.field3941.method5530(var11);
                }
                class313.method2281();
                this.field3955[arg0] = true;
            }
            if (arg3) {
                this.field3971[arg0] = class284.method1992(arg1, false);
            }
            return;
        }
        if (this.field3953) {
            throw new RuntimeException();
        }
        if (this.field3951 != null) {
            int var5 = this.field3950;
            class381 var6 = this.field3951;
            class312 var7 = new class312();
            var7.field3933 = 0;
            var7.field4410 = (long) var5;
            var7.field3937 = arg1;
            var7.field3934 = var6;
            class335 var8 = class313.field3941;
            synchronized (class313.field3941) {
                class313.field3941.method5530(var7);
            }
            class313.method2281();
        }
        this.method5294(arg1);
        this.method5256();
    }

    @ObfuscatedName("lx.s(Lnw;I[BZB)V")
    public void method5255(class381 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3951 != arg0) {
            if (!arg3 && this.field3948 == arg1) {
                this.field3953 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3955[arg1] = false;
                if (this.field3954 || arg3) {
                    class317.method5502(this, this.field3950, arg1, this.field3970[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3956.reset();
            field3956.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3956.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3970[arg1] != var9 || this.field3969[arg1] != var10) {
                this.field3955[arg1] = false;
                if (this.field3954 || arg3) {
                    class317.method5502(this, this.field3950, arg1, this.field3970[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3955[arg1] = true;
            if (arg3) {
                this.field3971[arg1] = class284.method1992(arg2, false);
            }
            return;
        }
        if (this.field3953) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class317.method5502(this, 255, this.field3950, this.field3957, (byte) 0, true);
            return;
        }
        field3956.reset();
        field3956.update(arg2, 0, arg2.length);
        int var5 = (int) field3956.getValue();
        if (this.field3957 != var5) {
            class317.method5502(this, 255, this.field3950, this.field3957, (byte) 0, true);
            return;
        }
        class438 var6 = new class438(class316.method2067(arg2));
        int var7 = var6.method6971();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3950 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method6976();
        }
        if (this.field3958 != var8) {
            class317.method5502(this, 255, this.field3950, this.field3957, (byte) 0, true);
            return;
        }
        this.method5294(arg2);
        this.method5256();
    }

    @ObfuscatedName("lx.l(B)V")
    public void method5256() {
        this.field3955 = new boolean[this.field3971.length];
        for (int var1 = 0; var1 < this.field3955.length; var1++) {
            this.field3955[var1] = false;
        }
        if (this.field3959 == null) {
            this.field3953 = true;
            return;
        }
        this.field3948 = -1;
        for (int var2 = 0; var2 < this.field3955.length; var2++) {
            if (this.field3966[var2] > 0) {
                class381 var3 = this.field3959;
                class312 var5 = new class312();
                var5.field3933 = 1;
                var5.field4410 = (long) var2;
                var5.field3934 = var3;
                var5.field3932 = this;
                class335 var6 = class313.field3941;
                synchronized (class313.field3941) {
                    class313.field3941.method5530(var5);
                }
                class313.method2281();
                this.field3948 = var2;
            }
        }
        if (this.field3948 == -1) {
            this.field3953 = true;
        }
    }

    @ObfuscatedName("lx.q(II)I")
    public int method5257(int arg0) {
        if (this.field3971[arg0] != null) {
            return 100;
        } else if (this.field3955[arg0]) {
            return 100;
        } else {
            int var2 = this.field3950;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field3157 != null && Statics.field3157.field4410 == var3) {
                var5 = Statics.field2198.field4621 * 99 / (Statics.field2198.field4618.length - Statics.field3157.field3962) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("lx.o(II)Z")
    public boolean method5249(int arg0) {
        return this.field3955[arg0];
    }

    @ObfuscatedName("lx.r(II)Z")
    public boolean method5259(int arg0) {
        return this.method5304(arg0) != null;
    }

    @ObfuscatedName("lx.p(B)I")
    public int method5260() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3971.length; var3++) {
            if (this.field3966[var3] > 0) {
                var1 += 100;
                var2 += this.method5257(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
