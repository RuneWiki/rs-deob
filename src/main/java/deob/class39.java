package deob;

@ObfuscatedName("bn")
public class class39 extends class50 {

    @ObfuscatedName("bn.ap")
    public class411 field233 = new class411();

    @ObfuscatedName("bn.aw")
    public class411 field234 = new class411();

    @ObfuscatedName("bn.ak")
    public int field235 = 0;

    @ObfuscatedName("bn.aj")
    public int field236 = -1;

    @ObfuscatedName("bn.ap(Lbg;)V")
    public final synchronized void method697(class50 arg0) {
        this.field233.method7244(arg0);
    }

    @ObfuscatedName("bn.aw(Lbg;)V")
    public final synchronized void method699(class50 arg0) {
        arg0.method8667();
    }

    @ObfuscatedName("bn.ak()V")
    public void method715() {
        if (this.field235 <= 0) {
            return;
        }
        for (class57 var1 = (class57) this.field234.method7247(); var1 != null; var1 = (class57) this.field234.method7249()) {
            var1.field377 -= this.field235;
        }
        this.field236 -= this.field235;
        this.field235 = 0;
    }

    @ObfuscatedName("bn.aj(Ltw;Lcn;)V")
    public void method701(class515 arg0, class57 arg1) {
        while (this.field234.field4725 != arg0 && ((class57) arg0).field377 <= arg1.field377) {
            arg0 = arg0.field5171;
        }
        class411.method7254(arg1, arg0);
        this.field236 = ((class57) this.field234.field4725.field5171).field377;
    }

    @ObfuscatedName("bn.ai(Lcn;)V")
    public void method714(class57 arg0) {
        arg0.method8667();
        arg0.method1091();
        class515 var2 = this.field234.field4725.field5171;
        if (this.field234.field4725 == var2) {
            this.field236 = -1;
        } else {
            this.field236 = ((class57) var2).field377;
        }
    }

    @ObfuscatedName("bn.ay()Lbg;")
    public class50 method703() {
        return (class50) this.field233.method7247();
    }

    @ObfuscatedName("bn.as()Lbg;")
    public class50 method722() {
        return (class50) this.field233.method7249();
    }

    @ObfuscatedName("bn.ae()I")
    public int method705() {
        return 0;
    }

    @ObfuscatedName("bn.am([III)V")
    public final synchronized void method706(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field236 < 0) {
                this.method707(arg0, arg1, arg2);
                return;
            }
            if (this.field235 + arg2 < this.field236) {
                this.field235 += arg2;
                this.method707(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field236 - this.field235;
            this.method707(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field235 += var4;
            this.method715();
            class57 var5 = (class57) this.field234.method7247();
            synchronized (var5) {
                int var7 = var5.method1089(this);
                if (var7 < 0) {
                    var5.field377 = 0;
                    this.method714(var5);
                } else {
                    var5.field377 = var7;
                    this.method701(var5.field5171, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bn.at([III)V")
    public void method707(int[] arg0, int arg1, int arg2) {
        for (class50 var4 = (class50) this.field233.method7247(); var4 != null; var4 = (class50) this.field233.method7249()) {
            var4.method1022(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bn.au(I)V")
    public final synchronized void method708(int arg0) {
        do {
            if (this.field236 < 0) {
                this.method728(arg0);
                return;
            }
            if (this.field235 + arg0 < this.field236) {
                this.field235 += arg0;
                this.method728(arg0);
                return;
            }
            int var2 = this.field236 - this.field235;
            this.method728(var2);
            arg0 -= var2;
            this.field235 += var2;
            this.method715();
            class57 var3 = (class57) this.field234.method7247();
            synchronized (var3) {
                int var5 = var3.method1089(this);
                if (var5 < 0) {
                    var3.field377 = 0;
                    this.method714(var3);
                } else {
                    var3.field377 = var5;
                    this.method701(var3.field5171, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bn.an(I)V")
    public void method728(int arg0) {
        for (class50 var2 = (class50) this.field233.method7247(); var2 != null; var2 = (class50) this.field233.method7249()) {
            var2.method708(arg0);
        }
    }
}
