package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("lk")
public class class337 implements Iterable, Collection {

    @ObfuscatedName("lk.v")
    public class409 field4088 = new class409();

    @ObfuscatedName("lk.c")
    public class409 field4087;

    public class337() {
        this.field4088.field4411 = this.field4088;
        this.field4088.field4412 = this.field4088;
    }

    @ObfuscatedName("lk.v()V")
    public void method5607() {
        while (this.field4088.field4411 != this.field4088) {
            this.field4088.field4411.method6503();
        }
    }

    @ObfuscatedName("lk.c(Loq;)V")
    public void method5604(class409 arg0) {
        if (arg0.field4412 != null) {
            arg0.method6503();
        }
        arg0.field4412 = this.field4088.field4412;
        arg0.field4411 = this.field4088;
        arg0.field4412.field4411 = arg0;
        arg0.field4411.field4412 = arg0;
    }

    @ObfuscatedName("lk.i(Loq;)V")
    public void method5642(class409 arg0) {
        if (arg0.field4412 != null) {
            arg0.method6503();
        }
        arg0.field4412 = this.field4088;
        arg0.field4411 = this.field4088.field4411;
        arg0.field4412.field4411 = arg0;
        arg0.field4411.field4412 = arg0;
    }

    @ObfuscatedName("lk.f(Loq;Loq;)V")
    public static void method5573(class409 arg0, class409 arg1) {
        if (arg0.field4412 != null) {
            arg0.method6503();
        }
        arg0.field4412 = arg1;
        arg0.field4411 = arg1.field4411;
        arg0.field4412.field4411 = arg0;
        arg0.field4411.field4412 = arg0;
    }

    @ObfuscatedName("lk.b()Loq;")
    public class409 method5574() {
        return this.method5575((class409) null);
    }

    @ObfuscatedName("lk.n(Loq;)Loq;")
    public class409 method5575(class409 arg0) {
        class409 var2;
        if (arg0 == null) {
            var2 = this.field4088.field4411;
        } else {
            var2 = arg0;
        }
        if (this.field4088 == var2) {
            this.field4087 = null;
            return null;
        } else {
            this.field4087 = var2.field4411;
            return var2;
        }
    }

    @ObfuscatedName("lk.s()Loq;")
    public class409 method5619() {
        class409 var1 = this.field4087;
        if (this.field4088 == var1) {
            this.field4087 = null;
            return null;
        } else {
            this.field4087 = var1.field4411;
            return var1;
        }
    }

    @ObfuscatedName("lk.l()I")
    public int method5577() {
        int var1 = 0;
        for (class409 var2 = this.field4088.field4411; var2 != this.field4088; var2 = var2.field4411) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("lk.q()Z")
    public boolean method5578() {
        return this.field4088.field4411 == this.field4088;
    }

    @ObfuscatedName("lk.o()[Loq;")
    public class409[] method5626() {
        class409[] var1 = new class409[this.method5577()];
        int var2 = 0;
        for (class409 var3 = this.field4088.field4411; var3 != this.field4088; var3 = var3.field4411) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class336(this);
    }

    public int size() {
        return this.method5577();
    }

    public boolean isEmpty() {
        return this.method5578();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method5626();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class409 var3 = this.field4088.field4411; var3 != this.field4088; var3 = var3.field4411) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("lk.r(Loq;)Z")
    public boolean method5620(class409 arg0) {
        this.method5604(arg0);
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
        this.method5607();
    }

    public boolean add(Object arg0) {
        return this.method5620((class409) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
