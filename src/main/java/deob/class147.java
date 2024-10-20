package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eh")
public class class147 extends class146 {

    @ObfuscatedName("eh.a")
    public class121 field2455;

    @ObfuscatedName("eh.d")
    public class121 field2449;

    @ObfuscatedName("eh.j")
    public int field2447;

    @ObfuscatedName("eh.s")
    public volatile boolean field2451 = false;

    @ObfuscatedName("eh.f")
    public boolean field2450 = false;

    @ObfuscatedName("eh.e")
    public volatile boolean[] field2452;

    @ObfuscatedName("eh.q")
    public static CRC32 field2453 = new CRC32();

    @ObfuscatedName("eh.al")
    public int field2454;

    @ObfuscatedName("eh.ao")
    public int field2448;

    @ObfuscatedName("eh.ap")
    public int field2456 = -1;

    public class147(class121 arg0, class121 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2455 = arg0;
        this.field2449 = arg1;
        this.field2447 = arg2;
        this.field2450 = arg5;
        class150.method1766(this, this.field2447);
    }

    @ObfuscatedName("eh.cc(B)I")
    public int method2744() {
        if (this.field2451) {
            return 100;
        } else if (this.field2428 == null) {
            int var1 = this.field2447;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field189 != null && Statics.field189.field2866 == var2) {
                var4 = Statics.field2487.field1827 * 99 / (Statics.field2487.field1826.length - Statics.field189.field2501) + 1;
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

    @ObfuscatedName("eh.o(IS)V")
    public void method2667(int arg0) {
        class150.method622(this.field2447, arg0);
    }

    @ObfuscatedName("eh.w(II)V")
    public void method2678(int arg0) {
        if (this.field2455 == null || this.field2452 == null || !this.field2452[arg0]) {
            class150.method2067(this, this.field2447, arg0, this.field2436[arg0], (byte) 2, true);
        } else {
            class149.method781(arg0, this.field2455, this);
        }
    }

    @ObfuscatedName("eh.ci(IIB)V")
    public void method2757(int arg0, int arg1) {
        this.field2454 = arg0;
        this.field2448 = arg1;
        if (this.field2449 == null) {
            class150.method2067(this, 255, this.field2447, this.field2454, (byte) 0, true);
        } else {
            class149.method781(this.field2447, this.field2449, this);
        }
    }

    @ObfuscatedName("eh.cr(I[BZZI)V")
    public void method2746(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2451) {
                throw new RuntimeException();
            }
            if (this.field2449 != null) {
                class149.method1332(this.field2447, arg1, this.field2449);
            }
            this.method2694(arg1);
            this.method2762();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2426[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2426[arg0];
        if (this.field2455 != null) {
            class149.method1332(arg0, arg1, this.field2455);
            this.field2452[arg0] = true;
        }
        if (arg3) {
            this.field2428[arg0] = class112.method2335(arg1, false);
        }
    }

    @ObfuscatedName("eh.ca(Ldt;I[BZI)V")
    public void method2747(class121 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2449 != arg0) {
            if (!arg3 && this.field2456 == arg1) {
                this.field2451 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2452[arg1] = false;
                if (this.field2450 || arg3) {
                    class150.method2067(this, this.field2447, arg1, this.field2436[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2453.reset();
            field2453.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2453.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2436[arg1] != var9 || this.field2426[arg1] != var10) {
                this.field2452[arg1] = false;
                if (this.field2450 || arg3) {
                    class150.method2067(this, this.field2447, arg1, this.field2436[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2452[arg1] = true;
            if (arg3) {
                this.field2428[arg1] = class112.method2335(arg2, false);
            }
            return;
        }
        if (this.field2451) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class150.method2067(this, 255, this.field2447, this.field2454, (byte) 0, true);
            return;
        }
        field2453.reset();
        field2453.update(arg2, 0, arg2.length);
        int var5 = (int) field2453.getValue();
        class107 var6 = new class107(class146.method783(arg2));
        int var7 = var6.method2118();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2152();
        }
        if (this.field2454 != var5 || this.field2448 != var8) {
            class150.method2067(this, 255, this.field2447, this.field2454, (byte) 0, true);
            return;
        }
        this.method2694(arg2);
        this.method2762();
    }

    @ObfuscatedName("eh.cl(B)V")
    public void method2762() {
        this.field2452 = new boolean[this.field2428.length];
        for (int var1 = 0; var1 < this.field2452.length; var1++) {
            this.field2452[var1] = false;
        }
        if (this.field2455 == null) {
            this.field2451 = true;
            return;
        }
        this.field2456 = -1;
        for (int var2 = 0; var2 < this.field2452.length; var2++) {
            if (this.field2432[var2] > 0) {
                class121 var3 = this.field2455;
                class148 var5 = new class148();
                var5.field2458 = 1;
                var5.field2866 = (long) var2;
                var5.field2460 = var3;
                var5.field2461 = this;
                class177 var6 = class149.field2472;
                synchronized (class149.field2472) {
                    class149.field2472.method3166(var5);
                }
                Object var8 = class149.field2468;
                synchronized (class149.field2468) {
                    if (class149.field2471 == 0) {
                        Statics.field777.method2458(new class149(), 5);
                    }
                    class149.field2471 = 600;
                }
                this.field2456 = var2;
            }
        }
        if (this.field2456 == -1) {
            this.field2451 = true;
        }
    }

    @ObfuscatedName("eh.ch(IB)I")
    public int method2748(int arg0) {
        if (this.field2428[arg0] != null) {
            return 100;
        } else if (this.field2452[arg0]) {
            return 100;
        } else {
            int var2 = this.field2447;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field189 != null && Statics.field189.field2866 == var3) {
                var5 = Statics.field2487.field1827 * 99 / (Statics.field2487.field1826.length - Statics.field189.field2501) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("eh.cf(I)I")
    public int method2750() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2428.length; var3++) {
            if (this.field2432[var3] > 0) {
                var1 += 100;
                var2 += this.method2748(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
