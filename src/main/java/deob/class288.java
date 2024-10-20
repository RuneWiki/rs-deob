package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("ku")
public abstract class class288 {

    @ObfuscatedName("ku.c")
    public final int field3639;

    @ObfuscatedName("ku.y")
    public int field3636 = 0;

    @ObfuscatedName("ku.h")
    public class285[] field3637;

    @ObfuscatedName("ku.z")
    public HashMap field3638;

    @ObfuscatedName("ku.e")
    public HashMap field3635;

    @ObfuscatedName("ku.q")
    public Comparator field3640 = null;

    public class288(int arg0) {
        this.field3639 = arg0;
        this.field3637 = this.method4874(arg0);
        this.field3638 = new HashMap(arg0 / 8);
        this.field3635 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("ku.q(S)V")
    public void method4881() {
        this.field3636 = 0;
        Arrays.fill(this.field3637, (Object) null);
        this.field3638.clear();
        this.field3635.clear();
    }

    @ObfuscatedName("ku.l(S)I")
    public int method4882() {
        return this.field3636;
    }

    @ObfuscatedName("ku.s(B)Z")
    public boolean method4903() {
        return this.field3639 == this.field3636;
    }

    @ObfuscatedName("ku.b(Lkk;I)Z")
    public boolean method4884(class294 arg0) {
        if (arg0.method4966()) {
            return this.field3638.containsKey(arg0) ? true : this.field3635.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ku.a(Lkk;I)Ljn;")
    public class285 method4885(class294 arg0) {
        class285 var2 = this.method4892(arg0);
        return var2 == null ? this.method4904(arg0) : var2;
    }

    @ObfuscatedName("ku.w(Lkk;I)Ljn;")
    public class285 method4892(class294 arg0) {
        return arg0.method4966() ? (class285) this.field3638.get(arg0) : null;
    }

    @ObfuscatedName("ku.k(Lkk;B)Ljn;")
    public class285 method4904(class294 arg0) {
        return arg0.method4966() ? (class285) this.field3635.get(arg0) : null;
    }

    @ObfuscatedName("ku.i(Lkk;I)Z")
    public final boolean method4887(class294 arg0) {
        class285 var2 = this.method4892(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4888(var2);
            return true;
        }
    }

    @ObfuscatedName("ku.x(Ljn;I)V")
    public final void method4888(class285 arg0) {
        int var2 = this.method4890(arg0);
        if (var2 != -1) {
            this.method4898(var2);
            this.method4895(arg0);
        }
    }

    @ObfuscatedName("ku.g(Lkk;I)Ljn;")
    public class285 method4889(class294 arg0) {
        return this.method4941(arg0, (class294) null);
    }

    @ObfuscatedName("ku.u(Lkk;Lkk;I)Ljn;")
    public class285 method4941(class294 arg0, class294 arg1) {
        if (this.method4892(arg0) != null) {
            throw new IllegalStateException();
        }
        class285 var3 = this.method4873();
        var3.method4843(arg0, arg1);
        this.method4896(var3);
        this.method4897(var3);
        return var3;
    }

    @ObfuscatedName("ku.t(IB)Ljn;")
    public final class285 method4883(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3636) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3637[arg0];
    }

    @ObfuscatedName("ku.p(I)V")
    public final void method4922() {
        if (this.field3640 == null) {
            Arrays.sort(this.field3637, 0, this.field3636);
        } else {
            Arrays.sort(this.field3637, 0, this.field3636, this.field3640);
        }
    }

    @ObfuscatedName("ku.o(Ljn;Lkk;Lkk;I)V")
    public final void method4893(class285 arg0, class294 arg1, class294 arg2) {
        this.method4895(arg0);
        arg0.method4843(arg1, arg2);
        this.method4897(arg0);
    }

    @ObfuscatedName("ku.ay(Ljn;B)I")
    public final int method4890(class285 arg0) {
        for (int var2 = 0; var2 < this.field3636; var2++) {
            if (this.field3637[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ku.am(Ljn;I)V")
    public final void method4895(class285 arg0) {
        if (this.field3638.remove(arg0.field3625) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3626 != null) {
            this.field3635.remove(arg0.field3626);
        }
    }

    @ObfuscatedName("ku.ag(Ljn;B)V")
    public final void method4896(class285 arg0) {
        this.field3637[++this.field3636 - 1] = arg0;
    }

    @ObfuscatedName("ku.ae(Ljn;I)V")
    public final void method4897(class285 arg0) {
        this.field3638.put(arg0.field3625, arg0);
        if (arg0.field3626 != null) {
            class285 var2 = (class285) this.field3635.put(arg0.field3626, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3626 = null;
            }
        }
    }

    @ObfuscatedName("ku.ac(IB)V")
    public final void method4898(int arg0) {
        this.field3636--;
        if (arg0 < this.field3636) {
            System.arraycopy(this.field3637, arg0 + 1, this.field3637, arg0, this.field3636 - arg0);
        }
    }

    @ObfuscatedName("ku.aq(I)V")
    public final void method4900() {
        this.field3640 = null;
    }

    @ObfuscatedName("ku.at(Ljava/util/Comparator;B)V")
    public final void method4901(Comparator arg0) {
        if (this.field3640 == null) {
            this.field3640 = arg0;
        } else if (this.field3640 instanceof class286) {
            ((class286) this.field3640).method4864(arg0);
        }
    }

    @ObfuscatedName("ku.v(II)[Ljn;")
    public abstract class285[] method4874(int arg0);

    @ObfuscatedName("ku.n(I)Ljn;")
    public abstract class285 method4873();
}
