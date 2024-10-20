package deob;

@ObfuscatedName("cz")
public class class99 extends class116 {

    @ObfuscatedName("cz.q")
    public class262 field1342 = new class262();

    @ObfuscatedName("cz.e")
    public class262 field1343 = new class262();

    @ObfuscatedName("cz.p")
    public int field1344 = 0;

    @ObfuscatedName("cz.k")
    public int field1345 = -1;

    @ObfuscatedName("cz.q(Ldx;)V")
    public final synchronized void method2090(class116 arg0) {
        this.field1342.method4503(arg0);
    }

    @ObfuscatedName("cz.w(Ldx;)V")
    public final synchronized void method2097(class116 arg0) {
        arg0.method3286();
    }

    @ObfuscatedName("cz.e()V")
    public void method2087() {
        if (this.field1344 <= 0) {
            return;
        }
        for (class111 var1 = (class111) this.field1343.method4507(); var1 != null; var1 = (class111) this.field1343.method4509()) {
            var1.field1453 -= this.field1344;
        }
        this.field1345 -= this.field1344;
        this.field1344 = 0;
    }

    @ObfuscatedName("cz.p(Lfw;Ldj;)V")
    public void method2077(class181 arg0, class111 arg1) {
        while (this.field1343.field3541 != arg0 && ((class111) arg0).field1453 <= arg1.field1453) {
            arg0 = arg0.field2115;
        }
        class262.method4504(arg1, arg0);
        this.field1345 = ((class111) this.field1343.field3541.field2115).field1453;
    }

    @ObfuscatedName("cz.k(Ldj;)V")
    public void method2078(class111 arg0) {
        arg0.method3286();
        arg0.method2274();
        class181 var2 = this.field1343.field3541.field2115;
        if (this.field1343.field3541 == var2) {
            this.field1345 = -1;
        } else {
            this.field1345 = ((class111) var2).field1453;
        }
    }

    @ObfuscatedName("cz.l()Ldx;")
    public class116 method2079() {
        return (class116) this.field1342.method4507();
    }

    @ObfuscatedName("cz.b()Ldx;")
    public class116 method2080() {
        return (class116) this.field1342.method4509();
    }

    @ObfuscatedName("cz.i()I")
    public int method2081() {
        return 0;
    }

    @ObfuscatedName("cz.c([III)V")
    public final synchronized void method2082(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1345 < 0) {
                this.method2083(arg0, arg1, arg2);
                return;
            }
            if (this.field1344 + arg2 < this.field1345) {
                this.field1344 += arg2;
                this.method2083(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1345 - this.field1344;
            this.method2083(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1344 += var4;
            this.method2087();
            class111 var5 = (class111) this.field1343.method4507();
            synchronized (var5) {
                int var7 = var5.method2275(this);
                if (var7 < 0) {
                    var5.field1453 = 0;
                    this.method2078(var5);
                } else {
                    var5.field1453 = var7;
                    this.method2077(var5.field2115, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cz.u([III)V")
    public void method2083(int[] arg0, int arg1, int arg2) {
        for (class116 var4 = (class116) this.field1342.method4507(); var4 != null; var4 = (class116) this.field1342.method4509()) {
            var4.method2454(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cz.x(I)V")
    public final synchronized void method2084(int arg0) {
        do {
            if (this.field1345 < 0) {
                this.method2075(arg0);
                return;
            }
            if (this.field1344 + arg0 < this.field1345) {
                this.field1344 += arg0;
                this.method2075(arg0);
                return;
            }
            int var2 = this.field1345 - this.field1344;
            this.method2075(var2);
            arg0 -= var2;
            this.field1344 += var2;
            this.method2087();
            class111 var3 = (class111) this.field1343.method4507();
            synchronized (var3) {
                int var5 = var3.method2275(this);
                if (var5 < 0) {
                    var3.field1453 = 0;
                    this.method2078(var3);
                } else {
                    var3.field1453 = var5;
                    this.method2077(var3.field2115, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cz.r(I)V")
    public void method2075(int arg0) {
        for (class116 var2 = (class116) this.field1342.method4507(); var2 != null; var2 = (class116) this.field1342.method4509()) {
            var2.method2084(arg0);
        }
    }
}
