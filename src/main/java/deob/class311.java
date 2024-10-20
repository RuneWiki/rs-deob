package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("kf")
public class class311 implements Iterable, Collection {

    @ObfuscatedName("kf.i")
    public class370 field3816 = new class370();

    @ObfuscatedName("kf.w")
    public class370 field3817;

    public class311() {
        this.field3816.field4074 = this.field3816;
        this.field3816.field4076 = this.field3816;
    }

    @ObfuscatedName("kf.i()V")
    public void method5022() {
        while (this.field3816.field4074 != this.field3816) {
            this.field3816.field4074.method5752();
        }
    }

    @ObfuscatedName("kf.w(Lns;)V")
    public void method5023(class370 arg0) {
        if (arg0.field4076 != null) {
            arg0.method5752();
        }
        arg0.field4076 = this.field3816.field4076;
        arg0.field4074 = this.field3816;
        arg0.field4076.field4074 = arg0;
        arg0.field4074.field4076 = arg0;
    }

    @ObfuscatedName("kf.s(Lns;)V")
    public void method5024(class370 arg0) {
        if (arg0.field4076 != null) {
            arg0.method5752();
        }
        arg0.field4076 = this.field3816;
        arg0.field4074 = this.field3816.field4074;
        arg0.field4076.field4074 = arg0;
        arg0.field4074.field4076 = arg0;
    }

    @ObfuscatedName("kf.a(Lns;Lns;)V")
    public static void method5025(class370 arg0, class370 arg1) {
        if (arg0.field4076 != null) {
            arg0.method5752();
        }
        arg0.field4076 = arg1;
        arg0.field4074 = arg1.field4074;
        arg0.field4076.field4074 = arg0;
        arg0.field4074.field4076 = arg0;
    }

    @ObfuscatedName("kf.o()Lns;")
    public class370 method5026() {
        return this.method5027((class370) null);
    }

    @ObfuscatedName("kf.g(Lns;)Lns;")
    public class370 method5027(class370 arg0) {
        class370 var2;
        if (arg0 == null) {
            var2 = this.field3816.field4074;
        } else {
            var2 = arg0;
        }
        if (this.field3816 == var2) {
            this.field3817 = null;
            return null;
        } else {
            this.field3817 = var2.field4074;
            return var2;
        }
    }

    @ObfuscatedName("kf.e()Lns;")
    public class370 method5028() {
        class370 var1 = this.field3817;
        if (this.field3816 == var1) {
            this.field3817 = null;
            return null;
        } else {
            this.field3817 = var1.field4074;
            return var1;
        }
    }

    @ObfuscatedName("kf.p()I")
    public int method5029() {
        int var1 = 0;
        for (class370 var2 = this.field3816.field4074; var2 != this.field3816; var2 = var2.field4074) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("kf.j()Z")
    public boolean method5052() {
        return this.field3816.field4074 == this.field3816;
    }

    @ObfuscatedName("kf.b()[Lns;")
    public class370[] method5031() {
        class370[] var1 = new class370[this.method5029()];
        int var2 = 0;
        for (class370 var3 = this.field3816.field4074; var3 != this.field3816; var3 = var3.field4074) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class310(this);
    }

    public int size() {
        return this.method5029();
    }

    public boolean isEmpty() {
        return this.method5052();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method5031();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class370 var3 = this.field3816.field4074; var3 != this.field3816; var3 = var3.field4074) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("kf.x(Lns;)Z")
    public boolean method5034(class370 arg0) {
        this.method5023(arg0);
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
        this.method5022();
    }

    public boolean add(Object arg0) {
        return this.method5034((class370) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
