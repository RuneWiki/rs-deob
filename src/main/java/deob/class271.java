package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("jx")
public class class271 implements Iterable, Collection {

    @ObfuscatedName("jx.m")
    public class190 field3565 = new class190();

    @ObfuscatedName("jx.o")
    public class190 field3566;

    public class271() {
        this.field3565.field2153 = this.field3565;
        this.field3565.field2151 = this.field3565;
    }

    @ObfuscatedName("jx.m()V")
    public void method4584() {
        while (this.field3565.field2153 != this.field3565) {
            this.field3565.field2153.method3388();
        }
    }

    @ObfuscatedName("jx.o(Lgr;)V")
    public void method4566(class190 arg0) {
        if (arg0.field2151 != null) {
            arg0.method3388();
        }
        arg0.field2151 = this.field3565.field2151;
        arg0.field2153 = this.field3565;
        arg0.field2151.field2153 = arg0;
        arg0.field2153.field2151 = arg0;
    }

    @ObfuscatedName("jx.q(Lgr;)V")
    public void method4567(class190 arg0) {
        if (arg0.field2151 != null) {
            arg0.method3388();
        }
        arg0.field2151 = this.field3565;
        arg0.field2153 = this.field3565.field2153;
        arg0.field2151.field2153 = arg0;
        arg0.field2153.field2151 = arg0;
    }

    @ObfuscatedName("jx.j(Lgr;Lgr;)V")
    public static void method4568(class190 arg0, class190 arg1) {
        if (arg0.field2151 != null) {
            arg0.method3388();
        }
        arg0.field2151 = arg1;
        arg0.field2153 = arg1.field2153;
        arg0.field2151.field2153 = arg0;
        arg0.field2153.field2151 = arg0;
    }

    @ObfuscatedName("jx.p()Lgr;")
    public class190 method4569() {
        return this.method4628((class190) null);
    }

    @ObfuscatedName("jx.g(Lgr;)Lgr;")
    public class190 method4628(class190 arg0) {
        class190 var2;
        if (arg0 == null) {
            var2 = this.field3565.field2153;
        } else {
            var2 = arg0;
        }
        if (this.field3565 == var2) {
            this.field3566 = null;
            return null;
        } else {
            this.field3566 = var2.field2153;
            return var2;
        }
    }

    @ObfuscatedName("jx.n()Lgr;")
    public class190 method4588() {
        class190 var1 = this.field3566;
        if (this.field3565 == var1) {
            this.field3566 = null;
            return null;
        } else {
            this.field3566 = var1.field2153;
            return var1;
        }
    }

    @ObfuscatedName("jx.u()I")
    public int method4572() {
        int var1 = 0;
        for (class190 var2 = this.field3565.field2153; var2 != this.field3565; var2 = var2.field2153) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("jx.a()Z")
    public boolean method4578() {
        return this.field3565.field2153 == this.field3565;
    }

    @ObfuscatedName("jx.z()[Lgr;")
    public class190[] method4574() {
        class190[] var1 = new class190[this.method4572()];
        int var2 = 0;
        for (class190 var3 = this.field3565.field2153; var3 != this.field3565; var3 = var3.field2153) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class275(this);
    }

    public int size() {
        return this.method4572();
    }

    public boolean isEmpty() {
        return this.method4578();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method4574();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class190 var3 = this.field3565.field2153; var3 != this.field3565; var3 = var3.field2153) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("jx.w(Lgr;)Z")
    public boolean method4576(class190 arg0) {
        this.method4566(arg0);
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
        this.method4584();
    }

    public boolean add(Object arg0) {
        return this.method4576((class190) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
