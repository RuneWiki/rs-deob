package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("pi")
public class class409 implements Iterable, Collection {

    @ObfuscatedName("pi.aq")
    public class505 field4660 = new class505();

    @ObfuscatedName("pi.ad")
    public class505 field4659;

    public class409() {
        this.field4660.field5083 = this.field4660;
        this.field4660.field5081 = this.field4660;
    }

    @ObfuscatedName("pi.aq()V")
    public void method6838() {
        while (this.field4660.field5083 != this.field4660) {
            this.field4660.field5083.method8130();
        }
    }

    @ObfuscatedName("pi.ad(Ltz;)V")
    public void method6890(class505 arg0) {
        if (arg0.field5081 != null) {
            arg0.method8130();
        }
        arg0.field5081 = this.field4660.field5081;
        arg0.field5083 = this.field4660;
        arg0.field5081.field5083 = arg0;
        arg0.field5083.field5081 = arg0;
    }

    @ObfuscatedName("pi.ag(Ltz;)V")
    public void method6840(class505 arg0) {
        if (arg0.field5081 != null) {
            arg0.method8130();
        }
        arg0.field5081 = this.field4660;
        arg0.field5083 = this.field4660.field5083;
        arg0.field5081.field5083 = arg0;
        arg0.field5083.field5081 = arg0;
    }

    @ObfuscatedName("pi.ak(Ltz;Ltz;)V")
    public static void method6869(class505 arg0, class505 arg1) {
        if (arg0.field5081 != null) {
            arg0.method8130();
        }
        arg0.field5081 = arg1;
        arg0.field5083 = arg1.field5083;
        arg0.field5081.field5083 = arg0;
        arg0.field5083.field5081 = arg0;
    }

    @ObfuscatedName("pi.ap()Ltz;")
    public class505 method6842() {
        return this.method6857((class505) null);
    }

    @ObfuscatedName("pi.an(Ltz;)Ltz;")
    public class505 method6857(class505 arg0) {
        class505 var2;
        if (arg0 == null) {
            var2 = this.field4660.field5083;
        } else {
            var2 = arg0;
        }
        if (this.field4660 == var2) {
            this.field4659 = null;
            return null;
        } else {
            this.field4659 = var2.field5083;
            return var2;
        }
    }

    @ObfuscatedName("pi.aj()Ltz;")
    public class505 method6844() {
        class505 var1 = this.field4659;
        if (this.field4660 == var1) {
            this.field4659 = null;
            return null;
        } else {
            this.field4659 = var1.field5083;
            return var1;
        }
    }

    @ObfuscatedName("pi.av()I")
    public int method6884() {
        int var1 = 0;
        for (class505 var2 = this.field4660.field5083; var2 != this.field4660; var2 = var2.field5083) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("pi.ab()Z")
    public boolean method6839() {
        return this.field4660.field5083 == this.field4660;
    }

    @ObfuscatedName("pi.ai()[Ltz;")
    public class505[] method6843() {
        class505[] var1 = new class505[this.method6884()];
        int var2 = 0;
        for (class505 var3 = this.field4660.field5083; var3 != this.field4660; var3 = var3.field5083) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class408(this);
    }

    public int size() {
        return this.method6884();
    }

    public boolean isEmpty() {
        return this.method6839();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method6843();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class505 var3 = this.field4660.field5083; var3 != this.field4660; var3 = var3.field5083) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("pi.ae(Ltz;)Z")
    public boolean method6871(class505 arg0) {
        this.method6890(arg0);
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
        this.method6838();
    }

    public boolean add(Object arg0) {
        return this.method6871((class505) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
