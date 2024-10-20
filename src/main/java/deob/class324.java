package deob;

@ObfuscatedName("ms")
public class class324 {

    @ObfuscatedName("ms.aq")
    public class534 field3523 = new class534((byte[]) null);

    @ObfuscatedName("ms.aw")
    public int field3526;

    @ObfuscatedName("ms.al")
    public int[] field3531;

    @ObfuscatedName("ms.ai")
    public int[] field3524;

    @ObfuscatedName("ms.ar")
    public int[] field3525;

    @ObfuscatedName("ms.as")
    public int[] field3521;

    @ObfuscatedName("ms.aa")
    public int field3527;

    @ObfuscatedName("ms.ao")
    public long field3522;

    @ObfuscatedName("ms.au")
    public static final byte[] field3530 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @ObfuscatedName("ms.aq([B)V")
    public void method5650(byte[] arg0) {
        this.field3523.field5199 = arg0;
        this.field3523.field5200 = 10;
        int var2 = this.field3523.method8593();
        this.field3526 = this.field3523.method8593();
        this.field3527 = 500000;
        this.field3531 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3523.method8597();
            int var5 = this.field3523.method8597();
            if (var4 == 1297379947) {
                this.field3531[var3] = this.field3523.field5200;
                var3++;
            }
            this.field3523.field5200 += var5;
        }
        this.field3522 = 0L;
        this.field3524 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3524[var6] = this.field3531[var6];
        }
        this.field3525 = new int[var2];
        this.field3521 = new int[var2];
    }

    @ObfuscatedName("ms.aw()V")
    public void method5668() {
        this.field3523.field5199 = null;
        this.field3531 = null;
        this.field3524 = null;
        this.field3525 = null;
        this.field3521 = null;
    }

    @ObfuscatedName("ms.al()Z")
    public boolean method5652() {
        return this.field3523.field5199 != null;
    }

    @ObfuscatedName("ms.ai()I")
    public int method5653() {
        return this.field3524.length;
    }

    @ObfuscatedName("ms.ar(I)V")
    public void method5654(int arg0) {
        this.field3523.field5200 = this.field3524[arg0];
    }

    @ObfuscatedName("ms.as(I)V")
    public void method5649(int arg0) {
        this.field3524[arg0] = this.field3523.field5200;
    }

    @ObfuscatedName("ms.aa()V")
    public void method5656() {
        this.field3523.field5200 = -1;
    }

    @ObfuscatedName("ms.az(I)V")
    public void method5657(int arg0) {
        int var2 = this.field3523.method8810();
        this.field3525[arg0] += var2;
    }

    @ObfuscatedName("ms.ao(I)I")
    public int method5666(int arg0) {
        return this.method5671(arg0);
    }

    @ObfuscatedName("ms.au(I)I")
    public int method5671(int arg0) {
        byte var2 = this.field3523.field5199[this.field3523.field5200];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3521[arg0] = var3;
            this.field3523.field5200++;
        } else {
            var3 = this.field3521[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method5660(arg0, var3);
        }
        int var4 = this.field3523.method8810();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3523.field5199[this.field3523.field5200] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3523.field5200++;
                this.field3521[arg0] = var5;
                return this.method5660(arg0, var5);
            }
        }
        this.field3523.field5200 += var4;
        return 0;
    }

    @ObfuscatedName("ms.ak(II)I")
    public int method5660(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3530[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3523.method8591() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3523.method8591() << 16;
            }
            return var8;
        }
        int var3 = this.field3523.method8591();
        int var4 = this.field3523.method8810();
        if (var3 == 47) {
            this.field3523.field5200 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3523.method8595();
            var4 -= 3;
            int var6 = this.field3525[arg0];
            this.field3522 += (long) (this.field3527 - var5) * (long) var6;
            this.field3527 = var5;
            this.field3523.field5200 += var4;
            return 2;
        } else {
            this.field3523.field5200 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ms.ah(I)J")
    public long method5698(int arg0) {
        return (long) this.field3527 * (long) arg0 + this.field3522;
    }

    @ObfuscatedName("ms.aj()I")
    public int method5683() {
        int var1 = this.field3524.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3524[var4] >= 0 && this.field3525[var4] < var3) {
                var2 = var4;
                var3 = this.field3525[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ms.af()Z")
    public boolean method5663() {
        int var1 = this.field3524.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3524[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ms.ax(J)V")
    public void method5696(long arg0) {
        this.field3522 = arg0;
        int var3 = this.field3524.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3525[var4] = 0;
            this.field3521[var4] = 0;
            this.field3523.field5200 = this.field3531[var4];
            this.method5657(var4);
            this.field3524[var4] = this.field3523.field5200;
        }
    }
}
