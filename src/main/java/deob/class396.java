package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("ph")
public class class396 implements Iterable, Collection {

    @ObfuscatedName("ph.am")
    public class489 field4481 = new class489();

    @ObfuscatedName("ph.ap")
    public class489 field4480;

    public class396() {
        this.field4481.field4888 = this.field4481;
        this.field4481.field4890 = this.field4481;
    }

    @ObfuscatedName("ph.am()V")
    public void method6707() {
        while (this.field4481.field4888 != this.field4481) {
            this.field4481.field4888.method7988();
        }
    }

    @ObfuscatedName("ph.ap(Lse;)V")
    public void method6749(class489 arg0) {
        if (arg0.field4890 != null) {
            arg0.method7988();
        }
        arg0.field4890 = this.field4481.field4890;
        arg0.field4888 = this.field4481;
        arg0.field4890.field4888 = arg0;
        arg0.field4888.field4890 = arg0;
    }

    @ObfuscatedName("ph.af(Lse;)V")
    public void method6709(class489 arg0) {
        if (arg0.field4890 != null) {
            arg0.method7988();
        }
        arg0.field4890 = this.field4481;
        arg0.field4888 = this.field4481.field4888;
        arg0.field4890.field4888 = arg0;
        arg0.field4888.field4890 = arg0;
    }

    @ObfuscatedName("ph.aj(Lse;Lse;)V")
    public static void method6710(class489 arg0, class489 arg1) {
        if (arg0.field4890 != null) {
            arg0.method7988();
        }
        arg0.field4890 = arg1;
        arg0.field4888 = arg1.field4888;
        arg0.field4890.field4888 = arg0;
        arg0.field4888.field4890 = arg0;
    }

    @ObfuscatedName("ph.aq()Lse;")
    public class489 method6738() {
        return this.method6754((class489) null);
    }

    @ObfuscatedName("ph.ar(Lse;)Lse;")
    public class489 method6754(class489 arg0) {
        class489 var2;
        if (arg0 == null) {
            var2 = this.field4481.field4888;
        } else {
            var2 = arg0;
        }
        if (this.field4481 == var2) {
            this.field4480 = null;
            return null;
        } else {
            this.field4480 = var2.field4888;
            return var2;
        }
    }

    @ObfuscatedName("ph.ag()Lse;")
    public class489 method6724() {
        class489 var1 = this.field4480;
        if (this.field4481 == var1) {
            this.field4480 = null;
            return null;
        } else {
            this.field4480 = var1.field4888;
            return var1;
        }
    }

    @ObfuscatedName("ph.ao()I")
    public int method6714() {
        int var1 = 0;
        for (class489 var2 = this.field4481.field4888; var2 != this.field4481; var2 = var2.field4888) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("ph.ae()Z")
    public boolean method6711() {
        return this.field4481.field4888 == this.field4481;
    }

    @ObfuscatedName("ph.aa()[Lse;")
    public class489[] method6734() {
        class489[] var1 = new class489[this.method6714()];
        int var2 = 0;
        for (class489 var3 = this.field4481.field4888; var3 != this.field4481; var3 = var3.field4888) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class395(this);
    }

    public int size() {
        return this.method6714();
    }

    public boolean isEmpty() {
        return this.method6711();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method6734();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class489 var3 = this.field4481.field4888; var3 != this.field4481; var3 = var3.field4888) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("ph.au(Lse;)Z")
    public boolean method6727(class489 arg0) {
        this.method6749(arg0);
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
        this.method6707();
    }

    public boolean add(Object arg0) {
        return this.method6727((class489) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
