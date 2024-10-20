package deob;

@ObfuscatedName("cp")
public class class80 {

    @ObfuscatedName("cp.t")
    public class135 field1137 = new class135((byte[]) null);

    @ObfuscatedName("cp.n")
    public int field1129;

    @ObfuscatedName("cp.q")
    public int[] field1128;

    @ObfuscatedName("cp.h")
    public int[] field1131;

    @ObfuscatedName("cp.k")
    public int[] field1130;

    @ObfuscatedName("cp.r")
    public int[] field1133;

    @ObfuscatedName("cp.l")
    public int field1134;

    @ObfuscatedName("cp.e")
    public long field1136;

    @ObfuscatedName("cp.a")
    public static final byte[] field1140 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class80() {
    }

    public class80(byte[] arg0) {
        this.method901(arg0);
    }

    @ObfuscatedName("cp.t([B)V")
    public void method901(byte[] arg0) {
        this.field1137.field1723 = arg0;
        this.field1137.field1722 = 10;
        int var2 = this.field1137.method1725();
        this.field1129 = this.field1137.method1725();
        this.field1134 = 500000;
        this.field1128 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1137.method1616();
            int var5 = this.field1137.method1616();
            if (var4 == 1297379947) {
                this.field1128[var3] = this.field1137.field1722;
                var3++;
            }
            this.field1137.field1722 += var5;
        }
        this.field1136 = 0L;
        this.field1131 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1131[var6] = this.field1128[var6];
        }
        this.field1130 = new int[var2];
        this.field1133 = new int[var2];
    }

    @ObfuscatedName("cp.n()V")
    public void method902() {
        this.field1137.field1723 = null;
        this.field1128 = null;
        this.field1131 = null;
        this.field1130 = null;
        this.field1133 = null;
    }

    @ObfuscatedName("cp.q()Z")
    public boolean method903() {
        return this.field1137.field1723 != null;
    }

    @ObfuscatedName("cp.h()I")
    public int method904() {
        return this.field1131.length;
    }

    @ObfuscatedName("cp.k(I)V")
    public void method905(int arg0) {
        this.field1137.field1722 = this.field1131[arg0];
    }

    @ObfuscatedName("cp.r(I)V")
    public void method915(int arg0) {
        this.field1131[arg0] = this.field1137.field1722;
    }

    @ObfuscatedName("cp.l()V")
    public void method907() {
        this.field1137.field1722 = -1;
    }

    @ObfuscatedName("cp.i(I)V")
    public void method906(int arg0) {
        int var2 = this.field1137.method1671();
        this.field1130[arg0] += var2;
    }

    @ObfuscatedName("cp.e(I)I")
    public int method908(int arg0) {
        return this.method900(arg0);
    }

    @ObfuscatedName("cp.a(I)I")
    public int method900(int arg0) {
        byte var2 = this.field1137.field1723[this.field1137.field1722];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1133[arg0] = var3;
            this.field1137.field1722++;
        } else {
            var3 = this.field1133[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method910(arg0, var3);
        }
        int var4 = this.field1137.method1671();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1137.field1723[this.field1137.field1722] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1137.field1722++;
                this.field1133[arg0] = var5;
                return this.method910(arg0, var5);
            }
        }
        this.field1137.field1722 += var4;
        return 0;
    }

    @ObfuscatedName("cp.g(II)I")
    public int method910(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1140[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1137.method1571() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1137.method1571() << 16;
            }
            return var8;
        }
        int var3 = this.field1137.method1571();
        int var4 = this.field1137.method1671();
        if (var3 == 47) {
            this.field1137.field1722 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1137.method1575();
            var4 -= 3;
            int var6 = this.field1130[arg0];
            this.field1136 += (long) (this.field1134 - var5) * (long) var6;
            this.field1134 = var5;
            this.field1137.field1722 += var4;
            return 2;
        } else {
            this.field1137.field1722 += var4;
            return 3;
        }
    }

    @ObfuscatedName("cp.w(I)J")
    public long method911(int arg0) {
        return (long) this.field1134 * (long) arg0 + this.field1136;
    }

    @ObfuscatedName("cp.v()I")
    public int method912() {
        int var1 = this.field1131.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1131[var4] >= 0 && this.field1130[var4] < var3) {
                var2 = var4;
                var3 = this.field1130[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("cp.u()Z")
    public boolean method931() {
        int var1 = this.field1131.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1131[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("cp.m(J)V")
    public void method914(long arg0) {
        this.field1136 = arg0;
        int var3 = this.field1131.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1130[var4] = 0;
            this.field1133[var4] = 0;
            this.field1137.field1722 = this.field1128[var4];
            this.method906(var4);
            this.field1131[var4] = this.field1137.field1722;
        }
    }
}
