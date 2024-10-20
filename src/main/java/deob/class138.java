package deob;

@ObfuscatedName("fr")
public class class138 {

    @ObfuscatedName("fr.ac")
    public boolean field1619;

    @ObfuscatedName("fr.ae")
    public boolean field1605;

    @ObfuscatedName("fr.ag")
    public class136 field1606;

    @ObfuscatedName("fr.am")
    public class136 field1607;

    @ObfuscatedName("fr.ax")
    public class133[] field1608;

    @ObfuscatedName("fr.aq")
    public boolean field1604;

    @ObfuscatedName("fr.af")
    public float field1610;

    @ObfuscatedName("fr.at")
    public float field1611;

    @ObfuscatedName("fr.au")
    public float field1624;

    @ObfuscatedName("fr.ar")
    public float field1613;

    @ObfuscatedName("fr.al")
    public float field1614;

    @ObfuscatedName("fr.ad")
    public float field1615;

    @ObfuscatedName("fr.ah")
    public float field1616;

    @ObfuscatedName("fr.ap")
    public float field1617;

    @ObfuscatedName("fr.ab")
    public float field1609;

    @ObfuscatedName("fr.az")
    public float field1625;

    @ObfuscatedName("fr.aa")
    public boolean field1620 = true;

    @ObfuscatedName("fr.ai")
    public int field1621 = 0;

    @ObfuscatedName("fr.ao")
    public float[] field1622;

    @ObfuscatedName("fr.as")
    public int field1623;

    @ObfuscatedName("fr.ay")
    public int field1626;

    @ObfuscatedName("fr.aj")
    public float field1618;

    @ObfuscatedName("fr.av")
    public float field1627;

    @ObfuscatedName("fr.ac(Lvf;II)I")
    public int method3146(class551 arg0, int arg1) {
        int var3 = arg0.method9119();
        int var4 = arg0.method8955();
        class147[] var5 = new class147[] { class147.field1691, class147.field1682, class147.field1683, class147.field1693, class147.field1685, class147.field1686, class147.field1684, class147.field1688, class147.field1689 };
        class147 var6 = (class147) class405.method6719(var5, var4);
        if (var6 == null) {
            class147 var7 = class147.field1689;
        }
        int var8 = arg0.method8955();
        class136 var9 = (class136) class405.method6719(Statics.method5071(), var8);
        if (var9 == null) {
            var9 = class136.field1591;
        }
        this.field1606 = var9;
        int var11 = arg0.method8955();
        class136 var12 = (class136) class405.method6719(Statics.method5071(), var11);
        if (var12 == null) {
            var12 = class136.field1591;
        }
        this.field1607 = var12;
        this.field1619 = arg0.method8955() != 0;
        this.field1608 = new class133[var3];
        class133 var14 = null;
        for (int var15 = 0; var15 < var3; var15++) {
            class133 var16 = new class133();
            var16.method3079(arg0, arg1);
            this.field1608[var15] = var16;
            if (var14 != null) {
                var14.field1561 = var16;
            }
            var14 = var16;
        }
        return var3;
    }

    @ObfuscatedName("fr.ae(I)V")
    public void method3156() {
        this.field1623 = this.field1608[0].field1555;
        this.field1626 = this.field1608[this.method3154() - 1].field1555;
        this.field1622 = new float[this.method3151() + 1];
        for (int var1 = this.method3168(); var1 <= this.method3179(); var1++) {
            this.field1622[var1 - this.method3168()] = class134.method2292(this, (float) var1);
        }
        this.field1608 = null;
        this.field1618 = class134.method2292(this, (float) (this.method3168() - 1));
        this.field1627 = class134.method2292(this, (float) (this.method3179() + 1));
    }

    @ObfuscatedName("fr.ag(II)F")
    public float method3149(int arg0) {
        if (arg0 < this.method3168()) {
            return this.field1618;
        } else if (arg0 > this.method3179()) {
            return this.field1627;
        } else {
            return this.field1622[arg0 - this.method3168()];
        }
    }

    @ObfuscatedName("fr.am(I)I")
    public int method3168() {
        return this.field1623;
    }

    @ObfuscatedName("fr.ax(I)I")
    public int method3179() {
        return this.field1626;
    }

    @ObfuscatedName("fr.aq(I)I")
    public int method3151() {
        return this.method3179() - this.method3168();
    }

    @ObfuscatedName("fr.af(FI)I")
    public int method3152(float arg0) {
        if (this.field1621 >= 0 && ((float) this.field1608[this.field1621].field1555 <= arg0) && this.field1608[this.field1621].field1561 == null || ((float) this.field1608[this.field1621].field1561.field1555 > arg0)) {
            return this.field1621;
        } else if ((arg0 < (float) this.method3168()) || (arg0 > (float) this.method3179())) {
            return -1;
        } else {
            int var2 = this.method3154();
            int var3 = this.field1621;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1608[var6].field1555) {
                        if (arg0 > (float) this.field1608[var6 - 1].field1555) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1608[var6].field1555)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1608[var6 + 1].field1555) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1621 != var3) {
                this.field1621 = var3;
                this.field1620 = true;
            }
            return this.field1621;
        }
    }

    @ObfuscatedName("fr.at(FI)Lfe;")
    public class133 method3153(float arg0) {
        int var2 = this.method3152(arg0);
        return var2 >= 0 && var2 < this.field1608.length ? this.field1608[var2] : null;
    }

    @ObfuscatedName("fr.au(B)I")
    public int method3154() {
        return this.field1608 == null ? 0 : this.field1608.length;
    }
}
