package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ex")
public class class150 extends class149 {

    @ObfuscatedName("ex.e")
    public class123 field2462;

    @ObfuscatedName("ex.h")
    public class123 field2460;

    @ObfuscatedName("ex.k")
    public int field2461;

    @ObfuscatedName("ex.v")
    public volatile boolean field2459 = false;

    @ObfuscatedName("ex.m")
    public boolean field2463 = false;

    @ObfuscatedName("ex.d")
    public volatile boolean[] field2464;

    @ObfuscatedName("ex.q")
    public static CRC32 field2465 = new CRC32();

    @ObfuscatedName("ex.ak")
    public int field2470;

    @ObfuscatedName("ex.ah")
    public int field2468;

    @ObfuscatedName("ex.an")
    public int field2469 = -1;

    public class150(class123 arg0, class123 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2462 = arg0;
        this.field2460 = arg1;
        this.field2461 = arg2;
        this.field2463 = arg5;
        int var8 = this.field2461;
        if (Statics.field2899 == null) {
            class153.method2342((class150) null, 255, 255, 0, (byte) 0, true);
            class153.field2499[var8] = this;
        } else {
            Statics.field2899.field1823 = var8 * 8 + 5;
            int var9 = Statics.field2899.method2297();
            int var10 = Statics.field2899.method2297();
            this.method2824(var9, var10);
        }
    }

    @ObfuscatedName("ex.bq(I)I")
    public int method2820() {
        if (this.field2459) {
            return 100;
        } else if (this.field2454 == null) {
            int var1 = class153.method2592(255, this.field2461);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ex.y(II)V")
    public void method2749(int arg0) {
        class153.method140(this.field2461, arg0);
    }

    @ObfuscatedName("ex.p(II)V")
    public void method2813(int arg0) {
        if (this.field2462 == null || this.field2464 == null || !this.field2464[arg0]) {
            class153.method2342(this, this.field2461, arg0, this.field2444[arg0], (byte) 2, true);
        } else {
            class152.method2724(arg0, this.field2462, this);
        }
    }

    @ObfuscatedName("ex.bp(III)V")
    public void method2824(int arg0, int arg1) {
        this.field2470 = arg0;
        this.field2468 = arg1;
        if (this.field2460 == null) {
            class153.method2342(this, 255, this.field2461, this.field2470, (byte) 0, true);
        } else {
            class152.method2724(this.field2461, this.field2460, this);
        }
    }

    @ObfuscatedName("ex.bw(I[BZZI)V")
    public void method2823(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2459) {
                throw new RuntimeException();
            }
            if (this.field2460 != null) {
                class152.method2726(this.field2461, arg1, this.field2460);
            }
            this.method2748(arg1);
            this.method2825();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2445[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2445[arg0];
        if (this.field2462 != null) {
            class152.method2726(arg0, arg1, this.field2462);
            this.field2464[arg0] = true;
        }
        if (arg3) {
            this.field2454[arg0] = class114.method3207(arg1, false);
        }
    }

    @ObfuscatedName("ex.br(Ldc;I[BZB)V")
    public void method2835(class123 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2460 != arg0) {
            if (!arg3 && this.field2469 == arg1) {
                this.field2459 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2464[arg1] = false;
                if (this.field2463 || arg3) {
                    class153.method2342(this, this.field2461, arg1, this.field2444[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2465.reset();
            field2465.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2465.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2444[arg1] != var9 || this.field2445[arg1] != var10) {
                this.field2464[arg1] = false;
                if (this.field2463 || arg3) {
                    class153.method2342(this, this.field2461, arg1, this.field2444[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2464[arg1] = true;
            if (arg3) {
                this.field2454[arg1] = class114.method3207(arg2, false);
            }
            return;
        }
        if (this.field2459) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class153.method2342(this, 255, this.field2461, this.field2470, (byte) 0, true);
            return;
        }
        field2465.reset();
        field2465.update(arg2, 0, arg2.length);
        int var5 = (int) field2465.getValue();
        class108 var6 = new class108(class149.method618(arg2));
        int var7 = var6.method2291();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2461 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2297();
        }
        if (this.field2470 != var5 || this.field2468 != var8) {
            class153.method2342(this, 255, this.field2461, this.field2470, (byte) 0, true);
            return;
        }
        this.method2748(arg2);
        this.method2825();
    }

    @ObfuscatedName("ex.by(I)V")
    public void method2825() {
        this.field2464 = new boolean[this.field2454.length];
        for (int var1 = 0; var1 < this.field2464.length; var1++) {
            this.field2464[var1] = false;
        }
        if (this.field2462 == null) {
            this.field2459 = true;
            return;
        }
        this.field2469 = -1;
        for (int var2 = 0; var2 < this.field2464.length; var2++) {
            if (this.field2446[var2] > 0) {
                class152.method2739(var2, this.field2462, this);
                this.field2469 = var2;
            }
        }
        if (this.field2469 == -1) {
            this.field2459 = true;
        }
    }

    @ObfuscatedName("ex.bz(II)I")
    public int method2828(int arg0) {
        if (this.field2454[arg0] == null) {
            return this.field2464[arg0] ? 100 : class153.method2592(this.field2461, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ex.cc(I)I")
    public int method2821() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2454.length; var3++) {
            if (this.field2446[var3] > 0) {
                var1 += 100;
                var2 += this.method2828(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
