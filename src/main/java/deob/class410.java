package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("pf")
public class class410 implements Iterable, Collection {

    @ObfuscatedName("pf.ab")
    public class506 field4631 = new class506();

    @ObfuscatedName("pf.ay")
    public class506 field4630;

    public class410() {
        this.field4631.field5074 = this.field4631;
        this.field4631.field5076 = this.field4631;
    }

    @ObfuscatedName("pf.ab()V")
    public void method6939() {
        while (this.field4631.field5074 != this.field4631) {
            this.field4631.field5074.method8218();
        }
    }

    @ObfuscatedName("pf.ay(Ltp;)V")
    public void method6940(class506 arg0) {
        if (arg0.field5076 != null) {
            arg0.method8218();
        }
        arg0.field5076 = this.field4631.field5076;
        arg0.field5074 = this.field4631;
        arg0.field5076.field5074 = arg0;
        arg0.field5074.field5076 = arg0;
    }

    @ObfuscatedName("pf.an(Ltp;)V")
    public void method6993(class506 arg0) {
        if (arg0.field5076 != null) {
            arg0.method8218();
        }
        arg0.field5076 = this.field4631;
        arg0.field5074 = this.field4631.field5074;
        arg0.field5076.field5074 = arg0;
        arg0.field5074.field5076 = arg0;
    }

    @ObfuscatedName("pf.au(Ltp;Ltp;)V")
    public static void method6996(class506 arg0, class506 arg1) {
        if (arg0.field5076 != null) {
            arg0.method8218();
        }
        arg0.field5076 = arg1;
        arg0.field5074 = arg1.field5074;
        arg0.field5076.field5074 = arg0;
        arg0.field5074.field5076 = arg0;
    }

    @ObfuscatedName("pf.ax()Ltp;")
    public class506 method6951() {
        return this.method6949((class506) null);
    }

    @ObfuscatedName("pf.ao(Ltp;)Ltp;")
    public class506 method6949(class506 arg0) {
        class506 var2;
        if (arg0 == null) {
            var2 = this.field4631.field5074;
        } else {
            var2 = arg0;
        }
        if (this.field4631 == var2) {
            this.field4630 = null;
            return null;
        } else {
            this.field4630 = var2.field5074;
            return var2;
        }
    }

    @ObfuscatedName("pf.am()Ltp;")
    public class506 method6945() {
        class506 var1 = this.field4630;
        if (this.field4631 == var1) {
            this.field4630 = null;
            return null;
        } else {
            this.field4630 = var1.field5074;
            return var1;
        }
    }

    @ObfuscatedName("pf.ac()I")
    public int method6946() {
        int var1 = 0;
        for (class506 var2 = this.field4631.field5074; var2 != this.field4631; var2 = var2.field5074) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("pf.ae()Z")
    public boolean method6947() {
        return this.field4631.field5074 == this.field4631;
    }

    @ObfuscatedName("pf.ad()[Ltp;")
    public class506[] method6948() {
        class506[] var1 = new class506[this.method6946()];
        int var2 = 0;
        for (class506 var3 = this.field4631.field5074; var3 != this.field4631; var3 = var3.field5074) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class409(this);
    }

    public int size() {
        return this.method6946();
    }

    public boolean isEmpty() {
        return this.method6947();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method6948();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class506 var3 = this.field4631.field5074; var3 != this.field4631; var3 = var3.field5074) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("pf.aq(Ltp;)Z")
    public boolean method6938(class506 arg0) {
        this.method6940(arg0);
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
        this.method6939();
    }

    public boolean add(Object arg0) {
        return this.method6938((class506) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
