package deob;

@ObfuscatedName("fr")
public class class133 {

    @ObfuscatedName("fr.aq")
    public boolean field1566;

    @ObfuscatedName("fr.aw")
    public boolean field1556;

    @ObfuscatedName("fr.al")
    public class131 field1558;

    @ObfuscatedName("fr.ai")
    public class131 field1575;

    @ObfuscatedName("fr.ar")
    public class128[] field1560;

    @ObfuscatedName("fr.as")
    public boolean field1561;

    @ObfuscatedName("fr.aa")
    public float field1562;

    @ObfuscatedName("fr.az")
    public float field1557;

    @ObfuscatedName("fr.ao")
    public float field1564;

    @ObfuscatedName("fr.au")
    public float field1565;

    @ObfuscatedName("fr.ak")
    public float field1563;

    @ObfuscatedName("fr.ah")
    public float field1567;

    @ObfuscatedName("fr.aj")
    public float field1568;

    @ObfuscatedName("fr.af")
    public float field1570;

    @ObfuscatedName("fr.ax")
    public float field1574;

    @ObfuscatedName("fr.an")
    public float field1571;

    @ObfuscatedName("fr.ag")
    public boolean field1572 = true;

    @ObfuscatedName("fr.am")
    public int field1573 = 0;

    @ObfuscatedName("fr.ad")
    public float[] field1559;

    @ObfuscatedName("fr.at")
    public int field1569;

    @ObfuscatedName("fr.ay")
    public int field1576;

    @ObfuscatedName("fr.ae")
    public float field1577;

    @ObfuscatedName("fr.ac")
    public float field1578;

    @ObfuscatedName("fr.aq(Luq;IB)I")
    public int method2951(class534 arg0, int arg1) {
        int var3 = arg0.method8593();
        class142.method3906(arg0.method8591());
        int var4 = arg0.method8591();
        class131 var5 = (class131) class392.method6317(Statics.method5715(), var4);
        if (var5 == null) {
            var5 = class131.field1549;
        }
        this.field1558 = var5;
        int var7 = arg0.method8591();
        class131 var8 = (class131) class392.method6317(Statics.method5715(), var7);
        if (var8 == null) {
            var8 = class131.field1549;
        }
        this.field1575 = var8;
        this.field1566 = arg0.method8591() != 0;
        this.field1560 = new class128[var3];
        class128 var10 = null;
        for (int var11 = 0; var11 < var3; var11++) {
            class128 var12 = new class128();
            var12.method2850(arg0, arg1);
            this.field1560[var11] = var12;
            if (var10 != null) {
                var10.field1506 = var12;
            }
            var10 = var12;
        }
        return var3;
    }

    @ObfuscatedName("fr.aw(B)V")
    public void method2952() {
        this.field1569 = this.field1560[0].field1502;
        this.field1576 = this.field1560[this.method2943() - 1].field1502;
        this.field1559 = new float[this.method2936() + 1];
        for (int var1 = this.method2938(); var1 <= this.method2953(); var1++) {
            this.field1559[var1 - this.method2938()] = class129.method4745(this, (float) var1);
        }
        this.field1560 = null;
        this.field1577 = class129.method4745(this, (float) (this.method2938() - 1));
        this.field1578 = class129.method4745(this, (float) (this.method2953() + 1));
    }

    @ObfuscatedName("fr.al(II)F")
    public float method2937(int arg0) {
        if (arg0 < this.method2938()) {
            return this.field1577;
        } else if (arg0 > this.method2953()) {
            return this.field1578;
        } else {
            return this.field1559[arg0 - this.method2938()];
        }
    }

    @ObfuscatedName("fr.ai(B)I")
    public int method2938() {
        return this.field1569;
    }

    @ObfuscatedName("fr.ar(I)I")
    public int method2953() {
        return this.field1576;
    }

    @ObfuscatedName("fr.as(I)I")
    public int method2936() {
        return this.method2953() - this.method2938();
    }

    @ObfuscatedName("fr.aa(FI)I")
    public int method2941(float arg0) {
        if (this.field1573 >= 0 && ((float) this.field1560[this.field1573].field1502 <= arg0) && this.field1560[this.field1573].field1506 == null || ((float) this.field1560[this.field1573].field1506.field1502 > arg0)) {
            return this.field1573;
        } else if ((arg0 < (float) this.method2938()) || (arg0 > (float) this.method2953())) {
            return -1;
        } else {
            int var2 = this.method2943();
            int var3 = this.field1573;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1560[var6].field1502) {
                        if (arg0 > (float) this.field1560[var6 - 1].field1502) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1560[var6].field1502)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1560[var6 + 1].field1502) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1573 != var3) {
                this.field1573 = var3;
                this.field1572 = true;
            }
            return this.field1573;
        }
    }

    @ObfuscatedName("fr.az(FI)Leo;")
    public class128 method2942(float arg0) {
        int var2 = this.method2941(arg0);
        return var2 >= 0 && var2 < this.field1560.length ? this.field1560[var2] : null;
    }

    @ObfuscatedName("fr.ao(B)I")
    public int method2943() {
        return this.field1560 == null ? 0 : this.field1560.length;
    }
}
