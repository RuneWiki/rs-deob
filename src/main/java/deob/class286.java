package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("js")
public abstract class class286 {

    @ObfuscatedName("js.b")
    public final int field3643;

    @ObfuscatedName("js.f")
    public int field3640 = 0;

    @ObfuscatedName("js.n")
    public class283[] field3639;

    @ObfuscatedName("js.h")
    public HashMap field3642;

    @ObfuscatedName("js.x")
    public HashMap field3641;

    @ObfuscatedName("js.j")
    public Comparator field3644 = null;

    public class286(int arg0) {
        this.field3643 = arg0;
        this.field3639 = this.method4943(arg0);
        this.field3642 = new HashMap(arg0 / 8);
        this.field3641 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("js.p(B)V")
    public void method4951() {
        this.field3640 = 0;
        Arrays.fill(this.field3639, (Object) null);
        this.field3642.clear();
        this.field3641.clear();
    }

    @ObfuscatedName("js.g(I)I")
    public int method4952() {
        return this.field3640;
    }

    @ObfuscatedName("js.y(I)Z")
    public boolean method4953() {
        return this.field3643 == this.field3640;
    }

    @ObfuscatedName("js.c(Lkm;I)Z")
    public boolean method4954(class292 arg0) {
        if (arg0.method5049()) {
            return this.field3642.containsKey(arg0) ? true : this.field3641.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("js.e(Lkm;I)Ljn;")
    public class283 method4955(class292 arg0) {
        class283 var2 = this.method4979(arg0);
        return var2 == null ? this.method4957(arg0) : var2;
    }

    @ObfuscatedName("js.t(Lkm;I)Ljn;")
    public class283 method4979(class292 arg0) {
        return arg0.method5049() ? (class283) this.field3642.get(arg0) : null;
    }

    @ObfuscatedName("js.u(Lkm;B)Ljn;")
    public class283 method4957(class292 arg0) {
        return arg0.method5049() ? (class283) this.field3641.get(arg0) : null;
    }

    @ObfuscatedName("js.i(Lkm;S)Z")
    public final boolean method5002(class292 arg0) {
        class283 var2 = this.method4979(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4969(var2);
            return true;
        }
    }

    @ObfuscatedName("js.r(Ljn;I)V")
    public final void method4969(class283 arg0) {
        int var2 = this.method4958(arg0);
        if (var2 != -1) {
            this.method5020(var2);
            this.method4965(arg0);
        }
    }

    @ObfuscatedName("js.v(Lkm;I)Ljn;")
    public class283 method4960(class292 arg0) {
        return this.method4978(arg0, (class292) null);
    }

    @ObfuscatedName("js.o(Lkm;Lkm;B)Ljn;")
    public class283 method4978(class292 arg0, class292 arg1) {
        if (this.method4979(arg0) != null) {
            throw new IllegalStateException();
        }
        class283 var3 = this.method4946();
        var3.method4927(arg0, arg1);
        this.method4966(var3);
        this.method4984(var3);
        return var3;
    }

    @ObfuscatedName("js.ai(II)Ljn;")
    public final class283 method4962(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3640) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3639[arg0];
    }

    @ObfuscatedName("js.at(B)V")
    public final void method4988() {
        if (this.field3644 == null) {
            Arrays.sort(this.field3639, 0, this.field3640);
        } else {
            Arrays.sort(this.field3639, 0, this.field3640, this.field3644);
        }
    }

    @ObfuscatedName("js.ad(Ljn;Lkm;Lkm;B)V")
    public final void method4950(class283 arg0, class292 arg1, class292 arg2) {
        this.method4965(arg0);
        arg0.method4927(arg1, arg2);
        this.method4984(arg0);
    }

    @ObfuscatedName("js.ac(Ljn;I)I")
    public final int method4958(class283 arg0) {
        for (int var2 = 0; var2 < this.field3640; var2++) {
            if (this.field3639[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("js.ay(Ljn;B)V")
    public final void method4965(class283 arg0) {
        if (this.field3642.remove(arg0.field3631) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3630 != null) {
            this.field3641.remove(arg0.field3630);
        }
    }

    @ObfuscatedName("js.an(Ljn;I)V")
    public final void method4966(class283 arg0) {
        this.field3639[++this.field3640 - 1] = arg0;
    }

    @ObfuscatedName("js.as(Ljn;B)V")
    public final void method4984(class283 arg0) {
        this.field3642.put(arg0.field3631, arg0);
        if (arg0.field3630 != null) {
            class283 var2 = (class283) this.field3641.put(arg0.field3630, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3630 = null;
            }
        }
    }

    @ObfuscatedName("js.aw(IB)V")
    public final void method5020(int arg0) {
        this.field3640--;
        if (arg0 < this.field3640) {
            System.arraycopy(this.field3639, arg0 + 1, this.field3639, arg0, this.field3640 - arg0);
        }
    }

    @ObfuscatedName("js.ag(I)V")
    public final void method4968() {
        this.field3644 = null;
    }

    @ObfuscatedName("js.ah(Ljava/util/Comparator;B)V")
    public final void method4986(Comparator arg0) {
        if (this.field3644 == null) {
            this.field3644 = arg0;
        } else if (this.field3644 instanceof class284) {
            ((class284) this.field3644).method4930(arg0);
        }
    }

    @ObfuscatedName("js.w(B)Ljn;")
    public abstract class283 method4946();

    @ObfuscatedName("js.m(II)[Ljn;")
    public abstract class283[] method4943(int arg0);
}
