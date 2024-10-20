package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fl")
public class class168 extends class167 {

    @ObfuscatedName("fl.f")
    public class134 field2674;

    @ObfuscatedName("fl.d")
    public class134 field2667;

    @ObfuscatedName("fl.q")
    public int field2668;

    @ObfuscatedName("fl.o")
    public volatile boolean field2669 = false;

    @ObfuscatedName("fl.w")
    public boolean field2666 = false;

    @ObfuscatedName("fl.z")
    public volatile boolean[] field2675;

    @ObfuscatedName("fl.t")
    public static CRC32 field2670 = new CRC32();

    @ObfuscatedName("fl.aq")
    public int field2672;

    @ObfuscatedName("fl.an")
    public int field2671;

    @ObfuscatedName("fl.av")
    public int field2673 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2674 = arg0;
        this.field2667 = arg1;
        this.field2668 = arg2;
        this.field2666 = arg5;
        int var8 = this.field2668;
        if (Statics.field1330 == null) {
            class171.method86((class168) null, 255, 255, 0, (byte) 0, true);
            class171.field2707[var8] = this;
        } else {
            Statics.field1330.field1955 = var8 * 8 + 5;
            int var9 = Statics.field1330.method2386();
            int var10 = Statics.field1330.method2386();
            this.method3162(var9, var10);
        }
    }

    @ObfuscatedName("fl.ch(I)I")
    public int method3163() {
        if (this.field2669) {
            return 100;
        } else if (this.field2657 == null) {
            int var1 = this.field2668;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1976 != null && Statics.field1976.field3095 == var2) {
                var4 = Statics.field1345.field1955 * 99 / (Statics.field1345.field1959.length - Statics.field1976.field2715) + 1;
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

    @ObfuscatedName("fl.l(IB)V")
    public void method3124(int arg0) {
        int var2 = this.field2668;
        long var3 = (long) ((var2 << 16) + arg0);
        class172 var5 = (class172) class171.field2702.method3571(var3);
        if (var5 != null) {
            class171.field2698.method3671(var5);
        }
    }

    @ObfuscatedName("fl.p(IB)V")
    public void method3131(int arg0) {
        if (this.field2674 == null || this.field2675 == null || !this.field2675[arg0]) {
            class171.method86(this, this.field2668, arg0, this.field2647[arg0], (byte) 2, true);
        } else {
            class170.method2256(arg0, this.field2674, this);
        }
    }

    @ObfuscatedName("fl.cb(IIS)V")
    public void method3162(int arg0, int arg1) {
        this.field2672 = arg0;
        this.field2671 = arg1;
        if (this.field2667 == null) {
            class171.method86(this, 255, this.field2668, this.field2672, (byte) 0, true);
        } else {
            class170.method2256(this.field2668, this.field2667, this);
        }
    }

    @ObfuscatedName("fl.cm(I[BZZI)V")
    public void method3178(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2669) {
                throw new RuntimeException();
            }
            if (this.field2667 != null) {
                class170.method3003(this.field2668, arg1, this.field2667);
            }
            this.method3088(arg1);
            this.method3167();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2652[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2652[arg0];
        if (this.field2674 != null) {
            class170.method3003(arg0, arg1, this.field2674);
            this.field2675[arg0] = true;
        }
        if (arg3) {
            this.field2657[arg0] = class125.method1818(arg1, false);
        }
    }

    @ObfuscatedName("fl.cp(Lee;I[BZB)V")
    public void method3166(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2667 != arg0) {
            if (!arg3 && this.field2673 == arg1) {
                this.field2669 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2675[arg1] = false;
                if (this.field2666 || arg3) {
                    class171.method86(this, this.field2668, arg1, this.field2647[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2670.reset();
            field2670.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2670.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2647[arg1] != var9 || this.field2652[arg1] != var10) {
                this.field2675[arg1] = false;
                if (this.field2666 || arg3) {
                    class171.method86(this, this.field2668, arg1, this.field2647[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2675[arg1] = true;
            if (arg3) {
                this.field2657[arg1] = class125.method1818(arg2, false);
            }
            return;
        }
        if (this.field2669) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class171.method86(this, 255, this.field2668, this.field2672, (byte) 0, true);
            return;
        }
        field2670.reset();
        field2670.update(arg2, 0, arg2.length);
        int var5 = (int) field2670.getValue();
        class119 var6 = new class119(class167.method2780(arg2));
        int var7 = var6.method2562();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2668 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2386();
        }
        if (this.field2672 != var5 || this.field2671 != var8) {
            class171.method86(this, 255, this.field2668, this.field2672, (byte) 0, true);
            return;
        }
        this.method3088(arg2);
        this.method3167();
    }

    @ObfuscatedName("fl.ck(B)V")
    public void method3167() {
        this.field2675 = new boolean[this.field2657.length];
        for (int var1 = 0; var1 < this.field2675.length; var1++) {
            this.field2675[var1] = false;
        }
        if (this.field2674 == null) {
            this.field2669 = true;
            return;
        }
        this.field2673 = -1;
        for (int var2 = 0; var2 < this.field2675.length; var2++) {
            if (this.field2653[var2] > 0) {
                class170.method3053(var2, this.field2674, this);
                this.field2673 = var2;
            }
        }
        if (this.field2673 == -1) {
            this.field2669 = true;
        }
    }

    @ObfuscatedName("fl.cu(II)I")
    public int method3177(int arg0) {
        if (this.field2657[arg0] != null) {
            return 100;
        } else if (this.field2675[arg0]) {
            return 100;
        } else {
            int var2 = this.field2668;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1976 != null && Statics.field1976.field3095 == var3) {
                var5 = Statics.field1345.field1955 * 99 / (Statics.field1345.field1959.length - Statics.field1976.field2715) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fl.cf(B)I")
    public int method3169() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2657.length; var3++) {
            if (this.field2653[var3] > 0) {
                var1 += 100;
                var2 += this.method3177(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
