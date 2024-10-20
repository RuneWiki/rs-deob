package deob;

import java.util.zip.CRC32;

@ObfuscatedName("iy")
public class class252 extends class250 {

    @ObfuscatedName("iy.f")
    public class165 field3212;

    @ObfuscatedName("iy.r")
    public class165 field3216;

    @ObfuscatedName("iy.n")
    public int field3213;

    @ObfuscatedName("iy.g")
    public volatile boolean field3211 = false;

    @ObfuscatedName("iy.ac")
    public boolean field3215 = false;

    @ObfuscatedName("iy.ab")
    public volatile boolean[] field3220;

    @ObfuscatedName("iy.ao")
    public static CRC32 field3217 = new CRC32();

    @ObfuscatedName("iy.an")
    public int field3214;

    @ObfuscatedName("iy.ay")
    public int field3219;

    @ObfuscatedName("iy.av")
    public int field3218 = -1;

    public class252(class165 arg0, class165 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3212 = arg0;
        this.field3216 = arg1;
        this.field3213 = arg2;
        this.field3215 = arg5;
        class253.method575(this, this.field3213);
    }

    @ObfuscatedName("iy.cj(I)I")
    public int method4387() {
        if (this.field3211) {
            return 100;
        } else if (this.field3199 == null) {
            int var1 = class253.method3886(255, this.field3213);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("iy.s(II)V")
    public void method4269(int arg0) {
        class253.method1518(this.field3213, arg0);
    }

    @ObfuscatedName("iy.q(II)V")
    public void method4341(int arg0) {
        if (this.field3212 == null || this.field3220 == null || !this.field3220[arg0]) {
            class253.method613(this, this.field3213, arg0, this.field3190[arg0], (byte) 2, true);
        } else {
            class251.method4253(arg0, this.field3212, this);
        }
    }

    @ObfuscatedName("iy.cc(IIB)V")
    public void method4381(int arg0, int arg1) {
        this.field3214 = arg0;
        this.field3219 = arg1;
        if (this.field3216 == null) {
            class253.method613(this, 255, this.field3213, this.field3214, (byte) 0, true);
        } else {
            class251.method4253(this.field3213, this.field3216, this);
        }
    }

    @ObfuscatedName("iy.cf(I[BZZI)V")
    public void method4375(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3211) {
                throw new RuntimeException();
            }
            if (this.field3216 != null) {
                class251.method2987(this.field3213, arg1, this.field3216);
            }
            this.method4268(arg1);
            this.method4388();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3194[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3194[arg0];
        if (this.field3212 != null) {
            class251.method2987(arg0, arg1, this.field3212);
            this.field3220[arg0] = true;
        }
        if (arg3) {
            this.field3199[arg0] = class189.method2897(arg1, false);
        }
    }

    @ObfuscatedName("iy.ca(Lfm;I[BZI)V")
    public void method4396(class165 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3216 != arg0) {
            if (!arg3 && this.field3218 == arg1) {
                this.field3211 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3220[arg1] = false;
                if (this.field3215 || arg3) {
                    class253.method613(this, this.field3213, arg1, this.field3190[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3217.reset();
            field3217.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3217.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3190[arg1] != var9 || this.field3194[arg1] != var10) {
                this.field3220[arg1] = false;
                if (this.field3215 || arg3) {
                    class253.method613(this, this.field3213, arg1, this.field3190[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3220[arg1] = true;
            if (arg3) {
                this.field3199[arg1] = class189.method2897(arg2, false);
            }
            return;
        }
        if (this.field3211) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class253.method613(this, 255, this.field3213, this.field3214, (byte) 0, true);
            return;
        }
        field3217.reset();
        field3217.update(arg2, 0, arg2.length);
        int var5 = (int) field3217.getValue();
        if (this.field3214 != var5) {
            class253.method613(this, 255, this.field3213, this.field3214, (byte) 0, true);
            return;
        }
        class185 var6 = new class185(class250.method949(arg2));
        int var7 = var6.method3274();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3213 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3279();
        }
        if (this.field3219 != var8) {
            class253.method613(this, 255, this.field3213, this.field3214, (byte) 0, true);
            return;
        }
        this.method4268(arg2);
        this.method4388();
    }

    @ObfuscatedName("iy.cw(I)V")
    public void method4388() {
        this.field3220 = new boolean[this.field3199.length];
        for (int var1 = 0; var1 < this.field3220.length; var1++) {
            this.field3220[var1] = false;
        }
        if (this.field3212 == null) {
            this.field3211 = true;
            return;
        }
        this.field3218 = -1;
        for (int var2 = 0; var2 < this.field3220.length; var2++) {
            if (this.field3195[var2] > 0) {
                class251.method208(var2, this.field3212, this);
                this.field3218 = var2;
            }
        }
        if (this.field3218 == -1) {
            this.field3211 = true;
        }
    }

    @ObfuscatedName("iy.w(II)I")
    public int method4276(int arg0) {
        if (this.field3199[arg0] == null) {
            return this.field3220[arg0] ? 100 : class253.method3886(this.field3213, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("iy.dt(IB)Z")
    public boolean method4378(int arg0) {
        return this.field3220[arg0];
    }

    @ObfuscatedName("iy.dd(IS)Z")
    public boolean method4380(int arg0) {
        return this.method4282(arg0) != null;
    }

    @ObfuscatedName("iy.do(B)I")
    public int method4390() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3199.length; var3++) {
            if (this.field3195[var3] > 0) {
                var1 += 100;
                var2 += this.method4276(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
