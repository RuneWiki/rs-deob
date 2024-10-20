package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("po")
public class class399 implements Iterable, Collection {

    @ObfuscatedName("po.aq")
    public class492 field4523 = new class492();

    @ObfuscatedName("po.aw")
    public class492 field4522;

    public class399() {
        this.field4523.field4918 = this.field4523;
        this.field4523.field4919 = this.field4523;
    }

    @ObfuscatedName("po.aq()V")
    public void method6738() {
        while (this.field4523.field4918 != this.field4523) {
            this.field4523.field4918.method7996();
        }
    }

    @ObfuscatedName("po.aw(Lse;)V")
    public void method6739(class492 arg0) {
        if (arg0.field4919 != null) {
            arg0.method7996();
        }
        arg0.field4919 = this.field4523.field4919;
        arg0.field4918 = this.field4523;
        arg0.field4919.field4918 = arg0;
        arg0.field4918.field4919 = arg0;
    }

    @ObfuscatedName("po.al(Lse;)V")
    public void method6740(class492 arg0) {
        if (arg0.field4919 != null) {
            arg0.method7996();
        }
        arg0.field4919 = this.field4523;
        arg0.field4918 = this.field4523.field4918;
        arg0.field4919.field4918 = arg0;
        arg0.field4918.field4919 = arg0;
    }

    @ObfuscatedName("po.ai(Lse;Lse;)V")
    public static void method6752(class492 arg0, class492 arg1) {
        if (arg0.field4919 != null) {
            arg0.method7996();
        }
        arg0.field4919 = arg1;
        arg0.field4918 = arg1.field4918;
        arg0.field4919.field4918 = arg0;
        arg0.field4918.field4919 = arg0;
    }

    @ObfuscatedName("po.ar()Lse;")
    public class492 method6756() {
        return this.method6743((class492) null);
    }

    @ObfuscatedName("po.as(Lse;)Lse;")
    public class492 method6743(class492 arg0) {
        class492 var2;
        if (arg0 == null) {
            var2 = this.field4523.field4918;
        } else {
            var2 = arg0;
        }
        if (this.field4523 == var2) {
            this.field4522 = null;
            return null;
        } else {
            this.field4522 = var2.field4918;
            return var2;
        }
    }

    @ObfuscatedName("po.aa()Lse;")
    public class492 method6758() {
        class492 var1 = this.field4522;
        if (this.field4523 == var1) {
            this.field4522 = null;
            return null;
        } else {
            this.field4522 = var1.field4918;
            return var1;
        }
    }

    @ObfuscatedName("po.az()I")
    public int method6780() {
        int var1 = 0;
        for (class492 var2 = this.field4523.field4918; var2 != this.field4523; var2 = var2.field4918) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("po.ao()Z")
    public boolean method6746() {
        return this.field4523.field4918 == this.field4523;
    }

    @ObfuscatedName("po.au()[Lse;")
    public class492[] method6748() {
        class492[] var1 = new class492[this.method6780()];
        int var2 = 0;
        for (class492 var3 = this.field4523.field4918; var3 != this.field4523; var3 = var3.field4918) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class398(this);
    }

    public int size() {
        return this.method6780();
    }

    public boolean isEmpty() {
        return this.method6746();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method6748();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class492 var3 = this.field4523.field4918; var3 != this.field4523; var3 = var3.field4918) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("po.ak(Lse;)Z")
    public boolean method6750(class492 arg0) {
        this.method6739(arg0);
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
        this.method6738();
    }

    public boolean add(Object arg0) {
        return this.method6750((class492) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
