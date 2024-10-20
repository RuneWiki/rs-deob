package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fz")
public class class168 extends class167 {

    @ObfuscatedName("fz.u")
    public class134 field2670;

    @ObfuscatedName("fz.v")
    public class134 field2671;

    @ObfuscatedName("fz.a")
    public int field2672;

    @ObfuscatedName("fz.c")
    public volatile boolean field2678 = false;

    @ObfuscatedName("fz.l")
    public boolean field2674 = false;

    @ObfuscatedName("fz.x")
    public volatile boolean[] field2675;

    @ObfuscatedName("fz.w")
    public static CRC32 field2676 = new CRC32();

    @ObfuscatedName("fz.aq")
    public int field2677;

    @ObfuscatedName("fz.az")
    public int field2680;

    @ObfuscatedName("fz.ab")
    public int field2679 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2670 = arg0;
        this.field2671 = arg1;
        this.field2672 = arg2;
        this.field2674 = arg5;
        int var8 = this.field2672;
        if (Statics.field2065 == null) {
            class171.method2998((class168) null, 255, 255, 0, (byte) 0, true);
            class171.field2717[var8] = this;
        } else {
            Statics.field2065.field1977 = var8 * 8 + 5;
            int var9 = Statics.field2065.method2343();
            int var10 = Statics.field2065.method2343();
            this.method3091(var9, var10);
        }
    }

    @ObfuscatedName("fz.cu(I)I")
    public int method3108() {
        if (this.field2678) {
            return 100;
        } else if (this.field2662 == null) {
            int var1 = class171.method2023(255, this.field2672);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("fz.d(II)V")
    public void method3009(int arg0) {
        int var2 = this.field2672;
        long var3 = (long) ((var2 << 16) + arg0);
        class172 var5 = (class172) class171.field2706.method3519(var3);
        if (var5 != null) {
            class171.field2705.method3610(var5);
        }
    }

    @ObfuscatedName("fz.e(IS)V")
    public void method3049(int arg0) {
        if (this.field2670 == null || this.field2675 == null || !this.field2675[arg0]) {
            class171.method2998(this, this.field2672, arg0, this.field2656[arg0], (byte) 2, true);
        } else {
            class170.method2681(arg0, this.field2670, this);
        }
    }

    @ObfuscatedName("fz.cv(III)V")
    public void method3091(int arg0, int arg1) {
        this.field2677 = arg0;
        this.field2680 = arg1;
        if (this.field2671 == null) {
            class171.method2998(this, 255, this.field2672, this.field2677, (byte) 0, true);
        } else {
            class170.method2681(this.field2672, this.field2671, this);
        }
    }

    @ObfuscatedName("fz.cx(I[BZZI)V")
    public void method3088(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2678) {
                throw new RuntimeException();
            }
            if (this.field2671 != null) {
                class170.method911(this.field2672, arg1, this.field2671);
            }
            this.method3071(arg1);
            this.method3097();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2657[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2657[arg0];
        if (this.field2670 != null) {
            class170.method911(arg0, arg1, this.field2670);
            this.field2675[arg0] = true;
        }
        if (arg3) {
            this.field2662[arg0] = class125.method1463(arg1, false);
        }
    }

    @ObfuscatedName("fz.ci(Leh;I[BZS)V")
    public void method3089(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2671 != arg0) {
            if (!arg3 && this.field2679 == arg1) {
                this.field2678 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2675[arg1] = false;
                if (this.field2674 || arg3) {
                    class171.method2998(this, this.field2672, arg1, this.field2656[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2676.reset();
            field2676.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2676.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2656[arg1] != var9 || this.field2657[arg1] != var10) {
                this.field2675[arg1] = false;
                if (this.field2674 || arg3) {
                    class171.method2998(this, this.field2672, arg1, this.field2656[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2675[arg1] = true;
            if (arg3) {
                this.field2662[arg1] = class125.method1463(arg2, false);
            }
            return;
        }
        if (this.field2678) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class171.method2998(this, 255, this.field2672, this.field2677, (byte) 0, true);
            return;
        }
        field2676.reset();
        field2676.update(arg2, 0, arg2.length);
        int var5 = (int) field2676.getValue();
        class119 var6 = new class119(class167.method2662(arg2));
        int var7 = var6.method2338();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2672 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2343();
        }
        if (this.field2677 != var5 || this.field2680 != var8) {
            class171.method2998(this, 255, this.field2672, this.field2677, (byte) 0, true);
            return;
        }
        this.method3071(arg2);
        this.method3097();
    }

    @ObfuscatedName("fz.cd(B)V")
    public void method3097() {
        this.field2675 = new boolean[this.field2662.length];
        for (int var1 = 0; var1 < this.field2675.length; var1++) {
            this.field2675[var1] = false;
        }
        if (this.field2670 == null) {
            this.field2678 = true;
            return;
        }
        this.field2679 = -1;
        for (int var2 = 0; var2 < this.field2675.length; var2++) {
            if (this.field2652[var2] > 0) {
                class134 var3 = this.field2670;
                class169 var5 = new class169();
                var5.field2688 = 1;
                var5.field3096 = (long) var2;
                var5.field2687 = var3;
                var5.field2684 = this;
                class199 var6 = class170.field2690;
                synchronized (class170.field2690) {
                    class170.field2690.method3579(var5);
                }
                Object var8 = class170.field2692;
                synchronized (class170.field2692) {
                    if (class170.field2691 == 0) {
                        Statics.field2013.method2709(new class170(), 5);
                    }
                    class170.field2691 = 600;
                }
                this.field2679 = var2;
            }
        }
        if (this.field2679 == -1) {
            this.field2678 = true;
        }
    }

    @ObfuscatedName("fz.cg(II)I")
    public int method3093(int arg0) {
        if (this.field2662[arg0] == null) {
            return this.field2675[arg0] ? 100 : class171.method2023(this.field2672, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fz.cm(I)I")
    public int method3094() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2662.length; var3++) {
            if (this.field2652[var3] > 0) {
                var1 += 100;
                var2 += this.method3093(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
