package deob;

@ObfuscatedName("fv")
public class class133 {

    @ObfuscatedName("fv.aq")
    public final int field1547;

    @ObfuscatedName("fv.ad")
    public class133 field1555;

    @ObfuscatedName("fv.ag")
    public float[][] field1548;

    @ObfuscatedName("fv.ak")
    public final class425[] field1557;

    @ObfuscatedName("fv.ap")
    public class425[] field1550;

    @ObfuscatedName("fv.an")
    public class425[] field1551;

    @ObfuscatedName("fv.aj")
    public class425 field1552 = new class425();

    @ObfuscatedName("fv.av")
    public boolean field1553 = true;

    @ObfuscatedName("fv.ab")
    public class425 field1556 = new class425();

    @ObfuscatedName("fv.ai")
    public boolean field1560 = true;

    @ObfuscatedName("fv.ae")
    public class425 field1546 = new class425();

    @ObfuscatedName("fv.au")
    public float[][] field1549;

    @ObfuscatedName("fv.ah")
    public float[][] field1558;

    @ObfuscatedName("fv.az")
    public float[][] field1559;

    public class133(int arg0, class547 arg1, boolean arg2) {
        this.field1547 = arg1.method8731();
        this.field1557 = new class425[arg0];
        this.field1550 = new class425[this.field1557.length];
        this.field1551 = new class425[this.field1557.length];
        this.field1548 = new float[this.field1557.length][3];
        for (int var4 = 0; var4 < this.field1557.length; var4++) {
            this.field1557[var4] = new class425(arg1, arg2);
            this.field1548[var4][0] = arg1.method8736();
            this.field1548[var4][1] = arg1.method8736();
            this.field1548[var4][2] = arg1.method8736();
        }
        this.method2919();
    }

    @ObfuscatedName("fv.aq(I)V")
    public void method2919() {
        this.field1549 = new float[this.field1557.length][3];
        this.field1558 = new float[this.field1557.length][3];
        this.field1559 = new float[this.field1557.length][3];
        class425[] var1 = class425.field4705;
        class425 var2;
        synchronized (class425.field4705) {
            if (Statics.field4707 == 0) {
                var2 = new class425();
            } else {
                class425.field4705[--Statics.field4707].method7134();
                var2 = class425.field4705[Statics.field4707];
            }
        }
        class425 var4 = var2;
        for (int var5 = 0; var5 < this.field1557.length; var5++) {
            class425 var6 = this.method2920(var5);
            var4.method7154(var6);
            var4.method7135();
            this.field1549[var5] = var4.method7124();
            this.field1558[var5][0] = var6.field4710[12];
            this.field1558[var5][1] = var6.field4710[13];
            this.field1558[var5][2] = var6.field4710[14];
            this.field1559[var5] = var6.method7143();
        }
        var4.method7146();
    }

    @ObfuscatedName("fv.ad(IB)Lqg;")
    public class425 method2920(int arg0) {
        return this.field1557[arg0];
    }

    @ObfuscatedName("fv.ag(II)Lqg;")
    public class425 method2961(int arg0) {
        if (this.field1550[arg0] == null) {
            this.field1550[arg0] = new class425(this.method2920(arg0));
            if (this.field1555 == null) {
                this.field1550[arg0].method7130(class425.field4708);
            } else {
                this.field1550[arg0].method7130(this.field1555.method2961(arg0));
            }
        }
        return this.field1550[arg0];
    }

    @ObfuscatedName("fv.ak(IB)Lqg;")
    public class425 method2924(int arg0) {
        if (this.field1551[arg0] == null) {
            this.field1551[arg0] = new class425(this.method2961(arg0));
            this.field1551[arg0].method7135();
        }
        return this.field1551[arg0];
    }

    @ObfuscatedName("fv.ap(Lqg;B)V")
    public void method2923(class425 arg0) {
        this.field1552.method7154(arg0);
        this.field1553 = true;
        this.field1560 = true;
    }

    @ObfuscatedName("fv.an(B)Lqg;")
    public class425 method2940() {
        return this.field1552;
    }

    @ObfuscatedName("fv.aj(I)Lqg;")
    public class425 method2962() {
        if (this.field1553) {
            this.field1556.method7154(this.method2940());
            if (this.field1555 != null) {
                this.field1556.method7130(this.field1555.method2962());
            }
            this.field1553 = false;
        }
        return this.field1556;
    }

    @ObfuscatedName("fv.av(II)Lqg;")
    public class425 method2938(int arg0) {
        if (this.field1560) {
            this.field1546.method7154(this.method2924(arg0));
            this.field1546.method7130(this.method2962());
            this.field1560 = false;
        }
        return this.field1546;
    }

    @ObfuscatedName("fv.ab(II)[F")
    public float[] method2927(int arg0) {
        return this.field1549[arg0];
    }

    @ObfuscatedName("fv.ai(II)[F")
    public float[] method2925(int arg0) {
        return this.field1558[arg0];
    }

    @ObfuscatedName("fv.ae(IB)[F")
    public float[] method2965(int arg0) {
        return this.field1559[arg0];
    }
}
