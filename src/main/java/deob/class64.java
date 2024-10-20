package deob;

@ObfuscatedName("ez")
public class class64 {

    @ObfuscatedName("ez.g")
    public static final byte[] field953 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @ObfuscatedName("ez.b")
    public int[] field946;

    @ObfuscatedName("ez.c")
    public int field945;

    @ObfuscatedName("ez.m")
    public int[] field948;

    @ObfuscatedName("ez.j")
    public long field952;

    @ObfuscatedName("ez.i")
    public int[] field944;

    @ObfuscatedName("ez.v")
    public class28 field955 = new class28((byte[]) null);

    @ObfuscatedName("ez.z")
    public int[] field949;

    @ObfuscatedName("ez.x")
    public int field950;

    public class64(byte[] arg0) {
        this.method970(arg0);
    }

    @ObfuscatedName("ez.v([B)V")
    public void method970(byte[] arg0) {
        this.field955.field306 = arg0;
        this.field955.field303 = 10;
        int var2 = this.field955.method349();
        this.field945 = this.field955.method349();
        this.field950 = 500000;
        this.field946 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field955.method504();
            int var5 = this.field955.method504();
            if (var4 == 1297379947) {
                this.field946[var3] = this.field955.field303;
                var3++;
            }
            this.field955.field303 += var5;
        }
        this.field952 = 0L;
        this.field944 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field944[var6] = this.field946[var6];
        }
        this.field948 = new int[var2];
        this.field949 = new int[var2];
    }

    @ObfuscatedName("ez.i()I")
    public int method971() {
        return this.field944.length;
    }

    @ObfuscatedName("ez.m(I)V")
    public void method974(int arg0) {
        this.field955.field303 = this.field944[arg0];
    }

    public class64() {
    }

    @ObfuscatedName("ez.d(I)V")
    public void method976(int arg0) {
        int var2 = this.field955.method414();
        this.field948[arg0] += var2;
    }

    @ObfuscatedName("ez.j(I)I")
    public int method977(int arg0) {
        return this.method978(arg0);
    }

    @ObfuscatedName("ez.g(I)I")
    public int method978(int arg0) {
        byte var2 = this.field955.field306[this.field955.field303];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field949[arg0] = var3;
            this.field955.field303++;
        } else {
            var3 = this.field949[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method979(arg0, var3);
        }
        int var4 = this.field955.method414();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field955.field306[this.field955.field303] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field955.field303++;
                this.field949[arg0] = var5;
                return this.method979(arg0, var5);
            }
        }
        this.field955.field303 += var4;
        return 0;
    }

    @ObfuscatedName("ez.y(II)I")
    public int method979(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field953[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field955.method450() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field955.method450() << 16;
            }
            return var8;
        }
        int var3 = this.field955.method450();
        int var4 = this.field955.method414();
        if (var3 == 47) {
            this.field955.field303 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field955.method316();
            var4 -= 3;
            int var6 = this.field948[arg0];
            this.field952 += (long) (this.field950 - var5) * (long) var6;
            this.field950 = var5;
            this.field955.field303 += var4;
            return 2;
        } else {
            this.field955.field303 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ez.a(I)J")
    public long method980(int arg0) {
        return (long) this.field950 * (long) arg0 + this.field952;
    }

    @ObfuscatedName("ez.k()Z")
    public boolean method982() {
        int var1 = this.field944.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field944[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ez.e(J)V")
    public void method983(long arg0) {
        this.field952 = arg0;
        int var3 = this.field944.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field948[var4] = 0;
            this.field949[var4] = 0;
            this.field955.field303 = this.field946[var4];
            this.method976(var4);
            this.field944[var4] = this.field955.field303;
        }
    }

    @ObfuscatedName("ez.b()Z")
    public boolean method988() {
        return this.field955.field306 != null;
    }

    @ObfuscatedName("ez.c()V")
    public void method992() {
        this.field955.field306 = null;
        this.field946 = null;
        this.field944 = null;
        this.field948 = null;
        this.field949 = null;
    }

    @ObfuscatedName("ez.x()V")
    public void method996() {
        this.field955.field303 = -1;
    }

    @ObfuscatedName("ez.u()I")
    public int method1002() {
        int var1 = this.field944.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field944[var4] >= 0 && this.field948[var4] < var3) {
                var2 = var4;
                var3 = this.field948[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ez.z(I)V")
    public void method1004(int arg0) {
        this.field944[arg0] = this.field955.field303;
    }
}
