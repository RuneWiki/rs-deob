package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("kk")
public class class298 implements Iterable, Collection {

    @ObfuscatedName("kk.s")
    public class354 field3723 = new class354();

    @ObfuscatedName("kk.t")
    public class354 field3724;

    public class298() {
        this.field3723.field3965 = this.field3723;
        this.field3723.field3967 = this.field3723;
    }

    @ObfuscatedName("kk.s()V")
    public void method4796() {
        while (this.field3723.field3965 != this.field3723) {
            this.field3723.field3965.method5447();
        }
    }

    @ObfuscatedName("kk.t(Lml;)V")
    public void method4755(class354 arg0) {
        if (arg0.field3967 != null) {
            arg0.method5447();
        }
        arg0.field3967 = this.field3723.field3967;
        arg0.field3965 = this.field3723;
        arg0.field3967.field3965 = arg0;
        arg0.field3965.field3967 = arg0;
    }

    @ObfuscatedName("kk.v(Lml;)V")
    public void method4756(class354 arg0) {
        if (arg0.field3967 != null) {
            arg0.method5447();
        }
        arg0.field3967 = this.field3723;
        arg0.field3965 = this.field3723.field3965;
        arg0.field3967.field3965 = arg0;
        arg0.field3965.field3967 = arg0;
    }

    @ObfuscatedName("kk.j(Lml;Lml;)V")
    public static void method4811(class354 arg0, class354 arg1) {
        if (arg0.field3967 != null) {
            arg0.method5447();
        }
        arg0.field3967 = arg1;
        arg0.field3965 = arg1.field3965;
        arg0.field3967.field3965 = arg0;
        arg0.field3965.field3967 = arg0;
    }

    @ObfuscatedName("kk.l()Lml;")
    public class354 method4758() {
        return this.method4759((class354) null);
    }

    @ObfuscatedName("kk.n(Lml;)Lml;")
    public class354 method4759(class354 arg0) {
        class354 var2;
        if (arg0 == null) {
            var2 = this.field3723.field3965;
        } else {
            var2 = arg0;
        }
        if (this.field3723 == var2) {
            this.field3724 = null;
            return null;
        } else {
            this.field3724 = var2.field3965;
            return var2;
        }
    }

    @ObfuscatedName("kk.w()Lml;")
    public class354 method4760() {
        class354 var1 = this.field3724;
        if (this.field3723 == var1) {
            this.field3724 = null;
            return null;
        } else {
            this.field3724 = var1.field3965;
            return var1;
        }
    }

    @ObfuscatedName("kk.f()I")
    public int method4767() {
        int var1 = 0;
        for (class354 var2 = this.field3723.field3965; var2 != this.field3723; var2 = var2.field3965) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("kk.o()Z")
    public boolean method4821() {
        return this.field3723.field3965 == this.field3723;
    }

    @ObfuscatedName("kk.x()[Lml;")
    public class354[] method4763() {
        class354[] var1 = new class354[this.method4767()];
        int var2 = 0;
        for (class354 var3 = this.field3723.field3965; var3 != this.field3723; var3 = var3.field3965) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class297(this);
    }

    public int size() {
        return this.method4767();
    }

    public boolean isEmpty() {
        return this.method4821();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method4763();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class354 var3 = this.field3723.field3965; var3 != this.field3723; var3 = var3.field3965) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("kk.r(Lml;)Z")
    public boolean method4766(class354 arg0) {
        this.method4755(arg0);
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
        this.method4796();
    }

    public boolean add(Object arg0) {
        return this.method4766((class354) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
