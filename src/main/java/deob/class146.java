package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eb")
public class class146 extends class145 {

    @ObfuscatedName("eb.x")
    public class121 field2457;

    @ObfuscatedName("eb.q")
    public class121 field2453;

    @ObfuscatedName("eb.s")
    public int field2460;

    @ObfuscatedName("eb.j")
    public volatile boolean field2455 = false;

    @ObfuscatedName("eb.y")
    public boolean field2456 = false;

    @ObfuscatedName("eb.r")
    public volatile boolean[] field2454;

    @ObfuscatedName("eb.h")
    public static CRC32 field2458 = new CRC32();

    @ObfuscatedName("eb.ak")
    public int field2459;

    @ObfuscatedName("eb.ab")
    public int field2452;

    @ObfuscatedName("eb.as")
    public int field2461 = -1;

    public class146(class121 arg0, class121 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2457 = arg0;
        this.field2453 = arg1;
        this.field2460 = arg2;
        this.field2456 = arg5;
        int var8 = this.field2460;
        if (Statics.field2494 == null) {
            class149.method1324((class146) null, 255, 255, 0, (byte) 0, true);
            class149.field2482[var8] = this;
        } else {
            Statics.field2494.field1841 = var8 * 8 + 5;
            int var9 = Statics.field2494.method2146();
            int var10 = Statics.field2494.method2146();
            this.method2792(var9, var10);
        }
    }

    @ObfuscatedName("eb.cg(B)I")
    public int method2794() {
        if (this.field2455) {
            return 100;
        } else if (this.field2436 == null) {
            int var1 = this.field2460;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1969 != null && Statics.field1969.field2843 == var2) {
                var4 = Statics.field2132.field1841 * 99 / (Statics.field2132.field1845.length - Statics.field1969.field2504) + 1;
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

    @ObfuscatedName("eb.p(II)V")
    public void method2739(int arg0) {
        int var2 = this.field2460;
        long var3 = (long) ((var2 << 16) + arg0);
        class150 var5 = (class150) class149.field2501.method3192(var3);
        if (var5 != null) {
            class149.field2485.method3286(var5);
        }
    }

    @ObfuscatedName("eb.c(II)V")
    public void method2724(int arg0) {
        if (this.field2457 == null || this.field2454 == null || !this.field2454[arg0]) {
            class149.method1324(this, this.field2460, arg0, this.field2438[arg0], (byte) 2, true);
        } else {
            class148.method483(arg0, this.field2457, this);
        }
    }

    @ObfuscatedName("eb.ca(III)V")
    public void method2792(int arg0, int arg1) {
        this.field2459 = arg0;
        this.field2452 = arg1;
        if (this.field2453 == null) {
            class149.method1324(this, 255, this.field2460, this.field2459, (byte) 0, true);
        } else {
            class148.method483(this.field2460, this.field2453, this);
        }
    }

    @ObfuscatedName("eb.cq(I[BZZI)V")
    public void method2795(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2455) {
                throw new RuntimeException();
            }
            if (this.field2453 != null) {
                class148.method2818(this.field2460, arg1, this.field2453);
            }
            this.method2715(arg1);
            this.method2797();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2439[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2439[arg0];
        if (this.field2457 != null) {
            class148.method2818(arg0, arg1, this.field2457);
            this.field2454[arg0] = true;
        }
        if (arg3) {
            this.field2436[arg0] = class112.method1970(arg1, false);
        }
    }

    @ObfuscatedName("eb.cx(Ldj;I[BZI)V")
    public void method2796(class121 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2453 != arg0) {
            if (!arg3 && this.field2461 == arg1) {
                this.field2455 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2454[arg1] = false;
                if (this.field2456 || arg3) {
                    class149.method1324(this, this.field2460, arg1, this.field2438[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2458.reset();
            field2458.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2458.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2438[arg1] != var9 || this.field2439[arg1] != var10) {
                this.field2454[arg1] = false;
                if (this.field2456 || arg3) {
                    class149.method1324(this, this.field2460, arg1, this.field2438[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2454[arg1] = true;
            if (arg3) {
                this.field2436[arg1] = class112.method1970(arg2, false);
            }
            return;
        }
        if (this.field2455) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class149.method1324(this, 255, this.field2460, this.field2459, (byte) 0, true);
            return;
        }
        field2458.reset();
        field2458.update(arg2, 0, arg2.length);
        int var5 = (int) field2458.getValue();
        class107 var6 = new class107(class145.method28(arg2));
        int var7 = var6.method2125();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2146();
        }
        if (this.field2459 != var5 || this.field2452 != var8) {
            class149.method1324(this, 255, this.field2460, this.field2459, (byte) 0, true);
            return;
        }
        this.method2715(arg2);
        this.method2797();
    }

    @ObfuscatedName("eb.ch(I)V")
    public void method2797() {
        this.field2454 = new boolean[this.field2436.length];
        for (int var1 = 0; var1 < this.field2454.length; var1++) {
            this.field2454[var1] = false;
        }
        if (this.field2457 == null) {
            this.field2455 = true;
            return;
        }
        this.field2461 = -1;
        for (int var2 = 0; var2 < this.field2454.length; var2++) {
            if (this.field2440[var2] > 0) {
                class121 var3 = this.field2457;
                class147 var5 = new class147();
                var5.field2470 = 1;
                var5.field2843 = (long) var2;
                var5.field2466 = var3;
                var5.field2464 = this;
                class176 var6 = class148.field2474;
                synchronized (class148.field2474) {
                    class148.field2474.method3222(var5);
                }
                class148.method120();
                this.field2461 = var2;
            }
        }
        if (this.field2461 == -1) {
            this.field2455 = true;
        }
    }

    @ObfuscatedName("eb.cn(II)I")
    public int method2814(int arg0) {
        if (this.field2436[arg0] != null) {
            return 100;
        } else if (this.field2454[arg0]) {
            return 100;
        } else {
            int var2 = this.field2460;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1969 != null && Statics.field1969.field2843 == var3) {
                var5 = Statics.field2132.field1841 * 99 / (Statics.field2132.field1845.length - Statics.field1969.field2504) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("eb.cf(I)I")
    public int method2799() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2436.length; var3++) {
            if (this.field2440[var3] > 0) {
                var1 += 100;
                var2 += this.method2814(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
