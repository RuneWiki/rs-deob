package deob;

@ObfuscatedName("my")
public class class322 {

    @ObfuscatedName("my.am")
    public class531 field3505 = new class531((byte[]) null);

    @ObfuscatedName("my.ap")
    public int field3503;

    @ObfuscatedName("my.af")
    public int[] field3504;

    @ObfuscatedName("my.aj")
    public int[] field3511;

    @ObfuscatedName("my.aq")
    public int[] field3506;

    @ObfuscatedName("my.ar")
    public int[] field3507;

    @ObfuscatedName("my.ag")
    public int field3508;

    @ObfuscatedName("my.ae")
    public long field3512;

    @ObfuscatedName("my.aa")
    public static final byte[] field3514 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @ObfuscatedName("my.am([B)V")
    public void method5613(byte[] arg0) {
        this.field3505.field5178 = arg0;
        this.field3505.field5181 = 10;
        int var2 = this.field3505.method8775();
        this.field3503 = this.field3505.method8775();
        this.field3508 = 500000;
        this.field3504 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3505.method8566();
            int var5 = this.field3505.method8566();
            if (var4 == 1297379947) {
                this.field3504[var3] = this.field3505.field5181;
                var3++;
            }
            this.field3505.field5181 += var5;
        }
        this.field3512 = 0L;
        this.field3511 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3511[var6] = this.field3504[var6];
        }
        this.field3506 = new int[var2];
        this.field3507 = new int[var2];
    }

    @ObfuscatedName("my.ap()V")
    public void method5614() {
        this.field3505.field5178 = null;
        this.field3504 = null;
        this.field3511 = null;
        this.field3506 = null;
        this.field3507 = null;
    }

    @ObfuscatedName("my.af()Z")
    public boolean method5615() {
        return this.field3505.field5178 != null;
    }

    @ObfuscatedName("my.aj()I")
    public int method5648() {
        return this.field3511.length;
    }

    @ObfuscatedName("my.aq(I)V")
    public void method5616(int arg0) {
        this.field3505.field5181 = this.field3511[arg0];
    }

    @ObfuscatedName("my.ar(I)V")
    public void method5638(int arg0) {
        this.field3511[arg0] = this.field3505.field5181;
    }

    @ObfuscatedName("my.ag()V")
    public void method5619() {
        this.field3505.field5181 = -1;
    }

    @ObfuscatedName("my.ao(I)V")
    public void method5620(int arg0) {
        int var2 = this.field3505.method8581();
        this.field3506[arg0] += var2;
    }

    @ObfuscatedName("my.ae(I)I")
    public int method5621(int arg0) {
        return this.method5622(arg0);
    }

    @ObfuscatedName("my.aa(I)I")
    public int method5622(int arg0) {
        byte var2 = this.field3505.field5178[this.field3505.field5181];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3507[arg0] = var3;
            this.field3505.field5181++;
        } else {
            var3 = this.field3507[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method5612(arg0, var3);
        }
        int var4 = this.field3505.method8581();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3505.field5178[this.field3505.field5181] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3505.field5181++;
                this.field3507[arg0] = var5;
                return this.method5612(arg0, var5);
            }
        }
        this.field3505.field5181 += var4;
        return 0;
    }

    @ObfuscatedName("my.au(II)I")
    public int method5612(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3514[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3505.method8561() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3505.method8561() << 16;
            }
            return var8;
        }
        int var3 = this.field3505.method8561();
        int var4 = this.field3505.method8581();
        if (var3 == 47) {
            this.field3505.field5181 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3505.method8688();
            var4 -= 3;
            int var6 = this.field3506[arg0];
            this.field3512 += (long) (this.field3508 - var5) * (long) var6;
            this.field3508 = var5;
            this.field3505.field5181 += var4;
            return 2;
        } else {
            this.field3505.field5181 += var4;
            return 3;
        }
    }

    @ObfuscatedName("my.an(I)J")
    public long method5624(int arg0) {
        return (long) this.field3508 * (long) arg0 + this.field3512;
    }

    @ObfuscatedName("my.ad()I")
    public int method5625() {
        int var1 = this.field3511.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3511[var4] >= 0 && this.field3506[var4] < var3) {
                var2 = var4;
                var3 = this.field3506[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("my.ax()Z")
    public boolean method5626() {
        int var1 = this.field3511.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3511[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("my.aw(J)V")
    public void method5652(long arg0) {
        this.field3512 = arg0;
        int var3 = this.field3511.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3506[var4] = 0;
            this.field3507[var4] = 0;
            this.field3505.field5181 = this.field3504[var4];
            this.method5620(var4);
            this.field3511[var4] = this.field3505.field5181;
        }
    }
}
