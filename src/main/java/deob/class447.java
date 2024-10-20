package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("rc")
public abstract class class447 {

    @ObfuscatedName("rc.al")
    public final int field4694;

    @ObfuscatedName("rc.az")
    public int field4693 = 0;

    @ObfuscatedName("rc.ap")
    public class445[] field4697;

    @ObfuscatedName("rc.av")
    public HashMap field4695;

    @ObfuscatedName("rc.ax")
    public HashMap field4696;

    @ObfuscatedName("rc.as")
    public Comparator field4692 = null;

    public class447(int arg0) {
        this.field4694 = arg0;
        this.field4697 = this.method7338(arg0);
        this.field4695 = new HashMap(arg0 / 8);
        this.field4696 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("rc.bf(I)V")
    public void method7460() {
        this.field4693 = 0;
        Arrays.fill(this.field4697, (Object) null);
        this.field4695.clear();
        this.field4696.clear();
    }

    @ObfuscatedName("rc.bg(I)I")
    public int method7456() {
        return this.field4693;
    }

    @ObfuscatedName("rc.ba(I)Z")
    public boolean method7501() {
        return this.field4694 == this.field4693;
    }

    @ObfuscatedName("rc.bm(Lvj;S)Z")
    public boolean method7439(class550 arg0) {
        if (arg0.method9075()) {
            return this.field4695.containsKey(arg0) ? true : this.field4696.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("rc.bp(Lvj;I)Lrf;")
    public class445 method7442(class550 arg0) {
        class445 var2 = this.method7473(arg0);
        return var2 == null ? this.method7443(arg0) : var2;
    }

    @ObfuscatedName("rc.bw(Lvj;I)Lrf;")
    public class445 method7473(class550 arg0) {
        return arg0.method9075() ? (class445) this.field4695.get(arg0) : null;
    }

    @ObfuscatedName("rc.bj(Lvj;I)Lrf;")
    public class445 method7443(class550 arg0) {
        return arg0.method9075() ? (class445) this.field4696.get(arg0) : null;
    }

    @ObfuscatedName("rc.bn(Lvj;I)Z")
    public final boolean method7444(class550 arg0) {
        class445 var2 = this.method7473(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method7445(var2);
            return true;
        }
    }

    @ObfuscatedName("rc.bo(Lrf;I)V")
    public final void method7445(class445 arg0) {
        int var2 = this.method7451(arg0);
        if (var2 != -1) {
            this.method7455(var2);
            this.method7452(arg0);
        }
    }

    @ObfuscatedName("rc.bt(Lvj;B)Lrf;")
    public class445 method7446(class550 arg0) {
        return this.method7447(arg0, (class550) null);
    }

    @ObfuscatedName("rc.bu(Lvj;Lvj;I)Lrf;")
    public class445 method7447(class550 arg0, class550 arg1) {
        if (this.method7473(arg0) != null) {
            throw new IllegalStateException();
        }
        class445 var3 = this.method7337();
        var3.method7416(arg0, arg1);
        this.method7453(var3);
        this.method7463(var3);
        return var3;
    }

    @ObfuscatedName("rc.by(II)Lrf;")
    public final class445 method7448(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4693) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4697[arg0];
    }

    @ObfuscatedName("rc.bh(B)V")
    public final void method7449() {
        if (this.field4692 == null) {
            Arrays.sort(this.field4697, 0, this.field4693);
        } else {
            Arrays.sort(this.field4697, 0, this.field4693, this.field4692);
        }
    }

    @ObfuscatedName("rc.bz(Lrf;Lvj;Lvj;B)V")
    public final void method7450(class445 arg0, class550 arg1, class550 arg2) {
        this.method7452(arg0);
        arg0.method7416(arg1, arg2);
        this.method7463(arg0);
    }

    @ObfuscatedName("rc.bc(Lrf;B)I")
    public final int method7451(class445 arg0) {
        for (int var2 = 0; var2 < this.field4693; var2++) {
            if (this.field4697[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("rc.bs(Lrf;B)V")
    public final void method7452(class445 arg0) {
        if (this.field4695.remove(arg0.field4688) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4689 != null) {
            this.field4696.remove(arg0.field4689);
        }
    }

    @ObfuscatedName("rc.bx(Lrf;I)V")
    public final void method7453(class445 arg0) {
        this.field4697[++this.field4693 - 1] = arg0;
    }

    @ObfuscatedName("rc.bb(Lrf;I)V")
    public final void method7463(class445 arg0) {
        this.field4695.put(arg0.field4688, arg0);
        if (arg0.field4689 != null) {
            class445 var2 = (class445) this.field4696.put(arg0.field4689, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4689 = null;
            }
        }
    }

    @ObfuscatedName("rc.bk(II)V")
    public final void method7455(int arg0) {
        this.field4693--;
        if (arg0 < this.field4693) {
            System.arraycopy(this.field4697, arg0 + 1, this.field4697, arg0, this.field4693 - arg0);
        }
    }

    @ObfuscatedName("rc.br(I)V")
    public final void method7458() {
        this.field4692 = null;
    }

    @ObfuscatedName("rc.bq(Ljava/util/Comparator;S)V")
    public final void method7483(Comparator arg0) {
        if (this.field4692 == null) {
            this.field4692 = arg0;
        } else if (this.field4692 instanceof class446) {
            ((class446) this.field4692).method7429(arg0);
        }
    }

    @ObfuscatedName("rc.at(I)Lrf;")
    public abstract class445 method7337();

    @ObfuscatedName("rc.ah(II)[Lrf;")
    public abstract class445[] method7338(int arg0);
}
