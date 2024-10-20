package deob;

@ObfuscatedName("fz")
public class class133 {

    @ObfuscatedName("fz.ac")
    public boolean field1559;

    @ObfuscatedName("fz.al")
    public boolean field1549;

    @ObfuscatedName("fz.ak")
    public class131 field1548;

    @ObfuscatedName("fz.ax")
    public class131 field1554;

    @ObfuscatedName("fz.ao")
    public class128[] field1542;

    @ObfuscatedName("fz.ah")
    public boolean field1557;

    @ObfuscatedName("fz.ar")
    public float field1544;

    @ObfuscatedName("fz.ab")
    public float field1545;

    @ObfuscatedName("fz.am")
    public float field1546;

    @ObfuscatedName("fz.av")
    public float field1547;

    @ObfuscatedName("fz.ag")
    public float field1539;

    @ObfuscatedName("fz.aa")
    public float field1543;

    @ObfuscatedName("fz.ap")
    public float field1550;

    @ObfuscatedName("fz.ay")
    public float field1551;

    @ObfuscatedName("fz.as")
    public float field1552;

    @ObfuscatedName("fz.aj")
    public float field1555;

    @ObfuscatedName("fz.an")
    public boolean field1553 = true;

    @ObfuscatedName("fz.au")
    public int field1540 = 0;

    @ObfuscatedName("fz.ai")
    public float[] field1556;

    @ObfuscatedName("fz.ae")
    public int field1538;

    @ObfuscatedName("fz.aw")
    public int field1558;

    @ObfuscatedName("fz.aq")
    public float field1541;

    @ObfuscatedName("fz.az")
    public float field1560;

    @ObfuscatedName("fz.ac(Lul;II)I")
    public int method2888(class530 arg0, int arg1) {
        int var3 = arg0.method8598();
        class141.method6158(arg0.method8365());
        int var4 = arg0.method8365();
        class131 var5 = (class131) class388.method3894(class131.method3296(), var4);
        if (var5 == null) {
            var5 = class131.field1525;
        }
        this.field1548 = var5;
        int var7 = arg0.method8365();
        class131 var8 = (class131) class388.method3894(class131.method3296(), var7);
        if (var8 == null) {
            var8 = class131.field1525;
        }
        this.field1554 = var8;
        this.field1559 = arg0.method8365() != 0;
        this.field1542 = new class128[var3];
        class128 var10 = null;
        for (int var11 = 0; var11 < var3; var11++) {
            class128 var12 = new class128();
            var12.method2808(arg0, arg1);
            this.field1542[var11] = var12;
            if (var10 != null) {
                var10.field1494 = var12;
            }
            var10 = var12;
        }
        return var3;
    }

    @ObfuscatedName("fz.al(I)V")
    public void method2880() {
        this.field1538 = this.field1542[0].field1493;
        this.field1558 = this.field1542[this.method2876() - 1].field1493;
        this.field1556 = new float[this.method2882() + 1];
        for (int var1 = this.method2877(); var1 <= this.method2879(); var1++) {
            this.field1556[var1 - this.method2877()] = class129.method3286(this, (float) var1);
        }
        this.field1542 = null;
        this.field1541 = class129.method3286(this, (float) (this.method2877() - 1));
        this.field1560 = class129.method3286(this, (float) (this.method2879() + 1));
    }

    @ObfuscatedName("fz.ak(II)F")
    public float method2881(int arg0) {
        if (arg0 < this.method2877()) {
            return this.field1541;
        } else if (arg0 > this.method2879()) {
            return this.field1560;
        } else {
            return this.field1556[arg0 - this.method2877()];
        }
    }

    @ObfuscatedName("fz.ax(B)I")
    public int method2877() {
        return this.field1538;
    }

    @ObfuscatedName("fz.ao(B)I")
    public int method2879() {
        return this.field1558;
    }

    @ObfuscatedName("fz.ah(B)I")
    public int method2882() {
        return this.method2879() - this.method2877();
    }

    @ObfuscatedName("fz.ar(FI)I")
    public int method2883(float arg0) {
        if (this.field1540 >= 0 && ((float) this.field1542[this.field1540].field1493 <= arg0) && this.field1542[this.field1540].field1494 == null || ((float) this.field1542[this.field1540].field1494.field1493 > arg0)) {
            return this.field1540;
        } else if ((arg0 < (float) this.method2877()) || (arg0 > (float) this.method2879())) {
            return -1;
        } else {
            int var2 = this.method2876();
            int var3 = this.field1540;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1542[var6].field1493) {
                        if (arg0 > (float) this.field1542[var6 - 1].field1493) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1542[var6].field1493)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1542[var6 + 1].field1493) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1540 != var3) {
                this.field1540 = var3;
                this.field1553 = true;
            }
            return this.field1540;
        }
    }

    @ObfuscatedName("fz.ab(FB)Lef;")
    public class128 method2889(float arg0) {
        int var2 = this.method2883(arg0);
        return var2 >= 0 && var2 < this.field1542.length ? this.field1542[var2] : null;
    }

    @ObfuscatedName("fz.am(I)I")
    public int method2876() {
        return this.field1542 == null ? 0 : this.field1542.length;
    }
}
