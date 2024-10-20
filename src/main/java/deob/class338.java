package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("lz")
public class class338 implements Iterable, Collection {

    @ObfuscatedName("lz.c")
    public class412 field4173 = new class412();

    @ObfuscatedName("lz.p")
    public class412 field4172;

    public class338() {
        this.field4173.field4505 = this.field4173;
        this.field4173.field4506 = this.field4173;
    }

    @ObfuscatedName("lz.c()V")
    public void method5690() {
        while (this.field4173.field4505 != this.field4173) {
            this.field4173.field4505.method6657();
        }
    }

    @ObfuscatedName("lz.p(Lov;)V")
    public void method5704(class412 arg0) {
        if (arg0.field4506 != null) {
            arg0.method6657();
        }
        arg0.field4506 = this.field4173.field4506;
        arg0.field4505 = this.field4173;
        arg0.field4506.field4505 = arg0;
        arg0.field4505.field4506 = arg0;
    }

    @ObfuscatedName("lz.f(Lov;)V")
    public void method5723(class412 arg0) {
        if (arg0.field4506 != null) {
            arg0.method6657();
        }
        arg0.field4506 = this.field4173;
        arg0.field4505 = this.field4173.field4505;
        arg0.field4506.field4505 = arg0;
        arg0.field4505.field4506 = arg0;
    }

    @ObfuscatedName("lz.n(Lov;Lov;)V")
    public static void method5711(class412 arg0, class412 arg1) {
        if (arg0.field4506 != null) {
            arg0.method6657();
        }
        arg0.field4506 = arg1;
        arg0.field4505 = arg1.field4505;
        arg0.field4506.field4505 = arg0;
        arg0.field4505.field4506 = arg0;
    }

    @ObfuscatedName("lz.k()Lov;")
    public class412 method5708() {
        return this.method5694((class412) null);
    }

    @ObfuscatedName("lz.w(Lov;)Lov;")
    public class412 method5694(class412 arg0) {
        class412 var2;
        if (arg0 == null) {
            var2 = this.field4173.field4505;
        } else {
            var2 = arg0;
        }
        if (this.field4173 == var2) {
            this.field4172 = null;
            return null;
        } else {
            this.field4172 = var2.field4505;
            return var2;
        }
    }

    @ObfuscatedName("lz.s()Lov;")
    public class412 method5695() {
        class412 var1 = this.field4172;
        if (this.field4173 == var1) {
            this.field4172 = null;
            return null;
        } else {
            this.field4172 = var1.field4505;
            return var1;
        }
    }

    @ObfuscatedName("lz.q()I")
    public int method5696() {
        int var1 = 0;
        for (class412 var2 = this.field4173.field4505; var2 != this.field4173; var2 = var2.field4505) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("lz.m()Z")
    public boolean method5697() {
        return this.field4173.field4505 == this.field4173;
    }

    @ObfuscatedName("lz.x()[Lov;")
    public class412[] method5752() {
        class412[] var1 = new class412[this.method5696()];
        int var2 = 0;
        for (class412 var3 = this.field4173.field4505; var3 != this.field4173; var3 = var3.field4505) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class337(this);
    }

    public int size() {
        return this.method5696();
    }

    public boolean isEmpty() {
        return this.method5697();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method5752();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class412 var3 = this.field4173.field4505; var3 != this.field4173; var3 = var3.field4505) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("lz.j(Lov;)Z")
    public boolean method5698(class412 arg0) {
        this.method5704(arg0);
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
        this.method5690();
    }

    public boolean add(Object arg0) {
        return this.method5698((class412) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
