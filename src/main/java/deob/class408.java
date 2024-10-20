package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("ps")
public class class408 implements Iterable, Collection {

    @ObfuscatedName("ps.ak")
    public class504 field4634 = new class504();

    @ObfuscatedName("ps.al")
    public class504 field4635;

    public class408() {
        this.field4634.field5048 = this.field4634;
        this.field4634.field5050 = this.field4634;
    }

    @ObfuscatedName("ps.ak()V")
    public void method6885() {
        while (this.field4634.field5048 != this.field4634) {
            this.field4634.field5048.method8189();
        }
    }

    @ObfuscatedName("ps.al(Ltl;)V")
    public void method6886(class504 arg0) {
        if (arg0.field5050 != null) {
            arg0.method8189();
        }
        arg0.field5050 = this.field4634.field5050;
        arg0.field5048 = this.field4634;
        arg0.field5050.field5048 = arg0;
        arg0.field5048.field5050 = arg0;
    }

    @ObfuscatedName("ps.aj(Ltl;)V")
    public void method6898(class504 arg0) {
        if (arg0.field5050 != null) {
            arg0.method8189();
        }
        arg0.field5050 = this.field4634;
        arg0.field5048 = this.field4634.field5048;
        arg0.field5050.field5048 = arg0;
        arg0.field5048.field5050 = arg0;
    }

    @ObfuscatedName("ps.az(Ltl;Ltl;)V")
    public static void method6888(class504 arg0, class504 arg1) {
        if (arg0.field5050 != null) {
            arg0.method8189();
        }
        arg0.field5050 = arg1;
        arg0.field5048 = arg1.field5048;
        arg0.field5050.field5048 = arg0;
        arg0.field5048.field5050 = arg0;
    }

    @ObfuscatedName("ps.af()Ltl;")
    public class504 method6889() {
        return this.method6901((class504) null);
    }

    @ObfuscatedName("ps.aa(Ltl;)Ltl;")
    public class504 method6901(class504 arg0) {
        class504 var2;
        if (arg0 == null) {
            var2 = this.field4634.field5048;
        } else {
            var2 = arg0;
        }
        if (this.field4634 == var2) {
            this.field4635 = null;
            return null;
        } else {
            this.field4635 = var2.field5048;
            return var2;
        }
    }

    @ObfuscatedName("ps.at()Ltl;")
    public class504 method6926() {
        class504 var1 = this.field4635;
        if (this.field4634 == var1) {
            this.field4635 = null;
            return null;
        } else {
            this.field4635 = var1.field5048;
            return var1;
        }
    }

    @ObfuscatedName("ps.ab()I")
    public int method6933() {
        int var1 = 0;
        for (class504 var2 = this.field4634.field5048; var2 != this.field4634; var2 = var2.field5048) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("ps.ac()Z")
    public boolean method6914() {
        return this.field4634.field5048 == this.field4634;
    }

    @ObfuscatedName("ps.ao()[Ltl;")
    public class504[] method6894() {
        class504[] var1 = new class504[this.method6933()];
        int var2 = 0;
        for (class504 var3 = this.field4634.field5048; var3 != this.field4634; var3 = var3.field5048) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class407(this);
    }

    public int size() {
        return this.method6933();
    }

    public boolean isEmpty() {
        return this.method6914();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method6894();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class504 var3 = this.field4634.field5048; var3 != this.field4634; var3 = var3.field5048) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("ps.ah(Ltl;)Z")
    public boolean method6953(class504 arg0) {
        this.method6886(arg0);
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
        this.method6885();
    }

    public boolean add(Object arg0) {
        return this.method6953((class504) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
