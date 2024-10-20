package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fl")
public class class159 extends class158 {

    @ObfuscatedName("fl.m")
    public class126 field2603;

    @ObfuscatedName("fl.a")
    public class126 field2605;

    @ObfuscatedName("fl.p")
    public int field2601;

    @ObfuscatedName("fl.c")
    public volatile boolean field2602 = false;

    @ObfuscatedName("fl.u")
    public boolean field2600 = false;

    @ObfuscatedName("fl.d")
    public volatile boolean[] field2606;

    @ObfuscatedName("fl.o")
    public static CRC32 field2604 = new CRC32();

    @ObfuscatedName("fl.aj")
    public int field2611;

    @ObfuscatedName("fl.au")
    public int field2599;

    @ObfuscatedName("fl.ah")
    public int field2608 = -1;

    public class159(class126 arg0, class126 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2603 = arg0;
        this.field2605 = arg1;
        this.field2601 = arg2;
        this.field2600 = arg5;
        class162.method2864(this, this.field2601);
    }

    @ObfuscatedName("fl.bw(I)I")
    public int method2947() {
        if (this.field2602) {
            return 100;
        } else if (this.field2592 == null) {
            int var1 = class162.method2484(255, this.field2601);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("fl.k(II)V")
    public void method2909(int arg0) {
        class162.method5(this.field2601, arg0);
    }

    @ObfuscatedName("fl.f(II)V")
    public void method2910(int arg0) {
        if (this.field2603 == null || this.field2606 == null || !this.field2606[arg0]) {
            class162.method2816(this, this.field2601, arg0, this.field2598[arg0], (byte) 2, true);
        } else {
            class161.method1082(arg0, this.field2603, this);
        }
    }

    @ObfuscatedName("fl.cj(IIB)V")
    public void method2965(int arg0, int arg1) {
        this.field2611 = arg0;
        this.field2599 = arg1;
        if (this.field2605 == null) {
            class162.method2816(this, 255, this.field2601, this.field2611, (byte) 0, true);
        } else {
            class161.method1082(this.field2601, this.field2605, this);
        }
    }

    @ObfuscatedName("fl.cr(I[BZZB)V")
    public void method2950(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2583[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2583[arg0];
            if (this.field2603 != null) {
                class161.method1983(arg0, arg1, this.field2603);
                this.field2606[arg0] = true;
            }
            if (arg3) {
                this.field2592[arg0] = class117.method1800(arg1, false);
            }
            return;
        }
        if (this.field2602) {
            throw new RuntimeException();
        }
        if (this.field2605 != null) {
            int var5 = this.field2601;
            class126 var6 = this.field2605;
            class160 var7 = new class160();
            var7.field2613 = 0;
            var7.field3024 = (long) var5;
            var7.field2620 = arg1;
            var7.field2614 = var6;
            class190 var8 = class161.field2626;
            synchronized (class161.field2626) {
                class161.field2626.method3391(var7);
            }
            Object var10 = class161.field2624;
            synchronized (class161.field2624) {
                if (class161.field2623 == 0) {
                    Statics.field1483.method2541(new class161(), 5);
                }
                class161.field2623 = 600;
            }
        }
        this.method2885(arg1);
        this.method2959();
    }

    @ObfuscatedName("fl.ck(Ldz;I[BZB)V")
    public void method2949(class126 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2605 != arg0) {
            if (!arg3 && this.field2608 == arg1) {
                this.field2602 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2606[arg1] = false;
                if (this.field2600 || arg3) {
                    class162.method2816(this, this.field2601, arg1, this.field2598[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2604.reset();
            field2604.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2604.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2598[arg1] != var9 || this.field2583[arg1] != var10) {
                this.field2606[arg1] = false;
                if (this.field2600 || arg3) {
                    class162.method2816(this, this.field2601, arg1, this.field2598[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2606[arg1] = true;
            if (arg3) {
                this.field2592[arg1] = class117.method1800(arg2, false);
            }
            return;
        }
        if (this.field2602) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class162.method2816(this, 255, this.field2601, this.field2611, (byte) 0, true);
            return;
        }
        field2604.reset();
        field2604.update(arg2, 0, arg2.length);
        int var5 = (int) field2604.getValue();
        class111 var6 = new class111(class158.method1993(arg2));
        int var7 = var6.method2205();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2601 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2165();
        }
        if (this.field2611 != var5 || this.field2599 != var8) {
            class162.method2816(this, 255, this.field2601, this.field2611, (byte) 0, true);
            return;
        }
        this.method2885(arg2);
        this.method2959();
    }

    @ObfuscatedName("fl.cd(B)V")
    public void method2959() {
        this.field2606 = new boolean[this.field2592.length];
        for (int var1 = 0; var1 < this.field2606.length; var1++) {
            this.field2606[var1] = false;
        }
        if (this.field2603 == null) {
            this.field2602 = true;
            return;
        }
        this.field2608 = -1;
        for (int var2 = 0; var2 < this.field2606.length; var2++) {
            if (this.field2584[var2] > 0) {
                class126 var3 = this.field2603;
                class160 var5 = new class160();
                var5.field2613 = 1;
                var5.field3024 = (long) var2;
                var5.field2614 = var3;
                var5.field2615 = this;
                class190 var6 = class161.field2626;
                synchronized (class161.field2626) {
                    class161.field2626.method3391(var5);
                }
                Object var8 = class161.field2624;
                synchronized (class161.field2624) {
                    if (class161.field2623 == 0) {
                        Statics.field1483.method2541(new class161(), 5);
                    }
                    class161.field2623 = 600;
                }
                this.field2608 = var2;
            }
        }
        if (this.field2608 == -1) {
            this.field2602 = true;
        }
    }

    @ObfuscatedName("fl.cg(IS)I")
    public int method2960(int arg0) {
        if (this.field2592[arg0] == null) {
            return this.field2606[arg0] ? 100 : class162.method2484(this.field2601, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fl.cu(I)I")
    public int method2952() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2592.length; var3++) {
            if (this.field2584[var3] > 0) {
                var1 += 100;
                var2 += this.method2960(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
