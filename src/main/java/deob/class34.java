package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eb")
public class class34 extends class89 {

    @ObfuscatedName("eb.c")
    public volatile boolean[] field428;

    @ObfuscatedName("eb.a")
    public int field425;

    @ObfuscatedName("eb.m")
    public boolean field426 = false;

    @ObfuscatedName("eb.v")
    public static CRC32 field429 = new CRC32();

    @ObfuscatedName("eb.u")
    public class114 field433;

    @ObfuscatedName("eb.p")
    public volatile boolean field432 = false;

    @ObfuscatedName("eb.y")
    public class114 field424;

    @ObfuscatedName("eb.ax")
    public int field435;

    @ObfuscatedName("eb.aw")
    public int field423 = -1;

    @ObfuscatedName("eb.ac")
    public int field430;

    @ObfuscatedName("eb.bf(B)I")
    public int method488() {
        if (this.field432) {
            return 100;
        } else if (this.field1266 == null) {
            int var1 = this.field425;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1283 != null && Statics.field1283.field213 == var2) {
                var4 = Statics.field503.field540 * 99 / (Statics.field503.field541.length - Statics.field1283.field934) + 1;
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

    @ObfuscatedName("eb.h(IB)V")
    public void method489(int arg0) {
        int var2 = this.field425;
        long var3 = (long) ((var2 << 16) + arg0);
        class81 var5 = (class81) class79.field914.method20(var3);
        if (var5 != null) {
            class79.field913.method255(var5);
        }
    }

    @ObfuscatedName("eb.x(II)V")
    public void method490(int arg0) {
        if (this.field433 == null || this.field428 == null || !this.field428[arg0]) {
            class79.method1359(this, this.field425, arg0, this.field1260[arg0], (byte) 2, true);
            return;
        }
        class114 var2 = this.field433;
        byte[] var4 = null;
        class15 var5 = class5.field15;
        synchronized (class5.field15) {
            for (class99 var6 = (class99) class5.field15.method212(); var6 != null; var6 = (class99) class5.field15.method201()) {
                if ((long) arg0 == var6.field213 && var6.field1377 == var2 && var6.field1376 == 0) {
                    var4 = var6.field1374;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2054(arg0);
            this.method493(var2, arg0, var8, true);
        } else {
            this.method493(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("eb.bt(III)V")
    public void method491(int arg0, int arg1) {
        this.field430 = arg0;
        this.field435 = arg1;
        if (this.field424 == null) {
            class79.method1359(this, 255, this.field425, this.field430, (byte) 0, true);
            return;
        }
        int var3 = this.field425;
        class114 var4 = this.field424;
        byte[] var6 = null;
        class15 var7 = class5.field15;
        synchronized (class5.field15) {
            for (class99 var8 = (class99) class5.field15.method212(); var8 != null; var8 = (class99) class5.field15.method201()) {
                if ((long) var3 == var8.field213 && var8.field1377 == var4 && var8.field1376 == 0) {
                    var6 = var8.field1374;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2054(var3);
            this.method493(var4, var3, var10, true);
        } else {
            this.method493(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("eb.bs(I[BZZI)V")
    public void method492(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field432) {
                throw new RuntimeException();
            }
            if (this.field424 != null) {
                class5.method1216(this.field425, arg1, this.field424);
            }
            this.method1265(arg1);
            this.method494();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field1261[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field1261[arg0];
        if (this.field433 != null) {
            class5.method1216(arg0, arg1, this.field433);
            this.field428[arg0] = true;
        }
        if (arg3) {
            this.field1266[arg0] = class51.method2870(arg1, false);
        }
    }

    @ObfuscatedName("eb.bv(Lbr;I[BZI)V")
    public void method493(class114 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field424 != arg0) {
            if (!arg3 && this.field423 == arg1) {
                this.field432 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field428[arg1] = false;
                if (this.field426 || arg3) {
                    class79.method1359(this, this.field425, arg1, this.field1260[arg1], (byte) 2, arg3);
                }
                return;
            }
            field429.reset();
            field429.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field429.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field1260[arg1] != var9 || this.field1261[arg1] != var10) {
                this.field428[arg1] = false;
                if (this.field426 || arg3) {
                    class79.method1359(this, this.field425, arg1, this.field1260[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field428[arg1] = true;
            if (arg3) {
                this.field1266[arg1] = class51.method2870(arg2, false);
            }
            return;
        }
        if (this.field432) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class79.method1359(this, 255, this.field425, this.field430, (byte) 0, true);
            return;
        }
        field429.reset();
        field429.update(arg2, 0, arg2.length);
        int var5 = (int) field429.getValue();
        class50 var6 = new class50(class89.method1166(arg2));
        int var7 = var6.method726();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method685();
        }
        if (this.field430 != var5 || this.field435 != var8) {
            class79.method1359(this, 255, this.field425, this.field430, (byte) 0, true);
            return;
        }
        this.method1265(arg2);
        this.method494();
    }

    @ObfuscatedName("eb.bz(I)V")
    public void method494() {
        this.field428 = new boolean[this.field1266.length];
        for (int var1 = 0; var1 < this.field428.length; var1++) {
            this.field428[var1] = false;
        }
        if (this.field433 == null) {
            this.field432 = true;
            return;
        }
        this.field423 = -1;
        for (int var2 = 0; var2 < this.field428.length; var2++) {
            if (this.field1257[var2] > 0) {
                class114 var3 = this.field433;
                class99 var5 = new class99();
                var5.field1376 = 1;
                var5.field213 = (long) var2;
                var5.field1377 = var3;
                var5.field1375 = this;
                class15 var6 = class5.field15;
                synchronized (class5.field15) {
                    class5.field15.method219(var5);
                }
                class5.method551();
                this.field423 = var2;
            }
        }
        if (this.field423 == -1) {
            this.field432 = true;
        }
    }

    @ObfuscatedName("eb.ci(I)I")
    public int method497() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1266.length; var3++) {
            if (this.field1257[var3] > 0) {
                var1 += 100;
                var2 += this.method508(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }

    @ObfuscatedName("eb.bd(II)I")
    public int method508(int arg0) {
        if (this.field1266[arg0] != null) {
            return 100;
        } else if (this.field428[arg0]) {
            return 100;
        } else {
            int var2 = this.field425;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1283 != null && Statics.field1283.field213 == var3) {
                var5 = Statics.field503.field540 * 99 / (Statics.field503.field541.length - Statics.field1283.field934) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    public class34(class114 arg0, class114 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field433 = arg0;
        this.field424 = arg1;
        this.field425 = arg2;
        this.field426 = arg5;
        int var8 = this.field425;
        if (Statics.field1441 == null) {
            class79.method1359((class34) null, 255, 255, 0, (byte) 0, true);
            class79.field916[var8] = this;
        } else {
            Statics.field1441.field540 = var8 * 8 + 5;
            int var9 = Statics.field1441.method685();
            int var10 = Statics.field1441.method685();
            this.method491(var9, var10);
        }
    }
}
