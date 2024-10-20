package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("lo")
public class class337 implements Iterable, Collection {

    @ObfuscatedName("lo.o")
    public class411 field4148 = new class411();

    @ObfuscatedName("lo.q")
    public class411 field4147;

    public class337() {
        this.field4148.field4467 = this.field4148;
        this.field4148.field4466 = this.field4148;
    }

    @ObfuscatedName("lo.o()V")
    public void method5491() {
        while (this.field4148.field4467 != this.field4148) {
            this.field4148.field4467.method6399();
        }
    }

    @ObfuscatedName("lo.q(Los;)V")
    public void method5493(class411 arg0) {
        if (arg0.field4466 != null) {
            arg0.method6399();
        }
        arg0.field4466 = this.field4148.field4466;
        arg0.field4467 = this.field4148;
        arg0.field4466.field4467 = arg0;
        arg0.field4467.field4466 = arg0;
    }

    @ObfuscatedName("lo.l(Los;)V")
    public void method5471(class411 arg0) {
        if (arg0.field4466 != null) {
            arg0.method6399();
        }
        arg0.field4466 = this.field4148;
        arg0.field4467 = this.field4148.field4467;
        arg0.field4466.field4467 = arg0;
        arg0.field4467.field4466 = arg0;
    }

    @ObfuscatedName("lo.k(Los;Los;)V")
    public static void method5472(class411 arg0, class411 arg1) {
        if (arg0.field4466 != null) {
            arg0.method6399();
        }
        arg0.field4466 = arg1;
        arg0.field4467 = arg1.field4467;
        arg0.field4466.field4467 = arg0;
        arg0.field4467.field4466 = arg0;
    }

    @ObfuscatedName("lo.a()Los;")
    public class411 method5479() {
        return this.method5498((class411) null);
    }

    @ObfuscatedName("lo.m(Los;)Los;")
    public class411 method5498(class411 arg0) {
        class411 var2;
        if (arg0 == null) {
            var2 = this.field4148.field4467;
        } else {
            var2 = arg0;
        }
        if (this.field4148 == var2) {
            this.field4147 = null;
            return null;
        } else {
            this.field4147 = var2.field4467;
            return var2;
        }
    }

    @ObfuscatedName("lo.p()Los;")
    public class411 method5475() {
        class411 var1 = this.field4147;
        if (this.field4148 == var1) {
            this.field4147 = null;
            return null;
        } else {
            this.field4147 = var1.field4467;
            return var1;
        }
    }

    @ObfuscatedName("lo.s()I")
    public int method5476() {
        int var1 = 0;
        for (class411 var2 = this.field4148.field4467; var2 != this.field4148; var2 = var2.field4467) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("lo.r()Z")
    public boolean method5495() {
        return this.field4148.field4467 == this.field4148;
    }

    @ObfuscatedName("lo.v()[Los;")
    public class411[] method5506() {
        class411[] var1 = new class411[this.method5476()];
        int var2 = 0;
        for (class411 var3 = this.field4148.field4467; var3 != this.field4148; var3 = var3.field4467) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class336(this);
    }

    public int size() {
        return this.method5476();
    }

    public boolean isEmpty() {
        return this.method5495();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method5506();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class411 var3 = this.field4148.field4467; var3 != this.field4148; var3 = var3.field4467) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("lo.y(Los;)Z")
    public boolean method5482(class411 arg0) {
        this.method5493(arg0);
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
        this.method5491();
    }

    public boolean add(Object arg0) {
        return this.method5482((class411) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
