package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eu")
public class class155 extends class153 {

    @ObfuscatedName("eu.k")
    public class71 field2572;

    @ObfuscatedName("eu.t")
    public class71 field2570;

    @ObfuscatedName("eu.f")
    public int field2565;

    @ObfuscatedName("eu.h")
    public volatile boolean field2566 = false;

    @ObfuscatedName("eu.j")
    public boolean field2564 = false;

    @ObfuscatedName("eu.q")
    public volatile boolean[] field2568;

    @ObfuscatedName("eu.z")
    public static CRC32 field2569 = new CRC32();

    @ObfuscatedName("eu.af")
    public int field2567;

    @ObfuscatedName("eu.ap")
    public int field2571;

    @ObfuscatedName("eu.ah")
    public int field2563 = -1;

    public class155(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2572 = arg0;
        this.field2570 = arg1;
        this.field2565 = arg2;
        this.field2564 = arg5;
        int var8 = this.field2565;
        if (Statics.field206 == null) {
            class154.method744((class155) null, 255, 255, 0, (byte) 0, true);
            class154.field2543[var8] = this;
        } else {
            Statics.field206.field2030 = var8 * 8 + 5;
            int var9 = Statics.field206.method2489();
            int var10 = Statics.field206.method2489();
            this.method3203(var9, var10);
        }
    }

    @ObfuscatedName("eu.cj(B)I")
    public int method3181() {
        if (this.field2566) {
            return 100;
        } else if (this.field2539 == null) {
            int var1 = class154.method2937(255, this.field2565);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("eu.l(II)V")
    public void method3146(int arg0) {
        int var2 = this.field2565;
        long var3 = (long) ((var2 << 16) + arg0);
        class156 var5 = (class156) class154.field2551.method3405(var3);
        if (var5 != null) {
            class154.field2562.method3372(var5);
        }
    }

    @ObfuscatedName("eu.u(IB)V")
    public void method3086(int arg0) {
        if (this.field2572 == null || this.field2568 == null || !this.field2568[arg0]) {
            class154.method744(this, this.field2565, arg0, this.field2528[arg0], (byte) 2, true);
        } else {
            class158.method2765(arg0, this.field2572, this);
        }
    }

    @ObfuscatedName("eu.ce(IIB)V")
    public void method3203(int arg0, int arg1) {
        this.field2567 = arg0;
        this.field2571 = arg1;
        if (this.field2570 == null) {
            class154.method744(this, 255, this.field2565, this.field2567, (byte) 0, true);
        } else {
            class158.method2765(this.field2565, this.field2570, this);
        }
    }

    @ObfuscatedName("eu.cu(I[BZZI)V")
    public void method3183(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2566) {
                throw new RuntimeException();
            }
            if (this.field2570 != null) {
                class158.method3074(this.field2565, arg1, this.field2570);
            }
            this.method3076(arg1);
            this.method3189();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2536[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2536[arg0];
        if (this.field2572 != null) {
            class158.method3074(arg0, arg1, this.field2572);
            this.field2568[arg0] = true;
        }
        if (arg3) {
            this.field2539[arg0] = class119.method1425(arg1, false);
        }
    }

    @ObfuscatedName("eu.cz(Lbp;I[BZI)V")
    public void method3185(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2570 != arg0) {
            if (!arg3 && this.field2563 == arg1) {
                this.field2566 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2568[arg1] = false;
                if (this.field2564 || arg3) {
                    class154.method744(this, this.field2565, arg1, this.field2528[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2569.reset();
            field2569.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2569.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2528[arg1] != var9 || this.field2536[arg1] != var10) {
                this.field2568[arg1] = false;
                if (this.field2564 || arg3) {
                    class154.method744(this, this.field2565, arg1, this.field2528[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2568[arg1] = true;
            if (arg3) {
                this.field2539[arg1] = class119.method1425(arg2, false);
            }
            return;
        }
        if (this.field2566) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class154.method744(this, 255, this.field2565, this.field2567, (byte) 0, true);
            return;
        }
        field2569.reset();
        field2569.update(arg2, 0, arg2.length);
        int var5 = (int) field2569.getValue();
        class127 var6 = new class127(class153.method244(arg2));
        int var7 = var6.method2498();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2489();
        }
        if (this.field2567 != var5 || this.field2571 != var8) {
            class154.method744(this, 255, this.field2565, this.field2567, (byte) 0, true);
            return;
        }
        this.method3076(arg2);
        this.method3189();
    }

    @ObfuscatedName("eu.cv(I)V")
    public void method3189() {
        this.field2568 = new boolean[this.field2539.length];
        for (int var1 = 0; var1 < this.field2568.length; var1++) {
            this.field2568[var1] = false;
        }
        if (this.field2572 == null) {
            this.field2566 = true;
            return;
        }
        this.field2563 = -1;
        for (int var2 = 0; var2 < this.field2568.length; var2++) {
            if (this.field2530[var2] > 0) {
                class158.method3044(var2, this.field2572, this);
                this.field2563 = var2;
            }
        }
        if (this.field2563 == -1) {
            this.field2566 = true;
        }
    }

    @ObfuscatedName("eu.ct(IB)I")
    public int method3186(int arg0) {
        if (this.field2539[arg0] == null) {
            return this.field2568[arg0] ? 100 : class154.method2937(this.field2565, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("eu.ch(I)I")
    public int method3187() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2539.length; var3++) {
            if (this.field2530[var3] > 0) {
                var1 += 100;
                var2 += this.method3186(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
