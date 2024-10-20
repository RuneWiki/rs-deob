package deob;

@ObfuscatedName("fv")
public class class138 {

    @ObfuscatedName("fv.ap")
    public boolean field1600;

    @ObfuscatedName("fv.aw")
    public boolean field1594;

    @ObfuscatedName("fv.ak")
    public class136 field1606;

    @ObfuscatedName("fv.aj")
    public class136 field1596;

    @ObfuscatedName("fv.ai")
    public class133[] field1597;

    @ObfuscatedName("fv.ay")
    public boolean field1598;

    @ObfuscatedName("fv.as")
    public float field1599;

    @ObfuscatedName("fv.ae")
    public float field1612;

    @ObfuscatedName("fv.am")
    public float field1601;

    @ObfuscatedName("fv.at")
    public float field1602;

    @ObfuscatedName("fv.au")
    public float field1593;

    @ObfuscatedName("fv.an")
    public float field1604;

    @ObfuscatedName("fv.ao")
    public float field1605;

    @ObfuscatedName("fv.af")
    public float field1608;

    @ObfuscatedName("fv.ar")
    public float field1607;

    @ObfuscatedName("fv.ab")
    public float field1595;

    @ObfuscatedName("fv.az")
    public boolean field1609 = true;

    @ObfuscatedName("fv.ag")
    public int field1610 = 0;

    @ObfuscatedName("fv.ad")
    public float[] field1611;

    @ObfuscatedName("fv.ac")
    public int field1603;

    @ObfuscatedName("fv.av")
    public int field1613;

    @ObfuscatedName("fv.ax")
    public float field1614;

    @ObfuscatedName("fv.aq")
    public float field1615;

    @ObfuscatedName("fv.ap(Lvl;II)I")
    public int method3317(class558 arg0, int arg1) {
        int var3 = arg0.method9260();
        int var4 = arg0.method9258();
        class147[] var5 = new class147[] { class147.field1676, class147.field1683, class147.field1675, class147.field1674, class147.field1679, class147.field1678, class147.field1673, class147.field1680, class147.field1681 };
        class147 var6 = (class147) class406.method3580(var5, var4);
        if (var6 == null) {
            class147 var7 = class147.field1681;
        }
        this.field1606 = class136.method8060(arg0.method9258());
        this.field1596 = class136.method8060(arg0.method9258());
        this.field1600 = arg0.method9258() != 0;
        this.field1597 = new class133[var3];
        class133 var8 = null;
        for (int var9 = 0; var9 < var3; var9++) {
            class133 var10 = new class133();
            var10.method3219(arg0, arg1);
            this.field1597[var9] = var10;
            if (var8 != null) {
                var8.field1540 = var10;
            }
            var8 = var10;
        }
        return var3;
    }

    @ObfuscatedName("fv.aw(I)V")
    public void method3303() {
        this.field1603 = this.field1597[0].field1539;
        this.field1613 = this.field1597[this.method3311() - 1].field1539;
        this.field1611 = new float[this.method3307() + 1];
        for (int var1 = this.method3305(); var1 <= this.method3306(); var1++) {
            this.field1611[var1 - this.method3305()] = class134.method4947(this, (float) var1);
        }
        this.field1597 = null;
        this.field1614 = class134.method4947(this, (float) (this.method3305() - 1));
        this.field1615 = class134.method4947(this, (float) (this.method3306() + 1));
    }

    @ObfuscatedName("fv.ak(II)F")
    public float method3304(int arg0) {
        if (arg0 < this.method3305()) {
            return this.field1614;
        } else if (arg0 > this.method3306()) {
            return this.field1615;
        } else {
            return this.field1611[arg0 - this.method3305()];
        }
    }

    @ObfuscatedName("fv.aj(B)I")
    public int method3305() {
        return this.field1603;
    }

    @ObfuscatedName("fv.ai(I)I")
    public int method3306() {
        return this.field1613;
    }

    @ObfuscatedName("fv.ay(S)I")
    public int method3307() {
        return this.method3306() - this.method3305();
    }

    @ObfuscatedName("fv.as(FI)I")
    public int method3308(float arg0) {
        if (this.field1610 >= 0 && ((float) this.field1597[this.field1610].field1539 <= arg0) && this.field1597[this.field1610].field1540 == null || ((float) this.field1597[this.field1610].field1540.field1539 > arg0)) {
            return this.field1610;
        } else if ((arg0 < (float) this.method3305()) || (arg0 > (float) this.method3306())) {
            return -1;
        } else {
            int var2 = this.method3311();
            int var3 = this.field1610;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1597[var6].field1539) {
                        if (arg0 > (float) this.field1597[var6 - 1].field1539) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1597[var6].field1539)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1597[var6 + 1].field1539) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1610 != var3) {
                this.field1610 = var3;
                this.field1609 = true;
            }
            return this.field1610;
        }
    }

    @ObfuscatedName("fv.ae(FI)Lfa;")
    public class133 method3322(float arg0) {
        int var2 = this.method3308(arg0);
        return var2 >= 0 && var2 < this.field1597.length ? this.field1597[var2] : null;
    }

    @ObfuscatedName("fv.am(I)I")
    public int method3311() {
        return this.field1597 == null ? 0 : this.field1597.length;
    }
}
