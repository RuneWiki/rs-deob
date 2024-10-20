package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("pr")
public class class412 implements Iterable, Collection {

    @ObfuscatedName("pr.ac")
    public class508 field4681 = new class508();

    @ObfuscatedName("pr.ae")
    public class508 field4682;

    public class412() {
        this.field4681.field5123 = this.field4681;
        this.field4681.field5121 = this.field4681;
    }

    @ObfuscatedName("pr.ac()V")
    public void method7068() {
        while (this.field4681.field5123 != this.field4681) {
            this.field4681.field5123.method8362();
        }
    }

    @ObfuscatedName("pr.ae(Lto;)V")
    public void method7139(class508 arg0) {
        if (arg0.field5121 != null) {
            arg0.method8362();
        }
        arg0.field5121 = this.field4681.field5121;
        arg0.field5123 = this.field4681;
        arg0.field5121.field5123 = arg0;
        arg0.field5123.field5121 = arg0;
    }

    @ObfuscatedName("pr.ag(Lto;)V")
    public void method7070(class508 arg0) {
        if (arg0.field5121 != null) {
            arg0.method8362();
        }
        arg0.field5121 = this.field4681;
        arg0.field5123 = this.field4681.field5123;
        arg0.field5121.field5123 = arg0;
        arg0.field5123.field5121 = arg0;
    }

    @ObfuscatedName("pr.am(Lto;Lto;)V")
    public static void method7088(class508 arg0, class508 arg1) {
        if (arg0.field5121 != null) {
            arg0.method8362();
        }
        arg0.field5121 = arg1;
        arg0.field5123 = arg1.field5123;
        arg0.field5121.field5123 = arg0;
        arg0.field5123.field5121 = arg0;
    }

    @ObfuscatedName("pr.ax()Lto;")
    public class508 method7126() {
        return this.method7072((class508) null);
    }

    @ObfuscatedName("pr.aq(Lto;)Lto;")
    public class508 method7072(class508 arg0) {
        class508 var2;
        if (arg0 == null) {
            var2 = this.field4681.field5123;
        } else {
            var2 = arg0;
        }
        if (this.field4681 == var2) {
            this.field4682 = null;
            return null;
        } else {
            this.field4682 = var2.field5123;
            return var2;
        }
    }

    @ObfuscatedName("pr.af()Lto;")
    public class508 method7084() {
        class508 var1 = this.field4682;
        if (this.field4681 == var1) {
            this.field4682 = null;
            return null;
        } else {
            this.field4682 = var1.field5123;
            return var1;
        }
    }

    @ObfuscatedName("pr.at()I")
    public int method7067() {
        int var1 = 0;
        for (class508 var2 = this.field4681.field5123; var2 != this.field4681; var2 = var2.field5123) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("pr.au()Z")
    public boolean method7075() {
        return this.field4681.field5123 == this.field4681;
    }

    @ObfuscatedName("pr.ar()[Lto;")
    public class508[] method7076() {
        class508[] var1 = new class508[this.method7067()];
        int var2 = 0;
        for (class508 var3 = this.field4681.field5123; var3 != this.field4681; var3 = var3.field5123) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class411(this);
    }

    public int size() {
        return this.method7067();
    }

    public boolean isEmpty() {
        return this.method7075();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method7076();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class508 var3 = this.field4681.field5123; var3 != this.field4681; var3 = var3.field5123) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("pr.al(Lto;)Z")
    public boolean method7069(class508 arg0) {
        this.method7139(arg0);
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
        this.method7068();
    }

    public boolean add(Object arg0) {
        return this.method7069((class508) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
