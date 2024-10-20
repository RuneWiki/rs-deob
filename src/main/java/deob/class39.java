package deob;

@ObfuscatedName("bb")
public class class39 extends class50 {

    @ObfuscatedName("bb.aq")
    public class397 field260 = new class397();

    @ObfuscatedName("bb.aw")
    public class397 field259 = new class397();

    @ObfuscatedName("bb.al")
    public int field261 = 0;

    @ObfuscatedName("bb.ai")
    public int field258 = -1;

    @ObfuscatedName("bb.aq(Lbj;)V")
    public final synchronized void method699(class50 arg0) {
        this.field260.method6686(arg0);
    }

    @ObfuscatedName("bb.aw(Lbj;)V")
    public final synchronized void method659(class50 arg0) {
        arg0.method7996();
    }

    @ObfuscatedName("bb.al()V")
    public void method660() {
        if (this.field261 <= 0) {
            return;
        }
        for (class56 var1 = (class56) this.field259.method6702(); var1 != null; var1 = (class56) this.field259.method6684()) {
            var1.field398 -= this.field261;
        }
        this.field258 -= this.field261;
        this.field261 = 0;
    }

    @ObfuscatedName("bb.ai(Lse;Lcd;)V")
    public void method661(class492 arg0, class56 arg1) {
        while (this.field259.field4517 != arg0 && ((class56) arg0).field398 <= arg1.field398) {
            arg0 = arg0.field4918;
        }
        class397.method6718(arg1, arg0);
        this.field258 = ((class56) this.field259.field4517.field4918).field398;
    }

    @ObfuscatedName("bb.ar(Lcd;)V")
    public void method684(class56 arg0) {
        arg0.method7996();
        arg0.method1021();
        class492 var2 = this.field259.field4517.field4918;
        if (this.field259.field4517 == var2) {
            this.field258 = -1;
        } else {
            this.field258 = ((class56) var2).field398;
        }
    }

    @ObfuscatedName("bb.as()Lbj;")
    public class50 method663() {
        return (class50) this.field260.method6702();
    }

    @ObfuscatedName("bb.aa()Lbj;")
    public class50 method662() {
        return (class50) this.field260.method6684();
    }

    @ObfuscatedName("bb.az()I")
    public int method677() {
        return 0;
    }

    @ObfuscatedName("bb.ao([III)V")
    public final synchronized void method666(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field258 < 0) {
                this.method667(arg0, arg1, arg2);
                return;
            }
            if (this.field261 + arg2 < this.field258) {
                this.field261 += arg2;
                this.method667(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field258 - this.field261;
            this.method667(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field261 += var4;
            this.method660();
            class56 var5 = (class56) this.field259.method6702();
            synchronized (var5) {
                int var7 = var5.method1022(this);
                if (var7 < 0) {
                    var5.field398 = 0;
                    this.method684(var5);
                } else {
                    var5.field398 = var7;
                    this.method661(var5.field4918, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bb.au([III)V")
    public void method667(int[] arg0, int arg1, int arg2) {
        for (class50 var4 = (class50) this.field260.method6702(); var4 != null; var4 = (class50) this.field260.method6684()) {
            var4.method968(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bb.ak(I)V")
    public final synchronized void method668(int arg0) {
        do {
            if (this.field258 < 0) {
                this.method669(arg0);
                return;
            }
            if (this.field261 + arg0 < this.field258) {
                this.field261 += arg0;
                this.method669(arg0);
                return;
            }
            int var2 = this.field258 - this.field261;
            this.method669(var2);
            arg0 -= var2;
            this.field261 += var2;
            this.method660();
            class56 var3 = (class56) this.field259.method6702();
            synchronized (var3) {
                int var5 = var3.method1022(this);
                if (var5 < 0) {
                    var3.field398 = 0;
                    this.method684(var3);
                } else {
                    var3.field398 = var5;
                    this.method661(var3.field4918, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bb.ah(I)V")
    public void method669(int arg0) {
        for (class50 var2 = (class50) this.field260.method6702(); var2 != null; var2 = (class50) this.field260.method6684()) {
            var2.method668(arg0);
        }
    }
}
