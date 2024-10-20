package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ey")
public class class155 extends class153 {

    @ObfuscatedName("ey.f")
    public class71 field2572;

    @ObfuscatedName("ey.y")
    public class71 field2582;

    @ObfuscatedName("ey.v")
    public int field2573;

    @ObfuscatedName("ey.w")
    public volatile boolean field2583 = false;

    @ObfuscatedName("ey.d")
    public boolean field2575 = false;

    @ObfuscatedName("ey.i")
    public volatile boolean[] field2576;

    @ObfuscatedName("ey.c")
    public static CRC32 field2577 = new CRC32();

    @ObfuscatedName("ey.af")
    public int field2578;

    @ObfuscatedName("ey.aq")
    public int field2579;

    @ObfuscatedName("ey.at")
    public int field2580 = -1;

    public class155(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2572 = arg0;
        this.field2582 = arg1;
        this.field2573 = arg2;
        this.field2575 = arg5;
        class154.method544(this, this.field2573);
    }

    @ObfuscatedName("ey.cw(I)I")
    public int method3191() {
        if (this.field2583) {
            return 100;
        } else if (this.field2540 == null) {
            int var1 = this.field2573;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2070 != null && Statics.field2070.field2823 == var2) {
                var4 = Statics.field1427.field2027 * 99 / (Statics.field1427.field2030.length - Statics.field2070.field2586) + 1;
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

    @ObfuscatedName("ey.h(II)V")
    public void method3081(int arg0) {
        class154.method223(this.field2573, arg0);
    }

    @ObfuscatedName("ey.j(II)V")
    public void method3090(int arg0) {
        if (this.field2572 == null || this.field2576 == null || !this.field2576[arg0]) {
            class154.method2918(this, this.field2573, arg0, this.field2534[arg0], (byte) 2, true);
        } else {
            class158.method2265(arg0, this.field2572, this);
        }
    }

    @ObfuscatedName("ey.ca(IIB)V")
    public void method3171(int arg0, int arg1) {
        this.field2578 = arg0;
        this.field2579 = arg1;
        if (this.field2582 == null) {
            class154.method2918(this, 255, this.field2573, this.field2578, (byte) 0, true);
        } else {
            class158.method2265(this.field2573, this.field2582, this);
        }
    }

    @ObfuscatedName("ey.cx(I[BZZB)V")
    public void method3183(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2583) {
                throw new RuntimeException();
            }
            if (this.field2582 != null) {
                class158.method2780(this.field2573, arg1, this.field2582);
            }
            this.method3079(arg1);
            this.method3177();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2535[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2535[arg0];
        if (this.field2572 != null) {
            class158.method2780(arg0, arg1, this.field2572);
            this.field2576[arg0] = true;
        }
        if (arg3) {
            this.field2540[arg0] = class119.method802(arg1, false);
        }
    }

    @ObfuscatedName("ey.ci(Lbc;I[BZI)V")
    public void method3173(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2582 != arg0) {
            if (!arg3 && this.field2580 == arg1) {
                this.field2583 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2576[arg1] = false;
                if (this.field2575 || arg3) {
                    class154.method2918(this, this.field2573, arg1, this.field2534[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2577.reset();
            field2577.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2577.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2534[arg1] != var9 || this.field2535[arg1] != var10) {
                this.field2576[arg1] = false;
                if (this.field2575 || arg3) {
                    class154.method2918(this, this.field2573, arg1, this.field2534[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2576[arg1] = true;
            if (arg3) {
                this.field2540[arg1] = class119.method802(arg2, false);
            }
            return;
        }
        if (this.field2583) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class154.method2918(this, 255, this.field2573, this.field2578, (byte) 0, true);
            return;
        }
        field2577.reset();
        field2577.update(arg2, 0, arg2.length);
        int var5 = (int) field2577.getValue();
        class127 var6 = new class127(class153.method2761(arg2));
        int var7 = var6.method2499();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2548();
        }
        if (this.field2578 != var5 || this.field2579 != var8) {
            class154.method2918(this, 255, this.field2573, this.field2578, (byte) 0, true);
            return;
        }
        this.method3079(arg2);
        this.method3177();
    }

    @ObfuscatedName("ey.cj(I)V")
    public void method3177() {
        this.field2576 = new boolean[this.field2540.length];
        for (int var1 = 0; var1 < this.field2576.length; var1++) {
            this.field2576[var1] = false;
        }
        if (this.field2572 == null) {
            this.field2583 = true;
            return;
        }
        this.field2580 = -1;
        for (int var2 = 0; var2 < this.field2576.length; var2++) {
            if (this.field2536[var2] > 0) {
                class71 var3 = this.field2572;
                class157 var5 = new class157();
                var5.field2590 = 1;
                var5.field2823 = (long) var2;
                var5.field2588 = var3;
                var5.field2591 = this;
                class177 var6 = class158.field2594;
                synchronized (class158.field2594) {
                    class158.field2594.method3381(var5);
                }
                Object var8 = class158.field2597;
                synchronized (class158.field2597) {
                    if (class158.field2595 == 0) {
                        Statics.field1295.method1521(new class158(), 5);
                    }
                    class158.field2595 = 600;
                }
                this.field2580 = var2;
            }
        }
        if (this.field2580 == -1) {
            this.field2583 = true;
        }
    }

    @ObfuscatedName("ey.cv(II)I")
    public int method3175(int arg0) {
        if (this.field2540[arg0] != null) {
            return 100;
        } else if (this.field2576[arg0]) {
            return 100;
        } else {
            int var2 = this.field2573;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2070 != null && Statics.field2070.field2823 == var3) {
                var5 = Statics.field1427.field2027 * 99 / (Statics.field1427.field2030.length - Statics.field2070.field2586) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ey.ct(I)I")
    public int method3176() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2540.length; var3++) {
            if (this.field2536[var3] > 0) {
                var1 += 100;
                var2 += this.method3175(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
