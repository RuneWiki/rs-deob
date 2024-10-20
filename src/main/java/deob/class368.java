package deob;

import java.util.Iterator;

@ObfuscatedName("ox")
public class class368 implements Iterable {

    @ObfuscatedName("ox.af")
    public class444 field4368 = new class444();

    @ObfuscatedName("ox.an")
    public class444 field4367;

    public class368() {
        this.field4368.field4739 = this.field4368;
        this.field4368.field4740 = this.field4368;
    }

    @ObfuscatedName("ox.af()V")
    public void method6463() {
        while (this.field4368.field4739 != this.field4368) {
            this.field4368.field4739.method7640();
        }
    }

    @ObfuscatedName("ox.an(Lrk;)V")
    public void method6480(class444 arg0) {
        if (arg0.field4740 != null) {
            arg0.method7640();
        }
        arg0.field4740 = this.field4368.field4740;
        arg0.field4739 = this.field4368;
        arg0.field4740.field4739 = arg0;
        arg0.field4739.field4740 = arg0;
    }

    @ObfuscatedName("ox.aw(Lrk;Lrk;)V")
    public static void method6484(class444 arg0, class444 arg1) {
        if (arg0.field4740 != null) {
            arg0.method7640();
        }
        arg0.field4740 = arg1;
        arg0.field4739 = arg1.field4739;
        arg0.field4740.field4739 = arg0;
        arg0.field4739.field4740 = arg0;
    }

    @ObfuscatedName("ox.ac()Lrk;")
    public class444 method6469() {
        class444 var1 = this.field4368.field4739;
        if (this.field4368 == var1) {
            return null;
        } else {
            var1.method7640();
            return var1;
        }
    }

    @ObfuscatedName("ox.au()Lrk;")
    public class444 method6467() {
        return this.method6468((class444) null);
    }

    @ObfuscatedName("ox.ab(Lrk;)Lrk;")
    public class444 method6468(class444 arg0) {
        class444 var2;
        if (arg0 == null) {
            var2 = this.field4368.field4739;
        } else {
            var2 = arg0;
        }
        if (this.field4368 == var2) {
            this.field4367 = null;
            return null;
        } else {
            this.field4367 = var2.field4739;
            return var2;
        }
    }

    @ObfuscatedName("ox.aq()Lrk;")
    public class444 method6462() {
        class444 var1 = this.field4367;
        if (this.field4368 == var1) {
            this.field4367 = null;
            return null;
        } else {
            this.field4367 = var1.field4739;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class367(this);
    }
}
