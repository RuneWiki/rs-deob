package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class199 implements Iterable {

    @ObfuscatedName("go.m")
    public class200 field2560 = new class200();

    @ObfuscatedName("go.p")
    public class200 field2561;

    public class199() {
        this.field2560.field2562 = this.field2560;
        this.field2560.field2564 = this.field2560;
    }

    @ObfuscatedName("go.m()V")
    public void method3448() {
        while (this.field2560.field2562 != this.field2560) {
            this.field2560.field2562.method3476();
        }
    }

    @ObfuscatedName("go.p(Lgh;)V")
    public void method3461(class200 arg0) {
        if (arg0.field2564 != null) {
            arg0.method3476();
        }
        arg0.field2564 = this.field2560.field2564;
        arg0.field2562 = this.field2560;
        arg0.field2564.field2562 = arg0;
        arg0.field2562.field2564 = arg0;
    }

    @ObfuscatedName("go.i(Lgh;)V")
    public void method3452(class200 arg0) {
        if (arg0.field2564 != null) {
            arg0.method3476();
        }
        arg0.field2564 = this.field2560;
        arg0.field2562 = this.field2560.field2562;
        arg0.field2564.field2562 = arg0;
        arg0.field2562.field2564 = arg0;
    }

    @ObfuscatedName("go.j(Lgh;Lgh;)V")
    public static void method3450(class200 arg0, class200 arg1) {
        if (arg0.field2564 != null) {
            arg0.method3476();
        }
        arg0.field2564 = arg1;
        arg0.field2562 = arg1.field2562;
        arg0.field2564.field2562 = arg0;
        arg0.field2562.field2564 = arg0;
    }

    @ObfuscatedName("go.v()Lgh;")
    public class200 method3468() {
        class200 var1 = this.field2560.field2562;
        if (this.field2560 == var1) {
            return null;
        } else {
            var1.method3476();
            return var1;
        }
    }

    @ObfuscatedName("go.x()Lgh;")
    public class200 method3453() {
        return this.method3454((class200) null);
    }

    @ObfuscatedName("go.e(Lgh;)Lgh;")
    public class200 method3454(class200 arg0) {
        class200 var2;
        if (arg0 == null) {
            var2 = this.field2560.field2562;
        } else {
            var2 = arg0;
        }
        if (this.field2560 == var2) {
            this.field2561 = null;
            return null;
        } else {
            this.field2561 = var2.field2562;
            return var2;
        }
    }

    @ObfuscatedName("go.l()Lgh;")
    public class200 method3455() {
        class200 var1 = this.field2561;
        if (this.field2560 == var1) {
            this.field2561 = null;
            return null;
        } else {
            this.field2561 = var1.field2562;
            return var1;
        }
    }

    @ObfuscatedName("go.b()Z")
    public boolean method3456() {
        return this.field2560.field2562 == this.field2560;
    }

    public Iterator iterator() {
        return new class196(this);
    }
}
