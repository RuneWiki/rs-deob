package deob;

@ObfuscatedName("az")
public class class160 extends class182 {

    @ObfuscatedName("az.b")
    public int field2391 = 0;

    @ObfuscatedName("az.c")
    public class71 field2390 = new class71();

    @ObfuscatedName("az.i")
    public int field2389 = -1;

    @ObfuscatedName("az.v")
    public class71 field2392 = new class71();

    @ObfuscatedName("az.q([III)V")
    public final synchronized void method548(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2389 < 0) {
                this.method2838(arg0, arg1, arg2);
                return;
            }
            if (this.field2391 + arg2 < this.field2389) {
                this.field2391 += arg2;
                this.method2838(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2389 - this.field2391;
            this.method2838(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2391 += var4;
            this.method2836();
            class119 var5 = (class119) this.field2390.method1104();
            synchronized (var5) {
                int var7 = var5.method2116(this);
                if (var7 < 0) {
                    var5.field1837 = 0;
                    this.method2844(var5);
                } else {
                    var5.field1837 = var7;
                    this.method2837(var5.field77, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("az.c(Lab;)V")
    public final synchronized void method2835(class182 arg0) {
        arg0.method76();
    }

    @ObfuscatedName("az.i()V")
    public void method2836() {
        if (this.field2391 <= 0) {
            return;
        }
        for (class119 var1 = (class119) this.field2390.method1104(); var1 != null; var1 = (class119) this.field2390.method1106()) {
            var1.field1837 -= this.field2391;
        }
        this.field2389 -= this.field2391;
        this.field2391 = 0;
    }

    @ObfuscatedName("az.m(Lfi;Lbp;)V")
    public void method2837(class13 arg0, class119 arg1) {
        while (this.field2390.field1033 != arg0 && ((class119) arg0).field1837 <= arg1.field1837) {
            arg0 = arg0.field77;
        }
        class71.method1101(arg1, arg0);
        this.field2389 = ((class119) this.field2390.field1033.field77).field1837;
    }

    @ObfuscatedName("az.x([III)V")
    public void method2838(int[] arg0, int arg1, int arg2) {
        for (class182 var4 = (class182) this.field2392.method1104(); var4 != null; var4 = (class182) this.field2392.method1106()) {
            var4.method3429(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("az.r()Lab;")
    public class182 method545() {
        return (class182) this.field2392.method1104();
    }

    @ObfuscatedName("az.n()I")
    public int method560() {
        return 0;
    }

    @ObfuscatedName("az.as(I)V")
    public final synchronized void method549(int arg0) {
        do {
            if (this.field2389 < 0) {
                this.method2851(arg0);
                return;
            }
            if (this.field2391 + arg0 < this.field2389) {
                this.field2391 += arg0;
                this.method2851(arg0);
                return;
            }
            int var2 = this.field2389 - this.field2391;
            this.method2851(var2);
            arg0 -= var2;
            this.field2391 += var2;
            this.method2836();
            class119 var3 = (class119) this.field2390.method1104();
            synchronized (var3) {
                int var5 = var3.method2116(this);
                if (var5 < 0) {
                    var3.field1837 = 0;
                    this.method2844(var3);
                } else {
                    var3.field1837 = var5;
                    this.method2837(var3.field77, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("az.v(Lab;)V")
    public final synchronized void method2842(class182 arg0) {
        this.field2392.method1107(arg0);
    }

    @ObfuscatedName("az.z(Lbp;)V")
    public void method2844(class119 arg0) {
        arg0.method76();
        arg0.method2117();
        class13 var2 = this.field2390.field1033.field77;
        if (this.field2390.field1033 == var2) {
            this.field2389 = -1;
        } else {
            this.field2389 = ((class119) var2).field1837;
        }
    }

    @ObfuscatedName("az.d(I)V")
    public void method2851(int arg0) {
        for (class182 var2 = (class182) this.field2392.method1104(); var2 != null; var2 = (class182) this.field2392.method1106()) {
            var2.method549(arg0);
        }
    }

    @ObfuscatedName("az.l()Lab;")
    public class182 method555() {
        return (class182) this.field2392.method1106();
    }
}
