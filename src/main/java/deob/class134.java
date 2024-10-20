package deob;

@ObfuscatedName("fm")
public class class134 {

    @ObfuscatedName("fm.ak")
    public boolean field1587;

    @ObfuscatedName("fm.al")
    public boolean field1580;

    @ObfuscatedName("fm.aj")
    public class132 field1601;

    @ObfuscatedName("fm.az")
    public class132 field1582;

    @ObfuscatedName("fm.af")
    public class129[] field1583;

    @ObfuscatedName("fm.aa")
    public boolean field1584;

    @ObfuscatedName("fm.at")
    public float field1585;

    @ObfuscatedName("fm.ab")
    public float field1586;

    @ObfuscatedName("fm.ac")
    public float field1597;

    @ObfuscatedName("fm.ao")
    public float field1588;

    @ObfuscatedName("fm.ah")
    public float field1602;

    @ObfuscatedName("fm.av")
    public float field1590;

    @ObfuscatedName("fm.aq")
    public float field1591;

    @ObfuscatedName("fm.ap")
    public float field1592;

    @ObfuscatedName("fm.ae")
    public float field1593;

    @ObfuscatedName("fm.ax")
    public float field1579;

    @ObfuscatedName("fm.ay")
    public boolean field1595 = true;

    @ObfuscatedName("fm.au")
    public int field1594 = 0;

    @ObfuscatedName("fm.as")
    public float[] field1581;

    @ObfuscatedName("fm.aw")
    public int field1598;

    @ObfuscatedName("fm.ad")
    public int field1599;

    @ObfuscatedName("fm.ai")
    public float field1600;

    @ObfuscatedName("fm.an")
    public float field1596;

    @ObfuscatedName("fm.ak(Lua;II)I")
    public int method2956(class546 arg0, int arg1) {
        int var3 = arg0.method8798();
        int var4 = arg0.method8796();
        class143 var5 = (class143) class401.method2027(class143.method2599(), var4);
        if (var5 == null) {
            class143 var6 = class143.field1658;
        }
        this.field1601 = Statics.method2873(arg0.method8796());
        this.field1582 = Statics.method2873(arg0.method8796());
        this.field1587 = arg0.method8796() != 0;
        this.field1583 = new class129[var3];
        class129 var7 = null;
        for (int var8 = 0; var8 < var3; var8++) {
            class129 var9 = new class129();
            var9.method2885(arg0, arg1);
            this.field1583[var8] = var9;
            if (var7 != null) {
                var7.field1538 = var9;
            }
            var7 = var9;
        }
        return var3;
    }

    @ObfuscatedName("fm.al(I)V")
    public void method2950() {
        this.field1598 = this.field1583[0].field1535;
        this.field1599 = this.field1583[this.method2944() - 1].field1535;
        this.field1581 = new float[this.method2941() + 1];
        for (int var1 = this.method2939(); var1 <= this.method2940(); var1++) {
            this.field1581[var1 - this.method2939()] = class130.method5032(this, (float) var1);
        }
        this.field1583 = null;
        this.field1600 = class130.method5032(this, (float) (this.method2939() - 1));
        this.field1596 = class130.method5032(this, (float) (this.method2940() + 1));
    }

    @ObfuscatedName("fm.aj(II)F")
    public float method2938(int arg0) {
        if (arg0 < this.method2939()) {
            return this.field1600;
        } else if (arg0 > this.method2940()) {
            return this.field1596;
        } else {
            return this.field1581[arg0 - this.method2939()];
        }
    }

    @ObfuscatedName("fm.az(I)I")
    public int method2939() {
        return this.field1598;
    }

    @ObfuscatedName("fm.af(S)I")
    public int method2940() {
        return this.field1599;
    }

    @ObfuscatedName("fm.aa(I)I")
    public int method2941() {
        return this.method2940() - this.method2939();
    }

    @ObfuscatedName("fm.at(FB)I")
    public int method2957(float arg0) {
        if (this.field1594 >= 0 && ((float) this.field1583[this.field1594].field1535 <= arg0) && this.field1583[this.field1594].field1538 == null || ((float) this.field1583[this.field1594].field1538.field1535 > arg0)) {
            return this.field1594;
        } else if ((arg0 < (float) this.method2939()) || (arg0 > (float) this.method2940())) {
            return -1;
        } else {
            int var2 = this.method2944();
            int var3 = this.field1594;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1583[var6].field1535) {
                        if (arg0 > (float) this.field1583[var6 - 1].field1535) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1583[var6].field1535)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1583[var6 + 1].field1535) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1594 != var3) {
                this.field1594 = var3;
                this.field1595 = true;
            }
            return this.field1594;
        }
    }

    @ObfuscatedName("fm.ab(FI)Leo;")
    public class129 method2955(float arg0) {
        int var2 = this.method2957(arg0);
        return var2 >= 0 && var2 < this.field1583.length ? this.field1583[var2] : null;
    }

    @ObfuscatedName("fm.ac(B)I")
    public int method2944() {
        return this.field1583 == null ? 0 : this.field1583.length;
    }
}
