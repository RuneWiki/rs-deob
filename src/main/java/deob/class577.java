package deob;

@ObfuscatedName("ww")
public class class577 {

    @ObfuscatedName("ww.ap")
    public boolean field5618;

    @ObfuscatedName("ww.aw")
    public int field5601 = 0;

    @ObfuscatedName("ww.ak")
    public int[] field5602;

    @ObfuscatedName("ww.aj")
    public int[] field5612;

    @ObfuscatedName("ww.ai")
    public int[] field5600;

    @ObfuscatedName("ww.ay")
    public int[] field5605;

    @ObfuscatedName("ww.as")
    public int[] field5606;

    @ObfuscatedName("ww.ae")
    public int[] field5608;

    @ObfuscatedName("ww.am")
    public String[] field5604;

    @ObfuscatedName("ww.at")
    public String[] field5609;

    @ObfuscatedName("ww.au")
    public class577[] field5610;

    @ObfuscatedName("ww.an")
    public boolean[] field5611;

    @ObfuscatedName("ww.ao")
    public int field5614;

    @ObfuscatedName("ww.af")
    public int field5613;

    @ObfuscatedName("ww.ar")
    public int field5616;

    @ObfuscatedName("ww.ab")
    public int field5615;

    @ObfuscatedName("ww.az")
    public int field5607;

    @ObfuscatedName("ww.ag")
    public int field5617;

    @ObfuscatedName("ww.ad")
    public long field5603;

    public class577(boolean arg0) {
        int var2 = arg0 ? 500 : 20;
        this.field5618 = arg0;
        this.field5602 = new int[var2];
        this.field5612 = new int[var2];
        this.field5600 = new int[var2];
        this.field5605 = new int[var2];
        this.field5606 = new int[var2];
        this.field5608 = new int[var2];
        this.field5604 = new String[var2];
        this.field5609 = new String[var2];
        this.field5610 = new class577[var2];
        this.field5611 = new boolean[var2];
    }

    @ObfuscatedName("ww.ap(II)Ljava/lang/String;")
    public final String method9914(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (this.field5609[arg0].isEmpty()) {
            return this.field5604[arg0];
        } else {
            return this.field5604[arg0] + class383.field4357 + this.field5609[arg0];
        }
    }

    @ObfuscatedName("ww.aw(I)V")
    public void method9915() {
        this.field5616 = Statics.field4047.method7933(class383.field4263);
        for (int var1 = 0; var1 < this.field5601; var1++) {
            int var2 = Statics.field4047.method7933(this.method9914(var1));
            if (this.field5610[var1] != null) {
                var2 += 15;
            }
            if (var2 > this.field5616) {
                this.field5616 = var2;
            }
        }
        this.field5616 += 8;
        this.field5615 = this.field5601 * 1916962425 + 511189980;
        if (this.field5618) {
            this.field5615 += -1994612386;
        }
    }

    @ObfuscatedName("ww.ak(III)V")
    public final void method9916(int arg0, int arg1) {
        this.method9915();
        this.field5614 = arg0 - this.field5616 / 2;
        if (this.field5616 + this.field5614 > Statics.field74) {
            this.field5614 = Statics.field74 - this.field5616;
        }
        if (this.field5614 < 0) {
            this.field5614 = 0;
        }
        this.field5613 = arg1;
        if (this.field5615 * -334022457 + this.field5613 > Statics.field2983) {
            this.field5613 = Statics.field2983 - this.field5615 * -334022457;
        }
        if (this.field5613 < 0) {
            this.field5613 = 0;
        }
        if (this.field5607 != -1 && this.field5610[this.field5607] != null) {
            this.field5610[this.field5607].method9917(this);
        }
    }

    @ObfuscatedName("ww.aj(Lww;I)V")
    public final void method9917(class577 arg0) {
        this.method9915();
        this.field5614 = arg0.field5616 + arg0.field5614;
        if (this.field5616 + this.field5614 > Statics.field74) {
            this.field5614 = arg0.field5614 - this.field5616;
        }
        if (this.field5614 < 0) {
            this.field5614 = 0;
        }
        int var2 = arg0.field5613 + (arg0.field5601 * 15 - 15 - arg0.field5607 * 15);
        if (arg0.field5618) {
            var2 += 17;
        }
        int var3 = var2 + 19;
        this.field5613 = var2;
        if (this.field5615 * -334022457 + this.field5613 > Statics.field2983) {
            this.field5613 = var3 - this.field5615 * -334022457;
        }
        if (this.field5613 < 0) {
            this.field5613 = 0;
        }
    }

    @ObfuscatedName("ww.ai(III)I")
    public final int method9923(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field5601; var3++) {
            int var4 = (this.field5601 - 1 - var3) * 15 + this.field5613 + 14;
            if (this.field5618) {
                var4 += 17;
            }
            if (arg0 > this.field5614 && arg0 < this.field5616 + this.field5614 && arg1 > var4 - 13 && arg1 < var4 + 3) {
                return var3;
            }
        }
        return -1;
    }

    @ObfuscatedName("ww.ay(IB)V")
    public final void method9954(int arg0) {
        if (arg0 >= 0) {
            client.method5396(this.field5602[arg0], this.field5612[arg0], this.field5600[arg0], this.field5605[arg0], this.field5606[arg0], this.field5608[arg0], this.field5604[arg0], this.field5609[arg0], class36.field213, class36.field214);
        }
    }

    @ObfuscatedName("ww.as(IIB)Z")
    public final boolean method9966(int arg0, int arg1) {
        if (this.field5607 != -1 && this.field5610[this.field5607] != null && this.field5610[this.field5607].method9966(arg0, arg1)) {
            return true;
        } else if (arg0 >= this.field5614 - 10 && arg0 <= this.field5616 + this.field5614 + 10 && arg1 >= this.field5613 - 10 && arg1 <= this.field5615 * -334022457 + this.field5613 + 10) {
            int var3 = this.method9923(arg0, arg1);
            if (var3 != -1 && this.field5607 != var3) {
                if (this.field5617 != var3) {
                    this.field5617 = var3;
                    this.field5603 = class330.method2257();
                    if (this.field5607 != -1) {
                        this.field5603 += 300L;
                    }
                }
                if (this.field5603 <= class330.method2257()) {
                    this.field5617 = -1;
                    this.method9924();
                    if (this.field5610[var3] != null) {
                        this.field5607 = var3;
                        this.field5610[var3].method9917(this);
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ww.ae(IIB)Z")
    public final boolean method9921(int arg0, int arg1) {
        if (this.field5607 != -1 && this.field5610[this.field5607] != null && this.field5610[this.field5607].method9921(arg0, arg1)) {
            return true;
        }
        int var3 = this.method9923(arg0, arg1);
        if (var3 == -1) {
            return false;
        } else {
            this.method9954(var3);
            return true;
        }
    }

    @ObfuscatedName("ww.am(I)V")
    public final void method9922() {
        this.field5607 = -1;
        for (int var1 = 0; var1 < this.field5601; var1++) {
            if (this.field5610[var1] != null) {
                this.field5610[var1].method9922();
            }
        }
    }

    @ObfuscatedName("ww.at(I)V")
    public final void method9950() {
        int var1 = this.field5614;
        int var2 = this.field5613;
        int var3 = this.field5616;
        int var4 = this.field5615 * -334022457;
        for (int var5 = 0; var5 < client.field714; var5++) {
            if (client.field721[var5] + client.field719[var5] > var1 && client.field719[var5] < var1 + var3 && client.field722[var5] + client.field566[var5] > var2 && client.field566[var5] < var2 + var4) {
                client.field716[var5] = true;
            }
        }
        this.method9924();
    }

    @ObfuscatedName("ww.au(I)V")
    public final void method9924() {
        if (this.field5607 != -1) {
            if (this.field5610[this.field5607] != null) {
                this.field5610[this.field5607].method9950();
            }
            this.field5607 = -1;
        }
    }

    @ObfuscatedName("ww.an(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I")
    public final int method9951(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (this.field5601 >= this.field5604.length) {
            return -1;
        }
        this.field5604[this.field5601] = arg0;
        this.field5609[this.field5601] = arg1;
        this.field5600[this.field5601] = arg2;
        this.field5605[this.field5601] = arg3;
        this.field5602[this.field5601] = arg4;
        this.field5612[this.field5601] = arg5;
        this.field5606[this.field5601] = arg6;
        this.field5608[this.field5601] = arg8;
        this.field5611[this.field5601] = arg7;
        this.field5610[this.field5601] = null;
        return ++this.field5601 - 1;
    }

    @ObfuscatedName("ww.ao(B)V")
    public final void method9932() {
        int var1 = this.field5614;
        int var2 = this.field5613;
        int var3 = 6116423;
        class568.method9616(var1, var2, this.field5616, this.field5615 * -334022457, var3);
        if (this.field5618) {
            class568.method9616(var1 + 1, var2 + 1, this.field5616 - 2, 16, 0);
            class568.method9620(var1 + 1, var2 + 18, this.field5616 - 2, this.field5615 * -334022457 - 19, 0);
            Statics.field4047.method7932(class383.field4263, var1 + 3, var2 + 14, var3, -1);
        } else {
            class568.method9620(var1 + 1, var2 + 1, this.field5616 - 2, this.field5615 * -334022457 - 2, 0);
        }
        int var4 = class36.field195;
        int var5 = class36.field198;
        for (int var6 = 0; var6 < this.field5601; var6++) {
            int var7 = (this.field5601 - 1 - var6) * 15 + var2 + 14;
            if (this.field5618) {
                var7 += 17;
            }
            int var8 = 16777215;
            if (var4 > var1 && var4 < this.field5616 + var1 && var5 > var7 - 13 && var5 < var7 + 3) {
                var8 = 16776960;
            }
            if (this.field5607 == var6 || this.field5617 == var6 && this.field5610[var6] != null) {
                class568.method9616(var1 + 2, var7 - 12, this.field5616 - 4, 15, 7496785);
            }
            Statics.field4047.method7932(this.method9914(var6), var1 + 3, var7, var8, 0);
            if (this.field5610[var6] != null) {
                Statics.field4047.method7946(62, this.field5616 + var1 - 10, var7, 16777215);
            }
        }
        int var9 = this.field5614;
        int var10 = this.field5613;
        int var11 = this.field5616;
        int var12 = this.field5615 * -334022457;
        for (int var13 = 0; var13 < client.field714; var13++) {
            if (client.field721[var13] + client.field719[var13] > var9 && client.field719[var13] < var9 + var11 && client.field722[var13] + client.field566[var13] > var10 && client.field566[var13] < var10 + var12) {
                client.field717[var13] = true;
            }
        }
        if (this.field5607 != -1 && this.field5610[this.field5607] != null) {
            this.field5610[this.field5607].method9932();
        }
    }
}
