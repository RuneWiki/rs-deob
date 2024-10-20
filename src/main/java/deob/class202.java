package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public class class202 implements Iterable {

    @ObfuscatedName("gu.m")
    public class208 field3081 = new class208();

    public class202() {
        this.field3081.field3094 = this.field3081;
        this.field3081.field3093 = this.field3081;
    }

    @ObfuscatedName("gu.m(Lgs;)V")
    public void method3661(class208 arg0) {
        if (arg0.field3093 != null) {
            arg0.method3702();
        }
        arg0.field3093 = this.field3081.field3093;
        arg0.field3094 = this.field3081;
        arg0.field3093.field3094 = arg0;
        arg0.field3094.field3093 = arg0;
    }

    @ObfuscatedName("gu.l()Lgs;")
    public class208 method3662() {
        return this.method3656((class208) null);
    }

    @ObfuscatedName("gu.y(Lgs;)Lgs;")
    public class208 method3656(class208 arg0) {
        class208 var2;
        if (arg0 == null) {
            var2 = this.field3081.field3094;
        } else {
            var2 = arg0;
        }
        return this.field3081 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class205(this);
    }
}
