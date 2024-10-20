package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ef")
public class class153 extends class151 {

    @ObfuscatedName("ef.s")
    public class70 field2525;

    @ObfuscatedName("ef.f")
    public class70 field2533;

    @ObfuscatedName("ef.y")
    public int field2527;

    @ObfuscatedName("ef.t")
    public volatile boolean field2528 = false;

    @ObfuscatedName("ef.r")
    public boolean field2529 = false;

    @ObfuscatedName("ef.p")
    public volatile boolean[] field2530;

    @ObfuscatedName("ef.o")
    public static CRC32 field2531 = new CRC32();

    @ObfuscatedName("ef.ax")
    public int field2534;

    @ObfuscatedName("ef.aa")
    public int field2526;

    @ObfuscatedName("ef.af")
    public int field2532 = -1;

    public class153(class70 arg0, class70 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2525 = arg0;
        this.field2533 = arg1;
        this.field2527 = arg2;
        this.field2529 = arg5;
        int var8 = this.field2527;
        if (Statics.field180 == null) {
            class152.method1850((class153) null, 255, 255, 0, (byte) 0, true);
            class152.field2524[var8] = this;
        } else {
            Statics.field180.field2024 = var8 * 8 + 5;
            int var9 = Statics.field180.method2526();
            int var10 = Statics.field180.method2526();
            this.method3061(var9, var10);
        }
    }

    @ObfuscatedName("ef.cs(I)I")
    public int method3076() {
        if (this.field2528) {
            return 100;
        } else if (this.field2495 == null) {
            int var1 = this.field2527;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1905 != null && Statics.field1905.field2808 == var2) {
                var4 = Statics.field2326.field2024 * 99 / (Statics.field2326.field2022.length - Statics.field1905.field2538) + 1;
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

    @ObfuscatedName("ef.k(IB)V")
    public void method2964(int arg0) {
        int var2 = this.field2527;
        long var3 = (long) ((var2 << 16) + arg0);
        class154 var5 = (class154) class152.field2511.method3311(var3);
        if (var5 != null) {
            class152.field2510.method3272(var5);
        }
    }

    @ObfuscatedName("ef.w(IB)V")
    public void method2973(int arg0) {
        if (this.field2525 == null || this.field2530 == null || !this.field2530[arg0]) {
            class152.method1850(this, this.field2527, arg0, this.field2489[arg0], (byte) 2, true);
            return;
        }
        class70 var2 = this.field2525;
        byte[] var4 = null;
        class176 var5 = class156.field2551;
        synchronized (class156.field2551) {
            for (class155 var6 = (class155) class156.field2551.method3326(); var6 != null; var6 = (class155) class156.field2551.method3330()) {
                if ((long) arg0 == var6.field2808 && var6.field2546 == var2 && var6.field2547 == 0) {
                    var4 = var6.field2545;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method1395(arg0);
            this.method3063(var2, arg0, var8, true);
        } else {
            this.method3063(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ef.cf(III)V")
    public void method3061(int arg0, int arg1) {
        this.field2534 = arg0;
        this.field2526 = arg1;
        if (this.field2533 == null) {
            class152.method1850(this, 255, this.field2527, this.field2534, (byte) 0, true);
        } else {
            class156.method2684(this.field2527, this.field2533, this);
        }
    }

    @ObfuscatedName("ef.cr(I[BZZS)V")
    public void method3073(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2528) {
                throw new RuntimeException();
            }
            if (this.field2533 != null) {
                class156.method1673(this.field2527, arg1, this.field2533);
            }
            this.method2963(arg1);
            this.method3064();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2502[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2502[arg0];
        if (this.field2525 != null) {
            class156.method1673(arg0, arg1, this.field2525);
            this.field2530[arg0] = true;
        }
        if (arg3) {
            this.field2495[arg0] = class118.method1641(arg1, false);
        }
    }

    @ObfuscatedName("ef.ch(Lbk;I[BZI)V")
    public void method3063(class70 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2533 != arg0) {
            if (!arg3 && this.field2532 == arg1) {
                this.field2528 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2530[arg1] = false;
                if (this.field2529 || arg3) {
                    class152.method1850(this, this.field2527, arg1, this.field2489[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2531.reset();
            field2531.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2531.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2489[arg1] != var9 || this.field2502[arg1] != var10) {
                this.field2530[arg1] = false;
                if (this.field2529 || arg3) {
                    class152.method1850(this, this.field2527, arg1, this.field2489[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2530[arg1] = true;
            if (arg3) {
                this.field2495[arg1] = class118.method1641(arg2, false);
            }
            return;
        }
        if (this.field2528) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class152.method1850(this, 255, this.field2527, this.field2534, (byte) 0, true);
            return;
        }
        field2531.reset();
        field2531.update(arg2, 0, arg2.length);
        int var5 = (int) field2531.getValue();
        class126 var6 = new class126(class151.method2679(arg2));
        int var7 = var6.method2559();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2526();
        }
        if (this.field2534 != var5 || this.field2526 != var8) {
            class152.method1850(this, 255, this.field2527, this.field2534, (byte) 0, true);
            return;
        }
        this.method2963(arg2);
        this.method3064();
    }

    @ObfuscatedName("ef.ca(I)V")
    public void method3064() {
        this.field2530 = new boolean[this.field2495.length];
        for (int var1 = 0; var1 < this.field2530.length; var1++) {
            this.field2530[var1] = false;
        }
        if (this.field2525 == null) {
            this.field2528 = true;
            return;
        }
        this.field2532 = -1;
        for (int var2 = 0; var2 < this.field2530.length; var2++) {
            if (this.field2490[var2] > 0) {
                class70 var3 = this.field2525;
                class155 var5 = new class155();
                var5.field2547 = 1;
                var5.field2808 = (long) var2;
                var5.field2546 = var3;
                var5.field2548 = this;
                class176 var6 = class156.field2551;
                synchronized (class156.field2551) {
                    class156.field2551.method3323(var5);
                }
                class156.method131();
                this.field2532 = var2;
            }
        }
        if (this.field2532 == -1) {
            this.field2528 = true;
        }
    }

    @ObfuscatedName("ef.ce(IS)I")
    public int method3065(int arg0) {
        if (this.field2495[arg0] != null) {
            return 100;
        } else if (this.field2530[arg0]) {
            return 100;
        } else {
            int var2 = this.field2527;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1905 != null && Statics.field1905.field2808 == var3) {
                var5 = Statics.field2326.field2024 * 99 / (Statics.field2326.field2022.length - Statics.field1905.field2538) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ef.cb(I)I")
    public int method3069() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2495.length; var3++) {
            if (this.field2490[var3] > 0) {
                var1 += 100;
                var2 += this.method3065(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
