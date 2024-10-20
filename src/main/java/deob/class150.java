package deob;

import java.util.zip.CRC32;

@ObfuscatedName("es")
public class class150 extends class149 {

    @ObfuscatedName("es.l")
    public class123 field2493;

    @ObfuscatedName("es.m")
    public class123 field2488;

    @ObfuscatedName("es.q")
    public int field2490;

    @ObfuscatedName("es.h")
    public volatile boolean field2492 = false;

    @ObfuscatedName("es.c")
    public boolean field2501 = false;

    @ObfuscatedName("es.z")
    public volatile boolean[] field2489;

    @ObfuscatedName("es.i")
    public static CRC32 field2494 = new CRC32();

    @ObfuscatedName("es.ah")
    public int field2495;

    @ObfuscatedName("es.aj")
    public int field2496;

    @ObfuscatedName("es.ar")
    public int field2497 = -1;

    public class150(class123 arg0, class123 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2493 = arg0;
        this.field2488 = arg1;
        this.field2490 = arg2;
        this.field2501 = arg5;
        int var8 = this.field2490;
        if (Statics.field13 == null) {
            class153.method3203((class150) null, 255, 255, 0, (byte) 0, true);
            class153.field2528[var8] = this;
        } else {
            Statics.field13.field1859 = var8 * 8 + 5;
            int var9 = Statics.field13.method2256();
            int var10 = Statics.field13.method2256();
            this.method2855(var9, var10);
        }
    }

    @ObfuscatedName("es.ch(I)I")
    public int method2863() {
        if (this.field2492) {
            return 100;
        } else if (this.field2480 == null) {
            int var1 = class153.method166(255, this.field2490);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("es.k(II)V")
    public void method2762(int arg0) {
        int var2 = this.field2490;
        long var3 = (long) ((var2 << 16) + arg0);
        class154 var5 = (class154) class153.field2525.method3244(var3);
        if (var5 != null) {
            class153.field2524.method3329(var5);
        }
    }

    @ObfuscatedName("es.p(II)V")
    public void method2771(int arg0) {
        if (this.field2493 == null || this.field2489 == null || !this.field2489[arg0]) {
            class153.method3203(this, this.field2490, arg0, this.field2487[arg0], (byte) 2, true);
        } else {
            class152.method1063(arg0, this.field2493, this);
        }
    }

    @ObfuscatedName("es.ct(IIB)V")
    public void method2855(int arg0, int arg1) {
        this.field2495 = arg0;
        this.field2496 = arg1;
        if (this.field2488 == null) {
            class153.method3203(this, 255, this.field2490, this.field2495, (byte) 0, true);
        } else {
            class152.method1063(this.field2490, this.field2488, this);
        }
    }

    @ObfuscatedName("es.ck(I[BZZB)V")
    public void method2844(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2492) {
                throw new RuntimeException();
            }
            if (this.field2488 != null) {
                class152.method2393(this.field2490, arg1, this.field2488);
            }
            this.method2761(arg1);
            this.method2846();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2470[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2470[arg0];
        if (this.field2493 != null) {
            class152.method2393(arg0, arg1, this.field2493);
            this.field2489[arg0] = true;
        }
        if (arg3) {
            this.field2480[arg0] = class114.method564(arg1, false);
        }
    }

    @ObfuscatedName("es.cn(Ldw;I[BZB)V")
    public void method2845(class123 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2488 != arg0) {
            if (!arg3 && this.field2497 == arg1) {
                this.field2492 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2489[arg1] = false;
                if (this.field2501 || arg3) {
                    class153.method3203(this, this.field2490, arg1, this.field2487[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2494.reset();
            field2494.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2494.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2487[arg1] != var9 || this.field2470[arg1] != var10) {
                this.field2489[arg1] = false;
                if (this.field2501 || arg3) {
                    class153.method3203(this, this.field2490, arg1, this.field2487[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2489[arg1] = true;
            if (arg3) {
                this.field2480[arg1] = class114.method564(arg2, false);
            }
            return;
        }
        if (this.field2492) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class153.method3203(this, 255, this.field2490, this.field2495, (byte) 0, true);
            return;
        }
        field2494.reset();
        field2494.update(arg2, 0, arg2.length);
        int var5 = (int) field2494.getValue();
        class108 var6 = new class108(class149.method2735(arg2));
        int var7 = var6.method2158();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2490 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2256();
        }
        if (this.field2495 != var5 || this.field2496 != var8) {
            class153.method3203(this, 255, this.field2490, this.field2495, (byte) 0, true);
            return;
        }
        this.method2761(arg2);
        this.method2846();
    }

    @ObfuscatedName("es.cr(I)V")
    public void method2846() {
        this.field2489 = new boolean[this.field2480.length];
        for (int var1 = 0; var1 < this.field2489.length; var1++) {
            this.field2489[var1] = false;
        }
        if (this.field2493 == null) {
            this.field2492 = true;
            return;
        }
        this.field2497 = -1;
        for (int var2 = 0; var2 < this.field2489.length; var2++) {
            if (this.field2476[var2] > 0) {
                class152.method678(var2, this.field2493, this);
                this.field2497 = var2;
            }
        }
        if (this.field2497 == -1) {
            this.field2492 = true;
        }
    }

    @ObfuscatedName("es.ca(II)I")
    public int method2860(int arg0) {
        if (this.field2480[arg0] == null) {
            return this.field2489[arg0] ? 100 : class153.method166(this.field2490, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("es.cq(I)I")
    public int method2847() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2480.length; var3++) {
            if (this.field2476[var3] > 0) {
                var1 += 100;
                var2 += this.method2860(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
