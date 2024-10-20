package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("jc")
public class class274 implements Iterable, Collection {

    @ObfuscatedName("jc.f")
    public class351 field3387 = new class351();

    @ObfuscatedName("jc.o")
    public class351 field3386;

    public class274() {
        this.field3387.field3942 = this.field3387;
        this.field3387.field3943 = this.field3387;
    }

    @ObfuscatedName("jc.f()V")
    public void method4259() {
        while (this.field3387.field3942 != this.field3387) {
            this.field3387.field3942.method5354();
        }
    }

    @ObfuscatedName("jc.o(Lmh;)V")
    public void method4209(class351 arg0) {
        if (arg0.field3943 != null) {
            arg0.method5354();
        }
        arg0.field3943 = this.field3387.field3943;
        arg0.field3942 = this.field3387;
        arg0.field3943.field3942 = arg0;
        arg0.field3942.field3943 = arg0;
    }

    @ObfuscatedName("jc.u(Lmh;)V")
    public void method4210(class351 arg0) {
        if (arg0.field3943 != null) {
            arg0.method5354();
        }
        arg0.field3943 = this.field3387;
        arg0.field3942 = this.field3387.field3942;
        arg0.field3943.field3942 = arg0;
        arg0.field3942.field3943 = arg0;
    }

    @ObfuscatedName("jc.p(Lmh;Lmh;)V")
    public static void method4211(class351 arg0, class351 arg1) {
        if (arg0.field3943 != null) {
            arg0.method5354();
        }
        arg0.field3943 = arg1;
        arg0.field3942 = arg1.field3942;
        arg0.field3943.field3942 = arg0;
        arg0.field3942.field3943 = arg0;
    }

    @ObfuscatedName("jc.b()Lmh;")
    public class351 method4212() {
        return this.method4223((class351) null);
    }

    @ObfuscatedName("jc.e(Lmh;)Lmh;")
    public class351 method4223(class351 arg0) {
        class351 var2;
        if (arg0 == null) {
            var2 = this.field3387.field3942;
        } else {
            var2 = arg0;
        }
        if (this.field3387 == var2) {
            this.field3386 = null;
            return null;
        } else {
            this.field3386 = var2.field3942;
            return var2;
        }
    }

    @ObfuscatedName("jc.k()Lmh;")
    public class351 method4213() {
        class351 var1 = this.field3386;
        if (this.field3387 == var1) {
            this.field3386 = null;
            return null;
        } else {
            this.field3386 = var1.field3942;
            return var1;
        }
    }

    @ObfuscatedName("jc.g()I")
    public int method4261() {
        int var1 = 0;
        for (class351 var2 = this.field3387.field3942; var2 != this.field3387; var2 = var2.field3942) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("jc.h()Z")
    public boolean method4222() {
        return this.field3387.field3942 == this.field3387;
    }

    @ObfuscatedName("jc.n()[Lmh;")
    public class351[] method4268() {
        class351[] var1 = new class351[this.method4261()];
        int var2 = 0;
        for (class351 var3 = this.field3387.field3942; var3 != this.field3387; var3 = var3.field3942) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class273(this);
    }

    public int size() {
        return this.method4261();
    }

    public boolean isEmpty() {
        return this.method4222();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method4268();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class351 var3 = this.field3387.field3942; var3 != this.field3387; var3 = var3.field3942) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("jc.l(Lmh;)Z")
    public boolean method4226(class351 arg0) {
        this.method4209(arg0);
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
        this.method4259();
    }

    public boolean add(Object arg0) {
        return this.method4226((class351) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
