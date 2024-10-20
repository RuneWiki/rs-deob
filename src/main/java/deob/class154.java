package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eo")
public class class154 extends class152 {

    @ObfuscatedName("eo.i")
    public class71 field2556;

    @ObfuscatedName("eo.e")
    public class71 field2560;

    @ObfuscatedName("eo.n")
    public int field2558;

    @ObfuscatedName("eo.q")
    public volatile boolean field2559 = false;

    @ObfuscatedName("eo.w")
    public boolean field2563 = false;

    @ObfuscatedName("eo.o")
    public volatile boolean[] field2561;

    @ObfuscatedName("eo.j")
    public static CRC32 field2562 = new CRC32();

    @ObfuscatedName("eo.ae")
    public int field2566;

    @ObfuscatedName("eo.aq")
    public int field2564;

    @ObfuscatedName("eo.ap")
    public int field2557 = -1;

    public class154(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2556 = arg0;
        this.field2560 = arg1;
        this.field2558 = arg2;
        this.field2563 = arg5;
        int var8 = this.field2558;
        if (Statics.field2058 == null) {
            class153.method1321((class154) null, 255, 255, 0, (byte) 0, true);
            class153.field2549[var8] = this;
        } else {
            Statics.field2058.field2042 = var8 * 8 + 5;
            int var9 = Statics.field2058.method2405();
            int var10 = Statics.field2058.method2405();
            this.method3038(var9, var10);
        }
    }

    @ObfuscatedName("eo.ci(B)I")
    public int method3030() {
        if (this.field2559) {
            return 100;
        } else if (this.field2512 == null) {
            int var1 = class153.method1255(255, this.field2558);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("eo.g(IB)V")
    public void method2969(int arg0) {
        int var2 = this.field2558;
        long var3 = (long) ((var2 << 16) + arg0);
        class155 var5 = (class155) class153.field2548.method3255(var3);
        if (var5 != null) {
            class153.field2531.method3223(var5);
        }
    }

    @ObfuscatedName("eo.y(IB)V")
    public void method2942(int arg0) {
        if (this.field2556 == null || this.field2561 == null || !this.field2561[arg0]) {
            class153.method1321(this, this.field2558, arg0, this.field2530[arg0], (byte) 2, true);
            return;
        }
        class71 var2 = this.field2556;
        byte[] var4 = null;
        class177 var5 = class157.field2583;
        synchronized (class157.field2583) {
            for (class156 var6 = (class156) class157.field2583.method3278(); var6 != null; var6 = (class156) class157.field2583.method3280()) {
                if ((long) arg0 == var6.field2818 && var6.field2576 == var2 && var6.field2577 == 0) {
                    var4 = var6.field2573;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method1379(arg0);
            this.method3031(var2, arg0, var8, true);
        } else {
            this.method3031(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("eo.cf(III)V")
    public void method3038(int arg0, int arg1) {
        this.field2566 = arg0;
        this.field2564 = arg1;
        if (this.field2560 == null) {
            class153.method1321(this, 255, this.field2558, this.field2566, (byte) 0, true);
            return;
        }
        int var3 = this.field2558;
        class71 var4 = this.field2560;
        byte[] var6 = null;
        class177 var7 = class157.field2583;
        synchronized (class157.field2583) {
            for (class156 var8 = (class156) class157.field2583.method3278(); var8 != null; var8 = (class156) class157.field2583.method3280()) {
                if ((long) var3 == var8.field2818 && var8.field2576 == var4 && var8.field2577 == 0) {
                    var6 = var8.field2573;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method1379(var3);
            this.method3031(var4, var3, var10, true);
        } else {
            this.method3031(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("eo.cb(I[BZZI)V")
    public void method3033(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2514[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2514[arg0];
            if (this.field2556 != null) {
                class157.method2620(arg0, arg1, this.field2556);
                this.field2561[arg0] = true;
            }
            if (arg3) {
                this.field2512[arg0] = class119.method40(arg1, false);
            }
            return;
        }
        if (this.field2559) {
            throw new RuntimeException();
        }
        if (this.field2560 != null) {
            int var5 = this.field2558;
            class71 var6 = this.field2560;
            class156 var7 = new class156();
            var7.field2577 = 0;
            var7.field2818 = (long) var5;
            var7.field2573 = arg1;
            var7.field2576 = var6;
            class177 var8 = class157.field2583;
            synchronized (class157.field2583) {
                class157.field2583.method3273(var7);
            }
            Object var10 = class157.field2581;
            synchronized (class157.field2581) {
                if (class157.field2580 == 0) {
                    Statics.field1652.method1460(new class157(), 5);
                }
                class157.field2580 = 600;
            }
        }
        this.method2932(arg1);
        this.method3036();
    }

    @ObfuscatedName("eo.cy(Lbo;I[BZI)V")
    public void method3031(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2560 != arg0) {
            if (!arg3 && this.field2557 == arg1) {
                this.field2559 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2561[arg1] = false;
                if (this.field2563 || arg3) {
                    class153.method1321(this, this.field2558, arg1, this.field2530[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2562.reset();
            field2562.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2562.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2530[arg1] != var9 || this.field2514[arg1] != var10) {
                this.field2561[arg1] = false;
                if (this.field2563 || arg3) {
                    class153.method1321(this, this.field2558, arg1, this.field2530[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2561[arg1] = true;
            if (arg3) {
                this.field2512[arg1] = class119.method40(arg2, false);
            }
            return;
        }
        if (this.field2559) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class153.method1321(this, 255, this.field2558, this.field2566, (byte) 0, true);
            return;
        }
        field2562.reset();
        field2562.update(arg2, 0, arg2.length);
        int var5 = (int) field2562.getValue();
        class127 var6 = new class127(class152.method2637(arg2));
        int var7 = var6.method2509();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2405();
        }
        if (this.field2566 != var5 || this.field2564 != var8) {
            class153.method1321(this, 255, this.field2558, this.field2566, (byte) 0, true);
            return;
        }
        this.method2932(arg2);
        this.method3036();
    }

    @ObfuscatedName("eo.cs(B)V")
    public void method3036() {
        this.field2561 = new boolean[this.field2512.length];
        for (int var1 = 0; var1 < this.field2561.length; var1++) {
            this.field2561[var1] = false;
        }
        if (this.field2556 == null) {
            this.field2559 = true;
            return;
        }
        this.field2557 = -1;
        for (int var2 = 0; var2 < this.field2561.length; var2++) {
            if (this.field2515[var2] > 0) {
                class71 var3 = this.field2556;
                class156 var5 = new class156();
                var5.field2577 = 1;
                var5.field2818 = (long) var2;
                var5.field2576 = var3;
                var5.field2575 = this;
                class177 var6 = class157.field2583;
                synchronized (class157.field2583) {
                    class157.field2583.method3273(var5);
                }
                Object var8 = class157.field2581;
                synchronized (class157.field2581) {
                    if (class157.field2580 == 0) {
                        Statics.field1652.method1460(new class157(), 5);
                    }
                    class157.field2580 = 600;
                }
                this.field2557 = var2;
            }
        }
        if (this.field2557 == -1) {
            this.field2559 = true;
        }
    }

    @ObfuscatedName("eo.co(II)I")
    public int method3035(int arg0) {
        if (this.field2512[arg0] == null) {
            return this.field2561[arg0] ? 100 : class153.method1255(this.field2558, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("eo.cv(I)I")
    public int method3037() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2512.length; var3++) {
            if (this.field2515[var3] > 0) {
                var1 += 100;
                var2 += this.method3035(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
