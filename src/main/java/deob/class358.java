package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("mt")
public class class358 implements Iterable, Collection {

    @ObfuscatedName("mt.f")
    public class440 field4350 = new class440();

    @ObfuscatedName("mt.w")
    public class440 field4349;

    public class358() {
        this.field4350.field4710 = this.field4350;
        this.field4350.field4709 = this.field4350;
    }

    @ObfuscatedName("mt.f()V")
    public void method6284() {
        while (this.field4350.field4710 != this.field4350) {
            this.field4350.field4710.method7431();
        }
    }

    @ObfuscatedName("mt.w(Lpr;)V")
    public void method6285(class440 arg0) {
        if (arg0.field4709 != null) {
            arg0.method7431();
        }
        arg0.field4709 = this.field4350.field4709;
        arg0.field4710 = this.field4350;
        arg0.field4709.field4710 = arg0;
        arg0.field4710.field4709 = arg0;
    }

    @ObfuscatedName("mt.v(Lpr;)V")
    public void method6321(class440 arg0) {
        if (arg0.field4709 != null) {
            arg0.method7431();
        }
        arg0.field4709 = this.field4350;
        arg0.field4710 = this.field4350.field4710;
        arg0.field4709.field4710 = arg0;
        arg0.field4710.field4709 = arg0;
    }

    @ObfuscatedName("mt.s(Lpr;Lpr;)V")
    public static void method6287(class440 arg0, class440 arg1) {
        if (arg0.field4709 != null) {
            arg0.method7431();
        }
        arg0.field4709 = arg1;
        arg0.field4710 = arg1.field4710;
        arg0.field4709.field4710 = arg0;
        arg0.field4710.field4709 = arg0;
    }

    @ObfuscatedName("mt.z()Lpr;")
    public class440 method6318() {
        return this.method6289((class440) null);
    }

    @ObfuscatedName("mt.j(Lpr;)Lpr;")
    public class440 method6289(class440 arg0) {
        class440 var2;
        if (arg0 == null) {
            var2 = this.field4350.field4710;
        } else {
            var2 = arg0;
        }
        if (this.field4350 == var2) {
            this.field4349 = null;
            return null;
        } else {
            this.field4349 = var2.field4710;
            return var2;
        }
    }

    @ObfuscatedName("mt.i()Lpr;")
    public class440 method6290() {
        class440 var1 = this.field4349;
        if (this.field4350 == var1) {
            this.field4349 = null;
            return null;
        } else {
            this.field4349 = var1.field4710;
            return var1;
        }
    }

    @ObfuscatedName("mt.n()I")
    public int method6291() {
        int var1 = 0;
        for (class440 var2 = this.field4350.field4710; var2 != this.field4350; var2 = var2.field4710) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("mt.l()Z")
    public boolean method6335() {
        return this.field4350.field4710 == this.field4350;
    }

    @ObfuscatedName("mt.k()[Lpr;")
    public class440[] method6293() {
        class440[] var1 = new class440[this.method6291()];
        int var2 = 0;
        for (class440 var3 = this.field4350.field4710; var3 != this.field4350; var3 = var3.field4710) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class357(this);
    }

    public int size() {
        return this.method6291();
    }

    public boolean isEmpty() {
        return this.method6335();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method6293();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class440 var3 = this.field4350.field4710; var3 != this.field4350; var3 = var3.field4710) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("mt.c(Lpr;)Z")
    public boolean method6296(class440 arg0) {
        this.method6285(arg0);
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
        this.method6284();
    }

    public boolean add(Object arg0) {
        return this.method6296((class440) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
