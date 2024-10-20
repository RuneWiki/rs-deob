package deob;

import java.util.Iterator;

@ObfuscatedName("gg")
public class class206 implements Iterable {

    @ObfuscatedName("gg.a")
    public class212 field3158 = new class212();

    @ObfuscatedName("gg.d")
    public class212 field3157;

    public class206() {
        this.field3158.field3170 = this.field3158;
        this.field3158.field3172 = this.field3158;
    }

    @ObfuscatedName("gg.a(Lhr;)V")
    public void method3661(class212 arg0) {
        if (arg0.field3172 != null) {
            arg0.method3729();
        }
        arg0.field3172 = this.field3158.field3172;
        arg0.field3170 = this.field3158;
        arg0.field3172.field3170 = arg0;
        arg0.field3170.field3172 = arg0;
    }

    @ObfuscatedName("gg.d(Lhr;)V")
    public void method3680(class212 arg0) {
        if (arg0.field3172 != null) {
            arg0.method3729();
        }
        arg0.field3172 = this.field3158;
        arg0.field3170 = this.field3158.field3170;
        arg0.field3172.field3170 = arg0;
        arg0.field3170.field3172 = arg0;
    }

    @ObfuscatedName("gg.v(Lhr;Lhr;)V")
    public static void method3663(class212 arg0, class212 arg1) {
        if (arg0.field3172 != null) {
            arg0.method3729();
        }
        arg0.field3172 = arg1;
        arg0.field3170 = arg1.field3170;
        arg0.field3172.field3170 = arg0;
        arg0.field3170.field3172 = arg0;
    }

    @ObfuscatedName("gg.r()Lhr;")
    public class212 method3664() {
        return this.method3665((class212) null);
    }

    @ObfuscatedName("gg.z(Lhr;)Lhr;")
    public class212 method3665(class212 arg0) {
        class212 var2;
        if (arg0 == null) {
            var2 = this.field3158.field3170;
        } else {
            var2 = arg0;
        }
        if (this.field3158 == var2) {
            this.field3157 = null;
            return null;
        } else {
            this.field3157 = var2.field3170;
            return var2;
        }
    }

    @ObfuscatedName("gg.t()Lhr;")
    public class212 method3666() {
        class212 var1 = this.field3157;
        if (this.field3158 == var1) {
            this.field3157 = null;
            return null;
        } else {
            this.field3157 = var1.field3170;
            return var1;
        }
    }

    @ObfuscatedName("gg.n()Z")
    public boolean method3672() {
        return this.field3158.field3170 == this.field3158;
    }

    public Iterator iterator() {
        return new class209(this);
    }
}
