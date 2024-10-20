package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("ku")
public abstract class class288 {

    @ObfuscatedName("ku.m")
    public final int field3632;

    @ObfuscatedName("ku.z")
    public int field3634 = 0;

    @ObfuscatedName("ku.q")
    public class285[] field3633;

    @ObfuscatedName("ku.k")
    public HashMap field3631;

    @ObfuscatedName("ku.c")
    public HashMap field3630;

    @ObfuscatedName("ku.u")
    public Comparator field3635 = null;

    public class288(int arg0) {
        this.field3632 = arg0;
        this.field3633 = this.method4797(arg0);
        this.field3631 = new HashMap(arg0 / 8);
        this.field3630 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("ku.o(I)V")
    public void method4808() {
        this.field3634 = 0;
        Arrays.fill(this.field3633, (Object) null);
        this.field3631.clear();
        this.field3630.clear();
    }

    @ObfuscatedName("ku.n(I)I")
    public int method4816() {
        return this.field3634;
    }

    @ObfuscatedName("ku.x(B)Z")
    public boolean method4810() {
        return this.field3634 == this.field3632;
    }

    @ObfuscatedName("ku.p(Lkm;B)Z")
    public boolean method4811(class294 arg0) {
        if (arg0.method4902()) {
            return this.field3631.containsKey(arg0) ? true : this.field3630.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ku.r(Lkm;I)Ljh;")
    public class285 method4812(class294 arg0) {
        class285 var2 = this.method4827(arg0);
        return var2 == null ? this.method4813(arg0) : var2;
    }

    @ObfuscatedName("ku.y(Lkm;I)Ljh;")
    public class285 method4827(class294 arg0) {
        return arg0.method4902() ? (class285) this.field3631.get(arg0) : null;
    }

    @ObfuscatedName("ku.s(Lkm;B)Ljh;")
    public class285 method4813(class294 arg0) {
        return arg0.method4902() ? (class285) this.field3630.get(arg0) : null;
    }

    @ObfuscatedName("ku.j(Lkm;I)Z")
    public final boolean method4814(class294 arg0) {
        class285 var2 = this.method4827(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4815(var2);
            return true;
        }
    }

    @ObfuscatedName("ku.d(Ljh;I)V")
    public final void method4815(class285 arg0) {
        int var2 = this.method4818(arg0);
        if (var2 != -1) {
            this.method4830(var2);
            this.method4821(arg0);
        }
    }

    @ObfuscatedName("ku.a(Lkm;B)Ljh;")
    public class285 method4820(class294 arg0) {
        return this.method4826(arg0, (class294) null);
    }

    @ObfuscatedName("ku.g(Lkm;Lkm;I)Ljh;")
    public class285 method4826(class294 arg0, class294 arg1) {
        if (this.method4827(arg0) != null) {
            throw new IllegalStateException();
        }
        class285 var3 = this.method4799();
        var3.method4770(arg0, arg1);
        this.method4822(var3);
        this.method4867(var3);
        return var3;
    }

    @ObfuscatedName("ku.h(IB)Ljh;")
    public final class285 method4817(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3634) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3633[arg0];
    }

    @ObfuscatedName("ku.ab(B)V")
    public final void method4841() {
        if (this.field3635 == null) {
            Arrays.sort(this.field3633, 0, this.field3634);
        } else {
            Arrays.sort(this.field3633, 0, this.field3634, this.field3635);
        }
    }

    @ObfuscatedName("ku.ac(Ljh;Lkm;Lkm;I)V")
    public final void method4836(class285 arg0, class294 arg1, class294 arg2) {
        this.method4821(arg0);
        arg0.method4770(arg1, arg2);
        this.method4867(arg0);
    }

    @ObfuscatedName("ku.ao(Ljh;B)I")
    public final int method4818(class285 arg0) {
        for (int var2 = 0; var2 < this.field3634; var2++) {
            if (this.field3633[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ku.af(Ljh;I)V")
    public final void method4821(class285 arg0) {
        if (this.field3631.remove(arg0.field3620) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3619 != null) {
            this.field3630.remove(arg0.field3619);
        }
    }

    @ObfuscatedName("ku.av(Ljh;I)V")
    public final void method4822(class285 arg0) {
        this.field3633[++this.field3634 - 1] = arg0;
    }

    @ObfuscatedName("ku.ar(Ljh;I)V")
    public final void method4867(class285 arg0) {
        this.field3631.put(arg0.field3620, arg0);
        if (arg0.field3619 != null) {
            class285 var2 = (class285) this.field3630.put(arg0.field3619, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3619 = null;
            }
        }
    }

    @ObfuscatedName("ku.ay(II)V")
    public final void method4830(int arg0) {
        this.field3634--;
        if (arg0 < this.field3634) {
            System.arraycopy(this.field3633, arg0 + 1, this.field3633, arg0, this.field3634 - arg0);
        }
    }

    @ObfuscatedName("ku.ah(B)V")
    public final void method4829() {
        this.field3635 = null;
    }

    @ObfuscatedName("ku.az(Ljava/util/Comparator;I)V")
    public final void method4849(Comparator arg0) {
        if (this.field3635 == null) {
            this.field3635 = arg0;
        } else if (this.field3635 instanceof class286) {
            ((class286) this.field3635).method4788(arg0);
        }
    }

    @ObfuscatedName("ku.f(I)Ljh;")
    public abstract class285 method4799();

    @ObfuscatedName("ku.b(IB)[Ljh;")
    public abstract class285[] method4797(int arg0);
}
