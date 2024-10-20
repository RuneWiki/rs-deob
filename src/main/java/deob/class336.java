package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("lk")
public class class336 implements Iterable, Collection {

    @ObfuscatedName("lk.c")
    public class410 field4128 = new class410();

    @ObfuscatedName("lk.v")
    public class410 field4129;

    public class336() {
        this.field4128.field4463 = this.field4128;
        this.field4128.field4464 = this.field4128;
    }

    @ObfuscatedName("lk.c()V")
    public void method5574() {
        while (this.field4128.field4463 != this.field4128) {
            this.field4128.field4463.method6497();
        }
    }

    @ObfuscatedName("lk.v(Loh;)V")
    public void method5589(class410 arg0) {
        if (arg0.field4464 != null) {
            arg0.method6497();
        }
        arg0.field4464 = this.field4128.field4464;
        arg0.field4463 = this.field4128;
        arg0.field4464.field4463 = arg0;
        arg0.field4463.field4464 = arg0;
    }

    @ObfuscatedName("lk.q(Loh;)V")
    public void method5632(class410 arg0) {
        if (arg0.field4464 != null) {
            arg0.method6497();
        }
        arg0.field4464 = this.field4128;
        arg0.field4463 = this.field4128.field4463;
        arg0.field4464.field4463 = arg0;
        arg0.field4463.field4464 = arg0;
    }

    @ObfuscatedName("lk.f(Loh;Loh;)V")
    public static void method5576(class410 arg0, class410 arg1) {
        if (arg0.field4464 != null) {
            arg0.method6497();
        }
        arg0.field4464 = arg1;
        arg0.field4463 = arg1.field4463;
        arg0.field4464.field4463 = arg0;
        arg0.field4463.field4464 = arg0;
    }

    @ObfuscatedName("lk.j()Loh;")
    public class410 method5577() {
        return this.method5578((class410) null);
    }

    @ObfuscatedName("lk.e(Loh;)Loh;")
    public class410 method5578(class410 arg0) {
        class410 var2;
        if (arg0 == null) {
            var2 = this.field4128.field4463;
        } else {
            var2 = arg0;
        }
        if (this.field4128 == var2) {
            this.field4129 = null;
            return null;
        } else {
            this.field4129 = var2.field4463;
            return var2;
        }
    }

    @ObfuscatedName("lk.g()Loh;")
    public class410 method5579() {
        class410 var1 = this.field4129;
        if (this.field4128 == var1) {
            this.field4129 = null;
            return null;
        } else {
            this.field4129 = var1.field4463;
            return var1;
        }
    }

    @ObfuscatedName("lk.w()I")
    public int method5631() {
        int var1 = 0;
        for (class410 var2 = this.field4128.field4463; var2 != this.field4128; var2 = var2.field4463) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("lk.y()Z")
    public boolean method5581() {
        return this.field4128.field4463 == this.field4128;
    }

    @ObfuscatedName("lk.i()[Loh;")
    public class410[] method5584() {
        class410[] var1 = new class410[this.method5631()];
        int var2 = 0;
        for (class410 var3 = this.field4128.field4463; var3 != this.field4128; var3 = var3.field4463) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class335(this);
    }

    public int size() {
        return this.method5631();
    }

    public boolean isEmpty() {
        return this.method5581();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method5584();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class410 var3 = this.field4128.field4463; var3 != this.field4128; var3 = var3.field4463) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("lk.s(Loh;)Z")
    public boolean method5586(class410 arg0) {
        this.method5589(arg0);
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
        this.method5574();
    }

    public boolean add(Object arg0) {
        return this.method5586((class410) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
