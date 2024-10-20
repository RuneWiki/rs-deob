package deob;

@ObfuscatedName("mg")
public class class333 {

    @ObfuscatedName("mg.aq")
    public class547 field3630 = new class547((byte[]) null);

    @ObfuscatedName("mg.ad")
    public int field3631;

    @ObfuscatedName("mg.ag")
    public int[] field3632;

    @ObfuscatedName("mg.ak")
    public int[] field3633;

    @ObfuscatedName("mg.ap")
    public int[] field3635;

    @ObfuscatedName("mg.an")
    public int[] field3636;

    @ObfuscatedName("mg.aj")
    public int field3641;

    @ObfuscatedName("mg.ab")
    public long field3634;

    @ObfuscatedName("mg.ai")
    public static final byte[] field3640 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @ObfuscatedName("mg.aq([B)V")
    public void method5738(byte[] arg0) {
        this.field3630.field5364 = arg0;
        this.field3630.field5363 = 10;
        int var2 = this.field3630.method8899();
        this.field3631 = this.field3630.method8899();
        this.field3641 = 500000;
        this.field3632 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3630.method8734();
            int var5 = this.field3630.method8734();
            if (var4 == 1297379947) {
                this.field3632[var3] = this.field3630.field5363;
                var3++;
            }
            this.field3630.field5363 += var5;
        }
        this.field3634 = 0L;
        this.field3633 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3633[var6] = this.field3632[var6];
        }
        this.field3635 = new int[var2];
        this.field3636 = new int[var2];
    }

    @ObfuscatedName("mg.ad()V")
    public void method5724() {
        this.field3630.field5364 = null;
        this.field3632 = null;
        this.field3633 = null;
        this.field3635 = null;
        this.field3636 = null;
    }

    @ObfuscatedName("mg.ag()Z")
    public boolean method5725() {
        return this.field3630.field5364 != null;
    }

    @ObfuscatedName("mg.ak()I")
    public int method5728() {
        return this.field3633.length;
    }

    @ObfuscatedName("mg.ap(I)V")
    public void method5770(int arg0) {
        this.field3630.field5363 = this.field3633[arg0];
    }

    @ObfuscatedName("mg.an(I)V")
    public void method5751(int arg0) {
        this.field3633[arg0] = this.field3630.field5363;
    }

    @ObfuscatedName("mg.aj()V")
    public void method5729() {
        this.field3630.field5363 = -1;
    }

    @ObfuscatedName("mg.av(I)V")
    public void method5765(int arg0) {
        int var2 = this.field3630.method8850();
        this.field3635[arg0] += var2;
    }

    @ObfuscatedName("mg.ab(I)I")
    public int method5731(int arg0) {
        return this.method5739(arg0);
    }

    @ObfuscatedName("mg.ai(I)I")
    public int method5739(int arg0) {
        byte var2 = this.field3630.field5364[this.field3630.field5363];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3636[arg0] = var3;
            this.field3630.field5363++;
        } else {
            var3 = this.field3636[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method5733(arg0, var3);
        }
        int var4 = this.field3630.method8850();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3630.field5364[this.field3630.field5363] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3630.field5363++;
                this.field3636[arg0] = var5;
                return this.method5733(arg0, var5);
            }
        }
        this.field3630.field5363 += var4;
        return 0;
    }

    @ObfuscatedName("mg.ae(II)I")
    public int method5733(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3640[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3630.method8804() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3630.method8804() << 16;
            }
            return var8;
        }
        int var3 = this.field3630.method8804();
        int var4 = this.field3630.method8850();
        if (var3 == 47) {
            this.field3630.field5363 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3630.method8732();
            var4 -= 3;
            int var6 = this.field3635[arg0];
            this.field3634 += (long) (this.field3641 - var5) * (long) var6;
            this.field3641 = var5;
            this.field3630.field5363 += var4;
            return 2;
        } else {
            this.field3630.field5363 += var4;
            return 3;
        }
    }

    @ObfuscatedName("mg.au(I)J")
    public long method5734(int arg0) {
        return (long) this.field3641 * (long) arg0 + this.field3634;
    }

    @ObfuscatedName("mg.ah()I")
    public int method5735() {
        int var1 = this.field3633.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3633[var4] >= 0 && this.field3635[var4] < var3) {
                var2 = var4;
                var3 = this.field3635[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("mg.az()Z")
    public boolean method5736() {
        int var1 = this.field3633.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3633[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("mg.ax(J)V")
    public void method5737(long arg0) {
        this.field3634 = arg0;
        int var3 = this.field3633.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3635[var4] = 0;
            this.field3636[var4] = 0;
            this.field3630.field5363 = this.field3632[var4];
            this.method5765(var4);
            this.field3633[var4] = this.field3630.field5363;
        }
    }
}
