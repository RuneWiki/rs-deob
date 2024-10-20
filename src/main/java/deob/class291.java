package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("kg")
public abstract class class291 {

    @ObfuscatedName("kg.g")
    public final int field3697;

    @ObfuscatedName("kg.b")
    public int field3692 = 0;

    @ObfuscatedName("kg.a")
    public class288[] field3693;

    @ObfuscatedName("kg.c")
    public HashMap field3694;

    @ObfuscatedName("kg.z")
    public HashMap field3695;

    @ObfuscatedName("kg.j")
    public Comparator field3696 = null;

    public class291(int arg0) {
        this.field3697 = arg0;
        this.field3693 = this.method5156(arg0);
        this.field3694 = new HashMap(arg0 / 8);
        this.field3695 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("kg.j(I)V")
    public void method5163() {
        this.field3692 = 0;
        Arrays.fill(this.field3693, (Object) null);
        this.field3694.clear();
        this.field3695.clear();
    }

    @ObfuscatedName("kg.d(I)I")
    public int method5164() {
        return this.field3692;
    }

    @ObfuscatedName("kg.i(I)Z")
    public boolean method5165() {
        return this.field3697 == this.field3692;
    }

    @ObfuscatedName("kg.m(Lku;S)Z")
    public boolean method5166(class297 arg0) {
        if (arg0.method5264()) {
            return this.field3694.containsKey(arg0) ? true : this.field3695.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("kg.v(Lku;B)Lke;")
    public class288 method5217(class297 arg0) {
        class288 var2 = this.method5211(arg0);
        return var2 == null ? this.method5215(arg0) : var2;
    }

    @ObfuscatedName("kg.r(Lku;B)Lke;")
    public class288 method5211(class297 arg0) {
        return arg0.method5264() ? (class288) this.field3694.get(arg0) : null;
    }

    @ObfuscatedName("kg.x(Lku;I)Lke;")
    public class288 method5215(class297 arg0) {
        return arg0.method5264() ? (class288) this.field3695.get(arg0) : null;
    }

    @ObfuscatedName("kg.y(Lku;I)Z")
    public final boolean method5170(class297 arg0) {
        class288 var2 = this.method5211(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method5167(var2);
            return true;
        }
    }

    @ObfuscatedName("kg.p(Lke;I)V")
    public final void method5167(class288 arg0) {
        int var2 = this.method5168(arg0);
        if (var2 != -1) {
            this.method5180(var2);
            this.method5177(arg0);
        }
    }

    @ObfuscatedName("kg.k(Lku;B)Lke;")
    public class288 method5172(class297 arg0) {
        return this.method5188(arg0, (class297) null);
    }

    @ObfuscatedName("kg.o(Lku;Lku;I)Lke;")
    public class288 method5188(class297 arg0, class297 arg1) {
        if (this.method5211(arg0) != null) {
            throw new IllegalStateException();
        }
        class288 var3 = this.method5155();
        var3.method5128(arg0, arg1);
        this.method5200(var3);
        this.method5179(var3);
        return var3;
    }

    @ObfuscatedName("kg.s(II)Lke;")
    public final class288 method5174(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3692) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3693[arg0];
    }

    @ObfuscatedName("kg.u(I)V")
    public final void method5191() {
        if (this.field3696 == null) {
            Arrays.sort(this.field3693, 0, this.field3692);
        } else {
            Arrays.sort(this.field3693, 0, this.field3692, this.field3696);
        }
    }

    @ObfuscatedName("kg.aa(Lke;Lku;Lku;I)V")
    public final void method5183(class288 arg0, class297 arg1, class297 arg2) {
        this.method5177(arg0);
        arg0.method5128(arg1, arg2);
        this.method5179(arg0);
    }

    @ObfuscatedName("kg.ai(Lke;I)I")
    public final int method5168(class288 arg0) {
        for (int var2 = 0; var2 < this.field3692; var2++) {
            if (this.field3693[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("kg.ag(Lke;B)V")
    public final void method5177(class288 arg0) {
        if (this.field3694.remove(arg0.field3682) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3683 != null) {
            this.field3695.remove(arg0.field3683);
        }
    }

    @ObfuscatedName("kg.at(Lke;I)V")
    public final void method5200(class288 arg0) {
        this.field3693[++this.field3692 - 1] = arg0;
    }

    @ObfuscatedName("kg.ad(Lke;B)V")
    public final void method5179(class288 arg0) {
        this.field3694.put(arg0.field3682, arg0);
        if (arg0.field3683 != null) {
            class288 var2 = (class288) this.field3695.put(arg0.field3683, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3683 = null;
            }
        }
    }

    @ObfuscatedName("kg.as(II)V")
    public final void method5180(int arg0) {
        this.field3692--;
        if (arg0 < this.field3692) {
            System.arraycopy(this.field3693, arg0 + 1, this.field3693, arg0, this.field3692 - arg0);
        }
    }

    @ObfuscatedName("kg.ac(B)V")
    public final void method5181() {
        this.field3696 = null;
    }

    @ObfuscatedName("kg.an(Ljava/util/Comparator;B)V")
    public final void method5182(Comparator arg0) {
        if (this.field3696 == null) {
            this.field3696 = arg0;
        } else if (this.field3696 instanceof class289) {
            ((class289) this.field3696).method5146(arg0);
        }
    }

    @ObfuscatedName("kg.n(I)Lke;")
    public abstract class288 method5155();

    @ObfuscatedName("kg.h(IB)[Lke;")
    public abstract class288[] method5156(int arg0);
}
