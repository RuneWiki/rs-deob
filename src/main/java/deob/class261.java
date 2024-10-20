package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("js")
public class class261 implements Iterable, Collection {

    @ObfuscatedName("js.z")
    public class181 field3523 = new class181();

    @ObfuscatedName("js.n")
    public class181 field3522;

    public class261() {
        this.field3523.field2093 = this.field3523;
        this.field3523.field2095 = this.field3523;
    }

    @ObfuscatedName("js.z()V")
    public void method4373() {
        while (this.field3523.field2093 != this.field3523) {
            this.field3523.field2093.method3249();
        }
    }

    @ObfuscatedName("js.n(Lfx;)V")
    public void method4360(class181 arg0) {
        if (arg0.field2095 != null) {
            arg0.method3249();
        }
        arg0.field2095 = this.field3523.field2095;
        arg0.field2093 = this.field3523;
        arg0.field2095.field2093 = arg0;
        arg0.field2093.field2095 = arg0;
    }

    @ObfuscatedName("js.v(Lfx;)V")
    public void method4368(class181 arg0) {
        if (arg0.field2095 != null) {
            arg0.method3249();
        }
        arg0.field2095 = this.field3523;
        arg0.field2093 = this.field3523.field2093;
        arg0.field2095.field2093 = arg0;
        arg0.field2093.field2095 = arg0;
    }

    @ObfuscatedName("js.u(Lfx;Lfx;)V")
    public static void method4362(class181 arg0, class181 arg1) {
        if (arg0.field2095 != null) {
            arg0.method3249();
        }
        arg0.field2095 = arg1;
        arg0.field2093 = arg1.field2093;
        arg0.field2095.field2093 = arg0;
        arg0.field2093.field2095 = arg0;
    }

    @ObfuscatedName("js.r()Lfx;")
    public class181 method4385() {
        return this.method4388((class181) null);
    }

    @ObfuscatedName("js.p(Lfx;)Lfx;")
    public class181 method4388(class181 arg0) {
        class181 var2;
        if (arg0 == null) {
            var2 = this.field3523.field2093;
        } else {
            var2 = arg0;
        }
        if (this.field3523 == var2) {
            this.field3522 = null;
            return null;
        } else {
            this.field3522 = var2.field2093;
            return var2;
        }
    }

    @ObfuscatedName("js.q()Lfx;")
    public class181 method4365() {
        class181 var1 = this.field3522;
        if (this.field3523 == var1) {
            this.field3522 = null;
            return null;
        } else {
            this.field3522 = var1.field2093;
            return var1;
        }
    }

    @ObfuscatedName("js.m()I")
    public int method4366() {
        int var1 = 0;
        for (class181 var2 = this.field3523.field2093; var2 != this.field3523; var2 = var2.field2093) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("js.y()Z")
    public boolean method4367() {
        return this.field3523.field2093 == this.field3523;
    }

    @ObfuscatedName("js.i()[Lfx;")
    public class181[] method4411() {
        class181[] var1 = new class181[this.method4366()];
        int var2 = 0;
        for (class181 var3 = this.field3523.field2093; var3 != this.field3523; var3 = var3.field2093) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class265(this);
    }

    public int size() {
        return this.method4366();
    }

    public boolean isEmpty() {
        return this.method4367();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method4411();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class181 var3 = this.field3523.field2093; var3 != this.field3523; var3 = var3.field2093) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("js.c(Lfx;)Z")
    public boolean method4370(class181 arg0) {
        this.method4360(arg0);
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
        this.method4373();
    }

    public boolean add(Object arg0) {
        return this.method4370((class181) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
