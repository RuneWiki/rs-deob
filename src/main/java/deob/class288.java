package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("kh")
public abstract class class288 {

    @ObfuscatedName("kh.k")
    public final int field3653;

    @ObfuscatedName("kh.u")
    public int field3654 = 0;

    @ObfuscatedName("kh.i")
    public class285[] field3655;

    @ObfuscatedName("kh.t")
    public HashMap field3656;

    @ObfuscatedName("kh.p")
    public HashMap field3657;

    @ObfuscatedName("kh.l")
    public Comparator field3658 = null;

    public class288(int arg0) {
        this.field3653 = arg0;
        this.field3655 = this.method4976(arg0);
        this.field3656 = new HashMap(arg0 / 8);
        this.field3657 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("kh.j(I)V")
    public void method4990() {
        this.field3654 = 0;
        Arrays.fill(this.field3655, (Object) null);
        this.field3656.clear();
        this.field3657.clear();
    }

    @ObfuscatedName("kh.y(I)I")
    public int method4991() {
        return this.field3654;
    }

    @ObfuscatedName("kh.m(I)Z")
    public boolean method4992() {
        return this.field3654 == this.field3653;
    }

    @ObfuscatedName("kh.h(Lkk;I)Z")
    public boolean method4993(class294 arg0) {
        if (arg0.method5084()) {
            return this.field3656.containsKey(arg0) ? true : this.field3657.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("kh.x(Lkk;I)Ljx;")
    public class285 method5013(class294 arg0) {
        class285 var2 = this.method5015(arg0);
        return var2 == null ? this.method4995(arg0) : var2;
    }

    @ObfuscatedName("kh.f(Lkk;I)Ljx;")
    public class285 method5015(class294 arg0) {
        return arg0.method5084() ? (class285) this.field3656.get(arg0) : null;
    }

    @ObfuscatedName("kh.r(Lkk;I)Ljx;")
    public class285 method4995(class294 arg0) {
        return arg0.method5084() ? (class285) this.field3657.get(arg0) : null;
    }

    @ObfuscatedName("kh.n(Lkk;I)Z")
    public final boolean method4996(class294 arg0) {
        class285 var2 = this.method5015(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method5020(var2);
            return true;
        }
    }

    @ObfuscatedName("kh.g(Ljx;I)V")
    public final void method5020(class285 arg0) {
        int var2 = this.method5003(arg0);
        if (var2 != -1) {
            this.method5032(var2);
            this.method5004(arg0);
        }
    }

    @ObfuscatedName("kh.ab(Lkk;I)Ljx;")
    public class285 method4998(class294 arg0) {
        return this.method5007(arg0, (class294) null);
    }

    @ObfuscatedName("kh.ao(Lkk;Lkk;I)Ljx;")
    public class285 method5007(class294 arg0, class294 arg1) {
        if (this.method5015(arg0) != null) {
            throw new IllegalStateException();
        }
        class285 var3 = this.method4986();
        var3.method4954(arg0, arg1);
        this.method5053(var3);
        this.method5012(var3);
        return var3;
    }

    @ObfuscatedName("kh.an(II)Ljx;")
    public final class285 method5000(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3654) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3655[arg0];
    }

    @ObfuscatedName("kh.ay(I)V")
    public final void method5001() {
        if (this.field3658 == null) {
            Arrays.sort(this.field3655, 0, this.field3654);
        } else {
            Arrays.sort(this.field3655, 0, this.field3654, this.field3658);
        }
    }

    @ObfuscatedName("kh.av(Ljx;Lkk;Lkk;I)V")
    public final void method5036(class285 arg0, class294 arg1, class294 arg2) {
        this.method5004(arg0);
        arg0.method4954(arg1, arg2);
        this.method5012(arg0);
    }

    @ObfuscatedName("kh.af(Ljx;I)I")
    public final int method5003(class285 arg0) {
        for (int var2 = 0; var2 < this.field3654; var2++) {
            if (this.field3655[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("kh.ar(Ljx;I)V")
    public final void method5004(class285 arg0) {
        if (this.field3656.remove(arg0.field3648) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3646 != null) {
            this.field3657.remove(arg0.field3646);
        }
    }

    @ObfuscatedName("kh.am(Ljx;I)V")
    public final void method5053(class285 arg0) {
        this.field3655[++this.field3654 - 1] = arg0;
    }

    @ObfuscatedName("kh.aj(Ljx;B)V")
    public final void method5012(class285 arg0) {
        this.field3656.put(arg0.field3648, arg0);
        if (arg0.field3646 != null) {
            class285 var2 = (class285) this.field3657.put(arg0.field3646, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3646 = null;
            }
        }
    }

    @ObfuscatedName("kh.aq(II)V")
    public final void method5032(int arg0) {
        this.field3654--;
        if (arg0 < this.field3654) {
            System.arraycopy(this.field3655, arg0 + 1, this.field3655, arg0, this.field3654 - arg0);
        }
    }

    @ObfuscatedName("kh.ak(B)V")
    public final void method5009() {
        this.field3658 = null;
    }

    @ObfuscatedName("kh.ax(Ljava/util/Comparator;B)V")
    public final void method5010(Comparator arg0) {
        if (this.field3658 == null) {
            this.field3658 = arg0;
        } else if (this.field3658 instanceof class286) {
            ((class286) this.field3658).method4965(arg0);
        }
    }

    @ObfuscatedName("kh.s(II)[Ljx;")
    public abstract class285[] method4976(int arg0);

    @ObfuscatedName("kh.v(I)Ljx;")
    public abstract class285 method4986();
}
