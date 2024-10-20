package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("ka")
public abstract class class287 {

    @ObfuscatedName("ka.t")
    public final int field3628;

    @ObfuscatedName("ka.i")
    public int field3623 = 0;

    @ObfuscatedName("ka.o")
    public class284[] field3622;

    @ObfuscatedName("ka.x")
    public HashMap field3624;

    @ObfuscatedName("ka.w")
    public HashMap field3626;

    @ObfuscatedName("ka.g")
    public Comparator field3625 = null;

    public class287(int arg0) {
        this.field3628 = arg0;
        this.field3622 = this.method4797(arg0);
        this.field3624 = new HashMap(arg0 / 8);
        this.field3626 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("ka.w(I)V")
    public void method4806() {
        this.field3623 = 0;
        Arrays.fill(this.field3622, (Object) null);
        this.field3624.clear();
        this.field3626.clear();
    }

    @ObfuscatedName("ka.g(I)I")
    public int method4801() {
        return this.field3623;
    }

    @ObfuscatedName("ka.m(I)Z")
    public boolean method4800() {
        return this.field3628 == this.field3623;
    }

    @ObfuscatedName("ka.n(Lku;I)Z")
    public boolean method4816(class293 arg0) {
        if (arg0.method4886()) {
            return this.field3624.containsKey(arg0) ? true : this.field3626.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ka.d(Lku;I)Ljc;")
    public class284 method4804(class293 arg0) {
        class284 var2 = this.method4805(arg0);
        return var2 == null ? this.method4851(arg0) : var2;
    }

    @ObfuscatedName("ka.h(Lku;I)Ljc;")
    public class284 method4805(class293 arg0) {
        return arg0.method4886() ? (class284) this.field3624.get(arg0) : null;
    }

    @ObfuscatedName("ka.a(Lku;I)Ljc;")
    public class284 method4851(class293 arg0) {
        return arg0.method4886() ? (class284) this.field3626.get(arg0) : null;
    }

    @ObfuscatedName("ka.q(Lku;I)Z")
    public final boolean method4807(class293 arg0) {
        class284 var2 = this.method4805(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4835(var2);
            return true;
        }
    }

    @ObfuscatedName("ka.c(Ljc;I)V")
    public final void method4835(class284 arg0) {
        int var2 = this.method4823(arg0);
        if (var2 != -1) {
            this.method4818(var2);
            this.method4849(arg0);
        }
    }

    @ObfuscatedName("ka.j(Lku;I)Ljc;")
    public class284 method4809(class293 arg0) {
        return this.method4810(arg0, (class293) null);
    }

    @ObfuscatedName("ka.r(Lku;Lku;I)Ljc;")
    public class284 method4810(class293 arg0, class293 arg1) {
        if (this.method4805(arg0) != null) {
            throw new IllegalStateException();
        }
        class284 var3 = this.method4798();
        var3.method4761(arg0, arg1);
        this.method4839(var3);
        this.method4811(var3);
        return var3;
    }

    @ObfuscatedName("ka.u(II)Ljc;")
    public final class284 method4853(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3623) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3622[arg0];
    }

    @ObfuscatedName("ka.p(I)V")
    public final void method4812() {
        if (this.field3625 == null) {
            Arrays.sort(this.field3622, 0, this.field3623);
        } else {
            Arrays.sort(this.field3622, 0, this.field3623, this.field3625);
        }
    }

    @ObfuscatedName("ka.b(Ljc;Lku;Lku;B)V")
    public final void method4813(class284 arg0, class293 arg1, class293 arg2) {
        this.method4849(arg0);
        arg0.method4761(arg1, arg2);
        this.method4811(arg0);
    }

    @ObfuscatedName("ka.l(Ljc;I)I")
    public final int method4823(class284 arg0) {
        for (int var2 = 0; var2 < this.field3623; var2++) {
            if (this.field3622[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ka.e(Ljc;I)V")
    public final void method4849(class284 arg0) {
        if (this.field3624.remove(arg0.field3613) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3612 != null) {
            this.field3626.remove(arg0.field3612);
        }
    }

    @ObfuscatedName("ka.ab(Ljc;I)V")
    public final void method4839(class284 arg0) {
        this.field3622[++this.field3623 - 1] = arg0;
    }

    @ObfuscatedName("ka.ag(Ljc;B)V")
    public final void method4811(class284 arg0) {
        this.field3624.put(arg0.field3613, arg0);
        if (arg0.field3612 != null) {
            class284 var2 = (class284) this.field3626.put(arg0.field3612, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3612 = null;
            }
        }
    }

    @ObfuscatedName("ka.ao(IB)V")
    public final void method4818(int arg0) {
        this.field3623--;
        if (arg0 < this.field3623) {
            System.arraycopy(this.field3622, arg0 + 1, this.field3622, arg0, this.field3623 - arg0);
        }
    }

    @ObfuscatedName("ka.ae(I)V")
    public final void method4820() {
        this.field3625 = null;
    }

    @ObfuscatedName("ka.ap(Ljava/util/Comparator;I)V")
    public final void method4821(Comparator arg0) {
        if (this.field3625 == null) {
            this.field3625 = arg0;
        } else if (this.field3625 instanceof class285) {
            ((class285) this.field3625).method4782(arg0);
        }
    }

    @ObfuscatedName("ka.k(IB)[Ljc;")
    public abstract class284[] method4797(int arg0);

    @ObfuscatedName("ka.z(B)Ljc;")
    public abstract class284 method4798();
}
