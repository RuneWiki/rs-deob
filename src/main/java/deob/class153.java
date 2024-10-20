package deob;

import java.util.zip.CRC32;

@ObfuscatedName("et")
public class class153 extends class151 {

    @ObfuscatedName("et.f")
    public class70 field2548;

    @ObfuscatedName("et.a")
    public class70 field2541;

    @ObfuscatedName("et.x")
    public int field2544;

    @ObfuscatedName("et.r")
    public volatile boolean field2543 = false;

    @ObfuscatedName("et.t")
    public boolean field2540 = false;

    @ObfuscatedName("et.b")
    public volatile boolean[] field2545;

    @ObfuscatedName("et.q")
    public static CRC32 field2546 = new CRC32();

    @ObfuscatedName("et.ae")
    public int field2547;

    @ObfuscatedName("et.at")
    public int field2542;

    @ObfuscatedName("et.aj")
    public int field2549 = -1;

    public class153(class70 arg0, class70 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2548 = arg0;
        this.field2541 = arg1;
        this.field2544 = arg2;
        this.field2540 = arg5;
        class152.method127(this, this.field2544);
    }

    @ObfuscatedName("et.by(I)I")
    public int method2997() {
        if (this.field2543) {
            return 100;
        } else if (this.field2510 == null) {
            int var1 = class152.method36(255, this.field2544);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("et.j(IB)V")
    public void method2912(int arg0) {
        class152.method2624(this.field2544, arg0);
    }

    @ObfuscatedName("et.u(II)V")
    public void method2921(int arg0) {
        if (this.field2548 == null || this.field2545 == null || !this.field2545[arg0]) {
            class152.method668(this, this.field2544, arg0, this.field2497[arg0], (byte) 2, true);
        } else {
            class156.method126(arg0, this.field2548, this);
        }
    }

    @ObfuscatedName("et.bk(III)V")
    public void method2998(int arg0, int arg1) {
        this.field2547 = arg0;
        this.field2542 = arg1;
        if (this.field2541 == null) {
            class152.method668(this, 255, this.field2544, this.field2547, (byte) 0, true);
            return;
        }
        int var3 = this.field2544;
        class70 var4 = this.field2541;
        byte[] var6 = null;
        class176 var7 = class156.field2562;
        synchronized (class156.field2562) {
            for (class155 var8 = (class155) class156.field2562.method3285(); var8 != null; var8 = (class155) class156.field2562.method3299()) {
                if ((long) var3 == var8.field2809 && var8.field2554 == var4 && var8.field2560 == 0) {
                    var6 = var8.field2555;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method1359(var3);
            this.method3000(var4, var3, var10, true);
        } else {
            this.method3000(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("et.bi(I[BZZI)V")
    public void method2999(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2543) {
                throw new RuntimeException();
            }
            if (this.field2541 != null) {
                Statics.method2618(this.field2544, arg1, this.field2541);
            }
            this.method2911(arg1);
            this.method3016();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2513[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2513[arg0];
        if (this.field2548 != null) {
            Statics.method2618(arg0, arg1, this.field2548);
            this.field2545[arg0] = true;
        }
        if (arg3) {
            this.field2510[arg0] = class118.method597(arg1, false);
        }
    }

    @ObfuscatedName("et.bc(Lbx;I[BZI)V")
    public void method3000(class70 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2541 != arg0) {
            if (!arg3 && this.field2549 == arg1) {
                this.field2543 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2545[arg1] = false;
                if (this.field2540 || arg3) {
                    class152.method668(this, this.field2544, arg1, this.field2497[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2546.reset();
            field2546.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2546.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2497[arg1] != var9 || this.field2513[arg1] != var10) {
                this.field2545[arg1] = false;
                if (this.field2540 || arg3) {
                    class152.method668(this, this.field2544, arg1, this.field2497[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2545[arg1] = true;
            if (arg3) {
                this.field2510[arg1] = class118.method597(arg2, false);
            }
            return;
        }
        if (this.field2543) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class152.method668(this, 255, this.field2544, this.field2547, (byte) 0, true);
            return;
        }
        field2546.reset();
        field2546.update(arg2, 0, arg2.length);
        int var5 = (int) field2546.getValue();
        class126 var6 = new class126(Statics.method1357(arg2));
        int var7 = var6.method2544();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2380();
        }
        if (this.field2547 != var5 || this.field2542 != var8) {
            class152.method668(this, 255, this.field2544, this.field2547, (byte) 0, true);
            return;
        }
        this.method2911(arg2);
        this.method3016();
    }

    @ObfuscatedName("et.bw(B)V")
    public void method3016() {
        this.field2545 = new boolean[this.field2510.length];
        for (int var1 = 0; var1 < this.field2545.length; var1++) {
            this.field2545[var1] = false;
        }
        if (this.field2548 == null) {
            this.field2543 = true;
            return;
        }
        this.field2549 = -1;
        for (int var2 = 0; var2 < this.field2545.length; var2++) {
            if (this.field2507[var2] > 0) {
                class156.method2621(var2, this.field2548, this);
                this.field2549 = var2;
            }
        }
        if (this.field2549 == -1) {
            this.field2543 = true;
        }
    }

    @ObfuscatedName("et.cj(II)I")
    public int method3007(int arg0) {
        if (this.field2510[arg0] == null) {
            return this.field2545[arg0] ? 100 : class152.method36(this.field2544, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("et.cs(I)I")
    public int method3003() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2510.length; var3++) {
            if (this.field2507[var3] > 0) {
                var1 += 100;
                var2 += this.method3007(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
