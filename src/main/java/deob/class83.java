package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ef")
public class class83 extends class87 {

    @ObfuscatedName("ef.n")
    public volatile boolean[] field1171;

    @ObfuscatedName("ef.l")
    public boolean field1166 = false;

    @ObfuscatedName("ef.h")
    public class113 field1163;

    @ObfuscatedName("ef.w")
    public int field1172;

    @ObfuscatedName("ef.t")
    public class113 field1167;

    @ObfuscatedName("ef.r")
    public volatile boolean field1165 = false;

    @ObfuscatedName("ef.q")
    public static CRC32 field1168 = new CRC32();

    @ObfuscatedName("ef.as")
    public int field1169;

    @ObfuscatedName("ef.ax")
    public int field1164 = -1;

    @ObfuscatedName("ef.ac")
    public int field1170;

    @ObfuscatedName("ef.c(II)V")
    public void method1226(int arg0) {
        class105.method2051(this.field1172, arg0);
    }

    @ObfuscatedName("ef.br(I)I")
    public int method1227() {
        if (this.field1165) {
            return 100;
        } else if (this.field1236 == null) {
            int var1 = this.field1172;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1437 != null && Statics.field1437.field76 == var2) {
                var4 = Statics.field1929.field303 * 99 / (Statics.field1929.field306.length - Statics.field1437.field1109) + 1;
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

    @ObfuscatedName("ef.y(II)V")
    public void method1229(int arg0) {
        if (this.field1163 == null || this.field1171 == null || !this.field1171[arg0]) {
            class105.method3166(this, this.field1172, arg0, this.field1238[arg0], (byte) 2, true);
            return;
        }
        class113 var2 = this.field1163;
        byte[] var4 = null;
        class71 var5 = class5.field48;
        synchronized (class5.field48) {
            for (class95 var6 = (class95) class5.field48.method1104(); var6 != null; var6 = (class95) class5.field48.method1106()) {
                if ((long) arg0 == var6.field76 && var6.field1338 == var2 && var6.field1341 == 0) {
                    var4 = var6.field1337;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method1972(arg0);
            this.method1232(var2, arg0, var8, true);
        } else {
            this.method1232(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ef.bc(III)V")
    public void method1230(int arg0, int arg1) {
        this.field1169 = arg0;
        this.field1170 = arg1;
        if (this.field1167 == null) {
            class105.method3166(this, 255, this.field1172, this.field1169, (byte) 0, true);
            return;
        }
        int var3 = this.field1172;
        class113 var4 = this.field1167;
        byte[] var6 = null;
        class71 var7 = class5.field48;
        synchronized (class5.field48) {
            for (class95 var8 = (class95) class5.field48.method1104(); var8 != null; var8 = (class95) class5.field48.method1106()) {
                if ((long) var3 == var8.field76 && var8.field1338 == var4 && var8.field1341 == 0) {
                    var6 = var8.field1337;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method1972(var3);
            this.method1232(var4, var3, var10, true);
        } else {
            this.method1232(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ef.be(I[BZZI)V")
    public void method1231(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field1165) {
                throw new RuntimeException();
            }
            if (this.field1167 != null) {
                class5.method2165(this.field1172, arg1, this.field1167);
            }
            this.method1297(arg1);
            this.method1251();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field1234[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field1234[arg0];
        if (this.field1163 != null) {
            class5.method2165(arg0, arg1, this.field1163);
            this.field1171[arg0] = true;
        }
        if (arg3) {
            this.field1236[arg0] = class50.method1082(arg1, false);
        }
    }

    @ObfuscatedName("ef.bz(Lbs;I[BZI)V")
    public void method1232(class113 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field1167 != arg0) {
            if (!arg3 && this.field1164 == arg1) {
                this.field1165 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field1171[arg1] = false;
                if (this.field1166 || arg3) {
                    class105.method3166(this, this.field1172, arg1, this.field1238[arg1], (byte) 2, arg3);
                }
                return;
            }
            field1168.reset();
            field1168.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field1168.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field1238[arg1] != var9 || this.field1234[arg1] != var10) {
                this.field1171[arg1] = false;
                if (this.field1166 || arg3) {
                    class105.method3166(this, this.field1172, arg1, this.field1238[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field1171[arg1] = true;
            if (arg3) {
                this.field1236[arg1] = class50.method1082(arg2, false);
            }
            return;
        }
        if (this.field1165) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class105.method3166(this, 255, this.field1172, this.field1169, (byte) 0, true);
            return;
        }
        field1168.reset();
        field1168.update(arg2, 0, arg2.length);
        int var5 = (int) field1168.getValue();
        class28 var6 = new class28(class87.method1403(arg2));
        int var7 = var6.method450();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method504();
        }
        if (this.field1169 != var5 || this.field1170 != var8) {
            class105.method3166(this, 255, this.field1172, this.field1169, (byte) 0, true);
            return;
        }
        this.method1297(arg2);
        this.method1251();
    }

    @ObfuscatedName("ef.bd(II)I")
    public int method1234(int arg0) {
        if (this.field1236[arg0] != null) {
            return 100;
        } else if (this.field1171[arg0]) {
            return 100;
        } else {
            int var2 = this.field1172;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1437 != null && Statics.field1437.field76 == var3) {
                var5 = Statics.field1929.field303 * 99 / (Statics.field1929.field306.length - Statics.field1437.field1109) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ef.cf(I)I")
    public int method1235() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1236.length; var3++) {
            if (this.field1237[var3] > 0) {
                var1 += 100;
                var2 += this.method1234(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }

    public class83(class113 arg0, class113 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1163 = arg0;
        this.field1167 = arg1;
        this.field1172 = arg2;
        this.field1166 = arg5;
        class105.method3261(this, this.field1172);
    }

    @ObfuscatedName("ef.bt(B)V")
    public void method1251() {
        this.field1171 = new boolean[this.field1236.length];
        for (int var1 = 0; var1 < this.field1171.length; var1++) {
            this.field1171[var1] = false;
        }
        if (this.field1163 == null) {
            this.field1165 = true;
            return;
        }
        this.field1164 = -1;
        for (int var2 = 0; var2 < this.field1171.length; var2++) {
            if (this.field1237[var2] > 0) {
                class113 var3 = this.field1163;
                class95 var5 = new class95();
                var5.field1341 = 1;
                var5.field76 = (long) var2;
                var5.field1338 = var3;
                var5.field1339 = this;
                class71 var6 = class5.field48;
                synchronized (class5.field48) {
                    class5.field48.method1099(var5);
                }
                Object var8 = class5.field44;
                synchronized (class5.field44) {
                    if (class5.field46 == 0) {
                        Statics.field2717.method2224(new class5(), 5);
                    }
                    class5.field46 = 600;
                }
                this.field1164 = var2;
            }
        }
        if (this.field1164 == -1) {
            this.field1165 = true;
        }
    }
}
