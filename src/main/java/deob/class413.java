package deob;

import java.util.Iterator;

@ObfuscatedName("pz")
public class class413 implements Iterable {

    @ObfuscatedName("pz.ab")
    public class502 field4638 = new class502();

    @ObfuscatedName("pz.ay")
    public class502 field4637;

    public class413() {
        this.field4638.field5068 = this.field4638;
        this.field4638.field5069 = this.field4638;
    }

    @ObfuscatedName("pz.ab()V")
    public void method7029() {
        while (this.field4638.field5068 != this.field4638) {
            this.field4638.field5068.method8217();
        }
    }

    @ObfuscatedName("pz.ay(Lta;)V")
    public void method7043(class502 arg0) {
        if (arg0.field5069 != null) {
            arg0.method8217();
        }
        arg0.field5069 = this.field4638.field5069;
        arg0.field5068 = this.field4638;
        arg0.field5069.field5068 = arg0;
        arg0.field5068.field5069 = arg0;
    }

    @ObfuscatedName("pz.an(Lta;Lta;)V")
    public static void method7031(class502 arg0, class502 arg1) {
        if (arg0.field5069 != null) {
            arg0.method8217();
        }
        arg0.field5069 = arg1;
        arg0.field5068 = arg1.field5068;
        arg0.field5069.field5068 = arg0;
        arg0.field5068.field5069 = arg0;
    }

    @ObfuscatedName("pz.au()Lta;")
    public class502 method7032() {
        class502 var1 = this.field4638.field5068;
        if (this.field4638 == var1) {
            return null;
        } else {
            var1.method8217();
            return var1;
        }
    }

    @ObfuscatedName("pz.ax()Lta;")
    public class502 method7033() {
        return this.method7034((class502) null);
    }

    @ObfuscatedName("pz.ao(Lta;)Lta;")
    public class502 method7034(class502 arg0) {
        class502 var2;
        if (arg0 == null) {
            var2 = this.field4638.field5068;
        } else {
            var2 = arg0;
        }
        if (this.field4638 == var2) {
            this.field4637 = null;
            return null;
        } else {
            this.field4637 = var2.field5068;
            return var2;
        }
    }

    @ObfuscatedName("pz.am()Lta;")
    public class502 method7035() {
        class502 var1 = this.field4637;
        if (this.field4638 == var1) {
            this.field4637 = null;
            return null;
        } else {
            this.field4637 = var1.field5068;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class412(this);
    }
}
