package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("lt")
public class class328 implements Iterable, Collection {

    @ObfuscatedName("lt.c")
    public class392 field4016 = new class392();

    @ObfuscatedName("lt.l")
    public class392 field4015;

    public class328() {
        this.field4016.field4300 = this.field4016;
        this.field4016.field4302 = this.field4016;
    }

    @ObfuscatedName("lt.c()V")
    public void method5307() {
        while (this.field4016.field4300 != this.field4016) {
            this.field4016.field4300.method6167();
        }
    }

    @ObfuscatedName("lt.l(Loe;)V")
    public void method5347(class392 arg0) {
        if (arg0.field4302 != null) {
            arg0.method6167();
        }
        arg0.field4302 = this.field4016.field4302;
        arg0.field4300 = this.field4016;
        arg0.field4302.field4300 = arg0;
        arg0.field4300.field4302 = arg0;
    }

    @ObfuscatedName("lt.s(Loe;)V")
    public void method5309(class392 arg0) {
        if (arg0.field4302 != null) {
            arg0.method6167();
        }
        arg0.field4302 = this.field4016;
        arg0.field4300 = this.field4016.field4300;
        arg0.field4302.field4300 = arg0;
        arg0.field4300.field4302 = arg0;
    }

    @ObfuscatedName("lt.e(Loe;Loe;)V")
    public static void method5310(class392 arg0, class392 arg1) {
        if (arg0.field4302 != null) {
            arg0.method6167();
        }
        arg0.field4302 = arg1;
        arg0.field4300 = arg1.field4300;
        arg0.field4302.field4300 = arg0;
        arg0.field4300.field4302 = arg0;
    }

    @ObfuscatedName("lt.r()Loe;")
    public class392 method5311() {
        return this.method5312((class392) null);
    }

    @ObfuscatedName("lt.o(Loe;)Loe;")
    public class392 method5312(class392 arg0) {
        class392 var2;
        if (arg0 == null) {
            var2 = this.field4016.field4300;
        } else {
            var2 = arg0;
        }
        if (this.field4016 == var2) {
            this.field4015 = null;
            return null;
        } else {
            this.field4015 = var2.field4300;
            return var2;
        }
    }

    @ObfuscatedName("lt.i()Loe;")
    public class392 method5313() {
        class392 var1 = this.field4015;
        if (this.field4016 == var1) {
            this.field4015 = null;
            return null;
        } else {
            this.field4015 = var1.field4300;
            return var1;
        }
    }

    @ObfuscatedName("lt.w()I")
    public int method5314() {
        int var1 = 0;
        for (class392 var2 = this.field4016.field4300; var2 != this.field4016; var2 = var2.field4300) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("lt.v()Z")
    public boolean method5315() {
        return this.field4016.field4300 == this.field4016;
    }

    @ObfuscatedName("lt.a()[Loe;")
    public class392[] method5381() {
        class392[] var1 = new class392[this.method5314()];
        int var2 = 0;
        for (class392 var3 = this.field4016.field4300; var3 != this.field4016; var3 = var3.field4300) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class327(this);
    }

    public int size() {
        return this.method5314();
    }

    public boolean isEmpty() {
        return this.method5315();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method5381();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class392 var3 = this.field4016.field4300; var3 != this.field4016; var3 = var3.field4300) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("lt.y(Loe;)Z")
    public boolean method5318(class392 arg0) {
        this.method5347(arg0);
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
        this.method5307();
    }

    public boolean add(Object arg0) {
        return this.method5318((class392) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
