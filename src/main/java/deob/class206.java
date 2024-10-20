package deob;

import java.util.Iterator;

@ObfuscatedName("gr")
public class class206 implements Iterable {

    @ObfuscatedName("gr.i")
    public class212 field3162 = new class212();

    @ObfuscatedName("gr.h")
    public class212 field3161;

    public class206() {
        this.field3162.field3174 = this.field3162;
        this.field3162.field3175 = this.field3162;
    }

    @ObfuscatedName("gr.i(Lhk;)V")
    public void method3630(class212 arg0) {
        if (arg0.field3175 != null) {
            arg0.method3706();
        }
        arg0.field3175 = this.field3162.field3175;
        arg0.field3174 = this.field3162;
        arg0.field3175.field3174 = arg0;
        arg0.field3174.field3175 = arg0;
    }

    @ObfuscatedName("gr.h(Lhk;)V")
    public void method3651(class212 arg0) {
        if (arg0.field3175 != null) {
            arg0.method3706();
        }
        arg0.field3175 = this.field3162;
        arg0.field3174 = this.field3162.field3174;
        arg0.field3175.field3174 = arg0;
        arg0.field3174.field3175 = arg0;
    }

    @ObfuscatedName("gr.e(Lhk;Lhk;)V")
    public static void method3642(class212 arg0, class212 arg1) {
        if (arg0.field3175 != null) {
            arg0.method3706();
        }
        arg0.field3175 = arg1;
        arg0.field3174 = arg1.field3174;
        arg0.field3175.field3174 = arg0;
        arg0.field3174.field3175 = arg0;
    }

    @ObfuscatedName("gr.g()Lhk;")
    public class212 method3633() {
        return this.method3634((class212) null);
    }

    @ObfuscatedName("gr.n(Lhk;)Lhk;")
    public class212 method3634(class212 arg0) {
        class212 var2;
        if (arg0 == null) {
            var2 = this.field3162.field3174;
        } else {
            var2 = arg0;
        }
        if (this.field3162 == var2) {
            this.field3161 = null;
            return null;
        } else {
            this.field3161 = var2.field3174;
            return var2;
        }
    }

    @ObfuscatedName("gr.u()Lhk;")
    public class212 method3635() {
        class212 var1 = this.field3161;
        if (this.field3162 == var1) {
            this.field3161 = null;
            return null;
        } else {
            this.field3161 = var1.field3174;
            return var1;
        }
    }

    @ObfuscatedName("gr.d()Z")
    public boolean method3636() {
        return this.field3162.field3174 == this.field3162;
    }

    public Iterator iterator() {
        return new class209(this);
    }
}
