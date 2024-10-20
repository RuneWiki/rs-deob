package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("kz")
public class class311 implements Iterable, Collection {

    @ObfuscatedName("kz.n")
    public class369 field3822 = new class369();

    @ObfuscatedName("kz.c")
    public class369 field3823;

    public class311() {
        this.field3822.field4055 = this.field3822;
        this.field3822.field4057 = this.field3822;
    }

    @ObfuscatedName("kz.n()V")
    public void method5012() {
        while (this.field3822.field4055 != this.field3822) {
            this.field3822.field4055.method5732();
        }
    }

    @ObfuscatedName("kz.c(Lnr;)V")
    public void method5004(class369 arg0) {
        if (arg0.field4057 != null) {
            arg0.method5732();
        }
        arg0.field4057 = this.field3822.field4057;
        arg0.field4055 = this.field3822;
        arg0.field4057.field4055 = arg0;
        arg0.field4055.field4057 = arg0;
    }

    @ObfuscatedName("kz.m(Lnr;)V")
    public void method5005(class369 arg0) {
        if (arg0.field4057 != null) {
            arg0.method5732();
        }
        arg0.field4057 = this.field3822;
        arg0.field4055 = this.field3822.field4055;
        arg0.field4057.field4055 = arg0;
        arg0.field4055.field4057 = arg0;
    }

    @ObfuscatedName("kz.k(Lnr;Lnr;)V")
    public static void method5031(class369 arg0, class369 arg1) {
        if (arg0.field4057 != null) {
            arg0.method5732();
        }
        arg0.field4057 = arg1;
        arg0.field4055 = arg1.field4055;
        arg0.field4057.field4055 = arg0;
        arg0.field4055.field4057 = arg0;
    }

    @ObfuscatedName("kz.o()Lnr;")
    public class369 method5007() {
        return this.method5008((class369) null);
    }

    @ObfuscatedName("kz.g(Lnr;)Lnr;")
    public class369 method5008(class369 arg0) {
        class369 var2;
        if (arg0 == null) {
            var2 = this.field3822.field4055;
        } else {
            var2 = arg0;
        }
        if (this.field3822 == var2) {
            this.field3823 = null;
            return null;
        } else {
            this.field3823 = var2.field4055;
            return var2;
        }
    }

    @ObfuscatedName("kz.z()Lnr;")
    public class369 method5009() {
        class369 var1 = this.field3823;
        if (this.field3822 == var1) {
            this.field3823 = null;
            return null;
        } else {
            this.field3823 = var1.field4055;
            return var1;
        }
    }

    @ObfuscatedName("kz.a()I")
    public int method5010() {
        int var1 = 0;
        for (class369 var2 = this.field3822.field4055; var2 != this.field3822; var2 = var2.field4055) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("kz.u()Z")
    public boolean method5051() {
        return this.field3822.field4055 == this.field3822;
    }

    @ObfuscatedName("kz.e()[Lnr;")
    public class369[] method5020() {
        class369[] var1 = new class369[this.method5010()];
        int var2 = 0;
        for (class369 var3 = this.field3822.field4055; var3 != this.field3822; var3 = var3.field4055) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class310(this);
    }

    public int size() {
        return this.method5010();
    }

    public boolean isEmpty() {
        return this.method5051();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method5020();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class369 var3 = this.field3822.field4055; var3 != this.field3822; var3 = var3.field4055) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("kz.l(Lnr;)Z")
    public boolean method5016(class369 arg0) {
        this.method5004(arg0);
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
        this.method5012();
    }

    public boolean add(Object arg0) {
        return this.method5016((class369) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
