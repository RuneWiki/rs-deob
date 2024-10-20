package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eo")
public class class154 extends class152 {

    @ObfuscatedName("eo.j")
    public class71 field2542;

    @ObfuscatedName("eo.h")
    public class71 field2543;

    @ObfuscatedName("eo.m")
    public int field2544;

    @ObfuscatedName("eo.y")
    public volatile boolean field2545 = false;

    @ObfuscatedName("eo.t")
    public boolean field2553 = false;

    @ObfuscatedName("eo.k")
    public volatile boolean[] field2547;

    @ObfuscatedName("eo.z")
    public static CRC32 field2548 = new CRC32();

    @ObfuscatedName("eo.at")
    public int field2549;

    @ObfuscatedName("eo.ay")
    public int field2550;

    @ObfuscatedName("eo.ae")
    public int field2551 = -1;

    public class154(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2542 = arg0;
        this.field2543 = arg1;
        this.field2544 = arg2;
        this.field2553 = arg5;
        class153.method664(this, this.field2544);
    }

    @ObfuscatedName("eo.bz(I)I")
    public int method3085() {
        if (this.field2545) {
            return 100;
        } else if (this.field2513 == null) {
            int var1 = this.field2544;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1935 != null && Statics.field1935.field2820 == var2) {
                var4 = Statics.field1517.field2038 * 99 / (Statics.field1517.field2037.length - Statics.field1935.field2558) + 1;
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

    @ObfuscatedName("eo.i(IS)V")
    public void method3066(int arg0) {
        Statics.method2964(this.field2544, arg0);
    }

    @ObfuscatedName("eo.r(II)V")
    public void method3006(int arg0) {
        if (this.field2542 == null || this.field2547 == null || !this.field2547[arg0]) {
            Statics.method2352(this, this.field2544, arg0, this.field2519[arg0], (byte) 2, true);
            return;
        }
        class71 var2 = this.field2542;
        byte[] var4 = null;
        class177 var5 = class157.field2567;
        synchronized (class157.field2567) {
            for (class156 var6 = (class156) class157.field2567.method3334(); var6 != null; var6 = (class156) class157.field2567.method3355()) {
                if ((long) arg0 == var6.field2820 && var6.field2563 == var2 && var6.field2561 == 0) {
                    var4 = var6.field2562;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method1437(arg0);
            this.method3086(var2, arg0, var8, true);
        } else {
            this.method3086(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("eo.bc(III)V")
    public void method3084(int arg0, int arg1) {
        this.field2549 = arg0;
        this.field2550 = arg1;
        if (this.field2543 == null) {
            Statics.method2352(this, 255, this.field2544, this.field2549, (byte) 0, true);
            return;
        }
        int var3 = this.field2544;
        class71 var4 = this.field2543;
        byte[] var6 = null;
        class177 var7 = class157.field2567;
        synchronized (class157.field2567) {
            for (class156 var8 = (class156) class157.field2567.method3334(); var8 != null; var8 = (class156) class157.field2567.method3355()) {
                if ((long) var3 == var8.field2820 && var8.field2563 == var4 && var8.field2561 == 0) {
                    var6 = var8.field2562;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method1437(var3);
            this.method3086(var4, var3, var10, true);
        } else {
            this.method3086(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("eo.ce(I[BZZI)V")
    public void method3100(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2511[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2511[arg0];
            if (this.field2542 != null) {
                class71 var10 = this.field2542;
                class156 var11 = new class156();
                var11.field2561 = 0;
                var11.field2820 = (long) arg0;
                var11.field2562 = arg1;
                var11.field2563 = var10;
                class177 var12 = class157.field2567;
                synchronized (class157.field2567) {
                    class157.field2567.method3328(var11);
                }
                class157.method577();
                this.field2547[arg0] = true;
            }
            if (arg3) {
                this.field2513[arg0] = class119.method626(arg1, false);
            }
            return;
        }
        if (this.field2545) {
            throw new RuntimeException();
        }
        if (this.field2543 != null) {
            int var5 = this.field2544;
            class71 var6 = this.field2543;
            class156 var7 = new class156();
            var7.field2561 = 0;
            var7.field2820 = (long) var5;
            var7.field2562 = arg1;
            var7.field2563 = var6;
            class177 var8 = class157.field2567;
            synchronized (class157.field2567) {
                class157.field2567.method3328(var7);
            }
            class157.method577();
        }
        this.method2997(arg1);
        this.method3083();
    }

    @ObfuscatedName("eo.cd(Lbu;I[BZB)V")
    public void method3086(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2543 != arg0) {
            if (!arg3 && this.field2551 == arg1) {
                this.field2545 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2547[arg1] = false;
                if (this.field2553 || arg3) {
                    Statics.method2352(this, this.field2544, arg1, this.field2519[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2548.reset();
            field2548.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2548.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2519[arg1] != var9 || this.field2511[arg1] != var10) {
                this.field2547[arg1] = false;
                if (this.field2553 || arg3) {
                    Statics.method2352(this, this.field2544, arg1, this.field2519[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2547[arg1] = true;
            if (arg3) {
                this.field2513[arg1] = class119.method626(arg2, false);
            }
            return;
        }
        if (this.field2545) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            Statics.method2352(this, 255, this.field2544, this.field2549, (byte) 0, true);
            return;
        }
        field2548.reset();
        field2548.update(arg2, 0, arg2.length);
        int var5 = (int) field2548.getValue();
        class127 var6 = new class127(class152.method2390(arg2));
        int var7 = var6.method2659();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2551();
        }
        if (this.field2549 != var5 || this.field2550 != var8) {
            Statics.method2352(this, 255, this.field2544, this.field2549, (byte) 0, true);
            return;
        }
        this.method2997(arg2);
        this.method3083();
    }

    @ObfuscatedName("eo.cg(I)V")
    public void method3083() {
        this.field2547 = new boolean[this.field2513.length];
        for (int var1 = 0; var1 < this.field2547.length; var1++) {
            this.field2547[var1] = false;
        }
        if (this.field2542 == null) {
            this.field2545 = true;
            return;
        }
        this.field2551 = -1;
        for (int var2 = 0; var2 < this.field2547.length; var2++) {
            if (this.field2512[var2] > 0) {
                class71 var3 = this.field2542;
                class156 var5 = new class156();
                var5.field2561 = 1;
                var5.field2820 = (long) var2;
                var5.field2563 = var3;
                var5.field2564 = this;
                class177 var6 = class157.field2567;
                synchronized (class157.field2567) {
                    class157.field2567.method3328(var5);
                }
                class157.method577();
                this.field2551 = var2;
            }
        }
        if (this.field2551 == -1) {
            this.field2545 = true;
        }
    }

    @ObfuscatedName("eo.cl(IB)I")
    public int method3092(int arg0) {
        if (this.field2513[arg0] != null) {
            return 100;
        } else if (this.field2547[arg0]) {
            return 100;
        } else {
            int var2 = this.field2544;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1935 != null && Statics.field1935.field2820 == var3) {
                var5 = Statics.field1517.field2038 * 99 / (Statics.field1517.field2037.length - Statics.field1935.field2558) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("eo.cw(I)I")
    public int method3087() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2513.length; var3++) {
            if (this.field2512[var3] > 0) {
                var1 += 100;
                var2 += this.method3092(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
