package deob;

import java.util.zip.CRC32;

@ObfuscatedName("iz")
public class class252 extends class250 {

    @ObfuscatedName("iz.z")
    public class165 field3218;

    @ObfuscatedName("iz.y")
    public class165 field3225;

    @ObfuscatedName("iz.u")
    public int field3220;

    @ObfuscatedName("iz.f")
    public volatile boolean field3221 = false;

    @ObfuscatedName("iz.at")
    public boolean field3222 = false;

    @ObfuscatedName("iz.ay")
    public volatile boolean[] field3223;

    @ObfuscatedName("iz.ak")
    public static CRC32 field3219 = new CRC32();

    @ObfuscatedName("iz.az")
    public int field3226;

    @ObfuscatedName("iz.aj")
    public int field3217;

    @ObfuscatedName("iz.af")
    public int field3227 = -1;

    public class252(class165 arg0, class165 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3218 = arg0;
        this.field3225 = arg1;
        this.field3220 = arg2;
        this.field3222 = arg5;
        int var8 = this.field3220;
        if (Statics.field279 == null) {
            class253.method164((class252) null, 255, 255, 0, (byte) 0, true);
            class253.field3242[var8] = this;
        } else {
            Statics.field279.field2386 = var8 * 8 + 5;
            int var9 = Statics.field279.method3323();
            int var10 = Statics.field279.method3323();
            this.method4316(var9, var10);
        }
    }

    @ObfuscatedName("iz.cc(I)Z")
    public boolean method4346() {
        return this.field3221;
    }

    @ObfuscatedName("iz.di(I)I")
    public int method4315() {
        if (this.field3221) {
            return 100;
        } else if (this.field3204 == null) {
            int var1 = this.field3220;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field179 != null && Statics.field179.field2466 == var2) {
                var4 = Statics.field1951.field2386 * 99 / (Statics.field1951.field2388.length - Statics.field179.field3187) + 1;
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

    @ObfuscatedName("iz.q(IB)V")
    public void method4209(int arg0) {
        int var2 = this.field3220;
        long var3 = (long) ((var2 << 16) + arg0);
        class249 var5 = (class249) class253.field3235.method3687(var3);
        if (var5 != null) {
            class253.field3234.method3607(var5);
        }
    }

    @ObfuscatedName("iz.n(II)V")
    public void method4275(int arg0) {
        if (this.field3218 == null || this.field3223 == null || !this.field3223[arg0]) {
            class253.method164(this, this.field3220, arg0, this.field3208[arg0], (byte) 2, true);
        } else {
            Statics.method455(arg0, this.field3218, this);
        }
    }

    @ObfuscatedName("iz.da(III)V")
    public void method4316(int arg0, int arg1) {
        this.field3226 = arg0;
        this.field3217 = arg1;
        if (this.field3225 == null) {
            class253.method164(this, 255, this.field3220, this.field3226, (byte) 0, true);
        } else {
            Statics.method455(this.field3220, this.field3225, this);
        }
    }

    @ObfuscatedName("iz.dr(I[BZZB)V")
    public void method4317(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3197[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3197[arg0];
            if (this.field3218 != null) {
                class165 var12 = this.field3218;
                class248 var13 = new class248();
                var13.field3180 = 0;
                var13.field2466 = (long) arg0;
                var13.field3181 = arg1;
                var13.field3179 = var12;
                class208 var14 = class251.field3212;
                synchronized (class251.field3212) {
                    class251.field3212.method3740(var13);
                }
                Object var16 = class251.field3215;
                synchronized (class251.field3215) {
                    if (class251.field3213 == 0) {
                        Statics.field3211 = new Thread(new class251());
                        Statics.field3211.setDaemon(true);
                        Statics.field3211.start();
                        Statics.field3211.setPriority(5);
                    }
                    class251.field3213 = 600;
                }
                this.field3223[arg0] = true;
            }
            if (arg3) {
                this.field3204[arg0] = class189.method1638(arg1, false);
            }
            return;
        }
        if (this.field3221) {
            throw new RuntimeException();
        }
        if (this.field3225 != null) {
            int var5 = this.field3220;
            class165 var6 = this.field3225;
            class248 var7 = new class248();
            var7.field3180 = 0;
            var7.field2466 = (long) var5;
            var7.field3181 = arg1;
            var7.field3179 = var6;
            class208 var8 = class251.field3212;
            synchronized (class251.field3212) {
                class251.field3212.method3740(var7);
            }
            Object var10 = class251.field3215;
            synchronized (class251.field3215) {
                if (class251.field3213 == 0) {
                    Statics.field3211 = new Thread(new class251());
                    Statics.field3211.setDaemon(true);
                    Statics.field3211.start();
                    Statics.field3211.setPriority(5);
                }
                class251.field3213 = 600;
            }
        }
        this.method4234(arg1);
        this.method4337();
    }

    @ObfuscatedName("iz.dd(Lfd;I[BZI)V")
    public void method4322(class165 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3225 != arg0) {
            if (!arg3 && this.field3227 == arg1) {
                this.field3221 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3223[arg1] = false;
                if (this.field3222 || arg3) {
                    class253.method164(this, this.field3220, arg1, this.field3208[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3219.reset();
            field3219.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3219.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3208[arg1] != var9 || this.field3197[arg1] != var10) {
                this.field3223[arg1] = false;
                if (this.field3222 || arg3) {
                    class253.method164(this, this.field3220, arg1, this.field3208[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3223[arg1] = true;
            if (arg3) {
                this.field3204[arg1] = class189.method1638(arg2, false);
            }
            return;
        }
        if (this.field3221) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class253.method164(this, 255, this.field3220, this.field3226, (byte) 0, true);
            return;
        }
        field3219.reset();
        field3219.update(arg2, 0, arg2.length);
        int var5 = (int) field3219.getValue();
        if (this.field3226 != var5) {
            class253.method164(this, 255, this.field3220, this.field3226, (byte) 0, true);
            return;
        }
        class185 var6 = new class185(class250.method1646(arg2));
        int var7 = var6.method3243();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3220 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3323();
        }
        if (this.field3217 != var8) {
            class253.method164(this, 255, this.field3220, this.field3226, (byte) 0, true);
            return;
        }
        this.method4234(arg2);
        this.method4337();
    }

    @ObfuscatedName("iz.dh(I)V")
    public void method4337() {
        this.field3223 = new boolean[this.field3204.length];
        for (int var1 = 0; var1 < this.field3223.length; var1++) {
            this.field3223[var1] = false;
        }
        if (this.field3218 == null) {
            this.field3221 = true;
            return;
        }
        this.field3227 = -1;
        for (int var2 = 0; var2 < this.field3223.length; var2++) {
            if (this.field3198[var2] > 0) {
                class165 var3 = this.field3218;
                class248 var5 = new class248();
                var5.field3180 = 1;
                var5.field2466 = (long) var2;
                var5.field3179 = var3;
                var5.field3178 = this;
                class208 var6 = class251.field3212;
                synchronized (class251.field3212) {
                    class251.field3212.method3740(var5);
                }
                Object var8 = class251.field3215;
                synchronized (class251.field3215) {
                    if (class251.field3213 == 0) {
                        Statics.field3211 = new Thread(new class251());
                        Statics.field3211.setDaemon(true);
                        Statics.field3211.start();
                        Statics.field3211.setPriority(5);
                    }
                    class251.field3213 = 600;
                }
                this.field3227 = var2;
            }
        }
        if (this.field3227 == -1) {
            this.field3221 = true;
        }
    }

    @ObfuscatedName("iz.o(IB)I")
    public int method4216(int arg0) {
        if (this.field3204[arg0] == null) {
            return this.field3223[arg0] ? 100 : class253.method1729(this.field3220, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("iz.dl(II)Z")
    public boolean method4333(int arg0) {
        return this.field3223[arg0];
    }

    @ObfuscatedName("iz.du(II)Z")
    public boolean method4327(int arg0) {
        return this.method4221(arg0) != null;
    }

    @ObfuscatedName("iz.dp(B)I")
    public int method4321() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3204.length; var3++) {
            if (this.field3198[var3] > 0) {
                var1 += 100;
                var2 += this.method4216(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
