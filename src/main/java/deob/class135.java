package deob;

@ObfuscatedName("fw")
public class class135 {

    @ObfuscatedName("fw.ap")
    public final int field1570;

    @ObfuscatedName("fw.aw")
    public class135 field1575;

    @ObfuscatedName("fw.ak")
    public float[][] field1560;

    @ObfuscatedName("fw.aj")
    public final class429[] field1567;

    @ObfuscatedName("fw.ai")
    public class429[] field1562;

    @ObfuscatedName("fw.ay")
    public class429[] field1563;

    @ObfuscatedName("fw.as")
    public class429 field1569 = new class429();

    @ObfuscatedName("fw.ae")
    public boolean field1561 = true;

    @ObfuscatedName("fw.am")
    public class429 field1566 = new class429();

    @ObfuscatedName("fw.at")
    public boolean field1571 = true;

    @ObfuscatedName("fw.au")
    public class429 field1568 = new class429();

    @ObfuscatedName("fw.an")
    public float[][] field1576;

    @ObfuscatedName("fw.ao")
    public float[][] field1564;

    @ObfuscatedName("fw.af")
    public float[][] field1558;

    public class135(int arg0, class558 arg1, boolean arg2) {
        this.field1570 = arg1.method9261();
        this.field1567 = new class429[arg0];
        this.field1562 = new class429[this.field1567.length];
        this.field1563 = new class429[this.field1567.length];
        this.field1560 = new float[this.field1567.length][3];
        for (int var4 = 0; var4 < this.field1567.length; var4++) {
            this.field1567[var4] = new class429(arg1, arg2);
            this.field1560[var4][0] = arg1.method9266();
            this.field1560[var4][1] = arg1.method9266();
            this.field1560[var4][2] = arg1.method9266();
        }
        this.method3250();
    }

    @ObfuscatedName("fw.ap(B)V")
    public void method3250() {
        this.field1576 = new float[this.field1567.length][3];
        this.field1564 = new float[this.field1567.length][3];
        this.field1558 = new float[this.field1567.length][3];
        class429 var1 = class429.method3581();
        for (int var2 = 0; var2 < this.field1567.length; var2++) {
            class429 var3 = this.method3251(var2);
            var1.method7648(var3);
            var1.method7629();
            this.field1576[var2] = var1.method7618();
            this.field1564[var2][0] = var3.field4784[12];
            this.field1564[var2][1] = var3.field4784[13];
            this.field1564[var2][2] = var3.field4784[14];
            this.field1558[var2] = var3.method7697();
        }
        var1.method7650();
    }

    @ObfuscatedName("fw.aw(IB)Lqs;")
    public class429 method3251(int arg0) {
        return this.field1567[arg0];
    }

    @ObfuscatedName("fw.ak(IB)Lqs;")
    public class429 method3252(int arg0) {
        if (this.field1562[arg0] == null) {
            this.field1562[arg0] = new class429(this.method3251(arg0));
            if (this.field1575 == null) {
                this.field1562[arg0].method7644(class429.field4785);
            } else {
                this.field1562[arg0].method7644(this.field1575.method3252(arg0));
            }
        }
        return this.field1562[arg0];
    }

    @ObfuscatedName("fw.aj(IB)Lqs;")
    public class429 method3253(int arg0) {
        if (this.field1563[arg0] == null) {
            this.field1563[arg0] = new class429(this.method3252(arg0));
            this.field1563[arg0].method7629();
        }
        return this.field1563[arg0];
    }

    @ObfuscatedName("fw.ai(Lqs;I)V")
    public void method3254(class429 arg0) {
        this.field1569.method7648(arg0);
        this.field1561 = true;
        this.field1571 = true;
    }

    @ObfuscatedName("fw.ay(B)Lqs;")
    public class429 method3255() {
        return this.field1569;
    }

    @ObfuscatedName("fw.as(B)Lqs;")
    public class429 method3256() {
        if (this.field1561) {
            this.field1566.method7648(this.method3255());
            if (this.field1575 != null) {
                this.field1566.method7644(this.field1575.method3256());
            }
            this.field1561 = false;
        }
        return this.field1566;
    }

    @ObfuscatedName("fw.ae(II)Lqs;")
    public class429 method3257(int arg0) {
        if (this.field1571) {
            this.field1568.method7648(this.method3253(arg0));
            this.field1568.method7644(this.method3256());
            this.field1571 = false;
        }
        return this.field1568;
    }

    @ObfuscatedName("fw.am(II)[F")
    public float[] method3258(int arg0) {
        return this.field1576[arg0];
    }

    @ObfuscatedName("fw.at(II)[F")
    public float[] method3259(int arg0) {
        return this.field1564[arg0];
    }

    @ObfuscatedName("fw.au(II)[F")
    public float[] method3267(int arg0) {
        return this.field1558[arg0];
    }
}
