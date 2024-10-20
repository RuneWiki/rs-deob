package deob;

import java.util.zip.CRC32;

@ObfuscatedName("gn")
public class class185 extends class183 {

    @ObfuscatedName("gn.b")
    public class117 field2735;

    @ObfuscatedName("gn.t")
    public class117 field2729;

    @ObfuscatedName("gn.z")
    public int field2730;

    @ObfuscatedName("gn.p")
    public volatile boolean field2731 = false;

    @ObfuscatedName("gn.n")
    public boolean field2734 = false;

    @ObfuscatedName("gn.a")
    public volatile boolean[] field2733;

    @ObfuscatedName("gn.o")
    public static CRC32 field2732 = new CRC32();

    @ObfuscatedName("gn.an")
    public int field2736;

    @ObfuscatedName("gn.ar")
    public int field2728;

    @ObfuscatedName("gn.aa")
    public int field2737 = -1;

    public class185(class117 arg0, class117 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2735 = arg0;
        this.field2729 = arg1;
        this.field2730 = arg2;
        this.field2734 = arg5;
        class186.method1856(this, this.field2730);
    }

    @ObfuscatedName("gn.cc(B)I")
    public int method3198() {
        if (this.field2731) {
            return 100;
        } else if (this.field2708 == null) {
            int var1 = this.field2730;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2809 != null && Statics.field2809.field1885 == var2) {
                var4 = Statics.field1197.field2086 * 99 / (Statics.field1197.field2091.length - Statics.field2809.field2695) + 1;
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

    @ObfuscatedName("gn.j(II)V")
    public void method3100(int arg0) {
        int var2 = this.field2730;
        long var3 = (long) ((var2 << 16) + arg0);
        class182 var5 = (class182) class186.field2758.method2247(var3);
        if (var5 != null) {
            class186.field2748.method2178(var5);
        }
    }

    @ObfuscatedName("gn.l(II)V")
    public void method3160(int arg0) {
        if (this.field2735 == null || this.field2733 == null || !this.field2733[arg0]) {
            class186.method703(this, this.field2730, arg0, this.field2702[arg0], (byte) 2, true);
        } else {
            class184.method2601(arg0, this.field2735, this);
        }
    }

    @ObfuscatedName("gn.cd(III)V")
    public void method3199(int arg0, int arg1) {
        this.field2736 = arg0;
        this.field2728 = arg1;
        if (this.field2729 == null) {
            class186.method703(this, 255, this.field2730, this.field2736, (byte) 0, true);
        } else {
            class184.method2601(this.field2730, this.field2729, this);
        }
    }

    @ObfuscatedName("gn.cx(I[BZZI)V")
    public void method3200(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2731) {
                throw new RuntimeException();
            }
            if (this.field2729 != null) {
                class184.method276(this.field2730, arg1, this.field2729);
            }
            this.method3150(arg1);
            this.method3218();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2714[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2714[arg0];
        if (this.field2735 != null) {
            class184.method276(arg0, arg1, this.field2735);
            this.field2733[arg0] = true;
        }
        if (arg3) {
            this.field2708[arg0] = class157.method800(arg1, false);
        }
    }

    @ObfuscatedName("gn.cn(Ldd;I[BZB)V")
    public void method3197(class117 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2729 != arg0) {
            if (!arg3 && this.field2737 == arg1) {
                this.field2731 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2733[arg1] = false;
                if (this.field2734 || arg3) {
                    class186.method703(this, this.field2730, arg1, this.field2702[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2732.reset();
            field2732.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2732.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2702[arg1] != var9 || this.field2714[arg1] != var10) {
                this.field2733[arg1] = false;
                if (this.field2734 || arg3) {
                    class186.method703(this, this.field2730, arg1, this.field2702[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2733[arg1] = true;
            if (arg3) {
                this.field2708[arg1] = class157.method800(arg2, false);
            }
            return;
        }
        if (this.field2731) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class186.method703(this, 255, this.field2730, this.field2736, (byte) 0, true);
            return;
        }
        field2732.reset();
        field2732.update(arg2, 0, arg2.length);
        int var5 = (int) field2732.getValue();
        class154 var6 = new class154(class183.method94(arg2));
        int var7 = var6.method2701();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2730 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2644();
        }
        if (this.field2736 != var5 || this.field2728 != var8) {
            class186.method703(this, 255, this.field2730, this.field2736, (byte) 0, true);
            return;
        }
        this.method3150(arg2);
        this.method3218();
    }

    @ObfuscatedName("gn.cl(B)V")
    public void method3218() {
        this.field2733 = new boolean[this.field2708.length];
        for (int var1 = 0; var1 < this.field2733.length; var1++) {
            this.field2733[var1] = false;
        }
        if (this.field2735 == null) {
            this.field2731 = true;
            return;
        }
        this.field2737 = -1;
        for (int var2 = 0; var2 < this.field2733.length; var2++) {
            if (this.field2704[var2] > 0) {
                class117 var3 = this.field2735;
                class181 var5 = new class181();
                var5.field2691 = 1;
                var5.field1885 = (long) var2;
                var5.field2684 = var3;
                var5.field2686 = this;
                class129 var6 = class184.field2720;
                synchronized (class184.field2720) {
                    class184.field2720.method2300(var5);
                }
                class184.method1889();
                this.field2737 = var2;
            }
        }
        if (this.field2737 == -1) {
            this.field2731 = true;
        }
    }

    @ObfuscatedName("gn.cy(II)I")
    public int method3203(int arg0) {
        if (this.field2708[arg0] != null) {
            return 100;
        } else if (this.field2733[arg0]) {
            return 100;
        } else {
            int var2 = this.field2730;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2809 != null && Statics.field2809.field1885 == var3) {
                var5 = Statics.field1197.field2086 * 99 / (Statics.field1197.field2091.length - Statics.field2809.field2695) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("gn.cz(B)I")
    public int method3207() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2708.length; var3++) {
            if (this.field2704[var3] > 0) {
                var1 += 100;
                var2 += this.method3203(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
