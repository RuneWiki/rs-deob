package deob;

@ObfuscatedName("so")
public class class477 implements class68 {

    @ObfuscatedName("so.aq")
    public int field4967 = 0;

    @ObfuscatedName("so.ad")
    public int field4965 = 0;

    @ObfuscatedName("so.ag")
    public int field4964 = 2;

    @ObfuscatedName("so.ak")
    public int field4969 = 0;

    @ObfuscatedName("so.ap")
    public int field4968 = -1;

    @ObfuscatedName("so.an")
    public int field4974 = -1;

    @ObfuscatedName("so.aj")
    public int field4970 = -1;

    @ObfuscatedName("so.av")
    public int field4971 = 0;

    @ObfuscatedName("so.ab")
    public class102 field4972;

    @ObfuscatedName("so.ai")
    public int field4973 = 0;

    @ObfuscatedName("so.ae")
    public int[] field4975 = new int[10];

    @ObfuscatedName("so.au")
    public int[] field4966 = new int[10];

    @ObfuscatedName("so.ah")
    public class239[] field4976 = new class239[10];

    public class477(int arg0, int arg1, int arg2, int arg3) {
        this.field4972 = new class102(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("so.ah(I)V")
    public void method7943() {
        this.field4972.field1317.field2918 = this.field4972.field1319;
    }

    @ObfuscatedName("so.aq(I)I")
    public int method1165() {
        return this.field4968;
    }

    @ObfuscatedName("so.ad(I)I")
    public int method1172() {
        return this.field4970;
    }

    @ObfuscatedName("so.ag(I)I")
    public int method1163() {
        return this.field4967;
    }

    @ObfuscatedName("so.az(IILjb;I)V")
    public final void method7949(int arg0, int arg1, class239 arg2) {
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method7948(arg0, arg1);
        } else if (this.field4975[0] >= 0 && this.field4975[0] < 104 && this.field4966[0] >= 0 && this.field4966[0] < 104) {
            this.method7945(arg0, arg1, arg2);
        } else {
            this.method7948(arg0, arg1);
        }
    }

    @ObfuscatedName("so.ax(III)V")
    public void method7948(int arg0, int arg1) {
        this.field4973 = 0;
        this.field4975[0] = arg0;
        this.field4966[0] = arg1;
        byte var3 = 1;
        this.field4968 = this.field4975[0] * 128 + var3 * 64;
        this.field4970 = this.field4966[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("so.ac(IILjb;I)V")
    public final void method7945(int arg0, int arg1, class239 arg2) {
        if (this.field4973 < 9) {
            this.field4973++;
        }
        for (int var4 = this.field4973; var4 > 0; var4--) {
            this.field4975[var4] = this.field4975[var4 - 1];
            this.field4966[var4] = this.field4966[var4 - 1];
            this.field4976[var4] = this.field4976[var4 - 1];
        }
        this.field4975[0] = arg0;
        this.field4966[0] = arg1;
        this.field4976[0] = arg2;
    }

    @ObfuscatedName("so.al(S)V")
    public final void method7944() {
        int var1 = this.field4965 - this.field4971 & 0x7FF;
        if (var1 != 0) {
            boolean var2 = true;
            boolean var3 = true;
            int var4 = var1 > 1024 ? -1 : 1;
            this.field4971 += var4 * (this.field4969 > 0 ? this.field4964 + 1 : this.field4964);
            this.field4969--;
            if (var1 < this.field4964 || var1 > 2048 - this.field4964) {
                this.field4971 = this.field4965;
            }
            this.field4971 &= 0x7FF;
        }
        if (this.field4973 == 0) {
            this.method7948(this.field4975[0], this.field4966[0]);
            return;
        }
        int var5 = this.field4968;
        int var6 = this.field4970;
        byte var7 = 1;
        int var8 = var7 * 128 / 2 + this.field4975[this.field4973 - 1] * 128;
        int var9 = var7 * 128 / 2 + this.field4966[this.field4973 - 1] * 128;
        class239 var10 = this.field4976[this.field4973 - 1];
        int var11 = (int) (Math.ceil((double) var10.field2518) * 128.0D);
        if (var8 - var5 > var11 || var8 - var5 < -var11 || var9 - var6 > var11 || var9 - var6 < -var11) {
            this.field4968 = var8;
            this.field4970 = var9;
            this.field4973--;
            return;
        }
        byte var12 = 4;
        if (this.field4973 > 2) {
            var12 = 6;
        }
        if (this.field4973 > 3) {
            var12 = 8;
        }
        int var13 = (int) ((float) var12 * var10.field2518);
        if (var5 != var8 || var6 != var9) {
            if (var5 < var8) {
                this.field4968 += var13;
                if (this.field4968 > var8) {
                    this.field4968 = var8;
                }
            } else if (var5 > var8) {
                this.field4968 -= var13;
                if (this.field4968 < var8) {
                    this.field4968 = var8;
                }
            }
            if (var6 < var9) {
                this.field4970 += var13;
                if (this.field4970 > var9) {
                    this.field4970 = var9;
                }
            } else if (var6 > var9) {
                this.field4970 -= var13;
                if (this.field4970 < var9) {
                    this.field4970 = var9;
                }
            }
        }
        if (this.field4968 == var8 && this.field4970 == var9) {
            this.field4973--;
        }
    }
}
