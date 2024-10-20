package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("kz")
public abstract class class288 {

    @ObfuscatedName("kz.b")
    public final int field3686;

    @ObfuscatedName("kz.l")
    public int field3687 = 0;

    @ObfuscatedName("kz.w")
    public class285[] field3688;

    @ObfuscatedName("kz.d")
    public HashMap field3689;

    @ObfuscatedName("kz.n")
    public HashMap field3691;

    @ObfuscatedName("kz.s")
    public Comparator field3690 = null;

    public class288(int arg0) {
        this.field3686 = arg0;
        this.field3688 = this.method4962(arg0);
        this.field3689 = new HashMap(arg0 / 8);
        this.field3691 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("kz.x(I)V")
    public void method4965() {
        this.field3687 = 0;
        Arrays.fill(this.field3688, (Object) null);
        this.field3689.clear();
        this.field3691.clear();
    }

    @ObfuscatedName("kz.u(I)I")
    public int method4966() {
        return this.field3687;
    }

    @ObfuscatedName("kz.o(I)Z")
    public boolean method4990() {
        return this.field3687 == this.field3686;
    }

    @ObfuscatedName("kz.t(Lkh;I)Z")
    public boolean method4968(class294 arg0) {
        if (arg0.method5060()) {
            return this.field3689.containsKey(arg0) ? true : this.field3691.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("kz.v(Lkh;I)Ljw;")
    public class285 method4986(class294 arg0) {
        class285 var2 = this.method4967(arg0);
        return var2 == null ? this.method5004(arg0) : var2;
    }

    @ObfuscatedName("kz.p(Lkh;I)Ljw;")
    public class285 method4967(class294 arg0) {
        return arg0.method5060() ? (class285) this.field3689.get(arg0) : null;
    }

    @ObfuscatedName("kz.z(Lkh;S)Ljw;")
    public class285 method5004(class294 arg0) {
        return arg0.method5060() ? (class285) this.field3691.get(arg0) : null;
    }

    @ObfuscatedName("kz.j(Lkh;B)Z")
    public final boolean method4972(class294 arg0) {
        class285 var2 = this.method4967(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4973(var2);
            return true;
        }
    }

    @ObfuscatedName("kz.c(Ljw;I)V")
    public final void method4973(class285 arg0) {
        int var2 = this.method4979(arg0);
        if (var2 != -1) {
            this.method4994(var2);
            this.method4980(arg0);
        }
    }

    @ObfuscatedName("kz.av(Lkh;S)Ljw;")
    public class285 method4974(class294 arg0) {
        return this.method4975(arg0, (class294) null);
    }

    @ObfuscatedName("kz.as(Lkh;Lkh;I)Ljw;")
    public class285 method4975(class294 arg0, class294 arg1) {
        if (this.method4967(arg0) != null) {
            throw new IllegalStateException();
        }
        class285 var3 = this.method4952();
        var3.method4930(arg0, arg1);
        this.method4997(var3);
        this.method4982(var3);
        return var3;
    }

    @ObfuscatedName("kz.al(II)Ljw;")
    public final class285 method4976(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3687) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3688[arg0];
    }

    @ObfuscatedName("kz.ax(I)V")
    public final void method4977() {
        if (this.field3690 == null) {
            Arrays.sort(this.field3688, 0, this.field3687);
        } else {
            Arrays.sort(this.field3688, 0, this.field3687, this.field3690);
        }
    }

    @ObfuscatedName("kz.ay(Ljw;Lkh;Lkh;S)V")
    public final void method4978(class285 arg0, class294 arg1, class294 arg2) {
        this.method4980(arg0);
        arg0.method4930(arg1, arg2);
        this.method4982(arg0);
    }

    @ObfuscatedName("kz.aa(Ljw;I)I")
    public final int method4979(class285 arg0) {
        for (int var2 = 0; var2 < this.field3687; var2++) {
            if (this.field3688[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("kz.ag(Ljw;I)V")
    public final void method4980(class285 arg0) {
        if (this.field3689.remove(arg0.field3679) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3680 != null) {
            this.field3691.remove(arg0.field3680);
        }
    }

    @ObfuscatedName("kz.aj(Ljw;I)V")
    public final void method4997(class285 arg0) {
        this.field3688[++this.field3687 - 1] = arg0;
    }

    @ObfuscatedName("kz.an(Ljw;I)V")
    public final void method4982(class285 arg0) {
        this.field3689.put(arg0.field3679, arg0);
        if (arg0.field3680 != null) {
            class285 var2 = (class285) this.field3691.put(arg0.field3680, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3680 = null;
            }
        }
    }

    @ObfuscatedName("kz.ap(II)V")
    public final void method4994(int arg0) {
        this.field3687--;
        if (arg0 < this.field3687) {
            System.arraycopy(this.field3688, arg0 + 1, this.field3688, arg0, this.field3687 - arg0);
        }
    }

    @ObfuscatedName("kz.am(I)V")
    public final void method4984() {
        this.field3690 = null;
    }

    @ObfuscatedName("kz.ae(Ljava/util/Comparator;B)V")
    public final void method5020(Comparator arg0) {
        if (this.field3690 == null) {
            this.field3690 = arg0;
        } else if (this.field3690 instanceof class286) {
            ((class286) this.field3690).method4944(arg0);
        }
    }

    @ObfuscatedName("kz.f(B)Ljw;")
    public abstract class285 method4952();

    @ObfuscatedName("kz.h(II)[Ljw;")
    public abstract class285[] method4962(int arg0);
}
