package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eu")
public class class152 extends class150 {

    @ObfuscatedName("eu.y")
    public class70 field2472;

    @ObfuscatedName("eu.a")
    public class70 field2473;

    @ObfuscatedName("eu.r")
    public int field2480;

    @ObfuscatedName("eu.x")
    public volatile boolean field2474 = false;

    @ObfuscatedName("eu.w")
    public boolean field2475 = false;

    @ObfuscatedName("eu.j")
    public volatile boolean[] field2476;

    @ObfuscatedName("eu.s")
    public static CRC32 field2477 = new CRC32();

    @ObfuscatedName("eu.au")
    public int field2478;

    @ObfuscatedName("eu.ay")
    public int field2479;

    @ObfuscatedName("eu.ar")
    public int field2471 = -1;

    public class152(class70 arg0, class70 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2472 = arg0;
        this.field2473 = arg1;
        this.field2480 = arg2;
        this.field2475 = arg5;
        int var8 = this.field2480;
        if (Statics.field2449 == null) {
            class151.method2369((class152) null, 255, 255, 0, (byte) 0, true);
            class151.field2464[var8] = this;
        } else {
            Statics.field2449.field2003 = var8 * 8 + 5;
            int var9 = Statics.field2449.method2467();
            int var10 = Statics.field2449.method2467();
            this.method3036(var9, var10);
        }
    }

    @ObfuscatedName("eu.by(B)I")
    public int method3054() {
        if (this.field2474) {
            return 100;
        } else if (this.field2439 == null) {
            int var1 = class151.method2835(255, this.field2480);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("eu.h(II)V")
    public void method2950(int arg0) {
        int var2 = this.field2480;
        long var3 = (long) ((var2 << 16) + arg0);
        class153 var5 = (class153) class151.field2451.method3281(var3);
        if (var5 != null) {
            class151.field2456.method3249(var5);
        }
    }

    @ObfuscatedName("eu.o(II)V")
    public void method3021(int arg0) {
        if (this.field2472 == null || this.field2476 == null || !this.field2476[arg0]) {
            class151.method2369(this, this.field2480, arg0, this.field2433[arg0], (byte) 2, true);
        } else {
            Statics.method1589(arg0, this.field2472, this);
        }
    }

    @ObfuscatedName("eu.bk(III)V")
    public void method3036(int arg0, int arg1) {
        this.field2478 = arg0;
        this.field2479 = arg1;
        if (this.field2473 == null) {
            class151.method2369(this, 255, this.field2480, this.field2478, (byte) 0, true);
        } else {
            Statics.method1589(this.field2480, this.field2473, this);
        }
    }

    @ObfuscatedName("eu.ck(I[BZZI)V")
    public void method3053(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2474) {
                throw new RuntimeException();
            }
            if (this.field2473 != null) {
                class155.method2844(this.field2480, arg1, this.field2473);
            }
            this.method2991(arg1);
            this.method3037();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2443[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2443[arg0];
        if (this.field2472 != null) {
            class155.method2844(arg0, arg1, this.field2472);
            this.field2476[arg0] = true;
        }
        if (arg3) {
            this.field2439[arg0] = class118.method1472(arg1, false);
        }
    }

    @ObfuscatedName("eu.cn(Lba;I[BZI)V")
    public void method3038(class70 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2473 != arg0) {
            if (!arg3 && this.field2471 == arg1) {
                this.field2474 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2476[arg1] = false;
                if (this.field2475 || arg3) {
                    class151.method2369(this, this.field2480, arg1, this.field2433[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2477.reset();
            field2477.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2477.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2433[arg1] != var9 || this.field2443[arg1] != var10) {
                this.field2476[arg1] = false;
                if (this.field2475 || arg3) {
                    class151.method2369(this, this.field2480, arg1, this.field2433[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2476[arg1] = true;
            if (arg3) {
                this.field2439[arg1] = class118.method1472(arg2, false);
            }
            return;
        }
        if (this.field2474) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class151.method2369(this, 255, this.field2480, this.field2478, (byte) 0, true);
            return;
        }
        field2477.reset();
        field2477.update(arg2, 0, arg2.length);
        int var5 = (int) field2477.getValue();
        class126 var6 = new class126(class150.method252(arg2));
        int var7 = var6.method2450();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2467();
        }
        if (this.field2478 != var5 || this.field2479 != var8) {
            class151.method2369(this, 255, this.field2480, this.field2478, (byte) 0, true);
            return;
        }
        this.method2991(arg2);
        this.method3037();
    }

    @ObfuscatedName("eu.cu(I)V")
    public void method3037() {
        this.field2476 = new boolean[this.field2439.length];
        for (int var1 = 0; var1 < this.field2476.length; var1++) {
            this.field2476[var1] = false;
        }
        if (this.field2472 == null) {
            this.field2474 = true;
            return;
        }
        this.field2471 = -1;
        for (int var2 = 0; var2 < this.field2476.length; var2++) {
            if (this.field2435[var2] > 0) {
                class70 var3 = this.field2472;
                class154 var5 = new class154();
                var5.field2496 = 1;
                var5.field2755 = (long) var2;
                var5.field2493 = var3;
                var5.field2492 = this;
                class175 var6 = class155.field2502;
                synchronized (class155.field2502) {
                    class155.field2502.method3303(var5);
                }
                Object var8 = class155.field2500;
                synchronized (class155.field2500) {
                    if (class155.field2499 == 0) {
                        Statics.field1445.method1475(new class155(), 5);
                    }
                    class155.field2499 = 600;
                }
                this.field2471 = var2;
            }
        }
        if (this.field2471 == -1) {
            this.field2474 = true;
        }
    }

    @ObfuscatedName("eu.cw(II)I")
    public int method3042(int arg0) {
        if (this.field2439[arg0] == null) {
            return this.field2476[arg0] ? 100 : class151.method2835(this.field2480, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("eu.cb(B)I")
    public int method3040() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2439.length; var3++) {
            if (this.field2435[var3] > 0) {
                var1 += 100;
                var2 += this.method3042(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
