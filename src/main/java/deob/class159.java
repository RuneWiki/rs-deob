package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fg")
public class class159 extends class158 {

    @ObfuscatedName("fg.w")
    public class126 field2538;

    @ObfuscatedName("fg.z")
    public class126 field2540;

    @ObfuscatedName("fg.x")
    public int field2542;

    @ObfuscatedName("fg.v")
    public volatile boolean field2539 = false;

    @ObfuscatedName("fg.i")
    public boolean field2536 = false;

    @ObfuscatedName("fg.c")
    public volatile boolean[] field2541;

    @ObfuscatedName("fg.r")
    public static CRC32 field2537 = new CRC32();

    @ObfuscatedName("fg.an")
    public int field2543;

    @ObfuscatedName("fg.ad")
    public int field2544;

    @ObfuscatedName("fg.ai")
    public int field2545 = -1;

    public class159(class126 arg0, class126 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2538 = arg0;
        this.field2540 = arg1;
        this.field2542 = arg2;
        this.field2536 = arg5;
        class162.method900(this, this.field2542);
    }

    @ObfuscatedName("fg.cm(I)I")
    public int method2896() {
        if (this.field2539) {
            return 100;
        } else if (this.field2528 == null) {
            int var1 = class162.method1893(255, this.field2542);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("fg.s(II)V")
    public void method2821(int arg0) {
        class162.method1417(this.field2542, arg0);
    }

    @ObfuscatedName("fg.p(II)V")
    public void method2872(int arg0) {
        if (this.field2538 == null || this.field2541 == null || !this.field2541[arg0]) {
            class162.method721(this, this.field2542, arg0, this.field2522[arg0], (byte) 2, true);
        } else {
            class161.method582(arg0, this.field2538, this);
        }
    }

    @ObfuscatedName("fg.cn(III)V")
    public void method2887(int arg0, int arg1) {
        this.field2543 = arg0;
        this.field2544 = arg1;
        if (this.field2540 == null) {
            class162.method721(this, 255, this.field2542, this.field2543, (byte) 0, true);
        } else {
            class161.method582(this.field2542, this.field2540, this);
        }
    }

    @ObfuscatedName("fg.ci(I[BZZI)V")
    public void method2885(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2539) {
                throw new RuntimeException();
            }
            if (this.field2540 != null) {
                class161.method2720(this.field2542, arg1, this.field2540);
            }
            this.method2796(arg1);
            this.method2889();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2532[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2532[arg0];
        if (this.field2538 != null) {
            class161.method2720(arg0, arg1, this.field2538);
            this.field2541[arg0] = true;
        }
        if (arg3) {
            this.field2528[arg0] = class117.method2438(arg1, false);
        }
    }

    @ObfuscatedName("fg.cz(Ldd;I[BZI)V")
    public void method2892(class126 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2540 != arg0) {
            if (!arg3 && this.field2545 == arg1) {
                this.field2539 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2541[arg1] = false;
                if (this.field2536 || arg3) {
                    class162.method721(this, this.field2542, arg1, this.field2522[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2537.reset();
            field2537.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2537.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2522[arg1] != var9 || this.field2532[arg1] != var10) {
                this.field2541[arg1] = false;
                if (this.field2536 || arg3) {
                    class162.method721(this, this.field2542, arg1, this.field2522[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2541[arg1] = true;
            if (arg3) {
                this.field2528[arg1] = class117.method2438(arg2, false);
            }
            return;
        }
        if (this.field2539) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class162.method721(this, 255, this.field2542, this.field2543, (byte) 0, true);
            return;
        }
        field2537.reset();
        field2537.update(arg2, 0, arg2.length);
        int var5 = (int) field2537.getValue();
        class111 var6 = new class111(class158.method2586(arg2));
        int var7 = var6.method2231();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2542 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2153();
        }
        if (this.field2543 != var5 || this.field2544 != var8) {
            class162.method721(this, 255, this.field2542, this.field2543, (byte) 0, true);
            return;
        }
        this.method2796(arg2);
        this.method2889();
    }

    @ObfuscatedName("fg.ca(I)V")
    public void method2889() {
        this.field2541 = new boolean[this.field2528.length];
        for (int var1 = 0; var1 < this.field2541.length; var1++) {
            this.field2541[var1] = false;
        }
        if (this.field2538 == null) {
            this.field2539 = true;
            return;
        }
        this.field2545 = -1;
        for (int var2 = 0; var2 < this.field2541.length; var2++) {
            if (this.field2524[var2] > 0) {
                class161.method2703(var2, this.field2538, this);
                this.field2545 = var2;
            }
        }
        if (this.field2545 == -1) {
            this.field2539 = true;
        }
    }

    @ObfuscatedName("fg.cl(IB)I")
    public int method2890(int arg0) {
        if (this.field2528[arg0] == null) {
            return this.field2541[arg0] ? 100 : class162.method1893(this.field2542, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fg.cr(I)I")
    public int method2891() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2528.length; var3++) {
            if (this.field2524[var3] > 0) {
                var1 += 100;
                var2 += this.method2890(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
