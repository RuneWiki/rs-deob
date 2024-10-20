package deob;

import java.util.Iterator;

@ObfuscatedName("gj")
public class class206 implements Iterable {

    @ObfuscatedName("gj.x")
    public class212 field3161 = new class212();

    @ObfuscatedName("gj.r")
    public class212 field3160;

    public class206() {
        this.field3161.field3175 = this.field3161;
        this.field3161.field3173 = this.field3161;
    }

    @ObfuscatedName("gj.x(Lhn;)V")
    public void method3633(class212 arg0) {
        if (arg0.field3173 != null) {
            arg0.method3695();
        }
        arg0.field3173 = this.field3161.field3173;
        arg0.field3175 = this.field3161;
        arg0.field3173.field3175 = arg0;
        arg0.field3175.field3173 = arg0;
    }

    @ObfuscatedName("gj.r(Lhn;)V")
    public void method3634(class212 arg0) {
        if (arg0.field3173 != null) {
            arg0.method3695();
        }
        arg0.field3173 = this.field3161;
        arg0.field3175 = this.field3161.field3175;
        arg0.field3173.field3175 = arg0;
        arg0.field3175.field3173 = arg0;
    }

    @ObfuscatedName("gj.j(Lhn;Lhn;)V")
    public static void method3635(class212 arg0, class212 arg1) {
        if (arg0.field3173 != null) {
            arg0.method3695();
        }
        arg0.field3173 = arg1;
        arg0.field3175 = arg1.field3175;
        arg0.field3173.field3175 = arg0;
        arg0.field3175.field3173 = arg0;
    }

    @ObfuscatedName("gj.z()Lhn;")
    public class212 method3647() {
        return this.method3637((class212) null);
    }

    @ObfuscatedName("gj.i(Lhn;)Lhn;")
    public class212 method3637(class212 arg0) {
        class212 var2;
        if (arg0 == null) {
            var2 = this.field3161.field3175;
        } else {
            var2 = arg0;
        }
        if (this.field3161 == var2) {
            this.field3160 = null;
            return null;
        } else {
            this.field3160 = var2.field3175;
            return var2;
        }
    }

    @ObfuscatedName("gj.b()Lhn;")
    public class212 method3632() {
        class212 var1 = this.field3160;
        if (this.field3161 == var1) {
            this.field3160 = null;
            return null;
        } else {
            this.field3160 = var1.field3175;
            return var1;
        }
    }

    @ObfuscatedName("gj.l()Z")
    public boolean method3639() {
        return this.field3161.field3175 == this.field3161;
    }

    public Iterator iterator() {
        return new class209(this);
    }
}
