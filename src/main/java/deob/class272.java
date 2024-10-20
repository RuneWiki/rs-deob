package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("js")
public class class272 implements Iterable, Collection {

    @ObfuscatedName("js.f")
    public class190 field3555 = new class190();

    @ObfuscatedName("js.b")
    public class190 field3556;

    public class272() {
        this.field3555.field2141 = this.field3555;
        this.field3555.field2142 = this.field3555;
    }

    @ObfuscatedName("js.f()V")
    public void method4613() {
        while (this.field3555.field2141 != this.field3555) {
            this.field3555.field2141.method3407();
        }
    }

    @ObfuscatedName("js.b(Lgn;)V")
    public void method4588(class190 arg0) {
        if (arg0.field2142 != null) {
            arg0.method3407();
        }
        arg0.field2142 = this.field3555.field2142;
        arg0.field2141 = this.field3555;
        arg0.field2142.field2141 = arg0;
        arg0.field2141.field2142 = arg0;
    }

    @ObfuscatedName("js.l(Lgn;)V")
    public void method4570(class190 arg0) {
        if (arg0.field2142 != null) {
            arg0.method3407();
        }
        arg0.field2142 = this.field3555;
        arg0.field2141 = this.field3555.field2141;
        arg0.field2142.field2141 = arg0;
        arg0.field2141.field2142 = arg0;
    }

    @ObfuscatedName("js.m(Lgn;Lgn;)V")
    public static void method4571(class190 arg0, class190 arg1) {
        if (arg0.field2142 != null) {
            arg0.method3407();
        }
        arg0.field2142 = arg1;
        arg0.field2141 = arg1.field2141;
        arg0.field2142.field2141 = arg0;
        arg0.field2141.field2142 = arg0;
    }

    @ObfuscatedName("js.z()Lgn;")
    public class190 method4572() {
        return this.method4592((class190) null);
    }

    @ObfuscatedName("js.q(Lgn;)Lgn;")
    public class190 method4592(class190 arg0) {
        class190 var2;
        if (arg0 == null) {
            var2 = this.field3555.field2141;
        } else {
            var2 = arg0;
        }
        if (this.field3555 == var2) {
            this.field3556 = null;
            return null;
        } else {
            this.field3556 = var2.field2141;
            return var2;
        }
    }

    @ObfuscatedName("js.k()Lgn;")
    public class190 method4574() {
        class190 var1 = this.field3556;
        if (this.field3555 == var1) {
            this.field3556 = null;
            return null;
        } else {
            this.field3556 = var1.field2141;
            return var1;
        }
    }

    @ObfuscatedName("js.c()I")
    public int method4575() {
        int var1 = 0;
        for (class190 var2 = this.field3555.field2141; var2 != this.field3555; var2 = var2.field2141) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("js.u()Z")
    public boolean method4576() {
        return this.field3555.field2141 == this.field3555;
    }

    @ObfuscatedName("js.t()[Lgn;")
    public class190[] method4577() {
        class190[] var1 = new class190[this.method4575()];
        int var2 = 0;
        for (class190 var3 = this.field3555.field2141; var3 != this.field3555; var3 = var3.field2141) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class276(this);
    }

    public int size() {
        return this.method4575();
    }

    public boolean isEmpty() {
        return this.method4576();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method4577();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class190 var3 = this.field3555.field2141; var3 != this.field3555; var3 = var3.field2141) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("js.e(Lgn;)Z")
    public boolean method4573(class190 arg0) {
        this.method4588(arg0);
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
        this.method4613();
    }

    public boolean add(Object arg0) {
        return this.method4573((class190) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
