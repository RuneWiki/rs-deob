package deob;

import java.util.zip.CRC32;

@ObfuscatedName("er")
public class class143 extends class142 {

    @ObfuscatedName("er.b")
    public class118 field2429;

    @ObfuscatedName("er.s")
    public class118 field2421;

    @ObfuscatedName("er.o")
    public int field2422;

    @ObfuscatedName("er.h")
    public volatile boolean field2424 = false;

    @ObfuscatedName("er.x")
    public boolean field2426 = false;

    @ObfuscatedName("er.e")
    public volatile boolean[] field2431;

    @ObfuscatedName("er.z")
    public static CRC32 field2420 = new CRC32();

    @ObfuscatedName("er.az")
    public int field2427;

    @ObfuscatedName("er.av")
    public int field2423;

    @ObfuscatedName("er.ay")
    public int field2425 = -1;

    public class143(class118 arg0, class118 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2429 = arg0;
        this.field2421 = arg1;
        this.field2422 = arg2;
        this.field2426 = arg5;
        int var8 = this.field2422;
        if (Statics.field1255 == null) {
            class146.method2518((class143) null, 255, 255, 0, (byte) 0, true);
            class146.field2461[var8] = this;
        } else {
            Statics.field1255.field1806 = var8 * 8 + 5;
            int var9 = Statics.field1255.method2135();
            int var10 = Statics.field1255.method2135();
            this.method2777(var9, var10);
        }
    }

    @ObfuscatedName("er.cg(B)I")
    public int method2775() {
        if (this.field2424) {
            return 100;
        } else if (this.field2401 == null) {
            int var1 = this.field2422;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1911 != null && Statics.field1911.field2812 == var2) {
                var4 = Statics.field861.field1806 * 99 / (Statics.field861.field1808.length - Statics.field1911.field2466) + 1;
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

    @ObfuscatedName("er.k(IB)V")
    public void method2723(int arg0) {
        int var2 = this.field2422;
        long var3 = (long) ((var2 << 16) + arg0);
        class147 var5 = (class147) class146.field2447.method3159(var3);
        if (var5 != null) {
            class146.field2452.method3203(var5);
        }
    }

    @ObfuscatedName("er.d(IB)V")
    public void method2768(int arg0) {
        if (this.field2429 == null || this.field2431 == null || !this.field2431[arg0]) {
            class146.method2518(this, this.field2422, arg0, this.field2404[arg0], (byte) 2, true);
        } else {
            class145.method145(arg0, this.field2429, this);
        }
    }

    @ObfuscatedName("er.cd(III)V")
    public void method2777(int arg0, int arg1) {
        this.field2427 = arg0;
        this.field2423 = arg1;
        if (this.field2421 == null) {
            class146.method2518(this, 255, this.field2422, this.field2427, (byte) 0, true);
        } else {
            class145.method145(this.field2422, this.field2421, this);
        }
    }

    @ObfuscatedName("er.ch(I[BZZI)V")
    public void method2794(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2405[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2405[arg0];
            if (this.field2429 != null) {
                class118 var12 = this.field2429;
                class144 var13 = new class144();
                var13.field2436 = 0;
                var13.field2812 = (long) arg0;
                var13.field2434 = arg1;
                var13.field2435 = var12;
                class171 var14 = class145.field2443;
                synchronized (class145.field2443) {
                    class145.field2443.method3180(var13);
                }
                Object var16 = class145.field2444;
                synchronized (class145.field2444) {
                    if (class145.field2442 == 0) {
                        Statics.field1949.method2468(new class145(), 5);
                    }
                    class145.field2442 = 600;
                }
                this.field2431[arg0] = true;
            }
            if (arg3) {
                this.field2401[arg0] = class109.method1869(arg1, false);
            }
            return;
        }
        if (this.field2424) {
            throw new RuntimeException();
        }
        if (this.field2421 != null) {
            int var5 = this.field2422;
            class118 var6 = this.field2421;
            class144 var7 = new class144();
            var7.field2436 = 0;
            var7.field2812 = (long) var5;
            var7.field2434 = arg1;
            var7.field2435 = var6;
            class171 var8 = class145.field2443;
            synchronized (class145.field2443) {
                class145.field2443.method3180(var7);
            }
            Object var10 = class145.field2444;
            synchronized (class145.field2444) {
                if (class145.field2442 == 0) {
                    Statics.field1949.method2468(new class145(), 5);
                }
                class145.field2442 = 600;
            }
        }
        this.method2706(arg1);
        this.method2790();
    }

    @ObfuscatedName("er.cs(Ldo;I[BZB)V")
    public void method2782(class118 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2421 != arg0) {
            if (!arg3 && this.field2425 == arg1) {
                this.field2424 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2431[arg1] = false;
                if (this.field2426 || arg3) {
                    class146.method2518(this, this.field2422, arg1, this.field2404[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2420.reset();
            field2420.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2420.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2404[arg1] != var9 || this.field2405[arg1] != var10) {
                this.field2431[arg1] = false;
                if (this.field2426 || arg3) {
                    class146.method2518(this, this.field2422, arg1, this.field2404[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2431[arg1] = true;
            if (arg3) {
                this.field2401[arg1] = class109.method1869(arg2, false);
            }
            return;
        }
        if (this.field2424) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class146.method2518(this, 255, this.field2422, this.field2427, (byte) 0, true);
            return;
        }
        field2420.reset();
        field2420.update(arg2, 0, arg2.length);
        int var5 = (int) field2420.getValue();
        class104 var6 = new class104(class142.method496(arg2));
        int var7 = var6.method2190();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2135();
        }
        if (this.field2427 != var5 || this.field2423 != var8) {
            class146.method2518(this, 255, this.field2422, this.field2427, (byte) 0, true);
            return;
        }
        this.method2706(arg2);
        this.method2790();
    }

    @ObfuscatedName("er.cj(B)V")
    public void method2790() {
        this.field2431 = new boolean[this.field2401.length];
        for (int var1 = 0; var1 < this.field2431.length; var1++) {
            this.field2431[var1] = false;
        }
        if (this.field2429 == null) {
            this.field2424 = true;
            return;
        }
        this.field2425 = -1;
        for (int var2 = 0; var2 < this.field2431.length; var2++) {
            if (this.field2406[var2] > 0) {
                class118 var3 = this.field2429;
                class144 var5 = new class144();
                var5.field2436 = 1;
                var5.field2812 = (long) var2;
                var5.field2435 = var3;
                var5.field2433 = this;
                class171 var6 = class145.field2443;
                synchronized (class145.field2443) {
                    class145.field2443.method3180(var5);
                }
                Object var8 = class145.field2444;
                synchronized (class145.field2444) {
                    if (class145.field2442 == 0) {
                        Statics.field1949.method2468(new class145(), 5);
                    }
                    class145.field2442 = 600;
                }
                this.field2425 = var2;
            }
        }
        if (this.field2425 == -1) {
            this.field2424 = true;
        }
    }

    @ObfuscatedName("er.cm(IB)I")
    public int method2779(int arg0) {
        if (this.field2401[arg0] != null) {
            return 100;
        } else if (this.field2431[arg0]) {
            return 100;
        } else {
            int var2 = this.field2422;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1911 != null && Statics.field1911.field2812 == var3) {
                var5 = Statics.field861.field1806 * 99 / (Statics.field861.field1808.length - Statics.field1911.field2466) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("er.cr(I)I")
    public int method2780() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2401.length; var3++) {
            if (this.field2406[var3] > 0) {
                var1 += 100;
                var2 += this.method2779(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
