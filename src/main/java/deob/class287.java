package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("kw")
public abstract class class287 {

    @ObfuscatedName("kw.d")
    public final int field3601;

    @ObfuscatedName("kw.w")
    public int field3603 = 0;

    @ObfuscatedName("kw.v")
    public class284[] field3600;

    @ObfuscatedName("kw.q")
    public HashMap field3605;

    @ObfuscatedName("kw.z")
    public HashMap field3604;

    @ObfuscatedName("kw.t")
    public Comparator field3602 = null;

    public class287(int arg0) {
        this.field3601 = arg0;
        this.field3600 = this.method4731(arg0);
        this.field3605 = new HashMap(arg0 / 8);
        this.field3604 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("kw.e(I)V")
    public void method4784() {
        this.field3603 = 0;
        Arrays.fill(this.field3600, (Object) null);
        this.field3605.clear();
        this.field3604.clear();
    }

    @ObfuscatedName("kw.s(B)I")
    public int method4743() {
        return this.field3603;
    }

    @ObfuscatedName("kw.p(I)Z")
    public boolean method4796() {
        return this.field3603 == this.field3601;
    }

    @ObfuscatedName("kw.n(Lku;I)Z")
    public boolean method4745(class293 arg0) {
        if (arg0.method4846()) {
            return this.field3605.containsKey(arg0) ? true : this.field3604.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("kw.u(Lku;I)Ljd;")
    public class284 method4824(class293 arg0) {
        class284 var2 = this.method4747(arg0);
        return var2 == null ? this.method4748(arg0) : var2;
    }

    @ObfuscatedName("kw.h(Lku;I)Ljd;")
    public class284 method4747(class293 arg0) {
        return arg0.method4846() ? (class284) this.field3605.get(arg0) : null;
    }

    @ObfuscatedName("kw.g(Lku;I)Ljd;")
    public class284 method4748(class293 arg0) {
        return arg0.method4846() ? (class284) this.field3604.get(arg0) : null;
    }

    @ObfuscatedName("kw.i(Lku;I)Z")
    public final boolean method4749(class293 arg0) {
        class284 var2 = this.method4747(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4817(var2);
            return true;
        }
    }

    @ObfuscatedName("kw.a(Ljd;I)V")
    public final void method4817(class284 arg0) {
        int var2 = this.method4774(arg0);
        if (var2 != -1) {
            this.method4760(var2);
            this.method4787(arg0);
        }
    }

    @ObfuscatedName("kw.o(Lku;I)Ljd;")
    public class284 method4751(class293 arg0) {
        return this.method4806(arg0, (class293) null);
    }

    @ObfuscatedName("kw.c(Lku;Lku;B)Ljd;")
    public class284 method4806(class293 arg0, class293 arg1) {
        if (this.method4747(arg0) != null) {
            throw new IllegalStateException();
        }
        class284 var3 = this.method4730();
        var3.method4707(arg0, arg1);
        this.method4798(var3);
        this.method4759(var3);
        return var3;
    }

    @ObfuscatedName("kw.f(IS)Ljd;")
    public final class284 method4818(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3603) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3600[arg0];
    }

    @ObfuscatedName("kw.ae(S)V")
    public final void method4754() {
        if (this.field3602 == null) {
            Arrays.sort(this.field3600, 0, this.field3603);
        } else {
            Arrays.sort(this.field3600, 0, this.field3603, this.field3602);
        }
    }

    @ObfuscatedName("kw.an(Ljd;Lku;Lku;I)V")
    public final void method4755(class284 arg0, class293 arg1, class293 arg2) {
        this.method4787(arg0);
        arg0.method4707(arg1, arg2);
        this.method4759(arg0);
    }

    @ObfuscatedName("kw.ai(Ljd;I)I")
    public final int method4774(class284 arg0) {
        for (int var2 = 0; var2 < this.field3603; var2++) {
            if (this.field3600[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("kw.ap(Ljd;B)V")
    public final void method4787(class284 arg0) {
        if (this.field3605.remove(arg0.field3591) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3592 != null) {
            this.field3604.remove(arg0.field3592);
        }
    }

    @ObfuscatedName("kw.ab(Ljd;I)V")
    public final void method4798(class284 arg0) {
        this.field3600[++this.field3603 - 1] = arg0;
    }

    @ObfuscatedName("kw.ar(Ljd;I)V")
    public final void method4759(class284 arg0) {
        this.field3605.put(arg0.field3591, arg0);
        if (arg0.field3592 != null) {
            class284 var2 = (class284) this.field3604.put(arg0.field3592, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3592 = null;
            }
        }
    }

    @ObfuscatedName("kw.af(IB)V")
    public final void method4760(int arg0) {
        this.field3603--;
        if (arg0 < this.field3603) {
            System.arraycopy(this.field3600, arg0 + 1, this.field3600, arg0, this.field3603 - arg0);
        }
    }

    @ObfuscatedName("kw.at(B)V")
    public final void method4761() {
        this.field3602 = null;
    }

    @ObfuscatedName("kw.as(Ljava/util/Comparator;I)V")
    public final void method4762(Comparator arg0) {
        if (this.field3602 == null) {
            this.field3602 = arg0;
        } else if (this.field3602 instanceof class285) {
            ((class285) this.field3602).method4714(arg0);
        }
    }

    @ObfuscatedName("kw.x(I)Ljd;")
    public abstract class284 method4730();

    @ObfuscatedName("kw.m(II)[Ljd;")
    public abstract class284[] method4731(int arg0);
}
