package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("pr")
public class class400 implements Iterable, Collection {

    @ObfuscatedName("pr.az")
    public class493 field4546 = new class493();

    @ObfuscatedName("pr.ah")
    public class493 field4545;

    public class400() {
        this.field4546.field4950 = this.field4546;
        this.field4546.field4952 = this.field4546;
    }

    @ObfuscatedName("pr.az()V")
    public void method6674() {
        while (this.field4546.field4950 != this.field4546) {
            this.field4546.field4950.method7855();
        }
    }

    @ObfuscatedName("pr.ah(Lsu;)V")
    public void method6647(class493 arg0) {
        if (arg0.field4952 != null) {
            arg0.method7855();
        }
        arg0.field4952 = this.field4546.field4952;
        arg0.field4950 = this.field4546;
        arg0.field4952.field4950 = arg0;
        arg0.field4950.field4952 = arg0;
    }

    @ObfuscatedName("pr.af(Lsu;)V")
    public void method6690(class493 arg0) {
        if (arg0.field4952 != null) {
            arg0.method7855();
        }
        arg0.field4952 = this.field4546;
        arg0.field4950 = this.field4546.field4950;
        arg0.field4952.field4950 = arg0;
        arg0.field4950.field4952 = arg0;
    }

    @ObfuscatedName("pr.at(Lsu;Lsu;)V")
    public static void method6648(class493 arg0, class493 arg1) {
        if (arg0.field4952 != null) {
            arg0.method7855();
        }
        arg0.field4952 = arg1;
        arg0.field4950 = arg1.field4950;
        arg0.field4952.field4950 = arg0;
        arg0.field4950.field4952 = arg0;
    }

    @ObfuscatedName("pr.an()Lsu;")
    public class493 method6649() {
        return this.method6684((class493) null);
    }

    @ObfuscatedName("pr.ao(Lsu;)Lsu;")
    public class493 method6684(class493 arg0) {
        class493 var2;
        if (arg0 == null) {
            var2 = this.field4546.field4950;
        } else {
            var2 = arg0;
        }
        if (this.field4546 == var2) {
            this.field4545 = null;
            return null;
        } else {
            this.field4545 = var2.field4950;
            return var2;
        }
    }

    @ObfuscatedName("pr.ab()Lsu;")
    public class493 method6650() {
        class493 var1 = this.field4545;
        if (this.field4546 == var1) {
            this.field4545 = null;
            return null;
        } else {
            this.field4545 = var1.field4950;
            return var1;
        }
    }

    @ObfuscatedName("pr.aw()I")
    public int method6651() {
        int var1 = 0;
        for (class493 var2 = this.field4546.field4950; var2 != this.field4546; var2 = var2.field4950) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("pr.ad()Z")
    public boolean method6714() {
        return this.field4546.field4950 == this.field4546;
    }

    @ObfuscatedName("pr.al()[Lsu;")
    public class493[] method6653() {
        class493[] var1 = new class493[this.method6651()];
        int var2 = 0;
        for (class493 var3 = this.field4546.field4950; var3 != this.field4546; var3 = var3.field4950) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class399(this);
    }

    public int size() {
        return this.method6651();
    }

    public boolean isEmpty() {
        return this.method6714();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method6653();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class493 var3 = this.field4546.field4950; var3 != this.field4546; var3 = var3.field4950) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("pr.as(Lsu;)Z")
    public boolean method6706(class493 arg0) {
        this.method6647(arg0);
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
        this.method6674();
    }

    public boolean add(Object arg0) {
        return this.method6706((class493) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
