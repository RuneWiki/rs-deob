package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("oi")
public class class365 implements Iterable, Collection {

    @ObfuscatedName("oi.af")
    public class449 field4360 = new class449();

    @ObfuscatedName("oi.an")
    public class449 field4361;

    public class365() {
        this.field4360.field4746 = this.field4360;
        this.field4360.field4747 = this.field4360;
    }

    @ObfuscatedName("oi.af()V")
    public void method6366() {
        while (this.field4360.field4746 != this.field4360) {
            this.field4360.field4746.method7651();
        }
    }

    @ObfuscatedName("oi.an(Lrp;)V")
    public void method6408(class449 arg0) {
        if (arg0.field4747 != null) {
            arg0.method7651();
        }
        arg0.field4747 = this.field4360.field4747;
        arg0.field4746 = this.field4360;
        arg0.field4747.field4746 = arg0;
        arg0.field4746.field4747 = arg0;
    }

    @ObfuscatedName("oi.aw(Lrp;)V")
    public void method6383(class449 arg0) {
        if (arg0.field4747 != null) {
            arg0.method7651();
        }
        arg0.field4747 = this.field4360;
        arg0.field4746 = this.field4360.field4746;
        arg0.field4747.field4746 = arg0;
        arg0.field4746.field4747 = arg0;
    }

    @ObfuscatedName("oi.ac(Lrp;Lrp;)V")
    public static void method6369(class449 arg0, class449 arg1) {
        if (arg0.field4747 != null) {
            arg0.method7651();
        }
        arg0.field4747 = arg1;
        arg0.field4746 = arg1.field4746;
        arg0.field4747.field4746 = arg0;
        arg0.field4746.field4747 = arg0;
    }

    @ObfuscatedName("oi.au()Lrp;")
    public class449 method6413() {
        return this.method6426((class449) null);
    }

    @ObfuscatedName("oi.ab(Lrp;)Lrp;")
    public class449 method6426(class449 arg0) {
        class449 var2;
        if (arg0 == null) {
            var2 = this.field4360.field4746;
        } else {
            var2 = arg0;
        }
        if (this.field4360 == var2) {
            this.field4361 = null;
            return null;
        } else {
            this.field4361 = var2.field4746;
            return var2;
        }
    }

    @ObfuscatedName("oi.aq()Lrp;")
    public class449 method6380() {
        class449 var1 = this.field4361;
        if (this.field4360 == var1) {
            this.field4361 = null;
            return null;
        } else {
            this.field4361 = var1.field4746;
            return var1;
        }
    }

    @ObfuscatedName("oi.al()I")
    public int method6424() {
        int var1 = 0;
        for (class449 var2 = this.field4360.field4746; var2 != this.field4360; var2 = var2.field4746) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("oi.at()Z")
    public boolean method6370() {
        return this.field4360.field4746 == this.field4360;
    }

    @ObfuscatedName("oi.aa()[Lrp;")
    public class449[] method6425() {
        class449[] var1 = new class449[this.method6424()];
        int var2 = 0;
        for (class449 var3 = this.field4360.field4746; var3 != this.field4360; var3 = var3.field4746) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class364(this);
    }

    public int size() {
        return this.method6424();
    }

    public boolean isEmpty() {
        return this.method6370();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method6425();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class449 var3 = this.field4360.field4746; var3 != this.field4360; var3 = var3.field4746) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("oi.ay(Lrp;)Z")
    public boolean method6377(class449 arg0) {
        this.method6408(arg0);
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
        this.method6366();
    }

    public boolean add(Object arg0) {
        return this.method6377((class449) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
