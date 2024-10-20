package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fc")
public class class162 extends class161 {

    @ObfuscatedName("fc.h")
    public class129 field2615;

    @ObfuscatedName("fc.p")
    public class129 field2613;

    @ObfuscatedName("fc.c")
    public int field2622;

    @ObfuscatedName("fc.x")
    public volatile boolean field2616 = false;

    @ObfuscatedName("fc.q")
    public boolean field2617 = false;

    @ObfuscatedName("fc.b")
    public volatile boolean[] field2618;

    @ObfuscatedName("fc.k")
    public static CRC32 field2619 = new CRC32();

    @ObfuscatedName("fc.at")
    public int field2620;

    @ObfuscatedName("fc.au")
    public int field2621;

    @ObfuscatedName("fc.aa")
    public int field2614 = -1;

    public class162(class129 arg0, class129 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2615 = arg0;
        this.field2613 = arg1;
        this.field2622 = arg2;
        this.field2617 = arg5;
        class165.method2637(this, this.field2622);
    }

    @ObfuscatedName("fc.ca(I)I")
    public int method3057() {
        if (this.field2616) {
            return 100;
        } else if (this.field2604 == null) {
            int var1 = this.field2622;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1509 != null && Statics.field1509.field3043 == var2) {
                var4 = Statics.field1921.field1894 * 99 / (Statics.field1921.field1891.length - Statics.field1509.field2662) + 1;
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

    @ObfuscatedName("fc.y(II)V")
    public void method2978(int arg0) {
        Statics.method2888(this.field2622, arg0);
    }

    @ObfuscatedName("fc.u(IS)V")
    public void method3004(int arg0) {
        if (this.field2615 == null || this.field2618 == null || !this.field2618[arg0]) {
            class165.method3421(this, this.field2622, arg0, this.field2598[arg0], (byte) 2, true);
        } else {
            class164.method727(arg0, this.field2615, this);
        }
    }

    @ObfuscatedName("fc.cz(IIB)V")
    public void method3063(int arg0, int arg1) {
        this.field2620 = arg0;
        this.field2621 = arg1;
        if (this.field2613 == null) {
            class165.method3421(this, 255, this.field2622, this.field2620, (byte) 0, true);
        } else {
            class164.method727(this.field2622, this.field2613, this);
        }
    }

    @ObfuscatedName("fc.cc(I[BZZB)V")
    public void method3065(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2616) {
                throw new RuntimeException();
            }
            if (this.field2613 != null) {
                class164.method1(this.field2622, arg1, this.field2613);
            }
            this.method2977(arg1);
            this.method3061();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2599[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2599[arg0];
        if (this.field2615 != null) {
            class164.method1(arg0, arg1, this.field2615);
            this.field2618[arg0] = true;
        }
        if (arg3) {
            this.field2604[arg0] = class120.method1574(arg1, false);
        }
    }

    @ObfuscatedName("fc.ci(Ldw;I[BZB)V")
    public void method3060(class129 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2613 != arg0) {
            if (!arg3 && this.field2614 == arg1) {
                this.field2616 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2618[arg1] = false;
                if (this.field2617 || arg3) {
                    class165.method3421(this, this.field2622, arg1, this.field2598[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2619.reset();
            field2619.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2619.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2598[arg1] != var9 || this.field2599[arg1] != var10) {
                this.field2618[arg1] = false;
                if (this.field2617 || arg3) {
                    class165.method3421(this, this.field2622, arg1, this.field2598[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2618[arg1] = true;
            if (arg3) {
                this.field2604[arg1] = class120.method1574(arg2, false);
            }
            return;
        }
        if (this.field2616) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class165.method3421(this, 255, this.field2622, this.field2620, (byte) 0, true);
            return;
        }
        field2619.reset();
        field2619.update(arg2, 0, arg2.length);
        int var5 = (int) field2619.getValue();
        class114 var6 = new class114(class161.method978(arg2));
        int var7 = var6.method2322();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2622 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2327();
        }
        if (this.field2620 != var5 || this.field2621 != var8) {
            class165.method3421(this, 255, this.field2622, this.field2620, (byte) 0, true);
            return;
        }
        this.method2977(arg2);
        this.method3061();
    }

    @ObfuscatedName("fc.ce(I)V")
    public void method3061() {
        this.field2618 = new boolean[this.field2604.length];
        for (int var1 = 0; var1 < this.field2618.length; var1++) {
            this.field2618[var1] = false;
        }
        if (this.field2615 == null) {
            this.field2616 = true;
            return;
        }
        this.field2614 = -1;
        for (int var2 = 0; var2 < this.field2618.length; var2++) {
            if (this.field2600[var2] > 0) {
                Statics.method2877(var2, this.field2615, this);
                this.field2614 = var2;
            }
        }
        if (this.field2614 == -1) {
            this.field2616 = true;
        }
    }

    @ObfuscatedName("fc.ch(IB)I")
    public int method3062(int arg0) {
        if (this.field2604[arg0] != null) {
            return 100;
        } else if (this.field2618[arg0]) {
            return 100;
        } else {
            int var2 = this.field2622;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1509 != null && Statics.field1509.field3043 == var3) {
                var5 = Statics.field1921.field1894 * 99 / (Statics.field1921.field1891.length - Statics.field1509.field2662) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fc.cq(I)I")
    public int method3059() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2604.length; var3++) {
            if (this.field2600[var3] > 0) {
                var1 += 100;
                var2 += this.method3062(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
