package deob;

import java.util.Iterator;

@ObfuscatedName("dg")
public class class98 implements Iterable {

    @ObfuscatedName("dg.ae")
    public class104 field1205;

    @ObfuscatedName("dg.ag")
    public final class523 field1203 = new class523(16);

    @ObfuscatedName("dg.ac(IIII)Ldd;")
    public class104 method2492(int arg0, int arg1, int arg2) {
        this.field1205 = this.method2493(-1, arg0, arg1, arg2, class233.field2471);
        this.field1203.method8663(this.field1205, -1L);
        return this.field1205;
    }

    @ObfuscatedName("dg.ae(IIIILin;I)Ldd;")
    public class104 method2493(int arg0, int arg1, int arg2, int arg3, class233 arg4) {
        class104 var6 = new class104(arg0, arg1, arg2, arg3, arg4);
        this.field1203.method8663(var6, (long) arg0);
        return var6;
    }

    @ObfuscatedName("dg.ag(Ldd;I)V")
    public void method2491(class104 arg0) {
        if (arg0 != null) {
            arg0.method8362();
        }
    }

    public Iterator iterator() {
        return this.field1203.iterator();
    }

    @ObfuscatedName("dg.am(S)V")
    public void method2495() {
        this.field1205.method2723();
        this.field1203.method8664();
        this.field1203.method8663(this.field1205, -1L);
    }
}
