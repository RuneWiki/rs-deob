package deob;

import java.util.Iterator;

@ObfuscatedName("ji")
public class class266 implements Iterable {

    @ObfuscatedName("ji.z")
    public class176 field3535 = new class176();

    @ObfuscatedName("ji.n")
    public class176 field3534;

    public class266() {
        this.field3535.field2086 = this.field3535;
        this.field3535.field2087 = this.field3535;
    }

    @ObfuscatedName("ji.z()V")
    public void method4500() {
        while (this.field3535.field2086 != this.field3535) {
            this.field3535.field2086.method3240();
        }
    }

    @ObfuscatedName("ji.n(Lfw;)V")
    public void method4507(class176 arg0) {
        if (arg0.field2087 != null) {
            arg0.method3240();
        }
        arg0.field2087 = this.field3535.field2087;
        arg0.field2086 = this.field3535;
        arg0.field2087.field2086 = arg0;
        arg0.field2086.field2087 = arg0;
    }

    @ObfuscatedName("ji.v(Lfw;Lfw;)V")
    public static void method4502(class176 arg0, class176 arg1) {
        if (arg0.field2087 != null) {
            arg0.method3240();
        }
        arg0.field2087 = arg1;
        arg0.field2086 = arg1.field2086;
        arg0.field2087.field2086 = arg0;
        arg0.field2086.field2087 = arg0;
    }

    @ObfuscatedName("ji.u()Lfw;")
    public class176 method4523() {
        class176 var1 = this.field3535.field2086;
        if (this.field3535 == var1) {
            return null;
        } else {
            var1.method3240();
            return var1;
        }
    }

    @ObfuscatedName("ji.r()Lfw;")
    public class176 method4501() {
        return this.method4504((class176) null);
    }

    @ObfuscatedName("ji.p(Lfw;)Lfw;")
    public class176 method4504(class176 arg0) {
        class176 var2;
        if (arg0 == null) {
            var2 = this.field3535.field2086;
        } else {
            var2 = arg0;
        }
        if (this.field3535 == var2) {
            this.field3534 = null;
            return null;
        } else {
            this.field3534 = var2.field2086;
            return var2;
        }
    }

    @ObfuscatedName("ji.q()Lfw;")
    public class176 method4505() {
        class176 var1 = this.field3534;
        if (this.field3535 == var1) {
            this.field3534 = null;
            return null;
        } else {
            this.field3534 = var1.field2086;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class264(this);
    }
}
