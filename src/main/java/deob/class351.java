package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("ml")
public class class351 implements Iterable, Collection {

    @ObfuscatedName("ml.a")
    public class430 field4280 = new class430();

    @ObfuscatedName("ml.f")
    public class430 field4281;

    public class351() {
        this.field4280.field4636 = this.field4280;
        this.field4280.field4637 = this.field4280;
    }

    @ObfuscatedName("ml.a()V")
    public void method6083() {
        while (this.field4280.field4636 != this.field4280) {
            this.field4280.field4636.method7170();
        }
    }

    @ObfuscatedName("ml.f(Lpk;)V")
    public void method6072(class430 arg0) {
        if (arg0.field4637 != null) {
            arg0.method7170();
        }
        arg0.field4637 = this.field4280.field4637;
        arg0.field4636 = this.field4280;
        arg0.field4637.field4636 = arg0;
        arg0.field4636.field4637 = arg0;
    }

    @ObfuscatedName("ml.c(Lpk;)V")
    public void method6073(class430 arg0) {
        if (arg0.field4637 != null) {
            arg0.method7170();
        }
        arg0.field4637 = this.field4280;
        arg0.field4636 = this.field4280.field4636;
        arg0.field4637.field4636 = arg0;
        arg0.field4636.field4637 = arg0;
    }

    @ObfuscatedName("ml.x(Lpk;Lpk;)V")
    public static void method6086(class430 arg0, class430 arg1) {
        if (arg0.field4637 != null) {
            arg0.method7170();
        }
        arg0.field4637 = arg1;
        arg0.field4636 = arg1.field4636;
        arg0.field4637.field4636 = arg0;
        arg0.field4636.field4637 = arg0;
    }

    @ObfuscatedName("ml.h()Lpk;")
    public class430 method6075() {
        return this.method6076((class430) null);
    }

    @ObfuscatedName("ml.j(Lpk;)Lpk;")
    public class430 method6076(class430 arg0) {
        class430 var2;
        if (arg0 == null) {
            var2 = this.field4280.field4636;
        } else {
            var2 = arg0;
        }
        if (this.field4280 == var2) {
            this.field4281 = null;
            return null;
        } else {
            this.field4281 = var2.field4636;
            return var2;
        }
    }

    @ObfuscatedName("ml.y()Lpk;")
    public class430 method6077() {
        class430 var1 = this.field4281;
        if (this.field4280 == var1) {
            this.field4281 = null;
            return null;
        } else {
            this.field4281 = var1.field4636;
            return var1;
        }
    }

    @ObfuscatedName("ml.d()I")
    public int method6097() {
        int var1 = 0;
        for (class430 var2 = this.field4280.field4636; var2 != this.field4280; var2 = var2.field4636) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("ml.n()Z")
    public boolean method6141() {
        return this.field4280.field4636 == this.field4280;
    }

    @ObfuscatedName("ml.r()[Lpk;")
    public class430[] method6080() {
        class430[] var1 = new class430[this.method6097()];
        int var2 = 0;
        for (class430 var3 = this.field4280.field4636; var3 != this.field4280; var3 = var3.field4636) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class350(this);
    }

    public int size() {
        return this.method6097();
    }

    public boolean isEmpty() {
        return this.method6141();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method6080();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class430 var3 = this.field4280.field4636; var3 != this.field4280; var3 = var3.field4636) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("ml.l(Lpk;)Z")
    public boolean method6079(class430 arg0) {
        this.method6072(arg0);
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
        this.method6083();
    }

    public boolean add(Object arg0) {
        return this.method6079((class430) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
