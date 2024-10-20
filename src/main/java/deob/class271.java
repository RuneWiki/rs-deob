package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("jv")
public class class271 implements Iterable, Collection {

    @ObfuscatedName("jv.z")
    public class190 field3554 = new class190();

    @ObfuscatedName("jv.k")
    public class190 field3555;

    public class271() {
        this.field3554.field2155 = this.field3554;
        this.field3554.field2156 = this.field3554;
    }

    @ObfuscatedName("jv.z()V")
    public void method4547() {
        while (this.field3554.field2155 != this.field3554) {
            this.field3554.field2155.method3401();
        }
    }

    @ObfuscatedName("jv.k(Lgw;)V")
    public void method4564(class190 arg0) {
        if (arg0.field2156 != null) {
            arg0.method3401();
        }
        arg0.field2156 = this.field3554.field2156;
        arg0.field2155 = this.field3554;
        arg0.field2156.field2155 = arg0;
        arg0.field2155.field2156 = arg0;
    }

    @ObfuscatedName("jv.s(Lgw;)V")
    public void method4548(class190 arg0) {
        if (arg0.field2156 != null) {
            arg0.method3401();
        }
        arg0.field2156 = this.field3554;
        arg0.field2155 = this.field3554.field2155;
        arg0.field2156.field2155 = arg0;
        arg0.field2155.field2156 = arg0;
    }

    @ObfuscatedName("jv.t(Lgw;Lgw;)V")
    public static void method4560(class190 arg0, class190 arg1) {
        if (arg0.field2156 != null) {
            arg0.method3401();
        }
        arg0.field2156 = arg1;
        arg0.field2155 = arg1.field2155;
        arg0.field2156.field2155 = arg0;
        arg0.field2155.field2156 = arg0;
    }

    @ObfuscatedName("jv.i()Lgw;")
    public class190 method4551() {
        return this.method4556((class190) null);
    }

    @ObfuscatedName("jv.o(Lgw;)Lgw;")
    public class190 method4556(class190 arg0) {
        class190 var2;
        if (arg0 == null) {
            var2 = this.field3554.field2155;
        } else {
            var2 = arg0;
        }
        if (this.field3554 == var2) {
            this.field3555 = null;
            return null;
        } else {
            this.field3555 = var2.field2155;
            return var2;
        }
    }

    @ObfuscatedName("jv.x()Lgw;")
    public class190 method4553() {
        class190 var1 = this.field3555;
        if (this.field3554 == var1) {
            this.field3555 = null;
            return null;
        } else {
            this.field3555 = var1.field2155;
            return var1;
        }
    }

    @ObfuscatedName("jv.w()I")
    public int method4554() {
        int var1 = 0;
        for (class190 var2 = this.field3554.field2155; var2 != this.field3554; var2 = var2.field2155) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("jv.g()Z")
    public boolean method4555() {
        return this.field3554.field2155 == this.field3554;
    }

    @ObfuscatedName("jv.m()[Lgw;")
    public class190[] method4606() {
        class190[] var1 = new class190[this.method4554()];
        int var2 = 0;
        for (class190 var3 = this.field3554.field2155; var3 != this.field3554; var3 = var3.field2155) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class275(this);
    }

    public int size() {
        return this.method4554();
    }

    public boolean isEmpty() {
        return this.method4555();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method4606();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class190 var3 = this.field3554.field2155; var3 != this.field3554; var3 = var3.field2155) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("jv.n(Lgw;)Z")
    public boolean method4561(class190 arg0) {
        this.method4564(arg0);
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
        this.method4547();
    }

    public boolean add(Object arg0) {
        return this.method4561((class190) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
