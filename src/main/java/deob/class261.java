package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("jm")
public class class261 implements Iterable, Collection {

    @ObfuscatedName("jm.u")
    public class181 field3537 = new class181();

    @ObfuscatedName("jm.f")
    public class181 field3538;

    public class261() {
        this.field3537.field2127 = this.field3537;
        this.field3537.field2128 = this.field3537;
    }

    @ObfuscatedName("jm.u()V")
    public void method4488() {
        while (this.field3537.field2127 != this.field3537) {
            this.field3537.field2127.method3332();
        }
    }

    @ObfuscatedName("jm.f(Lfb;)V")
    public void method4521(class181 arg0) {
        if (arg0.field2128 != null) {
            arg0.method3332();
        }
        arg0.field2128 = this.field3537.field2128;
        arg0.field2127 = this.field3537;
        arg0.field2128.field2127 = arg0;
        arg0.field2127.field2128 = arg0;
    }

    @ObfuscatedName("jm.b(Lfb;)V")
    public void method4487(class181 arg0) {
        if (arg0.field2128 != null) {
            arg0.method3332();
        }
        arg0.field2128 = this.field3537;
        arg0.field2127 = this.field3537.field2127;
        arg0.field2128.field2127 = arg0;
        arg0.field2127.field2128 = arg0;
    }

    @ObfuscatedName("jm.g(Lfb;Lfb;)V")
    public static void method4502(class181 arg0, class181 arg1) {
        if (arg0.field2128 != null) {
            arg0.method3332();
        }
        arg0.field2128 = arg1;
        arg0.field2127 = arg1.field2127;
        arg0.field2128.field2127 = arg0;
        arg0.field2127.field2128 = arg0;
    }

    @ObfuscatedName("jm.z()Lfb;")
    public class181 method4491() {
        return this.method4492((class181) null);
    }

    @ObfuscatedName("jm.p(Lfb;)Lfb;")
    public class181 method4492(class181 arg0) {
        class181 var2;
        if (arg0 == null) {
            var2 = this.field3537.field2127;
        } else {
            var2 = arg0;
        }
        if (this.field3537 == var2) {
            this.field3538 = null;
            return null;
        } else {
            this.field3538 = var2.field2127;
            return var2;
        }
    }

    @ObfuscatedName("jm.h()Lfb;")
    public class181 method4520() {
        class181 var1 = this.field3538;
        if (this.field3537 == var1) {
            this.field3538 = null;
            return null;
        } else {
            this.field3538 = var1.field2127;
            return var1;
        }
    }

    @ObfuscatedName("jm.y()I")
    public int method4494() {
        int var1 = 0;
        for (class181 var2 = this.field3537.field2127; var2 != this.field3537; var2 = var2.field2127) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("jm.w()Z")
    public boolean method4501() {
        return this.field3537.field2127 == this.field3537;
    }

    @ObfuscatedName("jm.i()[Lfb;")
    public class181[] method4496() {
        class181[] var1 = new class181[this.method4494()];
        int var2 = 0;
        for (class181 var3 = this.field3537.field2127; var3 != this.field3537; var3 = var3.field2127) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class265(this);
    }

    public int size() {
        return this.method4494();
    }

    public boolean isEmpty() {
        return this.method4501();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method4496();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class181 var3 = this.field3537.field2127; var3 != this.field3537; var3 = var3.field2127) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("jm.k(Lfb;)Z")
    public boolean method4499(class181 arg0) {
        this.method4521(arg0);
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
        this.method4488();
    }

    public boolean add(Object arg0) {
        return this.method4499((class181) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
