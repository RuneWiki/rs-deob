package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("lr")
public class class323 implements Iterable, Collection {

    @ObfuscatedName("lr.c")
    public class387 field3967 = new class387();

    @ObfuscatedName("lr.b")
    public class387 field3968;

    public class323() {
        this.field3967.field4258 = this.field3967;
        this.field3967.field4259 = this.field3967;
    }

    @ObfuscatedName("lr.c()V")
    public void method5344() {
        while (this.field3967.field4258 != this.field3967) {
            this.field3967.field4258.method6163();
        }
    }

    @ObfuscatedName("lr.b(Lnw;)V")
    public void method5345(class387 arg0) {
        if (arg0.field4259 != null) {
            arg0.method6163();
        }
        arg0.field4259 = this.field3967.field4259;
        arg0.field4258 = this.field3967;
        arg0.field4259.field4258 = arg0;
        arg0.field4258.field4259 = arg0;
    }

    @ObfuscatedName("lr.p(Lnw;)V")
    public void method5346(class387 arg0) {
        if (arg0.field4259 != null) {
            arg0.method6163();
        }
        arg0.field4259 = this.field3967;
        arg0.field4258 = this.field3967.field4258;
        arg0.field4259.field4258 = arg0;
        arg0.field4258.field4259 = arg0;
    }

    @ObfuscatedName("lr.m(Lnw;Lnw;)V")
    public static void method5347(class387 arg0, class387 arg1) {
        if (arg0.field4259 != null) {
            arg0.method6163();
        }
        arg0.field4259 = arg1;
        arg0.field4258 = arg1.field4258;
        arg0.field4259.field4258 = arg0;
        arg0.field4258.field4259 = arg0;
    }

    @ObfuscatedName("lr.t()Lnw;")
    public class387 method5348() {
        return this.method5349((class387) null);
    }

    @ObfuscatedName("lr.s(Lnw;)Lnw;")
    public class387 method5349(class387 arg0) {
        class387 var2;
        if (arg0 == null) {
            var2 = this.field3967.field4258;
        } else {
            var2 = arg0;
        }
        if (this.field3967 == var2) {
            this.field3968 = null;
            return null;
        } else {
            this.field3968 = var2.field4258;
            return var2;
        }
    }

    @ObfuscatedName("lr.j()Lnw;")
    public class387 method5350() {
        class387 var1 = this.field3968;
        if (this.field3967 == var1) {
            this.field3968 = null;
            return null;
        } else {
            this.field3968 = var1.field4258;
            return var1;
        }
    }

    @ObfuscatedName("lr.w()I")
    public int method5351() {
        int var1 = 0;
        for (class387 var2 = this.field3967.field4258; var2 != this.field3967; var2 = var2.field4258) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("lr.n()Z")
    public boolean method5352() {
        return this.field3967.field4258 == this.field3967;
    }

    @ObfuscatedName("lr.r()[Lnw;")
    public class387[] method5409() {
        class387[] var1 = new class387[this.method5351()];
        int var2 = 0;
        for (class387 var3 = this.field3967.field4258; var3 != this.field3967; var3 = var3.field4258) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class322(this);
    }

    public int size() {
        return this.method5351();
    }

    public boolean isEmpty() {
        return this.method5352();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method5409();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class387 var3 = this.field3967.field4258; var3 != this.field3967; var3 = var3.field4258) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("lr.o(Lnw;)Z")
    public boolean method5355(class387 arg0) {
        this.method5345(arg0);
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
        this.method5344();
    }

    public boolean add(Object arg0) {
        return this.method5355((class387) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
