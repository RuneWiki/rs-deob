package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("jp")
public class class261 implements Iterable, Collection {

    @ObfuscatedName("jp.s")
    public class181 field3513 = new class181();

    @ObfuscatedName("jp.j")
    public class181 field3512;

    public class261() {
        this.field3513.field2097 = this.field3513;
        this.field3513.field2095 = this.field3513;
    }

    @ObfuscatedName("jp.s()V")
    public void method4405() {
        while (this.field3513.field2097 != this.field3513) {
            this.field3513.field2097.method3304();
        }
    }

    @ObfuscatedName("jp.j(Lfb;)V")
    public void method4465(class181 arg0) {
        if (arg0.field2095 != null) {
            arg0.method3304();
        }
        arg0.field2095 = this.field3513.field2095;
        arg0.field2097 = this.field3513;
        arg0.field2095.field2097 = arg0;
        arg0.field2097.field2095 = arg0;
    }

    @ObfuscatedName("jp.i(Lfb;)V")
    public void method4407(class181 arg0) {
        if (arg0.field2095 != null) {
            arg0.method3304();
        }
        arg0.field2095 = this.field3513;
        arg0.field2097 = this.field3513.field2097;
        arg0.field2095.field2097 = arg0;
        arg0.field2097.field2095 = arg0;
    }

    @ObfuscatedName("jp.k(Lfb;Lfb;)V")
    public static void method4408(class181 arg0, class181 arg1) {
        if (arg0.field2095 != null) {
            arg0.method3304();
        }
        arg0.field2095 = arg1;
        arg0.field2097 = arg1.field2097;
        arg0.field2095.field2097 = arg0;
        arg0.field2097.field2095 = arg0;
    }

    @ObfuscatedName("jp.u()Lfb;")
    public class181 method4426() {
        return this.method4409((class181) null);
    }

    @ObfuscatedName("jp.n(Lfb;)Lfb;")
    public class181 method4409(class181 arg0) {
        class181 var2;
        if (arg0 == null) {
            var2 = this.field3513.field2097;
        } else {
            var2 = arg0;
        }
        if (this.field3513 == var2) {
            this.field3512 = null;
            return null;
        } else {
            this.field3512 = var2.field2097;
            return var2;
        }
    }

    @ObfuscatedName("jp.t()Lfb;")
    public class181 method4410() {
        class181 var1 = this.field3512;
        if (this.field3513 == var1) {
            this.field3512 = null;
            return null;
        } else {
            this.field3512 = var1.field2097;
            return var1;
        }
    }

    @ObfuscatedName("jp.q()I")
    public int method4411() {
        int var1 = 0;
        for (class181 var2 = this.field3513.field2097; var2 != this.field3513; var2 = var2.field2097) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("jp.x()Z")
    public boolean method4412() {
        return this.field3513.field2097 == this.field3513;
    }

    @ObfuscatedName("jp.d()[Lfb;")
    public class181[] method4413() {
        class181[] var1 = new class181[this.method4411()];
        int var2 = 0;
        for (class181 var3 = this.field3513.field2097; var3 != this.field3513; var3 = var3.field2097) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class265(this);
    }

    public int size() {
        return this.method4411();
    }

    public boolean isEmpty() {
        return this.method4412();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method4413();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class181 var3 = this.field3513.field2097; var3 != this.field3513; var3 = var3.field2097) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("jp.f(Lfb;)Z")
    public boolean method4418(class181 arg0) {
        this.method4465(arg0);
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
        this.method4405();
    }

    public boolean add(Object arg0) {
        return this.method4418((class181) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
