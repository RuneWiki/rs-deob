package deob;

@ObfuscatedName("eo")
public class class96 {

    @ObfuscatedName("eo.f")
    public static final byte[] field1118 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @ObfuscatedName("eo.e")
    public long field1109;

    @ObfuscatedName("eo.n")
    public int field1115;

    @ObfuscatedName("eo.o")
    public int[] field1111;

    @ObfuscatedName("eo.j")
    public class31 field1119 = new class31((byte[]) null);

    @ObfuscatedName("eo.h")
    public int[] field1113;

    @ObfuscatedName("eo.t")
    public int[] field1112;

    @ObfuscatedName("eo.r")
    public int[] field1114;

    @ObfuscatedName("eo.p")
    public int field1110;

    public class96(byte[] arg0) {
        this.method1417(arg0);
    }

    public class96() {
    }

    @ObfuscatedName("eo.p()V")
    public void method1361() {
        this.field1119.field168 = null;
        this.field1111 = null;
        this.field1112 = null;
        this.field1113 = null;
        this.field1114 = null;
    }

    @ObfuscatedName("eo.o()Z")
    public boolean method1363() {
        return this.field1119.field168 != null;
    }

    @ObfuscatedName("eo.h(I)V")
    public void method1364(int arg0) {
        this.field1119.field172 = this.field1112[arg0];
    }

    @ObfuscatedName("eo.r(I)V")
    public void method1365(int arg0) {
        this.field1112[arg0] = this.field1119.field172;
    }

    @ObfuscatedName("eo.n()V")
    public void method1366() {
        this.field1119.field172 = -1;
    }

    @ObfuscatedName("eo.e(I)I")
    public int method1368(int arg0) {
        return this.method1369(arg0);
    }

    @ObfuscatedName("eo.f(I)I")
    public int method1369(int arg0) {
        byte var2 = this.field1119.field168[this.field1119.field172];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1114[arg0] = var3;
            this.field1119.field172++;
        } else {
            var3 = this.field1114[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1370(arg0, var3);
        }
        int var4 = this.field1119.method403();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1119.field168[this.field1119.field172] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1119.field172++;
                this.field1114[arg0] = var5;
                return this.method1370(arg0, var5);
            }
        }
        this.field1119.field172 += var4;
        return 0;
    }

    @ObfuscatedName("eo.x(II)I")
    public int method1370(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1118[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1119.method512() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1119.method512() << 16;
            }
            return var8;
        }
        int var3 = this.field1119.method512();
        int var4 = this.field1119.method403();
        if (var3 == 47) {
            this.field1119.field172 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1119.method375();
            var4 -= 3;
            int var6 = this.field1113[arg0];
            this.field1109 += (long) (this.field1115 - var5) * (long) var6;
            this.field1115 = var5;
            this.field1119.field172 += var4;
            return 2;
        } else {
            this.field1119.field172 += var4;
            return 3;
        }
    }

    @ObfuscatedName("eo.z(I)J")
    public long method1371(int arg0) {
        return (long) this.field1115 * (long) arg0 + this.field1109;
    }

    @ObfuscatedName("eo.l()I")
    public int method1372() {
        int var1 = this.field1112.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1112[var4] >= 0 && this.field1113[var4] < var3) {
                var2 = var4;
                var3 = this.field1113[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("eo.w()Z")
    public boolean method1373() {
        int var1 = this.field1112.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1112[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("eo.i(J)V")
    public void method1374(long arg0) {
        this.field1109 = arg0;
        int var3 = this.field1112.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1113[var4] = 0;
            this.field1114[var4] = 0;
            this.field1119.field172 = this.field1111[var4];
            this.method1410(var4);
            this.field1112[var4] = this.field1119.field172;
        }
    }

    @ObfuscatedName("eo.g(I)V")
    public void method1410(int arg0) {
        int var2 = this.field1119.method403();
        this.field1113[arg0] += var2;
    }

    @ObfuscatedName("eo.t()I")
    public int method1416() {
        return this.field1112.length;
    }

    @ObfuscatedName("eo.j([B)V")
    public void method1417(byte[] arg0) {
        this.field1119.field168 = arg0;
        this.field1119.field172 = 10;
        int var2 = this.field1119.method373();
        this.field1110 = this.field1119.method373();
        this.field1115 = 500000;
        this.field1111 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1119.method376();
            int var5 = this.field1119.method376();
            if (var4 == 1297379947) {
                this.field1111[var3] = this.field1119.field172;
                var3++;
            }
            this.field1119.field172 += var5;
        }
        this.field1109 = 0L;
        this.field1112 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1112[var6] = this.field1111[var6];
        }
        this.field1113 = new int[var2];
        this.field1114 = new int[var2];
    }
}
