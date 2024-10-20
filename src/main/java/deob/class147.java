package deob;

import java.util.zip.CRC32;

@ObfuscatedName("et")
public class class147 extends class146 {

    @ObfuscatedName("et.h")
    public class121 field2476;

    @ObfuscatedName("et.e")
    public class121 field2468;

    @ObfuscatedName("et.a")
    public int field2472;

    @ObfuscatedName("et.c")
    public volatile boolean field2470 = false;

    @ObfuscatedName("et.f")
    public boolean field2467 = false;

    @ObfuscatedName("et.q")
    public volatile boolean[] field2471;

    @ObfuscatedName("et.z")
    public static CRC32 field2473 = new CRC32();

    @ObfuscatedName("et.aa")
    public int field2474;

    @ObfuscatedName("et.ak")
    public int field2475;

    @ObfuscatedName("et.al")
    public int field2469 = -1;

    public class147(class121 arg0, class121 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2476 = arg0;
        this.field2468 = arg1;
        this.field2472 = arg2;
        this.field2467 = arg5;
        int var8 = this.field2472;
        if (Statics.field2031 == null) {
            class150.method2054((class147) null, 255, 255, 0, (byte) 0, true);
            class150.field2509[var8] = this;
        } else {
            Statics.field2031.field1863 = var8 * 8 + 5;
            int var9 = Statics.field2031.method2116();
            int var10 = Statics.field2031.method2116();
            this.method2764(var9, var10);
        }
    }

    @ObfuscatedName("et.ca(I)I")
    public int method2771() {
        if (this.field2470) {
            return 100;
        } else if (this.field2457 == null) {
            int var1 = this.field2472;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2880 != null && Statics.field2880.field2877 == var2) {
                var4 = Statics.field513.field1863 * 99 / (Statics.field513.field1865.length - Statics.field2880.field2522) + 1;
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

    @ObfuscatedName("et.r(II)V")
    public void method2678(int arg0) {
        int var2 = this.field2472;
        long var3 = (long) ((var2 << 16) + arg0);
        class151 var5 = (class151) class150.field2502.method3163(var3);
        if (var5 != null) {
            class150.field2494.method3243(var5);
        }
    }

    @ObfuscatedName("et.x(II)V")
    public void method2686(int arg0) {
        if (this.field2476 == null || this.field2471 == null || !this.field2471[arg0]) {
            class150.method2054(this, this.field2472, arg0, this.field2451[arg0], (byte) 2, true);
        } else {
            class149.method2407(arg0, this.field2476, this);
        }
    }

    @ObfuscatedName("et.cs(III)V")
    public void method2764(int arg0, int arg1) {
        this.field2474 = arg0;
        this.field2475 = arg1;
        if (this.field2468 == null) {
            class150.method2054(this, 255, this.field2472, this.field2474, (byte) 0, true);
        } else {
            class149.method2407(this.field2472, this.field2468, this);
        }
    }

    @ObfuscatedName("et.cc(I[BZZS)V")
    public void method2774(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2470) {
                throw new RuntimeException();
            }
            if (this.field2468 != null) {
                class149.method1968(this.field2472, arg1, this.field2468);
            }
            this.method2677(arg1);
            this.method2767();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2452[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2452[arg0];
        if (this.field2476 != null) {
            class149.method1968(arg0, arg1, this.field2476);
            this.field2471[arg0] = true;
        }
        if (arg3) {
            this.field2457[arg0] = class112.method1867(arg1, false);
        }
    }

    @ObfuscatedName("et.cx(Ldt;I[BZB)V")
    public void method2766(class121 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2468 != arg0) {
            if (!arg3 && this.field2469 == arg1) {
                this.field2470 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2471[arg1] = false;
                if (this.field2467 || arg3) {
                    class150.method2054(this, this.field2472, arg1, this.field2451[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2473.reset();
            field2473.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2473.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2451[arg1] != var9 || this.field2452[arg1] != var10) {
                this.field2471[arg1] = false;
                if (this.field2467 || arg3) {
                    class150.method2054(this, this.field2472, arg1, this.field2451[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2471[arg1] = true;
            if (arg3) {
                this.field2457[arg1] = class112.method1867(arg2, false);
            }
            return;
        }
        if (this.field2470) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class150.method2054(this, 255, this.field2472, this.field2474, (byte) 0, true);
            return;
        }
        field2473.reset();
        field2473.update(arg2, 0, arg2.length);
        int var5 = (int) field2473.getValue();
        class107 var6 = new class107(class146.method2657(arg2));
        int var7 = var6.method2111();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2116();
        }
        if (this.field2474 != var5 || this.field2475 != var8) {
            class150.method2054(this, 255, this.field2472, this.field2474, (byte) 0, true);
            return;
        }
        this.method2677(arg2);
        this.method2767();
    }

    @ObfuscatedName("et.ck(B)V")
    public void method2767() {
        this.field2471 = new boolean[this.field2457.length];
        for (int var1 = 0; var1 < this.field2471.length; var1++) {
            this.field2471[var1] = false;
        }
        if (this.field2476 == null) {
            this.field2470 = true;
            return;
        }
        this.field2469 = -1;
        for (int var2 = 0; var2 < this.field2471.length; var2++) {
            if (this.field2453[var2] > 0) {
                class121 var3 = this.field2476;
                class148 var5 = new class148();
                var5.field2478 = 1;
                var5.field2877 = (long) var2;
                var5.field2480 = var3;
                var5.field2481 = this;
                class177 var6 = class149.field2487;
                synchronized (class149.field2487) {
                    class149.field2487.method3190(var5);
                }
                Object var8 = class149.field2490;
                synchronized (class149.field2490) {
                    if (class149.field2489 == 0) {
                        Statics.field1680.method2463(new class149(), 5);
                    }
                    class149.field2489 = 600;
                }
                this.field2469 = var2;
            }
        }
        if (this.field2469 == -1) {
            this.field2470 = true;
        }
    }

    @ObfuscatedName("et.ci(II)I")
    public int method2768(int arg0) {
        if (this.field2457[arg0] != null) {
            return 100;
        } else if (this.field2471[arg0]) {
            return 100;
        } else {
            int var2 = this.field2472;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2880 != null && Statics.field2880.field2877 == var3) {
                var5 = Statics.field513.field1863 * 99 / (Statics.field513.field1865.length - Statics.field2880.field2522) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("et.cl(I)I")
    public int method2769() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2457.length; var3++) {
            if (this.field2453[var3] > 0) {
                var1 += 100;
                var2 += this.method2768(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
