package deob;

@ObfuscatedName("bm")
public class class39 extends class50 {

    @ObfuscatedName("bm.ac")
    public class393 field270 = new class393();

    @ObfuscatedName("bm.al")
    public class393 field269 = new class393();

    @ObfuscatedName("bm.ak")
    public int field268 = 0;

    @ObfuscatedName("bm.ax")
    public int field271 = -1;

    @ObfuscatedName("bm.ac(Lbi;)V")
    public final synchronized void method725(class50 arg0) {
        this.field270.method6535(arg0);
    }

    @ObfuscatedName("bm.al(Lbi;)V")
    public final synchronized void method692(class50 arg0) {
        arg0.method7776();
    }

    @ObfuscatedName("bm.ak()V")
    public void method693() {
        if (this.field268 <= 0) {
            return;
        }
        for (class57 var1 = (class57) this.field269.method6532(); var1 != null; var1 = (class57) this.field269.method6543()) {
            var1.field421 -= this.field268;
        }
        this.field271 -= this.field268;
        this.field268 = 0;
    }

    @ObfuscatedName("bm.ax(Lsj;Lcc;)V")
    public void method694(class488 arg0, class57 arg1) {
        while (this.field269.field4458 != arg0 && ((class57) arg0).field421 <= arg1.field421) {
            arg0 = arg0.field4856;
        }
        class393.method6555(arg1, arg0);
        this.field271 = ((class57) this.field269.field4458.field4856).field421;
    }

    @ObfuscatedName("bm.ao(Lcc;)V")
    public void method695(class57 arg0) {
        arg0.method7776();
        arg0.method1051();
        class488 var2 = this.field269.field4458.field4856;
        if (this.field269.field4458 == var2) {
            this.field271 = -1;
        } else {
            this.field271 = ((class57) var2).field421;
        }
    }

    @ObfuscatedName("bm.ah()Lbi;")
    public class50 method696() {
        return (class50) this.field270.method6532();
    }

    @ObfuscatedName("bm.ar()Lbi;")
    public class50 method729() {
        return (class50) this.field270.method6543();
    }

    @ObfuscatedName("bm.ab()I")
    public int method698() {
        return 0;
    }

    @ObfuscatedName("bm.am([III)V")
    public final synchronized void method699(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field271 < 0) {
                this.method700(arg0, arg1, arg2);
                return;
            }
            if (this.field268 + arg2 < this.field271) {
                this.field268 += arg2;
                this.method700(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field271 - this.field268;
            this.method700(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field268 += var4;
            this.method693();
            class57 var5 = (class57) this.field269.method6532();
            synchronized (var5) {
                int var7 = var5.method1050(this);
                if (var7 < 0) {
                    var5.field421 = 0;
                    this.method695(var5);
                } else {
                    var5.field421 = var7;
                    this.method694(var5.field4856, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bm.av([III)V")
    public void method700(int[] arg0, int arg1, int arg2) {
        for (class50 var4 = (class50) this.field270.method6532(); var4 != null; var4 = (class50) this.field270.method6543()) {
            var4.method989(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bm.ag(I)V")
    public final synchronized void method691(int arg0) {
        do {
            if (this.field271 < 0) {
                this.method702(arg0);
                return;
            }
            if (this.field268 + arg0 < this.field271) {
                this.field268 += arg0;
                this.method702(arg0);
                return;
            }
            int var2 = this.field271 - this.field268;
            this.method702(var2);
            arg0 -= var2;
            this.field268 += var2;
            this.method693();
            class57 var3 = (class57) this.field269.method6532();
            synchronized (var3) {
                int var5 = var3.method1050(this);
                if (var5 < 0) {
                    var3.field421 = 0;
                    this.method695(var3);
                } else {
                    var3.field421 = var5;
                    this.method694(var3.field4856, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bm.aa(I)V")
    public void method702(int arg0) {
        for (class50 var2 = (class50) this.field270.method6532(); var2 != null; var2 = (class50) this.field270.method6543()) {
            var2.method691(arg0);
        }
    }
}
