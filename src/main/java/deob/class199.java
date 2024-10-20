package deob;

import java.util.Iterator;

@ObfuscatedName("gl")
public class class199 implements Iterable {

    @ObfuscatedName("gl.d")
    public class200 field2562 = new class200();

    @ObfuscatedName("gl.x")
    public class200 field2563;

    public class199() {
        this.field2562.field2565 = this.field2562;
        this.field2562.field2566 = this.field2562;
    }

    @ObfuscatedName("gl.d()V")
    public void method3448() {
        while (this.field2562.field2565 != this.field2562) {
            this.field2562.field2565.method3475();
        }
    }

    @ObfuscatedName("gl.x(Lgf;)V")
    public void method3455(class200 arg0) {
        if (arg0.field2566 != null) {
            arg0.method3475();
        }
        arg0.field2566 = this.field2562.field2566;
        arg0.field2565 = this.field2562;
        arg0.field2566.field2565 = arg0;
        arg0.field2565.field2566 = arg0;
    }

    @ObfuscatedName("gl.k(Lgf;)V")
    public void method3457(class200 arg0) {
        if (arg0.field2566 != null) {
            arg0.method3475();
        }
        arg0.field2566 = this.field2562;
        arg0.field2565 = this.field2562.field2565;
        arg0.field2566.field2565 = arg0;
        arg0.field2565.field2566 = arg0;
    }

    @ObfuscatedName("gl.z(Lgf;Lgf;)V")
    public static void method3451(class200 arg0, class200 arg1) {
        if (arg0.field2566 != null) {
            arg0.method3475();
        }
        arg0.field2566 = arg1;
        arg0.field2565 = arg1.field2565;
        arg0.field2566.field2565 = arg0;
        arg0.field2565.field2566 = arg0;
    }

    @ObfuscatedName("gl.v()Lgf;")
    public class200 method3469() {
        class200 var1 = this.field2562.field2565;
        if (this.field2562 == var1) {
            return null;
        } else {
            var1.method3475();
            return var1;
        }
    }

    @ObfuscatedName("gl.m()Lgf;")
    public class200 method3453() {
        return this.method3454((class200) null);
    }

    @ObfuscatedName("gl.b(Lgf;)Lgf;")
    public class200 method3454(class200 arg0) {
        class200 var2;
        if (arg0 == null) {
            var2 = this.field2562.field2565;
        } else {
            var2 = arg0;
        }
        if (this.field2562 == var2) {
            this.field2563 = null;
            return null;
        } else {
            this.field2563 = var2.field2565;
            return var2;
        }
    }

    @ObfuscatedName("gl.t()Lgf;")
    public class200 method3450() {
        class200 var1 = this.field2563;
        if (this.field2562 == var1) {
            this.field2563 = null;
            return null;
        } else {
            this.field2563 = var1.field2565;
            return var1;
        }
    }

    @ObfuscatedName("gl.p()Z")
    public boolean method3456() {
        return this.field2562.field2565 == this.field2562;
    }

    public Iterator iterator() {
        return new class196(this);
    }
}
