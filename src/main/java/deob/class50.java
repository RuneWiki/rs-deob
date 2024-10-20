package deob;

@ObfuscatedName("ad")
public class class50 extends class61 {

    @ObfuscatedName("ad.x")
    public class180 field1082 = new class180();

    @ObfuscatedName("ad.v")
    public class180 field1084 = new class180();

    @ObfuscatedName("ad.m")
    public int field1083 = 0;

    @ObfuscatedName("ad.e")
    public int field1081 = -1;

    @ObfuscatedName("ad.x(Lbh;)V")
    public final synchronized void method972(class61 arg0) {
        this.field1082.method3247(arg0);
    }

    @ObfuscatedName("ad.v(Lbh;)V")
    public final synchronized void method973(class61 arg0) {
        arg0.method3352();
    }

    @ObfuscatedName("ad.m()V")
    public void method974() {
        if (this.field1083 <= 0) {
            return;
        }
        for (class56 var1 = (class56) this.field1084.method3251(); var1 != null; var1 = (class56) this.field1084.method3272()) {
            var1.field1143 -= this.field1083;
        }
        this.field1081 -= this.field1083;
        this.field1083 = 0;
    }

    @ObfuscatedName("ad.e(Lgs;Lbs;)V")
    public void method994(class189 arg0, class56 arg1) {
        while (this.field1084.field2864 != arg0 && ((class56) arg0).field1143 <= arg1.field1143) {
            arg0 = arg0.field2881;
        }
        class180.method3248(arg1, arg0);
        this.field1081 = ((class56) this.field1084.field2864.field2881).field1143;
    }

    @ObfuscatedName("ad.h(Lbs;)V")
    public void method976(class56 arg0) {
        arg0.method3352();
        arg0.method1106();
        class189 var2 = this.field1084.field2864.field2881;
        if (this.field1084.field2864 == var2) {
            this.field1081 = -1;
        } else {
            this.field1081 = ((class56) var2).field1143;
        }
    }

    @ObfuscatedName("ad.p()Lbh;")
    public class61 method977() {
        return (class61) this.field1082.method3251();
    }

    @ObfuscatedName("ad.j()Lbh;")
    public class61 method975() {
        return (class61) this.field1082.method3272();
    }

    @ObfuscatedName("ad.i()I")
    public int method979() {
        return 0;
    }

    @ObfuscatedName("ad.u([III)V")
    public final synchronized void method980(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1081 < 0) {
                this.method981(arg0, arg1, arg2);
                return;
            }
            if (this.field1083 + arg2 < this.field1081) {
                this.field1083 += arg2;
                this.method981(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1081 - this.field1083;
            this.method981(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1083 += var4;
            this.method974();
            class56 var5 = (class56) this.field1084.method3251();
            synchronized (var5) {
                int var7 = var5.method1107(this);
                if (var7 < 0) {
                    var5.field1143 = 0;
                    this.method976(var5);
                } else {
                    var5.field1143 = var7;
                    this.method994(var5.field2881, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ad.l([III)V")
    public void method981(int[] arg0, int arg1, int arg2) {
        for (class61 var4 = (class61) this.field1082.method3251(); var4 != null; var4 = (class61) this.field1082.method3272()) {
            var4.method1259(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ad.k(I)V")
    public final synchronized void method982(int arg0) {
        do {
            if (this.field1081 < 0) {
                this.method1007(arg0);
                return;
            }
            if (this.field1083 + arg0 < this.field1081) {
                this.field1083 += arg0;
                this.method1007(arg0);
                return;
            }
            int var2 = this.field1081 - this.field1083;
            this.method1007(var2);
            arg0 -= var2;
            this.field1083 += var2;
            this.method974();
            class56 var3 = (class56) this.field1084.method3251();
            synchronized (var3) {
                int var5 = var3.method1107(this);
                if (var5 < 0) {
                    var3.field1143 = 0;
                    this.method976(var3);
                } else {
                    var3.field1143 = var5;
                    this.method994(var3.field2881, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ad.q(I)V")
    public void method1007(int arg0) {
        for (class61 var2 = (class61) this.field1082.method3251(); var2 != null; var2 = (class61) this.field1082.method3272()) {
            var2.method982(arg0);
        }
    }
}
