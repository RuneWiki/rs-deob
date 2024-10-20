package deob;

@ObfuscatedName("bb")
public class class39 extends class50 {

    @ObfuscatedName("bb.ac")
    public class410 field241 = new class410();

    @ObfuscatedName("bb.ae")
    public class410 field240 = new class410();

    @ObfuscatedName("bb.ag")
    public int field242 = 0;

    @ObfuscatedName("bb.am")
    public int field239 = -1;

    @ObfuscatedName("bb.ac(Lbk;)V")
    public final synchronized void method705(class50 arg0) {
        this.field241.method7025(arg0);
    }

    @ObfuscatedName("bb.ae(Lbk;)V")
    public final synchronized void method706(class50 arg0) {
        arg0.method8362();
    }

    @ObfuscatedName("bb.ag()V")
    public void method707() {
        if (this.field242 <= 0) {
            return;
        }
        for (class56 var1 = (class56) this.field240.method7029(); var1 != null; var1 = (class56) this.field240.method7031()) {
            var1.field391 -= this.field242;
        }
        this.field239 -= this.field242;
        this.field242 = 0;
    }

    @ObfuscatedName("bb.am(Lto;Lcu;)V")
    public void method704(class508 arg0, class56 arg1) {
        while (this.field240.field4677 != arg0 && ((class56) arg0).field391 <= arg1.field391) {
            arg0 = arg0.field5123;
        }
        class410.method7026(arg1, arg0);
        this.field239 = ((class56) this.field240.field4677.field5123).field391;
    }

    @ObfuscatedName("bb.ax(Lcu;)V")
    public void method718(class56 arg0) {
        arg0.method8362();
        arg0.method1064();
        class508 var2 = this.field240.field4677.field5123;
        if (this.field240.field4677 == var2) {
            this.field239 = -1;
        } else {
            this.field239 = ((class56) var2).field391;
        }
    }

    @ObfuscatedName("bb.aq()Lbk;")
    public class50 method709() {
        return (class50) this.field241.method7029();
    }

    @ObfuscatedName("bb.af()Lbk;")
    public class50 method710() {
        return (class50) this.field241.method7031();
    }

    @ObfuscatedName("bb.at()I")
    public int method711() {
        return 0;
    }

    @ObfuscatedName("bb.au([III)V")
    public final synchronized void method712(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field239 < 0) {
                this.method713(arg0, arg1, arg2);
                return;
            }
            if (this.field242 + arg2 < this.field239) {
                this.field242 += arg2;
                this.method713(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field239 - this.field242;
            this.method713(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field242 += var4;
            this.method707();
            class56 var5 = (class56) this.field240.method7029();
            synchronized (var5) {
                int var7 = var5.method1065(this);
                if (var7 < 0) {
                    var5.field391 = 0;
                    this.method718(var5);
                } else {
                    var5.field391 = var7;
                    this.method704(var5.field5123, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bb.ar([III)V")
    public void method713(int[] arg0, int arg1, int arg2) {
        for (class50 var4 = (class50) this.field241.method7029(); var4 != null; var4 = (class50) this.field241.method7031()) {
            var4.method1006(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bb.al(I)V")
    public final synchronized void method716(int arg0) {
        do {
            if (this.field239 < 0) {
                this.method715(arg0);
                return;
            }
            if (this.field242 + arg0 < this.field239) {
                this.field242 += arg0;
                this.method715(arg0);
                return;
            }
            int var2 = this.field239 - this.field242;
            this.method715(var2);
            arg0 -= var2;
            this.field242 += var2;
            this.method707();
            class56 var3 = (class56) this.field240.method7029();
            synchronized (var3) {
                int var5 = var3.method1065(this);
                if (var5 < 0) {
                    var3.field391 = 0;
                    this.method718(var3);
                } else {
                    var3.field391 = var5;
                    this.method704(var3.field5123, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bb.ad(I)V")
    public void method715(int arg0) {
        for (class50 var2 = (class50) this.field241.method7029(); var2 != null; var2 = (class50) this.field241.method7031()) {
            var2.method716(arg0);
        }
    }
}
