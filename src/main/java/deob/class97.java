package deob;

@ObfuscatedName("cy")
public class class97 extends class114 {

    @ObfuscatedName("cy.f")
    public class262 field1305 = new class262();

    @ObfuscatedName("cy.i")
    public class262 field1304 = new class262();

    @ObfuscatedName("cy.y")
    public int field1306 = 0;

    @ObfuscatedName("cy.p")
    public int field1307 = -1;

    @ObfuscatedName("cy.f(Ldl;)V")
    public final synchronized void method2107(class114 arg0) {
        this.field1305.method4535(arg0);
    }

    @ObfuscatedName("cy.i(Ldl;)V")
    public final synchronized void method2109(class114 arg0) {
        arg0.method3292();
    }

    @ObfuscatedName("cy.y()V")
    public void method2110() {
        if (this.field1306 <= 0) {
            return;
        }
        for (class109 var1 = (class109) this.field1304.method4540(); var1 != null; var1 = (class109) this.field1304.method4533()) {
            var1.field1411 -= this.field1306;
        }
        this.field1307 -= this.field1306;
        this.field1306 = 0;
    }

    @ObfuscatedName("cy.w(Lgk;Ldf;)V")
    public void method2119(class188 arg0, class109 arg1) {
        while (this.field1304.field3503 != arg0 && ((class109) arg0).field1411 <= arg1.field1411) {
            arg0 = arg0.field2323;
        }
        class262.method4528(arg1, arg0);
        this.field1307 = ((class109) this.field1304.field3503.field2323).field1411;
    }

    @ObfuscatedName("cy.p(Ldf;)V")
    public void method2112(class109 arg0) {
        arg0.method3292();
        arg0.method2306();
        class188 var2 = this.field1304.field3503.field2323;
        if (this.field1304.field3503 == var2) {
            this.field1307 = -1;
        } else {
            this.field1307 = ((class109) var2).field1411;
        }
    }

    @ObfuscatedName("cy.b()Ldl;")
    public class114 method2113() {
        return (class114) this.field1305.method4540();
    }

    @ObfuscatedName("cy.e()Ldl;")
    public class114 method2114() {
        return (class114) this.field1305.method4533();
    }

    @ObfuscatedName("cy.x()I")
    public int method2122() {
        return 0;
    }

    @ObfuscatedName("cy.a([III)V")
    public final synchronized void method2134(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1307 < 0) {
                this.method2116(arg0, arg1, arg2);
                return;
            }
            if (this.field1306 + arg2 < this.field1307) {
                this.field1306 += arg2;
                this.method2116(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1307 - this.field1306;
            this.method2116(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1306 += var4;
            this.method2110();
            class109 var5 = (class109) this.field1304.method4540();
            synchronized (var5) {
                int var7 = var5.method2307(this);
                if (var7 < 0) {
                    var5.field1411 = 0;
                    this.method2112(var5);
                } else {
                    var5.field1411 = var7;
                    this.method2119(var5.field2323, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("cy.d([III)V")
    public void method2116(int[] arg0, int arg1, int arg2) {
        for (class114 var4 = (class114) this.field1305.method4540(); var4 != null; var4 = (class114) this.field1305.method4533()) {
            var4.method2481(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("cy.c(I)V")
    public final synchronized void method2111(int arg0) {
        do {
            if (this.field1307 < 0) {
                this.method2118(arg0);
                return;
            }
            if (this.field1306 + arg0 < this.field1307) {
                this.field1306 += arg0;
                this.method2118(arg0);
                return;
            }
            int var2 = this.field1307 - this.field1306;
            this.method2118(var2);
            arg0 -= var2;
            this.field1306 += var2;
            this.method2110();
            class109 var3 = (class109) this.field1304.method4540();
            synchronized (var3) {
                int var5 = var3.method2307(this);
                if (var5 < 0) {
                    var3.field1411 = 0;
                    this.method2112(var3);
                } else {
                    var3.field1411 = var5;
                    this.method2119(var3.field2323, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("cy.o(I)V")
    public void method2118(int arg0) {
        for (class114 var2 = (class114) this.field1305.method4540(); var2 != null; var2 = (class114) this.field1305.method4533()) {
            var2.method2111(arg0);
        }
    }
}
