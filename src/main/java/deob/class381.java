package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("or")
public class class381 implements Iterable, Collection {

    @ObfuscatedName("or.aw")
    public class474 field4418 = new class474();

    @ObfuscatedName("or.ay")
    public class474 field4419;

    public class381() {
        this.field4418.field4820 = this.field4418;
        this.field4418.field4818 = this.field4418;
    }

    @ObfuscatedName("or.aw()V")
    public void method6475() {
        while (this.field4418.field4820 != this.field4418) {
            this.field4418.field4820.method7662();
        }
    }

    @ObfuscatedName("or.ay(Lsb;)V")
    public void method6446(class474 arg0) {
        if (arg0.field4818 != null) {
            arg0.method7662();
        }
        arg0.field4818 = this.field4418.field4818;
        arg0.field4820 = this.field4418;
        arg0.field4818.field4820 = arg0;
        arg0.field4820.field4818 = arg0;
    }

    @ObfuscatedName("or.ar(Lsb;)V")
    public void method6417(class474 arg0) {
        if (arg0.field4818 != null) {
            arg0.method7662();
        }
        arg0.field4818 = this.field4418;
        arg0.field4820 = this.field4418.field4820;
        arg0.field4818.field4820 = arg0;
        arg0.field4820.field4818 = arg0;
    }

    @ObfuscatedName("or.am(Lsb;Lsb;)V")
    public static void method6418(class474 arg0, class474 arg1) {
        if (arg0.field4818 != null) {
            arg0.method7662();
        }
        arg0.field4818 = arg1;
        arg0.field4820 = arg1.field4820;
        arg0.field4818.field4820 = arg0;
        arg0.field4820.field4818 = arg0;
    }

    @ObfuscatedName("or.as()Lsb;")
    public class474 method6419() {
        return this.method6420((class474) null);
    }

    @ObfuscatedName("or.aj(Lsb;)Lsb;")
    public class474 method6420(class474 arg0) {
        class474 var2;
        if (arg0 == null) {
            var2 = this.field4418.field4820;
        } else {
            var2 = arg0;
        }
        if (this.field4418 == var2) {
            this.field4419 = null;
            return null;
        } else {
            this.field4419 = var2.field4820;
            return var2;
        }
    }

    @ObfuscatedName("or.ag()Lsb;")
    public class474 method6421() {
        class474 var1 = this.field4419;
        if (this.field4418 == var1) {
            this.field4419 = null;
            return null;
        } else {
            this.field4419 = var1.field4820;
            return var1;
        }
    }

    @ObfuscatedName("or.az()I")
    public int method6422() {
        int var1 = 0;
        for (class474 var2 = this.field4418.field4820; var2 != this.field4418; var2 = var2.field4820) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("or.av()Z")
    public boolean method6423() {
        return this.field4418.field4820 == this.field4418;
    }

    @ObfuscatedName("or.ap()[Lsb;")
    public class474[] method6455() {
        class474[] var1 = new class474[this.method6422()];
        int var2 = 0;
        for (class474 var3 = this.field4418.field4820; var3 != this.field4418; var3 = var3.field4820) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class380(this);
    }

    public int size() {
        return this.method6422();
    }

    public boolean isEmpty() {
        return this.method6423();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method6455();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class474 var3 = this.field4418.field4820; var3 != this.field4418; var3 = var3.field4820) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("or.aq(Lsb;)Z")
    public boolean method6486(class474 arg0) {
        this.method6446(arg0);
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
        this.method6475();
    }

    public boolean add(Object arg0) {
        return this.method6486((class474) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
