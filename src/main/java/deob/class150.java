package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eo")
public class class150 extends class149 {

    @ObfuscatedName("eo.a")
    public class123 field2484;

    @ObfuscatedName("eo.d")
    public class123 field2477;

    @ObfuscatedName("eo.m")
    public int field2476;

    @ObfuscatedName("eo.q")
    public volatile boolean field2482 = false;

    @ObfuscatedName("eo.e")
    public boolean field2475 = false;

    @ObfuscatedName("eo.t")
    public volatile boolean[] field2479;

    @ObfuscatedName("eo.o")
    public static CRC32 field2480 = new CRC32();

    @ObfuscatedName("eo.at")
    public int field2481;

    @ObfuscatedName("eo.ag")
    public int field2486;

    @ObfuscatedName("eo.ae")
    public int field2483 = -1;

    public class150(class123 arg0, class123 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2484 = arg0;
        this.field2477 = arg1;
        this.field2476 = arg2;
        this.field2475 = arg5;
        int var8 = this.field2476;
        if (Statics.field616 == null) {
            class153.method2725((class150) null, 255, 255, 0, (byte) 0, true);
            class153.field2514[var8] = this;
        } else {
            Statics.field616.field1826 = var8 * 8 + 5;
            int var9 = Statics.field616.method2144();
            int var10 = Statics.field616.method2144();
            this.method2821(var9, var10);
        }
    }

    @ObfuscatedName("eo.bl(B)I")
    public int method2827() {
        if (this.field2482) {
            return 100;
        } else if (this.field2461 == null) {
            int var1 = this.field2476;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field696 != null && Statics.field696.field2886 == var2) {
                var4 = Statics.field2513.field1826 * 99 / (Statics.field2513.field1830.length - Statics.field696.field2522) + 1;
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

    @ObfuscatedName("eo.j(IB)V")
    public void method2745(int arg0) {
        class153.method2061(this.field2476, arg0);
    }

    @ObfuscatedName("eo.i(IB)V")
    public void method2775(int arg0) {
        if (this.field2484 == null || this.field2479 == null || !this.field2479[arg0]) {
            class153.method2725(this, this.field2476, arg0, this.field2455[arg0], (byte) 2, true);
        } else {
            class152.method2390(arg0, this.field2484, this);
        }
    }

    @ObfuscatedName("eo.bd(IIB)V")
    public void method2821(int arg0, int arg1) {
        this.field2481 = arg0;
        this.field2486 = arg1;
        if (this.field2477 == null) {
            class153.method2725(this, 255, this.field2476, this.field2481, (byte) 0, true);
        } else {
            class152.method2390(this.field2476, this.field2477, this);
        }
    }

    @ObfuscatedName("eo.cg(I[BZZI)V")
    public void method2819(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2482) {
                throw new RuntimeException();
            }
            if (this.field2477 != null) {
                class152.method756(this.field2476, arg1, this.field2477);
            }
            this.method2815(arg1);
            this.method2823();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2456[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2456[arg0];
        if (this.field2484 != null) {
            class152.method756(arg0, arg1, this.field2484);
            this.field2479[arg0] = true;
        }
        if (arg3) {
            this.field2461[arg0] = class114.method755(arg1, false);
        }
    }

    @ObfuscatedName("eo.ck(Ldt;I[BZI)V")
    public void method2822(class123 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2477 != arg0) {
            if (!arg3 && this.field2483 == arg1) {
                this.field2482 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2479[arg1] = false;
                if (this.field2475 || arg3) {
                    class153.method2725(this, this.field2476, arg1, this.field2455[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2480.reset();
            field2480.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2480.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2455[arg1] != var9 || this.field2456[arg1] != var10) {
                this.field2479[arg1] = false;
                if (this.field2475 || arg3) {
                    class153.method2725(this, this.field2476, arg1, this.field2455[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2479[arg1] = true;
            if (arg3) {
                this.field2461[arg1] = class114.method755(arg2, false);
            }
            return;
        }
        if (this.field2482) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class153.method2725(this, 255, this.field2476, this.field2481, (byte) 0, true);
            return;
        }
        field2480.reset();
        field2480.update(arg2, 0, arg2.length);
        int var5 = (int) field2480.getValue();
        class108 var6 = new class108(class149.method1414(arg2));
        int var7 = var6.method2134();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2476 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2144();
        }
        if (this.field2481 != var5 || this.field2486 != var8) {
            class153.method2725(this, 255, this.field2476, this.field2481, (byte) 0, true);
            return;
        }
        this.method2815(arg2);
        this.method2823();
    }

    @ObfuscatedName("eo.cu(I)V")
    public void method2823() {
        this.field2479 = new boolean[this.field2461.length];
        for (int var1 = 0; var1 < this.field2479.length; var1++) {
            this.field2479[var1] = false;
        }
        if (this.field2484 == null) {
            this.field2482 = true;
            return;
        }
        this.field2483 = -1;
        for (int var2 = 0; var2 < this.field2479.length; var2++) {
            if (this.field2457[var2] > 0) {
                class152.method886(var2, this.field2484, this);
                this.field2483 = var2;
            }
        }
        if (this.field2483 == -1) {
            this.field2482 = true;
        }
    }

    @ObfuscatedName("eo.cd(IB)I")
    public int method2824(int arg0) {
        if (this.field2461[arg0] != null) {
            return 100;
        } else if (this.field2479[arg0]) {
            return 100;
        } else {
            int var2 = this.field2476;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field696 != null && Statics.field696.field2886 == var3) {
                var5 = Statics.field2513.field1826 * 99 / (Statics.field2513.field1830.length - Statics.field696.field2522) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("eo.ci(I)I")
    public int method2825() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2461.length; var3++) {
            if (this.field2457[var3] > 0) {
                var1 += 100;
                var2 += this.method2824(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
