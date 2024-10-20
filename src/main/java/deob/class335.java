package deob;

@ObfuscatedName("md")
public class class335 {

    @ObfuscatedName("md.ab")
    public class549 field3607 = new class549((byte[]) null);

    @ObfuscatedName("md.ay")
    public int field3614;

    @ObfuscatedName("md.an")
    public int[] field3608;

    @ObfuscatedName("md.au")
    public int[] field3609;

    @ObfuscatedName("md.ax")
    public int[] field3610;

    @ObfuscatedName("md.ao")
    public int[] field3611;

    @ObfuscatedName("md.am")
    public int field3612;

    @ObfuscatedName("md.ae")
    public long field3606;

    @ObfuscatedName("md.ad")
    public static final byte[] field3615 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @ObfuscatedName("md.ab([B)V")
    public void method5851(byte[] arg0) {
        this.field3607.field5381 = arg0;
        this.field3607.field5378 = 10;
        int var2 = this.field3607.method8968();
        this.field3614 = this.field3607.method8968();
        this.field3612 = 500000;
        this.field3608 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3607.method8803();
            int var5 = this.field3607.method8803();
            if (var4 == 1297379947) {
                this.field3608[var3] = this.field3607.field5378;
                var3++;
            }
            this.field3607.field5378 += var5;
        }
        this.field3606 = 0L;
        this.field3609 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3609[var6] = this.field3608[var6];
        }
        this.field3610 = new int[var2];
        this.field3611 = new int[var2];
    }

    @ObfuscatedName("md.ay()V")
    public void method5812() {
        this.field3607.field5381 = null;
        this.field3608 = null;
        this.field3609 = null;
        this.field3610 = null;
        this.field3611 = null;
    }

    @ObfuscatedName("md.an()Z")
    public boolean method5813() {
        return this.field3607.field5381 != null;
    }

    @ObfuscatedName("md.au()I")
    public int method5853() {
        return this.field3609.length;
    }

    @ObfuscatedName("md.ax(I)V")
    public void method5860(int arg0) {
        this.field3607.field5378 = this.field3609[arg0];
    }

    @ObfuscatedName("md.ao(I)V")
    public void method5822(int arg0) {
        this.field3609[arg0] = this.field3607.field5378;
    }

    @ObfuscatedName("md.am()V")
    public void method5817() {
        this.field3607.field5378 = -1;
    }

    @ObfuscatedName("md.ac(I)V")
    public void method5857(int arg0) {
        int var2 = this.field3607.method8928();
        this.field3610[arg0] += var2;
    }

    @ObfuscatedName("md.ae(I)I")
    public int method5819(int arg0) {
        return this.method5820(arg0);
    }

    @ObfuscatedName("md.ad(I)I")
    public int method5820(int arg0) {
        byte var2 = this.field3607.field5381[this.field3607.field5378];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3611[arg0] = var3;
            this.field3607.field5378++;
        } else {
            var3 = this.field3611[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method5856(arg0, var3);
        }
        int var4 = this.field3607.method8928();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3607.field5381[this.field3607.field5378] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3607.field5378++;
                this.field3611[arg0] = var5;
                return this.method5856(arg0, var5);
            }
        }
        this.field3607.field5378 += var4;
        return 0;
    }

    @ObfuscatedName("md.aq(II)I")
    public int method5856(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3615[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3607.method9025() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3607.method9025() << 16;
            }
            return var8;
        }
        int var3 = this.field3607.method9025();
        int var4 = this.field3607.method8928();
        if (var3 == 47) {
            this.field3607.field5378 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3607.method8801();
            var4 -= 3;
            int var6 = this.field3610[arg0];
            this.field3606 += (long) (this.field3612 - var5) * (long) var6;
            this.field3612 = var5;
            this.field3607.field5378 += var4;
            return 2;
        } else {
            this.field3607.field5378 += var4;
            return 3;
        }
    }

    @ObfuscatedName("md.al(I)J")
    public long method5814(int arg0) {
        return (long) this.field3612 * (long) arg0 + this.field3606;
    }

    @ObfuscatedName("md.aj()I")
    public int method5855() {
        int var1 = this.field3609.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3609[var4] >= 0 && this.field3610[var4] < var3) {
                var2 = var4;
                var3 = this.field3610[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("md.as()Z")
    public boolean method5811() {
        int var1 = this.field3609.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3609[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("md.aw(J)V")
    public void method5825(long arg0) {
        this.field3606 = arg0;
        int var3 = this.field3609.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3610[var4] = 0;
            this.field3611[var4] = 0;
            this.field3607.field5378 = this.field3608[var4];
            this.method5857(var4);
            this.field3609[var4] = this.field3607.field5378;
        }
    }
}
