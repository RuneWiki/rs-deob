package deob;

import java.util.zip.CRC32;

@ObfuscatedName("is")
public class class252 extends class250 {

    @ObfuscatedName("is.j")
    public class165 field3237;

    @ObfuscatedName("is.i")
    public class165 field3238;

    @ObfuscatedName("is.c")
    public int field3243;

    @ObfuscatedName("is.y")
    public volatile boolean field3244 = false;

    @ObfuscatedName("is.av")
    public boolean field3241 = false;

    @ObfuscatedName("is.as")
    public volatile boolean[] field3242;

    @ObfuscatedName("is.al")
    public static CRC32 field3239 = new CRC32();

    @ObfuscatedName("is.ax")
    public int field3240;

    @ObfuscatedName("is.ay")
    public int field3245;

    @ObfuscatedName("is.aa")
    public int field3246 = -1;

    public class252(class165 arg0, class165 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3237 = arg0;
        this.field3238 = arg1;
        this.field3243 = arg2;
        this.field3241 = arg5;
        class253.method2992(this, this.field3243);
    }

    @ObfuscatedName("is.cv(B)Z")
    public boolean method4366() {
        return this.field3244;
    }

    @ObfuscatedName("is.cm(B)I")
    public int method4367() {
        if (this.field3244) {
            return 100;
        } else if (this.field3224 == null) {
            int var1 = this.field3243;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1762 != null && Statics.field1762.field2486 == var2) {
                var4 = Statics.field78.field2397 * 99 / (Statics.field78.field2399.length - Statics.field1762.field3208) + 1;
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

    @ObfuscatedName("is.h(II)V")
    public void method4274(int arg0) {
        int var2 = this.field3243;
        long var3 = (long) ((var2 << 16) + arg0);
        class249 var5 = (class249) class253.field3261.method3759(var3);
        if (var5 != null) {
            class253.field3262.method3682(var5);
        }
    }

    @ObfuscatedName("is.q(IB)V")
    public void method4325(int arg0) {
        if (this.field3237 == null || this.field3242 == null || !this.field3242[arg0]) {
            class253.method2129(this, this.field3243, arg0, this.field3217[arg0], (byte) 2, true);
            return;
        }
        class165 var2 = this.field3237;
        byte[] var4 = null;
        class208 var5 = class251.field3232;
        synchronized (class251.field3232) {
            for (class248 var6 = (class248) class251.field3232.method3823(); var6 != null; var6 = (class248) class251.field3232.method3822()) {
                if ((long) arg0 == var6.field2486 && var6.field3205 == var2 && var6.field3202 == 0) {
                    var4 = var6.field3201;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method3137(arg0);
            this.method4371(var2, arg0, var8, true);
        } else {
            this.method4371(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("is.ck(III)V")
    public void method4369(int arg0, int arg1) {
        this.field3240 = arg0;
        this.field3245 = arg1;
        if (this.field3238 == null) {
            class253.method2129(this, 255, this.field3243, this.field3240, (byte) 0, true);
            return;
        }
        int var3 = this.field3243;
        class165 var4 = this.field3238;
        byte[] var6 = null;
        class208 var7 = class251.field3232;
        synchronized (class251.field3232) {
            for (class248 var8 = (class248) class251.field3232.method3823(); var8 != null; var8 = (class248) class251.field3232.method3822()) {
                if ((long) var3 == var8.field2486 && var8.field3205 == var4 && var8.field3202 == 0) {
                    var6 = var8.field3201;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method3137(var3);
            this.method4371(var4, var3, var10, true);
        } else {
            this.method4371(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("is.cs(I[BZZI)V")
    public void method4370(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3218[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3218[arg0];
            if (this.field3237 != null) {
                class165 var12 = this.field3237;
                class248 var13 = new class248();
                var13.field3202 = 0;
                var13.field2486 = (long) arg0;
                var13.field3201 = arg1;
                var13.field3205 = var12;
                class208 var14 = class251.field3232;
                synchronized (class251.field3232) {
                    class251.field3232.method3831(var13);
                }
                Object var16 = class251.field3234;
                synchronized (class251.field3234) {
                    if (class251.field3233 == 0) {
                        Statics.field3235 = new Thread(new class251());
                        Statics.field3235.setDaemon(true);
                        Statics.field3235.start();
                        Statics.field3235.setPriority(5);
                    }
                    class251.field3233 = 600;
                }
                this.field3242[arg0] = true;
            }
            if (arg3) {
                this.field3224[arg0] = class189.method3562(arg1, false);
            }
            return;
        }
        if (this.field3244) {
            throw new RuntimeException();
        }
        if (this.field3238 != null) {
            int var5 = this.field3243;
            class165 var6 = this.field3238;
            class248 var7 = new class248();
            var7.field3202 = 0;
            var7.field2486 = (long) var5;
            var7.field3201 = arg1;
            var7.field3205 = var6;
            class208 var8 = class251.field3232;
            synchronized (class251.field3232) {
                class251.field3232.method3831(var7);
            }
            Object var10 = class251.field3234;
            synchronized (class251.field3234) {
                if (class251.field3233 == 0) {
                    Statics.field3235 = new Thread(new class251());
                    Statics.field3235.setDaemon(true);
                    Statics.field3235.start();
                    Statics.field3235.setPriority(5);
                }
                class251.field3233 = 600;
            }
        }
        this.method4265(arg1);
        this.method4381();
    }

    @ObfuscatedName("is.dl(Lfh;I[BZI)V")
    public void method4371(class165 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3238 != arg0) {
            if (!arg3 && this.field3246 == arg1) {
                this.field3244 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3242[arg1] = false;
                if (this.field3241 || arg3) {
                    class253.method2129(this, this.field3243, arg1, this.field3217[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3239.reset();
            field3239.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3239.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3217[arg1] != var9 || this.field3218[arg1] != var10) {
                this.field3242[arg1] = false;
                if (this.field3241 || arg3) {
                    class253.method2129(this, this.field3243, arg1, this.field3217[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3242[arg1] = true;
            if (arg3) {
                this.field3224[arg1] = class189.method3562(arg2, false);
            }
            return;
        }
        if (this.field3244) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class253.method2129(this, 255, this.field3243, this.field3240, (byte) 0, true);
            return;
        }
        field3239.reset();
        field3239.update(arg2, 0, arg2.length);
        int var5 = (int) field3239.getValue();
        if (this.field3240 != var5) {
            class253.method2129(this, 255, this.field3243, this.field3240, (byte) 0, true);
            return;
        }
        class185 var6 = new class185(class250.method1705(arg2));
        int var7 = var6.method3323();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3243 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3328();
        }
        if (this.field3245 != var8) {
            class253.method2129(this, 255, this.field3243, this.field3240, (byte) 0, true);
            return;
        }
        this.method4265(arg2);
        this.method4381();
    }

    @ObfuscatedName("is.dp(B)V")
    public void method4381() {
        this.field3242 = new boolean[this.field3224.length];
        for (int var1 = 0; var1 < this.field3242.length; var1++) {
            this.field3242[var1] = false;
        }
        if (this.field3237 == null) {
            this.field3244 = true;
            return;
        }
        this.field3246 = -1;
        for (int var2 = 0; var2 < this.field3242.length; var2++) {
            if (this.field3219[var2] > 0) {
                class165 var3 = this.field3237;
                class248 var5 = new class248();
                var5.field3202 = 1;
                var5.field2486 = (long) var2;
                var5.field3205 = var3;
                var5.field3203 = this;
                class208 var6 = class251.field3232;
                synchronized (class251.field3232) {
                    class251.field3232.method3831(var5);
                }
                Statics.method4011();
                this.field3246 = var2;
            }
        }
        if (this.field3246 == -1) {
            this.field3244 = true;
        }
    }

    @ObfuscatedName("is.s(II)I")
    public int method4273(int arg0) {
        if (this.field3224[arg0] != null) {
            return 100;
        } else if (this.field3242[arg0]) {
            return 100;
        } else {
            int var2 = this.field3243;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1762 != null && Statics.field1762.field2486 == var3) {
                var5 = Statics.field78.field2397 * 99 / (Statics.field78.field2399.length - Statics.field1762.field3208) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("is.dq(II)Z")
    public boolean method4373(int arg0) {
        return this.field3242[arg0];
    }

    @ObfuscatedName("is.de(II)Z")
    public boolean method4388(int arg0) {
        return this.method4278(arg0) != null;
    }

    @ObfuscatedName("is.di(I)I")
    public int method4375() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3224.length; var3++) {
            if (this.field3219[var3] > 0) {
                var1 += 100;
                var2 += this.method4273(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
