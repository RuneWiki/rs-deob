package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("om")
public class class378 implements Iterable, Collection {

    @ObfuscatedName("om.at")
    public class461 field4381 = new class461();

    @ObfuscatedName("om.an")
    public class461 field4380;

    public class378() {
        this.field4381.field4756 = this.field4381;
        this.field4381.field4755 = this.field4381;
    }

    @ObfuscatedName("om.at()V")
    public void method6405() {
        while (this.field4381.field4756 != this.field4381) {
            this.field4381.field4756.method7560();
        }
    }

    @ObfuscatedName("om.an(Lrz;)V")
    public void method6357(class461 arg0) {
        if (arg0.field4755 != null) {
            arg0.method7560();
        }
        arg0.field4755 = this.field4381.field4755;
        arg0.field4756 = this.field4381;
        arg0.field4755.field4756 = arg0;
        arg0.field4756.field4755 = arg0;
    }

    @ObfuscatedName("om.av(Lrz;)V")
    public void method6358(class461 arg0) {
        if (arg0.field4755 != null) {
            arg0.method7560();
        }
        arg0.field4755 = this.field4381;
        arg0.field4756 = this.field4381.field4756;
        arg0.field4755.field4756 = arg0;
        arg0.field4756.field4755 = arg0;
    }

    @ObfuscatedName("om.as(Lrz;Lrz;)V")
    public static void method6359(class461 arg0, class461 arg1) {
        if (arg0.field4755 != null) {
            arg0.method7560();
        }
        arg0.field4755 = arg1;
        arg0.field4756 = arg1.field4756;
        arg0.field4755.field4756 = arg0;
        arg0.field4756.field4755 = arg0;
    }

    @ObfuscatedName("om.ax()Lrz;")
    public class461 method6360() {
        return this.method6418((class461) null);
    }

    @ObfuscatedName("om.ap(Lrz;)Lrz;")
    public class461 method6418(class461 arg0) {
        class461 var2;
        if (arg0 == null) {
            var2 = this.field4381.field4756;
        } else {
            var2 = arg0;
        }
        if (this.field4381 == var2) {
            this.field4380 = null;
            return null;
        } else {
            this.field4380 = var2.field4756;
            return var2;
        }
    }

    @ObfuscatedName("om.ab()Lrz;")
    public class461 method6362() {
        class461 var1 = this.field4380;
        if (this.field4381 == var1) {
            this.field4380 = null;
            return null;
        } else {
            this.field4380 = var1.field4756;
            return var1;
        }
    }

    @ObfuscatedName("om.ak()I")
    public int method6383() {
        int var1 = 0;
        for (class461 var2 = this.field4381.field4756; var2 != this.field4381; var2 = var2.field4756) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("om.ae()Z")
    public boolean method6363() {
        return this.field4381.field4756 == this.field4381;
    }

    @ObfuscatedName("om.af()[Lrz;")
    public class461[] method6364() {
        class461[] var1 = new class461[this.method6383()];
        int var2 = 0;
        for (class461 var3 = this.field4381.field4756; var3 != this.field4381; var3 = var3.field4756) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class377(this);
    }

    public int size() {
        return this.method6383();
    }

    public boolean isEmpty() {
        return this.method6363();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method6364();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class461 var3 = this.field4381.field4756; var3 != this.field4381; var3 = var3.field4756) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("om.ao(Lrz;)Z")
    public boolean method6365(class461 arg0) {
        this.method6357(arg0);
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
        this.method6405();
    }

    public boolean add(Object arg0) {
        return this.method6365((class461) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
