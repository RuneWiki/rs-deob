package deob;

@ObfuscatedName("bl")
public class class39 extends class50 {

    @ObfuscatedName("bl.au")
    public class378 field275 = new class378();

    @ObfuscatedName("bl.ae")
    public class378 field272 = new class378();

    @ObfuscatedName("bl.ao")
    public int field274 = 0;

    @ObfuscatedName("bl.at")
    public int field273 = -1;

    @ObfuscatedName("bl.au(Lbw;)V")
    public final synchronized void method734(class50 arg0) {
        this.field275.method6407(arg0);
    }

    @ObfuscatedName("bl.ae(Lbw;)V")
    public final synchronized void method707(class50 arg0) {
        arg0.method7700();
    }

    @ObfuscatedName("bl.ao()V")
    public void method708() {
        if (this.field274 <= 0) {
            return;
        }
        for (class57 var1 = (class57) this.field272.method6393(); var1 != null; var1 = (class57) this.field272.method6395()) {
            var1.field421 -= this.field274;
        }
        this.field273 -= this.field274;
        this.field274 = 0;
    }

    @ObfuscatedName("bl.at(Lsj;Lcs;)V")
    public void method709(class473 arg0, class57 arg1) {
        while (this.field272.field4410 != arg0 && ((class57) arg0).field421 <= arg1.field421) {
            arg0 = arg0.field4813;
        }
        class378.method6390(arg1, arg0);
        this.field273 = ((class57) this.field272.field4410.field4813).field421;
    }

    @ObfuscatedName("bl.ac(Lcs;)V")
    public void method710(class57 arg0) {
        arg0.method7700();
        arg0.method1059();
        class473 var2 = this.field272.field4410.field4813;
        if (this.field272.field4410 == var2) {
            this.field273 = -1;
        } else {
            this.field273 = ((class57) var2).field421;
        }
    }

    @ObfuscatedName("bl.ai()Lbw;")
    public class50 method720() {
        return (class50) this.field275.method6393();
    }

    @ObfuscatedName("bl.az()Lbw;")
    public class50 method712() {
        return (class50) this.field275.method6395();
    }

    @ObfuscatedName("bl.ap()I")
    public int method713() {
        return 0;
    }

    @ObfuscatedName("bl.aa([III)V")
    public final synchronized void method714(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field273 < 0) {
                this.method715(arg0, arg1, arg2);
                return;
            }
            if (this.field274 + arg2 < this.field273) {
                this.field274 += arg2;
                this.method715(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field273 - this.field274;
            this.method715(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field274 += var4;
            this.method708();
            class57 var5 = (class57) this.field272.method6393();
            synchronized (var5) {
                int var7 = var5.method1060(this);
                if (var7 < 0) {
                    var5.field421 = 0;
                    this.method710(var5);
                } else {
                    var5.field421 = var7;
                    this.method709(var5.field4813, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bl.af([III)V")
    public void method715(int[] arg0, int arg1, int arg2) {
        for (class50 var4 = (class50) this.field275.method6393(); var4 != null; var4 = (class50) this.field275.method6395()) {
            var4.method1002(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bl.ad(I)V")
    public final synchronized void method716(int arg0) {
        do {
            if (this.field273 < 0) {
                this.method740(arg0);
                return;
            }
            if (this.field274 + arg0 < this.field273) {
                this.field274 += arg0;
                this.method740(arg0);
                return;
            }
            int var2 = this.field273 - this.field274;
            this.method740(var2);
            arg0 -= var2;
            this.field274 += var2;
            this.method708();
            class57 var3 = (class57) this.field272.method6393();
            synchronized (var3) {
                int var5 = var3.method1060(this);
                if (var5 < 0) {
                    var3.field421 = 0;
                    this.method710(var3);
                } else {
                    var3.field421 = var5;
                    this.method709(var3.field4813, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bl.aq(I)V")
    public void method740(int arg0) {
        for (class50 var2 = (class50) this.field275.method6393(); var2 != null; var2 = (class50) this.field275.method6395()) {
            var2.method716(arg0);
        }
    }
}
