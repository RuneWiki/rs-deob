package deob;

import java.util.Iterator;

@ObfuscatedName("hb")
public class class228 implements Iterable {

    @ObfuscatedName("hb.c")
    public class219 field2667 = new class219();

    @ObfuscatedName("hb.i")
    public class219 field2666;

    public class228() {
        this.field2667.field2649 = this.field2667;
        this.field2667.field2650 = this.field2667;
    }

    @ObfuscatedName("hb.c()V")
    public void method3783() {
        while (this.field2667.field2649 != this.field2667) {
            this.field2667.field2649.method3747();
        }
    }

    @ObfuscatedName("hb.i(Lhv;)V")
    public void method3782(class219 arg0) {
        if (arg0.field2650 != null) {
            arg0.method3747();
        }
        arg0.field2650 = this.field2667.field2650;
        arg0.field2649 = this.field2667;
        arg0.field2650.field2649 = arg0;
        arg0.field2649.field2650 = arg0;
    }

    @ObfuscatedName("hb.o()Lhv;")
    public class219 method3789() {
        class219 var1 = this.field2667.field2649;
        if (this.field2667 == var1) {
            return null;
        } else {
            var1.method3747();
            return var1;
        }
    }

    @ObfuscatedName("hb.j()Lhv;")
    public class219 method3786() {
        return this.method3787((class219) null);
    }

    @ObfuscatedName("hb.k(Lhv;)Lhv;")
    public class219 method3787(class219 arg0) {
        class219 var2;
        if (arg0 == null) {
            var2 = this.field2667.field2649;
        } else {
            var2 = arg0;
        }
        if (this.field2667 == var2) {
            this.field2666 = null;
            return null;
        } else {
            this.field2666 = var2.field2649;
            return var2;
        }
    }

    @ObfuscatedName("hb.x()Lhv;")
    public class219 method3784() {
        class219 var1 = this.field2666;
        if (this.field2667 == var1) {
            this.field2666 = null;
            return null;
        } else {
            this.field2666 = var1.field2649;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class227(this);
    }
}
