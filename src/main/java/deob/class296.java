package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("ki")
public class class296 implements Iterable, Collection {

    @ObfuscatedName("ki.v")
    public class352 field3711 = new class352();

    @ObfuscatedName("ki.n")
    public class352 field3710;

    public class296() {
        this.field3711.field3939 = this.field3711;
        this.field3711.field3940 = this.field3711;
    }

    @ObfuscatedName("ki.v()V")
    public void method4763() {
        while (this.field3711.field3939 != this.field3711) {
            this.field3711.field3939.method5496();
        }
    }

    @ObfuscatedName("ki.n(Lmw;)V")
    public void method4764(class352 arg0) {
        if (arg0.field3940 != null) {
            arg0.method5496();
        }
        arg0.field3940 = this.field3711.field3940;
        arg0.field3939 = this.field3711;
        arg0.field3940.field3939 = arg0;
        arg0.field3939.field3940 = arg0;
    }

    @ObfuscatedName("ki.f(Lmw;)V")
    public void method4765(class352 arg0) {
        if (arg0.field3940 != null) {
            arg0.method5496();
        }
        arg0.field3940 = this.field3711;
        arg0.field3939 = this.field3711.field3939;
        arg0.field3940.field3939 = arg0;
        arg0.field3939.field3940 = arg0;
    }

    @ObfuscatedName("ki.y(Lmw;Lmw;)V")
    public static void method4812(class352 arg0, class352 arg1) {
        if (arg0.field3940 != null) {
            arg0.method5496();
        }
        arg0.field3940 = arg1;
        arg0.field3939 = arg1.field3939;
        arg0.field3940.field3939 = arg0;
        arg0.field3939.field3940 = arg0;
    }

    @ObfuscatedName("ki.p()Lmw;")
    public class352 method4767() {
        return this.method4768((class352) null);
    }

    @ObfuscatedName("ki.j(Lmw;)Lmw;")
    public class352 method4768(class352 arg0) {
        class352 var2;
        if (arg0 == null) {
            var2 = this.field3711.field3939;
        } else {
            var2 = arg0;
        }
        if (this.field3711 == var2) {
            this.field3710 = null;
            return null;
        } else {
            this.field3710 = var2.field3939;
            return var2;
        }
    }

    @ObfuscatedName("ki.r()Lmw;")
    public class352 method4769() {
        class352 var1 = this.field3710;
        if (this.field3711 == var1) {
            this.field3710 = null;
            return null;
        } else {
            this.field3710 = var1.field3939;
            return var1;
        }
    }

    @ObfuscatedName("ki.b()I")
    public int method4770() {
        int var1 = 0;
        for (class352 var2 = this.field3711.field3939; var2 != this.field3711; var2 = var2.field3939) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("ki.d()Z")
    public boolean method4771() {
        return this.field3711.field3939 == this.field3711;
    }

    @ObfuscatedName("ki.s()[Lmw;")
    public class352[] method4775() {
        class352[] var1 = new class352[this.method4770()];
        int var2 = 0;
        for (class352 var3 = this.field3711.field3939; var3 != this.field3711; var3 = var3.field3939) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class295(this);
    }

    public int size() {
        return this.method4770();
    }

    public boolean isEmpty() {
        return this.method4771();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method4775();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class352 var3 = this.field3711.field3939; var3 != this.field3711; var3 = var3.field3939) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("ki.u(Lmw;)Z")
    public boolean method4774(class352 arg0) {
        this.method4764(arg0);
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
        this.method4763();
    }

    public boolean add(Object arg0) {
        return this.method4774((class352) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
