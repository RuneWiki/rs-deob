package deob;

@ObfuscatedName("il")
public class class236 {

    @ObfuscatedName("il.f")
    public class384 field2880 = new class384((byte[]) null);

    @ObfuscatedName("il.e")
    public int field2868;

    @ObfuscatedName("il.v")
    public int[] field2869;

    @ObfuscatedName("il.y")
    public int[] field2870;

    @ObfuscatedName("il.j")
    public int[] field2874;

    @ObfuscatedName("il.o")
    public int[] field2871;

    @ObfuscatedName("il.m")
    public int field2873;

    @ObfuscatedName("il.h")
    public long field2875;

    @ObfuscatedName("il.d")
    public static final byte[] field2876 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class236() {
    }

    public class236(byte[] arg0) {
        this.method4216(arg0);
    }

    @ObfuscatedName("il.f([B)V")
    public void method4216(byte[] arg0) {
        this.field2880.field4160 = arg0;
        this.field2880.field4161 = 10;
        int var2 = this.field2880.method5899();
        this.field2868 = this.field2880.method5899();
        this.field2873 = 500000;
        this.field2869 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2880.method5965();
            int var5 = this.field2880.method5965();
            if (var4 == 1297379947) {
                this.field2869[var3] = this.field2880.field4161;
                var3++;
            }
            this.field2880.field4161 += var5;
        }
        this.field2875 = 0L;
        this.field2870 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2870[var6] = this.field2869[var6];
        }
        this.field2874 = new int[var2];
        this.field2871 = new int[var2];
    }

    @ObfuscatedName("il.e()V")
    public void method4168() {
        this.field2880.field4160 = null;
        this.field2869 = null;
        this.field2870 = null;
        this.field2874 = null;
        this.field2871 = null;
    }

    @ObfuscatedName("il.v()Z")
    public boolean method4169() {
        return this.field2880.field4160 != null;
    }

    @ObfuscatedName("il.y()I")
    public int method4170() {
        return this.field2870.length;
    }

    @ObfuscatedName("il.j(I)V")
    public void method4171(int arg0) {
        this.field2880.field4161 = this.field2870[arg0];
    }

    @ObfuscatedName("il.o(I)V")
    public void method4218(int arg0) {
        this.field2870[arg0] = this.field2880.field4161;
    }

    @ObfuscatedName("il.m()V")
    public void method4201() {
        this.field2880.field4161 = -1;
    }

    @ObfuscatedName("il.r(I)V")
    public void method4174(int arg0) {
        int var2 = this.field2880.method6036();
        this.field2874[arg0] += var2;
    }

    @ObfuscatedName("il.h(I)I")
    public int method4175(int arg0) {
        return this.method4178(arg0);
    }

    @ObfuscatedName("il.d(I)I")
    public int method4178(int arg0) {
        byte var2 = this.field2880.field4160[this.field2880.field4161];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2871[arg0] = var3;
            this.field2880.field4161++;
        } else {
            var3 = this.field2871[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4202(arg0, var3);
        }
        int var4 = this.field2880.method6036();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2880.field4160[this.field2880.field4161] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2880.field4161++;
                this.field2871[arg0] = var5;
                return this.method4202(arg0, var5);
            }
        }
        this.field2880.field4161 += var4;
        return 0;
    }

    @ObfuscatedName("il.z(II)I")
    public int method4202(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2876[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2880.method5902() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2880.method5902() << 16;
            }
            return var8;
        }
        int var3 = this.field2880.method5902();
        int var4 = this.field2880.method6036();
        if (var3 == 47) {
            this.field2880.field4161 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2880.method5901();
            var4 -= 3;
            int var6 = this.field2874[arg0];
            this.field2875 += (long) (this.field2873 - var5) * (long) var6;
            this.field2873 = var5;
            this.field2880.field4161 += var4;
            return 2;
        } else {
            this.field2880.field4161 += var4;
            return 3;
        }
    }

    @ObfuscatedName("il.b(I)J")
    public long method4199(int arg0) {
        return (long) this.field2873 * (long) arg0 + this.field2875;
    }

    @ObfuscatedName("il.i()I")
    public int method4179() {
        int var1 = this.field2870.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2870[var4] >= 0 && this.field2874[var4] < var3) {
                var2 = var4;
                var3 = this.field2874[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("il.k()Z")
    public boolean method4180() {
        int var1 = this.field2870.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2870[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("il.g(J)V")
    public void method4181(long arg0) {
        this.field2875 = arg0;
        int var3 = this.field2870.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2874[var4] = 0;
            this.field2871[var4] = 0;
            this.field2880.field4161 = this.field2869[var4];
            this.method4174(var4);
            this.field2870[var4] = this.field2880.field4161;
        }
    }
}
