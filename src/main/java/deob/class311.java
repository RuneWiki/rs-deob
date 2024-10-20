package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("kt")
public class class311 implements Iterable, Collection {

    @ObfuscatedName("kt.l")
    public class370 field3830 = new class370();

    @ObfuscatedName("kt.q")
    public class370 field3829;

    public class311() {
        this.field3830.field4076 = this.field3830;
        this.field3830.field4077 = this.field3830;
    }

    @ObfuscatedName("kt.l()V")
    public void method5125() {
        while (this.field3830.field4076 != this.field3830) {
            this.field3830.field4076.method5775();
        }
    }

    @ObfuscatedName("kt.q(Lnv;)V")
    public void method5089(class370 arg0) {
        if (arg0.field4077 != null) {
            arg0.method5775();
        }
        arg0.field4077 = this.field3830.field4077;
        arg0.field4076 = this.field3830;
        arg0.field4077.field4076 = arg0;
        arg0.field4076.field4077 = arg0;
    }

    @ObfuscatedName("kt.f(Lnv;)V")
    public void method5072(class370 arg0) {
        if (arg0.field4077 != null) {
            arg0.method5775();
        }
        arg0.field4077 = this.field3830;
        arg0.field4076 = this.field3830.field4076;
        arg0.field4077.field4076 = arg0;
        arg0.field4076.field4077 = arg0;
    }

    @ObfuscatedName("kt.j(Lnv;Lnv;)V")
    public static void method5073(class370 arg0, class370 arg1) {
        if (arg0.field4077 != null) {
            arg0.method5775();
        }
        arg0.field4077 = arg1;
        arg0.field4076 = arg1.field4076;
        arg0.field4077.field4076 = arg0;
        arg0.field4076.field4077 = arg0;
    }

    @ObfuscatedName("kt.m()Lnv;")
    public class370 method5074() {
        return this.method5081((class370) null);
    }

    @ObfuscatedName("kt.k(Lnv;)Lnv;")
    public class370 method5081(class370 arg0) {
        class370 var2;
        if (arg0 == null) {
            var2 = this.field3830.field4076;
        } else {
            var2 = arg0;
        }
        if (this.field3830 == var2) {
            this.field3829 = null;
            return null;
        } else {
            this.field3829 = var2.field4076;
            return var2;
        }
    }

    @ObfuscatedName("kt.t()Lnv;")
    public class370 method5094() {
        class370 var1 = this.field3829;
        if (this.field3830 == var1) {
            this.field3829 = null;
            return null;
        } else {
            this.field3829 = var1.field4076;
            return var1;
        }
    }

    @ObfuscatedName("kt.a()I")
    public int method5126() {
        int var1 = 0;
        for (class370 var2 = this.field3830.field4076; var2 != this.field3830; var2 = var2.field4076) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("kt.e()Z")
    public boolean method5077() {
        return this.field3830.field4076 == this.field3830;
    }

    @ObfuscatedName("kt.i()[Lnv;")
    public class370[] method5078() {
        class370[] var1 = new class370[this.method5126()];
        int var2 = 0;
        for (class370 var3 = this.field3830.field4076; var3 != this.field3830; var3 = var3.field4076) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class310(this);
    }

    public int size() {
        return this.method5126();
    }

    public boolean isEmpty() {
        return this.method5077();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method5078();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class370 var3 = this.field3830.field4076; var3 != this.field3830; var3 = var3.field4076) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("kt.y(Lnv;)Z")
    public boolean method5083(class370 arg0) {
        this.method5089(arg0);
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
        this.method5125();
    }

    public boolean add(Object arg0) {
        return this.method5083((class370) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
