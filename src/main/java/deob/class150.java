package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ej")
public class class150 extends class149 {

    @ObfuscatedName("ej.u")
    public class123 field2494;

    @ObfuscatedName("ej.y")
    public class123 field2497;

    @ObfuscatedName("ej.o")
    public int field2487;

    @ObfuscatedName("ej.m")
    public volatile boolean field2488 = false;

    @ObfuscatedName("ej.h")
    public boolean field2489 = false;

    @ObfuscatedName("ej.x")
    public volatile boolean[] field2486;

    @ObfuscatedName("ej.d")
    public static CRC32 field2491 = new CRC32();

    @ObfuscatedName("ej.ac")
    public int field2492;

    @ObfuscatedName("ej.ax")
    public int field2493;

    @ObfuscatedName("ej.af")
    public int field2485 = -1;

    public class150(class123 arg0, class123 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2494 = arg0;
        this.field2497 = arg1;
        this.field2487 = arg2;
        this.field2489 = arg5;
        int var8 = this.field2487;
        if (Statics.field2421 == null) {
            class153.method1061((class150) null, 255, 255, 0, (byte) 0, true);
            class153.field2530[var8] = this;
        } else {
            Statics.field2421.field1841 = var8 * 8 + 5;
            int var9 = Statics.field2421.method2127();
            int var10 = Statics.field2421.method2127();
            this.method2788(var9, var10);
        }
    }

    @ObfuscatedName("ej.bi(I)I")
    public int method2786() {
        if (this.field2488) {
            return 100;
        } else if (this.field2468 == null) {
            int var1 = this.field2487;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2162 != null && Statics.field2162.field2894 == var2) {
                var4 = Statics.field2685.field1841 * 99 / (Statics.field2685.field1842.length - Statics.field2162.field2538) + 1;
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

    @ObfuscatedName("ej.v(IB)V")
    public void method2765(int arg0) {
        class153.method2546(this.field2487, arg0);
    }

    @ObfuscatedName("ej.j(II)V")
    public void method2746(int arg0) {
        if (this.field2494 == null || this.field2486 == null || !this.field2486[arg0]) {
            class153.method1061(this, this.field2487, arg0, this.field2470[arg0], (byte) 2, true);
        } else {
            class152.method776(arg0, this.field2494, this);
        }
    }

    @ObfuscatedName("ej.bg(III)V")
    public void method2788(int arg0, int arg1) {
        this.field2492 = arg0;
        this.field2493 = arg1;
        if (this.field2497 == null) {
            class153.method1061(this, 255, this.field2487, this.field2492, (byte) 0, true);
        } else {
            class152.method776(this.field2487, this.field2497, this);
        }
    }

    @ObfuscatedName("ej.bp(I[BZZB)V")
    public void method2789(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2483[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2483[arg0];
            if (this.field2494 != null) {
                class123 var12 = this.field2494;
                class151 var13 = new class151();
                var13.field2500 = 0;
                var13.field2894 = (long) arg0;
                var13.field2499 = arg1;
                var13.field2502 = var12;
                class180 var14 = class152.field2514;
                synchronized (class152.field2514) {
                    class152.field2514.method3224(var13);
                }
                Object var16 = class152.field2511;
                synchronized (class152.field2511) {
                    if (class152.field2510 == 0) {
                        Statics.field2056.method2487(new class152(), 5);
                    }
                    class152.field2510 = 600;
                }
                this.field2486[arg0] = true;
            }
            if (arg3) {
                this.field2468[arg0] = class114.method9(arg1, false);
            }
            return;
        }
        if (this.field2488) {
            throw new RuntimeException();
        }
        if (this.field2497 != null) {
            int var5 = this.field2487;
            class123 var6 = this.field2497;
            class151 var7 = new class151();
            var7.field2500 = 0;
            var7.field2894 = (long) var5;
            var7.field2499 = arg1;
            var7.field2502 = var6;
            class180 var8 = class152.field2514;
            synchronized (class152.field2514) {
                class152.field2514.method3224(var7);
            }
            Object var10 = class152.field2511;
            synchronized (class152.field2511) {
                if (class152.field2510 == 0) {
                    Statics.field2056.method2487(new class152(), 5);
                }
                class152.field2510 = 600;
            }
        }
        this.method2783(arg1);
        this.method2809();
    }

    @ObfuscatedName("ej.bh(Ldm;I[BZI)V")
    public void method2806(class123 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2497 != arg0) {
            if (!arg3 && this.field2485 == arg1) {
                this.field2488 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2486[arg1] = false;
                if (this.field2489 || arg3) {
                    class153.method1061(this, this.field2487, arg1, this.field2470[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2491.reset();
            field2491.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2491.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2470[arg1] != var9 || this.field2483[arg1] != var10) {
                this.field2486[arg1] = false;
                if (this.field2489 || arg3) {
                    class153.method1061(this, this.field2487, arg1, this.field2470[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2486[arg1] = true;
            if (arg3) {
                this.field2468[arg1] = class114.method9(arg2, false);
            }
            return;
        }
        if (this.field2488) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class153.method1061(this, 255, this.field2487, this.field2492, (byte) 0, true);
            return;
        }
        field2491.reset();
        field2491.update(arg2, 0, arg2.length);
        int var5 = (int) field2491.getValue();
        class108 var6 = new class108(class149.method2700(arg2));
        int var7 = var6.method2122();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2487 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2127();
        }
        if (this.field2492 != var5 || this.field2493 != var8) {
            class153.method1061(this, 255, this.field2487, this.field2492, (byte) 0, true);
            return;
        }
        this.method2783(arg2);
        this.method2809();
    }

    @ObfuscatedName("ej.bx(I)V")
    public void method2809() {
        this.field2486 = new boolean[this.field2468.length];
        for (int var1 = 0; var1 < this.field2486.length; var1++) {
            this.field2486[var1] = false;
        }
        if (this.field2494 == null) {
            this.field2488 = true;
            return;
        }
        this.field2485 = -1;
        for (int var2 = 0; var2 < this.field2486.length; var2++) {
            if (this.field2476[var2] > 0) {
                class123 var3 = this.field2494;
                class151 var5 = new class151();
                var5.field2500 = 1;
                var5.field2894 = (long) var2;
                var5.field2502 = var3;
                var5.field2501 = this;
                class180 var6 = class152.field2514;
                synchronized (class152.field2514) {
                    class152.field2514.method3224(var5);
                }
                Object var8 = class152.field2511;
                synchronized (class152.field2511) {
                    if (class152.field2510 == 0) {
                        Statics.field2056.method2487(new class152(), 5);
                    }
                    class152.field2510 = 600;
                }
                this.field2485 = var2;
            }
        }
        if (this.field2485 == -1) {
            this.field2488 = true;
        }
    }

    @ObfuscatedName("ej.be(II)I")
    public int method2787(int arg0) {
        if (this.field2468[arg0] != null) {
            return 100;
        } else if (this.field2486[arg0]) {
            return 100;
        } else {
            int var2 = this.field2487;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2162 != null && Statics.field2162.field2894 == var3) {
                var5 = Statics.field2685.field1841 * 99 / (Statics.field2685.field1842.length - Statics.field2162.field2538) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ej.ba(S)I")
    public int method2792() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2468.length; var3++) {
            if (this.field2476[var3] > 0) {
                var1 += 100;
                var2 += this.method2787(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
