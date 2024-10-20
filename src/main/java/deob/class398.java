package deob;

import java.util.Iterator;

@ObfuscatedName("pt")
public class class398 implements Iterable {

    @ObfuscatedName("pt.ac")
    public class484 field4470 = new class484();

    @ObfuscatedName("pt.al")
    public class484 field4471;

    public class398() {
        this.field4470.field4850 = this.field4470;
        this.field4470.field4852 = this.field4470;
    }

    @ObfuscatedName("pt.ac()V")
    public void method6666() {
        while (this.field4470.field4850 != this.field4470) {
            this.field4470.field4850.method7774();
        }
    }

    @ObfuscatedName("pt.al(Lsb;)V")
    public void method6656(class484 arg0) {
        if (arg0.field4852 != null) {
            arg0.method7774();
        }
        arg0.field4852 = this.field4470.field4852;
        arg0.field4850 = this.field4470;
        arg0.field4852.field4850 = arg0;
        arg0.field4850.field4852 = arg0;
    }

    @ObfuscatedName("pt.ak(Lsb;Lsb;)V")
    public static void method6676(class484 arg0, class484 arg1) {
        if (arg0.field4852 != null) {
            arg0.method7774();
        }
        arg0.field4852 = arg1;
        arg0.field4850 = arg1.field4850;
        arg0.field4852.field4850 = arg0;
        arg0.field4850.field4852 = arg0;
    }

    @ObfuscatedName("pt.ax()Lsb;")
    public class484 method6658() {
        class484 var1 = this.field4470.field4850;
        if (this.field4470 == var1) {
            return null;
        } else {
            var1.method7774();
            return var1;
        }
    }

    @ObfuscatedName("pt.ao()Lsb;")
    public class484 method6659() {
        return this.method6655((class484) null);
    }

    @ObfuscatedName("pt.ah(Lsb;)Lsb;")
    public class484 method6655(class484 arg0) {
        class484 var2;
        if (arg0 == null) {
            var2 = this.field4470.field4850;
        } else {
            var2 = arg0;
        }
        if (this.field4470 == var2) {
            this.field4471 = null;
            return null;
        } else {
            this.field4471 = var2.field4850;
            return var2;
        }
    }

    @ObfuscatedName("pt.ar()Lsb;")
    public class484 method6673() {
        class484 var1 = this.field4471;
        if (this.field4470 == var1) {
            this.field4471 = null;
            return null;
        } else {
            this.field4471 = var1.field4850;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class397(this);
    }
}
