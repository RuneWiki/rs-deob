package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ey")
public class class147 extends class146 {

    @ObfuscatedName("ey.a")
    public class121 field2458;

    @ObfuscatedName("ey.o")
    public class121 field2459;

    @ObfuscatedName("ey.r")
    public int field2461;

    @ObfuscatedName("ey.t")
    public volatile boolean field2467 = false;

    @ObfuscatedName("ey.k")
    public boolean field2460 = false;

    @ObfuscatedName("ey.n")
    public volatile boolean[] field2463;

    @ObfuscatedName("ey.z")
    public static CRC32 field2464 = new CRC32();

    @ObfuscatedName("ey.av")
    public int field2462;

    @ObfuscatedName("ey.ao")
    public int field2465;

    @ObfuscatedName("ey.am")
    public int field2466 = -1;

    public class147(class121 arg0, class121 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2458 = arg0;
        this.field2459 = arg1;
        this.field2461 = arg2;
        this.field2460 = arg5;
        int var8 = this.field2461;
        if (Statics.field2661 == null) {
            Statics.method818((class147) null, 255, 255, 0, (byte) 0, true);
            class150.field2498[var8] = this;
        } else {
            Statics.field2661.field1844 = var8 * 8 + 5;
            int var9 = Statics.field2661.method2121();
            int var10 = Statics.field2661.method2121();
            this.method2778(var9, var10);
        }
    }

    @ObfuscatedName("ey.cn(I)I")
    public int method2773() {
        if (this.field2467) {
            return 100;
        } else if (this.field2447 == null) {
            int var1 = this.field2461;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1888 != null && Statics.field1888.field2867 == var2) {
                var4 = Statics.field2092.field1844 * 99 / (Statics.field2092.field1849.length - Statics.field1888.field2506) + 1;
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

    @ObfuscatedName("ey.v(II)V")
    public void method2720(int arg0) {
        class150.method2786(this.field2461, arg0);
    }

    @ObfuscatedName("ey.s(II)V")
    public void method2703(int arg0) {
        if (this.field2458 == null || this.field2463 == null || !this.field2463[arg0]) {
            Statics.method818(this, this.field2461, arg0, this.field2440[arg0], (byte) 2, true);
            return;
        }
        class121 var2 = this.field2458;
        byte[] var4 = null;
        class177 var5 = class149.field2476;
        synchronized (class149.field2476) {
            for (class148 var6 = (class148) class149.field2476.method3210(); var6 != null; var6 = (class148) class149.field2476.method3182()) {
                if ((long) arg0 == var6.field2867 && var6.field2472 == var2 && var6.field2475 == 0) {
                    var4 = var6.field2471;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2442(arg0);
            this.method2775(var2, arg0, var8, true);
        } else {
            this.method2775(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ey.cb(III)V")
    public void method2778(int arg0, int arg1) {
        this.field2462 = arg0;
        this.field2465 = arg1;
        if (this.field2459 == null) {
            Statics.method818(this, 255, this.field2461, this.field2462, (byte) 0, true);
        } else {
            class149.method471(this.field2461, this.field2459, this);
        }
    }

    @ObfuscatedName("ey.cf(I[BZZI)V")
    public void method2774(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2467) {
                throw new RuntimeException();
            }
            if (this.field2459 != null) {
                class149.method695(this.field2461, arg1, this.field2459);
            }
            this.method2693(arg1);
            this.method2776();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2449[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2449[arg0];
        if (this.field2458 != null) {
            class149.method695(arg0, arg1, this.field2458);
            this.field2463[arg0] = true;
        }
        if (arg3) {
            this.field2447[arg0] = class112.method2453(arg1, false);
        }
    }

    @ObfuscatedName("ey.cu(Ldy;I[BZI)V")
    public void method2775(class121 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2459 != arg0) {
            if (!arg3 && this.field2466 == arg1) {
                this.field2467 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2463[arg1] = false;
                if (this.field2460 || arg3) {
                    Statics.method818(this, this.field2461, arg1, this.field2440[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2464.reset();
            field2464.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2464.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2440[arg1] != var9 || this.field2449[arg1] != var10) {
                this.field2463[arg1] = false;
                if (this.field2460 || arg3) {
                    Statics.method818(this, this.field2461, arg1, this.field2440[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2463[arg1] = true;
            if (arg3) {
                this.field2447[arg1] = class112.method2453(arg2, false);
            }
            return;
        }
        if (this.field2467) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            Statics.method818(this, 255, this.field2461, this.field2462, (byte) 0, true);
            return;
        }
        field2464.reset();
        field2464.update(arg2, 0, arg2.length);
        int var5 = (int) field2464.getValue();
        class107 var6 = new class107(class146.method2666(arg2));
        int var7 = var6.method2226();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2121();
        }
        if (this.field2462 != var5 || this.field2465 != var8) {
            Statics.method818(this, 255, this.field2461, this.field2462, (byte) 0, true);
            return;
        }
        this.method2693(arg2);
        this.method2776();
    }

    @ObfuscatedName("ey.cq(B)V")
    public void method2776() {
        this.field2463 = new boolean[this.field2447.length];
        for (int var1 = 0; var1 < this.field2463.length; var1++) {
            this.field2463[var1] = false;
        }
        if (this.field2458 == null) {
            this.field2467 = true;
            return;
        }
        this.field2466 = -1;
        for (int var2 = 0; var2 < this.field2463.length; var2++) {
            if (this.field2446[var2] > 0) {
                class121 var3 = this.field2458;
                class148 var5 = new class148();
                var5.field2475 = 1;
                var5.field2867 = (long) var2;
                var5.field2472 = var3;
                var5.field2473 = this;
                class177 var6 = class149.field2476;
                synchronized (class149.field2476) {
                    class149.field2476.method3183(var5);
                }
                Object var8 = class149.field2478;
                synchronized (class149.field2478) {
                    if (class149.field2479 == 0) {
                        Statics.field2672.method2463(new class149(), 5);
                    }
                    class149.field2479 = 600;
                }
                this.field2466 = var2;
            }
        }
        if (this.field2466 == -1) {
            this.field2467 = true;
        }
    }

    @ObfuscatedName("ey.cp(II)I")
    public int method2777(int arg0) {
        if (this.field2447[arg0] != null) {
            return 100;
        } else if (this.field2463[arg0]) {
            return 100;
        } else {
            int var2 = this.field2461;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1888 != null && Statics.field1888.field2867 == var3) {
                var5 = Statics.field2092.field1844 * 99 / (Statics.field2092.field1849.length - Statics.field1888.field2506) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ey.ch(I)I")
    public int method2788() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2447.length; var3++) {
            if (this.field2446[var3] > 0) {
                var1 += 100;
                var2 += this.method2777(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
