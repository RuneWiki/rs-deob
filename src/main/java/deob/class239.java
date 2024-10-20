package deob;

import java.util.zip.CRC32;

@ObfuscatedName("id")
public class class239 extends class237 {

    @ObfuscatedName("id.p")
    public class162 field3226;

    @ObfuscatedName("id.f")
    public class162 field3235;

    @ObfuscatedName("id.b")
    public int field3225;

    @ObfuscatedName("id.x")
    public volatile boolean field3227 = false;

    @ObfuscatedName("id.i")
    public boolean field3224 = false;

    @ObfuscatedName("id.j")
    public volatile boolean[] field3229;

    @ObfuscatedName("id.q")
    public static CRC32 field3228 = new CRC32();

    @ObfuscatedName("id.ag")
    public int field3231;

    @ObfuscatedName("id.ay")
    public int field3232;

    @ObfuscatedName("id.au")
    public int field3233 = -1;

    public class239(class162 arg0, class162 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3226 = arg0;
        this.field3235 = arg1;
        this.field3225 = arg2;
        this.field3224 = arg5;
        class240.method934(this, this.field3225);
    }

    @ObfuscatedName("id.ca(I)I")
    public int method3918() {
        if (this.field3227) {
            return 100;
        } else if (this.field3200 == null) {
            int var1 = class240.method3935(255, this.field3225);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("id.n(II)V")
    public void method3875(int arg0) {
        class240.method3065(this.field3225, arg0);
    }

    @ObfuscatedName("id.o(II)V")
    public void method3825(int arg0) {
        if (this.field3226 == null || this.field3229 == null || !this.field3229[arg0]) {
            class240.method4338(this, this.field3225, arg0, this.field3198[arg0], (byte) 2, true);
        } else {
            class238.method3796(arg0, this.field3226, this);
        }
    }

    @ObfuscatedName("id.cd(III)V")
    public void method3915(int arg0, int arg1) {
        this.field3231 = arg0;
        this.field3232 = arg1;
        if (this.field3235 == null) {
            class240.method4338(this, 255, this.field3225, this.field3231, (byte) 0, true);
        } else {
            class238.method3796(this.field3225, this.field3235, this);
        }
    }

    @ObfuscatedName("id.cx(I[BZZI)V")
    public void method3914(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3227) {
                throw new RuntimeException();
            }
            if (this.field3235 != null) {
                class238.method977(this.field3225, arg1, this.field3235);
            }
            this.method3866(arg1);
            this.method3912();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3201[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3201[arg0];
        if (this.field3226 != null) {
            class238.method977(arg0, arg1, this.field3226);
            this.field3229[arg0] = true;
        }
        if (arg3) {
            this.field3200[arg0] = Statics.method1602(arg1, false);
        }
    }

    @ObfuscatedName("id.cb(Lfq;I[BZB)V")
    public void method3910(class162 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3235 != arg0) {
            if (!arg3 && this.field3233 == arg1) {
                this.field3227 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3229[arg1] = false;
                if (this.field3224 || arg3) {
                    class240.method4338(this, this.field3225, arg1, this.field3198[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3228.reset();
            field3228.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3228.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3198[arg1] != var9 || this.field3201[arg1] != var10) {
                this.field3229[arg1] = false;
                if (this.field3224 || arg3) {
                    class240.method4338(this, this.field3225, arg1, this.field3198[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3229[arg1] = true;
            if (arg3) {
                this.field3200[arg1] = Statics.method1602(arg2, false);
            }
            return;
        }
        if (this.field3227) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class240.method4338(this, 255, this.field3225, this.field3231, (byte) 0, true);
            return;
        }
        field3228.reset();
        field3228.update(arg2, 0, arg2.length);
        int var5 = (int) field3228.getValue();
        class175 var6 = new class175(Statics.method2904(arg2));
        int var7 = var6.method2928();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3225 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2933();
        }
        if (this.field3231 != var5 || this.field3232 != var8) {
            class240.method4338(this, 255, this.field3225, this.field3231, (byte) 0, true);
            return;
        }
        this.method3866(arg2);
        this.method3912();
    }

    @ObfuscatedName("id.ck(I)V")
    public void method3912() {
        this.field3229 = new boolean[this.field3200.length];
        for (int var1 = 0; var1 < this.field3229.length; var1++) {
            this.field3229[var1] = false;
        }
        if (this.field3226 == null) {
            this.field3227 = true;
            return;
        }
        this.field3233 = -1;
        for (int var2 = 0; var2 < this.field3229.length; var2++) {
            if (this.field3196[var2] > 0) {
                class162 var3 = this.field3226;
                class235 var5 = new class235();
                var5.field3190 = 1;
                var5.field2451 = (long) var2;
                var5.field3187 = var3;
                var5.field3188 = this;
                class195 var6 = class238.field3216;
                synchronized (class238.field3216) {
                    class238.field3216.method3379(var5);
                }
                Object var8 = class238.field3218;
                synchronized (class238.field3218) {
                    if (class238.field3217 == 0) {
                        Statics.field3220 = new Thread(new class238());
                        Statics.field3220.setDaemon(true);
                        Statics.field3220.start();
                        Statics.field3220.setPriority(5);
                    }
                    class238.field3217 = 600;
                }
                this.field3233 = var2;
            }
        }
        if (this.field3233 == -1) {
            this.field3227 = true;
        }
    }

    @ObfuscatedName("id.z(II)I")
    public int method3822(int arg0) {
        if (this.field3200[arg0] == null) {
            return this.field3229[arg0] ? 100 : class240.method3935(this.field3225, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("id.ci(B)I")
    public int method3913() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3200.length; var3++) {
            if (this.field3196[var3] > 0) {
                var1 += 100;
                var2 += this.method3822(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
