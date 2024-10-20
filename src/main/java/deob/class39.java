package deob;

@ObfuscatedName("by")
public class class39 extends class50 {

    @ObfuscatedName("by.aq")
    public class407 field241 = new class407();

    @ObfuscatedName("by.ad")
    public class407 field243 = new class407();

    @ObfuscatedName("by.ag")
    public int field242 = 0;

    @ObfuscatedName("by.ak")
    public int field240 = -1;

    @ObfuscatedName("by.aq(Lbk;)V")
    public final synchronized void method711(class50 arg0) {
        this.field241.method6793(arg0);
    }

    @ObfuscatedName("by.ad(Lbk;)V")
    public final synchronized void method744(class50 arg0) {
        arg0.method8130();
    }

    @ObfuscatedName("by.ag()V")
    public void method713() {
        if (this.field242 <= 0) {
            return;
        }
        for (class56 var1 = (class56) this.field243.method6814(); var1 != null; var1 = (class56) this.field243.method6799()) {
            var1.field380 -= this.field242;
        }
        this.field240 -= this.field242;
        this.field242 = 0;
    }

    @ObfuscatedName("by.ak(Ltz;Lcm;)V")
    public void method737(class505 arg0, class56 arg1) {
        while (this.field243.field4655 != arg0 && ((class56) arg0).field380 <= arg1.field380) {
            arg0 = arg0.field5083;
        }
        class407.method6791(arg1, arg0);
        this.field240 = ((class56) this.field243.field4655.field5083).field380;
    }

    @ObfuscatedName("by.ap(Lcm;)V")
    public void method715(class56 arg0) {
        arg0.method8130();
        arg0.method1057();
        class505 var2 = this.field243.field4655.field5083;
        if (this.field243.field4655 == var2) {
            this.field240 = -1;
        } else {
            this.field240 = ((class56) var2).field380;
        }
    }

    @ObfuscatedName("by.an()Lbk;")
    public class50 method750() {
        return (class50) this.field241.method6814();
    }

    @ObfuscatedName("by.aj()Lbk;")
    public class50 method738() {
        return (class50) this.field241.method6799();
    }

    @ObfuscatedName("by.av()I")
    public int method724() {
        return 0;
    }

    @ObfuscatedName("by.ab([III)V")
    public final synchronized void method718(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field240 < 0) {
                this.method720(arg0, arg1, arg2);
                return;
            }
            if (this.field242 + arg2 < this.field240) {
                this.field242 += arg2;
                this.method720(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field240 - this.field242;
            this.method720(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field242 += var4;
            this.method713();
            class56 var5 = (class56) this.field243.method6814();
            synchronized (var5) {
                int var7 = var5.method1053(this);
                if (var7 < 0) {
                    var5.field380 = 0;
                    this.method715(var5);
                } else {
                    var5.field380 = var7;
                    this.method737(var5.field5083, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("by.ai([III)V")
    public void method720(int[] arg0, int arg1, int arg2) {
        for (class50 var4 = (class50) this.field241.method6814(); var4 != null; var4 = (class50) this.field241.method6799()) {
            var4.method1002(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("by.ae(I)V")
    public final synchronized void method721(int arg0) {
        do {
            if (this.field240 < 0) {
                this.method722(arg0);
                return;
            }
            if (this.field242 + arg0 < this.field240) {
                this.field242 += arg0;
                this.method722(arg0);
                return;
            }
            int var2 = this.field240 - this.field242;
            this.method722(var2);
            arg0 -= var2;
            this.field242 += var2;
            this.method713();
            class56 var3 = (class56) this.field243.method6814();
            synchronized (var3) {
                int var5 = var3.method1053(this);
                if (var5 < 0) {
                    var3.field380 = 0;
                    this.method715(var3);
                } else {
                    var3.field380 = var5;
                    this.method737(var3.field5083, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("by.au(I)V")
    public void method722(int arg0) {
        for (class50 var2 = (class50) this.field241.method6814(); var2 != null; var2 = (class50) this.field241.method6799()) {
            var2.method721(arg0);
        }
    }
}
