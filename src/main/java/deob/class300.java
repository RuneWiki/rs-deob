package deob;

@ObfuscatedName("lt")
public class class300 {

    @ObfuscatedName("lt.af")
    public class489 field3431 = new class489((byte[]) null);

    @ObfuscatedName("lt.an")
    public int field3424;

    @ObfuscatedName("lt.aw")
    public int[] field3430;

    @ObfuscatedName("lt.ac")
    public int[] field3425;

    @ObfuscatedName("lt.au")
    public int[] field3422;

    @ObfuscatedName("lt.ab")
    public int[] field3427;

    @ObfuscatedName("lt.aq")
    public int field3428;

    @ObfuscatedName("lt.at")
    public long field3435;

    @ObfuscatedName("lt.aa")
    public static final byte[] field3423 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class300() {
    }

    public class300(byte[] arg0) {
        this.method5321(arg0);
    }

    @ObfuscatedName("lt.af([B)V")
    public void method5321(byte[] arg0) {
        this.field3431.field4991 = arg0;
        this.field3431.field4989 = 10;
        int var2 = this.field3431.method8250();
        this.field3424 = this.field3431.method8250();
        this.field3428 = 500000;
        this.field3430 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3431.method8254();
            int var5 = this.field3431.method8254();
            if (var4 == 1297379947) {
                this.field3430[var3] = this.field3431.field4989;
                var3++;
            }
            this.field3431.field4989 += var5;
        }
        this.field3435 = 0L;
        this.field3425 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3425[var6] = this.field3430[var6];
        }
        this.field3422 = new int[var2];
        this.field3427 = new int[var2];
    }

    @ObfuscatedName("lt.an()V")
    public void method5362() {
        this.field3431.field4991 = null;
        this.field3430 = null;
        this.field3425 = null;
        this.field3422 = null;
        this.field3427 = null;
    }

    @ObfuscatedName("lt.aw()Z")
    public boolean method5331() {
        return this.field3431.field4991 != null;
    }

    @ObfuscatedName("lt.ac()I")
    public int method5324() {
        return this.field3425.length;
    }

    @ObfuscatedName("lt.au(I)V")
    public void method5325(int arg0) {
        this.field3431.field4989 = this.field3425[arg0];
    }

    @ObfuscatedName("lt.ab(I)V")
    public void method5326(int arg0) {
        this.field3425[arg0] = this.field3431.field4989;
    }

    @ObfuscatedName("lt.aq()V")
    public void method5358() {
        this.field3431.field4989 = -1;
    }

    @ObfuscatedName("lt.al(I)V")
    public void method5328(int arg0) {
        int var2 = this.field3431.method8356();
        this.field3422[arg0] += var2;
    }

    @ObfuscatedName("lt.at(I)I")
    public int method5329(int arg0) {
        return this.method5330(arg0);
    }

    @ObfuscatedName("lt.aa(I)I")
    public int method5330(int arg0) {
        byte var2 = this.field3431.field4991[this.field3431.field4989];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3427[arg0] = var3;
            this.field3431.field4989++;
        } else {
            var3 = this.field3427[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method5345(arg0, var3);
        }
        int var4 = this.field3431.method8356();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3431.field4991[this.field3431.field4989] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3431.field4989++;
                this.field3427[arg0] = var5;
                return this.method5345(arg0, var5);
            }
        }
        this.field3431.field4989 += var4;
        return 0;
    }

    @ObfuscatedName("lt.ay(II)I")
    public int method5345(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3423[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3431.method8248() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3431.method8248() << 16;
            }
            return var8;
        }
        int var3 = this.field3431.method8248();
        int var4 = this.field3431.method8356();
        if (var3 == 47) {
            this.field3431.field4989 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3431.method8252();
            var4 -= 3;
            int var6 = this.field3422[arg0];
            this.field3435 += (long) (this.field3428 - var5) * (long) var6;
            this.field3428 = var5;
            this.field3431.field4989 += var4;
            return 2;
        } else {
            this.field3431.field4989 += var4;
            return 3;
        }
    }

    @ObfuscatedName("lt.ao(I)J")
    public long method5332(int arg0) {
        return (long) this.field3428 * (long) arg0 + this.field3435;
    }

    @ObfuscatedName("lt.ax()I")
    public int method5333() {
        int var1 = this.field3425.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3425[var4] >= 0 && this.field3422[var4] < var3) {
                var2 = var4;
                var3 = this.field3422[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("lt.ai()Z")
    public boolean method5334() {
        int var1 = this.field3425.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3425[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("lt.ag(J)V")
    public void method5335(long arg0) {
        this.field3435 = arg0;
        int var3 = this.field3425.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3422[var4] = 0;
            this.field3427[var4] = 0;
            this.field3431.field4989 = this.field3430[var4];
            this.method5328(var4);
            this.field3425[var4] = this.field3431.field4989;
        }
    }
}
