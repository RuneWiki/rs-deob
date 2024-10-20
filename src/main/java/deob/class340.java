package deob;

import java.util.Iterator;

@ObfuscatedName("ms")
public class class340 implements Iterable {

    @ObfuscatedName("ms.s")
    public class406 field4137 = new class406();

    @ObfuscatedName("ms.h")
    public class406 field4138;

    public class340() {
        this.field4137.field4461 = this.field4137;
        this.field4137.field4462 = this.field4137;
    }

    @ObfuscatedName("ms.s()V")
    public void method5568() {
        while (this.field4137.field4461 != this.field4137) {
            this.field4137.field4461.method6406();
        }
    }

    @ObfuscatedName("ms.h(Loa;)V")
    public void method5569(class406 arg0) {
        if (arg0.field4462 != null) {
            arg0.method6406();
        }
        arg0.field4462 = this.field4137.field4462;
        arg0.field4461 = this.field4137;
        arg0.field4462.field4461 = arg0;
        arg0.field4461.field4462 = arg0;
    }

    @ObfuscatedName("ms.w(Loa;Loa;)V")
    public static void method5572(class406 arg0, class406 arg1) {
        if (arg0.field4462 != null) {
            arg0.method6406();
        }
        arg0.field4462 = arg1;
        arg0.field4461 = arg1.field4461;
        arg0.field4462.field4461 = arg0;
        arg0.field4461.field4462 = arg0;
    }

    @ObfuscatedName("ms.v()Loa;")
    public class406 method5586() {
        class406 var1 = this.field4137.field4461;
        if (this.field4137 == var1) {
            return null;
        } else {
            var1.method6406();
            return var1;
        }
    }

    @ObfuscatedName("ms.c()Loa;")
    public class406 method5567() {
        return this.method5571((class406) null);
    }

    @ObfuscatedName("ms.q(Loa;)Loa;")
    public class406 method5571(class406 arg0) {
        class406 var2;
        if (arg0 == null) {
            var2 = this.field4137.field4461;
        } else {
            var2 = arg0;
        }
        if (this.field4137 == var2) {
            this.field4138 = null;
            return null;
        } else {
            this.field4138 = var2.field4461;
            return var2;
        }
    }

    @ObfuscatedName("ms.i()Loa;")
    public class406 method5574() {
        class406 var1 = this.field4138;
        if (this.field4137 == var1) {
            this.field4138 = null;
            return null;
        } else {
            this.field4138 = var1.field4461;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class339(this);
    }
}
