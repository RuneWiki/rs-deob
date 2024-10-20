package deob;

@ObfuscatedName("bn")
public class class39 extends class50 {

    @ObfuscatedName("bn.at")
    public class390 field246 = new class390();

    @ObfuscatedName("bn.ah")
    public class390 field244 = new class390();

    @ObfuscatedName("bn.ar")
    public int field243 = 0;

    @ObfuscatedName("bn.ao")
    public int field245 = -1;

    @ObfuscatedName("bn.at(Lbk;)V")
    public final synchronized void method707(class50 arg0) {
        this.field246.method6575(arg0);
    }

    @ObfuscatedName("bn.ah(Lbk;)V")
    public final synchronized void method739(class50 arg0) {
        arg0.method7828();
    }

    @ObfuscatedName("bn.ar()V")
    public void method709() {
        if (this.field243 <= 0) {
            return;
        }
        for (class56 var1 = (class56) this.field244.method6579(); var1 != null; var1 = (class56) this.field244.method6549()) {
            var1.field386 -= this.field243;
        }
        this.field245 -= this.field243;
        this.field243 = 0;
    }

    @ObfuscatedName("bn.ao(Lsh;Lcx;)V")
    public void method710(class485 arg0, class56 arg1) {
        while (this.field244.field4436 != arg0 && ((class56) arg0).field386 <= arg1.field386) {
            arg0 = arg0.field4850;
        }
        class390.method6544(arg1, arg0);
        this.field245 = ((class56) this.field244.field4436.field4850).field386;
    }

    @ObfuscatedName("bn.ab(Lcx;)V")
    public void method711(class56 arg0) {
        arg0.method7828();
        arg0.method1053();
        class485 var2 = this.field244.field4436.field4850;
        if (this.field244.field4436 == var2) {
            this.field245 = -1;
        } else {
            this.field245 = ((class56) var2).field386;
        }
    }

    @ObfuscatedName("bn.au()Lbk;")
    public class50 method714() {
        return (class50) this.field246.method6579();
    }

    @ObfuscatedName("bn.aa()Lbk;")
    public class50 method713() {
        return (class50) this.field246.method6549();
    }

    @ObfuscatedName("bn.ac()I")
    public int method750() {
        return 0;
    }

    @ObfuscatedName("bn.al([III)V")
    public final synchronized void method706(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field245 < 0) {
                this.method716(arg0, arg1, arg2);
                return;
            }
            if (this.field243 + arg2 < this.field245) {
                this.field243 += arg2;
                this.method716(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field245 - this.field243;
            this.method716(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field243 += var4;
            this.method709();
            class56 var5 = (class56) this.field244.method6579();
            synchronized (var5) {
                int var7 = var5.method1054(this);
                if (var7 < 0) {
                    var5.field386 = 0;
                    this.method711(var5);
                } else {
                    var5.field386 = var7;
                    this.method710(var5.field4850, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bn.az([III)V")
    public void method716(int[] arg0, int arg1, int arg2) {
        for (class50 var4 = (class50) this.field246.method6579(); var4 != null; var4 = (class50) this.field246.method6549()) {
            var4.method995(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bn.ap(I)V")
    public final synchronized void method729(int arg0) {
        do {
            if (this.field245 < 0) {
                this.method712(arg0);
                return;
            }
            if (this.field243 + arg0 < this.field245) {
                this.field243 += arg0;
                this.method712(arg0);
                return;
            }
            int var2 = this.field245 - this.field243;
            this.method712(var2);
            arg0 -= var2;
            this.field243 += var2;
            this.method709();
            class56 var3 = (class56) this.field244.method6579();
            synchronized (var3) {
                int var5 = var3.method1054(this);
                if (var5 < 0) {
                    var3.field386 = 0;
                    this.method711(var3);
                } else {
                    var3.field386 = var5;
                    this.method710(var3.field4850, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bn.av(I)V")
    public void method712(int arg0) {
        for (class50 var2 = (class50) this.field246.method6579(); var2 != null; var2 = (class50) this.field246.method6549()) {
            var2.method729(arg0);
        }
    }
}
