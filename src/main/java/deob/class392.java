package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("pm")
public class class392 implements Iterable, Collection {

    @ObfuscatedName("pm.at")
    public class485 field4441 = new class485();

    @ObfuscatedName("pm.ah")
    public class485 field4442;

    public class392() {
        this.field4441.field4850 = this.field4441;
        this.field4441.field4848 = this.field4441;
    }

    @ObfuscatedName("pm.at()V")
    public void method6600() {
        while (this.field4441.field4850 != this.field4441) {
            this.field4441.field4850.method7828();
        }
    }

    @ObfuscatedName("pm.ah(Lsh;)V")
    public void method6601(class485 arg0) {
        if (arg0.field4848 != null) {
            arg0.method7828();
        }
        arg0.field4848 = this.field4441.field4848;
        arg0.field4850 = this.field4441;
        arg0.field4848.field4850 = arg0;
        arg0.field4850.field4848 = arg0;
    }

    @ObfuscatedName("pm.ar(Lsh;)V")
    public void method6602(class485 arg0) {
        if (arg0.field4848 != null) {
            arg0.method7828();
        }
        arg0.field4848 = this.field4441;
        arg0.field4850 = this.field4441.field4850;
        arg0.field4848.field4850 = arg0;
        arg0.field4850.field4848 = arg0;
    }

    @ObfuscatedName("pm.ao(Lsh;Lsh;)V")
    public static void method6661(class485 arg0, class485 arg1) {
        if (arg0.field4848 != null) {
            arg0.method7828();
        }
        arg0.field4848 = arg1;
        arg0.field4850 = arg1.field4850;
        arg0.field4848.field4850 = arg0;
        arg0.field4850.field4848 = arg0;
    }

    @ObfuscatedName("pm.ab()Lsh;")
    public class485 method6604() {
        return this.method6605((class485) null);
    }

    @ObfuscatedName("pm.au(Lsh;)Lsh;")
    public class485 method6605(class485 arg0) {
        class485 var2;
        if (arg0 == null) {
            var2 = this.field4441.field4850;
        } else {
            var2 = arg0;
        }
        if (this.field4441 == var2) {
            this.field4442 = null;
            return null;
        } else {
            this.field4442 = var2.field4850;
            return var2;
        }
    }

    @ObfuscatedName("pm.aa()Lsh;")
    public class485 method6606() {
        class485 var1 = this.field4442;
        if (this.field4441 == var1) {
            this.field4442 = null;
            return null;
        } else {
            this.field4442 = var1.field4850;
            return var1;
        }
    }

    @ObfuscatedName("pm.ac()I")
    public int method6607() {
        int var1 = 0;
        for (class485 var2 = this.field4441.field4850; var2 != this.field4441; var2 = var2.field4850) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("pm.al()Z")
    public boolean method6666() {
        return this.field4441.field4850 == this.field4441;
    }

    @ObfuscatedName("pm.az()[Lsh;")
    public class485[] method6609() {
        class485[] var1 = new class485[this.method6607()];
        int var2 = 0;
        for (class485 var3 = this.field4441.field4850; var3 != this.field4441; var3 = var3.field4850) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class391(this);
    }

    public int size() {
        return this.method6607();
    }

    public boolean isEmpty() {
        return this.method6666();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method6609();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class485 var3 = this.field4441.field4850; var3 != this.field4441; var3 = var3.field4850) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("pm.ap(Lsh;)Z")
    public boolean method6611(class485 arg0) {
        this.method6601(arg0);
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
        this.method6600();
    }

    public boolean add(Object arg0) {
        return this.method6611((class485) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
