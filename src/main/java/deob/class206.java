package deob;

import java.util.Iterator;

@ObfuscatedName("gl")
public class class206 implements Iterable {

    @ObfuscatedName("gl.e")
    public class212 field3150 = new class212();

    @ObfuscatedName("gl.l")
    public class212 field3149;

    public class206() {
        this.field3150.field3163 = this.field3150;
        this.field3150.field3164 = this.field3150;
    }

    @ObfuscatedName("gl.e(Lhs;)V")
    public void method3690(class212 arg0) {
        if (arg0.field3164 != null) {
            arg0.method3755();
        }
        arg0.field3164 = this.field3150.field3164;
        arg0.field3163 = this.field3150;
        arg0.field3164.field3163 = arg0;
        arg0.field3163.field3164 = arg0;
    }

    @ObfuscatedName("gl.l(Lhs;)V")
    public void method3700(class212 arg0) {
        if (arg0.field3164 != null) {
            arg0.method3755();
        }
        arg0.field3164 = this.field3150;
        arg0.field3163 = this.field3150.field3163;
        arg0.field3164.field3163 = arg0;
        arg0.field3163.field3164 = arg0;
    }

    @ObfuscatedName("gl.c(Lhs;Lhs;)V")
    public static void method3692(class212 arg0, class212 arg1) {
        if (arg0.field3164 != null) {
            arg0.method3755();
        }
        arg0.field3164 = arg1;
        arg0.field3163 = arg1.field3163;
        arg0.field3164.field3163 = arg0;
        arg0.field3163.field3164 = arg0;
    }

    @ObfuscatedName("gl.h()Lhs;")
    public class212 method3693() {
        return this.method3696((class212) null);
    }

    @ObfuscatedName("gl.r(Lhs;)Lhs;")
    public class212 method3696(class212 arg0) {
        class212 var2;
        if (arg0 == null) {
            var2 = this.field3150.field3163;
        } else {
            var2 = arg0;
        }
        if (this.field3150 == var2) {
            this.field3149 = null;
            return null;
        } else {
            this.field3149 = var2.field3163;
            return var2;
        }
    }

    @ObfuscatedName("gl.a()Lhs;")
    public class212 method3695() {
        class212 var1 = this.field3149;
        if (this.field3150 == var1) {
            this.field3149 = null;
            return null;
        } else {
            this.field3149 = var1.field3163;
            return var1;
        }
    }

    @ObfuscatedName("gl.b()Z")
    public boolean method3689() {
        return this.field3150.field3163 == this.field3150;
    }

    public Iterator iterator() {
        return new class209(this);
    }
}
