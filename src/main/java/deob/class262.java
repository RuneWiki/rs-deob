package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("jj")
public class class262 implements Iterable, Collection {

    @ObfuscatedName("jj.c")
    public class181 field3530 = new class181();

    @ObfuscatedName("jj.t")
    public class181 field3529;

    public class262() {
        this.field3530.field2114 = this.field3530;
        this.field3530.field2113 = this.field3530;
    }

    @ObfuscatedName("jj.c()V")
    public void method4520() {
        while (this.field3530.field2114 != this.field3530) {
            this.field3530.field2114.method3351();
        }
    }

    @ObfuscatedName("jj.t(Lft;)V")
    public void method4479(class181 arg0) {
        if (arg0.field2113 != null) {
            arg0.method3351();
        }
        arg0.field2113 = this.field3530.field2113;
        arg0.field2114 = this.field3530;
        arg0.field2113.field2114 = arg0;
        arg0.field2114.field2113 = arg0;
    }

    @ObfuscatedName("jj.o(Lft;)V")
    public void method4480(class181 arg0) {
        if (arg0.field2113 != null) {
            arg0.method3351();
        }
        arg0.field2113 = this.field3530;
        arg0.field2114 = this.field3530.field2114;
        arg0.field2113.field2114 = arg0;
        arg0.field2114.field2113 = arg0;
    }

    @ObfuscatedName("jj.e(Lft;Lft;)V")
    public static void method4481(class181 arg0, class181 arg1) {
        if (arg0.field2113 != null) {
            arg0.method3351();
        }
        arg0.field2113 = arg1;
        arg0.field2114 = arg1.field2114;
        arg0.field2113.field2114 = arg0;
        arg0.field2114.field2113 = arg0;
    }

    @ObfuscatedName("jj.i()Lft;")
    public class181 method4491() {
        return this.method4482((class181) null);
    }

    @ObfuscatedName("jj.g(Lft;)Lft;")
    public class181 method4482(class181 arg0) {
        class181 var2;
        if (arg0 == null) {
            var2 = this.field3530.field2114;
        } else {
            var2 = arg0;
        }
        if (this.field3530 == var2) {
            this.field3529 = null;
            return null;
        } else {
            this.field3529 = var2.field2114;
            return var2;
        }
    }

    @ObfuscatedName("jj.d()Lft;")
    public class181 method4490() {
        class181 var1 = this.field3529;
        if (this.field3530 == var1) {
            this.field3529 = null;
            return null;
        } else {
            this.field3529 = var1.field2114;
            return var1;
        }
    }

    @ObfuscatedName("jj.l()I")
    public int method4483() {
        int var1 = 0;
        for (class181 var2 = this.field3530.field2114; var2 != this.field3530; var2 = var2.field2114) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("jj.j()Z")
    public boolean method4484() {
        return this.field3530.field2114 == this.field3530;
    }

    @ObfuscatedName("jj.m()[Lft;")
    public class181[] method4485() {
        class181[] var1 = new class181[this.method4483()];
        int var2 = 0;
        for (class181 var3 = this.field3530.field2114; var3 != this.field3530; var3 = var3.field2114) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class266(this);
    }

    public int size() {
        return this.method4483();
    }

    public boolean isEmpty() {
        return this.method4484();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method4485();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class181 var3 = this.field3530.field2114; var3 != this.field3530; var3 = var3.field2114) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("jj.p(Lft;)Z")
    public boolean method4489(class181 arg0) {
        this.method4479(arg0);
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
        this.method4520();
    }

    public boolean add(Object arg0) {
        return this.method4489((class181) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
