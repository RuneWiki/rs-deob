package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("ku")
public abstract class class287 {

    @ObfuscatedName("ku.j")
    public final int field3633;

    @ObfuscatedName("ku.p")
    public int field3634 = 0;

    @ObfuscatedName("ku.g")
    public class284[] field3635;

    @ObfuscatedName("ku.n")
    public HashMap field3638;

    @ObfuscatedName("ku.u")
    public HashMap field3637;

    @ObfuscatedName("ku.a")
    public Comparator field3636 = null;

    public class287(int arg0) {
        this.field3633 = arg0;
        this.field3635 = this.method4805(arg0);
        this.field3638 = new HashMap(arg0 / 8);
        this.field3637 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("ku.w(I)V")
    public void method4816() {
        this.field3634 = 0;
        Arrays.fill(this.field3635, (Object) null);
        this.field3638.clear();
        this.field3637.clear();
    }

    @ObfuscatedName("ku.y(I)I")
    public int method4860() {
        return this.field3634;
    }

    @ObfuscatedName("ku.c(B)Z")
    public boolean method4818() {
        return this.field3634 == this.field3633;
    }

    @ObfuscatedName("ku.h(Lkq;I)Z")
    public boolean method4889(class293 arg0) {
        if (arg0.method4926()) {
            return this.field3638.containsKey(arg0) ? true : this.field3637.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ku.k(Lkq;I)Ljf;")
    public class284 method4820(class293 arg0) {
        class284 var2 = this.method4886(arg0);
        return var2 == null ? this.method4835(arg0) : var2;
    }

    @ObfuscatedName("ku.r(Lkq;I)Ljf;")
    public class284 method4886(class293 arg0) {
        return arg0.method4926() ? (class284) this.field3638.get(arg0) : null;
    }

    @ObfuscatedName("ku.d(Lkq;I)Ljf;")
    public class284 method4835(class293 arg0) {
        return arg0.method4926() ? (class284) this.field3637.get(arg0) : null;
    }

    @ObfuscatedName("ku.e(Lkq;I)Z")
    public final boolean method4823(class293 arg0) {
        class284 var2 = this.method4886(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4819(var2);
            return true;
        }
    }

    @ObfuscatedName("ku.l(Ljf;I)V")
    public final void method4819(class284 arg0) {
        int var2 = this.method4830(arg0);
        if (var2 != -1) {
            this.method4834(var2);
            this.method4870(arg0);
        }
    }

    @ObfuscatedName("ku.t(Lkq;I)Ljf;")
    public class284 method4825(class293 arg0) {
        return this.method4861(arg0, (class293) null);
    }

    @ObfuscatedName("ku.x(Lkq;Lkq;B)Ljf;")
    public class284 method4861(class293 arg0, class293 arg1) {
        if (this.method4886(arg0) != null) {
            throw new IllegalStateException();
        }
        class284 var3 = this.method4806();
        var3.method4774(arg0, arg1);
        this.method4877(var3);
        this.method4856(var3);
        return var3;
    }

    @ObfuscatedName("ku.ah(II)Ljf;")
    public final class284 method4827(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3634) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3635[arg0];
    }

    @ObfuscatedName("ku.ai(I)V")
    public final void method4828() {
        if (this.field3636 == null) {
            Arrays.sort(this.field3635, 0, this.field3634);
        } else {
            Arrays.sort(this.field3635, 0, this.field3634, this.field3636);
        }
    }

    @ObfuscatedName("ku.ao(Ljf;Lkq;Lkq;B)V")
    public final void method4829(class284 arg0, class293 arg1, class293 arg2) {
        this.method4870(arg0);
        arg0.method4774(arg1, arg2);
        this.method4856(arg0);
    }

    @ObfuscatedName("ku.ae(Ljf;I)I")
    public final int method4830(class284 arg0) {
        for (int var2 = 0; var2 < this.field3634; var2++) {
            if (this.field3635[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ku.ax(Ljf;S)V")
    public final void method4870(class284 arg0) {
        if (this.field3638.remove(arg0.field3626) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3625 != null) {
            this.field3637.remove(arg0.field3625);
        }
    }

    @ObfuscatedName("ku.ag(Ljf;B)V")
    public final void method4877(class284 arg0) {
        this.field3635[++this.field3634 - 1] = arg0;
    }

    @ObfuscatedName("ku.ab(Ljf;I)V")
    public final void method4856(class284 arg0) {
        this.field3638.put(arg0.field3626, arg0);
        if (arg0.field3625 != null) {
            class284 var2 = (class284) this.field3637.put(arg0.field3625, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3625 = null;
            }
        }
    }

    @ObfuscatedName("ku.am(II)V")
    public final void method4834(int arg0) {
        this.field3634--;
        if (arg0 < this.field3634) {
            System.arraycopy(this.field3635, arg0 + 1, this.field3635, arg0, this.field3634 - arg0);
        }
    }

    @ObfuscatedName("ku.ak(I)V")
    public final void method4832() {
        this.field3636 = null;
    }

    @ObfuscatedName("ku.ad(Ljava/util/Comparator;B)V")
    public final void method4826(Comparator arg0) {
        if (this.field3636 == null) {
            this.field3636 = arg0;
        } else if (this.field3636 instanceof class285) {
            ((class285) this.field3636).method4798(arg0);
        }
    }

    @ObfuscatedName("ku.m(I)Ljf;")
    public abstract class284 method4806();

    @ObfuscatedName("ku.o(II)[Ljf;")
    public abstract class284[] method4805(int arg0);
}
