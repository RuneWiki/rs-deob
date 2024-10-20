package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("jm")
public class class271 implements Iterable, Collection {

    @ObfuscatedName("jm.x")
    public class190 field3532 = new class190();

    @ObfuscatedName("jm.m")
    public class190 field3531;

    public class271() {
        this.field3532.field2118 = this.field3532;
        this.field3532.field2116 = this.field3532;
    }

    @ObfuscatedName("jm.x()V")
    public void method4494() {
        while (this.field3532.field2118 != this.field3532) {
            this.field3532.field2118.method3355();
        }
    }

    @ObfuscatedName("jm.m(Lga;)V")
    public void method4486(class190 arg0) {
        if (arg0.field2116 != null) {
            arg0.method3355();
        }
        arg0.field2116 = this.field3532.field2116;
        arg0.field2118 = this.field3532;
        arg0.field2116.field2118 = arg0;
        arg0.field2118.field2116 = arg0;
    }

    @ObfuscatedName("jm.k(Lga;)V")
    public void method4508(class190 arg0) {
        if (arg0.field2116 != null) {
            arg0.method3355();
        }
        arg0.field2116 = this.field3532;
        arg0.field2118 = this.field3532.field2118;
        arg0.field2116.field2118 = arg0;
        arg0.field2118.field2116 = arg0;
    }

    @ObfuscatedName("jm.d(Lga;Lga;)V")
    public static void method4521(class190 arg0, class190 arg1) {
        if (arg0.field2116 != null) {
            arg0.method3355();
        }
        arg0.field2116 = arg1;
        arg0.field2118 = arg1.field2118;
        arg0.field2116.field2118 = arg0;
        arg0.field2118.field2116 = arg0;
    }

    @ObfuscatedName("jm.w()Lga;")
    public class190 method4488() {
        return this.method4499((class190) null);
    }

    @ObfuscatedName("jm.v(Lga;)Lga;")
    public class190 method4499(class190 arg0) {
        class190 var2;
        if (arg0 == null) {
            var2 = this.field3532.field2118;
        } else {
            var2 = arg0;
        }
        if (this.field3532 == var2) {
            this.field3531 = null;
            return null;
        } else {
            this.field3531 = var2.field2118;
            return var2;
        }
    }

    @ObfuscatedName("jm.q()Lga;")
    public class190 method4543() {
        class190 var1 = this.field3531;
        if (this.field3532 == var1) {
            this.field3531 = null;
            return null;
        } else {
            this.field3531 = var1.field2118;
            return var1;
        }
    }

    @ObfuscatedName("jm.z()I")
    public int method4531() {
        int var1 = 0;
        for (class190 var2 = this.field3532.field2118; var2 != this.field3532; var2 = var2.field2118) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("jm.t()Z")
    public boolean method4495() {
        return this.field3532.field2118 == this.field3532;
    }

    @ObfuscatedName("jm.e()[Lga;")
    public class190[] method4492() {
        class190[] var1 = new class190[this.method4531()];
        int var2 = 0;
        for (class190 var3 = this.field3532.field2118; var3 != this.field3532; var3 = var3.field2118) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class275(this);
    }

    public int size() {
        return this.method4531();
    }

    public boolean isEmpty() {
        return this.method4495();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method4492();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class190 var3 = this.field3532.field2118; var3 != this.field3532; var3 = var3.field2118) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("jm.s(Lga;)Z")
    public boolean method4487(class190 arg0) {
        this.method4486(arg0);
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
        this.method4494();
    }

    public boolean add(Object arg0) {
        return this.method4487((class190) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
