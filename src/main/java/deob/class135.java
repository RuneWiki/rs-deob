package deob;

@ObfuscatedName("fb")
public class class135 {

    @ObfuscatedName("fb.ac")
    public final int field1582;

    @ObfuscatedName("fb.ae")
    public class135 field1570;

    @ObfuscatedName("fb.ag")
    public float[][] field1576;

    @ObfuscatedName("fb.am")
    public final class428[] field1574;

    @ObfuscatedName("fb.ax")
    public class428[] field1572;

    @ObfuscatedName("fb.aq")
    public class428[] field1575;

    @ObfuscatedName("fb.af")
    public class428 field1586 = new class428();

    @ObfuscatedName("fb.at")
    public boolean field1577 = true;

    @ObfuscatedName("fb.au")
    public class428 field1578 = new class428();

    @ObfuscatedName("fb.ar")
    public boolean field1573 = true;

    @ObfuscatedName("fb.al")
    public class428 field1580 = new class428();

    @ObfuscatedName("fb.ad")
    public float[][] field1581;

    @ObfuscatedName("fb.ah")
    public float[][] field1584;

    @ObfuscatedName("fb.ap")
    public float[][] field1583;

    public class135(int arg0, class551 arg1, boolean arg2) {
        this.field1582 = arg1.method8977();
        this.field1574 = new class428[arg0];
        this.field1572 = new class428[this.field1574.length];
        this.field1575 = new class428[this.field1574.length];
        this.field1576 = new float[this.field1574.length][3];
        for (int var4 = 0; var4 < this.field1574.length; var4++) {
            this.field1574[var4] = new class428(arg1, arg2);
            this.field1576[var4][0] = arg1.method8981();
            this.field1576[var4][1] = arg1.method8981();
            this.field1576[var4][2] = arg1.method8981();
        }
        this.method3106();
    }

    @ObfuscatedName("fb.ac(I)V")
    public void method3106() {
        this.field1581 = new float[this.field1574.length][3];
        this.field1584 = new float[this.field1574.length][3];
        this.field1583 = new float[this.field1574.length][3];
        class428 var1 = class428.method3414();
        for (int var2 = 0; var2 < this.field1574.length; var2++) {
            class428 var3 = this.method3115(var2);
            var1.method7364(var3);
            var1.method7371();
            this.field1581[var2] = var1.method7361();
            this.field1584[var2][0] = var3.field4738[12];
            this.field1584[var2][1] = var3.field4738[13];
            this.field1584[var2][2] = var3.field4738[14];
            this.field1583[var2] = var3.method7377();
        }
        var1.method7357();
    }

    @ObfuscatedName("fb.ae(II)Lqf;")
    public class428 method3115(int arg0) {
        return this.field1574[arg0];
    }

    @ObfuscatedName("fb.ag(II)Lqf;")
    public class428 method3108(int arg0) {
        if (this.field1572[arg0] == null) {
            this.field1572[arg0] = new class428(this.method3115(arg0));
            if (this.field1570 == null) {
                this.field1572[arg0].method7367(class428.field4734);
            } else {
                this.field1572[arg0].method7367(this.field1570.method3108(arg0));
            }
        }
        return this.field1572[arg0];
    }

    @ObfuscatedName("fb.am(II)Lqf;")
    public class428 method3109(int arg0) {
        if (this.field1575[arg0] == null) {
            this.field1575[arg0] = new class428(this.method3108(arg0));
            this.field1575[arg0].method7371();
        }
        return this.field1575[arg0];
    }

    @ObfuscatedName("fb.ax(Lqf;I)V")
    public void method3137(class428 arg0) {
        this.field1586.method7364(arg0);
        this.field1577 = true;
        this.field1573 = true;
    }

    @ObfuscatedName("fb.aq(B)Lqf;")
    public class428 method3111() {
        return this.field1586;
    }

    @ObfuscatedName("fb.af(I)Lqf;")
    public class428 method3113() {
        if (this.field1577) {
            this.field1578.method7364(this.method3111());
            if (this.field1570 != null) {
                this.field1578.method7367(this.field1570.method3113());
            }
            this.field1577 = false;
        }
        return this.field1578;
    }

    @ObfuscatedName("fb.at(IB)Lqf;")
    public class428 method3112(int arg0) {
        if (this.field1573) {
            this.field1580.method7364(this.method3109(arg0));
            this.field1580.method7367(this.method3113());
            this.field1573 = false;
        }
        return this.field1580;
    }

    @ObfuscatedName("fb.au(II)[F")
    public float[] method3139(int arg0) {
        return this.field1581[arg0];
    }

    @ObfuscatedName("fb.ar(IB)[F")
    public float[] method3114(int arg0) {
        return this.field1584[arg0];
    }

    @ObfuscatedName("fb.al(II)[F")
    public float[] method3124(int arg0) {
        return this.field1583[arg0];
    }
}
