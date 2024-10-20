package deob;

@ObfuscatedName("fd")
public class class136 {

    @ObfuscatedName("fd.aq")
    public boolean field1576;

    @ObfuscatedName("fd.ad")
    public boolean field1577;

    @ObfuscatedName("fd.ag")
    public class134 field1581;

    @ObfuscatedName("fd.ak")
    public class134 field1584;

    @ObfuscatedName("fd.ap")
    public class131[] field1580;

    @ObfuscatedName("fd.an")
    public boolean field1595;

    @ObfuscatedName("fd.aj")
    public float field1593;

    @ObfuscatedName("fd.av")
    public float field1592;

    @ObfuscatedName("fd.ab")
    public float field1582;

    @ObfuscatedName("fd.ai")
    public float field1591;

    @ObfuscatedName("fd.ae")
    public float field1586;

    @ObfuscatedName("fd.au")
    public float field1587;

    @ObfuscatedName("fd.ah")
    public float field1588;

    @ObfuscatedName("fd.az")
    public float field1589;

    @ObfuscatedName("fd.ax")
    public float field1590;

    @ObfuscatedName("fd.ac")
    public float field1583;

    @ObfuscatedName("fd.al")
    public boolean field1579 = true;

    @ObfuscatedName("fd.ay")
    public int field1578 = 0;

    @ObfuscatedName("fd.ao")
    public float[] field1594;

    @ObfuscatedName("fd.aa")
    public int field1585;

    @ObfuscatedName("fd.as")
    public int field1596;

    @ObfuscatedName("fd.aw")
    public float field1597;

    @ObfuscatedName("fd.at")
    public float field1598;

    @ObfuscatedName("fd.aq(Lvp;II)I")
    public int method2978(class547 arg0, int arg1) {
        int var3 = arg0.method8899();
        class144.method3239(arg0.method8804());
        this.field1581 = class134.method857(arg0.method8804());
        this.field1584 = class134.method857(arg0.method8804());
        this.field1576 = arg0.method8804() != 0;
        this.field1580 = new class131[var3];
        class131 var4 = null;
        for (int var5 = 0; var5 < var3; var5++) {
            class131 var6 = new class131();
            var6.method2897(arg0, arg1);
            this.field1580[var5] = var6;
            if (var4 != null) {
                var4.field1533 = var6;
            }
            var4 = var6;
        }
        return var3;
    }

    @ObfuscatedName("fd.ad(I)V")
    public void method2982() {
        this.field1585 = this.field1580[0].field1527;
        this.field1596 = this.field1580[this.method2993() - 1].field1527;
        this.field1594 = new float[this.method2996() + 1];
        for (int var1 = this.method2981(); var1 <= this.method2977(); var1++) {
            this.field1594[var1 - this.method2981()] = class132.method2895(this, (float) var1);
        }
        this.field1580 = null;
        this.field1597 = class132.method2895(this, (float) (this.method2981() - 1));
        this.field1598 = class132.method2895(this, (float) (this.method2977() + 1));
    }

    @ObfuscatedName("fd.ag(II)F")
    public float method2980(int arg0) {
        if (arg0 < this.method2981()) {
            return this.field1597;
        } else if (arg0 > this.method2977()) {
            return this.field1598;
        } else {
            return this.field1594[arg0 - this.method2981()];
        }
    }

    @ObfuscatedName("fd.ak(I)I")
    public int method2981() {
        return this.field1585;
    }

    @ObfuscatedName("fd.ap(I)I")
    public int method2977() {
        return this.field1596;
    }

    @ObfuscatedName("fd.an(B)I")
    public int method2996() {
        return this.method2977() - this.method2981();
    }

    @ObfuscatedName("fd.aj(FI)I")
    public int method2983(float arg0) {
        if (this.field1578 >= 0 && ((float) this.field1580[this.field1578].field1527 <= arg0) && this.field1580[this.field1578].field1533 == null || ((float) this.field1580[this.field1578].field1533.field1527 > arg0)) {
            return this.field1578;
        } else if ((arg0 < (float) this.method2981()) || (arg0 > (float) this.method2977())) {
            return -1;
        } else {
            int var2 = this.method2993();
            int var3 = this.field1578;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1580[var6].field1527) {
                        if (arg0 > (float) this.field1580[var6 - 1].field1527) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1580[var6].field1527)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1580[var6 + 1].field1527) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1578 != var3) {
                this.field1578 = var3;
                this.field1579 = true;
            }
            return this.field1578;
        }
    }

    @ObfuscatedName("fd.av(FI)Lff;")
    public class131 method3002(float arg0) {
        int var2 = this.method2983(arg0);
        return var2 >= 0 && var2 < this.field1580.length ? this.field1580[var2] : null;
    }

    @ObfuscatedName("fd.ab(B)I")
    public int method2993() {
        return this.field1580 == null ? 0 : this.field1580.length;
    }
}
