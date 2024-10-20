package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ez")
public class class154 extends class152 {

    @ObfuscatedName("ez.n")
    public class71 field2551;

    @ObfuscatedName("ez.q")
    public class71 field2542;

    @ObfuscatedName("ez.c")
    public int field2543;

    @ObfuscatedName("ez.h")
    public volatile boolean field2544 = false;

    @ObfuscatedName("ez.b")
    public boolean field2545 = false;

    @ObfuscatedName("ez.y")
    public volatile boolean[] field2541;

    @ObfuscatedName("ez.x")
    public static CRC32 field2547 = new CRC32();

    @ObfuscatedName("ez.ao")
    public int field2548;

    @ObfuscatedName("ez.ae")
    public int field2549;

    @ObfuscatedName("ez.aa")
    public int field2546 = -1;

    public class154(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2551 = arg0;
        this.field2542 = arg1;
        this.field2543 = arg2;
        this.field2545 = arg5;
        class153.method828(this, this.field2543);
    }

    @ObfuscatedName("ez.ca(B)I")
    public int method3062() {
        if (this.field2544) {
            return 100;
        } else if (this.field2500 == null) {
            int var1 = this.field2543;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2407 != null && Statics.field2407.field2817 == var2) {
                var4 = Statics.field1276.field2045 * 99 / (Statics.field1276.field2049.length - Statics.field2407.field2554) + 1;
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

    @ObfuscatedName("ez.w(II)V")
    public void method2993(int arg0) {
        class153.method126(this.field2543, arg0);
    }

    @ObfuscatedName("ez.a(II)V")
    public void method2978(int arg0) {
        if (this.field2551 == null || this.field2541 == null || !this.field2541[arg0]) {
            class153.method2939(this, this.field2543, arg0, this.field2504[arg0], (byte) 2, true);
            return;
        }
        class71 var2 = this.field2551;
        byte[] var4 = null;
        class177 var5 = class157.field2567;
        synchronized (class157.field2567) {
            for (class156 var6 = (class156) class157.field2567.method3294(); var6 != null; var6 = (class156) class157.field2567.method3296()) {
                if ((long) arg0 == var6.field2817 && var6.field2559 == var2 && var6.field2563 == 0) {
                    var4 = var6.field2562;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method1392(arg0);
            this.method3078(var2, arg0, var8, true);
        } else {
            this.method3078(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ez.ck(III)V")
    public void method3063(int arg0, int arg1) {
        this.field2548 = arg0;
        this.field2549 = arg1;
        if (this.field2542 == null) {
            class153.method2939(this, 255, this.field2543, this.field2548, (byte) 0, true);
            return;
        }
        int var3 = this.field2543;
        class71 var4 = this.field2542;
        byte[] var6 = null;
        class177 var7 = class157.field2567;
        synchronized (class157.field2567) {
            for (class156 var8 = (class156) class157.field2567.method3294(); var8 != null; var8 = (class156) class157.field2567.method3296()) {
                if ((long) var3 == var8.field2817 && var8.field2559 == var4 && var8.field2563 == 0) {
                    var6 = var8.field2562;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method1392(var3);
            this.method3078(var4, var3, var10, true);
        } else {
            this.method3078(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ez.cq(I[BZZI)V")
    public void method3064(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2510[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2510[arg0];
            if (this.field2551 != null) {
                class71 var12 = this.field2551;
                class156 var13 = new class156();
                var13.field2563 = 0;
                var13.field2817 = (long) arg0;
                var13.field2562 = arg1;
                var13.field2559 = var12;
                class177 var14 = class157.field2567;
                synchronized (class157.field2567) {
                    class157.field2567.method3289(var13);
                }
                Object var16 = class157.field2564;
                synchronized (class157.field2564) {
                    if (class157.field2566 == 0) {
                        Statics.field293.method1475(new class157(), 5);
                    }
                    class157.field2566 = 600;
                }
                this.field2541[arg0] = true;
            }
            if (arg3) {
                this.field2500[arg0] = class119.method2350(arg1, false);
            }
            return;
        }
        if (this.field2544) {
            throw new RuntimeException();
        }
        if (this.field2542 != null) {
            int var5 = this.field2543;
            class71 var6 = this.field2542;
            class156 var7 = new class156();
            var7.field2563 = 0;
            var7.field2817 = (long) var5;
            var7.field2562 = arg1;
            var7.field2559 = var6;
            class177 var8 = class157.field2567;
            synchronized (class157.field2567) {
                class157.field2567.method3289(var7);
            }
            Object var10 = class157.field2564;
            synchronized (class157.field2564) {
                if (class157.field2566 == 0) {
                    Statics.field293.method1475(new class157(), 5);
                }
                class157.field2566 = 600;
            }
        }
        this.method2968(arg1);
        this.method3068();
    }

    @ObfuscatedName("ez.cg(Lbk;I[BZI)V")
    public void method3078(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2542 != arg0) {
            if (!arg3 && this.field2546 == arg1) {
                this.field2544 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2541[arg1] = false;
                if (this.field2545 || arg3) {
                    class153.method2939(this, this.field2543, arg1, this.field2504[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2547.reset();
            field2547.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2547.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2504[arg1] != var9 || this.field2510[arg1] != var10) {
                this.field2541[arg1] = false;
                if (this.field2545 || arg3) {
                    class153.method2939(this, this.field2543, arg1, this.field2504[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2541[arg1] = true;
            if (arg3) {
                this.field2500[arg1] = class119.method2350(arg2, false);
            }
            return;
        }
        if (this.field2544) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class153.method2939(this, 255, this.field2543, this.field2548, (byte) 0, true);
            return;
        }
        field2547.reset();
        field2547.update(arg2, 0, arg2.length);
        int var5 = (int) field2547.getValue();
        class127 var6 = new class127(class152.method2395(arg2));
        int var7 = var6.method2472();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2457();
        }
        if (this.field2548 != var5 || this.field2549 != var8) {
            class153.method2939(this, 255, this.field2543, this.field2548, (byte) 0, true);
            return;
        }
        this.method2968(arg2);
        this.method3068();
    }

    @ObfuscatedName("ez.ct(B)V")
    public void method3068() {
        this.field2541 = new boolean[this.field2500.length];
        for (int var1 = 0; var1 < this.field2541.length; var1++) {
            this.field2541[var1] = false;
        }
        if (this.field2551 == null) {
            this.field2544 = true;
            return;
        }
        this.field2546 = -1;
        for (int var2 = 0; var2 < this.field2541.length; var2++) {
            if (this.field2513[var2] > 0) {
                class157.method2741(var2, this.field2551, this);
                this.field2546 = var2;
            }
        }
        if (this.field2546 == -1) {
            this.field2544 = true;
        }
    }

    @ObfuscatedName("ez.cc(IB)I")
    public int method3066(int arg0) {
        if (this.field2500[arg0] == null) {
            return this.field2541[arg0] ? 100 : class153.method1308(this.field2543, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ez.cx(I)I")
    public int method3065() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2500.length; var3++) {
            if (this.field2513[var3] > 0) {
                var1 += 100;
                var2 += this.method3066(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
