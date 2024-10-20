package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("jm")
public class class261 implements Iterable, Collection {

    @ObfuscatedName("jm.a")
    public class181 field3526 = new class181();

    @ObfuscatedName("jm.t")
    public class181 field3525;

    public class261() {
        this.field3526.field2090 = this.field3526;
        this.field3526.field2089 = this.field3526;
    }

    @ObfuscatedName("jm.a()V")
    public void method4500() {
        while (this.field3526.field2090 != this.field3526) {
            this.field3526.field2090.method3386();
        }
    }

    @ObfuscatedName("jm.t(Lfd;)V")
    public void method4501(class181 arg0) {
        if (arg0.field2089 != null) {
            arg0.method3386();
        }
        arg0.field2089 = this.field3526.field2089;
        arg0.field2090 = this.field3526;
        arg0.field2089.field2090 = arg0;
        arg0.field2090.field2089 = arg0;
    }

    @ObfuscatedName("jm.n(Lfd;)V")
    public void method4502(class181 arg0) {
        if (arg0.field2089 != null) {
            arg0.method3386();
        }
        arg0.field2089 = this.field3526;
        arg0.field2090 = this.field3526.field2090;
        arg0.field2089.field2090 = arg0;
        arg0.field2090.field2089 = arg0;
    }

    @ObfuscatedName("jm.q(Lfd;Lfd;)V")
    public static void method4503(class181 arg0, class181 arg1) {
        if (arg0.field2089 != null) {
            arg0.method3386();
        }
        arg0.field2089 = arg1;
        arg0.field2090 = arg1.field2090;
        arg0.field2089.field2090 = arg0;
        arg0.field2090.field2089 = arg0;
    }

    @ObfuscatedName("jm.v()Lfd;")
    public class181 method4509() {
        return this.method4505((class181) null);
    }

    @ObfuscatedName("jm.l(Lfd;)Lfd;")
    public class181 method4505(class181 arg0) {
        class181 var2;
        if (arg0 == null) {
            var2 = this.field3526.field2090;
        } else {
            var2 = arg0;
        }
        if (this.field3526 == var2) {
            this.field3525 = null;
            return null;
        } else {
            this.field3525 = var2.field2090;
            return var2;
        }
    }

    @ObfuscatedName("jm.c()Lfd;")
    public class181 method4506() {
        class181 var1 = this.field3525;
        if (this.field3526 == var1) {
            this.field3525 = null;
            return null;
        } else {
            this.field3525 = var1.field2090;
            return var1;
        }
    }

    @ObfuscatedName("jm.o()I")
    public int method4507() {
        int var1 = 0;
        for (class181 var2 = this.field3526.field2090; var2 != this.field3526; var2 = var2.field2090) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("jm.i()Z")
    public boolean method4555() {
        return this.field3526.field2090 == this.field3526;
    }

    @ObfuscatedName("jm.d()[Lfd;")
    public class181[] method4512() {
        class181[] var1 = new class181[this.method4507()];
        int var2 = 0;
        for (class181 var3 = this.field3526.field2090; var3 != this.field3526; var3 = var3.field2090) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class265(this);
    }

    public int size() {
        return this.method4507();
    }

    public boolean isEmpty() {
        return this.method4555();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method4512();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class181 var3 = this.field3526.field2090; var3 != this.field3526; var3 = var3.field2090) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("jm.m(Lfd;)Z")
    public boolean method4514(class181 arg0) {
        this.method4501(arg0);
        return true;
    }

    public boolean remove(Object arg0) {
        throw new RuntimeException();
    }

    public boolean containsAll(Collection arg0) {
        throw new RuntimeException();
    }

    public boolean addAll(Collection arg0) {
        throw new RuntimeException();
    }

    public boolean removeAll(Collection arg0) {
        throw new RuntimeException();
    }

    public boolean retainAll(Collection arg0) {
        throw new RuntimeException();
    }

    public void clear() {
        this.method4500();
    }

    public boolean add(Object arg0) {
        return this.method4514((class181) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
