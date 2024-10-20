package deob;

@ObfuscatedName("su")
public class class480 implements class68 {

    @ObfuscatedName("su.ac")
    public int field5019 = 0;

    @ObfuscatedName("su.ae")
    public int field5007;

    @ObfuscatedName("su.ag")
    public int field5010 = 0;

    @ObfuscatedName("su.am")
    public int field5009 = 2;

    @ObfuscatedName("su.ax")
    public int field5015 = 0;

    @ObfuscatedName("su.aq")
    public int field5011 = -1;

    @ObfuscatedName("su.af")
    public int field5012 = -1;

    @ObfuscatedName("su.at")
    public int field5006 = -1;

    @ObfuscatedName("su.au")
    public int field5014 = 0;

    @ObfuscatedName("su.ar")
    public class104 field5008;

    @ObfuscatedName("su.al")
    public int field5016 = 0;

    @ObfuscatedName("su.ad")
    public int[] field5017 = new int[10];

    @ObfuscatedName("su.ah")
    public int[] field5018 = new int[10];

    @ObfuscatedName("su.ap")
    public class277[] field5013 = new class277[10];

    public class480(int arg0, class104 arg1) {
        this.field5008 = arg1;
    }

    @ObfuscatedName("su.ad(B)V")
    public void method8170() {
        this.field5008.field1372.field2656 = this.field5008.field1356;
    }

    @ObfuscatedName("su.ac(I)I")
    public int method1197() {
        return this.field5011;
    }

    @ObfuscatedName("su.ae(S)I")
    public int method1205() {
        return this.field5006;
    }

    @ObfuscatedName("su.ag(I)I")
    public int method1202() {
        return this.field5019;
    }

    @ObfuscatedName("su.ah(IILkk;I)V")
    public final void method8172(int arg0, int arg1, class277 arg2) {
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method8181(arg0, arg1);
        } else if (this.field5017[0] >= 0 && this.field5017[0] < 104 && this.field5018[0] >= 0 && this.field5018[0] < 104) {
            this.method8174(arg0, arg1, arg2);
        } else {
            this.method8181(arg0, arg1);
        }
    }

    @ObfuscatedName("su.ap(III)V")
    public void method8181(int arg0, int arg1) {
        this.field5016 = 0;
        this.field5017[0] = arg0;
        this.field5018[0] = arg1;
        byte var3 = 1;
        this.field5011 = this.field5017[0] * 128 + var3 * 64;
        this.field5006 = this.field5018[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("su.ab(IILkk;I)V")
    public final void method8174(int arg0, int arg1, class277 arg2) {
        if (this.field5016 < 9) {
            this.field5016++;
        }
        for (int var4 = this.field5016; var4 > 0; var4--) {
            this.field5017[var4] = this.field5017[var4 - 1];
            this.field5018[var4] = this.field5018[var4 - 1];
            this.field5013[var4] = this.field5013[var4 - 1];
        }
        this.field5017[0] = arg0;
        this.field5018[0] = arg1;
        this.field5013[0] = arg2;
    }

    @ObfuscatedName("su.az(I)V")
    public final void method8189() {
        int var1 = this.field5010 - this.field5014 & 0x7FF;
        if (var1 != 0) {
            boolean var2 = true;
            boolean var3 = true;
            int var4 = var1 > 1024 ? -1 : 1;
            this.field5014 += var4 * (this.field5015 > 0 ? this.field5009 + 1 : this.field5009);
            this.field5015--;
            if (var1 < this.field5009 || var1 > 2048 - this.field5009) {
                this.field5014 = this.field5010;
            }
            this.field5014 &= 0x7FF;
        }
        if (this.field5016 == 0) {
            this.method8181(this.field5017[0], this.field5018[0]);
            return;
        }
        int var5 = this.field5011;
        int var6 = this.field5006;
        byte var7 = 1;
        int var8 = var7 * 128 / 2 + this.field5017[this.field5016 - 1] * 128;
        int var9 = var7 * 128 / 2 + this.field5018[this.field5016 - 1] * 128;
        class277 var10 = this.field5013[this.field5016 - 1];
        int var11 = (int) (Math.ceil((double) var10.field3047) * 128.0D);
        if (var8 - var5 > var11 || var8 - var5 < -var11 || var9 - var6 > var11 || var9 - var6 < -var11) {
            this.field5011 = var8;
            this.field5006 = var9;
            this.field5016--;
            return;
        }
        byte var12 = 4;
        if (this.field5016 > 2) {
            var12 = 6;
        }
        if (this.field5016 > 3) {
            var12 = 8;
        }
        int var13 = (int) ((float) var12 * var10.field3047);
        if (var5 != var8 || var6 != var9) {
            if (var5 < var8) {
                this.field5011 += var13;
                if (this.field5011 > var8) {
                    this.field5011 = var8;
                }
            } else if (var5 > var8) {
                this.field5011 -= var13;
                if (this.field5011 < var8) {
                    this.field5011 = var8;
                }
            }
            if (var6 < var9) {
                this.field5006 += var13;
                if (this.field5006 > var9) {
                    this.field5006 = var9;
                }
            } else if (var6 > var9) {
                this.field5006 -= var13;
                if (this.field5006 < var9) {
                    this.field5006 = var9;
                }
            }
        }
        if (this.field5011 == var8 && this.field5006 == var9) {
            this.field5016--;
        }
    }
}
