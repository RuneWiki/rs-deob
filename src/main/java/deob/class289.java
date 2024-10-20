package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("km")
public abstract class class289 {

    @ObfuscatedName("km.w")
    public final int field3695;

    @ObfuscatedName("km.o")
    public int field3692 = 0;

    @ObfuscatedName("km.u")
    public class286[] field3693;

    @ObfuscatedName("km.g")
    public HashMap field3691;

    @ObfuscatedName("km.l")
    public HashMap field3696;

    @ObfuscatedName("km.e")
    public Comparator field3694 = null;

    public class289(int arg0) {
        this.field3695 = arg0;
        this.field3693 = this.method5031(arg0);
        this.field3691 = new HashMap(arg0 / 8);
        this.field3696 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("km.z(I)V")
    public void method5035() {
        this.field3692 = 0;
        Arrays.fill(this.field3693, (Object) null);
        this.field3691.clear();
        this.field3696.clear();
    }

    @ObfuscatedName("km.j(I)I")
    public int method5036() {
        return this.field3692;
    }

    @ObfuscatedName("km.s(I)Z")
    public boolean method5034() {
        return this.field3695 == this.field3692;
    }

    @ObfuscatedName("km.t(Lkp;I)Z")
    public boolean method5072(class295 arg0) {
        if (arg0.method5133()) {
            return this.field3691.containsKey(arg0) ? true : this.field3696.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("km.y(Lkp;I)Ljs;")
    public class286 method5039(class295 arg0) {
        class286 var2 = this.method5040(arg0);
        return var2 == null ? this.method5041(arg0) : var2;
    }

    @ObfuscatedName("km.h(Lkp;I)Ljs;")
    public class286 method5040(class295 arg0) {
        return arg0.method5133() ? (class286) this.field3691.get(arg0) : null;
    }

    @ObfuscatedName("km.b(Lkp;I)Ljs;")
    public class286 method5041(class295 arg0) {
        return arg0.method5133() ? (class286) this.field3696.get(arg0) : null;
    }

    @ObfuscatedName("km.c(Lkp;S)Z")
    public final boolean method5042(class295 arg0) {
        class286 var2 = this.method5040(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method5043(var2);
            return true;
        }
    }

    @ObfuscatedName("km.p(Ljs;I)V")
    public final void method5043(class286 arg0) {
        int var2 = this.method5077(arg0);
        if (var2 != -1) {
            this.method5053(var2);
            this.method5050(arg0);
        }
    }

    @ObfuscatedName("km.v(Lkp;I)Ljs;")
    public class286 method5044(class295 arg0) {
        return this.method5052(arg0, (class295) null);
    }

    @ObfuscatedName("km.ag(Lkp;Lkp;I)Ljs;")
    public class286 method5052(class295 arg0, class295 arg1) {
        if (this.method5040(arg0) != null) {
            throw new IllegalStateException();
        }
        class286 var3 = this.method5022();
        var3.method4994(arg0, arg1);
        this.method5051(var3);
        this.method5079(var3);
        return var3;
    }

    @ObfuscatedName("km.aq(II)Ljs;")
    public final class286 method5046(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3692) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3693[arg0];
    }

    @ObfuscatedName("km.aj(I)V")
    public final void method5047() {
        if (this.field3694 == null) {
            Arrays.sort(this.field3693, 0, this.field3692);
        } else {
            Arrays.sort(this.field3693, 0, this.field3692, this.field3694);
        }
    }

    @ObfuscatedName("km.av(Ljs;Lkp;Lkp;B)V")
    public final void method5057(class286 arg0, class295 arg1, class295 arg2) {
        this.method5050(arg0);
        arg0.method4994(arg1, arg2);
        this.method5079(arg0);
    }

    @ObfuscatedName("km.ar(Ljs;I)I")
    public final int method5077(class286 arg0) {
        for (int var2 = 0; var2 < this.field3692; var2++) {
            if (this.field3693[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("km.ac(Ljs;S)V")
    public final void method5050(class286 arg0) {
        if (this.field3691.remove(arg0.field3683) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3684 != null) {
            this.field3696.remove(arg0.field3684);
        }
    }

    @ObfuscatedName("km.ay(Ljs;I)V")
    public final void method5051(class286 arg0) {
        this.field3693[++this.field3692 - 1] = arg0;
    }

    @ObfuscatedName("km.ah(Ljs;B)V")
    public final void method5079(class286 arg0) {
        this.field3691.put(arg0.field3683, arg0);
        if (arg0.field3684 != null) {
            class286 var2 = (class286) this.field3696.put(arg0.field3684, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3684 = null;
            }
        }
    }

    @ObfuscatedName("km.ak(II)V")
    public final void method5053(int arg0) {
        this.field3692--;
        if (arg0 < this.field3692) {
            System.arraycopy(this.field3693, arg0 + 1, this.field3693, arg0, this.field3692 - arg0);
        }
    }

    @ObfuscatedName("km.aw(I)V")
    public final void method5054() {
        this.field3694 = null;
    }

    @ObfuscatedName("km.al(Ljava/util/Comparator;B)V")
    public final void method5055(Comparator arg0) {
        if (this.field3694 == null) {
            this.field3694 = arg0;
        } else if (this.field3694 instanceof class287) {
            ((class287) this.field3694).method5010(arg0);
        }
    }

    @ObfuscatedName("km.m(I)Ljs;")
    public abstract class286 method5022();

    @ObfuscatedName("km.f(II)[Ljs;")
    public abstract class286[] method5031(int arg0);
}
