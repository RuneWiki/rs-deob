package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("ni")
public class class361 implements Iterable, Collection {

    @ObfuscatedName("ni.aj")
    public class444 field4324 = new class444();

    @ObfuscatedName("ni.al")
    public class444 field4323;

    public class361() {
        this.field4324.field4672 = this.field4324;
        this.field4324.field4674 = this.field4324;
    }

    @ObfuscatedName("ni.aj()V")
    public void method6137() {
        while (this.field4324.field4672 != this.field4324) {
            this.field4324.field4672.method7335();
        }
    }

    @ObfuscatedName("ni.al(Lru;)V")
    public void method6158(class444 arg0) {
        if (arg0.field4674 != null) {
            arg0.method7335();
        }
        arg0.field4674 = this.field4324.field4674;
        arg0.field4672 = this.field4324;
        arg0.field4674.field4672 = arg0;
        arg0.field4672.field4674 = arg0;
    }

    @ObfuscatedName("ni.ac(Lru;)V")
    public void method6139(class444 arg0) {
        if (arg0.field4674 != null) {
            arg0.method7335();
        }
        arg0.field4674 = this.field4324;
        arg0.field4672 = this.field4324.field4672;
        arg0.field4674.field4672 = arg0;
        arg0.field4672.field4674 = arg0;
    }

    @ObfuscatedName("ni.ab(Lru;Lru;)V")
    public static void method6210(class444 arg0, class444 arg1) {
        if (arg0.field4674 != null) {
            arg0.method7335();
        }
        arg0.field4674 = arg1;
        arg0.field4672 = arg1.field4672;
        arg0.field4674.field4672 = arg0;
        arg0.field4672.field4674 = arg0;
    }

    @ObfuscatedName("ni.an()Lru;")
    public class444 method6141() {
        return this.method6185((class444) null);
    }

    @ObfuscatedName("ni.ao(Lru;)Lru;")
    public class444 method6185(class444 arg0) {
        class444 var2;
        if (arg0 == null) {
            var2 = this.field4324.field4672;
        } else {
            var2 = arg0;
        }
        if (this.field4324 == var2) {
            this.field4323 = null;
            return null;
        } else {
            this.field4323 = var2.field4672;
            return var2;
        }
    }

    @ObfuscatedName("ni.av()Lru;")
    public class444 method6147() {
        class444 var1 = this.field4323;
        if (this.field4324 == var1) {
            this.field4323 = null;
            return null;
        } else {
            this.field4323 = var1.field4672;
            return var1;
        }
    }

    @ObfuscatedName("ni.aq()I")
    public int method6144() {
        int var1 = 0;
        for (class444 var2 = this.field4324.field4672; var2 != this.field4324; var2 = var2.field4672) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("ni.ap()Z")
    public boolean method6145() {
        return this.field4324.field4672 == this.field4324;
    }

    @ObfuscatedName("ni.ar()[Lru;")
    public class444[] method6146() {
        class444[] var1 = new class444[this.method6144()];
        int var2 = 0;
        for (class444 var3 = this.field4324.field4672; var3 != this.field4324; var3 = var3.field4672) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class360(this);
    }

    public int size() {
        return this.method6144();
    }

    public boolean isEmpty() {
        return this.method6145();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method6146();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class444 var3 = this.field4324.field4672; var3 != this.field4324; var3 = var3.field4672) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("ni.ak(Lru;)Z")
    public boolean method6202(class444 arg0) {
        this.method6158(arg0);
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
        this.method6137();
    }

    public boolean add(Object arg0) {
        return this.method6202((class444) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
