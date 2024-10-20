package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("kb")
public abstract class class288 {

    @ObfuscatedName("kb.w")
    public final int field3648;

    @ObfuscatedName("kb.t")
    public int field3641 = 0;

    @ObfuscatedName("kb.j")
    public class285[] field3642;

    @ObfuscatedName("kb.n")
    public HashMap field3643;

    @ObfuscatedName("kb.p")
    public HashMap field3644;

    @ObfuscatedName("kb.l")
    public Comparator field3645 = null;

    public class288(int arg0) {
        this.field3648 = arg0;
        this.field3642 = this.method4717(arg0);
        this.field3643 = new HashMap(arg0 / 8);
        this.field3644 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("kb.c(B)V")
    public void method4755() {
        this.field3641 = 0;
        Arrays.fill(this.field3642, (Object) null);
        this.field3643.clear();
        this.field3644.clear();
    }

    @ObfuscatedName("kb.i(I)I")
    public int method4731() {
        return this.field3641;
    }

    @ObfuscatedName("kb.f(B)Z")
    public boolean method4775() {
        return this.field3648 == this.field3641;
    }

    @ObfuscatedName("kb.y(Lki;B)Z")
    public boolean method4733(class294 arg0) {
        if (arg0.method4822()) {
            return this.field3643.containsKey(arg0) ? true : this.field3644.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("kb.r(Lki;I)Lju;")
    public class285 method4734(class294 arg0) {
        class285 var2 = this.method4777(arg0);
        return var2 == null ? this.method4736(arg0) : var2;
    }

    @ObfuscatedName("kb.q(Lki;I)Lju;")
    public class285 method4777(class294 arg0) {
        return arg0.method4822() ? (class285) this.field3643.get(arg0) : null;
    }

    @ObfuscatedName("kb.g(Lki;I)Lju;")
    public class285 method4736(class294 arg0) {
        return arg0.method4822() ? (class285) this.field3644.get(arg0) : null;
    }

    @ObfuscatedName("kb.o(Lki;B)Z")
    public final boolean method4737(class294 arg0) {
        class285 var2 = this.method4777(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4738(var2);
            return true;
        }
    }

    @ObfuscatedName("kb.an(Lju;I)V")
    public final void method4738(class285 arg0) {
        int var2 = this.method4789(arg0);
        if (var2 != -1) {
            this.method4747(var2);
            this.method4744(arg0);
        }
    }

    @ObfuscatedName("kb.aj(Lki;B)Lju;")
    public class285 method4739(class294 arg0) {
        return this.method4732(arg0, (class294) null);
    }

    @ObfuscatedName("kb.ax(Lki;Lki;I)Lju;")
    public class285 method4732(class294 arg0, class294 arg1) {
        if (this.method4777(arg0) != null) {
            throw new IllegalStateException();
        }
        class285 var3 = this.method4716();
        var3.method4694(arg0, arg1);
        this.method4748(var3);
        this.method4792(var3);
        return var3;
    }

    @ObfuscatedName("kb.ag(II)Lju;")
    public final class285 method4740(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3641) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3642[arg0];
    }

    @ObfuscatedName("kb.au(I)V")
    public final void method4741() {
        if (this.field3645 == null) {
            Arrays.sort(this.field3642, 0, this.field3641);
        } else {
            Arrays.sort(this.field3642, 0, this.field3641, this.field3645);
        }
    }

    @ObfuscatedName("kb.as(Lju;Lki;Lki;I)V")
    public final void method4742(class285 arg0, class294 arg1, class294 arg2) {
        this.method4744(arg0);
        arg0.method4694(arg1, arg2);
        this.method4792(arg0);
    }

    @ObfuscatedName("kb.ae(Lju;I)I")
    public final int method4789(class285 arg0) {
        for (int var2 = 0; var2 < this.field3641; var2++) {
            if (this.field3642[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("kb.ac(Lju;S)V")
    public final void method4744(class285 arg0) {
        if (this.field3643.remove(arg0.field3629) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3628 != null) {
            this.field3644.remove(arg0.field3628);
        }
    }

    @ObfuscatedName("kb.ak(Lju;I)V")
    public final void method4748(class285 arg0) {
        this.field3642[++this.field3641 - 1] = arg0;
    }

    @ObfuscatedName("kb.av(Lju;I)V")
    public final void method4792(class285 arg0) {
        this.field3643.put(arg0.field3629, arg0);
        if (arg0.field3628 != null) {
            class285 var2 = (class285) this.field3644.put(arg0.field3628, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3628 = null;
            }
        }
    }

    @ObfuscatedName("kb.aq(II)V")
    public final void method4747(int arg0) {
        this.field3641--;
        if (arg0 < this.field3641) {
            System.arraycopy(this.field3642, arg0 + 1, this.field3642, arg0, this.field3641 - arg0);
        }
    }

    @ObfuscatedName("kb.ah(I)V")
    public final void method4730() {
        this.field3645 = null;
    }

    @ObfuscatedName("kb.am(Ljava/util/Comparator;I)V")
    public final void method4791(Comparator arg0) {
        if (this.field3645 == null) {
            this.field3645 = arg0;
        } else if (this.field3645 instanceof class286) {
            ((class286) this.field3645).method4709(arg0);
        }
    }

    @ObfuscatedName("kb.v(II)[Lju;")
    public abstract class285[] method4717(int arg0);

    @ObfuscatedName("kb.h(B)Lju;")
    public abstract class285 method4716();
}
