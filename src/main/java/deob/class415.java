package deob;

import java.util.Iterator;

@ObfuscatedName("pq")
public class class415 implements Iterable {

    @ObfuscatedName("pq.ac")
    public class504 field4689 = new class504();

    @ObfuscatedName("pq.ae")
    public class504 field4688;

    public class415() {
        this.field4689.field5115 = this.field4689;
        this.field4689.field5117 = this.field4689;
    }

    @ObfuscatedName("pq.ac()V")
    public void method7165() {
        while (this.field4689.field5115 != this.field4689) {
            this.field4689.field5115.method8359();
        }
    }

    @ObfuscatedName("pq.ae(Ltr;)V")
    public void method7157(class504 arg0) {
        if (arg0.field5117 != null) {
            arg0.method8359();
        }
        arg0.field5117 = this.field4689.field5117;
        arg0.field5115 = this.field4689;
        arg0.field5117.field5115 = arg0;
        arg0.field5115.field5117 = arg0;
    }

    @ObfuscatedName("pq.ag(Ltr;Ltr;)V")
    public static void method7158(class504 arg0, class504 arg1) {
        if (arg0.field5117 != null) {
            arg0.method8359();
        }
        arg0.field5117 = arg1;
        arg0.field5115 = arg1.field5115;
        arg0.field5117.field5115 = arg0;
        arg0.field5115.field5117 = arg0;
    }

    @ObfuscatedName("pq.am()Ltr;")
    public class504 method7163() {
        class504 var1 = this.field4689.field5115;
        if (this.field4689 == var1) {
            return null;
        } else {
            var1.method8359();
            return var1;
        }
    }

    @ObfuscatedName("pq.ax()Ltr;")
    public class504 method7173() {
        return this.method7161((class504) null);
    }

    @ObfuscatedName("pq.aq(Ltr;)Ltr;")
    public class504 method7161(class504 arg0) {
        class504 var2;
        if (arg0 == null) {
            var2 = this.field4689.field5115;
        } else {
            var2 = arg0;
        }
        if (this.field4689 == var2) {
            this.field4688 = null;
            return null;
        } else {
            this.field4688 = var2.field5115;
            return var2;
        }
    }

    @ObfuscatedName("pq.af()Ltr;")
    public class504 method7155() {
        class504 var1 = this.field4688;
        if (this.field4689 == var1) {
            this.field4688 = null;
            return null;
        } else {
            this.field4688 = var1.field5115;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class414(this);
    }
}
