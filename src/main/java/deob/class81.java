package deob;

@ObfuscatedName("cc")
public class class81 {

    @ObfuscatedName("cc.q")
    public class136 field1146 = new class136((byte[]) null);

    @ObfuscatedName("cc.l")
    public int field1153;

    @ObfuscatedName("cc.a")
    public int[] field1148;

    @ObfuscatedName("cc.o")
    public int[] field1155;

    @ObfuscatedName("cc.c")
    public int[] field1150;

    @ObfuscatedName("cc.h")
    public int[] field1151;

    @ObfuscatedName("cc.r")
    public int field1152;

    @ObfuscatedName("cc.k")
    public long field1149;

    @ObfuscatedName("cc.u")
    public static final byte[] field1157 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class81() {
    }

    public class81(byte[] arg0) {
        this.method954(arg0);
    }

    @ObfuscatedName("cc.q([B)V")
    public void method954(byte[] arg0) {
        this.field1146.field1725 = arg0;
        this.field1146.field1722 = 10;
        int var2 = this.field1146.method1712();
        this.field1153 = this.field1146.method1712();
        this.field1152 = 500000;
        this.field1148 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1146.method1607();
            int var5 = this.field1146.method1607();
            if (var4 == 1297379947) {
                this.field1148[var3] = this.field1146.field1722;
                var3++;
            }
            this.field1146.field1722 += var5;
        }
        this.field1149 = 0L;
        this.field1155 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1155[var6] = this.field1148[var6];
        }
        this.field1150 = new int[var2];
        this.field1151 = new int[var2];
    }

    @ObfuscatedName("cc.l()V")
    public void method953() {
        this.field1146.field1725 = null;
        this.field1148 = null;
        this.field1155 = null;
        this.field1150 = null;
        this.field1151 = null;
    }

    @ObfuscatedName("cc.a()Z")
    public boolean method920() {
        return this.field1146.field1725 != null;
    }

    @ObfuscatedName("cc.o()I")
    public int method930() {
        return this.field1155.length;
    }

    @ObfuscatedName("cc.c(I)V")
    public void method922(int arg0) {
        this.field1146.field1722 = this.field1155[arg0];
    }

    @ObfuscatedName("cc.h(I)V")
    public void method927(int arg0) {
        this.field1155[arg0] = this.field1146.field1722;
    }

    @ObfuscatedName("cc.r()V")
    public void method928() {
        this.field1146.field1722 = -1;
    }

    @ObfuscatedName("cc.d(I)V")
    public void method929(int arg0) {
        int var2 = this.field1146.method1617();
        this.field1150[arg0] += var2;
    }

    @ObfuscatedName("cc.k(I)I")
    public int method924(int arg0) {
        return this.method944(arg0);
    }

    @ObfuscatedName("cc.u(I)I")
    public int method944(int arg0) {
        byte var2 = this.field1146.field1725[this.field1146.field1722];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1151[arg0] = var3;
            this.field1146.field1722++;
        } else {
            var3 = this.field1151[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method931(arg0, var3);
        }
        int var4 = this.field1146.method1617();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1146.field1725[this.field1146.field1722] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1146.field1722++;
                this.field1151[arg0] = var5;
                return this.method931(arg0, var5);
            }
        }
        this.field1146.field1722 += var4;
        return 0;
    }

    @ObfuscatedName("cc.v(II)I")
    public int method931(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1157[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1146.method1602() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1146.method1602() << 16;
            }
            return var8;
        }
        int var3 = this.field1146.method1602();
        int var4 = this.field1146.method1617();
        if (var3 == 47) {
            this.field1146.field1722 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1146.method1606();
            var4 -= 3;
            int var6 = this.field1150[arg0];
            this.field1149 += (long) (this.field1152 - var5) * (long) var6;
            this.field1152 = var5;
            this.field1146.field1722 += var4;
            return 2;
        } else {
            this.field1146.field1722 += var4;
            return 3;
        }
    }

    @ObfuscatedName("cc.f(I)J")
    public long method932(int arg0) {
        return (long) this.field1152 * (long) arg0 + this.field1149;
    }

    @ObfuscatedName("cc.s()I")
    public int method933() {
        int var1 = this.field1155.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1155[var4] >= 0 && this.field1150[var4] < var3) {
                var2 = var4;
                var3 = this.field1150[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("cc.j()Z")
    public boolean method934() {
        int var1 = this.field1155.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1155[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("cc.e(J)V")
    public void method923(long arg0) {
        this.field1149 = arg0;
        int var3 = this.field1155.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1150[var4] = 0;
            this.field1151[var4] = 0;
            this.field1146.field1722 = this.field1148[var4];
            this.method929(var4);
            this.field1155[var4] = this.field1146.field1722;
        }
    }
}
