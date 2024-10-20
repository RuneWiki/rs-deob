package deob;

@ObfuscatedName("be")
public class class39 extends class50 {

    @ObfuscatedName("be.aw")
    public class379 field277 = new class379();

    @ObfuscatedName("be.ay")
    public class379 field276 = new class379();

    @ObfuscatedName("be.ar")
    public int field275 = 0;

    @ObfuscatedName("be.am")
    public int field278 = -1;

    @ObfuscatedName("be.aw(Lby;)V")
    public final synchronized void method693(class50 arg0) {
        this.field277.method6368(arg0);
    }

    @ObfuscatedName("be.ay(Lby;)V")
    public final synchronized void method712(class50 arg0) {
        arg0.method7662();
    }

    @ObfuscatedName("be.ar()V")
    public void method718() {
        if (this.field275 <= 0) {
            return;
        }
        for (class57 var1 = (class57) this.field276.method6393(); var1 != null; var1 = (class57) this.field276.method6374()) {
            var1.field430 -= this.field275;
        }
        this.field278 -= this.field275;
        this.field275 = 0;
    }

    @ObfuscatedName("be.am(Lsb;Lcs;)V")
    public void method731(class474 arg0, class57 arg1) {
        while (this.field276.field4414 != arg0 && ((class57) arg0).field430 <= arg1.field430) {
            arg0 = arg0.field4820;
        }
        class379.method6369(arg1, arg0);
        this.field278 = ((class57) this.field276.field4414.field4820).field430;
    }

    @ObfuscatedName("be.as(Lcs;)V")
    public void method708(class57 arg0) {
        arg0.method7662();
        arg0.method1056();
        class474 var2 = this.field276.field4414.field4820;
        if (this.field276.field4414 == var2) {
            this.field278 = -1;
        } else {
            this.field278 = ((class57) var2).field430;
        }
    }

    @ObfuscatedName("be.aj()Lby;")
    public class50 method739() {
        return (class50) this.field277.method6393();
    }

    @ObfuscatedName("be.ag()Lby;")
    public class50 method694() {
        return (class50) this.field277.method6374();
    }

    @ObfuscatedName("be.az()I")
    public int method700() {
        return 0;
    }

    @ObfuscatedName("be.av([III)V")
    public final synchronized void method701(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field278 < 0) {
                this.method697(arg0, arg1, arg2);
                return;
            }
            if (this.field275 + arg2 < this.field278) {
                this.field275 += arg2;
                this.method697(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field278 - this.field275;
            this.method697(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field275 += var4;
            this.method718();
            class57 var5 = (class57) this.field276.method6393();
            synchronized (var5) {
                int var7 = var5.method1060(this);
                if (var7 < 0) {
                    var5.field430 = 0;
                    this.method708(var5);
                } else {
                    var5.field430 = var7;
                    this.method731(var5.field4820, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("be.ap([III)V")
    public void method697(int[] arg0, int arg1, int arg2) {
        for (class50 var4 = (class50) this.field277.method6393(); var4 != null; var4 = (class50) this.field277.method6374()) {
            var4.method1004(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("be.aq(I)V")
    public final synchronized void method713(int arg0) {
        do {
            if (this.field278 < 0) {
                this.method704(arg0);
                return;
            }
            if (this.field275 + arg0 < this.field278) {
                this.field275 += arg0;
                this.method704(arg0);
                return;
            }
            int var2 = this.field278 - this.field275;
            this.method704(var2);
            arg0 -= var2;
            this.field275 += var2;
            this.method718();
            class57 var3 = (class57) this.field276.method6393();
            synchronized (var3) {
                int var5 = var3.method1060(this);
                if (var5 < 0) {
                    var3.field430 = 0;
                    this.method708(var3);
                } else {
                    var3.field430 = var5;
                    this.method731(var3.field4820, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("be.at(I)V")
    public void method704(int arg0) {
        for (class50 var2 = (class50) this.field277.method6393(); var2 != null; var2 = (class50) this.field277.method6374()) {
            var2.method713(arg0);
        }
    }
}
