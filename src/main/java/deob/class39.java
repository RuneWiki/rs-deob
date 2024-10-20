package deob;

@ObfuscatedName("bk")
public class class39 extends class50 {

    @ObfuscatedName("bk.ak")
    public class406 field261 = new class406();

    @ObfuscatedName("bk.al")
    public class406 field259 = new class406();

    @ObfuscatedName("bk.aj")
    public int field258 = 0;

    @ObfuscatedName("bk.az")
    public int field260 = -1;

    @ObfuscatedName("bk.ak(Lba;)V")
    public final synchronized void method699(class50 arg0) {
        this.field261.method6830(arg0);
    }

    @ObfuscatedName("bk.al(Lba;)V")
    public final synchronized void method711(class50 arg0) {
        arg0.method8189();
    }

    @ObfuscatedName("bk.aj()V")
    public void method701() {
        if (this.field258 <= 0) {
            return;
        }
        for (class57 var1 = (class57) this.field259.method6834(); var1 != null; var1 = (class57) this.field259.method6842()) {
            var1.field408 -= this.field258;
        }
        this.field260 -= this.field258;
        this.field258 = 0;
    }

    @ObfuscatedName("bk.az(Ltl;Lcp;)V")
    public void method734(class504 arg0, class57 arg1) {
        while (this.field259.field4629 != arg0 && ((class57) arg0).field408 <= arg1.field408) {
            arg0 = arg0.field5048;
        }
        class406.method6831(arg1, arg0);
        this.field260 = ((class57) this.field259.field4629.field5048).field408;
    }

    @ObfuscatedName("bk.af(Lcp;)V")
    public void method714(class57 arg0) {
        arg0.method8189();
        arg0.method1042();
        class504 var2 = this.field259.field4629.field5048;
        if (this.field259.field4629 == var2) {
            this.field260 = -1;
        } else {
            this.field260 = ((class57) var2).field408;
        }
    }

    @ObfuscatedName("bk.aa()Lba;")
    public class50 method704() {
        return (class50) this.field261.method6834();
    }

    @ObfuscatedName("bk.at()Lba;")
    public class50 method705() {
        return (class50) this.field261.method6842();
    }

    @ObfuscatedName("bk.ab()I")
    public int method706() {
        return 0;
    }

    @ObfuscatedName("bk.ac([III)V")
    public final synchronized void method707(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field260 < 0) {
                this.method708(arg0, arg1, arg2);
                return;
            }
            if (this.field258 + arg2 < this.field260) {
                this.field258 += arg2;
                this.method708(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field260 - this.field258;
            this.method708(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field258 += var4;
            this.method701();
            class57 var5 = (class57) this.field259.method6834();
            synchronized (var5) {
                int var7 = var5.method1044(this);
                if (var7 < 0) {
                    var5.field408 = 0;
                    this.method714(var5);
                } else {
                    var5.field408 = var7;
                    this.method734(var5.field5048, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bk.ao([III)V")
    public void method708(int[] arg0, int arg1, int arg2) {
        for (class50 var4 = (class50) this.field261.method6834(); var4 != null; var4 = (class50) this.field261.method6842()) {
            var4.method981(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bk.ah(I)V")
    public final synchronized void method713(int arg0) {
        do {
            if (this.field260 < 0) {
                this.method726(arg0);
                return;
            }
            if (this.field258 + arg0 < this.field260) {
                this.field258 += arg0;
                this.method726(arg0);
                return;
            }
            int var2 = this.field260 - this.field258;
            this.method726(var2);
            arg0 -= var2;
            this.field258 += var2;
            this.method701();
            class57 var3 = (class57) this.field259.method6834();
            synchronized (var3) {
                int var5 = var3.method1044(this);
                if (var5 < 0) {
                    var3.field408 = 0;
                    this.method714(var3);
                } else {
                    var3.field408 = var5;
                    this.method734(var3.field5048, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bk.av(I)V")
    public void method726(int arg0) {
        for (class50 var2 = (class50) this.field261.method6834(); var2 != null; var2 = (class50) this.field261.method6842()) {
            var2.method713(arg0);
        }
    }
}
