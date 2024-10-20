package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eq")
public class class155 extends class153 {

    @ObfuscatedName("eq.o")
    public class71 field2580;

    @ObfuscatedName("eq.r")
    public class71 field2570;

    @ObfuscatedName("eq.k")
    public int field2571;

    @ObfuscatedName("eq.w")
    public volatile boolean field2575 = false;

    @ObfuscatedName("eq.e")
    public boolean field2573 = false;

    @ObfuscatedName("eq.p")
    public volatile boolean[] field2574;

    @ObfuscatedName("eq.i")
    public static CRC32 field2583 = new CRC32();

    @ObfuscatedName("eq.ap")
    public int field2576;

    @ObfuscatedName("eq.as")
    public int field2577;

    @ObfuscatedName("eq.ak")
    public int field2578 = -1;

    public class155(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2580 = arg0;
        this.field2570 = arg1;
        this.field2571 = arg2;
        this.field2573 = arg5;
        class154.method27(this, this.field2571);
    }

    @ObfuscatedName("eq.bh(I)I")
    public int method2974() {
        if (this.field2575) {
            return 100;
        } else if (this.field2538 == null) {
            int var1 = class154.method226(255, this.field2571);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("eq.q(II)V")
    public void method2885(int arg0) {
        class154.method147(this.field2571, arg0);
    }

    @ObfuscatedName("eq.t(II)V")
    public void method2894(int arg0) {
        if (this.field2580 == null || this.field2574 == null || !this.field2574[arg0]) {
            class154.method161(this, this.field2571, arg0, this.field2531[arg0], (byte) 2, true);
            return;
        }
        class71 var2 = this.field2580;
        byte[] var4 = null;
        class177 var5 = class158.field2601;
        synchronized (class158.field2601) {
            for (class157 var6 = (class157) class158.field2601.method3163(); var6 != null; var6 = (class157) class158.field2601.method3165()) {
                if ((long) arg0 == var6.field2824 && var6.field2589 == var2 && var6.field2591 == 0) {
                    var4 = var6.field2590;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method1351(arg0);
            this.method2977(var2, arg0, var8, true);
        } else {
            this.method2977(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("eq.bq(III)V")
    public void method2975(int arg0, int arg1) {
        this.field2576 = arg0;
        this.field2577 = arg1;
        if (this.field2570 == null) {
            class154.method161(this, 255, this.field2571, this.field2576, (byte) 0, true);
            return;
        }
        int var3 = this.field2571;
        class71 var4 = this.field2570;
        byte[] var6 = null;
        class177 var7 = class158.field2601;
        synchronized (class158.field2601) {
            for (class157 var8 = (class157) class158.field2601.method3163(); var8 != null; var8 = (class157) class158.field2601.method3165()) {
                if ((long) var3 == var8.field2824 && var8.field2589 == var4 && var8.field2591 == 0) {
                    var6 = var8.field2590;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method1351(var3);
            this.method2977(var4, var3, var10, true);
        } else {
            this.method2977(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("eq.bj(I[BZZI)V")
    public void method2976(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2575) {
                throw new RuntimeException();
            }
            if (this.field2570 != null) {
                class158.method1963(this.field2571, arg1, this.field2570);
            }
            this.method2914(arg1);
            this.method2981();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2532[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2532[arg0];
        if (this.field2580 != null) {
            class158.method1963(arg0, arg1, this.field2580);
            this.field2574[arg0] = true;
        }
        if (arg3) {
            this.field2538[arg0] = class119.method858(arg1, false);
        }
    }

    @ObfuscatedName("eq.co(Lbn;I[BZI)V")
    public void method2977(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2570 != arg0) {
            if (!arg3 && this.field2578 == arg1) {
                this.field2575 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2574[arg1] = false;
                if (this.field2573 || arg3) {
                    class154.method161(this, this.field2571, arg1, this.field2531[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2583.reset();
            field2583.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2583.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2531[arg1] != var9 || this.field2532[arg1] != var10) {
                this.field2574[arg1] = false;
                if (this.field2573 || arg3) {
                    class154.method161(this, this.field2571, arg1, this.field2531[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2574[arg1] = true;
            if (arg3) {
                this.field2538[arg1] = class119.method858(arg2, false);
            }
            return;
        }
        if (this.field2575) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class154.method161(this, 255, this.field2571, this.field2576, (byte) 0, true);
            return;
        }
        field2583.reset();
        field2583.update(arg2, 0, arg2.length);
        int var5 = (int) field2583.getValue();
        class127 var6 = new class127(class153.method730(arg2));
        int var7 = var6.method2383();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2323();
        }
        if (this.field2576 != var5 || this.field2577 != var8) {
            class154.method161(this, 255, this.field2571, this.field2576, (byte) 0, true);
            return;
        }
        this.method2914(arg2);
        this.method2981();
    }

    @ObfuscatedName("eq.ce(I)V")
    public void method2981() {
        this.field2574 = new boolean[this.field2538.length];
        for (int var1 = 0; var1 < this.field2574.length; var1++) {
            this.field2574[var1] = false;
        }
        if (this.field2580 == null) {
            this.field2575 = true;
            return;
        }
        this.field2578 = -1;
        for (int var2 = 0; var2 < this.field2574.length; var2++) {
            if (this.field2533[var2] > 0) {
                class71 var3 = this.field2580;
                class157 var5 = new class157();
                var5.field2591 = 1;
                var5.field2824 = (long) var2;
                var5.field2589 = var3;
                var5.field2592 = this;
                class177 var6 = class158.field2601;
                synchronized (class158.field2601) {
                    class158.field2601.method3158(var5);
                }
                class158.method1506();
                this.field2578 = var2;
            }
        }
        if (this.field2578 == -1) {
            this.field2575 = true;
        }
    }

    @ObfuscatedName("eq.cf(II)I")
    public int method2979(int arg0) {
        if (this.field2538[arg0] == null) {
            return this.field2574[arg0] ? 100 : class154.method226(this.field2571, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("eq.cr(B)I")
    public int method2980() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2538.length; var3++) {
            if (this.field2533[var3] > 0) {
                var1 += 100;
                var2 += this.method2979(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
