package deob;

@ObfuscatedName("lb")
public class class309 {

    @ObfuscatedName("lb.aw")
    public class514 field3449 = new class514((byte[]) null);

    @ObfuscatedName("lb.ay")
    public int field3444;

    @ObfuscatedName("lb.ar")
    public int[] field3445;

    @ObfuscatedName("lb.am")
    public int[] field3446;

    @ObfuscatedName("lb.as")
    public int[] field3447;

    @ObfuscatedName("lb.aj")
    public int[] field3450;

    @ObfuscatedName("lb.ag")
    public int field3443;

    @ObfuscatedName("lb.av")
    public long field3451;

    @ObfuscatedName("lb.ap")
    public static final byte[] field3452 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @ObfuscatedName("lb.aw([B)V")
    public void method5369(byte[] arg0) {
        this.field3449.field5070 = arg0;
        this.field3449.field5072 = 10;
        int var2 = this.field3449.method8246();
        this.field3444 = this.field3449.method8246();
        this.field3443 = 500000;
        this.field3445 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3449.method8496();
            int var5 = this.field3449.method8496();
            if (var4 == 1297379947) {
                this.field3445[var3] = this.field3449.field5072;
                var3++;
            }
            this.field3449.field5072 += var5;
        }
        this.field3451 = 0L;
        this.field3446 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3446[var6] = this.field3445[var6];
        }
        this.field3447 = new int[var2];
        this.field3450 = new int[var2];
    }

    @ObfuscatedName("lb.ay()V")
    public void method5389() {
        this.field3449.field5070 = null;
        this.field3445 = null;
        this.field3446 = null;
        this.field3447 = null;
        this.field3450 = null;
    }

    @ObfuscatedName("lb.ar()Z")
    public boolean method5406() {
        return this.field3449.field5070 != null;
    }

    @ObfuscatedName("lb.am()I")
    public int method5371() {
        return this.field3446.length;
    }

    @ObfuscatedName("lb.as(I)V")
    public void method5372(int arg0) {
        this.field3449.field5072 = this.field3446[arg0];
    }

    @ObfuscatedName("lb.aj(I)V")
    public void method5373(int arg0) {
        this.field3446[arg0] = this.field3449.field5072;
    }

    @ObfuscatedName("lb.ag()V")
    public void method5374() {
        this.field3449.field5072 = -1;
    }

    @ObfuscatedName("lb.az(I)V")
    public void method5375(int arg0) {
        int var2 = this.field3449.method8265();
        this.field3447[arg0] += var2;
    }

    @ObfuscatedName("lb.av(I)I")
    public int method5376(int arg0) {
        return this.method5377(arg0);
    }

    @ObfuscatedName("lb.ap(I)I")
    public int method5377(int arg0) {
        byte var2 = this.field3449.field5070[this.field3449.field5072];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3450[arg0] = var3;
            this.field3449.field5072++;
        } else {
            var3 = this.field3450[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method5378(arg0, var3);
        }
        int var4 = this.field3449.method8265();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3449.field5070[this.field3449.field5072] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3449.field5072++;
                this.field3450[arg0] = var5;
                return this.method5378(arg0, var5);
            }
        }
        this.field3449.field5072 += var4;
        return 0;
    }

    @ObfuscatedName("lb.aq(II)I")
    public int method5378(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3452[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3449.method8244() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3449.method8244() << 16;
            }
            return var8;
        }
        int var3 = this.field3449.method8244();
        int var4 = this.field3449.method8265();
        if (var3 == 47) {
            this.field3449.field5072 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3449.method8248();
            var4 -= 3;
            int var6 = this.field3447[arg0];
            this.field3451 += (long) (this.field3443 - var5) * (long) var6;
            this.field3443 = var5;
            this.field3449.field5072 += var4;
            return 2;
        } else {
            this.field3449.field5072 += var4;
            return 3;
        }
    }

    @ObfuscatedName("lb.at(I)J")
    public long method5379(int arg0) {
        return (long) this.field3443 * (long) arg0 + this.field3451;
    }

    @ObfuscatedName("lb.ah()I")
    public int method5425() {
        int var1 = this.field3446.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3446[var4] >= 0 && this.field3447[var4] < var3) {
                var2 = var4;
                var3 = this.field3447[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("lb.ax()Z")
    public boolean method5424() {
        int var1 = this.field3446.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3446[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("lb.aa(J)V")
    public void method5368(long arg0) {
        this.field3451 = arg0;
        int var3 = this.field3446.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3447[var4] = 0;
            this.field3450[var4] = 0;
            this.field3449.field5072 = this.field3445[var4];
            this.method5375(var4);
            this.field3446[var4] = this.field3449.field5072;
        }
    }
}
