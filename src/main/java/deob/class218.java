package deob;

import java.util.Iterator;

@ObfuscatedName("hf")
public class class218 implements Iterable {

    @ObfuscatedName("hf.g")
    public class209 field2519 = new class209();

    @ObfuscatedName("hf.r")
    public class209 field2520;

    public class218() {
        this.field2519.field2501 = this.field2519;
        this.field2519.field2503 = this.field2519;
    }

    @ObfuscatedName("hf.g()V")
    public void method4021() {
        while (this.field2519.field2501 != this.field2519) {
            this.field2519.field2501.method3989();
        }
    }

    @ObfuscatedName("hf.r(Lhy;)V")
    public void method4027(class209 arg0) {
        if (arg0.field2503 != null) {
            arg0.method3989();
        }
        arg0.field2503 = this.field2519.field2503;
        arg0.field2501 = this.field2519;
        arg0.field2503.field2501 = arg0;
        arg0.field2501.field2503 = arg0;
    }

    @ObfuscatedName("hf.e()Lhy;")
    public class209 method4029() {
        class209 var1 = this.field2519.field2501;
        if (this.field2519 == var1) {
            return null;
        } else {
            var1.method3989();
            return var1;
        }
    }

    @ObfuscatedName("hf.q()Lhy;")
    public class209 method4022() {
        return this.method4023((class209) null);
    }

    @ObfuscatedName("hf.c(Lhy;)Lhy;")
    public class209 method4023(class209 arg0) {
        class209 var2;
        if (arg0 == null) {
            var2 = this.field2519.field2501;
        } else {
            var2 = arg0;
        }
        if (this.field2519 == var2) {
            this.field2520 = null;
            return null;
        } else {
            this.field2520 = var2.field2501;
            return var2;
        }
    }

    @ObfuscatedName("hf.i()Lhy;")
    public class209 method4026() {
        class209 var1 = this.field2520;
        if (this.field2519 == var1) {
            this.field2520 = null;
            return null;
        } else {
            this.field2520 = var1.field2501;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class217(this);
    }
}
