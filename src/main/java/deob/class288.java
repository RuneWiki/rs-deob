package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("ks")
public abstract class class288 {

    @ObfuscatedName("ks.s")
    public final int field3694;

    @ObfuscatedName("ks.e")
    public int field3692 = 0;

    @ObfuscatedName("ks.a")
    public class285[] field3691;

    @ObfuscatedName("ks.c")
    public HashMap field3693;

    @ObfuscatedName("ks.p")
    public HashMap field3690;

    @ObfuscatedName("ks.r")
    public Comparator field3695 = null;

    public class288(int arg0) {
        this.field3694 = arg0;
        this.field3691 = this.method5024(arg0);
        this.field3693 = new HashMap(arg0 / 8);
        this.field3690 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("ks.v(I)V")
    public void method5035() {
        this.field3692 = 0;
        Arrays.fill(this.field3691, (Object) null);
        this.field3693.clear();
        this.field3690.clear();
    }

    @ObfuscatedName("ks.g(I)I")
    public int method5049() {
        return this.field3692;
    }

    @ObfuscatedName("ks.u(B)Z")
    public boolean method5037() {
        return this.field3694 == this.field3692;
    }

    @ObfuscatedName("ks.o(Lka;B)Z")
    public boolean method5038(class294 arg0) {
        if (arg0.method5131()) {
            return this.field3693.containsKey(arg0) ? true : this.field3690.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ks.i(Lka;I)Ljb;")
    public class285 method5039(class294 arg0) {
        class285 var2 = this.method5040(arg0);
        return var2 == null ? this.method5041(arg0) : var2;
    }

    @ObfuscatedName("ks.k(Lka;B)Ljb;")
    public class285 method5040(class294 arg0) {
        return arg0.method5131() ? (class285) this.field3693.get(arg0) : null;
    }

    @ObfuscatedName("ks.q(Lka;I)Ljb;")
    public class285 method5041(class294 arg0) {
        return arg0.method5131() ? (class285) this.field3690.get(arg0) : null;
    }

    @ObfuscatedName("ks.y(Lka;I)Z")
    public final boolean method5042(class294 arg0) {
        class285 var2 = this.method5040(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method5043(var2);
            return true;
        }
    }

    @ObfuscatedName("ks.av(Ljb;I)V")
    public final void method5043(class285 arg0) {
        int var2 = this.method5061(arg0);
        if (var2 != -1) {
            this.method5053(var2);
            this.method5050(arg0);
        }
    }

    @ObfuscatedName("ks.ag(Lka;I)Ljb;")
    public class285 method5044(class294 arg0) {
        return this.method5060(arg0, (class294) null);
    }

    @ObfuscatedName("ks.af(Lka;Lka;I)Ljb;")
    public class285 method5060(class294 arg0, class294 arg1) {
        if (this.method5040(arg0) != null) {
            throw new IllegalStateException();
        }
        class285 var3 = this.method5023();
        var3.method5006(arg0, arg1);
        this.method5054(var3);
        this.method5052(var3);
        return var3;
    }

    @ObfuscatedName("ks.az(II)Ljb;")
    public final class285 method5034(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3692) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3691[arg0];
    }

    @ObfuscatedName("ks.at(I)V")
    public final void method5047() {
        if (this.field3695 == null) {
            Arrays.sort(this.field3691, 0, this.field3692);
        } else {
            Arrays.sort(this.field3691, 0, this.field3692, this.field3695);
        }
    }

    @ObfuscatedName("ks.ac(Ljb;Lka;Lka;I)V")
    public final void method5094(class285 arg0, class294 arg1, class294 arg2) {
        this.method5050(arg0);
        arg0.method5006(arg1, arg2);
        this.method5052(arg0);
    }

    @ObfuscatedName("ks.am(Ljb;I)I")
    public final int method5061(class285 arg0) {
        for (int var2 = 0; var2 < this.field3692; var2++) {
            if (this.field3691[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ks.aw(Ljb;I)V")
    public final void method5050(class285 arg0) {
        if (this.field3693.remove(arg0.field3684) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3685 != null) {
            this.field3690.remove(arg0.field3685);
        }
    }

    @ObfuscatedName("ks.aa(Ljb;I)V")
    public final void method5054(class285 arg0) {
        this.field3691[++this.field3692 - 1] = arg0;
    }

    @ObfuscatedName("ks.as(Ljb;I)V")
    public final void method5052(class285 arg0) {
        this.field3693.put(arg0.field3684, arg0);
        if (arg0.field3685 != null) {
            class285 var2 = (class285) this.field3690.put(arg0.field3685, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3685 = null;
            }
        }
    }

    @ObfuscatedName("ks.al(II)V")
    public final void method5053(int arg0) {
        this.field3692--;
        if (arg0 < this.field3692) {
            System.arraycopy(this.field3691, arg0 + 1, this.field3691, arg0, this.field3692 - arg0);
        }
    }

    @ObfuscatedName("ks.ad(I)V")
    public final void method5081() {
        this.field3695 = null;
    }

    @ObfuscatedName("ks.ax(Ljava/util/Comparator;I)V")
    public final void method5056(Comparator arg0) {
        if (this.field3695 == null) {
            this.field3695 = arg0;
        } else if (this.field3695 instanceof class286) {
            ((class286) this.field3695).method5013(arg0);
        }
    }

    @ObfuscatedName("ks.l(IS)[Ljb;")
    public abstract class285[] method5024(int arg0);

    @ObfuscatedName("ks.f(I)Ljb;")
    public abstract class285 method5023();
}
