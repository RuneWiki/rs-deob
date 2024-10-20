package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("qt")
public abstract class class435 {

    @ObfuscatedName("qt.aa")
    public final int field4664;

    @ObfuscatedName("qt.af")
    public int field4665 = 0;

    @ObfuscatedName("qt.ad")
    public class433[] field4662;

    @ObfuscatedName("qt.aq")
    public HashMap field4663;

    @ObfuscatedName("qt.al")
    public HashMap field4666;

    @ObfuscatedName("qt.an")
    public Comparator field4667 = null;

    public class435(int arg0) {
        this.field4664 = arg0;
        this.field4662 = this.method7185(arg0);
        this.field4663 = new HashMap(arg0 / 8);
        this.field4666 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("qt.bk(I)V")
    public void method7272() {
        this.field4665 = 0;
        Arrays.fill(this.field4662, (Object) null);
        this.field4663.clear();
        this.field4666.clear();
    }

    @ObfuscatedName("qt.bv(I)I")
    public int method7328() {
        return this.field4665;
    }

    @ObfuscatedName("qt.bt(B)Z")
    public boolean method7274() {
        return this.field4665 == this.field4664;
    }

    @ObfuscatedName("qt.bd(Luc;I)Z")
    public boolean method7307(class538 arg0) {
        if (arg0.method8930()) {
            return this.field4663.containsKey(arg0) ? true : this.field4666.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("qt.by(Luc;I)Lqs;")
    public class433 method7276(class538 arg0) {
        class433 var2 = this.method7277(arg0);
        return var2 == null ? this.method7320(arg0) : var2;
    }

    @ObfuscatedName("qt.bs(Luc;I)Lqs;")
    public class433 method7277(class538 arg0) {
        return arg0.method8930() ? (class433) this.field4663.get(arg0) : null;
    }

    @ObfuscatedName("qt.bm(Luc;S)Lqs;")
    public class433 method7320(class538 arg0) {
        return arg0.method8930() ? (class433) this.field4666.get(arg0) : null;
    }

    @ObfuscatedName("qt.bf(Luc;I)Z")
    public final boolean method7325(class538 arg0) {
        class433 var2 = this.method7277(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method7280(var2);
            return true;
        }
    }

    @ObfuscatedName("qt.bq(Lqs;I)V")
    public final void method7280(class433 arg0) {
        int var2 = this.method7290(arg0);
        if (var2 != -1) {
            this.method7295(var2);
            this.method7286(arg0);
        }
    }

    @ObfuscatedName("qt.ba(Luc;B)Lqs;")
    public class433 method7296(class538 arg0) {
        return this.method7281(arg0, (class538) null);
    }

    @ObfuscatedName("qt.bl(Luc;Luc;B)Lqs;")
    public class433 method7281(class538 arg0, class538 arg1) {
        if (this.method7277(arg0) != null) {
            throw new IllegalStateException();
        }
        class433 var3 = this.method7188();
        var3.method7253(arg0, arg1);
        this.method7287(var3);
        this.method7283(var3);
        return var3;
    }

    @ObfuscatedName("qt.bp(IB)Lqs;")
    public final class433 method7285(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4665) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4662[arg0];
    }

    @ObfuscatedName("qt.bu(I)V")
    public final void method7330() {
        if (this.field4667 == null) {
            Arrays.sort(this.field4662, 0, this.field4665);
        } else {
            Arrays.sort(this.field4662, 0, this.field4665, this.field4667);
        }
    }

    @ObfuscatedName("qt.bo(Lqs;Luc;Luc;I)V")
    public final void method7284(class433 arg0, class538 arg1, class538 arg2) {
        this.method7286(arg0);
        arg0.method7253(arg1, arg2);
        this.method7283(arg0);
    }

    @ObfuscatedName("qt.bb(Lqs;B)I")
    public final int method7290(class433 arg0) {
        for (int var2 = 0; var2 < this.field4665; var2++) {
            if (this.field4662[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("qt.br(Lqs;I)V")
    public final void method7286(class433 arg0) {
        if (this.field4663.remove(arg0.field4655) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4657 != null) {
            this.field4666.remove(arg0.field4657);
        }
    }

    @ObfuscatedName("qt.be(Lqs;I)V")
    public final void method7287(class433 arg0) {
        this.field4662[++this.field4665 - 1] = arg0;
    }

    @ObfuscatedName("qt.bi(Lqs;B)V")
    public final void method7283(class433 arg0) {
        this.field4663.put(arg0.field4655, arg0);
        if (arg0.field4657 != null) {
            class433 var2 = (class433) this.field4666.put(arg0.field4657, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4657 = null;
            }
        }
    }

    @ObfuscatedName("qt.bz(IB)V")
    public final void method7295(int arg0) {
        this.field4665--;
        if (arg0 < this.field4665) {
            System.arraycopy(this.field4662, arg0 + 1, this.field4662, arg0, this.field4665 - arg0);
        }
    }

    @ObfuscatedName("qt.bx(B)V")
    public final void method7326() {
        this.field4667 = null;
    }

    @ObfuscatedName("qt.bn(Ljava/util/Comparator;B)V")
    public final void method7291(Comparator arg0) {
        if (this.field4667 == null) {
            this.field4667 = arg0;
        } else if (this.field4667 instanceof class434) {
            ((class434) this.field4667).method7261(arg0);
        }
    }

    @ObfuscatedName("qt.ae(IB)[Lqs;")
    public abstract class433[] method7185(int arg0);

    @ObfuscatedName("qt.au(I)Lqs;")
    public abstract class433 method7188();
}
