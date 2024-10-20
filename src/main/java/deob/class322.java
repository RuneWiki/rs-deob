package deob;

@ObfuscatedName("mf")
public class class322 {

    @ObfuscatedName("mf.ac")
    public class530 field3477 = new class530((byte[]) null);

    @ObfuscatedName("mf.al")
    public int field3485;

    @ObfuscatedName("mf.ak")
    public int[] field3479;

    @ObfuscatedName("mf.ax")
    public int[] field3480;

    @ObfuscatedName("mf.ao")
    public int[] field3481;

    @ObfuscatedName("mf.ah")
    public int[] field3478;

    @ObfuscatedName("mf.ar")
    public int field3483;

    @ObfuscatedName("mf.am")
    public long field3486;

    @ObfuscatedName("mf.av")
    public static final byte[] field3484 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @ObfuscatedName("mf.ac([B)V")
    public void method5516(byte[] arg0) {
        this.field3477.field5139 = arg0;
        this.field3477.field5140 = 10;
        int var2 = this.field3477.method8598();
        this.field3485 = this.field3477.method8598();
        this.field3483 = 500000;
        this.field3479 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3477.method8371();
            int var5 = this.field3477.method8371();
            if (var4 == 1297379947) {
                this.field3479[var3] = this.field3477.field5140;
                var3++;
            }
            this.field3477.field5140 += var5;
        }
        this.field3486 = 0L;
        this.field3480 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3480[var6] = this.field3479[var6];
        }
        this.field3481 = new int[var2];
        this.field3478 = new int[var2];
    }

    @ObfuscatedName("mf.al()V")
    public void method5517() {
        this.field3477.field5139 = null;
        this.field3479 = null;
        this.field3480 = null;
        this.field3481 = null;
        this.field3478 = null;
    }

    @ObfuscatedName("mf.ak()Z")
    public boolean method5570() {
        return this.field3477.field5139 != null;
    }

    @ObfuscatedName("mf.ax()I")
    public int method5560() {
        return this.field3480.length;
    }

    @ObfuscatedName("mf.ao(I)V")
    public void method5520(int arg0) {
        this.field3477.field5140 = this.field3480[arg0];
    }

    @ObfuscatedName("mf.ah(I)V")
    public void method5521(int arg0) {
        this.field3480[arg0] = this.field3477.field5140;
    }

    @ObfuscatedName("mf.ar()V")
    public void method5568() {
        this.field3477.field5140 = -1;
    }

    @ObfuscatedName("mf.ab(I)V")
    public void method5523(int arg0) {
        int var2 = this.field3477.method8512();
        this.field3481[arg0] += var2;
    }

    @ObfuscatedName("mf.am(I)I")
    public int method5524(int arg0) {
        return this.method5525(arg0);
    }

    @ObfuscatedName("mf.av(I)I")
    public int method5525(int arg0) {
        byte var2 = this.field3477.field5139[this.field3477.field5140];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3478[arg0] = var3;
            this.field3477.field5140++;
        } else {
            var3 = this.field3478[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method5526(arg0, var3);
        }
        int var4 = this.field3477.method8512();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3477.field5139[this.field3477.field5140] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3477.field5140++;
                this.field3478[arg0] = var5;
                return this.method5526(arg0, var5);
            }
        }
        this.field3477.field5140 += var4;
        return 0;
    }

    @ObfuscatedName("mf.ag(II)I")
    public int method5526(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3484[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3477.method8365() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3477.method8365() << 16;
            }
            return var8;
        }
        int var3 = this.field3477.method8365();
        int var4 = this.field3477.method8512();
        if (var3 == 47) {
            this.field3477.field5140 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3477.method8445();
            var4 -= 3;
            int var6 = this.field3481[arg0];
            this.field3486 += (long) (this.field3483 - var5) * (long) var6;
            this.field3483 = var5;
            this.field3477.field5140 += var4;
            return 2;
        } else {
            this.field3477.field5140 += var4;
            return 3;
        }
    }

    @ObfuscatedName("mf.aa(I)J")
    public long method5567(int arg0) {
        return (long) this.field3483 * (long) arg0 + this.field3486;
    }

    @ObfuscatedName("mf.ap()I")
    public int method5522() {
        int var1 = this.field3480.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3480[var4] >= 0 && this.field3481[var4] < var3) {
                var2 = var4;
                var3 = this.field3481[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("mf.ay()Z")
    public boolean method5529() {
        int var1 = this.field3480.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3480[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("mf.as(J)V")
    public void method5530(long arg0) {
        this.field3486 = arg0;
        int var3 = this.field3480.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3481[var4] = 0;
            this.field3478[var4] = 0;
            this.field3477.field5140 = this.field3479[var4];
            this.method5523(var4);
            this.field3480[var4] = this.field3477.field5140;
        }
    }
}
