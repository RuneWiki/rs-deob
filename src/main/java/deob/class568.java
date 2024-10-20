package deob;

@ObfuscatedName("vw")
public class class568 {

    @ObfuscatedName("vw.ab")
    public boolean field5525;

    @ObfuscatedName("vw.ay")
    public int field5519 = 0;

    @ObfuscatedName("vw.an")
    public final int[] field5518;

    @ObfuscatedName("vw.au")
    public final int[] field5521;

    @ObfuscatedName("vw.ax")
    public final int[] field5522;

    @ObfuscatedName("vw.ao")
    public final int[] field5520;

    @ObfuscatedName("vw.am")
    public final int[] field5524;

    @ObfuscatedName("vw.ac")
    public final int[] field5528;

    @ObfuscatedName("vw.ae")
    public final String[] field5526;

    @ObfuscatedName("vw.ad")
    public final String[] field5523;

    @ObfuscatedName("vw.aq")
    public final class568[] field5527;

    @ObfuscatedName("vw.al")
    public final boolean[] field5529;

    @ObfuscatedName("vw.aj")
    public int field5530;

    @ObfuscatedName("vw.as")
    public int field5531;

    @ObfuscatedName("vw.aw")
    public int field5532;

    @ObfuscatedName("vw.af")
    public int field5533;

    @ObfuscatedName("vw.aa")
    public int field5534;

    @ObfuscatedName("vw.ah")
    public int field5535;

    @ObfuscatedName("vw.ag")
    public long field5536;

    public class568(boolean arg0) {
        int var2 = arg0 ? 500 : 20;
        this.field5525 = arg0;
        this.field5518 = new int[var2];
        this.field5521 = new int[var2];
        this.field5522 = new int[var2];
        this.field5520 = new int[var2];
        this.field5524 = new int[var2];
        this.field5528 = new int[var2];
        this.field5526 = new String[var2];
        this.field5523 = new String[var2];
        this.field5527 = new class568[var2];
        this.field5529 = new boolean[var2];
    }

    @ObfuscatedName("vw.ab(IB)Ljava/lang/String;")
    public final String method9421(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (this.field5523[arg0].isEmpty()) {
            return this.field5526[arg0];
        } else {
            return this.field5526[arg0] + class380.field4112 + this.field5523[arg0];
        }
    }

    @ObfuscatedName("vw.ay(I)V")
    public void method9420() {
        this.field5532 = Statics.field3034.method7586(class380.field4258);
        for (int var1 = 0; var1 < this.field5519; var1++) {
            int var2 = Statics.field3034.method7586(this.method9421(var1));
            if (this.field5527[var1] != null) {
                var2 += 15;
            }
            if (var2 > this.field5532) {
                this.field5532 = var2;
            }
        }
        this.field5532 += 8;
        this.field5533 = this.field5519 * -996409265 + 1165946628;
        if (this.field5525) {
            this.field5533 += -1195691118;
        }
    }

    @ObfuscatedName("vw.an(III)V")
    public final void method9423(int arg0, int arg1) {
        this.method9420();
        this.field5530 = arg0 - this.field5532 / 2;
        if (this.field5532 + this.field5530 > Statics.field1345) {
            this.field5530 = Statics.field1345 - this.field5532;
        }
        if (this.field5530 < 0) {
            this.field5530 = 0;
        }
        this.field5531 = arg1;
        if (this.field5533 * 1788236865 + this.field5531 > Statics.field467) {
            this.field5531 = Statics.field467 - this.field5533 * 1788236865;
        }
        if (this.field5531 < 0) {
            this.field5531 = 0;
        }
        if (this.field5534 != -1 && this.field5527[this.field5534] != null) {
            this.field5527[this.field5534].method9424(this);
        }
    }

    @ObfuscatedName("vw.au(Lvw;I)V")
    public final void method9424(class568 arg0) {
        this.method9420();
        this.field5530 = arg0.field5532 + arg0.field5530;
        if (this.field5532 + this.field5530 > Statics.field1345) {
            this.field5530 = arg0.field5530 - this.field5532;
        }
        if (this.field5530 < 0) {
            this.field5530 = 0;
        }
        int var2 = arg0.field5531 + (arg0.field5519 * 15 - 15 - arg0.field5534 * 15);
        if (arg0.field5525) {
            var2 += 17;
        }
        int var3 = var2 + 19;
        this.field5531 = var2;
        if (this.field5533 * 1788236865 + this.field5531 > Statics.field467) {
            this.field5531 = var3 - this.field5533 * 1788236865;
        }
        if (this.field5531 < 0) {
            this.field5531 = 0;
        }
    }

    @ObfuscatedName("vw.ax(III)I")
    public final int method9425(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field5519; var3++) {
            int var4 = (this.field5519 - 1 - var3) * 15 + this.field5531 + 14;
            if (this.field5525) {
                var4 += 17;
            }
            if (arg0 > this.field5530 && arg0 < this.field5532 + this.field5530 && arg1 > var4 - 13 && arg1 < var4 + 3) {
                return var3;
            }
        }
        return -1;
    }

    @ObfuscatedName("vw.ao(II)V")
    public final void method9426(int arg0) {
        if (arg0 >= 0) {
            client.method6770(this.field5518[arg0], this.field5521[arg0], this.field5522[arg0], this.field5520[arg0], this.field5524[arg0], this.field5528[arg0], this.field5526[arg0], this.field5523[arg0], class36.field216, class36.field213);
        }
    }

    @ObfuscatedName("vw.am(III)Z")
    public final boolean method9427(int arg0, int arg1) {
        if (this.field5534 != -1 && this.field5527[this.field5534] != null && this.field5527[this.field5534].method9427(arg0, arg1)) {
            return true;
        } else if (arg0 >= this.field5530 - 10 && arg0 <= this.field5532 + this.field5530 + 10 && arg1 >= this.field5531 - 10 && arg1 <= this.field5533 * 1788236865 + this.field5531 + 10) {
            int var3 = this.method9425(arg0, arg1);
            if (var3 != -1 && this.field5534 != var3) {
                if (this.field5535 != var3) {
                    this.field5535 = var3;
                    this.field5536 = class329.method5009();
                    if (this.field5534 != -1) {
                        this.field5536 += 300L;
                    }
                }
                if (this.field5536 <= class329.method5009()) {
                    this.field5535 = -1;
                    this.method9431();
                    if (this.field5527[var3] != null) {
                        this.field5534 = var3;
                        this.field5527[var3].method9424(this);
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("vw.ac(IIB)Z")
    public final boolean method9428(int arg0, int arg1) {
        if (this.field5534 != -1 && this.field5527[this.field5534] != null && this.field5527[this.field5534].method9428(arg0, arg1)) {
            return true;
        }
        int var3 = this.method9425(arg0, arg1);
        if (var3 == -1) {
            return false;
        } else {
            this.method9426(var3);
            return true;
        }
    }

    @ObfuscatedName("vw.ae(I)V")
    public final void method9429() {
        this.field5534 = -1;
        for (int var1 = 0; var1 < this.field5519; var1++) {
            if (this.field5527[var1] != null) {
                this.field5527[var1].method9429();
            }
        }
    }

    @ObfuscatedName("vw.ad(B)V")
    public final void method9430() {
        int var1 = this.field5530;
        int var2 = this.field5531;
        int var3 = this.field5532;
        int var4 = this.field5533 * 1788236865;
        for (int var5 = 0; var5 < client.field715; var5++) {
            if (client.field722[var5] + client.field625[var5] > var1 && client.field625[var5] < var1 + var3 && client.field723[var5] + client.field721[var5] > var2 && client.field721[var5] < var2 + var4) {
                client.field717[var5] = true;
            }
        }
        this.method9431();
    }

    @ObfuscatedName("vw.aq(B)V")
    public final void method9431() {
        if (this.field5534 != -1) {
            if (this.field5527[this.field5534] != null) {
                this.field5527[this.field5534].method9430();
            }
            this.field5534 = -1;
        }
    }

    @ObfuscatedName("vw.al(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I")
    public final int method9434(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (this.field5519 >= this.field5526.length) {
            return -1;
        }
        this.field5526[this.field5519] = arg0;
        this.field5523[this.field5519] = arg1;
        this.field5522[this.field5519] = arg2;
        this.field5520[this.field5519] = arg3;
        this.field5518[this.field5519] = arg4;
        this.field5521[this.field5519] = arg5;
        this.field5524[this.field5519] = arg6;
        this.field5528[this.field5519] = arg8;
        this.field5529[this.field5519] = arg7;
        this.field5527[this.field5519] = null;
        return ++this.field5519 - 1;
    }

    @ObfuscatedName("vw.aj(I)V")
    public final void method9443() {
        int var1 = this.field5530;
        int var2 = this.field5531;
        int var3 = 6116423;
        class559.method9145(var1, var2, this.field5532, this.field5533 * 1788236865, var3);
        if (this.field5525) {
            class559.method9145(var1 + 1, var2 + 1, this.field5532 - 2, 16, 0);
            class559.method9127(var1 + 1, var2 + 18, this.field5532 - 2, this.field5533 * 1788236865 - 19, 0);
            Statics.field3034.method7565(class380.field4258, var1 + 3, var2 + 14, var3, -1);
        } else {
            class559.method9127(var1 + 1, var2 + 1, this.field5532 - 2, this.field5533 * 1788236865 - 2, 0);
        }
        int var4 = class36.field204;
        int var5 = class36.field205;
        for (int var6 = 0; var6 < this.field5519; var6++) {
            int var7 = (this.field5519 - 1 - var6) * 15 + var2 + 14;
            if (this.field5525) {
                var7 += 17;
            }
            int var8 = 16777215;
            if (var4 > var1 && var4 < this.field5532 + var1 && var5 > var7 - 13 && var5 < var7 + 3) {
                var8 = 16776960;
            }
            if (this.field5534 == var6 || this.field5535 == var6 && this.field5527[var6] != null) {
                class559.method9145(var1 + 2, var7 - 12, this.field5532 - 4, 15, 7496785);
            }
            Statics.field3034.method7565(this.method9421(var6), var1 + 3, var7, var8, 0);
            if (this.field5527[var6] != null) {
                Statics.field3034.method7563(62, this.field5532 + var1 - 10, var7, 16777215);
            }
        }
        int var9 = this.field5530;
        int var10 = this.field5531;
        int var11 = this.field5532;
        int var12 = this.field5533 * 1788236865;
        for (int var13 = 0; var13 < client.field715; var13++) {
            if (client.field722[var13] + client.field625[var13] > var9 && client.field625[var13] < var9 + var11 && client.field723[var13] + client.field721[var13] > var10 && client.field721[var13] < var10 + var12) {
                client.field686[var13] = true;
            }
        }
        if (this.field5534 != -1 && this.field5527[this.field5534] != null) {
            this.field5527[this.field5534].method9443();
        }
    }
}
