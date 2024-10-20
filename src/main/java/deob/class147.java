package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eh")
public class class147 extends class146 {

    @ObfuscatedName("eh.v")
    public class121 field2479;

    @ObfuscatedName("eh.s")
    public class121 field2472;

    @ObfuscatedName("eh.r")
    public int field2477;

    @ObfuscatedName("eh.j")
    public volatile boolean field2482 = false;

    @ObfuscatedName("eh.h")
    public boolean field2475 = false;

    @ObfuscatedName("eh.d")
    public volatile boolean[] field2476;

    @ObfuscatedName("eh.l")
    public static CRC32 field2483 = new CRC32();

    @ObfuscatedName("eh.ag")
    public int field2478;

    @ObfuscatedName("eh.au")
    public int field2473;

    @ObfuscatedName("eh.ak")
    public int field2480 = -1;

    public class147(class121 arg0, class121 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2479 = arg0;
        this.field2472 = arg1;
        this.field2477 = arg2;
        this.field2475 = arg5;
        int var8 = this.field2477;
        if (Statics.field888 == null) {
            class150.method2677((class147) null, 255, 255, 0, (byte) 0, true);
            class150.field2502[var8] = this;
        } else {
            Statics.field888.field1862 = var8 * 8 + 5;
            int var9 = Statics.field888.method2120();
            int var10 = Statics.field888.method2120();
            this.method2777(var9, var10);
        }
    }

    @ObfuscatedName("eh.bv(I)I")
    public int method2766() {
        if (this.field2482) {
            return 100;
        } else if (this.field2456 == null) {
            int var1 = this.field2477;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2513 != null && Statics.field2513.field2867 == var2) {
                var4 = Statics.field1110.field1862 * 99 / (Statics.field1110.field1857.length - Statics.field2513.field2523) + 1;
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

    @ObfuscatedName("eh.b(II)V")
    public void method2712(int arg0) {
        int var2 = this.field2477;
        long var3 = (long) ((var2 << 16) + arg0);
        class151 var5 = (class151) class150.field2517.method3197(var3);
        if (var5 != null) {
            class150.field2510.method3297(var5);
        }
    }

    @ObfuscatedName("eh.w(II)V")
    public void method2731(int arg0) {
        if (this.field2479 == null || this.field2476 == null || !this.field2476[arg0]) {
            class150.method2677(this, this.field2477, arg0, this.field2469[arg0], (byte) 2, true);
        } else {
            class149.method109(arg0, this.field2479, this);
        }
    }

    @ObfuscatedName("eh.be(III)V")
    public void method2777(int arg0, int arg1) {
        this.field2478 = arg0;
        this.field2473 = arg1;
        if (this.field2472 == null) {
            class150.method2677(this, 255, this.field2477, this.field2478, (byte) 0, true);
        } else {
            class149.method109(this.field2477, this.field2472, this);
        }
    }

    @ObfuscatedName("eh.bd(I[BZZI)V")
    public void method2769(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2482) {
                throw new RuntimeException();
            }
            if (this.field2472 != null) {
                class149.method2421(this.field2477, arg1, this.field2472);
            }
            this.method2721(arg1);
            this.method2771();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2457[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2457[arg0];
        if (this.field2479 != null) {
            class149.method2421(arg0, arg1, this.field2479);
            this.field2476[arg0] = true;
        }
        if (arg3) {
            this.field2456[arg0] = class112.method2047(arg1, false);
        }
    }

    @ObfuscatedName("eh.br(Ldr;I[BZI)V")
    public void method2768(class121 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2472 != arg0) {
            if (!arg3 && this.field2480 == arg1) {
                this.field2482 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2476[arg1] = false;
                if (this.field2475 || arg3) {
                    class150.method2677(this, this.field2477, arg1, this.field2469[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2483.reset();
            field2483.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2483.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2469[arg1] != var9 || this.field2457[arg1] != var10) {
                this.field2476[arg1] = false;
                if (this.field2475 || arg3) {
                    class150.method2677(this, this.field2477, arg1, this.field2469[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2476[arg1] = true;
            if (arg3) {
                this.field2456[arg1] = class112.method2047(arg2, false);
            }
            return;
        }
        if (this.field2482) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class150.method2677(this, 255, this.field2477, this.field2478, (byte) 0, true);
            return;
        }
        field2483.reset();
        field2483.update(arg2, 0, arg2.length);
        int var5 = (int) field2483.getValue();
        class107 var6 = new class107(Statics.method1351(arg2));
        int var7 = var6.method2115();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2120();
        }
        if (this.field2478 != var5 || this.field2473 != var8) {
            class150.method2677(this, 255, this.field2477, this.field2478, (byte) 0, true);
            return;
        }
        this.method2721(arg2);
        this.method2771();
    }

    @ObfuscatedName("eh.bu(I)V")
    public void method2771() {
        this.field2476 = new boolean[this.field2456.length];
        for (int var1 = 0; var1 < this.field2476.length; var1++) {
            this.field2476[var1] = false;
        }
        if (this.field2479 == null) {
            this.field2482 = true;
            return;
        }
        this.field2480 = -1;
        for (int var2 = 0; var2 < this.field2476.length; var2++) {
            if (this.field2458[var2] > 0) {
                class121 var3 = this.field2479;
                class148 var5 = new class148();
                var5.field2485 = 1;
                var5.field2867 = (long) var2;
                var5.field2487 = var3;
                var5.field2488 = this;
                class177 var6 = class149.field2498;
                synchronized (class149.field2498) {
                    class149.field2498.method3223(var5);
                }
                class149.method1771();
                this.field2480 = var2;
            }
        }
        if (this.field2480 == -1) {
            this.field2482 = true;
        }
    }

    @ObfuscatedName("eh.bx(II)I")
    public int method2772(int arg0) {
        if (this.field2456[arg0] != null) {
            return 100;
        } else if (this.field2476[arg0]) {
            return 100;
        } else {
            int var2 = this.field2477;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2513 != null && Statics.field2513.field2867 == var3) {
                var5 = Statics.field1110.field1862 * 99 / (Statics.field1110.field1857.length - Statics.field2513.field2523) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("eh.bj(I)I")
    public int method2773() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2456.length; var3++) {
            if (this.field2458[var3] > 0) {
                var1 += 100;
                var2 += this.method2772(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
