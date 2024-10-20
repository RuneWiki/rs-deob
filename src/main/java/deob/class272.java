package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("jv")
public class class272 implements Iterable, Collection {

    @ObfuscatedName("jv.n")
    public class190 field3570 = new class190();

    @ObfuscatedName("jv.v")
    public class190 field3569;

    public class272() {
        this.field3570.field2140 = this.field3570;
        this.field3570.field2139 = this.field3570;
    }

    @ObfuscatedName("jv.n()V")
    public void method4626() {
        while (this.field3570.field2140 != this.field3570) {
            this.field3570.field2140.method3486();
        }
    }

    @ObfuscatedName("jv.v(Lga;)V")
    public void method4627(class190 arg0) {
        if (arg0.field2139 != null) {
            arg0.method3486();
        }
        arg0.field2139 = this.field3570.field2139;
        arg0.field2140 = this.field3570;
        arg0.field2139.field2140 = arg0;
        arg0.field2140.field2139 = arg0;
    }

    @ObfuscatedName("jv.d(Lga;)V")
    public void method4630(class190 arg0) {
        if (arg0.field2139 != null) {
            arg0.method3486();
        }
        arg0.field2139 = this.field3570;
        arg0.field2140 = this.field3570.field2140;
        arg0.field2139.field2140 = arg0;
        arg0.field2140.field2139 = arg0;
    }

    @ObfuscatedName("jv.c(Lga;Lga;)V")
    public static void method4656(class190 arg0, class190 arg1) {
        if (arg0.field2139 != null) {
            arg0.method3486();
        }
        arg0.field2139 = arg1;
        arg0.field2140 = arg1.field2140;
        arg0.field2139.field2140 = arg0;
        arg0.field2140.field2139 = arg0;
    }

    @ObfuscatedName("jv.y()Lga;")
    public class190 method4682() {
        return this.method4662((class190) null);
    }

    @ObfuscatedName("jv.h(Lga;)Lga;")
    public class190 method4662(class190 arg0) {
        class190 var2;
        if (arg0 == null) {
            var2 = this.field3570.field2140;
        } else {
            var2 = arg0;
        }
        if (this.field3570 == var2) {
            this.field3569 = null;
            return null;
        } else {
            this.field3569 = var2.field2140;
            return var2;
        }
    }

    @ObfuscatedName("jv.z()Lga;")
    public class190 method4642() {
        class190 var1 = this.field3569;
        if (this.field3570 == var1) {
            this.field3569 = null;
            return null;
        } else {
            this.field3569 = var1.field2140;
            return var1;
        }
    }

    @ObfuscatedName("jv.e()I")
    public int method4663() {
        int var1 = 0;
        for (class190 var2 = this.field3570.field2140; var2 != this.field3570; var2 = var2.field2140) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("jv.q()Z")
    public boolean method4664() {
        return this.field3570.field2140 == this.field3570;
    }

    @ObfuscatedName("jv.l()[Lga;")
    public class190[] method4634() {
        class190[] var1 = new class190[this.method4663()];
        int var2 = 0;
        for (class190 var3 = this.field3570.field2140; var3 != this.field3570; var3 = var3.field2140) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class276(this);
    }

    public int size() {
        return this.method4663();
    }

    public boolean isEmpty() {
        return this.method4664();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method4634();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class190 var3 = this.field3570.field2140; var3 != this.field3570; var3 = var3.field2140) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("jv.s(Lga;)Z")
    public boolean method4637(class190 arg0) {
        this.method4627(arg0);
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
        this.method4626();
    }

    public boolean add(Object arg0) {
        return this.method4637((class190) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
