package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ev")
public class class150 extends class149 {

    @ObfuscatedName("ev.q")
    public class123 field2476;

    @ObfuscatedName("ev.x")
    public class123 field2482;

    @ObfuscatedName("ev.t")
    public int field2478;

    @ObfuscatedName("ev.e")
    public volatile boolean field2474 = false;

    @ObfuscatedName("ev.m")
    public boolean field2475 = false;

    @ObfuscatedName("ev.o")
    public volatile boolean[] field2479;

    @ObfuscatedName("ev.a")
    public static CRC32 field2480 = new CRC32();

    @ObfuscatedName("ev.am")
    public int field2481;

    @ObfuscatedName("ev.ac")
    public int field2477;

    @ObfuscatedName("ev.ap")
    public int field2483 = -1;

    public class150(class123 arg0, class123 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2476 = arg0;
        this.field2482 = arg1;
        this.field2478 = arg2;
        this.field2475 = arg5;
        int var8 = this.field2478;
        if (Statics.field146 == null) {
            class153.method480((class150) null, 255, 255, 0, (byte) 0, true);
            class153.field2515[var8] = this;
        } else {
            Statics.field146.field1824 = var8 * 8 + 5;
            int var9 = Statics.field146.method2117();
            int var10 = Statics.field146.method2117();
            this.method2739(var9, var10);
        }
    }

    @ObfuscatedName("ev.cs(B)I")
    public int method2738() {
        if (this.field2474) {
            return 100;
        } else if (this.field2464 == null) {
            int var1 = this.field2478;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1427 != null && Statics.field1427.field2887 == var2) {
                var4 = Statics.field2400.field1824 * 99 / (Statics.field2400.field1828.length - Statics.field1427.field2522) + 1;
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

    @ObfuscatedName("ev.j(II)V")
    public void method2659(int arg0) {
        class153.method2345(this.field2478, arg0);
    }

    @ObfuscatedName("ev.h(IB)V")
    public void method2668(int arg0) {
        if (this.field2476 == null || this.field2479 == null || !this.field2479[arg0]) {
            class153.method480(this, this.field2478, arg0, this.field2468[arg0], (byte) 2, true);
            return;
        }
        class123 var2 = this.field2476;
        byte[] var4 = null;
        class180 var5 = class152.field2498;
        synchronized (class152.field2498) {
            for (class151 var6 = (class151) class152.field2498.method3174(); var6 != null; var6 = (class151) class152.field2498.method3176()) {
                if ((long) arg0 == var6.field2887 && var6.field2486 == var2 && var6.field2487 == 0) {
                    var4 = var6.field2491;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2430(arg0);
            this.method2743(var2, arg0, var8, true);
        } else {
            this.method2743(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ev.cw(III)V")
    public void method2739(int arg0, int arg1) {
        this.field2481 = arg0;
        this.field2477 = arg1;
        if (this.field2482 == null) {
            class153.method480(this, 255, this.field2478, this.field2481, (byte) 0, true);
            return;
        }
        int var3 = this.field2478;
        class123 var4 = this.field2482;
        byte[] var6 = null;
        class180 var7 = class152.field2498;
        synchronized (class152.field2498) {
            for (class151 var8 = (class151) class152.field2498.method3174(); var8 != null; var8 = (class151) class152.field2498.method3176()) {
                if ((long) var3 == var8.field2887 && var8.field2486 == var4 && var8.field2487 == 0) {
                    var6 = var8.field2491;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2430(var3);
            this.method2743(var4, var3, var10, true);
        } else {
            this.method2743(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ev.ce(I[BZZI)V")
    public void method2746(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2474) {
                throw new RuntimeException();
            }
            if (this.field2482 != null) {
                class152.method494(this.field2478, arg1, this.field2482);
            }
            this.method2658(arg1);
            this.method2740();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2459[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2459[arg0];
        if (this.field2476 != null) {
            class152.method494(arg0, arg1, this.field2476);
            this.field2479[arg0] = true;
        }
        if (arg3) {
            this.field2464[arg0] = class114.method157(arg1, false);
        }
    }

    @ObfuscatedName("ev.co(Ldx;I[BZI)V")
    public void method2743(class123 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2482 != arg0) {
            if (!arg3 && this.field2483 == arg1) {
                this.field2474 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2479[arg1] = false;
                if (this.field2475 || arg3) {
                    class153.method480(this, this.field2478, arg1, this.field2468[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2480.reset();
            field2480.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2480.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2468[arg1] != var9 || this.field2459[arg1] != var10) {
                this.field2479[arg1] = false;
                if (this.field2475 || arg3) {
                    class153.method480(this, this.field2478, arg1, this.field2468[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2479[arg1] = true;
            if (arg3) {
                this.field2464[arg1] = class114.method157(arg2, false);
            }
            return;
        }
        if (this.field2474) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class153.method480(this, 255, this.field2478, this.field2481, (byte) 0, true);
            return;
        }
        field2480.reset();
        field2480.update(arg2, 0, arg2.length);
        int var5 = (int) field2480.getValue();
        class108 var6 = new class108(class149.method2419(arg2));
        int var7 = var6.method2083();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2478 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2117();
        }
        if (this.field2481 != var5 || this.field2477 != var8) {
            class153.method480(this, 255, this.field2478, this.field2481, (byte) 0, true);
            return;
        }
        this.method2658(arg2);
        this.method2740();
    }

    @ObfuscatedName("ev.ck(I)V")
    public void method2740() {
        this.field2479 = new boolean[this.field2464.length];
        for (int var1 = 0; var1 < this.field2479.length; var1++) {
            this.field2479[var1] = false;
        }
        if (this.field2476 == null) {
            this.field2474 = true;
            return;
        }
        this.field2483 = -1;
        for (int var2 = 0; var2 < this.field2479.length; var2++) {
            if (this.field2460[var2] > 0) {
                class123 var3 = this.field2476;
                class151 var5 = new class151();
                var5.field2487 = 1;
                var5.field2887 = (long) var2;
                var5.field2486 = var3;
                var5.field2489 = this;
                class180 var6 = class152.field2498;
                synchronized (class152.field2498) {
                    class152.field2498.method3169(var5);
                }
                Object var8 = class152.field2496;
                synchronized (class152.field2496) {
                    if (class152.field2497 == 0) {
                        Statics.field519.method2442(new class152(), 5);
                    }
                    class152.field2497 = 600;
                }
                this.field2483 = var2;
            }
        }
        if (this.field2483 == -1) {
            this.field2474 = true;
        }
    }

    @ObfuscatedName("ev.ct(II)I")
    public int method2741(int arg0) {
        if (this.field2464[arg0] != null) {
            return 100;
        } else if (this.field2479[arg0]) {
            return 100;
        } else {
            int var2 = this.field2478;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1427 != null && Statics.field1427.field2887 == var3) {
                var5 = Statics.field2400.field1824 * 99 / (Statics.field2400.field1828.length - Statics.field1427.field2522) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ev.cd(I)I")
    public int method2745() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2464.length; var3++) {
            if (this.field2460[var3] > 0) {
                var1 += 100;
                var2 += this.method2741(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
