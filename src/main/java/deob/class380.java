package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("oc")
public class class380 implements Iterable, Collection {

    @ObfuscatedName("oc.au")
    public class473 field4414 = new class473();

    @ObfuscatedName("oc.ae")
    public class473 field4415;

    public class380() {
        this.field4414.field4813 = this.field4414;
        this.field4414.field4815 = this.field4414;
    }

    @ObfuscatedName("oc.au()V")
    public void method6438() {
        while (this.field4414.field4813 != this.field4414) {
            this.field4414.field4813.method7700();
        }
    }

    @ObfuscatedName("oc.ae(Lsj;)V")
    public void method6439(class473 arg0) {
        if (arg0.field4815 != null) {
            arg0.method7700();
        }
        arg0.field4815 = this.field4414.field4815;
        arg0.field4813 = this.field4414;
        arg0.field4815.field4813 = arg0;
        arg0.field4813.field4815 = arg0;
    }

    @ObfuscatedName("oc.ao(Lsj;)V")
    public void method6514(class473 arg0) {
        if (arg0.field4815 != null) {
            arg0.method7700();
        }
        arg0.field4815 = this.field4414;
        arg0.field4813 = this.field4414.field4813;
        arg0.field4815.field4813 = arg0;
        arg0.field4813.field4815 = arg0;
    }

    @ObfuscatedName("oc.at(Lsj;Lsj;)V")
    public static void method6483(class473 arg0, class473 arg1) {
        if (arg0.field4815 != null) {
            arg0.method7700();
        }
        arg0.field4815 = arg1;
        arg0.field4813 = arg1.field4813;
        arg0.field4815.field4813 = arg0;
        arg0.field4813.field4815 = arg0;
    }

    @ObfuscatedName("oc.ac()Lsj;")
    public class473 method6457() {
        return this.method6442((class473) null);
    }

    @ObfuscatedName("oc.ai(Lsj;)Lsj;")
    public class473 method6442(class473 arg0) {
        class473 var2;
        if (arg0 == null) {
            var2 = this.field4414.field4813;
        } else {
            var2 = arg0;
        }
        if (this.field4414 == var2) {
            this.field4415 = null;
            return null;
        } else {
            this.field4415 = var2.field4813;
            return var2;
        }
    }

    @ObfuscatedName("oc.az()Lsj;")
    public class473 method6443() {
        class473 var1 = this.field4415;
        if (this.field4414 == var1) {
            this.field4415 = null;
            return null;
        } else {
            this.field4415 = var1.field4813;
            return var1;
        }
    }

    @ObfuscatedName("oc.ap()I")
    public int method6502() {
        int var1 = 0;
        for (class473 var2 = this.field4414.field4813; var2 != this.field4414; var2 = var2.field4813) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("oc.aa()Z")
    public boolean method6446() {
        return this.field4414.field4813 == this.field4414;
    }

    @ObfuscatedName("oc.af()[Lsj;")
    public class473[] method6445() {
        class473[] var1 = new class473[this.method6502()];
        int var2 = 0;
        for (class473 var3 = this.field4414.field4813; var3 != this.field4414; var3 = var3.field4813) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class379(this);
    }

    public int size() {
        return this.method6502();
    }

    public boolean isEmpty() {
        return this.method6446();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method6445();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class473 var3 = this.field4414.field4813; var3 != this.field4414; var3 = var3.field4813) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("oc.ad(Lsj;)Z")
    public boolean method6448(class473 arg0) {
        this.method6439(arg0);
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
        this.method6438();
    }

    public boolean add(Object arg0) {
        return this.method6448((class473) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
