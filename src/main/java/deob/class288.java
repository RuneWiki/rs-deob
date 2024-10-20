package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("kn")
public abstract class class288 {

    @ObfuscatedName("kn.j")
    public final int field3673;

    @ObfuscatedName("kn.g")
    public int field3668 = 0;

    @ObfuscatedName("kn.i")
    public class285[] field3667;

    @ObfuscatedName("kn.h")
    public HashMap field3670;

    @ObfuscatedName("kn.l")
    public HashMap field3671;

    @ObfuscatedName("kn.d")
    public Comparator field3672 = null;

    public class288(int arg0) {
        this.field3673 = arg0;
        this.field3667 = this.method4958(arg0);
        this.field3670 = new HashMap(arg0 / 8);
        this.field3671 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("kn.p(I)V")
    public void method5017() {
        this.field3668 = 0;
        Arrays.fill(this.field3667, (Object) null);
        this.field3670.clear();
        this.field3671.clear();
    }

    @ObfuscatedName("kn.n(B)I")
    public int method4970() {
        return this.field3668;
    }

    @ObfuscatedName("kn.t(I)Z")
    public boolean method4998() {
        return this.field3673 == this.field3668;
    }

    @ObfuscatedName("kn.r(Lkz;S)Z")
    public boolean method4972(class294 arg0) {
        if (arg0.method5076()) {
            return this.field3670.containsKey(arg0) ? true : this.field3671.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("kn.x(Lkz;B)Ljx;")
    public class285 method4973(class294 arg0) {
        class285 var2 = this.method4974(arg0);
        return var2 == null ? this.method5011(arg0) : var2;
    }

    @ObfuscatedName("kn.b(Lkz;B)Ljx;")
    public class285 method4974(class294 arg0) {
        return arg0.method5076() ? (class285) this.field3670.get(arg0) : null;
    }

    @ObfuscatedName("kn.w(Lkz;I)Ljx;")
    public class285 method5011(class294 arg0) {
        return arg0.method5076() ? (class285) this.field3671.get(arg0) : null;
    }

    @ObfuscatedName("kn.a(Lkz;B)Z")
    public final boolean method4995(class294 arg0) {
        class285 var2 = this.method4974(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4977(var2);
            return true;
        }
    }

    @ObfuscatedName("kn.z(Ljx;I)V")
    public final void method4977(class285 arg0) {
        int var2 = this.method5038(arg0);
        if (var2 != -1) {
            this.method4987(var2);
            this.method4968(arg0);
        }
    }

    @ObfuscatedName("kn.y(Lkz;B)Ljx;")
    public class285 method4978(class294 arg0) {
        return this.method4979(arg0, (class294) null);
    }

    @ObfuscatedName("kn.u(Lkz;Lkz;B)Ljx;")
    public class285 method4979(class294 arg0, class294 arg1) {
        if (this.method4974(arg0) != null) {
            throw new IllegalStateException();
        }
        class285 var3 = this.method4967();
        var3.method4940(arg0, arg1);
        this.method4985(var3);
        this.method4986(var3);
        return var3;
    }

    @ObfuscatedName("kn.f(II)Ljx;")
    public final class285 method4980(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3668) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3667[arg0];
    }

    @ObfuscatedName("kn.at(B)V")
    public final void method4981() {
        if (this.field3672 == null) {
            Arrays.sort(this.field3667, 0, this.field3668);
        } else {
            Arrays.sort(this.field3667, 0, this.field3668, this.field3672);
        }
    }

    @ObfuscatedName("kn.ay(Ljx;Lkz;Lkz;I)V")
    public final void method4982(class285 arg0, class294 arg1, class294 arg2) {
        this.method4968(arg0);
        arg0.method4940(arg1, arg2);
        this.method4986(arg0);
    }

    @ObfuscatedName("kn.ak(Ljx;I)I")
    public final int method5038(class285 arg0) {
        for (int var2 = 0; var2 < this.field3668; var2++) {
            if (this.field3667[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("kn.az(Ljx;I)V")
    public final void method4968(class285 arg0) {
        if (this.field3670.remove(arg0.field3659) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3658 != null) {
            this.field3671.remove(arg0.field3658);
        }
    }

    @ObfuscatedName("kn.aj(Ljx;I)V")
    public final void method4985(class285 arg0) {
        this.field3667[++this.field3668 - 1] = arg0;
    }

    @ObfuscatedName("kn.af(Ljx;I)V")
    public final void method4986(class285 arg0) {
        this.field3670.put(arg0.field3659, arg0);
        if (arg0.field3658 != null) {
            class285 var2 = (class285) this.field3671.put(arg0.field3658, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3658 = null;
            }
        }
    }

    @ObfuscatedName("kn.ah(II)V")
    public final void method4987(int arg0) {
        this.field3668--;
        if (arg0 < this.field3668) {
            System.arraycopy(this.field3667, arg0 + 1, this.field3667, arg0, this.field3668 - arg0);
        }
    }

    @ObfuscatedName("kn.ab(I)V")
    public final void method5033() {
        this.field3672 = null;
    }

    @ObfuscatedName("kn.aa(Ljava/util/Comparator;I)V")
    public final void method4990(Comparator arg0) {
        if (this.field3672 == null) {
            this.field3672 = arg0;
        } else if (this.field3672 instanceof class286) {
            ((class286) this.field3672).method4950(arg0);
        }
    }

    @ObfuscatedName("kn.q(II)[Ljx;")
    public abstract class285[] method4958(int arg0);

    @ObfuscatedName("kn.c(B)Ljx;")
    public abstract class285 method4967();
}
