package deob;

import java.util.zip.CRC32;

@ObfuscatedName("lx")
public class class328 extends class330 {

    @ObfuscatedName("lx.j")
    public class401 field4135;

    @ObfuscatedName("lx.y")
    public class401 field4132;

    @ObfuscatedName("lx.d")
    public int field4133;

    @ObfuscatedName("lx.n")
    public volatile int field4138 = 0;

    @ObfuscatedName("lx.r")
    public boolean field4134 = false;

    @ObfuscatedName("lx.l")
    public volatile boolean[] field4136;

    @ObfuscatedName("lx.s")
    public static CRC32 field4137 = new CRC32();

    @ObfuscatedName("lx.p")
    public int field4127;

    @ObfuscatedName("lx.b")
    public int field4139;

    @ObfuscatedName("lx.o")
    public int field4140 = -1;

    @ObfuscatedName("lx.u")
    public boolean field4141 = false;

    public class328(class401 arg0, class401 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        super(arg3, arg4);
        this.field4135 = arg0;
        this.field4132 = arg1;
        this.field4133 = arg2;
        this.field4134 = arg5;
        this.field4141 = arg6;
        class331.method1742(this, this.field4133);
    }

    @ObfuscatedName("lx.a(I)Z")
    public boolean method5731() {
        return this.field4138 == 1;
    }

    @ObfuscatedName("lx.f(I)I")
    public int method5732() {
        if (this.field4138 == 1 || this.field4141 && this.field4138 == 2) {
            return 100;
        } else if (this.field4157 == null) {
            int var1 = class331.method3707(255, this.field4133);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("lx.c(IB)V")
    public void method5733(int arg0) {
        class331.method1049(this.field4133, arg0);
    }

    @ObfuscatedName("lx.x(II)V")
    public void method5766(int arg0) {
        if (this.field4135 == null || this.field4136 == null || !this.field4136[arg0]) {
            class331.method2978(this, this.field4133, arg0, this.field4151[arg0], (byte) 2, true);
            return;
        }
        class401 var2 = this.field4135;
        byte[] var4 = null;
        class349 var5 = class327.field4121;
        synchronized (class327.field4121) {
            for (class326 var6 = (class326) class327.field4121.method6040(); var6 != null; var6 = (class326) class327.field4121.method6034()) {
                if ((long) arg0 == var6.field4635 && var6.field4119 == var2 && var6.field4117 == 0) {
                    var4 = var6.field4118;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method6910(arg0);
            this.method5738(var2, arg0, var8, true);
        } else {
            this.method5738(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("lx.h(S)V")
    public void method5743() {
        this.field4138 = 2;
        this.field4148 = new int[0];
        this.field4151 = new int[0];
        this.field4152 = new int[0];
        this.field4147 = new int[0];
        this.field4154 = new int[0][];
        this.field4157 = new Object[0];
        this.field4161 = new Object[0][];
    }

    @ObfuscatedName("lx.j(III)V")
    public void method5765(int arg0, int arg1) {
        this.field4127 = arg0;
        this.field4139 = arg1;
        if (this.field4132 == null) {
            class331.method2978(this, 255, this.field4133, this.field4127, (byte) 0, true);
            return;
        }
        int var3 = this.field4133;
        class401 var4 = this.field4132;
        byte[] var6 = null;
        class349 var7 = class327.field4121;
        synchronized (class327.field4121) {
            for (class326 var8 = (class326) class327.field4121.method6040(); var8 != null; var8 = (class326) class327.field4121.method6034()) {
                if ((long) var3 == var8.field4635 && var8.field4119 == var4 && var8.field4117 == 0) {
                    var6 = var8.field4118;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method6910(var3);
            this.method5738(var4, var3, var10, true);
        } else {
            this.method5738(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("lx.y(I[BZZI)V")
    public void method5737(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field4138 == 1) {
                throw new RuntimeException();
            }
            if (this.field4132 != null) {
                class327.method2158(this.field4133, arg1, this.field4132);
            }
            this.method5780(arg1);
            this.method5747();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field4152[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field4152[arg0];
        if (this.field4135 != null) {
            class327.method2158(arg0, arg1, this.field4135);
            this.field4136[arg0] = true;
        }
        if (arg3) {
            this.field4157[arg0] = class307.method2844(arg1, false);
        }
    }

    @ObfuscatedName("lx.d(Lob;I[BZB)V")
    public void method5738(class401 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field4132 != arg0) {
            if (!arg3 && this.field4140 == arg1) {
                this.field4138 = 1;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field4136[arg1] = false;
                if (this.field4134 || arg3) {
                    class331.method2978(this, this.field4133, arg1, this.field4151[arg1], (byte) 2, arg3);
                }
                return;
            }
            field4137.reset();
            field4137.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field4137.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field4151[arg1] != var9 || this.field4152[arg1] != var10) {
                this.field4136[arg1] = false;
                if (this.field4134 || arg3) {
                    class331.method2978(this, this.field4133, arg1, this.field4151[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field4136[arg1] = true;
            if (arg3) {
                this.field4157[arg1] = class307.method2844(arg2, false);
            }
            return;
        }
        if (this.field4138 == 1) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class331.method2978(this, 255, this.field4133, this.field4127, (byte) 0, true);
            return;
        }
        field4137.reset();
        field4137.update(arg2, 0, arg2.length);
        int var5 = (int) field4137.getValue();
        if (this.field4127 != var5) {
            class331.method2978(this, 255, this.field4133, this.field4127, (byte) 0, true);
            return;
        }
        class464 var6 = new class464(class330.method4286(arg2));
        int var7 = var6.method7735();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field4133 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method7720();
        }
        if (this.field4139 != var8) {
            class331.method2978(this, 255, this.field4133, this.field4127, (byte) 0, true);
            return;
        }
        this.method5780(arg2);
        this.method5747();
    }

    @ObfuscatedName("lx.n(B)V")
    public void method5747() {
        this.field4136 = new boolean[this.field4157.length];
        for (int var1 = 0; var1 < this.field4136.length; var1++) {
            this.field4136[var1] = false;
        }
        if (this.field4135 == null) {
            this.field4138 = 1;
            return;
        }
        this.field4140 = -1;
        for (int var2 = 0; var2 < this.field4136.length; var2++) {
            if (this.field4147[var2] > 0) {
                class327.method5145(var2, this.field4135, this);
                this.field4140 = var2;
            }
        }
        if (this.field4140 == -1) {
            this.field4138 = 1;
        }
    }

    @ObfuscatedName("lx.r(IB)I")
    public int method5739(int arg0) {
        if (this.field4157[arg0] == null) {
            return this.field4136[arg0] ? 100 : class331.method3707(this.field4133, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("lx.l(II)Z")
    public boolean method5741(int arg0) {
        return this.field4136[arg0];
    }

    @ObfuscatedName("lx.s(II)Z")
    public boolean method5735(int arg0) {
        return this.method5792(arg0) != null;
    }

    @ObfuscatedName("lx.p(I)I")
    public int method5772() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4157.length; var3++) {
            if (this.field4147[var3] > 0) {
                var1 += 100;
                var2 += this.method5739(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
