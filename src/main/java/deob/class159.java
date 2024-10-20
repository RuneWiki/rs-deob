package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fk")
public class class159 extends class158 {

    @ObfuscatedName("fk.p")
    public class126 field2601;

    @ObfuscatedName("fk.d")
    public class126 field2598;

    @ObfuscatedName("fk.j")
    public int field2596;

    @ObfuscatedName("fk.k")
    public volatile boolean field2597 = false;

    @ObfuscatedName("fk.y")
    public boolean field2602 = false;

    @ObfuscatedName("fk.c")
    public volatile boolean[] field2599;

    @ObfuscatedName("fk.g")
    public static CRC32 field2600 = new CRC32();

    @ObfuscatedName("fk.av")
    public int field2595;

    @ObfuscatedName("fk.ag")
    public int field2594;

    @ObfuscatedName("fk.aq")
    public int field2603 = -1;

    public class159(class126 arg0, class126 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2601 = arg0;
        this.field2598 = arg1;
        this.field2596 = arg2;
        this.field2602 = arg5;
        int var8 = this.field2596;
        if (Statics.field1970 == null) {
            class162.method2656((class159) null, 255, 255, 0, (byte) 0, true);
            class162.field2636[var8] = this;
        } else {
            Statics.field1970.field1890 = var8 * 8 + 5;
            int var9 = Statics.field1970.method2239();
            int var10 = Statics.field1970.method2239();
            this.method2998(var9, var10);
        }
    }

    @ObfuscatedName("fk.bz(I)I")
    public int method2997() {
        if (this.field2597) {
            return 100;
        } else if (this.field2580 == null) {
            int var1 = this.field2596;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1893 != null && Statics.field1893.field3018 == var2) {
                var4 = Statics.field2633.field1890 * 99 / (Statics.field2633.field1889.length - Statics.field1893.field2643) + 1;
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

    @ObfuscatedName("fk.o(II)V")
    public void method2924(int arg0) {
        class162.method2832(this.field2596, arg0);
    }

    @ObfuscatedName("fk.e(II)V")
    public void method2932(int arg0) {
        if (this.field2601 == null || this.field2599 == null || !this.field2599[arg0]) {
            class162.method2656(this, this.field2596, arg0, this.field2574[arg0], (byte) 2, true);
            return;
        }
        class126 var2 = this.field2601;
        byte[] var4 = null;
        class190 var5 = class161.field2617;
        synchronized (class161.field2617) {
            for (class160 var6 = (class160) class161.field2617.method3451(); var6 != null; var6 = (class160) class161.field2617.method3448()) {
                if ((long) arg0 == var6.field3018 && var6.field2606 == var2 && var6.field2604 == 0) {
                    var4 = var6.field2605;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2591(arg0);
            this.method3011(var2, arg0, var8, true);
        } else {
            this.method3011(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("fk.bn(IIB)V")
    public void method2998(int arg0, int arg1) {
        this.field2595 = arg0;
        this.field2594 = arg1;
        if (this.field2598 == null) {
            class162.method2656(this, 255, this.field2596, this.field2595, (byte) 0, true);
            return;
        }
        int var3 = this.field2596;
        class126 var4 = this.field2598;
        byte[] var6 = null;
        class190 var7 = class161.field2617;
        synchronized (class161.field2617) {
            for (class160 var8 = (class160) class161.field2617.method3451(); var8 != null; var8 = (class160) class161.field2617.method3448()) {
                if ((long) var3 == var8.field3018 && var8.field2606 == var4 && var8.field2604 == 0) {
                    var6 = var8.field2605;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2591(var3);
            this.method3011(var4, var3, var10, true);
        } else {
            this.method3011(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("fk.cy(I[BZZB)V")
    public void method2999(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2597) {
                throw new RuntimeException();
            }
            if (this.field2598 != null) {
                class161.method2896(this.field2596, arg1, this.field2598);
            }
            this.method2923(arg1);
            this.method3009();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2575[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2575[arg0];
        if (this.field2601 != null) {
            class161.method2896(arg0, arg1, this.field2601);
            this.field2599[arg0] = true;
        }
        if (arg3) {
            this.field2580[arg0] = class117.method558(arg1, false);
        }
    }

    @ObfuscatedName("fk.cn(Ldt;I[BZB)V")
    public void method3011(class126 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2598 != arg0) {
            if (!arg3 && this.field2603 == arg1) {
                this.field2597 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2599[arg1] = false;
                if (this.field2602 || arg3) {
                    class162.method2656(this, this.field2596, arg1, this.field2574[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2600.reset();
            field2600.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2600.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2574[arg1] != var9 || this.field2575[arg1] != var10) {
                this.field2599[arg1] = false;
                if (this.field2602 || arg3) {
                    class162.method2656(this, this.field2596, arg1, this.field2574[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2599[arg1] = true;
            if (arg3) {
                this.field2580[arg1] = class117.method558(arg2, false);
            }
            return;
        }
        if (this.field2597) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class162.method2656(this, 255, this.field2596, this.field2595, (byte) 0, true);
            return;
        }
        field2600.reset();
        field2600.update(arg2, 0, arg2.length);
        int var5 = (int) field2600.getValue();
        class111 var6 = new class111(class158.method2664(arg2));
        int var7 = var6.method2234();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2596 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2239();
        }
        if (this.field2595 != var5 || this.field2594 != var8) {
            class162.method2656(this, 255, this.field2596, this.field2595, (byte) 0, true);
            return;
        }
        this.method2923(arg2);
        this.method3009();
    }

    @ObfuscatedName("fk.cs(S)V")
    public void method3009() {
        this.field2599 = new boolean[this.field2580.length];
        for (int var1 = 0; var1 < this.field2599.length; var1++) {
            this.field2599[var1] = false;
        }
        if (this.field2601 == null) {
            this.field2597 = true;
            return;
        }
        this.field2603 = -1;
        for (int var2 = 0; var2 < this.field2599.length; var2++) {
            if (this.field2583[var2] > 0) {
                class126 var3 = this.field2601;
                class160 var5 = new class160();
                var5.field2604 = 1;
                var5.field3018 = (long) var2;
                var5.field2606 = var3;
                var5.field2607 = this;
                class190 var6 = class161.field2617;
                synchronized (class161.field2617) {
                    class161.field2617.method3441(var5);
                }
                Object var8 = class161.field2612;
                synchronized (class161.field2612) {
                    if (class161.field2611 == 0) {
                        Statics.field202.method2610(new class161(), 5);
                    }
                    class161.field2611 = 600;
                }
                this.field2603 = var2;
            }
        }
        if (this.field2603 == -1) {
            this.field2597 = true;
        }
    }

    @ObfuscatedName("fk.cg(II)I")
    public int method3001(int arg0) {
        if (this.field2580[arg0] != null) {
            return 100;
        } else if (this.field2599[arg0]) {
            return 100;
        } else {
            int var2 = this.field2596;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1893 != null && Statics.field1893.field3018 == var3) {
                var5 = Statics.field2633.field1890 * 99 / (Statics.field2633.field1889.length - Statics.field1893.field2643) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fk.cv(B)I")
    public int method3002() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2580.length; var3++) {
            if (this.field2583[var3] > 0) {
                var1 += 100;
                var2 += this.method3001(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
