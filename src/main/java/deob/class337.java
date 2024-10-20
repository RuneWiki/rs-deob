package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("lx")
public class class337 implements Iterable, Collection {

    @ObfuscatedName("lx.s")
    public class411 field4131 = new class411();

    @ObfuscatedName("lx.h")
    public class411 field4130;

    public class337() {
        this.field4131.field4469 = this.field4131;
        this.field4131.field4470 = this.field4131;
    }

    @ObfuscatedName("lx.s()V")
    public void method5478() {
        while (this.field4131.field4469 != this.field4131) {
            this.field4131.field4469.method6409();
        }
    }

    @ObfuscatedName("lx.h(Lon;)V")
    public void method5531(class411 arg0) {
        if (arg0.field4470 != null) {
            arg0.method6409();
        }
        arg0.field4470 = this.field4131.field4470;
        arg0.field4469 = this.field4131;
        arg0.field4470.field4469 = arg0;
        arg0.field4469.field4470 = arg0;
    }

    @ObfuscatedName("lx.w(Lon;)V")
    public void method5479(class411 arg0) {
        if (arg0.field4470 != null) {
            arg0.method6409();
        }
        arg0.field4470 = this.field4131;
        arg0.field4469 = this.field4131.field4469;
        arg0.field4470.field4469 = arg0;
        arg0.field4469.field4470 = arg0;
    }

    @ObfuscatedName("lx.v(Lon;Lon;)V")
    public static void method5481(class411 arg0, class411 arg1) {
        if (arg0.field4470 != null) {
            arg0.method6409();
        }
        arg0.field4470 = arg1;
        arg0.field4469 = arg1.field4469;
        arg0.field4470.field4469 = arg0;
        arg0.field4469.field4470 = arg0;
    }

    @ObfuscatedName("lx.c()Lon;")
    public class411 method5482() {
        return this.method5501((class411) null);
    }

    @ObfuscatedName("lx.q(Lon;)Lon;")
    public class411 method5501(class411 arg0) {
        class411 var2;
        if (arg0 == null) {
            var2 = this.field4131.field4469;
        } else {
            var2 = arg0;
        }
        if (this.field4131 == var2) {
            this.field4130 = null;
            return null;
        } else {
            this.field4130 = var2.field4469;
            return var2;
        }
    }

    @ObfuscatedName("lx.i()Lon;")
    public class411 method5484() {
        class411 var1 = this.field4130;
        if (this.field4131 == var1) {
            this.field4130 = null;
            return null;
        } else {
            this.field4130 = var1.field4469;
            return var1;
        }
    }

    @ObfuscatedName("lx.k()I")
    public int method5485() {
        int var1 = 0;
        for (class411 var2 = this.field4131.field4469; var2 != this.field4131; var2 = var2.field4469) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("lx.o()Z")
    public boolean method5480() {
        return this.field4131.field4469 == this.field4131;
    }

    @ObfuscatedName("lx.n()[Lon;")
    public class411[] method5487() {
        class411[] var1 = new class411[this.method5485()];
        int var2 = 0;
        for (class411 var3 = this.field4131.field4469; var3 != this.field4131; var3 = var3.field4469) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class336(this);
    }

    public int size() {
        return this.method5485();
    }

    public boolean isEmpty() {
        return this.method5480();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method5487();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class411 var3 = this.field4131.field4469; var3 != this.field4131; var3 = var3.field4469) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("lx.d(Lon;)Z")
    public boolean method5545(class411 arg0) {
        this.method5531(arg0);
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
        this.method5478();
    }

    public boolean add(Object arg0) {
        return this.method5545((class411) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
