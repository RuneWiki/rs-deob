package deob;

@ObfuscatedName("fb")
public class class135 {

    @ObfuscatedName("fb.ab")
    public boolean field1579;

    @ObfuscatedName("fb.ay")
    public boolean field1574;

    @ObfuscatedName("fb.an")
    public class133 field1560;

    @ObfuscatedName("fb.au")
    public class133 field1561;

    @ObfuscatedName("fb.ax")
    public class130[] field1562;

    @ObfuscatedName("fb.ao")
    public boolean field1563;

    @ObfuscatedName("fb.am")
    public float field1564;

    @ObfuscatedName("fb.ac")
    public float field1559;

    @ObfuscatedName("fb.ae")
    public float field1572;

    @ObfuscatedName("fb.ad")
    public float field1558;

    @ObfuscatedName("fb.aq")
    public float field1568;

    @ObfuscatedName("fb.al")
    public float field1569;

    @ObfuscatedName("fb.aj")
    public float field1575;

    @ObfuscatedName("fb.as")
    public float field1571;

    @ObfuscatedName("fb.aw")
    public float field1565;

    @ObfuscatedName("fb.af")
    public float field1573;

    @ObfuscatedName("fb.aa")
    public boolean field1570 = true;

    @ObfuscatedName("fb.ah")
    public int field1567 = 0;

    @ObfuscatedName("fb.ag")
    public float[] field1576;

    @ObfuscatedName("fb.av")
    public int field1577;

    @ObfuscatedName("fb.ar")
    public int field1578;

    @ObfuscatedName("fb.ap")
    public float field1566;

    @ObfuscatedName("fb.ak")
    public float field1580;

    @ObfuscatedName("fb.ab(Lvg;II)I")
    public int method3078(class549 arg0, int arg1) {
        int var3 = arg0.method8968();
        class144.method4512(arg0.method9025());
        this.field1560 = class133.method392(arg0.method9025());
        this.field1561 = class133.method392(arg0.method9025());
        this.field1579 = arg0.method9025() != 0;
        this.field1562 = new class130[var3];
        class130 var4 = null;
        for (int var5 = 0; var5 < var3; var5++) {
            class130 var6 = new class130();
            var6.method2976(arg0, arg1);
            this.field1562[var5] = var6;
            if (var4 != null) {
                var4.field1501 = var6;
            }
            var4 = var6;
        }
        return var3;
    }

    @ObfuscatedName("fb.ay(I)V")
    public void method3049() {
        this.field1577 = this.field1562[0].field1508;
        this.field1578 = this.field1562[this.method3056() - 1].field1508;
        this.field1576 = new float[this.method3053() + 1];
        for (int var1 = this.method3064(); var1 <= this.method3047(); var1++) {
            this.field1576[var1 - this.method3064()] = class131.method93(this, (float) var1);
        }
        this.field1562 = null;
        this.field1566 = class131.method93(this, (float) (this.method3064() - 1));
        this.field1580 = class131.method93(this, (float) (this.method3047() + 1));
    }

    @ObfuscatedName("fb.an(IS)F")
    public float method3050(int arg0) {
        if (arg0 < this.method3064()) {
            return this.field1566;
        } else if (arg0 > this.method3047()) {
            return this.field1580;
        } else {
            return this.field1576[arg0 - this.method3064()];
        }
    }

    @ObfuscatedName("fb.au(I)I")
    public int method3064() {
        return this.field1577;
    }

    @ObfuscatedName("fb.ax(I)I")
    public int method3047() {
        return this.field1578;
    }

    @ObfuscatedName("fb.ao(I)I")
    public int method3053() {
        return this.method3047() - this.method3064();
    }

    @ObfuscatedName("fb.am(FI)I")
    public int method3054(float arg0) {
        if (this.field1567 >= 0 && ((float) this.field1562[this.field1567].field1508 <= arg0) && this.field1562[this.field1567].field1501 == null || ((float) this.field1562[this.field1567].field1501.field1508 > arg0)) {
            return this.field1567;
        } else if ((arg0 < (float) this.method3064()) || (arg0 > (float) this.method3047())) {
            return -1;
        } else {
            int var2 = this.method3056();
            int var3 = this.field1567;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1562[var6].field1508) {
                        if (arg0 > (float) this.field1562[var6 - 1].field1508) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1562[var6].field1508)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1562[var6 + 1].field1508) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1567 != var3) {
                this.field1567 = var3;
                this.field1570 = true;
            }
            return this.field1567;
        }
    }

    @ObfuscatedName("fb.ac(FI)Leg;")
    public class130 method3063(float arg0) {
        int var2 = this.method3054(arg0);
        return var2 >= 0 && var2 < this.field1562.length ? this.field1562[var2] : null;
    }

    @ObfuscatedName("fb.ae(I)I")
    public int method3056() {
        return this.field1562 == null ? 0 : this.field1562.length;
    }
}
