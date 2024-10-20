package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("kz")
public class class297 implements Iterable, Collection {

    @ObfuscatedName("kz.f")
    public class353 field3714 = new class353();

    @ObfuscatedName("kz.e")
    public class353 field3713;

    public class297() {
        this.field3714.field3935 = this.field3714;
        this.field3714.field3936 = this.field3714;
    }

    @ObfuscatedName("kz.f()V")
    public void method4788() {
        while (this.field3714.field3935 != this.field3714) {
            this.field3714.field3935.method5407();
        }
    }

    @ObfuscatedName("kz.e(Lmf;)V")
    public void method4768(class353 arg0) {
        if (arg0.field3936 != null) {
            arg0.method5407();
        }
        arg0.field3936 = this.field3714.field3936;
        arg0.field3935 = this.field3714;
        arg0.field3936.field3935 = arg0;
        arg0.field3935.field3936 = arg0;
    }

    @ObfuscatedName("kz.v(Lmf;)V")
    public void method4769(class353 arg0) {
        if (arg0.field3936 != null) {
            arg0.method5407();
        }
        arg0.field3936 = this.field3714;
        arg0.field3935 = this.field3714.field3935;
        arg0.field3936.field3935 = arg0;
        arg0.field3935.field3936 = arg0;
    }

    @ObfuscatedName("kz.y(Lmf;Lmf;)V")
    public static void method4820(class353 arg0, class353 arg1) {
        if (arg0.field3936 != null) {
            arg0.method5407();
        }
        arg0.field3936 = arg1;
        arg0.field3935 = arg1.field3935;
        arg0.field3936.field3935 = arg0;
        arg0.field3935.field3936 = arg0;
    }

    @ObfuscatedName("kz.j()Lmf;")
    public class353 method4771() {
        return this.method4772((class353) null);
    }

    @ObfuscatedName("kz.o(Lmf;)Lmf;")
    public class353 method4772(class353 arg0) {
        class353 var2;
        if (arg0 == null) {
            var2 = this.field3714.field3935;
        } else {
            var2 = arg0;
        }
        if (this.field3714 == var2) {
            this.field3713 = null;
            return null;
        } else {
            this.field3713 = var2.field3935;
            return var2;
        }
    }

    @ObfuscatedName("kz.m()Lmf;")
    public class353 method4773() {
        class353 var1 = this.field3713;
        if (this.field3714 == var1) {
            this.field3713 = null;
            return null;
        } else {
            this.field3713 = var1.field3935;
            return var1;
        }
    }

    @ObfuscatedName("kz.r()I")
    public int method4774() {
        int var1 = 0;
        for (class353 var2 = this.field3714.field3935; var2 != this.field3714; var2 = var2.field3935) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("kz.h()Z")
    public boolean method4775() {
        return this.field3714.field3935 == this.field3714;
    }

    @ObfuscatedName("kz.d()[Lmf;")
    public class353[] method4781() {
        class353[] var1 = new class353[this.method4774()];
        int var2 = 0;
        for (class353 var3 = this.field3714.field3935; var3 != this.field3714; var3 = var3.field3935) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class296(this);
    }

    public int size() {
        return this.method4774();
    }

    public boolean isEmpty() {
        return this.method4775();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method4781();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class353 var3 = this.field3714.field3935; var3 != this.field3714; var3 = var3.field3935) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("kz.z(Lmf;)Z")
    public boolean method4795(class353 arg0) {
        this.method4768(arg0);
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
        this.method4788();
    }

    public boolean add(Object arg0) {
        return this.method4795((class353) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
