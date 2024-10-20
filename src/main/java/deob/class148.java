package deob;

import java.util.Iterator;

@ObfuscatedName("ey")
public class class148 implements Iterable {

    @ObfuscatedName("ey.d")
    public class149 field2031 = new class149();

    @ObfuscatedName("ey.c")
    public class149 field2030;

    public class148() {
        this.field2031.field2032 = this.field2031;
        this.field2031.field2033 = this.field2031;
    }

    @ObfuscatedName("ey.d(Lew;)V")
    public void method2625(class149 arg0) {
        if (arg0.field2033 != null) {
            arg0.method2652();
        }
        arg0.field2033 = this.field2031.field2033;
        arg0.field2032 = this.field2031;
        arg0.field2033.field2032 = arg0;
        arg0.field2032.field2033 = arg0;
    }

    @ObfuscatedName("ey.c(Lew;)V")
    public void method2626(class149 arg0) {
        if (arg0.field2033 != null) {
            arg0.method2652();
        }
        arg0.field2033 = this.field2031;
        arg0.field2032 = this.field2031.field2032;
        arg0.field2033.field2032 = arg0;
        arg0.field2032.field2033 = arg0;
    }

    @ObfuscatedName("ey.n(Lew;Lew;)V")
    public static void method2627(class149 arg0, class149 arg1) {
        if (arg0.field2033 != null) {
            arg0.method2652();
        }
        arg0.field2033 = arg1;
        arg0.field2032 = arg1.field2032;
        arg0.field2033.field2032 = arg0;
        arg0.field2032.field2033 = arg0;
    }

    @ObfuscatedName("ey.q()Lew;")
    public class149 method2628() {
        return this.method2632((class149) null);
    }

    @ObfuscatedName("ey.t(Lew;)Lew;")
    public class149 method2632(class149 arg0) {
        class149 var2;
        if (arg0 == null) {
            var2 = this.field2031.field2032;
        } else {
            var2 = arg0;
        }
        if (this.field2031 == var2) {
            this.field2030 = null;
            return null;
        } else {
            this.field2030 = var2.field2032;
            return var2;
        }
    }

    @ObfuscatedName("ey.p()Lew;")
    public class149 method2629() {
        class149 var1 = this.field2030;
        if (this.field2031 == var1) {
            this.field2030 = null;
            return null;
        } else {
            this.field2030 = var1.field2032;
            return var1;
        }
    }

    @ObfuscatedName("ey.u()Z")
    public boolean method2631() {
        return this.field2031.field2032 == this.field2031;
    }

    public Iterator iterator() {
        return new class145(this);
    }
}
