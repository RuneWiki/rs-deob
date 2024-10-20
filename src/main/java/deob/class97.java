package deob;

import java.util.zip.CRC32;

@ObfuscatedName("en")
public class class97 extends class81 {

    @ObfuscatedName("en.d")
    public volatile boolean[] field1123;

    @ObfuscatedName("en.b")
    public int field1125;

    @ObfuscatedName("en.a")
    public static CRC32 field1131 = new CRC32();

    @ObfuscatedName("en.k")
    public volatile boolean field1126 = false;

    @ObfuscatedName("en.u")
    public class121 field1134;

    @ObfuscatedName("en.q")
    public boolean field1127 = false;

    @ObfuscatedName("en.y")
    public class121 field1124;

    @ObfuscatedName("en.at")
    public int field1128;

    @ObfuscatedName("en.au")
    public int field1132 = -1;

    @ObfuscatedName("en.aa")
    public int field1129;

    public class97(class121 arg0, class121 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1134 = arg0;
        this.field1124 = arg1;
        this.field1125 = arg2;
        this.field1127 = arg5;
        int var8 = this.field1125;
        if (Statics.field2666 == null) {
            class53.method3051((class97) null, 255, 255, 0, (byte) 0, true);
            class53.field444[var8] = this;
        } else {
            Statics.field2666.field172 = var8 * 8 + 5;
            int var9 = Statics.field2666.method376();
            int var10 = Statics.field2666.method376();
            this.method1419(var9, var10);
        }
    }

    @ObfuscatedName("en.p(IB)V")
    public void method1125(int arg0) {
        class53.method2278(this.field1125, arg0);
    }

    @ObfuscatedName("en.x(IB)V")
    public void method1091(int arg0) {
        if (this.field1134 == null || this.field1123 == null || !this.field1123[arg0]) {
            class53.method3051(this, this.field1125, arg0, this.field913[arg0], (byte) 2, true);
        } else {
            class71.method590(arg0, this.field1134, this);
        }
    }

    @ObfuscatedName("en.cy(III)V")
    public void method1419(int arg0, int arg1) {
        this.field1129 = arg0;
        this.field1128 = arg1;
        if (this.field1124 == null) {
            class53.method3051(this, 255, this.field1125, this.field1129, (byte) 0, true);
        } else {
            class71.method590(this.field1125, this.field1124, this);
        }
    }

    @ObfuscatedName("en.cs(I[BZZI)V")
    public void method1420(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field1126) {
                throw new RuntimeException();
            }
            if (this.field1124 != null) {
                class71.method1883(this.field1125, arg1, this.field1124);
            }
            this.method1081(arg1);
            this.method1444();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field914[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field914[arg0];
        if (this.field1134 != null) {
            class71.method1883(arg0, arg1, this.field1134);
            this.field1123[arg0] = true;
        }
        if (arg3) {
            this.field919[arg0] = class28.method859(arg1, false);
        }
    }

    @ObfuscatedName("en.cr(Lbj;I[BZB)V")
    public void method1421(class121 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field1124 != arg0) {
            if (!arg3 && this.field1132 == arg1) {
                this.field1126 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field1123[arg1] = false;
                if (this.field1127 || arg3) {
                    class53.method3051(this, this.field1125, arg1, this.field913[arg1], (byte) 2, arg3);
                }
                return;
            }
            field1131.reset();
            field1131.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field1131.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field913[arg1] != var9 || this.field914[arg1] != var10) {
                this.field1123[arg1] = false;
                if (this.field1127 || arg3) {
                    class53.method3051(this, this.field1125, arg1, this.field913[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field1123[arg1] = true;
            if (arg3) {
                this.field919[arg1] = class28.method859(arg2, false);
            }
            return;
        }
        if (this.field1126) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class53.method3051(this, 255, this.field1125, this.field1129, (byte) 0, true);
            return;
        }
        field1131.reset();
        field1131.update(arg2, 0, arg2.length);
        int var5 = (int) field1131.getValue();
        class31 var6 = new class31(class81.method1057(arg2));
        int var7 = var6.method512();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method376();
        }
        if (this.field1129 != var5 || this.field1128 != var8) {
            class53.method3051(this, 255, this.field1125, this.field1129, (byte) 0, true);
            return;
        }
        this.method1081(arg2);
        this.method1444();
    }

    @ObfuscatedName("en.cw(IB)I")
    public int method1423(int arg0) {
        if (this.field919[arg0] != null) {
            return 100;
        } else if (this.field1123[arg0]) {
            return 100;
        } else {
            int var2 = this.field1125;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field968 != null && Statics.field968.field11 == var3) {
                var5 = Statics.field716.field172 * 99 / (Statics.field716.field168.length - Statics.field968.field1056) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("en.cn(B)I")
    public int method1424() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field919.length; var3++) {
            if (this.field915[var3] > 0) {
                var1 += 100;
                var2 += this.method1423(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }

    @ObfuscatedName("en.co(B)I")
    public int method1426() {
        if (this.field1126) {
            return 100;
        } else if (this.field919 == null) {
            int var1 = this.field1125;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field968 != null && Statics.field968.field11 == var2) {
                var4 = Statics.field716.field172 * 99 / (Statics.field716.field168.length - Statics.field968.field1056) + 1;
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

    @ObfuscatedName("en.ch(B)V")
    public void method1444() {
        this.field1123 = new boolean[this.field919.length];
        for (int var1 = 0; var1 < this.field1123.length; var1++) {
            this.field1123[var1] = false;
        }
        if (this.field1134 == null) {
            this.field1126 = true;
            return;
        }
        this.field1132 = -1;
        for (int var2 = 0; var2 < this.field1123.length; var2++) {
            if (this.field915[var2] > 0) {
                class71.method882(var2, this.field1134, this);
                this.field1132 = var2;
            }
        }
        if (this.field1132 == -1) {
            this.field1126 = true;
        }
    }
}
