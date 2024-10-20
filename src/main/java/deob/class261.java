package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("jd")
public class class261 implements Iterable, Collection {

    @ObfuscatedName("jd.c")
    public class181 field3508 = new class181();

    @ObfuscatedName("jd.x")
    public class181 field3507;

    public class261() {
        this.field3508.field2095 = this.field3508;
        this.field3508.field2094 = this.field3508;
    }

    @ObfuscatedName("jd.c()V")
    public void method4476() {
        while (this.field3508.field2095 != this.field3508) {
            this.field3508.field2095.method3326();
        }
    }

    @ObfuscatedName("jd.x(Lfn;)V")
    public void method4477(class181 arg0) {
        if (arg0.field2094 != null) {
            arg0.method3326();
        }
        arg0.field2094 = this.field3508.field2094;
        arg0.field2095 = this.field3508;
        arg0.field2094.field2095 = arg0;
        arg0.field2095.field2094 = arg0;
    }

    @ObfuscatedName("jd.t(Lfn;)V")
    public void method4493(class181 arg0) {
        if (arg0.field2094 != null) {
            arg0.method3326();
        }
        arg0.field2094 = this.field3508;
        arg0.field2095 = this.field3508.field2095;
        arg0.field2094.field2095 = arg0;
        arg0.field2095.field2094 = arg0;
    }

    @ObfuscatedName("jd.g(Lfn;Lfn;)V")
    public static void method4512(class181 arg0, class181 arg1) {
        if (arg0.field2094 != null) {
            arg0.method3326();
        }
        arg0.field2094 = arg1;
        arg0.field2095 = arg1.field2095;
        arg0.field2094.field2095 = arg0;
        arg0.field2095.field2094 = arg0;
    }

    @ObfuscatedName("jd.l()Lfn;")
    public class181 method4492() {
        return this.method4481((class181) null);
    }

    @ObfuscatedName("jd.u(Lfn;)Lfn;")
    public class181 method4481(class181 arg0) {
        class181 var2;
        if (arg0 == null) {
            var2 = this.field3508.field2095;
        } else {
            var2 = arg0;
        }
        if (this.field3508 == var2) {
            this.field3507 = null;
            return null;
        } else {
            this.field3507 = var2.field2095;
            return var2;
        }
    }

    @ObfuscatedName("jd.j()Lfn;")
    public class181 method4482() {
        class181 var1 = this.field3507;
        if (this.field3508 == var1) {
            this.field3507 = null;
            return null;
        } else {
            this.field3507 = var1.field2095;
            return var1;
        }
    }

    @ObfuscatedName("jd.v()I")
    public int method4483() {
        int var1 = 0;
        for (class181 var2 = this.field3508.field2095; var2 != this.field3508; var2 = var2.field2095) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("jd.d()Z")
    public boolean method4541() {
        return this.field3508.field2095 == this.field3508;
    }

    @ObfuscatedName("jd.z()[Lfn;")
    public class181[] method4485() {
        class181[] var1 = new class181[this.method4483()];
        int var2 = 0;
        for (class181 var3 = this.field3508.field2095; var3 != this.field3508; var3 = var3.field2095) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class265(this);
    }

    public int size() {
        return this.method4483();
    }

    public boolean isEmpty() {
        return this.method4541();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method4485();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class181 var3 = this.field3508.field2095; var3 != this.field3508; var3 = var3.field2095) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("jd.s(Lfn;)Z")
    public boolean method4486(class181 arg0) {
        this.method4477(arg0);
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
        this.method4476();
    }

    public boolean add(Object arg0) {
        return this.method4486((class181) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
