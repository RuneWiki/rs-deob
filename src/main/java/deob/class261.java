package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("ju")
public class class261 implements Iterable, Collection {

    @ObfuscatedName("ju.q")
    public class181 field3540 = new class181();

    @ObfuscatedName("ju.w")
    public class181 field3539;

    public class261() {
        this.field3540.field2115 = this.field3540;
        this.field3540.field2113 = this.field3540;
    }

    @ObfuscatedName("ju.q()V")
    public void method4418() {
        while (this.field3540.field2115 != this.field3540) {
            this.field3540.field2115.method3286();
        }
    }

    @ObfuscatedName("ju.w(Lfw;)V")
    public void method4434(class181 arg0) {
        if (arg0.field2113 != null) {
            arg0.method3286();
        }
        arg0.field2113 = this.field3540.field2113;
        arg0.field2115 = this.field3540;
        arg0.field2113.field2115 = arg0;
        arg0.field2115.field2113 = arg0;
    }

    @ObfuscatedName("ju.e(Lfw;)V")
    public void method4420(class181 arg0) {
        if (arg0.field2113 != null) {
            arg0.method3286();
        }
        arg0.field2113 = this.field3540;
        arg0.field2115 = this.field3540.field2115;
        arg0.field2113.field2115 = arg0;
        arg0.field2115.field2113 = arg0;
    }

    @ObfuscatedName("ju.p(Lfw;Lfw;)V")
    public static void method4431(class181 arg0, class181 arg1) {
        if (arg0.field2113 != null) {
            arg0.method3286();
        }
        arg0.field2113 = arg1;
        arg0.field2115 = arg1.field2115;
        arg0.field2113.field2115 = arg0;
        arg0.field2115.field2113 = arg0;
    }

    @ObfuscatedName("ju.k()Lfw;")
    public class181 method4453() {
        return this.method4422((class181) null);
    }

    @ObfuscatedName("ju.l(Lfw;)Lfw;")
    public class181 method4422(class181 arg0) {
        class181 var2;
        if (arg0 == null) {
            var2 = this.field3540.field2115;
        } else {
            var2 = arg0;
        }
        if (this.field3540 == var2) {
            this.field3539 = null;
            return null;
        } else {
            this.field3539 = var2.field2115;
            return var2;
        }
    }

    @ObfuscatedName("ju.b()Lfw;")
    public class181 method4423() {
        class181 var1 = this.field3539;
        if (this.field3540 == var1) {
            this.field3539 = null;
            return null;
        } else {
            this.field3539 = var1.field2115;
            return var1;
        }
    }

    @ObfuscatedName("ju.i()I")
    public int method4499() {
        int var1 = 0;
        for (class181 var2 = this.field3540.field2115; var2 != this.field3540; var2 = var2.field2115) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("ju.c()Z")
    public boolean method4425() {
        return this.field3540.field2115 == this.field3540;
    }

    @ObfuscatedName("ju.u()[Lfw;")
    public class181[] method4426() {
        class181[] var1 = new class181[this.method4499()];
        int var2 = 0;
        for (class181 var3 = this.field3540.field2115; var3 != this.field3540; var3 = var3.field2115) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class265(this);
    }

    public int size() {
        return this.method4499();
    }

    public boolean isEmpty() {
        return this.method4425();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method4426();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class181 var3 = this.field3540.field2115; var3 != this.field3540; var3 = var3.field2115) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("ju.x(Lfw;)Z")
    public boolean method4462(class181 arg0) {
        this.method4434(arg0);
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
        this.method4418();
    }

    public boolean add(Object arg0) {
        return this.method4462((class181) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
