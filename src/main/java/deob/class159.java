package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fc")
public class class159 extends class158 {

    @ObfuscatedName("fc.w")
    public class126 field2578;

    @ObfuscatedName("fc.p")
    public class126 field2574;

    @ObfuscatedName("fc.z")
    public int field2575;

    @ObfuscatedName("fc.s")
    public volatile boolean field2579 = false;

    @ObfuscatedName("fc.d")
    public boolean field2577 = false;

    @ObfuscatedName("fc.b")
    public volatile boolean[] field2580;

    @ObfuscatedName("fc.e")
    public static CRC32 field2573 = new CRC32();

    @ObfuscatedName("fc.ar")
    public int field2581;

    @ObfuscatedName("fc.av")
    public int field2576;

    @ObfuscatedName("fc.ae")
    public int field2582 = -1;

    public class159(class126 arg0, class126 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2578 = arg0;
        this.field2574 = arg1;
        this.field2575 = arg2;
        this.field2577 = arg5;
        class162.method153(this, this.field2575);
    }

    @ObfuscatedName("fc.cy(B)I")
    public int method3016() {
        if (this.field2579) {
            return 100;
        } else if (this.field2560 == null) {
            int var1 = this.field2575;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2598 != null && Statics.field2598.field3015 == var2) {
                var4 = Statics.field2595.field1861 * 99 / (Statics.field2595.field1860.length - Statics.field2598.field2624) + 1;
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

    @ObfuscatedName("fc.l(II)V")
    public void method2939(int arg0) {
        int var2 = this.field2575;
        long var3 = (long) ((var2 << 16) + arg0);
        class163 var5 = (class163) class162.field2606.method3435(var3);
        if (var5 != null) {
            class162.field2618.method3527(var5);
        }
    }

    @ObfuscatedName("fc.j(II)V")
    public void method2983(int arg0) {
        if (this.field2578 == null || this.field2580 == null || !this.field2580[arg0]) {
            class162.method569(this, this.field2575, arg0, this.field2563[arg0], (byte) 2, true);
        } else {
            class161.method638(arg0, this.field2578, this);
        }
    }

    @ObfuscatedName("fc.cj(III)V")
    public void method3017(int arg0, int arg1) {
        this.field2581 = arg0;
        this.field2576 = arg1;
        if (this.field2574 == null) {
            class162.method569(this, 255, this.field2575, this.field2581, (byte) 0, true);
        } else {
            class161.method638(this.field2575, this.field2574, this);
        }
    }

    @ObfuscatedName("fc.cf(I[BZZI)V")
    public void method3018(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2579) {
                throw new RuntimeException();
            }
            if (this.field2574 != null) {
                class161.method3037(this.field2575, arg1, this.field2574);
            }
            this.method2966(arg1);
            this.method3020();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2559[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2559[arg0];
        if (this.field2578 != null) {
            class161.method3037(arg0, arg1, this.field2578);
            this.field2580[arg0] = true;
        }
        if (arg3) {
            this.field2560[arg0] = class117.method1846(arg1, false);
        }
    }

    @ObfuscatedName("fc.cm(Ldn;I[BZB)V")
    public void method3019(class126 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2574 != arg0) {
            if (!arg3 && this.field2582 == arg1) {
                this.field2579 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2580[arg1] = false;
                if (this.field2577 || arg3) {
                    class162.method569(this, this.field2575, arg1, this.field2563[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2573.reset();
            field2573.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2573.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2563[arg1] != var9 || this.field2559[arg1] != var10) {
                this.field2580[arg1] = false;
                if (this.field2577 || arg3) {
                    class162.method569(this, this.field2575, arg1, this.field2563[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2580[arg1] = true;
            if (arg3) {
                this.field2560[arg1] = class117.method1846(arg2, false);
            }
            return;
        }
        if (this.field2579) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class162.method569(this, 255, this.field2575, this.field2581, (byte) 0, true);
            return;
        }
        field2573.reset();
        field2573.update(arg2, 0, arg2.length);
        int var5 = (int) field2573.getValue();
        class111 var6 = new class111(class158.method1481(arg2));
        int var7 = var6.method2219();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2575 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2273();
        }
        if (this.field2581 != var5 || this.field2576 != var8) {
            class162.method569(this, 255, this.field2575, this.field2581, (byte) 0, true);
            return;
        }
        this.method2966(arg2);
        this.method3020();
    }

    @ObfuscatedName("fc.co(B)V")
    public void method3020() {
        this.field2580 = new boolean[this.field2560.length];
        for (int var1 = 0; var1 < this.field2580.length; var1++) {
            this.field2580[var1] = false;
        }
        if (this.field2578 == null) {
            this.field2579 = true;
            return;
        }
        this.field2582 = -1;
        for (int var2 = 0; var2 < this.field2580.length; var2++) {
            if (this.field2554[var2] > 0) {
                class161.method2659(var2, this.field2578, this);
                this.field2582 = var2;
            }
        }
        if (this.field2582 == -1) {
            this.field2579 = true;
        }
    }

    @ObfuscatedName("fc.cr(II)I")
    public int method3030(int arg0) {
        if (this.field2560[arg0] != null) {
            return 100;
        } else if (this.field2580[arg0]) {
            return 100;
        } else {
            int var2 = this.field2575;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2598 != null && Statics.field2598.field3015 == var3) {
                var5 = Statics.field2595.field1861 * 99 / (Statics.field2595.field1860.length - Statics.field2598.field2624) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fc.cd(B)I")
    public int method3022() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2560.length; var3++) {
            if (this.field2554[var3] > 0) {
                var1 += 100;
                var2 += this.method3030(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
