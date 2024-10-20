package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("ps")
public class class413 implements Iterable, Collection {

    @ObfuscatedName("ps.ap")
    public class515 field4730 = new class515();

    @ObfuscatedName("ps.aw")
    public class515 field4731;

    public class413() {
        this.field4730.field5171 = this.field4730;
        this.field4730.field5169 = this.field4730;
    }

    @ObfuscatedName("ps.ap()V")
    public void method7298() {
        while (this.field4730.field5171 != this.field4730) {
            this.field4730.field5171.method8667();
        }
    }

    @ObfuscatedName("ps.aw(Ltw;)V")
    public void method7299(class515 arg0) {
        if (arg0.field5169 != null) {
            arg0.method8667();
        }
        arg0.field5169 = this.field4730.field5169;
        arg0.field5171 = this.field4730;
        arg0.field5169.field5171 = arg0;
        arg0.field5171.field5169 = arg0;
    }

    @ObfuscatedName("ps.ak(Ltw;)V")
    public void method7300(class515 arg0) {
        if (arg0.field5169 != null) {
            arg0.method8667();
        }
        arg0.field5169 = this.field4730;
        arg0.field5171 = this.field4730.field5171;
        arg0.field5169.field5171 = arg0;
        arg0.field5171.field5169 = arg0;
    }

    @ObfuscatedName("ps.aj(Ltw;Ltw;)V")
    public static void method7333(class515 arg0, class515 arg1) {
        if (arg0.field5169 != null) {
            arg0.method8667();
        }
        arg0.field5169 = arg1;
        arg0.field5171 = arg1.field5171;
        arg0.field5169.field5171 = arg0;
        arg0.field5171.field5169 = arg0;
    }

    @ObfuscatedName("ps.ai()Ltw;")
    public class515 method7322() {
        return this.method7348((class515) null);
    }

    @ObfuscatedName("ps.ay(Ltw;)Ltw;")
    public class515 method7348(class515 arg0) {
        class515 var2;
        if (arg0 == null) {
            var2 = this.field4730.field5171;
        } else {
            var2 = arg0;
        }
        if (this.field4730 == var2) {
            this.field4731 = null;
            return null;
        } else {
            this.field4731 = var2.field5171;
            return var2;
        }
    }

    @ObfuscatedName("ps.as()Ltw;")
    public class515 method7303() {
        class515 var1 = this.field4731;
        if (this.field4730 == var1) {
            this.field4731 = null;
            return null;
        } else {
            this.field4731 = var1.field5171;
            return var1;
        }
    }

    @ObfuscatedName("ps.ae()I")
    public int method7304() {
        int var1 = 0;
        for (class515 var2 = this.field4730.field5171; var2 != this.field4730; var2 = var2.field5171) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("ps.am()Z")
    public boolean method7305() {
        return this.field4730.field5171 == this.field4730;
    }

    @ObfuscatedName("ps.at()[Ltw;")
    public class515[] method7306() {
        class515[] var1 = new class515[this.method7304()];
        int var2 = 0;
        for (class515 var3 = this.field4730.field5171; var3 != this.field4730; var3 = var3.field5171) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class412(this);
    }

    public int size() {
        return this.method7304();
    }

    public boolean isEmpty() {
        return this.method7305();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method7306();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class515 var3 = this.field4730.field5171; var3 != this.field4730; var3 = var3.field5171) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("ps.au(Ltw;)Z")
    public boolean method7309(class515 arg0) {
        this.method7299(arg0);
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
        this.method7298();
    }

    public boolean add(Object arg0) {
        return this.method7309((class515) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
