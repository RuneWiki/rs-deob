package deob;

import java.util.zip.CRC32;

@ObfuscatedName("it")
public class class256 extends class254 {

    @ObfuscatedName("it.u")
    public class170 field3258;

    @ObfuscatedName("it.e")
    public class170 field3256;

    @ObfuscatedName("it.w")
    public int field3252;

    @ObfuscatedName("it.q")
    public volatile boolean field3253 = false;

    @ObfuscatedName("it.aa")
    public boolean field3254 = false;

    @ObfuscatedName("it.ai")
    public volatile boolean[] field3251;

    @ObfuscatedName("it.ag")
    public static CRC32 field3250 = new CRC32();

    @ObfuscatedName("it.at")
    public int field3257;

    @ObfuscatedName("it.ad")
    public int field3259;

    @ObfuscatedName("it.as")
    public int field3255 = -1;

    public class256(class170 arg0, class170 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3258 = arg0;
        this.field3256 = arg1;
        this.field3252 = arg2;
        this.field3254 = arg5;
        Statics.method1875(this, this.field3252);
    }

    @ObfuscatedName("it.cq(I)Z")
    public boolean method4566() {
        return this.field3253;
    }

    @ObfuscatedName("it.ck(I)I")
    public int method4561() {
        if (this.field3253) {
            return 100;
        } else if (this.field3235 == null) {
            int var1 = this.field3252;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field3269 != null && Statics.field3269.field2502 == var2) {
                var4 = Statics.field2864.field2423 * 99 / (Statics.field2864.field2424.length - Statics.field3269.field3223) + 1;
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

    @ObfuscatedName("it.h(II)V")
    public void method4526(int arg0) {
        class257.method150(this.field3252, arg0);
    }

    @ObfuscatedName("it.v(IB)V")
    public void method4464(int arg0) {
        if (this.field3258 == null || this.field3251 == null || !this.field3251[arg0]) {
            class257.method1934(this, this.field3252, arg0, this.field3237[arg0], (byte) 2, true);
        } else {
            class255.method482(arg0, this.field3258, this);
        }
    }

    @ObfuscatedName("it.cg(III)V")
    public void method4562(int arg0, int arg1) {
        this.field3257 = arg0;
        this.field3259 = arg1;
        if (this.field3256 == null) {
            class257.method1934(this, 255, this.field3252, this.field3257, (byte) 0, true);
        } else {
            class255.method482(this.field3252, this.field3256, this);
        }
    }

    @ObfuscatedName("it.cc(I[BZZI)V")
    public void method4569(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3253) {
                throw new RuntimeException();
            }
            if (this.field3256 != null) {
                class255.method3068(this.field3252, arg1, this.field3256);
            }
            this.method4511(arg1);
            this.method4589();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3224[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3224[arg0];
        if (this.field3258 != null) {
            class255.method3068(arg0, arg1, this.field3258);
            this.field3251[arg0] = true;
        }
        if (arg3) {
            this.field3235[arg0] = class194.method945(arg1, false);
        }
    }

    @ObfuscatedName("it.dl(Lfy;I[BZI)V")
    public void method4564(class170 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3256 != arg0) {
            if (!arg3 && this.field3255 == arg1) {
                this.field3253 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3251[arg1] = false;
                if (this.field3254 || arg3) {
                    class257.method1934(this, this.field3252, arg1, this.field3237[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3250.reset();
            field3250.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3250.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3237[arg1] != var9 || this.field3224[arg1] != var10) {
                this.field3251[arg1] = false;
                if (this.field3254 || arg3) {
                    class257.method1934(this, this.field3252, arg1, this.field3237[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3251[arg1] = true;
            if (arg3) {
                this.field3235[arg1] = class194.method945(arg2, false);
            }
            return;
        }
        if (this.field3253) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class257.method1934(this, 255, this.field3252, this.field3257, (byte) 0, true);
            return;
        }
        field3250.reset();
        field3250.update(arg2, 0, arg2.length);
        int var5 = (int) field3250.getValue();
        if (this.field3257 != var5) {
            class257.method1934(this, 255, this.field3252, this.field3257, (byte) 0, true);
            return;
        }
        class190 var6 = new class190(class254.method3174(arg2));
        int var7 = var6.method3511();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3252 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3562();
        }
        if (this.field3259 != var8) {
            class257.method1934(this, 255, this.field3252, this.field3257, (byte) 0, true);
            return;
        }
        this.method4511(arg2);
        this.method4589();
    }

    @ObfuscatedName("it.di(I)V")
    public void method4589() {
        this.field3251 = new boolean[this.field3235.length];
        for (int var1 = 0; var1 < this.field3251.length; var1++) {
            this.field3251[var1] = false;
        }
        if (this.field3258 == null) {
            this.field3253 = true;
            return;
        }
        this.field3255 = -1;
        for (int var2 = 0; var2 < this.field3251.length; var2++) {
            if (this.field3231[var2] > 0) {
                class255.method5231(var2, this.field3258, this);
                this.field3255 = var2;
            }
        }
        if (this.field3255 == -1) {
            this.field3253 = true;
        }
    }

    @ObfuscatedName("it.j(II)I")
    public int method4541(int arg0) {
        if (this.field3235[arg0] != null) {
            return 100;
        } else if (this.field3251[arg0]) {
            return 100;
        } else {
            int var2 = this.field3252;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field3269 != null && Statics.field3269.field2502 == var3) {
                var5 = Statics.field2864.field2423 * 99 / (Statics.field2864.field2424.length - Statics.field3269.field3223) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("it.dh(IB)Z")
    public boolean method4591(int arg0) {
        return this.field3251[arg0];
    }

    @ObfuscatedName("it.db(II)Z")
    public boolean method4567(int arg0) {
        return this.method4465(arg0) != null;
    }

    @ObfuscatedName("it.dg(I)I")
    public int method4560() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3235.length; var3++) {
            if (this.field3231[var3] > 0) {
                var1 += 100;
                var2 += this.method4541(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
