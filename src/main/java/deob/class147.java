package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eg")
public class class147 extends class146 {

    @ObfuscatedName("eg.d")
    public class121 field2478;

    @ObfuscatedName("eg.m")
    public class121 field2475;

    @ObfuscatedName("eg.o")
    public int field2471;

    @ObfuscatedName("eg.b")
    public volatile boolean field2474 = false;

    @ObfuscatedName("eg.c")
    public boolean field2473 = false;

    @ObfuscatedName("eg.w")
    public volatile boolean[] field2472;

    @ObfuscatedName("eg.u")
    public static CRC32 field2477 = new CRC32();

    @ObfuscatedName("eg.ac")
    public int field2476;

    @ObfuscatedName("eg.ap")
    public int field2479;

    @ObfuscatedName("eg.ai")
    public int field2480 = -1;

    public class147(class121 arg0, class121 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2478 = arg0;
        this.field2475 = arg1;
        this.field2471 = arg2;
        this.field2473 = arg5;
        class150.method2691(this, this.field2471);
    }

    @ObfuscatedName("eg.bt(B)I")
    public int method2785() {
        if (this.field2474) {
            return 100;
        } else if (this.field2461 == null) {
            int var1 = class150.method569(255, this.field2471);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("eg.v(II)V")
    public void method2707(int arg0) {
        class150.method498(this.field2471, arg0);
    }

    @ObfuscatedName("eg.a(II)V")
    public void method2775(int arg0) {
        if (this.field2478 == null || this.field2472 == null || !this.field2472[arg0]) {
            class150.method1899(this, this.field2471, arg0, this.field2455[arg0], (byte) 2, true);
        } else {
            class149.method41(arg0, this.field2478, this);
        }
    }

    @ObfuscatedName("eg.bi(III)V")
    public void method2779(int arg0, int arg1) {
        this.field2476 = arg0;
        this.field2479 = arg1;
        if (this.field2475 == null) {
            class150.method1899(this, 255, this.field2471, this.field2476, (byte) 0, true);
        } else {
            class149.method41(this.field2471, this.field2475, this);
        }
    }

    @ObfuscatedName("eg.bb(I[BZZI)V")
    public void method2786(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2456[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2456[arg0];
            if (this.field2478 != null) {
                class121 var10 = this.field2478;
                class148 var11 = new class148();
                var11.field2487 = 0;
                var11.field2875 = (long) arg0;
                var11.field2482 = arg1;
                var11.field2485 = var10;
                class177 var12 = class149.field2493;
                synchronized (class149.field2493) {
                    class149.field2493.method3232(var11);
                }
                class149.method2400();
                this.field2472[arg0] = true;
            }
            if (arg3) {
                this.field2461[arg0] = class112.method132(arg1, false);
            }
            return;
        }
        if (this.field2474) {
            throw new RuntimeException();
        }
        if (this.field2475 != null) {
            int var5 = this.field2471;
            class121 var6 = this.field2475;
            class148 var7 = new class148();
            var7.field2487 = 0;
            var7.field2875 = (long) var5;
            var7.field2482 = arg1;
            var7.field2485 = var6;
            class177 var8 = class149.field2493;
            synchronized (class149.field2493) {
                class149.field2493.method3232(var7);
            }
            class149.method2400();
        }
        this.method2706(arg1);
        this.method2781();
    }

    @ObfuscatedName("eg.bw(Ldi;I[BZI)V")
    public void method2792(class121 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2475 != arg0) {
            if (!arg3 && this.field2480 == arg1) {
                this.field2474 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2472[arg1] = false;
                if (this.field2473 || arg3) {
                    class150.method1899(this, this.field2471, arg1, this.field2455[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2477.reset();
            field2477.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2477.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2455[arg1] != var9 || this.field2456[arg1] != var10) {
                this.field2472[arg1] = false;
                if (this.field2473 || arg3) {
                    class150.method1899(this, this.field2471, arg1, this.field2455[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2472[arg1] = true;
            if (arg3) {
                this.field2461[arg1] = class112.method132(arg2, false);
            }
            return;
        }
        if (this.field2474) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class150.method1899(this, 255, this.field2471, this.field2476, (byte) 0, true);
            return;
        }
        field2477.reset();
        field2477.update(arg2, 0, arg2.length);
        int var5 = (int) field2477.getValue();
        class107 var6 = new class107(class146.method72(arg2));
        int var7 = var6.method2139();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2144();
        }
        if (this.field2476 != var5 || this.field2479 != var8) {
            class150.method1899(this, 255, this.field2471, this.field2476, (byte) 0, true);
            return;
        }
        this.method2706(arg2);
        this.method2781();
    }

    @ObfuscatedName("eg.bj(I)V")
    public void method2781() {
        this.field2472 = new boolean[this.field2461.length];
        for (int var1 = 0; var1 < this.field2472.length; var1++) {
            this.field2472[var1] = false;
        }
        if (this.field2478 == null) {
            this.field2474 = true;
            return;
        }
        this.field2480 = -1;
        for (int var2 = 0; var2 < this.field2472.length; var2++) {
            if (this.field2451[var2] > 0) {
                class121 var3 = this.field2478;
                class148 var5 = new class148();
                var5.field2487 = 1;
                var5.field2875 = (long) var2;
                var5.field2485 = var3;
                var5.field2484 = this;
                class177 var6 = class149.field2493;
                synchronized (class149.field2493) {
                    class149.field2493.method3232(var5);
                }
                class149.method2400();
                this.field2480 = var2;
            }
        }
        if (this.field2480 == -1) {
            this.field2474 = true;
        }
    }

    @ObfuscatedName("eg.cm(II)I")
    public int method2783(int arg0) {
        if (this.field2461[arg0] == null) {
            return this.field2472[arg0] ? 100 : class150.method569(this.field2471, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("eg.cg(I)I")
    public int method2784() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2461.length; var3++) {
            if (this.field2451[var3] > 0) {
                var1 += 100;
                var2 += this.method2783(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
